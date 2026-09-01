package org.example;

import java.util.List;

public class Scene  {
    List<Shape> objects;

    public Scene() {
    }

    public Scene(List<Shape> objects) {
        this.objects = objects;
    }

    public List<Shape> getObjects() {
        return objects;
    }

    public void setObjects(List<Shape> objects) {
        this.objects = objects;
    }

    void draw() {
        for (Shape shape : getObjects()) {
            shape.draw();
        }
    }
}
