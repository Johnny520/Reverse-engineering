package p000a;

import java.util.Iterator;

/* JADX INFO: renamed from: a.d9 */
/* JADX INFO: loaded from: classes.dex */
public class C0536d9 implements Iterable<Integer>, InterfaceC0783q9 {

    /* JADX INFO: renamed from: a */
    public final int f1929a;

    /* JADX INFO: renamed from: b */
    public final int f1930b;

    /* JADX INFO: renamed from: c */
    public final int f1931c;

    public C0536d9(int i, int i2, int i3) {
        if (i3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i3 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f1929a = i;
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
        this.f1930b = i2;
        this.f1931c = i3;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0536d9)) {
            return false;
        }
        if (isEmpty() && ((C0536d9) obj).isEmpty()) {
            return true;
        }
        C0536d9 c0536d9 = (C0536d9) obj;
        return this.f1929a == c0536d9.f1929a && this.f1930b == c0536d9.f1930b && this.f1931c == c0536d9.f1931c;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f1929a * 31) + this.f1930b) * 31) + this.f1931c;
    }

    public boolean isEmpty() {
        int i = this.f1931c;
        int i2 = this.f1930b;
        int i3 = this.f1929a;
        return i > 0 ? i3 > i2 : i3 < i2;
    }

    /* JADX DEBUG: Return type fixed from 'java.util.Iterator' to match base method */
    @Override // java.lang.Iterable
    public final Iterator<Integer> iterator() {
        return new C0555e9(this.f1929a, this.f1930b, this.f1931c);
    }

    public String toString() {
        StringBuilder sb;
        int i = this.f1930b;
        int i2 = this.f1929a;
        int i3 = this.f1931c;
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
