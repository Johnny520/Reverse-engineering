package com.bumptech.glide.provider;

import Yue.InterfaceC6391;
import com.bumptech.glide.load.ImageHeaderParser;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ImageHeaderParserRegistry {
    private final List<ImageHeaderParser> parsers = new ArrayList();

    public synchronized void add(@InterfaceC6391 ImageHeaderParser imageHeaderParser) {
        this.parsers.add(imageHeaderParser);
    }

    @InterfaceC6391
    public synchronized List<ImageHeaderParser> getParsers() {
        return this.parsers;
    }
}
