package androidx.compose.foundation;

import android.content.res.Configuration;
import android.os.Build;
import android.view.KeyEvent;
import android.widget.EdgeEffect;
import androidx.compose.foundation.gestures.InterfaceC1401;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.C1414;
import androidx.compose.foundation.interaction.InterfaceC1421;
import androidx.compose.foundation.layout.AbstractC1469;
import androidx.compose.foundation.lazy.C1582;
import androidx.compose.p001ui.AbstractC2953;
import androidx.compose.p001ui.C2952;
import androidx.compose.p001ui.C2958;
import androidx.compose.p001ui.InterfaceC2951;
import androidx.compose.p001ui.InterfaceC2962;
import androidx.compose.p001ui.draw.AbstractC2280;
import androidx.compose.p001ui.graphics.AbstractC2416;
import androidx.compose.p001ui.graphics.C2423;
import androidx.compose.p001ui.graphics.C2442;
import androidx.compose.p001ui.graphics.InterfaceC2404;
import androidx.compose.p001ui.graphics.painter.AbstractC2363;
import androidx.compose.p001ui.layout.C2565;
import androidx.compose.p001ui.layout.InterfaceC2493;
import androidx.compose.p001ui.node.C2600;
import androidx.compose.p001ui.node.InterfaceC2619;
import androidx.compose.p001ui.platform.AbstractC2670;
import androidx.compose.p001ui.platform.AbstractC2744;
import androidx.compose.runtime.AbstractC2202;
import androidx.compose.runtime.C2159;
import androidx.compose.runtime.C2204;
import androidx.compose.runtime.C2224;
import androidx.compose.runtime.InterfaceC2208;
import androidx.compose.runtime.internal.C2088;
import kotlin.C6008;
import net.bytebuddy.jar.asm.Opcodes;
import p068.InterfaceC7372;
import p068.InterfaceC7383;
import p068.InterfaceC7387;
import p069.AbstractC7390;
import p122.AbstractC8137;
import p122.AbstractC8140;
import p192.AbstractC8570;
import p221.C8727;
import p221.InterfaceC8725;

