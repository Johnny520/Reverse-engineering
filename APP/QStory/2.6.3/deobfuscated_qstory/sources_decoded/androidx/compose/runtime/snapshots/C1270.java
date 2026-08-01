package androidx.compose.runtime.snapshots;

import androidx.collection.C0235;
import java.util.Arrays;
import java.util.HashMap;
import kotlin.jvm.internal.AbstractC4395;
import p052.InterfaceC6558;

/* JADX INFO: renamed from: androidx.compose.runtime.snapshots.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1270 extends C1271 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final C1271 f3691;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public boolean f3692;

    public C1270(long j, C1287 c1287, InterfaceC6558 interfaceC6558, InterfaceC6558 interfaceC65582, C1271 c1271) {
        super(j, c1287, interfaceC6558, interfaceC65582);
        this.f3691 = c1271;
        c1271.mo2211();
    }

    @Override // androidx.compose.runtime.snapshots.C1271, androidx.compose.runtime.snapshots.AbstractC1286
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo2205() {
        if (this.f3761) {
            return;
        }
        super.mo2205();
        if (this.f3692) {
            return;
        }
        this.f3692 = true;
        this.f3691.mo2212();
    }

    @Override // androidx.compose.runtime.snapshots.C1271
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final AbstractC1274 mo2220() {
        C1270 c1270;
        C1271 c1271 = this.f3691;
        if (c1271.f3696 || c1271.f3761) {
            return new C1285(this);
        }
        C0235 c0235 = this.f3697;
        long j = this.f3762;
        HashMap mapM2262 = c0235 != null ? AbstractC1280.m2262(c1271.mo2210(), this, this.f3691.mo2204()) : null;
        Object obj = AbstractC1280.f3745;
        synchronized (obj) {
            try {
                AbstractC1280.m2261(this);
                if (c0235 == null || c0235.f998 == 0) {
                    c1270 = this;
                    c1270.m2285();
                } else {
                    c1270 = this;
                    AbstractC1274 abstractC1274M2227 = c1270.m2227(this.f3691.mo2210(), c0235, mapM2262, this.f3691.mo2204());
                    if (!abstractC1274M2227.equals(C1289.f3772)) {
                        return abstractC1274M2227;
                    }
                    C0235 c0235Mo2221 = c1270.f3691.mo2221();
                    if (c0235Mo2221 != null) {
                        c0235Mo2221.m748(c0235);
                    } else {
                        c1270.f3691.mo2216(c0235);
                        c1270.f3697 = null;
                    }
                }
                if (AbstractC4395.m8904(c1270.f3691.mo2210(), j) < 0) {
                    c1270.f3691.m2229();
                }
                C1271 c12712 = c1270.f3691;
                c12712.mo2222(c12712.mo2204().m2290(j).m2291(c1270.f3702));
                c1270.f3691.m2226(j);
                C1271 c12713 = c1270.f3691;
                int i = c1270.f3760;
                c1270.f3760 = -1;
                if (i >= 0) {
                    int[] iArr = c12713.f3699;
                    iArr.getClass();
                    int length = iArr.length;
                    int[] iArrCopyOf = Arrays.copyOf(iArr, length + 1);
                    iArrCopyOf[length] = i;
                    c12713.f3699 = iArrCopyOf;
                } else {
                    c12713.getClass();
                }
                C1271 c12714 = c1270.f3691;
                C1287 c1287 = c1270.f3702;
                c12714.getClass();
                synchronized (obj) {
                    c12714.f3702 = c12714.f3702.m2288(c1287);
                    C1271 c12715 = c1270.f3691;
                    int[] iArr2 = c1270.f3699;
                    c12715.getClass();
                    if (iArr2.length != 0) {
                        int[] iArr3 = c12715.f3699;
                        if (iArr3.length != 0) {
                            int length2 = iArr3.length;
                            int length3 = iArr2.length;
                            int[] iArrCopyOf2 = Arrays.copyOf(iArr3, length2 + length3);
                            System.arraycopy(iArr2, 0, iArrCopyOf2, length2, length3);
                            iArr2 = iArrCopyOf2;
                        }
                        c12715.f3699 = iArr2;
                    }
                }
                c1270.f3696 = true;
                if (!c1270.f3692) {
                    c1270.f3692 = true;
                    c1270.f3691.mo2212();
                }
                return C1289.f3772;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
