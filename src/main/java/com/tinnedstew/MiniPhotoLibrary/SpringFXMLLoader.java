package com.tinnedstew.MiniPhotoLibrary;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.util.Callback;
import org.springframework.context.ApplicationContext;

import java.io.IOException;
import java.io.InputStream;

public class SpringFXMLLoader {
    private static ApplicationContext applicationContext;

    public static Controller load(String url) {
        try (InputStream fxmlStream = SpringFXMLLoader.class.getResourceAsStream(url))
        {
            FXMLLoader loader = new FXMLLoader();
            loader.setControllerFactory(new Callback<Class<?>, Object>() {
                @Override
                public Object call(Class<?> aClass) {
                    return applicationContext.getBean(aClass);
                }
            });

            Node view = (Node)loader.load(fxmlStream);
            Controller controller = loader.getController();
            controller.setView(view);
            return controller;
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
