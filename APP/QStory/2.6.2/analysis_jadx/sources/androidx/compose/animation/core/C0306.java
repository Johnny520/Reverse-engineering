package androidx.compose.animation.core;

import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: androidx.compose.animation.core.飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0306 implements InterfaceC0349 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final long f1040;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final RepeatMode f1041;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC0338 f1042;

    public C0306(InterfaceC0338 interfaceC0338, RepeatMode repeatMode, long j) {
        this.f1042 = interfaceC0338;
        this.f1041 = repeatMode;
        this.f1040 = j;
        if (interfaceC0338 instanceof C0362) {
            C0362 c0362 = (C0362) interfaceC0338;
            if (c0362.f1236 != 0 || c0362.f1235 != 0) {
                return;
            }
        } else if (!(interfaceC0338 instanceof C0297)) {
            return;
        }
        C5919.m11249("Animation to be infinitely repeated cannot have a 0-duration");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0306) {
            C0306 c0306 = (C0306) obj;
            if (c0306.f1042.equals(this.f1042) && c0306.f1041 == this.f1041 && c0306.f1040 == this.f1040) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f1040) + ((this.f1041.hashCode() + (this.f1042.hashCode() * 31)) * 31);
    }

    @Override // androidx.compose.animation.core.InterfaceC0349
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final InterfaceC0360 mo926(InterfaceC0358 interfaceC0358) {
        return new C0323(this.f1042.mo926(interfaceC0358), this.f1041, this.f1040);
    }
}
