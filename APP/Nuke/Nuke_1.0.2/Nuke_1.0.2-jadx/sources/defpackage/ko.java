package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ko implements rf, h01, us1 {
    public final int h;
    public int i;
    public final Object j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ko(int i, int i2) {
        this.j = null;
        this.h = i;
        int i3 = i2 & 7;
        this.i = i3 == 0 ? 8 : i3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rf
    public void a(int i, Object obj) {
        ((rf) this.j).a(i + (this.i == 0 ? this.h : 0), obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rf
    public void b(Object obj) {
        this.i++;
        ((rf) this.j).b(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.h01
    public void e(wz1 wz1Var) {
        if (wz1Var.h.a == 3) {
            int i = ((g30) wz1Var.l).h;
            boolean[] zArr = (boolean[]) this.j;
            zArr[0] = zArr[0] && (this.h - this.i) + i == wz1Var.j.h;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rf
    public void f() {
        ((rf) this.j).f();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rf
    public void g(int i, Object obj) {
        ((rf) this.j).g(i + (this.i == 0 ? this.h : 0), obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rf
    public void j(int i, int i2, int i3) {
        int i4 = this.i == 0 ? this.h : 0;
        ((rf) this.j).j(i + i4, i2 + i4, i3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rf
    public Object k() {
        return ((rf) this.j).k();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rf
    public void l(int i, int i2) {
        ((rf) this.j).l(i + (this.i == 0 ? this.h : 0), i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rf
    public void m(mn0 mn0Var, Object obj) {
        ((rf) this.j).m(mn0Var, obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.us1
    public int n(int i) {
        int iN = ((us1) this.j).n(i);
        if (i >= 0 && i <= this.i) {
            l93.c(iN, this.h, i);
        }
        return iN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rf
    public void o() {
        if (this.i <= 0) {
            tx.a("OffsetApplier up called with no corresponding down");
        }
        this.i--;
        ((rf) this.j).o();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.us1
    public int p(int i) {
        int iP = ((us1) this.j).p(i);
        if (i >= 0 && i <= this.h) {
            l93.b(iP, this.i, i);
        }
        return iP;
    }

    public ko(rf rfVar, int i) {
        this.j = rfVar;
        this.h = i;
    }

    public ko() {
        this.j = new ko[256];
        this.h = 0;
        this.i = 0;
    }

    public /* synthetic */ ko(int i, int i2, Object obj) {
        this.j = obj;
        this.h = i;
        this.i = i2;
    }

    @Override // defpackage.h01
    public void c(j23 j23Var) {
    }

    @Override // defpackage.h01
    public void d(xz1 xz1Var) {
    }

    @Override // defpackage.h01
    public void h(k23 k23Var) {
    }
}
