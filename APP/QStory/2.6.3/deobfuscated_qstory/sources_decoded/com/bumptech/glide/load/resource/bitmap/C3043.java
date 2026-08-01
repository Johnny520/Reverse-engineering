package com.bumptech.glide.load.resource.bitmap;

import android.graphics.ImageDecoder;
import com.bumptech.glide.load.engine.InterfaceC2989;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p222.AbstractC7984;
import p286.C8397;
import p286.InterfaceC8400;

/* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3043 implements InterfaceC8400 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C3027 f9689;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f9690;

    public C3043(int i) {
        this.f9690 = i;
        switch (i) {
            case 1:
                this.f9689 = new C3027();
                break;
            default:
                this.f9689 = new C3027();
                break;
        }
    }

    @Override // p286.InterfaceC8400
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final InterfaceC2989 mo6524(Object obj, int i, int i2, C8397 c8397) {
        int i3 = this.f9690;
        C3027 c3027 = this.f9689;
        switch (i3) {
            case 0:
                return c3027.m6537(ImageDecoder.createSource((ByteBuffer) obj), i, i2, c8397);
            default:
                return c3027.m6537(ImageDecoder.createSource(AbstractC7984.m13465((InputStream) obj)), i, i2, c8397);
        }
    }

    @Override // p286.InterfaceC8400
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final /* bridge */ /* synthetic */ boolean mo6525(Object obj, C8397 c8397) {
        switch (this.f9690) {
            case 0:
                break;
            default:
                break;
        }
        return true;
    }
}
