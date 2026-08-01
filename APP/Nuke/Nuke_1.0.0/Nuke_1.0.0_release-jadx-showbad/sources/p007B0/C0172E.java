package p007B0;

import android.content.res.Resources;
import android.graphics.Rect;
import android.os.CancellationSignal;
import android.view.MotionEvent;
import com.bumptech.glide.AbstractC1923e;
import java.util.List;
import java.util.Map;
import me.dartcv.nuke.BuildConfig;
import p000A.C0028O;
import p000A.C0039U;
import p000A.C0072l0;
import p029F0.AbstractC0388a;
import p029F0.AbstractC0429u0;
import p029F0.C0416o;
import p029F0.C0427t0;
import p029F0.C0431v0;
import p029F0.InterfaceC0425s0;
import p029F0.InterfaceC0430v;
import p041H0.AbstractC0572Q;
import p041H0.AbstractC0596h0;
import p041H0.AbstractC0601k;
import p041H0.C0562G0;
import p041H0.C0564I;
import p041H0.C0565J;
import p041H0.C0569N;
import p041H0.EnumC0556D0;
import p041H0.InterfaceC0581a;
import p047I0.AbstractC0681L;
import p047I0.AbstractC0767v0;
import p047I0.C0660A0;
import p047I0.C0749n;
import p047I0.C0763t0;
import p047I0.C0769w0;
import p047I0.ViewTreeObserverOnGlobalLayoutListenerC0772y;
import p051J.InputConnectionC0830v;
import p056K2.C0891q;
import p074O2.InterfaceC1046d;
import p077P0.AbstractC1132s;
import p077P0.AbstractC1134u;
import p077P0.C1121h;
import p077P0.C1128o;
import p077P0.InterfaceC1136w;
import p095T.InterfaceC1347Y;
import p105V.C1483e;
import p112W2.InterfaceC1601c;
import p112W2.InterfaceC1603e;
import p115X0.InputConnectionC1639n;
import p117X2.AbstractC1665j;
import p117X2.AbstractC1666k;
import p121Y1.C1753n;
import p137b3.InterfaceC1855c;
import p153e1.C2014j;
import p153e1.C2016l;
import p153e1.InterfaceC2007c;
import p158f0.C2085q;
import p160f3.AbstractC2162v;
import p160f3.C2135g;
import p169h0.InterfaceC2205n;
import p170h1.C2224o;
import p172h3.C2243c;
import p179i4.AbstractC2352g;
import p186k.AbstractC2428j;
import p186k.C2404A;
import p186k.C2408E;
import p186k.C2439u;
import p187k0.C2449e;
import p193l0.C2492o;
import p198m0.C2567A;
import p198m0.C2575f;
import p203n.C2669n;
import p204n0.C2684c;
import p211o0.AbstractC2767z;
import p211o0.C2735J;
import p211o0.C2739N;
import p211o0.C2750i;
import p211o0.C2762u;
import p211o0.InterfaceC2760s;
import p217p0.AbstractC2872c;
import p217p0.C2873d;
import p222q0.InterfaceC2903d;
import p228r0.C3029b;
import p245u0.AbstractC3296C;
import p245u0.C3306c;
import p260x.C3404J;
import p276z3.C3522e;

