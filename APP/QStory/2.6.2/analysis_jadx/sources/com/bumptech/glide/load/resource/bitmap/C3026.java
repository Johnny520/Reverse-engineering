package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;
import com.alibaba.fastjson2.reader.AbstractC2742;
import com.bumptech.glide.load.engine.InterfaceC2988;
import com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC2978;
import io.ktor.client.plugins.api.C3885;
import java.io.IOException;
import p226.C8004;
import p285.C8386;
import p286.C8396;
import p286.InterfaceC8399;

/* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3026 implements InterfaceC8399 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC2978 f9639;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f9640;

    public C3026() {
        this.f9640 = 0;
        this.f9639 = new C3885(16);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public C3025 m6477(ImageDecoder.Source source, int i, int i2, C8396 c8396) throws IOException {
        Bitmap bitmapDecodeBitmap = ImageDecoder.decodeBitmap(source, new C8004(i, i2, c8396));
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            Log.v("BitmapImageDecoder", "Decoded [" + bitmapDecodeBitmap.getWidth() + "x" + bitmapDecodeBitmap.getHeight() + "] for [" + i + "x" + i2 + "]");
        }
        return new C3025(bitmapDecodeBitmap, (C3885) this.f9639);
    }

    @Override // p286.InterfaceC8399
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final InterfaceC2988 mo6464(Object obj, int i, int i2, C8396 c8396) {
        switch (this.f9640) {
            case 0:
                return m6477(AbstractC2742.m5502(obj), i, i2, c8396);
            default:
                return C3025.m6476(((C8386) obj).m13939(), this.f9639);
        }
    }

    @Override // p286.InterfaceC8399
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final /* bridge */ /* synthetic */ boolean mo6465(Object obj, C8396 c8396) {
        switch (this.f9640) {
            case 0:
                AbstractC2742.m5510(obj);
                break;
            default:
                break;
        }
        return true;
    }

    public C3026(InterfaceC2978 interfaceC2978) {
        this.f9640 = 1;
        this.f9639 = interfaceC2978;
    }
}
