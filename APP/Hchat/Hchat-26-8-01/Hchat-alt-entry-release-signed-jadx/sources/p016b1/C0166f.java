package p016b1;

import android.content.res.Resources;
import android.graphics.Rect;
import android.os.CancellationSignal;
import androidx.lifecycle.C0119x;
import ci.C0589j;
import gg.AbstractC1416l;
import gg.AbstractC1417m;
import java.util.List;
import java.util.Map;
import mg.InterfaceC2842d;
import p000a.AbstractC0000a;
import p015b0.C0147m;
import p020b5.C0184c;
import p028c1.C0386p;
import p041d1.C0653b0;
import p041d1.C0660f;
import p057e1.C0808c;
import p069f.AbstractC0942k;
import p069f.C0933f0;
import p069f.C0935g0;
import p069f.C0943k0;
import p069f.C0945l0;
import p069f.C0965w;
import p070f0.InputConnectionC0990v;
import p071f1.AbstractC0996c0;
import p071f1.C1009j;
import p071f1.C1028s0;
import p071f1.C1034w;
import p071f1.InterfaceC0998d0;
import p071f1.InterfaceC1031u;
import p072f2.AbstractC1058u;
import p072f2.AbstractC1060w;
import p072f2.C1046i;
import p072f2.C1054q;
import p072f2.InterfaceC1062y;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p089g1.AbstractC1274c;
import p089g1.C1276e;
import p101h1.InterfaceC1567d;
import p116i.C1778p;
import p117i0.C1891w1;
import p117i0.InterfaceC1809a1;
import p118i1.C1902b;
import p129ig.AbstractC2043a;
import p131j0.C2046b;
import p158l.AbstractC2415f;
import p176m1.AbstractC2725c0;
import p176m1.C2724c;
import p190n2.InputConnectionC2877l;
import p249qg.AbstractC3603v;
import p249qg.C3564g;
import p265s.C3860u0;
import p267s1.C3904k0;
import p276sf.C3967n;
import p293u2.C4240j;
import p293u2.InterfaceC4233c;
import p308v1.AbstractC4422q1;
import p308v1.C4399j;
import p308v1.C4408m;
import p308v1.C4419p1;
import p308v1.C4425r1;
import p308v1.InterfaceC4416o1;
import p308v1.InterfaceC4428t;
import p322w0.C4665p;
import p339x1.AbstractC5614i1;
import p339x1.AbstractC5618k;
import p339x1.AbstractC5628n0;
import p339x1.C5602f0;
import p339x1.C5606g0;
import p339x1.C5608g2;
import p339x1.C5610h0;
import p339x1.C5619k0;
import p339x1.EnumC5596d2;
import p339x1.InterfaceC5581a;
import p340x2.C5679n;
import p356y0.InterfaceC5851m;
import p357y1.AbstractC5883g0;
import p357y1.AbstractC5912n1;
import p357y1.C5898k;
import p357y1.C5900k1;
import p357y1.C5916o1;
import p357y1.C5932s1;
import p357y1.ViewTreeObserverOnGlobalLayoutListenerC5934t;
import sg.C3971c;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: b1.f */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0166f extends AbstractC1417m implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f435g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f436h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0166f(Object obj, int i9) {
        super(1);
        this.f435g = i9;
        this.f436h = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r2v53, types: [v1.b1, x1.a] */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) {
        int i9 = this.f435g;
        InterfaceC5557c interfaceC5557c = null;
        int i10 = 0;
        C3967n c3967n = C3967n.f12976a;
        Object obj2 = this.f436h;
        switch (i9) {
            case 0:
                C0168h c0168h = (C0168h) obj;
                if (!c0168h.f23788g.f23801t) {
                    return EnumC5596d2.f22748h;
                }
                C0168h c0168h2 = c0168h.f442v;
                EnumC5596d2 enumC5596d2 = EnumC5596d2.f22747g;
                if (c0168h2 != null) {
                    C0166f c0166f = new C0166f((C0119x) obj2, i10);
                    if (c0166f.invoke(c0168h2) == enumC5596d2) {
                        AbstractC5618k.m10143B(c0168h2, c0166f);
                    }
                }
                c0168h.f442v = null;
                c0168h.f441u = null;
                return enumC5596d2;
            case 1:
                C5610h0 c5610h0 = (C5610h0) obj;
                ((C1891w1) obj2).invoke(c5610h0);
                c5610h0.m10064e();
                return c3967n;
            case 2:
                InterfaceC0998d0 interfaceC0998d0 = (InterfaceC0998d0) obj;
                C0386p c0386p = (C0386p) obj2;
                interfaceC0998d0.mo2537c(interfaceC0998d0.mo1333d() * AbstractC2415f.f7897d);
                interfaceC0998d0.mo2533Q0(c0386p.f1074a);
                interfaceC0998d0.mo2548r(c0386p.f1075b);
                interfaceC0998d0.mo2546p(c0386p.f1076c);
                interfaceC0998d0.mo2550t(c0386p.f1077d);
                return c3967n;
            case 3:
                if (((Throwable) obj) != null) {
                    ((CancellationSignal) obj2).cancel();
                }
                return c3967n;
            case 4:
                return obj == ((C0933f0) obj2) ? "(this)" : String.valueOf(obj);
            case 5:
                return obj == ((C0935g0) obj2) ? "(this)" : String.valueOf(obj);
            case 6:
                return obj == ((C0945l0) obj2) ? "(this)" : String.valueOf(obj);
            case 7:
                InterfaceC0998d0 interfaceC0998d02 = (InterfaceC0998d0) obj;
                C1028s0 c1028s0 = (C1028s0) obj2;
                interfaceC0998d02.mo2547q(c1028s0.f3246u);
                interfaceC0998d02.mo2541i(c1028s0.f3247v);
                interfaceC0998d02.mo2544n(c1028s0.f3248w);
                interfaceC0998d02.mo2549s(0.0f);
                interfaceC0998d02.mo2539g(0.0f);
                interfaceC0998d02.mo2537c(c1028s0.f3249x);
                interfaceC0998d02.mo2543l();
                interfaceC0998d02.mo2545o();
                interfaceC0998d02.mo2538f(0.0f);
                interfaceC0998d02.mo2551u(c1028s0.f3250y);
                interfaceC0998d02.mo2531H0(c1028s0.f3251z);
                interfaceC0998d02.mo2533Q0(c1028s0.f3239A);
                interfaceC0998d02.mo2548r(c1028s0.f3240B);
                interfaceC0998d02.mo2532I();
                interfaceC0998d02.mo2546p(c1028s0.f3241C);
                interfaceC0998d02.mo2550t(c1028s0.f3242D);
                interfaceC0998d02.mo2534Y(0);
                interfaceC0998d02.mo2540h(c1028s0.f3243E);
                interfaceC0998d02.mo2542k(c1028s0.f3244F);
                return c3967n;
            case 8:
                AbstractC1060w.m2680c((InterfaceC1062y) obj, ((C1046i) obj2).f3287a);
                return c3967n;
            case 9:
                InterfaceC2842d[] interfaceC2842dArr = AbstractC1060w.f3404a;
                ((InterfaceC1062y) obj).mo2644a(AbstractC1058u.f3376a, AbstractC0000a.m99x0((String) obj2));
                return c3967n;
            case 10:
                ((List) obj).add((Float) ((C3860u0) obj2).invoke());
                return true;
            case 11:
                return Boolean.valueOf(AbstractC1416l.m3825a(obj, obj2));
            case 12:
                C1778p c1778p = (C1778p) obj;
                float f3 = c1778p.f5925b;
                if (f3 < 0.0f) {
                    f3 = 0.0f;
                }
                if (f3 > 1.0f) {
                    f3 = 1.0f;
                }
                float f10 = c1778p.f5926c;
                if (f10 < -0.5f) {
                    f10 = -0.5f;
                }
                if (f10 > 0.5f) {
                    f10 = 0.5f;
                }
                float f11 = c1778p.f5927d;
                float f12 = f11 >= -0.5f ? f11 : -0.5f;
                float f13 = f12 <= 0.5f ? f12 : 0.5f;
                float f14 = c1778p.f5924a;
                float f15 = f14 >= 0.0f ? f14 : 0.0f;
                return new C1034w(C1034w.m2633a(AbstractC0996c0.m2506b(f3, f10, f13, f15 <= 1.0f ? f15 : 1.0f, C1276e.f4259x), (AbstractC1274c) obj2));
            case 13:
                InterfaceC1567d interfaceC1567d = (InterfaceC1567d) obj;
                C1902b c1902b = (C1902b) obj2;
                C1009j c1009j = c1902b.f6351l;
                if (c1902b.f6353n && c1902b.f6362w && c1009j != null) {
                    C0184c c0184cMo4081z0 = interfaceC1567d.mo4081z0();
                    long jM825v = c0184cMo4081z0.m825v();
                    c0184cMo4081z0.m819p().mo2487e();
                    try {
                        ((C0184c) ((C0119x) c0184cMo4081z0.f469a).f310h).m819p().mo2486d(c1009j);
                        c1902b.m4675c(interfaceC1567d);
                    } finally {
                        c0184cMo4081z0.m819p().mo2497p();
                        c0184cMo4081z0.m803U(jM825v);
                    }
                } else {
                    c1902b.m4675c(interfaceC1567d);
                }
                return c3967n;
            case 14:
                AbstractC2725c0 abstractC2725c0 = (AbstractC2725c0) obj;
                C2724c c2724c = (C2724c) obj2;
                c2724c.m6146g(abstractC2725c0);
                InterfaceC1231l interfaceC1231l = c2724c.f8815i;
                if (interfaceC1231l != null) {
                    interfaceC1231l.invoke(abstractC2725c0);
                }
                return c3967n;
            case 15:
                Throwable th2 = (Throwable) obj;
                C3904k0 c3904k0 = (C3904k0) obj2;
                C3564g c3564g = c3904k0.f12808i;
                if (c3564g != null) {
                    c3564g.mo7500w(th2);
                }
                c3904k0.f12808i = null;
                return c3967n;
            case 16:
                InterfaceC5581a interfaceC5581a = (InterfaceC5581a) obj;
                C5606g0 c5606g0 = (C5606g0) obj2;
                if (interfaceC5581a.mo9969H() != Integer.MAX_VALUE) {
                    if (interfaceC5581a.mo9971e().f22817b) {
                        interfaceC5581a.mo9972h0();
                    }
                    for (Map.Entry entry : interfaceC5581a.mo9971e().f22822g.entrySet()) {
                        C5606g0.m10056a(c5606g0, (C4399j) entry.getKey(), ((Number) entry.getValue()).intValue(), interfaceC5581a.mo9967A());
                    }
                    AbstractC5614i1 abstractC5614i1 = interfaceC5581a.mo9967A().f22870w;
                    abstractC5614i1.getClass();
                    while (!abstractC5614i1.equals(c5606g0.f22816a.mo9967A())) {
                        for (C4399j c4399j : c5606g0.m10057b(abstractC5614i1).keySet()) {
                            C5606g0.m10056a(c5606g0, c4399j, c5606g0.m10058c(abstractC5614i1, c4399j), abstractC5614i1);
                        }
                        abstractC5614i1 = abstractC5614i1.f22870w;
                        abstractC5614i1.getClass();
                    }
                }
                return c3967n;
            case 17:
                ((C2046b) obj2).m5056b((InterfaceC5851m) obj);
                return Boolean.TRUE;
            case 18:
                ((C5602f0) obj2).m10025Z((InterfaceC4233c) obj);
                return c3967n;
            case 19:
                C0808c c0808c = (C0808c) obj;
                C5679n c5679n = (C5679n) obj2;
                if (c5679n.f23801t) {
                    AbstractC3603v.m7563q(c5679n.m10550Y0(), null, new C0589j(c5679n, c0808c, interfaceC5557c, 23), 3);
                }
                return c3967n;
            case 20:
                return Boolean.valueOf(((C0653b0) obj).m1805r1(((C0660f) obj2).f2040a));
            case 21:
                C5619k0 c5619k0 = (C5619k0) obj;
                ViewTreeObserverOnGlobalLayoutListenerC5934t viewTreeObserverOnGlobalLayoutListenerC5934t = ((C5898k) obj2).f23966v;
                if (viewTreeObserverOnGlobalLayoutListenerC5934t.getInsetsListener().f14688n.m4492g() > 0) {
                    C0965w c0965w = AbstractC4422q1.f14714a;
                    c5619k0.f22895g = true;
                    AbstractC5628n0 abstractC5628n0 = c5619k0.f22898j;
                    InterfaceC4428t interfaceC4428tMo10088T0 = abstractC5628n0.mo10088T0();
                    if (C4240j.m8528b(c5619k0.f22896h, 9223372034707292159L)) {
                        c5619k0.f22896h = AbstractC2043a.m5017W(interfaceC4428tMo10088T0.mo8859P(0L));
                        c5619k0.f22897i = interfaceC4428tMo10088T0.mo8858F();
                    }
                    abstractC5628n0.mo10090Y0().f22779M.m10126b();
                    long jMo8858F = interfaceC4428tMo10088T0.mo8858F();
                    C0943k0 c0943k0 = viewTreeObserverOnGlobalLayoutListenerC5934t.getInsetsListener().f14687m;
                    int i11 = (int) (jMo8858F >> 32);
                    int i12 = (int) (jMo8858F & 4294967295L);
                    for (InterfaceC4416o1 interfaceC4416o1 : AbstractC4422q1.f14715b) {
                        Object objM2320g = c0943k0.m2320g(interfaceC4416o1);
                        objM2320g.getClass();
                        C4425r1 c4425r1 = (C4425r1) objM2320g;
                        C4419p1 c4419p1 = (C4419p1) interfaceC4416o1;
                        AbstractC4422q1.m8875a(c5619k0, c4419p1.f14706c, c4425r1.f14730h, i11, i12);
                        if (((Boolean) c4425r1.f14724b.getValue()).booleanValue()) {
                            AbstractC4422q1.m8875a(c5619k0, c4425r1.f14728f, c4425r1.f14732j, i11, i12);
                            AbstractC4422q1.m8875a(c5619k0, c4425r1.f14729g, c4425r1.f14733k, i11, i12);
                        }
                        AbstractC4422q1.m8875a(c5619k0, c4419p1.f14707d, c4425r1.f14731i, i11, i12);
                    }
                    C0933f0 c0933f0 = viewTreeObserverOnGlobalLayoutListenerC5934t.getInsetsListener().f14689o;
                    if (c0933f0.m2294i()) {
                        C4665p c4665p = viewTreeObserverOnGlobalLayoutListenerC5934t.getInsetsListener().f14690p;
                        Object[] objArr = c0933f0.f2923a;
                        int i13 = c0933f0.f2924b;
                        while (i10 < i13) {
                            InterfaceC1809a1 interfaceC1809a1 = (InterfaceC1809a1) objArr[i10];
                            C4408m c4408m = (C4408m) c4665p.get(i10);
                            Rect rect = (Rect) interfaceC1809a1.getValue();
                            c5619k0.m10171e(c4408m.m8871b(), rect.left);
                            c5619k0.m10171e(c4408m.m8873d(), rect.top);
                            c5619k0.m10171e(c4408m.m8872c(), rect.right);
                            c5619k0.m10171e(c4408m.m8870a(), rect.bottom);
                            i10++;
                        }
                    }
                }
                return c3967n;
            case 22:
                return Boolean.valueOf(((AbstractC0942k) obj2).m2312a(((C1054q) obj).f3352f));
            case 23:
                return Boolean.valueOf(AbstractC5883g0.m10587c((C1054q) obj, (Resources) obj2));
            case 24:
                return new C0147m((C5900k1) obj2, 7);
            case 25:
                if (AbstractC5912n1.f23997b.compareAndSet(false, true)) {
                    ((C3971c) obj2).mo8208p(c3967n);
                }
                return c3967n;
            case 26:
                InterfaceC1567d interfaceC1567d2 = (InterfaceC1567d) obj;
                InterfaceC1031u interfaceC1031uM819p = interfaceC1567d2.mo4081z0().m819p();
                InterfaceC1235p interfaceC1235p = ((C5916o1) obj2).f24009j;
                if (interfaceC1235p != null) {
                    interfaceC1235p.invoke(interfaceC1031uM819p, (C1902b) interfaceC1567d2.mo4081z0().f470b);
                }
                return c3967n;
            default:
                InputConnectionC2877l inputConnectionC2877l = (InputConnectionC2877l) obj;
                InputConnectionC0990v inputConnectionC0990v = inputConnectionC2877l.f9301b;
                if (inputConnectionC0990v != null) {
                    inputConnectionC0990v.closeConnection();
                    inputConnectionC2877l.f9301b = null;
                }
                C5932s1 c5932s1 = (C5932s1) obj2;
                C2046b c2046b = c5932s1.f24052d;
                Object[] objArr2 = c2046b.f6891g;
                int i14 = c2046b.f6893i;
                while (true) {
                    if (i10 >= i14) {
                        i10 = -1;
                    } else if (!AbstractC1416l.m3825a((C5608g2) objArr2[i10], inputConnectionC2877l)) {
                        i10++;
                    }
                }
                if (i10 >= 0) {
                    c2046b.m5065k(i10);
                }
                if (c2046b.f6893i == 0) {
                    c5932s1.f24050b.invoke();
                }
                return c3967n;
        }
    }
}
