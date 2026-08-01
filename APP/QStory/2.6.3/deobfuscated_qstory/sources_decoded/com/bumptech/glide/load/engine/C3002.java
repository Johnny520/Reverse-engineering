package com.bumptech.glide.load.engine;

import p222.AbstractC7989;
import p286.InterfaceC8393;

/* JADX INFO: renamed from: com.bumptech.glide.load.engine.飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3002 implements InterfaceC2989 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final InterfaceC8393 f9522;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C3008 f9523;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public int f9524;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public boolean f9525;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final boolean f9526;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final InterfaceC2989 f9527;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final boolean f9528;

    public C3002(InterfaceC2989 interfaceC2989, boolean z, boolean z2, InterfaceC8393 interfaceC8393, C3008 c3008) {
        AbstractC7989.m13469(interfaceC2989, "Argument must not be null");
        this.f9527 = interfaceC2989;
        this.f9528 = z;
        this.f9526 = z2;
        this.f9522 = interfaceC8393;
        AbstractC7989.m13469(c3008, "Argument must not be null");
        this.f9523 = c3008;
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC2989
    public final Object get() {
        return this.f9527.get();
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC2989
    public final synchronized void recycle() {
        if (this.f9524 > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
        if (this.f9525) {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
        this.f9525 = true;
        if (this.f9526) {
            this.f9527.recycle();
        }
    }

    public final synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.f9528 + ", listener=" + this.f9523 + ", key=" + this.f9522 + ", acquired=" + this.f9524 + ", isRecycled=" + this.f9525 + ", resource=" + this.f9527 + '}';
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m6484() {
        boolean z;
        synchronized (this) {
            int i = this.f9524;
            if (i <= 0) {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
            z = true;
            int i2 = i - 1;
            this.f9524 = i2;
            if (i2 != 0) {
                z = false;
            }
        }
        if (z) {
            this.f9523.m6498(this.f9522, this);
        }
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC2989
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final Class mo6470() {
        return this.f9527.mo6470();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final synchronized void m6485() {
        if (this.f9525) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
        this.f9524++;
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC2989
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final int mo6471() {
        return this.f9527.mo6471();
    }
}
