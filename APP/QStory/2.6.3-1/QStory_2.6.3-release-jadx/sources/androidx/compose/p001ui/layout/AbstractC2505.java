package androidx.compose.p001ui.layout;

import androidx.collection.C1083;
import androidx.collection.C1089;
import androidx.compose.p001ui.AbstractC2953;
import androidx.compose.p001ui.C2958;
import androidx.compose.p001ui.InterfaceC2962;
import androidx.compose.p001ui.node.AbstractC2580;
import androidx.compose.p001ui.node.AbstractC2629;
import androidx.compose.p001ui.node.C2583;
import androidx.compose.p001ui.node.C2600;
import androidx.compose.p001ui.node.InterfaceC2619;
import androidx.compose.runtime.AbstractC2202;
import androidx.compose.runtime.C2149;
import androidx.compose.runtime.C2159;
import androidx.compose.runtime.C2204;
import androidx.compose.runtime.C2224;
import androidx.compose.runtime.InterfaceC2208;
import androidx.compose.runtime.collection.C2059;
import androidx.compose.runtime.internal.C2077;
import androidx.compose.runtime.internal.C2088;
import java.util.List;
import kotlin.C6008;
import p068.InterfaceC7372;
import p068.InterfaceC7380;
import p068.InterfaceC7383;
import p068.InterfaceC7387;
import p128.C8157;

