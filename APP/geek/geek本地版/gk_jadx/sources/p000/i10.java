package p000;

/* JADX INFO: loaded from: classes.dex */
public final class i10 {

    /* JADX INFO: renamed from: a */
    public int f2328a;

    /* JADX INFO: renamed from: b */
    public int f2329b;

    /* JADX INFO: renamed from: c */
    public int f2330c;

    /* JADX INFO: renamed from: d */
    public int f2331d;

    /* JADX INFO: renamed from: e */
    public int f2332e;

    /* JADX INFO: renamed from: f */
    public int f2333f;

    /* JADX INFO: renamed from: g */
    public boolean f2334g;

    /* JADX INFO: renamed from: h */
    public boolean f2335h;

    /* JADX INFO: renamed from: a */
    public final void m1384a(int i, int i2) {
        this.f2330c = i;
        this.f2331d = i2;
        this.f2335h = true;
        if (this.f2334g) {
            if (i2 != Integer.MIN_VALUE) {
                this.f2328a = i2;
            }
            if (i != Integer.MIN_VALUE) {
                this.f2329b = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.f2328a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f2329b = i2;
        }
    }
}
