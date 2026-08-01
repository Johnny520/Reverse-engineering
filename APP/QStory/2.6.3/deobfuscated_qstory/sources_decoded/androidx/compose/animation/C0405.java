package androidx.compose.animation;

import androidx.compose.animation.core.InterfaceC0311;
import androidx.compose.ui.C2131;
import kotlin.jvm.internal.AbstractC4395;
import p052.InterfaceC6558;

/* JADX INFO: renamed from: androidx.compose.animation.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0405 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC0311 f1348;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC6558 f1349;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C2131 f1350;

    public C0405(InterfaceC0311 interfaceC0311, C2131 c2131, InterfaceC6558 interfaceC6558) {
        this.f1350 = c2131;
        this.f1349 = interfaceC6558;
        this.f1348 = interfaceC0311;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0405)) {
            return false;
        }
        C0405 c0405 = (C0405) obj;
        return this.f1350.equals(c0405.f1350) && AbstractC4395.m8907(this.f1349, c0405.f1349) && AbstractC4395.m8907(this.f1348, c0405.f1348);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + ((this.f1348.hashCode() + ((this.f1349.hashCode() + (this.f1350.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ChangeSize(alignment=" + this.f1350 + ", size=" + this.f1349 + ", animationSpec=" + this.f1348 + ", clip=true)";
    }
}
