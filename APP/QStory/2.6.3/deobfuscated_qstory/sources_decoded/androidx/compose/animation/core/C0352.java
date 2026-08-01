package androidx.compose.animation.core;

import kotlin.jvm.internal.AbstractC4395;

/* JADX INFO: renamed from: androidx.compose.animation.core.飘花落叶言子苏世兰楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
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
        return AbstractC4395.m8907(this.f1216, interfaceC0353.mo1057()) && AbstractC4395.m8907(this.f1215, interfaceC0353.mo1056());
    }

    public final int hashCode() {
        Object obj = this.f1216;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.f1215;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    @Override // androidx.compose.animation.core.InterfaceC0353
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Object mo1056() {
        return this.f1215;
    }

    @Override // androidx.compose.animation.core.InterfaceC0353
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Object mo1057() {
        return this.f1216;
    }
}
