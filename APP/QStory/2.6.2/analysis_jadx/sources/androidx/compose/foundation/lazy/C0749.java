package androidx.compose.foundation.lazy;

import androidx.activity.AbstractC0053;
import androidx.compose.foundation.lazy.layout.C0712;
import androidx.compose.ui.C2116;
import androidx.compose.ui.layout.AbstractC1708;
import androidx.compose.ui.layout.AbstractC1724;
import androidx.compose.ui.layout.AbstractC1725;
import androidx.compose.ui.unit.LayoutDirection;
import io.ktor.util.C4210;
import java.util.List;
import p052.InterfaceC6557;
import p176.AbstractC7740;
import p205.C7907;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0749 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final long f2156;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final int f2157;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final LayoutDirection f2158;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C2116 f2159;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final List f2160;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f2161;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public boolean f2162;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final int f2163;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public int f2164 = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final int[] f2165;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final Object f2166;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final Object f2167;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final int f2168;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final int f2169;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final C0712 f2170;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public int f2171;

    public C0749(int i, List list, C2116 c2116, LayoutDirection layoutDirection, int i2, int i3, int i4, long j, Object obj, Object obj2, C0712 c0712, long j2) {
        this.f2161 = i;
        this.f2160 = list;
        this.f2159 = c2116;
        this.f2158 = layoutDirection;
        this.f2157 = i4;
        this.f2156 = j;
        this.f2167 = obj;
        this.f2166 = obj2;
        this.f2170 = c0712;
        int size = list.size();
        int i5 = 0;
        int iMax = 0;
        for (int i6 = 0; i6 < size; i6++) {
            AbstractC1724 abstractC1724 = (AbstractC1724) list.get(i6);
            i5 += abstractC1724.f4996;
            iMax = Math.max(iMax, abstractC1724.f4998);
        }
        this.f2168 = i5;
        int i7 = i5 + this.f2157;
        this.f2169 = i7 >= 0 ? i7 : 0;
        this.f2163 = iMax;
        this.f2165 = new int[this.f2160.size() * 2];
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m1551(int i, int i2, int i3) {
        this.f2171 = i;
        this.f2164 = i3;
        List list = this.f2160;
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            AbstractC1724 abstractC1724 = (AbstractC1724) list.get(i4);
            int i5 = i4 * 2;
            C2116 c2116 = this.f2159;
            if (c2116 == null) {
                AbstractC7740.m13068("null horizontalAlignment when isVertical == true");
                C4210.m8612();
                return;
            }
            int iM3848 = c2116.m3848(abstractC1724.f4998, i2, this.f2158);
            int[] iArr = this.f2165;
            iArr[i5] = iM3848;
            iArr[i5 + 1] = i;
            i += abstractC1724.f4996;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m1552(AbstractC1708 abstractC1708) {
        if (this.f2164 == Integer.MIN_VALUE) {
            AbstractC7740.m13069("position() should be called first");
        }
        List list = this.f2160;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            AbstractC1724 abstractC1724 = (AbstractC1724) list.get(i);
            int i2 = abstractC1724.f4996;
            long jM1553 = m1553(i);
            AbstractC0053.m137(this.f2170.f2011.m756(this.f2167));
            long jM13334 = C7907.m13334(jM1553, this.f2156);
            InterfaceC6557 interfaceC6557 = AbstractC1725.f5000;
            abstractC1708.getClass();
            AbstractC1708.m3119(abstractC1708, abstractC1724);
            abstractC1724.mo3118(C7907.m13334(jM13334, abstractC1724.f4994), 0.0f, interfaceC6557);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final long m1553(int i) {
        if (i == 0 && this.f2160.size() == 0) {
            return ((long) this.f2171) & 4294967295L;
        }
        int i2 = i * 2;
        int[] iArr = this.f2165;
        int i3 = iArr[i2];
        return (((long) iArr[i2 + 1]) & 4294967295L) | (((long) i3) << 32);
    }
}
