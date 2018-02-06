package com.lochbridge.presentation;

import dagger.Component;


@Component(modules = VideoComponentModule.class)
public interface VideoComponent {

    String NAME = "Start";

    String getVideoID();

    String getVideoTitle();
}
