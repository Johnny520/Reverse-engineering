package com.bumptech.glide.load.data;

import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.engine.bitmap_recycle.C2973;
import com.bumptech.glide.load.resource.bitmap.C3032;
import java.io.InputStream;
import java.util.HashMap;

/* JADX INFO: renamed from: com.bumptech.glide.load.data.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2967 implements InterfaceC2959 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final C2968 f9382 = new C2968(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Object f9383;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f9384;

    public C2967(InputStream inputStream, C2973 c2973) {
        this.f9384 = 3;
        C3032 c3032 = new C3032(inputStream, c2973);
        this.f9383 = c3032;
        c3032.mark(5242880);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public ParcelFileDescriptor m6382() {
        return ((ParcelFileDescriptorRewinder$InternalRewinder) this.f9383).rewind();
    }

    @Override // com.bumptech.glide.load.data.InterfaceC2959
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public Object mo6368() {
        int i = this.f9384;
        Object obj = this.f9383;
        switch (i) {
            case 1:
                return ((ParcelFileDescriptorRewinder$InternalRewinder) obj).rewind();
            case 2:
                return obj;
            default:
                C3032 c3032 = (C3032) obj;
                c3032.reset();
                return c3032;
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC2959
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public void mo6369() {
        switch (this.f9384) {
            case 1:
            case 2:
                break;
            default:
                ((C3032) this.f9383).m6488();
                break;
        }
    }

    public C2967() {
        this.f9384 = 0;
        this.f9383 = new HashMap();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    private final void m6380() {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    private final void m6381() {
    }

    public C2967(ParcelFileDescriptor parcelFileDescriptor) {
        this.f9384 = 1;
        this.f9383 = new ParcelFileDescriptorRewinder$InternalRewinder(parcelFileDescriptor);
    }

    public C2967(Object obj) {
        this.f9384 = 2;
        this.f9383 = obj;
    }
}
