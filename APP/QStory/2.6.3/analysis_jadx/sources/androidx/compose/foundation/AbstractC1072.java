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
import kotlin.C5176;
import net.bytebuddy.jar.asm.Opcodes;
import p052.InterfaceC6543;
import p052.InterfaceC6554;
import p052.InterfaceC6558;
import p053.AbstractC6561;
import p106.AbstractC7308;
import p106.AbstractC7311;
import p176.AbstractC7741;
import p205.C7898;
import p205.InterfaceC7896;

/* JADX INFO: renamed from: androidx.compose.foundation.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1072 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final void m1979(long j, Orientation orientation) {
        if (orientation == Orientation.Vertical) {
            if (C7898.m13338(j) != Integer.MAX_VALUE) {
                return;
            }
            AbstractC7741.m13095("Vertically scrollable component was measured with an infinity maximum height constraints, which is disallowed. One of the common reasons is nesting layouts like LazyColumn and Column(Modifier.verticalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyColumn scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
        } else {
            if (C7898.m13337(j) != Integer.MAX_VALUE) {
                return;
            }
            AbstractC7741.m13095("Horizontally scrollable component was measured with an infinity maximum width constraints, which is disallowed. One of the common reasons is nesting layouts like LazyRow and Row(Modifier.horizontalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyRow scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final InterfaceC2129 m1980(InterfaceC2129 interfaceC2129, long j, InterfaceC1569 interfaceC1569) {
        int i = AbstractC1909.f5628;
        return interfaceC2129.mo3866(new C1068(j, null, interfaceC1569, 2));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static InterfaceC2129 m1981(InterfaceC2129 interfaceC2129, C1588 c1588) {
        int i = AbstractC1909.f5628;
        return interfaceC2129.mo3866(new C1068(0L, c1588, AbstractC1581.f4662, 1));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static float m1982(EdgeEffect edgeEffect, float f, float f2, InterfaceC7896 interfaceC7896) {
        float f3 = AbstractC1035.f3043;
        double dMo1256 = interfaceC7896.mo1256() * 386.0878f * 160.0f * 0.84f;
        double dAbs = Math.abs(f) * 0.35f;
        double d = ((double) AbstractC1035.f3043) * dMo1256;
        float fExp = (float) (Math.exp((AbstractC1035.f3042 / AbstractC1035.f3041) * Math.log(dAbs / d)) * d);
        int i = Build.VERSION.SDK_INT;
        if (fExp > (i >= 31 ? AbstractC1069.m1977(edgeEffect) : 0.0f) * f2) {
            return 0.0f;
        }
        int iM12058 = AbstractC6561.m12058(f);
        if (i >= 31) {
            edgeEffect.onAbsorb(iM12058);
            return f;
        }
        if (edgeEffect.isFinished()) {
            edgeEffect.onAbsorb(iM12058);
        }
        return f;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final void m1983(final AbstractC1528 abstractC1528, final InterfaceC2129 interfaceC2129, InterfaceC2118 interfaceC2118, final C1730 c1730, float f, C1607 c1607, InterfaceC1373 interfaceC1373, final int i, final int i2) {
        InterfaceC2118 interfaceC21182;
        int i3;
        float f2;
        int i4;
        int i5;
        final InterfaceC2118 interfaceC21183;
        final float f3;
        final C1607 c16072;
        C1324 c1324 = (C1324) interfaceC1373;
        c1324.m2391(1142754848);
        int i6 = (c1324.m2378(abstractC1528) ? 4 : 2) | i;
        if ((i & 384) == 0) {
            i6 |= c1324.m2360(interfaceC2129) ? 256 : 128;
        }
        int i7 = i2 & 8;
        if (i7 != 0) {
            i3 = i6 | 3072;
            interfaceC21182 = interfaceC2118;
        } else {
            interfaceC21182 = interfaceC2118;
            i3 = i6 | (c1324.m2360(interfaceC21182) ? 2048 : 1024);
        }
        if ((i & 24576) == 0) {
            i3 |= c1324.m2360(c1730) ? 16384 : 8192;
        }
        int i8 = i2 & 32;
        if (i8 != 0) {
            i4 = i3 | 196608;
            f2 = f;
        } else {
            f2 = f;
            i4 = i3 | (c1324.m2363(f2) ? 131072 : 65536);
        }
        int i9 = i2 & 64;
        if (i9 != 0) {
            i5 = i4 | 1572864;
        } else {
            i5 = i4 | (c1324.m2360(c1607) ? 1048576 : Opcodes.ASM8);
        }
        if (c1324.m2343(i5 & 1, (599187 & i5) != 599186)) {
            InterfaceC2118 interfaceC21184 = i7 != 0 ? C2119.f6264 : interfaceC21182;
            float f4 = i8 != 0 ? 1.0f : f2;
            C1607 c16073 = i9 != 0 ? null : c1607;
            c1324.m2392(1899381698);
            c1324.m2377(false);
            InterfaceC2129 interfaceC2129M2582 = AbstractC1445.m2582(AbstractC1445.m2586(interfaceC2129.mo3866(C2125.f6276)), abstractC1528, interfaceC21184, c1730, f4, c16073, 2);
            Object objM2345 = c1324.m2345();
            if (objM2345 == C1369.f3974) {
                objM2345 = C1015.f2974;
                c1324.m2386(objM2345);
            }
            InterfaceC1658 interfaceC1658 = (InterfaceC1658) objM2345;
            int iHashCode = Long.hashCode(c1324.f3837);
            InterfaceC2129 interfaceC2129M3861 = AbstractC2120.m3861(c1324, interfaceC2129M2582);
            C1253 c1253M2381 = c1324.m2381();
            InterfaceC1784.f5222.getClass();
            InterfaceC6543 interfaceC6543 = C1765.f5185;
            c1324.m2396();
            if (c1324.f3838) {
                c1324.m2380(interfaceC6543);
            } else {
                c1324.m2390();
            }
            AbstractC1367.m2472(c1324, interfaceC1658, C1765.f5181);
            AbstractC1367.m2472(c1324, c1253M2381, C1765.f5182);
            AbstractC1367.m2481(c1324, C1765.f5187);
            AbstractC1367.m2472(c1324, interfaceC2129M3861, C1765.f5183);
            AbstractC1367.m2472(c1324, Integer.valueOf(iHashCode), C1765.f5188);
            c1324.m2377(true);
            interfaceC21183 = interfaceC21184;
            f3 = f4;
            c16072 = c16073;
        } else {
            c1324.m2339();
            interfaceC21183 = interfaceC21182;
            f3 = f2;
            c16072 = c1607;
        }
        C1389 c1389M2375 = c1324.m2375();
        if (c1389M2375 != null) {
            c1389M2375.f4034 = new InterfaceC6554() { // from class: androidx.compose.foundation.飘花落叶言子世兰苏哲楪
                @Override // p052.InterfaceC6554
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    AbstractC1072.m1983(abstractC1528, interfaceC2129, interfaceC21183, c1730, f3, c16072, (InterfaceC1373) obj, AbstractC1367.m2471(i | 1), i2);
                    return C5176.f14739;
                }
            };
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final void m1984(InterfaceC2129 interfaceC2129, InterfaceC6558 interfaceC6558, InterfaceC1373 interfaceC1373, int i) {
        C1324 c1324 = (C1324) interfaceC1373;
        c1324.m2391(-932836462);
        int i2 = (c1324.m2360(interfaceC2129) ? 4 : 2) | i | (c1324.m2378(interfaceC6558) ? 32 : 16);
        int i3 = 0;
        if (c1324.m2343(i2 & 1, (i2 & 19) != 18)) {
            AbstractC0628.m1423(c1324, AbstractC1445.m2585(interfaceC2129, interfaceC6558));
        } else {
            c1324.m2339();
        }
        C1389 c1389M2375 = c1324.m2375();
        if (c1389M2375 != null) {
            c1389M2375.f4034 = new C1060(i, i3, interfaceC2129, interfaceC6558);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static InterfaceC2129 m1985(InterfaceC2129 interfaceC2129, C1040 c1040) {
        return interfaceC2129.mo3866(AbstractC1445.m2587(C2125.f6276, C1017.f2975)).mo3866(new C1043(c1040, Orientation.Vertical, true, null, c1040.f3058, true, null)).mo3866(new C1039(c1040));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static final long m1986(float f, long j) {
        float fMax = Math.max(0.0f, Float.intBitsToFloat((int) (j >> 32)) - f);
        float fMax2 = Math.max(0.0f, Float.intBitsToFloat((int) (j & 4294967295L)) - f);
        return (((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(fMax2)) & 4294967295L);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static InterfaceC2129 m1987(InterfaceC0580 interfaceC0580, InterfaceC1016 interfaceC1016, InterfaceC6543 interfaceC6543, InterfaceC6543 interfaceC65432) {
        if (interfaceC1016 instanceof InterfaceC1095) {
            return new C1031((InterfaceC1095) interfaceC1016, interfaceC0580, interfaceC65432, interfaceC6543);
        }
        if (interfaceC1016 == null) {
            return new C1031(null, interfaceC0580, interfaceC65432, interfaceC6543);
        }
        C2125 c2125 = C2125.f6276;
        return interfaceC0580 != null ? AbstractC1092.m2004(c2125, interfaceC0580, interfaceC1016).mo3866(new C1031(null, interfaceC0580, interfaceC65432, interfaceC6543)) : AbstractC2120.m3863(c2125, new C1058(interfaceC1016, interfaceC65432, interfaceC6543));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static InterfaceC2129 m1988(InterfaceC2129 interfaceC2129, boolean z, String str, InterfaceC0580 interfaceC0580, InterfaceC6543 interfaceC6543, int i) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 8) != 0) {
            interfaceC0580 = null;
        }
        return interfaceC2129.mo3866(new C1061(interfaceC0580, z, str, interfaceC6543));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final boolean m1989(InterfaceC1373 interfaceC1373) {
        return (((Configuration) ((C1324) interfaceC1373).m2383(AbstractC1835.f5337)).uiMode & 48) == 32;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static InterfaceC2129 m1990(InterfaceC2129 interfaceC2129, C0741 c0741, Orientation orientation, InterfaceC1084 interfaceC1084, boolean z, InterfaceC0560 interfaceC0560, C0573 c0573) {
        Orientation orientation2 = Orientation.Vertical;
        C2125 c2125 = C2125.f6276;
        return interfaceC2129.mo3866(orientation == orientation2 ? AbstractC1445.m2587(c2125, C1017.f2975) : AbstractC1445.m2587(c2125, C1017.f2976)).mo3866(new C1043(c0741, orientation, z, interfaceC0560, c0573, false, interfaceC1084));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final InterfaceC2129 m1991(InterfaceC2129 interfaceC2129, boolean z) {
        return interfaceC2129.mo3866(z ? new C1033() : C2125.f6276);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final boolean m1992(KeyEvent keyEvent) {
        long jM12504 = AbstractC7308.m12504(keyEvent);
        int i = AbstractC7311.f19454;
        return AbstractC7311.m12506(jM12504, AbstractC7311.f19489) || AbstractC7311.m12506(jM12504, AbstractC7311.f19486) || AbstractC7311.m12506(jM12504, AbstractC7311.f19470) || AbstractC7311.m12506(jM12504, AbstractC7311.f19485);
    }
}
