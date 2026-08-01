package androidx.compose.runtime.snapshots;

import androidx.collection.C1082;
import java.util.Arrays;
import java.util.HashMap;
import kotlin.jvm.internal.AbstractC5227;
import p068.InterfaceC7387;

/* JADX INFO: renamed from: androidx.compose.runtime.snapshots.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2105 extends C2106 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final C2106 f4036;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public boolean f4037;

    public C2105(long j, C2122 c2122, InterfaceC7387 interfaceC7387, InterfaceC7387 interfaceC73872, C2106 c2106) {
        super(j, c2122, interfaceC7387, interfaceC73872);
        this.f4036 = c2106;
        c2106.mo2771();
    }

    @Override // androidx.compose.runtime.snapshots.C2106, androidx.compose.runtime.snapshots.AbstractC2121
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo2765() {
        if (this.f4106) {
            return;
        }
        super.mo2765();
        if (this.f4037) {
            return;
        }
        this.f4037 = true;
        this.f4036.mo2772();
    }

    @Override // androidx.compose.runtime.snapshots.C2106
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final AbstractC2109 mo2780() {
        C2105 c2105;
        C2106 c2106 = this.f4036;
        if (c2106.f4041 || c2106.f4106) {
            return new C2120(this);
        }
        C1082 c1082 = this.f4042;
        long j = this.f4107;
        HashMap mapM2822 = c1082 != null ? AbstractC2115.m2822(c2106.mo2770(), this, this.f4036.mo2764()) : null;
        Object obj = AbstractC2115.f4090;
        synchronized (obj) {
            try {
                AbstractC2115.m2821(this);
                if (c1082 == null || c1082.f1343 == 0) {
                    c2105 = this;
                    c2105.m2845();
                } else {
                    c2105 = this;
                    AbstractC2109 abstractC2109M2787 = c2105.m2787(this.f4036.mo2770(), c1082, mapM2822, this.f4036.mo2764());
                    if (!abstractC2109M2787.equals(C2124.f4117)) {
                        return abstractC2109M2787;
                    }
                    C1082 c1082Mo2781 = c2105.f4036.mo2781();
                    if (c1082Mo2781 != null) {
                        c1082Mo2781.m1308(c1082);
                    } else {
                        c2105.f4036.mo2776(c1082);
                        c2105.f4042 = null;
                    }
                }
                if (AbstractC5227.m9463(c2105.f4036.mo2770(), j) < 0) {
                    c2105.f4036.m2789();
                }
                C2106 c21062 = c2105.f4036;
                c21062.mo2782(c21062.mo2764().m2850(j).m2851(c2105.f4047));
                c2105.f4036.m2786(j);
                C2106 c21063 = c2105.f4036;
                int i = c2105.f4105;
                c2105.f4105 = -1;
                if (i >= 0) {
                    int[] iArr = c21063.f4044;
                    iArr.getClass();
                    int length = iArr.length;
                    int[] iArrCopyOf = Arrays.copyOf(iArr, length + 1);
                    iArrCopyOf[length] = i;
                    c21063.f4044 = iArrCopyOf;
                } else {
                    c21063.getClass();
                }
                C2106 c21064 = c2105.f4036;
                C2122 c2122 = c2105.f4047;
                c21064.getClass();
                synchronized (obj) {
                    c21064.f4047 = c21064.f4047.m2848(c2122);
                    C2106 c21065 = c2105.f4036;
                    int[] iArr2 = c2105.f4044;
                    c21065.getClass();
                    if (iArr2.length != 0) {
                        int[] iArr3 = c21065.f4044;
                        if (iArr3.length != 0) {
                            int length2 = iArr3.length;
                            int length3 = iArr2.length;
                            int[] iArrCopyOf2 = Arrays.copyOf(iArr3, length2 + length3);
                            System.arraycopy(iArr2, 0, iArrCopyOf2, length2, length3);
                            iArr2 = iArrCopyOf2;
                        }
                        c21065.f4044 = iArr2;
                    }
                }
                c2105.f4041 = true;
                if (!c2105.f4037) {
                    c2105.f4037 = true;
                    c2105.f4036.mo2772();
                }
                return C2124.f4117;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
