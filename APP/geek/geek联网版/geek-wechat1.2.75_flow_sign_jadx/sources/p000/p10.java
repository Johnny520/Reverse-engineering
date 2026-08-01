package p000;

/* JADX INFO: loaded from: classes.dex */
public final class p10 {

    /* JADX INFO: renamed from: a */
    public int f3563a;

    /* JADX INFO: renamed from: b */
    public int f3564b;

    /* JADX INFO: renamed from: c */
    public int f3565c;

    /* JADX INFO: renamed from: d */
    public int f3566d;

    /* JADX INFO: renamed from: e */
    public int f3567e;

    /* JADX INFO: renamed from: f */
    public int f3568f;

    /* JADX INFO: renamed from: g */
    public boolean f3569g;

    /* JADX INFO: renamed from: h */
    public boolean f3570h;

    /* JADX INFO: renamed from: a */
    public final void m2061a(int i, int i2) {
        this.f3565c = i;
        this.f3566d = i2;
        this.f3570h = true;
        if (this.f3569g) {
            if (i2 != Integer.MIN_VALUE) {
                this.f3563a = i2;
            }
            if (i != Integer.MIN_VALUE) {
                this.f3564b = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.f3563a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f3564b = i2;
        }
    }
}
