package com.bumptech.glide.load.resource.transcode;

import Yue.InterfaceC6391;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class TranscoderRegistry {
    private final List<Entry<?, ?>> transcoders = new ArrayList();

    public static final class Entry<Z, R> {
        final Class<Z> fromClass;
        final Class<R> toClass;
        final ResourceTranscoder<Z, R> transcoder;

        public Entry(@InterfaceC6391 Class<Z> cls, @InterfaceC6391 Class<R> cls2, @InterfaceC6391 ResourceTranscoder<Z, R> resourceTranscoder) {
            this.fromClass = cls;
            this.toClass = cls2;
            this.transcoder = resourceTranscoder;
        }

        public boolean handles(@InterfaceC6391 Class<?> cls, @InterfaceC6391 Class<?> cls2) {
            return this.fromClass.isAssignableFrom(cls) && cls2.isAssignableFrom(this.toClass);
        }
    }

    @InterfaceC6391
    public synchronized <Z, R> ResourceTranscoder<Z, R> get(@InterfaceC6391 Class<Z> cls, @InterfaceC6391 Class<R> cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return UnitTranscoder.get();
        }
        for (Entry<?, ?> entry : this.transcoders) {
            if (entry.handles(cls, cls2)) {
                return (ResourceTranscoder<Z, R>) entry.transcoder;
            }
        }
        throw new IllegalArgumentException("No transcoder registered to transcode from " + cls + " to " + cls2);
    }

    @InterfaceC6391
    public synchronized <Z, R> List<Class<R>> getTranscodeClasses(@InterfaceC6391 Class<Z> cls, @InterfaceC6391 Class<R> cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        for (Entry<?, ?> entry : this.transcoders) {
            if (entry.handles(cls, cls2) && !arrayList.contains(entry.toClass)) {
                arrayList.add(entry.toClass);
            }
        }
        return arrayList;
    }

    public synchronized <Z, R> void register(@InterfaceC6391 Class<Z> cls, @InterfaceC6391 Class<R> cls2, @InterfaceC6391 ResourceTranscoder<Z, R> resourceTranscoder) {
        this.transcoders.add(new Entry<>(cls, cls2, resourceTranscoder));
    }
}
