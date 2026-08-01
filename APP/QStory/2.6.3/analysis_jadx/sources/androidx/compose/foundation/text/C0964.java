package androidx.compose.foundation.text;

import androidx.activity.AbstractC0053;
import androidx.compose.foundation.C1048;
import androidx.compose.ui.layout.AbstractC1724;
import androidx.compose.ui.layout.InterfaceC1653;
import androidx.compose.ui.layout.InterfaceC1655;
import androidx.compose.ui.layout.InterfaceC1657;
import androidx.compose.ui.layout.InterfaceC1668;
import androidx.compose.ui.text.input.C2004;
import kotlin.collections.AbstractC4339;
import kotlin.jvm.internal.AbstractC4395;
import p052.InterfaceC6543;
import p205.C7898;

/* JADX INFO: renamed from: androidx.compose.foundation.text.飘花落叶言子哲楪兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0964 implements InterfaceC1668 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final InterfaceC6543 f2746;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f2747;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C2004 f2748;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C0998 f2749;

    public C0964(C0998 c0998, int i, C2004 c2004, InterfaceC6543 interfaceC6543) {
        this.f2749 = c0998;
        this.f2747 = i;
        this.f2748 = c2004;
        this.f2746 = interfaceC6543;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0964) {
            C0964 c0964 = (C0964) obj;
            if (this.f2749 == c0964.f2749 && this.f2747 == c0964.f2747 && this.f2748.equals(c0964.f2748) && AbstractC4395.m8907(this.f2746, c0964.f2746)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f2746.hashCode() + ((this.f2748.hashCode() + AbstractC0053.m144(this.f2747, this.f2749.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "VerticalScrollLayoutModifier(scrollerPosition=" + this.f2749 + ", cursorOffset=" + this.f2747 + ", transformedText=" + this.f2748 + ", textLayoutResultProvider=" + this.f2746 + ')';
    }

    @Override // androidx.compose.ui.layout.InterfaceC1668
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final InterfaceC1657 mo1872(InterfaceC1653 interfaceC1653, InterfaceC1655 interfaceC1655, long j) {
        AbstractC1724 abstractC1724Mo3055 = interfaceC1655.mo3055(C7898.m13336(0, 0, 0, Integer.MAX_VALUE, 7, j));
        int iMin = Math.min(abstractC1724Mo3055.f4997, C7898.m13338(j));
        return interfaceC1653.mo1495(abstractC1724Mo3055.f4999, iMin, AbstractC4339.m8776(), new C1048(this, abstractC1724Mo3055, iMin));
    }
}
