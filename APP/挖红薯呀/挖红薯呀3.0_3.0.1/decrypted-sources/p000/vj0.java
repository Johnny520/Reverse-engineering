package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public class vj0 {

    /* JADX INFO: renamed from: a */
    public final sh0 f6726a = new sh0(new jj0[16]);

    /* JADX INFO: renamed from: b */
    public final dh0 f6727b = new dh0(10);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public boolean mo1712a(ub0 ub0Var, i50 i50Var, C0111d c0111d, boolean z) {
        sh0 sh0Var = this.f6726a;
        Object[] objArr = sh0Var.f5768d;
        int i = sh0Var.f5770f;
        boolean z2 = false;
        for (int i2 = 0; i2 < i; i2++) {
            z2 = ((jj0) objArr[i2]).mo1712a(ub0Var, i50Var, c0111d, z) || z2;
        }
        return z2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:3:0x0006 */
    /* JADX INFO: renamed from: b */
    public void mo1713b(C0111d c0111d) {
        sh0 sh0Var = this.f6726a;
        int i = sh0Var.f5770f;
        while (true) {
            i--;
            if (-1 >= i) {
                return;
            }
            if (((jj0) sh0Var.f5768d[i]).f2901d.f594d == 0) {
                sh0Var.m4081k(i);
            }
        }
    }
}
