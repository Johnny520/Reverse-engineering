package com.bumptech.glide.util;

/* JADX INFO: loaded from: classes.dex */
public final class GlideSuppliers {


    public interface GlideSupplier<T> {
        T get();
    }

    private GlideSuppliers() {
            r0 = this;
            r0.<init>()
            return
    }

    public static <T> com.bumptech.glide.util.GlideSuppliers.GlideSupplier<T> memorize(com.bumptech.glide.util.GlideSuppliers.GlideSupplier<T> r1) {
            com.bumptech.glide.util.GlideSuppliers$1 r0 = new com.bumptech.glide.util.GlideSuppliers$1
            r0.<init>(r1)
            return r0
    }
}
