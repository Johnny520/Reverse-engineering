package androidx.compose.material3;

import androidx.compose.animation.core.C0297;
import androidx.compose.animation.core.C0299;
import androidx.compose.foundation.AbstractC1072;
import androidx.compose.foundation.AbstractC1092;
import androidx.compose.foundation.C1056;
import androidx.compose.foundation.interaction.C0573;
import androidx.compose.foundation.interaction.InterfaceC0579;
import androidx.compose.foundation.interaction.InterfaceC0580;
import androidx.compose.foundation.layout.AbstractC0619;
import androidx.compose.foundation.layout.AbstractC0643;
import androidx.compose.foundation.layout.C0634;
import androidx.compose.foundation.selection.AbstractC0779;
import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.C1324;
import androidx.compose.runtime.C1369;
import androidx.compose.runtime.C1389;
import androidx.compose.runtime.InterfaceC1373;
import androidx.compose.runtime.internal.C1253;
import androidx.compose.ui.AbstractC2120;
import androidx.compose.ui.C2119;
import androidx.compose.ui.C2125;
import androidx.compose.ui.InterfaceC2129;
import androidx.compose.ui.graphics.C1571;
import androidx.compose.ui.graphics.InterfaceC1569;
import androidx.compose.ui.layout.C1697;
import androidx.compose.ui.layout.InterfaceC1658;
import androidx.compose.ui.node.C1765;
import androidx.compose.ui.node.InterfaceC1784;
import androidx.compose.ui.semantics.C1954;
import io.ktor.util.C4210;
import kotlin.C5175;
import kotlin.jvm.internal.AbstractC4394;
import net.bytebuddy.jar.asm.Opcodes;
import p052.InterfaceC6542;
import p052.InterfaceC6553;
import p052.InterfaceC6557;
import p118.AbstractC7357;

