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
import kotlin.AbstractC5186;
import kotlin.C5175;
import kotlin.InterfaceC5183;
import kotlin.LazyThreadSafetyMode;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import net.bytebuddy.jar.asm.Opcodes;
import p052.InterfaceC6542;
import p052.InterfaceC6553;
import p052.InterfaceC6557;
import p112.C7327;
import p205.C7902;
import p232.C8064;

/* JADX INFO: renamed from: androidx.compose.foundation.text.selection.飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0895 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static C1507 f2539;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static C1595 f2540;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C1610 f2541;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C0911 m1791(C8064 c8064, C0915 c0915) {
        CrossStatus crossStatusM13524 = c8064.m13524();
        C0920 c0920 = (C0920) c8064.f22246;
        boolean z = crossStatusM13524 == CrossStatus.CROSSED;
        return new C0911(m1809(c0920, z, true, c0915), m1809(c0920, z, false, c0915), z);
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x011f  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1792(boolean r16, androidx.compose.ui.text.style.ResolvedTextDirection r17, androidx.compose.foundation.text.selection.C0882 r18, androidx.compose.runtime.InterfaceC1373 r19, int r20) {
        /*
            Method dump skipped, instruction units count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.AbstractC0895.m1792(boolean, androidx.compose.ui.text.style.ResolvedTextDirection, androidx.compose.foundation.text.selection.飘花落叶言子世兰哲苏楪, androidx.compose.runtime.飘花落叶言子楪苏哲世兰, int):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final void m1793(InterfaceC2129 interfaceC2129, C1242 c1242, InterfaceC1373 interfaceC1373, int i) {
        C1324 c1324 = (C1324) interfaceC1373;
        c1324.m2381(-1854833411);
        int i2 = (c1324.m2350(interfaceC2129) ? 4 : 2) | i;
        if (c1324.m2333(i2 & 1, (i2 & 19) != 18)) {
            Object objM2335 = c1324.m2335();
            if (objM2335 == C1369.f3973) {
                objM2335 = C0892.f2533;
                c1324.m2376(objM2335);
            }
            InterfaceC1658 interfaceC1658 = (InterfaceC1658) objM2335;
            int iHashCode = Long.hashCode(c1324.f3836);
            C1253 c1253M2371 = c1324.m2371();
            InterfaceC2129 interfaceC2129M3851 = AbstractC2120.m3851(c1324, interfaceC2129);
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
            AbstractC1367.m2464(c1324, Integer.valueOf(iHashCode), C1765.f5187);
            AbstractC1367.m2472(c1324, C1765.f5186);
            AbstractC1367.m2464(c1324, interfaceC2129M3851, C1765.f5182);
            c1242.invoke(c1324, 6);
            c1324.m2367(true);
        } else {
            c1324.m2329();
        }
        C1389 c1389M2365 = c1324.m2365();
        if (c1389M2365 != null) {
            c1389M2365.f4033 = new C0889(interfaceC2129, c1242, i);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final void m1794(InterfaceC2129 interfaceC2129, InterfaceC6542 interfaceC6542, boolean z, InterfaceC1373 interfaceC1373, int i) {
        int i2;
        C1324 c1324 = (C1324) interfaceC1373;
        c1324.m2381(2111672474);
        if ((i & 6) == 0) {
            i2 = (c1324.m2350(interfaceC2129) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | (c1324.m2368(interfaceC6542) ? 32 : 16) | (c1324.m2369(z) ? 256 : 128);
        int i4 = 1;
        if (c1324.m2333(i3 & 1, (i3 & 147) != 146)) {
            C1947 c1947 = AbstractC0904.f2557;
            AbstractC0628.m1413(c1324, AbstractC2120.m3853(AbstractC0619.m1376(interfaceC2129, 25.0f, 25.0f), new C1006(interfaceC6542, i4, z)));
        } else {
            c1324.m2329();
        }
        C1389 c1389M2365 = c1324.m2365();
        if (c1389M2365 != null) {
            c1389M2365.f4033 = new C0924(interfaceC2129, interfaceC6542, z, i);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final void m1795(final InterfaceC0918 interfaceC0918, final boolean z, final ResolvedTextDirection resolvedTextDirection, final boolean z2, long j, final float f, final InterfaceC2129 interfaceC2129, InterfaceC1373 interfaceC1373, final int i) {
        int i2;
        final long j2;
        int i3;
        long j3;
        final boolean z3;
        C1324 c1324 = (C1324) interfaceC1373;
        c1324.m2381(-466280168);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? c1324.m2350(interfaceC0918) : c1324.m2368(interfaceC0918) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c1324.m2369(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c1324.m2352(resolvedTextDirection.ordinal()) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= c1324.m2369(z2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= 8192;
        }
        if ((1572864 & i) == 0) {
            i2 |= c1324.m2350(interfaceC2129) ? 1048576 : Opcodes.ASM8;
        }
        if (c1324.m2333(i2 & 1, (533651 & i2) != 533650)) {
            c1324.m2331();
            if ((i & 1) == 0 || c1324.m2343()) {
                i3 = i2 & (-57345);
                j3 = 9205357640488583168L;
            } else {
                c1324.m2329();
                i3 = i2 & (-57345);
                j3 = j;
            }
            c1324.m2364();
            if (z) {
                C1947 c1947 = AbstractC0904.f2557;
                z3 = (resolvedTextDirection == ResolvedTextDirection.Ltr && !z2) || (resolvedTextDirection == ResolvedTextDirection.Rtl && z2);
            } else {
                C1947 c19472 = AbstractC0904.f2557;
                z3 = (resolvedTextDirection != ResolvedTextDirection.Ltr || z2) && !(resolvedTextDirection == ResolvedTextDirection.Rtl && z2);
            }
            C2117 c2117 = z3 ? AbstractC2120.f6272 : AbstractC2120.f6273;
            int i4 = i3 & 14;
            boolean zM2369 = ((i3 & 112) == 32) | (i4 == 4 || ((i3 & 8) != 0 && c1324.m2368(interfaceC0918))) | c1324.m2369(z3);
            Object objM2335 = c1324.m2335();
            if (zM2369 || objM2335 == C1369.f3973) {
                objM2335 = new InterfaceC6557() { // from class: androidx.compose.foundation.text.selection.飘花落叶言子楪世苏兰哲
                    @Override // p052.InterfaceC6557
                    public final Object invoke(Object obj) {
                        InterfaceC1944 interfaceC1944 = (InterfaceC1944) obj;
                        long jMo1812 = interfaceC0918.mo1812();
                        interfaceC1944.mo3580(AbstractC0904.f2557, new C0893(z ? Handle.SelectionStart : Handle.SelectionEnd, jMo1812, z3 ? SelectionHandleAnchor.Left : SelectionHandleAnchor.Right, (9223372034707292159L & jMo1812) != 9205357640488583168L));
                        return C5175.f14739;
                    }
                };
                c1324.m2376(objM2335);
            }
            final InterfaceC2129 interfaceC2129M3639 = AbstractC1948.m3639(interfaceC2129, false, (InterfaceC6557) objM2335);
            final InterfaceC1863 interfaceC1863 = (InterfaceC1863) c1324.m2373(AbstractC1902.f5575);
            long j4 = j3;
            C2117 c21172 = c2117;
            j2 = j4;
            m1796(interfaceC0918, c21172, AbstractC1254.m2179(1365123137, new InterfaceC6553() { // from class: androidx.compose.foundation.text.selection.飘花落叶言子楪世哲苏兰
                @Override // p052.InterfaceC6553
                public final Object invoke(Object obj, Object obj2) {
                    InterfaceC1373 interfaceC13732 = (InterfaceC1373) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    C1324 c13242 = (C1324) interfaceC13732;
                    if (c13242.m2333(iIntValue & 1, (iIntValue & 3) != 2)) {
                        C0194 c0194Mo2418 = AbstractC1902.f5575.mo2418(interfaceC1863);
                        final long j5 = j2;
                        final boolean z4 = z3;
                        final InterfaceC2129 interfaceC21292 = interfaceC2129M3639;
                        final InterfaceC0918 interfaceC09182 = interfaceC0918;
                        AbstractC1367.m2478(c0194Mo2418, AbstractC1254.m2179(1260045569, new InterfaceC6553() { // from class: androidx.compose.foundation.text.selection.飘花落叶言子楪世兰苏哲
                            @Override // p052.InterfaceC6553
                            public final Object invoke(Object obj3, Object obj4) {
                                InterfaceC1373 interfaceC13733 = (InterfaceC1373) obj3;
                                int iIntValue2 = ((Integer) obj4).intValue();
                                final int i5 = 1;
                                final int i6 = 0;
                                C1324 c13243 = (C1324) interfaceC13733;
                                if (c13243.m2333(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    long j6 = j5;
                                    boolean z5 = z4;
                                    InterfaceC2129 interfaceC21293 = interfaceC21292;
                                    final InterfaceC0918 interfaceC09183 = interfaceC09182;
                                    C1353 c1353 = C1369.f3973;
                                    if (j6 != 9205357640488583168L) {
                                        c13243.m2382(3458246);
                                        C0629 c0629 = z5 ? AbstractC0628.f1766 : AbstractC0628.f1767;
                                        InterfaceC2129 interfaceC2129M1370 = AbstractC0619.m1370(interfaceC21293, C7902.m13325(j6), C7902.m13326(j6), 0.0f, 0.0f, 12);
                                        C0660 c0660M1450 = AbstractC0658.m1450(c0629, C2119.f6261, c13243, 0);
                                        int iHashCode = Long.hashCode(c13243.f3836);
                                        C1253 c1253M2371 = c13243.m2371();
                                        InterfaceC2129 interfaceC2129M3851 = AbstractC2120.m3851(c13243, interfaceC2129M1370);
                                        InterfaceC1784.f5221.getClass();
                                        InterfaceC6542 interfaceC6542 = C1765.f5184;
                                        c13243.m2386();
                                        if (c13243.f3837) {
                                            c13243.m2370(interfaceC6542);
                                        } else {
                                            c13243.m2380();
                                        }
                                        AbstractC1367.m2464(c13243, c0660M1450, C1765.f5180);
                                        AbstractC1367.m2464(c13243, c1253M2371, C1765.f5181);
                                        AbstractC1367.m2464(c13243, Integer.valueOf(iHashCode), C1765.f5187);
                                        AbstractC1367.m2472(c13243, C1765.f5186);
                                        AbstractC1367.m2464(c13243, interfaceC2129M3851, C1765.f5182);
                                        boolean zM2368 = c13243.m2368(interfaceC09183);
                                        Object objM23352 = c13243.m2335();
                                        if (zM2368 || objM23352 == c1353) {
                                            objM23352 = new InterfaceC6542() { // from class: androidx.compose.foundation.text.selection.飘花落叶言子楪世兰哲苏
                                                @Override // p052.InterfaceC6542
                                                public final Object invoke() {
                                                    int i7 = i6;
                                                    InterfaceC0918 interfaceC09184 = interfaceC09183;
                                                    switch (i7) {
                                                        case 0:
                                                            return Boolean.valueOf((9223372034707292159L & interfaceC09184.mo1812()) != 9205357640488583168L);
                                                        default:
                                                            return Boolean.valueOf((9223372034707292159L & interfaceC09184.mo1812()) != 9205357640488583168L);
                                                    }
                                                }
                                            };
                                            c13243.m2376(objM23352);
                                        }
                                        AbstractC0895.m1794(C2125.f6275, (InterfaceC6542) objM23352, z5, c13243, 6);
                                        c13243.m2367(true);
                                        c13243.m2367(false);
                                    } else {
                                        c13243.m2382(4389176);
                                        boolean zM23682 = c13243.m2368(interfaceC09183);
                                        Object objM23353 = c13243.m2335();
                                        if (zM23682 || objM23353 == c1353) {
                                            objM23353 = new InterfaceC6542() { // from class: androidx.compose.foundation.text.selection.飘花落叶言子楪世兰哲苏
                                                @Override // p052.InterfaceC6542
                                                public final Object invoke() {
                                                    int i7 = i5;
                                                    InterfaceC0918 interfaceC09184 = interfaceC09183;
                                                    switch (i7) {
                                                        case 0:
                                                            return Boolean.valueOf((9223372034707292159L & interfaceC09184.mo1812()) != 9205357640488583168L);
                                                        default:
                                                            return Boolean.valueOf((9223372034707292159L & interfaceC09184.mo1812()) != 9205357640488583168L);
                                                    }
                                                }
                                            };
                                            c13243.m2376(objM23353);
                                        }
                                        AbstractC0895.m1794(interfaceC21293, (InterfaceC6542) objM23353, z5, c13243, 0);
                                        c13243.m2367(false);
                                    }
                                } else {
                                    c13243.m2329();
                                }
                                return C5175.f14739;
                            }
                        }, c13242), c13242, 56);
                    } else {
                        c13242.m2329();
                    }
                    return C5175.f14739;
                }
            }, c1324), c1324, i4 | 384);
        } else {
            c1324.m2329();
            j2 = j;
        }
        C1389 c1389M2365 = c1324.m2365();
        if (c1389M2365 != null) {
            final long j5 = j2;
            c1389M2365.f4033 = new InterfaceC6553() { // from class: androidx.compose.foundation.text.selection.飘花落叶言子楪世哲兰苏
                @Override // p052.InterfaceC6553
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    AbstractC0895.m1795(interfaceC0918, z, resolvedTextDirection, z2, j5, f, interfaceC2129, (InterfaceC1373) obj, AbstractC1367.m2460(i | 1));
                    return C5175.f14739;
                }
            };
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final void m1796(InterfaceC0918 interfaceC0918, InterfaceC2118 interfaceC2118, C1242 c1242, InterfaceC1373 interfaceC1373, int i) {
        int i2;
        C1324 c1324 = (C1324) interfaceC1373;
        c1324.m2381(-1090171650);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? c1324.m2350(interfaceC0918) : c1324.m2368(interfaceC0918) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c1324.m2350(interfaceC2118) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c1324.m2368(c1242) ? 256 : 128;
        }
        boolean z = true;
        if (c1324.m2333(i2 & 1, (i2 & 147) != 146)) {
            boolean z2 = (i2 & 112) == 32;
            if ((i2 & 14) != 4 && ((i2 & 8) == 0 || !c1324.m2350(interfaceC0918))) {
                z = false;
            }
            boolean z3 = z2 | z;
            Object objM2335 = c1324.m2335();
            if (z3 || objM2335 == C1369.f3973) {
                objM2335 = new C0925(interfaceC2118, interfaceC0918);
                c1324.m2376(objM2335);
            }
            AbstractC2091.m3825((C0925) objM2335, null, new C2090(false, SecureFlagPolicy.Inherit, false), c1242, c1324, ((i2 << 3) & 7168) | 384, 2);
        } else {
            c1324.m2329();
        }
        C1389 c1389M2365 = c1324.m2365();
        if (c1389M2365 != null) {
            c1389M2365.f4033 = new C0695(interfaceC0918, interfaceC2118, c1242, i, 4);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final C7327 m1797(InterfaceC1695 interfaceC1695) {
        C7327 c7327M3089 = AbstractC1670.m3089(interfaceC1695, true);
        long jMo3068 = interfaceC1695.mo3068(c7327M3089.m12491());
        float f = c7327M3089.f19543;
        float f2 = c7327M3089.f19542;
        long jMo30682 = interfaceC1695.mo3068((((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L));
        return new C7327(Float.intBitsToFloat((int) (jMo3068 >> 32)), Float.intBitsToFloat((int) (jMo3068 & 4294967295L)), Float.intBitsToFloat((int) (jMo30682 >> 32)), Float.intBitsToFloat((int) (jMo30682 & 4294967295L)));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.compose.ui.graphics.C1610 m1798(androidx.compose.ui.draw.C1435 r25, float r26) {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.AbstractC0895.m1798(androidx.compose.ui.draw.飘花落叶言子楪世兰苏哲, float):androidx.compose.ui.graphics.飘花落叶言子楪苏世哲兰");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static final boolean m1799(C7327 c7327, long j) {
        float f = c7327.f19545;
        float f2 = c7327.f19543;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        if (f > fIntBitsToFloat || fIntBitsToFloat > f2) {
            return false;
        }
        float f3 = c7327.f19544;
        float f4 = c7327.f19542;
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
    public static final java.lang.Object m1800(androidx.compose.ui.input.pointer.InterfaceC1633 r10, androidx.compose.foundation.text.selection.InterfaceC0926 r11, androidx.compose.foundation.text.selection.C0927 r12, androidx.compose.ui.input.pointer.C1652 r13, kotlin.coroutines.jvm.internal.BaseContinuationImpl r14) {
        /*
            Method dump skipped, instruction units count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.AbstractC0895.m1800(androidx.compose.ui.input.pointer.飘花落叶言子楪世苏兰哲, androidx.compose.foundation.text.selection.飘花落叶言子楪苏兰哲世, androidx.compose.foundation.text.selection.飘花落叶言子楪苏哲世兰, androidx.compose.ui.input.pointer.飘花落叶言子楪苏哲兰世, kotlin.coroutines.jvm.internal.BaseContinuationImpl):java.lang.Object");
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
    public static final java.lang.Object m1801(androidx.compose.ui.input.pointer.InterfaceC1633 r12, androidx.compose.foundation.text.InterfaceC1013 r13, androidx.compose.ui.input.pointer.C1652 r14, kotlin.coroutines.jvm.internal.BaseContinuationImpl r15) {
        /*
            Method dump skipped, instruction units count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.AbstractC0895.m1801(androidx.compose.ui.input.pointer.飘花落叶言子楪世苏兰哲, androidx.compose.foundation.text.飘花落叶言子苏楪哲世兰, androidx.compose.ui.input.pointer.飘花落叶言子楪苏哲兰世, kotlin.coroutines.jvm.internal.BaseContinuationImpl):java.lang.Object");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static final ResolvedTextDirection m1802(C2033 c2033, int i) {
        C2034 c2034 = c2033.f5990;
        C2062 c2062 = c2033.f5989;
        if (c2034.f5996.f6128.length() != 0) {
            int iM3778 = c2062.m3778(i);
            if ((i != 0 && iM3778 == c2062.m3778(i - 1)) || (i != c2033.f5990.f5996.f6128.length() && iM3778 == c2062.m3778(i + 1))) {
                return c2033.m3735(i);
            }
        }
        return c2033.m3736(i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final boolean m1803(C0882 c0882, boolean z) {
        InterfaceC1695 interfaceC1695M1856;
        C0943 c0943 = c0882.f2486;
        if (c0943 == null || (interfaceC1695M1856 = c0943.m1856()) == null) {
            return false;
        }
        return m1799(m1797(interfaceC1695M1856), c0882.m1758(z));
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
    public static final java.lang.Object m1804(androidx.compose.ui.input.pointer.InterfaceC1633 r11, androidx.compose.foundation.text.InterfaceC1013 r12, androidx.compose.ui.input.pointer.C1652 r13, int r14, kotlin.coroutines.jvm.internal.BaseContinuationImpl r15) {
        /*
            Method dump skipped, instruction units count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.AbstractC0895.m1804(androidx.compose.ui.input.pointer.飘花落叶言子楪世苏兰哲, androidx.compose.foundation.text.飘花落叶言子苏楪哲世兰, androidx.compose.ui.input.pointer.飘花落叶言子楪苏哲兰世, int, kotlin.coroutines.jvm.internal.BaseContinuationImpl):java.lang.Object");
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
    public static final java.lang.Object m1805(androidx.compose.ui.input.pointer.InterfaceC1633 r7, kotlin.coroutines.jvm.internal.BaseContinuationImpl r8) {
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
            kotlin.AbstractC5184.m10206(r8)
            goto L44
        L2b:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5919.m11250(r7)
            r7 = 0
            return r7
        L32:
            kotlin.AbstractC5184.m10206(r8)
        L35:
            androidx.compose.ui.input.pointer.PointerEventPass r8 = androidx.compose.ui.input.pointer.PointerEventPass.Main
            r0.L$0 = r7
            r0.label = r3
            androidx.compose.ui.input.pointer.飘花落叶言子世楪兰哲苏 r7 = (androidx.compose.ui.input.pointer.C1621) r7
            java.lang.Object r8 = r7.m2989(r8, r0)
            if (r8 != r1) goto L44
            return r1
        L44:
            androidx.compose.ui.input.pointer.飘花落叶言子楪苏哲兰世 r8 = (androidx.compose.ui.input.pointer.C1652) r8
            java.util.List r2 = r8.f4851
            int r4 = r2.size()
            r5 = 0
        L4d:
            if (r5 >= r4) goto L5f
            java.lang.Object r6 = r2.get(r5)
            androidx.compose.ui.input.pointer.飘花落叶言子楪哲兰世苏 r6 = (androidx.compose.ui.input.pointer.C1643) r6
            boolean r6 = androidx.compose.ui.input.pointer.AbstractC1646.m3020(r6)
            if (r6 != 0) goto L5c
            goto L35
        L5c:
            int r5 = r5 + 1
            goto L4d
        L5f:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.AbstractC0895.m1805(androidx.compose.ui.input.pointer.飘花落叶言子楪世苏兰哲, kotlin.coroutines.jvm.internal.BaseContinuationImpl):java.lang.Object");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final Object m1806(InterfaceC1635 interfaceC1635, InterfaceC0926 interfaceC0926, InterfaceC1013 interfaceC1013, InterfaceC4356 interfaceC4356) {
        C1627 c1627 = (C1627) interfaceC1635;
        c1627.getClass();
        Object objM1301 = AbstractC0521.m1301(interfaceC1635, new SelectionGesturesKt$awaitSelectionGestures$2(new C0927(AbstractC1785.m3336(c1627).f5095), interfaceC0926, interfaceC1013, null), interfaceC4356);
        return objM1301 == CoroutineSingletons.COROUTINE_SUSPENDED ? objM1301 : C5175.f14739;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final C0912 m1807(C0912 c0912, C0920 c0920, int i) {
        ResolvedTextDirection resolvedTextDirectionM3735 = ((C2033) c0920.f2609).m3735(i);
        long j = c0912.f2587;
        c0912.getClass();
        return new C0912(resolvedTextDirectionM3735, i, j);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final C0912 m1808(final C8064 c8064, final C0920 c0920, C0912 c0912) {
        int i = c0920.f2611;
        int i2 = c0920.f2612;
        boolean z = c8064.f22247;
        final int i3 = z ? i2 : i;
        C2033 c2033 = (C2033) c0920.f2609;
        int i4 = c0920.f2610;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final InterfaceC5183 interfaceC5183M10211 = AbstractC5186.m10211(lazyThreadSafetyMode, new C0916(c0920, i3, 0));
        final int i5 = z ? i : i2;
        InterfaceC5183 interfaceC5183M102112 = AbstractC5186.m10211(lazyThreadSafetyMode, new InterfaceC6542() { // from class: androidx.compose.foundation.text.selection.飘花落叶言子楪兰哲世苏
            @Override // p052.InterfaceC6542
            public final Object invoke() {
                C0920 c09202 = c0920;
                C2033 c20332 = (C2033) c09202.f2609;
                int iIntValue = ((Number) interfaceC5183M10211.getValue()).intValue();
                C8064 c80642 = c8064;
                boolean z2 = c80642.f22247;
                boolean z3 = c80642.m13524() == CrossStatus.CROSSED;
                int i6 = i3;
                long jM3739 = c20332.m3739(i6);
                int i7 = C2035.f6001;
                int iM3737 = (int) (jM3739 >> 32);
                C2062 c2062 = c20332.f5989;
                int iM3778 = c2062.m3778(iM3737);
                int i8 = c2062.f6099;
                if (iM3778 != iIntValue) {
                    iM3737 = iIntValue >= i8 ? c20332.m3737(i8 - 1) : c20332.m3737(iIntValue);
                }
                int iM3779 = (int) (jM3739 & 4294967295L);
                if (c2062.m3778(iM3779) != iIntValue) {
                    C2062 c20622 = c20332.f5989;
                    iM3779 = iIntValue >= i8 ? c20622.m3779(i8 - 1, false) : c20622.m3779(iIntValue, false);
                }
                int i9 = i5;
                if (iM3737 == i9) {
                    return c09202.m1817(iM3779);
                }
                if (iM3779 == i9) {
                    return c09202.m1817(iM3737);
                }
                if (!(z2 ^ z3) ? i6 >= iM3737 : i6 > iM3779) {
                    iM3737 = iM3779;
                }
                return c09202.m1817(iM3737);
            }
        });
        if (1 != c0912.f2587) {
            return (C0912) interfaceC5183M102112.getValue();
        }
        if (i3 == i4) {
            return c0912;
        }
        if (((Number) interfaceC5183M10211.getValue()).intValue() != c2033.f5989.m3778(i4)) {
            return (C0912) interfaceC5183M102112.getValue();
        }
        int i6 = c0912.f2588;
        long jM3739 = c2033.m3739(i6);
        if (i4 != -1) {
            if (i3 != i4) {
                if (((z ? 1 : 0) ^ ((i2 < i ? CrossStatus.NOT_CROSSED : i2 > i ? CrossStatus.CROSSED : CrossStatus.COLLAPSED) == CrossStatus.CROSSED ? 1 : 0)) == 0) {
                }
            }
            return c0920.m1817(i3);
        }
        int i7 = C2035.f6001;
        return (i6 == ((int) (jM3739 >> 32)) || i6 == ((int) (jM3739 & 4294967295L))) ? (C0912) interfaceC5183M102112.getValue() : c0920.m1817(i3);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final C0912 m1809(C0920 c0920, boolean z, boolean z2, C0915 c0915) {
        long jM3760;
        long j;
        int i = z2 ? c0920.f2612 : c0920.f2611;
        switch (c0915.f2603) {
            case 0:
                String str = ((C2033) c0920.f2609).f5990.f5996.f6128;
                jM3760 = AbstractC2048.m3760(AbstractC0983.m1896(i, str), AbstractC0983.m1895(i, str));
                break;
            default:
                jM3760 = ((C2033) c0920.f2609).m3739(i);
                break;
        }
        if (z ^ z2) {
            int i2 = C2035.f6001;
            j = jM3760 >> 32;
        } else {
            int i3 = C2035.f6001;
            j = 4294967295L & jM3760;
        }
        return c0920.m1817((int) j);
    }
}
