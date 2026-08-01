package p000A;

import android.content.Context;
import android.os.Build;
import android.view.KeyEvent;
import androidx.compose.p134ui.input.pointer.PointerInputEventHandler;
import com.bumptech.glide.AbstractC1922d;
import com.bumptech.glide.AbstractC1923e;
import com.bumptech.glide.AbstractC1926h;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;
import p007B0.AbstractC0181N;
import p007B0.C0180M;
import p007B0.C0187a;
import p007B0.C0203q;
import p007B0.InterfaceC0206t;
import p027E4.C0330q;
import p028F.AbstractC0350k;
import p028F.C0352m;
import p029F0.AbstractC0389a0;
import p029F0.AbstractC0435z;
import p029F0.C0363A;
import p029F0.InterfaceC0377O;
import p029F0.InterfaceC0430v;
import p034G.AbstractC0464i;
import p041H0.C0551B;
import p041H0.C0591f;
import p041H0.InterfaceC0593g;
import p046I.AbstractC0655b;
import p047I0.AbstractC0691Q;
import p047I0.AbstractC0757q0;
import p047I0.C0662B0;
import p047I0.C0761s0;
import p047I0.InterfaceC0686N0;
import p047I0.InterfaceC0703W0;
import p047I0.InterfaceC0744l0;
import p051J.AbstractC0825q;
import p051J.AbstractC0828t;
import p051J.C0811c;
import p051J.C0813e;
import p051J.C0827s;
import p054K.C0870e;
import p056K2.C0891q;
import p058L.AbstractC0908J;
import p058L.AbstractC0933e0;
import p058L.AbstractC0945q;
import p058L.C0912N;
import p058L.C0913O;
import p058L.C0914P;
import p058L.C0915Q;
import p058L.C0918U;
import p058L.C0920W;
import p058L.C0929c0;
import p058L.C0931d0;
import p058L.C0943o;
import p058L.EnumC0947s;
import p058L.InterfaceC0940l;
import p061L2.C0981u;
import p074O2.InterfaceC1046d;
import p074O2.InterfaceC1051i;
import p077P0.AbstractC1126m;
import p092S0.AbstractC1251D;
import p092S0.C1252E;
import p092S0.C1257J;
import p092S0.C1259L;
import p092S0.C1260M;
import p092S0.C1265c;
import p092S0.C1266d;
import p092S0.C1269g;
import p095T.AbstractC1385s;
import p095T.C1341U0;
import p095T.C1357e;
import p095T.C1366i0;
import p095T.C1371l;
import p095T.C1383r;
import p095T.C1388t0;
import p095T.InterfaceC1339T0;
import p095T.InterfaceC1347Y;
import p095T.InterfaceC1373m;
import p095T.InterfaceC1378o0;
import p110W0.AbstractC1592q;
import p110W0.C1581f;
import p110W0.C1585j;
import p110W0.C1586k;
import p110W0.C1587l;
import p110W0.InterfaceC1580e;
import p112W2.InterfaceC1599a;
import p112W2.InterfaceC1601c;
import p112W2.InterfaceC1603e;
import p112W2.InterfaceC1604f;
import p115X0.C1623A;
import p115X0.C1624B;
import p115X0.C1633h;
import p115X0.C1636k;
import p115X0.C1646u;
import p115X0.C1647v;
import p115X0.InterfaceC1641p;
import p117X2.AbstractC1665j;
import p117X2.C1663h;
import p117X2.C1675t;
import p125Z0.C1781b;
import p127Z2.AbstractC1784a;
import p128a.AbstractC1785a;
import p136b0.AbstractC1848j;
import p136b0.C1843e;
import p147d1.C1951a;
import p147d1.C1962l;
import p147d1.C1966p;
import p147d1.EnumC1960j;
import p152e0.AbstractC2004k;
import p153e1.C2010f;
import p153e1.C2016l;
import p153e1.EnumC2017m;
import p153e1.InterfaceC2007c;
import p154e2.C2029h;
import p158f0.AbstractC2074f;
import p158f0.AbstractC2086r;
import p160f3.AbstractC2162v;
import p160f3.InterfaceC2160t;
import p169h0.AbstractC2192a;
import p169h0.C2194c;
import p169h0.C2202k;
import p169h0.C2204m;
import p169h0.InterfaceC2207p;
import p193l0.AbstractC2485h;
import p198m0.AbstractC2573d;
import p198m0.C2590u;
import p198m0.EnumC2594y;
import p198m0.InterfaceC2581l;
import p204n0.C2683b;
import p204n0.C2684c;
import p211o0.AbstractC2758q;
import p211o0.AbstractC2767z;
import p211o0.C2737L;
import p211o0.C2740O;
import p211o0.C2762u;
import p216p.AbstractC2823P;
import p216p.AbstractC2856m;
import p227r.EnumC2983d0;
import p238t.AbstractC3204b;
import p244u.AbstractC3261c;
import p244u.AbstractC3282o;
import p256w0.InterfaceC3388a;
import p266y.AbstractC3474d;
import p266y.C3473c;
import p273z0.AbstractC3510c;

