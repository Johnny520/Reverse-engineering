package androidx.compose.animation.core;

import androidx.compose.runtime.AbstractC1347;
import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.C1324;
import androidx.compose.runtime.C1353;
import androidx.compose.runtime.C1369;
import androidx.compose.runtime.C1389;
import androidx.compose.runtime.InterfaceC1373;
import androidx.compose.runtime.InterfaceC1395;
import androidx.compose.runtime.collection.C1224;
import kotlin.C5175;
import p052.InterfaceC6553;

/* JADX INFO: renamed from: androidx.compose.animation.core.飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0315 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C1224 f1060 = new C1224(0, new C0316[16]);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC1395 f1059 = AbstractC1367.m2465(Boolean.FALSE);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public long f1058 = Long.MIN_VALUE;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final InterfaceC1395 f1057 = AbstractC1367.m2465(Boolean.TRUE);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m938(InterfaceC1373 interfaceC1373, final int i) {
        C1324 c1324 = (C1324) interfaceC1373;
        c1324.m2381(-318043801);
        int i2 = (c1324.m2368(this) ? 4 : 2) | i;
        if (c1324.m2333(i2 & 1, (i2 & 3) != 2)) {
            Object objM2335 = c1324.m2335();
            C1353 c1353 = C1369.f3973;
            if (objM2335 == c1353) {
                objM2335 = AbstractC1367.m2465(null);
                c1324.m2376(objM2335);
            }
            InterfaceC1395 interfaceC1395 = (InterfaceC1395) objM2335;
            if (((Boolean) ((AbstractC1347) this.f1057).getValue()).booleanValue() || ((Boolean) ((AbstractC1347) this.f1059).getValue()).booleanValue()) {
                c1324.m2382(-144841960);
                boolean zM2368 = c1324.m2368(this);
                Object objM23352 = c1324.m2335();
                if (zM2368 || objM23352 == c1353) {
                    objM23352 = new InfiniteTransition$run$1$1(interfaceC1395, this, null);
                    c1324.m2376(objM23352);
                }
                AbstractC1367.m2490(c1324, this, (InterfaceC6553) objM23352);
                c1324.m2367(false);
            } else {
                c1324.m2382(-143455237);
                c1324.m2367(false);
            }
        } else {
            c1324.m2329();
        }
        C1389 c1389M2365 = c1324.m2365();
        if (c1389M2365 != null) {
            c1389M2365.f4033 = new InterfaceC6553(i) { // from class: androidx.compose.animation.core.飘花落叶言子世苏楪哲兰
                @Override // p052.InterfaceC6553
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM2460 = AbstractC1367.m2460(1);
                    this.f1069.m938((InterfaceC1373) obj, iM2460);
                    return C5175.f14739;
                }
            };
        }
    }
}
