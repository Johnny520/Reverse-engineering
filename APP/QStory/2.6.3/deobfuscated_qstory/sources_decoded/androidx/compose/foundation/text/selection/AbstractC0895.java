package androidx.compose.foundation.text.selection;

import androidx.appcompat.widget.C0194;
import androidx.compose.foundation.gestures.AbstractC0521;
import androidx.compose.foundation.layout.AbstractC0619;
import androidx.compose.foundation.layout.AbstractC0628;
import androidx.compose.foundation.layout.AbstractC0658;
import androidx.compose.foundation.layout.C0629;
import androidx.compose.foundation.layout.C0660;
import androidx.compose.foundation.lazy.layout.C0695;
import androidx.compose.foundation.text.AbstractC0983;
import androidx.compose.foundation.text.C0943;
import androidx.compose.foundation.text.C1006;
import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.InterfaceC1013;
import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.C1324;
import androidx.compose.runtime.C1353;
import androidx.compose.runtime.C1369;
import androidx.compose.runtime.C1389;
import androidx.compose.runtime.InterfaceC1373;
import androidx.compose.runtime.internal.AbstractC1254;
import androidx.compose.runtime.internal.C1242;
import androidx.compose.runtime.internal.C1253;
import androidx.compose.ui.AbstractC2120;
import androidx.compose.ui.C2117;
import androidx.compose.ui.C2119;
import androidx.compose.ui.C2125;
import androidx.compose.ui.InterfaceC2118;
import androidx.compose.ui.InterfaceC2129;
import androidx.compose.ui.graphics.C1595;
import androidx.compose.ui.graphics.C1610;
import androidx.compose.ui.graphics.drawscope.C1507;
import androidx.compose.ui.input.pointer.C1627;
import androidx.compose.ui.input.pointer.InterfaceC1635;
import androidx.compose.ui.layout.AbstractC1670;
import androidx.compose.ui.layout.InterfaceC1658;
import androidx.compose.ui.layout.InterfaceC1695;
import androidx.compose.ui.node.AbstractC1785;
import androidx.compose.ui.node.C1765;
import androidx.compose.ui.node.InterfaceC1784;
import androidx.compose.ui.platform.AbstractC1902;
import androidx.compose.ui.platform.InterfaceC1863;
import androidx.compose.ui.semantics.AbstractC1948;
import androidx.compose.ui.semantics.C1947;
import androidx.compose.ui.semantics.InterfaceC1944;
import androidx.compose.ui.text.AbstractC2048;
import androidx.compose.ui.text.C2033;
import androidx.compose.ui.text.C2034;
import androidx.compose.ui.text.C2035;
import androidx.compose.ui.text.C2062;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.window.AbstractC2091;
import androidx.compose.ui.window.C2090;
import androidx.compose.ui.window.SecureFlagPolicy;
import kotlin.AbstractC5187;
import kotlin.C5176;
import kotlin.InterfaceC5184;
import kotlin.LazyThreadSafetyMode;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import net.bytebuddy.jar.asm.Opcodes;
import p052.InterfaceC6543;
import p052.InterfaceC6554;
import p052.InterfaceC6558;
import p112.C7328;
import p205.C7903;
import p232.C8065;

