package p135;

import androidx.compose.foundation.text.AbstractC1821;
import androidx.compose.p001ui.text.AbstractC2882;
import androidx.compose.p001ui.text.C2865;
import androidx.compose.p001ui.text.C2888;
import androidx.compose.p001ui.text.InterfaceC2897;
import androidx.compose.p001ui.text.font.InterfaceC2830;
import androidx.compose.p001ui.unit.LayoutDirection;
import com.bumptech.glide.AbstractC3887;
import com.bumptech.glide.AbstractC3898;
import kotlin.collections.EmptyList;
import p209.C8650;
import p221.AbstractC8726;
import p221.C8727;
import p221.InterfaceC8725;

/* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8200 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public int f20278;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public boolean f20279;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public int f20280;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public InterfaceC2830 f20281;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public C2865 f20282;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public String f20283;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public long f20284;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public InterfaceC2897 f20285;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public C8203 f20286;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public LayoutDirection f20289;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public int f20292;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public boolean f20293;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public InterfaceC8725 f20295;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public C2888 f20296;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public long f20291 = AbstractC8204.f20325;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public long f20294 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public long f20290 = AbstractC8726.m13885(0, 0, 0, 0);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f20287 = -1;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f20288 = -1;

    public C8200(String str, C2865 c2865, InterfaceC2830 interfaceC2830, int i, boolean z, int i2, int i3) {
        this.f20283 = str;
        this.f20282 = c2865;
        this.f20281 = interfaceC2830;
        this.f20280 = i;
        this.f20279 = z;
        this.f20278 = i2;
        this.f20292 = i3;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static long m13103(C8200 c8200, long j, LayoutDirection layoutDirection) {
        C2865 c2865 = c8200.f20282;
        C8203 c8203 = c8200.f20286;
        InterfaceC8725 interfaceC8725 = c8200.f20295;
        interfaceC8725.getClass();
        C8203 c8203M7422 = AbstractC3898.m7422(c8203, layoutDirection, c2865, interfaceC8725, c8200.f20281);
        c8200.f20286 = c8203M7422;
        return c8203M7422.m13116(c8200.f20292, j);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphLayoutCache(paragraph=");
        sb.append(this.f20296 != null ? "<paragraph>" : "null");
        sb.append(", lastDensity=");
        sb.append((Object) AbstractC8204.m13117(this.f20291));
        sb.append(", history=");
        sb.append(this.f20284);
        sb.append(", constraints=$)");
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m13104(String str, C2865 c2865, InterfaceC2830 interfaceC2830, int i, boolean z, int i2, int i3) {
        this.f20283 = str;
        this.f20282 = c2865;
        this.f20281 = interfaceC2830;
        this.f20280 = i;
        this.f20279 = z;
        this.f20278 = i2;
        this.f20292 = i3;
        this.f20284 = (this.f20284 << 2) | 2;
        m13107();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final InterfaceC2897 m13105(LayoutDirection layoutDirection) {
        InterfaceC2897 c8650 = this.f20285;
        if (c8650 == null || layoutDirection != this.f20289 || c8650.mo2715()) {
            this.f20289 = layoutDirection;
            String str = this.f20283;
            C2865 c2865M4332 = AbstractC2882.m4332(this.f20282, layoutDirection);
            EmptyList emptyList = EmptyList.INSTANCE;
            InterfaceC8725 interfaceC8725 = this.f20295;
            interfaceC8725.getClass();
            c8650 = new C8650(str, c2865M4332, emptyList, emptyList, this.f20281, interfaceC8725);
        }
        this.f20285 = c8650;
        return c8650;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m13106(InterfaceC8725 interfaceC8725) {
        long jM13118;
        InterfaceC8725 interfaceC87252 = this.f20295;
        if (interfaceC8725 != null) {
            int i = AbstractC8204.f20324;
            jM13118 = AbstractC8204.m13118(interfaceC8725.mo1816(), interfaceC8725.mo1817());
        } else {
            jM13118 = AbstractC8204.f20325;
        }
        if (interfaceC87252 == null) {
            this.f20295 = interfaceC8725;
            this.f20291 = jM13118;
        } else if (interfaceC8725 == null || this.f20291 != jM13118) {
            this.f20295 = interfaceC8725;
            this.f20291 = jM13118;
            this.f20284 = (this.f20284 << 2) | 1;
            m13107();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m13107() {
        this.f20296 = null;
        this.f20285 = null;
        this.f20289 = null;
        this.f20287 = -1;
        this.f20288 = -1;
        this.f20290 = AbstractC8726.m13885(0, 0, 0, 0);
        this.f20294 = 0L;
        this.f20293 = false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean m13108(long j, LayoutDirection layoutDirection) {
        InterfaceC2897 interfaceC2897;
        this.f20284 = (this.f20284 << 2) | 3;
        boolean z = true;
        long jM13103 = this.f20292 > 1 ? m13103(this, j, layoutDirection) : j;
        C2888 c2888 = this.f20296;
        boolean z2 = false;
        if (c2888 != null && (interfaceC2897 = this.f20285) != null && !interfaceC2897.mo2715() && layoutDirection == this.f20289 && (C8727.m13894(jM13103, this.f20290) || (C8727.m13896(jM13103) == C8727.m13896(this.f20290) && C8727.m13900(jM13103) == C8727.m13900(this.f20290) && C8727.m13897(jM13103) >= c2888.m4340() && !c2888.f6431.f22348))) {
            if (!C8727.m13894(jM13103, this.f20290)) {
                C2888 c28882 = this.f20296;
                c28882.getClass();
                this.f20294 = AbstractC8726.m13881(jM13103, (((long) AbstractC1821.m2472(Math.min(c28882.f6434.f21699.m13985(), c28882.m4338()))) << 32) | (((long) AbstractC1821.m2472(c28882.m4340())) & 4294967295L));
                if (this.f20280 == 3 || (((int) (r12 >> 32)) >= c28882.m4338() && ((int) (4294967295L & r12)) >= c28882.m4340())) {
                    z = false;
                }
                this.f20293 = z;
                this.f20290 = jM13103;
            }
            return false;
        }
        InterfaceC2897 interfaceC2897M13105 = m13105(layoutDirection);
        long jM7217 = AbstractC3887.m7217(jM13103, this.f20279, this.f20280, interfaceC2897M13105.mo2713());
        boolean z3 = this.f20279;
        int i = this.f20280;
        int i2 = this.f20278;
        C2888 c28883 = new C2888((C8650) interfaceC2897M13105, ((z3 || !(i == 2 || i == 4 || i == 5)) && i2 >= 1) ? i2 : 1, i, jM7217);
        this.f20290 = jM13103;
        this.f20294 = AbstractC8726.m13881(jM13103, (((long) AbstractC1821.m2472(c28883.m4340())) & 4294967295L) | (((long) AbstractC1821.m2472(c28883.m4338())) << 32));
        if (this.f20280 != 3 && (((int) (r1 >> 32)) < c28883.m4338() || ((int) (r1 & 4294967295L)) < c28883.m4340())) {
            z2 = true;
        }
        this.f20293 = z2;
        this.f20296 = c28883;
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int m13109(int i, LayoutDirection layoutDirection) {
        int i2 = this.f20287;
        int i3 = this.f20288;
        if (i == i2 && i2 != -1) {
            return i3;
        }
        long jM13884 = AbstractC8726.m13884(0, i, 0, Integer.MAX_VALUE);
        if (this.f20292 > 1) {
            jM13884 = m13103(this, jM13884, layoutDirection);
        }
        InterfaceC2897 interfaceC2897M13105 = m13105(layoutDirection);
        long jM7217 = AbstractC3887.m7217(jM13884, this.f20279, this.f20280, interfaceC2897M13105.mo2713());
        boolean z = this.f20279;
        int i4 = this.f20280;
        int i5 = this.f20278;
        int iM2472 = AbstractC1821.m2472(new C2888((C8650) interfaceC2897M13105, ((z || !(i4 == 2 || i4 == 4 || i4 == 5)) && i5 >= 1) ? i5 : 1, i4, jM7217).m4340());
        int iM13899 = C8727.m13899(jM13884);
        if (iM2472 < iM13899) {
            iM2472 = iM13899;
        }
        this.f20287 = i;
        this.f20288 = iM2472;
        return iM2472;
    }
}
