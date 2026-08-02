package defpackage;

import java.security.MessageDigest;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ov1 implements a51 {
    public final ro b = new ro(0);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.a51
    public final void b(MessageDigest messageDigest) {
        int i = 0;
        while (true) {
            ro roVar = this.b;
            if (i >= roVar.j) {
                return;
            }
            mv1 mv1Var = (mv1) roVar.f(i);
            Object objJ = this.b.j(i);
            lv1 lv1Var = mv1Var.b;
            if (mv1Var.d == null) {
                mv1Var.d = mv1Var.c.getBytes(a51.a);
            }
            lv1Var.a(mv1Var.d, objJ, messageDigest);
            i++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object c(mv1 mv1Var) {
        ro roVar = this.b;
        return roVar.containsKey(mv1Var) ? roVar.get(mv1Var) : mv1Var.a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.a51
    public final boolean equals(Object obj) {
        if (obj instanceof ov1) {
            return this.b.equals(((ov1) obj).b);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.a51
    public final int hashCode() {
        return this.b.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "Options{values=" + this.b + '}';
    }
}