/* JADX INFO: renamed from: androidx.compose.foundation.text.selection.飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0895 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static C1507 f2540;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static C1595 f2541;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C1610 f2542;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C0911 m1801(C8065 c8065, C0915 c0915) {
        CrossStatus crossStatusM13553 = c8065.m13553();
        C0920 c0920 = (C0920) c8065.f22244;
        boolean z = crossStatusM13553 == CrossStatus.CROSSED;
        return new C0911(m1819(c0920, z, true, c0915), m1819(c0920, z, false, c0915), z);
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x011f  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1802(boolean r16, androidx.compose.ui.text.style.ResolvedTextDirection r17, androidx.compose.foundation.text.selection.C0882 r18, androidx.compose.runtime.InterfaceC1373 r19, int r20) {
        /*
            Method dump skipped, instruction units count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.AbstractC0895.m1802(boolean, androidx.compose.ui.text.style.ResolvedTextDirection, androidx.compose.foundation.text.selection.飘花落叶言子世兰哲苏楪, androidx.compose.runtime.飘花落叶言子楪苏哲世兰, int):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final void m1803(InterfaceC2129 interfaceC2129, C1242 c1242, InterfaceC1373 interfaceC1373, int i) {
        C1324 c1324 = (C1324) interfaceC1373;
        c1324.m2391(-1854833411);
        int i2 = (c1324.m2360(interfaceC2129) ? 4 : 2) | i;
        if (c1324.m2343(i2 & 1, (i2 & 19) != 18)) {
            Object objM2345 = c1324.m2345();
            if (objM2345 == C1369.f3974) {
                objM2345 = C0892.f2534;
                c1324.m2386(objM2345);
            }
            InterfaceC1658 interfaceC1658 = (InterfaceC1658) objM2345;
            int iHashCode = Long.hashCode(c1324.f3837);
            C1253 c1253M2381 = c1324.m2381();
            InterfaceC2129 interfaceC2129M3861 = AbstractC2120.m3861(c1324, interfaceC2129);
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
            AbstractC1367.m2472(c1324, Integer.valueOf(iHashCode), C1765.f5188);
            AbstractC1367.m2481(c1324, C1765.f5187);
            AbstractC1367.m2472(c1324, interfaceC2129M3861, C1765.f5183);
            c1242.invoke(c1324, 6);
            c1324.m2377(true);
        } else {
            c1324.m2339();
        }
        C1389 c1389M2375 = c1324.m2375();
        if (c1389M2375 != null) {
            c1389M2375.f4034 = new C0889(interfaceC2129, c1242, i);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final void m1804(InterfaceC2129 interfaceC2129, InterfaceC6543 interfaceC6543, boolean z, InterfaceC1373 interfaceC1373, int i) {
        int i2;
        C1324 c1324 = (C1324) interfaceC1373;
        c1324.m2391(2111672474);
        if ((i & 6) == 0) {
            i2 = (c1324.m2360(interfaceC2129) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | (c1324.m2378(interfaceC6543) ? 32 : 16) | (c1324.m2379(z) ? 256 : 128);
        int i4 = 1;
        if (c1324.m2343(i3 & 1, (i3 & 147) != 146)) {
            C1947 c1947 = AbstractC0904.f2558;
            AbstractC0628.m1423(c1324, AbstractC2120.m3863(AbstractC0619.m1386(interfaceC2129, 25.0f, 25.0f), new C1006(interfaceC6543, i4, z)));
        } else {
            c1324.m2339();
        }
        C1389 c1389M2375 = c1324.m2375();
        if (c1389M2375 != null) {
            c1389M2375.f4034 = new C0924(interfaceC2129, interfaceC6543, z, i);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final void m1805(final InterfaceC0918 interfaceC0918, final boolean z, final ResolvedTextDirection resolvedTextDirection, final boolean z2, long j, final float f, final InterfaceC2129 interfaceC2129, InterfaceC1373 interfaceC1373, final int i) {
        int i2;
        final long j2;
        int i3;
        long j3;
        final boolean z3;
        C1324 c1324 = (C1324) interfaceC1373;
        c1324.m2391(-466280168);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? c1324.m2360(interfaceC0918) : c1324.m2378(interfaceC0918) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c1324.m2379(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c1324.m2362(resolvedTextDirection.ordinal()) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= c1324.m2379(z2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= 8192;
        }
        if ((1572864 & i) == 0) {
            i2 |= c1324.m2360(interfaceC2129) ? 1048576 : Opcodes.ASM8;
        }
        if (c1324.m2343(i2 & 1, (533651 & i2) != 533650)) {
            c1324.m2341();
            if ((i & 1) == 0 || c1324.m2353()) {
                i3 = i2 & (-57345);
                j3 = 9205357640488583168L;
            } else {
                c1324.m2339();
                i3 = i2 & (-57345);
                j3 = j;
            }
            c1324.m2374();
            if (z) {
                C1947 c1947 = AbstractC0904.f2558;
                z3 = (resolvedTextDirection == ResolvedTextDirection.Ltr && !z2) || (resolvedTextDirection == ResolvedTextDirection.Rtl && z2);
            } else {
                C1947 c19472 = AbstractC0904.f2558;
                z3 = (resolvedTextDirection != ResolvedTextDirection.Ltr || z2) && !(resolvedTextDirection == ResolvedTextDirection.Rtl && z2);
            }
            C2117 c2117 = z3 ? AbstractC2120.f6273 : AbstractC2120.f6274;
            int i4 = i3 & 14;
            boolean zM2379 = ((i3 & 112) == 32) | (i4 == 4 || ((i3 & 8) != 0 && c1324.m2378(interfaceC0918))) | c1324.m2379(z3);
            Object objM2345 = c1324.m2345();
            if (zM2379 || objM2345 == C1369.f3974) {
                objM2345 = new InterfaceC6558() { // from class: androidx.compose.foundation.text.selection.飘花落叶言子楪世苏兰哲
                    @Override // p052.InterfaceC6558
                    public final Object invoke(Object obj) {
                        InterfaceC1944 interfaceC1944 = (InterfaceC1944) obj;
                        long jMo1822 = interfaceC0918.mo1822();
                        interfaceC1944.mo3590(AbstractC0904.f2558, new C0893(z ? Handle.SelectionStart : Handle.SelectionEnd, jMo1822, z3 ? SelectionHandleAnchor.Left : SelectionHandleAnchor.Right, (9223372034707292159L & jMo1822) != 9205357640488583168L));
                        return C5176.f14739;
                    }
                };
                c1324.m2386(objM2345);
            }
            final InterfaceC2129 interfaceC2129M3649 = AbstractC1948.m3649(interfaceC2129, false, (InterfaceC6558) objM2345);
            final InterfaceC1863 interfaceC1863 = (InterfaceC1863) c1324.m2383(AbstractC1902.f5576);
            long j4 = j3;
            C2117 c21172 = c2117;
            j2 = j4;
            m1806(interfaceC0918, c21172, AbstractC1254.m2189(1365123137, new InterfaceC6554() { // from class: androidx.compose.foundation.text.selection.飘花落叶言子楪世哲苏兰
                @Override // p052.InterfaceC6554
                public final Object invoke(Object obj, Object obj2) {
                    InterfaceC1373 interfaceC13732 = (InterfaceC1373) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    C1324 c13242 = (C1324) interfaceC13732;
                    if (c13242.m2343(iIntValue & 1, (iIntValue & 3) != 2)) {
                        C0194 c0194Mo2428 = AbstractC1902.f5576.mo2428(interfaceC1863);
                        final long j5 = j2;
                        final boolean z4 = z3;
                        final InterfaceC2129 interfaceC21292 = interfaceC2129M3649;
                        final InterfaceC0918 interfaceC09182 = interfaceC0918;
                        AbstractC1367.m2487(c0194Mo2428, AbstractC1254.m2189(1260045569, new InterfaceC6554() { // from class: androidx.compose.foundation.text.selection.飘花落叶言子楪世兰苏哲
                            @Override // p052.InterfaceC6554
                            public final Object invoke(Object obj3, Object obj4) {
                                InterfaceC1373 interfaceC13733 = (InterfaceC1373) obj3;
                                int iIntValue2 = ((Integer) obj4).intValue();
                                final int i5 = 1;
                                final int i6 = 0;
                                C1324 c13243 = (C1324) interfaceC13733;
                                if (c13243.m2343(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    long j6 = j5;
                                    boolean z5 = z4;
                                    InterfaceC2129 interfaceC21293 = interfaceC21292;
                                    final InterfaceC0918 interfaceC09183 = interfaceC09182;
                                    C1353 c1353 = C1369.f3974;
                                    if (j6 != 9205357640488583168L) {
                                        c13243.m2392(3458246);
                                        C0629 c0629 = z5 ? AbstractC0628.f1767 : AbstractC0628.f1768;
                                        InterfaceC2129 interfaceC2129M1380 = AbstractC0619.m1380(interfaceC21293, C7903.m13353(j6), C7903.m13354(j6), 0.0f, 0.0f, 12);
                                        C0660 c0660M1460 = AbstractC0658.m1460(c0629, C2119.f6262, c13243, 0);
                                        int iHashCode = Long.hashCode(c13243.f3837);
                                        C1253 c1253M2381 = c13243.m2381();
                                        InterfaceC2129 interfaceC2129M3861 = AbstractC2120.m3861(c13243, interfaceC2129M1380);
                                        InterfaceC1784.f5222.getClass();
                                        InterfaceC6543 interfaceC6543 = C1765.f5185;
                                        c13243.m2396();
                                        if (c13243.f3838) {
                                            c13243.m2380(interfaceC6543);
                                        } else {
                                            c13243.m2390();
                                        }
                                        AbstractC1367.m2472(c13243, c0660M1460, C1765.f5181);
                                        AbstractC1367.m2472(c13243, c1253M2381, C1765.f5182);
                                        AbstractC1367.m2472(c13243, Integer.valueOf(iHashCode), C1765.f5188);
                                        AbstractC1367.m2481(c13243, C1765.f5187);
                                        AbstractC1367.m2472(c13243, interfaceC2129M3861, C1765.f5183);
                                        boolean zM2378 = c13243.m2378(interfaceC09183);
                                        Object objM23452 = c13243.m2345();
                                        if (zM2378 || objM23452 == c1353) {
                                            objM23452 = new InterfaceC6543() { // from class: androidx.compose.foundation.text.selection.飘花落叶言子楪世兰哲苏
                                                @Override // p052.InterfaceC6543
                                                public final Object invoke() {
                                                    int i7 = i6;
                                                    InterfaceC0918 interfaceC09184 = interfaceC09183;
                                                    switch (i7) {
                                                        case 0:
                                                            return Boolean.valueOf((9223372034707292159L & interfaceC09184.mo1822()) != 9205357640488583168L);
                                                        default:
                                                            return Boolean.valueOf((9223372034707292159L & interfaceC09184.mo1822()) != 9205357640488583168L);
                                                    }
                                                }
                                            };
                                            c13243.m2386(objM23452);
                                        }
                                        AbstractC0895.m1804(C2125.f6276, (InterfaceC6543) objM23452, z5, c13243, 6);
                                        c13243.m2377(true);
                                        c13243.m2377(false);
                                    } else {
                                        c13243.m2392(4389176);
                                        boolean zM23782 = c13243.m2378(interfaceC09183);
                                        Object objM23453 = c13243.m2345();
                                        if (zM23782 || objM23453 == c1353) {
                                            objM23453 = new InterfaceC6543() { // from class: androidx.compose.foundation.text.selection.飘花落叶言子楪世兰哲苏
                                                @Override // p052.InterfaceC6543
                                                public final Object invoke() {
                                                    int i7 = i5;
                                                    InterfaceC0918 interfaceC09184 = interfaceC09183;
                                                    switch (i7) {
                                                        case 0:
                                                            return Boolean.valueOf((9223372034707292159L & interfaceC09184.mo1822()) != 9205357640488583168L);
                                                        default:
                                                            return Boolean.valueOf((9223372034707292159L & interfaceC09184.mo1822()) != 9205357640488583168L);
                                                    }
                                                }
                                            };
                                            c13243.m2386(objM23453);
                                        }
                                        AbstractC0895.m1804(interfaceC21293, (InterfaceC6543) objM23453, z5, c13243, 0);
                                        c13243.m2377(false);
                                    }
                                } else {
                                    c13243.m2339();
                                }
                                return C5176.f14739;
                            }
                        }, c13242), c13242, 56);
                    } else {
                        c13242.m2339();
                    }
                    return C5176.f14739;
                }
            }, c1324), c1324, i4 | 384);
        } else {
            c1324.m2339();
            j2 = j;
        }
        C1389 c1389M2375 = c1324.m2375();
        if (c1389M2375 != null) {
            final long j5 = j2;
            c1389M2375.f4034 = new InterfaceC6554() { // from class: androidx.compose.foundation.text.selection.飘花落叶言子楪世哲兰苏
                @Override // p052.InterfaceC6554
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    AbstractC0895.m1805(interfaceC0918, z, resolvedTextDirection, z2, j5, f, interfaceC2129, (InterfaceC1373) obj, AbstractC1367.m2471(i | 1));
                    return C5176.f14739;
                }
            };
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final void m1806(InterfaceC0918 interfaceC0918, InterfaceC2118 interfaceC2118, C1242 c1242, InterfaceC1373 interfaceC1373, int i) {
        int i2;
        C1324 c1324 = (C1324) interfaceC1373;
        c1324.m2391(-1090171650);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? c1324.m2360(interfaceC0918) : c1324.m2378(interfaceC0918) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c1324.m2360(interfaceC2118) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c1324.m2378(c1242) ? 256 : 128;
        }
        boolean z = true;
        if (c1324.m2343(i2 & 1, (i2 & 147) != 146)) {
            boolean z2 = (i2 & 112) == 32;
            if ((i2 & 14) != 4 && ((i2 & 8) == 0 || !c1324.m2360(interfaceC0918))) {
                z = false;
            }
            boolean z3 = z2 | z;
            Object objM2345 = c1324.m2345();
            if (z3 || objM2345 == C1369.f3974) {
                objM2345 = new C0925(interfaceC2118, interfaceC0918);
                c1324.m2386(objM2345);
            }
            AbstractC2091.m3835((C0925) objM2345, null, new C2090(false, SecureFlagPolicy.Inherit, false), c1242, c1324, ((i2 << 3) & 7168) | 384, 2);
        } else {
            c1324.m2339();
        }
        C1389 c1389M2375 = c1324.m2375();
        if (c1389M2375 != null) {
            c1389M2375.f4034 = new C0695(interfaceC0918, interfaceC2118, c1242, i, 4);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final C7328 m1807(InterfaceC1695 interfaceC1695) {
        C7328 c7328M3099 = AbstractC1670.m3099(interfaceC1695, true);
        long jMo3078 = interfaceC1695.mo3078(c7328M3099.m12518());
        float f = c7328M3099.f19538;
        float f2 = c7328M3099.f19537;
        long jMo30782 = interfaceC1695.mo3078((((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L));
        return new C7328(Float.intBitsToFloat((int) (jMo3078 >> 32)), Float.intBitsToFloat((int) (jMo3078 & 4294967295L)), Float.intBitsToFloat((int) (jMo30782 >> 32)), Float.intBitsToFloat((int) (jMo30782 & 4294967295L)));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.compose.ui.graphics.C1610 m1808(androidx.compose.ui.draw.C1435 r25, float r26) {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.AbstractC0895.m1808(androidx.compose.ui.draw.飘花落叶言子楪世兰苏哲, float):androidx.compose.ui.graphics.飘花落叶言子楪苏世哲兰");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static final boolean m1809(C7328 c7328, long j) {
        float f = c7328.f19540;
        float f2 = c7328.f19538;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        if (f > fIntBitsToFloat || fIntBitsToFloat > f2) {
            return false;
        }
        float f3 = c7328.f19539;
        float f4 = c7328.f19537;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        return f3 <= fIntBitsToFloat2 && fIntBitsToFloat2 <= f4;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x008a A[Catch: all -> 0x0051, TryCatch #0 {all -> 0x0051, blocks: (B:20:0x004d, B:31:0x0082, B:33:0x008a, B:35:0x0098, B:37:0x00a4, B:28:0x006b), top: B:69:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0107 A[Catch: all -> 0x003a, TryCatch #1 {all -> 0x003a, blocks: (B:13:0x0035, B:54:0x00ed, B:56:0x00f5, B:58:0x00f9, B:60:0x0107, B:62:0x0113, B:50:0x00c8), top: B:69:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m1810(androidx.compose.ui.input.pointer.InterfaceC1633 r10, androidx.compose.foundation.text.selection.InterfaceC0926 r11, androidx.compose.foundation.text.selection.C0927 r12, androidx.compose.ui.input.pointer.C1652 r13, kotlin.coroutines.jvm.internal.BaseContinuationImpl r14) {
        /*
            Method dump skipped, instruction units count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.AbstractC0895.m1810(androidx.compose.ui.input.pointer.飘花落叶言子楪世苏兰哲, androidx.compose.foundation.text.selection.飘花落叶言子楪苏兰哲世, androidx.compose.foundation.text.selection.飘花落叶言子楪苏哲世兰, androidx.compose.ui.input.pointer.飘花落叶言子楪苏哲兰世, kotlin.coroutines.jvm.internal.BaseContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00aa, code lost:
    
        if (r15 == r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m1811(androidx.compose.ui.input.pointer.InterfaceC1633 r12, androidx.compose.foundation.text.InterfaceC1013 r13, androidx.compose.ui.input.pointer.C1652 r14, kotlin.coroutines.jvm.internal.BaseContinuationImpl r15) {
        /*
            Method dump skipped, instruction units count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.AbstractC0895.m1811(androidx.compose.ui.input.pointer.飘花落叶言子楪世苏兰哲, androidx.compose.foundation.text.飘花落叶言子苏楪哲世兰, androidx.compose.ui.input.pointer.飘花落叶言子楪苏哲兰世, kotlin.coroutines.jvm.internal.BaseContinuationImpl):java.lang.Object");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static final ResolvedTextDirection m1812(C2033 c2033, int i) {
        C2034 c2034 = c2033.f5991;
        C2062 c2062 = c2033.f5990;
        if (c2034.f5997.f6129.length() != 0) {
            int iM3788 = c2062.m3788(i);
            if ((i != 0 && iM3788 == c2062.m3788(i - 1)) || (i != c2033.f5991.f5997.f6129.length() && iM3788 == c2062.m3788(i + 1))) {
                return c2033.m3745(i);
            }
        }
        return c2033.m3746(i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final boolean m1813(C0882 c0882, boolean z) {
        InterfaceC1695 interfaceC1695M1866;
        C0943 c0943 = c0882.f2487;
        if (c0943 == null || (interfaceC1695M1866 = c0943.m1866()) == null) {
            return false;
        }
        return m1809(m1807(interfaceC1695M1866), c0882.m1768(z));
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ce, code lost:
    
        if (r15 == r1) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m1814(androidx.compose.ui.input.pointer.InterfaceC1633 r11, androidx.compose.foundation.text.InterfaceC1013 r12, androidx.compose.ui.input.pointer.C1652 r13, int r14, kotlin.coroutines.jvm.internal.BaseContinuationImpl r15) {
        /*
            Method dump skipped, instruction units count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.AbstractC0895.m1814(androidx.compose.ui.input.pointer.飘花落叶言子楪世苏兰哲, androidx.compose.foundation.text.飘花落叶言子苏楪哲世兰, androidx.compose.ui.input.pointer.飘花落叶言子楪苏哲兰世, int, kotlin.coroutines.jvm.internal.BaseContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0041 -> B:18:0x0044). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m1815(androidx.compose.ui.input.pointer.InterfaceC1633 r7, kotlin.coroutines.jvm.internal.BaseContinuationImpl r8) {
        /*
            boolean r0 = r8 instanceof androidx.compose.foundation.text.selection.SelectionGesturesKt$awaitDown$1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.foundation.text.selection.SelectionGesturesKt$awaitDown$1 r0 = (androidx.compose.foundation.text.selection.SelectionGesturesKt$awaitDown$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.text.selection.SelectionGesturesKt$awaitDown$1 r0 = new androidx.compose.foundation.text.selection.SelectionGesturesKt$awaitDown$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2b
            java.lang.Object r7 = r0.L$0
            androidx.compose.ui.input.pointer.飘花落叶言子楪世苏兰哲 r7 = (androidx.compose.ui.input.pointer.InterfaceC1633) r7
            kotlin.AbstractC5185.m10210(r8)
            goto L44
        L2b:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5925.m11311(r7)
            r7 = 0
            return r7
        L32:
            kotlin.AbstractC5185.m10210(r8)
        L35:
            androidx.compose.ui.input.pointer.PointerEventPass r8 = androidx.compose.ui.input.pointer.PointerEventPass.Main
            r0.L$0 = r7
            r0.label = r3
            androidx.compose.ui.input.pointer.飘花落叶言子世楪兰哲苏 r7 = (androidx.compose.ui.input.pointer.C1621) r7
            java.lang.Object r8 = r7.m2999(r8, r0)
            if (r8 != r1) goto L44
            return r1
        L44:
            androidx.compose.ui.input.pointer.飘花落叶言子楪苏哲兰世 r8 = (androidx.compose.ui.input.pointer.C1652) r8
            java.util.List r2 = r8.f4852
            int r4 = r2.size()
            r5 = 0
        L4d:
            if (r5 >= r4) goto L5f
            java.lang.Object r6 = r2.get(r5)
            androidx.compose.ui.input.pointer.飘花落叶言子楪哲兰世苏 r6 = (androidx.compose.ui.input.pointer.C1643) r6
            boolean r6 = androidx.compose.ui.input.pointer.AbstractC1646.m3030(r6)
            if (r6 != 0) goto L5c
            goto L35
        L5c:
            int r5 = r5 + 1
            goto L4d
        L5f:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.AbstractC0895.m1815(androidx.compose.ui.input.pointer.飘花落叶言子楪世苏兰哲, kotlin.coroutines.jvm.internal.BaseContinuationImpl):java.lang.Object");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final Object m1816(InterfaceC1635 interfaceC1635, InterfaceC0926 interfaceC0926, InterfaceC1013 interfaceC1013, InterfaceC4357 interfaceC4357) {
        C1627 c1627 = (C1627) interfaceC1635;
        c1627.getClass();
        Object objM1311 = AbstractC0521.m1311(interfaceC1635, new SelectionGesturesKt$awaitSelectionGestures$2(new C0927(AbstractC1785.m3346(c1627).f5096), interfaceC0926, interfaceC1013, null), interfaceC4357);
        return objM1311 == CoroutineSingletons.COROUTINE_SUSPENDED ? objM1311 : C5176.f14739;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final C0912 m1817(C0912 c0912, C0920 c0920, int i) {
        ResolvedTextDirection resolvedTextDirectionM3745 = ((C2033) c0920.f2610).m3745(i);
        long j = c0912.f2588;
        c0912.getClass();
        return new C0912(resolvedTextDirectionM3745, i, j);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final C0912 m1818(final C8065 c8065, final C0920 c0920, C0912 c0912) {
        int i = c0920.f2612;
        int i2 = c0920.f2613;
        boolean z = c8065.f22245;
        final int i3 = z ? i2 : i;
        C2033 c2033 = (C2033) c0920.f2610;
        int i4 = c0920.f2611;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final InterfaceC5184 interfaceC5184M10215 = AbstractC5187.m10215(lazyThreadSafetyMode, new C0916(c0920, i3, 0));
        final int i5 = z ? i : i2;
        InterfaceC5184 interfaceC5184M102152 = AbstractC5187.m10215(lazyThreadSafetyMode, new InterfaceC6543() { // from class: androidx.compose.foundation.text.selection.飘花落叶言子楪兰哲世苏
            @Override // p052.InterfaceC6543
            public final Object invoke() {
                C0920 c09202 = c0920;
                C2033 c20332 = (C2033) c09202.f2610;
                int iIntValue = ((Number) interfaceC5184M10215.getValue()).intValue();
                C8065 c80652 = c8065;
                boolean z2 = c80652.f22245;
                boolean z3 = c80652.m13553() == CrossStatus.CROSSED;
                int i6 = i3;
                long jM3749 = c20332.m3749(i6);
                int i7 = C2035.f6002;
                int iM3747 = (int) (jM3749 >> 32);
                C2062 c2062 = c20332.f5990;
                int iM3788 = c2062.m3788(iM3747);
                int i8 = c2062.f6100;
                if (iM3788 != iIntValue) {
                    iM3747 = iIntValue >= i8 ? c20332.m3747(i8 - 1) : c20332.m3747(iIntValue);
                }
                int iM3789 = (int) (jM3749 & 4294967295L);
                if (c2062.m3788(iM3789) != iIntValue) {
                    C2062 c20622 = c20332.f5990;
                    iM3789 = iIntValue >= i8 ? c20622.m3789(i8 - 1, false) : c20622.m3789(iIntValue, false);
                }
                int i9 = i5;
                if (iM3747 == i9) {
                    return c09202.m1827(iM3789);
                }
                if (iM3789 == i9) {
                    return c09202.m1827(iM3747);
                }
                if (!(z2 ^ z3) ? i6 >= iM3747 : i6 > iM3789) {
                    iM3747 = iM3789;
                }
                return c09202.m1827(iM3747);
            }
        });
        if (1 != c0912.f2588) {
            return (C0912) interfaceC5184M102152.getValue();
        }
        if (i3 == i4) {
            return c0912;
        }
        if (((Number) interfaceC5184M10215.getValue()).intValue() != c2033.f5990.m3788(i4)) {
            return (C0912) interfaceC5184M102152.getValue();
        }
        int i6 = c0912.f2589;
        long jM3749 = c2033.m3749(i6);
        if (i4 != -1) {
            if (i3 != i4) {
                if (((z ? 1 : 0) ^ ((i2 < i ? CrossStatus.NOT_CROSSED : i2 > i ? CrossStatus.CROSSED : CrossStatus.COLLAPSED) == CrossStatus.CROSSED ? 1 : 0)) == 0) {
                }
            }
            return c0920.m1827(i3);
        }
        int i7 = C2035.f6002;
        return (i6 == ((int) (jM3749 >> 32)) || i6 == ((int) (jM3749 & 4294967295L))) ? (C0912) interfaceC5184M102152.getValue() : c0920.m1827(i3);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final C0912 m1819(C0920 c0920, boolean z, boolean z2, C0915 c0915) {
        long jM3770;
        long j;
        int i = z2 ? c0920.f2613 : c0920.f2612;
        switch (c0915.f2604) {
            case 0:
                String str = ((C2033) c0920.f2610).f5991.f5997.f6129;
                jM3770 = AbstractC2048.m3770(AbstractC0983.m1906(i, str), AbstractC0983.m1905(i, str));
                break;
            default:
                jM3770 = ((C2033) c0920.f2610).m3749(i);
                break;
        }
        if (z ^ z2) {
            int i2 = C2035.f6002;
            j = jM3770 >> 32;
        } else {
            int i3 = C2035.f6002;
            j = 4294967295L & jM3770;
        }
        return c0920.m1827((int) j);
    }
}
