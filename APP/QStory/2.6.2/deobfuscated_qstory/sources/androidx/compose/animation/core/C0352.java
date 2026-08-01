package androidx.compose.animation.core;

import kotlin.jvm.internal.AbstractC4394;

/* JADX INFO: renamed from: androidx.compose.animation.core.飘花落叶言子苏世兰楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0352 implements InterfaceC0353 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object f1215;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Object f1216;

    public C0352(Object obj, Object obj2) {
        this.f1216 = obj;
        this.f1215 = obj2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof InterfaceC0353)) {
            return false;
        }
        InterfaceC0353 interfaceC0353 = (InterfaceC0353) obj;
        return AbstractC4394.m8917(this.f1216, interfaceC0353.mo1056()) && AbstractC4394.m8917(this.f1215, interfaceC0353.mo1055());
    }

    public final int hashCode() {
        Object obj = this.f1216;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.f1215;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    @Override // androidx.compose.animation.core.InterfaceC0353
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Object mo1055() {
        return this.f1215;
    }

    @Override // androidx.compose.animation.core.InterfaceC0353
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Object mo1056() {
        return this.f1216;
    }
}
