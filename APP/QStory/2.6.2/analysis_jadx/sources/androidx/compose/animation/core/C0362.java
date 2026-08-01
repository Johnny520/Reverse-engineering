package androidx.compose.animation.core;

import kotlin.jvm.internal.AbstractC4394;

/* JADX INFO: renamed from: androidx.compose.animation.core.飘花落叶言子苏兰楪哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0362 implements InterfaceC0338 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC0335 f1234;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f1235;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f1236;

    public C0362(int i, int i2, InterfaceC0335 interfaceC0335) {
        this.f1236 = i;
        this.f1235 = i2;
        this.f1234 = interfaceC0335;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0362) {
            C0362 c0362 = (C0362) obj;
            if (c0362.f1236 == this.f1236 && c0362.f1235 == this.f1235 && AbstractC4394.m8917(c0362.f1234, this.f1234)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f1234.hashCode() + (this.f1236 * 31)) * 31) + this.f1235;
    }

    @Override // androidx.compose.animation.core.InterfaceC0349
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final InterfaceC0360 mo926(InterfaceC0358 interfaceC0358) {
        return new C0318(this.f1236, this.f1235, this.f1234);
    }

    @Override // androidx.compose.animation.core.InterfaceC0338, androidx.compose.animation.core.InterfaceC0349
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final InterfaceC0322 mo926(InterfaceC0358 interfaceC0358) {
        return new C0318(this.f1236, this.f1235, this.f1234);
    }
}
