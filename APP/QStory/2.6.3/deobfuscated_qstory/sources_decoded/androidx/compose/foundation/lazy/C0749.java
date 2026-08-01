package androidx.compose.foundation.lazy;

import androidx.activity.AbstractC0053;
import androidx.compose.foundation.lazy.layout.C0712;
import androidx.compose.ui.C2116;
import androidx.compose.ui.layout.AbstractC1708;
import androidx.compose.ui.layout.AbstractC1724;
import androidx.compose.ui.layout.AbstractC1725;
import androidx.compose.ui.unit.LayoutDirection;
import io.ktor.util.C4211;
import java.util.List;
import p052.InterfaceC6558;
import p176.AbstractC7741;
import p205.C7908;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0749 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final long f2157;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final int f2158;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final LayoutDirection f2159;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C2116 f2160;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final List f2161;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f2162;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public boolean f2163;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final int f2164;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public int f2165 = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final int[] f2166;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final Object f2167;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final Object f2168;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final int f2169;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final int f2170;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final C0712 f2171;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public int f2172;

    public C0749(int i, List list, C2116 c2116, LayoutDirection layoutDirection, int i2, int i3, int i4, long j, Object obj, Object obj2, C0712 c0712, long j2) {
        this.f2162 = i;
        this.f2161 = list;
        this.f2160 = c2116;
        this.f2159 = layoutDirection;
        this.f2158 = i4;
        this.f2157 = j;
        this.f2168 = obj;
        this.f2167 = obj2;
        this.f2171 = c0712;
        int size = list.size();
        int i5 = 0;
        int iMax = 0;
        for (int i6 = 0; i6 < size; i6++) {
            AbstractC1724 abstractC1724 = (AbstractC1724) list.get(i6);
            i5 += abstractC1724.f4997;
            iMax = Math.max(iMax, abstractC1724.f4999);
        }
        this.f2169 = i5;
        int i7 = i5 + this.f2158;
        this.f2170 = i7 >= 0 ? i7 : 0;
        this.f2164 = iMax;
        this.f2166 = new int[this.f2161.size() * 2];
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m1561(int i, int i2, int i3) {
        this.f2172 = i;
        this.f2165 = i3;
        List list = this.f2161;
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            AbstractC1724 abstractC1724 = (AbstractC1724) list.get(i4);
            int i5 = i4 * 2;
            C2116 c2116 = this.f2160;
            if (c2116 == null) {
                AbstractC7741.m13096("null horizontalAlignment when isVertical == true");
                C4211.m8602();
                return;
            }
            int iM3858 = c2116.m3858(abstractC1724.f4999, i2, this.f2159);
            int[] iArr = this.f2166;
            iArr[i5] = iM3858;
            iArr[i5 + 1] = i;
            i += abstractC1724.f4997;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m1562(AbstractC1708 abstractC1708) {
        if (this.f2165 == Integer.MIN_VALUE) {
            AbstractC7741.m13097("position() should be called first");
        }
        List list = this.f2161;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            AbstractC1724 abstractC1724 = (AbstractC1724) list.get(i);
            int i2 = abstractC1724.f4997;
            long jM1563 = m1563(i);
            AbstractC0053.m137(this.f2171.f2012.m757(this.f2168));
            long jM13362 = C7908.m13362(jM1563, this.f2157);
            InterfaceC6558 interfaceC6558 = AbstractC1725.f5001;
            abstractC1708.getClass();
            AbstractC1708.m3129(abstractC1708, abstractC1724);
            abstractC1724.mo3128(C7908.m13362(jM13362, abstractC1724.f4995), 0.0f, interfaceC6558);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final long m1563(int i) {
        if (i == 0 && this.f2161.size() == 0) {
            return ((long) this.f2172) & 4294967295L;
        }
        int i2 = i * 2;
        int[] iArr = this.f2166;
        int i3 = iArr[i2];
        return (((long) iArr[i2 + 1]) & 4294967295L) | (((long) i3) << 32);
    }
}
