package androidx.compose.foundation.text;

import androidx.activity.AbstractC0900;
import androidx.compose.foundation.layout.C1498;
import androidx.compose.p001ui.layout.AbstractC2559;
import androidx.compose.p001ui.layout.InterfaceC2488;
import androidx.compose.p001ui.layout.InterfaceC2490;
import androidx.compose.p001ui.layout.InterfaceC2492;
import androidx.compose.p001ui.layout.InterfaceC2503;
import androidx.compose.p001ui.text.input.C2838;
import kotlin.collections.AbstractC5171;
import kotlin.jvm.internal.AbstractC5227;
import p068.InterfaceC7372;
import p221.C8727;

/* JADX INFO: renamed from: androidx.compose.foundation.text.飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1786 implements InterfaceC2503 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final InterfaceC7372 f3042;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f3043;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C2838 f3044;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C1836 f3045;

    public C1786(C1836 c1836, int i, C2838 c2838, InterfaceC7372 interfaceC7372) {
        this.f3045 = c1836;
        this.f3043 = i;
        this.f3044 = c2838;
        this.f3042 = interfaceC7372;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1786) {
            C1786 c1786 = (C1786) obj;
            if (this.f3045 == c1786.f3045 && this.f3043 == c1786.f3043 && this.f3044.equals(c1786.f3044) && AbstractC5227.m9466(this.f3042, c1786.f3042)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f3042.hashCode() + ((this.f3044.hashCode() + AbstractC0900.m704(this.f3043, this.f3045.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "HorizontalScrollLayoutModifier(scrollerPosition=" + this.f3045 + ", cursorOffset=" + this.f3043 + ", transformedText=" + this.f3044 + ", textLayoutResultProvider=" + this.f3042 + ')';
    }

    @Override // androidx.compose.p001ui.layout.InterfaceC2503
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final InterfaceC2492 mo2432(InterfaceC2488 interfaceC2488, InterfaceC2490 interfaceC2490, long j) {
        long j2;
        if (interfaceC2490.mo3618(C8727.m13897(j)) < C8727.m13896(j)) {
            j2 = j;
        } else {
            j2 = j;
            j = C8727.m13895(0, Integer.MAX_VALUE, 0, 0, 13, j2);
        }
        AbstractC2559 abstractC2559Mo3615 = interfaceC2490.mo3615(j);
        int iMin = Math.min(abstractC2559Mo3615.f5344, C8727.m13896(j2));
        return interfaceC2488.mo2055(iMin, abstractC2559Mo3615.f5342, AbstractC5171.m9335(), new C1498(this, interfaceC2488, abstractC2559Mo3615, iMin, 1));
    }
}
