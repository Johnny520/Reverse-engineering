package p000;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class cv0 implements ht2 {

    /* JADX INFO: renamed from: h */
    public final yw0 f1742h;

    /* JADX INFO: renamed from: i */
    public final tm0 f1743i;

    /* JADX INFO: renamed from: j */
    public boolean f1744j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ iv0 f1745k;

    public cv0(iv0 iv0Var, yw0 yw0Var) {
        yw0Var.getClass();
        this.f1745k = iv0Var;
        this.f1742h = yw0Var;
        this.f1743i = new tm0(((o52) iv0Var.f4801c.f563j).f7529h.mo889a());
    }

    @Override // p000.ht2
    /* JADX INFO: renamed from: a */
    public final o23 mo889a() {
        return this.f1743i;
    }

    /* JADX INFO: renamed from: b */
    public final void m890b(js0 js0Var) {
        et1 et1Var;
        C0700sn c0700sn;
        js0Var.getClass();
        iv0 iv0Var = this.f1745k;
        int i = iv0Var.f4802d;
        if (i == 6) {
            return;
        }
        if (i != 5) {
            throw new IllegalStateException("state: " + iv0Var.f4802d);
        }
        tm0 tm0Var = this.f1743i;
        o23 o23Var = tm0Var.f10844e;
        tm0Var.f10844e = o23.f7455d;
        o23Var.mo3473a();
        o23Var.mo3474b();
        iv0Var.f4802d = 6;
        if (js0Var.size() <= 0 || (et1Var = iv0Var.f4799a) == null || (c0700sn = et1Var.f2609j) == null) {
            return;
        }
        sw0.m5007b(c0700sn, this.f1742h, js0Var);
    }

    @Override // p000.ht2
    /* JADX INFO: renamed from: n */
    public long mo891n(C0209fn c0209fn, long j) throws IOException {
        iv0 iv0Var = this.f1745k;
        c0209fn.getClass();
        try {
            return ((o52) iv0Var.f4801c.f563j).mo891n(c0209fn, j);
        } catch (IOException e) {
            iv0Var.f4800b.mo4628h();
            this.m890b(iv0.f4798f);
            throw e;
        }
    }
}
