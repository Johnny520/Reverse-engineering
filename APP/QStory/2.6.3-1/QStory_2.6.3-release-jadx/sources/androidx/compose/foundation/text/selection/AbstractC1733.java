package androidx.compose.foundation.text.selection;

import android.graphics.Bitmap;
import androidx.appcompat.widget.C1041;
import androidx.collection.C1123;
import androidx.compose.foundation.gestures.AbstractC1309;
import androidx.compose.foundation.gestures.AbstractC1362;
import androidx.compose.foundation.layout.AbstractC1460;
import androidx.compose.foundation.layout.AbstractC1469;
import androidx.compose.foundation.layout.AbstractC1499;
import androidx.compose.foundation.layout.C1470;
import androidx.compose.foundation.layout.C1501;
import androidx.compose.foundation.lazy.layout.C1536;
import androidx.compose.foundation.text.AbstractC1821;
import androidx.compose.foundation.text.C1781;
import androidx.compose.foundation.text.C1801;
import androidx.compose.foundation.text.C1844;
import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.InterfaceC1851;
import androidx.compose.p001ui.AbstractC2953;
import androidx.compose.p001ui.C2950;
import androidx.compose.p001ui.C2952;
import androidx.compose.p001ui.C2958;
import androidx.compose.p001ui.InterfaceC2951;
import androidx.compose.p001ui.InterfaceC2962;
import androidx.compose.p001ui.draw.C2270;
import androidx.compose.p001ui.graphics.AbstractC2416;
import androidx.compose.p001ui.graphics.C2430;
import androidx.compose.p001ui.graphics.C2434;
import androidx.compose.p001ui.graphics.C2445;
import androidx.compose.p001ui.graphics.InterfaceC2436;
import androidx.compose.p001ui.graphics.drawscope.C2342;
import androidx.compose.p001ui.graphics.drawscope.C2343;
import androidx.compose.p001ui.graphics.drawscope.InterfaceC2339;
import androidx.compose.p001ui.input.pointer.AbstractC2457;
import androidx.compose.p001ui.input.pointer.AbstractC2481;
import androidx.compose.p001ui.input.pointer.C2456;
import androidx.compose.p001ui.input.pointer.C2462;
import androidx.compose.p001ui.input.pointer.C2478;
import androidx.compose.p001ui.input.pointer.C2487;
import androidx.compose.p001ui.input.pointer.InterfaceC2468;
import androidx.compose.p001ui.input.pointer.InterfaceC2470;
import androidx.compose.p001ui.input.pointer.PointerEventPass;
import androidx.compose.p001ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p001ui.layout.AbstractC2505;
import androidx.compose.p001ui.layout.InterfaceC2493;
import androidx.compose.p001ui.layout.InterfaceC2530;
import androidx.compose.p001ui.node.AbstractC2620;
import androidx.compose.p001ui.node.C2600;
import androidx.compose.p001ui.node.InterfaceC2619;
import androidx.compose.p001ui.platform.AbstractC2737;
import androidx.compose.p001ui.platform.InterfaceC2698;
import androidx.compose.p001ui.semantics.AbstractC2783;
import androidx.compose.p001ui.semantics.C2782;
import androidx.compose.p001ui.semantics.InterfaceC2779;
import androidx.compose.p001ui.text.AbstractC2882;
import androidx.compose.p001ui.text.C2867;
import androidx.compose.p001ui.text.C2868;
import androidx.compose.p001ui.text.C2869;
import androidx.compose.p001ui.text.C2888;
import androidx.compose.p001ui.text.C2896;
import androidx.compose.p001ui.text.C2899;
import androidx.compose.p001ui.text.style.ResolvedTextDirection;
import androidx.compose.p001ui.unit.LayoutDirection;
import androidx.compose.p001ui.window.AbstractC2924;
import androidx.compose.p001ui.window.C2923;
import androidx.compose.p001ui.window.SecureFlagPolicy;
import androidx.compose.runtime.AbstractC2202;
import androidx.compose.runtime.C2159;
import androidx.compose.runtime.C2188;
import androidx.compose.runtime.C2204;
import androidx.compose.runtime.C2224;
import androidx.compose.runtime.InterfaceC2208;
import androidx.compose.runtime.internal.AbstractC2089;
import androidx.compose.runtime.internal.C2077;
import androidx.compose.runtime.internal.C2088;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.AbstractC6017;
import kotlin.AbstractC6019;
import kotlin.C6008;
import kotlin.InterfaceC6016;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.AbstractC5176;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$LongRef;
import net.bytebuddy.jar.asm.Opcodes;
import p068.InterfaceC7372;
import p068.InterfaceC7383;
import p068.InterfaceC7387;
import p128.C8157;
import p128.C8158;
import p221.C8732;
import p221.InterfaceC8725;
import p228.C8780;
import p248.C8894;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.compose.foundation.text.selection.飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1733 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static C2342 f2885;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static C2430 f2886;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C2445 f2887;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C1749 m2361(C8894 c8894, C1753 c1753) {
        CrossStatus crossStatusM14112 = c8894.m14112();
        C1758 c1758 = (C1758) c8894.f22589;
        boolean z = crossStatusM14112 == CrossStatus.CROSSED;
        return new C1749(m2379(c1758, z, true, c1753), m2379(c1758, z, false, c1753), z);
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x011f  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2362(boolean z, ResolvedTextDirection resolvedTextDirection, C1720 c1720, InterfaceC2208 interfaceC2208, int i) {
        int i2;
        float fM13999;
        boolean zM2938;
        Object objM2905;
        C1801 c1801M2425;
        C2867 c2867;
        C2159 c2159 = (C2159) interfaceC2208;
        c2159.m2951(-1344558920);
        if ((i & 6) == 0) {
            i2 = (c2159.m2939(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c2159.m2922(resolvedTextDirection.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c2159.m2938(c1720) ? 256 : 128;
        }
        int i3 = 1;
        if (c2159.m2903(i2 & 1, (i2 & 147) != 146)) {
            int i4 = i2 & 14;
            boolean zM2920 = (i4 == 4) | c2159.m2920(c1720);
            Object objM29052 = c2159.m2905();
            C2188 c2188 = C2204.f4319;
            if (zM2920 || objM29052 == c2188) {
                objM29052 = new C1721(c1720, z);
                c2159.m2946(objM29052);
            }
            InterfaceC1851 interfaceC1851 = (InterfaceC1851) objM29052;
            boolean zM29382 = (i4 == 4) | c2159.m2938(c1720);
            Object objM29053 = c2159.m2905();
            if (zM29382 || objM29053 == c2188) {
                objM29053 = new C1771(c1720, z);
                c2159.m2946(objM29053);
            }
            InterfaceC1756 interfaceC1756 = (InterfaceC1756) objM29053;
            boolean zM4316 = C2869.m4316(c1720.m2319().f6291);
            int i5 = (int) (z ? c1720.m2319().f6291 >> 32 : c1720.m2319().f6291 & 4294967295L);
            C1781 c1781 = c1720.f2832;
            if (c1781 == null || (c1801M2425 = c1781.m2425()) == null || (c2867 = c1801M2425.f3090) == null || i5 < 0) {
                fM13999 = 0.0f;
                zM2938 = c2159.m2938(interfaceC1851);
                objM2905 = c2159.m2905();
                if (!zM2938 || objM2905 == c2188) {
                    objM2905 = new C1734(interfaceC1851, i3);
                    c2159.m2946(objM2905);
                }
                m2365(interfaceC1756, z, resolvedTextDirection, zM4316, 0L, fM13999, AbstractC2457.m3562(C2958.f6621, interfaceC1851, (PointerInputEventHandler) objM2905), c2159, (i2 << 3) & 1008);
            } else {
                C2868 c2868 = c2867.f6336;
                C2896 c2896 = c2867.f6335;
                if (c2868.f6342.f6474.length() != 0) {
                    int iMin = Math.min(c2896.m4348(i5), Math.min(c2896.f6449 - 1, c2896.f6445 - 1));
                    if (i5 <= c2896.m4349(iMin, false)) {
                        c2896.m4352(iMin);
                        ArrayList arrayList = c2896.f6451;
                        C2899 c2899 = (C2899) arrayList.get(AbstractC2882.m4327(iMin, arrayList));
                        C2888 c2888 = c2899.f6467;
                        int i6 = iMin - c2899.f6464;
                        C8780 c8780 = c2888.f6431;
                        fM13999 = c8780.m13999(i6) - c8780.m14005(i6);
                    }
                    zM2938 = c2159.m2938(interfaceC1851);
                    objM2905 = c2159.m2905();
                    if (!zM2938) {
                        objM2905 = new C1734(interfaceC1851, i3);
                        c2159.m2946(objM2905);
                        m2365(interfaceC1756, z, resolvedTextDirection, zM4316, 0L, fM13999, AbstractC2457.m3562(C2958.f6621, interfaceC1851, (PointerInputEventHandler) objM2905), c2159, (i2 << 3) & 1008);
                    }
                }
            }
        } else {
            c2159.m2899();
        }
        C2224 c2224M2935 = c2159.m2935();
        if (c2224M2935 != null) {
            c2224M2935.f4379 = new C1762(z, resolvedTextDirection, c1720, i);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final void m2363(InterfaceC2962 interfaceC2962, C2077 c2077, InterfaceC2208 interfaceC2208, int i) {
        C2159 c2159 = (C2159) interfaceC2208;
        c2159.m2951(-1854833411);
        int i2 = (c2159.m2920(interfaceC2962) ? 4 : 2) | i;
        if (c2159.m2903(i2 & 1, (i2 & 19) != 18)) {
            Object objM2905 = c2159.m2905();
            if (objM2905 == C2204.f4319) {
                objM2905 = C1730.f2879;
                c2159.m2946(objM2905);
            }
            InterfaceC2493 interfaceC2493 = (InterfaceC2493) objM2905;
            int iHashCode = Long.hashCode(c2159.f4182);
            C2088 c2088M2941 = c2159.m2941();
            InterfaceC2962 interfaceC2962M4421 = AbstractC2953.m4421(c2159, interfaceC2962);
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
            AbstractC2202.m3032(c2159, Integer.valueOf(iHashCode), C2600.f5533);
            AbstractC2202.m3041(c2159, C2600.f5532);
            AbstractC2202.m3032(c2159, interfaceC2962M4421, C2600.f5528);
            c2077.invoke(c2159, 6);
            c2159.m2937(true);
        } else {
            c2159.m2899();
        }
        C2224 c2224M2935 = c2159.m2935();
        if (c2224M2935 != null) {
            c2224M2935.f4379 = new C1727(interfaceC2962, c2077, i);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final void m2364(InterfaceC2962 interfaceC2962, InterfaceC7372 interfaceC7372, boolean z, InterfaceC2208 interfaceC2208, int i) {
        int i2;
        C2159 c2159 = (C2159) interfaceC2208;
        c2159.m2951(2111672474);
        if ((i & 6) == 0) {
            i2 = (c2159.m2920(interfaceC2962) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | (c2159.m2938(interfaceC7372) ? 32 : 16) | (c2159.m2939(z) ? 256 : 128);
        int i4 = 1;
        if (c2159.m2903(i3 & 1, (i3 & 147) != 146)) {
            C2782 c2782 = AbstractC1742.f2903;
            AbstractC1469.m1983(c2159, AbstractC2953.m4423(AbstractC1460.m1946(interfaceC2962, 25.0f, 25.0f), new C1844(interfaceC7372, i4, z)));
        } else {
            c2159.m2899();
        }
        C2224 c2224M2935 = c2159.m2935();
        if (c2224M2935 != null) {
            c2224M2935.f4379 = new C1762(interfaceC2962, interfaceC7372, z, i);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final void m2365(final InterfaceC1756 interfaceC1756, final boolean z, final ResolvedTextDirection resolvedTextDirection, final boolean z2, long j, final float f, final InterfaceC2962 interfaceC2962, InterfaceC2208 interfaceC2208, final int i) {
        int i2;
        final long j2;
        int i3;
        long j3;
        final boolean z3;
        C2159 c2159 = (C2159) interfaceC2208;
        c2159.m2951(-466280168);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? c2159.m2920(interfaceC1756) : c2159.m2938(interfaceC1756) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c2159.m2939(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c2159.m2922(resolvedTextDirection.ordinal()) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= c2159.m2939(z2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= 8192;
        }
        if ((1572864 & i) == 0) {
            i2 |= c2159.m2920(interfaceC2962) ? 1048576 : Opcodes.ASM8;
        }
        if (c2159.m2903(i2 & 1, (533651 & i2) != 533650)) {
            c2159.m2901();
            if ((i & 1) == 0 || c2159.m2913()) {
                i3 = i2 & (-57345);
                j3 = 9205357640488583168L;
            } else {
                c2159.m2899();
                i3 = i2 & (-57345);
                j3 = j;
            }
            c2159.m2934();
            if (z) {
                C2782 c2782 = AbstractC1742.f2903;
                z3 = (resolvedTextDirection == ResolvedTextDirection.Ltr && !z2) || (resolvedTextDirection == ResolvedTextDirection.Rtl && z2);
            } else {
                C2782 c27822 = AbstractC1742.f2903;
                z3 = (resolvedTextDirection != ResolvedTextDirection.Ltr || z2) && !(resolvedTextDirection == ResolvedTextDirection.Rtl && z2);
            }
            C2950 c2950 = z3 ? AbstractC2953.f6618 : AbstractC2953.f6619;
            int i4 = i3 & 14;
            boolean zM2939 = ((i3 & 112) == 32) | (i4 == 4 || ((i3 & 8) != 0 && c2159.m2938(interfaceC1756))) | c2159.m2939(z3);
            Object objM2905 = c2159.m2905();
            if (zM2939 || objM2905 == C2204.f4319) {
                objM2905 = new InterfaceC7387() { // from class: androidx.compose.foundation.text.selection.飘花落叶言子楪世苏兰哲
                    @Override // p068.InterfaceC7387
                    public final Object invoke(Object obj) {
                        InterfaceC2779 interfaceC2779 = (InterfaceC2779) obj;
                        long jMo2382 = interfaceC1756.mo2382();
                        interfaceC2779.mo4150(AbstractC1742.f2903, new C1731(z ? Handle.SelectionStart : Handle.SelectionEnd, jMo2382, z3 ? SelectionHandleAnchor.Left : SelectionHandleAnchor.Right, (9223372034707292159L & jMo2382) != 9205357640488583168L));
                        return C6008.f15084;
                    }
                };
                c2159.m2946(objM2905);
            }
            final InterfaceC2962 interfaceC2962M4209 = AbstractC2783.m4209(interfaceC2962, false, (InterfaceC7387) objM2905);
            final InterfaceC2698 interfaceC2698 = (InterfaceC2698) c2159.m2943(AbstractC2737.f5921);
            long j4 = j3;
            C2950 c29502 = c2950;
            j2 = j4;
            m2366(interfaceC1756, c29502, AbstractC2089.m2749(1365123137, new InterfaceC7383() { // from class: androidx.compose.foundation.text.selection.飘花落叶言子楪世哲苏兰
                @Override // p068.InterfaceC7383
                public final Object invoke(Object obj, Object obj2) {
                    InterfaceC2208 interfaceC22082 = (InterfaceC2208) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    C2159 c21592 = (C2159) interfaceC22082;
                    if (c21592.m2903(iIntValue & 1, (iIntValue & 3) != 2)) {
                        C1041 c1041Mo2988 = AbstractC2737.f5921.mo2988(interfaceC2698);
                        final long j5 = j2;
                        final boolean z4 = z3;
                        final InterfaceC2962 interfaceC29622 = interfaceC2962M4209;
                        final InterfaceC1756 interfaceC17562 = interfaceC1756;
                        AbstractC2202.m3047(c1041Mo2988, AbstractC2089.m2749(1260045569, new InterfaceC7383() { // from class: androidx.compose.foundation.text.selection.飘花落叶言子楪世兰苏哲
                            @Override // p068.InterfaceC7383
                            public final Object invoke(Object obj3, Object obj4) {
                                InterfaceC2208 interfaceC22083 = (InterfaceC2208) obj3;
                                int iIntValue2 = ((Integer) obj4).intValue();
                                final int i5 = 1;
                                final int i6 = 0;
                                C2159 c21593 = (C2159) interfaceC22083;
                                if (c21593.m2903(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    long j6 = j5;
                                    boolean z5 = z4;
                                    InterfaceC2962 interfaceC29623 = interfaceC29622;
                                    final InterfaceC1756 interfaceC17563 = interfaceC17562;
                                    C2188 c2188 = C2204.f4319;
                                    if (j6 != 9205357640488583168L) {
                                        c21593.m2952(3458246);
                                        C1470 c1470 = z5 ? AbstractC1469.f2112 : AbstractC1469.f2113;
                                        InterfaceC2962 interfaceC2962M1940 = AbstractC1460.m1940(interfaceC29623, C8732.m13912(j6), C8732.m13913(j6), 0.0f, 0.0f, 12);
                                        C1501 c1501M2020 = AbstractC1499.m2020(c1470, C2952.f6607, c21593, 0);
                                        int iHashCode = Long.hashCode(c21593.f4182);
                                        C2088 c2088M2941 = c21593.m2941();
                                        InterfaceC2962 interfaceC2962M4421 = AbstractC2953.m4421(c21593, interfaceC2962M1940);
                                        InterfaceC2619.f5567.getClass();
                                        InterfaceC7372 interfaceC7372 = C2600.f5530;
                                        c21593.m2956();
                                        if (c21593.f4183) {
                                            c21593.m2940(interfaceC7372);
                                        } else {
                                            c21593.m2950();
                                        }
                                        AbstractC2202.m3032(c21593, c1501M2020, C2600.f5526);
                                        AbstractC2202.m3032(c21593, c2088M2941, C2600.f5527);
                                        AbstractC2202.m3032(c21593, Integer.valueOf(iHashCode), C2600.f5533);
                                        AbstractC2202.m3041(c21593, C2600.f5532);
                                        AbstractC2202.m3032(c21593, interfaceC2962M4421, C2600.f5528);
                                        boolean zM2938 = c21593.m2938(interfaceC17563);
                                        Object objM29052 = c21593.m2905();
                                        if (zM2938 || objM29052 == c2188) {
                                            objM29052 = new InterfaceC7372() { // from class: androidx.compose.foundation.text.selection.飘花落叶言子楪世兰哲苏
                                                @Override // p068.InterfaceC7372
                                                public final Object invoke() {
                                                    int i7 = i6;
                                                    InterfaceC1756 interfaceC17564 = interfaceC17563;
                                                    switch (i7) {
                                                        case 0:
                                                            return Boolean.valueOf((9223372034707292159L & interfaceC17564.mo2382()) != 9205357640488583168L);
                                                        default:
                                                            return Boolean.valueOf((9223372034707292159L & interfaceC17564.mo2382()) != 9205357640488583168L);
                                                    }
                                                }
                                            };
                                            c21593.m2946(objM29052);
                                        }
                                        AbstractC1733.m2364(C2958.f6621, (InterfaceC7372) objM29052, z5, c21593, 6);
                                        c21593.m2937(true);
                                        c21593.m2937(false);
                                    } else {
                                        c21593.m2952(4389176);
                                        boolean zM29382 = c21593.m2938(interfaceC17563);
                                        Object objM29053 = c21593.m2905();
                                        if (zM29382 || objM29053 == c2188) {
                                            objM29053 = new InterfaceC7372() { // from class: androidx.compose.foundation.text.selection.飘花落叶言子楪世兰哲苏
                                                @Override // p068.InterfaceC7372
                                                public final Object invoke() {
                                                    int i7 = i5;
                                                    InterfaceC1756 interfaceC17564 = interfaceC17563;
                                                    switch (i7) {
                                                        case 0:
                                                            return Boolean.valueOf((9223372034707292159L & interfaceC17564.mo2382()) != 9205357640488583168L);
                                                        default:
                                                            return Boolean.valueOf((9223372034707292159L & interfaceC17564.mo2382()) != 9205357640488583168L);
                                                    }
                                                }
                                            };
                                            c21593.m2946(objM29053);
                                        }
                                        AbstractC1733.m2364(interfaceC29623, (InterfaceC7372) objM29053, z5, c21593, 0);
                                        c21593.m2937(false);
                                    }
                                } else {
                                    c21593.m2899();
                                }
                                return C6008.f15084;
                            }
                        }, c21592), c21592, 56);
                    } else {
                        c21592.m2899();
                    }
                    return C6008.f15084;
                }
            }, c2159), c2159, i4 | 384);
        } else {
            c2159.m2899();
            j2 = j;
        }
        C2224 c2224M2935 = c2159.m2935();
        if (c2224M2935 != null) {
            final long j5 = j2;
            c2224M2935.f4379 = new InterfaceC7383() { // from class: androidx.compose.foundation.text.selection.飘花落叶言子楪世哲兰苏
                @Override // p068.InterfaceC7383
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    AbstractC1733.m2365(interfaceC1756, z, resolvedTextDirection, z2, j5, f, interfaceC2962, (InterfaceC2208) obj, AbstractC2202.m3031(i | 1));
                    return C6008.f15084;
                }
            };
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final void m2366(InterfaceC1756 interfaceC1756, InterfaceC2951 interfaceC2951, C2077 c2077, InterfaceC2208 interfaceC2208, int i) {
        int i2;
        C2159 c2159 = (C2159) interfaceC2208;
        c2159.m2951(-1090171650);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? c2159.m2920(interfaceC1756) : c2159.m2938(interfaceC1756) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c2159.m2920(interfaceC2951) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c2159.m2938(c2077) ? 256 : 128;
        }
        boolean z = true;
        if (c2159.m2903(i2 & 1, (i2 & 147) != 146)) {
            boolean z2 = (i2 & 112) == 32;
            if ((i2 & 14) != 4 && ((i2 & 8) == 0 || !c2159.m2920(interfaceC1756))) {
                z = false;
            }
            boolean z3 = z2 | z;
            Object objM2905 = c2159.m2905();
            if (z3 || objM2905 == C2204.f4319) {
                objM2905 = new C1763(interfaceC2951, interfaceC1756);
                c2159.m2946(objM2905);
            }
            AbstractC2924.m4395((C1763) objM2905, null, new C2923(false, SecureFlagPolicy.Inherit, false), c2077, c2159, ((i2 << 3) & 7168) | 384, 2);
        } else {
            c2159.m2899();
        }
        C2224 c2224M2935 = c2159.m2935();
        if (c2224M2935 != null) {
            c2224M2935.f4379 = new C1536(interfaceC1756, interfaceC2951, c2077, i, 4);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final C8157 m2367(InterfaceC2530 interfaceC2530) {
        C8157 c8157M3659 = AbstractC2505.m3659(interfaceC2530, true);
        long jMo3638 = interfaceC2530.mo3638(c8157M3659.m13077());
        float f = c8157M3659.f19883;
        float f2 = c8157M3659.f19882;
        long jMo36382 = interfaceC2530.mo3638((((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L));
        return new C8157(Float.intBitsToFloat((int) (jMo3638 >> 32)), Float.intBitsToFloat((int) (jMo3638 & 4294967295L)), Float.intBitsToFloat((int) (jMo36382 >> 32)), Float.intBitsToFloat((int) (jMo36382 & 4294967295L)));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final C2445 m2368(C2270 c2270, float f) {
        int iCeil = ((int) Math.ceil(f)) * 2;
        C2445 c2445M3457 = f2887;
        C2430 c2430M3444 = f2886;
        C2342 c2342 = f2885;
        if (c2445M3457 == null || c2430M3444 == null) {
            c2445M3457 = AbstractC2416.m3457(iCeil, iCeil, 1);
            f2887 = c2445M3457;
            c2430M3444 = AbstractC2416.m3444(c2445M3457);
            f2886 = c2430M3444;
        } else {
            Bitmap bitmap = c2445M3457.f5064;
            if (iCeil > bitmap.getWidth() || iCeil > bitmap.getHeight()) {
            }
        }
        C2445 c2445 = c2445M3457;
        C2430 c2430 = c2430M3444;
        if (c2342 == null) {
            c2342 = new C2342();
            f2885 = c2342;
        }
        C2342 c23422 = c2342;
        C2343 c2343 = c23422.f4631;
        LayoutDirection layoutDirection = c2270.f4461.getLayoutDirection();
        Bitmap bitmap2 = c2445.f5064;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(bitmap2.getWidth())) << 32) | (((long) Float.floatToRawIntBits(bitmap2.getHeight())) & 4294967295L);
        InterfaceC8725 interfaceC8725 = c2343.f4635;
        LayoutDirection layoutDirection2 = c2343.f4634;
        InterfaceC2436 interfaceC2436 = c2343.f4633;
        long j = c2343.f4632;
        c2343.f4635 = c2270;
        c2343.f4634 = layoutDirection;
        c2343.f4633 = c2430;
        c2343.f4632 = jFloatToRawIntBits;
        c2430.mo3237();
        InterfaceC2339.m3256(c23422, C2434.f5041, c23422.mo3265(), 0.0f, null, 58);
        InterfaceC2339.m3256(c23422, AbstractC2416.m3440(4278190080L), (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L), 0.0f, null, 120);
        InterfaceC2339.m3262(c23422, AbstractC2416.m3440(4278190080L), f, (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L), 120);
        c2430.mo3249();
        c2343.f4635 = interfaceC8725;
        c2343.f4634 = layoutDirection2;
        c2343.f4633 = interfaceC2436;
        c2343.f4632 = j;
        return c2445;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static final boolean m2369(C8157 c8157, long j) {
        float f = c8157.f19885;
        float f2 = c8157.f19883;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        if (f > fIntBitsToFloat || fIntBitsToFloat > f2) {
            return false;
        }
        float f3 = c8157.f19884;
        float f4 = c8157.f19882;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        return f3 <= fIntBitsToFloat2 && fIntBitsToFloat2 <= f4;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x008a A[Catch: all -> 0x0051, TryCatch #0 {all -> 0x0051, blocks: (B:20:0x004d, B:31:0x0082, B:33:0x008a, B:35:0x0098, B:37:0x00a4, B:28:0x006b), top: B:69:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0107 A[Catch: all -> 0x003a, TryCatch #1 {all -> 0x003a, blocks: (B:13:0x0035, B:54:0x00ed, B:56:0x00f5, B:58:0x00f9, B:60:0x0107, B:62:0x0113, B:50:0x00c8), top: B:69:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m2370(InterfaceC2468 interfaceC2468, InterfaceC1764 interfaceC1764, C1765 c1765, C2487 c2487, BaseContinuationImpl baseContinuationImpl) {
        SelectionGesturesKt$mouseSelection$1 selectionGesturesKt$mouseSelection$1;
        InterfaceC2468 interfaceC24682;
        Ref$BooleanRef ref$BooleanRef;
        int size;
        C1123 c1123 = C1753.f2945;
        if (baseContinuationImpl instanceof SelectionGesturesKt$mouseSelection$1) {
            selectionGesturesKt$mouseSelection$1 = (SelectionGesturesKt$mouseSelection$1) baseContinuationImpl;
            int i = selectionGesturesKt$mouseSelection$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                selectionGesturesKt$mouseSelection$1.label = i - Integer.MIN_VALUE;
            } else {
                selectionGesturesKt$mouseSelection$1 = new SelectionGesturesKt$mouseSelection$1(baseContinuationImpl);
            }
        }
        Object objM1802 = selectionGesturesKt$mouseSelection$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = selectionGesturesKt$mouseSelection$1.label;
        int i3 = 0;
        int i4 = 1;
        try {
            try {
                if (i2 == 0) {
                    AbstractC6017.m10769(objM1802);
                    C2478 c2478 = (C2478) c2487.f5197.get(0);
                    if ((c2487.f5193 & 1) == 0) {
                        int i5 = c1765.f2980;
                        C1123 c11232 = i5 != 1 ? i5 != 2 ? C1753.f2943 : C1753.f2944 : c1123;
                        if (interfaceC1764.mo2339(c2478.f5152, c11232, i5)) {
                            Ref$BooleanRef ref$BooleanRef2 = new Ref$BooleanRef();
                            ref$BooleanRef2.element = !c11232.equals(c1123);
                            long j = c2478.f5154;
                            C1773 c1773 = new C1773(interfaceC1764, c11232, ref$BooleanRef2, i4);
                            selectionGesturesKt$mouseSelection$1.L$0 = interfaceC2468;
                            selectionGesturesKt$mouseSelection$1.L$1 = interfaceC1764;
                            selectionGesturesKt$mouseSelection$1.L$2 = ref$BooleanRef2;
                            selectionGesturesKt$mouseSelection$1.label = 2;
                            objM1802 = AbstractC1309.m1802(interfaceC2468, j, c1773, selectionGesturesKt$mouseSelection$1);
                            if (objM1802 != coroutineSingletons) {
                                interfaceC24682 = interfaceC2468;
                                ref$BooleanRef = ref$BooleanRef2;
                                if (((Boolean) objM1802).booleanValue()) {
                                    List list = ((C2456) interfaceC24682).f5086.f5102.f5197;
                                    size = list.size();
                                    while (i3 < size) {
                                    }
                                }
                                interfaceC1764.mo2340();
                            }
                            return coroutineSingletons;
                        }
                    } else if (interfaceC1764.mo2337(c2478.f5152)) {
                        c2478.m3584();
                        long j2 = c2478.f5154;
                        C1752 c1752 = new C1752(interfaceC1764, 0);
                        selectionGesturesKt$mouseSelection$1.L$0 = interfaceC2468;
                        selectionGesturesKt$mouseSelection$1.L$1 = interfaceC1764;
                        selectionGesturesKt$mouseSelection$1.label = 1;
                        objM1802 = AbstractC1309.m1802(interfaceC2468, j2, c1752, selectionGesturesKt$mouseSelection$1);
                        if (objM1802 == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        if (((Boolean) objM1802).booleanValue()) {
                        }
                    }
                } else if (i2 == 1) {
                    interfaceC1764 = (InterfaceC1764) selectionGesturesKt$mouseSelection$1.L$1;
                    interfaceC2468 = (InterfaceC2468) selectionGesturesKt$mouseSelection$1.L$0;
                    AbstractC6017.m10769(objM1802);
                    if (((Boolean) objM1802).booleanValue()) {
                        List list2 = ((C2456) interfaceC2468).f5086.f5102.f5197;
                        int size2 = list2.size();
                        while (i3 < size2) {
                            C2478 c24782 = (C2478) list2.get(i3);
                            if (AbstractC2481.m3588(c24782)) {
                                c24782.m3584();
                            }
                            i3++;
                        }
                    }
                } else {
                    if (i2 != 2) {
                        C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ref$BooleanRef = (Ref$BooleanRef) selectionGesturesKt$mouseSelection$1.L$2;
                    interfaceC1764 = (InterfaceC1764) selectionGesturesKt$mouseSelection$1.L$1;
                    interfaceC24682 = (InterfaceC2468) selectionGesturesKt$mouseSelection$1.L$0;
                    AbstractC6017.m10769(objM1802);
                    if (((Boolean) objM1802).booleanValue() && ref$BooleanRef.element) {
                        List list3 = ((C2456) interfaceC24682).f5086.f5102.f5197;
                        size = list3.size();
                        while (i3 < size) {
                            C2478 c24783 = (C2478) list3.get(i3);
                            if (AbstractC2481.m3588(c24783)) {
                                c24783.m3584();
                            }
                            i3++;
                        }
                    }
                    interfaceC1764.mo2340();
                }
                return C6008.f15084;
            } finally {
            }
        } finally {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00aa, code lost:
    
        if (r15 == r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m2371(InterfaceC2468 interfaceC2468, InterfaceC1851 interfaceC1851, C2487 c2487, BaseContinuationImpl baseContinuationImpl) {
        SelectionGesturesKt$touchSelectionFirstPress$1 selectionGesturesKt$touchSelectionFirstPress$1;
        C2478 c2478;
        InterfaceC2468 interfaceC24682;
        if (baseContinuationImpl instanceof SelectionGesturesKt$touchSelectionFirstPress$1) {
            selectionGesturesKt$touchSelectionFirstPress$1 = (SelectionGesturesKt$touchSelectionFirstPress$1) baseContinuationImpl;
            int i = selectionGesturesKt$touchSelectionFirstPress$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                selectionGesturesKt$touchSelectionFirstPress$1.label = i - Integer.MIN_VALUE;
            } else {
                selectionGesturesKt$touchSelectionFirstPress$1 = new SelectionGesturesKt$touchSelectionFirstPress$1(baseContinuationImpl);
            }
        }
        Object objM1797 = selectionGesturesKt$touchSelectionFirstPress$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = selectionGesturesKt$touchSelectionFirstPress$1.label;
        boolean z = true;
        try {
            if (i2 == 0) {
                AbstractC6017.m10769(objM1797);
                c2478 = (C2478) AbstractC5176.m9379(c2487.f5197);
                long j = c2478.f5154;
                selectionGesturesKt$touchSelectionFirstPress$1.L$0 = interfaceC2468;
                selectionGesturesKt$touchSelectionFirstPress$1.L$1 = interfaceC1851;
                selectionGesturesKt$touchSelectionFirstPress$1.L$2 = c2478;
                selectionGesturesKt$touchSelectionFirstPress$1.label = 1;
                objM1797 = AbstractC1309.m1797(interfaceC2468, j, selectionGesturesKt$touchSelectionFirstPress$1);
                if (objM1797 == coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                interfaceC1851 = (InterfaceC1851) selectionGesturesKt$touchSelectionFirstPress$1.L$1;
                InterfaceC2468 interfaceC24683 = (InterfaceC2468) selectionGesturesKt$touchSelectionFirstPress$1.L$0;
                AbstractC6017.m10769(objM1797);
                interfaceC24682 = interfaceC24683;
                if (((Boolean) objM1797).booleanValue()) {
                    List list = ((C2456) interfaceC24682).f5086.f5102.f5197;
                    int size = list.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        C2478 c24782 = (C2478) list.get(i3);
                        if (AbstractC2481.m3588(c24782)) {
                            c24782.m3584();
                        }
                    }
                    interfaceC1851.mo2308();
                } else {
                    interfaceC1851.onCancel();
                }
                return C6008.f15084;
            }
            C2478 c24783 = (C2478) selectionGesturesKt$touchSelectionFirstPress$1.L$2;
            interfaceC1851 = (InterfaceC1851) selectionGesturesKt$touchSelectionFirstPress$1.L$1;
            InterfaceC2468 interfaceC24684 = (InterfaceC2468) selectionGesturesKt$touchSelectionFirstPress$1.L$0;
            AbstractC6017.m10769(objM1797);
            c2478 = c24783;
            interfaceC2468 = interfaceC24684;
            C2478 c24784 = (C2478) objM1797;
            if (c24784 != null) {
                long j2 = c24784.f5152;
                C2456 c2456 = (C2456) interfaceC2468;
                if (C8158.m13086(C8158.m13085(c2478.f5152, j2)) >= AbstractC1309.m1804(c2456.m3557(), c2478.f5164)) {
                    z = false;
                }
                if (z) {
                    interfaceC1851.mo2307(j2, AbstractC1732.f2884);
                    long j3 = c24784.f5154;
                    C1736 c1736 = new C1736(interfaceC1851, 0);
                    selectionGesturesKt$touchSelectionFirstPress$1.L$0 = c2456;
                    selectionGesturesKt$touchSelectionFirstPress$1.L$1 = interfaceC1851;
                    selectionGesturesKt$touchSelectionFirstPress$1.L$2 = null;
                    selectionGesturesKt$touchSelectionFirstPress$1.label = 2;
                    objM1797 = AbstractC1309.m1802(c2456, j3, c1736, selectionGesturesKt$touchSelectionFirstPress$1);
                    interfaceC24682 = c2456;
                }
            }
            return C6008.f15084;
        } catch (CancellationException e) {
            interfaceC1851.onCancel();
            throw e;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static final ResolvedTextDirection m2372(C2867 c2867, int i) {
        C2868 c2868 = c2867.f6336;
        C2896 c2896 = c2867.f6335;
        if (c2868.f6342.f6474.length() != 0) {
            int iM4348 = c2896.m4348(i);
            if ((i != 0 && iM4348 == c2896.m4348(i - 1)) || (i != c2867.f6336.f6342.f6474.length() && iM4348 == c2896.m4348(i + 1))) {
                return c2867.m4305(i);
            }
        }
        return c2867.m4306(i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final boolean m2373(C1720 c1720, boolean z) {
        InterfaceC2530 interfaceC2530M2426;
        C1781 c1781 = c1720.f2832;
        if (c1781 == null || (interfaceC2530M2426 = c1781.m2426()) == null) {
            return false;
        }
        return m2369(m2367(interfaceC2530M2426), c1720.m2328(z));
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ce, code lost:
    
        if (r15 == r1) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m2374(InterfaceC2468 interfaceC2468, InterfaceC1851 interfaceC1851, C2487 c2487, int i, BaseContinuationImpl baseContinuationImpl) {
        SelectionGesturesKt$touchSelectionSubsequentPress$1 selectionGesturesKt$touchSelectionSubsequentPress$1;
        long j;
        Ref$LongRef ref$LongRef;
        InterfaceC2468 interfaceC24682;
        InterfaceC2468 interfaceC24683;
        if (baseContinuationImpl instanceof SelectionGesturesKt$touchSelectionSubsequentPress$1) {
            selectionGesturesKt$touchSelectionSubsequentPress$1 = (SelectionGesturesKt$touchSelectionSubsequentPress$1) baseContinuationImpl;
            int i2 = selectionGesturesKt$touchSelectionSubsequentPress$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                selectionGesturesKt$touchSelectionSubsequentPress$1.label = i2 - Integer.MIN_VALUE;
            } else {
                selectionGesturesKt$touchSelectionSubsequentPress$1 = new SelectionGesturesKt$touchSelectionSubsequentPress$1(baseContinuationImpl);
            }
        }
        Object objM3560 = selectionGesturesKt$touchSelectionSubsequentPress$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = selectionGesturesKt$touchSelectionSubsequentPress$1.label;
        C6008 c6008 = C6008.f15084;
        try {
            if (i3 == 0) {
                AbstractC6017.m10769(objM3560);
                C2478 c2478 = (C2478) AbstractC5176.m9379(c2487.f5197);
                j = c2478.f5154;
                interfaceC1851.mo2307(c2478.f5152, i > 2 ? C1753.f2943 : C1753.f2944);
                ref$LongRef = new Ref$LongRef();
                ref$LongRef.element = 9205357640488583168L;
                C2456 c2456 = (C2456) interfaceC2468;
                long jMo3840 = c2456.m3557().mo3840();
                C0123xcb1d223 c0123xcb1d223 = new C0123xcb1d223(j, ref$LongRef, null);
                selectionGesturesKt$touchSelectionSubsequentPress$1.L$0 = c2456;
                selectionGesturesKt$touchSelectionSubsequentPress$1.L$1 = interfaceC1851;
                selectionGesturesKt$touchSelectionSubsequentPress$1.L$2 = ref$LongRef;
                selectionGesturesKt$touchSelectionSubsequentPress$1.J$0 = j;
                selectionGesturesKt$touchSelectionSubsequentPress$1.label = 1;
                objM3560 = c2456.m3560(jMo3840, c0123xcb1d223, selectionGesturesKt$touchSelectionSubsequentPress$1);
                interfaceC24682 = c2456;
                if (objM3560 == coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                interfaceC1851 = (InterfaceC1851) selectionGesturesKt$touchSelectionSubsequentPress$1.L$1;
                InterfaceC2468 interfaceC24684 = (InterfaceC2468) selectionGesturesKt$touchSelectionSubsequentPress$1.L$0;
                AbstractC6017.m10769(objM3560);
                interfaceC24683 = interfaceC24684;
                if (!((Boolean) objM3560).booleanValue()) {
                    interfaceC1851.onCancel();
                    return c6008;
                }
                List list = ((C2456) interfaceC24683).f5086.f5102.f5197;
                int size = list.size();
                for (int i4 = 0; i4 < size; i4++) {
                    C2478 c24782 = (C2478) list.get(i4);
                    if (AbstractC2481.m3588(c24782)) {
                        c24782.m3584();
                    }
                }
                interfaceC1851.mo2308();
                return c6008;
            }
            long j2 = selectionGesturesKt$touchSelectionSubsequentPress$1.J$0;
            ref$LongRef = (Ref$LongRef) selectionGesturesKt$touchSelectionSubsequentPress$1.L$2;
            InterfaceC1851 interfaceC18512 = (InterfaceC1851) selectionGesturesKt$touchSelectionSubsequentPress$1.L$1;
            InterfaceC2468 interfaceC24685 = (InterfaceC2468) selectionGesturesKt$touchSelectionSubsequentPress$1.L$0;
            try {
                AbstractC6017.m10769(objM3560);
                j = j2;
                interfaceC1851 = interfaceC18512;
                interfaceC24682 = interfaceC24685;
            } catch (CancellationException e) {
                e = e;
                interfaceC1851 = interfaceC18512;
                interfaceC1851.onCancel();
                throw e;
            }
            DownResolution downResolution = (DownResolution) objM3560;
            if (downResolution == null) {
                downResolution = DownResolution.Timeout;
            }
            if (downResolution == DownResolution.Cancel) {
                interfaceC1851.onCancel();
                return c6008;
            }
            if (downResolution == DownResolution.f10Up) {
                interfaceC1851.mo2308();
                return c6008;
            }
            if (downResolution == DownResolution.Drag) {
                interfaceC1851.mo2304(ref$LongRef.element);
            }
            C1736 c1736 = new C1736(interfaceC1851, 1);
            selectionGesturesKt$touchSelectionSubsequentPress$1.L$0 = interfaceC24682;
            selectionGesturesKt$touchSelectionSubsequentPress$1.L$1 = interfaceC1851;
            selectionGesturesKt$touchSelectionSubsequentPress$1.L$2 = null;
            selectionGesturesKt$touchSelectionSubsequentPress$1.label = 2;
            objM3560 = AbstractC1309.m1802(interfaceC24682, j, c1736, selectionGesturesKt$touchSelectionSubsequentPress$1);
            interfaceC24683 = interfaceC24682;
        } catch (CancellationException e2) {
            e = e2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0041 -> B:18:0x0044). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m2375(InterfaceC2468 interfaceC2468, BaseContinuationImpl baseContinuationImpl) {
        SelectionGesturesKt$awaitDown$1 selectionGesturesKt$awaitDown$1;
        int size;
        int i;
        if (baseContinuationImpl instanceof SelectionGesturesKt$awaitDown$1) {
            selectionGesturesKt$awaitDown$1 = (SelectionGesturesKt$awaitDown$1) baseContinuationImpl;
            int i2 = selectionGesturesKt$awaitDown$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                selectionGesturesKt$awaitDown$1.label = i2 - Integer.MIN_VALUE;
            } else {
                selectionGesturesKt$awaitDown$1 = new SelectionGesturesKt$awaitDown$1(baseContinuationImpl);
            }
        }
        Object objM3559 = selectionGesturesKt$awaitDown$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = selectionGesturesKt$awaitDown$1.label;
        if (i3 == 0) {
            AbstractC6017.m10769(objM3559);
            PointerEventPass pointerEventPass = PointerEventPass.Main;
            selectionGesturesKt$awaitDown$1.L$0 = interfaceC2468;
            selectionGesturesKt$awaitDown$1.label = 1;
            C2456 c2456 = (C2456) interfaceC2468;
            objM3559 = c2456.m3559(pointerEventPass, selectionGesturesKt$awaitDown$1);
            interfaceC2468 = c2456;
            if (objM3559 == coroutineSingletons) {
            }
            C2487 c2487 = (C2487) objM3559;
            List list = c2487.f5197;
            size = list.size();
            i = 0;
            while (i < size) {
            }
            return c2487;
        }
        if (i3 != 1) {
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        InterfaceC2468 interfaceC24682 = (InterfaceC2468) selectionGesturesKt$awaitDown$1.L$0;
        AbstractC6017.m10769(objM3559);
        interfaceC2468 = interfaceC24682;
        C2487 c24872 = (C2487) objM3559;
        List list2 = c24872.f5197;
        size = list2.size();
        i = 0;
        while (i < size) {
            if (AbstractC2481.m3590((C2478) list2.get(i))) {
                i++;
            } else {
                PointerEventPass pointerEventPass2 = PointerEventPass.Main;
                selectionGesturesKt$awaitDown$1.L$0 = interfaceC2468;
                selectionGesturesKt$awaitDown$1.label = 1;
                C2456 c24562 = (C2456) interfaceC2468;
                objM3559 = c24562.m3559(pointerEventPass2, selectionGesturesKt$awaitDown$1);
                interfaceC2468 = c24562;
                if (objM3559 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                C2487 c248722 = (C2487) objM3559;
                List list22 = c248722.f5197;
                size = list22.size();
                i = 0;
                while (i < size) {
                }
            }
        }
        return c248722;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final Object m2376(InterfaceC2470 interfaceC2470, InterfaceC1764 interfaceC1764, InterfaceC1851 interfaceC1851, InterfaceC5189 interfaceC5189) {
        C2462 c2462 = (C2462) interfaceC2470;
        c2462.getClass();
        Object objM1871 = AbstractC1362.m1871(interfaceC2470, new SelectionGesturesKt$awaitSelectionGestures$2(new C1765(AbstractC2620.m3906(c2462).f5441), interfaceC1764, interfaceC1851, null), interfaceC5189);
        return objM1871 == CoroutineSingletons.COROUTINE_SUSPENDED ? objM1871 : C6008.f15084;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final C1750 m2377(C1750 c1750, C1758 c1758, int i) {
        ResolvedTextDirection resolvedTextDirectionM4305 = ((C2867) c1758.f2955).m4305(i);
        long j = c1750.f2933;
        c1750.getClass();
        return new C1750(resolvedTextDirectionM4305, i, j);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final C1750 m2378(final C8894 c8894, final C1758 c1758, C1750 c1750) {
        int i = c1758.f2957;
        int i2 = c1758.f2958;
        boolean z = c8894.f22590;
        final int i3 = z ? i2 : i;
        C2867 c2867 = (C2867) c1758.f2955;
        int i4 = c1758.f2956;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final InterfaceC6016 interfaceC6016M10774 = AbstractC6019.m10774(lazyThreadSafetyMode, new C1754(c1758, i3, 0));
        final int i5 = z ? i : i2;
        InterfaceC6016 interfaceC6016M107742 = AbstractC6019.m10774(lazyThreadSafetyMode, new InterfaceC7372() { // from class: androidx.compose.foundation.text.selection.飘花落叶言子楪兰哲世苏
            @Override // p068.InterfaceC7372
            public final Object invoke() {
                C1758 c17582 = c1758;
                C2867 c28672 = (C2867) c17582.f2955;
                int iIntValue = ((Number) interfaceC6016M10774.getValue()).intValue();
                C8894 c88942 = c8894;
                boolean z2 = c88942.f22590;
                boolean z3 = c88942.m14112() == CrossStatus.CROSSED;
                int i6 = i3;
                long jM4309 = c28672.m4309(i6);
                int i7 = C2869.f6347;
                int iM4307 = (int) (jM4309 >> 32);
                C2896 c2896 = c28672.f6335;
                int iM4348 = c2896.m4348(iM4307);
                int i8 = c2896.f6445;
                if (iM4348 != iIntValue) {
                    iM4307 = iIntValue >= i8 ? c28672.m4307(i8 - 1) : c28672.m4307(iIntValue);
                }
                int iM4349 = (int) (jM4309 & 4294967295L);
                if (c2896.m4348(iM4349) != iIntValue) {
                    C2896 c28962 = c28672.f6335;
                    iM4349 = iIntValue >= i8 ? c28962.m4349(i8 - 1, false) : c28962.m4349(iIntValue, false);
                }
                int i9 = i5;
                if (iM4307 == i9) {
                    return c17582.m2387(iM4349);
                }
                if (iM4349 == i9) {
                    return c17582.m2387(iM4307);
                }
                if (!(z2 ^ z3) ? i6 >= iM4307 : i6 > iM4349) {
                    iM4307 = iM4349;
                }
                return c17582.m2387(iM4307);
            }
        });
        if (1 != c1750.f2933) {
            return (C1750) interfaceC6016M107742.getValue();
        }
        if (i3 == i4) {
            return c1750;
        }
        if (((Number) interfaceC6016M10774.getValue()).intValue() != c2867.f6335.m4348(i4)) {
            return (C1750) interfaceC6016M107742.getValue();
        }
        int i6 = c1750.f2934;
        long jM4309 = c2867.m4309(i6);
        if (i4 != -1) {
            if (i3 != i4) {
                if (((z ? 1 : 0) ^ ((i2 < i ? CrossStatus.NOT_CROSSED : i2 > i ? CrossStatus.CROSSED : CrossStatus.COLLAPSED) == CrossStatus.CROSSED ? 1 : 0)) == 0) {
                }
            }
            return c1758.m2387(i3);
        }
        int i7 = C2869.f6347;
        return (i6 == ((int) (jM4309 >> 32)) || i6 == ((int) (jM4309 & 4294967295L))) ? (C1750) interfaceC6016M107742.getValue() : c1758.m2387(i3);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final C1750 m2379(C1758 c1758, boolean z, boolean z2, C1753 c1753) {
        long jM4330;
        long j;
        int i = z2 ? c1758.f2958 : c1758.f2957;
        switch (c1753.f2949) {
            case 0:
                String str = ((C2867) c1758.f2955).f6336.f6342.f6474;
                jM4330 = AbstractC2882.m4330(AbstractC1821.m2466(i, str), AbstractC1821.m2465(i, str));
                break;
            default:
                jM4330 = ((C2867) c1758.f2955).m4309(i);
                break;
        }
        if (z ^ z2) {
            int i2 = C2869.f6347;
            j = jM4330 >> 32;
        } else {
            int i3 = C2869.f6347;
            j = 4294967295L & jM4330;
        }
        return c1758.m2387((int) j);
    }
}
