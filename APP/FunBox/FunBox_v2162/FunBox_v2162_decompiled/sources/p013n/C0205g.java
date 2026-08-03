package p013n;

import java.util.Arrays;

/* JADX INFO: renamed from: n.g */
/* JADX INFO: loaded from: classes.dex */
public final class C0205g extends AbstractC0208j {

    /* JADX INFO: renamed from: e */
    public static final C0205g f806e;

    /* JADX INFO: renamed from: b */
    private int[] f807b;

    /* JADX INFO: renamed from: c */
    private int f808c;

    /* JADX INFO: renamed from: d */
    private boolean f809d;

    static {
        C0205g c0205g = new C0205g(0);
        f806e = c0205g;
        c0205g.m536g();
    }

    public C0205g(int i2) {
        super(true);
        try {
            this.f807b = new int[i2];
            this.f808c = 0;
            this.f809d = true;
        } catch (NegativeArraySizeException unused) {
            throw new IllegalArgumentException("size < 0");
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0205g)) {
            return false;
        }
        C0205g c0205g = (C0205g) obj;
        if (this.f809d != c0205g.f809d || this.f808c != c0205g.f808c) {
            return false;
        }
        for (int i2 = 0; i2 < this.f808c; i2++) {
            if (this.f807b[i2] != c0205g.f807b[i2]) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i2 = 0;
        for (int i3 = 0; i3 < this.f808c; i3++) {
            i2 = (i2 * 31) + this.f807b[i3];
        }
        return i2;
    }

    /* JADX INFO: renamed from: j */
    public final void m524j(int i2) {
        m537h();
        int i3 = this.f808c;
        int[] iArr = this.f807b;
        if (i3 == iArr.length) {
            int[] iArr2 = new int[((i3 * 3) / 2) + 10];
            System.arraycopy(iArr, 0, iArr2, 0, i3);
            this.f807b = iArr2;
        }
        int[] iArr3 = this.f807b;
        int i4 = this.f808c;
        int i5 = i4 + 1;
        this.f808c = i5;
        iArr3[i4] = i2;
        if (!this.f809d || i5 <= 1) {
            return;
        }
        this.f809d = i2 >= iArr3[i5 + (-2)];
    }

    /* JADX INFO: renamed from: k */
    public final boolean m525k(int i2) {
        int i3;
        int i4;
        int i5 = this.f808c;
        if (!this.f809d) {
            i3 = 0;
            while (true) {
                if (i3 >= i5) {
                    i3 = -i5;
                    break;
                }
                if (this.f807b[i3] == i2) {
                    break;
                }
                i3++;
            }
        } else {
            i3 = i5;
            int i6 = -1;
            while (i3 > i6 + 1) {
                int i7 = ((i3 - i6) >> 1) + i6;
                if (i2 <= this.f807b[i7]) {
                    i3 = i7;
                } else {
                    i6 = i7;
                }
            }
            if (i3 == i5) {
                i4 = -i5;
            } else if (i2 != this.f807b[i3]) {
                i4 = -i3;
            }
            i3 = i4 - 1;
        }
        return (i3 >= 0 ? i3 : -1) >= 0;
    }

    /* JADX INFO: renamed from: l */
    public final int m526l(int i2) {
        if (i2 >= this.f808c) {
            throw new IndexOutOfBoundsException("n >= size()");
        }
        try {
            return this.f807b[i2];
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new IndexOutOfBoundsException("n < 0");
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m527m(int i2, int i3) {
        m537h();
        if (i2 >= this.f808c) {
            throw new IndexOutOfBoundsException("n >= size()");
        }
        try {
            this.f807b[i2] = i3;
            this.f809d = false;
        } catch (ArrayIndexOutOfBoundsException unused) {
            if (i2 < 0) {
                throw new IllegalArgumentException("n < 0");
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m528n(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("newSize < 0");
        }
        if (i2 > this.f808c) {
            throw new IllegalArgumentException("newSize > size");
        }
        m537h();
        this.f808c = i2;
    }

    /* JADX INFO: renamed from: o */
    public final int m529o() {
        return this.f808c;
    }

    /* JADX INFO: renamed from: p */
    public final void m530p() {
        m537h();
        if (this.f809d) {
            return;
        }
        Arrays.sort(this.f807b, 0, this.f808c);
        this.f809d = true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.f808c * 5) + 10);
        sb.append('{');
        for (int i2 = 0; i2 < this.f808c; i2++) {
            if (i2 != 0) {
                sb.append(", ");
            }
            sb.append(this.f807b[i2]);
        }
        sb.append('}');
        return sb.toString();
    }
}
