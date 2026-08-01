package androidx.compose.ui.text;

import p205.C7899;
import p205.C7901;
import p209.C7926;
import p209.C7928;
import p209.C7933;

/* JADX INFO: renamed from: androidx.compose.ui.text.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2056 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final /* synthetic */ int f6092 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final long f6093;

    static {
        C7901[] c7901Arr = C7899.f21867;
        f6093 = C7899.f21866;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C2064 m3783(C2064 c2064, int i, int i2, long j, C7928 c7928, C2055 c2055, C7933 c7933, int i3, int i4, C7926 c7926) {
        long j2;
        int i5 = i;
        int i6 = i2;
        long j3 = j;
        C7928 c79282 = c7928;
        C2055 c20552 = c2055;
        C7933 c79332 = c7933;
        int i7 = i3;
        int i8 = i4;
        C7926 c79262 = c7926;
        if (i5 == 0 || i5 == c2064.f6113) {
            C7901[] c7901Arr = C7899.f21867;
            if ((j3 & 1095216660480L) == 0) {
                j2 = 0;
            } else {
                j2 = 0;
                if (C7899.m13345(j3, c2064.f6111)) {
                }
            }
            if ((c79282 == null || c79282.equals(c2064.f6110)) && ((i6 == 0 || i6 == c2064.f6112) && ((c20552 == null || c20552.equals(c2064.f6109)) && ((c79332 == null || c79332.equals(c2064.f6108)) && ((i7 == 0 || i7 == c2064.f6115) && ((i8 == 0 || i8 == c2064.f6114) && (c79262 == null || c79262.equals(c2064.f6116)))))))) {
                return c2064;
            }
        } else {
            j2 = 0;
        }
        C7901[] c7901Arr2 = C7899.f21867;
        if ((j3 & 1095216660480L) == j2) {
            j3 = c2064.f6111;
        }
        if (c79282 == null) {
            c79282 = c2064.f6110;
        }
        if (i5 == 0) {
            i5 = c2064.f6113;
        }
        if (i6 == 0) {
            i6 = c2064.f6112;
        }
        C2055 c20553 = c2064.f6109;
        if (c20553 != null && c20552 == null) {
            c20552 = c20553;
        }
        if (c79332 == null) {
            c79332 = c2064.f6108;
        }
        if (i7 == 0) {
            i7 = c2064.f6115;
        }
        if (i8 == 0) {
            i8 = c2064.f6114;
        }
        if (c79262 == null) {
            c79262 = c2064.f6116;
        }
        return new C2064(i5, i6, j3, c79282, c20552, c79332, i7, i8, c79262);
    }
}
