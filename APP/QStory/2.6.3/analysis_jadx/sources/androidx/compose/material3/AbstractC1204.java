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
import io.ktor.util.C4211;
import kotlin.C5176;
import kotlin.jvm.internal.AbstractC4395;
import net.bytebuddy.jar.asm.Opcodes;
import p052.InterfaceC6543;
import p052.InterfaceC6554;
import p052.InterfaceC6558;
import p118.AbstractC7358;

/* JADX INFO: renamed from: androidx.compose.material3.飘花落叶言子苏兰世哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1204 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C0297 f3456;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final float f3457;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final float f3458;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final float f3459;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final float f3460;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final float f3461;

    static {
        float f = AbstractC7358.f19683;
        f3461 = f;
        f3460 = AbstractC7358.f19678;
        f3459 = AbstractC7358.f19677;
        float f2 = AbstractC7358.f19682;
        f3458 = f2;
        f3457 = (f2 - f) / 2.0f;
        f3456 = new C0297();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final void m2033(final InterfaceC2129 interfaceC2129, final boolean z, final boolean z2, final C1208 c1208, final InterfaceC0579 interfaceC0579, final InterfaceC1569 interfaceC1569, InterfaceC1373 interfaceC1373, final int i) {
        int i2;
        long j;
        long j2;
        C0299 c0299;
        C1324 c1324 = (C1324) interfaceC1373;
        c1324.m2391(-670917213);
        if ((i & 6) == 0) {
            i2 = (c1324.m2360(interfaceC2129) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c1324.m2379(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c1324.m2379(z2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= c1324.m2360(c1208) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= c1324.m2378(null) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= c1324.m2360(interfaceC0579) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= c1324.m2360(interfaceC1569) ? 1048576 : Opcodes.ASM8;
        }
        if (c1324.m2343(i2 & 1, (599187 & i2) != 599186)) {
            long j3 = z2 ? z ? c1208.f3473 : c1208.f3469 : z ? c1208.f3484 : c1208.f3475;
            long j4 = z2 ? z ? c1208.f3474 : c1208.f3470 : z ? c1208.f3483 : c1208.f3476;
            InterfaceC1569 interfaceC1569M2032 = AbstractC1202.m2032(AbstractC7358.f19674, c1324);
            float f = AbstractC7358.f19675;
            if (z2) {
                j = j4;
                j2 = z ? c1208.f3472 : c1208.f3480;
            } else {
                j = j4;
                j2 = z ? c1208.f3481 : c1208.f3477;
            }
            InterfaceC2129 interfaceC2129M1980 = AbstractC1072.m1980(interfaceC2129.mo3866(new C1056(f, new C1571(j2), interfaceC1569M2032)), j3, interfaceC1569M2032);
            InterfaceC1658 interfaceC1658M1451 = AbstractC0643.m1451(C2119.f6272, false);
            int iM2488 = AbstractC1367.m2488(c1324);
            C1253 c1253M2381 = c1324.m2381();
            InterfaceC2129 interfaceC2129M3861 = AbstractC2120.m3861(c1324, interfaceC2129M1980);
            InterfaceC1784.f5222.getClass();
            InterfaceC6543 interfaceC6543 = C1765.f5185;
            c1324.m2396();
            if (c1324.f3838) {
                c1324.m2380(interfaceC6543);
            } else {
                c1324.m2390();
            }
            InterfaceC6554 interfaceC6554 = C1765.f5181;
            AbstractC1367.m2472(c1324, interfaceC1658M1451, interfaceC6554);
            InterfaceC6554 interfaceC65542 = C1765.f5182;
            AbstractC1367.m2472(c1324, c1253M2381, interfaceC65542);
            InterfaceC6554 interfaceC65543 = C1765.f5188;
            if (c1324.f3838 || !AbstractC4395.m8907(c1324.m2345(), Integer.valueOf(iM2488))) {
                c1324.m2386(Integer.valueOf(iM2488));
                c1324.m2364(Integer.valueOf(iM2488), interfaceC65543);
            }
            InterfaceC6554 interfaceC65544 = C1765.f5183;
            AbstractC1367.m2472(c1324, interfaceC2129M3861, interfaceC65544);
            InterfaceC2129 interfaceC2129M1450 = C0634.m1450(C2119.f6265);
            MotionSchemeKeyTokens motionSchemeKeyTokens = MotionSchemeKeyTokens.FastSpatial;
            C1147 c1147 = (C1147) c1324.m2383(AbstractC1161.f3321);
            switch (AbstractC1146.f3285[motionSchemeKeyTokens.ordinal()]) {
                case 1:
                    c1147.getClass();
                    c0299 = C1147.f3290;
                    c0299.getClass();
                    break;
                case 2:
                    c1147.getClass();
                    c0299 = C1147.f3289;
                    c0299.getClass();
                    break;
                case 3:
                    c1147.getClass();
                    c0299 = C1147.f3288;
                    c0299.getClass();
                    break;
                case 4:
                    c1147.getClass();
                    c0299 = C1147.f3287;
                    c0299.getClass();
                    break;
                case 5:
                    c1147.getClass();
                    c0299 = C1147.f3286;
                    c0299.getClass();
                    break;
                case 6:
                    c1147.getClass();
                    c0299 = C1147.f3292;
                    c0299.getClass();
                    break;
                default:
                    C4211.m8611();
                    return;
            }
            InterfaceC2129 interfaceC2129M19802 = AbstractC1072.m1980(AbstractC1092.m2004(interfaceC2129M1450.mo3866(new C1172(interfaceC0579, z, c0299)), interfaceC0579, AbstractC1142.m2018(AbstractC7358.f19681 / 2.0f, 4)), j, interfaceC1569);
            InterfaceC1658 interfaceC1658M14512 = AbstractC0643.m1451(C2119.f6264, false);
            int iM24882 = AbstractC1367.m2488(c1324);
            C1253 c1253M23812 = c1324.m2381();
            InterfaceC2129 interfaceC2129M38612 = AbstractC2120.m3861(c1324, interfaceC2129M19802);
            c1324.m2396();
            if (c1324.f3838) {
                c1324.m2380(interfaceC6543);
            } else {
                c1324.m2390();
            }
            AbstractC1367.m2472(c1324, interfaceC1658M14512, interfaceC6554);
            AbstractC1367.m2472(c1324, c1253M23812, interfaceC65542);
            if (c1324.f3838 || !AbstractC4395.m8907(c1324.m2345(), Integer.valueOf(iM24882))) {
                c1324.m2386(Integer.valueOf(iM24882));
                c1324.m2364(Integer.valueOf(iM24882), interfaceC65543);
            }
            AbstractC1367.m2472(c1324, interfaceC2129M38612, interfaceC65544);
            c1324.m2392(1236071411);
            c1324.m2377(false);
            c1324.m2377(true);
            c1324.m2377(true);
        } else {
            c1324.m2339();
        }
        C1389 c1389M2375 = c1324.m2375();
        if (c1389M2375 != null) {
            c1389M2375.f4034 = new InterfaceC6554() { // from class: androidx.compose.material3.飘花落叶言子苏兰世楪哲
                @Override // p052.InterfaceC6554
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    AbstractC1204.m2033(interfaceC2129, z, z2, c1208, interfaceC0579, interfaceC1569, (InterfaceC1373) obj, AbstractC1367.m2471(i | 1));
                    return C5176.f14739;
                }
            };
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final void m2034(final boolean z, final InterfaceC6558 interfaceC6558, InterfaceC2129 interfaceC2129, boolean z2, final C1208 c1208, InterfaceC1373 interfaceC1373, final int i) {
        final InterfaceC2129 interfaceC21292;
        final boolean z3;
        boolean z4;
        InterfaceC2129 interfaceC21293;
        boolean z5;
        C1324 c1324 = (C1324) interfaceC1373;
        c1324.m2391(-263339167);
        int i2 = i | (c1324.m2379(z) ? 4 : 2) | (c1324.m2378(interfaceC6558) ? 32 : 16) | 28032 | (c1324.m2360(c1208) ? 131072 : 65536) | 1572864;
        if (c1324.m2343(i2 & 1, (599187 & i2) != 599186)) {
            c1324.m2341();
            int i3 = i & 1;
            InterfaceC2129 interfaceC2129M1580 = C2125.f6276;
            if (i3 == 0 || c1324.m2353()) {
                z4 = true;
                interfaceC21293 = interfaceC2129M1580;
            } else {
                c1324.m2339();
                interfaceC21293 = interfaceC2129;
                z4 = z2;
            }
            c1324.m2374();
            c1324.m2392(1768604058);
            Object objM2345 = c1324.m2345();
            if (objM2345 == C1369.f3974) {
                objM2345 = new C0573();
                c1324.m2386(objM2345);
            }
            InterfaceC0580 interfaceC0580 = (InterfaceC0580) objM2345;
            c1324.m2377(false);
            if (interfaceC6558 != null) {
                C1697 c1697 = AbstractC1151.f3312;
                boolean z6 = z4;
                interfaceC2129M1580 = AbstractC0779.m1580(C1160.f3320, z, interfaceC0580, z6, new C1954(2), interfaceC6558);
                z5 = z6;
            } else {
                z5 = z4;
            }
            m2033(AbstractC0619.m1381(AbstractC0619.m1387(interfaceC21293.mo3866(interfaceC2129M1580)), f3459, f3458), z, z5, c1208, interfaceC0580, AbstractC1202.m2032(AbstractC7358.f19680, c1324), c1324, ((i2 << 3) & 112) | 384 | ((i2 >> 6) & 7168) | 24576);
            z3 = z5;
            interfaceC21292 = interfaceC21293;
        } else {
            c1324.m2339();
            interfaceC21292 = interfaceC2129;
            z3 = z2;
        }
        C1389 c1389M2375 = c1324.m2375();
        if (c1389M2375 != null) {
            c1389M2375.f4034 = new InterfaceC6554(z, interfaceC6558, interfaceC21292, z3, c1208, i) { // from class: androidx.compose.material3.飘花落叶言子苏兰楪哲世

                /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
                public final /* synthetic */ C1208 f3485;

                /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
                public final /* synthetic */ boolean f3486;

                /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
                public final /* synthetic */ InterfaceC6558 f3487;

                /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
                public final /* synthetic */ InterfaceC2129 f3488;

                /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
                public final /* synthetic */ boolean f3489;

                @Override // p052.InterfaceC6554
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM2471 = AbstractC1367.m2471(1);
                    AbstractC1204.m2034(this.f3489, this.f3487, this.f3488, this.f3486, this.f3485, (InterfaceC1373) obj, iM2471);
                    return C5176.f14739;
                }
            };
        }
    }
}
