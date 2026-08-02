package defpackage;

import android.content.res.Resources;
import android.graphics.Rect;
import android.os.CancellationSignal;
import android.view.MotionEvent;
import java.util.List;
import java.util.Map;
import nuke.module.wechat.ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class v5 extends w51 implements in0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ Object j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v5(int i, Object obj) {
        super(1);
        this.i = i;
        this.j = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.in0
    public final Object j(Object obj) throws j90 {
        int i = this.i;
        int i2 = 0;
        t00 t00Var = null;
        a83 a83Var = a83.a;
        Object obj2 = this.j;
        switch (i) {
            case 0:
                w5 w5Var = (w5) obj;
                s61 s61Var = (s61) obj2;
                if (w5Var.P() != Integer.MAX_VALUE) {
                    if (w5Var.a().b) {
                        w5Var.q();
                    }
                    for (Map.Entry entry : w5Var.a().g.entrySet()) {
                        s61.a(s61Var, (du0) entry.getKey(), ((Number) entry.getValue()).intValue(), w5Var.n());
                    }
                    zn1 zn1Var = w5Var.n().x;
                    zn1Var.getClass();
                    while (!zn1Var.equals(s61Var.a.n())) {
                        for (du0 du0Var : s61Var.b(zn1Var).keySet()) {
                            s61.a(s61Var, du0Var, s61Var.c(zn1Var, du0Var), zn1Var);
                        }
                        zn1Var = zn1Var.x;
                        zn1Var.getClass();
                    }
                }
                return a83Var;
            case 1:
                return Boolean.valueOf(((pl0) obj).T0(((ok0) obj2).a));
            case 2:
                hd1 hd1Var = (hd1) obj;
                b7 b7Var = ((o6) obj2).w;
                if (b7Var.getInsetsListener().n.g() > 0) {
                    zj1 zj1Var = jf3.a;
                    hd1Var.h = true;
                    kd1 kd1Var = hd1Var.k;
                    c61 c61VarT0 = kd1Var.t0();
                    if (z01.a(hd1Var.i, 9223372034707292159L)) {
                        hd1Var.i = tp0.J(c61VarT0.c(0L));
                        hd1Var.j = c61VarT0.L();
                    }
                    kd1Var.w0().N.b();
                    long jL = c61VarT0.L();
                    rk1 rk1Var = b7Var.getInsetsListener().m;
                    int i3 = (int) (jL >> 32);
                    int i4 = (int) (jL & 4294967295L);
                    for (hf3 hf3Var : jf3.b) {
                        Object objG = rk1Var.g(hf3Var);
                        objG.getClass();
                        xf3 xf3Var = (xf3) objG;
                        jf3.a(hd1Var, ((if3) hf3Var).c, xf3Var.h, i3, i4);
                        if (((Boolean) xf3Var.b.getValue()).booleanValue()) {
                            jf3.a(hd1Var, xf3Var.f, xf3Var.j, i3, i4);
                            jf3.a(hd1Var, xf3Var.g, xf3Var.k, i3, i4);
                        }
                        jf3.a(hd1Var, ((if3) hf3Var).d, xf3Var.i, i3, i4);
                    }
                    lk1 lk1Var = b7Var.getInsetsListener().o;
                    if (lk1Var.i()) {
                        ps2 ps2Var = b7Var.getInsetsListener().p;
                        Object[] objArr = lk1Var.a;
                        int i5 = lk1Var.b;
                        while (i2 < i5) {
                            xk1 xk1Var = (xk1) objArr[i2];
                            rz0 rz0Var = (rz0) ps2Var.get(i2);
                            Rect rect = (Rect) xk1Var.getValue();
                            hd1Var.a(rz0Var.b(), rect.left);
                            hd1Var.a(rz0Var.d(), rect.top);
                            hd1Var.a(rz0Var.c(), rect.right);
                            hd1Var.a(rz0Var.a(), rect.bottom);
                            i2++;
                        }
                    }
                }
                return a83Var;
            case 3:
                return Boolean.valueOf(((x01) obj2).a(((qn2) obj).f));
            case 4:
                return Boolean.valueOf(rg3.k((qn2) obj, (Resources) obj2));
            case 5:
                ((r61) obj2).Z((e70) obj);
                return a83Var;
            case AIChatConfig.DefaultContextRounds /* 6 */:
                o62 o62Var = (o62) obj;
                km kmVar = (km) obj2;
                if (kmVar.u) {
                    p7.A(kmVar.A0(), null, new a2(kmVar, o62Var, t00Var, 6), 3);
                }
                return a83Var;
            case 7:
                md mdVar = (md) obj;
                float f = mdVar.b;
                if (f < 0.0f) {
                    f = 0.0f;
                }
                if (f > 1.0f) {
                    f = 1.0f;
                }
                float f2 = mdVar.c;
                if (f2 < -0.5f) {
                    f2 = -0.5f;
                }
                if (f2 > 0.5f) {
                    f2 = 0.5f;
                }
                float f3 = mdVar.d;
                float f4 = f3 >= -0.5f ? f3 : -0.5f;
                float f5 = f4 <= 0.5f ? f4 : 0.5f;
                float f6 = mdVar.a;
                float f7 = f6 >= 0.0f ? f6 : 0.0f;
                return new ju(ju.a(sp0.a(f, f2, f5, f7 <= 1.0f ? f7 : 1.0f, uu.x), (su) obj2));
            case 8:
                if (((Throwable) obj) != null) {
                    ((CancellationSignal) obj2).cancel();
                }
                return a83Var;
            case 9:
                return new f8(4, (da0) obj2);
            case 10:
                gb0 gb0Var = (gb0) obj;
                if (!gb0Var.h.u) {
                    return c43.i;
                }
                gb0 gb0Var2 = gb0Var.w;
                c43 c43Var = c43.h;
                if (gb0Var2 != null) {
                    v5 v5Var = new v5(10, (n4) obj2);
                    if (v5Var.j(gb0Var2) == c43Var) {
                        tb3.f(gb0Var2, v5Var);
                    }
                }
                gb0Var.w = null;
                gb0Var.v = null;
                return c43Var;
            case 11:
                if (iq0.b.compareAndSet(false, true)) {
                    ((jn) obj2).s(a83Var);
                }
                return a83Var;
            case 12:
                nc0 nc0Var = (nc0) obj;
                pq0 pq0Var = (pq0) obj2;
                y9 y9Var = pq0Var.l;
                if (pq0Var.n && pq0Var.w && y9Var != null) {
                    b5 b5VarE = nc0Var.E();
                    long jU = b5VarE.u();
                    b5VarE.q().l();
                    try {
                        ((b5) ((n4) b5VarE.i).i).q().s(y9Var);
                        pq0Var.c(nc0Var);
                    } finally {
                        vi0.r(b5VarE, jU);
                    }
                } else {
                    pq0Var.c(nc0Var);
                }
                return a83Var;
            case 13:
                nc0 nc0Var2 = (nc0) obj;
                qp qpVarQ = nc0Var2.E().q();
                mn0 mn0Var = ((sq0) obj2).k;
                if (mn0Var != null) {
                    mn0Var.g(qpVarQ, (pq0) nc0Var2.E().j);
                }
                return a83Var;
            case 14:
                i93 i93Var = (i93) obj;
                ar0 ar0Var = (ar0) obj2;
                ar0Var.g(i93Var);
                in0 in0Var = ar0Var.i;
                if (in0Var != null) {
                    in0Var.j(i93Var);
                }
                return a83Var;
            case 15:
                xr1 xr1Var = (xr1) obj;
                l62 l62Var = xr1Var.b;
                if (l62Var != null) {
                    l62Var.closeConnection();
                    xr1Var.b = null;
                }
                tz0 tz0Var = (tz0) obj2;
                zk1 zk1Var = tz0Var.d;
                Object[] objArr2 = zk1Var.h;
                int i6 = zk1Var.j;
                while (true) {
                    if (i2 >= i6) {
                        i2 = -1;
                    } else if (!t11.l((od3) objArr2[i2], xr1Var)) {
                        i2++;
                    }
                }
                if (i2 >= 0) {
                    zk1Var.k(i2);
                }
                if (zk1Var.j == 0) {
                    tz0Var.b.a();
                }
                return a83Var;
            case 16:
                ((zk1) obj2).b((sh1) obj);
                return Boolean.TRUE;
            case 17:
                ((cc) ((u12) obj2).f()).j((MotionEvent) obj);
                return a83Var;
            case 18:
                v41[] v41VarArr = xn2.a;
                ((zn2) obj).a(vn2.a, eu.O((String) obj2));
                return a83Var;
            case 19:
                ((List) obj).add((Float) ((o81) obj2).a());
                return true;
            case AIChatConfig.MaxContextRounds /* 20 */:
                ca2 ca2Var = (ca2) obj;
                cq2 cq2Var = (cq2) obj2;
                ca2Var.n(ca2Var.x.b() * cq2Var.a);
                ca2Var.p(cq2Var.b);
                ca2Var.g(cq2Var.c);
                ca2Var.e(cq2Var.d);
                ca2Var.q(cq2Var.e);
                return a83Var;
            case 21:
                ca2 ca2Var2 = (ca2) obj;
                vq2 vq2Var = (vq2) obj2;
                ca2Var2.k(vq2Var.v);
                ca2Var2.l(vq2Var.w);
                ca2Var2.c(vq2Var.x);
                ca2Var2.s(0.0f);
                ca2Var2.n(vq2Var.y);
                ca2Var2.h(0.0f);
                ca2Var2.i(0.0f);
                ca2Var2.j(0.0f);
                ca2Var2.f(vq2Var.z);
                ca2Var2.r(vq2Var.A);
                ca2Var2.p(vq2Var.B);
                ca2Var2.g(vq2Var.C);
                ca2Var2.e(vq2Var.D);
                ca2Var2.q(vq2Var.E);
                int i7 = vq2Var.F;
                if (ca2Var2.z != i7) {
                    ca2Var2.h |= 524288;
                    ca2Var2.z = i7;
                }
                return a83Var;
            default:
                Throwable th = (Throwable) obj;
                yw2 yw2Var = (yw2) obj2;
                mp mpVar = yw2Var.j;
                if (mpVar != null) {
                    mpVar.n(th);
                }
                yw2Var.j = null;
                return a83Var;
        }
    }
}
