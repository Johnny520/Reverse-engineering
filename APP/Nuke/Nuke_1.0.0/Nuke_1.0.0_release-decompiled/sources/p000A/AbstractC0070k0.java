package p000A;

import android.view.KeyEvent;
import androidx.compose.p134ui.input.pointer.PointerInputEventHandler;
import com.bumptech.glide.AbstractC1922d;
import com.bumptech.glide.AbstractC1926h;
import java.util.concurrent.atomic.AtomicReference;
import p007B0.AbstractC0181N;
import p007B0.C0187a;
import p028F.AbstractC0350k;
import p029F0.AbstractC0389a0;
import p029F0.C0363A;
import p029F0.InterfaceC0377O;
import p029F0.InterfaceC0430v;
import p034G.AbstractC0464i;
import p041H0.C0551B;
import p041H0.C0591f;
import p041H0.InterfaceC0593g;
import p047I0.AbstractC0757q0;
import p058L.C0912N;
import p058L.C0913O;
import p058L.C0914P;
import p058L.C0915Q;
import p058L.C0920W;
import p058L.InterfaceC0940l;
import p074O2.InterfaceC1046d;
import p077P0.AbstractC1126m;
import p092S0.C1257J;
import p092S0.C1259L;
import p092S0.C1269g;
import p095T.AbstractC1385s;
import p095T.C1357e;
import p095T.C1366i0;
import p095T.C1371l;
import p095T.C1383r;
import p095T.C1388t0;
import p095T.InterfaceC1373m;
import p095T.InterfaceC1378o0;
import p112W2.InterfaceC1601c;
import p115X0.C1623A;
import p115X0.C1624B;
import p115X0.C1636k;
import p115X0.C1646u;
import p115X0.C1647v;
import p115X0.InterfaceC1641p;
import p117X2.AbstractC1665j;
import p117X2.C1675t;
import p136b0.C1843e;
import p147d1.EnumC1960j;
import p153e1.C2016l;
import p153e1.InterfaceC2007c;
import p158f0.AbstractC2074f;
import p158f0.AbstractC2086r;
import p169h0.AbstractC2192a;
import p169h0.C2194c;
import p169h0.C2204m;
import p169h0.InterfaceC2207p;
import p204n0.C2684c;
import p238t.AbstractC3204b;
import p244u.AbstractC3282o;
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
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m74a(final java.lang.String r20, p169h0.InterfaceC2207p r21, final p092S0.C1260M r22, int r23, boolean r24, int r25, int r26, p095T.InterfaceC1373m r27, final int r28, final int r29) {
        /*
            Method dump skipped, instruction units count: 704
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000A.AbstractC0070k0.m74a(java.lang.String, h0.p, S0.M, int, boolean, int, int, T.m, int, int):void");
    }

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
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m77d(final p115X0.C1646u r61, final p112W2.InterfaceC1601c r62, final p169h0.InterfaceC2207p r63, final p092S0.C1260M r64, final p029F0.C0363A r65, final p112W2.InterfaceC1601c r66, final p211o0.C2740O r67, final boolean r68, final int r69, final int r70, final p115X0.C1636k r71, final p000A.C0074m0 r72, final boolean r73, final p136b0.C1843e r74, p095T.InterfaceC1373m r75, final int r76, final int r77) {
        /*
            Method dump skipped, instruction units count: 2695
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000A.AbstractC0070k0.m77d(X0.u, W2.c, h0.p, S0.M, F0.A, W2.c, o0.O, boolean, int, int, X0.k, A.m0, boolean, b0.e, T.m, int, int):void");
    }

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

    /* JADX INFO: renamed from: i */
    public static final boolean m82i(int i5, KeyEvent keyEvent) {
        return ((int) (AbstractC3510c.m5764b(keyEvent) >> 32)) == i5;
    }

    /* JADX INFO: renamed from: j */
    public static final int m83j(float f2) {
        return Math.round((float) Math.ceil(f2));
    }

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
