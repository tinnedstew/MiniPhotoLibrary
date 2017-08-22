package com.tinnedstew.MiniPhotoLibrary;

import javafx.scene.Node;

public class AbstractController implements Controller {
    private Node view;

    public Node getView() {
        return view;
    }

    public void setView(Node view) {
        this.view = view;
    }
}