/* JADX INFO: renamed from: androidx.compose.ui.layout.飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2505 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C2565 f5239 = new C2565(4);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final Object f5238 = new Object();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C8157 m3659(InterfaceC2530 interfaceC2530, boolean z) {
        InterfaceC2530 interfaceC2530M3673 = m3673(interfaceC2530);
        float fMo3648 = (int) (interfaceC2530M3673.mo3648() >> 32);
        float fMo36482 = (int) (interfaceC2530M3673.mo3648() & 4294967295L);
        C8157 c8157Mo3649 = interfaceC2530M3673.mo3649(interfaceC2530, z);
        float f = c8157Mo3649.f19885;
        if (z) {
            if (f < 0.0f) {
                f = 0.0f;
            }
            if (f > fMo3648) {
                f = fMo3648;
            }
        }
        float f2 = c8157Mo3649.f19884;
        if (z) {
            if (f2 < 0.0f) {
                f2 = 0.0f;
            }
            if (f2 > fMo36482) {
                f2 = fMo36482;
            }
        }
        float f3 = c8157Mo3649.f19883;
        if (z) {
            if (f3 < 0.0f) {
                f3 = 0.0f;
            }
            if (f3 <= fMo3648) {
                fMo3648 = f3;
            }
            f3 = fMo3648;
        }
        float f4 = c8157Mo3649.f19882;
        if (z) {
            float f5 = f4 >= 0.0f ? f4 : 0.0f;
            if (f5 <= fMo36482) {
                fMo36482 = f5;
            }
            f4 = fMo36482;
        }
        if (f == f3 || f2 == f4) {
            return C8157.f19881;
        }
        long jMo3642 = interfaceC2530M3673.mo3642((((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L));
        long jMo36422 = interfaceC2530M3673.mo3642((((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L));
        long jMo36423 = interfaceC2530M3673.mo3642((((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f4)) & 4294967295L));
        long jMo36424 = interfaceC2530M3673.mo3642((((long) Float.floatToRawIntBits(f4)) & 4294967295L) | (((long) Float.floatToRawIntBits(f)) << 32));
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jMo3642 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jMo36422 >> 32));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jMo36424 >> 32));
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jMo36423 >> 32));
        float fMin = Math.min(fIntBitsToFloat, Math.min(fIntBitsToFloat2, Math.min(fIntBitsToFloat3, fIntBitsToFloat4)));
        float fMax = Math.max(fIntBitsToFloat, Math.max(fIntBitsToFloat2, Math.max(fIntBitsToFloat3, fIntBitsToFloat4)));
        float fIntBitsToFloat5 = Float.intBitsToFloat((int) (jMo3642 & 4294967295L));
        float fIntBitsToFloat6 = Float.intBitsToFloat((int) (jMo36422 & 4294967295L));
        float fIntBitsToFloat7 = Float.intBitsToFloat((int) (jMo36424 & 4294967295L));
        float fIntBitsToFloat8 = Float.intBitsToFloat((int) (jMo36423 & 4294967295L));
        return new C8157(fMin, Math.min(fIntBitsToFloat5, Math.min(fIntBitsToFloat6, Math.min(fIntBitsToFloat7, fIntBitsToFloat8))), fMax, Math.max(fIntBitsToFloat5, Math.max(fIntBitsToFloat6, Math.max(fIntBitsToFloat7, fIntBitsToFloat8))));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C8157 m3660(InterfaceC2530 interfaceC2530) {
        InterfaceC2530 interfaceC2530Mo3640 = interfaceC2530.mo3640();
        return interfaceC2530Mo3640 != null ? interfaceC2530Mo3640.mo3649(interfaceC2530, true) : new C8157(0.0f, 0.0f, (int) (interfaceC2530.mo3648() >> 32), (int) (interfaceC2530.mo3648() & 4294967295L));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001c  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final float m3661(AbstractC2543 abstractC2543, boolean z, AbstractC2555[] abstractC2555Arr, float f) {
        float f2 = Float.NaN;
        for (AbstractC2555 abstractC2555 : abstractC2555Arr) {
            float fMo3653 = abstractC2543.mo3653(abstractC2555);
            if (Float.isNaN(f2)) {
                f2 = fMo3653;
            } else if (z == (fMo3653 > f2)) {
            }
        }
        return Float.isNaN(f2) ? f : f2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final float m3662(long j, long j2) {
        return Math.min(Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)) / Float.intBitsToFloat((int) (j & 4294967295L)));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final void m3663(final C2554 c2554, InterfaceC2962 interfaceC2962, final InterfaceC7383 interfaceC7383, InterfaceC2208 interfaceC2208, final int i, final int i2) {
        int i3;
        C2159 c2159 = (C2159) interfaceC2208;
        c2159.m2951(-511989831);
        if ((i & 6) == 0) {
            i3 = (c2159.m2938(c2554) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= c2159.m2920(interfaceC2962) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= c2159.m2938(interfaceC7383) ? 256 : 128;
        }
        if (c2159.m2903(i3 & 1, (i3 & 147) != 146)) {
            if (i4 != 0) {
                interfaceC2962 = C2958.f6621;
            }
            int iHashCode = Long.hashCode(c2159.f4182);
            C2149 c2149M3040 = AbstractC2202.m3040(c2159);
            InterfaceC2962 interfaceC2962M4421 = AbstractC2953.m4421(c2159, interfaceC2962);
            C2088 c2088M2941 = c2159.m2941();
            InterfaceC7372 interfaceC7372 = C2583.f5436;
            c2159.m2956();
            if (c2159.f4183) {
                c2159.m2940(interfaceC7372);
            } else {
                c2159.m2950();
            }
            AbstractC2202.m3032(c2159, c2554, c2554.f5334);
            AbstractC2202.m3032(c2159, c2149M3040, c2554.f5333);
            AbstractC2202.m3032(c2159, interfaceC7383, c2554.f5332);
            InterfaceC2619.f5567.getClass();
            AbstractC2202.m3032(c2159, c2088M2941, C2600.f5527);
            AbstractC2202.m3041(c2159, C2600.f5532);
            AbstractC2202.m3032(c2159, interfaceC2962M4421, C2600.f5528);
            AbstractC2202.m3032(c2159, Integer.valueOf(iHashCode), C2600.f5533);
            c2159.m2937(true);
            if (c2159.m2911()) {
                c2159.m2952(-1259187287);
                c2159.m2937(false);
            } else {
                c2159.m2952(-1259245908);
                boolean zM2938 = c2159.m2938(c2554);
                Object objM2905 = c2159.m2905();
                if (zM2938 || objM2905 == C2204.f4319) {
                    objM2905 = new InterfaceC7372() { // from class: androidx.compose.ui.layout.SubcomposeLayoutKt$SubcomposeLayout$4$1
                        {
                            super(0);
                        }

                        /* JADX WARN: Removed duplicated region for block: B:16:0x005a  */
                        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final void m3612invoke() {
                            C2496 c2496M3696 = c2554.m3696();
                            C2583 c2583 = c2496M3696.f5219;
                            if (c2496M3696.f5205 != ((C2059) ((C1089) c2583.m3821()).f1239).f3865) {
                                C1083 c1083 = c2496M3696.f5215;
                                Object[] objArr = c1083.f1224;
                                long[] jArr = c1083.f1226;
                                int length = jArr.length - 2;
                                if (length >= 0) {
                                    int i5 = 0;
                                    while (true) {
                                        long j = jArr[i5];
                                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i6 = 8 - ((~(i5 - length)) >>> 31);
                                            for (int i7 = 0; i7 < i6; i7++) {
                                                if ((255 & j) < 128) {
                                                    ((C2500) objArr[(i5 << 3) + i7]).f5228 = true;
                                                }
                                                j >>= 8;
                                            }
                                            if (i6 != 8) {
                                                break;
                                            } else if (i5 == length) {
                                                break;
                                            } else {
                                                i5++;
                                            }
                                        }
                                    }
                                }
                                if (c2583.f5465 != null) {
                                    if (c2583.f5477.f5503) {
                                        return;
                                    }
                                    C2583.m3780(c2583, false, 7);
                                } else {
                                    if (c2583.m3819()) {
                                        return;
                                    }
                                    C2583.m3784(c2583, false, 7);
                                }
                            }
                        }

                        @Override // p068.InterfaceC7372
                        public /* bridge */ /* synthetic */ Object invoke() {
                            m3612invoke();
                            return C6008.f15084;
                        }
                    };
                    c2159.m2946(objM2905);
                }
                AbstractC2202.m3062((InterfaceC7372) objM2905, c2159);
                c2159.m2937(false);
            }
        } else {
            c2159.m2899();
        }
        final InterfaceC2962 interfaceC29622 = interfaceC2962;
        C2224 c2224M2935 = c2159.m2935();
        if (c2224M2935 != null) {
            c2224M2935.f4379 = new InterfaceC7383() { // from class: androidx.compose.ui.layout.SubcomposeLayoutKt$SubcomposeLayout$5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void invoke(InterfaceC2208 interfaceC22082, int i5) {
                    AbstractC2505.m3663(c2554, interfaceC29622, interfaceC7383, interfaceC22082, AbstractC2202.m3031(i | 1), i2);
                }

                @Override // p068.InterfaceC7383
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((InterfaceC2208) obj, ((Number) obj2).intValue());
                    return C6008.f15084;
                }
            };
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final void m3664(final InterfaceC2962 interfaceC2962, InterfaceC7383 interfaceC7383, InterfaceC2208 interfaceC2208, final int i, final int i2) {
        int i3;
        final InterfaceC7383 interfaceC73832;
        C2159 c2159 = (C2159) interfaceC2208;
        c2159.m2951(-1298353104);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (c2159.m2920(interfaceC2962) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= c2159.m2938(interfaceC7383) ? 32 : 16;
        }
        if (c2159.m2903(i3 & 1, (i3 & 19) != 18)) {
            if (i4 != 0) {
                interfaceC2962 = C2958.f6621;
            }
            InterfaceC2962 interfaceC29622 = interfaceC2962;
            Object objM2905 = c2159.m2905();
            if (objM2905 == C2204.f4319) {
                objM2905 = new C2554(C2565.f5350);
                c2159.m2946(objM2905);
            }
            interfaceC73832 = interfaceC7383;
            m3663((C2554) objM2905, interfaceC29622, interfaceC73832, c2159, (i3 << 3) & 1008, 0);
            interfaceC2962 = interfaceC29622;
        } else {
            interfaceC73832 = interfaceC7383;
            c2159.m2899();
        }
        C2224 c2224M2935 = c2159.m2935();
        if (c2224M2935 != null) {
            c2224M2935.f4379 = new InterfaceC7383() { // from class: androidx.compose.ui.layout.SubcomposeLayoutKt$SubcomposeLayout$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void invoke(InterfaceC2208 interfaceC22082, int i5) {
                    AbstractC2505.m3664(interfaceC2962, interfaceC73832, interfaceC22082, AbstractC2202.m3031(i | 1), i2);
                }

                @Override // p068.InterfaceC7383
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((InterfaceC2208) obj, ((Number) obj2).intValue());
                    return C6008.f15084;
                }
            };
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static final InterfaceC2962 m3665(InterfaceC2962 interfaceC2962, InterfaceC7387 interfaceC7387) {
        return interfaceC2962.mo4426(new C2563(interfaceC7387));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static final InterfaceC2962 m3666(String str) {
        return new C2528(str);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static final InterfaceC2962 m3667(InterfaceC2962 interfaceC2962, InterfaceC7387 interfaceC7387) {
        return interfaceC2962.mo4426(new C2548(interfaceC7387));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final long m3668(long j, long j2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) * Float.intBitsToFloat((int) (j >> 32));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L)) * Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final boolean m3669(long j, long j2) {
        return j == j2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final C2077 m3670(final List list) {
        return new C2077(1271844412, true, new InterfaceC7383() { // from class: androidx.compose.ui.layout.LayoutKt$combineAsVirtualLayouts$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public final void invoke(InterfaceC2208 interfaceC2208, int i) {
                C2159 c2159 = (C2159) interfaceC2208;
                if (!c2159.m2903(i & 1, (i & 3) != 2)) {
                    c2159.m2899();
                    return;
                }
                List<InterfaceC7383> list2 = list;
                int size = list2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    InterfaceC7383 interfaceC7383 = list2.get(i2);
                    int iHashCode = Long.hashCode(c2159.f4182);
                    InterfaceC2619.f5567.getClass();
                    InterfaceC7372 interfaceC7372 = C2600.f5529;
                    c2159.m2956();
                    if (c2159.f4183) {
                        c2159.m2940(interfaceC7372);
                    } else {
                        c2159.m2950();
                    }
                    AbstractC2202.m3032(c2159, Integer.valueOf(iHashCode), C2600.f5533);
                    interfaceC7383.invoke(c2159, 0);
                    c2159.m2937(true);
                }
            }

            @Override // p068.InterfaceC7383
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((InterfaceC2208) obj, ((Number) obj2).intValue());
                return C6008.f15084;
            }
        });
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final AbstractC2580 m3671(AbstractC2580 abstractC2580) {
        C2583 c2583M3816 = abstractC2580.f5408.f5604;
        while (true) {
            C2583 c2583M38162 = c2583M3816.m3816();
            if ((c2583M38162 != null ? c2583M38162.f5465 : null) == null) {
                AbstractC2580 abstractC2580Mo3845 = c2583M3816.f5439.f5630.mo3845();
                abstractC2580Mo3845.getClass();
                return abstractC2580Mo3845;
            }
            C2583 c2583M38163 = c2583M3816.m3816();
            C2583 c2583 = c2583M38163 != null ? c2583M38163.f5465 : null;
            c2583.getClass();
            if (c2583.f5464) {
                c2583M3816 = c2583M3816.m3816();
                c2583M3816.getClass();
            } else {
                C2583 c2583M38164 = c2583M3816.m3816();
                c2583M38164.getClass();
                c2583M3816 = c2583M38164.f5465;
                c2583M3816.getClass();
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final InterfaceC2962 m3672(InterfaceC2962 interfaceC2962, InterfaceC7380 interfaceC7380) {
        return interfaceC2962.mo4426(new C2527(interfaceC7380));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final InterfaceC2530 m3673(InterfaceC2530 interfaceC2530) {
        InterfaceC2530 interfaceC25302;
        InterfaceC2530 interfaceC2530Mo3640 = interfaceC2530.mo3640();
        while (true) {
            InterfaceC2530 interfaceC25303 = interfaceC2530Mo3640;
            interfaceC25302 = interfaceC2530;
            interfaceC2530 = interfaceC25303;
            if (interfaceC2530 == null) {
                break;
            }
            interfaceC2530Mo3640 = interfaceC2530.mo3640();
        }
        AbstractC2629 abstractC2629 = interfaceC25302 instanceof AbstractC2629 ? (AbstractC2629) interfaceC25302 : null;
        if (abstractC2629 == null) {
            return interfaceC25302;
        }
        AbstractC2629 abstractC26292 = abstractC2629.f5601;
        while (true) {
            AbstractC2629 abstractC26293 = abstractC26292;
            AbstractC2629 abstractC26294 = abstractC2629;
            abstractC2629 = abstractC26293;
            if (abstractC2629 == null) {
                return abstractC26294;
            }
            abstractC26292 = abstractC2629.f5601;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final Object m3674(InterfaceC2490 interfaceC2490) {
        Object objMo3616 = interfaceC2490.mo3616();
        C2504 c2504 = objMo3616 instanceof C2504 ? (C2504) objMo3616 : null;
        if (c2504 != null) {
            return c2504.f5237;
        }
        return null;
    }
}
