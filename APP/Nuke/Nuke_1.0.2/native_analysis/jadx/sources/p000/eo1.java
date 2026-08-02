package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public class eo1 {

    /* JADX INFO: renamed from: a */
    public final zk1 f2530a = new zk1(new sn1[16]);

    /* JADX INFO: renamed from: b */
    public final lk1 f2531b = new lk1(10);

    /* JADX INFO: renamed from: a */
    public boolean mo1398a(gd1 gd1Var, c61 c61Var, er2 er2Var, boolean z) {
        zk1 zk1Var = this.f2530a;
        Object[] objArr = zk1Var.f13934h;
        int i = zk1Var.f13936j;
        boolean z2 = false;
        for (int i2 = 0; i2 < i; i2++) {
            z2 = ((sn1) objArr[i2]).mo1398a(gd1Var, c61Var, er2Var, z) || z2;
        }
        return z2;
    }

    /* JADX INFO: renamed from: b */
    public void mo1399b(er2 er2Var) {
        zk1 zk1Var = this.f2530a;
        int i = zk1Var.f13936j;
        while (true) {
            i--;
            if (-1 >= i) {
                return;
            }
            if (((sn1) zk1Var.f13934h[i]).f10241d.f2081i == 0) {
                zk1Var.m6432k(i);
            }
        }
    }
}
