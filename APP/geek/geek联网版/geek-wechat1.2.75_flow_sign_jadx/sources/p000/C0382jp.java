package p000;

import java.util.Iterator;

/* JADX INFO: renamed from: jp */
/* JADX INFO: loaded from: classes.dex */
public class C0382jp implements Iterable {

    /* JADX INFO: renamed from: a */
    public final int f2737a;

    /* JADX INFO: renamed from: b */
    public final int f2738b;

    /* JADX INFO: renamed from: c */
    public final int f2739c;

    public C0382jp(int i, int i2, int i3) {
        if (i3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i3 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f2737a = i;
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
        this.f2738b = i2;
        this.f2739c = i3;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0382jp)) {
            return false;
        }
        if (isEmpty() && ((C0382jp) obj).isEmpty()) {
            return true;
        }
        C0382jp c0382jp = (C0382jp) obj;
        return this.f2737a == c0382jp.f2737a && this.f2738b == c0382jp.f2738b && this.f2739c == c0382jp.f2739c;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f2737a * 31) + this.f2738b) * 31) + this.f2739c;
    }

    public boolean isEmpty() {
        int i = this.f2739c;
        int i2 = this.f2738b;
        int i3 = this.f2737a;
        return i > 0 ? i3 > i2 : i3 < i2;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C0419kp(this.f2737a, this.f2738b, this.f2739c);
    }

    public String toString() {
        StringBuilder sb;
        int i = this.f2738b;
        int i2 = this.f2737a;
        int i3 = this.f2739c;
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
