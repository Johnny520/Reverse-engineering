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
import kotlin.C5176;
import p052.InterfaceC6554;

/* JADX INFO: renamed from: androidx.compose.animation.core.飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0315 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C1224 f1060 = new C1224(0, new C0316[16]);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC1395 f1059 = AbstractC1367.m2474(Boolean.FALSE);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public long f1058 = Long.MIN_VALUE;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final InterfaceC1395 f1057 = AbstractC1367.m2474(Boolean.TRUE);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m939(InterfaceC1373 interfaceC1373, final int i) {
        C1324 c1324 = (C1324) interfaceC1373;
        c1324.m2391(-318043801);
        int i2 = (c1324.m2378(this) ? 4 : 2) | i;
        if (c1324.m2343(i2 & 1, (i2 & 3) != 2)) {
            Object objM2345 = c1324.m2345();
            C1353 c1353 = C1369.f3974;
            if (objM2345 == c1353) {
                objM2345 = AbstractC1367.m2474(null);
                c1324.m2386(objM2345);
            }
            InterfaceC1395 interfaceC1395 = (InterfaceC1395) objM2345;
            if (((Boolean) ((AbstractC1347) this.f1057).getValue()).booleanValue() || ((Boolean) ((AbstractC1347) this.f1059).getValue()).booleanValue()) {
                c1324.m2392(-144841960);
                boolean zM2378 = c1324.m2378(this);
                Object objM23452 = c1324.m2345();
                if (zM2378 || objM23452 == c1353) {
                    objM23452 = new InfiniteTransition$run$1$1(interfaceC1395, this, null);
                    c1324.m2386(objM23452);
                }
                AbstractC1367.m2500(c1324, this, (InterfaceC6554) objM23452);
                c1324.m2377(false);
            } else {
                c1324.m2392(-143455237);
                c1324.m2377(false);
            }
        } else {
            c1324.m2339();
        }
        C1389 c1389M2375 = c1324.m2375();
        if (c1389M2375 != null) {
            c1389M2375.f4034 = new InterfaceC6554(i) { // from class: androidx.compose.animation.core.飘花落叶言子世苏楪哲兰
                @Override // p052.InterfaceC6554
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM2471 = AbstractC1367.m2471(1);
                    this.f1069.m939((InterfaceC1373) obj, iM2471);
                    return C5176.f14739;
                }
            };
        }
    }
}
