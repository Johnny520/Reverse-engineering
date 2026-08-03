package com.bumptech.glide.load.resource.bitmap;

import Yue.C3536;
import Yue.InterfaceC6391;
import Yue.InterfaceC7113;
import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPoolAdapter;
import com.bumptech.glide.load.resource.DefaultOnHeaderDecodedListener;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC7113(api = 28)
public final class BitmapImageDecoderResourceDecoder implements ResourceDecoder<ImageDecoder.Source, Bitmap> {
    private static final String TAG = "BitmapImageDecoder";
    private final BitmapPool bitmapPool = new BitmapPoolAdapter();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int, int, com.bumptech.glide.load.Options] */
    /* JADX DEBUG: Return type fixed from 'com.bumptech.glide.load.engine.Resource' to match base method */
    @Override // com.bumptech.glide.load.ResourceDecoder
    public /* bridge */ /* synthetic */ Resource<Bitmap> decode(@InterfaceC6391 ImageDecoder.Source source, int i, int i2, @InterfaceC6391 Options options) throws IOException {
        return decode2(C3536.m610(source), i, i2, options);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: handles, reason: avoid collision after fix types in other method */
    public boolean handles2(@InterfaceC6391 ImageDecoder.Source source, @InterfaceC6391 Options options) throws IOException {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX INFO: renamed from: decode, reason: avoid collision after fix types in other method */
    public Resource<Bitmap> decode2(@InterfaceC6391 ImageDecoder.Source source, int i, int i2, @InterfaceC6391 Options options) throws IOException {
        Bitmap bitmapDecodeBitmap = ImageDecoder.decodeBitmap(source, new DefaultOnHeaderDecodedListener(i, i2, options));
        if (Log.isLoggable(TAG, 2)) {
            Log.v(TAG, "Decoded [" + bitmapDecodeBitmap.getWidth() + "x" + bitmapDecodeBitmap.getHeight() + "] for [" + i + "x" + i2 + "]");
        }
        return new BitmapResource(bitmapDecodeBitmap, this.bitmapPool);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.bumptech.glide.load.Options] */
    @Override // com.bumptech.glide.load.ResourceDecoder
    public /* bridge */ /* synthetic */ boolean handles(@InterfaceC6391 ImageDecoder.Source source, @InterfaceC6391 Options options) throws IOException {
        return handles2(C3536.m610(source), options);
    }
}
