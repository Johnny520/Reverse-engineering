package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class c11 extends a11 {
    public static final c11 k = new c11(1, 0, 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.a11
    public final boolean equals(Object obj) {
        if (!(obj instanceof c11)) {
            return false;
        }
        if (isEmpty() && ((c11) obj).isEmpty()) {
            return true;
        }
        c11 c11Var = (c11) obj;
        return this.h == c11Var.h && this.i == c11Var.i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.a11
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.h * 31) + this.i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.a11
    public final boolean isEmpty() {
        return this.h > this.i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.a11
    public final String toString() {
        return this.h + ".." + this.i;
    }
}
