package p119;

import androidx.compose.foundation.draganddrop.AbstractC0455;
import androidx.compose.foundation.text.AbstractC0983;
import androidx.compose.ui.text.AbstractC2048;
import androidx.compose.ui.text.C2031;
import androidx.compose.ui.text.C2054;
import androidx.compose.ui.text.InterfaceC2063;
import androidx.compose.ui.text.font.InterfaceC1996;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.collections.EmptyList;
import p193.C7820;
import p205.AbstractC7896;
import p205.C7897;
import p205.InterfaceC7895;
import p316.C8675;

/* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7370 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public int f19938;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public boolean f19939;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public int f19940;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public InterfaceC1996 f19941;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public C2031 f19942;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public String f19943;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public long f19944;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public InterfaceC2063 f19945;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public C7373 f19946;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public LayoutDirection f19949;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public int f19952;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public boolean f19953;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public InterfaceC7895 f19955;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public C2054 f19956;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public long f19951 = AbstractC7374.f19985;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public long f19954 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public long f19950 = AbstractC7896.m13298(0, 0, 0, 0);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f19947 = -1;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f19948 = -1;

    public C7370(String str, C2031 c2031, InterfaceC1996 interfaceC1996, int i, boolean z, int i2, int i3) {
        this.f19943 = str;
        this.f19942 = c2031;
        this.f19941 = interfaceC1996;
        this.f19940 = i;
        this.f19939 = z;
        this.f19938 = i2;
        this.f19952 = i3;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static long m12517(C7370 c7370, long j, LayoutDirection layoutDirection) {
        C2031 c2031 = c7370.f19942;
        C7373 c7373 = c7370.f19946;
        InterfaceC7895 interfaceC7895 = c7370.f19955;
        interfaceC7895.getClass();
        C7373 c7373M14365 = C8675.m14365(c7373, layoutDirection, c2031, interfaceC7895, c7370.f19941);
        c7370.f19946 = c7373M14365;
        return c7373M14365.m12530(c7370.f19952, j);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphLayoutCache(paragraph=");
        sb.append(this.f19956 != null ? "<paragraph>" : "null");
        sb.append(", lastDensity=");
        sb.append((Object) AbstractC7374.m12531(this.f19951));
        sb.append(", history=");
        sb.append(this.f19944);
        sb.append(", constraints=$)");
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m12518(String str, C2031 c2031, InterfaceC1996 interfaceC1996, int i, boolean z, int i2, int i3) {
        this.f19943 = str;
        this.f19942 = c2031;
        this.f19941 = interfaceC1996;
        this.f19940 = i;
        this.f19939 = z;
        this.f19938 = i2;
        this.f19952 = i3;
        this.f19944 = (this.f19944 << 2) | 2;
        m12521();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final InterfaceC2063 m12519(LayoutDirection layoutDirection) {
        InterfaceC2063 c7820 = this.f19945;
        if (c7820 == null || layoutDirection != this.f19949 || c7820.mo2145()) {
            this.f19949 = layoutDirection;
            String str = this.f19943;
            C2031 c2031M3762 = AbstractC2048.m3762(this.f19942, layoutDirection);
            EmptyList emptyList = EmptyList.INSTANCE;
            InterfaceC7895 interfaceC7895 = this.f19955;
            interfaceC7895.getClass();
            c7820 = new C7820(str, c2031M3762, emptyList, emptyList, this.f19941, interfaceC7895);
        }
        this.f19945 = c7820;
        return c7820;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m12520(InterfaceC7895 interfaceC7895) {
        long jM12532;
        InterfaceC7895 interfaceC78952 = this.f19955;
        if (interfaceC7895 != null) {
            int i = AbstractC7374.f19984;
            jM12532 = AbstractC7374.m12532(interfaceC7895.mo1246(), interfaceC7895.mo1247());
        } else {
            jM12532 = AbstractC7374.f19985;
        }
        if (interfaceC78952 == null) {
            this.f19955 = interfaceC7895;
            this.f19951 = jM12532;
        } else if (interfaceC7895 == null || this.f19951 != jM12532) {
            this.f19955 = interfaceC7895;
            this.f19951 = jM12532;
            this.f19944 = (this.f19944 << 2) | 1;
            m12521();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m12521() {
        this.f19956 = null;
        this.f19945 = null;
        this.f19949 = null;
        this.f19947 = -1;
        this.f19948 = -1;
        this.f19950 = AbstractC7896.m13298(0, 0, 0, 0);
        this.f19954 = 0L;
        this.f19953 = false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean m12522(long j, LayoutDirection layoutDirection) {
        InterfaceC2063 interfaceC2063;
        this.f19944 = (this.f19944 << 2) | 3;
        boolean z = true;
        long jM12517 = this.f19952 > 1 ? m12517(this, j, layoutDirection) : j;
        C2054 c2054 = this.f19956;
        boolean z2 = false;
        if (c2054 != null && (interfaceC2063 = this.f19945) != null && !interfaceC2063.mo2145() && layoutDirection == this.f19949 && (C7897.m13307(jM12517, this.f19950) || (C7897.m13309(jM12517) == C7897.m13309(this.f19950) && C7897.m13313(jM12517) == C7897.m13313(this.f19950) && C7897.m13310(jM12517) >= c2054.m3770() && !c2054.f6085.f22006))) {
            if (!C7897.m13307(jM12517, this.f19950)) {
                C2054 c20542 = this.f19956;
                c20542.getClass();
                this.f19954 = AbstractC7896.m13294(jM12517, (((long) AbstractC0983.m1902(Math.min(c20542.f6088.f21357.m13398(), c20542.m3768()))) << 32) | (((long) AbstractC0983.m1902(c20542.m3770())) & 4294967295L));
                if (this.f19940 == 3 || (((int) (r12 >> 32)) >= c20542.m3768() && ((int) (4294967295L & r12)) >= c20542.m3770())) {
                    z = false;
                }
                this.f19953 = z;
                this.f19950 = jM12517;
            }
            return false;
        }
        InterfaceC2063 interfaceC2063M12519 = m12519(layoutDirection);
        long jM1165 = AbstractC0455.m1165(jM12517, this.f19939, this.f19940, interfaceC2063M12519.mo2143());
        boolean z3 = this.f19939;
        int i = this.f19940;
        int i2 = this.f19938;
        C2054 c20543 = new C2054((C7820) interfaceC2063M12519, ((z3 || !(i == 2 || i == 4 || i == 5)) && i2 >= 1) ? i2 : 1, i, jM1165);
        this.f19950 = jM12517;
        this.f19954 = AbstractC7896.m13294(jM12517, (((long) AbstractC0983.m1902(c20543.m3770())) & 4294967295L) | (((long) AbstractC0983.m1902(c20543.m3768())) << 32));
        if (this.f19940 != 3 && (((int) (r1 >> 32)) < c20543.m3768() || ((int) (r1 & 4294967295L)) < c20543.m3770())) {
            z2 = true;
        }
        this.f19953 = z2;
        this.f19956 = c20543;
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int m12523(int i, LayoutDirection layoutDirection) {
        int i2 = this.f19947;
        int i3 = this.f19948;
        if (i == i2 && i2 != -1) {
            return i3;
        }
        long jM13297 = AbstractC7896.m13297(0, i, 0, Integer.MAX_VALUE);
        if (this.f19952 > 1) {
            jM13297 = m12517(this, jM13297, layoutDirection);
        }
        InterfaceC2063 interfaceC2063M12519 = m12519(layoutDirection);
        long jM1165 = AbstractC0455.m1165(jM13297, this.f19939, this.f19940, interfaceC2063M12519.mo2143());
        boolean z = this.f19939;
        int i4 = this.f19940;
        int i5 = this.f19938;
        int iM1902 = AbstractC0983.m1902(new C2054((C7820) interfaceC2063M12519, ((z || !(i4 == 2 || i4 == 4 || i4 == 5)) && i5 >= 1) ? i5 : 1, i4, jM1165).m3770());
        int iM13312 = C7897.m13312(jM13297);
        if (iM1902 < iM13312) {
            iM1902 = iM13312;
        }
        this.f19947 = i;
        this.f19948 = iM1902;
        return iM1902;
    }
}
