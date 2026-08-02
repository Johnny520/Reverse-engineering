package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class tn1 {
    public th1 a;
    public int b;
    public zk1 c;
    public zk1 d;
    public boolean e;
    public final /* synthetic */ vn1 f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public tn1(vn1 vn1Var, th1 th1Var, int i, zk1 zk1Var, zk1 zk1Var2, boolean z) {
        this.f = vn1Var;
        this.a = th1Var;
        this.b = i;
        this.c = zk1Var;
        this.d = zk1Var2;
        this.e = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean a(int i, int i2) {
        zk1 zk1Var = this.c;
        int i3 = this.b;
        sh1 sh1Var = (sh1) zk1Var.h[i + i3];
        sh1 sh1Var2 = (sh1) this.d.h[i3 + i2];
        return t11.l(sh1Var, sh1Var2) || sh1Var.getClass() == sh1Var2.getClass();
    }
}
