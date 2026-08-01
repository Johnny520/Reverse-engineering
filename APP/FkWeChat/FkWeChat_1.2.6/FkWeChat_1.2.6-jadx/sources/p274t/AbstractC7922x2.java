package p274t;

import java.util.List;
import p049d9.AbstractC1927c;
import p135j2.AbstractC3545l1;
import p135j2.InterfaceC3552n0;
import p135j2.InterfaceC3558p0;
import p135j2.InterfaceC3561q0;
import p288u.AbstractC8476a;

/* JADX INFO: renamed from: t.x2 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7922x2 {
    /* JADX INFO: renamed from: a */
    public static final InterfaceC3558p0 m30575a(InterfaceC7917w2 interfaceC7917w2, int i10, int i11, int i12, int i13, int i14, InterfaceC3561q0 interfaceC3561q0, List list, AbstractC3545l1[] abstractC3545l1Arr, int i15, int i16, int[] iArr, int i17) {
        int i18;
        char c10;
        char c11;
        int i19;
        int iMax;
        int iMax2;
        InterfaceC7917w2 interfaceC7917w22;
        int i20;
        long j10;
        int i21;
        int i22 = i13;
        long j11 = i14;
        int i23 = i16 - i15;
        int[] iArr2 = new int[i23];
        int i24 = 0;
        int i25 = i15;
        int i26 = 0;
        int i27 = 0;
        int i28 = 0;
        int i29 = 0;
        int i30 = 0;
        float f10 = 0.0f;
        while (true) {
            int i31 = 1;
            if (i25 >= i16) {
                break;
            }
            InterfaceC3552n0 interfaceC3552n0 = (InterfaceC3552n0) list.get(i25);
            C7927y2 c7927y2M30547c = AbstractC7912v2.m30547c(interfaceC3552n0);
            float fM30549e = AbstractC7912v2.m30549e(c7927y2M30547c);
            if (i28 == 0 && !AbstractC7912v2.m30550f(c7927y2M30547c)) {
                i31 = i24;
            }
            if (fM30549e > 0.0f) {
                f10 += fM30549e;
                i29++;
                i20 = i25;
                j10 = j11;
            } else {
                if (i22 != Integer.MAX_VALUE && c7927y2M30547c != null) {
                    c7927y2M30547c.m30614c();
                }
                int i32 = i12 - i30;
                AbstractC3545l1 abstractC3545l1Mo13148X = abstractC3545l1Arr[i25];
                if (abstractC3545l1Mo13148X == null) {
                    int i33 = i12 != Integer.MAX_VALUE ? i32 < 0 ? i24 : i32 : Integer.MAX_VALUE;
                    i20 = i25;
                    interfaceC7917w22 = interfaceC7917w2;
                    j10 = j11;
                    i21 = i27;
                    abstractC3545l1Mo13148X = interfaceC3552n0.mo13148X(InterfaceC7917w2.m30565n(interfaceC7917w22, 0, 0, i33, i22, false, 16, null));
                } else {
                    interfaceC7917w22 = interfaceC7917w2;
                    i20 = i25;
                    j10 = j11;
                    i21 = i27;
                }
                int iMo30244j = interfaceC7917w22.mo30244j(abstractC3545l1Mo13148X);
                int iMo30240a = interfaceC7917w22.mo30240a(abstractC3545l1Mo13148X);
                iArr2[i20 - i15] = iMo30244j;
                int i34 = i32 - iMo30244j;
                if (i34 < 0) {
                    i34 = 0;
                }
                int iMin = Math.min(i14, i34);
                i30 += iMo30244j + iMin;
                int iMax3 = Math.max(i21, iMo30240a);
                abstractC3545l1Arr[i20] = abstractC3545l1Mo13148X;
                i27 = iMax3;
                i26 = iMin;
            }
            i25 = i20 + 1;
            i28 = i31;
            j11 = j10;
            i24 = 0;
        }
        InterfaceC7917w2 interfaceC7917w23 = interfaceC7917w2;
        long j12 = j11;
        int i35 = i27;
        if (i29 == 0) {
            i30 -= i26;
            i18 = 0;
        } else {
            long j13 = j12 * ((long) (i29 - 1));
            long jRound = ((long) ((i12 != Integer.MAX_VALUE ? i12 : i10) - i30)) - j13;
            if (jRound < 0) {
                jRound = 0;
            }
            float f11 = jRound / f10;
            for (int i36 = i15; i36 < i16; i36++) {
                jRound -= (long) Math.round(AbstractC7912v2.m30549e(AbstractC7912v2.m30547c((InterfaceC3552n0) list.get(i36))) * f11);
            }
            int i37 = i15;
            int i38 = 0;
            while (i37 < i16) {
                if (abstractC3545l1Arr[i37] == null) {
                    InterfaceC3552n0 interfaceC3552n02 = (InterfaceC3552n0) list.get(i37);
                    C7927y2 c7927y2M30547c2 = AbstractC7912v2.m30547c(interfaceC3552n02);
                    float fM30549e2 = AbstractC7912v2.m30549e(c7927y2M30547c2);
                    if (i22 != Integer.MAX_VALUE && c7927y2M30547c2 != null) {
                        c7927y2M30547c2.m30614c();
                    }
                    if (!(fM30549e2 > 0.0f)) {
                        AbstractC8476a.m32538b("All weights <= 0 should have placeables");
                    }
                    int iM6978b = AbstractC1927c.m6978b(jRound);
                    long j14 = jRound - ((long) iM6978b);
                    int iMax4 = Math.max(0, Math.round(fM30549e2 * f11) + iM6978b);
                    if (AbstractC7912v2.m30546b(c7927y2M30547c2)) {
                        c10 = 65535;
                        if (iMax4 != Integer.MAX_VALUE) {
                            c11 = 65535;
                            i19 = iMax4;
                        }
                        interfaceC7917w23 = interfaceC7917w2;
                        AbstractC3545l1 abstractC3545l1Mo13148X2 = interfaceC3552n02.mo13148X(interfaceC7917w23.mo30241f(i19, 0, iMax4, i22, true));
                        int iMo30244j2 = interfaceC7917w23.mo30244j(abstractC3545l1Mo13148X2);
                        int iMo30240a2 = interfaceC7917w23.mo30240a(abstractC3545l1Mo13148X2);
                        iArr2[i37 - i15] = iMo30244j2;
                        i38 += iMo30244j2;
                        int iMax5 = Math.max(i35, iMo30240a2);
                        abstractC3545l1Arr[i37] = abstractC3545l1Mo13148X2;
                        i35 = iMax5;
                        jRound = j14;
                    } else {
                        c10 = 65535;
                    }
                    c11 = c10;
                    i19 = 0;
                    interfaceC7917w23 = interfaceC7917w2;
                    AbstractC3545l1 abstractC3545l1Mo13148X22 = interfaceC3552n02.mo13148X(interfaceC7917w23.mo30241f(i19, 0, iMax4, i22, true));
                    int iMo30244j22 = interfaceC7917w23.mo30244j(abstractC3545l1Mo13148X22);
                    int iMo30240a22 = interfaceC7917w23.mo30240a(abstractC3545l1Mo13148X22);
                    iArr2[i37 - i15] = iMo30244j22;
                    i38 += iMo30244j22;
                    int iMax52 = Math.max(i35, iMo30240a22);
                    abstractC3545l1Arr[i37] = abstractC3545l1Mo13148X22;
                    i35 = iMax52;
                    jRound = j14;
                }
                i37++;
                i22 = i13;
            }
            i18 = (int) (((long) i38) + j13);
            int i39 = i12 - i30;
            if (i18 < 0) {
                i18 = 0;
            }
            if (i18 > i39) {
                i18 = i39;
            }
        }
        int i40 = i35;
        if (i28 != 0) {
            iMax = 0;
            iMax2 = 0;
            for (int i41 = i15; i41 < i16; i41++) {
                AbstractC3545l1 abstractC3545l1 = abstractC3545l1Arr[i41];
                abstractC3545l1.getClass();
                AbstractC7835g0 abstractC7835g0M30545a = AbstractC7912v2.m30545a(AbstractC7912v2.m30548d(abstractC3545l1));
                Integer numM30362b = abstractC7835g0M30545a != null ? abstractC7835g0M30545a.m30362b(abstractC3545l1) : null;
                if (numM30362b != null) {
                    int iIntValue = numM30362b.intValue();
                    int iMo30240a3 = interfaceC7917w23.mo30240a(abstractC3545l1);
                    iMax = Math.max(iMax, iIntValue != Integer.MIN_VALUE ? numM30362b.intValue() : 0);
                    if (iIntValue == Integer.MIN_VALUE) {
                        iIntValue = iMo30240a3;
                    }
                    iMax2 = Math.max(iMax2, iMo30240a3 - iIntValue);
                }
            }
        } else {
            iMax = 0;
            iMax2 = 0;
        }
        int i42 = i30 + i18;
        if (i42 < 0) {
            i42 = 0;
        }
        int iMax6 = Math.max(i42, i10);
        int iMax7 = Math.max(i40, Math.max(i11, iMax2 + iMax));
        int[] iArr3 = new int[i23];
        interfaceC7917w23.mo30243i(iMax6, iArr2, iArr3, interfaceC3561q0);
        return interfaceC7917w23.mo30242g(abstractC3545l1Arr, interfaceC3561q0, iMax, iArr3, iMax6, iMax7, iArr, i17, i15, i16);
    }
}
