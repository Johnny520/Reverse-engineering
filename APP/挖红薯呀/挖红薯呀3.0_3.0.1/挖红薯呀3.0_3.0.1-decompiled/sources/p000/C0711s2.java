package p000;

import android.content.res.Resources;
import android.graphics.Rect;
import android.os.CancellationSignal;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: s2 */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0711s2 extends c50 implements InterfaceC0742sw {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f5624d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f5625e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0711s2(C0910x1 c0910x1, C0734sp c0734sp, vt0 vt0Var) {
        super(1);
        this.f5624d = 8;
        this.f5625e = vt0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0742sw
    public final Object invoke(Object obj) {
        int i = this.f5624d;
        g91 g91Var = g91.f1894e;
        g91 g91Var2 = g91.f1893d;
        int i2 = 0;
        o31 o31Var = null;
        na1 na1Var = na1.f4229a;
        Object obj2 = this.f5625e;
        switch (i) {
            case 0:
                InterfaceC0749t2 interfaceC0749t2 = (InterfaceC0749t2) obj;
                c60 c60Var = (c60) obj2;
                if (interfaceC0749t2.mo828L() != Integer.MAX_VALUE) {
                    if (interfaceC0749t2.mo830a().f708b) {
                        interfaceC0749t2.mo842u();
                    }
                    for (Map.Entry entry : interfaceC0749t2.mo830a().f713g.entrySet()) {
                        c60.m491a(c60Var, (AbstractC0535o2) entry.getKey(), ((Number) entry.getValue()).intValue(), interfaceC0749t2.mo840r());
                    }
                    qj0 qj0Var = interfaceC0749t2.mo840r().f5182t;
                    qj0Var.getClass();
                    while (!qj0Var.equals(c60Var.f707a.mo840r())) {
                        for (AbstractC0535o2 abstractC0535o2 : c60Var.m492b(qj0Var).keySet()) {
                            c60.m491a(c60Var, abstractC0535o2, c60Var.m493c(qj0Var, abstractC0535o2), qj0Var);
                        }
                        qj0Var = qj0Var.f5182t;
                        qj0Var.getClass();
                    }
                }
                return na1Var;
            case 1:
                return Boolean.valueOf(((C0149dv) obj).m729D0(((C0665qu) obj2).f5222a));
            case 2:
                vb0 vb0Var = (vb0) obj;
                ViewTreeObserverOnGlobalLayoutListenerC0875w3 viewTreeObserverOnGlobalLayoutListenerC0875w3 = ((C0341j3) obj2).f2666s;
                if (viewTreeObserverOnGlobalLayoutListenerC0875w3.getInsetsListener().f3326i.m720g() > 0) {
                    ug0 ug0Var = he1.f2223a;
                    long jMo342G = vb0Var.m4472a().mo342G();
                    jh0 jh0Var = viewTreeObserverOnGlobalLayoutListenerC0875w3.getInsetsListener().f3325h;
                    int i3 = (int) (jMo342G >> 32);
                    int i4 = (int) (jMo342G & 4294967295L);
                    fe1[] fe1VarArr = he1.f2224b;
                    int length = fe1VarArr.length;
                    int i5 = 0;
                    while (i5 < length) {
                        fe1 fe1Var = fe1VarArr[i5];
                        Object objM1701g = jh0Var.m1701g(fe1Var);
                        objM1701g.getClass();
                        pe1 pe1Var = (pe1) objM1701g;
                        int i6 = i4;
                        he1.m1301a(vb0Var, ((ge1) fe1Var).f1931c, pe1Var.f4825h, i3, i6);
                        if (((Boolean) pe1Var.f4819b.getValue()).booleanValue()) {
                            he1.m1301a(vb0Var, pe1Var.f4823f, pe1Var.f4827j, i3, i6);
                            he1.m1301a(vb0Var, pe1Var.f4824g, pe1Var.f4828k, i3, i6);
                        }
                        he1.m1301a(vb0Var, ((ge1) fe1Var).f1932d, pe1Var.f4826i, i3, i6);
                        i5++;
                        i4 = i6;
                    }
                    dh0 dh0Var = viewTreeObserverOnGlobalLayoutListenerC0875w3.getInsetsListener().f3327j;
                    if (dh0Var.m705i()) {
                        c31 c31Var = viewTreeObserverOnGlobalLayoutListenerC0875w3.getInsetsListener().f3328k;
                        Object[] objArr = dh0Var.f1108a;
                        int i7 = dh0Var.f1109b;
                        while (i2 < i7) {
                            oh0 oh0Var = (oh0) objArr[i2];
                            d20 d20Var = (d20) c31Var.get(i2);
                            Rect rect = (Rect) oh0Var.getValue();
                            vb0Var.m4473d(d20Var.m625b(), rect.left);
                            vb0Var.m4473d(d20Var.m627d(), rect.top);
                            vb0Var.m4473d(d20Var.m626c(), rect.right);
                            vb0Var.m4473d(d20Var.m624a(), rect.bottom);
                            i2++;
                        }
                    }
                }
                return na1Var;
            case 3:
                return Boolean.valueOf(((u20) obj2).m4247a(((xz0) obj).f7474g));
            case 4:
                return Boolean.valueOf(rd0.m3479h((xz0) obj, (Resources) obj2));
            case 5:
                return new C0379k4(i2, (C0659qo) obj2);
            case 6:
                C0009a8 c0009a8 = (C0009a8) obj;
                float f = c0009a8.f66b;
                if (f < 0.0f) {
                    f = 0.0f;
                }
                if (f > 1.0f) {
                    f = 1.0f;
                }
                float f2 = c0009a8.f67c;
                if (f2 < -0.5f) {
                    f2 = -0.5f;
                }
                if (f2 > 0.5f) {
                    f2 = 0.5f;
                }
                float f3 = c0009a8.f68d;
                float f4 = f3 >= -0.5f ? f3 : -0.5f;
                float f5 = f4 <= 0.5f ? f4 : 0.5f;
                float f6 = c0009a8.f65a;
                float f7 = f6 >= 0.0f ? f6 : 0.0f;
                return new C0207ff(C0207ff.m1092a(p30.m2991a(f, f2, f5, f7 <= 1.0f ? f7 : 1.0f, C0687rf.f5410x), (AbstractC0549of) obj2));
            case 7:
                if (((Throwable) obj) != null) {
                    ((CancellationSignal) obj2).cancel();
                }
                return na1Var;
            case 8:
                C0734sp c0734sp = (C0734sp) obj;
                if (!c0734sp.f4542q) {
                    return g91Var;
                }
                if (c0734sp.f5816s != null) {
                    w10.m4824b("DragAndDropTarget self reference must be null at the start of a drag and drop session");
                }
                c0734sp.f5816s = null;
                vt0 vt0Var = (vt0) obj2;
                vt0Var.f6825d = vt0Var.f6825d;
                return g91Var2;
            case 9:
                C0734sp c0734sp2 = (C0734sp) obj;
                if (!c0734sp2.f4529d.f4542q) {
                    return g91Var;
                }
                C0734sp c0734sp3 = c0734sp2.f5816s;
                if (c0734sp3 != null) {
                    C0711s2 c0711s2 = new C0711s2(9, (C0910x1) obj2);
                    if (c0711s2.invoke(c0734sp3) == g91Var2) {
                        r60.m3397F(c0734sp3, c0711s2);
                    }
                }
                c0734sp2.f5816s = null;
                c0734sp2.f5815r = null;
                return g91Var2;
            case 10:
                x81 x81Var = (x81) obj;
                C0814us c0814us = (C0814us) obj2;
                EnumC0485ms enumC0485ms = EnumC0485ms.f4026d;
                EnumC0485ms enumC0485ms2 = EnumC0485ms.f4027e;
                if (x81Var.m5104a(enumC0485ms, enumC0485ms2)) {
                    C0388kd c0388kd = c0814us.f6290u.f6810a.f762a;
                    if (c0388kd != null) {
                        o31Var = c0388kd.f3081c;
                    }
                } else if (x81Var.m5104a(enumC0485ms2, EnumC0485ms.f4028f)) {
                    C0388kd c0388kd2 = c0814us.f6291v.f2940a.f762a;
                    if (c0388kd2 != null) {
                        o31Var = c0388kd2.f3081c;
                    }
                } else {
                    o31Var = AbstractC0700rs.f5551c;
                }
                return o31Var == null ? AbstractC0700rs.f5551c : o31Var;
            case 11:
                if (AbstractC0705rx.f5567b.compareAndSet(false, true)) {
                    ((C0834vb) obj2).mo1710s(na1Var);
                }
                return na1Var;
            case 12:
                InterfaceC0812uq interfaceC0812uq = (InterfaceC0812uq) obj;
                C0868vx c0868vx = (C0868vx) obj2;
                C0118d6 c0118d6 = c0868vx.f6848l;
                if (c0868vx.f6850n && c0868vx.f6859w && c0118d6 != null) {
                    C0541o8 c0541o8Mo655t = interfaceC0812uq.mo655t();
                    long jM2803h = c0541o8Mo655t.m2803h();
                    c0541o8Mo655t.m2802f().mo243i();
                    try {
                        ((C0541o8) ((C0910x1) c0541o8Mo655t.f4480a).f7232e).m2802f().mo250p(c0118d6);
                        c0868vx.m4796c(interfaceC0812uq);
                    } finally {
                        c0541o8Mo655t.m2802f().mo241g();
                        c0541o8Mo655t.m2812q(jM2803h);
                    }
                } else {
                    c0868vx.m4796c(interfaceC0812uq);
                }
                return na1Var;
            case 13:
                InterfaceC0812uq interfaceC0812uq2 = (InterfaceC0812uq) obj;
                InterfaceC0051bd interfaceC0051bdM2802f = interfaceC0812uq2.mo655t().m2802f();
                InterfaceC0904ww interfaceC0904ww = ((C0942xx) obj2).f7434g;
                if (interfaceC0904ww != null) {
                    interfaceC0904ww.invoke(interfaceC0051bdM2802f, (C0868vx) interfaceC0812uq2.mo655t().f4481b);
                }
                return na1Var;
            case 14:
                bb1 bb1Var = (bb1) obj;
                C0035ay c0035ay = (C0035ay) obj2;
                c0035ay.m223g(bb1Var);
                InterfaceC0742sw interfaceC0742sw = c0035ay.f294i;
                if (interfaceC0742sw != null) {
                    interfaceC0742sw.invoke(bb1Var);
                }
                return na1Var;
            case j50.f2734e /* 15 */:
                ((sh0) obj2).m4072b((ne0) obj);
                return Boolean.TRUE;
            case 16:
                return obj == ((dh0) obj2) ? "(this)" : String.valueOf(obj);
            case 17:
                return obj == ((eh0) obj2) ? "(this)" : String.valueOf(obj);
            case 18:
                return obj == ((kh0) obj2) ? "(this)" : String.valueOf(obj);
            case 19:
                d01.m620a((f01) obj, ((xv0) obj2).f7427a);
                return na1Var;
            case 20:
                u40[] u40VarArr = d01.f923a;
                ((f01) obj).mo17a(b01.f322a, o30.m2782v((String) obj2));
                return na1Var;
            case 21:
                ((List) obj).add((Float) ((k80) obj2).invoke());
                return true;
            case 22:
                gv0 gv0Var = (gv0) obj;
                o11 o11Var = (o11) obj2;
                gv0Var.m1261e(o11Var.f4398r);
                gv0Var.m1262f(o11Var.f4399s);
                gv0Var.m1260d(o11Var.f4400t);
                float f8 = o11Var.f4401u;
                if (gv0Var.f2067h != f8) {
                    gv0Var.f2063d |= 32;
                    gv0Var.f2067h = f8;
                }
                float f9 = o11Var.f4402v;
                if (gv0Var.f2070k != f9) {
                    gv0Var.f2063d |= 2048;
                    gv0Var.f2070k = f9;
                }
                gv0Var.m1263i(o11Var.f4403w);
                x01 x01Var = o11Var.f4404x;
                if (!p30.m3002l(gv0Var.f2072m, x01Var)) {
                    gv0Var.f2063d |= 8192;
                    gv0Var.f2072m = x01Var;
                }
                boolean z = o11Var.f4405y;
                if (gv0Var.f2073n != z) {
                    gv0Var.f2063d |= 16384;
                    gv0Var.f2073n = z;
                }
                long j = o11Var.f4406z;
                if (!C0207ff.m1094c(gv0Var.f2068i, j)) {
                    gv0Var.f2063d |= 64;
                    gv0Var.f2068i = j;
                }
                long j2 = o11Var.f4395A;
                if (!C0207ff.m1094c(gv0Var.f2069j, j2)) {
                    gv0Var.f2063d |= 128;
                    gv0Var.f2069j = j2;
                }
                int i8 = o11Var.f4396B;
                if (gv0Var.f2077r != i8) {
                    gv0Var.f2063d |= 524288;
                    gv0Var.f2077r = i8;
                }
                return na1Var;
            default:
                Throwable th = (Throwable) obj;
                r51 r51Var = (r51) obj2;
                C0884wc c0884wc = r51Var.f5299f;
                if (c0884wc != null) {
                    c0884wc.mo543k(th);
                }
                r51Var.f5299f = null;
                return na1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0711s2(int i, Object obj) {
        super(1);
        this.f5624d = i;
        this.f5625e = obj;
    }
}
