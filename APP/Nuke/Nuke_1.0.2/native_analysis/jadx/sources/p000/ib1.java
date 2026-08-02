package p000;

import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ib1 extends p40 {

    /* JADX INFO: renamed from: n */
    public final C0067bt f4519n;

    /* JADX INFO: renamed from: o */
    public final Object f4520o;

    /* JADX INFO: renamed from: p */
    public final p40 f4521p;

    public ib1(C0067bt c0067bt, Object obj, p40 p40Var) {
        obj.getClass();
        p40Var.getClass();
        this.f4519n = c0067bt;
        this.f4520o = obj;
        this.f4521p = p40Var;
    }

    @Override // p000.p40
    /* JADX INFO: renamed from: P */
    public final p40 mo2317P(C0067bt c0067bt, Object obj) {
        C0067bt c0067bt2 = this.f4519n;
        boolean zEquals = c0067bt.equals(c0067bt2);
        p40 p40Var = this.f4521p;
        if (!zEquals) {
            p40 p40VarMo2317P = p40Var.mo2317P(c0067bt, null);
            if (p40VarMo2317P != p40Var) {
                this = new ib1(c0067bt2, this.f4520o, p40VarMo2317P);
            }
            p40Var = this;
        }
        return obj != null ? new ib1(c0067bt, obj, p40Var) : p40Var;
    }

    public final String toString() {
        List listM1151I0;
        List listM5947T = wo2.m5947T(new c70(new C0727ta(23, this), new nx0(18)));
        if (listM5947T.size() <= 1) {
            listM1151I0 = AbstractC0142du.m1148F0(listM5947T);
        } else {
            listM1151I0 = AbstractC0142du.m1151I0(listM5947T);
            Collections.reverse(listM1151I0);
        }
        return AbstractC0142du.m1165u0(listM1151I0, null, "{", "}", new nx0(19), 25);
    }

    @Override // p000.p40
    /* JADX INFO: renamed from: u */
    public final Object mo2318u(C0067bt c0067bt) {
        return c0067bt.equals(this.f4519n) ? p40.m3741y(c0067bt).cast(this.f4520o) : this.f4521p.mo2318u(c0067bt);
    }
}
