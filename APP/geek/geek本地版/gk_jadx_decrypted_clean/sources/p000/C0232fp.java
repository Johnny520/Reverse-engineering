package p000;

import java.util.Iterator;

/* JADX INFO: renamed from: fp */
/* JADX INFO: loaded from: classes.dex */
public class C0232fp implements Iterable {

    /* JADX INFO: renamed from: a */
    public final int f1988a;

    /* JADX INFO: renamed from: b */
    public final int f1989b;

    /* JADX INFO: renamed from: c */
    public final int f1990c;

    public C0232fp(int i, int i2, int i3) {
        if (i3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i3 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f1988a = i;
        if (i3 > 0) {
            if (i < i2) {
                int i4 = i2 % i3;
                int i5 = i % i3;
                int i6 = ((i4 < 0 ? i4 + i3 : i4) - (i5 < 0 ? i5 + i3 : i5)) % i3;
                i2 -= i6 < 0 ? i6 + i3 : i6;
            }
        } else {
            if (i3 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            }
            if (i > i2) {
                int i7 = -i3;
                int i8 = i % i7;
                int i9 = i2 % i7;
                int i10 = ((i8 < 0 ? i8 + i7 : i8) - (i9 < 0 ? i9 + i7 : i9)) % i7;
                i2 += i10 < 0 ? i10 + i7 : i10;
            }
        }
        this.f1989b = i2;
        this.f1990c = i3;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0232fp)) {
            return false;
        }
        if (isEmpty() && ((C0232fp) obj).isEmpty()) {
            return true;
        }
        C0232fp c0232fp = (C0232fp) obj;
        return this.f1988a == c0232fp.f1988a && this.f1989b == c0232fp.f1989b && this.f1990c == c0232fp.f1990c;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f1988a * 31) + this.f1989b) * 31) + this.f1990c;
    }

    public boolean isEmpty() {
        int i = this.f1990c;
        int i2 = this.f1989b;
        int i3 = this.f1988a;
        return i > 0 ? i3 > i2 : i3 < i2;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C0269gp(this.f1988a, this.f1989b, this.f1990c);
    }

    public String toString() {
        StringBuilder sb;
        int i = this.f1989b;
        int i2 = this.f1988a;
        int i3 = this.f1990c;
        if (i3 > 0) {
            sb = new StringBuilder();
            sb.append(i2);
            sb.append("..");
            sb.append(i);
            sb.append(" step ");
            sb.append(i3);
        } else {
            sb = new StringBuilder();
            sb.append(i2);
            sb.append(" downTo ");
            sb.append(i);
            sb.append(" step ");
            sb.append(-i3);
        }
        return sb.toString();
    }
}
