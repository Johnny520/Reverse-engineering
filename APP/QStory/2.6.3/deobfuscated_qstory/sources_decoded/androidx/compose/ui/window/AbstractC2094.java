package androidx.compose.ui.window;

import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.C1324;
import androidx.compose.runtime.C1369;
import androidx.compose.runtime.C1389;
import androidx.compose.runtime.InterfaceC1373;
import androidx.compose.runtime.internal.C1253;
import androidx.compose.ui.AbstractC2120;
import androidx.compose.ui.C2125;
import androidx.compose.ui.InterfaceC2129;
import androidx.compose.ui.layout.InterfaceC1658;
import androidx.compose.ui.node.C1765;
import androidx.compose.ui.node.InterfaceC1784;
import kotlin.C5176;
import p052.InterfaceC6543;
import p052.InterfaceC6554;

/* JADX INFO: renamed from: androidx.compose.ui.window.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2094 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final void m3836(final InterfaceC2129 interfaceC2129, final InterfaceC6554 interfaceC6554, InterfaceC1373 interfaceC1373, final int i, final int i2) {
        int i3;
        C1324 c1324 = (C1324) interfaceC1373;
        c1324.m2391(1090521195);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (c1324.m2360(interfaceC2129) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= c1324.m2378(interfaceC6554) ? 32 : 16;
        }
        if (c1324.m2343(i3 & 1, (i3 & 19) != 18)) {
            if (i4 != 0) {
                interfaceC2129 = C2125.f6276;
            }
            Object objM2345 = c1324.m2345();
            if (objM2345 == C1369.f3974) {
                objM2345 = C2095.f6202;
                c1324.m2386(objM2345);
            }
            InterfaceC1658 interfaceC1658 = (InterfaceC1658) objM2345;
            int iHashCode = Long.hashCode(c1324.f3837);
            C1253 c1253M2381 = c1324.m2381();
            InterfaceC2129 interfaceC2129M3861 = AbstractC2120.m3861(c1324, interfaceC2129);
            InterfaceC1784.f5222.getClass();
            InterfaceC6543 interfaceC6543 = C1765.f5185;
            int i5 = (((((i3 << 3) & 112) | (((i3 >> 3) & 14) | 384)) << 6) & 896) | 6;
            c1324.m2396();
            if (c1324.f3838) {
                c1324.m2380(interfaceC6543);
            } else {
                c1324.m2390();
            }
            AbstractC1367.m2472(c1324, interfaceC1658, C1765.f5181);
            AbstractC1367.m2472(c1324, c1253M2381, C1765.f5182);
            AbstractC1367.m2472(c1324, Integer.valueOf(iHashCode), C1765.f5188);
            AbstractC1367.m2481(c1324, C1765.f5187);
            AbstractC1367.m2472(c1324, interfaceC2129M3861, C1765.f5183);
            interfaceC6554.invoke(c1324, Integer.valueOf((i5 >> 6) & 14));
            c1324.m2377(true);
        } else {
            c1324.m2339();
        }
        C1389 c1389M2375 = c1324.m2375();
        if (c1389M2375 != null) {
            c1389M2375.f4034 = new InterfaceC6554() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt$DialogLayout$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void invoke(InterfaceC1373 interfaceC13732, int i6) {
                    AbstractC2094.m3836(interfaceC2129, interfaceC6554, interfaceC13732, AbstractC1367.m2471(i | 1), i2);
                }

                @Override // p052.InterfaceC6554
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((InterfaceC1373) obj, ((Number) obj2).intValue());
                    return C5176.f14739;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m3837(final p052.InterfaceC6543 r16, androidx.compose.ui.window.C2107 r17, final p052.InterfaceC6554 r18, androidx.compose.runtime.InterfaceC1373 r19, final int r20, final int r21) {
        /*
            Method dump skipped, instruction units count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.window.AbstractC2094.m3837(飘花落叶言世子哲楪兰苏.飘花落叶言子楪世苏哲兰, androidx.compose.ui.window.飘花落叶言子楪哲苏世兰, 飘花落叶言世子哲楪兰苏.飘花落叶言子楪哲苏兰世, androidx.compose.runtime.飘花落叶言子楪苏哲世兰, int, int):void");
    }
}