/* JADX INFO: renamed from: androidx.compose.material3.飘花落叶言子苏兰世哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1204 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C0297 f3455;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final float f3456;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final float f3457;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final float f3458;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final float f3459;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final float f3460;

    static {
        float f = AbstractC7357.f19688;
        f3460 = f;
        f3459 = AbstractC7357.f19683;
        f3458 = AbstractC7357.f19682;
        float f2 = AbstractC7357.f19687;
        f3457 = f2;
        f3456 = (f2 - f) / 2.0f;
        f3455 = new C0297();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final void m2023(final InterfaceC2129 interfaceC2129, final boolean z, final boolean z2, final C1208 c1208, final InterfaceC0579 interfaceC0579, final InterfaceC1569 interfaceC1569, InterfaceC1373 interfaceC1373, final int i) {
        int i2;
        long j;
        long j2;
        C0299 c0299;
        C1324 c1324 = (C1324) interfaceC1373;
        c1324.m2381(-670917213);
        if ((i & 6) == 0) {
            i2 = (c1324.m2350(interfaceC2129) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c1324.m2369(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c1324.m2369(z2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= c1324.m2350(c1208) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= c1324.m2368(null) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= c1324.m2350(interfaceC0579) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= c1324.m2350(interfaceC1569) ? 1048576 : Opcodes.ASM8;
        }
        if (c1324.m2333(i2 & 1, (599187 & i2) != 599186)) {
            long j3 = z2 ? z ? c1208.f3472 : c1208.f3468 : z ? c1208.f3483 : c1208.f3474;
            long j4 = z2 ? z ? c1208.f3473 : c1208.f3469 : z ? c1208.f3482 : c1208.f3475;
            InterfaceC1569 interfaceC1569M2022 = AbstractC1202.m2022(AbstractC7357.f19679, c1324);
            float f = AbstractC7357.f19680;
            if (z2) {
                j = j4;
                j2 = z ? c1208.f3471 : c1208.f3479;
            } else {
                j = j4;
                j2 = z ? c1208.f3480 : c1208.f3476;
            }
            InterfaceC2129 interfaceC2129M1970 = AbstractC1072.m1970(interfaceC2129.mo3856(new C1056(f, new C1571(j2), interfaceC1569M2022)), j3, interfaceC1569M2022);
            InterfaceC1658 interfaceC1658M1441 = AbstractC0643.m1441(C2119.f6271, false);
            int iM2479 = AbstractC1367.m2479(c1324);
            C1253 c1253M2371 = c1324.m2371();
            InterfaceC2129 interfaceC2129M3851 = AbstractC2120.m3851(c1324, interfaceC2129M1970);
            InterfaceC1784.f5221.getClass();
            InterfaceC6542 interfaceC6542 = C1765.f5184;
            c1324.m2386();
            if (c1324.f3837) {
                c1324.m2370(interfaceC6542);
            } else {
                c1324.m2380();
            }
            InterfaceC6553 interfaceC6553 = C1765.f5180;
            AbstractC1367.m2464(c1324, interfaceC1658M1441, interfaceC6553);
            InterfaceC6553 interfaceC65532 = C1765.f5181;
            AbstractC1367.m2464(c1324, c1253M2371, interfaceC65532);
            InterfaceC6553 interfaceC65533 = C1765.f5187;
            if (c1324.f3837 || !AbstractC4394.m8917(c1324.m2335(), Integer.valueOf(iM2479))) {
                c1324.m2376(Integer.valueOf(iM2479));
                c1324.m2354(Integer.valueOf(iM2479), interfaceC65533);
            }
            InterfaceC6553 interfaceC65534 = C1765.f5182;
            AbstractC1367.m2464(c1324, interfaceC2129M3851, interfaceC65534);
            InterfaceC2129 interfaceC2129M1440 = C0634.m1440(C2119.f6264);
            MotionSchemeKeyTokens motionSchemeKeyTokens = MotionSchemeKeyTokens.FastSpatial;
            C1147 c1147 = (C1147) c1324.m2373(AbstractC1161.f3320);
            switch (AbstractC1146.f3284[motionSchemeKeyTokens.ordinal()]) {
                case 1:
                    c1147.getClass();
                    c0299 = C1147.f3289;
                    c0299.getClass();
                    break;
                case 2:
                    c1147.getClass();
                    c0299 = C1147.f3288;
                    c0299.getClass();
                    break;
                case 3:
                    c1147.getClass();
                    c0299 = C1147.f3287;
                    c0299.getClass();
                    break;
                case 4:
                    c1147.getClass();
                    c0299 = C1147.f3286;
                    c0299.getClass();
                    break;
                case 5:
                    c1147.getClass();
                    c0299 = C1147.f3285;
                    c0299.getClass();
                    break;
                case 6:
                    c1147.getClass();
                    c0299 = C1147.f3291;
                    c0299.getClass();
                    break;
                default:
                    C4210.m8621();
                    return;
            }
            InterfaceC2129 interfaceC2129M19702 = AbstractC1072.m1970(AbstractC1092.m1994(interfaceC2129M1440.mo3856(new C1172(interfaceC0579, z, c0299)), interfaceC0579, AbstractC1142.m2008(AbstractC7357.f19686 / 2.0f, 4)), j, interfaceC1569);
            InterfaceC1658 interfaceC1658M14412 = AbstractC0643.m1441(C2119.f6263, false);
            int iM24792 = AbstractC1367.m2479(c1324);
            C1253 c1253M23712 = c1324.m2371();
            InterfaceC2129 interfaceC2129M38512 = AbstractC2120.m3851(c1324, interfaceC2129M19702);
            c1324.m2386();
            if (c1324.f3837) {
                c1324.m2370(interfaceC6542);
            } else {
                c1324.m2380();
            }
            AbstractC1367.m2464(c1324, interfaceC1658M14412, interfaceC6553);
            AbstractC1367.m2464(c1324, c1253M23712, interfaceC65532);
            if (c1324.f3837 || !AbstractC4394.m8917(c1324.m2335(), Integer.valueOf(iM24792))) {
                c1324.m2376(Integer.valueOf(iM24792));
                c1324.m2354(Integer.valueOf(iM24792), interfaceC65533);
            }
            AbstractC1367.m2464(c1324, interfaceC2129M38512, interfaceC65534);
            c1324.m2382(1236071411);
            c1324.m2367(false);
            c1324.m2367(true);
            c1324.m2367(true);
        } else {
            c1324.m2329();
        }
        C1389 c1389M2365 = c1324.m2365();
        if (c1389M2365 != null) {
            c1389M2365.f4033 = new InterfaceC6553() { // from class: androidx.compose.material3.飘花落叶言子苏兰世楪哲
                @Override // p052.InterfaceC6553
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    AbstractC1204.m2023(interfaceC2129, z, z2, c1208, interfaceC0579, interfaceC1569, (InterfaceC1373) obj, AbstractC1367.m2460(i | 1));
                    return C5175.f14739;
                }
            };
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final void m2024(final boolean z, final InterfaceC6557 interfaceC6557, InterfaceC2129 interfaceC2129, boolean z2, final C1208 c1208, InterfaceC1373 interfaceC1373, final int i) {
        final InterfaceC2129 interfaceC21292;
        final boolean z3;
        boolean z4;
        InterfaceC2129 interfaceC21293;
        boolean z5;
        C1324 c1324 = (C1324) interfaceC1373;
        c1324.m2381(-263339167);
        int i2 = i | (c1324.m2369(z) ? 4 : 2) | (c1324.m2368(interfaceC6557) ? 32 : 16) | 28032 | (c1324.m2350(c1208) ? 131072 : 65536) | 1572864;
        if (c1324.m2333(i2 & 1, (599187 & i2) != 599186)) {
            c1324.m2331();
            int i3 = i & 1;
            InterfaceC2129 interfaceC2129M1570 = C2125.f6275;
            if (i3 == 0 || c1324.m2343()) {
                z4 = true;
                interfaceC21293 = interfaceC2129M1570;
            } else {
                c1324.m2329();
                interfaceC21293 = interfaceC2129;
                z4 = z2;
            }
            c1324.m2364();
            c1324.m2382(1768604058);
            Object objM2335 = c1324.m2335();
            if (objM2335 == C1369.f3973) {
                objM2335 = new C0573();
                c1324.m2376(objM2335);
            }
            InterfaceC0580 interfaceC0580 = (InterfaceC0580) objM2335;
            c1324.m2367(false);
            if (interfaceC6557 != null) {
                C1697 c1697 = AbstractC1151.f3311;
                boolean z6 = z4;
                interfaceC2129M1570 = AbstractC0779.m1570(C1160.f3319, z, interfaceC0580, z6, new C1954(2), interfaceC6557);
                z5 = z6;
            } else {
                z5 = z4;
            }
            m2023(AbstractC0619.m1371(AbstractC0619.m1377(interfaceC21293.mo3856(interfaceC2129M1570)), f3458, f3457), z, z5, c1208, interfaceC0580, AbstractC1202.m2022(AbstractC7357.f19685, c1324), c1324, ((i2 << 3) & 112) | 384 | ((i2 >> 6) & 7168) | 24576);
            z3 = z5;
            interfaceC21292 = interfaceC21293;
        } else {
            c1324.m2329();
            interfaceC21292 = interfaceC2129;
            z3 = z2;
        }
        C1389 c1389M2365 = c1324.m2365();
        if (c1389M2365 != null) {
            c1389M2365.f4033 = new InterfaceC6553(z, interfaceC6557, interfaceC21292, z3, c1208, i) { // from class: androidx.compose.material3.飘花落叶言子苏兰楪哲世

                /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
                public final /* synthetic */ C1208 f3484;

                /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
                public final /* synthetic */ boolean f3485;

                /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
                public final /* synthetic */ InterfaceC6557 f3486;

                /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
                public final /* synthetic */ InterfaceC2129 f3487;

                /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
                public final /* synthetic */ boolean f3488;

                @Override // p052.InterfaceC6553
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM2460 = AbstractC1367.m2460(1);
                    AbstractC1204.m2024(this.f3488, this.f3486, this.f3487, this.f3485, this.f3484, (InterfaceC1373) obj, iM2460);
                    return C5175.f14739;
                }
            };
        }
    }
}
