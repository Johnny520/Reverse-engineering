package com.bumptech.glide.load.resource.gif;

import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import android.graphics.Bitmap;
import com.bumptech.glide.gifdecoder.GifDecoder;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;

/* JADX INFO: loaded from: classes.dex */
public final class GifBitmapProvider implements GifDecoder.BitmapProvider {

    @InterfaceC6490
    private final ArrayPool arrayPool;
    private final BitmapPool bitmapPool;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public GifBitmapProvider(BitmapPool bitmapPool) {
        this(bitmapPool, null);
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder.BitmapProvider
    @InterfaceC6391
    public Bitmap obtain(int i, int i2, @InterfaceC6391 Bitmap.Config config) {
        return this.bitmapPool.getDirty(i, i2, config);
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder.BitmapProvider
    @InterfaceC6391
    public byte[] obtainByteArray(int i) {
        ArrayPool arrayPool = this.arrayPool;
        return arrayPool == null ? new byte[i] : (byte[]) arrayPool.get(i, byte[].class);
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder.BitmapProvider
    @InterfaceC6391
    public int[] obtainIntArray(int i) {
        ArrayPool arrayPool = this.arrayPool;
        return arrayPool == null ? new int[i] : (int[]) arrayPool.get(i, int[].class);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.bumptech.glide.gifdecoder.GifDecoder.BitmapProvider
    public void release(@InterfaceC6391 Bitmap bitmap) {
        this.bitmapPool.put(bitmap);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public GifBitmapProvider(BitmapPool bitmapPool, @InterfaceC6490 ArrayPool arrayPool) {
        this.bitmapPool = bitmapPool;
        this.arrayPool = arrayPool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // com.bumptech.glide.gifdecoder.GifDecoder.BitmapProvider
    public void release(@InterfaceC6391 byte[] bArr) {
        ArrayPool arrayPool = this.arrayPool;
        if (arrayPool == null) {
            return;
        }
        arrayPool.put(bArr);
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder.BitmapProvider
    public void release(@InterfaceC6391 int[] iArr) {
        ArrayPool arrayPool = this.arrayPool;
        if (arrayPool == null) {
            return;
        }
        arrayPool.put(iArr);
    }
}
