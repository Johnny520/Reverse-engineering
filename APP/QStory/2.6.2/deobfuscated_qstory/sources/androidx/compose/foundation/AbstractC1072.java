package androidx.compose.foundation;

import android.content.res.Configuration;
import android.os.Build;
import android.view.KeyEvent;
import android.widget.EdgeEffect;
import androidx.compose.foundation.gestures.InterfaceC0560;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.C0573;
import androidx.compose.foundation.interaction.InterfaceC0580;
import androidx.compose.foundation.layout.AbstractC0628;
import androidx.compose.foundation.lazy.C0741;
import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.C1324;
import androidx.compose.runtime.C1369;
import androidx.compose.runtime.C1389;
import androidx.compose.runtime.InterfaceC1373;
import androidx.compose.runtime.internal.C1253;
import androidx.compose.ui.AbstractC2120;
import androidx.compose.ui.C2119;
import androidx.compose.ui.C2125;
import androidx.compose.ui.InterfaceC2118;
import androidx.compose.ui.InterfaceC2129;
import androidx.compose.ui.draw.AbstractC1445;
import androidx.compose.ui.graphics.AbstractC1581;
import androidx.compose.ui.graphics.C1588;
import androidx.compose.ui.graphics.C1607;
import androidx.compose.ui.graphics.InterfaceC1569;
import androidx.compose.ui.graphics.painter.AbstractC1528;
import androidx.compose.ui.layout.C1730;
import androidx.compose.ui.layout.InterfaceC1658;
import androidx.compose.ui.node.C1765;
import androidx.compose.ui.node.InterfaceC1784;
import androidx.compose.ui.platform.AbstractC1835;
import androidx.compose.ui.platform.AbstractC1909;
import kotlin.C5175;
import net.bytebuddy.jar.asm.Opcodes;
import p052.InterfaceC6542;
import p052.InterfaceC6553;
import p052.InterfaceC6557;
import p053.AbstractC6560;
import p106.AbstractC7307;
import p106.AbstractC7310;
import p176.AbstractC7740;
import p205.C7897;
import p205.InterfaceC7895;

