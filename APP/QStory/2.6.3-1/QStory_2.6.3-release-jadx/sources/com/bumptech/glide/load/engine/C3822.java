package com.bumptech.glide.load.engine;

import p209.C8657;
import p234.AbstractC8800;
import p234.C8799;
import p234.InterfaceC8801;
import p321.C9452;

/* JADX INFO: renamed from: com.bumptech.glide.load.engine.飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3822 implements InterfaceC3821, InterfaceC8801 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final C8657 f9806 = AbstractC8800.m14020(20, new C9452(15));

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public boolean f9807;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public InterfaceC3821 f9808;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public boolean f9809;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C8799 f9810 = new C8799();

    @Override // com.bumptech.glide.load.engine.InterfaceC3821
    public final Object get() {
        return this.f9808.get();
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC3821
    public final synchronized void recycle() {
        this.f9810.m14019();
        this.f9807 = true;
        if (!this.f9809) {
            this.f9808.recycle();
            this.f9808 = null;
            f9806.mo4549(this);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final synchronized void m7032() {
        this.f9810.m14019();
        if (!this.f9809) {
            throw new IllegalStateException("Already unlocked");
        }
        this.f9809 = false;
        if (this.f9807) {
            recycle();
        }
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC3821
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final Class mo7030() {
        return this.f9808.mo7030();
    }

    @Override // p234.InterfaceC8801
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C8799 mo7033() {
        return this.f9810;
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC3821
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final int mo7031() {
        return this.f9808.mo7031();
    }
}