/* JADX INFO: renamed from: A.k0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0070k0 {

    /* JADX INFO: renamed from: a */
    public static final C0062g0 f302a = new C0062g0(1);

    /* JADX INFO: renamed from: b */
    public static final C0187a f303b = new C0187a(1022);

    /* JADX INFO: renamed from: c */
    public static final C0042V0 f304c = new C0042V0(0, 0);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01df A[Catch: RejectedExecutionException -> 0x01be, TryCatch #0 {RejectedExecutionException -> 0x01be, blocks: (B:132:0x01b7, B:140:0x01cd, B:142:0x01df, B:148:0x01ec, B:150:0x01fe, B:154:0x020a, B:144:0x01e5, B:136:0x01c6), top: B:179:0x01b7 }] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01e5 A[Catch: RejectedExecutionException -> 0x01be, TryCatch #0 {RejectedExecutionException -> 0x01be, blocks: (B:132:0x01b7, B:140:0x01cd, B:142:0x01df, B:148:0x01ec, B:150:0x01fe, B:154:0x020a, B:144:0x01e5, B:136:0x01c6), top: B:179:0x01b7 }] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01fe A[Catch: RejectedExecutionException -> 0x01be, TryCatch #0 {RejectedExecutionException -> 0x01be, blocks: (B:132:0x01b7, B:140:0x01cd, B:142:0x01df, B:148:0x01ec, B:150:0x01fe, B:154:0x020a, B:144:0x01e5, B:136:0x01c6), top: B:179:0x01b7 }] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x020a A[Catch: RejectedExecutionException -> 0x01be, TRY_LEAVE, TryCatch #0 {RejectedExecutionException -> 0x01be, blocks: (B:132:0x01b7, B:140:0x01cd, B:142:0x01df, B:148:0x01ec, B:150:0x01fe, B:154:0x020a, B:144:0x01e5, B:136:0x01c6), top: B:179:0x01b7 }] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:185:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x011b  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m74a(final String str, InterfaceC2207p interfaceC2207p, final C1260M c1260m, int i5, boolean z5, int i6, int i7, InterfaceC1373m interfaceC1373m, final int i8, final int i9) {
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z6;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        final InterfaceC2207p interfaceC2207p2;
        final int i19;
        final int i20;
        final int i21;
        final boolean z7;
        C1388t0 c1388t0M2599r;
        InterfaceC2207p interfaceC2207p3;
        int i22;
        boolean z8;
        InterfaceC1580e interfaceC1580e;
        boolean z9;
        boolean zM2578d;
        Object objM2558L;
        C1383r c1383r = (C1383r) interfaceC1373m;
        c1383r.m2569X(-1040751001);
        if ((i8 & 6) == 0) {
            i10 = (c1383r.m2582f(str) ? 4 : 2) | i8;
        } else {
            i10 = i8;
        }
        int i23 = i9 & 2;
        if (i23 != 0) {
            i10 |= 48;
        } else {
            if ((i8 & 48) == 0) {
                i10 |= c1383r.m2582f(interfaceC2207p) ? 32 : 16;
            }
            if ((i8 & 384) == 0) {
                i10 |= c1383r.m2582f(c1260m) ? 256 : 128;
            }
            if ((i9 & 8) == 0) {
                i10 |= 3072;
            } else if ((i8 & 3072) == 0) {
                i10 |= c1383r.m2586h(null) ? 2048 : 1024;
            }
            i11 = i9 & 16;
            if (i11 == 0) {
                i10 |= 24576;
            } else {
                if ((i8 & 24576) == 0) {
                    i12 = i5;
                    i10 |= c1383r.m2578d(i12) ? 16384 : 8192;
                }
                i13 = i9 & 32;
                if (i13 == 0) {
                    if ((196608 & i8) == 0) {
                        z6 = z5;
                        i10 |= c1383r.m2584g(z6) ? 131072 : 65536;
                    }
                    i14 = i9 & 64;
                    if (i14 == 0) {
                        i10 |= 1572864;
                        i15 = i6;
                    } else {
                        i15 = i6;
                        if ((i8 & 1572864) == 0) {
                            i10 |= c1383r.m2578d(i15) ? 1048576 : 524288;
                        }
                    }
                    i16 = i9 & 128;
                    if (i16 == 0) {
                        i10 |= 12582912;
                        i17 = i7;
                    } else {
                        i17 = i7;
                        if ((i8 & 12582912) == 0) {
                            i10 |= c1383r.m2578d(i17) ? 8388608 : 4194304;
                        }
                    }
                    i18 = i10 | 100663296;
                    int i24 = i10;
                    if ((i9 & 512) == 0) {
                        i18 = i24 | 905969664;
                    } else if ((805306368 & i8) == 0) {
                        i18 |= (1073741824 & i8) == 0 ? c1383r.m2582f(null) : c1383r.m2586h(null) ? 536870912 : 268435456;
                    }
                    if (c1383r.m2560O(i18 & 1, (i18 & 306783379) == 306783378)) {
                        c1383r.m2563R();
                        interfaceC2207p2 = interfaceC2207p;
                        i19 = i15;
                        i20 = i17;
                        i21 = i12;
                        z7 = z6;
                    } else {
                        InterfaceC2207p interfaceC2207p4 = i23 != 0 ? C2204m.f7185a : interfaceC2207p;
                        if (i11 != 0) {
                            i12 = 1;
                        }
                        if (i13 != 0) {
                            z6 = true;
                        }
                        int i25 = i14 != 0 ? Integer.MAX_VALUE : i15;
                        if (i16 != 0) {
                            i17 = 1;
                        }
                        m91r(i17, i25);
                        if (c1383r.m2590j(AbstractC0908J.f2824a) != null) {
                            throw new ClassCastException();
                        }
                        c1383r.m2568W(356914239);
                        c1383r.m2597p(false);
                        InterfaceC1580e interfaceC1580e2 = (InterfaceC1580e) c1383r.m2590j(AbstractC0757q0.f2361k);
                        int i26 = (i18 & 14) | ((i18 >> 3) & 112);
                        Executor executor = (Executor) c1383r.m2590j(AbstractC0085s.f387a);
                        if (executor != null) {
                            int length = str.length();
                            if (Build.VERSION.SDK_INT >= 28 && length >= 8 && length < 1000) {
                                if (AbstractC0085s.f388b == null) {
                                    AbstractC0085s.f388b = Boolean.valueOf(Runtime.getRuntime().availableProcessors() >= 4);
                                }
                                Boolean bool = AbstractC0085s.f388b;
                                AbstractC1665j.m2982b(bool);
                                if (bool.booleanValue()) {
                                    c1383r.m2568W(1254274527);
                                    EnumC2017m enumC2017m = (EnumC2017m) c1383r.m2590j(AbstractC0757q0.f2364n);
                                    InterfaceC2007c interfaceC2007c = (InterfaceC2007c) c1383r.m2590j(AbstractC0757q0.f2358h);
                                    InterfaceC2207p interfaceC2207p5 = interfaceC2207p4;
                                    if (((i26 & 112) ^ 48) > 32) {
                                        try {
                                        } catch (RejectedExecutionException unused) {
                                            interfaceC2207p3 = interfaceC2207p5;
                                            interfaceC1580e = interfaceC1580e2;
                                            i22 = i25;
                                            z8 = false;
                                        }
                                        if (!c1383r.m2582f(c1260m)) {
                                            if ((i26 & 48) != 32) {
                                                z9 = false;
                                            }
                                            zM2578d = z9 | c1383r.m2578d(enumC2017m.ordinal()) | ((((i26 & 14) ^ 6) > 4 && c1383r.m2582f(str)) || (i26 & 6) == 4) | c1383r.m2582f(interfaceC2007c) | c1383r.m2586h(interfaceC1580e2);
                                            objM2558L = c1383r.m2558L();
                                            if (zM2578d || objM2558L == C1371l.f4833a) {
                                                interfaceC2207p3 = interfaceC2207p5;
                                                i22 = i25;
                                                z8 = false;
                                                try {
                                                    RunnableC0083r runnableC0083r = new RunnableC0083r(c1260m, enumC2017m, str, interfaceC2007c, interfaceC1580e2, 0);
                                                    interfaceC1580e = interfaceC1580e2;
                                                    try {
                                                        c1383r.m2585g0(runnableC0083r);
                                                        objM2558L = runnableC0083r;
                                                    } catch (RejectedExecutionException unused2) {
                                                    }
                                                } catch (RejectedExecutionException unused3) {
                                                    interfaceC1580e = interfaceC1580e2;
                                                }
                                            } else {
                                                interfaceC2207p3 = interfaceC2207p5;
                                                interfaceC1580e = interfaceC1580e2;
                                                i22 = i25;
                                                z8 = false;
                                            }
                                            executor.execute((Runnable) objM2558L);
                                            c1383r.m2597p(z8);
                                            c1383r.m2568W(357875859);
                                            c1383r.m2597p(z8);
                                            i20 = i17;
                                            i21 = i12;
                                            z7 = z6;
                                            i19 = i22;
                                            InterfaceC2207p interfaceC2207pMo4021c = interfaceC2207p3.mo4021c(new C0870e(str, c1260m, interfaceC1580e, i21, z7, i19, i20));
                                            int iHashCode = Long.hashCode(c1383r.f4882T);
                                            InterfaceC2207p interfaceC2207pM4016c = AbstractC2192a.m4016c(c1383r, interfaceC2207pMo4021c);
                                            InterfaceC1378o0 interfaceC1378o0M2593l = c1383r.m2593l();
                                            InterfaceC0593g.f1909a.getClass();
                                            C0551B c0551b = C0591f.f1902b;
                                            c1383r.m2571Z();
                                            if (c1383r.f4881S) {
                                                c1383r.m2592k(c0551b);
                                            } else {
                                                c1383r.m2591j0();
                                            }
                                            AbstractC1385s.m2635y(c1383r, C0591f.f1905e, C0048Z.f200a);
                                            AbstractC1385s.m2635y(c1383r, C0591f.f1904d, interfaceC1378o0M2593l);
                                            AbstractC1385s.m2631u(c1383r, C0591f.f1907g);
                                            AbstractC1385s.m2635y(c1383r, C0591f.f1903c, interfaceC2207pM4016c);
                                            AbstractC1385s.m2627q(c1383r, Integer.valueOf(iHashCode), C0591f.f1906f);
                                            c1383r.m2597p(true);
                                            interfaceC2207p2 = interfaceC2207p3;
                                        }
                                        z9 = true;
                                        if (((i26 & 14) ^ 6) > 4) {
                                            zM2578d = z9 | c1383r.m2578d(enumC2017m.ordinal()) | ((((i26 & 14) ^ 6) > 4 && c1383r.m2582f(str)) || (i26 & 6) == 4) | c1383r.m2582f(interfaceC2007c) | c1383r.m2586h(interfaceC1580e2);
                                            objM2558L = c1383r.m2558L();
                                            if (zM2578d) {
                                                interfaceC2207p3 = interfaceC2207p5;
                                                i22 = i25;
                                                z8 = false;
                                                RunnableC0083r runnableC0083r2 = new RunnableC0083r(c1260m, enumC2017m, str, interfaceC2007c, interfaceC1580e2, 0);
                                                interfaceC1580e = interfaceC1580e2;
                                                c1383r.m2585g0(runnableC0083r2);
                                                objM2558L = runnableC0083r2;
                                                executor.execute((Runnable) objM2558L);
                                                c1383r.m2597p(z8);
                                                c1383r.m2568W(357875859);
                                                c1383r.m2597p(z8);
                                                i20 = i17;
                                                i21 = i12;
                                                z7 = z6;
                                                i19 = i22;
                                                InterfaceC2207p interfaceC2207pMo4021c2 = interfaceC2207p3.mo4021c(new C0870e(str, c1260m, interfaceC1580e, i21, z7, i19, i20));
                                                int iHashCode2 = Long.hashCode(c1383r.f4882T);
                                                InterfaceC2207p interfaceC2207pM4016c2 = AbstractC2192a.m4016c(c1383r, interfaceC2207pMo4021c2);
                                                InterfaceC1378o0 interfaceC1378o0M2593l2 = c1383r.m2593l();
                                                InterfaceC0593g.f1909a.getClass();
                                                C0551B c0551b2 = C0591f.f1902b;
                                                c1383r.m2571Z();
                                                if (c1383r.f4881S) {
                                                }
                                                AbstractC1385s.m2635y(c1383r, C0591f.f1905e, C0048Z.f200a);
                                                AbstractC1385s.m2635y(c1383r, C0591f.f1904d, interfaceC1378o0M2593l2);
                                                AbstractC1385s.m2631u(c1383r, C0591f.f1907g);
                                                AbstractC1385s.m2635y(c1383r, C0591f.f1903c, interfaceC2207pM4016c2);
                                                AbstractC1385s.m2627q(c1383r, Integer.valueOf(iHashCode2), C0591f.f1906f);
                                                c1383r.m2597p(true);
                                                interfaceC2207p2 = interfaceC2207p3;
                                            }
                                        } else {
                                            zM2578d = z9 | c1383r.m2578d(enumC2017m.ordinal()) | ((((i26 & 14) ^ 6) > 4 && c1383r.m2582f(str)) || (i26 & 6) == 4) | c1383r.m2582f(interfaceC2007c) | c1383r.m2586h(interfaceC1580e2);
                                            objM2558L = c1383r.m2558L();
                                            if (zM2578d) {
                                            }
                                        }
                                    } else {
                                        if ((i26 & 48) != 32) {
                                            z9 = true;
                                        }
                                    }
                                }
                            }
                            interfaceC2207p3 = interfaceC2207p4;
                            interfaceC1580e = interfaceC1580e2;
                            i22 = i25;
                            z8 = false;
                        } else {
                            interfaceC2207p3 = interfaceC2207p4;
                            i22 = i25;
                            z8 = false;
                            interfaceC1580e = interfaceC1580e2;
                        }
                        c1383r.m2568W(1250991751);
                        c1383r.m2597p(z8);
                        c1383r.m2568W(357875859);
                        c1383r.m2597p(z8);
                        i20 = i17;
                        i21 = i12;
                        z7 = z6;
                        i19 = i22;
                        InterfaceC2207p interfaceC2207pMo4021c22 = interfaceC2207p3.mo4021c(new C0870e(str, c1260m, interfaceC1580e, i21, z7, i19, i20));
                        int iHashCode22 = Long.hashCode(c1383r.f4882T);
                        InterfaceC2207p interfaceC2207pM4016c22 = AbstractC2192a.m4016c(c1383r, interfaceC2207pMo4021c22);
                        InterfaceC1378o0 interfaceC1378o0M2593l22 = c1383r.m2593l();
                        InterfaceC0593g.f1909a.getClass();
                        C0551B c0551b22 = C0591f.f1902b;
                        c1383r.m2571Z();
                        if (c1383r.f4881S) {
                        }
                        AbstractC1385s.m2635y(c1383r, C0591f.f1905e, C0048Z.f200a);
                        AbstractC1385s.m2635y(c1383r, C0591f.f1904d, interfaceC1378o0M2593l22);
                        AbstractC1385s.m2631u(c1383r, C0591f.f1907g);
                        AbstractC1385s.m2635y(c1383r, C0591f.f1903c, interfaceC2207pM4016c22);
                        AbstractC1385s.m2627q(c1383r, Integer.valueOf(iHashCode22), C0591f.f1906f);
                        c1383r.m2597p(true);
                        interfaceC2207p2 = interfaceC2207p3;
                    }
                    c1388t0M2599r = c1383r.m2599r();
                    if (c1388t0M2599r == null) {
                        c1388t0M2599r.f4928d = new InterfaceC1603e() { // from class: A.q
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                            @Override // p112W2.InterfaceC1603e
                            /* JADX INFO: renamed from: g */
                            public final Object mo0g(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                AbstractC0070k0.m74a(str, interfaceC2207p2, c1260m, i21, z7, i19, i20, (InterfaceC1373m) obj, AbstractC1385s.m2609A(i8 | 1), i9);
                                return C0891q.f2780a;
                            }
                        };
                        return;
                    }
                    return;
                }
                i10 |= 196608;
                z6 = z5;
                i14 = i9 & 64;
                if (i14 == 0) {
                }
                i16 = i9 & 128;
                if (i16 == 0) {
                }
                i18 = i10 | 100663296;
                int i242 = i10;
                if ((i9 & 512) == 0) {
                }
                if (c1383r.m2560O(i18 & 1, (i18 & 306783379) == 306783378)) {
                }
                c1388t0M2599r = c1383r.m2599r();
                if (c1388t0M2599r == null) {
                }
            }
            i12 = i5;
            i13 = i9 & 32;
            if (i13 == 0) {
            }
            z6 = z5;
            i14 = i9 & 64;
            if (i14 == 0) {
            }
            i16 = i9 & 128;
            if (i16 == 0) {
            }
            i18 = i10 | 100663296;
            int i2422 = i10;
            if ((i9 & 512) == 0) {
            }
            if (c1383r.m2560O(i18 & 1, (i18 & 306783379) == 306783378)) {
            }
            c1388t0M2599r = c1383r.m2599r();
            if (c1388t0M2599r == null) {
            }
        }
        if ((i8 & 384) == 0) {
        }
        if ((i9 & 8) == 0) {
        }
        i11 = i9 & 16;
        if (i11 == 0) {
        }
        i12 = i5;
        i13 = i9 & 32;
        if (i13 == 0) {
        }
        z6 = z5;
        i14 = i9 & 64;
        if (i14 == 0) {
        }
        i16 = i9 & 128;
        if (i16 == 0) {
        }
        i18 = i10 | 100663296;
        int i24222 = i10;
        if ((i9 & 512) == 0) {
        }
        if (c1383r.m2560O(i18 & 1, (i18 & 306783379) == 306783378)) {
        }
        c1388t0M2599r = c1383r.m2599r();
        if (c1388t0M2599r == null) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static final void m75b(C0920W c0920w, C1843e c1843e, InterfaceC1373m interfaceC1373m, int i5) {
        int i6;
        InterfaceC2207p interfaceC2207pM749d;
        C1383r c1383r = (C1383r) interfaceC1373m;
        c1383r.m2569X(1533506138);
        if ((i5 & 6) == 0) {
            i6 = (c1383r.m2586h(c0920w) ? 4 : 2) | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 48) == 0) {
            i6 |= c1383r.m2586h(c1843e) ? 32 : 16;
        }
        if (c1383r.m2560O(i6 & 1, (i6 & 19) != 18)) {
            c1383r.m2568W(-885604480);
            if (c0920w.m1936k()) {
                InterfaceC1046d interfaceC1046d = null;
                interfaceC2207pM749d = AbstractC0464i.m749d(AbstractC0464i.m748c(new C0912N(c0920w, interfaceC1046d, 0)), c0920w.f2888x, new C0913O(c0920w, null), new C0914P(c0920w, interfaceC1046d, 0), new C0089u(c0920w, 2));
            } else {
                interfaceC2207pM749d = C2204m.f7185a;
            }
            AbstractC0350k.m558b(interfaceC2207pM749d, c1843e, c1383r, i6 & 112);
            c1383r.m2597p(false);
        } else {
            c1383r.m2563R();
        }
        C1388t0 c1388t0M2599r = c1383r.m2599r();
        if (c1388t0M2599r != null) {
            c1388t0M2599r.f4928d = new C0087t(c0920w, c1843e, i5, 0);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static final void m76c(C0920W c0920w, C1843e c1843e, InterfaceC1373m interfaceC1373m, int i5) {
        int i6;
        C1383r c1383r = (C1383r) interfaceC1373m;
        c1383r.m2569X(2080741862);
        if ((i5 & 6) == 0) {
            i6 = (c1383r.m2586h(c0920w) ? 4 : 2) | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 48) == 0) {
            i6 |= c1383r.m2586h(c1843e) ? 32 : 16;
        }
        if (c1383r.m2560O(i6 & 1, (i6 & 19) != 18)) {
            m75b(c0920w, c1843e, c1383r, i6 & 126);
        } else {
            c1383r.m2563R();
        }
        C1388t0 c1388t0M2599r = c1383r.m2599r();
        if (c1388t0M2599r != null) {
            c1388t0M2599r.f4928d = new C0087t(c0920w, c1843e, i5, 1);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r15v16, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r5v51, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r5v52, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r5v73, resolved type: boolean */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:242:0x04a4  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x04b3  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x04c3  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x04d4  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0542  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x054a  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x05a1  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x05a3  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x05ab  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x05ad  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x05c0  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x05c3  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x05eb  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x060c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:288:0x060e  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0692  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x069a  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x06a3  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x06b8  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x06e0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:314:0x06e5  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x070b  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x070d  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x0713  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0715  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x0729  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x0743  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x074e  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x075f  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x0794  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x0796  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x07a5  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x07bb  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x07bd  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x07ce  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x07d0  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x07e6  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x084d  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x0850  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x0867  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x0877  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x0891  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x0893  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x08ad A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:394:0x08b2  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x08cd  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x08d0  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x08fa  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x091b  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x094b  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x0961  */
    /* JADX WARN: Removed duplicated region for block: B:426:0x09f5  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x09f9  */
    /* JADX WARN: Removed duplicated region for block: B:434:0x0a0d  */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m77d(final C1646u c1646u, final InterfaceC1601c interfaceC1601c, final InterfaceC2207p interfaceC2207p, final C1260M c1260m, final C0363A c0363a, final InterfaceC1601c interfaceC1601c2, final C2740O c2740o, final boolean z5, final int i5, final int i6, final C1636k c1636k, final C0074m0 c0074m0, final boolean z6, final C1843e c1843e, InterfaceC1373m interfaceC1373m, final int i7, final int i8) {
        int i9;
        int i10;
        C1383r c1383r;
        InterfaceC2581l interfaceC2581l;
        int i11;
        C1259L c1259l;
        C1383r c1383r2;
        int i12;
        Object c0078o0;
        InterfaceC0703W0 interfaceC0703W0;
        boolean z7;
        C1624B c1624b;
        C1269g c1269g;
        C1259L c1259l2;
        C0029O0 c0029o0;
        C1260M c1260m2;
        C1357e c1357e;
        C0042V0 c0042v0;
        C1269g c1269g2;
        InterfaceC2007c interfaceC2007c;
        InterfaceC1580e interfaceC1580e;
        InterfaceC2007c interfaceC2007c2;
        long j5;
        boolean z8;
        C1646u c1646u2;
        C1646u c1646uM2944a;
        Object objM2558L;
        Object objM2558L2;
        Object objM2558L3;
        InterfaceC2581l interfaceC2581l2;
        C0943o c0943o;
        boolean z9;
        int i13;
        int i14;
        int i15;
        boolean z10;
        boolean zM2586h;
        Object obj;
        final C1647v c1647v;
        C1383r c1383r3;
        C1357e c1357e2;
        int i16;
        C0040U0 c0040u0;
        final C0078o0 c0078o02;
        InterfaceC2581l interfaceC2581l3;
        int i17;
        int i18;
        final C1636k c1636k2;
        boolean z11;
        InterfaceC2160t interfaceC2160t;
        final C0920W c0920w;
        C3473c c3473c;
        C0042V0 c0042v02;
        InterfaceC2207p interfaceC2207pM5054h;
        InterfaceC2207p interfaceC2207p2;
        boolean z12;
        boolean z13;
        C1357e c1357e3;
        InterfaceC1347Y interfaceC1347Y;
        C1647v c1647v2;
        InterfaceC2207p interfaceC2207p3;
        InterfaceC2160t interfaceC2160t2;
        C1357e c1357e4;
        Object c0024m;
        boolean zM2586h2;
        Object objM2558L4;
        int i19;
        C2204m c2204m;
        InterfaceC2207p interfaceC2207pM265a;
        int i20;
        Object obj2;
        InterfaceC2207p interfaceC2207p4;
        C2204m c2204m2;
        final C0042V0 c0042v03;
        boolean zM2586h3;
        Object objM2558L5;
        int i21;
        Object objM2558L6;
        final InterfaceC0703W0 interfaceC0703W02;
        int i22;
        Object objM2558L7;
        int i23;
        C1647v c1647v3;
        InterfaceC0703W0 interfaceC0703W03;
        final C0920W c0920w2;
        int i24;
        final C0078o0 c0078o03;
        C0042V0 c0042v04;
        InterfaceC2207p interfaceC2207pM4014a;
        boolean zM2586h4;
        Object objM2558L8;
        int i25;
        Object objM2558L9;
        C1636k c1636k3;
        int i26;
        final boolean z14;
        int i27;
        boolean z15;
        boolean zM2584g;
        Object objM2558L10;
        Object c2740o2;
        long j6;
        boolean zM2586h5;
        Object objM2558L11;
        final InterfaceC2207p interfaceC2207pM4014a2;
        long j7 = c1646u.f5651b;
        C1259L c1259l3 = c1646u.f5652c;
        C1269g c1269g3 = c1646u.f5650a;
        C1383r c1383r4 = (C1383r) interfaceC1373m;
        c1383r4.m2569X(31062401);
        if ((i7 & 6) == 0) {
            i9 = i7 | (c1383r4.m2582f(c1646u) ? 4 : 2);
        } else {
            i9 = i7;
        }
        if ((i7 & 48) == 0) {
            i9 |= c1383r4.m2586h(interfaceC1601c) ? 32 : 16;
        }
        if ((i7 & 384) == 0) {
            i9 |= c1383r4.m2582f(interfaceC2207p) ? 256 : 128;
        }
        if ((i7 & 3072) == 0) {
            i9 |= c1383r4.m2582f(c1260m) ? 2048 : 1024;
        }
        if ((i7 & 24576) == 0) {
            i9 |= c1383r4.m2582f(c0363a) ? 16384 : 8192;
        }
        if ((i7 & 196608) == 0) {
            i9 |= c1383r4.m2586h(interfaceC1601c2) ? 131072 : 65536;
        }
        if ((i7 & 1572864) == 0) {
            i9 |= c1383r4.m2582f(null) ? 1048576 : 524288;
        }
        if ((i7 & 12582912) == 0) {
            i9 |= c1383r4.m2582f(c2740o) ? 8388608 : 4194304;
        }
        if ((i7 & 100663296) == 0) {
            i9 |= c1383r4.m2584g(z5) ? 67108864 : 33554432;
        }
        if ((i7 & 805306368) == 0) {
            i9 |= c1383r4.m2578d(i5) ? 536870912 : 268435456;
        }
        if ((i8 & 6) == 0) {
            i10 = i8 | (c1383r4.m2578d(i6) ? 4 : 2);
        } else {
            i10 = i8;
        }
        if ((i8 & 48) == 0) {
            i10 |= c1383r4.m2582f(c1636k) ? 32 : 16;
        }
        if ((i8 & 384) == 0) {
            i10 |= c1383r4.m2582f(c0074m0) ? 256 : 128;
        }
        if ((i8 & 3072) == 0) {
            i10 |= c1383r4.m2584g(z6) ? 2048 : 1024;
        }
        if ((i8 & 24576) == 0) {
            i10 |= c1383r4.m2584g(false) ? 16384 : 8192;
        }
        if ((i8 & 196608) == 0) {
            i10 |= c1383r4.m2586h(c1843e) ? 131072 : 65536;
        }
        int i28 = i10 | 1572864;
        if (c1383r4.m2560O(i9 & 1, ((i9 & 306783379) == 306783378 && (599187 & i28) == 599186) ? false : true)) {
            c1383r4.m2565T();
            if ((i7 & 1) != 0 && !c1383r4.m2606y()) {
                c1383r4.m2563R();
            }
            c1383r4.m2598q();
            Object objM2558L12 = c1383r4.m2558L();
            C1357e c1357e5 = C1371l.f4833a;
            if (objM2558L12 == c1357e5) {
                objM2558L12 = new C2590u();
                c1383r4.m2585g0(objM2558L12);
            }
            final C2590u c2590u = (C2590u) objM2558L12;
            Object objM2558L13 = c1383r4.m2558L();
            if (objM2558L13 == c1357e5) {
                C0827s c0827s = AbstractC0828t.f2667a;
                objM2558L13 = new C0811c();
                c1383r4.m2585g0(objM2558L13);
            }
            C0811c c0811c = (C0811c) objM2558L13;
            Object objM2558L14 = c1383r4.m2558L();
            if (objM2558L14 == c1357e5) {
                objM2558L14 = new C1647v(c0811c);
                c1383r4.m2585g0(objM2558L14);
            }
            C1647v c1647v4 = (C1647v) objM2558L14;
            InterfaceC2007c interfaceC2007c3 = (InterfaceC2007c) c1383r4.m2590j(AbstractC0757q0.f2358h);
            InterfaceC1580e interfaceC1580e2 = (InterfaceC1580e) c1383r4.m2590j(AbstractC0757q0.f2361k);
            long j8 = ((C0931d0) c1383r4.m2590j(AbstractC0933e0.f2926a)).f2923b;
            InterfaceC2581l interfaceC2581l4 = (InterfaceC2581l) c1383r4.m2590j(AbstractC0757q0.f2359i);
            InterfaceC0703W0 interfaceC0703W04 = (InterfaceC0703W0) c1383r4.m2590j(AbstractC0757q0.f2370t);
            InterfaceC0686N0 interfaceC0686N0 = (InterfaceC0686N0) c1383r4.m2590j(AbstractC0757q0.f2366p);
            EnumC2983d0 enumC2983d0 = EnumC2983d0.f9447d;
            EnumC2983d0 enumC2983d02 = (i5 == 1 && !z5 && c1636k.f5626a) ? EnumC2983d0.f9448e : enumC2983d0;
            c1383r4.m2568W(-213744626);
            Object[] objArr = {enumC2983d02};
            C0038T0 c0038t0 = C0029O0.f141g;
            boolean zM2578d = c1383r4.m2578d(enumC2983d02.ordinal());
            Object objM2558L15 = c1383r4.m2558L();
            if (zM2578d || objM2558L15 == c1357e5) {
                interfaceC2581l = interfaceC2581l4;
                objM2558L15 = new C0099z(1, enumC2983d02);
                c1383r4.m2585g0(objM2558L15);
            } else {
                interfaceC2581l = interfaceC2581l4;
            }
            C0029O0 c0029o02 = (C0029O0) AbstractC2004k.m3672d(objArr, c0038t0, (InterfaceC1599a) objM2558L15, c1383r4, 0);
            c1383r4.m2597p(false);
            if (((EnumC2983d0) c0029o02.f147f.getValue()) != enumC2983d02) {
                throw new IllegalArgumentException("Mismatching scroller orientation; ".concat(enumC2983d02 == enumC2983d0 ? "only single-line, non-wrap text fields can scroll horizontally" : "single-line, non-wrap text fields can only scroll horizontally"));
            }
            int i29 = i9 & 14;
            boolean z16 = (i29 == 4) | ((i9 & 57344) == 16384);
            Object objM2558L16 = c1383r4.m2558L();
            if (z16 || objM2558L16 == c1357e5) {
                C1624B c1624bM85l = m85l(c0363a, c1269g3);
                if (c1259l3 != null) {
                    i11 = 57344;
                    long j9 = c1259l3.f4538a;
                    C0042V0 c0042v05 = c1624bM85l.f5586b;
                    int i30 = C1259L.f4537c;
                    int i31 = (int) (j9 >> 32);
                    c0042v05.m57a(i31);
                    int i32 = (int) (j9 & 4294967295L);
                    c0042v05.m57a(i32);
                    int iMin = Math.min(i31, i32);
                    int iMax = Math.max(i31, i32);
                    C1266d c1266d = new C1266d(c1624bM85l.f5585a);
                    c1259l = c1259l3;
                    c1266d.f4556e.add(new C1265c(new C1252E(0L, 0L, (C1587l) null, (C1585j) null, (C1586k) null, (AbstractC1592q) null, (String) null, 0L, (C1951a) null, (C1966p) null, (C1781b) null, 0L, C1962l.f6641c, (C2737L) null, 61439), iMin, iMax, ""));
                    c1624bM85l = new C1624B(c1266d.m2354b(), c0042v05);
                    c1383r2 = c1383r4;
                } else {
                    i11 = 57344;
                    c1259l = c1259l3;
                    c1383r2 = c1383r4;
                }
                objM2558L16 = c1624bM85l;
                c1383r2.m2585g0(objM2558L16);
            } else {
                i11 = 57344;
                c1383r2 = c1383r4;
                c1259l = c1259l3;
            }
            C1624B c1624b2 = (C1624B) objM2558L16;
            C1269g c1269g4 = c1624b2.f5585a;
            C0042V0 c0042v06 = c1624b2.f5586b;
            C1388t0 c1388t0M2605x = c1383r2.m2605x();
            if (c1388t0M2605x == null) {
                throw new IllegalStateException("no recompose scope found");
            }
            c1388t0M2605x.f4926b |= 1;
            boolean zM2582f = c1383r2.m2582f(interfaceC0686N0);
            Object objM2558L17 = c1383r2.m2558L();
            if (zM2582f || objM2558L17 == c1357e5) {
                i12 = i29;
                interfaceC0703W0 = interfaceC0703W04;
                z7 = z5;
                c1624b = c1624b2;
                c1269g = c1269g3;
                c1259l2 = c1259l;
                c0029o0 = c0029o02;
                c1260m2 = c1260m;
                C0090u0 c0090u0 = new C0090u0(c1269g4, c1260m2, z7, interfaceC2007c3, interfaceC1580e2, 0);
                c1357e = c1357e5;
                c0042v0 = c0042v06;
                c1269g2 = c1269g4;
                interfaceC2007c = interfaceC2007c3;
                interfaceC1580e = interfaceC1580e2;
                c0078o0 = new C0078o0(c0090u0, c1388t0M2605x, interfaceC0686N0);
                c1383r2.m2585g0(c0078o0);
            } else {
                c1260m2 = c1260m;
                i12 = i29;
                c1357e = c1357e5;
                c0042v0 = c0042v06;
                c1269g2 = c1269g4;
                c0078o0 = objM2558L17;
                interfaceC2007c = interfaceC2007c3;
                interfaceC1580e = interfaceC1580e2;
                interfaceC0703W0 = interfaceC0703W04;
                z7 = z5;
                c1624b = c1624b2;
                c1269g = c1269g3;
                c1259l2 = c1259l;
                c0029o0 = c0029o02;
            }
            C0078o0 c0078o04 = (C0078o0) c0078o0;
            c0078o04.f357u = interfaceC1601c;
            c0078o04.f362z = j8;
            C0072l0 c0072l0 = c0078o04.f354r;
            c0072l0.f308f = c0074m0;
            InterfaceC2581l interfaceC2581l5 = interfaceC2581l;
            c0072l0.f309g = interfaceC2581l5;
            c0078o04.f346j = c1269g;
            C0090u0 c0090u02 = c0078o04.f337a;
            if (AbstractC1665j.m2981a(c0090u02.f402a, c1269g2) && AbstractC1665j.m2981a(c0090u02.f403b, c1260m2) && c0090u02.f406e == z7 && c0090u02.f407f == 1 && c0090u02.f404c == Integer.MAX_VALUE && c0090u02.f405d == 1 && AbstractC1665j.m2981a(c0090u02.f408g, interfaceC2007c) && AbstractC1665j.m2981a(c0090u02.f410i, C0981u.f3047d) && c0090u02.f409h == interfaceC1580e) {
                interfaceC2007c2 = interfaceC2007c;
            } else {
                interfaceC2007c2 = interfaceC2007c;
                c0090u02 = new C0090u0(c1269g2, c1260m2, z7, interfaceC2007c2, interfaceC1580e, 0);
            }
            boolean z17 = true;
            if (c0078o04.f337a != c0090u02) {
                c0078o04.f352p = true;
            }
            c0078o04.f337a = c0090u02;
            C0038T0 c0038t02 = c0078o04.f340d;
            C1623A c1623a = c0078o04.f341e;
            c0038t02.getClass();
            boolean zM2981a = AbstractC1665j.m2981a(c1259l2, ((C1633h) c0038t02.f169e).m2931c());
            if (AbstractC1665j.m2981a(((C1646u) c0038t02.f170f).f5650a.f4563e, c1269g.f4563e)) {
                j5 = j7;
                if (C1259L.m2334b(((C1646u) c0038t02.f170f).f5651b, j5)) {
                    z8 = false;
                } else {
                    ((C1633h) c0038t02.f169e).m2934f(C1259L.m2338f(j5), C1259L.m2337e(j5));
                    z8 = true;
                }
                z17 = false;
            } else {
                j5 = j7;
                c0038t02.f169e = new C1633h(c1269g, j5);
                z8 = false;
            }
            if (c1259l2 == null) {
                C1633h c1633h = (C1633h) c0038t02.f169e;
                c1633h.f5622d = -1;
                c1633h.f5623e = -1;
            } else {
                long j10 = c1259l2.f4538a;
                if (!C1259L.m2335c(j10)) {
                    ((C1633h) c0038t02.f169e).m2933e(C1259L.m2338f(j10), C1259L.m2337e(j10));
                }
            }
            if (z17 || !(z8 || zM2981a)) {
                C1633h c1633h2 = (C1633h) c0038t02.f169e;
                c1633h2.f5622d = -1;
                c1633h2.f5623e = -1;
                c1646u2 = c1646u;
                c1646uM2944a = C1646u.m2944a(c1646u2, null, 0L, 3);
            } else {
                c1646uM2944a = c1646u;
                c1646u2 = c1646uM2944a;
            }
            C1646u c1646u3 = (C1646u) c0038t02.f170f;
            c0038t02.f170f = c1646uM2944a;
            if (c1623a != null) {
                c1623a.m2927a(c1646u3, c1646uM2944a);
            }
            Object objM2558L18 = c1383r2.m2558L();
            C1357e c1357e6 = c1357e;
            if (objM2558L18 == c1357e6) {
                objM2558L18 = new C0040U0();
                c1383r2.m2585g0(objM2558L18);
            }
            C0040U0 c0040u02 = (C0040U0) objM2558L18;
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (c0040u02.f179e) {
                c0040u02.f178d = Long.valueOf(jCurrentTimeMillis);
                c0040u02.m56a(c1646u2);
                objM2558L = c1383r2.m2558L();
                if (objM2558L == c1357e6) {
                    objM2558L = AbstractC1385s.m2622l(c1383r2);
                    c1383r2.m2585g0(objM2558L);
                }
                final InterfaceC2160t interfaceC2160t3 = (InterfaceC2160t) objM2558L;
                objM2558L2 = c1383r2.m2558L();
                if (objM2558L2 == c1357e6) {
                    objM2558L2 = new C3473c();
                    c1383r2.m2585g0(objM2558L2);
                }
                final C3473c c3473c2 = (C3473c) objM2558L2;
                objM2558L3 = c1383r2.m2558L();
                if (objM2558L3 == c1357e6) {
                    objM2558L3 = new C0920W(c0040u02);
                    c1383r2.m2585g0(objM2558L3);
                }
                final C0920W c0920w3 = (C0920W) objM2558L3;
                final C0042V0 c0042v07 = c0042v0;
                c0920w3.f2866b = c0042v07;
                c0920w3.f2867c = c0078o04.f358v;
                c0920w3.f2868d = c0078o04;
                c0920w3.f2869e.setValue(c1646u2);
                c0920w3.f2886v = new C1259L(j5);
                c0920w3.f2871g = (InterfaceC0744l0) c1383r2.m2590j(AbstractC0757q0.f2356f);
                c0920w3.f2872h = interfaceC2160t3;
                c0920w3.f2874j = (InterfaceC3388a) c1383r2.m2590j(AbstractC0757q0.f2362l);
                c0920w3.f2875k = c2590u;
                c0920w3.f2876l.setValue(true);
                c0920w3.f2877m.setValue(Boolean.valueOf(z6));
                c1383r2.m2568W(1966756105);
                C1781b c1781b = c1260m2.f4540a.f4504k;
                C1341U0 c1341u0 = AbstractC0945q.f2972a;
                c1383r2.m2568W(430530635);
                if (Build.VERSION.SDK_INT >= 28) {
                    z9 = false;
                    c1383r2.m2597p(false);
                    interfaceC2581l2 = interfaceC2581l5;
                    c0943o = null;
                } else {
                    Context context = (Context) c1383r2.m2590j(AbstractC0691Q.f2211b);
                    InterfaceC1051i interfaceC1051i = (InterfaceC1051i) c1383r2.m2590j(AbstractC0945q.f2972a);
                    boolean zM2582f2 = c1383r2.m2582f(interfaceC1051i) | c1383r2.m2582f(context) | c1383r2.m2582f(c1781b);
                    Object objM2558L19 = c1383r2.m2558L();
                    if (zM2582f2 || objM2558L19 == c1357e6) {
                        AbstractC0945q.f2973b.getClass();
                        interfaceC2581l2 = interfaceC2581l5;
                        objM2558L19 = new C0943o(interfaceC1051i, context, EnumC0947s.f2979d, c1781b);
                        c1383r2.m2585g0(objM2558L19);
                    } else {
                        interfaceC2581l2 = interfaceC2581l5;
                    }
                    c0943o = (C0943o) objM2558L19;
                    z9 = false;
                    c1383r2.m2597p(false);
                }
                c0920w3.f2873i = c0943o;
                c1383r2.m2597p(z9);
                c0078o04.m121b();
                int i33 = i28 & 7168;
                int i34 = i28 & i11;
                boolean zM2586h6 = c1383r2.m2586h(c0078o04) | (i33 != 2048) | (i34 != 16384) | c1383r2.m2586h(c1647v4);
                i13 = i12;
                boolean z18 = zM2586h6 | (i13 != 4);
                i14 = (i28 & 112) ^ 48;
                if (i14 > 32 || !c1383r2.m2582f(c1636k)) {
                    i15 = i13;
                    if ((i28 & 48) != 32) {
                        z10 = false;
                    }
                    zM2586h = z18 | z10 | c1383r2.m2586h(c0042v07) | c1383r2.m2586h(interfaceC2160t3) | c1383r2.m2586h(c3473c2) | c1383r2.m2586h(c0920w3);
                    Object objM2558L20 = c1383r2.m2558L();
                    if (zM2586h || objM2558L20 == c1357e6) {
                        c1647v = c1647v4;
                        final C1646u c1646u4 = c1646u2;
                        c1383r3 = c1383r2;
                        c1357e2 = c1357e6;
                        i16 = i28;
                        c0040u0 = c0040u02;
                        c0078o02 = c0078o04;
                        interfaceC2581l3 = interfaceC2581l2;
                        i17 = i15;
                        i18 = 32;
                        c1636k2 = c1636k;
                        obj = new InterfaceC1601c() { // from class: A.J
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                            @Override // p112W2.InterfaceC1601c
                            /* JADX INFO: renamed from: h */
                            public final Object mo1h(Object obj3) {
                                C0036S0 c0036s0M123d;
                                EnumC2594y enumC2594y = (EnumC2594y) obj3;
                                C0078o0 c0078o05 = c0078o02;
                                if (c0078o05.m121b() != enumC2594y.m4540a()) {
                                    c0078o05.f342f.setValue(Boolean.valueOf(enumC2594y.m4540a()));
                                    boolean zM121b = c0078o05.m121b();
                                    C1646u c1646u5 = c1646u4;
                                    C0042V0 c0042v08 = c0042v07;
                                    if (zM121b && z6) {
                                        AbstractC0070k0.m90q(c1647v, c0078o05, c1646u5, c1636k2, c0042v08);
                                    } else {
                                        AbstractC0070k0.m84k(c0078o05);
                                    }
                                    if (enumC2594y.m4540a() && (c0036s0M123d = c0078o05.m123d()) != null) {
                                        AbstractC2162v.m3994p(interfaceC2160t3, null, new C0024M(c3473c2, c1646u5, c0078o05, c0036s0M123d, c0042v08, (InterfaceC1046d) null), 3);
                                    }
                                    if (!enumC2594y.m4540a()) {
                                        c0920w3.m1932g(null);
                                    }
                                }
                                return C0891q.f2780a;
                            }
                        };
                        z11 = z6;
                        interfaceC2160t = interfaceC2160t3;
                        c1646u2 = c1646u4;
                        c0920w = c0920w3;
                        c3473c = c3473c2;
                        c0042v02 = c0042v07;
                        c1383r3.m2585g0(obj);
                    } else {
                        c1383r3 = c1383r2;
                        obj = objM2558L20;
                        c1357e2 = c1357e6;
                        interfaceC2160t = interfaceC2160t3;
                        c3473c = c3473c2;
                        i16 = i28;
                        c0040u0 = c0040u02;
                        c0078o02 = c0078o04;
                        interfaceC2581l3 = interfaceC2581l2;
                        i17 = i15;
                        i18 = 32;
                        c1636k2 = c1636k;
                        z11 = z6;
                        c0042v02 = c0042v07;
                        c1647v = c1647v4;
                        c0920w = c0920w3;
                    }
                    interfaceC2207pM5054h = AbstractC2856m.m5054h(AbstractC2573d.m4512s(AbstractC2573d.m4503j(c2590u), (InterfaceC1601c) obj), z11);
                    InterfaceC1347Y interfaceC1347YM2633w = AbstractC1385s.m2633w(Boolean.valueOf(z11), c1383r3);
                    boolean zM2582f3 = c1383r3.m2582f(interfaceC1347YM2633w) | c1383r3.m2586h(c0078o02) | c1383r3.m2586h(c1647v) | c1383r3.m2586h(c0920w);
                    if (i14 > i18 || !c1383r3.m2582f(c1636k2)) {
                        interfaceC2207p2 = interfaceC2207pM5054h;
                        if ((i16 & 48) != i18) {
                            z12 = false;
                        }
                        z13 = zM2582f3 | z12;
                        Object objM2558L21 = c1383r3.m2558L();
                        if (z13) {
                            c1357e3 = c1357e2;
                        } else {
                            C1357e c1357e7 = c1357e2;
                            if (objM2558L21 == c1357e7) {
                                c1357e3 = c1357e7;
                            } else {
                                c1357e4 = c1357e7;
                                c0024m = objM2558L21;
                                c1647v2 = c1647v;
                                interfaceC1347Y = interfaceC1347YM2633w;
                                interfaceC2207p3 = interfaceC2207p2;
                                interfaceC2160t2 = interfaceC2160t;
                                AbstractC1385s.m2615e(c1383r3, (InterfaceC1603e) c0024m, C0891q.f2780a);
                                zM2586h2 = c1383r3.m2586h(c0078o02);
                                objM2558L4 = c1383r3.m2558L();
                                if (!zM2586h2 || objM2558L4 == c1357e4) {
                                    i19 = 1;
                                    objM2558L4 = new C0012G(c0078o02, i19);
                                    c1383r3.m2585g0(objM2558L4);
                                } else {
                                    i19 = 1;
                                }
                                C0032Q c0032q = new C0032Q(4, (InterfaceC1601c) objM2558L4);
                                c2204m = C2204m.f7185a;
                                interfaceC2207pM265a = AbstractC0181N.m265a(c2204m, 8675309, c0032q);
                                i20 = (c1383r3.m2586h(c0078o02) ? 1 : 0) | (i34 != 16384 ? i19 : 0) | (i33 != 2048 ? i19 : 0) | (c1383r3.m2586h(c0042v02) ? 1 : 0) | (c1383r3.m2586h(c0920w) ? 1 : 0);
                                Object objM2558L22 = c1383r3.m2558L();
                                if (i20 == 0 || objM2558L22 == c1357e4) {
                                    final boolean z19 = z11;
                                    interfaceC2207p4 = interfaceC2207pM265a;
                                    c2204m2 = c2204m;
                                    c0042v03 = c0042v02;
                                    obj2 = new InterfaceC1601c() { // from class: A.v
                                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                        @Override // p112W2.InterfaceC1601c
                                        /* JADX INFO: renamed from: h */
                                        public final Object mo1h(Object obj3) {
                                            C2683b c2683b = (C2683b) obj3;
                                            C0078o0 c0078o05 = c0078o02;
                                            if (c0078o05.m121b()) {
                                                InterfaceC0686N0 interfaceC0686N02 = c0078o05.f339c;
                                                if (interfaceC0686N02 != null) {
                                                    ((C0761s0) interfaceC0686N02).m1274b();
                                                }
                                            } else {
                                                C2590u.m4539a(c2590u);
                                            }
                                            if (c0078o05.m121b() && z19) {
                                                if (c0078o05.m120a() != EnumC0052b0.f212e) {
                                                    C0036S0 c0036s0M123d = c0078o05.m123d();
                                                    if (c0036s0M123d != null) {
                                                        long j11 = c2683b.f8556a;
                                                        C0038T0 c0038t03 = c0078o05.f340d;
                                                        C0012G c0012g = c0078o05.f358v;
                                                        int iM21b = c0036s0M123d.m21b(j11, true);
                                                        c0042v03.m58b(iM21b);
                                                        c0012g.mo1h(C1646u.m2944a((C1646u) c0038t03.f170f, null, AbstractC1251D.m2313b(iM21b, iM21b), 5));
                                                        if (c0078o05.f337a.f402a.f4563e.length() > 0) {
                                                            c0078o05.f347k.setValue(EnumC0052b0.f213f);
                                                        }
                                                    }
                                                } else {
                                                    c0920w.m1932g(c2683b);
                                                }
                                            }
                                            return C0891q.f2780a;
                                        }
                                    };
                                    c1383r3.m2585g0(obj2);
                                } else {
                                    interfaceC2207p4 = interfaceC2207pM265a;
                                    c2204m2 = c2204m;
                                    obj2 = objM2558L22;
                                    c0042v03 = c0042v02;
                                }
                                InterfaceC2207p interfaceC2207pM4014a3 = !z6 ? AbstractC2192a.m4014a(interfaceC2207p4, new C0011F0((InterfaceC1601c) obj2, 0)) : interfaceC2207p4;
                                C2029h c2029h = c0920w.f2890z;
                                C0918U c0918u = c0920w.f2889y;
                                zM2586h3 = c1383r3.m2586h(c0920w);
                                objM2558L5 = c1383r3.m2558L();
                                if (!zM2586h3 || objM2558L5 == c1357e4) {
                                    objM2558L5 = new C0032Q(0, c0920w);
                                    c1383r3.m2585g0(objM2558L5);
                                }
                                InterfaceC2207p interfaceC2207pMo4021c = interfaceC2207pM4014a3.mo4021c(new C0180M(c2029h, c0918u, null, (PointerInputEventHandler) objM2558L5, 4));
                                InterfaceC0206t.f707a.getClass();
                                InterfaceC2207p interfaceC2207pMo4021c2 = interfaceC2207pMo4021c.mo4021c(new C0203q());
                                i21 = (c1383r3.m2586h(c0078o02) ? 1 : 0) | (i17 != 4 ? i19 : 0) | (c1383r3.m2586h(c0042v03) ? 1 : 0);
                                objM2558L6 = c1383r3.m2558L();
                                if (i21 == 0 || objM2558L6 == c1357e4) {
                                    objM2558L6 = new C0075n(c0078o02, c1646u2, c0042v03, i19);
                                    c1383r3.m2585g0(objM2558L6);
                                }
                                final InterfaceC2207p interfaceC2207pM4429c = AbstractC2485h.m4429c(c2204m2, (InterfaceC1601c) objM2558L6);
                                interfaceC0703W02 = interfaceC0703W0;
                                i22 = (c1383r3.m2586h(c0078o02) ? 1 : 0) | (i33 != 2048 ? i19 : 0) | (c1383r3.m2582f(interfaceC0703W02) ? 1 : 0) | (c1383r3.m2586h(c0920w) ? 1 : 0) | (i17 != 4 ? i19 : 0) | (c1383r3.m2586h(c0042v03) ? 1 : 0);
                                objM2558L7 = c1383r3.m2558L();
                                if (i22 == 0 || objM2558L7 == c1357e4) {
                                    int i35 = i19;
                                    final C0042V0 c0042v08 = c0042v03;
                                    final C1646u c1646u5 = c1646u2;
                                    i23 = i35;
                                    c1647v3 = c1647v2;
                                    InterfaceC1601c interfaceC1601c3 = new InterfaceC1601c() { // from class: A.w
                                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                        @Override // p112W2.InterfaceC1601c
                                        /* JADX INFO: renamed from: h */
                                        public final Object mo1h(Object obj3) {
                                            C1623A c1623a2;
                                            InterfaceC0430v interfaceC0430v;
                                            InterfaceC0430v interfaceC0430v2;
                                            C0078o0 c0078o05 = c0078o02;
                                            C1366i0 c1366i0 = c0078o05.f351o;
                                            InterfaceC0430v interfaceC0430v3 = (InterfaceC0430v) obj3;
                                            c0078o05.f344h = interfaceC0430v3;
                                            C0036S0 c0036s0M123d = c0078o05.m123d();
                                            if (c0036s0M123d != null) {
                                                c0036s0M123d.f162b = interfaceC0430v3;
                                            }
                                            if (z6) {
                                                EnumC0052b0 enumC0052b0M120a = c0078o05.m120a();
                                                EnumC0052b0 enumC0052b0 = EnumC0052b0.f212e;
                                                C0920W c0920w4 = c0920w;
                                                C1646u c1646u6 = c1646u5;
                                                if (enumC0052b0M120a == enumC0052b0) {
                                                    if (((Boolean) c0078o05.f348l.getValue()).booleanValue() && ((Boolean) ((C0662B0) interfaceC0703W02).f2101a.getValue()).booleanValue()) {
                                                        c0920w4.m1943r();
                                                    } else {
                                                        c0920w4.m1940o();
                                                    }
                                                    c0078o05.f349m.setValue(Boolean.valueOf(AbstractC1923e.m3450J(c0920w4, true)));
                                                    c0078o05.f350n.setValue(Boolean.valueOf(AbstractC1923e.m3450J(c0920w4, false)));
                                                    c1366i0.setValue(Boolean.valueOf(C1259L.m2335c(c1646u6.f5651b)));
                                                } else if (c0078o05.m120a() == EnumC0052b0.f213f) {
                                                    c1366i0.setValue(Boolean.valueOf(AbstractC1923e.m3450J(c0920w4, true)));
                                                }
                                                C0042V0 c0042v09 = c0042v08;
                                                AbstractC0070k0.m88o(c0078o05, c1646u6, c0042v09);
                                                C0036S0 c0036s0M123d2 = c0078o05.m123d();
                                                if (c0036s0M123d2 != null && (c1623a2 = c0078o05.f341e) != null && c0078o05.m121b() && (interfaceC0430v = c0036s0M123d2.f162b) != null && interfaceC0430v.mo632D() && (interfaceC0430v2 = c0036s0M123d2.f163c) != null) {
                                                    C1257J c1257j = c0036s0M123d2.f161a;
                                                    C0001A0 c0001a0 = new C0001A0(0, interfaceC0430v);
                                                    C2684c c2684cM3211Y = AbstractC1784a.m3211Y(interfaceC0430v);
                                                    C2684c c2684cMo634K = interfaceC0430v.mo634K(interfaceC0430v2, false);
                                                    if (AbstractC1665j.m2981a((C1623A) c1623a2.f5583a.f5654b.get(), c1623a2)) {
                                                        c1623a2.f5584b.mo1418h(c1646u6, c0042v09, c1257j, c0001a0, c2684cM3211Y, c2684cMo634K);
                                                    }
                                                }
                                            }
                                            return C0891q.f2780a;
                                        }
                                    };
                                    interfaceC0703W03 = interfaceC0703W02;
                                    c0042v03 = c0042v08;
                                    c1383r3.m2585g0(interfaceC1601c3);
                                    objM2558L7 = interfaceC1601c3;
                                } else {
                                    interfaceC0703W03 = interfaceC0703W02;
                                    i23 = i19;
                                    c1647v3 = c1647v2;
                                }
                                final InterfaceC2207p interfaceC2207pM696i = AbstractC0435z.m696i(c2204m2, (InterfaceC1601c) objM2558L7);
                                C0078o0 c0078o05 = c0078o02;
                                c0920w2 = c0920w;
                                i24 = i23;
                                C0813e c0813e = new C0813e(c1624b, c1646u, c0078o05, z6, c0042v03, c0920w2, c1636k, c2590u);
                                c0078o03 = c0078o05;
                                if (((!z6 && ((Boolean) ((C0662B0) interfaceC0703W03).f2101a.getValue()).booleanValue() && C1259L.m2335c(((C1259L) c0078o03.f335A.getValue()).f4538a) && C1259L.m2335c(((C1259L) c0078o03.f336B.getValue()).f4538a)) ? i24 : 0) == 0) {
                                    C0042V0 c0042v09 = c0042v03;
                                    C0094w0 c0094w0 = new C0094w0(c2740o, c0078o03, c1646u, c0042v09, 0);
                                    c0078o03 = c0078o03;
                                    c0042v04 = c0042v09;
                                    interfaceC2207pM4014a = AbstractC2192a.m4014a(c2204m2, c0094w0);
                                } else {
                                    c0042v04 = c0042v03;
                                    interfaceC2207pM4014a = c2204m2;
                                }
                                zM2586h4 = c1383r3.m2586h(c0920w2);
                                objM2558L8 = c1383r3.m2558L();
                                if (!zM2586h4 || objM2558L8 == c1357e4) {
                                    objM2558L8 = new C0089u(c0920w2, 0);
                                    c1383r3.m2585g0(objM2558L8);
                                }
                                AbstractC1385s.m2613c(c0920w2, (InterfaceC1601c) objM2558L8, c1383r3);
                                i25 = (c1383r3.m2586h(c0078o03) ? 1 : 0) | (c1383r3.m2586h(c1647v3) ? 1 : 0) | (i17 != 4 ? i24 : 0) | (((i14 > 32 || !c1383r3.m2582f(c1636k)) && (i16 & 48) != 32) ? 0 : i24);
                                objM2558L9 = c1383r3.m2558L();
                                if (i25 != 0 || objM2558L9 == c1357e4) {
                                    C0006D c0006d = new C0006D(c0078o03, c1647v3, c1646u, c1636k, 0);
                                    c1636k3 = c1636k;
                                    c1383r3.m2585g0(c0006d);
                                    objM2558L9 = c0006d;
                                } else {
                                    c1636k3 = c1636k;
                                }
                                AbstractC1385s.m2613c(c1636k3, (InterfaceC1601c) objM2558L9, c1383r3);
                                final C0012G c0012g = c0078o03.f358v;
                                if (i5 != i24) {
                                    int i36 = i24;
                                    i26 = i36 == true ? 1 : 0;
                                    z14 = i36;
                                } else {
                                    i26 = i24;
                                    z14 = 0;
                                }
                                final int i37 = c1636k3.f5630e;
                                i27 = i26;
                                final C0042V0 c0042v010 = c0042v04;
                                final boolean z20 = true;
                                final C0040U0 c0040u03 = c0040u0;
                                InterfaceC2207p interfaceC2207pM4014a4 = AbstractC2192a.m4014a(c2204m2, new InterfaceC1604f() { // from class: A.D0
                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                    @Override // p112W2.InterfaceC1604f
                                    /* JADX INFO: renamed from: f */
                                    public final Object mo5f(Object obj3, Object obj4, Object obj5) {
                                        ((Integer) obj5).getClass();
                                        C1383r c1383r5 = (C1383r) ((InterfaceC1373m) obj4);
                                        c1383r5.m2568W(851809892);
                                        Object objM2558L23 = c1383r5.m2558L();
                                        C1357e c1357e8 = C1371l.f4833a;
                                        if (objM2558L23 == c1357e8) {
                                            objM2558L23 = new C0929c0();
                                            c1383r5.m2585g0(objM2558L23);
                                        }
                                        C0929c0 c0929c0 = (C0929c0) objM2558L23;
                                        Object objM2558L24 = c1383r5.m2558L();
                                        if (objM2558L24 == c1357e8) {
                                            objM2558L24 = new C0047Y();
                                            c1383r5.m2585g0(objM2558L24);
                                        }
                                        C0005C0 c0005c0 = new C0005C0(c0078o03, c0920w2, c1646u, z20, z14, c0929c0, c0042v010, c0040u03, (C0047Y) objM2558L24, c0012g, i37);
                                        boolean zM2586h7 = c1383r5.m2586h(c0005c0);
                                        Object objM2558L25 = c1383r5.m2558L();
                                        if (zM2586h7 || objM2558L25 == c1357e8) {
                                            C0009E0 c0009e0 = new C0009E0(1, c0005c0, C0005C0.class, "process", "process-ZmokQxo(Landroid/view/KeyEvent;)Z", 0, 0, 0);
                                            c1383r5.m2585g0(c0009e0);
                                            objM2558L25 = c0009e0;
                                        }
                                        InterfaceC2207p interfaceC2207pM5766d = AbstractC3510c.m5766d((InterfaceC1601c) ((C1663h) objM2558L25));
                                        c1383r5.m2597p(false);
                                        return interfaceC2207pM5766d;
                                    }
                                });
                                int i38 = c1636k3.f5629d;
                                z15 = (i38 == 7 || i38 == 8) ? false : i27 == true ? 1 : 0;
                                boolean zBooleanValue = ((Boolean) interfaceC1347Y.getValue()).booleanValue();
                                zM2584g = c1383r3.m2584g(z15) | c1383r3.m2586h(c0811c);
                                objM2558L10 = c1383r3.m2558L();
                                if (!zM2584g || objM2558L10 == c1357e4) {
                                    objM2558L10 = new C0008E(0, c0811c, z15);
                                    c1383r3.m2585g0(objM2558L10);
                                }
                                InterfaceC2207p interfaceC2207pM1127a = AbstractC0655b.m1127a(zBooleanValue, z15, (InterfaceC1599a) objM2558L10);
                                c2740o2 = (AbstractC2758q) c1383r3.m2590j(AbstractC0069k.f300a);
                                j6 = ((C2762u) c1383r3.m2590j(AbstractC0069k.f301b)).f8764a;
                                if (!C2762u.m4921c(j6, AbstractC2767z.m4933c(1308617531))) {
                                    c2740o2 = new C2740O(j6);
                                }
                                zM2586h5 = c1383r3.m2586h(c0078o03) | c1383r3.m2582f(c2740o2);
                                objM2558L11 = c1383r3.m2558L();
                                if (!zM2586h5 || objM2558L11 == c1357e4) {
                                    objM2558L11 = new C0010F(0, c0078o03, c2740o2);
                                    c1383r3.m2585g0(objM2558L11);
                                }
                                int i39 = 0;
                                InterfaceC2207p interfaceC2207pMo4021c3 = AbstractC3510c.m5767e(AbstractC3510c.m5767e(AbstractC0825q.m1468m(interfaceC2207p.mo4021c(AbstractC2485h.m4431e(c2204m2, (InterfaceC1601c) objM2558L11)), c0811c, c0078o03, c0920w2).mo4021c(interfaceC2207pM1127a).mo4021c(interfaceC2207p3), new C0045X(interfaceC2581l3, c0078o03)), new C0045X(i39, c0078o03, c0920w2)).mo4021c(interfaceC2207pM4014a4);
                                final C0029O0 c0029o03 = c0029o0;
                                int i40 = 5;
                                InterfaceC2207p interfaceC2207pM746a = AbstractC0464i.m746a(AbstractC0435z.m696i(interfaceC2207pMo4021c3.mo4021c(new C2202k(new C0021K0(i39, c0029o03, z6))).mo4021c(interfaceC2207pMo4021c2).mo4021c(c0813e), new C0012G(c0078o03, i39)), new C0352m(i40, c0920w2, interfaceC2160t2));
                                if (z6 || !c0078o03.m121b() || !((Boolean) c0078o03.f353q.getValue()).booleanValue() || !((Boolean) ((C0662B0) interfaceC0703W03).f2101a.getValue()).booleanValue()) {
                                    i27 = 0;
                                }
                                if (i27 == 0) {
                                    interfaceC2207pM4014a2 = !AbstractC2823P.m5024a() ? c2204m2 : AbstractC2192a.m4014a(c2204m2, new C0033Q0(i40, c0920w2));
                                } else {
                                    interfaceC2207pM4014a2 = c2204m2;
                                }
                                final InterfaceC2007c interfaceC2007c4 = interfaceC2007c2;
                                final C3473c c3473c3 = c3473c;
                                final InterfaceC2207p interfaceC2207p5 = interfaceC2207pM4014a;
                                final boolean z21 = i27;
                                final C0078o0 c0078o06 = c0078o03;
                                InterfaceC1603e interfaceC1603e = new InterfaceC1603e() { // from class: A.H
                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                    @Override // p112W2.InterfaceC1603e
                                    /* JADX INFO: renamed from: g */
                                    public final Object mo0g(Object obj3, Object obj4) {
                                        InterfaceC1373m interfaceC1373m2 = (InterfaceC1373m) obj3;
                                        int iIntValue = ((Integer) obj4).intValue();
                                        C1383r c1383r5 = (C1383r) interfaceC1373m2;
                                        if (c1383r5.m2560O(iIntValue & 1, (iIntValue & 3) != 2)) {
                                            final C0078o0 c0078o07 = c0078o06;
                                            final C1260M c1260m3 = c1260m;
                                            final int i41 = i6;
                                            final int i42 = i5;
                                            final C0029O0 c0029o04 = c0029o03;
                                            final C1646u c1646u6 = c1646u;
                                            final C0363A c0363a2 = c0363a;
                                            final InterfaceC2207p interfaceC2207p6 = interfaceC2207p5;
                                            final InterfaceC2207p interfaceC2207p7 = interfaceC2207pM4429c;
                                            final InterfaceC2207p interfaceC2207p8 = interfaceC2207pM696i;
                                            final InterfaceC2207p interfaceC2207p9 = interfaceC2207pM4014a2;
                                            final C3473c c3473c4 = c3473c3;
                                            final C0920W c0920w4 = c0920w2;
                                            final boolean z22 = z21;
                                            final InterfaceC1601c interfaceC1601c4 = interfaceC1601c2;
                                            final C0042V0 c0042v011 = c0042v010;
                                            final InterfaceC2007c interfaceC2007c5 = interfaceC2007c4;
                                            c1843e.mo5f(AbstractC1848j.m3314c(-44346382, new InterfaceC1603e() { // from class: A.y
                                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                @Override // p112W2.InterfaceC1603e
                                                /* JADX INFO: renamed from: g */
                                                public final Object mo0g(Object obj5, Object obj6) {
                                                    InterfaceC2207p c0046x0;
                                                    C1646u c1646u7 = c1646u6;
                                                    long j11 = c1646u7.f5651b;
                                                    InterfaceC1373m interfaceC1373m3 = (InterfaceC1373m) obj5;
                                                    int iIntValue2 = ((Integer) obj6).intValue();
                                                    C1383r c1383r6 = (C1383r) interfaceC1373m3;
                                                    if (c1383r6.m2560O(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                                        C0078o0 c0078o08 = c0078o07;
                                                        InterfaceC2207p interfaceC2207pM5523j = AbstractC3261c.m5523j(C2204m.f7185a, ((C2010f) c0078o08.f343g.getValue()).f6732d, 0.0f, 2);
                                                        final int i43 = i41;
                                                        final int i44 = i42;
                                                        final C1260M c1260m4 = c1260m3;
                                                        InterfaceC2207p interfaceC2207pMo4021c4 = interfaceC2207pM5523j.mo4021c(new C2202k(new InterfaceC1604f() { // from class: A.c0
                                                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                            @Override // p112W2.InterfaceC1604f
                                                            /* JADX INFO: renamed from: f */
                                                            public final Object mo5f(Object obj7, Object obj8, Object obj9) {
                                                                ((Integer) obj9).getClass();
                                                                C1383r c1383r7 = (C1383r) ((InterfaceC1373m) obj8);
                                                                c1383r7.m2568W(408240218);
                                                                int i45 = i43;
                                                                int i46 = i44;
                                                                AbstractC0070k0.m91r(i45, i46);
                                                                C2204m c2204m3 = C2204m.f7185a;
                                                                if (i45 == 1 && i46 == Integer.MAX_VALUE) {
                                                                    c1383r7.m2597p(false);
                                                                    return c2204m3;
                                                                }
                                                                InterfaceC2007c interfaceC2007c6 = (InterfaceC2007c) c1383r7.m2590j(AbstractC0757q0.f2358h);
                                                                InterfaceC1580e interfaceC1580e3 = (InterfaceC1580e) c1383r7.m2590j(AbstractC0757q0.f2361k);
                                                                EnumC2017m enumC2017m = (EnumC2017m) c1383r7.m2590j(AbstractC0757q0.f2364n);
                                                                C1260M c1260m5 = c1260m4;
                                                                boolean zM2582f4 = c1383r7.m2582f(c1260m5) | c1383r7.m2578d(enumC2017m.ordinal());
                                                                Object objM2558L23 = c1383r7.m2558L();
                                                                C1357e c1357e8 = C1371l.f4833a;
                                                                if (zM2582f4 || objM2558L23 == c1357e8) {
                                                                    objM2558L23 = AbstractC1251D.m2319h(c1260m5, enumC2017m);
                                                                    c1383r7.m2585g0(objM2558L23);
                                                                }
                                                                C1260M c1260m6 = (C1260M) objM2558L23;
                                                                boolean zM2582f5 = c1383r7.m2582f(interfaceC1580e3) | c1383r7.m2582f(c1260m6);
                                                                Object objM2558L24 = c1383r7.m2558L();
                                                                if (zM2582f5 || objM2558L24 == c1357e8) {
                                                                    C1252E c1252e = c1260m6.f4540a;
                                                                    AbstractC1592q abstractC1592q = c1252e.f4499f;
                                                                    C1587l c1587l = c1252e.f4496c;
                                                                    if (c1587l == null) {
                                                                        c1587l = C1587l.f5502f;
                                                                    }
                                                                    C1585j c1585j = c1252e.f4497d;
                                                                    int i47 = c1585j != null ? c1585j.f5499a : 0;
                                                                    C1586k c1586k = c1252e.f4498e;
                                                                    objM2558L24 = ((C1581f) interfaceC1580e3).m2854b(abstractC1592q, c1587l, i47, c1586k != null ? c1586k.f5500a : 65535);
                                                                    c1383r7.m2585g0(objM2558L24);
                                                                }
                                                                InterfaceC1339T0 interfaceC1339T0 = (InterfaceC1339T0) objM2558L24;
                                                                boolean zM2582f6 = c1383r7.m2582f(interfaceC1339T0.getValue()) | c1383r7.m2582f(interfaceC2007c6) | c1383r7.m2582f(interfaceC1580e3) | c1383r7.m2582f(c1260m5) | c1383r7.m2578d(enumC2017m.ordinal());
                                                                Object objM2558L25 = c1383r7.m2558L();
                                                                if (zM2582f6 || objM2558L25 == c1357e8) {
                                                                    objM2558L25 = Integer.valueOf((int) (AbstractC0003B0.m2a(c1260m6, interfaceC2007c6, interfaceC1580e3, AbstractC0003B0.f13a, 1) & 4294967295L));
                                                                    c1383r7.m2585g0(objM2558L25);
                                                                }
                                                                int iIntValue3 = ((Number) objM2558L25).intValue();
                                                                boolean zM2582f7 = c1383r7.m2582f(interfaceC1339T0.getValue()) | c1383r7.m2582f(interfaceC2007c6) | c1383r7.m2582f(interfaceC1580e3) | c1383r7.m2582f(c1260m5) | c1383r7.m2578d(enumC2017m.ordinal());
                                                                Object objM2558L26 = c1383r7.m2558L();
                                                                if (zM2582f7 || objM2558L26 == c1357e8) {
                                                                    StringBuilder sb = new StringBuilder();
                                                                    String str = AbstractC0003B0.f13a;
                                                                    sb.append(str);
                                                                    sb.append('\n');
                                                                    sb.append(str);
                                                                    objM2558L26 = Integer.valueOf((int) (AbstractC0003B0.m2a(c1260m6, interfaceC2007c6, interfaceC1580e3, sb.toString(), 2) & 4294967295L));
                                                                    c1383r7.m2585g0(objM2558L26);
                                                                }
                                                                int iIntValue4 = ((Number) objM2558L26).intValue() - iIntValue3;
                                                                Integer numValueOf = i45 == 1 ? null : Integer.valueOf(((i45 - 1) * iIntValue4) + iIntValue3);
                                                                Integer numValueOf2 = i46 != Integer.MAX_VALUE ? Integer.valueOf(((i46 - 1) * iIntValue4) + iIntValue3) : null;
                                                                InterfaceC2207p interfaceC2207pM5522i = AbstractC3261c.m5522i(c2204m3, numValueOf != null ? interfaceC2007c6.mo283q0(numValueOf.intValue()) : Float.NaN, numValueOf2 != null ? interfaceC2007c6.mo283q0(numValueOf2.intValue()) : Float.NaN);
                                                                c1383r7.m2597p(false);
                                                                return interfaceC2207pM5522i;
                                                            }
                                                        }));
                                                        boolean zM2586h7 = c1383r6.m2586h(c0078o08);
                                                        Object objM2558L23 = c1383r6.m2558L();
                                                        if (zM2586h7 || objM2558L23 == C1371l.f4833a) {
                                                            objM2558L23 = new C0099z(0, c0078o08);
                                                            c1383r6.m2585g0(objM2558L23);
                                                        }
                                                        InterfaceC1599a interfaceC1599a = (InterfaceC1599a) objM2558L23;
                                                        C0029O0 c0029o05 = c0029o04;
                                                        EnumC2983d0 enumC2983d03 = (EnumC2983d0) c0029o05.f147f.getValue();
                                                        int i45 = C1259L.f4537c;
                                                        int iM2338f = (int) (j11 >> 32);
                                                        long j12 = c0029o05.f146e;
                                                        if (iM2338f == ((int) (j12 >> 32)) && (iM2338f = (int) (j11 & 4294967295L)) == ((int) (j12 & 4294967295L))) {
                                                            iM2338f = C1259L.m2338f(j11);
                                                        }
                                                        c0029o05.f146e = j11;
                                                        C1624B c1624bM85l2 = AbstractC0070k0.m85l(c0363a2, c1646u7.f5650a);
                                                        int iOrdinal = enumC2983d03.ordinal();
                                                        if (iOrdinal == 0) {
                                                            c0046x0 = new C0046X0(c0029o05, iM2338f, c1624bM85l2, interfaceC1599a);
                                                        } else {
                                                            if (iOrdinal != 1) {
                                                                throw new C0330q();
                                                            }
                                                            c0046x0 = new C0058e0(c0029o05, iM2338f, c1624bM85l2, interfaceC1599a);
                                                        }
                                                        AbstractC1785a.m3243c(AbstractC3474d.m5710a(AbstractC2192a.m4014a(AbstractC2485h.m4428b(interfaceC2207pMo4021c4).mo4021c(c0046x0).mo4021c(interfaceC2207p6).mo4021c(interfaceC2207p7), new C0033Q0(0, c1260m4)).mo4021c(interfaceC2207p8).mo4021c(interfaceC2207p9), c3473c4), AbstractC1848j.m3314c(1412697320, new C0000A(c0920w4, c0078o08, z22, interfaceC1601c4, c1646u7, c0042v011, interfaceC2007c5, i44), c1383r6), c1383r6, 48);
                                                    } else {
                                                        c1383r6.m2563R();
                                                    }
                                                    return C0891q.f2780a;
                                                }
                                            }, c1383r5), c1383r5, 6);
                                        } else {
                                            c1383r5.m2563R();
                                        }
                                        return C0891q.f2780a;
                                    }
                                };
                                c1383r = c1383r3;
                                m78e(interfaceC2207pM746a, c0920w2, AbstractC1848j.m3314c(-814563849, interfaceC1603e, c1383r), c1383r, 384);
                            }
                        }
                        interfaceC2207p3 = interfaceC2207p2;
                        interfaceC2160t2 = interfaceC2160t;
                        c1357e4 = c1357e3;
                        c0024m = new C0024M(c0078o02, interfaceC1347YM2633w, c1647v, c0920w, c1636k2, (InterfaceC1046d) null);
                        interfaceC1347Y = interfaceC1347YM2633w;
                        c1647v2 = c1647v;
                        c1383r3.m2585g0(c0024m);
                        AbstractC1385s.m2615e(c1383r3, (InterfaceC1603e) c0024m, C0891q.f2780a);
                        zM2586h2 = c1383r3.m2586h(c0078o02);
                        objM2558L4 = c1383r3.m2558L();
                        if (zM2586h2) {
                            i19 = 1;
                            objM2558L4 = new C0012G(c0078o02, i19);
                            c1383r3.m2585g0(objM2558L4);
                            C0032Q c0032q2 = new C0032Q(4, (InterfaceC1601c) objM2558L4);
                            c2204m = C2204m.f7185a;
                            interfaceC2207pM265a = AbstractC0181N.m265a(c2204m, 8675309, c0032q2);
                            i20 = (c1383r3.m2586h(c0078o02) ? 1 : 0) | (i34 != 16384 ? i19 : 0) | (i33 != 2048 ? i19 : 0) | (c1383r3.m2586h(c0042v02) ? 1 : 0) | (c1383r3.m2586h(c0920w) ? 1 : 0);
                            Object objM2558L222 = c1383r3.m2558L();
                            if (i20 == 0) {
                                final boolean z192 = z11;
                                interfaceC2207p4 = interfaceC2207pM265a;
                                c2204m2 = c2204m;
                                c0042v03 = c0042v02;
                                obj2 = new InterfaceC1601c() { // from class: A.v
                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                    @Override // p112W2.InterfaceC1601c
                                    /* JADX INFO: renamed from: h */
                                    public final Object mo1h(Object obj3) {
                                        C2683b c2683b = (C2683b) obj3;
                                        C0078o0 c0078o052 = c0078o02;
                                        if (c0078o052.m121b()) {
                                            InterfaceC0686N0 interfaceC0686N02 = c0078o052.f339c;
                                            if (interfaceC0686N02 != null) {
                                                ((C0761s0) interfaceC0686N02).m1274b();
                                            }
                                        } else {
                                            C2590u.m4539a(c2590u);
                                        }
                                        if (c0078o052.m121b() && z192) {
                                            if (c0078o052.m120a() != EnumC0052b0.f212e) {
                                                C0036S0 c0036s0M123d = c0078o052.m123d();
                                                if (c0036s0M123d != null) {
                                                    long j11 = c2683b.f8556a;
                                                    C0038T0 c0038t03 = c0078o052.f340d;
                                                    C0012G c0012g2 = c0078o052.f358v;
                                                    int iM21b = c0036s0M123d.m21b(j11, true);
                                                    c0042v03.m58b(iM21b);
                                                    c0012g2.mo1h(C1646u.m2944a((C1646u) c0038t03.f170f, null, AbstractC1251D.m2313b(iM21b, iM21b), 5));
                                                    if (c0078o052.f337a.f402a.f4563e.length() > 0) {
                                                        c0078o052.f347k.setValue(EnumC0052b0.f213f);
                                                    }
                                                }
                                            } else {
                                                c0920w.m1932g(c2683b);
                                            }
                                        }
                                        return C0891q.f2780a;
                                    }
                                };
                                c1383r3.m2585g0(obj2);
                                if (!z6) {
                                }
                                C2029h c2029h2 = c0920w.f2890z;
                                C0918U c0918u2 = c0920w.f2889y;
                                zM2586h3 = c1383r3.m2586h(c0920w);
                                objM2558L5 = c1383r3.m2558L();
                                if (!zM2586h3) {
                                    objM2558L5 = new C0032Q(0, c0920w);
                                    c1383r3.m2585g0(objM2558L5);
                                    InterfaceC2207p interfaceC2207pMo4021c4 = interfaceC2207pM4014a3.mo4021c(new C0180M(c2029h2, c0918u2, null, (PointerInputEventHandler) objM2558L5, 4));
                                    InterfaceC0206t.f707a.getClass();
                                    InterfaceC2207p interfaceC2207pMo4021c22 = interfaceC2207pMo4021c4.mo4021c(new C0203q());
                                    i21 = (c1383r3.m2586h(c0078o02) ? 1 : 0) | (i17 != 4 ? i19 : 0) | (c1383r3.m2586h(c0042v03) ? 1 : 0);
                                    objM2558L6 = c1383r3.m2558L();
                                    if (i21 == 0) {
                                        objM2558L6 = new C0075n(c0078o02, c1646u2, c0042v03, i19);
                                        c1383r3.m2585g0(objM2558L6);
                                        final InterfaceC2207p interfaceC2207pM4429c2 = AbstractC2485h.m4429c(c2204m2, (InterfaceC1601c) objM2558L6);
                                        interfaceC0703W02 = interfaceC0703W0;
                                        i22 = (c1383r3.m2586h(c0078o02) ? 1 : 0) | (i33 != 2048 ? i19 : 0) | (c1383r3.m2582f(interfaceC0703W02) ? 1 : 0) | (c1383r3.m2586h(c0920w) ? 1 : 0) | (i17 != 4 ? i19 : 0) | (c1383r3.m2586h(c0042v03) ? 1 : 0);
                                        objM2558L7 = c1383r3.m2558L();
                                        if (i22 == 0) {
                                            int i352 = i19;
                                            final C0042V0 c0042v082 = c0042v03;
                                            final C1646u c1646u52 = c1646u2;
                                            i23 = i352;
                                            c1647v3 = c1647v2;
                                            InterfaceC1601c interfaceC1601c32 = new InterfaceC1601c() { // from class: A.w
                                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                @Override // p112W2.InterfaceC1601c
                                                /* JADX INFO: renamed from: h */
                                                public final Object mo1h(Object obj3) {
                                                    C1623A c1623a2;
                                                    InterfaceC0430v interfaceC0430v;
                                                    InterfaceC0430v interfaceC0430v2;
                                                    C0078o0 c0078o052 = c0078o02;
                                                    C1366i0 c1366i0 = c0078o052.f351o;
                                                    InterfaceC0430v interfaceC0430v3 = (InterfaceC0430v) obj3;
                                                    c0078o052.f344h = interfaceC0430v3;
                                                    C0036S0 c0036s0M123d = c0078o052.m123d();
                                                    if (c0036s0M123d != null) {
                                                        c0036s0M123d.f162b = interfaceC0430v3;
                                                    }
                                                    if (z6) {
                                                        EnumC0052b0 enumC0052b0M120a = c0078o052.m120a();
                                                        EnumC0052b0 enumC0052b0 = EnumC0052b0.f212e;
                                                        C0920W c0920w4 = c0920w;
                                                        C1646u c1646u6 = c1646u52;
                                                        if (enumC0052b0M120a == enumC0052b0) {
                                                            if (((Boolean) c0078o052.f348l.getValue()).booleanValue() && ((Boolean) ((C0662B0) interfaceC0703W02).f2101a.getValue()).booleanValue()) {
                                                                c0920w4.m1943r();
                                                            } else {
                                                                c0920w4.m1940o();
                                                            }
                                                            c0078o052.f349m.setValue(Boolean.valueOf(AbstractC1923e.m3450J(c0920w4, true)));
                                                            c0078o052.f350n.setValue(Boolean.valueOf(AbstractC1923e.m3450J(c0920w4, false)));
                                                            c1366i0.setValue(Boolean.valueOf(C1259L.m2335c(c1646u6.f5651b)));
                                                        } else if (c0078o052.m120a() == EnumC0052b0.f213f) {
                                                            c1366i0.setValue(Boolean.valueOf(AbstractC1923e.m3450J(c0920w4, true)));
                                                        }
                                                        C0042V0 c0042v092 = c0042v082;
                                                        AbstractC0070k0.m88o(c0078o052, c1646u6, c0042v092);
                                                        C0036S0 c0036s0M123d2 = c0078o052.m123d();
                                                        if (c0036s0M123d2 != null && (c1623a2 = c0078o052.f341e) != null && c0078o052.m121b() && (interfaceC0430v = c0036s0M123d2.f162b) != null && interfaceC0430v.mo632D() && (interfaceC0430v2 = c0036s0M123d2.f163c) != null) {
                                                            C1257J c1257j = c0036s0M123d2.f161a;
                                                            C0001A0 c0001a0 = new C0001A0(0, interfaceC0430v);
                                                            C2684c c2684cM3211Y = AbstractC1784a.m3211Y(interfaceC0430v);
                                                            C2684c c2684cMo634K = interfaceC0430v.mo634K(interfaceC0430v2, false);
                                                            if (AbstractC1665j.m2981a((C1623A) c1623a2.f5583a.f5654b.get(), c1623a2)) {
                                                                c1623a2.f5584b.mo1418h(c1646u6, c0042v092, c1257j, c0001a0, c2684cM3211Y, c2684cMo634K);
                                                            }
                                                        }
                                                    }
                                                    return C0891q.f2780a;
                                                }
                                            };
                                            interfaceC0703W03 = interfaceC0703W02;
                                            c0042v03 = c0042v082;
                                            c1383r3.m2585g0(interfaceC1601c32);
                                            objM2558L7 = interfaceC1601c32;
                                            final InterfaceC2207p interfaceC2207pM696i2 = AbstractC0435z.m696i(c2204m2, (InterfaceC1601c) objM2558L7);
                                            C0078o0 c0078o052 = c0078o02;
                                            c0920w2 = c0920w;
                                            i24 = i23;
                                            C0813e c0813e2 = new C0813e(c1624b, c1646u, c0078o052, z6, c0042v03, c0920w2, c1636k, c2590u);
                                            c0078o03 = c0078o052;
                                            if (!z6) {
                                                if (((!z6 && ((Boolean) ((C0662B0) interfaceC0703W03).f2101a.getValue()).booleanValue() && C1259L.m2335c(((C1259L) c0078o03.f335A.getValue()).f4538a) && C1259L.m2335c(((C1259L) c0078o03.f336B.getValue()).f4538a)) ? i24 : 0) == 0) {
                                                }
                                                zM2586h4 = c1383r3.m2586h(c0920w2);
                                                objM2558L8 = c1383r3.m2558L();
                                                if (!zM2586h4) {
                                                    objM2558L8 = new C0089u(c0920w2, 0);
                                                    c1383r3.m2585g0(objM2558L8);
                                                    AbstractC1385s.m2613c(c0920w2, (InterfaceC1601c) objM2558L8, c1383r3);
                                                    if (i14 > 32) {
                                                        i25 = (c1383r3.m2586h(c0078o03) ? 1 : 0) | (c1383r3.m2586h(c1647v3) ? 1 : 0) | (i17 != 4 ? i24 : 0) | (((i14 > 32 || !c1383r3.m2582f(c1636k)) && (i16 & 48) != 32) ? 0 : i24);
                                                        objM2558L9 = c1383r3.m2558L();
                                                        if (i25 != 0) {
                                                            C0006D c0006d2 = new C0006D(c0078o03, c1647v3, c1646u, c1636k, 0);
                                                            c1636k3 = c1636k;
                                                            c1383r3.m2585g0(c0006d2);
                                                            objM2558L9 = c0006d2;
                                                            AbstractC1385s.m2613c(c1636k3, (InterfaceC1601c) objM2558L9, c1383r3);
                                                            final InterfaceC1601c c0012g2 = c0078o03.f358v;
                                                            if (i5 != i24) {
                                                            }
                                                            final int i372 = c1636k3.f5630e;
                                                            i27 = i26;
                                                            final C0042V0 c0042v0102 = c0042v04;
                                                            final boolean z202 = true;
                                                            final C0040U0 c0040u032 = c0040u0;
                                                            InterfaceC2207p interfaceC2207pM4014a42 = AbstractC2192a.m4014a(c2204m2, new InterfaceC1604f() { // from class: A.D0
                                                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                                @Override // p112W2.InterfaceC1604f
                                                                /* JADX INFO: renamed from: f */
                                                                public final Object mo5f(Object obj3, Object obj4, Object obj5) {
                                                                    ((Integer) obj5).getClass();
                                                                    C1383r c1383r5 = (C1383r) ((InterfaceC1373m) obj4);
                                                                    c1383r5.m2568W(851809892);
                                                                    Object objM2558L23 = c1383r5.m2558L();
                                                                    C1357e c1357e8 = C1371l.f4833a;
                                                                    if (objM2558L23 == c1357e8) {
                                                                        objM2558L23 = new C0929c0();
                                                                        c1383r5.m2585g0(objM2558L23);
                                                                    }
                                                                    C0929c0 c0929c0 = (C0929c0) objM2558L23;
                                                                    Object objM2558L24 = c1383r5.m2558L();
                                                                    if (objM2558L24 == c1357e8) {
                                                                        objM2558L24 = new C0047Y();
                                                                        c1383r5.m2585g0(objM2558L24);
                                                                    }
                                                                    C0005C0 c0005c0 = new C0005C0(c0078o03, c0920w2, c1646u, z202, z14, c0929c0, c0042v0102, c0040u032, (C0047Y) objM2558L24, c0012g2, i372);
                                                                    boolean zM2586h7 = c1383r5.m2586h(c0005c0);
                                                                    Object objM2558L25 = c1383r5.m2558L();
                                                                    if (zM2586h7 || objM2558L25 == c1357e8) {
                                                                        C0009E0 c0009e0 = new C0009E0(1, c0005c0, C0005C0.class, "process", "process-ZmokQxo(Landroid/view/KeyEvent;)Z", 0, 0, 0);
                                                                        c1383r5.m2585g0(c0009e0);
                                                                        objM2558L25 = c0009e0;
                                                                    }
                                                                    InterfaceC2207p interfaceC2207pM5766d = AbstractC3510c.m5766d((InterfaceC1601c) ((C1663h) objM2558L25));
                                                                    c1383r5.m2597p(false);
                                                                    return interfaceC2207pM5766d;
                                                                }
                                                            });
                                                            int i382 = c1636k3.f5629d;
                                                            if (i382 == 7) {
                                                                boolean zBooleanValue2 = ((Boolean) interfaceC1347Y.getValue()).booleanValue();
                                                                zM2584g = c1383r3.m2584g(z15) | c1383r3.m2586h(c0811c);
                                                                objM2558L10 = c1383r3.m2558L();
                                                                if (!zM2584g) {
                                                                    objM2558L10 = new C0008E(0, c0811c, z15);
                                                                    c1383r3.m2585g0(objM2558L10);
                                                                    InterfaceC2207p interfaceC2207pM1127a2 = AbstractC0655b.m1127a(zBooleanValue2, z15, (InterfaceC1599a) objM2558L10);
                                                                    c2740o2 = (AbstractC2758q) c1383r3.m2590j(AbstractC0069k.f300a);
                                                                    j6 = ((C2762u) c1383r3.m2590j(AbstractC0069k.f301b)).f8764a;
                                                                    if (!C2762u.m4921c(j6, AbstractC2767z.m4933c(1308617531))) {
                                                                    }
                                                                    zM2586h5 = c1383r3.m2586h(c0078o03) | c1383r3.m2582f(c2740o2);
                                                                    objM2558L11 = c1383r3.m2558L();
                                                                    if (!zM2586h5) {
                                                                        objM2558L11 = new C0010F(0, c0078o03, c2740o2);
                                                                        c1383r3.m2585g0(objM2558L11);
                                                                        int i392 = 0;
                                                                        InterfaceC2207p interfaceC2207pMo4021c32 = AbstractC3510c.m5767e(AbstractC3510c.m5767e(AbstractC0825q.m1468m(interfaceC2207p.mo4021c(AbstractC2485h.m4431e(c2204m2, (InterfaceC1601c) objM2558L11)), c0811c, c0078o03, c0920w2).mo4021c(interfaceC2207pM1127a2).mo4021c(interfaceC2207p3), new C0045X(interfaceC2581l3, c0078o03)), new C0045X(i392, c0078o03, c0920w2)).mo4021c(interfaceC2207pM4014a42);
                                                                        final C0029O0 c0029o032 = c0029o0;
                                                                        int i402 = 5;
                                                                        InterfaceC2207p interfaceC2207pM746a2 = AbstractC0464i.m746a(AbstractC0435z.m696i(interfaceC2207pMo4021c32.mo4021c(new C2202k(new C0021K0(i392, c0029o032, z6))).mo4021c(interfaceC2207pMo4021c22).mo4021c(c0813e2), new C0012G(c0078o03, i392)), new C0352m(i402, c0920w2, interfaceC2160t2));
                                                                        if (z6) {
                                                                            i27 = 0;
                                                                            if (i27 == 0) {
                                                                            }
                                                                            final InterfaceC2007c interfaceC2007c42 = interfaceC2007c2;
                                                                            final C3473c c3473c32 = c3473c;
                                                                            final InterfaceC2207p interfaceC2207p52 = interfaceC2207pM4014a;
                                                                            final boolean z212 = i27;
                                                                            final C0078o0 c0078o062 = c0078o03;
                                                                            InterfaceC1603e interfaceC1603e2 = new InterfaceC1603e() { // from class: A.H
                                                                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                                                @Override // p112W2.InterfaceC1603e
                                                                                /* JADX INFO: renamed from: g */
                                                                                public final Object mo0g(Object obj3, Object obj4) {
                                                                                    InterfaceC1373m interfaceC1373m2 = (InterfaceC1373m) obj3;
                                                                                    int iIntValue = ((Integer) obj4).intValue();
                                                                                    C1383r c1383r5 = (C1383r) interfaceC1373m2;
                                                                                    if (c1383r5.m2560O(iIntValue & 1, (iIntValue & 3) != 2)) {
                                                                                        final C0078o0 c0078o07 = c0078o062;
                                                                                        final C1260M c1260m3 = c1260m;
                                                                                        final int i41 = i6;
                                                                                        final int i42 = i5;
                                                                                        final C0029O0 c0029o04 = c0029o032;
                                                                                        final C1646u c1646u6 = c1646u;
                                                                                        final C0363A c0363a2 = c0363a;
                                                                                        final InterfaceC2207p interfaceC2207p6 = interfaceC2207p52;
                                                                                        final InterfaceC2207p interfaceC2207p7 = interfaceC2207pM4429c2;
                                                                                        final InterfaceC2207p interfaceC2207p8 = interfaceC2207pM696i2;
                                                                                        final InterfaceC2207p interfaceC2207p9 = interfaceC2207pM4014a2;
                                                                                        final C3473c c3473c4 = c3473c32;
                                                                                        final C0920W c0920w4 = c0920w2;
                                                                                        final boolean z22 = z212;
                                                                                        final InterfaceC1601c interfaceC1601c4 = interfaceC1601c2;
                                                                                        final C0042V0 c0042v011 = c0042v0102;
                                                                                        final InterfaceC2007c interfaceC2007c5 = interfaceC2007c42;
                                                                                        c1843e.mo5f(AbstractC1848j.m3314c(-44346382, new InterfaceC1603e() { // from class: A.y
                                                                                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                                                            @Override // p112W2.InterfaceC1603e
                                                                                            /* JADX INFO: renamed from: g */
                                                                                            public final Object mo0g(Object obj5, Object obj6) {
                                                                                                InterfaceC2207p c0046x0;
                                                                                                C1646u c1646u7 = c1646u6;
                                                                                                long j11 = c1646u7.f5651b;
                                                                                                InterfaceC1373m interfaceC1373m3 = (InterfaceC1373m) obj5;
                                                                                                int iIntValue2 = ((Integer) obj6).intValue();
                                                                                                C1383r c1383r6 = (C1383r) interfaceC1373m3;
                                                                                                if (c1383r6.m2560O(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                                                                                    C0078o0 c0078o08 = c0078o07;
                                                                                                    InterfaceC2207p interfaceC2207pM5523j = AbstractC3261c.m5523j(C2204m.f7185a, ((C2010f) c0078o08.f343g.getValue()).f6732d, 0.0f, 2);
                                                                                                    final int i43 = i41;
                                                                                                    final int i44 = i42;
                                                                                                    final C1260M c1260m4 = c1260m3;
                                                                                                    InterfaceC2207p interfaceC2207pMo4021c42 = interfaceC2207pM5523j.mo4021c(new C2202k(new InterfaceC1604f() { // from class: A.c0
                                                                                                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                                                                        @Override // p112W2.InterfaceC1604f
                                                                                                        /* JADX INFO: renamed from: f */
                                                                                                        public final Object mo5f(Object obj7, Object obj8, Object obj9) {
                                                                                                            ((Integer) obj9).getClass();
                                                                                                            C1383r c1383r7 = (C1383r) ((InterfaceC1373m) obj8);
                                                                                                            c1383r7.m2568W(408240218);
                                                                                                            int i45 = i43;
                                                                                                            int i46 = i44;
                                                                                                            AbstractC0070k0.m91r(i45, i46);
                                                                                                            C2204m c2204m3 = C2204m.f7185a;
                                                                                                            if (i45 == 1 && i46 == Integer.MAX_VALUE) {
                                                                                                                c1383r7.m2597p(false);
                                                                                                                return c2204m3;
                                                                                                            }
                                                                                                            InterfaceC2007c interfaceC2007c6 = (InterfaceC2007c) c1383r7.m2590j(AbstractC0757q0.f2358h);
                                                                                                            InterfaceC1580e interfaceC1580e3 = (InterfaceC1580e) c1383r7.m2590j(AbstractC0757q0.f2361k);
                                                                                                            EnumC2017m enumC2017m = (EnumC2017m) c1383r7.m2590j(AbstractC0757q0.f2364n);
                                                                                                            C1260M c1260m5 = c1260m4;
                                                                                                            boolean zM2582f4 = c1383r7.m2582f(c1260m5) | c1383r7.m2578d(enumC2017m.ordinal());
                                                                                                            Object objM2558L23 = c1383r7.m2558L();
                                                                                                            C1357e c1357e8 = C1371l.f4833a;
                                                                                                            if (zM2582f4 || objM2558L23 == c1357e8) {
                                                                                                                objM2558L23 = AbstractC1251D.m2319h(c1260m5, enumC2017m);
                                                                                                                c1383r7.m2585g0(objM2558L23);
                                                                                                            }
                                                                                                            C1260M c1260m6 = (C1260M) objM2558L23;
                                                                                                            boolean zM2582f5 = c1383r7.m2582f(interfaceC1580e3) | c1383r7.m2582f(c1260m6);
                                                                                                            Object objM2558L24 = c1383r7.m2558L();
                                                                                                            if (zM2582f5 || objM2558L24 == c1357e8) {
                                                                                                                C1252E c1252e = c1260m6.f4540a;
                                                                                                                AbstractC1592q abstractC1592q = c1252e.f4499f;
                                                                                                                C1587l c1587l = c1252e.f4496c;
                                                                                                                if (c1587l == null) {
                                                                                                                    c1587l = C1587l.f5502f;
                                                                                                                }
                                                                                                                C1585j c1585j = c1252e.f4497d;
                                                                                                                int i47 = c1585j != null ? c1585j.f5499a : 0;
                                                                                                                C1586k c1586k = c1252e.f4498e;
                                                                                                                objM2558L24 = ((C1581f) interfaceC1580e3).m2854b(abstractC1592q, c1587l, i47, c1586k != null ? c1586k.f5500a : 65535);
                                                                                                                c1383r7.m2585g0(objM2558L24);
                                                                                                            }
                                                                                                            InterfaceC1339T0 interfaceC1339T0 = (InterfaceC1339T0) objM2558L24;
                                                                                                            boolean zM2582f6 = c1383r7.m2582f(interfaceC1339T0.getValue()) | c1383r7.m2582f(interfaceC2007c6) | c1383r7.m2582f(interfaceC1580e3) | c1383r7.m2582f(c1260m5) | c1383r7.m2578d(enumC2017m.ordinal());
                                                                                                            Object objM2558L25 = c1383r7.m2558L();
                                                                                                            if (zM2582f6 || objM2558L25 == c1357e8) {
                                                                                                                objM2558L25 = Integer.valueOf((int) (AbstractC0003B0.m2a(c1260m6, interfaceC2007c6, interfaceC1580e3, AbstractC0003B0.f13a, 1) & 4294967295L));
                                                                                                                c1383r7.m2585g0(objM2558L25);
                                                                                                            }
                                                                                                            int iIntValue3 = ((Number) objM2558L25).intValue();
                                                                                                            boolean zM2582f7 = c1383r7.m2582f(interfaceC1339T0.getValue()) | c1383r7.m2582f(interfaceC2007c6) | c1383r7.m2582f(interfaceC1580e3) | c1383r7.m2582f(c1260m5) | c1383r7.m2578d(enumC2017m.ordinal());
                                                                                                            Object objM2558L26 = c1383r7.m2558L();
                                                                                                            if (zM2582f7 || objM2558L26 == c1357e8) {
                                                                                                                StringBuilder sb = new StringBuilder();
                                                                                                                String str = AbstractC0003B0.f13a;
                                                                                                                sb.append(str);
                                                                                                                sb.append('\n');
                                                                                                                sb.append(str);
                                                                                                                objM2558L26 = Integer.valueOf((int) (AbstractC0003B0.m2a(c1260m6, interfaceC2007c6, interfaceC1580e3, sb.toString(), 2) & 4294967295L));
                                                                                                                c1383r7.m2585g0(objM2558L26);
                                                                                                            }
                                                                                                            int iIntValue4 = ((Number) objM2558L26).intValue() - iIntValue3;
                                                                                                            Integer numValueOf = i45 == 1 ? null : Integer.valueOf(((i45 - 1) * iIntValue4) + iIntValue3);
                                                                                                            Integer numValueOf2 = i46 != Integer.MAX_VALUE ? Integer.valueOf(((i46 - 1) * iIntValue4) + iIntValue3) : null;
                                                                                                            InterfaceC2207p interfaceC2207pM5522i = AbstractC3261c.m5522i(c2204m3, numValueOf != null ? interfaceC2007c6.mo283q0(numValueOf.intValue()) : Float.NaN, numValueOf2 != null ? interfaceC2007c6.mo283q0(numValueOf2.intValue()) : Float.NaN);
                                                                                                            c1383r7.m2597p(false);
                                                                                                            return interfaceC2207pM5522i;
                                                                                                        }
                                                                                                    }));
                                                                                                    boolean zM2586h7 = c1383r6.m2586h(c0078o08);
                                                                                                    Object objM2558L23 = c1383r6.m2558L();
                                                                                                    if (zM2586h7 || objM2558L23 == C1371l.f4833a) {
                                                                                                        objM2558L23 = new C0099z(0, c0078o08);
                                                                                                        c1383r6.m2585g0(objM2558L23);
                                                                                                    }
                                                                                                    InterfaceC1599a interfaceC1599a = (InterfaceC1599a) objM2558L23;
                                                                                                    C0029O0 c0029o05 = c0029o04;
                                                                                                    EnumC2983d0 enumC2983d03 = (EnumC2983d0) c0029o05.f147f.getValue();
                                                                                                    int i45 = C1259L.f4537c;
                                                                                                    int iM2338f = (int) (j11 >> 32);
                                                                                                    long j12 = c0029o05.f146e;
                                                                                                    if (iM2338f == ((int) (j12 >> 32)) && (iM2338f = (int) (j11 & 4294967295L)) == ((int) (j12 & 4294967295L))) {
                                                                                                        iM2338f = C1259L.m2338f(j11);
                                                                                                    }
                                                                                                    c0029o05.f146e = j11;
                                                                                                    C1624B c1624bM85l2 = AbstractC0070k0.m85l(c0363a2, c1646u7.f5650a);
                                                                                                    int iOrdinal = enumC2983d03.ordinal();
                                                                                                    if (iOrdinal == 0) {
                                                                                                        c0046x0 = new C0046X0(c0029o05, iM2338f, c1624bM85l2, interfaceC1599a);
                                                                                                    } else {
                                                                                                        if (iOrdinal != 1) {
                                                                                                            throw new C0330q();
                                                                                                        }
                                                                                                        c0046x0 = new C0058e0(c0029o05, iM2338f, c1624bM85l2, interfaceC1599a);
                                                                                                    }
                                                                                                    AbstractC1785a.m3243c(AbstractC3474d.m5710a(AbstractC2192a.m4014a(AbstractC2485h.m4428b(interfaceC2207pMo4021c42).mo4021c(c0046x0).mo4021c(interfaceC2207p6).mo4021c(interfaceC2207p7), new C0033Q0(0, c1260m4)).mo4021c(interfaceC2207p8).mo4021c(interfaceC2207p9), c3473c4), AbstractC1848j.m3314c(1412697320, new C0000A(c0920w4, c0078o08, z22, interfaceC1601c4, c1646u7, c0042v011, interfaceC2007c5, i44), c1383r6), c1383r6, 48);
                                                                                                } else {
                                                                                                    c1383r6.m2563R();
                                                                                                }
                                                                                                return C0891q.f2780a;
                                                                                            }
                                                                                        }, c1383r5), c1383r5, 6);
                                                                                    } else {
                                                                                        c1383r5.m2563R();
                                                                                    }
                                                                                    return C0891q.f2780a;
                                                                                }
                                                                            };
                                                                            c1383r = c1383r3;
                                                                            m78e(interfaceC2207pM746a2, c0920w2, AbstractC1848j.m3314c(-814563849, interfaceC1603e2, c1383r), c1383r, 384);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        i25 = (c1383r3.m2586h(c0078o03) ? 1 : 0) | (c1383r3.m2586h(c1647v3) ? 1 : 0) | (i17 != 4 ? i24 : 0) | (((i14 > 32 || !c1383r3.m2582f(c1636k)) && (i16 & 48) != 32) ? 0 : i24);
                                                        objM2558L9 = c1383r3.m2558L();
                                                        if (i25 != 0) {
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        interfaceC2207p2 = interfaceC2207pM5054h;
                    }
                    z12 = true;
                    z13 = zM2582f3 | z12;
                    Object objM2558L212 = c1383r3.m2558L();
                    if (z13) {
                    }
                    interfaceC2207p3 = interfaceC2207p2;
                    interfaceC2160t2 = interfaceC2160t;
                    c1357e4 = c1357e3;
                    c0024m = new C0024M(c0078o02, interfaceC1347YM2633w, c1647v, c0920w, c1636k2, (InterfaceC1046d) null);
                    interfaceC1347Y = interfaceC1347YM2633w;
                    c1647v2 = c1647v;
                    c1383r3.m2585g0(c0024m);
                    AbstractC1385s.m2615e(c1383r3, (InterfaceC1603e) c0024m, C0891q.f2780a);
                    zM2586h2 = c1383r3.m2586h(c0078o02);
                    objM2558L4 = c1383r3.m2558L();
                    if (zM2586h2) {
                    }
                } else {
                    i15 = i13;
                }
                z10 = true;
                zM2586h = z18 | z10 | c1383r2.m2586h(c0042v07) | c1383r2.m2586h(interfaceC2160t3) | c1383r2.m2586h(c3473c2) | c1383r2.m2586h(c0920w3);
                Object objM2558L202 = c1383r2.m2558L();
                if (zM2586h) {
                    c1647v = c1647v4;
                    final C1646u c1646u42 = c1646u2;
                    c1383r3 = c1383r2;
                    c1357e2 = c1357e6;
                    i16 = i28;
                    c0040u0 = c0040u02;
                    c0078o02 = c0078o04;
                    interfaceC2581l3 = interfaceC2581l2;
                    i17 = i15;
                    i18 = 32;
                    c1636k2 = c1636k;
                    obj = new InterfaceC1601c() { // from class: A.J
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        @Override // p112W2.InterfaceC1601c
                        /* JADX INFO: renamed from: h */
                        public final Object mo1h(Object obj3) {
                            C0036S0 c0036s0M123d;
                            EnumC2594y enumC2594y = (EnumC2594y) obj3;
                            C0078o0 c0078o053 = c0078o02;
                            if (c0078o053.m121b() != enumC2594y.m4540a()) {
                                c0078o053.f342f.setValue(Boolean.valueOf(enumC2594y.m4540a()));
                                boolean zM121b = c0078o053.m121b();
                                C1646u c1646u53 = c1646u42;
                                C0042V0 c0042v083 = c0042v07;
                                if (zM121b && z6) {
                                    AbstractC0070k0.m90q(c1647v, c0078o053, c1646u53, c1636k2, c0042v083);
                                } else {
                                    AbstractC0070k0.m84k(c0078o053);
                                }
                                if (enumC2594y.m4540a() && (c0036s0M123d = c0078o053.m123d()) != null) {
                                    AbstractC2162v.m3994p(interfaceC2160t3, null, new C0024M(c3473c2, c1646u53, c0078o053, c0036s0M123d, c0042v083, (InterfaceC1046d) null), 3);
                                }
                                if (!enumC2594y.m4540a()) {
                                    c0920w3.m1932g(null);
                                }
                            }
                            return C0891q.f2780a;
                        }
                    };
                    z11 = z6;
                    interfaceC2160t = interfaceC2160t3;
                    c1646u2 = c1646u42;
                    c0920w = c0920w3;
                    c3473c = c3473c2;
                    c0042v02 = c0042v07;
                    c1383r3.m2585g0(obj);
                    interfaceC2207pM5054h = AbstractC2856m.m5054h(AbstractC2573d.m4512s(AbstractC2573d.m4503j(c2590u), (InterfaceC1601c) obj), z11);
                    InterfaceC1347Y interfaceC1347YM2633w2 = AbstractC1385s.m2633w(Boolean.valueOf(z11), c1383r3);
                    boolean zM2582f32 = c1383r3.m2582f(interfaceC1347YM2633w2) | c1383r3.m2586h(c0078o02) | c1383r3.m2586h(c1647v) | c1383r3.m2586h(c0920w);
                    if (i14 > i18) {
                        interfaceC2207p2 = interfaceC2207pM5054h;
                        if ((i16 & 48) != i18) {
                            z12 = true;
                        }
                        z13 = zM2582f32 | z12;
                        Object objM2558L2122 = c1383r3.m2558L();
                        if (z13) {
                        }
                        interfaceC2207p3 = interfaceC2207p2;
                        interfaceC2160t2 = interfaceC2160t;
                        c1357e4 = c1357e3;
                        c0024m = new C0024M(c0078o02, interfaceC1347YM2633w2, c1647v, c0920w, c1636k2, (InterfaceC1046d) null);
                        interfaceC1347Y = interfaceC1347YM2633w2;
                        c1647v2 = c1647v;
                        c1383r3.m2585g0(c0024m);
                        AbstractC1385s.m2615e(c1383r3, (InterfaceC1603e) c0024m, C0891q.f2780a);
                        zM2586h2 = c1383r3.m2586h(c0078o02);
                        objM2558L4 = c1383r3.m2558L();
                        if (zM2586h2) {
                        }
                    }
                }
            } else {
                Long l3 = c0040u02.f178d;
                if (jCurrentTimeMillis > (l3 != null ? l3.longValue() : 0L) + ((long) 5000)) {
                }
                objM2558L = c1383r2.m2558L();
                if (objM2558L == c1357e6) {
                }
                final InterfaceC2160t interfaceC2160t32 = (InterfaceC2160t) objM2558L;
                objM2558L2 = c1383r2.m2558L();
                if (objM2558L2 == c1357e6) {
                }
                final C3473c c3473c22 = (C3473c) objM2558L2;
                objM2558L3 = c1383r2.m2558L();
                if (objM2558L3 == c1357e6) {
                }
                final C0920W c0920w32 = (C0920W) objM2558L3;
                final C0042V0 c0042v072 = c0042v0;
                c0920w32.f2866b = c0042v072;
                c0920w32.f2867c = c0078o04.f358v;
                c0920w32.f2868d = c0078o04;
                c0920w32.f2869e.setValue(c1646u2);
                c0920w32.f2886v = new C1259L(j5);
                c0920w32.f2871g = (InterfaceC0744l0) c1383r2.m2590j(AbstractC0757q0.f2356f);
                c0920w32.f2872h = interfaceC2160t32;
                c0920w32.f2874j = (InterfaceC3388a) c1383r2.m2590j(AbstractC0757q0.f2362l);
                c0920w32.f2875k = c2590u;
                c0920w32.f2876l.setValue(true);
                c0920w32.f2877m.setValue(Boolean.valueOf(z6));
                c1383r2.m2568W(1966756105);
                C1781b c1781b2 = c1260m2.f4540a.f4504k;
                C1341U0 c1341u02 = AbstractC0945q.f2972a;
                c1383r2.m2568W(430530635);
                if (Build.VERSION.SDK_INT >= 28) {
                }
                c0920w32.f2873i = c0943o;
                c1383r2.m2597p(z9);
                c0078o04.m121b();
                int i332 = i28 & 7168;
                int i342 = i28 & i11;
                boolean zM2586h62 = c1383r2.m2586h(c0078o04) | (i332 != 2048) | (i342 != 16384) | c1383r2.m2586h(c1647v4);
                i13 = i12;
                boolean z182 = zM2586h62 | (i13 != 4);
                i14 = (i28 & 112) ^ 48;
                if (i14 > 32) {
                }
                i15 = i13;
                if ((i28 & 48) != 32) {
                    z10 = true;
                }
                zM2586h = z182 | z10 | c1383r2.m2586h(c0042v072) | c1383r2.m2586h(interfaceC2160t32) | c1383r2.m2586h(c3473c22) | c1383r2.m2586h(c0920w32);
                Object objM2558L2022 = c1383r2.m2558L();
                if (zM2586h) {
                }
            }
        } else {
            c1383r = c1383r4;
            c1383r.m2563R();
        }
        C1388t0 c1388t0M2599r = c1383r.m2599r();
        if (c1388t0M2599r != null) {
            c1388t0M2599r.f4928d = new InterfaceC1603e() { // from class: A.I
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // p112W2.InterfaceC1603e
                /* JADX INFO: renamed from: g */
                public final Object mo0g(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    int iM2609A = AbstractC1385s.m2609A(i7 | 1);
                    int iM2609A2 = AbstractC1385s.m2609A(i8);
                    AbstractC0070k0.m77d(c1646u, interfaceC1601c, interfaceC2207p, c1260m, c0363a, interfaceC1601c2, c2740o, z5, i5, i6, c1636k, c0074m0, z6, c1843e, (InterfaceC1373m) obj3, iM2609A, iM2609A2);
                    return C0891q.f2780a;
                }
            };
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static final void m78e(InterfaceC2207p interfaceC2207p, C0920W c0920w, C1843e c1843e, InterfaceC1373m interfaceC1373m, int i5) {
        C1383r c1383r = (C1383r) interfaceC1373m;
        c1383r.m2569X(2036174316);
        int i6 = (c1383r.m2582f(interfaceC2207p) ? 4 : 2) | i5 | (c1383r.m2586h(c0920w) ? 32 : 16);
        if (c1383r.m2560O(i6 & 1, (i6 & 147) != 146)) {
            InterfaceC0377O interfaceC0377OM5561d = AbstractC3282o.m5561d(C2194c.f7160d, true);
            int iHashCode = Long.hashCode(c1383r.f4882T);
            InterfaceC1378o0 interfaceC1378o0M2593l = c1383r.m2593l();
            InterfaceC2207p interfaceC2207pM4016c = AbstractC2192a.m4016c(c1383r, interfaceC2207p);
            InterfaceC0593g.f1909a.getClass();
            C0551B c0551b = C0591f.f1902b;
            c1383r.m2571Z();
            if (c1383r.f4881S) {
                c1383r.m2592k(c0551b);
            } else {
                c1383r.m2591j0();
            }
            AbstractC1385s.m2635y(c1383r, C0591f.f1905e, interfaceC0377OM5561d);
            AbstractC1385s.m2635y(c1383r, C0591f.f1904d, interfaceC1378o0M2593l);
            AbstractC1385s.m2627q(c1383r, Integer.valueOf(iHashCode), C0591f.f1906f);
            AbstractC1385s.m2631u(c1383r, C0591f.f1907g);
            AbstractC1385s.m2635y(c1383r, C0591f.f1903c, interfaceC2207pM4016c);
            m76c(c0920w, c1843e, c1383r, (i6 >> 3) & 126);
            c1383r.m2597p(true);
        } else {
            c1383r.m2563R();
        }
        C1388t0 c1388t0M2599r = c1383r.m2599r();
        if (c1388t0M2599r != null) {
            c1388t0M2599r.f4928d = new C0095x(interfaceC2207p, c0920w, c1843e, i5, 0);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static final void m79f(C0920W c0920w, boolean z5, InterfaceC1373m interfaceC1373m, int i5) {
        C0036S0 c0036s0M123d;
        C1383r c1383r = (C1383r) interfaceC1373m;
        c1383r.m2569X(626339208);
        int i6 = (c1383r.m2586h(c0920w) ? 4 : 2) | i5 | (c1383r.m2584g(z5) ? 32 : 16);
        if (!c1383r.m2560O(i6 & 1, (i6 & 19) != 18)) {
            c1383r.m2563R();
        } else if (z5) {
            c1383r.m2568W(1530097388);
            C0078o0 c0078o0 = c0920w.f2868d;
            C1257J c1257j = null;
            if (c0078o0 != null && (c0036s0M123d = c0078o0.m123d()) != null) {
                C1257J c1257j2 = c0036s0M123d.f161a;
                C0078o0 c0078o02 = c0920w.f2868d;
                if (!(c0078o02 != null ? c0078o02.f352p : true)) {
                    c1257j = c1257j2;
                }
            }
            if (c1257j == null) {
                c1383r.m2568W(1530097387);
            } else {
                c1383r.m2568W(1530097388);
                if (C1259L.m2335c(c0920w.m1939n().f5651b)) {
                    c1383r.m2568W(2062097806);
                } else {
                    c1383r.m2568W(2109807302);
                    C0042V0 c0042v0 = c0920w.f2866b;
                    int i7 = (int) (c0920w.m1939n().f5651b >> 32);
                    c0042v0.m57a(i7);
                    C0042V0 c0042v02 = c0920w.f2866b;
                    int i8 = (int) (c0920w.m1939n().f5651b & 4294967295L);
                    c0042v02.m57a(i8);
                    EnumC1960j enumC1960jM2324a = c1257j.m2324a(i7);
                    EnumC1960j enumC1960jM2324a2 = c1257j.m2324a(Math.max(i8 - 1, 0));
                    C0078o0 c0078o03 = c0920w.f2868d;
                    if (c0078o03 == null || !((Boolean) c0078o03.f349m.getValue()).booleanValue()) {
                        c1383r.m2568W(2062097806);
                    } else {
                        c1383r.m2568W(2110225306);
                        AbstractC1922d.m3426e(true, enumC1960jM2324a, c0920w, c1383r, ((i6 << 6) & 896) | 6);
                    }
                    c1383r.m2597p(false);
                    C0078o0 c0078o04 = c0920w.f2868d;
                    if (c0078o04 == null || !((Boolean) c0078o04.f350n.getValue()).booleanValue()) {
                        c1383r.m2568W(2062097806);
                    } else {
                        c1383r.m2568W(2110574459);
                        AbstractC1922d.m3426e(false, enumC1960jM2324a2, c0920w, c1383r, ((i6 << 6) & 896) | 6);
                    }
                    c1383r.m2597p(false);
                }
                c1383r.m2597p(false);
                C0078o0 c0078o05 = c0920w.f2868d;
                if (c0078o05 != null) {
                    C1366i0 c1366i0 = c0078o05.f348l;
                    if (!AbstractC1665j.m2981a(c0920w.f2884t.f5650a.f4563e, c0920w.m1939n().f5650a.f4563e)) {
                        c1366i0.setValue(Boolean.FALSE);
                    }
                    if (c0078o05.m121b()) {
                        if (((Boolean) c1366i0.getValue()).booleanValue()) {
                            c0920w.m1943r();
                        } else {
                            c0920w.m1940o();
                        }
                    }
                }
            }
            c1383r.m2597p(false);
            c1383r.m2597p(false);
        } else {
            c1383r.m2568W(1989076778);
            c1383r.m2597p(false);
            c0920w.m1940o();
        }
        C1388t0 c1388t0M2599r = c1383r.m2599r();
        if (c1388t0M2599r != null) {
            c1388t0M2599r.f4928d = new C0004C(c0920w, z5, i5);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static final void m80g(C0920W c0920w, InterfaceC1373m interfaceC1373m, int i5) {
        C1269g c1269gM1938m;
        C1383r c1383r = (C1383r) interfaceC1373m;
        c1383r.m2569X(-1436003720);
        int i6 = (c1383r.m2586h(c0920w) ? 4 : 2) | i5;
        int i7 = 1;
        if (c1383r.m2560O(i6 & 1, (i6 & 3) != 2)) {
            C0078o0 c0078o0 = c0920w.f2868d;
            if (c0078o0 == null || !((Boolean) c0078o0.f351o.getValue()).booleanValue() || (c1269gM1938m = c0920w.m1938m()) == null || c1269gM1938m.f4563e.length() <= 0) {
                c1383r.m2568W(2132946858);
            } else {
                c1383r.m2568W(-2112351432);
                boolean zM2582f = c1383r.m2582f(c0920w);
                Object objM2558L = c1383r.m2558L();
                C1357e c1357e = C1371l.f4833a;
                if (zM2582f || objM2558L == c1357e) {
                    objM2558L = new C0915Q(c0920w);
                    c1383r.m2585g0(objM2558L);
                }
                InterfaceC0092v0 interfaceC0092v0 = (InterfaceC0092v0) objM2558L;
                InterfaceC2007c interfaceC2007c = (InterfaceC2007c) c1383r.m2590j(AbstractC0757q0.f2358h);
                C0042V0 c0042v0 = c0920w.f2866b;
                long j5 = c0920w.m1939n().f5651b;
                int i8 = C1259L.f4537c;
                int i9 = (int) (j5 >> 32);
                c0042v0.m57a(i9);
                C0078o0 c0078o02 = c0920w.f2868d;
                C0036S0 c0036s0M123d = c0078o02 != null ? c0078o02.m123d() : null;
                AbstractC1665j.m2982b(c0036s0M123d);
                C1257J c1257j = c0036s0M123d.f161a;
                C2684c c2684cM2326c = c1257j.m2326c(AbstractC1926h.m3568k(i9, 0, c1257j.f4526a.f4516a.f4563e.length()));
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(c2684cM2326c.f8561d)) & 4294967295L) | (((long) Float.floatToRawIntBits((interfaceC2007c.mo268G(AbstractC0100z0.f461a) / 2) + c2684cM2326c.f8558a)) << 32);
                boolean zM2580e = c1383r.m2580e(jFloatToRawIntBits);
                Object objM2558L2 = c1383r.m2558L();
                if (zM2580e || objM2558L2 == c1357e) {
                    objM2558L2 = new C0035S(jFloatToRawIntBits);
                    c1383r.m2585g0(objM2558L2);
                }
                InterfaceC0940l interfaceC0940l = (InterfaceC0940l) objM2558L2;
                boolean zM2586h = c1383r.m2586h(interfaceC0092v0) | c1383r.m2586h(c0920w);
                Object objM2558L3 = c1383r.m2558L();
                if (zM2586h || objM2558L3 == c1357e) {
                    objM2558L3 = new C0043W(interfaceC0092v0, c0920w);
                    c1383r.m2585g0(objM2558L3);
                }
                InterfaceC2207p interfaceC2207pM265a = AbstractC0181N.m265a(C2204m.f7185a, interfaceC0092v0, (PointerInputEventHandler) objM2558L3);
                boolean zM2580e2 = c1383r.m2580e(jFloatToRawIntBits);
                Object objM2558L4 = c1383r.m2558L();
                if (zM2580e2 || objM2558L4 == c1357e) {
                    objM2558L4 = new C0059f(jFloatToRawIntBits, i7);
                    c1383r.m2585g0(objM2558L4);
                }
                AbstractC0063h.m61a(interfaceC0940l, AbstractC1126m.m2162a(interfaceC2207pM265a, false, (InterfaceC1601c) objM2558L4), 0L, c1383r, 0);
            }
            c1383r.m2597p(false);
        } else {
            c1383r.m2563R();
        }
        C1388t0 c1388t0M2599r = c1383r.m2599r();
        if (c1388t0M2599r != null) {
            c1388t0M2599r.f4928d = new C0002B(c0920w, i5);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static final C2684c m81h(AbstractC0389a0 abstractC0389a0, int i5, C1624B c1624b, C1257J c1257j, boolean z5, int i6) {
        C2684c c2684cM2326c;
        if (c1257j != null) {
            c1624b.f5586b.m57a(i5);
            c2684cM2326c = c1257j.m2326c(i5);
        } else {
            c2684cM2326c = C2684c.f8557e;
        }
        float f2 = c2684cM2326c.f8558a;
        int iMo270S = abstractC0389a0.mo270S(AbstractC0100z0.f461a);
        return new C2684c(z5 ? (i6 - f2) - iMo270S : f2, c2684cM2326c.f8559b, z5 ? i6 - f2 : iMo270S + f2, c2684cM2326c.f8561d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static final boolean m82i(int i5, KeyEvent keyEvent) {
        return ((int) (AbstractC3510c.m5764b(keyEvent) >> 32)) == i5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static final int m83j(float f2) {
        return Math.round((float) Math.ceil(f2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static final void m84k(C0078o0 c0078o0) {
        C1623A c1623a = c0078o0.f341e;
        if (c1623a != null) {
            c0078o0.f358v.mo1h(C1646u.m2944a((C1646u) c0078o0.f340d.f170f, null, 0L, 3));
            C1647v c1647v = c1623a.f5583a;
            AtomicReference atomicReference = c1647v.f5654b;
            while (true) {
                if (atomicReference.compareAndSet(c1623a, null)) {
                    c1647v.f5653a.mo1417g();
                    break;
                } else if (atomicReference.get() != c1623a) {
                    break;
                }
            }
        }
        c0078o0.f341e = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public static final C1624B m85l(C0363A c0363a, C1269g c1269g) {
        c0363a.getClass();
        int length = c1269g.f4563e.length();
        String str = c1269g.f4563e;
        int length2 = str.length();
        int iMin = Math.min(length, 100);
        for (int i5 = 0; i5 < iMin; i5++) {
            m92s(i5, length2, i5);
        }
        m92s(length, length2, length);
        int iMin2 = Math.min(length2, 100);
        for (int i6 = 0; i6 < iMin2; i6++) {
            m93t(i6, length, i6);
        }
        m93t(length2, length, length2);
        return new C1624B(c1269g, new C0042V0(str.length(), str.length()));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public static final int m86m(CharSequence charSequence, int i5) {
        int length = charSequence.length();
        while (i5 < length) {
            if (charSequence.charAt(i5) == '\n') {
                return i5;
            }
            i5++;
        }
        return charSequence.length();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public static final int m87n(CharSequence charSequence, int i5) {
        while (i5 > 0) {
            if (charSequence.charAt(i5 - 1) == '\n') {
                return i5;
            }
            i5--;
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public static final void m88o(C0078o0 c0078o0, C1646u c1646u, C0042V0 c0042v0) {
        AbstractC2074f abstractC2074fM3853e = AbstractC2086r.m3853e();
        InterfaceC1601c interfaceC1601cMo3789e = abstractC2074fM3853e != null ? abstractC2074fM3853e.mo3789e() : null;
        AbstractC2074f abstractC2074fM3856h = AbstractC2086r.m3856h(abstractC2074fM3853e);
        try {
            C0036S0 c0036s0M123d = c0078o0.m123d();
            if (c0036s0M123d == null) {
                return;
            }
            C1623A c1623a = c0078o0.f341e;
            if (c1623a == null) {
                return;
            }
            InterfaceC0430v interfaceC0430vM122c = c0078o0.m122c();
            if (interfaceC0430vM122c == null) {
                return;
            }
            m89p(c1646u, c0078o0.f337a, c0036s0M123d.f161a, interfaceC0430vM122c, c1623a, c0078o0.m121b(), c0042v0);
        } finally {
            AbstractC2086r.m3859k(abstractC2074fM3853e, abstractC2074fM3856h, interfaceC1601cMo3789e);
        }
    }

    /* JADX DEBUG: Class process forced to load method for inline: A.B0.b(S0.M, e1.c, W0.e):long */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public static void m89p(C1646u c1646u, C0090u0 c0090u0, C1257J c1257j, InterfaceC0430v interfaceC0430v, C1623A c1623a, boolean z5, C0042V0 c0042v0) {
        if (z5) {
            int iM2337e = C1259L.m2337e(c1646u.f5651b);
            c0042v0.m57a(iM2337e);
            String str = AbstractC0003B0.f13a;
            C2684c c2684cM2325b = iM2337e < c1257j.f4526a.f4516a.f4563e.length() ? c1257j.m2325b(iM2337e) : iM2337e != 0 ? c1257j.m2325b(iM2337e - 1) : new C2684c(0.0f, 0.0f, 1.0f, (int) (new C2016l(AbstractC0003B0.m2a(c0090u0.f403b, c0090u0.f408g, c0090u0.f409h, AbstractC0003B0.f13a, 1)).f6741a & 4294967295L));
            float f2 = c2684cM2325b.f8559b;
            float f5 = c2684cM2325b.f8558a;
            long jMo638R = interfaceC0430v.mo638R((((long) Float.floatToRawIntBits(f5)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L));
            C2684c c2684cM3425d = AbstractC1922d.m3425d((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jMo638R & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jMo638R >> 32)))) << 32), (((long) Float.floatToRawIntBits(c2684cM2325b.f8560c - f5)) << 32) | (((long) Float.floatToRawIntBits(c2684cM2325b.f8561d - f2)) & 4294967295L));
            if (AbstractC1665j.m2981a((C1623A) c1623a.f5583a.f5654b.get(), c1623a)) {
                c1623a.f5584b.mo1413c(c2684cM3425d);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public static final void m90q(C1647v c1647v, C0078o0 c0078o0, C1646u c1646u, C1636k c1636k, C0042V0 c0042v0) {
        C0038T0 c0038t0 = c0078o0.f340d;
        C0012G c0012g = c0078o0.f358v;
        C0012G c0012g2 = c0078o0.f359w;
        C1675t c1675t = new C1675t();
        C0075n c0075n = new C0075n(c0038t0, c0012g, c1675t);
        InterfaceC1641p interfaceC1641p = c1647v.f5653a;
        interfaceC1641p.mo1411a(c1646u, c1636k, c0075n, c0012g2);
        C1623A c1623a = new C1623A(c1647v, interfaceC1641p);
        c1647v.f5654b.set(c1623a);
        c1675t.f5710e = c1623a;
        c0078o0.f341e = c1623a;
        m88o(c0078o0, c1646u, c0042v0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public static final void m91r(int i5, int i6) {
        if (!(i5 > 0 && i6 > 0)) {
            AbstractC3204b.m5475a("both minLines " + i5 + " and maxLines " + i6 + " must be greater than zero");
        }
        if (i5 <= i6) {
            return;
        }
        AbstractC3204b.m5475a("minLines " + i5 + " must be less than or equal to maxLines " + i6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public static final void m92s(int i5, int i6, int i7) {
        boolean z5 = false;
        if (i5 >= 0 && i5 <= i6) {
            z5 = true;
        }
        if (z5) {
            return;
        }
        AbstractC3204b.m5477c("OffsetMapping.originalToTransformed returned invalid mapping: " + i7 + " -> " + i5 + " is not in range of transformed text [0, " + i6 + ']');
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public static final void m93t(int i5, int i6, int i7) {
        boolean z5 = false;
        if (i5 >= 0 && i5 <= i6) {
            z5 = true;
        }
        if (z5) {
            return;
        }
        AbstractC3204b.m5477c("OffsetMapping.transformedToOriginal returned invalid mapping: " + i7 + " -> " + i5 + " is not in range of original text [0, " + i6 + ']');
    }
}
