package com.paralect.dropwiz.views;

import com.yammer.dropwizard.views.View;

public class PersonView extends View {

    private String _name;
    private String _position;

    public PersonView(String name, String position) {
        super("person.ftl");
        _name = name;
        _position = position;
    }

    public String getPosition() {
        return _position;
    }

    public String getName() {
        return _name;
    }
}
