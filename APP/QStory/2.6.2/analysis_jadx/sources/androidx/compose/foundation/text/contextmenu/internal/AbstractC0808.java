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
import com.bumptech.glide.AbstractC3055;
import kotlin.C5175;
import p052.InterfaceC6542;
import p052.InterfaceC6553;
import p052.InterfaceC6557;

/* JADX INFO: renamed from: androidx.compose.foundation.text.contextmenu.internal.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0808 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C1242 f2306 = new C1242(636288403, false, new C0807(0));

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C1242 f2305 = new C1242(-1357803046, false, new C0807(1));

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C0814 m1621(InterfaceC6542 interfaceC6542, InterfaceC1373 interfaceC1373, int i) {
        C1324 c1324 = (C1324) interfaceC1373;
        View view = (View) c1324.m2373(AbstractC1835.f5331);
        boolean zM2350 = c1324.m2350(view);
        Object objM2335 = c1324.m2335();
        C1353 c1353 = C1369.f3973;
        if (zM2350 || objM2335 == c1353) {
            objM2335 = new C0814(view, null, interfaceC6542);
            c1324.m2376(objM2335);
        }
        C0814 c0814 = (C0814) objM2335;
        boolean zM2368 = c1324.m2368(c0814);
        Object objM23352 = c1324.m2335();
        if (zM2368 || objM23352 == c1353) {
            objM23352 = new C0796(c0814, 3);
            c1324.m2376(objM23352);
        }
        AbstractC1367.m2475(c0814, (InterfaceC6557) objM23352, c1324);
        return c0814;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final void m1622(final InterfaceC2129 interfaceC2129, final C1242 c1242, InterfaceC1373 interfaceC1373, int i) {
        int i2;
        C1324 c1324 = (C1324) interfaceC1373;
        c1324.m2381(771959668);
        if ((i & 6) == 0) {
            i2 = (c1324.m2350(interfaceC2129) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c1324.m2368(null) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c1324.m2368(c1242) ? 256 : 128;
        }
        if (c1324.m2333(i2 & 1, (i2 & 147) != 146)) {
            Object objM2335 = c1324.m2335();
            C1353 c1353 = C1369.f3973;
            if (objM2335 == c1353) {
                objM2335 = AbstractC1367.m2466(null, C1353.f3919);
                c1324.m2376(objM2335);
            }
            final InterfaceC1395 interfaceC1395 = (InterfaceC1395) objM2335;
            Object objM23352 = c1324.m2335();
            if (objM23352 == c1353) {
                objM23352 = new C0812(interfaceC1395, 0);
                c1324.m2376(objM23352);
            }
            AbstractC1367.m2478(AbstractC0833.f2367.mo2418(m1621((InterfaceC6542) objM23352, c1324, 0)), AbstractC1254.m2179(-291176396, new InterfaceC6553() { // from class: androidx.compose.foundation.text.contextmenu.internal.飘花落叶言子楪哲世苏兰
                @Override // p052.InterfaceC6553
                public final Object invoke(Object obj, Object obj2) {
                    InterfaceC1373 interfaceC13732 = (InterfaceC1373) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    C1324 c13242 = (C1324) interfaceC13732;
                    if (c13242.m2333(iIntValue & 1, (iIntValue & 3) != 2)) {
                        Object objM23353 = c13242.m2335();
                        if (objM23353 == C1369.f3973) {
                            objM23353 = new C0803(interfaceC1395, 0);
                            c13242.m2376(objM23353);
                        }
                        InterfaceC2129 interfaceC2129M3095 = AbstractC1670.m3095(interfaceC2129, (InterfaceC6557) objM23353);
                        InterfaceC1658 interfaceC1658M1441 = AbstractC0643.m1441(C2119.f6271, true);
                        int iHashCode = Long.hashCode(c13242.f3836);
                        C1253 c1253M2371 = c13242.m2371();
                        InterfaceC2129 interfaceC2129M3851 = AbstractC2120.m3851(c13242, interfaceC2129M3095);
                        InterfaceC1784.f5221.getClass();
                        InterfaceC6542 interfaceC6542 = C1765.f5184;
                        c13242.m2386();
                        if (c13242.f3837) {
                            c13242.m2370(interfaceC6542);
                        } else {
                            c13242.m2380();
                        }
                        AbstractC1367.m2464(c13242, interfaceC1658M1441, C1765.f5180);
                        AbstractC1367.m2464(c13242, c1253M2371, C1765.f5181);
                        AbstractC1367.m2464(c13242, Integer.valueOf(iHashCode), C1765.f5187);
                        AbstractC1367.m2472(c13242, C1765.f5186);
                        AbstractC1367.m2464(c13242, interfaceC2129M3851, C1765.f5182);
                        c1242.invoke(c13242, 0);
                        c13242.m2367(true);
                    } else {
                        c13242.m2329();
                    }
                    return C5175.f14739;
                }
            }, c1324), c1324, 56);
        } else {
            c1324.m2329();
        }
        C1389 c1389M2365 = c1324.m2365();
        if (c1389M2365 != null) {
            c1389M2365.f4033 = new C0811(interfaceC2129, c1242, i, 1);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final void m1623(InterfaceC2129 interfaceC2129, C1242 c1242, InterfaceC1373 interfaceC1373, int i) {
        int i2;
        C1324 c1324 = (C1324) interfaceC1373;
        c1324.m2381(2064964257);
        if ((i & 6) == 0) {
            i2 = (c1324.m2350(interfaceC2129) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c1324.m2368(c1242) ? 32 : 16;
        }
        if (c1324.m2333(i2 & 1, (i2 & 19) != 18)) {
            m1622(interfaceC2129, c1242, c1324, ((i2 << 3) & 896) | (i2 & 14) | 48);
        } else {
            c1324.m2329();
        }
        C1389 c1389M2365 = c1324.m2365();
        if (c1389M2365 != null) {
            c1389M2365.f4033 = new C0811(interfaceC2129, c1242, i, 0);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final void m1624(InterfaceC2129 interfaceC2129, C1242 c1242, InterfaceC1373 interfaceC1373, int i) {
        int i2;
        C1324 c1324 = (C1324) interfaceC1373;
        c1324.m2381(155925518);
        if ((i & 6) == 0) {
            i2 = (c1324.m2350(interfaceC2129) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c1324.m2368(c1242) ? 32 : 16;
        }
        if (c1324.m2333(i2 & 1, (i2 & 19) != 18)) {
            boolean z = c1324.m2373(AbstractC0833.f2368) != null;
            boolean z2 = c1324.m2373(AbstractC0833.f2367) != null;
            if (z && z2) {
                c1324.m2382(-1977187922);
                InterfaceC1658 interfaceC1658M1441 = AbstractC0643.m1441(C2119.f6271, true);
                int iHashCode = Long.hashCode(c1324.f3836);
                C1253 c1253M2371 = c1324.m2371();
                InterfaceC2129 interfaceC2129M3851 = AbstractC2120.m3851(c1324, interfaceC2129);
                InterfaceC1784.f5221.getClass();
                InterfaceC6542 interfaceC6542 = C1765.f5184;
                c1324.m2386();
                if (c1324.f3837) {
                    c1324.m2370(interfaceC6542);
                } else {
                    c1324.m2380();
                }
                AbstractC1367.m2464(c1324, interfaceC1658M1441, C1765.f5180);
                AbstractC1367.m2464(c1324, c1253M2371, C1765.f5181);
                AbstractC1367.m2464(c1324, Integer.valueOf(iHashCode), C1765.f5187);
                AbstractC1367.m2472(c1324, C1765.f5186);
                AbstractC1367.m2464(c1324, interfaceC2129M3851, C1765.f5182);
                c1242.invoke(c1324, Integer.valueOf((i2 >> 3) & 14));
                c1324.m2367(true);
                c1324.m2367(false);
            } else if (z) {
                c1324.m2382(-1976997706);
                m1623(interfaceC2129, c1242, c1324, i2 & 126);
                c1324.m2367(false);
            } else if (z2) {
                c1324.m2382(-1976846922);
                AbstractC0802.m1617(interfaceC2129, c1242, c1324, i2 & 126);
                c1324.m2367(false);
            } else {
                c1324.m2382(-1976716505);
                m1625(interfaceC2129, c1242, c1324, i2 & 126);
                c1324.m2367(false);
            }
        } else {
            c1324.m2329();
        }
        C1389 c1389M2365 = c1324.m2365();
        if (c1389M2365 != null) {
            c1389M2365.f4033 = new C0811(interfaceC2129, c1242, i, 3);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final void m1625(InterfaceC2129 interfaceC2129, C1242 c1242, InterfaceC1373 interfaceC1373, int i) {
        int i2;
        C1324 c1324 = (C1324) interfaceC1373;
        c1324.m2381(790527681);
        if ((i & 6) == 0) {
            i2 = (c1324.m2350(interfaceC2129) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c1324.m2368(c1242) ? 32 : 16;
        }
        if (c1324.m2333(i2 & 1, (i2 & 19) != 18)) {
            Object objM2335 = c1324.m2335();
            C1353 c1353 = C1369.f3973;
            if (objM2335 == c1353) {
                objM2335 = AbstractC1367.m2466(null, C1353.f3919);
                c1324.m2376(objM2335);
            }
            InterfaceC1395 interfaceC1395 = (InterfaceC1395) objM2335;
            Object objM23352 = c1324.m2335();
            if (objM23352 == c1353) {
                objM23352 = new C0812(interfaceC1395, 1);
                c1324.m2376(objM23352);
            }
            InterfaceC6542 interfaceC6542 = (InterfaceC6542) objM23352;
            C2090 c2090 = AbstractC0802.f2291;
            C0830 c0830M6629 = AbstractC3055.m6629(f2305, c1324, 6);
            AbstractC1367.m2477(new C0194[]{AbstractC0833.f2367.mo2418(m1621(interfaceC6542, c1324, 2)), AbstractC0833.f2368.mo2418(c0830M6629)}, AbstractC1254.m2179(1070596993, new C0366(interfaceC2129, interfaceC1395, c1242, c0830M6629, interfaceC6542, 1), c1324), c1324, 56);
        } else {
            c1324.m2329();
        }
        C1389 c1389M2365 = c1324.m2365();
        if (c1389M2365 != null) {
            c1389M2365.f4033 = new C0811(interfaceC2129, c1242, i, 4);
        }
    }
}
