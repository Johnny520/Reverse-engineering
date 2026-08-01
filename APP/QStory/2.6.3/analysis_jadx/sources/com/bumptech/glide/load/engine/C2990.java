package com.bumptech.glide.load.engine;

import p193.C7828;
import p218.AbstractC7971;
import p218.C7970;
import p218.InterfaceC7972;
import p305.C8623;

/* JADX INFO: renamed from: com.bumptech.glide.load.engine.飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2990 implements InterfaceC2989, InterfaceC7972 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final C7828 f9461 = AbstractC7971.m13461(20, new C8623(15));

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public boolean f9462;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public InterfaceC2989 f9463;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public boolean f9464;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C7970 f9465 = new C7970();

    @Override // com.bumptech.glide.load.engine.InterfaceC2989
    public final Object get() {
        return this.f9463.get();
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC2989
    public final synchronized void recycle() {
        this.f9465.m13460();
        this.f9462 = true;
        if (!this.f9464) {
            this.f9463.recycle();
            this.f9463 = null;
            f9461.mo3989(this);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final synchronized void m6472() {
        this.f9465.m13460();
        if (!this.f9464) {
            throw new IllegalStateException("Already unlocked");
        }
        this.f9464 = false;
        if (this.f9462) {
            recycle();
        }
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC2989
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final Class mo6470() {
        return this.f9463.mo6470();
    }

    @Override // p218.InterfaceC7972
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C7970 mo6473() {
        return this.f9465;
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC2989
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final int mo6471() {
        return this.f9463.mo6471();
    }
}
