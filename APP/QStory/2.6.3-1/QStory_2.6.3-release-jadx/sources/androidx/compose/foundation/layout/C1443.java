package androidx.compose.foundation.layout;

import androidx.collection.C1124;
import androidx.compose.p001ui.layout.AbstractC2559;
import androidx.compose.p001ui.layout.InterfaceC2490;
import io.ktor.util.C5043;
import p221.C8727;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1443 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int f2033;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f2034;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final long f2035;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C1431 f2036;

    public C1443(C1431 c1431, long j, int i, int i2) {
        this.f2036 = c1431;
        this.f2035 = j;
        this.f2034 = i;
        this.f2033 = i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0055, code lost:
    
        if ((((int) (r22 >> 32)) - ((int) (r5 >> 32))) < 0) goto L22;
     */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C1444 m1934(boolean z, int i, long j, C1124 c1124, int i2, int i3, int i4, boolean z2, boolean z3) {
        long j2;
        int i5 = i3 + i4;
        if (c1124 == null) {
            return new C1444(true, true);
        }
        long j3 = c1124.f1329;
        C1431 c1431 = this.f2036;
        if (c1431.f2002 != FlowLayoutOverflow$OverflowType.Visible && (i2 >= Integer.MAX_VALUE || ((int) (j & 4294967295L)) - ((int) (j3 & 4294967295L)) < 0)) {
            return new C1444(true, true);
        }
        int i6 = this.f2034;
        int i7 = this.f2033;
        long j4 = this.f2035;
        if (i != 0) {
            if (i >= Integer.MAX_VALUE) {
                j2 = 4294967295L;
            } else {
                j2 = 4294967295L;
            }
            return z2 ? new C1444(true, true) : new C1444(true, m1934(z, 0, C1124.m1414(C8727.m13896(j4), (((int) (j & j2)) - i7) - i4), new C1124(C1124.m1414(((int) (j3 >> 32)) - i6, (int) (j3 & j2))), i2 + 1, i5, 0, true, false).f2037);
        }
        j2 = 4294967295L;
        int i8 = (int) (j3 & j2);
        int iMax = Math.max(i4, i8) + i3;
        C1124 c1124M1929 = z3 ? null : c1431.m1929(i2, iMax, z);
        if (c1124M1929 == null || (i + 1 < Integer.MAX_VALUE && ((((int) (j >> 32)) - ((int) (j3 >> 32))) - i6) - ((int) (c1124M1929.f1329 >> 32)) >= 0)) {
            return new C1444(false, false);
        }
        if (z3) {
            return new C1444(true, true);
        }
        boolean z4 = m1934(false, 0, C1124.m1414(C8727.m13896(j4), (((int) (j & j2)) - i7) - Math.max(i4, i8)), c1124M1929, i2 + 1, iMax, 0, true, true).f2037;
        return new C1444(z4, z4);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004a  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C1445 m1935(C1444 c1444, boolean z, int i, int i2, int i3, int i4) {
        C1445 c1445;
        InterfaceC2490 interfaceC2490;
        C1124 c1124;
        AbstractC2559 abstractC2559;
        if (c1444.f2037) {
            C1431 c1431 = this.f2036;
            int i5 = AbstractC1430.f1996[c1431.f2002.ordinal()];
            boolean z2 = true;
            if (i5 == 1 || i5 == 2) {
                c1445 = null;
                if (c1445 != null) {
                    if (i < 0 || (i4 != 0 && (i3 - ((int) (c1445.f2040 >> 32)) < 0 || i4 >= Integer.MAX_VALUE))) {
                        z2 = false;
                    }
                    c1445.f2039 = z2;
                    return c1445;
                }
            } else {
                if (i5 != 3 && i5 != 4) {
                    C5043.m9170();
                    return null;
                }
                if (z) {
                    interfaceC2490 = c1431.f2001;
                    c1124 = c1431.f1997;
                    abstractC2559 = c1431.f2000;
                } else {
                    interfaceC2490 = (i < -1 || i2 < 0) ? null : c1431.f1999;
                    c1124 = c1431.f2003;
                    abstractC2559 = c1431.f1998;
                }
                if (interfaceC2490 != null) {
                    c1124.getClass();
                    c1445 = new C1445(interfaceC2490, abstractC2559, c1124.f1329);
                }
                if (c1445 != null) {
                }
            }
        }
        return null;
    }
}
