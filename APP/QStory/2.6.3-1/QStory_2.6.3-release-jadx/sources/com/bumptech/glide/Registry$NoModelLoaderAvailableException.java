package com.bumptech.glide;

import androidx.profileinstaller.AbstractC3275;
import java.util.List;
import p244.InterfaceC8862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class Registry$NoModelLoaderAvailableException extends Registry$MissingComponentException {
    public <M> Registry$NoModelLoaderAvailableException(M m, List<InterfaceC8862> list) {
        super("Found ModelLoaders for model class: " + list + ", but none that handle this specific model instance: " + m);
    }

    public Registry$NoModelLoaderAvailableException(Object obj) {
        super(AbstractC3275.m5141(obj, new StringBuilder("Failed to find any ModelLoaders registered for model class: ")));
    }

    public Registry$NoModelLoaderAvailableException(Class<?> cls, Class<?> cls2) {
        super("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
    }
}
