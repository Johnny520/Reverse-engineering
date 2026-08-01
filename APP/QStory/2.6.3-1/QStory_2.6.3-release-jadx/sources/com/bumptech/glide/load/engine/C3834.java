package com.bumptech.glide.load.engine;

import p238.AbstractC8818;
import p302.InterfaceC9222;

/* JADX INFO: renamed from: com.bumptech.glide.load.engine.飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3834 implements InterfaceC3821 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final InterfaceC9222 f9867;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C3840 f9868;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public int f9869;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public boolean f9870;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final boolean f9871;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final InterfaceC3821 f9872;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final boolean f9873;

    public C3834(InterfaceC3821 interfaceC3821, boolean z, boolean z2, InterfaceC9222 interfaceC9222, C3840 c3840) {
        AbstractC8818.m14028(interfaceC3821, "Argument must not be null");
        this.f9872 = interfaceC3821;
        this.f9873 = z;
        this.f9871 = z2;
        this.f9867 = interfaceC9222;
        AbstractC8818.m14028(c3840, "Argument must not be null");
        this.f9868 = c3840;
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC3821
    public final Object get() {
        return this.f9872.get();
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC3821
    public final synchronized void recycle() {
        if (this.f9869 > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
        if (this.f9870) {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
        this.f9870 = true;
        if (this.f9871) {
            this.f9872.recycle();
        }
    }

    public final synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.f9873 + ", listener=" + this.f9868 + ", key=" + this.f9867 + ", acquired=" + this.f9869 + ", isRecycled=" + this.f9870 + ", resource=" + this.f9872 + '}';
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m7044() {
        boolean z;
        synchronized (this) {
            int i = this.f9869;
            if (i <= 0) {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
            z = true;
            int i2 = i - 1;
            this.f9869 = i2;
            if (i2 != 0) {
                z = false;
            }
        }
        if (z) {
            this.f9868.m7058(this.f9867, this);
        }
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC3821
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final Class mo7030() {
        return this.f9872.mo7030();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final synchronized void m7045() {
        if (this.f9870) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
        this.f9869++;
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC3821
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final int mo7031() {
        return this.f9872.mo7031();
    }
}
