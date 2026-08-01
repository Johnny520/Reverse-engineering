package androidx.compose.p001ui.spatial;

import androidx.activity.compose.C0849;
import androidx.collection.C1093;
import androidx.compose.foundation.lazy.layout.C1545;
import androidx.compose.p001ui.node.AbstractC2592;
import androidx.compose.p001ui.node.AbstractC2620;
import androidx.compose.p001ui.node.AbstractC2629;
import androidx.compose.p001ui.node.C2583;
import androidx.compose.p001ui.node.C2646;
import androidx.compose.p001ui.platform.ViewTreeObserverOnGlobalLayoutListenerC2719;
import p269.AbstractC9019;

/* JADX INFO: renamed from: androidx.compose.ui.spatial.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2802 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public long f6188;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public long f6189;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public C2802 f6190;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C0849 f6191;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C1545 f6192;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f6193;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final /* synthetic */ C2801 f6194;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public long f6195 = Long.MIN_VALUE;

    public C2802(C2801 c2801, int i, C1545 c1545, C0849 c0849) {
        this.f6194 = c2801;
        this.f6193 = i;
        this.f6192 = c1545;
        this.f6191 = c0849;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m4254() {
        C2801 c2801 = this.f6194;
        C1093 c1093 = c2801.f6186;
        int i = this.f6193;
        C2802 c2802 = (C2802) c1093.m1351(i);
        if (c2802 != null) {
            if (c2802 == this) {
                C2802 c28022 = this.f6190;
                this.f6190 = null;
                if (c28022 == null) {
                    C2583 c2583M3906 = AbstractC2620.m3906(this.f6192.f6637);
                    if (c2583M3906.f5467) {
                        ((ViewTreeObserverOnGlobalLayoutListenerC2719) AbstractC2592.m3866(c2583M3906)).getRectManager().f6168.m1133(c2583M3906.f5468, false);
                        return;
                    }
                    return;
                }
                int iM1348 = c1093.m1348(i);
                Object[] objArr = c1093.f1317;
                Object obj = objArr[iM1348];
                c1093.f1318[iM1348] = i;
                objArr[iM1348] = c28022;
                return;
            }
            int iM13482 = c1093.m1348(i);
            Object[] objArr2 = c1093.f1317;
            Object obj2 = objArr2[iM13482];
            c1093.f1318[iM13482] = i;
            objArr2[iM13482] = c2802;
            while (true) {
                C2802 c28023 = c2802.f6190;
                if (c28023 == null) {
                    break;
                }
                if (c28023 == this) {
                    c2802.f6190 = this.f6190;
                    this.f6190 = null;
                    return;
                }
                c2802 = c28023;
            }
        }
        C2802 c28024 = c2801.f6185;
        if (c28024 == this) {
            c2801.f6185 = c28024.f6190;
            this.f6190 = null;
            return;
        }
        C2802 c28025 = c28024 != null ? c28024.f6190 : null;
        while (true) {
            C2802 c28026 = c28024;
            c28024 = c28025;
            if (c28024 == null) {
                return;
            }
            if (c28024 == this) {
                if (c28026 != null) {
                    c28026.f6190 = c28024.f6190;
                }
                this.f6190 = null;
                return;
            }
            c28025 = c28024.f6190;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m4255(long j, long j2, long j3, long j4, float[] fArr) {
        C2795 c2795;
        C2795 c27952;
        long j5 = this.f6194.f6181;
        C1545 c1545 = this.f6192;
        AbstractC2629 abstractC2629M3908 = AbstractC2620.m3908(c1545, 2);
        C2583 c2583M3906 = AbstractC2620.m3906(c1545);
        boolean zM3802 = c2583M3906.m3802();
        C2646 c2646 = c2583M3906.f5439;
        if (zM3802) {
            if (c2646.f5630 != abstractC2629M3908) {
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits((int) (j & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits((int) (j >> 32)) << 32);
                long j6 = abstractC2629M3908.f5343;
                AbstractC2629 abstractC2629 = c2646.f5630;
                abstractC2629.getClass();
                long jM14240 = AbstractC9019.m14240(abstractC2629.mo3645(abstractC2629M3908, jFloatToRawIntBits));
                c2795 = new C2795(jM14240, (4294967295L & ((long) (((int) (jM14240 & 4294967295L)) + ((int) (j6 & 4294967295L))))) | (((long) (((int) (jM14240 >> 32)) + ((int) (j6 >> 32)))) << 32), j3, j4, j5, fArr, c1545);
            } else {
                c2795 = new C2795(j, j2, j3, j4, j5, fArr, c1545);
            }
            c27952 = c2795;
        } else {
            c27952 = null;
        }
        if (c27952 == null) {
            return;
        }
        this.f6191.invoke(c27952);
    }
}
