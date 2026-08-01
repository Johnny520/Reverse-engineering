package p119;

import androidx.compose.foundation.text.AbstractC0983;
import androidx.compose.ui.text.AbstractC2048;
import androidx.compose.ui.text.C2031;
import androidx.compose.ui.text.C2054;
import androidx.compose.ui.text.InterfaceC2063;
import androidx.compose.ui.text.font.InterfaceC1996;
import androidx.compose.ui.unit.LayoutDirection;
import com.bumptech.glide.AbstractC3055;
import com.bumptech.glide.AbstractC3066;
import kotlin.collections.EmptyList;
import p193.C7821;
import p205.AbstractC7897;
import p205.C7898;
import p205.InterfaceC7896;

/* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7371 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public int f19933;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public boolean f19934;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public int f19935;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public InterfaceC1996 f19936;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public C2031 f19937;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public String f19938;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public long f19939;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public InterfaceC2063 f19940;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public C7374 f19941;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public LayoutDirection f19944;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public int f19947;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public boolean f19948;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public InterfaceC7896 f19950;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public C2054 f19951;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public long f19946 = AbstractC7375.f19980;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public long f19949 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public long f19945 = AbstractC7897.m13326(0, 0, 0, 0);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f19942 = -1;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f19943 = -1;

    public C7371(String str, C2031 c2031, InterfaceC1996 interfaceC1996, int i, boolean z, int i2, int i3) {
        this.f19938 = str;
        this.f19937 = c2031;
        this.f19936 = interfaceC1996;
        this.f19935 = i;
        this.f19934 = z;
        this.f19933 = i2;
        this.f19947 = i3;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static long m12544(C7371 c7371, long j, LayoutDirection layoutDirection) {
        C2031 c2031 = c7371.f19937;
        C7374 c7374 = c7371.f19941;
        InterfaceC7896 interfaceC7896 = c7371.f19950;
        interfaceC7896.getClass();
        C7374 c7374M6862 = AbstractC3066.m6862(c7374, layoutDirection, c2031, interfaceC7896, c7371.f19936);
        c7371.f19941 = c7374M6862;
        return c7374M6862.m12557(c7371.f19947, j);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphLayoutCache(paragraph=");
        sb.append(this.f19951 != null ? "<paragraph>" : "null");
        sb.append(", lastDensity=");
        sb.append((Object) AbstractC7375.m12558(this.f19946));
        sb.append(", history=");
        sb.append(this.f19939);
        sb.append(", constraints=$)");
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m12545(String str, C2031 c2031, InterfaceC1996 interfaceC1996, int i, boolean z, int i2, int i3) {
        this.f19938 = str;
        this.f19937 = c2031;
        this.f19936 = interfaceC1996;
        this.f19935 = i;
        this.f19934 = z;
        this.f19933 = i2;
        this.f19947 = i3;
        this.f19939 = (this.f19939 << 2) | 2;
        m12548();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final InterfaceC2063 m12546(LayoutDirection layoutDirection) {
        InterfaceC2063 c7821 = this.f19940;
        if (c7821 == null || layoutDirection != this.f19944 || c7821.mo2155()) {
            this.f19944 = layoutDirection;
            String str = this.f19938;
            C2031 c2031M3772 = AbstractC2048.m3772(this.f19937, layoutDirection);
            EmptyList emptyList = EmptyList.INSTANCE;
            InterfaceC7896 interfaceC7896 = this.f19950;
            interfaceC7896.getClass();
            c7821 = new C7821(str, c2031M3772, emptyList, emptyList, this.f19936, interfaceC7896);
        }
        this.f19940 = c7821;
        return c7821;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m12547(InterfaceC7896 interfaceC7896) {
        long jM12559;
        InterfaceC7896 interfaceC78962 = this.f19950;
        if (interfaceC7896 != null) {
            int i = AbstractC7375.f19979;
            jM12559 = AbstractC7375.m12559(interfaceC7896.mo1256(), interfaceC7896.mo1257());
        } else {
            jM12559 = AbstractC7375.f19980;
        }
        if (interfaceC78962 == null) {
            this.f19950 = interfaceC7896;
            this.f19946 = jM12559;
        } else if (interfaceC7896 == null || this.f19946 != jM12559) {
            this.f19950 = interfaceC7896;
            this.f19946 = jM12559;
            this.f19939 = (this.f19939 << 2) | 1;
            m12548();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m12548() {
        this.f19951 = null;
        this.f19940 = null;
        this.f19944 = null;
        this.f19942 = -1;
        this.f19943 = -1;
        this.f19945 = AbstractC7897.m13326(0, 0, 0, 0);
        this.f19949 = 0L;
        this.f19948 = false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean m12549(long j, LayoutDirection layoutDirection) {
        InterfaceC2063 interfaceC2063;
        this.f19939 = (this.f19939 << 2) | 3;
        boolean z = true;
        long jM12544 = this.f19947 > 1 ? m12544(this, j, layoutDirection) : j;
        C2054 c2054 = this.f19951;
        boolean z2 = false;
        if (c2054 != null && (interfaceC2063 = this.f19940) != null && !interfaceC2063.mo2155() && layoutDirection == this.f19944 && (C7898.m13335(jM12544, this.f19945) || (C7898.m13337(jM12544) == C7898.m13337(this.f19945) && C7898.m13341(jM12544) == C7898.m13341(this.f19945) && C7898.m13338(jM12544) >= c2054.m3780() && !c2054.f6086.f22003))) {
            if (!C7898.m13335(jM12544, this.f19945)) {
                C2054 c20542 = this.f19951;
                c20542.getClass();
                this.f19949 = AbstractC7897.m13322(jM12544, (((long) AbstractC0983.m1912(Math.min(c20542.f6089.f21354.m13426(), c20542.m3778()))) << 32) | (((long) AbstractC0983.m1912(c20542.m3780())) & 4294967295L));
                if (this.f19935 == 3 || (((int) (r12 >> 32)) >= c20542.m3778() && ((int) (4294967295L & r12)) >= c20542.m3780())) {
                    z = false;
                }
                this.f19948 = z;
                this.f19945 = jM12544;
            }
            return false;
        }
        InterfaceC2063 interfaceC2063M12546 = m12546(layoutDirection);
        long jM6657 = AbstractC3055.m6657(jM12544, this.f19934, this.f19935, interfaceC2063M12546.mo2153());
        boolean z3 = this.f19934;
        int i = this.f19935;
        int i2 = this.f19933;
        C2054 c20543 = new C2054((C7821) interfaceC2063M12546, ((z3 || !(i == 2 || i == 4 || i == 5)) && i2 >= 1) ? i2 : 1, i, jM6657);
        this.f19945 = jM12544;
        this.f19949 = AbstractC7897.m13322(jM12544, (((long) AbstractC0983.m1912(c20543.m3780())) & 4294967295L) | (((long) AbstractC0983.m1912(c20543.m3778())) << 32));
        if (this.f19935 != 3 && (((int) (r1 >> 32)) < c20543.m3778() || ((int) (r1 & 4294967295L)) < c20543.m3780())) {
            z2 = true;
        }
        this.f19948 = z2;
        this.f19951 = c20543;
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int m12550(int i, LayoutDirection layoutDirection) {
        int i2 = this.f19942;
        int i3 = this.f19943;
        if (i == i2 && i2 != -1) {
            return i3;
        }
        long jM13325 = AbstractC7897.m13325(0, i, 0, Integer.MAX_VALUE);
        if (this.f19947 > 1) {
            jM13325 = m12544(this, jM13325, layoutDirection);
        }
        InterfaceC2063 interfaceC2063M12546 = m12546(layoutDirection);
        long jM6657 = AbstractC3055.m6657(jM13325, this.f19934, this.f19935, interfaceC2063M12546.mo2153());
        boolean z = this.f19934;
        int i4 = this.f19935;
        int i5 = this.f19933;
        int iM1912 = AbstractC0983.m1912(new C2054((C7821) interfaceC2063M12546, ((z || !(i4 == 2 || i4 == 4 || i4 == 5)) && i5 >= 1) ? i5 : 1, i4, jM6657).m3780());
        int iM13340 = C7898.m13340(jM13325);
        if (iM1912 < iM13340) {
            iM1912 = iM13340;
        }
        this.f19942 = i;
        this.f19943 = iM1912;
        return iM1912;
    }
}
