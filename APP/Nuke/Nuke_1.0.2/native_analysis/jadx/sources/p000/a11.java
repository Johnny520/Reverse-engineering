package p000;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public class a11 implements Iterable, q41 {

    /* JADX INFO: renamed from: h */
    public final int f25h;

    /* JADX INFO: renamed from: i */
    public final int f26i;

    /* JADX INFO: renamed from: j */
    public final int f27j;

    public a11(int i, int i2, int i3) {
        if (i3 == 0) {
            C0676s.m4651j("Step must be non-zero.");
            throw null;
        }
        if (i3 == Integer.MIN_VALUE) {
            C0676s.m4651j("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
            throw null;
        }
        this.f25h = i;
        this.f26i = p40.m3693C(i, i2, i3);
        this.f27j = i3;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a11)) {
            return false;
        }
        if (isEmpty() && ((a11) obj).isEmpty()) {
            return true;
        }
        a11 a11Var = (a11) obj;
        return this.f25h == a11Var.f25h && this.f26i == a11Var.f26i && this.f27j == a11Var.f27j;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f25h * 31) + this.f26i) * 31) + this.f27j;
    }

    public boolean isEmpty() {
        int i = this.f26i;
        int i2 = this.f27j;
        int i3 = this.f25h;
        return i2 > 0 ? i3 > i : i3 < i;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new b11(this.f25h, this.f26i, this.f27j);
    }

    public String toString() {
        StringBuilder sb;
        int i = this.f26i;
        int i2 = this.f27j;
        int i3 = this.f25h;
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
