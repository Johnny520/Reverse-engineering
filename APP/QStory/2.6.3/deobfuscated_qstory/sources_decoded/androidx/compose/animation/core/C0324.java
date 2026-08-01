package androidx.compose.animation.core;

import kotlin.jvm.internal.AbstractC4395;

/* JADX INFO: renamed from: androidx.compose.animation.core.飘花落叶言子哲楪兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0324 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC0335 f1091;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AbstractC0343 f1092;

    public C0324(AbstractC0343 abstractC0343, InterfaceC0335 interfaceC0335) {
        this.f1092 = abstractC0343;
        this.f1091 = interfaceC0335;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0324)) {
            return false;
        }
        C0324 c0324 = (C0324) obj;
        return AbstractC4395.m8907(this.f1092, c0324.f1092) && AbstractC4395.m8907(this.f1091, c0324.f1091);
    }

    public final int hashCode() {
        return Integer.hashCode(0) + ((this.f1091.hashCode() + (this.f1092.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "VectorizedKeyframeSpecElementInfo(vectorValue=" + this.f1092 + ", easing=" + this.f1091 + ", arcMode=ArcMode(value=0))";
    }
}
