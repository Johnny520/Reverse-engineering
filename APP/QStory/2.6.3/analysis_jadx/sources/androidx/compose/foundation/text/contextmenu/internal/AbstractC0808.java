package androidx.compose.foundation.text.contextmenu.internal;

import android.view.View;
import androidx.appcompat.widget.C0194;
import androidx.compose.animation.core.C0366;
import androidx.compose.foundation.layout.AbstractC0643;
import androidx.compose.foundation.text.contextmenu.provider.AbstractC0833;
import androidx.compose.foundation.text.contextmenu.provider.C0830;
import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.C1324;
import androidx.compose.runtime.C1353;
import androidx.compose.runtime.C1369;
import androidx.compose.runtime.C1389;
import androidx.compose.runtime.InterfaceC1373;
import androidx.compose.runtime.InterfaceC1395;
import androidx.compose.runtime.internal.AbstractC1254;
import androidx.compose.runtime.internal.C1242;
import androidx.compose.runtime.internal.C1253;
import androidx.compose.ui.AbstractC2120;
import androidx.compose.ui.C2119;
import androidx.compose.ui.InterfaceC2129;
import androidx.compose.ui.layout.AbstractC1670;
import androidx.compose.ui.layout.InterfaceC1658;
import androidx.compose.ui.node.C1765;
import androidx.compose.ui.node.InterfaceC1784;
import androidx.compose.ui.platform.AbstractC1835;
import androidx.compose.ui.window.C2090;
import com.bumptech.glide.AbstractC3056;
import kotlin.C5176;
import p052.InterfaceC6543;
import p052.InterfaceC6554;
import p052.InterfaceC6558;

