package p000;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class qj1 extends AbstractC0696sj {

    /* JADX INFO: renamed from: i */
    public final rk1 f8998i;

    /* JADX INFO: renamed from: j */
    public final ArrayList f8999j;

    /* JADX INFO: renamed from: k */
    public final sk1 f9000k;

    /* JADX INFO: renamed from: l */
    public final rk1 f9001l;

    /* JADX INFO: renamed from: m */
    public final rl1 f9002m;

    public qj1() {
        super(4);
        this.f8998i = qp0.m4260o();
        this.f8999j = new ArrayList();
        sk1 sk1Var = fd2.f2911a;
        this.f9000k = new sk1();
        this.f9001l = new rk1();
        C0686s9 c0686s9 = new C0686s9(13, this);
        ds2.m1121e(ds2.f2179a);
        synchronized (ds2.f2181c) {
            ds2.f2186h = AbstractC0142du.m1169y0(ds2.f2186h, c0686s9);
        }
        this.f9002m = new rl1(c0686s9);
    }

    @Override // p000.AbstractC0696sj
    /* JADX INFO: renamed from: c */
    public final void mo4188c(ho2 ho2Var) {
        this.f8999j.add(new oj1(ho2Var));
    }

    @Override // p000.AbstractC0696sj
    /* JADX INFO: renamed from: d */
    public final void mo4189d() {
        synchronized (this.f10161h) {
            try {
                ArrayList arrayList = this.f8999j;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    pj1 pj1Var = (pj1) arrayList.get(i);
                    if (pj1Var instanceof nj1) {
                        qp0.m4256k(this.f8998i, ((nj1) pj1Var).f7182a, ((nj1) pj1Var).f7183b);
                    } else {
                        if (!(pj1Var instanceof oj1)) {
                            throw new C0594pv();
                        }
                        qp0.m4238T(this.f8998i, ((oj1) pj1Var).f7694a);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f8999j.clear();
    }

    @Override // p000.AbstractC0696sj
    /* JADX INFO: renamed from: e */
    public final void mo4190e() {
        this.f9002m.m4512a();
        this.f8999j.clear();
        this.f9001l.m4499a();
        synchronized (this.f10161h) {
            this.f8998i.m4499a();
        }
    }

    @Override // p000.AbstractC0696sj
    /* JADX INFO: renamed from: i */
    public final in0 mo4191i(ho2 ho2Var) {
        rk1 rk1Var = this.f9001l;
        in0 c0115d2 = (in0) rk1Var.m4505g(ho2Var);
        if (c0115d2 == null) {
            c0115d2 = new C0115d2(21, this, ho2Var);
            int iM4504f = rk1Var.m4504f(ho2Var);
            if (iM4504f < 0) {
                iM4504f = ~iM4504f;
            }
            Object[] objArr = rk1Var.f9620c;
            Object obj = objArr[iM4504f];
            rk1Var.f9619b[iM4504f] = ho2Var;
            objArr[iM4504f] = c0115d2;
        }
        return c0115d2;
    }

    @Override // p000.AbstractC0696sj
    /* JADX INFO: renamed from: j */
    public final void mo4192j(InterfaceC0212fq interfaceC0212fq) {
        this.f9001l.m4509k(interfaceC0212fq);
        mo4188c(interfaceC0212fq);
        mo4189d();
    }
}
