package androidx.compose.p001ui.text;

import p221.C8728;
import p221.C8730;
import p225.C8755;
import p225.C8757;
import p225.C8762;

/* JADX INFO: renamed from: androidx.compose.ui.text.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2890 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final /* synthetic */ int f6437 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final long f6438;

    static {
        C8730[] c8730Arr = C8728.f22212;
        f6438 = C8728.f22211;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C2898 m4343(C2898 c2898, int i, int i2, long j, C8757 c8757, C2889 c2889, C8762 c8762, int i3, int i4, C8755 c8755) {
        long j2;
        int i5 = i;
        int i6 = i2;
        long j3 = j;
        C8757 c87572 = c8757;
        C2889 c28892 = c2889;
        C8762 c87622 = c8762;
        int i7 = i3;
        int i8 = i4;
        C8755 c87552 = c8755;
        if (i5 == 0 || i5 == c2898.f6458) {
            C8730[] c8730Arr = C8728.f22212;
            if ((j3 & 1095216660480L) == 0) {
                j2 = 0;
            } else {
                j2 = 0;
                if (C8728.m13904(j3, c2898.f6456)) {
                }
            }
            if ((c87572 == null || c87572.equals(c2898.f6455)) && ((i6 == 0 || i6 == c2898.f6457) && ((c28892 == null || c28892.equals(c2898.f6454)) && ((c87622 == null || c87622.equals(c2898.f6453)) && ((i7 == 0 || i7 == c2898.f6460) && ((i8 == 0 || i8 == c2898.f6459) && (c87552 == null || c87552.equals(c2898.f6461)))))))) {
                return c2898;
            }
        } else {
            j2 = 0;
        }
        C8730[] c8730Arr2 = C8728.f22212;
        if ((j3 & 1095216660480L) == j2) {
            j3 = c2898.f6456;
        }
        if (c87572 == null) {
            c87572 = c2898.f6455;
        }
        if (i5 == 0) {
            i5 = c2898.f6458;
        }
        if (i6 == 0) {
            i6 = c2898.f6457;
        }
        C2889 c28893 = c2898.f6454;
        if (c28893 != null && c28892 == null) {
            c28892 = c28893;
        }
        if (c87622 == null) {
            c87622 = c2898.f6453;
        }
        if (i7 == 0) {
            i7 = c2898.f6460;
        }
        if (i8 == 0) {
            i8 = c2898.f6459;
        }
        if (c87552 == null) {
            c87552 = c2898.f6461;
        }
        return new C2898(i5, i6, j3, c87572, c28892, c87622, i7, i8, c87552);
    }
}
