package androidx.compose.ui.text;

import p205.C7898;
import p205.C7900;
import p209.C7925;
import p209.C7927;
import p209.C7932;

/* JADX INFO: renamed from: androidx.compose.ui.text.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2056 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final /* synthetic */ int f6091 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final long f6092;

    static {
        C7900[] c7900Arr = C7898.f21870;
        f6092 = C7898.f21869;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C2064 m3773(C2064 c2064, int i, int i2, long j, C7927 c7927, C2055 c2055, C7932 c7932, int i3, int i4, C7925 c7925) {
        long j2;
        int i5 = i;
        int i6 = i2;
        long j3 = j;
        C7927 c79272 = c7927;
        C2055 c20552 = c2055;
        C7932 c79322 = c7932;
        int i7 = i3;
        int i8 = i4;
        C7925 c79252 = c7925;
        if (i5 == 0 || i5 == c2064.f6112) {
            C7900[] c7900Arr = C7898.f21870;
            if ((j3 & 1095216660480L) == 0) {
                j2 = 0;
            } else {
                j2 = 0;
                if (C7898.m13317(j3, c2064.f6110)) {
                }
            }
            if ((c79272 == null || c79272.equals(c2064.f6109)) && ((i6 == 0 || i6 == c2064.f6111) && ((c20552 == null || c20552.equals(c2064.f6108)) && ((c79322 == null || c79322.equals(c2064.f6107)) && ((i7 == 0 || i7 == c2064.f6114) && ((i8 == 0 || i8 == c2064.f6113) && (c79252 == null || c79252.equals(c2064.f6115)))))))) {
                return c2064;
            }
        } else {
            j2 = 0;
        }
        C7900[] c7900Arr2 = C7898.f21870;
        if ((j3 & 1095216660480L) == j2) {
            j3 = c2064.f6110;
        }
        if (c79272 == null) {
            c79272 = c2064.f6109;
        }
        if (i5 == 0) {
            i5 = c2064.f6112;
        }
        if (i6 == 0) {
            i6 = c2064.f6111;
        }
        C2055 c20553 = c2064.f6108;
        if (c20553 != null && c20552 == null) {
            c20552 = c20553;
        }
        if (c79322 == null) {
            c79322 = c2064.f6107;
        }
        if (i7 == 0) {
            i7 = c2064.f6114;
        }
        if (i8 == 0) {
            i8 = c2064.f6113;
        }
        if (c79252 == null) {
            c79252 = c2064.f6115;
        }
        return new C2064(i5, i6, j3, c79272, c20552, c79322, i7, i8, c79252);
    }
}
