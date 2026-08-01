package androidx.compose.ui.layout;

import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.C1314;
import androidx.compose.runtime.C1324;
import androidx.compose.runtime.C1369;
import androidx.compose.runtime.C1389;
import androidx.compose.runtime.InterfaceC1373;
import androidx.compose.runtime.internal.C1242;
import androidx.compose.runtime.internal.C1253;
import androidx.compose.ui.AbstractC2120;
import androidx.compose.ui.C2125;
import androidx.compose.ui.InterfaceC2129;
import androidx.compose.ui.node.AbstractC1745;
import androidx.compose.ui.node.AbstractC1794;
import androidx.compose.ui.node.C1748;
import androidx.compose.ui.node.C1765;
import androidx.compose.ui.node.InterfaceC1784;
import java.util.List;
import kotlin.C5175;
import p052.InterfaceC6542;
import p052.InterfaceC6550;
import p052.InterfaceC6553;
import p052.InterfaceC6557;
import p112.C7327;

/* JADX INFO: renamed from: androidx.compose.ui.layout.飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1670 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C1730 f4893 = new C1730(4);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final Object f4892 = new Object();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C7327 m3089(InterfaceC1695 interfaceC1695, boolean z) {
        InterfaceC1695 interfaceC1695M3103 = m3103(interfaceC1695);
        float fMo3078 = (int) (interfaceC1695M3103.mo3078() >> 32);
        float fMo30782 = (int) (interfaceC1695M3103.mo3078() & 4294967295L);
        C7327 c7327Mo3079 = interfaceC1695M3103.mo3079(interfaceC1695, z);
        float f = c7327Mo3079.f19545;
        if (z) {
            if (f < 0.0f) {
                f = 0.0f;
            }
            if (f > fMo3078) {
                f = fMo3078;
            }
        }
        float f2 = c7327Mo3079.f19544;
        if (z) {
            if (f2 < 0.0f) {
                f2 = 0.0f;
            }
            if (f2 > fMo30782) {
                f2 = fMo30782;
            }
        }
        float f3 = c7327Mo3079.f19543;
        if (z) {
            if (f3 < 0.0f) {
                f3 = 0.0f;
            }
            if (f3 <= fMo3078) {
                fMo3078 = f3;
            }
            f3 = fMo3078;
        }
        float f4 = c7327Mo3079.f19542;
        if (z) {
            float f5 = f4 >= 0.0f ? f4 : 0.0f;
            if (f5 <= fMo30782) {
                fMo30782 = f5;
            }
            f4 = fMo30782;
        }
        if (f == f3 || f2 == f4) {
            return C7327.f19541;
        }
        long jMo3072 = interfaceC1695M3103.mo3072((((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L));
        long jMo30722 = interfaceC1695M3103.mo3072((((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L));
        long jMo30723 = interfaceC1695M3103.mo3072((((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f4)) & 4294967295L));
        long jMo30724 = interfaceC1695M3103.mo3072((((long) Float.floatToRawIntBits(f4)) & 4294967295L) | (((long) Float.floatToRawIntBits(f)) << 32));
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jMo3072 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jMo30722 >> 32));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jMo30724 >> 32));
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jMo30723 >> 32));
        float fMin = Math.min(fIntBitsToFloat, Math.min(fIntBitsToFloat2, Math.min(fIntBitsToFloat3, fIntBitsToFloat4)));
        float fMax = Math.max(fIntBitsToFloat, Math.max(fIntBitsToFloat2, Math.max(fIntBitsToFloat3, fIntBitsToFloat4)));
        float fIntBitsToFloat5 = Float.intBitsToFloat((int) (jMo3072 & 4294967295L));
        float fIntBitsToFloat6 = Float.intBitsToFloat((int) (jMo30722 & 4294967295L));
        float fIntBitsToFloat7 = Float.intBitsToFloat((int) (jMo30724 & 4294967295L));
        float fIntBitsToFloat8 = Float.intBitsToFloat((int) (jMo30723 & 4294967295L));
        return new C7327(fMin, Math.min(fIntBitsToFloat5, Math.min(fIntBitsToFloat6, Math.min(fIntBitsToFloat7, fIntBitsToFloat8))), fMax, Math.max(fIntBitsToFloat5, Math.max(fIntBitsToFloat6, Math.max(fIntBitsToFloat7, fIntBitsToFloat8))));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C7327 m3090(InterfaceC1695 interfaceC1695) {
        InterfaceC1695 interfaceC1695Mo3070 = interfaceC1695.mo3070();
        return interfaceC1695Mo3070 != null ? interfaceC1695Mo3070.mo3079(interfaceC1695, true) : new C7327(0.0f, 0.0f, (int) (interfaceC1695.mo3078() >> 32), (int) (interfaceC1695.mo3078() & 4294967295L));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001c  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final float m3091(androidx.compose.ui.layout.AbstractC1708 r6, boolean r7, androidx.compose.ui.layout.AbstractC1720[] r8, float r9) {
        /*
            int r0 = r8.length
            r1 = 2143289344(0x7fc00000, float:NaN)
            r2 = 0
            r3 = r2
        L5:
            if (r3 >= r0) goto L20
            r4 = r8[r3]
            float r4 = r6.mo3083(r4)
            boolean r5 = java.lang.Float.isNaN(r1)
            if (r5 != 0) goto L1c
            int r5 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r5 <= 0) goto L19
            r5 = 1
            goto L1a
        L19:
            r5 = r2
        L1a:
            if (r7 != r5) goto L1d
        L1c:
            r1 = r4
        L1d:
            int r3 = r3 + 1
            goto L5
        L20:
            boolean r6 = java.lang.Float.isNaN(r1)
            if (r6 == 0) goto L27
            return r9
        L27:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.layout.AbstractC1670.m3091(androidx.compose.ui.layout.飘花落叶言子苏世兰哲楪, boolean, androidx.compose.ui.layout.飘花落叶言子苏哲世兰楪[], float):float");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final float m3092(long j, long j2) {
        return Math.min(Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)) / Float.intBitsToFloat((int) (j & 4294967295L)));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final void m3093(final C1719 c1719, InterfaceC2129 interfaceC2129, final InterfaceC6553 interfaceC6553, InterfaceC1373 interfaceC1373, final int i, final int i2) {
        int i3;
        C1324 c1324 = (C1324) interfaceC1373;
        c1324.m2381(-511989831);
        if ((i & 6) == 0) {
            i3 = (c1324.m2368(c1719) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= c1324.m2350(interfaceC2129) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= c1324.m2368(interfaceC6553) ? 256 : 128;
        }
        if (c1324.m2333(i3 & 1, (i3 & 147) != 146)) {
            if (i4 != 0) {
                interfaceC2129 = C2125.f6275;
            }
            int iHashCode = Long.hashCode(c1324.f3836);
            C1314 c1314M2471 = AbstractC1367.m2471(c1324);
            InterfaceC2129 interfaceC2129M3851 = AbstractC2120.m3851(c1324, interfaceC2129);
            C1253 c1253M2371 = c1324.m2371();
            InterfaceC6542 interfaceC6542 = C1748.f5090;
            c1324.m2386();
            if (c1324.f3837) {
                c1324.m2370(interfaceC6542);
            } else {
                c1324.m2380();
            }
            AbstractC1367.m2464(c1324, c1719, c1719.f4988);
            AbstractC1367.m2464(c1324, c1314M2471, c1719.f4987);
            AbstractC1367.m2464(c1324, interfaceC6553, c1719.f4986);
            InterfaceC1784.f5221.getClass();
            AbstractC1367.m2464(c1324, c1253M2371, C1765.f5181);
            AbstractC1367.m2472(c1324, C1765.f5186);
            AbstractC1367.m2464(c1324, interfaceC2129M3851, C1765.f5182);
            AbstractC1367.m2464(c1324, Integer.valueOf(iHashCode), C1765.f5187);
            c1324.m2367(true);
            if (c1324.m2341()) {
                c1324.m2382(-1259187287);
                c1324.m2367(false);
            } else {
                c1324.m2382(-1259245908);
                boolean zM2368 = c1324.m2368(c1719);
                Object objM2335 = c1324.m2335();
                if (zM2368 || objM2335 == C1369.f3973) {
                    objM2335 = new InterfaceC6542() { // from class: androidx.compose.ui.layout.SubcomposeLayoutKt$SubcomposeLayout$4$1
                        {
                            super(0);
                        }

                        /* JADX WARN: Removed duplicated region for block: B:16:0x005a  */
                        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final void m3042invoke() {
                            /*
                                r15 = this;
                                androidx.compose.ui.layout.飘花落叶言子苏兰楪哲世 r15 = r1
                                androidx.compose.ui.layout.飘花落叶言子世哲楪兰苏 r15 = r15.m3126()
                                androidx.compose.ui.node.飘花落叶言子世楪兰哲苏 r0 = r15.f4873
                                java.util.List r1 = r0.m3251()
                                androidx.collection.飘花落叶言子世哲楪苏兰 r1 = (androidx.collection.C0242) r1
                                java.lang.Object r1 = r1.f894
                                androidx.compose.runtime.collection.飘花落叶言子楪世苏兰哲 r1 = (androidx.compose.runtime.collection.C1224) r1
                                int r1 = r1.f3519
                                int r2 = r15.f4859
                                if (r2 == r1) goto L76
                                androidx.collection.飘花落叶言子世兰楪苏哲 r15 = r15.f4869
                                java.lang.Object[] r1 = r15.f879
                                long[] r15 = r15.f881
                                int r2 = r15.length
                                int r2 = r2 + (-2)
                                r3 = 7
                                r4 = 0
                                if (r2 < 0) goto L5f
                                r5 = r4
                            L26:
                                r6 = r15[r5]
                                long r8 = ~r6
                                long r8 = r8 << r3
                                long r8 = r8 & r6
                                r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
                                long r8 = r8 & r10
                                int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
                                if (r8 == 0) goto L5a
                                int r8 = r5 - r2
                                int r8 = ~r8
                                int r8 = r8 >>> 31
                                r9 = 8
                                int r8 = 8 - r8
                                r10 = r4
                            L3f:
                                if (r10 >= r8) goto L58
                                r11 = 255(0xff, double:1.26E-321)
                                long r11 = r11 & r6
                                r13 = 128(0x80, double:6.3E-322)
                                int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
                                if (r11 >= 0) goto L54
                                int r11 = r5 << 3
                                int r11 = r11 + r10
                                r11 = r1[r11]
                                androidx.compose.ui.layout.飘花落叶言子世楪兰哲苏 r11 = (androidx.compose.ui.layout.C1665) r11
                                r12 = 1
                                r11.f4882 = r12
                            L54:
                                long r6 = r6 >> r9
                                int r10 = r10 + 1
                                goto L3f
                            L58:
                                if (r8 != r9) goto L5f
                            L5a:
                                if (r5 == r2) goto L5f
                                int r5 = r5 + 1
                                goto L26
                            L5f:
                                androidx.compose.ui.node.飘花落叶言子世楪兰哲苏 r15 = r0.f5119
                                if (r15 == 0) goto L6d
                                androidx.compose.ui.node.飘花落叶言子世苏哲兰楪 r15 = r0.f5131
                                boolean r15 = r15.f5157
                                if (r15 != 0) goto L76
                                androidx.compose.ui.node.C1748.m3210(r0, r4, r3)
                                return
                            L6d:
                                boolean r15 = r0.m3249()
                                if (r15 != 0) goto L76
                                androidx.compose.ui.node.C1748.m3214(r0, r4, r3)
                            L76:
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.layout.SubcomposeLayoutKt$SubcomposeLayout$4$1.m3042invoke():void");
                        }

                        @Override // p052.InterfaceC6542
                        public /* bridge */ /* synthetic */ Object invoke() {
                            m3042invoke();
                            return C5175.f14739;
                        }
                    };
                    c1324.m2376(objM2335);
                }
                AbstractC1367.m2492((InterfaceC6542) objM2335, c1324);
                c1324.m2367(false);
            }
        } else {
            c1324.m2329();
        }
        final InterfaceC2129 interfaceC21292 = interfaceC2129;
        C1389 c1389M2365 = c1324.m2365();
        if (c1389M2365 != null) {
            c1389M2365.f4033 = new InterfaceC6553() { // from class: androidx.compose.ui.layout.SubcomposeLayoutKt$SubcomposeLayout$5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void invoke(InterfaceC1373 interfaceC13732, int i5) {
                    AbstractC1670.m3093(c1719, interfaceC21292, interfaceC6553, interfaceC13732, AbstractC1367.m2460(i | 1), i2);
                }

                @Override // p052.InterfaceC6553
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((InterfaceC1373) obj, ((Number) obj2).intValue());
                    return C5175.f14739;
                }
            };
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final void m3094(final InterfaceC2129 interfaceC2129, InterfaceC6553 interfaceC6553, InterfaceC1373 interfaceC1373, final int i, final int i2) {
        int i3;
        final InterfaceC6553 interfaceC65532;
        C1324 c1324 = (C1324) interfaceC1373;
        c1324.m2381(-1298353104);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (c1324.m2350(interfaceC2129) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= c1324.m2368(interfaceC6553) ? 32 : 16;
        }
        if (c1324.m2333(i3 & 1, (i3 & 19) != 18)) {
            if (i4 != 0) {
                interfaceC2129 = C2125.f6275;
            }
            InterfaceC2129 interfaceC21292 = interfaceC2129;
            Object objM2335 = c1324.m2335();
            if (objM2335 == C1369.f3973) {
                objM2335 = new C1719(C1730.f5004);
                c1324.m2376(objM2335);
            }
            interfaceC65532 = interfaceC6553;
            m3093((C1719) objM2335, interfaceC21292, interfaceC65532, c1324, (i3 << 3) & 1008, 0);
            interfaceC2129 = interfaceC21292;
        } else {
            interfaceC65532 = interfaceC6553;
            c1324.m2329();
        }
        C1389 c1389M2365 = c1324.m2365();
        if (c1389M2365 != null) {
            c1389M2365.f4033 = new InterfaceC6553() { // from class: androidx.compose.ui.layout.SubcomposeLayoutKt$SubcomposeLayout$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void invoke(InterfaceC1373 interfaceC13732, int i5) {
                    AbstractC1670.m3094(interfaceC2129, interfaceC65532, interfaceC13732, AbstractC1367.m2460(i | 1), i2);
                }

                @Override // p052.InterfaceC6553
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((InterfaceC1373) obj, ((Number) obj2).intValue());
                    return C5175.f14739;
                }
            };
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static final InterfaceC2129 m3095(InterfaceC2129 interfaceC2129, InterfaceC6557 interfaceC6557) {
        return interfaceC2129.mo3856(new C1728(interfaceC6557));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static final InterfaceC2129 m3096(String str) {
        return new C1693(str);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static final InterfaceC2129 m3097(InterfaceC2129 interfaceC2129, InterfaceC6557 interfaceC6557) {
        return interfaceC2129.mo3856(new C1713(interfaceC6557));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final long m3098(long j, long j2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) * Float.intBitsToFloat((int) (j >> 32));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L)) * Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final boolean m3099(long j, long j2) {
        return j == j2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final C1242 m3100(final List list) {
        return new C1242(1271844412, true, new InterfaceC6553() { // from class: androidx.compose.ui.layout.LayoutKt$combineAsVirtualLayouts$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public final void invoke(InterfaceC1373 interfaceC1373, int i) {
                C1324 c1324 = (C1324) interfaceC1373;
                if (!c1324.m2333(i & 1, (i & 3) != 2)) {
                    c1324.m2329();
                    return;
                }
                List<InterfaceC6553> list2 = list;
                int size = list2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    InterfaceC6553 interfaceC6553 = list2.get(i2);
                    int iHashCode = Long.hashCode(c1324.f3836);
                    InterfaceC1784.f5221.getClass();
                    InterfaceC6542 interfaceC6542 = C1765.f5183;
                    c1324.m2386();
                    if (c1324.f3837) {
                        c1324.m2370(interfaceC6542);
                    } else {
                        c1324.m2380();
                    }
                    AbstractC1367.m2464(c1324, Integer.valueOf(iHashCode), C1765.f5187);
                    interfaceC6553.invoke(c1324, 0);
                    c1324.m2367(true);
                }
            }

            @Override // p052.InterfaceC6553
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((InterfaceC1373) obj, ((Number) obj2).intValue());
                return C5175.f14739;
            }
        });
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final AbstractC1745 m3101(AbstractC1745 abstractC1745) {
        C1748 c1748M3246 = abstractC1745.f5062.f5258;
        while (true) {
            C1748 c1748M32462 = c1748M3246.m3246();
            if ((c1748M32462 != null ? c1748M32462.f5119 : null) == null) {
                AbstractC1745 abstractC1745Mo3275 = c1748M3246.f5093.f5284.mo3275();
                abstractC1745Mo3275.getClass();
                return abstractC1745Mo3275;
            }
            C1748 c1748M32463 = c1748M3246.m3246();
            C1748 c1748 = c1748M32463 != null ? c1748M32463.f5119 : null;
            c1748.getClass();
            if (c1748.f5118) {
                c1748M3246 = c1748M3246.m3246();
                c1748M3246.getClass();
            } else {
                C1748 c1748M32464 = c1748M3246.m3246();
                c1748M32464.getClass();
                c1748M3246 = c1748M32464.f5119;
                c1748M3246.getClass();
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final InterfaceC2129 m3102(InterfaceC2129 interfaceC2129, InterfaceC6550 interfaceC6550) {
        return interfaceC2129.mo3856(new C1692(interfaceC6550));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final InterfaceC1695 m3103(InterfaceC1695 interfaceC1695) {
        InterfaceC1695 interfaceC16952;
        InterfaceC1695 interfaceC1695Mo3070 = interfaceC1695.mo3070();
        while (true) {
            InterfaceC1695 interfaceC16953 = interfaceC1695Mo3070;
            interfaceC16952 = interfaceC1695;
            interfaceC1695 = interfaceC16953;
            if (interfaceC1695 == null) {
                break;
            }
            interfaceC1695Mo3070 = interfaceC1695.mo3070();
        }
        AbstractC1794 abstractC1794 = interfaceC16952 instanceof AbstractC1794 ? (AbstractC1794) interfaceC16952 : null;
        if (abstractC1794 == null) {
            return interfaceC16952;
        }
        AbstractC1794 abstractC17942 = abstractC1794.f5255;
        while (true) {
            AbstractC1794 abstractC17943 = abstractC17942;
            AbstractC1794 abstractC17944 = abstractC1794;
            abstractC1794 = abstractC17943;
            if (abstractC1794 == null) {
                return abstractC17944;
            }
            abstractC17942 = abstractC1794.f5255;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final Object m3104(InterfaceC1655 interfaceC1655) {
        Object objMo3046 = interfaceC1655.mo3046();
        C1669 c1669 = objMo3046 instanceof C1669 ? (C1669) objMo3046 : null;
        if (c1669 != null) {
            return c1669.f4891;
        }
        return null;
    }
}
