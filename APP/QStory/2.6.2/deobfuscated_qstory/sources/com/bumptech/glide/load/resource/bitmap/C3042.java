package com.bumptech.glide.load.resource.bitmap;

import android.graphics.ImageDecoder;
import com.bumptech.glide.load.engine.InterfaceC2988;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p222.AbstractC7983;
import p286.C8396;
import p286.InterfaceC8399;

/* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3042 implements InterfaceC8399 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C3026 f9687;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f9688;

    public C3042(int i) {
        this.f9688 = i;
        switch (i) {
            case 1:
                this.f9687 = new C3026();
                break;
            default:
                this.f9687 = new C3026();
                break;
        }
    }

    @Override // p286.InterfaceC8399
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final InterfaceC2988 mo6464(Object obj, int i, int i2, C8396 c8396) {
        int i3 = this.f9688;
        C3026 c3026 = this.f9687;
        switch (i3) {
            case 0:
                return c3026.m6477(ImageDecoder.createSource((ByteBuffer) obj), i, i2, c8396);
            default:
                return c3026.m6477(ImageDecoder.createSource(AbstractC7983.m13437((InputStream) obj)), i, i2, c8396);
        }
    }

    @Override // p286.InterfaceC8399
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final /* bridge */ /* synthetic */ boolean mo6465(Object obj, C8396 c8396) {
        switch (this.f9688) {
            case 0:
                break;
            default:
                break;
        }
        return true;
    }
}
