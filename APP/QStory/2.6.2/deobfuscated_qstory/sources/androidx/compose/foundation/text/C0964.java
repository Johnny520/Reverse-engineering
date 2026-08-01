package androidx.compose.foundation.text;

import androidx.activity.AbstractC0053;
import androidx.compose.foundation.C1048;
import androidx.compose.ui.layout.AbstractC1724;
import androidx.compose.ui.layout.InterfaceC1653;
import androidx.compose.ui.layout.InterfaceC1655;
import androidx.compose.ui.layout.InterfaceC1657;
import androidx.compose.ui.layout.InterfaceC1668;
import androidx.compose.ui.text.input.C2004;
import kotlin.collections.AbstractC4338;
import kotlin.jvm.internal.AbstractC4394;
import p052.InterfaceC6542;
import p205.C7897;

/* JADX INFO: renamed from: androidx.compose.foundation.text.飘花落叶言子哲楪兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0964 implements InterfaceC1668 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final InterfaceC6542 f2745;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f2746;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C2004 f2747;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C0998 f2748;

    public C0964(C0998 c0998, int i, C2004 c2004, InterfaceC6542 interfaceC6542) {
        this.f2748 = c0998;
        this.f2746 = i;
        this.f2747 = c2004;
        this.f2745 = interfaceC6542;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0964) {
            C0964 c0964 = (C0964) obj;
            if (this.f2748 == c0964.f2748 && this.f2746 == c0964.f2746 && this.f2747.equals(c0964.f2747) && AbstractC4394.m8917(this.f2745, c0964.f2745)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f2745.hashCode() + ((this.f2747.hashCode() + AbstractC0053.m143(this.f2746, this.f2748.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "VerticalScrollLayoutModifier(scrollerPosition=" + this.f2748 + ", cursorOffset=" + this.f2746 + ", transformedText=" + this.f2747 + ", textLayoutResultProvider=" + this.f2745 + ')';
    }

    @Override // androidx.compose.ui.layout.InterfaceC1668
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final InterfaceC1657 mo1862(InterfaceC1653 interfaceC1653, InterfaceC1655 interfaceC1655, long j) {
        AbstractC1724 abstractC1724Mo3045 = interfaceC1655.mo3045(C7897.m13308(0, 0, 0, Integer.MAX_VALUE, 7, j));
        int iMin = Math.min(abstractC1724Mo3045.f4996, C7897.m13310(j));
        return interfaceC1653.mo1485(abstractC1724Mo3045.f4998, iMin, AbstractC4338.m8781(), new C1048(this, abstractC1724Mo3045, iMin));
    }
}
