package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class e81 {

    /* JADX INFO: renamed from: a */
    public final Object f2344a;

    /* JADX INFO: renamed from: b */
    public final g81 f2345b;

    /* JADX INFO: renamed from: d */
    public int f2347d;

    /* JADX INFO: renamed from: e */
    public e81 f2348e;

    /* JADX INFO: renamed from: f */
    public boolean f2349f;

    /* JADX INFO: renamed from: c */
    public int f2346c = -1;

    /* JADX INFO: renamed from: g */
    public final nx1 f2350g = op0.m3598u(null);

    public e81(Object obj, g81 g81Var) {
        this.f2344a = obj;
        this.f2345b = g81Var;
    }

    /* JADX INFO: renamed from: a */
    public final e81 m1291a() {
        if (this.f2349f) {
            nz0.m3458c("Pin should not be called on an already disposed item ");
        }
        if (this.f2347d == 0) {
            this.f2345b.f3351h.add(this);
            e81 e81Var = (e81) this.f2350g.getValue();
            if (e81Var != null) {
                e81Var.m1291a();
            } else {
                e81Var = null;
            }
            this.f2348e = e81Var;
        }
        this.f2347d++;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final void m1292b() {
        if (this.f2349f) {
            return;
        }
        if (this.f2347d <= 0) {
            nz0.m3458c("Release should only be called once");
        }
        int i = this.f2347d - 1;
        this.f2347d = i;
        if (i == 0) {
            this.f2345b.f3351h.remove(this);
            e81 e81Var = this.f2348e;
            if (e81Var != null) {
                e81Var.m1292b();
            }
            this.f2348e = null;
        }
    }
}
