package com.bumptech.glide.gifdecoder;

import Yue.InterfaceC3897;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class GifHeader {
    public static final int NETSCAPE_LOOP_COUNT_DOES_NOT_EXIST = -1;
    public static final int NETSCAPE_LOOP_COUNT_FOREVER = 0;

    @InterfaceC3897
    int bgColor;
    int bgIndex;
    GifFrame currentFrame;
    boolean gctFlag;
    int gctSize;
    int height;
    int pixelAspect;
    int width;

    @InterfaceC3897
    int[] gct = null;
    int status = 0;
    int frameCount = 0;
    final List<GifFrame> frames = new ArrayList();
    int loopCount = -1;

    public int getHeight() {
        return this.height;
    }

    public int getNumFrames() {
        return this.frameCount;
    }

    public int getStatus() {
        return this.status;
    }

    public int getWidth() {
        return this.width;
    }
}