/* JADX INFO: renamed from: androidx.compose.foundation.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1910 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final void m2539(long j, Orientation orientation) {
        if (orientation == Orientation.Vertical) {
            if (C8727.m13897(j) != Integer.MAX_VALUE) {
                return;
            }
            AbstractC8570.m13654("Vertically scrollable component was measured with an infinity maximum height constraints, which is disallowed. One of the common reasons is nesting layouts like LazyColumn and Column(Modifier.verticalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyColumn scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
        } else {
            if (C8727.m13896(j) != Integer.MAX_VALUE) {
                return;
            }
            AbstractC8570.m13654("Horizontally scrollable component was measured with an infinity maximum width constraints, which is disallowed. One of the common reasons is nesting layouts like LazyRow and Row(Modifier.horizontalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyRow scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final InterfaceC2962 m2540(InterfaceC2962 interfaceC2962, long j, InterfaceC2404 interfaceC2404) {
        int i = AbstractC2744.f5973;
        return interfaceC2962.mo4426(new C1906(j, null, interfaceC2404, 2));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static InterfaceC2962 m2541(InterfaceC2962 interfaceC2962, C2423 c2423) {
        int i = AbstractC2744.f5973;
        return interfaceC2962.mo4426(new C1906(0L, c2423, AbstractC2416.f5007, 1));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static float m2542(EdgeEffect edgeEffect, float f, float f2, InterfaceC8725 interfaceC8725) {
        float f3 = AbstractC1873.f3388;
        double dMo1816 = interfaceC8725.mo1816() * 386.0878f * 160.0f * 0.84f;
        double dAbs = Math.abs(f) * 0.35f;
        double d = ((double) AbstractC1873.f3388) * dMo1816;
        float fExp = (float) (Math.exp((AbstractC1873.f3387 / AbstractC1873.f3386) * Math.log(dAbs / d)) * d);
        int i = Build.VERSION.SDK_INT;
        if (fExp > (i >= 31 ? AbstractC1907.m2537(edgeEffect) : 0.0f) * f2) {
            return 0.0f;
        }
        int iM12617 = AbstractC7390.m12617(f);
        if (i >= 31) {
            edgeEffect.onAbsorb(iM12617);
            return f;
        }
        if (edgeEffect.isFinished()) {
            edgeEffect.onAbsorb(iM12617);
        }
        return f;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final void m2543(final AbstractC2363 abstractC2363, final InterfaceC2962 interfaceC2962, InterfaceC2951 interfaceC2951, final C2565 c2565, float f, C2442 c2442, InterfaceC2208 interfaceC2208, final int i, final int i2) {
        InterfaceC2951 interfaceC29512;
        int i3;
        float f2;
        int i4;
        int i5;
        final InterfaceC2951 interfaceC29513;
        final float f3;
        final C2442 c24422;
        C2159 c2159 = (C2159) interfaceC2208;
        c2159.m2951(1142754848);
        int i6 = (c2159.m2938(abstractC2363) ? 4 : 2) | i;
        if ((i & 384) == 0) {
            i6 |= c2159.m2920(interfaceC2962) ? 256 : 128;
        }
        int i7 = i2 & 8;
        if (i7 != 0) {
            i3 = i6 | 3072;
            interfaceC29512 = interfaceC2951;
        } else {
            interfaceC29512 = interfaceC2951;
            i3 = i6 | (c2159.m2920(interfaceC29512) ? 2048 : 1024);
        }
        if ((i & 24576) == 0) {
            i3 |= c2159.m2920(c2565) ? 16384 : 8192;
        }
        int i8 = i2 & 32;
        if (i8 != 0) {
            i4 = i3 | 196608;
            f2 = f;
        } else {
            f2 = f;
            i4 = i3 | (c2159.m2923(f2) ? 131072 : 65536);
        }
        int i9 = i2 & 64;
        if (i9 != 0) {
            i5 = i4 | 1572864;
        } else {
            i5 = i4 | (c2159.m2920(c2442) ? 1048576 : Opcodes.ASM8);
        }
        if (c2159.m2903(i5 & 1, (599187 & i5) != 599186)) {
            InterfaceC2951 interfaceC29514 = i7 != 0 ? C2952.f6609 : interfaceC29512;
            float f4 = i8 != 0 ? 1.0f : f2;
            C2442 c24423 = i9 != 0 ? null : c2442;
            c2159.m2952(1899381698);
            c2159.m2937(false);
            InterfaceC2962 interfaceC2962M3142 = AbstractC2280.m3142(AbstractC2280.m3146(interfaceC2962.mo4426(C2958.f6621)), abstractC2363, interfaceC29514, c2565, f4, c24423, 2);
            Object objM2905 = c2159.m2905();
            if (objM2905 == C2204.f4319) {
                objM2905 = C1853.f3319;
                c2159.m2946(objM2905);
            }
            InterfaceC2493 interfaceC2493 = (InterfaceC2493) objM2905;
            int iHashCode = Long.hashCode(c2159.f4182);
            InterfaceC2962 interfaceC2962M4421 = AbstractC2953.m4421(c2159, interfaceC2962M3142);
            C2088 c2088M2941 = c2159.m2941();
            InterfaceC2619.f5567.getClass();
            InterfaceC7372 interfaceC7372 = C2600.f5530;
            c2159.m2956();
            if (c2159.f4183) {
                c2159.m2940(interfaceC7372);
            } else {
                c2159.m2950();
            }
            AbstractC2202.m3032(c2159, interfaceC2493, C2600.f5526);
            AbstractC2202.m3032(c2159, c2088M2941, C2600.f5527);
            AbstractC2202.m3041(c2159, C2600.f5532);
            AbstractC2202.m3032(c2159, interfaceC2962M4421, C2600.f5528);
            AbstractC2202.m3032(c2159, Integer.valueOf(iHashCode), C2600.f5533);
            c2159.m2937(true);
            interfaceC29513 = interfaceC29514;
            f3 = f4;
            c24422 = c24423;
        } else {
            c2159.m2899();
            interfaceC29513 = interfaceC29512;
            f3 = f2;
            c24422 = c2442;
        }
        C2224 c2224M2935 = c2159.m2935();
        if (c2224M2935 != null) {
            c2224M2935.f4379 = new InterfaceC7383() { // from class: androidx.compose.foundation.飘花落叶言子世兰苏哲楪
                @Override // p068.InterfaceC7383
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    AbstractC1910.m2543(abstractC2363, interfaceC2962, interfaceC29513, c2565, f3, c24422, (InterfaceC2208) obj, AbstractC2202.m3031(i | 1), i2);
                    return C6008.f15084;
                }
            };
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final void m2544(InterfaceC2962 interfaceC2962, InterfaceC7387 interfaceC7387, InterfaceC2208 interfaceC2208, int i) {
        C2159 c2159 = (C2159) interfaceC2208;
        c2159.m2951(-932836462);
        int i2 = (c2159.m2920(interfaceC2962) ? 4 : 2) | i | (c2159.m2938(interfaceC7387) ? 32 : 16);
        int i3 = 0;
        if (c2159.m2903(i2 & 1, (i2 & 19) != 18)) {
            AbstractC1469.m1983(c2159, AbstractC2280.m3145(interfaceC2962, interfaceC7387));
        } else {
            c2159.m2899();
        }
        C2224 c2224M2935 = c2159.m2935();
        if (c2224M2935 != null) {
            c2224M2935.f4379 = new C1898(i, i3, interfaceC2962, interfaceC7387);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static InterfaceC2962 m2545(InterfaceC2962 interfaceC2962, C1878 c1878) {
        return interfaceC2962.mo4426(AbstractC2280.m3147(C2958.f6621, C1855.f3320)).mo4426(new C1881(c1878, Orientation.Vertical, true, null, c1878.f3403, true, null)).mo4426(new C1877(c1878));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static final long m2546(float f, long j) {
        float fMax = Math.max(0.0f, Float.intBitsToFloat((int) (j >> 32)) - f);
        float fMax2 = Math.max(0.0f, Float.intBitsToFloat((int) (j & 4294967295L)) - f);
        return (((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(fMax2)) & 4294967295L);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static InterfaceC2962 m2547(InterfaceC1421 interfaceC1421, InterfaceC1854 interfaceC1854, InterfaceC7372 interfaceC7372, InterfaceC7372 interfaceC73722) {
        if (interfaceC1854 instanceof InterfaceC1933) {
            return new C1869((InterfaceC1933) interfaceC1854, interfaceC1421, interfaceC73722, interfaceC7372);
        }
        if (interfaceC1854 == null) {
            return new C1869(null, interfaceC1421, interfaceC73722, interfaceC7372);
        }
        C2958 c2958 = C2958.f6621;
        return interfaceC1421 != null ? AbstractC1930.m2564(c2958, interfaceC1421, interfaceC1854).mo4426(new C1869(null, interfaceC1421, interfaceC73722, interfaceC7372)) : AbstractC2953.m4423(c2958, new C1896(interfaceC1854, interfaceC73722, interfaceC7372));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static InterfaceC2962 m2548(InterfaceC2962 interfaceC2962, boolean z, String str, InterfaceC1421 interfaceC1421, InterfaceC7372 interfaceC7372, int i) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 8) != 0) {
            interfaceC1421 = null;
        }
        return interfaceC2962.mo4426(new C1899(interfaceC1421, z, str, interfaceC7372));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final boolean m2549(InterfaceC2208 interfaceC2208) {
        return (((Configuration) ((C2159) interfaceC2208).m2943(AbstractC2670.f5682)).uiMode & 48) == 32;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static InterfaceC2962 m2550(InterfaceC2962 interfaceC2962, C1582 c1582, Orientation orientation, InterfaceC1922 interfaceC1922, boolean z, InterfaceC1401 interfaceC1401, C1414 c1414) {
        Orientation orientation2 = Orientation.Vertical;
        C2958 c2958 = C2958.f6621;
        return interfaceC2962.mo4426(orientation == orientation2 ? AbstractC2280.m3147(c2958, C1855.f3320) : AbstractC2280.m3147(c2958, C1855.f3321)).mo4426(new C1881(c1582, orientation, z, interfaceC1401, c1414, false, interfaceC1922));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final InterfaceC2962 m2551(InterfaceC2962 interfaceC2962, boolean z) {
        return interfaceC2962.mo4426(z ? new C1871() : C2958.f6621);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final boolean m2552(KeyEvent keyEvent) {
        long jM13063 = AbstractC8137.m13063(keyEvent);
        int i = AbstractC8140.f19799;
        return AbstractC8140.m13065(jM13063, AbstractC8140.f19834) || AbstractC8140.m13065(jM13063, AbstractC8140.f19831) || AbstractC8140.m13065(jM13063, AbstractC8140.f19815) || AbstractC8140.m13065(jM13063, AbstractC8140.f19830);
    }
}
