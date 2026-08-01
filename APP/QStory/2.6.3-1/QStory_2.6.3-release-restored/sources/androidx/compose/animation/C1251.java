package androidx.compose.animation;

import androidx.compose.animation.core.InterfaceC1157;
import androidx.compose.p001ui.C2964;
import kotlin.jvm.internal.AbstractC5227;
import p068.InterfaceC7387;

/* JADX INFO: renamed from: androidx.compose.animation.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1251 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC1157 f1693;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC7387 f1694;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C2964 f1695;

    public C1251(InterfaceC1157 interfaceC1157, C2964 c2964, InterfaceC7387 interfaceC7387) {
        this.f1695 = c2964;
        this.f1694 = interfaceC7387;
        this.f1693 = interfaceC1157;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1251)) {
            return false;
        }
        C1251 c1251 = (C1251) obj;
        return this.f1695.equals(c1251.f1695) && AbstractC5227.m9466(this.f1694, c1251.f1694) && AbstractC5227.m9466(this.f1693, c1251.f1693);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + ((this.f1693.hashCode() + ((this.f1694.hashCode() + (this.f1695.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ChangeSize(alignment=" + this.f1695 + ", size=" + this.f1694 + ", animationSpec=" + this.f1693 + ", clip=true)";
    }
}
