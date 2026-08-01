package androidx.compose.foundation.text;

import androidx.activity.AbstractC0053;
import androidx.compose.foundation.layout.C0657;
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

/* JADX INFO: renamed from: androidx.compose.foundation.text.飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0948 implements InterfaceC1668 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final InterfaceC6543 f2697;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f2698;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C2004 f2699;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C0998 f2700;

    public C0948(C0998 c0998, int i, C2004 c2004, InterfaceC6543 interfaceC6543) {
        this.f2700 = c0998;
        this.f2698 = i;
        this.f2699 = c2004;
        this.f2697 = interfaceC6543;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0948) {
            C0948 c0948 = (C0948) obj;
            if (this.f2700 == c0948.f2700 && this.f2698 == c0948.f2698 && this.f2699.equals(c0948.f2699) && AbstractC4395.m8907(this.f2697, c0948.f2697)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f2697.hashCode() + ((this.f2699.hashCode() + AbstractC0053.m144(this.f2698, this.f2700.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "HorizontalScrollLayoutModifier(scrollerPosition=" + this.f2700 + ", cursorOffset=" + this.f2698 + ", transformedText=" + this.f2699 + ", textLayoutResultProvider=" + this.f2697 + ')';
    }

    @Override // androidx.compose.ui.layout.InterfaceC1668
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final InterfaceC1657 mo1872(InterfaceC1653 interfaceC1653, InterfaceC1655 interfaceC1655, long j) {
        long j2;
        if (interfaceC1655.mo3058(C7898.m13338(j)) < C7898.m13337(j)) {
            j2 = j;
        } else {
            j2 = j;
            j = C7898.m13336(0, Integer.MAX_VALUE, 0, 0, 13, j2);
        }
        AbstractC1724 abstractC1724Mo3055 = interfaceC1655.mo3055(j);
        int iMin = Math.min(abstractC1724Mo3055.f4999, C7898.m13337(j2));
        return interfaceC1653.mo1495(iMin, abstractC1724Mo3055.f4997, AbstractC4339.m8776(), new C0657(this, interfaceC1653, abstractC1724Mo3055, iMin, 1));
    }
}
