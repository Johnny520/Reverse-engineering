package p036T0;

import java.util.Iterator;
import p033R0.InterfaceC0319a;

/* JADX INFO: renamed from: T0.a */
/* JADX INFO: loaded from: classes.dex */
public class C0338a implements Iterable, InterfaceC0319a {

    /* JADX INFO: renamed from: a */
    public final int f657a;

    /* JADX INFO: renamed from: b */
    public final int f658b;

    /* JADX INFO: renamed from: c */
    public final int f659c;

    public C0338a(int i2, int i3, int i4) {
        if (i4 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i4 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f657a = i2;
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
        this.f658b = i3;
        this.f659c = i4;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C0338a) {
            if (!isEmpty() || !((C0338a) obj).isEmpty()) {
                C0338a c0338a = (C0338a) obj;
                if (this.f657a != c0338a.f657a || this.f658b != c0338a.f658b || this.f659c != c0338a.f659c) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f657a * 31) + this.f658b) * 31) + this.f659c;
    }

    public boolean isEmpty() {
        int i2 = this.f659c;
        int i3 = this.f658b;
        int i4 = this.f657a;
        if (i2 > 0) {
            if (i4 <= i3) {
                return false;
            }
        } else if (i4 >= i3) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C0339b(this.f657a, this.f658b, this.f659c);
    }

    public String toString() {
        StringBuilder sb;
        int i2 = this.f658b;
        int i3 = this.f657a;
        int i4 = this.f659c;
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
