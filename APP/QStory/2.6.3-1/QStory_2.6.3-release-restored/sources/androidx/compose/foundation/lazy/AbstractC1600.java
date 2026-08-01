package androidx.compose.foundation.lazy;

import androidx.activity.compose.C0858;
import androidx.appcompat.app.C0955;
import androidx.compose.animation.AbstractC1280;
import androidx.compose.animation.core.InterfaceC1180;
import androidx.compose.foundation.AbstractC1910;
import androidx.compose.foundation.AbstractC1919;
import androidx.compose.foundation.InterfaceC1922;
import androidx.compose.foundation.InterfaceC1923;
import androidx.compose.foundation.gestures.C1367;
import androidx.compose.foundation.gestures.InterfaceC1401;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.AbstractC1469;
import androidx.compose.foundation.layout.C1468;
import androidx.compose.foundation.layout.C1507;
import androidx.compose.foundation.layout.InterfaceC1491;
import androidx.compose.foundation.layout.InterfaceC1505;
import androidx.compose.foundation.lazy.layout.AbstractC1563;
import androidx.compose.foundation.lazy.layout.C1562;
import androidx.compose.foundation.lazy.layout.C1569;
import androidx.compose.p001ui.C2949;
import androidx.compose.p001ui.C2952;
import androidx.compose.p001ui.C2958;
import androidx.compose.p001ui.InterfaceC2962;
import androidx.compose.p001ui.graphics.InterfaceC2418;
import androidx.compose.p001ui.platform.AbstractC2737;
import androidx.compose.runtime.AbstractC2170;
import androidx.compose.runtime.AbstractC2202;
import androidx.compose.runtime.C2159;
import androidx.compose.runtime.C2188;
import androidx.compose.runtime.C2193;
import androidx.compose.runtime.C2197;
import androidx.compose.runtime.C2204;
import androidx.compose.runtime.C2224;
import androidx.compose.runtime.InterfaceC2168;
import androidx.compose.runtime.InterfaceC2208;
import androidx.compose.runtime.InterfaceC2230;
import java.util.List;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.PropertyReference0Impl;
import kotlin.reflect.InterfaceC5929;
import kotlin.reflect.jvm.internal.impl.types.C5703;
import kotlinx.coroutines.InterfaceC6233;
import net.bytebuddy.jar.asm.Opcodes;
import p068.InterfaceC7372;
import p068.InterfaceC7387;
import p132.AbstractC8176;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1600 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final int m2127(C1598 c1598) {
        List list = c1598.f2558;
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += ((C1590) list.get(i2)).f2514;
        }
        return (i / list.size()) + c1598.f2553;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x033e  */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r14v1, types: [androidx.compose.runtime.飘花落叶言子世苏楪哲兰, androidx.compose.runtime.飘花落叶言子楪苏哲世兰] */
    /* JADX WARN: Type inference failed for: r26v2 */
    /* JADX WARN: Type inference failed for: r26v3 */
    /* JADX WARN: Type inference failed for: r26v5 */
    /* JADX WARN: Type inference failed for: r26v6 */
    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.compose.runtime.飘花落叶言子世苏楪哲兰] */
    /* JADX WARN: Type inference failed for: r4v2, types: [androidx.compose.runtime.飘花落叶言子世苏楪哲兰] */
    /* JADX WARN: Type inference failed for: r4v6, types: [androidx.compose.runtime.飘花落叶言子楪苏哲世兰] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2128(int i, int i2, InterfaceC1922 interfaceC1922, InterfaceC1401 interfaceC1401, InterfaceC1491 interfaceC1491, InterfaceC1505 interfaceC1505, C1582 c1582, InterfaceC2208 interfaceC2208, C2949 c2949, InterfaceC2962 interfaceC2962, InterfaceC7387 interfaceC7387, boolean z) {
        int i3;
        int i4;
        C1582 c15822;
        ?? r4;
        int i5;
        Object obj;
        Object c1599;
        C1582 c15823;
        C1584 c1584;
        ?? r11;
        boolean z2;
        InterfaceC5929 interfaceC5929;
        InterfaceC2962 interfaceC2962M2086;
        ?? r14 = (C2159) interfaceC2208;
        r14.m2951(924924659);
        if ((i & 6) == 0) {
            i3 = (r14.m2920(interfaceC2962) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= r14.m2920(c1582) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= r14.m2920(interfaceC1505) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= r14.m2939(false) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= r14.m2939(true) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= r14.m2920(interfaceC1401) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= r14.m2939(z) ? 1048576 : Opcodes.ASM8;
        }
        if ((i & 12582912) == 0) {
            i3 |= r14.m2920(interfaceC1922) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= r14.m2920(c2949) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (r14.m2920(interfaceC1491) ? 4 : 2);
        } else {
            i4 = i2;
        }
        int i6 = i4 | 432;
        if ((i2 & 3072) == 0) {
            i6 |= r14.m2938(interfaceC7387) ? 2048 : 1024;
        }
        if (r14.m2903(i3 & 1, ((306783379 & i3) == 306783378 && (i6 & 1171) == 1170) ? false : true)) {
            r14.m2901();
            if ((i & 1) != 0 && !r14.m2913()) {
                r14.m2899();
            }
            int i7 = i3 & (-234881025);
            r14.m2934();
            int i8 = i7 >> 3;
            int i9 = i8 & 14;
            int i10 = i9 | ((i6 >> 6) & 112);
            InterfaceC2230 interfaceC2230M3039 = AbstractC2202.m3039(interfaceC7387, r14);
            int i11 = i6;
            boolean z3 = (((i10 & 14) ^ 6) > 4 && r14.m2920(c1582)) || (i10 & 6) == 4;
            Object objM2905 = r14.m2905();
            C2188 c2188 = C2204.f4319;
            if (z3 || objM2905 == c2188) {
                C1586 c1586 = new C1586();
                c1586.f2479 = AbstractC2202.m3037(Integer.MAX_VALUE);
                c1586.f2478 = AbstractC2202.m3037(Integer.MAX_VALUE);
                C2188 c21882 = C2188.f4264;
                i5 = i9;
                C1604 c1604 = new C1604(interfaceC2230M3039, 0);
                C0955 c0955 = AbstractC2170.f4242;
                final C2197 c2197 = new C2197(new C1596(new C2197(c1604, c21882), c1582, c1586, 0), c21882);
                PropertyReference0Impl propertyReference0Impl = new PropertyReference0Impl(c2197) { // from class: androidx.compose.foundation.lazy.LazyListItemProviderKt$rememberLazyListItemProviderLambda$1$1
                    @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.jvm.internal.PropertyReference0
                    public Object get() {
                        return ((InterfaceC2168) this.receiver).getValue();
                    }
                };
                r14.m2946(propertyReference0Impl);
                obj = propertyReference0Impl;
            } else {
                i5 = i9;
                obj = objM2905;
            }
            InterfaceC5929 interfaceC59292 = (InterfaceC5929) obj;
            int i12 = i7 >> 9;
            int i13 = i5 | (i12 & 112);
            boolean z4 = ((((i13 & 112) ^ 48) > 32 && r14.m2939(true)) || (i13 & 48) == 32) | ((((i13 & 14) ^ 6) > 4 && r14.m2920(c1582)) || (i13 & 6) == 4);
            Object objM29052 = r14.m2905();
            Object obj2 = objM29052;
            if (z4 || objM29052 == c2188) {
                C1584 c15842 = new C1584(c1582);
                r14.m2946(c15842);
                obj2 = c15842;
            }
            C1584 c15843 = (C1584) obj2;
            Object objM29053 = r14.m2905();
            Object obj3 = objM29053;
            if (objM29053 == c2188) {
                InterfaceC6233 interfaceC6233M3058 = AbstractC2202.m3058(EmptyCoroutineContext.INSTANCE, r14);
                r14.m2946(interfaceC6233M3058);
                obj3 = interfaceC6233M3058;
            }
            InterfaceC6233 interfaceC6233 = (InterfaceC6233) obj3;
            InterfaceC2418 interfaceC2418 = (InterfaceC2418) r14.m2943(AbstractC2737.f5934);
            C1562 c1562 = !((Boolean) r14.m2943(AbstractC2737.f5923)).booleanValue() ? C1569.f2386 : null;
            int i14 = i11 << 18;
            int i15 = (i7 & 65520) | (i12 & 3670016) | (i14 & 29360128) | (i14 & 234881024) | ((i11 << 27) & 1879048192);
            boolean z5 = ((((i15 & 112) ^ 48) > 32 && r14.m2920(c1582)) || (i15 & 48) == 32) | ((((i15 & 896) ^ 384) > 256 && r14.m2920(interfaceC1505)) || (i15 & 384) == 256) | ((((i15 & 7168) ^ 3072) > 2048 && r14.m2939(false)) || (i15 & 3072) == 2048);
            if (((57344 & i15) ^ 24576) <= 16384 || !r14.m2939(true)) {
                boolean z6 = (i15 & 24576) == 16384;
                boolean zM2922 = (((i15 & 234881024) ^ 100663296) > 67108864 && r14.m2920(null)) | z5 | z6 | r14.m2922(0) | ((((i15 & 3670016) ^ 1572864) > 1048576 && r14.m2920(c2949)) || (i15 & 1572864) == 1048576) | (((i15 & 29360128) ^ 12582912) > 8388608 && r14.m2920(null)) | ((((i15 & 1879048192) ^ 805306368) > 536870912 && r14.m2920(interfaceC1491)) || (i15 & 805306368) == 536870912) | r14.m2920(interfaceC2418) | r14.m2920(c1562);
                Object objM29054 = r14.m2905();
                if (zM2922 || objM29054 == c2188) {
                    c15823 = c1582;
                    c1584 = c15843;
                    r11 = 0;
                    z2 = true;
                    c1599 = new C1599(c15823, interfaceC1505, interfaceC59292, interfaceC1491, interfaceC6233, interfaceC2418, c1562, c2949);
                    interfaceC5929 = interfaceC59292;
                    r14.m2946(c1599);
                } else {
                    c1599 = objM29054;
                    interfaceC5929 = interfaceC59292;
                    c1584 = c15843;
                    r11 = 0;
                    z2 = true;
                    c15823 = c1582;
                }
                C1599 c15992 = (C1599) c1599;
                Orientation orientation = Orientation.Vertical;
                if (z) {
                    r14.m2952(-2077147368);
                    if (((i8 & 14) ^ 6) > 4) {
                        ?? r26 = z2;
                        if (!r14.m2920(c15823)) {
                            r26 = z2;
                            if ((i8 & 6) != 4) {
                                r26 = r11;
                            }
                        }
                        int i16 = r26 | (r14.m2922(r11) ? 1 : 0);
                        Object objM29055 = r14.m2905();
                        Object obj4 = objM29055;
                        if (i16 != 0 || objM29055 == c2188) {
                            C1583 c1583 = new C1583(c15823);
                            r14.m2946(c1583);
                            obj4 = c1583;
                        }
                        interfaceC2962M2086 = AbstractC1563.m2086((C1583) obj4, c15823.f2466, orientation);
                        r14.m2937(r11);
                    }
                } else {
                    r14.m2952(-2076718545);
                    r14.m2937(r11);
                    interfaceC2962M2086 = C2958.f6621;
                }
                c15822 = c15823;
                ?? r42 = r14;
                AbstractC1563.m2081(interfaceC5929, AbstractC1910.m2550(AbstractC1563.m2082(interfaceC2962.mo4426(c15823.f2462).mo4426(c15823.f2461), interfaceC5929, c1584, orientation, z).mo4426(interfaceC2962M2086).mo4426(c15823.f2465.f2360), c15823, orientation, interfaceC1922, z, interfaceC1401, c15823.f2468), c15822.f2463, c15992, r42, 0);
                r4 = r42;
            }
        } else {
            c15822 = c1582;
            ?? r43 = r14;
            r43.m2899();
            r4 = r43;
        }
        C2224 c2224M2935 = r4.m2935();
        if (c2224M2935 != null) {
            c2224M2935.f4379 = new C1587(interfaceC2962, c15822, interfaceC1505, interfaceC1401, z, interfaceC1922, c2949, interfaceC1491, interfaceC7387, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2129(int i, int i2, InterfaceC1922 interfaceC1922, InterfaceC1401 interfaceC1401, InterfaceC1491 interfaceC1491, InterfaceC1505 interfaceC1505, C1582 c1582, InterfaceC2208 interfaceC2208, C2949 c2949, InterfaceC2962 interfaceC2962, InterfaceC7387 interfaceC7387, boolean z) {
        InterfaceC2962 interfaceC29622;
        int i3;
        C1582 c15822;
        InterfaceC1505 c1507;
        int i4;
        C2159 c2159;
        InterfaceC1922 interfaceC19222;
        C2949 c29492;
        boolean z2;
        C1582 c15823;
        InterfaceC1505 interfaceC15052;
        InterfaceC1401 interfaceC14012;
        InterfaceC1491 interfaceC14912;
        C2224 c2224M2935;
        int i5;
        InterfaceC1922 interfaceC19223;
        InterfaceC1491 interfaceC14913;
        C2949 c29493;
        InterfaceC1401 interfaceC14013;
        int i6;
        InterfaceC1922 interfaceC19224;
        boolean z3;
        C2159 c21592 = (C2159) interfaceC2208;
        c21592.m2951(53695811);
        if ((i & 6) == 0) {
            interfaceC29622 = interfaceC2962;
            i3 = (c21592.m2920(interfaceC29622) ? 4 : 2) | i;
        } else {
            interfaceC29622 = interfaceC2962;
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                c15822 = c1582;
                int i7 = c21592.m2920(c15822) ? 32 : 16;
                i3 |= i7;
            } else {
                c15822 = c1582;
            }
            i3 |= i7;
        } else {
            c15822 = c1582;
        }
        int i8 = i2 & 4;
        if (i8 == 0) {
            if ((i & 384) == 0) {
                c1507 = interfaceC1505;
                i3 |= c21592.m2920(c1507) ? 256 : 128;
            }
            int i9 = i3 | 3072;
            if ((i & 24576) == 0) {
                i9 = i3 | 11264;
            }
            int i10 = 196608 | i9;
            if ((1572864 & i) == 0) {
                i10 = 720896 | i9;
            }
            i4 = 12582912 | i10;
            if ((100663296 & i) == 0) {
                i4 = 46137344 | i10;
            }
            if ((805306368 & i) == 0) {
                i4 |= c21592.m2938(interfaceC7387) ? 536870912 : 268435456;
            }
            if (c21592.m2903(i4 & 1, (306783379 & i4) == 306783378)) {
                c2159 = c21592;
                c2159.m2899();
                interfaceC19222 = interfaceC1922;
                c29492 = c2949;
                z2 = z;
                c15823 = c15822;
                interfaceC15052 = c1507;
                interfaceC14012 = interfaceC1401;
                interfaceC14912 = interfaceC1491;
            } else {
                c21592.m2901();
                if ((i & 1) == 0 || c21592.m2913()) {
                    int i11 = i2 & 2;
                    C2188 c2188 = C2204.f4319;
                    if (i11 != 0) {
                        C1598 c1598 = AbstractC1580.f2445;
                        Object[] objArr = new Object[0];
                        C5703 c5703 = C1582.f2448;
                        boolean zM2922 = c21592.m2922(0) | c21592.m2922(0);
                        Object objM2905 = c21592.m2905();
                        if (zM2922 || objM2905 == c2188) {
                            objM2905 = new C0858(2);
                            c21592.m2946(objM2905);
                        }
                        i4 &= -113;
                        c15822 = (C1582) AbstractC8176.m13097(objArr, c5703, (InterfaceC7372) objM2905, c21592, 0);
                    }
                    if (i8 != 0) {
                        c1507 = new C1507(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                    C1468 c1468 = AbstractC1469.f2109;
                    C2949 c29494 = C2952.f6604;
                    InterfaceC1180 interfaceC1180M1685 = AbstractC1280.m1685(c21592);
                    boolean zM2920 = c21592.m2920(interfaceC1180M1685);
                    Object objM29052 = c21592.m2905();
                    if (zM2920 || objM29052 == c2188) {
                        objM29052 = new C1367(interfaceC1180M1685);
                        c21592.m2946(objM29052);
                    }
                    C1367 c1367 = (C1367) objM29052;
                    C2193 c2193 = AbstractC1919.f3556;
                    c21592.m2952(282942128);
                    InterfaceC1923 interfaceC1923 = (InterfaceC1923) c21592.m2943(AbstractC1919.f3556);
                    if (interfaceC1923 == null) {
                        c21592.m2937(false);
                        i5 = -238608385;
                        interfaceC19223 = null;
                    } else {
                        boolean zM29202 = c21592.m2920(interfaceC1923);
                        i5 = -238608385;
                        Object objM29053 = c21592.m2905();
                        if (zM29202 || objM29053 == c2188) {
                            objM29053 = interfaceC1923.mo2512();
                            c21592.m2946(objM29053);
                        }
                        interfaceC19223 = (InterfaceC1922) objM29053;
                        c21592.m2937(false);
                    }
                    interfaceC14913 = c1468;
                    c29493 = c29494;
                    interfaceC14013 = c1367;
                    i6 = i4 & i5;
                    interfaceC19224 = interfaceC19223;
                    z3 = true;
                } else {
                    c21592.m2899();
                    if ((i2 & 2) != 0) {
                        i4 &= -113;
                    }
                    i6 = i4 & (-238608385);
                    interfaceC19224 = interfaceC1922;
                    interfaceC14013 = interfaceC1401;
                    interfaceC14913 = interfaceC1491;
                    c29493 = c2949;
                    z3 = z;
                }
                C1582 c15824 = c15822;
                InterfaceC1505 interfaceC15053 = c1507;
                c21592.m2934();
                c2159 = c21592;
                m2128((i6 & 14) | 24576 | (i6 & 112) | (i6 & 896) | (i6 & 7168) | ((i6 >> 3) & 3670016) | ((i6 << 12) & 1879048192), (i6 >> 18) & 7168, interfaceC19224, interfaceC14013, interfaceC14913, interfaceC15053, c15824, c2159, c29493, interfaceC29622, interfaceC7387, z3);
                interfaceC19222 = interfaceC19224;
                interfaceC14012 = interfaceC14013;
                interfaceC14912 = interfaceC14913;
                interfaceC15052 = interfaceC15053;
                c15823 = c15824;
                c29492 = c29493;
                z2 = z3;
            }
            c2224M2935 = c2159.m2935();
            if (c2224M2935 == null) {
                c2224M2935.f4379 = new C1587(interfaceC2962, c15823, interfaceC15052, interfaceC14912, c29492, interfaceC14012, z2, interfaceC19222, interfaceC7387, i, i2);
                return;
            }
            return;
        }
        i3 |= 384;
        c1507 = interfaceC1505;
        int i92 = i3 | 3072;
        if ((i & 24576) == 0) {
        }
        int i102 = 196608 | i92;
        if ((1572864 & i) == 0) {
        }
        i4 = 12582912 | i102;
        if ((100663296 & i) == 0) {
        }
        if ((805306368 & i) == 0) {
        }
        if (c21592.m2903(i4 & 1, (306783379 & i4) == 306783378)) {
        }
        c2224M2935 = c2159.m2935();
        if (c2224M2935 == null) {
        }
    }
}
