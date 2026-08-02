package p000;

import android.content.res.Resources;
import android.graphics.Rect;
import android.os.CancellationSignal;
import android.view.MotionEvent;
import java.util.List;
import java.util.Map;
import nuke.module.wechat.p002ai.AIChatConfig;

/* JADX INFO: renamed from: v5 */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0798v5 extends w51 implements in0 {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f11683i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f11684j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0798v5(int i, Object obj) {
        super(1);
        this.f11683i = i;
        this.f11684j = obj;
    }

    @Override // p000.in0
    /* JADX INFO: renamed from: j */
    public final Object mo5j(Object obj) throws j90 {
        int i = this.f11683i;
        int i2 = 0;
        t00 t00Var = null;
        a83 a83Var = a83.f116a;
        Object obj2 = this.f11684j;
        switch (i) {
            case 0:
                InterfaceC0835w5 interfaceC0835w5 = (InterfaceC0835w5) obj;
                s61 s61Var = (s61) obj2;
                if (interfaceC0835w5.mo3067P() != Integer.MAX_VALUE) {
                    if (interfaceC0835w5.mo3070a().f9937b) {
                        interfaceC0835w5.mo3079q();
                    }
                    for (Map.Entry entry : interfaceC0835w5.mo3070a().f9942g.entrySet()) {
                        s61.m4738a(s61Var, (du0) entry.getKey(), ((Number) entry.getValue()).intValue(), interfaceC0835w5.mo3075n());
                    }
                    zn1 zn1Var = interfaceC0835w5.mo3075n().f13987x;
                    zn1Var.getClass();
                    while (!zn1Var.equals(s61Var.f9936a.mo3075n())) {
                        for (du0 du0Var : s61Var.m4739b(zn1Var).keySet()) {
                            s61.m4738a(s61Var, du0Var, s61Var.m4740c(zn1Var, du0Var), zn1Var);
                        }
                        zn1Var = zn1Var.f13987x;
                        zn1Var.getClass();
                    }
                }
                return a83Var;
            case 1:
                return Boolean.valueOf(((pl0) obj).m3878T0(((ok0) obj2).f7701a));
            case 2:
                hd1 hd1Var = (hd1) obj;
                ViewTreeObserverOnGlobalLayoutListenerC0045b7 viewTreeObserverOnGlobalLayoutListenerC0045b7 = ((C0530o6) obj2).f7533w;
                if (viewTreeObserverOnGlobalLayoutListenerC0045b7.getInsetsListener().f474n.m2759g() > 0) {
                    zj1 zj1Var = jf3.f5018a;
                    hd1Var.f3957h = true;
                    kd1 kd1Var = hd1Var.f3960k;
                    c61 c61VarMo2642t0 = kd1Var.mo2642t0();
                    if (z01.m6371a(hd1Var.f3958i, 9223372034707292159L)) {
                        hd1Var.f3958i = tp0.m5346J(c61VarMo2642t0.mo647c(0L));
                        hd1Var.f3959j = c61VarMo2642t0.mo645L();
                    }
                    kd1Var.mo2644w0().f9373N.m5628b();
                    long jMo645L = c61VarMo2642t0.mo645L();
                    rk1 rk1Var = viewTreeObserverOnGlobalLayoutListenerC0045b7.getInsetsListener().f473m;
                    int i3 = (int) (jMo645L >> 32);
                    int i4 = (int) (jMo645L & 4294967295L);
                    for (hf3 hf3Var : jf3.f5019b) {
                        Object objM4505g = rk1Var.m4505g(hf3Var);
                        objM4505g.getClass();
                        xf3 xf3Var = (xf3) objM4505g;
                        jf3.m2494a(hd1Var, ((if3) hf3Var).f4600c, xf3Var.f13021h, i3, i4);
                        if (((Boolean) xf3Var.f13015b.getValue()).booleanValue()) {
                            jf3.m2494a(hd1Var, xf3Var.f13019f, xf3Var.f13023j, i3, i4);
                            jf3.m2494a(hd1Var, xf3Var.f13020g, xf3Var.f13024k, i3, i4);
                        }
                        jf3.m2494a(hd1Var, ((if3) hf3Var).f4601d, xf3Var.f13022i, i3, i4);
                    }
                    lk1 lk1Var = viewTreeObserverOnGlobalLayoutListenerC0045b7.getInsetsListener().f475o;
                    if (lk1Var.m2933i()) {
                        ps2 ps2Var = viewTreeObserverOnGlobalLayoutListenerC0045b7.getInsetsListener().f476p;
                        Object[] objArr = lk1Var.f6163a;
                        int i5 = lk1Var.f6164b;
                        while (i2 < i5) {
                            xk1 xk1Var = (xk1) objArr[i2];
                            rz0 rz0Var = (rz0) ps2Var.get(i2);
                            Rect rect = (Rect) xk1Var.getValue();
                            hd1Var.m2142a(rz0Var.m4635b(), rect.left);
                            hd1Var.m2142a(rz0Var.m4637d(), rect.top);
                            hd1Var.m2142a(rz0Var.m4636c(), rect.right);
                            hd1Var.m2142a(rz0Var.m4634a(), rect.bottom);
                            i2++;
                        }
                    }
                }
                return a83Var;
            case 3:
                return Boolean.valueOf(((x01) obj2).m6021a(((qn2) obj).f9052f));
            case 4:
                return Boolean.valueOf(rg3.m4475k((qn2) obj, (Resources) obj2));
            case 5:
                ((r61) obj2).m4365Z((e70) obj);
                return a83Var;
            case AIChatConfig.DefaultContextRounds /* 6 */:
                o62 o62Var = (o62) obj;
                C0392km c0392km = (C0392km) obj2;
                if (c0392km.f10770u) {
                    AbstractC0570p7.m3745A(c0392km.m5255A0(), null, new C0003a2(c0392km, o62Var, t00Var, 6), 3);
                }
                return a83Var;
            case 7:
                C0457md c0457md = (C0457md) obj;
                float f = c0457md.f6568b;
                if (f < 0.0f) {
                    f = 0.0f;
                }
                if (f > 1.0f) {
                    f = 1.0f;
                }
                float f2 = c0457md.f6569c;
                if (f2 < -0.5f) {
                    f2 = -0.5f;
                }
                if (f2 > 0.5f) {
                    f2 = 0.5f;
                }
                float f3 = c0457md.f6570d;
                float f4 = f3 >= -0.5f ? f3 : -0.5f;
                float f5 = f4 <= 0.5f ? f4 : 0.5f;
                float f6 = c0457md.f6567a;
                float f7 = f6 >= 0.0f ? f6 : 0.0f;
                return new C0363ju(C0363ju.m2564a(sp0.m4928a(f, f2, f5, f7 <= 1.0f ? f7 : 1.0f, C0786uu.f11503x), (AbstractC0708su) obj2));
            case 8:
                if (((Throwable) obj) != null) {
                    ((CancellationSignal) obj2).cancel();
                }
                return a83Var;
            case 9:
                return new C0194f8(4, (da0) obj2);
            case 10:
                gb0 gb0Var = (gb0) obj;
                if (!gb0Var.f10757h.f10770u) {
                    return c43.f1147i;
                }
                gb0 gb0Var2 = gb0Var.f3383w;
                c43 c43Var = c43.f1146h;
                if (gb0Var2 != null) {
                    C0798v5 c0798v5 = new C0798v5(10, (C0485n4) obj2);
                    if (c0798v5.mo5j(gb0Var2) == c43Var) {
                        tb3.m5160f(gb0Var2, c0798v5);
                    }
                }
                gb0Var.f3383w = null;
                gb0Var.f3382v = null;
                return c43Var;
            case 11:
                if (iq0.f4743b.compareAndSet(false, true)) {
                    ((C0356jn) obj2).mo2225s(a83Var);
                }
                return a83Var;
            case 12:
                nc0 nc0Var = (nc0) obj;
                pq0 pq0Var = (pq0) obj2;
                C0915y9 c0915y9 = pq0Var.f8465l;
                if (pq0Var.f8467n && pq0Var.f8476w && c0915y9 != null) {
                    C0043b5 c0043b5Mo3274E = nc0Var.mo3274E();
                    long jM434u = c0043b5Mo3274E.m434u();
                    c0043b5Mo3274E.m430q().mo1522l();
                    try {
                        ((C0043b5) ((C0485n4) c0043b5Mo3274E.f562i).f6983i).m430q().mo1529s(c0915y9);
                        pq0Var.m3945c(nc0Var);
                    } finally {
                        vi0.m5699r(c0043b5Mo3274E, jM434u);
                    }
                } else {
                    pq0Var.m3945c(nc0Var);
                }
                return a83Var;
            case 13:
                nc0 nc0Var2 = (nc0) obj;
                InterfaceC0627qp interfaceC0627qpM430q = nc0Var2.mo3274E().m430q();
                mn0 mn0Var = ((sq0) obj2).f10289k;
                if (mn0Var != null) {
                    mn0Var.mo12g(interfaceC0627qpM430q, (pq0) nc0Var2.mo3274E().f563j);
                }
                return a83Var;
            case 14:
                i93 i93Var = (i93) obj;
                ar0 ar0Var = (ar0) obj2;
                ar0Var.m265g(i93Var);
                in0 in0Var = ar0Var.f348i;
                if (in0Var != null) {
                    in0Var.mo5j(i93Var);
                }
                return a83Var;
            case 15:
                xr1 xr1Var = (xr1) obj;
                l62 l62Var = xr1Var.f13145b;
                if (l62Var != null) {
                    l62Var.closeConnection();
                    xr1Var.f13145b = null;
                }
                tz0 tz0Var = (tz0) obj2;
                zk1 zk1Var = tz0Var.f11008d;
                Object[] objArr2 = zk1Var.f13934h;
                int i6 = zk1Var.f13936j;
                while (true) {
                    if (i2 >= i6) {
                        i2 = -1;
                    } else if (!t11.m5086l((od3) objArr2[i2], xr1Var)) {
                        i2++;
                    }
                }
                if (i2 >= 0) {
                    zk1Var.m6432k(i2);
                }
                if (zk1Var.f13936j == 0) {
                    tz0Var.f11006b.mo6a();
                }
                return a83Var;
            case 16:
                ((zk1) obj2).m6423b((sh1) obj);
                return Boolean.TRUE;
            case 17:
                ((C0086cc) ((u12) obj2).m5452f()).mo5j((MotionEvent) obj);
                return a83Var;
            case 18:
                v41[] v41VarArr = xn2.f13086a;
                ((zn2) obj).mo1533a(vn2.f12058a, AbstractC0179eu.m1434O((String) obj2));
                return a83Var;
            case 19:
                ((List) obj).add((Float) ((o81) obj2).mo6a());
                return true;
            case AIChatConfig.MaxContextRounds /* 20 */:
                ca2 ca2Var = (ca2) obj;
                cq2 cq2Var = (cq2) obj2;
                ca2Var.m728n(ca2Var.f1277x.mo693b() * cq2Var.f1686a);
                ca2Var.m729p(cq2Var.f1687b);
                ca2Var.m722g(cq2Var.f1688c);
                ca2Var.m720e(cq2Var.f1689d);
                ca2Var.m730q(cq2Var.f1690e);
                return a83Var;
            case 21:
                ca2 ca2Var2 = (ca2) obj;
                vq2 vq2Var = (vq2) obj2;
                ca2Var2.m726k(vq2Var.f12133v);
                ca2Var2.m727l(vq2Var.f12134w);
                ca2Var2.m719c(vq2Var.f12135x);
                ca2Var2.m732s(0.0f);
                ca2Var2.m728n(vq2Var.f12136y);
                ca2Var2.m723h(0.0f);
                ca2Var2.m724i(0.0f);
                ca2Var2.m725j(0.0f);
                ca2Var2.m721f(vq2Var.f12137z);
                ca2Var2.m731r(vq2Var.f12126A);
                ca2Var2.m729p(vq2Var.f12127B);
                ca2Var2.m722g(vq2Var.f12128C);
                ca2Var2.m720e(vq2Var.f12129D);
                ca2Var2.m730q(vq2Var.f12130E);
                int i7 = vq2Var.f12131F;
                if (ca2Var2.f1279z != i7) {
                    ca2Var2.f1261h |= 524288;
                    ca2Var2.f1279z = i7;
                }
                return a83Var;
            default:
                Throwable th = (Throwable) obj;
                yw2 yw2Var = (yw2) obj2;
                C0469mp c0469mp = yw2Var.f13655j;
                if (c0469mp != null) {
                    c0469mp.mo2512n(th);
                }
                yw2Var.f13655j = null;
                return a83Var;
        }
    }
}
