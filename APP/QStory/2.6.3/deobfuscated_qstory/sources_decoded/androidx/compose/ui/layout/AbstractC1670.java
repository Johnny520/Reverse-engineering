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
import kotlin.C5176;
import p052.InterfaceC6543;
import p052.InterfaceC6551;
import p052.InterfaceC6554;
import p052.InterfaceC6558;
import p112.C7328;

/* JADX INFO: renamed from: androidx.compose.ui.layout.飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1670 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C1730 f4894 = new C1730(4);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final Object f4893 = new Object();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C7328 m3099(InterfaceC1695 interfaceC1695, boolean z) {
        InterfaceC1695 interfaceC1695M3113 = m3113(interfaceC1695);
        float fMo3088 = (int) (interfaceC1695M3113.mo3088() >> 32);
        float fMo30882 = (int) (interfaceC1695M3113.mo3088() & 4294967295L);
        C7328 c7328Mo3089 = interfaceC1695M3113.mo3089(interfaceC1695, z);
        float f = c7328Mo3089.f19540;
        if (z) {
            if (f < 0.0f) {
                f = 0.0f;
            }
            if (f > fMo3088) {
                f = fMo3088;
            }
        }
        float f2 = c7328Mo3089.f19539;
        if (z) {
            if (f2 < 0.0f) {
                f2 = 0.0f;
            }
            if (f2 > fMo30882) {
                f2 = fMo30882;
            }
        }
        float f3 = c7328Mo3089.f19538;
        if (z) {
            if (f3 < 0.0f) {
                f3 = 0.0f;
            }
            if (f3 <= fMo3088) {
                fMo3088 = f3;
            }
            f3 = fMo3088;
        }
        float f4 = c7328Mo3089.f19537;
        if (z) {
            float f5 = f4 >= 0.0f ? f4 : 0.0f;
            if (f5 <= fMo30882) {
                fMo30882 = f5;
            }
            f4 = fMo30882;
        }
        if (f == f3 || f2 == f4) {
            return C7328.f19536;
        }
        long jMo3082 = interfaceC1695M3113.mo3082((((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L));
        long jMo30822 = interfaceC1695M3113.mo3082((((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L));
        long jMo30823 = interfaceC1695M3113.mo3082((((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f4)) & 4294967295L));
        long jMo30824 = interfaceC1695M3113.mo3082((((long) Float.floatToRawIntBits(f4)) & 4294967295L) | (((long) Float.floatToRawIntBits(f)) << 32));
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jMo3082 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jMo30822 >> 32));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jMo30824 >> 32));
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jMo30823 >> 32));
        float fMin = Math.min(fIntBitsToFloat, Math.min(fIntBitsToFloat2, Math.min(fIntBitsToFloat3, fIntBitsToFloat4)));
        float fMax = Math.max(fIntBitsToFloat, Math.max(fIntBitsToFloat2, Math.max(fIntBitsToFloat3, fIntBitsToFloat4)));
        float fIntBitsToFloat5 = Float.intBitsToFloat((int) (jMo3082 & 4294967295L));
        float fIntBitsToFloat6 = Float.intBitsToFloat((int) (jMo30822 & 4294967295L));
        float fIntBitsToFloat7 = Float.intBitsToFloat((int) (jMo30824 & 4294967295L));
        float fIntBitsToFloat8 = Float.intBitsToFloat((int) (jMo30823 & 4294967295L));
        return new C7328(fMin, Math.min(fIntBitsToFloat5, Math.min(fIntBitsToFloat6, Math.min(fIntBitsToFloat7, fIntBitsToFloat8))), fMax, Math.max(fIntBitsToFloat5, Math.max(fIntBitsToFloat6, Math.max(fIntBitsToFloat7, fIntBitsToFloat8))));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C7328 m3100(InterfaceC1695 interfaceC1695) {
        InterfaceC1695 interfaceC1695Mo3080 = interfaceC1695.mo3080();
        return interfaceC1695Mo3080 != null ? interfaceC1695Mo3080.mo3089(interfaceC1695, true) : new C7328(0.0f, 0.0f, (int) (interfaceC1695.mo3088() >> 32), (int) (interfaceC1695.mo3088() & 4294967295L));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001c  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final float m3101(androidx.compose.ui.layout.AbstractC1708 r6, boolean r7, androidx.compose.ui.layout.AbstractC1720[] r8, float r9) {
        /*
            int r0 = r8.length
            r1 = 2143289344(0x7fc00000, float:NaN)
            r2 = 0
            r3 = r2
        L5:
            if (r3 >= r0) goto L20
            r4 = r8[r3]
            float r4 = r6.mo3093(r4)
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.layout.AbstractC1670.m3101(androidx.compose.ui.layout.飘花落叶言子苏世兰哲楪, boolean, androidx.compose.ui.layout.飘花落叶言子苏哲世兰楪[], float):float");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final float m3102(long j, long j2) {
        return Math.min(Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)) / Float.intBitsToFloat((int) (j & 4294967295L)));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final void m3103(final C1719 c1719, InterfaceC2129 interfaceC2129, final InterfaceC6554 interfaceC6554, InterfaceC1373 interfaceC1373, final int i, final int i2) {
        int i3;
        C1324 c1324 = (C1324) interfaceC1373;
        c1324.m2391(-511989831);
        if ((i & 6) == 0) {
            i3 = (c1324.m2378(c1719) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= c1324.m2360(interfaceC2129) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= c1324.m2378(interfaceC6554) ? 256 : 128;
        }
        if (c1324.m2343(i3 & 1, (i3 & 147) != 146)) {
            if (i4 != 0) {
                interfaceC2129 = C2125.f6276;
            }
            int iHashCode = Long.hashCode(c1324.f3837);
            C1314 c1314M2480 = AbstractC1367.m2480(c1324);
            InterfaceC2129 interfaceC2129M3861 = AbstractC2120.m3861(c1324, interfaceC2129);
            C1253 c1253M2381 = c1324.m2381();
            InterfaceC6543 interfaceC6543 = C1748.f5091;
            c1324.m2396();
            if (c1324.f3838) {
                c1324.m2380(interfaceC6543);
            } else {
                c1324.m2390();
            }
            AbstractC1367.m2472(c1324, c1719, c1719.f4989);
            AbstractC1367.m2472(c1324, c1314M2480, c1719.f4988);
            AbstractC1367.m2472(c1324, interfaceC6554, c1719.f4987);
            InterfaceC1784.f5222.getClass();
            AbstractC1367.m2472(c1324, c1253M2381, C1765.f5182);
            AbstractC1367.m2481(c1324, C1765.f5187);
            AbstractC1367.m2472(c1324, interfaceC2129M3861, C1765.f5183);
            AbstractC1367.m2472(c1324, Integer.valueOf(iHashCode), C1765.f5188);
            c1324.m2377(true);
            if (c1324.m2351()) {
                c1324.m2392(-1259187287);
                c1324.m2377(false);
            } else {
                c1324.m2392(-1259245908);
                boolean zM2378 = c1324.m2378(c1719);
                Object objM2345 = c1324.m2345();
                if (zM2378 || objM2345 == C1369.f3974) {
                    objM2345 = new InterfaceC6543() { // from class: androidx.compose.ui.layout.SubcomposeLayoutKt$SubcomposeLayout$4$1
                        {
                            super(0);
                        }

                        /* JADX WARN: Removed duplicated region for block: B:16:0x005a  */
                        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final void m3052invoke() {
                            /*
                                r15 = this;
                                androidx.compose.ui.layout.飘花落叶言子苏兰楪哲世 r15 = r1
                                androidx.compose.ui.layout.飘花落叶言子世哲楪兰苏 r15 = r15.m3136()
                                androidx.compose.ui.node.飘花落叶言子世楪兰哲苏 r0 = r15.f4874
                                java.util.List r1 = r0.m3261()
                                androidx.collection.飘花落叶言子世哲楪苏兰 r1 = (androidx.collection.C0242) r1
                                java.lang.Object r1 = r1.f894
                                androidx.compose.runtime.collection.飘花落叶言子楪世苏兰哲 r1 = (androidx.compose.runtime.collection.C1224) r1
                                int r1 = r1.f3520
                                int r2 = r15.f4860
                                if (r2 == r1) goto L76
                                androidx.collection.飘花落叶言子世兰楪苏哲 r15 = r15.f4870
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
                                r11.f4883 = r12
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
                                androidx.compose.ui.node.飘花落叶言子世楪兰哲苏 r15 = r0.f5120
                                if (r15 == 0) goto L6d
                                androidx.compose.ui.node.飘花落叶言子世苏哲兰楪 r15 = r0.f5132
                                boolean r15 = r15.f5158
                                if (r15 != 0) goto L76
                                androidx.compose.ui.node.C1748.m3220(r0, r4, r3)
                                return
                            L6d:
                                boolean r15 = r0.m3259()
                                if (r15 != 0) goto L76
                                androidx.compose.ui.node.C1748.m3224(r0, r4, r3)
                            L76:
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.layout.SubcomposeLayoutKt$SubcomposeLayout$4$1.m3052invoke():void");
                        }

                        @Override // p052.InterfaceC6543
                        public /* bridge */ /* synthetic */ Object invoke() {
                            m3052invoke();
                            return C5176.f14739;
                        }
                    };
                    c1324.m2386(objM2345);
                }
                AbstractC1367.m2502((InterfaceC6543) objM2345, c1324);
                c1324.m2377(false);
            }
        } else {
            c1324.m2339();
        }
        final InterfaceC2129 interfaceC21292 = interfaceC2129;
        C1389 c1389M2375 = c1324.m2375();
        if (c1389M2375 != null) {
            c1389M2375.f4034 = new InterfaceC6554() { // from class: androidx.compose.ui.layout.SubcomposeLayoutKt$SubcomposeLayout$5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void invoke(InterfaceC1373 interfaceC13732, int i5) {
                    AbstractC1670.m3103(c1719, interfaceC21292, interfaceC6554, interfaceC13732, AbstractC1367.m2471(i | 1), i2);
                }

                @Override // p052.InterfaceC6554
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((InterfaceC1373) obj, ((Number) obj2).intValue());
                    return C5176.f14739;
                }
            };
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final void m3104(final InterfaceC2129 interfaceC2129, InterfaceC6554 interfaceC6554, InterfaceC1373 interfaceC1373, final int i, final int i2) {
        int i3;
        final InterfaceC6554 interfaceC65542;
        C1324 c1324 = (C1324) interfaceC1373;
        c1324.m2391(-1298353104);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (c1324.m2360(interfaceC2129) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= c1324.m2378(interfaceC6554) ? 32 : 16;
        }
        if (c1324.m2343(i3 & 1, (i3 & 19) != 18)) {
            if (i4 != 0) {
                interfaceC2129 = C2125.f6276;
            }
            InterfaceC2129 interfaceC21292 = interfaceC2129;
            Object objM2345 = c1324.m2345();
            if (objM2345 == C1369.f3974) {
                objM2345 = new C1719(C1730.f5005);
                c1324.m2386(objM2345);
            }
            interfaceC65542 = interfaceC6554;
            m3103((C1719) objM2345, interfaceC21292, interfaceC65542, c1324, (i3 << 3) & 1008, 0);
            interfaceC2129 = interfaceC21292;
        } else {
            interfaceC65542 = interfaceC6554;
            c1324.m2339();
        }
        C1389 c1389M2375 = c1324.m2375();
        if (c1389M2375 != null) {
            c1389M2375.f4034 = new InterfaceC6554() { // from class: androidx.compose.ui.layout.SubcomposeLayoutKt$SubcomposeLayout$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void invoke(InterfaceC1373 interfaceC13732, int i5) {
                    AbstractC1670.m3104(interfaceC2129, interfaceC65542, interfaceC13732, AbstractC1367.m2471(i | 1), i2);
                }

                @Override // p052.InterfaceC6554
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((InterfaceC1373) obj, ((Number) obj2).intValue());
                    return C5176.f14739;
                }
            };
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static final InterfaceC2129 m3105(InterfaceC2129 interfaceC2129, InterfaceC6558 interfaceC6558) {
        return interfaceC2129.mo3866(new C1728(interfaceC6558));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static final InterfaceC2129 m3106(String str) {
        return new C1693(str);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static final InterfaceC2129 m3107(InterfaceC2129 interfaceC2129, InterfaceC6558 interfaceC6558) {
        return interfaceC2129.mo3866(new C1713(interfaceC6558));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final long m3108(long j, long j2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) * Float.intBitsToFloat((int) (j >> 32));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L)) * Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final boolean m3109(long j, long j2) {
        return j == j2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final C1242 m3110(final List list) {
        return new C1242(1271844412, true, new InterfaceC6554() { // from class: androidx.compose.ui.layout.LayoutKt$combineAsVirtualLayouts$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public final void invoke(InterfaceC1373 interfaceC1373, int i) {
                C1324 c1324 = (C1324) interfaceC1373;
                if (!c1324.m2343(i & 1, (i & 3) != 2)) {
                    c1324.m2339();
                    return;
                }
                List<InterfaceC6554> list2 = list;
                int size = list2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    InterfaceC6554 interfaceC6554 = list2.get(i2);
                    int iHashCode = Long.hashCode(c1324.f3837);
                    InterfaceC1784.f5222.getClass();
                    InterfaceC6543 interfaceC6543 = C1765.f5184;
                    c1324.m2396();
                    if (c1324.f3838) {
                        c1324.m2380(interfaceC6543);
                    } else {
                        c1324.m2390();
                    }
                    AbstractC1367.m2472(c1324, Integer.valueOf(iHashCode), C1765.f5188);
                    interfaceC6554.invoke(c1324, 0);
                    c1324.m2377(true);
                }
            }

            @Override // p052.InterfaceC6554
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((InterfaceC1373) obj, ((Number) obj2).intValue());
                return C5176.f14739;
            }
        });
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final AbstractC1745 m3111(AbstractC1745 abstractC1745) {
        C1748 c1748M3256 = abstractC1745.f5063.f5259;
        while (true) {
            C1748 c1748M32562 = c1748M3256.m3256();
            if ((c1748M32562 != null ? c1748M32562.f5120 : null) == null) {
                AbstractC1745 abstractC1745Mo3285 = c1748M3256.f5094.f5285.mo3285();
                abstractC1745Mo3285.getClass();
                return abstractC1745Mo3285;
            }
            C1748 c1748M32563 = c1748M3256.m3256();
            C1748 c1748 = c1748M32563 != null ? c1748M32563.f5120 : null;
            c1748.getClass();
            if (c1748.f5119) {
                c1748M3256 = c1748M3256.m3256();
                c1748M3256.getClass();
            } else {
                C1748 c1748M32564 = c1748M3256.m3256();
                c1748M32564.getClass();
                c1748M3256 = c1748M32564.f5120;
                c1748M3256.getClass();
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final InterfaceC2129 m3112(InterfaceC2129 interfaceC2129, InterfaceC6551 interfaceC6551) {
        return interfaceC2129.mo3866(new C1692(interfaceC6551));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final InterfaceC1695 m3113(InterfaceC1695 interfaceC1695) {
        InterfaceC1695 interfaceC16952;
        InterfaceC1695 interfaceC1695Mo3080 = interfaceC1695.mo3080();
        while (true) {
            InterfaceC1695 interfaceC16953 = interfaceC1695Mo3080;
            interfaceC16952 = interfaceC1695;
            interfaceC1695 = interfaceC16953;
            if (interfaceC1695 == null) {
                break;
            }
            interfaceC1695Mo3080 = interfaceC1695.mo3080();
        }
        AbstractC1794 abstractC1794 = interfaceC16952 instanceof AbstractC1794 ? (AbstractC1794) interfaceC16952 : null;
        if (abstractC1794 == null) {
            return interfaceC16952;
        }
        AbstractC1794 abstractC17942 = abstractC1794.f5256;
        while (true) {
            AbstractC1794 abstractC17943 = abstractC17942;
            AbstractC1794 abstractC17944 = abstractC1794;
            abstractC1794 = abstractC17943;
            if (abstractC1794 == null) {
                return abstractC17944;
            }
            abstractC17942 = abstractC1794.f5256;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final Object m3114(InterfaceC1655 interfaceC1655) {
        Object objMo3056 = interfaceC1655.mo3056();
        C1669 c1669 = objMo3056 instanceof C1669 ? (C1669) objMo3056 : null;
        if (c1669 != null) {
            return c1669.f4892;
        }
        return null;
    }
}
