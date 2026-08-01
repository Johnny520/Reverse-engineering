package androidx.compose.foundation.text;

import androidx.activity.AbstractC0053;
import androidx.compose.foundation.layout.C0657;
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

/* JADX INFO: renamed from: androidx.compose.foundation.text.飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0948 implements InterfaceC1668 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final InterfaceC6542 f2696;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f2697;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C2004 f2698;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C0998 f2699;

    public C0948(C0998 c0998, int i, C2004 c2004, InterfaceC6542 interfaceC6542) {
        this.f2699 = c0998;
        this.f2697 = i;
        this.f2698 = c2004;
        this.f2696 = interfaceC6542;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0948) {
            C0948 c0948 = (C0948) obj;
            if (this.f2699 == c0948.f2699 && this.f2697 == c0948.f2697 && this.f2698.equals(c0948.f2698) && AbstractC4394.m8917(this.f2696, c0948.f2696)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f2696.hashCode() + ((this.f2698.hashCode() + AbstractC0053.m143(this.f2697, this.f2699.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "HorizontalScrollLayoutModifier(scrollerPosition=" + this.f2699 + ", cursorOffset=" + this.f2697 + ", transformedText=" + this.f2698 + ", textLayoutResultProvider=" + this.f2696 + ')';
    }

    @Override // androidx.compose.ui.layout.InterfaceC1668
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final InterfaceC1657 mo1862(InterfaceC1653 interfaceC1653, InterfaceC1655 interfaceC1655, long j) {
        long j2;
        if (interfaceC1655.mo3048(C7897.m13310(j)) < C7897.m13309(j)) {
            j2 = j;
        } else {
            j2 = j;
            j = C7897.m13308(0, Integer.MAX_VALUE, 0, 0, 13, j2);
        }
        AbstractC1724 abstractC1724Mo3045 = interfaceC1655.mo3045(j);
        int iMin = Math.min(abstractC1724Mo3045.f4998, C7897.m13309(j2));
        return interfaceC1653.mo1485(iMin, abstractC1724Mo3045.f4996, AbstractC4338.m8781(), new C0657(this, interfaceC1653, abstractC1724Mo3045, iMin, 1));
    }
}
