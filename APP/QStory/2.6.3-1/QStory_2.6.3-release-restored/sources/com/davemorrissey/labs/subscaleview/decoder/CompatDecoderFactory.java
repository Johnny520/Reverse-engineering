package com.davemorrissey.labs.subscaleview.decoder;

import android.graphics.Bitmap;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class CompatDecoderFactory<T> implements DecoderFactory<T> {
    private final Bitmap.Config bitmapConfig;
    private final Class<? extends T> clazz;

    public CompatDecoderFactory(Class<? extends T> cls, Bitmap.Config config) {
        this.clazz = cls;
        this.bitmapConfig = config;
    }

    @Override // com.davemorrissey.labs.subscaleview.decoder.DecoderFactory
    public T make() {
        Bitmap.Config config = this.bitmapConfig;
        Class<? extends T> cls = this.clazz;
        return config == null ? cls.newInstance() : cls.getConstructor(Bitmap.Config.class).newInstance(this.bitmapConfig);
    }

    public CompatDecoderFactory(Class<? extends T> cls) {
        this(cls, null);
    }
}
