package p000a;

/* JADX INFO: renamed from: a.Bd */
/* JADX INFO: loaded from: classes.dex */
public final class C0033Bd {

    /* JADX INFO: renamed from: a */
    public int f120a;

    /* JADX INFO: renamed from: b */
    public int f121b;

    /* JADX INFO: renamed from: c */
    public int f122c;

    /* JADX INFO: renamed from: d */
    public int f123d;

    /* JADX INFO: renamed from: e */
    public int f124e;

    /* JADX INFO: renamed from: f */
    public int f125f;

    /* JADX INFO: renamed from: g */
    public boolean f126g;

    /* JADX INFO: renamed from: h */
    public boolean f127h;

    /* JADX INFO: renamed from: a */
    public final void m93a(int i, int i2) {
        this.f122c = i;
        this.f123d = i2;
        this.f127h = true;
        if (this.f126g) {
            if (i2 != Integer.MIN_VALUE) {
                this.f120a = i2;
            }
            if (i != Integer.MIN_VALUE) {
                this.f121b = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.f120a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f121b = i2;
        }
    }
}
