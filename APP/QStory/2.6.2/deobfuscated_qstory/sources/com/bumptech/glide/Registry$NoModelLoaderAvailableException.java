package com.bumptech.glide;

import androidx.profileinstaller.AbstractC2442;
import java.util.List;
import p228.InterfaceC8032;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class Registry$NoModelLoaderAvailableException extends Registry$MissingComponentException {
    public <M> Registry$NoModelLoaderAvailableException(M m, List<InterfaceC8032> list) {
        super("Found ModelLoaders for model class: " + list + ", but none that handle this specific model instance: " + m);
    }

    public Registry$NoModelLoaderAvailableException(Object obj) {
        super(AbstractC2442.m4571(obj, new StringBuilder("Failed to find any ModelLoaders registered for model class: ")));
    }

    public Registry$NoModelLoaderAvailableException(Class<?> cls, Class<?> cls2) {
        super("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
    }
}
