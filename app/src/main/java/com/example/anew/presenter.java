package com.example.anew;

public class presenter
{
    private model model;
    private Iview view;
    public presenter(Iview v)
    {
        model = new model();
        this.view = v;
    }
}
