package com.bumptech.glide.load.resource.bitmap;

import android.graphics.ImageDecoder;
import com.bumptech.glide.load.engine.InterfaceC3821;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p238.AbstractC8813;
import p302.C9226;
import p302.InterfaceC9229;

/* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3875 implements InterfaceC9229 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C3859 f10034;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f10035;

    public C3875(int i) {
        this.f10035 = i;
        switch (i) {
            case 1:
                this.f10034 = new C3859();
                break;
            default:
                this.f10034 = new C3859();
                break;
        }
    }

    @Override // p302.InterfaceC9229
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final InterfaceC3821 mo7084(Object obj, int i, int i2, C9226 c9226) {
        int i3 = this.f10035;
        C3859 c3859 = this.f10034;
        switch (i3) {
            case 0:
                return c3859.m7097(ImageDecoder.createSource((ByteBuffer) obj), i, i2, c9226);
            default:
                return c3859.m7097(ImageDecoder.createSource(AbstractC8813.m14024((InputStream) obj)), i, i2, c9226);
        }
    }

    @Override // p302.InterfaceC9229
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final /* bridge */ /* synthetic */ boolean mo7085(Object obj, C9226 c9226) {
        switch (this.f10035) {
            case 0:
                break;
            default:
                break;
        }
        return true;
    }
}
