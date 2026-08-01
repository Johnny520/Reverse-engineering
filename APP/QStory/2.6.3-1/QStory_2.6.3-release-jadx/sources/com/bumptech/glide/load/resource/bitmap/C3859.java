package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;
import com.alibaba.fastjson2.reader.AbstractC3576;
import com.bumptech.glide.load.engine.InterfaceC3821;
import com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC3811;
import io.ktor.client.plugins.api.C4718;
import java.io.IOException;
import p242.C8834;
import p301.C9216;
import p302.C9226;
import p302.InterfaceC9229;

/* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3859 implements InterfaceC9229 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC3811 f9986;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f9987;

    public C3859() {
        this.f9987 = 0;
        this.f9986 = new C4718(16);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public C3858 m7097(ImageDecoder.Source source, int i, int i2, C9226 c9226) throws IOException {
        Bitmap bitmapDecodeBitmap = ImageDecoder.decodeBitmap(source, new C8834(i, i2, c9226));
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            Log.v("BitmapImageDecoder", "Decoded [" + bitmapDecodeBitmap.getWidth() + "x" + bitmapDecodeBitmap.getHeight() + "] for [" + i + "x" + i2 + "]");
        }
        return new C3858(bitmapDecodeBitmap, (C4718) this.f9986);
    }

    @Override // p302.InterfaceC9229
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final InterfaceC3821 mo7084(Object obj, int i, int i2, C9226 c9226) {
        switch (this.f9987) {
            case 0:
                return m7097(AbstractC3576.m6107(obj), i, i2, c9226);
            default:
                return C3858.m7096(((C9216) obj).m14515(), this.f9986);
        }
    }

    @Override // p302.InterfaceC9229
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final /* bridge */ /* synthetic */ boolean mo7085(Object obj, C9226 c9226) {
        switch (this.f9987) {
            case 0:
                AbstractC3576.m6115(obj);
                break;
            default:
                break;
        }
        return true;
    }

    public C3859(InterfaceC3811 interfaceC3811) {
        this.f9987 = 1;
        this.f9986 = interfaceC3811;
    }
}