/* JADX INFO: renamed from: androidx.compose.foundation.text.contextmenu.internal.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0808 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C1242 f2307 = new C1242(636288403, false, new C0807(0));

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C1242 f2306 = new C1242(-1357803046, false, new C0807(1));

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C0814 m1631(InterfaceC6543 interfaceC6543, InterfaceC1373 interfaceC1373, int i) {
        C1324 c1324 = (C1324) interfaceC1373;
        View view = (View) c1324.m2383(AbstractC1835.f5332);
        boolean zM2360 = c1324.m2360(view);
        Object objM2345 = c1324.m2345();
        C1353 c1353 = C1369.f3974;
        if (zM2360 || objM2345 == c1353) {
            objM2345 = new C0814(view, null, interfaceC6543);
            c1324.m2386(objM2345);
        }
        C0814 c0814 = (C0814) objM2345;
        boolean zM2378 = c1324.m2378(c0814);
        Object objM23452 = c1324.m2345();
        if (zM2378 || objM23452 == c1353) {
            objM23452 = new C0796(c0814, 3);
            c1324.m2386(objM23452);
        }
        AbstractC1367.m2484(c0814, (InterfaceC6558) objM23452, c1324);
        return c0814;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final void m1632(final InterfaceC2129 interfaceC2129, final C1242 c1242, InterfaceC1373 interfaceC1373, int i) {
        int i2;
        C1324 c1324 = (C1324) interfaceC1373;
        c1324.m2391(771959668);
        if ((i & 6) == 0) {
            i2 = (c1324.m2360(interfaceC2129) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c1324.m2378(null) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c1324.m2378(c1242) ? 256 : 128;
        }
        int i3 = 1;
        if (c1324.m2343(i2 & 1, (i2 & 147) != 146)) {
            Object objM2345 = c1324.m2345();
            C1353 c1353 = C1369.f3974;
            if (objM2345 == c1353) {
                objM2345 = AbstractC1367.m2475(null, C1353.f3920);
                c1324.m2386(objM2345);
            }
            final InterfaceC1395 interfaceC1395 = (InterfaceC1395) objM2345;
            Object objM23452 = c1324.m2345();
            if (objM23452 == c1353) {
                objM23452 = new C0812(interfaceC1395, 0);
                c1324.m2386(objM23452);
            }
            AbstractC1367.m2487(AbstractC0833.f2368.mo2428(m1631((InterfaceC6543) objM23452, c1324, 0)), AbstractC1254.m2189(-291176396, new InterfaceC6554() { // from class: androidx.compose.foundation.text.contextmenu.internal.飘花落叶言子楪哲世苏兰
                @Override // p052.InterfaceC6554
                public final Object invoke(Object obj, Object obj2) {
                    InterfaceC1373 interfaceC13732 = (InterfaceC1373) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    C1324 c13242 = (C1324) interfaceC13732;
                    if (c13242.m2343(iIntValue & 1, (iIntValue & 3) != 2)) {
                        Object objM23453 = c13242.m2345();
                        if (objM23453 == C1369.f3974) {
                            objM23453 = new C0803(interfaceC1395, 0);
                            c13242.m2386(objM23453);
                        }
                        InterfaceC2129 interfaceC2129M3105 = AbstractC1670.m3105(interfaceC2129, (InterfaceC6558) objM23453);
                        InterfaceC1658 interfaceC1658M1451 = AbstractC0643.m1451(C2119.f6272, true);
                        int iHashCode = Long.hashCode(c13242.f3837);
                        C1253 c1253M2381 = c13242.m2381();
                        InterfaceC2129 interfaceC2129M3861 = AbstractC2120.m3861(c13242, interfaceC2129M3105);
                        InterfaceC1784.f5222.getClass();
                        InterfaceC6543 interfaceC6543 = C1765.f5185;
                        c13242.m2396();
                        if (c13242.f3838) {
                            c13242.m2380(interfaceC6543);
                        } else {
                            c13242.m2390();
                        }
                        AbstractC1367.m2472(c13242, interfaceC1658M1451, C1765.f5181);
                        AbstractC1367.m2472(c13242, c1253M2381, C1765.f5182);
                        AbstractC1367.m2472(c13242, Integer.valueOf(iHashCode), C1765.f5188);
                        AbstractC1367.m2481(c13242, C1765.f5187);
                        AbstractC1367.m2472(c13242, interfaceC2129M3861, C1765.f5183);
                        c1242.invoke(c13242, 0);
                        c13242.m2377(true);
                    } else {
                        c13242.m2339();
                    }
                    return C5176.f14739;
                }
            }, c1324), c1324, 56);
        } else {
            c1324.m2339();
        }
        C1389 c1389M2375 = c1324.m2375();
        if (c1389M2375 != null) {
            c1389M2375.f4034 = new C0811(interfaceC2129, c1242, i, i3);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final void m1633(InterfaceC2129 interfaceC2129, C1242 c1242, InterfaceC1373 interfaceC1373, int i) {
        int i2;
        C1324 c1324 = (C1324) interfaceC1373;
        c1324.m2391(2064964257);
        if ((i & 6) == 0) {
            i2 = (c1324.m2360(interfaceC2129) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c1324.m2378(c1242) ? 32 : 16;
        }
        int i3 = 0;
        if (c1324.m2343(i2 & 1, (i2 & 19) != 18)) {
            m1632(interfaceC2129, c1242, c1324, ((i2 << 3) & 896) | (i2 & 14) | 48);
        } else {
            c1324.m2339();
        }
        C1389 c1389M2375 = c1324.m2375();
        if (c1389M2375 != null) {
            c1389M2375.f4034 = new C0811(interfaceC2129, c1242, i, i3);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final void m1634(InterfaceC2129 interfaceC2129, C1242 c1242, InterfaceC1373 interfaceC1373, int i) {
        int i2;
        C1324 c1324 = (C1324) interfaceC1373;
        c1324.m2391(155925518);
        if ((i & 6) == 0) {
            i2 = (c1324.m2360(interfaceC2129) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c1324.m2378(c1242) ? 32 : 16;
        }
        int i3 = 3;
        if (c1324.m2343(i2 & 1, (i2 & 19) != 18)) {
            boolean z = c1324.m2383(AbstractC0833.f2369) != null;
            boolean z2 = c1324.m2383(AbstractC0833.f2368) != null;
            if (z && z2) {
                c1324.m2392(-1977187922);
                InterfaceC1658 interfaceC1658M1451 = AbstractC0643.m1451(C2119.f6272, true);
                int iHashCode = Long.hashCode(c1324.f3837);
                C1253 c1253M2381 = c1324.m2381();
                InterfaceC2129 interfaceC2129M3861 = AbstractC2120.m3861(c1324, interfaceC2129);
                InterfaceC1784.f5222.getClass();
                InterfaceC6543 interfaceC6543 = C1765.f5185;
                c1324.m2396();
                if (c1324.f3838) {
                    c1324.m2380(interfaceC6543);
                } else {
                    c1324.m2390();
                }
                AbstractC1367.m2472(c1324, interfaceC1658M1451, C1765.f5181);
                AbstractC1367.m2472(c1324, c1253M2381, C1765.f5182);
                AbstractC1367.m2472(c1324, Integer.valueOf(iHashCode), C1765.f5188);
                AbstractC1367.m2481(c1324, C1765.f5187);
                AbstractC1367.m2472(c1324, interfaceC2129M3861, C1765.f5183);
                c1242.invoke(c1324, Integer.valueOf((i2 >> 3) & 14));
                c1324.m2377(true);
                c1324.m2377(false);
            } else if (z) {
                c1324.m2392(-1976997706);
                m1633(interfaceC2129, c1242, c1324, i2 & 126);
                c1324.m2377(false);
            } else if (z2) {
                c1324.m2392(-1976846922);
                AbstractC0802.m1627(interfaceC2129, c1242, c1324, i2 & 126);
                c1324.m2377(false);
            } else {
                c1324.m2392(-1976716505);
                m1635(interfaceC2129, c1242, c1324, i2 & 126);
                c1324.m2377(false);
            }
        } else {
            c1324.m2339();
        }
        C1389 c1389M2375 = c1324.m2375();
        if (c1389M2375 != null) {
            c1389M2375.f4034 = new C0811(interfaceC2129, c1242, i, i3);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final void m1635(InterfaceC2129 interfaceC2129, C1242 c1242, InterfaceC1373 interfaceC1373, int i) {
        int i2;
        C1324 c1324 = (C1324) interfaceC1373;
        c1324.m2391(790527681);
        int i3 = 4;
        if ((i & 6) == 0) {
            i2 = (c1324.m2360(interfaceC2129) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c1324.m2378(c1242) ? 32 : 16;
        }
        if (c1324.m2343(i2 & 1, (i2 & 19) != 18)) {
            Object objM2345 = c1324.m2345();
            C1353 c1353 = C1369.f3974;
            if (objM2345 == c1353) {
                objM2345 = AbstractC1367.m2475(null, C1353.f3920);
                c1324.m2386(objM2345);
            }
            InterfaceC1395 interfaceC1395 = (InterfaceC1395) objM2345;
            Object objM23452 = c1324.m2345();
            if (objM23452 == c1353) {
                objM23452 = new C0812(interfaceC1395, 1);
                c1324.m2386(objM23452);
            }
            InterfaceC6543 interfaceC6543 = (InterfaceC6543) objM23452;
            C2090 c2090 = AbstractC0802.f2292;
            C0830 c0830M6703 = AbstractC3056.m6703(f2306, c1324, 6);
            AbstractC1367.m2486(new C0194[]{AbstractC0833.f2368.mo2428(m1631(interfaceC6543, c1324, 2)), AbstractC0833.f2369.mo2428(c0830M6703)}, AbstractC1254.m2189(1070596993, new C0366(interfaceC2129, interfaceC1395, c1242, c0830M6703, interfaceC6543, 1), c1324), c1324, 56);
        } else {
            c1324.m2339();
        }
        C1389 c1389M2375 = c1324.m2375();
        if (c1389M2375 != null) {
            c1389M2375.f4034 = new C0811(interfaceC2129, c1242, i, i3);
        }
    }
}
