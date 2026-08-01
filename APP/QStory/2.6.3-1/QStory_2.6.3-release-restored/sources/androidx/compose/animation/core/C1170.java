package androidx.compose.animation.core;

import kotlin.jvm.internal.AbstractC5227;

/* JADX INFO: renamed from: androidx.compose.animation.core.飘花落叶言子哲楪兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1170 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC1181 f1436;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AbstractC1189 f1437;

    public C1170(AbstractC1189 abstractC1189, InterfaceC1181 interfaceC1181) {
        this.f1437 = abstractC1189;
        this.f1436 = interfaceC1181;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1170)) {
            return false;
        }
        C1170 c1170 = (C1170) obj;
        return AbstractC5227.m9466(this.f1437, c1170.f1437) && AbstractC5227.m9466(this.f1436, c1170.f1436);
    }

    public final int hashCode() {
        return Integer.hashCode(0) + ((this.f1436.hashCode() + (this.f1437.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "VectorizedKeyframeSpecElementInfo(vectorValue=" + this.f1437 + ", easing=" + this.f1436 + ", arcMode=ArcMode(value=0))";
    }
}
