package defpackage;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ty1 implements a82 {
    public final Set h;
    public final zk1 i = new zk1(new lo0[16]);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ty1(Set set) {
        this.h = set;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.a82
    public final void a() {
        zk1 zk1Var = this.i;
        Object[] objArr = zk1Var.h;
        int i = zk1Var.j;
        for (int i2 = 0; i2 < i; i2++) {
            a82 a82Var = ((lo0) objArr[i2]).a;
            this.h.remove(a82Var);
            a82Var.a();
        }
    }

    @Override // defpackage.a82
    public final void d() {
    }

    @Override // defpackage.a82
    public final void f() {
    }
}
