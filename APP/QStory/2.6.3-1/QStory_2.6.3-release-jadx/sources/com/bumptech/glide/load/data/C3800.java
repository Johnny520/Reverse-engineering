package com.bumptech.glide.load.data;

import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.engine.bitmap_recycle.C3806;
import com.bumptech.glide.load.resource.bitmap.C3865;
import java.io.InputStream;
import java.util.HashMap;

/* JADX INFO: renamed from: com.bumptech.glide.load.data.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3800 implements InterfaceC3792 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final C3801 f9729 = new C3801(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Object f9730;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f9731;

    public C3800(InputStream inputStream, C3806 c3806) {
        this.f9731 = 3;
        C3865 c3865 = new C3865(inputStream, c3806);
        this.f9730 = c3865;
        c3865.mark(5242880);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public ParcelFileDescriptor m7000() {
        return ((ParcelFileDescriptorRewinder$InternalRewinder) this.f9730).rewind();
    }

    @Override // com.bumptech.glide.load.data.InterfaceC3792
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public Object mo6986() {
        int i = this.f9731;
        Object obj = this.f9730;
        switch (i) {
            case 1:
                return ((ParcelFileDescriptorRewinder$InternalRewinder) obj).rewind();
            case 2:
                return obj;
            default:
                C3865 c3865 = (C3865) obj;
                c3865.reset();
                return c3865;
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC3792
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public void mo6987() {
        switch (this.f9731) {
            case 1:
            case 2:
                break;
            default:
                ((C3865) this.f9730).m7108();
                break;
        }
    }

    public C3800() {
        this.f9731 = 0;
        this.f9730 = new HashMap();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    private final void m6998() {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    private final void m6999() {
    }

    public C3800(ParcelFileDescriptor parcelFileDescriptor) {
        this.f9731 = 1;
        this.f9730 = new ParcelFileDescriptorRewinder$InternalRewinder(parcelFileDescriptor);
    }

    public C3800(Object obj) {
        this.f9731 = 2;
        this.f9730 = obj;
    }
}
