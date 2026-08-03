package p000;

import java.util.Iterator;

/* JADX INFO: renamed from: Dl */
/* JADX INFO: loaded from: classes.dex */
public class C0157Dl implements Iterable, InterfaceC0545Mm {

    /* JADX INFO: renamed from: a */
    public final int f432a;

    /* JADX INFO: renamed from: b */
    public final int f433b;

    /* JADX INFO: renamed from: c */
    public final int f434c;

    public C0157Dl(int i, int i2, int i3) {
        if (i3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i3 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f432a = i;
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
        this.f433b = i2;
        this.f434c = i3;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0157Dl)) {
            return false;
        }
        if (isEmpty() && ((C0157Dl) obj).isEmpty()) {
            return true;
        }
        C0157Dl c0157Dl = (C0157Dl) obj;
        return this.f432a == c0157Dl.f432a && this.f433b == c0157Dl.f433b && this.f434c == c0157Dl.f434c;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f432a * 31) + this.f433b) * 31) + this.f434c;
    }

    public boolean isEmpty() {
        int i = this.f434c;
        int i2 = this.f433b;
        int i3 = this.f432a;
        return i > 0 ? i3 > i2 : i3 < i2;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C0200El(this.f432a, this.f433b, this.f434c);
    }

    public String toString() {
        StringBuilder sb;
        int i = this.f433b;
        int i2 = this.f432a;
        int i3 = this.f434c;
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
