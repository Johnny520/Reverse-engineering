package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public class a11 implements Iterable, q41 {
    public final int h;
    public final int i;
    public final int j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public a11(int i, int i2, int i3) {
        if (i3 == 0) {
            s.j("Step must be non-zero.");
            throw null;
        }
        if (i3 == Integer.MIN_VALUE) {
            s.j("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
            throw null;
        }
        this.h = i;
        this.i = p40.C(i, i2, i3);
        this.j = i3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean equals(Object obj) {
        if (!(obj instanceof a11)) {
            return false;
        }
        if (isEmpty() && ((a11) obj).isEmpty()) {
            return true;
        }
        a11 a11Var = (a11) obj;
        return this.h == a11Var.h && this.i == a11Var.i && this.j == a11Var.j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.h * 31) + this.i) * 31) + this.j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean isEmpty() {
        int i = this.i;
        int i2 = this.j;
        int i3 = this.h;
        return i2 > 0 ? i3 > i : i3 < i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new b11(this.h, this.i, this.j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        StringBuilder sb;
        int i = this.i;
        int i2 = this.j;
        int i3 = this.h;
        if (i2 > 0) {
            sb = new StringBuilder();
            sb.append(i3);
            sb.append("..");
            sb.append(i);
            sb.append(" step ");
            sb.append(i2);
        } else {
            sb = new StringBuilder();
            sb.append(i3);
            sb.append(" downTo ");
            sb.append(i);
            sb.append(" step ");
            sb.append(-i2);
        }
        return sb.toString();
    }
}
