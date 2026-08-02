package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public class eo1 {
    public final zk1 a = new zk1(new sn1[16]);
    public final lk1 b = new lk1(10);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean a(gd1 gd1Var, c61 c61Var, er2 er2Var, boolean z) {
        zk1 zk1Var = this.a;
        Object[] objArr = zk1Var.h;
        int i = zk1Var.j;
        boolean z2 = false;
        for (int i2 = 0; i2 < i; i2++) {
            z2 = ((sn1) objArr[i2]).a(gd1Var, c61Var, er2Var, z) || z2;
        }
        return z2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:3:0x0006 */
    public void b(er2 er2Var) {
        zk1 zk1Var = this.a;
        int i = zk1Var.j;
        while (true) {
            i--;
            if (-1 >= i) {
                return;
            }
            if (((sn1) zk1Var.h[i]).d.i == 0) {
                zk1Var.k(i);
            }
        }
    }
}
