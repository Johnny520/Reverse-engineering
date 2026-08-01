package com.bumptech.glide.load.data;

import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.engine.bitmap_recycle.C2974;
import com.bumptech.glide.load.resource.bitmap.C3033;
import java.io.InputStream;
import java.util.HashMap;

/* JADX INFO: renamed from: com.bumptech.glide.load.data.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2968 implements InterfaceC2960 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final C2969 f9384 = new C2969(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Object f9385;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f9386;

    public C2968(InputStream inputStream, C2974 c2974) {
        this.f9386 = 3;
        C3033 c3033 = new C3033(inputStream, c2974);
        this.f9385 = c3033;
        c3033.mark(5242880);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public ParcelFileDescriptor m6440() {
        return ((ParcelFileDescriptorRewinder$InternalRewinder) this.f9385).rewind();
    }

    @Override // com.bumptech.glide.load.data.InterfaceC2960
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public Object mo6426() {
        int i = this.f9386;
        Object obj = this.f9385;
        switch (i) {
            case 1:
                return ((ParcelFileDescriptorRewinder$InternalRewinder) obj).rewind();
            case 2:
                return obj;
            default:
                C3033 c3033 = (C3033) obj;
                c3033.reset();
                return c3033;
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC2960
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public void mo6427() {
        switch (this.f9386) {
            case 1:
            case 2:
                break;
            default:
                ((C3033) this.f9385).m6548();
                break;
        }
    }

    public C2968() {
        this.f9386 = 0;
        this.f9385 = new HashMap();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    private final void m6438() {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    private final void m6439() {
    }

    public C2968(ParcelFileDescriptor parcelFileDescriptor) {
        this.f9386 = 1;
        this.f9385 = new ParcelFileDescriptorRewinder$InternalRewinder(parcelFileDescriptor);
    }

    public C2968(Object obj) {
        this.f9386 = 2;
        this.f9385 = obj;
    }
}
