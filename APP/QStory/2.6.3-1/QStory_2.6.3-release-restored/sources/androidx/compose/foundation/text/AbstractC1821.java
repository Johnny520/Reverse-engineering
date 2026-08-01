package androidx.compose.foundation.text;

import android.content.Context;
import android.os.Build;
import android.text.Spanned;
import android.view.KeyEvent;
import androidx.activity.AbstractC0900;
import androidx.activity.RunnableC0889;
import androidx.activity.compose.C0848;
import androidx.activity.compose.C0849;
import androidx.appcompat.app.C0923;
import androidx.appcompat.app.C0960;
import androidx.collection.C1123;
import androidx.compose.animation.core.C1177;
import androidx.compose.animation.core.C1194;
import androidx.compose.animation.core.C1196;
import androidx.compose.foundation.AbstractC1910;
import androidx.compose.foundation.AbstractC1913;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.AbstractC1460;
import androidx.compose.foundation.layout.AbstractC1484;
import androidx.compose.foundation.lazy.C1597;
import androidx.compose.foundation.relocation.AbstractC1613;
import androidx.compose.foundation.relocation.C1614;
import androidx.compose.foundation.relocation.InterfaceC1616;
import androidx.compose.foundation.selection.C1618;
import androidx.compose.foundation.text.contextmenu.internal.AbstractC1648;
import androidx.compose.foundation.text.contextmenu.modifier.AbstractC1665;
import androidx.compose.foundation.text.handwriting.AbstractC1678;
import androidx.compose.foundation.text.input.internal.AbstractC1690;
import androidx.compose.foundation.text.input.internal.AbstractC1695;
import androidx.compose.foundation.text.input.internal.C1698;
import androidx.compose.foundation.text.input.internal.C1712;
import androidx.compose.foundation.text.input.internal.C1717;
import androidx.compose.foundation.text.selection.AbstractC1728;
import androidx.compose.foundation.text.selection.AbstractC1733;
import androidx.compose.foundation.text.selection.AbstractC1757;
import androidx.compose.foundation.text.selection.AbstractC1767;
import androidx.compose.foundation.text.selection.C1720;
import androidx.compose.foundation.text.selection.C1722;
import androidx.compose.foundation.text.selection.C1727;
import androidx.compose.foundation.text.selection.C1734;
import androidx.compose.foundation.text.selection.C1760;
import androidx.compose.foundation.text.selection.C1768;
import androidx.compose.foundation.text.selection.C1769;
import androidx.compose.foundation.text.selection.InterfaceC1755;
import androidx.compose.foundation.text.selection.InterfaceC1756;
import androidx.compose.foundation.text.selection.SelectedTextType;
import androidx.compose.p001ui.AbstractC2953;
import androidx.compose.p001ui.C2952;
import androidx.compose.p001ui.C2958;
import androidx.compose.p001ui.C2967;
import androidx.compose.p001ui.InterfaceC2962;
import androidx.compose.p001ui.draw.AbstractC2280;
import androidx.compose.p001ui.focus.AbstractC2294;
import androidx.compose.p001ui.focus.C2303;
import androidx.compose.p001ui.focus.InterfaceC2291;
import androidx.compose.p001ui.focus.InterfaceC2320;
import androidx.compose.p001ui.graphics.AbstractC2416;
import androidx.compose.p001ui.graphics.AbstractC2433;
import androidx.compose.p001ui.graphics.C2405;
import androidx.compose.p001ui.graphics.C2406;
import androidx.compose.p001ui.graphics.C2434;
import androidx.compose.p001ui.input.pointer.AbstractC2457;
import androidx.compose.p001ui.input.pointer.C2458;
import androidx.compose.p001ui.input.pointer.C2469;
import androidx.compose.p001ui.input.pointer.C2484;
import androidx.compose.p001ui.input.pointer.InterfaceC2470;
import androidx.compose.p001ui.input.pointer.InterfaceC2476;
import androidx.compose.p001ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p001ui.layout.AbstractC2505;
import androidx.compose.p001ui.layout.AbstractC2543;
import androidx.compose.p001ui.layout.InterfaceC2493;
import androidx.compose.p001ui.layout.InterfaceC2530;
import androidx.compose.p001ui.node.C2600;
import androidx.compose.p001ui.node.InterfaceC2619;
import androidx.compose.p001ui.platform.AbstractC2670;
import androidx.compose.p001ui.platform.AbstractC2737;
import androidx.compose.p001ui.platform.AbstractC2744;
import androidx.compose.p001ui.platform.C2700;
import androidx.compose.p001ui.platform.C2736;
import androidx.compose.p001ui.platform.InterfaceC2683;
import androidx.compose.p001ui.platform.InterfaceC2706;
import androidx.compose.p001ui.platform.InterfaceC2709;
import androidx.compose.p001ui.platform.InterfaceC2756;
import androidx.compose.p001ui.semantics.AbstractC2783;
import androidx.compose.p001ui.text.AbstractC2882;
import androidx.compose.p001ui.text.C2865;
import androidx.compose.p001ui.text.C2867;
import androidx.compose.p001ui.text.C2869;
import androidx.compose.p001ui.text.C2881;
import androidx.compose.p001ui.text.C2885;
import androidx.compose.p001ui.text.C2886;
import androidx.compose.p001ui.text.C2902;
import androidx.compose.p001ui.text.font.AbstractC2827;
import androidx.compose.p001ui.text.font.C2821;
import androidx.compose.p001ui.text.font.C2822;
import androidx.compose.p001ui.text.font.C2824;
import androidx.compose.p001ui.text.font.InterfaceC2830;
import androidx.compose.p001ui.text.input.C2831;
import androidx.compose.p001ui.text.input.C2838;
import androidx.compose.p001ui.text.input.C2847;
import androidx.compose.p001ui.text.input.C2848;
import androidx.compose.p001ui.text.input.C2857;
import androidx.compose.p001ui.text.input.C2859;
import androidx.compose.p001ui.text.input.InterfaceC2854;
import androidx.compose.p001ui.text.input.InterfaceC2856;
import androidx.compose.p001ui.text.style.ResolvedTextDirection;
import androidx.compose.p001ui.unit.LayoutDirection;
import androidx.compose.runtime.AbstractC2182;
import androidx.compose.runtime.AbstractC2202;
import androidx.compose.runtime.C2159;
import androidx.compose.runtime.C2169;
import androidx.compose.runtime.C2188;
import androidx.compose.runtime.C2204;
import androidx.compose.runtime.C2224;
import androidx.compose.runtime.InterfaceC2168;
import androidx.compose.runtime.InterfaceC2208;
import androidx.compose.runtime.InterfaceC2230;
import androidx.compose.runtime.internal.AbstractC2089;
import androidx.compose.runtime.internal.C2077;
import androidx.compose.runtime.internal.C2088;
import androidx.compose.runtime.snapshots.AbstractC2109;
import androidx.compose.runtime.snapshots.AbstractC2121;
import androidx.window.area.AbstractC3400;
import com.alibaba.fastjson2.C3775;
import io.ktor.util.C5043;
import java.text.BreakIterator;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.collections.EmptyList;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.InterfaceC5192;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.reflect.InterfaceC5942;
import kotlin.reflect.jvm.internal.impl.types.C5703;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.InterfaceC6233;
import net.bytebuddy.jar.asm.Opcodes;
import p050.AbstractC7173;
import p068.InterfaceC7372;
import p068.InterfaceC7380;
import p068.InterfaceC7383;
import p068.InterfaceC7387;
import p122.AbstractC8137;
import p124.InterfaceC8146;
import p128.C8157;
import p128.C8158;
import p132.AbstractC8176;
import p135.C8199;
import p135.C8211;
import p183.C8529;
import p183.C8537;
import p183.C8542;
import p191.AbstractC8568;
import p192.AbstractC8570;
import p210.C8661;
import p221.C8722;
import p221.C8735;
import p221.InterfaceC8725;
import p225.C8751;
import p225.C8756;
import p225.C8760;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.compose.foundation.text.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1821 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final int f3195 = 9;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final int f3201 = 12;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final int f3202 = 10;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C2077 f3200 = new C2077(759698998, false, new C1822(0));

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C0960 f3199 = new C0960(new C1782(0), 13);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C1782 f3198 = new C1782(1);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C2469 f3197 = new C2469(1022);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C1804 f3196 = new C1804(0, 0);

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public static final void m2446(int i, int i2, int i3) {
        boolean z = false;
        if (i >= 0 && i <= i2) {
            z = true;
        }
        if (z) {
            return;
        }
        StringBuilder sbM709 = AbstractC0900.m709(i3, i, "OffsetMapping.transformedToOriginal returned invalid mapping: ", " -> ", " is not in range of original text [0, ");
        sbM709.append(i2);
        sbM709.append(']');
        AbstractC8570.m13654(sbM709.toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static final void m2447(int i, int i2, int i3) {
        boolean z = false;
        if (i >= 0 && i <= i2) {
            z = true;
        }
        if (z) {
            return;
        }
        StringBuilder sbM709 = AbstractC0900.m709(i3, i, "OffsetMapping.originalToTransformed returned invalid mapping: ", " -> ", " is not in range of transformed text [0, ");
        sbM709.append(i2);
        sbM709.append(']');
        AbstractC8570.m13654(sbM709.toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static final void m2448(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            AbstractC8570.m13656("both minLines " + i + " and maxLines " + i2 + " must be greater than zero");
        }
        if (i <= i2) {
            return;
        }
        AbstractC8570.m13656("minLines " + i + " must be less than or equal to maxLines " + i2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final void m2449(C1720 c1720, boolean z, InterfaceC2208 interfaceC2208, int i) {
        C1801 c1801M2425;
        C2867 c2867;
        C2159 c2159 = (C2159) interfaceC2208;
        c2159.m2951(626339208);
        int i2 = (c2159.m2938(c1720) ? 4 : 2) | i | (c2159.m2939(z) ? 32 : 16);
        if (!c2159.m2903(i2 & 1, (i2 & 19) != 18)) {
            c2159.m2899();
        } else if (z) {
            c2159.m2952(1530097388);
            C1781 c1781 = c1720.f2832;
            C2867 c28672 = null;
            if (c1781 != null && (c1801M2425 = c1781.m2425()) != null && (c2867 = c1801M2425.f3090) != null) {
                C1781 c17812 = c1720.f2832;
                if (!(c17812 != null ? c17812.f3027 : true)) {
                    c28672 = c2867;
                }
            }
            if (c28672 == null) {
                c2159.m2952(1530097387);
                c2159.m2937(false);
            } else {
                c2159.m2952(1530097388);
                if (C2869.m4312(c1720.m2319().f6291)) {
                    c2159.m2952(2110860558);
                    c2159.m2937(false);
                } else {
                    c2159.m2952(2109807302);
                    InterfaceC2856 interfaceC2856 = c1720.f2834;
                    int i3 = (int) (c1720.m2319().f6291 >> 32);
                    interfaceC2856.mo2442(i3);
                    InterfaceC2856 interfaceC28562 = c1720.f2834;
                    int i4 = (int) (c1720.m2319().f6291 & 4294967295L);
                    interfaceC28562.mo2442(i4);
                    ResolvedTextDirection resolvedTextDirectionM4305 = c28672.m4305(i3);
                    ResolvedTextDirection resolvedTextDirectionM43052 = c28672.m4305(Math.max(i4 - 1, 0));
                    C1781 c17813 = c1720.f2832;
                    if (c17813 == null || !((Boolean) ((AbstractC2182) c17813.f3023).getValue()).booleanValue()) {
                        c2159.m2952(2110490542);
                        c2159.m2937(false);
                    } else {
                        c2159.m2952(2110225306);
                        AbstractC1733.m2362(true, resolvedTextDirectionM4305, c1720, c2159, ((i2 << 6) & 896) | 6);
                        c2159.m2937(false);
                    }
                    C1781 c17814 = c1720.f2832;
                    if (c17814 == null || !((Boolean) ((AbstractC2182) c17814.f3022).getValue()).booleanValue()) {
                        c2159.m2952(2110838734);
                        c2159.m2937(false);
                    } else {
                        c2159.m2952(2110574459);
                        AbstractC1733.m2362(false, resolvedTextDirectionM43052, c1720, c2159, ((i2 << 6) & 896) | 6);
                        c2159.m2937(false);
                    }
                    c2159.m2937(false);
                }
                C1781 c17815 = c1720.f2832;
                if (c17815 != null) {
                    InterfaceC2230 interfaceC2230 = c17815.f3031;
                    if (!AbstractC5227.m9466(c1720.f2840.f6292.f6474, c1720.m2319().f6292.f6474)) {
                        ((AbstractC2182) interfaceC2230).setValue(Boolean.FALSE);
                    }
                    if (c17815.m2427()) {
                        if (((Boolean) ((AbstractC2182) interfaceC2230).getValue()).booleanValue()) {
                            c1720.m2315();
                        } else {
                            c1720.m2323();
                        }
                    }
                }
                c2159.m2937(false);
            }
            c2159.m2937(false);
        } else {
            c2159.m2952(1989076778);
            c2159.m2937(false);
            c1720.m2323();
        }
        C2224 c2224M2935 = c2159.m2935();
        if (c2224M2935 != null) {
            c2224M2935.f4379 = new C0848(c1720, z, i);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final void m2450(InterfaceC2962 interfaceC2962, C1720 c1720, C2077 c2077, InterfaceC2208 interfaceC2208, int i) {
        C2159 c2159 = (C2159) interfaceC2208;
        c2159.m2951(2036174316);
        int i2 = (c2159.m2920(interfaceC2962) ? 4 : 2) | i | (c2159.m2938(c1720) ? 32 : 16);
        if (c2159.m2903(i2 & 1, (i2 & 147) != 146)) {
            InterfaceC2493 interfaceC2493M2011 = AbstractC1484.m2011(C2952.f6617, true);
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
            AbstractC2202.m3032(c2159, interfaceC2493M2011, C2600.f5526);
            AbstractC2202.m3032(c2159, c2088M2941, C2600.f5527);
            AbstractC2202.m3032(c2159, Integer.valueOf(iHashCode), C2600.f5533);
            AbstractC2202.m3041(c2159, C2600.f5532);
            AbstractC2202.m3032(c2159, interfaceC2962M4421, C2600.f5528);
            m2452(c1720, c2077, c2159, (i2 >> 3) & 126);
            c2159.m2937(true);
        } else {
            c2159.m2899();
        }
        C2224 c2224M2935 = c2159.m2935();
        if (c2224M2935 != null) {
            c2224M2935.f4379 = new C1819(interfaceC2962, c1720, c2077, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0460 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:229:0x046a  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0483  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x04a0  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x04b0  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x04bf  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x04d0  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x04e0  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x055b  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0564  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x05b6  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x05b8  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x05c0  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x05c2  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x05d0  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x05d3  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x05df  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x05ed  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x05f9 A[PHI: r12 r20 r25
  0x05f9: PHI (r12v21 androidx.compose.ui.text.input.飘花落叶言子楪苏兰世哲) = (r12v14 androidx.compose.ui.text.input.飘花落叶言子楪苏兰世哲), (r12v22 androidx.compose.ui.text.input.飘花落叶言子楪苏兰世哲) binds: [B:281:0x05f7, B:278:0x05e8] A[DONT_GENERATE, DONT_INLINE]
  0x05f9: PHI (r20v24 androidx.compose.foundation.text.飘花落叶言子世兰苏楪哲) = (r20v19 androidx.compose.foundation.text.飘花落叶言子世兰苏楪哲), (r20v26 androidx.compose.foundation.text.飘花落叶言子世兰苏楪哲) binds: [B:281:0x05f7, B:278:0x05e8] A[DONT_GENERATE, DONT_INLINE]
  0x05f9: PHI (r25v8 boolean) = (r25v2 boolean), (r25v9 boolean) binds: [B:281:0x05f7, B:278:0x05e8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:283:0x05fb  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0618 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0637  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x069e  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x06a6  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x06af A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:305:0x06c2  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0707  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0743  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0745  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0756  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0758  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x076d  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x07d8  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x07db  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x07e9  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x07f9  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x0813  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0815  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x082f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:356:0x0831  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x0845  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x0849  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x0871  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x0894  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x08c4  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x08da  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x098a  */
    /* JADX WARN: Type inference failed for: r0v28, types: [androidx.compose.foundation.text.飘花落叶言子苏世兰哲楪] */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2451(final C2847 c2847, final InterfaceC7387 interfaceC7387, final InterfaceC2962 interfaceC2962, final C2865 c2865, final C1123 c1123, final InterfaceC7387 interfaceC73872, final AbstractC2433 abstractC2433, final boolean z, final int i, final int i2, final C2859 c2859, final C1779 c1779, final boolean z2, final InterfaceC7380 interfaceC7380, InterfaceC2208 interfaceC2208, final int i3, final int i4) {
        int i5;
        int i6;
        C2159 c2159;
        C2902 c2902;
        int i7;
        C2869 c2869;
        C1836 c1836;
        C2188 c2188;
        C2902 c29022;
        Object c1781;
        C2159 c21592;
        int i8;
        C2303 c2303;
        C2848 c2848;
        InterfaceC8725 interfaceC8725;
        InterfaceC2830 interfaceC2830;
        InterfaceC2320 interfaceC2320;
        C2865 c28652;
        long j;
        C2838 c2838;
        InterfaceC2856 interfaceC2856;
        C2902 c29023;
        boolean z3;
        long j2;
        boolean z4;
        boolean z5;
        boolean z6;
        C2847 c28472;
        C2847 c2847M4275;
        Object objM2905;
        C2188 c21882;
        C1803 c1803;
        Object objM29052;
        Object objM29053;
        Object objM29054;
        C2303 c23032;
        InterfaceC1755 interfaceC1755;
        boolean z7;
        int i9;
        C2859 c28592;
        C1781 c17812;
        boolean z8;
        boolean zM2938;
        Object obj;
        C2159 c21593;
        final C1781 c17813;
        C1803 c18032;
        int i10;
        final C2859 c28593;
        int i11;
        InterfaceC2320 interfaceC23202;
        C2188 c21883;
        final C2848 c28482;
        int i12;
        C2303 c23033;
        InterfaceC1616 interfaceC1616;
        boolean z9;
        C1720 c1720;
        C2847 c28473;
        InterfaceC2856 interfaceC28562;
        C1781 c17814;
        boolean z10;
        boolean z11;
        Object coreTextFieldKt$CoreTextField$5$1;
        final C1720 c17202;
        C2303 c23034;
        InterfaceC6233 interfaceC6233;
        InterfaceC2962 interfaceC29622;
        C2958 c2958;
        final C1781 c17815;
        InterfaceC2230 interfaceC2230;
        C2848 c28483;
        final InterfaceC2856 interfaceC28563;
        boolean zM29382;
        Object objM29055;
        final C2848 c28484;
        InterfaceC2683 interfaceC2683;
        final C1781 c17816;
        final C1720 c17203;
        boolean zM29383;
        Object objM29056;
        boolean zM29384;
        Object objM29057;
        final InterfaceC2856 interfaceC28564;
        final boolean z12;
        boolean z13;
        boolean zM2939;
        Object objM29058;
        Object c2406;
        long j3;
        boolean zM29385;
        Object objM29059;
        int i13;
        long j4 = c2847.f6291;
        C2869 c28692 = c2847.f6290;
        C2902 c29024 = c2847.f6292;
        C2159 c21594 = (C2159) interfaceC2208;
        c21594.m2951(31062401);
        if ((i3 & 6) == 0) {
            i5 = i3 | (c21594.m2920(c2847) ? 4 : 2);
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= c21594.m2938(interfaceC7387) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i5 |= c21594.m2920(interfaceC2962) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i5 |= c21594.m2920(c2865) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i5 |= c21594.m2920(c1123) ? 16384 : 8192;
        }
        if ((i3 & 196608) == 0) {
            i5 |= c21594.m2938(interfaceC73872) ? 131072 : 65536;
        }
        if ((i3 & 1572864) == 0) {
            i5 |= c21594.m2920(null) ? 1048576 : Opcodes.ASM8;
        }
        if ((i3 & 12582912) == 0) {
            i5 |= c21594.m2920(abstractC2433) ? 8388608 : 4194304;
        }
        if ((i3 & 100663296) == 0) {
            i5 |= c21594.m2939(z) ? 67108864 : 33554432;
        }
        if ((i3 & 805306368) == 0) {
            i5 |= c21594.m2922(i) ? 536870912 : 268435456;
        }
        if ((i4 & 6) == 0) {
            i6 = i4 | (c21594.m2922(i2) ? 4 : 2);
        } else {
            i6 = i4;
        }
        if ((i4 & 48) == 0) {
            i6 |= c21594.m2920(c2859) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i6 |= c21594.m2920(c1779) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i6 |= c21594.m2939(z2) ? 2048 : 1024;
        }
        if ((i4 & 24576) == 0) {
            i6 |= c21594.m2939(false) ? 16384 : 8192;
        }
        if ((i4 & 196608) == 0) {
            i6 |= c21594.m2938(interfaceC7380) ? 131072 : 65536;
        }
        int i14 = i6 | 1572864;
        if (c21594.m2903(i5 & 1, ((i5 & 306783379) == 306783378 && (599187 & i14) == 599186) ? false : true)) {
            c21594.m2901();
            if ((i3 & 1) != 0 && !c21594.m2913()) {
                c21594.m2899();
            }
            c21594.m2934();
            Object objM290510 = c21594.m2905();
            C2188 c21884 = C2204.f4319;
            if (objM290510 == c21884) {
                objM290510 = new C2303();
                c21594.m2946(objM290510);
            }
            C2303 c23035 = (C2303) objM290510;
            Object objM290511 = c21594.m2905();
            if (objM290511 == c21884) {
                InterfaceC7387 interfaceC73873 = AbstractC1690.f2750;
                objM290511 = new C1698();
                c21594.m2946(objM290511);
            }
            C1698 c1698 = (C1698) objM290511;
            Object objM290512 = c21594.m2905();
            if (objM290512 == c21884) {
                objM290512 = new C2848(c1698);
                c21594.m2946(objM290512);
            }
            C2848 c28485 = (C2848) objM290512;
            InterfaceC8725 interfaceC87252 = (InterfaceC8725) c21594.m2943(AbstractC2737.f5933);
            InterfaceC2830 interfaceC28302 = (InterfaceC2830) c21594.m2943(AbstractC2737.f5935);
            long j5 = ((C1768) c21594.m2943(AbstractC1767.f2983)).f2984;
            InterfaceC2320 interfaceC23203 = (InterfaceC2320) c21594.m2943(AbstractC2737.f5937);
            final InterfaceC2683 interfaceC26832 = (InterfaceC2683) c21594.m2943(AbstractC2737.f5925);
            InterfaceC2706 interfaceC2706 = (InterfaceC2706) c21594.m2943(AbstractC2737.f5929);
            Orientation orientation = (i == 1 && !z && c2859.f6319) ? Orientation.Horizontal : Orientation.Vertical;
            c21594.m2952(-213744626);
            Object[] objArr = {orientation};
            C5703 c5703 = C1836.f3269;
            boolean zM2922 = c21594.m2922(orientation.ordinal());
            Object objM290513 = c21594.m2905();
            if (zM2922 || objM290513 == c21884) {
                objM290513 = new C1791(orientation, 2);
                c21594.m2946(objM290513);
            }
            C1836 c18362 = (C1836) AbstractC8176.m13097(objArr, c5703, (InterfaceC7372) objM290513, c21594, 0);
            c21594.m2937(false);
            if (((Orientation) ((AbstractC2182) c18362.f3270).getValue()) != orientation) {
                throw new IllegalArgumentException("Mismatching scroller orientation; ".concat(orientation == Orientation.Vertical ? "only single-line, non-wrap text fields can scroll horizontally" : "single-line, non-wrap text fields can only scroll horizontally"));
            }
            int i15 = i5 & 14;
            boolean z14 = ((i5 & 57344) == 16384) | (i15 == 4);
            Object objM290514 = c21594.m2905();
            if (z14 || objM290514 == c21884) {
                C2838 c2838M2462 = m2462(c1123, c29024);
                InterfaceC2856 interfaceC28565 = c2838M2462.f6254;
                if (c28692 != null) {
                    c1836 = c18362;
                    long j6 = c28692.f6349;
                    int i16 = C2869.f6347;
                    int i17 = (int) (j6 >> 32);
                    interfaceC28565.mo2442(i17);
                    i7 = i15;
                    int i18 = (int) (j6 & 4294967295L);
                    interfaceC28565.mo2442(i18);
                    int iMin = Math.min(i17, i18);
                    int iMax = Math.max(i17, i18);
                    C2885 c2885 = new C2885(c2838M2462.f6255);
                    c2902 = c29024;
                    c2869 = c28692;
                    c2885.f6423.add(new C2886("", iMin, new C2881(0L, 0L, (C2822) null, (C2824) null, (C2821) null, (AbstractC2827) null, (String) null, 0L, (C8751) null, (C8756) null, (C8661) null, 0L, C8760.f22305, (C2405) null, 61439), iMax));
                    objM290514 = new C2838(c2885.m4334(), interfaceC28565);
                } else {
                    c2902 = c29024;
                    i7 = i15;
                    c2869 = c28692;
                    c1836 = c18362;
                    objM290514 = c2838M2462;
                }
                c21594.m2946(objM290514);
            } else {
                c2902 = c29024;
                i7 = i15;
                c2869 = c28692;
                c1836 = c18362;
            }
            C2838 c28382 = (C2838) objM290514;
            C2902 c29025 = c28382.f6255;
            InterfaceC2856 interfaceC28566 = c28382.f6254;
            C2224 c2224M2929 = c21594.m2929();
            if (c2224M2929 == null) {
                C6755.m11870("no recompose scope found");
                return;
            }
            c2224M2929.f4381 |= 1;
            boolean zM2920 = c21594.m2920(interfaceC2706);
            Object objM290515 = c21594.m2905();
            if (zM2920 || objM290515 == c21884) {
                c2188 = c21884;
                c29022 = c29025;
                c21592 = c21594;
                i8 = i14;
                c2303 = c23035;
                c2848 = c28485;
                interfaceC8725 = interfaceC87252;
                interfaceC2830 = interfaceC28302;
                interfaceC2320 = interfaceC23203;
                c28652 = c2865;
                j = j4;
                c2838 = c28382;
                interfaceC2856 = interfaceC28566;
                c29023 = c2902;
                z3 = z;
                c1781 = new C1781(new C1847(c29022, c28652, z3, interfaceC8725, interfaceC2830, EmptyList.INSTANCE), c2224M2929, interfaceC2706);
                c21592.m2946(c1781);
            } else {
                z3 = z;
                c2188 = c21884;
                c29022 = c29025;
                c1781 = objM290515;
                c21592 = c21594;
                i8 = i14;
                c2303 = c23035;
                c2848 = c28485;
                interfaceC8725 = interfaceC87252;
                interfaceC2830 = interfaceC28302;
                interfaceC2320 = interfaceC23203;
                c28652 = c2865;
                j = j4;
                c2838 = c28382;
                interfaceC2856 = interfaceC28566;
                c29023 = c2902;
            }
            C1781 c17817 = (C1781) c1781;
            c17817.f3020 = interfaceC7387;
            c17817.f3008 = j5;
            C1783 c1783 = c17817.f3025;
            c1783.f3036 = c1779;
            c1783.f3035 = interfaceC2320;
            c17817.f3033 = c29023;
            C1847 c1847 = c17817.f3015;
            EmptyList emptyList = EmptyList.INSTANCE;
            if (!AbstractC5227.m9466(c1847.f3301, c29022) || !AbstractC5227.m9466(c1847.f3300, c28652) || c1847.f3297 != z3 || c1847.f3296 != 1 || c1847.f3299 != Integer.MAX_VALUE || c1847.f3298 != 1 || !AbstractC5227.m9466(c1847.f3303, interfaceC8725) || !AbstractC5227.m9466(c1847.f3305, emptyList) || c1847.f3302 != interfaceC2830) {
                c1847 = new C1847(c29022, c28652, z3, interfaceC8725, interfaceC2830, emptyList);
            }
            C2865 c28653 = c28652;
            final InterfaceC8725 interfaceC87253 = interfaceC8725;
            if (c17817.f3015 != c1847) {
                c17817.f3027 = true;
            }
            c17817.f3015 = c1847;
            C0923 c0923 = c17817.f3012;
            C2831 c2831 = c17817.f3011;
            C2869 c28693 = c2869;
            boolean zM9466 = AbstractC5227.m9466(c28693, ((C2857) c0923.f573).m4290());
            if (AbstractC5227.m9466(((C2847) c0923.f572).f6292.f6474, c29023.f6474)) {
                j2 = j;
                if (C2869.m4313(((C2847) c0923.f572).f6291, j2)) {
                    z4 = false;
                } else {
                    ((C2857) c0923.f573).m4287(C2869.m4317(j2), C2869.m4310(j2));
                    z4 = false;
                    z5 = true;
                    if (c28693 != null) {
                        C2857 c2857 = (C2857) c0923.f573;
                        c2857.f6307 = -1;
                        c2857.f6306 = -1;
                    } else {
                        long j7 = c28693.f6349;
                        if (!C2869.m4312(j7)) {
                            z6 = zM9466;
                            ((C2857) c0923.f573).m4288(C2869.m4317(j7), C2869.m4310(j7));
                        }
                        if (z4 || !(z5 || z6)) {
                            C2857 c28572 = (C2857) c0923.f573;
                            c28572.f6307 = -1;
                            c28572.f6306 = -1;
                            c28472 = c2847;
                            c2847M4275 = C2847.m4275(c28472, null, 0L, 3);
                        } else {
                            c2847M4275 = c2847;
                            c28472 = c2847M4275;
                        }
                        C2847 c28474 = (C2847) c0923.f572;
                        c0923.f572 = c2847M4275;
                        if (c2831 != null) {
                            c2831.m4269(c28474, c2847M4275);
                        }
                        objM2905 = c21592.m2905();
                        c21882 = c2188;
                        if (objM2905 == c21882) {
                            objM2905 = new C1803();
                            c21592.m2946(objM2905);
                        }
                        c1803 = (C1803) objM2905;
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        if (c1803.f3095) {
                            c1803.f3096 = Long.valueOf(jCurrentTimeMillis);
                            c1803.m2440(c28472);
                            objM29052 = c21592.m2905();
                            if (objM29052 == c21882) {
                                objM29052 = AbstractC2202.m3058(EmptyCoroutineContext.INSTANCE, c21592);
                                c21592.m2946(objM29052);
                            }
                            final InterfaceC6233 interfaceC62332 = (InterfaceC6233) objM29052;
                            objM29053 = c21592.m2905();
                            if (objM29053 == c21882) {
                                objM29053 = new C1614();
                                c21592.m2946(objM29053);
                            }
                            final InterfaceC1616 interfaceC16162 = (InterfaceC1616) objM29053;
                            objM29054 = c21592.m2905();
                            if (objM29054 == c21882) {
                                objM29054 = new C1720(c1803);
                                c21592.m2946(objM29054);
                            }
                            final C1720 c17204 = (C1720) objM29054;
                            final InterfaceC2856 interfaceC28567 = interfaceC2856;
                            c17204.f2834 = interfaceC28567;
                            c17204.f2833 = c17817.f3021;
                            c17204.f2832 = c17817;
                            ((AbstractC2182) c17204.f2831).setValue(c28472);
                            c17204.f2838 = new C2869(j2);
                            c17204.f2849 = (InterfaceC2756) c21592.m2943(AbstractC2737.f5915);
                            c17204.f2848 = interfaceC62332;
                            c17204.f2853 = (InterfaceC2709) c21592.m2943(AbstractC2737.f5930);
                            c17204.f2850 = (InterfaceC8146) c21592.m2943(AbstractC2737.f5936);
                            C2303 c23036 = c2303;
                            c17204.f2851 = c23036;
                            final boolean z15 = true;
                            ((AbstractC2182) c17204.f2843).setValue(true);
                            ((AbstractC2182) c17204.f2842).setValue(Boolean.valueOf(z2));
                            c21592.m2952(1966756105);
                            SelectedTextType selectedTextType = SelectedTextType.EditableText;
                            C8661 c8661 = c28653.f6329.f6409;
                            C2169 c2169 = AbstractC1757.f2954;
                            c21592.m2952(430530635);
                            if (Build.VERSION.SDK_INT >= 28) {
                                c21592.m2937(false);
                                z7 = false;
                                c23032 = c23036;
                                interfaceC1755 = null;
                            } else {
                                Context context = (Context) c21592.m2943(AbstractC2670.f5681);
                                InterfaceC5192 interfaceC5192 = (InterfaceC5192) c21592.m2943(AbstractC1757.f2954);
                                boolean zM29202 = c21592.m2920(interfaceC5192) | c21592.m2920(context) | c21592.m2920(c8661);
                                c23032 = c23036;
                                Object objM290516 = c21592.m2905();
                                if (zM29202 || objM290516 == c21882) {
                                    AbstractC1757.f2953.getClass();
                                    objM290516 = new C1760(interfaceC5192, context, selectedTextType, c8661);
                                    c21592.m2946(objM290516);
                                }
                                interfaceC1755 = (InterfaceC1755) objM290516;
                                z7 = false;
                                c21592.m2937(false);
                            }
                            c17204.f2852 = interfaceC1755;
                            c21592.m2937(z7);
                            c17817.m2427();
                            int i19 = i8;
                            int i20 = i19 & 7168;
                            C2848 c28486 = c2848;
                            int i21 = i7;
                            boolean zM29386 = c21592.m2938(c17817) | (i20 != 2048) | ((i19 & 57344) != 16384) | c21592.m2938(c28486) | (i21 != 4);
                            i9 = (i19 & 112) ^ 48;
                            if (i9 <= 32) {
                                c28592 = c2859;
                                if (c21592.m2920(c28592)) {
                                    c17812 = c17817;
                                    z8 = zM29386;
                                }
                                zM2938 = z8 | z | c21592.m2938(interfaceC28567) | c21592.m2938(interfaceC62332) | c21592.m2938(interfaceC16162) | c21592.m2938(c17204);
                                Object objM290517 = c21592.m2905();
                                if (zM2938 || objM290517 == c21882) {
                                    C2859 c28594 = c28592;
                                    c21593 = c21592;
                                    c17813 = c17812;
                                    c18032 = c1803;
                                    i10 = i19;
                                    c28593 = c28594;
                                    i11 = i20;
                                    interfaceC23202 = interfaceC2320;
                                    c21883 = c21882;
                                    c28482 = c28486;
                                    i12 = i21;
                                    c23033 = c23032;
                                    obj = new InterfaceC7387() { // from class: androidx.compose.foundation.text.飘花落叶言子楪兰哲苏世
                                        @Override // p068.InterfaceC7387
                                        public final Object invoke(Object obj2) {
                                            C1801 c1801M2425;
                                            InterfaceC2291 interfaceC2291 = (InterfaceC2291) obj2;
                                            C1781 c17818 = c17813;
                                            boolean zM2427 = c17818.m2427();
                                            boolean zIsFocused = interfaceC2291.isFocused();
                                            C6008 c6008 = C6008.f15084;
                                            if (zM2427 != zIsFocused) {
                                                ((AbstractC2182) c17818.f3010).setValue(Boolean.valueOf(interfaceC2291.isFocused()));
                                                boolean zM24272 = c17818.m2427();
                                                C2847 c28475 = c2847;
                                                InterfaceC2856 interfaceC28568 = interfaceC28567;
                                                if (zM24272 && z2) {
                                                    AbstractC1821.m2458(c28482, c17818, c28475, c28593, interfaceC28568);
                                                } else {
                                                    AbstractC1821.m2470(c17818);
                                                }
                                                if (interfaceC2291.isFocused() && (c1801M2425 = c17818.m2425()) != null) {
                                                    AbstractC6231.m11036(interfaceC62332, null, null, new CoreTextFieldKt$CoreTextField$focusModifier$1$1$1$1(interfaceC16162, c28475, c17818, c1801M2425, interfaceC28568, null), 3);
                                                }
                                                if (!interfaceC2291.isFocused()) {
                                                    c17204.m2333(null);
                                                }
                                            }
                                            return c6008;
                                        }
                                    };
                                    interfaceC1616 = interfaceC16162;
                                    z9 = z2;
                                    c1720 = c17204;
                                    c28473 = c2847;
                                    interfaceC62332 = interfaceC62332;
                                    interfaceC28562 = interfaceC28567;
                                    c21593.m2946(obj);
                                } else {
                                    C2859 c28595 = c28592;
                                    c21593 = c21592;
                                    c17813 = c17812;
                                    c18032 = c1803;
                                    i10 = i19;
                                    c28593 = c28595;
                                    i12 = i21;
                                    interfaceC28562 = interfaceC28567;
                                    obj = objM290517;
                                    i11 = i20;
                                    interfaceC23202 = interfaceC2320;
                                    c1720 = c17204;
                                    c23033 = c23032;
                                    c21883 = c21882;
                                    c28482 = c28486;
                                    interfaceC1616 = interfaceC16162;
                                    c28473 = c2847;
                                    z9 = z2;
                                }
                                C2958 c29582 = C2958.f6621;
                                InterfaceC6233 interfaceC62333 = interfaceC62332;
                                InterfaceC2962 interfaceC2962M2551 = AbstractC1910.m2551(AbstractC2294.m3174(AbstractC2294.m3190(c29582, c23033), (InterfaceC7387) obj), z9);
                                InterfaceC2230 interfaceC2230M3039 = AbstractC2202.m3039(Boolean.valueOf(z9), c21593);
                                boolean zM29203 = c21593.m2920(interfaceC2230M3039) | c21593.m2938(c17813) | c21593.m2938(c28482) | c21593.m2938(c1720);
                                if (i9 > 32 || !c21593.m2920(c28593)) {
                                    c17814 = c17813;
                                    if ((i10 & 48) != 32) {
                                        z10 = false;
                                    }
                                    z11 = zM29203 | z10;
                                    Object objM290518 = c21593.m2905();
                                    if (z11 || objM290518 == c21883) {
                                        c17202 = c1720;
                                        c23034 = c23033;
                                        interfaceC6233 = interfaceC62333;
                                        interfaceC29622 = interfaceC2962M2551;
                                        c2958 = c29582;
                                        c17815 = c17814;
                                        coreTextFieldKt$CoreTextField$5$1 = new CoreTextFieldKt$CoreTextField$5$1(c17815, interfaceC2230M3039, c28482, c17202, c28593, null);
                                        interfaceC2230 = interfaceC2230M3039;
                                        c28483 = c28482;
                                        c21593.m2946(coreTextFieldKt$CoreTextField$5$1);
                                    } else {
                                        coreTextFieldKt$CoreTextField$5$1 = objM290518;
                                        c28483 = c28482;
                                        c23034 = c23033;
                                        interfaceC6233 = interfaceC62333;
                                        interfaceC29622 = interfaceC2962M2551;
                                        c17815 = c17814;
                                        interfaceC2230 = interfaceC2230M3039;
                                        c2958 = c29582;
                                        c17202 = c1720;
                                    }
                                    AbstractC2202.m3060(c21593, C6008.f15084, (InterfaceC7383) coreTextFieldKt$CoreTextField$5$1);
                                    InterfaceC2962 interfaceC2962M3562 = AbstractC2457.m3562(c2958, 8675309, new C1734(new C1815(c17815, 4), 0));
                                    interfaceC28563 = interfaceC28562;
                                    final boolean z16 = z9;
                                    final C2303 c23037 = c23034;
                                    final ?? r0 = new InterfaceC7387() { // from class: androidx.compose.foundation.text.飘花落叶言子苏世兰哲楪
                                        @Override // p068.InterfaceC7387
                                        public final Object invoke(Object obj2) {
                                            C8158 c8158 = (C8158) obj2;
                                            C1781 c17818 = c17815;
                                            if (c17818.m2427()) {
                                                InterfaceC2706 interfaceC27062 = c17818.f3013;
                                                if (interfaceC27062 != null) {
                                                    ((C2736) interfaceC27062).m4155();
                                                }
                                            } else {
                                                C2303.m3192(c23037);
                                            }
                                            if (c17818.m2427() && z16) {
                                                if (c17818.m2428() != HandleState.Selection) {
                                                    C1801 c1801M2425 = c17818.m2425();
                                                    if (c1801M2425 != null) {
                                                        long j8 = c8158.f19886;
                                                        C0923 c09232 = c17818.f3012;
                                                        C1815 c1815 = c17818.f3021;
                                                        int iM2438 = c1801M2425.m2438(j8, true);
                                                        interfaceC28563.mo2443(iM2438);
                                                        c1815.invoke(C2847.m4275((C2847) c09232.f572, null, AbstractC2882.m4330(iM2438, iM2438), 5));
                                                        if (c17818.f3015.f3301.f6474.length() > 0) {
                                                            ((AbstractC2182) c17818.f3030).setValue(HandleState.Cursor);
                                                        }
                                                    }
                                                } else {
                                                    c17202.m2333(c8158);
                                                }
                                            }
                                            return C6008.f15084;
                                        }
                                    };
                                    if (z2) {
                                        interfaceC2962M3562 = AbstractC2953.m4423(interfaceC2962M3562, new InterfaceC7380() { // from class: androidx.compose.foundation.text.飘花落叶言子苏哲楪兰世
                                            @Override // p068.InterfaceC7380
                                            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                                ((Integer) obj4).getClass();
                                                C2159 c21595 = (C2159) ((InterfaceC2208) obj3);
                                                c21595.m2952(-102778667);
                                                Object objM290519 = c21595.m2905();
                                                C2188 c21885 = C2204.f4319;
                                                if (objM290519 == c21885) {
                                                    objM290519 = AbstractC2202.m3058(EmptyCoroutineContext.INSTANCE, c21595);
                                                    c21595.m2946(objM290519);
                                                }
                                                InterfaceC6233 interfaceC62334 = (InterfaceC6233) objM290519;
                                                Object objM290520 = c21595.m2905();
                                                if (objM290520 == c21885) {
                                                    objM290520 = AbstractC2202.m3034(null);
                                                    c21595.m2946(objM290520);
                                                }
                                                InterfaceC2230 interfaceC22302 = (InterfaceC2230) objM290520;
                                                InterfaceC2230 interfaceC2230M30392 = AbstractC2202.m3039(r0, c21595);
                                                boolean zM29204 = c21595.m2920(null);
                                                Object objM290521 = c21595.m2905();
                                                if (zM29204 || objM290521 == c21885) {
                                                    objM290521 = new C1842(interfaceC22302, 0);
                                                    c21595.m2946(objM290521);
                                                }
                                                AbstractC2202.m3044(null, (InterfaceC7387) objM290521, c21595);
                                                boolean zM29387 = c21595.m2938(interfaceC62334) | c21595.m2920(null) | c21595.m2920(interfaceC2230M30392);
                                                Object objM290522 = c21595.m2905();
                                                if (zM29387 || objM290522 == c21885) {
                                                    objM290522 = new C1841(interfaceC62334, interfaceC22302, interfaceC2230M30392);
                                                    c21595.m2946(objM290522);
                                                }
                                                InterfaceC2962 interfaceC2962M35622 = AbstractC2457.m3562(C2958.f6621, null, (PointerInputEventHandler) objM290522);
                                                c21595.m2937(false);
                                                return interfaceC2962M35622;
                                            }
                                        });
                                    }
                                    InterfaceC2962 interfaceC2962Mo4426 = interfaceC2962M3562.mo4426(new C2458(c17202.f2827, c17202.f2828, new C1845(c17202), 4));
                                    InterfaceC2476.f5147.getClass();
                                    InterfaceC2962 interfaceC2962Mo44262 = interfaceC2962Mo4426.mo4426(new C2484());
                                    final InterfaceC2962 interfaceC2962M3145 = AbstractC2280.m3145(c2958, new C1597(c17815, c28473, interfaceC28563, 2));
                                    zM29382 = c21593.m2938(c17815) | (i11 != 2048) | c21593.m2920(interfaceC26832) | c21593.m2938(c17202) | (i12 != 4) | c21593.m2938(interfaceC28563);
                                    objM29055 = c21593.m2905();
                                    if (!zM29382 || objM29055 == c21883) {
                                        final C2847 c28475 = c28473;
                                        c28484 = c28483;
                                        InterfaceC7387 interfaceC73874 = new InterfaceC7387() { // from class: androidx.compose.foundation.text.飘花落叶言子世楪苏哲兰
                                            @Override // p068.InterfaceC7387
                                            public final Object invoke(Object obj2) {
                                                C2831 c28312;
                                                InterfaceC2530 interfaceC2530;
                                                InterfaceC2530 interfaceC25302;
                                                C1781 c17818 = c17815;
                                                InterfaceC2230 interfaceC22302 = c17818.f3026;
                                                InterfaceC2530 interfaceC25303 = (InterfaceC2530) obj2;
                                                c17818.f3028 = interfaceC25303;
                                                C1801 c1801M2425 = c17818.m2425();
                                                if (c1801M2425 != null) {
                                                    c1801M2425.f3089 = interfaceC25303;
                                                }
                                                if (z2) {
                                                    HandleState handleStateM2428 = c17818.m2428();
                                                    HandleState handleState = HandleState.Selection;
                                                    C1720 c17205 = c17202;
                                                    C2847 c28476 = c28475;
                                                    if (handleStateM2428 == handleState) {
                                                        if (((Boolean) ((AbstractC2182) c17818.f3031).getValue()).booleanValue() && ((Boolean) ((AbstractC2182) ((C2700) interfaceC26832).f5711).getValue()).booleanValue()) {
                                                            c17205.m2315();
                                                        } else {
                                                            c17205.m2323();
                                                        }
                                                        ((AbstractC2182) c17818.f3023).setValue(Boolean.valueOf(AbstractC1733.m2373(c17205, true)));
                                                        ((AbstractC2182) c17818.f3022).setValue(Boolean.valueOf(AbstractC1733.m2373(c17205, false)));
                                                        ((AbstractC2182) interfaceC22302).setValue(Boolean.valueOf(C2869.m4312(c28476.f6291)));
                                                    } else if (c17818.m2428() == HandleState.Cursor) {
                                                        ((AbstractC2182) interfaceC22302).setValue(Boolean.valueOf(AbstractC1733.m2373(c17205, true)));
                                                    }
                                                    InterfaceC2856 interfaceC28568 = interfaceC28563;
                                                    AbstractC1821.m2460(c17818, c28476, interfaceC28568);
                                                    C1801 c1801M24252 = c17818.m2425();
                                                    if (c1801M24252 != null && (c28312 = c17818.f3011) != null && c17818.m2427() && (interfaceC2530 = c1801M24252.f3089) != null && interfaceC2530.mo3646() && (interfaceC25302 = c1801M24252.f3088) != null) {
                                                        C2867 c2867 = c1801M24252.f3090;
                                                        C1850 c1850 = new C1850(interfaceC2530, 0);
                                                        C8157 c8157M2367 = AbstractC1733.m2367(interfaceC2530);
                                                        C8157 c8157Mo3649 = interfaceC2530.mo3649(interfaceC25302, false);
                                                        if (AbstractC5227.m9466((C2831) c28312.f6234.f6293.get(), c28312)) {
                                                            c28312.f6233.mo2247(c28476, interfaceC28568, c2867, c1850, c8157M2367, c8157Mo3649);
                                                        }
                                                    }
                                                }
                                                return C6008.f15084;
                                            }
                                        };
                                        interfaceC2683 = interfaceC26832;
                                        interfaceC28563 = interfaceC28563;
                                        c21593.m2946(interfaceC73874);
                                        objM29055 = interfaceC73874;
                                    } else {
                                        interfaceC2683 = interfaceC26832;
                                        c28484 = c28483;
                                    }
                                    final InterfaceC2962 interfaceC2962M3665 = AbstractC2505.m3665(c2958, (InterfaceC7387) objM29055);
                                    c17816 = c17815;
                                    c17203 = c17202;
                                    C1717 c1717 = new C1717(c2838, c2847, c17816, z2, interfaceC28563, c17203, c2859, c23034);
                                    InterfaceC2962 interfaceC2962M4423 = !(!z2 && ((Boolean) ((AbstractC2182) ((C2700) interfaceC2683).f5711).getValue()).booleanValue() && C2869.m4312(((C2869) ((AbstractC2182) c17816.f3007).getValue()).f6349) && C2869.m4312(((C2869) ((AbstractC2182) c17816.f3006).getValue()).f6349)) ? AbstractC2953.m4423(c2958, new InterfaceC7380() { // from class: androidx.compose.foundation.text.飘花落叶言子苏楪哲兰世
                                        /* JADX WARN: Removed duplicated region for block: B:28:0x00d7  */
                                        @Override // p068.InterfaceC7380
                                        /*
                                            Code decompiled incorrectly, please refer to instructions dump.
                                        */
                                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                            Object objM3143;
                                            C2847 c28476 = c2847;
                                            long j8 = c28476.f6291;
                                            InterfaceC2962 interfaceC29623 = (InterfaceC2962) obj2;
                                            ((Integer) obj4).getClass();
                                            C2159 c21595 = (C2159) ((InterfaceC2208) obj3);
                                            c21595.m2952(-84507373);
                                            boolean zBooleanValue = ((Boolean) c21595.m2943(AbstractC2737.f5924)).booleanValue();
                                            boolean zM29392 = c21595.m2939(zBooleanValue);
                                            Object objM290519 = c21595.m2905();
                                            C2188 c21885 = C2204.f4319;
                                            if (zM29392 || objM290519 == c21885) {
                                                objM290519 = new C1712(zBooleanValue);
                                                c21595.m2946(objM290519);
                                            }
                                            C1712 c1712 = (C1712) objM290519;
                                            AbstractC2433 abstractC24332 = abstractC2433;
                                            boolean z17 = ((abstractC24332 instanceof C2406) && ((C2406) abstractC24332).f4965 == 16) ? false : true;
                                            if (((Boolean) ((AbstractC2182) ((C2700) ((InterfaceC2683) c21595.m2943(AbstractC2737.f5925))).f5711).getValue()).booleanValue()) {
                                                C1781 c17818 = c17816;
                                                if (c17818.m2427() && C2869.m4312(j8) && z17) {
                                                    c21595.m2952(-707487962);
                                                    C2902 c29026 = c28476.f6292;
                                                    C2869 c28694 = new C2869(j8);
                                                    boolean zM29387 = c21595.m2938(c1712);
                                                    Object objM290520 = c21595.m2905();
                                                    if (zM29387 || objM290520 == c21885) {
                                                        objM290520 = new TextFieldCursorKt$cursor$1$1$1(c1712, null);
                                                        c21595.m2946(objM290520);
                                                    }
                                                    AbstractC2202.m3059(c29026, c28694, (InterfaceC7383) objM290520, c21595);
                                                    boolean zM29388 = c21595.m2938(c1712);
                                                    InterfaceC2856 interfaceC28568 = interfaceC28563;
                                                    boolean zM29389 = c21595.m2938(interfaceC28568) | zM29388 | c21595.m2920(c28476) | c21595.m2938(c17818) | c21595.m2920(abstractC24332);
                                                    Object objM290521 = c21595.m2905();
                                                    if (zM29389 || objM290521 == c21885) {
                                                        objM290521 = new C1849(c1712, interfaceC28568, c28476, c17818, abstractC24332, 0);
                                                        c21595.m2946(objM290521);
                                                    }
                                                    objM3143 = AbstractC2280.m3143(interfaceC29623, (InterfaceC7387) objM290521);
                                                    c21595.m2937(false);
                                                } else {
                                                    c21595.m2952(-705473241);
                                                    c21595.m2937(false);
                                                    objM3143 = C2958.f6621;
                                                }
                                            }
                                            c21595.m2937(false);
                                            return objM3143;
                                        }
                                    }) : c2958;
                                    zM29383 = c21593.m2938(c17203);
                                    objM29056 = c21593.m2905();
                                    if (!zM29383 || objM29056 == c21883) {
                                        objM29056 = new C1799(c17203, 1);
                                        c21593.m2946(objM29056);
                                    }
                                    AbstractC2202.m3044(c17203, (InterfaceC7387) objM29056, c21593);
                                    zM29384 = c21593.m2938(c17816) | c21593.m2938(c28484) | (i12 != 4) | ((i9 <= 32 && c21593.m2920(c2859)) || (i10 & 48) == 32);
                                    objM29057 = c21593.m2905();
                                    if (zM29384 || objM29057 == c21883) {
                                        objM29057 = new InterfaceC7387() { // from class: androidx.compose.foundation.text.飘花落叶言子世楪苏兰哲
                                            /* JADX WARN: Type inference failed for: r6v3, types: [T, androidx.compose.ui.text.input.飘花落叶言子世楪兰哲苏, java.lang.Object] */
                                            @Override // p068.InterfaceC7387
                                            public final Object invoke(Object obj2) {
                                                C1781 c17818 = c17816;
                                                if (c17818.m2427()) {
                                                    C0923 c09232 = c17818.f3012;
                                                    C1815 c1815 = c17818.f3021;
                                                    C1815 c18152 = c17818.f3018;
                                                    Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                                                    C1597 c1597 = new C1597(c09232, c1815, ref$ObjectRef, 3);
                                                    C2848 c28487 = c28484;
                                                    InterfaceC2854 interfaceC2854 = c28487.f6294;
                                                    interfaceC2854.mo2246(c2847, c2859, c1597, c18152);
                                                    ?? c28312 = new C2831(c28487, interfaceC2854);
                                                    c28487.f6293.set(c28312);
                                                    ref$ObjectRef.element = c28312;
                                                    c17818.f3011 = c28312;
                                                }
                                                return new C1789();
                                            }
                                        };
                                        c21593.m2946(objM29057);
                                    }
                                    AbstractC2202.m3044(c2859, (InterfaceC7387) objM29057, c21593);
                                    final C1815 c1815 = c17816.f3021;
                                    if (i != 1) {
                                        interfaceC28564 = interfaceC28563;
                                        z12 = true;
                                    } else {
                                        interfaceC28564 = interfaceC28563;
                                        z12 = false;
                                    }
                                    final int i22 = c2859.f6315;
                                    final C1803 c18033 = c18032;
                                    InterfaceC7380 interfaceC73802 = new InterfaceC7380() { // from class: androidx.compose.foundation.text.飘花落叶言子苏世兰楪哲
                                        @Override // p068.InterfaceC7380
                                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                            ((Integer) obj4).getClass();
                                            C2159 c21595 = (C2159) ((InterfaceC2208) obj3);
                                            c21595.m2952(851809892);
                                            Object objM290519 = c21595.m2905();
                                            C2188 c21885 = C2204.f4319;
                                            if (objM290519 == c21885) {
                                                objM290519 = new C1769();
                                                c21595.m2946(objM290519);
                                            }
                                            C1769 c1769 = (C1769) objM290519;
                                            Object objM290520 = c21595.m2905();
                                            if (objM290520 == c21885) {
                                                objM290520 = new C1796();
                                                c21595.m2946(objM290520);
                                            }
                                            C1831 c1831 = new C1831(c17816, c17203, c2847, z15, z12, c1769, interfaceC28564, c18033, (C1796) objM290520, c1815, i22);
                                            boolean zM29387 = c21595.m2938(c1831);
                                            Object objM290521 = c21595.m2905();
                                            if (zM29387 || objM290521 == c21885) {
                                                objM290521 = new TextFieldKeyInputKt$textFieldKeyInput$2$1$1(c1831);
                                                c21595.m2946(objM290521);
                                            }
                                            InterfaceC2962 interfaceC2962M13061 = AbstractC8137.m13061((InterfaceC7387) ((InterfaceC5942) objM290521));
                                            c21595.m2937(false);
                                            return interfaceC2962M13061;
                                        }
                                    };
                                    final InterfaceC2856 interfaceC28568 = interfaceC28564;
                                    InterfaceC2962 interfaceC2962M44232 = AbstractC2953.m4423(c2958, interfaceC73802);
                                    int i23 = c2859.f6316;
                                    z13 = (i23 == 7 || i23 == 8) ? false : true;
                                    boolean zBooleanValue = ((Boolean) interfaceC2230.getValue()).booleanValue();
                                    zM2939 = c21593.m2939(z13) | c21593.m2938(c1698);
                                    objM29058 = c21593.m2905();
                                    if (!zM2939 || objM29058 == c21883) {
                                        objM29058 = new C1618(c1698, 1, z13);
                                        c21593.m2946(objM29058);
                                    }
                                    InterfaceC2962 interfaceC2962M2210 = AbstractC1678.m2210(zBooleanValue, z13, (InterfaceC7372) objM29058);
                                    c2406 = (AbstractC2433) c21593.m2943(AbstractC1824.f3219);
                                    j3 = ((C2434) c21593.m2943(AbstractC1824.f3218)).f5045;
                                    if (!C2434.m3509(j3, AbstractC2416.m3442(1308617531))) {
                                        c2406 = new C2406(j3);
                                    }
                                    zM29385 = c21593.m2938(c17816) | c21593.m2920(c2406);
                                    objM29059 = c21593.m2905();
                                    if (!zM29385 || objM29059 == c21883) {
                                        objM29059 = new C0849(c17816, 13, c2406);
                                        c21593.m2946(objM29059);
                                    }
                                    InterfaceC2962 interfaceC2962Mo44263 = AbstractC8137.m13060(AbstractC8137.m13060(AbstractC1695.m2233(interfaceC2962.mo4426(AbstractC2280.m3143(c2958, (InterfaceC7387) objM29059)), c1698, c17816, c17203).mo4426(interfaceC2962M2210).mo4426(interfaceC29622), new C1797(interfaceC23202, c17816)), new C1797(c17816, c17203)).mo4426(interfaceC2962M44232);
                                    int i24 = AbstractC2744.f5973;
                                    final C1836 c18363 = c1836;
                                    i13 = 0;
                                    InterfaceC2962 interfaceC2962M2206 = AbstractC1665.m2206(AbstractC2505.m3665(interfaceC2962Mo44263.mo4426(new C2967(new C1844(c18363, i13, z2))).mo4426(interfaceC2962Mo44262).mo4426(c1717), new C1815(c17816, i13)), new C1727(c17203, interfaceC6233));
                                    if (z2 && c17816.m2427() && ((Boolean) ((AbstractC2182) c17816.f3024).getValue()).booleanValue() && ((Boolean) ((AbstractC2182) ((C2700) interfaceC2683).f5711).getValue()).booleanValue()) {
                                        i13 = 1;
                                    }
                                    final boolean z17 = i13;
                                    C2159 c21595 = c21593;
                                    final InterfaceC2962 interfaceC29623 = interfaceC2962M4423;
                                    final InterfaceC1616 interfaceC16163 = interfaceC1616;
                                    final InterfaceC2962 interfaceC2962M44233 = (i13 == 0 && AbstractC1913.m2553()) ? AbstractC2953.m4423(c2958, new InterfaceC7380() { // from class: androidx.compose.foundation.text.selection.飘花落叶言子苏楪兰世哲
                                        @Override // p068.InterfaceC7380
                                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                            InterfaceC2962 interfaceC29624 = (InterfaceC2962) obj2;
                                            ((Integer) obj4).getClass();
                                            C2159 c21596 = (C2159) ((InterfaceC2208) obj3);
                                            c21596.m2952(1980580247);
                                            InterfaceC8725 interfaceC87254 = (InterfaceC8725) c21596.m2943(AbstractC2737.f5933);
                                            Object objM290519 = c21596.m2905();
                                            C2188 c21885 = C2204.f4319;
                                            if (objM290519 == c21885) {
                                                objM290519 = AbstractC2202.m3034(new C8735(0L));
                                                c21596.m2946(objM290519);
                                            }
                                            InterfaceC2230 interfaceC22302 = (InterfaceC2230) objM290519;
                                            C1720 c17205 = c17203;
                                            boolean zM29387 = c21596.m2938(c17205);
                                            Object objM290520 = c21596.m2905();
                                            if (zM29387 || objM290520 == c21885) {
                                                objM290520 = new C1775(c17205, 1, interfaceC22302);
                                                c21596.m2946(objM290520);
                                            }
                                            final InterfaceC7372 interfaceC7372 = (InterfaceC7372) objM290520;
                                            boolean zM29204 = c21596.m2920(interfaceC87254);
                                            Object objM290521 = c21596.m2905();
                                            if (zM29204 || objM290521 == c21885) {
                                                objM290521 = new C1774(interfaceC87254, 1, interfaceC22302);
                                                c21596.m2946(objM290521);
                                            }
                                            final InterfaceC7387 interfaceC73875 = (InterfaceC7387) objM290521;
                                            C1194 c1194 = AbstractC1738.f2896;
                                            InterfaceC2962 interfaceC2962M44234 = AbstractC2953.m4423(interfaceC29624, new InterfaceC7380() { // from class: androidx.compose.foundation.text.selection.飘花落叶言子世苏楪兰哲
                                                @Override // p068.InterfaceC7380
                                                public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                                    ((Integer) obj7).getClass();
                                                    C2159 c21597 = (C2159) ((InterfaceC2208) obj6);
                                                    c21597.m2952(759876635);
                                                    Object objM290522 = c21597.m2905();
                                                    C2188 c21886 = C2204.f4319;
                                                    if (objM290522 == c21886) {
                                                        objM290522 = AbstractC2202.m3056(interfaceC7372);
                                                        c21597.m2946(objM290522);
                                                    }
                                                    InterfaceC2168 interfaceC2168 = (InterfaceC2168) objM290522;
                                                    Object objM290523 = c21597.m2905();
                                                    if (objM290523 == c21886) {
                                                        objM290523 = new C1177(new C8158(((C8158) interfaceC2168.getValue()).f19886), AbstractC1738.f2895, new C8158(AbstractC1738.f2894), 8);
                                                        c21597.m2946(objM290523);
                                                    }
                                                    C1177 c1177 = (C1177) objM290523;
                                                    boolean zM29388 = c21597.m2938(c1177);
                                                    Object objM290524 = c21597.m2905();
                                                    if (zM29388 || objM290524 == c21886) {
                                                        objM290524 = new SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1(interfaceC2168, c1177, null);
                                                        c21597.m2946(objM290524);
                                                    }
                                                    AbstractC2202.m3060(c21597, C6008.f15084, (InterfaceC7383) objM290524);
                                                    C1196 c1196 = c1177.f1472;
                                                    boolean zM29205 = c21597.m2920(c1196);
                                                    Object objM290525 = c21597.m2905();
                                                    if (zM29205 || objM290525 == c21886) {
                                                        objM290525 = new C1740(c1196, 1);
                                                        c21597.m2946(objM290525);
                                                    }
                                                    InterfaceC2962 interfaceC29625 = (InterfaceC2962) interfaceC73875.invoke((InterfaceC7372) objM290525);
                                                    c21597.m2937(false);
                                                    return interfaceC29625;
                                                }
                                            });
                                            c21596.m2937(false);
                                            return interfaceC2962M44234;
                                        }
                                    }) : c2958;
                                    InterfaceC7383 interfaceC7383 = new InterfaceC7383() { // from class: androidx.compose.foundation.text.飘花落叶言子楪兰苏哲世
                                        @Override // p068.InterfaceC7383
                                        public final Object invoke(Object obj2, Object obj3) {
                                            InterfaceC2208 interfaceC22082 = (InterfaceC2208) obj2;
                                            int iIntValue = ((Integer) obj3).intValue();
                                            C2159 c21596 = (C2159) interfaceC22082;
                                            if (c21596.m2903(iIntValue & 1, (iIntValue & 3) != 2)) {
                                                final C1781 c17818 = c17816;
                                                final C2865 c28654 = c2865;
                                                final int i25 = i2;
                                                final int i26 = i;
                                                final C1836 c18364 = c18363;
                                                final C2847 c28476 = c2847;
                                                final C1123 c11232 = c1123;
                                                final InterfaceC2962 interfaceC29624 = interfaceC29623;
                                                final InterfaceC2962 interfaceC29625 = interfaceC2962M3145;
                                                final InterfaceC2962 interfaceC29626 = interfaceC2962M3665;
                                                final InterfaceC2962 interfaceC29627 = interfaceC2962M44233;
                                                final InterfaceC1616 interfaceC16164 = interfaceC16163;
                                                final C1720 c17205 = c17203;
                                                final boolean z18 = z17;
                                                final InterfaceC7387 interfaceC73875 = interfaceC73872;
                                                final InterfaceC2856 interfaceC28569 = interfaceC28568;
                                                final InterfaceC8725 interfaceC87254 = interfaceC87253;
                                                interfaceC7380.invoke(AbstractC2089.m2749(-44346382, new InterfaceC7383() { // from class: androidx.compose.foundation.text.飘花落叶言子楪哲兰苏世
                                                    @Override // p068.InterfaceC7383
                                                    public final Object invoke(Object obj4, Object obj5) {
                                                        InterfaceC2962 c1802;
                                                        final C2847 c28477 = c28476;
                                                        long j8 = c28477.f6291;
                                                        InterfaceC2208 interfaceC22083 = (InterfaceC2208) obj4;
                                                        int iIntValue2 = ((Integer) obj5).intValue();
                                                        C2159 c21597 = (C2159) interfaceC22083;
                                                        if (c21597.m2903(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                                            final C1781 c17819 = c17818;
                                                            InterfaceC2962 interfaceC2962M1942 = AbstractC1460.m1942(C2958.f6621, ((C8722) ((AbstractC2182) c17819.f3029).getValue()).f22204, 2);
                                                            int i27 = i25;
                                                            final int i28 = i26;
                                                            AbstractC1821.m2448(i27, i28);
                                                            C2865 c28655 = c28654;
                                                            if (i27 != 1 || i28 != Integer.MAX_VALUE) {
                                                                interfaceC2962M1942 = interfaceC2962M1942.mo4426(new C1794(i27, i28, c28655));
                                                            }
                                                            boolean zM29387 = c21597.m2938(c17819);
                                                            Object objM290519 = c21597.m2905();
                                                            if (zM29387 || objM290519 == C2204.f4319) {
                                                                objM290519 = new C1791(c17819, 1);
                                                                c21597.m2946(objM290519);
                                                            }
                                                            InterfaceC7372 interfaceC7372 = (InterfaceC7372) objM290519;
                                                            C1836 c18365 = c18364;
                                                            Orientation orientation2 = (Orientation) ((AbstractC2182) c18365.f3270).getValue();
                                                            int i29 = C2869.f6347;
                                                            int iM4317 = (int) (j8 >> 32);
                                                            long j9 = c18365.f3271;
                                                            if (iM4317 == ((int) (j9 >> 32)) && (iM4317 = (int) (j8 & 4294967295L)) == ((int) (j9 & 4294967295L))) {
                                                                iM4317 = C2869.m4317(j8);
                                                            }
                                                            c18365.f3271 = j8;
                                                            C2838 c2838M24622 = AbstractC1821.m2462(c11232, c28477.f6292);
                                                            int i30 = AbstractC1843.f3290[orientation2.ordinal()];
                                                            if (i30 == 1) {
                                                                c1802 = new C1802(c18365, iM4317, c2838M24622, interfaceC7372);
                                                            } else {
                                                                if (i30 != 2) {
                                                                    C5043.m9170();
                                                                    return null;
                                                                }
                                                                c1802 = new C1786(c18365, iM4317, c2838M24622, interfaceC7372);
                                                            }
                                                            InterfaceC2962 interfaceC2962M2137 = AbstractC1613.m2137(AbstractC2280.m3146(interfaceC2962M1942).mo4426(c1802).mo4426(interfaceC29624).mo4426(interfaceC29625).mo4426(new C1838(c28655)).mo4426(interfaceC29626).mo4426(interfaceC29627), interfaceC16164);
                                                            final C1720 c17206 = c17205;
                                                            final boolean z19 = z18;
                                                            final InterfaceC7387 interfaceC73876 = interfaceC73875;
                                                            final InterfaceC2856 interfaceC285610 = interfaceC28569;
                                                            final InterfaceC8725 interfaceC87255 = interfaceC87254;
                                                            AbstractC1733.m2363(interfaceC2962M2137, AbstractC2089.m2749(1412697320, new InterfaceC7383() { // from class: androidx.compose.foundation.text.飘花落叶言子楪兰世苏哲
                                                                /* JADX WARN: Removed duplicated region for block: B:20:0x0091  */
                                                                /* JADX WARN: Removed duplicated region for block: B:25:0x00ae  */
                                                                @Override // p068.InterfaceC7383
                                                                /*
                                                                    Code decompiled incorrectly, please refer to instructions dump.
                                                                */
                                                                public final Object invoke(Object obj6, Object obj7) {
                                                                    InterfaceC2208 interfaceC22084 = (InterfaceC2208) obj6;
                                                                    int iIntValue3 = ((Integer) obj7).intValue();
                                                                    boolean z20 = true;
                                                                    C2159 c21598 = (C2159) interfaceC22084;
                                                                    if (c21598.m2903(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                                        C1781 c178110 = c17819;
                                                                        C1790 c1790 = new C1790(c178110, interfaceC73876, c28477, interfaceC285610, interfaceC87255, i28);
                                                                        int iHashCode = Long.hashCode(c21598.f4182);
                                                                        C2088 c2088M2941 = c21598.m2941();
                                                                        InterfaceC2962 interfaceC2962M4421 = AbstractC2953.m4421(c21598, C2958.f6621);
                                                                        InterfaceC2619.f5567.getClass();
                                                                        InterfaceC7372 interfaceC73722 = C2600.f5530;
                                                                        c21598.m2956();
                                                                        if (c21598.f4183) {
                                                                            c21598.m2940(interfaceC73722);
                                                                        } else {
                                                                            c21598.m2950();
                                                                        }
                                                                        AbstractC2202.m3032(c21598, c1790, C2600.f5526);
                                                                        AbstractC2202.m3032(c21598, c2088M2941, C2600.f5527);
                                                                        AbstractC2202.m3032(c21598, Integer.valueOf(iHashCode), C2600.f5533);
                                                                        AbstractC2202.m3041(c21598, C2600.f5532);
                                                                        AbstractC2202.m3032(c21598, interfaceC2962M4421, C2600.f5528);
                                                                        c21598.m2937(true);
                                                                        HandleState handleStateM2428 = c178110.m2428();
                                                                        HandleState handleState = HandleState.None;
                                                                        boolean z21 = z19;
                                                                        if (handleStateM2428 == handleState || c178110.m2426() == null) {
                                                                            z20 = false;
                                                                            C1720 c17207 = c17206;
                                                                            AbstractC1821.m2449(c17207, z20, c21598, 0);
                                                                            if (c178110.m2428() == HandleState.Cursor || !z21) {
                                                                                c21598.m2952(-714589318);
                                                                                c21598.m2937(false);
                                                                            } else {
                                                                                c21598.m2952(-714666198);
                                                                                AbstractC1821.m2468(c17207, c21598, 0);
                                                                                c21598.m2937(false);
                                                                            }
                                                                        } else {
                                                                            InterfaceC2530 interfaceC2530M2426 = c178110.m2426();
                                                                            interfaceC2530M2426.getClass();
                                                                            if (!interfaceC2530M2426.mo3646() || !z21) {
                                                                            }
                                                                            C1720 c172072 = c17206;
                                                                            AbstractC1821.m2449(c172072, z20, c21598, 0);
                                                                            if (c178110.m2428() == HandleState.Cursor) {
                                                                                c21598.m2952(-714589318);
                                                                                c21598.m2937(false);
                                                                            }
                                                                        }
                                                                    } else {
                                                                        c21598.m2899();
                                                                    }
                                                                    return C6008.f15084;
                                                                }
                                                            }, c21597), c21597, 48);
                                                        } else {
                                                            c21597.m2899();
                                                        }
                                                        return C6008.f15084;
                                                    }
                                                }, c21596), c21596, 6);
                                            } else {
                                                c21596.m2899();
                                            }
                                            return C6008.f15084;
                                        }
                                    };
                                    c2159 = c21595;
                                    m2450(interfaceC2962M2206, c17203, AbstractC2089.m2749(-814563849, interfaceC7383, c2159), c2159, 384);
                                } else {
                                    c17814 = c17813;
                                }
                                z10 = true;
                                z11 = zM29203 | z10;
                                Object objM2905182 = c21593.m2905();
                                if (z11) {
                                    c17202 = c1720;
                                    c23034 = c23033;
                                    interfaceC6233 = interfaceC62333;
                                    interfaceC29622 = interfaceC2962M2551;
                                    c2958 = c29582;
                                    c17815 = c17814;
                                    coreTextFieldKt$CoreTextField$5$1 = new CoreTextFieldKt$CoreTextField$5$1(c17815, interfaceC2230M3039, c28482, c17202, c28593, null);
                                    interfaceC2230 = interfaceC2230M3039;
                                    c28483 = c28482;
                                    c21593.m2946(coreTextFieldKt$CoreTextField$5$1);
                                    AbstractC2202.m3060(c21593, C6008.f15084, (InterfaceC7383) coreTextFieldKt$CoreTextField$5$1);
                                    InterfaceC2962 interfaceC2962M35622 = AbstractC2457.m3562(c2958, 8675309, new C1734(new C1815(c17815, 4), 0));
                                    interfaceC28563 = interfaceC28562;
                                    final boolean z162 = z9;
                                    final C2303 c230372 = c23034;
                                    final C1829 r02 = new InterfaceC7387() { // from class: androidx.compose.foundation.text.飘花落叶言子苏世兰哲楪
                                        @Override // p068.InterfaceC7387
                                        public final Object invoke(Object obj2) {
                                            C8158 c8158 = (C8158) obj2;
                                            C1781 c17818 = c17815;
                                            if (c17818.m2427()) {
                                                InterfaceC2706 interfaceC27062 = c17818.f3013;
                                                if (interfaceC27062 != null) {
                                                    ((C2736) interfaceC27062).m4155();
                                                }
                                            } else {
                                                C2303.m3192(c230372);
                                            }
                                            if (c17818.m2427() && z162) {
                                                if (c17818.m2428() != HandleState.Selection) {
                                                    C1801 c1801M2425 = c17818.m2425();
                                                    if (c1801M2425 != null) {
                                                        long j8 = c8158.f19886;
                                                        C0923 c09232 = c17818.f3012;
                                                        C1815 c18152 = c17818.f3021;
                                                        int iM2438 = c1801M2425.m2438(j8, true);
                                                        interfaceC28563.mo2443(iM2438);
                                                        c18152.invoke(C2847.m4275((C2847) c09232.f572, null, AbstractC2882.m4330(iM2438, iM2438), 5));
                                                        if (c17818.f3015.f3301.f6474.length() > 0) {
                                                            ((AbstractC2182) c17818.f3030).setValue(HandleState.Cursor);
                                                        }
                                                    }
                                                } else {
                                                    c17202.m2333(c8158);
                                                }
                                            }
                                            return C6008.f15084;
                                        }
                                    };
                                    if (z2) {
                                    }
                                    InterfaceC2962 interfaceC2962Mo44264 = interfaceC2962M35622.mo4426(new C2458(c17202.f2827, c17202.f2828, new C1845(c17202), 4));
                                    InterfaceC2476.f5147.getClass();
                                    InterfaceC2962 interfaceC2962Mo442622 = interfaceC2962Mo44264.mo4426(new C2484());
                                    final InterfaceC2962 interfaceC2962M31452 = AbstractC2280.m3145(c2958, new C1597(c17815, c28473, interfaceC28563, 2));
                                    zM29382 = c21593.m2938(c17815) | (i11 != 2048) | c21593.m2920(interfaceC26832) | c21593.m2938(c17202) | (i12 != 4) | c21593.m2938(interfaceC28563);
                                    objM29055 = c21593.m2905();
                                    if (zM29382) {
                                        final C2847 c284752 = c28473;
                                        c28484 = c28483;
                                        InterfaceC7387 interfaceC738742 = new InterfaceC7387() { // from class: androidx.compose.foundation.text.飘花落叶言子世楪苏哲兰
                                            @Override // p068.InterfaceC7387
                                            public final Object invoke(Object obj2) {
                                                C2831 c28312;
                                                InterfaceC2530 interfaceC2530;
                                                InterfaceC2530 interfaceC25302;
                                                C1781 c17818 = c17815;
                                                InterfaceC2230 interfaceC22302 = c17818.f3026;
                                                InterfaceC2530 interfaceC25303 = (InterfaceC2530) obj2;
                                                c17818.f3028 = interfaceC25303;
                                                C1801 c1801M2425 = c17818.m2425();
                                                if (c1801M2425 != null) {
                                                    c1801M2425.f3089 = interfaceC25303;
                                                }
                                                if (z2) {
                                                    HandleState handleStateM2428 = c17818.m2428();
                                                    HandleState handleState = HandleState.Selection;
                                                    C1720 c17205 = c17202;
                                                    C2847 c28476 = c284752;
                                                    if (handleStateM2428 == handleState) {
                                                        if (((Boolean) ((AbstractC2182) c17818.f3031).getValue()).booleanValue() && ((Boolean) ((AbstractC2182) ((C2700) interfaceC26832).f5711).getValue()).booleanValue()) {
                                                            c17205.m2315();
                                                        } else {
                                                            c17205.m2323();
                                                        }
                                                        ((AbstractC2182) c17818.f3023).setValue(Boolean.valueOf(AbstractC1733.m2373(c17205, true)));
                                                        ((AbstractC2182) c17818.f3022).setValue(Boolean.valueOf(AbstractC1733.m2373(c17205, false)));
                                                        ((AbstractC2182) interfaceC22302).setValue(Boolean.valueOf(C2869.m4312(c28476.f6291)));
                                                    } else if (c17818.m2428() == HandleState.Cursor) {
                                                        ((AbstractC2182) interfaceC22302).setValue(Boolean.valueOf(AbstractC1733.m2373(c17205, true)));
                                                    }
                                                    InterfaceC2856 interfaceC285682 = interfaceC28563;
                                                    AbstractC1821.m2460(c17818, c28476, interfaceC285682);
                                                    C1801 c1801M24252 = c17818.m2425();
                                                    if (c1801M24252 != null && (c28312 = c17818.f3011) != null && c17818.m2427() && (interfaceC2530 = c1801M24252.f3089) != null && interfaceC2530.mo3646() && (interfaceC25302 = c1801M24252.f3088) != null) {
                                                        C2867 c2867 = c1801M24252.f3090;
                                                        C1850 c1850 = new C1850(interfaceC2530, 0);
                                                        C8157 c8157M2367 = AbstractC1733.m2367(interfaceC2530);
                                                        C8157 c8157Mo3649 = interfaceC2530.mo3649(interfaceC25302, false);
                                                        if (AbstractC5227.m9466((C2831) c28312.f6234.f6293.get(), c28312)) {
                                                            c28312.f6233.mo2247(c28476, interfaceC285682, c2867, c1850, c8157M2367, c8157Mo3649);
                                                        }
                                                    }
                                                }
                                                return C6008.f15084;
                                            }
                                        };
                                        interfaceC2683 = interfaceC26832;
                                        interfaceC28563 = interfaceC28563;
                                        c21593.m2946(interfaceC738742);
                                        objM29055 = interfaceC738742;
                                        final InterfaceC2962 interfaceC2962M36652 = AbstractC2505.m3665(c2958, (InterfaceC7387) objM29055);
                                        c17816 = c17815;
                                        c17203 = c17202;
                                        C1717 c17172 = new C1717(c2838, c2847, c17816, z2, interfaceC28563, c17203, c2859, c23034);
                                        if (!z2) {
                                            if (!(!z2 && ((Boolean) ((AbstractC2182) ((C2700) interfaceC2683).f5711).getValue()).booleanValue() && C2869.m4312(((C2869) ((AbstractC2182) c17816.f3007).getValue()).f6349) && C2869.m4312(((C2869) ((AbstractC2182) c17816.f3006).getValue()).f6349))) {
                                            }
                                            zM29383 = c21593.m2938(c17203);
                                            objM29056 = c21593.m2905();
                                            if (!zM29383) {
                                                objM29056 = new C1799(c17203, 1);
                                                c21593.m2946(objM29056);
                                                AbstractC2202.m3044(c17203, (InterfaceC7387) objM29056, c21593);
                                                if (i9 <= 32) {
                                                    zM29384 = c21593.m2938(c17816) | c21593.m2938(c28484) | (i12 != 4) | ((i9 <= 32 && c21593.m2920(c2859)) || (i10 & 48) == 32);
                                                    objM29057 = c21593.m2905();
                                                    if (zM29384) {
                                                        objM29057 = new InterfaceC7387() { // from class: androidx.compose.foundation.text.飘花落叶言子世楪苏兰哲
                                                            /* JADX WARN: Type inference failed for: r6v3, types: [T, androidx.compose.ui.text.input.飘花落叶言子世楪兰哲苏, java.lang.Object] */
                                                            @Override // p068.InterfaceC7387
                                                            public final Object invoke(Object obj2) {
                                                                C1781 c17818 = c17816;
                                                                if (c17818.m2427()) {
                                                                    C0923 c09232 = c17818.f3012;
                                                                    C1815 c18152 = c17818.f3021;
                                                                    C1815 c181522 = c17818.f3018;
                                                                    Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                                                                    C1597 c1597 = new C1597(c09232, c18152, ref$ObjectRef, 3);
                                                                    C2848 c28487 = c28484;
                                                                    InterfaceC2854 interfaceC2854 = c28487.f6294;
                                                                    interfaceC2854.mo2246(c2847, c2859, c1597, c181522);
                                                                    ?? c28312 = new C2831(c28487, interfaceC2854);
                                                                    c28487.f6293.set(c28312);
                                                                    ref$ObjectRef.element = c28312;
                                                                    c17818.f3011 = c28312;
                                                                }
                                                                return new C1789();
                                                            }
                                                        };
                                                        c21593.m2946(objM29057);
                                                        AbstractC2202.m3044(c2859, (InterfaceC7387) objM29057, c21593);
                                                        final InterfaceC7387 c18152 = c17816.f3021;
                                                        if (i != 1) {
                                                        }
                                                        final int i222 = c2859.f6315;
                                                        final C1803 c180332 = c18032;
                                                        InterfaceC7380 interfaceC738022 = new InterfaceC7380() { // from class: androidx.compose.foundation.text.飘花落叶言子苏世兰楪哲
                                                            @Override // p068.InterfaceC7380
                                                            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                                                ((Integer) obj4).getClass();
                                                                C2159 c215952 = (C2159) ((InterfaceC2208) obj3);
                                                                c215952.m2952(851809892);
                                                                Object objM290519 = c215952.m2905();
                                                                C2188 c21885 = C2204.f4319;
                                                                if (objM290519 == c21885) {
                                                                    objM290519 = new C1769();
                                                                    c215952.m2946(objM290519);
                                                                }
                                                                C1769 c1769 = (C1769) objM290519;
                                                                Object objM290520 = c215952.m2905();
                                                                if (objM290520 == c21885) {
                                                                    objM290520 = new C1796();
                                                                    c215952.m2946(objM290520);
                                                                }
                                                                C1831 c1831 = new C1831(c17816, c17203, c2847, z15, z12, c1769, interfaceC28564, c180332, (C1796) objM290520, c18152, i222);
                                                                boolean zM29387 = c215952.m2938(c1831);
                                                                Object objM290521 = c215952.m2905();
                                                                if (zM29387 || objM290521 == c21885) {
                                                                    objM290521 = new TextFieldKeyInputKt$textFieldKeyInput$2$1$1(c1831);
                                                                    c215952.m2946(objM290521);
                                                                }
                                                                InterfaceC2962 interfaceC2962M13061 = AbstractC8137.m13061((InterfaceC7387) ((InterfaceC5942) objM290521));
                                                                c215952.m2937(false);
                                                                return interfaceC2962M13061;
                                                            }
                                                        };
                                                        final InterfaceC2856 interfaceC285682 = interfaceC28564;
                                                        InterfaceC2962 interfaceC2962M442322 = AbstractC2953.m4423(c2958, interfaceC738022);
                                                        int i232 = c2859.f6316;
                                                        if (i232 == 7) {
                                                            boolean zBooleanValue2 = ((Boolean) interfaceC2230.getValue()).booleanValue();
                                                            zM2939 = c21593.m2939(z13) | c21593.m2938(c1698);
                                                            objM29058 = c21593.m2905();
                                                            if (!zM2939) {
                                                                objM29058 = new C1618(c1698, 1, z13);
                                                                c21593.m2946(objM29058);
                                                                InterfaceC2962 interfaceC2962M22102 = AbstractC1678.m2210(zBooleanValue2, z13, (InterfaceC7372) objM29058);
                                                                c2406 = (AbstractC2433) c21593.m2943(AbstractC1824.f3219);
                                                                j3 = ((C2434) c21593.m2943(AbstractC1824.f3218)).f5045;
                                                                if (!C2434.m3509(j3, AbstractC2416.m3442(1308617531))) {
                                                                }
                                                                zM29385 = c21593.m2938(c17816) | c21593.m2920(c2406);
                                                                objM29059 = c21593.m2905();
                                                                if (!zM29385) {
                                                                    objM29059 = new C0849(c17816, 13, c2406);
                                                                    c21593.m2946(objM29059);
                                                                    InterfaceC2962 interfaceC2962Mo442632 = AbstractC8137.m13060(AbstractC8137.m13060(AbstractC1695.m2233(interfaceC2962.mo4426(AbstractC2280.m3143(c2958, (InterfaceC7387) objM29059)), c1698, c17816, c17203).mo4426(interfaceC2962M22102).mo4426(interfaceC29622), new C1797(interfaceC23202, c17816)), new C1797(c17816, c17203)).mo4426(interfaceC2962M442322);
                                                                    int i242 = AbstractC2744.f5973;
                                                                    final C1836 c183632 = c1836;
                                                                    i13 = 0;
                                                                    InterfaceC2962 interfaceC2962M22062 = AbstractC1665.m2206(AbstractC2505.m3665(interfaceC2962Mo442632.mo4426(new C2967(new C1844(c183632, i13, z2))).mo4426(interfaceC2962Mo442622).mo4426(c17172), new C1815(c17816, i13)), new C1727(c17203, interfaceC6233));
                                                                    if (z2) {
                                                                        i13 = 1;
                                                                    }
                                                                    if (i13 == 0) {
                                                                        final boolean z172 = i13;
                                                                        C2159 c215952 = c21593;
                                                                        final InterfaceC2962 interfaceC296232 = interfaceC2962M4423;
                                                                        final InterfaceC1616 interfaceC161632 = interfaceC1616;
                                                                        final InterfaceC2962 interfaceC2962M442332 = (i13 == 0 && AbstractC1913.m2553()) ? AbstractC2953.m4423(c2958, new InterfaceC7380() { // from class: androidx.compose.foundation.text.selection.飘花落叶言子苏楪兰世哲
                                                                            @Override // p068.InterfaceC7380
                                                                            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                                                                InterfaceC2962 interfaceC29624 = (InterfaceC2962) obj2;
                                                                                ((Integer) obj4).getClass();
                                                                                C2159 c21596 = (C2159) ((InterfaceC2208) obj3);
                                                                                c21596.m2952(1980580247);
                                                                                InterfaceC8725 interfaceC87254 = (InterfaceC8725) c21596.m2943(AbstractC2737.f5933);
                                                                                Object objM290519 = c21596.m2905();
                                                                                C2188 c21885 = C2204.f4319;
                                                                                if (objM290519 == c21885) {
                                                                                    objM290519 = AbstractC2202.m3034(new C8735(0L));
                                                                                    c21596.m2946(objM290519);
                                                                                }
                                                                                InterfaceC2230 interfaceC22302 = (InterfaceC2230) objM290519;
                                                                                C1720 c17205 = c17203;
                                                                                boolean zM29387 = c21596.m2938(c17205);
                                                                                Object objM290520 = c21596.m2905();
                                                                                if (zM29387 || objM290520 == c21885) {
                                                                                    objM290520 = new C1775(c17205, 1, interfaceC22302);
                                                                                    c21596.m2946(objM290520);
                                                                                }
                                                                                final InterfaceC7372 interfaceC7372 = (InterfaceC7372) objM290520;
                                                                                boolean zM29204 = c21596.m2920(interfaceC87254);
                                                                                Object objM290521 = c21596.m2905();
                                                                                if (zM29204 || objM290521 == c21885) {
                                                                                    objM290521 = new C1774(interfaceC87254, 1, interfaceC22302);
                                                                                    c21596.m2946(objM290521);
                                                                                }
                                                                                final InterfaceC7387 interfaceC73875 = (InterfaceC7387) objM290521;
                                                                                C1194 c1194 = AbstractC1738.f2896;
                                                                                InterfaceC2962 interfaceC2962M44234 = AbstractC2953.m4423(interfaceC29624, new InterfaceC7380() { // from class: androidx.compose.foundation.text.selection.飘花落叶言子世苏楪兰哲
                                                                                    @Override // p068.InterfaceC7380
                                                                                    public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                                                                        ((Integer) obj7).getClass();
                                                                                        C2159 c21597 = (C2159) ((InterfaceC2208) obj6);
                                                                                        c21597.m2952(759876635);
                                                                                        Object objM290522 = c21597.m2905();
                                                                                        C2188 c21886 = C2204.f4319;
                                                                                        if (objM290522 == c21886) {
                                                                                            objM290522 = AbstractC2202.m3056(interfaceC7372);
                                                                                            c21597.m2946(objM290522);
                                                                                        }
                                                                                        InterfaceC2168 interfaceC2168 = (InterfaceC2168) objM290522;
                                                                                        Object objM290523 = c21597.m2905();
                                                                                        if (objM290523 == c21886) {
                                                                                            objM290523 = new C1177(new C8158(((C8158) interfaceC2168.getValue()).f19886), AbstractC1738.f2895, new C8158(AbstractC1738.f2894), 8);
                                                                                            c21597.m2946(objM290523);
                                                                                        }
                                                                                        C1177 c1177 = (C1177) objM290523;
                                                                                        boolean zM29388 = c21597.m2938(c1177);
                                                                                        Object objM290524 = c21597.m2905();
                                                                                        if (zM29388 || objM290524 == c21886) {
                                                                                            objM290524 = new SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1(interfaceC2168, c1177, null);
                                                                                            c21597.m2946(objM290524);
                                                                                        }
                                                                                        AbstractC2202.m3060(c21597, C6008.f15084, (InterfaceC7383) objM290524);
                                                                                        C1196 c1196 = c1177.f1472;
                                                                                        boolean zM29205 = c21597.m2920(c1196);
                                                                                        Object objM290525 = c21597.m2905();
                                                                                        if (zM29205 || objM290525 == c21886) {
                                                                                            objM290525 = new C1740(c1196, 1);
                                                                                            c21597.m2946(objM290525);
                                                                                        }
                                                                                        InterfaceC2962 interfaceC29625 = (InterfaceC2962) interfaceC73875.invoke((InterfaceC7372) objM290525);
                                                                                        c21597.m2937(false);
                                                                                        return interfaceC29625;
                                                                                    }
                                                                                });
                                                                                c21596.m2937(false);
                                                                                return interfaceC2962M44234;
                                                                            }
                                                                        }) : c2958;
                                                                        InterfaceC7383 interfaceC73832 = new InterfaceC7383() { // from class: androidx.compose.foundation.text.飘花落叶言子楪兰苏哲世
                                                                            @Override // p068.InterfaceC7383
                                                                            public final Object invoke(Object obj2, Object obj3) {
                                                                                InterfaceC2208 interfaceC22082 = (InterfaceC2208) obj2;
                                                                                int iIntValue = ((Integer) obj3).intValue();
                                                                                C2159 c21596 = (C2159) interfaceC22082;
                                                                                if (c21596.m2903(iIntValue & 1, (iIntValue & 3) != 2)) {
                                                                                    final C1781 c17818 = c17816;
                                                                                    final C2865 c28654 = c2865;
                                                                                    final int i25 = i2;
                                                                                    final int i26 = i;
                                                                                    final C1836 c18364 = c183632;
                                                                                    final C2847 c28476 = c2847;
                                                                                    final C1123 c11232 = c1123;
                                                                                    final InterfaceC2962 interfaceC29624 = interfaceC296232;
                                                                                    final InterfaceC2962 interfaceC29625 = interfaceC2962M31452;
                                                                                    final InterfaceC2962 interfaceC29626 = interfaceC2962M36652;
                                                                                    final InterfaceC2962 interfaceC29627 = interfaceC2962M442332;
                                                                                    final InterfaceC1616 interfaceC16164 = interfaceC161632;
                                                                                    final C1720 c17205 = c17203;
                                                                                    final boolean z18 = z172;
                                                                                    final InterfaceC7387 interfaceC73875 = interfaceC73872;
                                                                                    final InterfaceC2856 interfaceC28569 = interfaceC285682;
                                                                                    final InterfaceC8725 interfaceC87254 = interfaceC87253;
                                                                                    interfaceC7380.invoke(AbstractC2089.m2749(-44346382, new InterfaceC7383() { // from class: androidx.compose.foundation.text.飘花落叶言子楪哲兰苏世
                                                                                        @Override // p068.InterfaceC7383
                                                                                        public final Object invoke(Object obj4, Object obj5) {
                                                                                            InterfaceC2962 c1802;
                                                                                            final C2847 c28477 = c28476;
                                                                                            long j8 = c28477.f6291;
                                                                                            InterfaceC2208 interfaceC22083 = (InterfaceC2208) obj4;
                                                                                            int iIntValue2 = ((Integer) obj5).intValue();
                                                                                            C2159 c21597 = (C2159) interfaceC22083;
                                                                                            if (c21597.m2903(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                                                                                final C1781 c17819 = c17818;
                                                                                                InterfaceC2962 interfaceC2962M1942 = AbstractC1460.m1942(C2958.f6621, ((C8722) ((AbstractC2182) c17819.f3029).getValue()).f22204, 2);
                                                                                                int i27 = i25;
                                                                                                final int i28 = i26;
                                                                                                AbstractC1821.m2448(i27, i28);
                                                                                                C2865 c28655 = c28654;
                                                                                                if (i27 != 1 || i28 != Integer.MAX_VALUE) {
                                                                                                    interfaceC2962M1942 = interfaceC2962M1942.mo4426(new C1794(i27, i28, c28655));
                                                                                                }
                                                                                                boolean zM29387 = c21597.m2938(c17819);
                                                                                                Object objM290519 = c21597.m2905();
                                                                                                if (zM29387 || objM290519 == C2204.f4319) {
                                                                                                    objM290519 = new C1791(c17819, 1);
                                                                                                    c21597.m2946(objM290519);
                                                                                                }
                                                                                                InterfaceC7372 interfaceC7372 = (InterfaceC7372) objM290519;
                                                                                                C1836 c18365 = c18364;
                                                                                                Orientation orientation2 = (Orientation) ((AbstractC2182) c18365.f3270).getValue();
                                                                                                int i29 = C2869.f6347;
                                                                                                int iM4317 = (int) (j8 >> 32);
                                                                                                long j9 = c18365.f3271;
                                                                                                if (iM4317 == ((int) (j9 >> 32)) && (iM4317 = (int) (j8 & 4294967295L)) == ((int) (j9 & 4294967295L))) {
                                                                                                    iM4317 = C2869.m4317(j8);
                                                                                                }
                                                                                                c18365.f3271 = j8;
                                                                                                C2838 c2838M24622 = AbstractC1821.m2462(c11232, c28477.f6292);
                                                                                                int i30 = AbstractC1843.f3290[orientation2.ordinal()];
                                                                                                if (i30 == 1) {
                                                                                                    c1802 = new C1802(c18365, iM4317, c2838M24622, interfaceC7372);
                                                                                                } else {
                                                                                                    if (i30 != 2) {
                                                                                                        C5043.m9170();
                                                                                                        return null;
                                                                                                    }
                                                                                                    c1802 = new C1786(c18365, iM4317, c2838M24622, interfaceC7372);
                                                                                                }
                                                                                                InterfaceC2962 interfaceC2962M2137 = AbstractC1613.m2137(AbstractC2280.m3146(interfaceC2962M1942).mo4426(c1802).mo4426(interfaceC29624).mo4426(interfaceC29625).mo4426(new C1838(c28655)).mo4426(interfaceC29626).mo4426(interfaceC29627), interfaceC16164);
                                                                                                final C1720 c17206 = c17205;
                                                                                                final boolean z19 = z18;
                                                                                                final InterfaceC7387 interfaceC73876 = interfaceC73875;
                                                                                                final InterfaceC2856 interfaceC285610 = interfaceC28569;
                                                                                                final InterfaceC8725 interfaceC87255 = interfaceC87254;
                                                                                                AbstractC1733.m2363(interfaceC2962M2137, AbstractC2089.m2749(1412697320, new InterfaceC7383() { // from class: androidx.compose.foundation.text.飘花落叶言子楪兰世苏哲
                                                                                                    /* JADX WARN: Removed duplicated region for block: B:20:0x0091  */
                                                                                                    /* JADX WARN: Removed duplicated region for block: B:25:0x00ae  */
                                                                                                    @Override // p068.InterfaceC7383
                                                                                                    /*
                                                                                                        Code decompiled incorrectly, please refer to instructions dump.
                                                                                                    */
                                                                                                    public final Object invoke(Object obj6, Object obj7) {
                                                                                                        InterfaceC2208 interfaceC22084 = (InterfaceC2208) obj6;
                                                                                                        int iIntValue3 = ((Integer) obj7).intValue();
                                                                                                        boolean z20 = true;
                                                                                                        C2159 c21598 = (C2159) interfaceC22084;
                                                                                                        if (c21598.m2903(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                                                                            C1781 c178110 = c17819;
                                                                                                            C1790 c1790 = new C1790(c178110, interfaceC73876, c28477, interfaceC285610, interfaceC87255, i28);
                                                                                                            int iHashCode = Long.hashCode(c21598.f4182);
                                                                                                            C2088 c2088M2941 = c21598.m2941();
                                                                                                            InterfaceC2962 interfaceC2962M4421 = AbstractC2953.m4421(c21598, C2958.f6621);
                                                                                                            InterfaceC2619.f5567.getClass();
                                                                                                            InterfaceC7372 interfaceC73722 = C2600.f5530;
                                                                                                            c21598.m2956();
                                                                                                            if (c21598.f4183) {
                                                                                                                c21598.m2940(interfaceC73722);
                                                                                                            } else {
                                                                                                                c21598.m2950();
                                                                                                            }
                                                                                                            AbstractC2202.m3032(c21598, c1790, C2600.f5526);
                                                                                                            AbstractC2202.m3032(c21598, c2088M2941, C2600.f5527);
                                                                                                            AbstractC2202.m3032(c21598, Integer.valueOf(iHashCode), C2600.f5533);
                                                                                                            AbstractC2202.m3041(c21598, C2600.f5532);
                                                                                                            AbstractC2202.m3032(c21598, interfaceC2962M4421, C2600.f5528);
                                                                                                            c21598.m2937(true);
                                                                                                            HandleState handleStateM2428 = c178110.m2428();
                                                                                                            HandleState handleState = HandleState.None;
                                                                                                            boolean z21 = z19;
                                                                                                            if (handleStateM2428 == handleState || c178110.m2426() == null) {
                                                                                                                z20 = false;
                                                                                                                C1720 c172072 = c17206;
                                                                                                                AbstractC1821.m2449(c172072, z20, c21598, 0);
                                                                                                                if (c178110.m2428() == HandleState.Cursor || !z21) {
                                                                                                                    c21598.m2952(-714589318);
                                                                                                                    c21598.m2937(false);
                                                                                                                } else {
                                                                                                                    c21598.m2952(-714666198);
                                                                                                                    AbstractC1821.m2468(c172072, c21598, 0);
                                                                                                                    c21598.m2937(false);
                                                                                                                }
                                                                                                            } else {
                                                                                                                InterfaceC2530 interfaceC2530M2426 = c178110.m2426();
                                                                                                                interfaceC2530M2426.getClass();
                                                                                                                if (!interfaceC2530M2426.mo3646() || !z21) {
                                                                                                                }
                                                                                                                C1720 c1720722 = c17206;
                                                                                                                AbstractC1821.m2449(c1720722, z20, c21598, 0);
                                                                                                                if (c178110.m2428() == HandleState.Cursor) {
                                                                                                                    c21598.m2952(-714589318);
                                                                                                                    c21598.m2937(false);
                                                                                                                }
                                                                                                            }
                                                                                                        } else {
                                                                                                            c21598.m2899();
                                                                                                        }
                                                                                                        return C6008.f15084;
                                                                                                    }
                                                                                                }, c21597), c21597, 48);
                                                                                            } else {
                                                                                                c21597.m2899();
                                                                                            }
                                                                                            return C6008.f15084;
                                                                                        }
                                                                                    }, c21596), c21596, 6);
                                                                                } else {
                                                                                    c21596.m2899();
                                                                                }
                                                                                return C6008.f15084;
                                                                            }
                                                                        };
                                                                        c2159 = c215952;
                                                                        m2450(interfaceC2962M22062, c17203, AbstractC2089.m2749(-814563849, interfaceC73832, c2159), c2159, 384);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    zM29384 = c21593.m2938(c17816) | c21593.m2938(c28484) | (i12 != 4) | ((i9 <= 32 && c21593.m2920(c2859)) || (i10 & 48) == 32);
                                                    objM29057 = c21593.m2905();
                                                    if (zM29384) {
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                c28592 = c2859;
                            }
                            c17812 = c17817;
                            z8 = zM29386;
                            boolean z18 = (i19 & 48) != 32;
                            zM2938 = z8 | z18 | c21592.m2938(interfaceC28567) | c21592.m2938(interfaceC62332) | c21592.m2938(interfaceC16162) | c21592.m2938(c17204);
                            Object objM2905172 = c21592.m2905();
                            if (zM2938) {
                                C2859 c285942 = c28592;
                                c21593 = c21592;
                                c17813 = c17812;
                                c18032 = c1803;
                                i10 = i19;
                                c28593 = c285942;
                                i11 = i20;
                                interfaceC23202 = interfaceC2320;
                                c21883 = c21882;
                                c28482 = c28486;
                                i12 = i21;
                                c23033 = c23032;
                                obj = new InterfaceC7387() { // from class: androidx.compose.foundation.text.飘花落叶言子楪兰哲苏世
                                    @Override // p068.InterfaceC7387
                                    public final Object invoke(Object obj2) {
                                        C1801 c1801M2425;
                                        InterfaceC2291 interfaceC2291 = (InterfaceC2291) obj2;
                                        C1781 c17818 = c17813;
                                        boolean zM2427 = c17818.m2427();
                                        boolean zIsFocused = interfaceC2291.isFocused();
                                        C6008 c6008 = C6008.f15084;
                                        if (zM2427 != zIsFocused) {
                                            ((AbstractC2182) c17818.f3010).setValue(Boolean.valueOf(interfaceC2291.isFocused()));
                                            boolean zM24272 = c17818.m2427();
                                            C2847 c284753 = c2847;
                                            InterfaceC2856 interfaceC285683 = interfaceC28567;
                                            if (zM24272 && z2) {
                                                AbstractC1821.m2458(c28482, c17818, c284753, c28593, interfaceC285683);
                                            } else {
                                                AbstractC1821.m2470(c17818);
                                            }
                                            if (interfaceC2291.isFocused() && (c1801M2425 = c17818.m2425()) != null) {
                                                AbstractC6231.m11036(interfaceC62332, null, null, new CoreTextFieldKt$CoreTextField$focusModifier$1$1$1$1(interfaceC16162, c284753, c17818, c1801M2425, interfaceC285683, null), 3);
                                            }
                                            if (!interfaceC2291.isFocused()) {
                                                c17204.m2333(null);
                                            }
                                        }
                                        return c6008;
                                    }
                                };
                                interfaceC1616 = interfaceC16162;
                                z9 = z2;
                                c1720 = c17204;
                                c28473 = c2847;
                                interfaceC62332 = interfaceC62332;
                                interfaceC28562 = interfaceC28567;
                                c21593.m2946(obj);
                                C2958 c295822 = C2958.f6621;
                                InterfaceC6233 interfaceC623332 = interfaceC62332;
                                InterfaceC2962 interfaceC2962M25512 = AbstractC1910.m2551(AbstractC2294.m3174(AbstractC2294.m3190(c295822, c23033), (InterfaceC7387) obj), z9);
                                InterfaceC2230 interfaceC2230M30392 = AbstractC2202.m3039(Boolean.valueOf(z9), c21593);
                                boolean zM292032 = c21593.m2920(interfaceC2230M30392) | c21593.m2938(c17813) | c21593.m2938(c28482) | c21593.m2938(c1720);
                                if (i9 > 32) {
                                    c17814 = c17813;
                                    if ((i10 & 48) != 32) {
                                        z10 = true;
                                    }
                                    z11 = zM292032 | z10;
                                    Object objM29051822 = c21593.m2905();
                                    if (z11) {
                                    }
                                }
                            }
                        } else {
                            Long l = c1803.f3096;
                            if (jCurrentTimeMillis > (l != null ? l.longValue() : 0L) + 5000) {
                            }
                            objM29052 = c21592.m2905();
                            if (objM29052 == c21882) {
                            }
                            final InterfaceC6233 interfaceC623322 = (InterfaceC6233) objM29052;
                            objM29053 = c21592.m2905();
                            if (objM29053 == c21882) {
                            }
                            final InterfaceC1616 interfaceC161622 = (InterfaceC1616) objM29053;
                            objM29054 = c21592.m2905();
                            if (objM29054 == c21882) {
                            }
                            final C1720 c172042 = (C1720) objM29054;
                            final InterfaceC2856 interfaceC285672 = interfaceC2856;
                            c172042.f2834 = interfaceC285672;
                            c172042.f2833 = c17817.f3021;
                            c172042.f2832 = c17817;
                            ((AbstractC2182) c172042.f2831).setValue(c28472);
                            c172042.f2838 = new C2869(j2);
                            c172042.f2849 = (InterfaceC2756) c21592.m2943(AbstractC2737.f5915);
                            c172042.f2848 = interfaceC623322;
                            c172042.f2853 = (InterfaceC2709) c21592.m2943(AbstractC2737.f5930);
                            c172042.f2850 = (InterfaceC8146) c21592.m2943(AbstractC2737.f5936);
                            C2303 c230362 = c2303;
                            c172042.f2851 = c230362;
                            final boolean z152 = true;
                            ((AbstractC2182) c172042.f2843).setValue(true);
                            ((AbstractC2182) c172042.f2842).setValue(Boolean.valueOf(z2));
                            c21592.m2952(1966756105);
                            SelectedTextType selectedTextType2 = SelectedTextType.EditableText;
                            C8661 c86612 = c28653.f6329.f6409;
                            C2169 c21692 = AbstractC1757.f2954;
                            c21592.m2952(430530635);
                            if (Build.VERSION.SDK_INT >= 28) {
                            }
                            c172042.f2852 = interfaceC1755;
                            c21592.m2937(z7);
                            c17817.m2427();
                            int i192 = i8;
                            int i202 = i192 & 7168;
                            C2848 c284862 = c2848;
                            int i212 = i7;
                            boolean zM293862 = c21592.m2938(c17817) | (i202 != 2048) | ((i192 & 57344) != 16384) | c21592.m2938(c284862) | (i212 != 4);
                            i9 = (i192 & 112) ^ 48;
                            if (i9 <= 32) {
                            }
                            c17812 = c17817;
                            z8 = zM293862;
                            if ((i192 & 48) != 32) {
                            }
                            zM2938 = z8 | z18 | c21592.m2938(interfaceC285672) | c21592.m2938(interfaceC623322) | c21592.m2938(interfaceC161622) | c21592.m2938(c172042);
                            Object objM29051722 = c21592.m2905();
                            if (zM2938) {
                            }
                        }
                    }
                    z6 = zM9466;
                    if (z4) {
                        C2857 c285722 = (C2857) c0923.f573;
                        c285722.f6307 = -1;
                        c285722.f6306 = -1;
                        c28472 = c2847;
                        c2847M4275 = C2847.m4275(c28472, null, 0L, 3);
                        C2847 c284742 = (C2847) c0923.f572;
                        c0923.f572 = c2847M4275;
                        if (c2831 != null) {
                        }
                        objM2905 = c21592.m2905();
                        c21882 = c2188;
                        if (objM2905 == c21882) {
                        }
                        c1803 = (C1803) objM2905;
                        long jCurrentTimeMillis2 = System.currentTimeMillis();
                        if (c1803.f3095) {
                        }
                    }
                }
            } else {
                j2 = j;
                c0923.f573 = new C2857(c29023, j2);
                z4 = true;
            }
            z5 = false;
            if (c28693 != null) {
            }
            z6 = zM9466;
            if (z4) {
            }
        } else {
            c2159 = c21594;
            c2159.m2899();
        }
        C2224 c2224M2935 = c2159.m2935();
        if (c2224M2935 != null) {
            c2224M2935.f4379 = new InterfaceC7383() { // from class: androidx.compose.foundation.text.飘花落叶言子楪兰哲世苏
                @Override // p068.InterfaceC7383
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iM3031 = AbstractC2202.m3031(i3 | 1);
                    int iM30312 = AbstractC2202.m3031(i4);
                    AbstractC1821.m2451(c2847, interfaceC7387, interfaceC2962, c2865, c1123, interfaceC73872, abstractC2433, z, i, i2, c2859, c1779, z2, interfaceC7380, (InterfaceC2208) obj2, iM3031, iM30312);
                    return C6008.f15084;
                }
            };
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final void m2452(C1720 c1720, C2077 c2077, InterfaceC2208 interfaceC2208, int i) {
        int i2;
        C2159 c2159 = (C2159) interfaceC2208;
        c2159.m2951(2080741862);
        if ((i & 6) == 0) {
            i2 = (c2159.m2938(c1720) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c2159.m2938(c2077) ? 32 : 16;
        }
        int i3 = 1;
        if (c2159.m2903(i2 & 1, (i2 & 19) != 18)) {
            m2453(c1720, c2077, c2159, i2 & 126);
        } else {
            c2159.m2899();
        }
        C2224 c2224M2935 = c2159.m2935();
        if (c2224M2935 != null) {
            c2224M2935.f4379 = new C1818(c1720, c2077, i, i3);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final void m2453(C1720 c1720, C2077 c2077, InterfaceC2208 interfaceC2208, int i) {
        int i2;
        C2159 c2159 = (C2159) interfaceC2208;
        c2159.m2951(1533506138);
        if ((i & 6) == 0) {
            i2 = (c2159.m2938(c1720) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c2159.m2938(c2077) ? 32 : 16;
        }
        int i3 = 0;
        if (c2159.m2903(i2 & 1, (i2 & 19) != 18)) {
            c2159.m2952(-885604480);
            AbstractC1648.m2194(c1720.m2325(), c2077, c2159, i2 & 112);
            c2159.m2937(false);
        } else {
            c2159.m2899();
        }
        C2224 c2224M2935 = c2159.m2935();
        if (c2224M2935 != null) {
            c2224M2935.f4379 = new C1818(c1720, c2077, i, i3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:135:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:154:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0111  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2454(String str, final InterfaceC2962 interfaceC2962, final C2865 c2865, InterfaceC7387 interfaceC7387, int i, boolean z, final int i2, int i3, InterfaceC2208 interfaceC2208, final int i4, final int i5) {
        int i6;
        C2865 c28652;
        InterfaceC7387 interfaceC73872;
        int i7;
        int i8;
        int i9;
        boolean z2;
        int i10;
        int i11;
        int i12;
        final String str2;
        C2159 c2159;
        final int i13;
        final InterfaceC7387 interfaceC73873;
        final int i14;
        final boolean z3;
        C2224 c2224M2935;
        boolean z4;
        boolean z5;
        int i15;
        int i16;
        InterfaceC2962 interfaceC2962Mo4426;
        C2159 c21592 = (C2159) interfaceC2208;
        c21592.m2951(-1040751001);
        if ((i4 & 6) == 0) {
            i6 = (c21592.m2920(str) ? 4 : 2) | i4;
        } else {
            i6 = i4;
        }
        if ((i4 & 48) == 0) {
            i6 |= c21592.m2920(interfaceC2962) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            c28652 = c2865;
            i6 |= c21592.m2920(c28652) ? 256 : 128;
        } else {
            c28652 = c2865;
        }
        int i17 = i5 & 8;
        if (i17 != 0) {
            i6 |= 3072;
        } else {
            if ((i4 & 3072) == 0) {
                interfaceC73872 = interfaceC7387;
                i6 |= c21592.m2938(interfaceC73872) ? 2048 : 1024;
            }
            i7 = i5 & 16;
            if (i7 == 0) {
                i6 |= 24576;
            } else {
                if ((i4 & 24576) == 0) {
                    i8 = i;
                    i6 |= c21592.m2922(i8) ? 16384 : 8192;
                }
                i9 = i5 & 32;
                if (i9 == 0) {
                    if ((196608 & i4) == 0) {
                        z2 = z;
                        i6 |= c21592.m2939(z2) ? 131072 : 65536;
                    }
                    if ((1572864 & i4) == 0) {
                        i6 |= c21592.m2922(i2) ? 1048576 : Opcodes.ASM8;
                    }
                    i10 = i5 & 128;
                    if (i10 == 0) {
                        i6 |= 12582912;
                        i11 = i3;
                    } else {
                        i11 = i3;
                        if ((i4 & 12582912) == 0) {
                            i6 |= c21592.m2922(i11) ? 8388608 : 4194304;
                        }
                    }
                    i12 = i6 | 100663296;
                    int i18 = i6;
                    if ((i5 & 512) == 0) {
                        i12 = i18 | 905969664;
                    } else if ((i4 & 805306368) == 0) {
                        i12 |= (i4 & 1073741824) == 0 ? c21592.m2920(null) : c21592.m2938(null) ? 536870912 : 268435456;
                    }
                    if (c21592.m2903(i12 & 1, (i12 & 306783379) == 306783378)) {
                        str2 = str;
                        c2159 = c21592;
                        c2159.m2899();
                        i13 = i11;
                        interfaceC73873 = interfaceC73872;
                        i14 = i8;
                        z3 = z2;
                    } else {
                        InterfaceC7387 interfaceC73874 = i17 != 0 ? null : interfaceC73872;
                        if (i7 != 0) {
                            i8 = 1;
                        }
                        if (i9 != 0) {
                            z2 = true;
                        }
                        int i19 = i10 != 0 ? 1 : i11;
                        m2448(i19, i2);
                        if (c21592.m2943(AbstractC1728.f2875) != null) {
                            C3775.m6954();
                            return;
                        }
                        c21592.m2952(356914239);
                        c21592.m2937(false);
                        InterfaceC2830 interfaceC2830 = (InterfaceC2830) c21592.m2943(AbstractC2737.f5935);
                        Executor executor = (Executor) c21592.m2943(AbstractC1826.f3231);
                        if (executor != null) {
                            int length = str.length();
                            if (Build.VERSION.SDK_INT >= 28 && length >= 8 && length < 1000) {
                                if (AbstractC1826.f3230 == null) {
                                    AbstractC1826.f3230 = Boolean.valueOf(Runtime.getRuntime().availableProcessors() >= 4);
                                }
                                Boolean bool = AbstractC1826.f3230;
                                bool.getClass();
                                if (bool.booleanValue()) {
                                    c21592.m2952(1254298614);
                                    try {
                                        z4 = false;
                                        try {
                                            executor.execute(new RunnableC0889(c28652, (LayoutDirection) c21592.m2943(AbstractC2737.f5927), str, (InterfaceC8725) c21592.m2943(AbstractC2737.f5933), interfaceC2830, 1));
                                        } catch (RejectedExecutionException unused) {
                                        }
                                    } catch (RejectedExecutionException unused2) {
                                        z4 = false;
                                    }
                                    c21592.m2937(z4);
                                    if (interfaceC73874 != null) {
                                        c21592.m2952(357875859);
                                        c21592.m2937(z4);
                                        str2 = str;
                                        int i20 = i8;
                                        z5 = z2;
                                        i15 = i19;
                                        i16 = i20;
                                        interfaceC2962Mo4426 = interfaceC2962.mo4426(new C8211(str2, c2865, interfaceC2830, i20, z5, i2, i15));
                                        c2159 = c21592;
                                    } else {
                                        str2 = str;
                                        z5 = z2;
                                        i15 = i19;
                                        i16 = i8;
                                        c21592.m2952(357232113);
                                        c2159 = c21592;
                                        interfaceC2962Mo4426 = interfaceC2962.mo4426(C2958.f6621).mo4426(new C8199(new C2902(str2), c2865, (InterfaceC2830) c21592.m2943(AbstractC2737.f5935), interfaceC73874, i16, z5, i2, i15));
                                        c2159.m2937(z4);
                                    }
                                    int iHashCode = Long.hashCode(c2159.f4182);
                                    InterfaceC2962 interfaceC2962M4421 = AbstractC2953.m4421(c2159, interfaceC2962Mo4426);
                                    C2088 c2088M2941 = c2159.m2941();
                                    InterfaceC2619.f5567.getClass();
                                    InterfaceC7372 interfaceC7372 = C2600.f5530;
                                    c2159.m2956();
                                    if (c2159.f4183) {
                                        c2159.m2950();
                                    } else {
                                        c2159.m2940(interfaceC7372);
                                    }
                                    AbstractC2202.m3032(c2159, C1795.f3077, C2600.f5526);
                                    AbstractC2202.m3032(c2159, c2088M2941, C2600.f5527);
                                    AbstractC2202.m3041(c2159, C2600.f5532);
                                    AbstractC2202.m3032(c2159, interfaceC2962M4421, C2600.f5528);
                                    AbstractC2202.m3032(c2159, Integer.valueOf(iHashCode), C2600.f5533);
                                    c2159.m2937(true);
                                    z3 = z5;
                                    i13 = i15;
                                    interfaceC73873 = interfaceC73874;
                                    i14 = i16;
                                }
                            }
                            z4 = false;
                        } else {
                            z4 = false;
                        }
                        c21592.m2952(1255914055);
                        c21592.m2937(z4);
                        if (interfaceC73874 != null) {
                        }
                        int iHashCode2 = Long.hashCode(c2159.f4182);
                        InterfaceC2962 interfaceC2962M44212 = AbstractC2953.m4421(c2159, interfaceC2962Mo4426);
                        C2088 c2088M29412 = c2159.m2941();
                        InterfaceC2619.f5567.getClass();
                        InterfaceC7372 interfaceC73722 = C2600.f5530;
                        c2159.m2956();
                        if (c2159.f4183) {
                        }
                        AbstractC2202.m3032(c2159, C1795.f3077, C2600.f5526);
                        AbstractC2202.m3032(c2159, c2088M29412, C2600.f5527);
                        AbstractC2202.m3041(c2159, C2600.f5532);
                        AbstractC2202.m3032(c2159, interfaceC2962M44212, C2600.f5528);
                        AbstractC2202.m3032(c2159, Integer.valueOf(iHashCode2), C2600.f5533);
                        c2159.m2937(true);
                        z3 = z5;
                        i13 = i15;
                        interfaceC73873 = interfaceC73874;
                        i14 = i16;
                    }
                    c2224M2935 = c2159.m2935();
                    if (c2224M2935 == null) {
                        c2224M2935.f4379 = new InterfaceC7383() { // from class: androidx.compose.foundation.text.飘花落叶言子楪苏兰世哲
                            @Override // p068.InterfaceC7383
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                AbstractC1821.m2454(str2, interfaceC2962, c2865, interfaceC73873, i14, z3, i2, i13, (InterfaceC2208) obj, AbstractC2202.m3031(i4 | 1), i5);
                                return C6008.f15084;
                            }
                        };
                        return;
                    }
                    return;
                }
                i6 |= 196608;
                z2 = z;
                if ((1572864 & i4) == 0) {
                }
                i10 = i5 & 128;
                if (i10 == 0) {
                }
                i12 = i6 | 100663296;
                int i182 = i6;
                if ((i5 & 512) == 0) {
                }
                if (c21592.m2903(i12 & 1, (i12 & 306783379) == 306783378)) {
                }
                c2224M2935 = c2159.m2935();
                if (c2224M2935 == null) {
                }
            }
            i8 = i;
            i9 = i5 & 32;
            if (i9 == 0) {
            }
            z2 = z;
            if ((1572864 & i4) == 0) {
            }
            i10 = i5 & 128;
            if (i10 == 0) {
            }
            i12 = i6 | 100663296;
            int i1822 = i6;
            if ((i5 & 512) == 0) {
            }
            if (c21592.m2903(i12 & 1, (i12 & 306783379) == 306783378)) {
            }
            c2224M2935 = c2159.m2935();
            if (c2224M2935 == null) {
            }
        }
        interfaceC73872 = interfaceC7387;
        i7 = i5 & 16;
        if (i7 == 0) {
        }
        i8 = i;
        i9 = i5 & 32;
        if (i9 == 0) {
        }
        z2 = z;
        if ((1572864 & i4) == 0) {
        }
        i10 = i5 & 128;
        if (i10 == 0) {
        }
        i12 = i6 | 100663296;
        int i18222 = i6;
        if ((i5 & 512) == 0) {
        }
        if (c21592.m2903(i12 & 1, (i12 & 306783379) == 306783378)) {
        }
        c2224M2935 = c2159.m2935();
        if (c2224M2935 == null) {
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final C8542 m2455() {
        if (!C8542.m13568()) {
            return null;
        }
        C8542 c8542M13569 = C8542.m13569();
        if (c8542M13569.m13572() == 1) {
            return c8542M13569;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2456(ContinuationImpl continuationImpl) {
        CommonContextMenuAreaKt$getContextMenuItemsAvailability$1 commonContextMenuAreaKt$getContextMenuItemsAvailability$1;
        if (continuationImpl instanceof CommonContextMenuAreaKt$getContextMenuItemsAvailability$1) {
            commonContextMenuAreaKt$getContextMenuItemsAvailability$1 = (CommonContextMenuAreaKt$getContextMenuItemsAvailability$1) continuationImpl;
            int i = commonContextMenuAreaKt$getContextMenuItemsAvailability$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                commonContextMenuAreaKt$getContextMenuItemsAvailability$1.label = i - Integer.MIN_VALUE;
            } else {
                commonContextMenuAreaKt$getContextMenuItemsAvailability$1 = new CommonContextMenuAreaKt$getContextMenuItemsAvailability$1(continuationImpl);
            }
        }
        Object obj = commonContextMenuAreaKt$getContextMenuItemsAvailability$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = commonContextMenuAreaKt$getContextMenuItemsAvailability$1.label;
        if (i2 == 0) {
            AbstractC6017.m10769(obj);
            commonContextMenuAreaKt$getContextMenuItemsAvailability$1.L$0 = null;
            commonContextMenuAreaKt$getContextMenuItemsAvailability$1.label = 1;
            throw null;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        if (commonContextMenuAreaKt$getContextMenuItemsAvailability$1.L$0 != null) {
            throw new ClassCastException();
        }
        AbstractC6017.m10769(obj);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static void m2457(C2847 c2847, C1847 c1847, C2867 c2867, InterfaceC2530 interfaceC2530, C2831 c2831, boolean z, InterfaceC2856 interfaceC2856) {
        if (z) {
            int iM4310 = C2869.m4310(c2847.f6291);
            interfaceC2856.mo2442(iM4310);
            String str = AbstractC1834.f3261;
            C8157 c8157M4304 = iM4310 < c2867.f6336.f6342.f6474.length() ? c2867.m4304(iM4310) : iM4310 != 0 ? c2867.m4304(iM4310 - 1) : new C8157(0.0f, 0.0f, 1.0f, (int) (AbstractC1834.m2476(c1847.f3300, c1847.f3303, c1847.f3302, AbstractC1834.f3261, 1) & 4294967295L));
            float f = c8157M4304.f19884;
            float f2 = c8157M4304.f19885;
            long jMo3636 = interfaceC2530.mo3636((((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L));
            C8157 c8157M13629 = AbstractC8568.m13629((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jMo3636 & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jMo3636 >> 32)))) << 32), (((long) Float.floatToRawIntBits(c8157M4304.f19883 - f2)) << 32) | (((long) Float.floatToRawIntBits(c8157M4304.f19882 - f)) & 4294967295L));
            if (AbstractC5227.m9466((C2831) c2831.f6234.f6293.get(), c2831)) {
                c2831.f6233.mo2244(c8157M13629);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r9v1, types: [T, androidx.compose.ui.text.input.飘花落叶言子世楪兰哲苏, java.lang.Object] */
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static final void m2458(C2848 c2848, C1781 c1781, C2847 c2847, C2859 c2859, InterfaceC2856 interfaceC2856) {
        C0923 c0923 = c1781.f3012;
        C1815 c1815 = c1781.f3021;
        C1815 c18152 = c1781.f3018;
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        C1597 c1597 = new C1597(c0923, c1815, ref$ObjectRef, 3);
        InterfaceC2854 interfaceC2854 = c2848.f6294;
        interfaceC2854.mo2246(c2847, c2859, c1597, c18152);
        ?? c2831 = new C2831(c2848, interfaceC2854);
        c2848.f6293.set(c2831);
        ref$ObjectRef.element = c2831;
        c1781.f3011 = c2831;
        m2460(c1781, c2847, interfaceC2856);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static final int m2459(KeyEvent keyEvent) {
        return (keyEvent.isAltPressed() ? 1 : 0) | (keyEvent.isCtrlPressed() ? 2 : 0) | (keyEvent.isMetaPressed() ? 4 : 0) | (keyEvent.isShiftPressed() ? 8 : 0);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static final void m2460(C1781 c1781, C2847 c2847, InterfaceC2856 interfaceC2856) {
        AbstractC2121 abstractC2121M2791 = AbstractC2109.m2791();
        InterfaceC7387 interfaceC7387Mo2763 = abstractC2121M2791 != null ? abstractC2121M2791.mo2763() : null;
        AbstractC2121 abstractC2121M2803 = AbstractC2109.m2803(abstractC2121M2791);
        try {
            C1801 c1801M2425 = c1781.m2425();
            if (c1801M2425 == null) {
                return;
            }
            C2831 c2831 = c1781.f3011;
            if (c2831 == null) {
                return;
            }
            InterfaceC2530 interfaceC2530M2426 = c1781.m2426();
            if (interfaceC2530M2426 == null) {
                return;
            }
            m2457(c2847, c1781.f3015, c1801M2425.f3090, interfaceC2530M2426, c2831, c1781.m2427(), interfaceC2856);
        } finally {
            AbstractC2109.m2797(abstractC2121M2791, abstractC2121M2803, interfaceC7387Mo2763);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0046  */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.text.BreakIterator] */
    /* JADX WARN: Type inference failed for: r4v2, types: [androidx.appcompat.app.飘花落叶言子苏楪世兰哲, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int m2461(int i, String str) {
        ?? r5;
        ?? r52;
        int spanEnd;
        C8542 c8542M2455 = m2455();
        Integer num = null;
        if (c8542M2455 != null) {
            if (!(c8542M2455.m13572() == 1)) {
                C6755.m11870("Not initialized yet");
                return 0;
            }
            AbstractC7173.m12429(str, "charSequence cannot be null");
            ?? r4 = c8542M2455.f21265.f21219;
            r4.getClass();
            if (i < 0 || i >= str.length()) {
                r52 = str;
                spanEnd = -1;
            } else if (str instanceof Spanned) {
                Spanned spanned = (Spanned) str;
                C8529[] c8529Arr = (C8529[]) spanned.getSpans(i, i + 1, C8529.class);
                if (c8529Arr.length > 0) {
                    spanEnd = spanned.getSpanEnd(c8529Arr[0]);
                    r52 = str;
                } else {
                    ?? r53 = str;
                    spanEnd = ((C8537) r4.m933(r53, Math.max(0, i - 16), Math.min(str.length(), i + 16), Integer.MAX_VALUE, true, new C8537(i))).f21256;
                    r52 = r53;
                }
            }
            Integer numValueOf = Integer.valueOf(spanEnd);
            r5 = r52;
            if (spanEnd != -1) {
                num = numValueOf;
                r5 = r52;
            }
        } else {
            r5 = str;
        }
        if (num != null) {
            return num.intValue();
        }
        ?? characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(r5);
        return characterInstance.following(i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static final C2838 m2462(C1123 c1123, C2902 c2902) {
        c1123.getClass();
        int length = c2902.f6474.length();
        String str = c2902.f6474;
        int length2 = str.length();
        int iMin = Math.min(length, 100);
        for (int i = 0; i < iMin; i++) {
            m2447(i, length2, i);
        }
        m2447(length, length2, length);
        int iMin2 = Math.min(length2, 100);
        for (int i2 = 0; i2 < iMin2; i2++) {
            m2446(i2, length, i2);
        }
        m2446(length2, length, length2);
        return new C2838(c2902, new C1804(str.length(), str.length()));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final int m2463(int i, String str) {
        C8542 c8542M2455 = m2455();
        Integer num = null;
        if (c8542M2455 != null) {
            Integer numValueOf = Integer.valueOf(c8542M2455.m13573(Math.max(0, i - 1), str));
            if (numValueOf.intValue() != -1) {
                num = numValueOf;
            }
        }
        if (num != null) {
            return num.intValue();
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.preceding(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m2464(C1720 c1720, ContinuationImpl continuationImpl) {
        CommonContextMenuAreaKt$getContextMenuItemsAvailability$2 commonContextMenuAreaKt$getContextMenuItemsAvailability$2;
        if (continuationImpl instanceof CommonContextMenuAreaKt$getContextMenuItemsAvailability$2) {
            commonContextMenuAreaKt$getContextMenuItemsAvailability$2 = (CommonContextMenuAreaKt$getContextMenuItemsAvailability$2) continuationImpl;
            int i = commonContextMenuAreaKt$getContextMenuItemsAvailability$2.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                commonContextMenuAreaKt$getContextMenuItemsAvailability$2.label = i - Integer.MIN_VALUE;
            } else {
                commonContextMenuAreaKt$getContextMenuItemsAvailability$2 = new CommonContextMenuAreaKt$getContextMenuItemsAvailability$2(continuationImpl);
            }
        }
        Object obj = commonContextMenuAreaKt$getContextMenuItemsAvailability$2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = commonContextMenuAreaKt$getContextMenuItemsAvailability$2.label;
        if (i2 == 0) {
            AbstractC6017.m10769(obj);
            commonContextMenuAreaKt$getContextMenuItemsAvailability$2.L$0 = c1720;
            commonContextMenuAreaKt$getContextMenuItemsAvailability$2.label = 1;
            if (c1720.m2314(commonContextMenuAreaKt$getContextMenuItemsAvailability$2) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c1720 = (C1720) commonContextMenuAreaKt$getContextMenuItemsAvailability$2.L$0;
            AbstractC6017.m10769(obj);
        }
        return new C1777((c1720.m2316() ? 2 : 0) | ((C2869.m4312(c1720.m2319().f6291) || c1720.f2849 == null) ? 0 : 1) | (c1720.m2317() ? 4 : 0) | (c1720.m2332() ? 8 : 0) | (c1720.m2318() ? 16 : 0));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static final int m2465(int i, CharSequence charSequence) {
        int length = charSequence.length();
        while (i < length) {
            if (charSequence.charAt(i) == '\n') {
                return i;
            }
            i++;
        }
        return charSequence.length();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final int m2466(int i, CharSequence charSequence) {
        while (i > 0) {
            if (charSequence.charAt(i - 1) == '\n') {
                return i;
            }
            i--;
        }
        return 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final C8157 m2467(AbstractC2543 abstractC2543, int i, C2838 c2838, C2867 c2867, boolean z, int i2) {
        C8157 c8157M4303;
        if (c2867 != null) {
            c2838.f6254.mo2442(i);
            c8157M4303 = c2867.m4303(i);
        } else {
            c8157M4303 = C8157.f19881;
        }
        float f = c8157M4303.f19885;
        int iMo1903 = abstractC2543.mo1903(2.0f);
        return new C8157(z ? (i2 - f) - iMo1903 : f, c8157M4303.f19884, z ? i2 - f : iMo1903 + f, c8157M4303.f19882);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final void m2468(C1720 c1720, InterfaceC2208 interfaceC2208, int i) {
        C2902 c2902M2320;
        C2159 c2159 = (C2159) interfaceC2208;
        c2159.m2951(-1436003720);
        int i2 = (c2159.m2938(c1720) ? 4 : 2) | i;
        int i3 = 1;
        if (c2159.m2903(i2 & 1, (i2 & 3) != 2)) {
            C1781 c1781 = c1720.f2832;
            if (c1781 == null || !((Boolean) ((AbstractC2182) c1781.f3026).getValue()).booleanValue() || (c2902M2320 = c1720.m2320()) == null || c2902M2320.f6474.length() <= 0) {
                c2159.m2952(-2111042550);
                c2159.m2937(false);
            } else {
                c2159.m2952(-2112351432);
                boolean zM2920 = c2159.m2920(c1720);
                Object objM2905 = c2159.m2905();
                C2188 c2188 = C2204.f4319;
                if (zM2920 || objM2905 == c2188) {
                    objM2905 = new C1722(c1720);
                    c2159.m2946(objM2905);
                }
                InterfaceC1851 interfaceC1851 = (InterfaceC1851) objM2905;
                InterfaceC8725 interfaceC8725 = (InterfaceC8725) c2159.m2943(AbstractC2737.f5933);
                InterfaceC2856 interfaceC2856 = c1720.f2834;
                long j = c1720.m2319().f6291;
                int i4 = C2869.f6347;
                int i5 = (int) (j >> 32);
                interfaceC2856.mo2442(i5);
                C1781 c17812 = c1720.f2832;
                C1801 c1801M2425 = c17812 != null ? c17812.m2425() : null;
                c1801M2425.getClass();
                C2867 c2867 = c1801M2425.f3090;
                C8157 c8157M4303 = c2867.m4303(AbstractC3400.m5650(i5, 0, c2867.f6336.f6342.f6474.length()));
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits((interfaceC8725.mo1904(2.0f) / 2.0f) + c8157M4303.f19885)) << 32) | (((long) Float.floatToRawIntBits(c8157M4303.f19882)) & 4294967295L);
                boolean zM2921 = c2159.m2921(jFloatToRawIntBits);
                Object objM29052 = c2159.m2905();
                if (zM2921 || objM29052 == c2188) {
                    objM29052 = new C1788(jFloatToRawIntBits);
                    c2159.m2946(objM29052);
                }
                InterfaceC1756 interfaceC1756 = (InterfaceC1756) objM29052;
                boolean zM2938 = c2159.m2938(interfaceC1851) | c2159.m2938(c1720);
                Object objM29053 = c2159.m2905();
                if (zM2938 || objM29053 == c2188) {
                    objM29053 = new C1798(interfaceC1851, c1720);
                    c2159.m2946(objM29053);
                }
                InterfaceC2962 interfaceC2962M3562 = AbstractC2457.m3562(C2958.f6621, interfaceC1851, (PointerInputEventHandler) objM29053);
                boolean zM29212 = c2159.m2921(jFloatToRawIntBits);
                Object objM29054 = c2159.m2905();
                if (zM29212 || objM29054 == c2188) {
                    objM29054 = new C1807(jFloatToRawIntBits, i3);
                    c2159.m2946(objM29054);
                }
                AbstractC1806.m2445(interfaceC1756, AbstractC2783.m4209(interfaceC2962M3562, false, (InterfaceC7387) objM29054), 0L, c2159, 0);
                c2159.m2937(false);
            }
        } else {
            c2159.m2899();
        }
        C2224 c2224M2935 = c2159.m2935();
        if (c2224M2935 != null) {
            c2224M2935.f4379 = new C1811(c1720, i);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final Object m2469(InterfaceC2470 interfaceC2470, InterfaceC1851 interfaceC1851, InterfaceC5189 interfaceC5189) throws Throwable {
        Object objM11066 = AbstractC6231.m11066(new C0088x3c48fd5d(interfaceC2470, interfaceC1851, null), interfaceC5189);
        return objM11066 == CoroutineSingletons.COROUTINE_SUSPENDED ? objM11066 : C6008.f15084;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final void m2470(C1781 c1781) {
        C2831 c2831 = c1781.f3011;
        if (c2831 != null) {
            c1781.f3021.invoke(C2847.m4275((C2847) c1781.f3012.f572, null, 0L, 3));
            C2848 c2848 = c2831.f6234;
            AtomicReference atomicReference = c2848.f6293;
            while (true) {
                if (atomicReference.compareAndSet(c2831, null)) {
                    c2848.f6294.mo2242();
                    break;
                } else if (atomicReference.get() != c2831) {
                    break;
                }
            }
        }
        c1781.f3011 = null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final boolean m2471(int i, KeyEvent keyEvent) {
        return ((int) (AbstractC8137.m13063(keyEvent) >> 32)) == i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final int m2472(float f) {
        return Math.round((float) Math.ceil(f));
    }
}
