package com.example.demo2.service;

import com.example.demo2.model.Circle;
import com.example.demo2.model.Triangle;

public class ShapeService {
    private Circle circle;
    private Triangle triangle;

    public Circle getCircle() {
        return this.circle;
    }

    public void setCircle(Circle circle) {
        this.circle = circle;
    }

    public Triangle getTriangle() {
        return this.triangle;
    }

    public void setTriangle(Triangle triangle) {
        this.triangle = triangle;
    }


}