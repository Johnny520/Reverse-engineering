package com.bumptech.glide.util;

/* JADX INFO: loaded from: classes.dex */
public class FixedPreloadSizeProvider<T> implements com.bumptech.glide.ListPreloader.PreloadSizeProvider<T> {
    private final int[] size;

    public FixedPreloadSizeProvider(int r1, int r2) {
            r0 = this;
            r0.<init>()
            int[] r1 = new int[]{r1, r2}
            r0.size = r1
            return
    }

    @Override // com.bumptech.glide.ListPreloader.PreloadSizeProvider
    @Yue.InterfaceC4544
    public int[] getPreloadSize(@Yue.InterfaceC4410 T r1, int r2, int r3) {
            r0 = this;
            int[] r1 = r0.size
            return r1
    }
}
