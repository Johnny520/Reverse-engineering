package p001;

import java.util.Iterator;

/* JADX INFO: renamed from: ۟.e4 */
/* JADX INFO: loaded from: classes.dex */
public class C0195e4 implements Iterable<Integer>, InterfaceC0321n4 {

    /* JADX INFO: renamed from: ۥ */
    public final int f761;

    /* JADX INFO: renamed from: ۥ۟ */
    public final int f762;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final int f1424;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0195e4(int i, int i2, int i3) {
        if (i3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i3 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f761 = i;
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
        this.f762 = i2;
        this.f1424 = i3;
    }

    /* JADX DEBUG: Return type fixed from 'java.util.Iterator' to match base method */
    @Override // java.lang.Iterable
    public final Iterator<Integer> iterator() {
        return new C0209f4(this.f761, this.f762, this.f1424);
    }
}
