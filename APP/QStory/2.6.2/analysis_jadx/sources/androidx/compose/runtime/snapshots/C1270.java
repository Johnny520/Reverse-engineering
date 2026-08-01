package androidx.compose.runtime.snapshots;

import androidx.collection.C0235;
import java.util.Arrays;
import java.util.HashMap;
import kotlin.jvm.internal.AbstractC4394;
import p052.InterfaceC6557;

/* JADX INFO: renamed from: androidx.compose.runtime.snapshots.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1270 extends C1271 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final C1271 f3690;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public boolean f3691;

    public C1270(long j, C1287 c1287, InterfaceC6557 interfaceC6557, InterfaceC6557 interfaceC65572, C1271 c1271) {
        super(j, c1287, interfaceC6557, interfaceC65572);
        this.f3690 = c1271;
        c1271.mo2201();
    }

    @Override // androidx.compose.runtime.snapshots.C1271, androidx.compose.runtime.snapshots.AbstractC1286
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo2195() {
        if (this.f3760) {
            return;
        }
        super.mo2195();
        if (this.f3691) {
            return;
        }
        this.f3691 = true;
        this.f3690.mo2202();
    }

    @Override // androidx.compose.runtime.snapshots.C1271
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final AbstractC1274 mo2210() {
        C1270 c1270;
        C1271 c1271 = this.f3690;
        if (c1271.f3695 || c1271.f3760) {
            return new C1285(this);
        }
        C0235 c0235 = this.f3696;
        long j = this.f3761;
        HashMap mapM2252 = c0235 != null ? AbstractC1280.m2252(c1271.mo2200(), this, this.f3690.mo2194()) : null;
        Object obj = AbstractC1280.f3744;
        synchronized (obj) {
            try {
                AbstractC1280.m2251(this);
                if (c0235 == null || c0235.f998 == 0) {
                    c1270 = this;
                    c1270.m2275();
                } else {
                    c1270 = this;
                    AbstractC1274 abstractC1274M2217 = c1270.m2217(this.f3690.mo2200(), c0235, mapM2252, this.f3690.mo2194());
                    if (!abstractC1274M2217.equals(C1289.f3771)) {
                        return abstractC1274M2217;
                    }
                    C0235 c0235Mo2211 = c1270.f3690.mo2211();
                    if (c0235Mo2211 != null) {
                        c0235Mo2211.m747(c0235);
                    } else {
                        c1270.f3690.mo2206(c0235);
                        c1270.f3696 = null;
                    }
                }
                if (AbstractC4394.m8914(c1270.f3690.mo2200(), j) < 0) {
                    c1270.f3690.m2219();
                }
                C1271 c12712 = c1270.f3690;
                c12712.mo2212(c12712.mo2194().m2280(j).m2281(c1270.f3701));
                c1270.f3690.m2216(j);
                C1271 c12713 = c1270.f3690;
                int i = c1270.f3759;
                c1270.f3759 = -1;
                if (i >= 0) {
                    int[] iArr = c12713.f3698;
                    iArr.getClass();
                    int length = iArr.length;
                    int[] iArrCopyOf = Arrays.copyOf(iArr, length + 1);
                    iArrCopyOf[length] = i;
                    c12713.f3698 = iArrCopyOf;
                } else {
                    c12713.getClass();
                }
                C1271 c12714 = c1270.f3690;
                C1287 c1287 = c1270.f3701;
                c12714.getClass();
                synchronized (obj) {
                    c12714.f3701 = c12714.f3701.m2278(c1287);
                    C1271 c12715 = c1270.f3690;
                    int[] iArr2 = c1270.f3698;
                    c12715.getClass();
                    if (iArr2.length != 0) {
                        int[] iArr3 = c12715.f3698;
                        if (iArr3.length != 0) {
                            int length2 = iArr3.length;
                            int length3 = iArr2.length;
                            int[] iArrCopyOf2 = Arrays.copyOf(iArr3, length2 + length3);
                            System.arraycopy(iArr2, 0, iArrCopyOf2, length2, length3);
                            iArr2 = iArrCopyOf2;
                        }
                        c12715.f3698 = iArr2;
                    }
                }
                c1270.f3695 = true;
                if (!c1270.f3691) {
                    c1270.f3691 = true;
                    c1270.f3690.mo2202();
                }
                return C1289.f3771;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
