package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;
import com.alibaba.fastjson2.reader.AbstractC2743;
import com.bumptech.glide.load.engine.InterfaceC2989;
import com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC2979;
import io.ktor.client.plugins.api.C3886;
import java.io.IOException;
import p226.C8005;
import p285.C8387;
import p286.C8397;
import p286.InterfaceC8400;

/* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3027 implements InterfaceC8400 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC2979 f9641;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f9642;

    public C3027() {
        this.f9642 = 0;
        this.f9641 = new C3886(16);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public C3026 m6537(ImageDecoder.Source source, int i, int i2, C8397 c8397) throws IOException {
        Bitmap bitmapDecodeBitmap = ImageDecoder.decodeBitmap(source, new C8005(i, i2, c8397));
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            Log.v("BitmapImageDecoder", "Decoded [" + bitmapDecodeBitmap.getWidth() + "x" + bitmapDecodeBitmap.getHeight() + "] for [" + i + "x" + i2 + "]");
        }
        return new C3026(bitmapDecodeBitmap, (C3886) this.f9641);
    }

    @Override // p286.InterfaceC8400
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final InterfaceC2989 mo6524(Object obj, int i, int i2, C8397 c8397) {
        switch (this.f9642) {
            case 0:
                return m6537(AbstractC2743.m5547(obj), i, i2, c8397);
            default:
                return C3026.m6536(((C8387) obj).m13956(), this.f9641);
        }
    }

    @Override // p286.InterfaceC8400
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final /* bridge */ /* synthetic */ boolean mo6525(Object obj, C8397 c8397) {
        switch (this.f9642) {
            case 0:
                AbstractC2743.m5555(obj);
                break;
            default:
                break;
        }
        return true;
    }

    public C3027(InterfaceC2979 interfaceC2979) {
        this.f9642 = 1;
        this.f9641 = interfaceC2979;
    }
}
