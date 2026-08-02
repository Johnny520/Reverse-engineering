package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class tn1 {

    /* JADX INFO: renamed from: a */
    public th1 f10853a;

    /* JADX INFO: renamed from: b */
    public int f10854b;

    /* JADX INFO: renamed from: c */
    public zk1 f10855c;

    /* JADX INFO: renamed from: d */
    public zk1 f10856d;

    /* JADX INFO: renamed from: e */
    public boolean f10857e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ vn1 f10858f;

    public tn1(vn1 vn1Var, th1 th1Var, int i, zk1 zk1Var, zk1 zk1Var2, boolean z) {
        this.f10858f = vn1Var;
        this.f10853a = th1Var;
        this.f10854b = i;
        this.f10855c = zk1Var;
        this.f10856d = zk1Var2;
        this.f10857e = z;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m5333a(int i, int i2) {
        zk1 zk1Var = this.f10855c;
        int i3 = this.f10854b;
        sh1 sh1Var = (sh1) zk1Var.f13934h[i + i3];
        sh1 sh1Var2 = (sh1) this.f10856d.f13934h[i3 + i2];
        return t11.m5086l(sh1Var, sh1Var2) || sh1Var.getClass() == sh1Var2.getClass();
    }
}
