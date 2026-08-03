package p057g;

/* JADX INFO: renamed from: g.x0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0937x0 {

    /* JADX INFO: renamed from: a */
    public int f3321a;

    /* JADX INFO: renamed from: b */
    public int f3322b;

    /* JADX INFO: renamed from: c */
    public int f3323c;

    /* JADX INFO: renamed from: d */
    public int f3324d;

    /* JADX INFO: renamed from: e */
    public int f3325e;

    /* JADX INFO: renamed from: f */
    public int f3326f;

    /* JADX INFO: renamed from: g */
    public boolean f3327g;

    /* JADX INFO: renamed from: h */
    public boolean f3328h;

    /* JADX INFO: renamed from: a */
    public final void m2272a(int i2, int i3) {
        this.f3323c = i2;
        this.f3324d = i3;
        this.f3328h = true;
        if (this.f3327g) {
            if (i3 != Integer.MIN_VALUE) {
                this.f3321a = i3;
            }
            if (i2 != Integer.MIN_VALUE) {
                this.f3322b = i2;
                return;
            }
            return;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f3321a = i2;
        }
        if (i3 != Integer.MIN_VALUE) {
            this.f3322b = i3;
        }
    }
}
