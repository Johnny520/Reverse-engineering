package androidx.compose.material3;

import androidx.activity.compose.C0858;
import androidx.compose.foundation.C1898;
import androidx.compose.foundation.text.AbstractC1821;
import androidx.compose.p001ui.C2958;
import androidx.compose.p001ui.InterfaceC2962;
import androidx.compose.p001ui.graphics.C2434;
import androidx.compose.p001ui.text.C2865;
import androidx.compose.p001ui.text.font.C2822;
import androidx.compose.runtime.AbstractC2202;
import androidx.compose.runtime.AbstractC2225;
import androidx.compose.runtime.C2159;
import androidx.compose.runtime.C2193;
import androidx.compose.runtime.C2224;
import androidx.compose.runtime.InterfaceC2208;
import androidx.compose.runtime.internal.C2077;
import kotlin.C6008;
import net.bytebuddy.jar.asm.Opcodes;
import p068.InterfaceC7383;
import p221.C8728;
import p225.C8763;

/* JADX INFO: renamed from: androidx.compose.material3.飘花落叶言子哲楪世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2003 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C2193 f3699 = new C2193(new C0858(20));

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r37v1 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2585(final String str, InterfaceC2962 interfaceC2962, final long j, final long j2, C2822 c2822, long j3, C8763 c8763, long j4, int i, boolean z, int i2, int i3, C2865 c2865, InterfaceC2208 interfaceC2208, final int i4, final int i5) {
        String str2;
        int i6;
        InterfaceC2962 interfaceC29622;
        long j5;
        int i7;
        C2822 c28222;
        int i8;
        int i9;
        C8763 c87632;
        final long j6;
        final int i10;
        final boolean z2;
        final int i11;
        final int i12;
        final C2865 c28652;
        final C2822 c28223;
        final InterfaceC2962 interfaceC29623;
        final long j7;
        final C8763 c87633;
        C2159 c2159;
        C2224 c2224M2935;
        InterfaceC2962 interfaceC29624;
        long j8;
        C8763 c87634;
        boolean z3;
        int i13;
        C2865 c28653;
        int i14;
        long j9;
        long jM4299;
        int i15;
        boolean z4;
        C2159 c21592 = (C2159) interfaceC2208;
        c21592.m2951(1809465675);
        char c = 4;
        if ((i4 & 6) == 0) {
            str2 = str;
            i6 = (c21592.m2920(str2) ? 4 : 2) | i4;
        } else {
            str2 = str;
            i6 = i4;
        }
        int i16 = i5 & 2;
        if (i16 != 0) {
            i6 |= 48;
        } else {
            if ((i4 & 48) == 0) {
                interfaceC29622 = interfaceC2962;
                i6 |= c21592.m2920(interfaceC29622) ? 32 : 16;
            }
            if ((i4 & 384) == 0) {
                i6 |= c21592.m2921(j) ? 256 : 128;
            }
            int i17 = i6 | 3072;
            if ((i4 & 24576) != 0) {
                j5 = j2;
                i17 |= c21592.m2921(j5) ? 16384 : 8192;
            } else {
                j5 = j2;
            }
            int i18 = 196608 | i17;
            i7 = i5 & 64;
            if (i7 != 0) {
                if ((1572864 & i4) == 0) {
                    c28222 = c2822;
                    i18 |= c21592.m2920(c28222) ? 1048576 : Opcodes.ASM8;
                }
                i8 = i18 | 918552576;
                i9 = i5 & 1024;
                if (i9 != 0) {
                    c = 6;
                    c87632 = c8763;
                } else {
                    c87632 = c8763;
                    if (!c21592.m2920(c87632)) {
                        c = 2;
                    }
                }
                int i19 = 1;
                if (c21592.m2903(i8 & 1, ((i8 & 306783379) == 306783378 && (4793491 & (c | 28080)) == 4793490) ? false : true)) {
                    c21592.m2901();
                    if ((i4 & 1) == 0 || c21592.m2913()) {
                        interfaceC29624 = i16 != 0 ? C2958.f6621 : interfaceC29622;
                        if (i7 != 0) {
                            c28222 = null;
                        }
                        j8 = C8728.f22211;
                        c87634 = i9 == 0 ? c87632 : null;
                        z3 = true;
                        i13 = 1;
                        c28653 = (C2865) c21592.m2943(f3699);
                        i14 = Integer.MAX_VALUE;
                        j9 = j8;
                    } else {
                        c21592.m2899();
                        i19 = i;
                        z3 = z;
                        i14 = i2;
                        i13 = i3;
                        c28653 = c2865;
                        c87634 = c87632;
                        interfaceC29624 = interfaceC29622;
                        j8 = j3;
                        j9 = j4;
                    }
                    c21592.m2934();
                    c21592.m2952(-565217106);
                    if (j != 16) {
                        jM4299 = j;
                        i15 = i19;
                        z4 = false;
                    } else {
                        c21592.m2952(-565216333);
                        jM4299 = c28653.m4299();
                        if (jM4299 != 16) {
                            i15 = i19;
                        } else {
                            i15 = i19;
                            jM4299 = ((C2434) c21592.m2943(AbstractC2030.f3794)).f5045;
                        }
                        z4 = false;
                        c21592.m2937(false);
                    }
                    c21592.m2937(z4);
                    ?? r3 = z4;
                    if (c87634 != null) {
                        r3 = c87634.f22313;
                    }
                    long j10 = j9;
                    long j11 = j5;
                    C2865 c28654 = c28653;
                    j6 = j10;
                    int i20 = i15;
                    InterfaceC2962 interfaceC29625 = interfaceC29624;
                    boolean z5 = z3;
                    int i21 = i14;
                    int i22 = i13;
                    AbstractC1821.m2454(str2, interfaceC29625, C2865.m4296(c28654, jM4299, j11, c28222, j8, r3 == true ? 1 : 0, j10, 16609104), null, i20, z5, i21, i22, c21592, (i8 & 126) | 14380032 | ((i8 << 18) & 1879048192), 256);
                    interfaceC29623 = interfaceC29625;
                    c2159 = c21592;
                    z2 = z5;
                    i10 = i20;
                    i12 = i22;
                    c28652 = c28654;
                    i11 = i21;
                    c28223 = c28222;
                    j7 = j8;
                    c87633 = c87634;
                } else {
                    C2159 c21593 = c21592;
                    c21593.m2899();
                    j6 = j4;
                    i10 = i;
                    z2 = z;
                    i11 = i2;
                    i12 = i3;
                    c28652 = c2865;
                    c28223 = c28222;
                    interfaceC29623 = interfaceC29622;
                    j7 = j3;
                    c87633 = c87632;
                    c2159 = c21593;
                }
                c2224M2935 = c2159.m2935();
                if (c2224M2935 != null) {
                    c2224M2935.f4379 = new InterfaceC7383() { // from class: androidx.compose.material3.飘花落叶言子哲楪世苏兰
                        @Override // p068.InterfaceC7383
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iM3031 = AbstractC2202.m3031(i4 | 1);
                            AbstractC2003.m2585(str, interfaceC29623, j, j2, c28223, j7, c87633, j6, i10, z2, i11, i12, c28652, (InterfaceC2208) obj, iM3031, i5);
                            return C6008.f15084;
                        }
                    };
                    return;
                }
                return;
            }
            i18 = 1769472 | i17;
            c28222 = c2822;
            i8 = i18 | 918552576;
            i9 = i5 & 1024;
            if (i9 != 0) {
            }
            int i192 = 1;
            if (c21592.m2903(i8 & 1, ((i8 & 306783379) == 306783378 && (4793491 & (c | 28080)) == 4793490) ? false : true)) {
            }
            c2224M2935 = c2159.m2935();
            if (c2224M2935 != null) {
            }
        }
        interfaceC29622 = interfaceC2962;
        if ((i4 & 384) == 0) {
        }
        int i172 = i6 | 3072;
        if ((i4 & 24576) != 0) {
        }
        int i182 = 196608 | i172;
        i7 = i5 & 64;
        if (i7 != 0) {
        }
        c28222 = c2822;
        i8 = i182 | 918552576;
        i9 = i5 & 1024;
        if (i9 != 0) {
        }
        int i1922 = 1;
        if (c21592.m2903(i8 & 1, ((i8 & 306783379) == 306783378 && (4793491 & (c | 28080)) == 4793490) ? false : true)) {
        }
        c2224M2935 = c2159.m2935();
        if (c2224M2935 != null) {
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final void m2586(C2865 c2865, C2077 c2077, InterfaceC2208 interfaceC2208, int i) {
        C2159 c2159 = (C2159) interfaceC2208;
        c2159.m2951(15327438);
        int i2 = 4;
        int i3 = (c2159.m2920(c2865) ? 4 : 2) | i | (c2159.m2938(c2077) ? 32 : 16);
        if (c2159.m2903(i3 & 1, (i3 & 19) != 18)) {
            AbstractC2225 abstractC2225 = f3699;
            C2865 c28652 = (C2865) c2159.m2943(abstractC2225);
            c28652.getClass();
            if (c2865 != null && !c2865.equals(C2865.f6326)) {
                c28652 = new C2865(c28652.f6329.m4323(c2865.f6329), c28652.f6328.m4357(c2865.f6328));
            }
            AbstractC2202.m3047(abstractC2225.mo2988(c28652), c2077, c2159, (i3 & 112) | 8);
        } else {
            c2159.m2899();
        }
        C2224 c2224M2935 = c2159.m2935();
        if (c2224M2935 != null) {
            c2224M2935.f4379 = new C1898(i, i2, c2865, c2077);
        }
    }
}
