package p216p;

import android.content.res.Configuration;
import android.os.Build;
import android.view.KeyEvent;
import android.widget.EdgeEffect;
import p047I0.AbstractC0691Q;
import p076P.C1073T;
import p076P.C1075V;
import p095T.C1305C;
import p095T.C1371l;
import p095T.C1383r;
import p095T.C1388t0;
import p095T.C1399z;
import p095T.InterfaceC1373m;
import p112W2.InterfaceC1599a;
import p112W2.InterfaceC1601c;
import p127Z2.AbstractC1784a;
import p152e0.AbstractC2004k;
import p153e1.C2005a;
import p153e1.InterfaceC2007c;
import p169h0.AbstractC2192a;
import p169h0.C2204m;
import p169h0.InterfaceC2207p;
import p193l0.AbstractC2485h;
import p211o0.AbstractC2767z;
import p211o0.C2729D;
import p211o0.InterfaceC2738M;
import p227r.C2996k;
import p227r.EnumC2983d0;
import p232s.C3162i;
import p238t.AbstractC3204b;
import p244u.AbstractC3261c;
import p255w.C3385p;
import p273z0.AbstractC3508a;
import p273z0.AbstractC3510c;

/* JADX INFO: renamed from: p.m */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2856m {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final void m5047a(InterfaceC2207p interfaceC2207p, InterfaceC1601c interfaceC1601c, InterfaceC1373m interfaceC1373m, int i5) {
        int i6;
        C1383r c1383r = (C1383r) interfaceC1373m;
        c1383r.m2569X(-932836462);
        if ((i5 & 6) == 0) {
            i6 = (c1383r.m2582f(interfaceC2207p) ? 4 : 2) | i5;
        } else {
            i6 = i5;
        }
        int i7 = i6 | (c1383r.m2586h(interfaceC1601c) ? 32 : 16);
        if (c1383r.m2560O(i7 & 1, (i7 & 19) != 18)) {
            AbstractC3261c.m5516c(c1383r, AbstractC2485h.m4429c(interfaceC2207p, interfaceC1601c));
        } else {
            c1383r.m2563R();
        }
        C1388t0 c1388t0M2599r = c1383r.m2599r();
        if (c1388t0M2599r != null) {
            c1388t0M2599r.f4928d = new C1399z(i5, 5, interfaceC2207p, interfaceC1601c);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static float m5048b(EdgeEffect edgeEffect, float f2, float f5, InterfaceC2007c interfaceC2007c) {
        float f6 = AbstractC2808A.f8838a;
        double dMo272b = interfaceC2007c.mo272b() * 386.0878f * 160.0f * 0.84f;
        double dAbs = Math.abs(f2) * 0.35f;
        double d5 = ((double) AbstractC2808A.f8838a) * dMo272b;
        float fExp = (float) (Math.exp((AbstractC2808A.f8839b / AbstractC2808A.f8840c) * Math.log(dAbs / d5)) * d5);
        int i5 = Build.VERSION.SDK_INT;
        if (fExp > (i5 >= 31 ? AbstractC2853k.m5045b(edgeEffect) : 0.0f) * f5) {
            return 0.0f;
        }
        int iM3200N = AbstractC1784a.m3200N(f2);
        if (i5 >= 31) {
            edgeEffect.onAbsorb(iM3200N);
            return f2;
        }
        if (edgeEffect.isFinished()) {
            edgeEffect.onAbsorb(iM3200N);
        }
        return f2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static InterfaceC2207p m5049c(InterfaceC2207p interfaceC2207p, C2729D c2729d) {
        return interfaceC2207p.mo4021c(new C2855l(0L, c2729d, AbstractC2767z.f8776b, 1));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static final InterfaceC2207p m5050d(InterfaceC2207p interfaceC2207p, long j5, InterfaceC2738M interfaceC2738M) {
        return interfaceC2207p.mo4021c(new C2855l(j5, null, interfaceC2738M, 2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static final void m5051e(long j5, EnumC2983d0 enumC2983d0) {
        if (enumC2983d0 == EnumC2983d0.f9447d) {
            if (C2005a.m3679g(j5) != Integer.MAX_VALUE) {
                return;
            }
            AbstractC3204b.m5477c("Vertically scrollable component was measured with an infinity maximum height constraints, which is disallowed. One of the common reasons is nesting layouts like LazyColumn and Column(Modifier.verticalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyColumn scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
        } else {
            if (C2005a.m3680h(j5) != Integer.MAX_VALUE) {
                return;
            }
            AbstractC3204b.m5477c("Horizontally scrollable component was measured with an infinity maximum width constraints, which is disallowed. One of the common reasons is nesting layouts like LazyRow and Row(Modifier.horizontalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyRow scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static InterfaceC2207p m5052f(InterfaceC2207p interfaceC2207p, C3162i c3162i, C1075V c1075v, boolean z5, InterfaceC1599a interfaceC1599a) {
        InterfaceC2207p interfaceC2207pM4014a;
        if (c1075v != null) {
            interfaceC2207pM4014a = new C2863t(c3162i, c1075v, false, z5, null, interfaceC1599a);
        } else if (c1075v == null) {
            interfaceC2207pM4014a = new C2863t(c3162i, null, false, z5, null, interfaceC1599a);
        } else if (c3162i != null) {
            C1305C c1305c = AbstractC2816I.f8869a;
            interfaceC2207pM4014a = new C2817J(c3162i, c1075v).mo4021c(new C2863t(c3162i, null, false, z5, null, interfaceC1599a));
        } else {
            interfaceC2207pM4014a = AbstractC2192a.m4014a(C2204m.f7185a, new C2864u(c1075v, z5, interfaceC1599a));
        }
        return interfaceC2207p.mo4021c(interfaceC2207pM4014a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static InterfaceC2207p m5053g(InterfaceC2207p interfaceC2207p, boolean z5, String str, InterfaceC1599a interfaceC1599a, int i5) {
        if ((i5 & 1) != 0) {
            z5 = true;
        }
        boolean z6 = z5;
        if ((i5 & 2) != 0) {
            str = null;
        }
        return interfaceC2207p.mo4021c(new C2863t(null, null, true, z6, str, interfaceC1599a));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static final InterfaceC2207p m5054h(InterfaceC2207p interfaceC2207p, boolean z5) {
        return interfaceC2207p.mo4021c(z5 ? new C2810C() : C2204m.f7185a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static final boolean m5055i(KeyEvent keyEvent) {
        long jM5764b = AbstractC3510c.m5764b(keyEvent);
        int i5 = AbstractC3508a.f10924F;
        return AbstractC3508a.m5762a(jM5764b, AbstractC3508a.f10932h) || AbstractC3508a.m5762a(jM5764b, AbstractC3508a.f10942r) || AbstractC3508a.m5762a(jM5764b, AbstractC3508a.f10923E) || AbstractC3508a.m5762a(jM5764b, AbstractC3508a.f10941q);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static final boolean m5056j(InterfaceC1373m interfaceC1373m) {
        return (((Configuration) ((C1383r) interfaceC1373m).m2590j(AbstractC0691Q.f2210a)).uiMode & 48) == 32;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static final C2848h0 m5057k(InterfaceC1373m interfaceC1373m) {
        Object[] objArr = new Object[0];
        boolean zM2578d = ((C1383r) interfaceC1373m).m2578d(0);
        C1383r c1383r = (C1383r) interfaceC1373m;
        Object objM2558L = c1383r.m2558L();
        if (zM2578d || objM2558L == C1371l.f4833a) {
            objM2558L = new C1073T(22);
            c1383r.m2585g0(objM2558L);
        }
        return (C2848h0) AbstractC2004k.m3672d(objArr, C2848h0.f8951j, (InterfaceC1599a) objM2558L, c1383r, 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public static InterfaceC2207p m5058l(InterfaceC2207p interfaceC2207p, C3385p c3385p, EnumC2983d0 enumC2983d0, C2847h c2847h, boolean z5, C2996k c2996k, C3162i c3162i) {
        float f2 = AbstractC2867x.f9055a;
        EnumC2983d0 enumC2983d02 = EnumC2983d0.f9447d;
        C2204m c2204m = C2204m.f7185a;
        return interfaceC2207p.mo4021c(enumC2983d0 == enumC2983d02 ? AbstractC2485h.m4427a(c2204m, C2815H.f8867c) : AbstractC2485h.m4427a(c2204m, C2815H.f8866b)).mo4021c(new C2850i0(c2847h, c2996k, enumC2983d0, c3385p, c3162i, z5, false));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public static final long m5059m(float f2, long j5) {
        float fMax = Math.max(0.0f, Float.intBitsToFloat((int) (j5 >> 32)) - f2);
        float fMax2 = Math.max(0.0f, Float.intBitsToFloat((int) (j5 & 4294967295L)) - f2);
        return (((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(fMax2)) & 4294967295L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public static InterfaceC2207p m5060n(InterfaceC2207p interfaceC2207p, C2848h0 c2848h0) {
        C3162i c3162i = c2848h0.f8955d;
        float f2 = AbstractC2867x.f9055a;
        return interfaceC2207p.mo4021c(AbstractC2485h.m4427a(C2204m.f7185a, C2815H.f8867c)).mo4021c(new C2850i0(null, null, EnumC2983d0.f9447d, c2848h0, c3162i, true, true)).mo4021c(new C2854k0(c2848h0));
    }
}