/* JADX INFO: renamed from: androidx.compose.foundation.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1072 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final void m1969(long j, Orientation orientation) {
        if (orientation == Orientation.Vertical) {
            if (C7897.m13310(j) != Integer.MAX_VALUE) {
                return;
            }
            AbstractC7740.m13067("Vertically scrollable component was measured with an infinity maximum height constraints, which is disallowed. One of the common reasons is nesting layouts like LazyColumn and Column(Modifier.verticalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyColumn scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
        } else {
            if (C7897.m13309(j) != Integer.MAX_VALUE) {
                return;
            }
            AbstractC7740.m13067("Horizontally scrollable component was measured with an infinity maximum width constraints, which is disallowed. One of the common reasons is nesting layouts like LazyRow and Row(Modifier.horizontalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyRow scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final InterfaceC2129 m1970(InterfaceC2129 interfaceC2129, long j, InterfaceC1569 interfaceC1569) {
        int i = AbstractC1909.f5627;
        return interfaceC2129.mo3856(new C1068(j, null, interfaceC1569, 2));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static InterfaceC2129 m1971(InterfaceC2129 interfaceC2129, C1588 c1588) {
        int i = AbstractC1909.f5627;
        return interfaceC2129.mo3856(new C1068(0L, c1588, AbstractC1581.f4661, 1));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static float m1972(EdgeEffect edgeEffect, float f, float f2, InterfaceC7895 interfaceC7895) {
        float f3 = AbstractC1035.f3042;
        double dMo1246 = interfaceC7895.mo1246() * 386.0878f * 160.0f * 0.84f;
        double dAbs = Math.abs(f) * 0.35f;
        double d = ((double) AbstractC1035.f3042) * dMo1246;
        float fExp = (float) (Math.exp((AbstractC1035.f3041 / AbstractC1035.f3040) * Math.log(dAbs / d)) * d);
        int i = Build.VERSION.SDK_INT;
        if (fExp > (i >= 31 ? AbstractC1069.m1967(edgeEffect) : 0.0f) * f2) {
            return 0.0f;
        }
        int iM12006 = AbstractC6560.m12006(f);
        if (i >= 31) {
            edgeEffect.onAbsorb(iM12006);
            return f;
        }
        if (edgeEffect.isFinished()) {
            edgeEffect.onAbsorb(iM12006);
        }
        return f;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final void m1973(final AbstractC1528 abstractC1528, final InterfaceC2129 interfaceC2129, InterfaceC2118 interfaceC2118, final C1730 c1730, float f, C1607 c1607, InterfaceC1373 interfaceC1373, final int i, final int i2) {
        InterfaceC2118 interfaceC21182;
        int i3;
        float f2;
        int i4;
        int i5;
        final InterfaceC2118 interfaceC21183;
        final float f3;
        final C1607 c16072;
        C1324 c1324 = (C1324) interfaceC1373;
        c1324.m2381(1142754848);
        int i6 = (c1324.m2368(abstractC1528) ? 4 : 2) | i;
        if ((i & 384) == 0) {
            i6 |= c1324.m2350(interfaceC2129) ? 256 : 128;
        }
        int i7 = i2 & 8;
        if (i7 != 0) {
            i3 = i6 | 3072;
            interfaceC21182 = interfaceC2118;
        } else {
            interfaceC21182 = interfaceC2118;
            i3 = i6 | (c1324.m2350(interfaceC21182) ? 2048 : 1024);
        }
        if ((i & 24576) == 0) {
            i3 |= c1324.m2350(c1730) ? 16384 : 8192;
        }
        int i8 = i2 & 32;
        if (i8 != 0) {
            i4 = i3 | 196608;
            f2 = f;
        } else {
            f2 = f;
            i4 = i3 | (c1324.m2353(f2) ? 131072 : 65536);
        }
        int i9 = i2 & 64;
        if (i9 != 0) {
            i5 = i4 | 1572864;
        } else {
            i5 = i4 | (c1324.m2350(c1607) ? 1048576 : Opcodes.ASM8);
        }
        if (c1324.m2333(i5 & 1, (599187 & i5) != 599186)) {
            InterfaceC2118 interfaceC21184 = i7 != 0 ? C2119.f6263 : interfaceC21182;
            float f4 = i8 != 0 ? 1.0f : f2;
            C1607 c16073 = i9 != 0 ? null : c1607;
            c1324.m2382(1899381698);
            c1324.m2367(false);
            InterfaceC2129 interfaceC2129M2572 = AbstractC1445.m2572(AbstractC1445.m2576(interfaceC2129.mo3856(C2125.f6275)), abstractC1528, interfaceC21184, c1730, f4, c16073, 2);
            Object objM2335 = c1324.m2335();
            if (objM2335 == C1369.f3973) {
                objM2335 = C1015.f2973;
                c1324.m2376(objM2335);
            }
            InterfaceC1658 interfaceC1658 = (InterfaceC1658) objM2335;
            int iHashCode = Long.hashCode(c1324.f3836);
            InterfaceC2129 interfaceC2129M3851 = AbstractC2120.m3851(c1324, interfaceC2129M2572);
            C1253 c1253M2371 = c1324.m2371();
            InterfaceC1784.f5221.getClass();
            InterfaceC6542 interfaceC6542 = C1765.f5184;
            c1324.m2386();
            if (c1324.f3837) {
                c1324.m2370(interfaceC6542);
            } else {
                c1324.m2380();
            }
            AbstractC1367.m2464(c1324, interfaceC1658, C1765.f5180);
            AbstractC1367.m2464(c1324, c1253M2371, C1765.f5181);
            AbstractC1367.m2472(c1324, C1765.f5186);
            AbstractC1367.m2464(c1324, interfaceC2129M3851, C1765.f5182);
            AbstractC1367.m2464(c1324, Integer.valueOf(iHashCode), C1765.f5187);
            c1324.m2367(true);
            interfaceC21183 = interfaceC21184;
            f3 = f4;
            c16072 = c16073;
        } else {
            c1324.m2329();
            interfaceC21183 = interfaceC21182;
            f3 = f2;
            c16072 = c1607;
        }
        C1389 c1389M2365 = c1324.m2365();
        if (c1389M2365 != null) {
            c1389M2365.f4033 = new InterfaceC6553() { // from class: androidx.compose.foundation.飘花落叶言子世兰苏哲楪
                @Override // p052.InterfaceC6553
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    AbstractC1072.m1973(abstractC1528, interfaceC2129, interfaceC21183, c1730, f3, c16072, (InterfaceC1373) obj, AbstractC1367.m2460(i | 1), i2);
                    return C5175.f14739;
                }
            };
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final void m1974(InterfaceC2129 interfaceC2129, InterfaceC6557 interfaceC6557, InterfaceC1373 interfaceC1373, int i) {
        C1324 c1324 = (C1324) interfaceC1373;
        c1324.m2381(-932836462);
        int i2 = (c1324.m2350(interfaceC2129) ? 4 : 2) | i | (c1324.m2368(interfaceC6557) ? 32 : 16);
        int i3 = 0;
        if (c1324.m2333(i2 & 1, (i2 & 19) != 18)) {
            AbstractC0628.m1413(c1324, AbstractC1445.m2575(interfaceC2129, interfaceC6557));
        } else {
            c1324.m2329();
        }
        C1389 c1389M2365 = c1324.m2365();
        if (c1389M2365 != null) {
            c1389M2365.f4033 = new C1060(i, i3, interfaceC2129, interfaceC6557);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static InterfaceC2129 m1975(InterfaceC2129 interfaceC2129, C1040 c1040) {
        return interfaceC2129.mo3856(AbstractC1445.m2577(C2125.f6275, C1017.f2974)).mo3856(new C1043(c1040, Orientation.Vertical, true, null, c1040.f3057, true, null)).mo3856(new C1039(c1040));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static final long m1976(float f, long j) {
        float fMax = Math.max(0.0f, Float.intBitsToFloat((int) (j >> 32)) - f);
        float fMax2 = Math.max(0.0f, Float.intBitsToFloat((int) (j & 4294967295L)) - f);
        return (((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(fMax2)) & 4294967295L);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static InterfaceC2129 m1977(InterfaceC0580 interfaceC0580, InterfaceC1016 interfaceC1016, InterfaceC6542 interfaceC6542, InterfaceC6542 interfaceC65422) {
        if (interfaceC1016 instanceof InterfaceC1095) {
            return new C1031((InterfaceC1095) interfaceC1016, interfaceC0580, interfaceC65422, interfaceC6542);
        }
        if (interfaceC1016 == null) {
            return new C1031(null, interfaceC0580, interfaceC65422, interfaceC6542);
        }
        C2125 c2125 = C2125.f6275;
        return interfaceC0580 != null ? AbstractC1092.m1994(c2125, interfaceC0580, interfaceC1016).mo3856(new C1031(null, interfaceC0580, interfaceC65422, interfaceC6542)) : AbstractC2120.m3853(c2125, new C1058(interfaceC1016, interfaceC65422, interfaceC6542));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static InterfaceC2129 m1978(InterfaceC2129 interfaceC2129, boolean z, String str, InterfaceC0580 interfaceC0580, InterfaceC6542 interfaceC6542, int i) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 8) != 0) {
            interfaceC0580 = null;
        }
        return interfaceC2129.mo3856(new C1061(interfaceC0580, z, str, interfaceC6542));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final boolean m1979(InterfaceC1373 interfaceC1373) {
        return (((Configuration) ((C1324) interfaceC1373).m2373(AbstractC1835.f5336)).uiMode & 48) == 32;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static InterfaceC2129 m1980(InterfaceC2129 interfaceC2129, C0741 c0741, Orientation orientation, InterfaceC1084 interfaceC1084, boolean z, InterfaceC0560 interfaceC0560, C0573 c0573) {
        Orientation orientation2 = Orientation.Vertical;
        C2125 c2125 = C2125.f6275;
        return interfaceC2129.mo3856(orientation == orientation2 ? AbstractC1445.m2577(c2125, C1017.f2974) : AbstractC1445.m2577(c2125, C1017.f2975)).mo3856(new C1043(c0741, orientation, z, interfaceC0560, c0573, false, interfaceC1084));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final InterfaceC2129 m1981(InterfaceC2129 interfaceC2129, boolean z) {
        return interfaceC2129.mo3856(z ? new C1033() : C2125.f6275);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final boolean m1982(KeyEvent keyEvent) {
        long jM12477 = AbstractC7307.m12477(keyEvent);
        int i = AbstractC7310.f19459;
        return AbstractC7310.m12479(jM12477, AbstractC7310.f19494) || AbstractC7310.m12479(jM12477, AbstractC7310.f19491) || AbstractC7310.m12479(jM12477, AbstractC7310.f19475) || AbstractC7310.m12479(jM12477, AbstractC7310.f19490);
    }
}
