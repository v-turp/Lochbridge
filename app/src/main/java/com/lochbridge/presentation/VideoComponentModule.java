package com.lochbridge.presentation;

import dagger.Module;
import dagger.Provides;

@Module
public class VideoComponentModule {

    @Provides
    public String getVideoID(){
        return "Empty Test String";
    }
}
