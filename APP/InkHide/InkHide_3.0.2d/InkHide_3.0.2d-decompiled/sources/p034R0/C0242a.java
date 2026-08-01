package p034R0;

import java.util.Iterator;
import p029O0.InterfaceC0233a;

/* JADX INFO: renamed from: R0.a */
/* JADX INFO: loaded from: classes.dex */
public class C0242a implements Iterable, InterfaceC0233a {

    /* JADX INFO: renamed from: a */
    public final int f583a;

    /* JADX INFO: renamed from: b */
    public final int f584b;

    /* JADX INFO: renamed from: c */
    public final int f585c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0242a(int i2, int i3, int i4) {
        if (i4 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i4 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f583a = i2;
        if (i4 > 0) {
            if (i2 < i3) {
                int i5 = i3 % i4;
                int i6 = i2 % i4;
                int i7 = ((i5 < 0 ? i5 + i4 : i5) - (i6 < 0 ? i6 + i4 : i6)) % i4;
                i3 -= i7 < 0 ? i7 + i4 : i7;
            }
        } else {
            if (i4 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            }
            if (i2 > i3) {
                int i8 = -i4;
                int i9 = i2 % i8;
                int i10 = i3 % i8;
                int i11 = ((i9 < 0 ? i9 + i8 : i9) - (i10 < 0 ? i10 + i8 : i10)) % i8;
                i3 += i11 < 0 ? i11 + i8 : i11;
            }
        }
        this.f584b = i3;
        this.f585c = i4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean equals(Object obj) {
        if (!(obj instanceof C0242a)) {
            return false;
        }
        if (isEmpty() && ((C0242a) obj).isEmpty()) {
            return true;
        }
        C0242a c0242a = (C0242a) obj;
        return this.f583a == c0242a.f583a && this.f584b == c0242a.f584b && this.f585c == c0242a.f585c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f583a * 31) + this.f584b) * 31) + this.f585c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean isEmpty() {
        int i2 = this.f585c;
        int i3 = this.f584b;
        int i4 = this.f583a;
        return i2 > 0 ? i4 > i3 : i4 < i3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C0243b(this.f583a, this.f584b, this.f585c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        StringBuilder sb;
        int i2 = this.f584b;
        int i3 = this.f583a;
        int i4 = this.f585c;
        if (i4 > 0) {
            sb = new StringBuilder();
            sb.append(i3);
            sb.append("..");
            sb.append(i2);
            sb.append(" step ");
            sb.append(i4);
        } else {
            sb = new StringBuilder();
            sb.append(i3);
            sb.append(" downTo ");
            sb.append(i2);
            sb.append(" step ");
            sb.append(-i4);
        }
        return sb.toString();
    }
}
