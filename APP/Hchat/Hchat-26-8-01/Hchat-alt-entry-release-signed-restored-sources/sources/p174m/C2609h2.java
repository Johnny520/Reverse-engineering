package p174m;

import android.view.KeyEvent;
import android.view.ViewConfiguration;
import androidx.lifecycle.C0119x;
import ci.C0579e;
import ci.C0589j;
import gg.AbstractC1416l;
import mg.InterfaceC2842d;
import p015b0.C0154t;
import p027c0.C0368m;
import p041d1.C0653b0;
import p072f2.AbstractC1049l;
import p072f2.AbstractC1060w;
import p072f2.C1038a;
import p072f2.InterfaceC1062y;
import p082fd.C1211h;
import p116i.C1793u;
import p119i2.C1955z;
import p144k.C2187l0;
import p144k.EnumC2164d1;
import p144k.InterfaceC2185k1;
import p187n.C2857k;
import p236q1.AbstractC3421a;
import p236q1.AbstractC3424d;
import p236q1.InterfaceC3425e;
import p249qg.AbstractC3603v;
import p249qg.InterfaceC3599t;
import p253r1.C3647d;
import p253r1.C3652i;
import p267s1.C3890d0;
import p267s1.C3903k;
import p267s1.C3914t;
import p267s1.EnumC3905l;
import p276sf.C3967n;
import p277t.C4076h;
import p293u2.InterfaceC4233c;
import p339x1.AbstractC5618k;
import p339x1.InterfaceC5665z1;
import p352xf.EnumC5799a;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: m.h2 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2609h2 extends AbstractC2639p0 implements InterfaceC3425e, InterfaceC5665z1 {

    /* JADX INFO: renamed from: P */
    public InterfaceC2185k1 f8455P;

    /* JADX INFO: renamed from: Q */
    public C2638p f8456Q;

    /* JADX INFO: renamed from: R */
    public final C3647d f8457R;

    /* JADX INFO: renamed from: S */
    public final C2638p f8458S;

    /* JADX INFO: renamed from: T */
    public final C2637o2 f8459T;

    /* JADX INFO: renamed from: U */
    public final C1211h f8460U;

    /* JADX INFO: renamed from: V */
    public final C0653b0 f8461V;

    /* JADX INFO: renamed from: W */
    public final C2618k f8462W;

    /* JADX INFO: renamed from: X */
    public C0154t f8463X;

    /* JADX INFO: renamed from: Y */
    public C2599f2 f8464Y;

    /* JADX INFO: renamed from: Z */
    public C2624l1 f8465Z;

    /* JADX INFO: renamed from: a0 */
    public C2590d3 f8466a0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2609h2(InterfaceC2185k1 interfaceC2185k1, C2638p c2638p, EnumC2640p1 enumC2640p1, InterfaceC2613i2 interfaceC2613i2, C2857k c2857k, boolean z9, boolean z10) {
        super(AbstractC2574a2.f8343a, z9, c2857k, enumC2640p1);
        this.f8455P = interfaceC2185k1;
        this.f8456Q = c2638p;
        C3647d c3647d = new C3647d();
        this.f8457R = c3647d;
        C2638p c2638p2 = new C2638p(new C1793u(new C0119x(AbstractC2574a2.f8346d)));
        this.f8458S = c2638p2;
        InterfaceC2185k1 interfaceC2185k12 = this.f8455P;
        C2638p c2638p3 = this.f8456Q;
        C2637o2 c2637o2 = new C2637o2(interfaceC2613i2, interfaceC2185k12, c2638p3 == null ? c2638p2 : c2638p3, enumC2640p1, z10, c3647d, this, new C2584c2(this, 0));
        this.f8459T = c2637o2;
        C1211h c1211h = new C1211h(c2637o2, z9);
        this.f8460U = c1211h;
        C0653b0 c0653b0 = new C0653b0(2, null, 10);
        m10122k1(c0653b0);
        this.f8461V = c0653b0;
        C2618k c2618k = new C2618k(enumC2640p1, c2637o2, z10, new C2584c2(this, 1));
        m10122k1(c2618k);
        this.f8462W = c2618k;
        m10122k1(new C3652i(c1211h, c3647d));
        C4076h c4076h = new C4076h();
        c4076h.f13513u = c2618k;
        m10122k1(c4076h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p236q1.InterfaceC3425e
    /* JADX INFO: renamed from: C */
    public final boolean mo5389C(KeyEvent keyEvent) {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p174m.AbstractC2639p0
    /* JADX INFO: renamed from: C1 */
    public final boolean mo6059C1() {
        C2637o2 c2637o2 = this.f8459T;
        if (c2637o2.f8588a.mo5458a()) {
            return true;
        }
        InterfaceC2185k1 interfaceC2185k1 = c2637o2.f8589b;
        return interfaceC2185k1 != null ? interfaceC2185k1.mo1618d() : false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: F1 */
    public final void m6060F1(InterfaceC2185k1 interfaceC2185k1, C2638p c2638p, EnumC2640p1 enumC2640p1, InterfaceC2613i2 interfaceC2613i2, C2857k c2857k, boolean z9, boolean z10) {
        boolean z11;
        boolean z12 = true;
        boolean z13 = false;
        if (this.f8620y != z9) {
            this.f8460U.f4071g = z9;
            z11 = true;
        } else {
            z11 = false;
        }
        C2638p c2638p2 = c2638p == null ? this.f8458S : c2638p;
        C2637o2 c2637o2 = this.f8459T;
        if (!AbstractC1416l.m3825a(c2637o2.f8588a, interfaceC2613i2)) {
            c2637o2.f8588a = interfaceC2613i2;
            z13 = true;
        }
        c2637o2.f8589b = interfaceC2185k1;
        if (c2637o2.f8591d != enumC2640p1) {
            c2637o2.f8591d = enumC2640p1;
            z13 = true;
        }
        if (c2637o2.f8592e != z10) {
            c2637o2.f8592e = z10;
        } else {
            z12 = z13;
        }
        c2637o2.f8590c = c2638p2;
        c2637o2.f8593f = this.f8457R;
        C2618k c2618k = this.f8462W;
        c2618k.f8516u = enumC2640p1;
        c2618k.f8518w = z10;
        this.f8455P = interfaceC2185k1;
        this.f8456Q = c2638p;
        C1955z c1955z = AbstractC2574a2.f8343a;
        EnumC2640p1 enumC2640p12 = c2637o2.f8591d;
        EnumC2640p1 enumC2640p13 = EnumC2640p1.f8622g;
        if (enumC2640p12 != enumC2640p13) {
            enumC2640p13 = EnumC2640p1.f8623h;
        }
        m6104E1(c1955z, z9, c2857k, enumC2640p13, z12);
        if (z11) {
            this.f8463X = null;
            this.f8464Y = null;
            AbstractC5618k.m10158n(this);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // p174m.AbstractC2639p0, p339x1.InterfaceC5656w1
    /* JADX INFO: renamed from: P */
    public final void mo1608P(C3903k c3903k, EnumC3905l enumC3905l, long j3) {
        int i9;
        ?? r10 = c3903k.f12800a;
        int size = r10.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                break;
            }
            if (((Boolean) this.f8619x.invoke(new C3890d0(((C3914t) r10.get(i10)).f12842i))).booleanValue()) {
                super.mo1608P(c3903k, enumC3905l, j3);
                break;
            }
            i10++;
        }
        if (this.f8603A == null) {
            C2187l0 c2187l0 = new C2187l0(this);
            m10122k1(c2187l0);
            this.f8603A = c2187l0;
        }
        if (this.f8620y) {
            EnumC3905l enumC3905l2 = EnumC3905l.f12812g;
            InterfaceC5557c interfaceC5557c = null;
            C2637o2 c2637o2 = this.f8459T;
            if (enumC3905l == enumC3905l2 && c3903k.f12805f == 6) {
                if (this.f8465Z == null) {
                    this.f8465Z = new C2624l1(c2637o2, new C2571a(ViewConfiguration.get(AbstractC5618k.m10169y(this).getContext()), 0), new C2589d2(2, this, C2609h2.class, "onWheelScrollStopped", "onWheelScrollStopped-TH1AsA0(J)V", 4, 0), AbstractC5618k.m10167w(this).f22771E);
                }
                C2624l1 c2624l1 = this.f8465Z;
                if (c2624l1 != null) {
                    InterfaceC3599t interfaceC3599tM10550Y0 = m10550Y0();
                    if (c2624l1.f8539h == null) {
                        c2624l1.f8539h = AbstractC3603v.m7563q(interfaceC3599tM10550Y0, null, new C0589j(c2624l1, interfaceC5557c, 9), 3);
                    }
                }
            }
            C2624l1 c2624l12 = this.f8465Z;
            EnumC3905l enumC3905l3 = EnumC3905l.f12813h;
            if (c2624l12 != null && c3903k.f12805f == 6) {
                int size2 = r10.size();
                int i11 = 0;
                while (true) {
                    if (i11 >= size2) {
                        if (enumC3905l == enumC3905l2 && c2624l12.f8586d) {
                            c2624l12.m6083f(c3903k);
                            AbstractC2636o1.m6086a(c3903k);
                        }
                        if (enumC3905l == enumC3905l3 && !c2624l12.f8586d && c2624l12.m6083f(c3903k)) {
                            AbstractC2636o1.m6086a(c3903k);
                        }
                    } else if (((C3914t) r10.get(i11)).m8119b()) {
                        break;
                    } else {
                        i11++;
                    }
                }
            }
            if (enumC3905l == enumC3905l2 && ((i9 = c3903k.f12805f) == 10 || i9 == 11 || i9 == 12)) {
                if (this.f8466a0 == null) {
                    this.f8466a0 = new C2590d3(c2637o2, new C2589d2(2, this, C2609h2.class, "onTrackpadScrollStopped", "onTrackpadScrollStopped-TH1AsA0(J)V", 4, 1), AbstractC5618k.m10167w(this).f22771E);
                }
                C2590d3 c2590d3 = this.f8466a0;
                if (c2590d3 != null) {
                    InterfaceC3599t interfaceC3599tM10550Y02 = m10550Y0();
                    if (c2590d3.f8390g == null) {
                        c2590d3.f8390g = AbstractC3603v.m7563q(interfaceC3599tM10550Y02, null, new C0579e(c2590d3, null), 3);
                    }
                }
            }
            C2590d3 c2590d32 = this.f8466a0;
            if (c2590d32 != null) {
                int i12 = c3903k.f12805f;
                if (i12 == 10 || i12 == 11 || i12 == 12) {
                    int size3 = r10.size();
                    for (int i13 = 0; i13 < size3; i13++) {
                        if (((C3914t) r10.get(i13)).m8119b()) {
                            return;
                        }
                    }
                    if (enumC3905l == enumC3905l2 && c2590d32.f8586d) {
                        c2590d32.m6055d(c3903k);
                        AbstractC2636o1.m6086a(c3903k);
                    }
                    if (enumC3905l == enumC3905l3 && !c2590d32.f8586d && c2590d32.m6055d(c3903k)) {
                        AbstractC2636o1.m6086a(c3903k);
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p236q1.InterfaceC3425e
    /* JADX INFO: renamed from: W */
    public final boolean mo5390W(KeyEvent keyEvent) {
        long jFloatToRawIntBits;
        if (!this.f8620y || ((!AbstractC3421a.m7196a(AbstractC3424d.m7198b(keyEvent), AbstractC3421a.f11053D) && !AbstractC3421a.m7196a(AbstractC3424d.m7197a(keyEvent.getKeyCode()), AbstractC3421a.f11052C)) || AbstractC3424d.m7199c(keyEvent) != 2 || keyEvent.isCtrlPressed())) {
            return false;
        }
        boolean z9 = this.f8459T.f8591d == EnumC2640p1.f8622g;
        C2618k c2618k = this.f8462W;
        if (z9) {
            int iM6073l1 = (int) (c2618k.m6073l1() & 4294967295L);
            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(AbstractC3421a.m7196a(AbstractC3424d.m7197a(keyEvent.getKeyCode()), AbstractC3421a.f11052C) ? iM6073l1 : -iM6073l1)));
        } else {
            int iM6073l12 = (int) (c2618k.m6073l1() >> 32);
            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L) | (((long) Float.floatToRawIntBits(AbstractC3421a.m7196a(AbstractC3424d.m7197a(keyEvent.getKeyCode()), AbstractC3421a.f11052C) ? iM6073l12 : -iM6073l12)) << 32);
        }
        AbstractC3603v.m7563q(m10550Y0(), null, new C2599f2(this, jFloatToRawIntBits, null, 0), 3);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.InterfaceC5665z1
    /* JADX INFO: renamed from: X0 */
    public final void mo1610X0(InterfaceC1062y interfaceC1062y) {
        if (this.f8620y && (this.f8463X == null || this.f8464Y == null)) {
            this.f8463X = new C0154t(this, 15);
            this.f8464Y = new C2599f2(this, null);
        }
        C0154t c0154t = this.f8463X;
        if (c0154t != null) {
            InterfaceC2842d[] interfaceC2842dArr = AbstractC1060w.f3404a;
            interfaceC1062y.mo2644a(AbstractC1049l.f3318d, new C1038a(null, c0154t));
        }
        C2599f2 c2599f2 = this.f8464Y;
        if (c2599f2 != null) {
            InterfaceC2842d[] interfaceC2842dArr2 = AbstractC1060w.f3404a;
            interfaceC1062y.mo2644a(AbstractC1049l.f3319e, c2599f2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p356y0.AbstractC5852n
    /* JADX INFO: renamed from: Z0 */
    public final boolean mo1349Z0() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p356y0.AbstractC5852n
    /* JADX INFO: renamed from: c1 */
    public final void mo1323c1() {
        if (this.f23801t) {
            InterfaceC4233c interfaceC4233c = AbstractC5618k.m10167w(this).f22771E;
            C2638p c2638p = this.f8458S;
            c2638p.getClass();
            c2638p.f8601a = new C1793u(new C0119x(interfaceC4233c));
        }
        C2624l1 c2624l1 = this.f8465Z;
        if (c2624l1 != null) {
            c2624l1.f8585c = AbstractC5618k.m10167w(this).f22771E;
        }
        C2590d3 c2590d3 = this.f8466a0;
        if (c2590d3 != null) {
            c2590d3.f8585c = AbstractC5618k.m10167w(this).f22771E;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.InterfaceC5612i
    /* JADX INFO: renamed from: m */
    public final void mo1332m() {
        mo1611b0();
        if (this.f23801t) {
            InterfaceC4233c interfaceC4233c = AbstractC5618k.m10167w(this).f22771E;
            C2638p c2638p = this.f8458S;
            c2638p.getClass();
            c2638p.f8601a = new C1793u(new C0119x(interfaceC4233c));
        }
        C2624l1 c2624l1 = this.f8465Z;
        if (c2624l1 != null) {
            c2624l1.f8585c = AbstractC5618k.m10167w(this).f22771E;
        }
        C2590d3 c2590d3 = this.f8466a0;
        if (c2590d3 != null) {
            c2590d3.f8585c = AbstractC5618k.m10167w(this).f22771E;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p174m.AbstractC2639p0
    /* JADX INFO: renamed from: r1 */
    public final Object mo6061r1(C2635o0 c2635o0, C2635o0 c2635o02) {
        C2637o2 c2637o2 = this.f8459T;
        Object objM6093f = c2637o2.m6093f(EnumC2164d1.f7174h, new C0368m(c2635o0, c2637o2, null, 13), c2635o02);
        return objM6093f == EnumC5799a.f23547g ? objM6093f : C3967n.f12976a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p174m.AbstractC2639p0
    /* JADX INFO: renamed from: x1 */
    public final void mo6063x1(C2572a0 c2572a0) {
        AbstractC3603v.m7563q(this.f8457R.m7630e(), null, new C0589j(c2572a0, this, (InterfaceC5557c) null, 12), 3);
    }

    @Override // p174m.AbstractC2639p0
    /* JADX INFO: renamed from: w1 */
    public final void mo6062w1(long j3) {
    }
}
