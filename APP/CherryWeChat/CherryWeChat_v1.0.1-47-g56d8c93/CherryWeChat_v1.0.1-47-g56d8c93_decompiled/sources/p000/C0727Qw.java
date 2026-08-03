package p000;

/* JADX INFO: renamed from: Qw */
/* JADX INFO: loaded from: classes.dex */
public final class C0727Qw {

    /* JADX INFO: renamed from: a */
    public int f2316a;

    /* JADX INFO: renamed from: b */
    public int f2317b;

    /* JADX INFO: renamed from: c */
    public int f2318c;

    /* JADX INFO: renamed from: d */
    public int f2319d;

    /* JADX INFO: renamed from: e */
    public int f2320e;

    /* JADX INFO: renamed from: f */
    public int f2321f;

    /* JADX INFO: renamed from: g */
    public boolean f2322g;

    /* JADX INFO: renamed from: h */
    public boolean f2323h;

    /* JADX INFO: renamed from: a */
    public final void m1510a(int i, int i2) {
        this.f2318c = i;
        this.f2319d = i2;
        this.f2323h = true;
        if (this.f2322g) {
            if (i2 != Integer.MIN_VALUE) {
                this.f2316a = i2;
            }
            if (i != Integer.MIN_VALUE) {
                this.f2317b = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.f2316a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f2317b = i2;
        }
    }
}