/* JADX INFO: renamed from: B0.E */
/* JADX INFO: loaded from: classes.dex */
public final class C0172E extends AbstractC1666k implements InterfaceC1601c {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f609e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f610f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0172E(int i5, Object obj) {
        super(1);
        this.f609e = i5;
        this.f610f = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r0v11, types: [F0.b0, H0.a] */
    @Override // p112W2.InterfaceC1601c
    /* JADX INFO: renamed from: h */
    public final Object mo1h(Object obj) {
        int i5 = this.f609e;
        int i6 = 0;
        InterfaceC1046d interfaceC1046d = null;
        C0891q c0891q = C0891q.f2780a;
        Object obj2 = this.f610f;
        switch (i5) {
            case 0:
                ((C0175H) ((C0174G) obj2).m261e()).mo1h((MotionEvent) obj);
                return c0891q;
            case BuildConfig.VERSION_CODE /* 1 */:
                Throwable th = (Throwable) obj;
                C0185S c0185s = (C0185S) obj2;
                C2135g c2135g = c0185s.f642f;
                if (c2135g != null) {
                    c2135g.mo3952k(th);
                }
                c0185s.f642f = null;
                return c0891q;
            case 2:
                InterfaceC0581a interfaceC0581a = (InterfaceC0581a) obj;
                C0565J c0565j = (C0565J) obj2;
                if (interfaceC0581a.mo899U() != Integer.MAX_VALUE) {
                    if (interfaceC0581a.mo901a().f1735b) {
                        interfaceC0581a.mo913y();
                    }
                    for (Map.Entry entry : interfaceC0581a.mo901a().f1740g.entrySet()) {
                        C0565J.m845a(c0565j, (AbstractC0388a) entry.getKey(), ((Number) entry.getValue()).intValue(), interfaceC0581a.mo909w());
                    }
                    AbstractC0596h0 abstractC0596h0 = interfaceC0581a.mo909w().f1934t;
                    AbstractC1665j.m2982b(abstractC0596h0);
                    while (!abstractC0596h0.equals(c0565j.f1734a.mo909w())) {
                        for (AbstractC0388a abstractC0388a : c0565j.m846b(abstractC0596h0).keySet()) {
                            C0565J.m845a(c0565j, abstractC0388a, c0565j.m847c(abstractC0596h0, abstractC0388a), abstractC0596h0);
                        }
                        abstractC0596h0 = abstractC0596h0.f1934t;
                        AbstractC1665j.m2982b(abstractC0596h0);
                    }
                }
                return c0891q;
            case 3:
                ((C1483e) obj2).m2753b((InterfaceC2205n) obj);
                return Boolean.TRUE;
            case 4:
                return Boolean.valueOf(((C2567A) obj).m4490Q0(((C2575f) obj2).f8210a));
            case 5:
                C0569N c0569n = (C0569N) obj;
                ViewTreeObserverOnGlobalLayoutListenerC0772y viewTreeObserverOnGlobalLayoutListenerC0772y = ((C0749n) obj2).f2334s;
                if (viewTreeObserverOnGlobalLayoutListenerC0772y.getInsetsListener().f1261j.m2509g() > 0) {
                    C2439u c2439u = AbstractC0429u0.f1292a;
                    c0569n.f1762d = true;
                    AbstractC0572Q abstractC0572Q = c0569n.f1765g;
                    InterfaceC0430v interfaceC0430vMo891w0 = abstractC0572Q.mo891w0();
                    if (C2014j.m3700a(c0569n.f1763e, 9223372034707292159L)) {
                        c0569n.f1763e = AbstractC1923e.m3457Q(interfaceC0430vMo891w0.mo640d(0L));
                        c0569n.f1764f = interfaceC0430vMo891w0.mo637Q();
                    }
                    abstractC0572Q.mo893y0().f1700K.m868b();
                    long jMo637Q = interfaceC0430vMo891w0.mo637Q();
                    C2408E c2408e = viewTreeObserverOnGlobalLayoutListenerC0772y.getInsetsListener().f1260i;
                    int i7 = (int) (jMo637Q >> 32);
                    int i8 = (int) (jMo637Q & 4294967295L);
                    for (InterfaceC0425s0 interfaceC0425s0 : AbstractC0429u0.f1293b) {
                        Object objM4272g = c2408e.m4272g(interfaceC0425s0);
                        AbstractC1665j.m2982b(objM4272g);
                        C0431v0 c0431v0 = (C0431v0) objM4272g;
                        C0427t0 c0427t0 = (C0427t0) interfaceC0425s0;
                        AbstractC0429u0.m686a(c0569n, c0427t0.f1288c, c0431v0.f1301h, i7, i8);
                        if (((Boolean) c0431v0.f1295b.getValue()).booleanValue()) {
                            AbstractC0429u0.m686a(c0569n, c0431v0.f1299f, c0431v0.f1303j, i7, i8);
                            AbstractC0429u0.m686a(c0569n, c0431v0.f1300g, c0431v0.f1304k, i7, i8);
                        }
                        AbstractC0429u0.m686a(c0569n, c0427t0.f1289d, c0431v0.f1302i, i7, i8);
                    }
                    C2404A c2404a = viewTreeObserverOnGlobalLayoutListenerC0772y.getInsetsListener().f1262k;
                    if (c2404a.m4251i()) {
                        C2085q c2085q = viewTreeObserverOnGlobalLayoutListenerC0772y.getInsetsListener().f1263l;
                        Object[] objArr = c2404a.f7766a;
                        int i9 = c2404a.f7767b;
                        while (i6 < i9) {
                            InterfaceC1347Y interfaceC1347Y = (InterfaceC1347Y) objArr[i6];
                            C0416o c0416o = (C0416o) c2085q.get(i6);
                            Rect rect = (Rect) interfaceC1347Y.getValue();
                            c0569n.m877a(c0416o.m677b(), rect.left);
                            c0569n.m877a(c0416o.m679d(), rect.top);
                            c0569n.m877a(c0416o.m678c(), rect.right);
                            c0569n.m877a(c0416o.m676a(), rect.bottom);
                            i6++;
                        }
                    }
                }
                return c0891q;
            case 6:
                return Boolean.valueOf(((AbstractC2428j) obj2).m4317a(((C1128o) obj).f3714g));
            case 7:
                return Boolean.valueOf(AbstractC0681L.m1181c((C1128o) obj, (Resources) obj2));
            case 8:
                return new C0028O(4, (C0763t0) obj2);
            case 9:
                if (AbstractC0767v0.f2393b.compareAndSet(false, true)) {
                    ((C2243c) obj2).mo4090o(c0891q);
                }
                return c0891q;
            case 10:
                InterfaceC2903d interfaceC2903d = (InterfaceC2903d) obj;
                InterfaceC2760s interfaceC2760sM106j = interfaceC2903d.mo854L().m106j();
                InterfaceC1603e interfaceC1603e = ((C0769w0) obj2).f2398g;
                if (interfaceC1603e != null) {
                    interfaceC1603e.mo0g(interfaceC2760sM106j, (C3029b) interfaceC2903d.mo854L().f308f);
                }
                return c0891q;
            case 11:
                InputConnectionC1639n inputConnectionC1639n = (InputConnectionC1639n) obj;
                InputConnectionC0830v inputConnectionC0830v = inputConnectionC1639n.f5635b;
                if (inputConnectionC0830v != null) {
                    inputConnectionC1639n.m2940a(inputConnectionC0830v);
                    inputConnectionC1639n.f5635b = null;
                }
                C0660A0 c0660a0 = (C0660A0) obj2;
                C1483e c1483e = c0660a0.f2094d;
                Object[] objArr2 = c1483e.f5181d;
                int i10 = c1483e.f5183f;
                while (true) {
                    if (i6 >= i10) {
                        i6 = -1;
                    } else if (!AbstractC1665j.m2981a((C0562G0) objArr2[i6], inputConnectionC1639n)) {
                        i6++;
                    }
                }
                if (i6 >= 0) {
                    c1483e.m2762k(i6);
                }
                if (c1483e.f5183f == 0) {
                    c0660a0.f2092b.mo6a();
                }
                return c0891q;
            case 12:
                if (((Throwable) obj) != null) {
                    ((CancellationSignal) obj2).cancel();
                }
                return c0891q;
            case 13:
                AbstractC1134u.m2189b((InterfaceC1136w) obj, ((C1121h) obj2).f3648a);
                return c0891q;
            case 14:
                InterfaceC1855c[] interfaceC1855cArr = AbstractC1134u.f3766a;
                ((InterfaceC1136w) obj).mo1128a(AbstractC1132s.f3738a, AbstractC2352g.m4211y((String) obj2));
                return c0891q;
            case 15:
                ((List) obj).add((Float) ((C3404J) obj2).mo6a());
                return true;
            case 16:
                ((C0564I) obj2).m815Z((InterfaceC2007c) obj);
                return c0891q;
            case 17:
                C2684c c2684c = (C2684c) obj;
                C2224o c2224o = (C2224o) obj2;
                if (c2224o.f7199q) {
                    AbstractC2162v.m3994p(c2224o.m4023x0(), null, new C0039U(c2224o, c2684c, interfaceC1046d, 13), 3);
                }
                return c0891q;
            case 18:
                C2449e c2449e = (C2449e) obj;
                if (!c2449e.f7186d.f7199q) {
                    return EnumC0556D0.f1669e;
                }
                C2449e c2449e2 = c2449e.f7910s;
                EnumC0556D0 enumC0556D0 = EnumC0556D0.f1668d;
                if (c2449e2 != null) {
                    C0172E c0172e = new C0172E(18, (C1753n) obj2);
                    if (c0172e.mo1h(c2449e2) == enumC0556D0) {
                        AbstractC0601k.m1050z(c2449e2, c0172e);
                    }
                }
                c2449e.f7910s = null;
                c2449e.f7909r = null;
                return enumC0556D0;
            case 19:
                C2735J c2735j = (C2735J) obj;
                C2492o c2492o = (C2492o) obj2;
                c2735j.m4802w(c2735j.mo272b() * c2492o.f7999a);
                c2735j.m4803x(c2492o.f8000b);
                c2735j.m4795i(c2492o.f8001c);
                c2735j.m4793e(c2492o.f8002d);
                c2735j.m4804y(c2492o.f8003e);
                return c0891q;
            case 20:
                return Boolean.valueOf(AbstractC1665j.m2981a(obj, obj2));
            case 21:
                C2669n c2669n = (C2669n) obj;
                float f2 = c2669n.f8506b;
                if (f2 < 0.0f) {
                    f2 = 0.0f;
                }
                if (f2 > 1.0f) {
                    f2 = 1.0f;
                }
                float f5 = c2669n.f8507c;
                if (f5 < -0.5f) {
                    f5 = -0.5f;
                }
                if (f5 > 0.5f) {
                    f5 = 0.5f;
                }
                float f6 = c2669n.f8508d;
                float f7 = f6 >= -0.5f ? f6 : -0.5f;
                float f8 = f7 <= 0.5f ? f7 : 0.5f;
                float f9 = c2669n.f8505a;
                float f10 = f9 >= 0.0f ? f9 : 0.0f;
                return new C2762u(C2762u.m4919a(AbstractC2767z.m4932b(f2, f5, f8, f10 <= 1.0f ? f10 : 1.0f, C2873d.f9094x), (AbstractC2872c) obj2));
            case 22:
                return new C2014j((((long) ((Number) ((C3522e) obj2).mo1h(Integer.valueOf((int) (((C2016l) obj).f6741a >> 32)))).intValue()) << 32) | (4294967295L & ((long) 0)));
            case 23:
                return new C2014j((((long) ((Number) ((C3522e) obj2).mo1h(Integer.valueOf((int) (((C2016l) obj).f6741a >> 32)))).intValue()) << 32) | (4294967295L & ((long) 0)));
            case 24:
                C2735J c2735j2 = (C2735J) obj;
                C2739N c2739n = (C2739N) obj2;
                c2735j2.m4800s(c2739n.f8710r);
                c2735j2.m4801v(c2739n.f8711s);
                c2735j2.m4792d(c2739n.f8712t);
                c2735j2.m4790D(0.0f);
                c2735j2.m4802w(c2739n.f8713u);
                c2735j2.m4797k(0.0f);
                c2735j2.m4798l(0.0f);
                c2735j2.m4799n(0.0f);
                c2735j2.m4794f(c2739n.f8714v);
                c2735j2.m4789B(c2739n.f8715w);
                c2735j2.m4803x(c2739n.f8716x);
                c2735j2.m4795i(c2739n.f8717y);
                c2735j2.m4796j(null);
                c2735j2.m4793e(c2739n.f8718z);
                c2735j2.m4804y(c2739n.f8707A);
                int i11 = c2739n.f8708B;
                if (c2735j2.f8699w != i11) {
                    c2735j2.f8680d |= 524288;
                    c2735j2.f8699w = i11;
                }
                return c0891q;
            case 25:
                InterfaceC2903d interfaceC2903d2 = (InterfaceC2903d) obj;
                C3029b c3029b = (C3029b) obj2;
                C2750i c2750i = c3029b.f9618l;
                if (c3029b.f9620n && c3029b.f9629w && c2750i != null) {
                    C0072l0 c0072l0Mo854L = interfaceC2903d2.mo854L();
                    long jM110n = c0072l0Mo854L.m110n();
                    c0072l0Mo854L.m106j().mo4852n();
                    try {
                        ((C0072l0) ((C1753n) c0072l0Mo854L.f307e).f6028e).m106j().mo4844e(c2750i);
                        c3029b.m5227c(interfaceC2903d2);
                    } finally {
                        c0072l0Mo854L.m106j().mo4851l();
                        c0072l0Mo854L.m119y(jM110n);
                    }
                } else {
                    c3029b.m5227c(interfaceC2903d2);
                }
                return c0891q;
            default:
                AbstractC3296C abstractC3296C = (AbstractC3296C) obj;
                C3306c c3306c = (C3306c) obj2;
                c3306c.m5577g(abstractC3296C);
                InterfaceC1601c interfaceC1601c = c3306c.f10243i;
                if (interfaceC1601c != null) {
                    interfaceC1601c.mo1h(abstractC3296C);
                }
                return c0891q;
        }
    }
}
