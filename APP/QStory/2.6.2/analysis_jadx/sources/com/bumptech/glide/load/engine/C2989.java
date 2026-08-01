package com.bumptech.glide.load.engine;

import p193.C7827;
import p218.AbstractC7970;
import p218.C7969;
import p218.InterfaceC7971;
import p305.C8631;

/* JADX INFO: renamed from: com.bumptech.glide.load.engine.飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2989 implements InterfaceC2988, InterfaceC7971 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final C7827 f9459 = AbstractC7970.m13433(20, new C8631(15));

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public boolean f9460;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public InterfaceC2988 f9461;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public boolean f9462;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C7969 f9463 = new C7969();

    @Override // com.bumptech.glide.load.engine.InterfaceC2988
    public final Object get() {
        return this.f9461.get();
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC2988
    public final synchronized void recycle() {
        this.f9463.m13432();
        this.f9460 = true;
        if (!this.f9462) {
            this.f9461.recycle();
            this.f9461 = null;
            f9459.mo3979(this);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final synchronized void m6414() {
        this.f9463.m13432();
        if (!this.f9462) {
            throw new IllegalStateException("Already unlocked");
        }
        this.f9462 = false;
        if (this.f9460) {
            recycle();
        }
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC2988
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final Class mo6412() {
        return this.f9461.mo6412();
    }

    @Override // p218.InterfaceC7971
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C7969 mo6415() {
        return this.f9463;
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC2988
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final int mo6413() {
        return this.f9461.mo6413();
    }
}
