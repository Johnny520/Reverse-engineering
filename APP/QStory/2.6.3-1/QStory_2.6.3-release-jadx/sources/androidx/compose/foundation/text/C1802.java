package androidx.compose.foundation.text;

import androidx.activity.AbstractC0900;
import androidx.compose.foundation.C1886;
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

/* JADX INFO: renamed from: androidx.compose.foundation.text.飘花落叶言子哲楪兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1802 implements InterfaceC2503 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final InterfaceC7372 f3091;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f3092;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C2838 f3093;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C1836 f3094;

    public C1802(C1836 c1836, int i, C2838 c2838, InterfaceC7372 interfaceC7372) {
        this.f3094 = c1836;
        this.f3092 = i;
        this.f3093 = c2838;
        this.f3091 = interfaceC7372;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1802) {
            C1802 c1802 = (C1802) obj;
            if (this.f3094 == c1802.f3094 && this.f3092 == c1802.f3092 && this.f3093.equals(c1802.f3093) && AbstractC5227.m9466(this.f3091, c1802.f3091)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f3091.hashCode() + ((this.f3093.hashCode() + AbstractC0900.m704(this.f3092, this.f3094.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "VerticalScrollLayoutModifier(scrollerPosition=" + this.f3094 + ", cursorOffset=" + this.f3092 + ", transformedText=" + this.f3093 + ", textLayoutResultProvider=" + this.f3091 + ')';
    }

    @Override // androidx.compose.p001ui.layout.InterfaceC2503
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final InterfaceC2492 mo2432(InterfaceC2488 interfaceC2488, InterfaceC2490 interfaceC2490, long j) {
        AbstractC2559 abstractC2559Mo3615 = interfaceC2490.mo3615(C8727.m13895(0, 0, 0, Integer.MAX_VALUE, 7, j));
        int iMin = Math.min(abstractC2559Mo3615.f5342, C8727.m13897(j));
        return interfaceC2488.mo2055(abstractC2559Mo3615.f5344, iMin, AbstractC5171.m9335(), new C1886(this, abstractC2559Mo3615, iMin));
    }
}
