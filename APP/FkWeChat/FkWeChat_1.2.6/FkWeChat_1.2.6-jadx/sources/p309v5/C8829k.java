package p309v5;

import java.util.Arrays;
import p376zd.C9987e;

/* JADX INFO: renamed from: v5.k */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C8829k extends AbstractC8834p {

    /* JADX INFO: renamed from: u */
    public static final C8829k f29361u;

    /* JADX INFO: renamed from: r */
    public int[] f29362r;

    /* JADX INFO: renamed from: s */
    public int f29363s;

    /* JADX INFO: renamed from: t */
    public boolean f29364t;

    static {
        C8829k c8829k = new C8829k(0);
        f29361u = c8829k;
        c8829k.mo6829t();
    }

    public C8829k(int i10) {
        super(true);
        try {
            this.f29362r = new int[i10];
            this.f29363s = 0;
            this.f29364t = true;
        } catch (NegativeArraySizeException unused) {
            C9987e.m38645a("size < 0");
            throw null;
        }
    }

    /* JADX INFO: renamed from: D */
    public static C8829k m33905D(int i10) {
        C8829k c8829k = new C8829k(1);
        c8829k.m33917w(i10);
        c8829k.mo6829t();
        return c8829k;
    }

    /* JADX INFO: renamed from: E */
    public static C8829k m33906E(int i10, int i11) {
        C8829k c8829k = new C8829k(2);
        c8829k.m33917w(i10);
        c8829k.m33917w(i11);
        c8829k.mo6829t();
        return c8829k;
    }

    /* JADX INFO: renamed from: A */
    public final void m33907A() {
        int i10 = this.f29363s;
        int[] iArr = this.f29362r;
        if (i10 == iArr.length) {
            int[] iArr2 = new int[((i10 * 3) / 2) + 10];
            System.arraycopy(iArr, 0, iArr2, 0, i10);
            this.f29362r = iArr2;
        }
    }

    /* JADX INFO: renamed from: B */
    public int m33908B(int i10) {
        int iM33918x = m33918x(i10);
        if (iM33918x >= 0) {
            return iM33918x;
        }
        return -1;
    }

    /* JADX INFO: renamed from: C */
    public void m33909C(int i10, int i11) {
        if (i10 > this.f29363s) {
            throw new IndexOutOfBoundsException("n > size()");
        }
        m33907A();
        int[] iArr = this.f29362r;
        int i12 = i10 + 1;
        System.arraycopy(iArr, i10, iArr, i12, this.f29363s - i10);
        int[] iArr2 = this.f29362r;
        iArr2[i10] = i11;
        int i13 = this.f29363s;
        this.f29363s = i13 + 1;
        this.f29364t = this.f29364t && (i10 == 0 || i11 > iArr2[i10 + (-1)]) && (i10 == i13 || i11 < iArr2[i12]);
    }

    /* JADX INFO: renamed from: F */
    public C8829k m33910F() {
        int i10 = this.f29363s;
        C8829k c8829k = new C8829k(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            c8829k.m33917w(this.f29362r[i11]);
        }
        return c8829k;
    }

    /* JADX INFO: renamed from: G */
    public int m33911G() {
        m33929u();
        this.f29363s--;
        return m33920z(this.f29363s - 1);
    }

    /* JADX INFO: renamed from: H */
    public void m33912H(int i10) {
        if (i10 >= this.f29363s) {
            throw new IndexOutOfBoundsException("n >= size()");
        }
        int[] iArr = this.f29362r;
        System.arraycopy(iArr, i10 + 1, iArr, i10, (r0 - i10) - 1);
        this.f29363s--;
    }

    /* JADX INFO: renamed from: I */
    public void m33913I(int i10, int i11) {
        m33929u();
        if (i10 >= this.f29363s) {
            throw new IndexOutOfBoundsException("n >= size()");
        }
        try {
            this.f29362r[i10] = i11;
            this.f29364t = false;
        } catch (ArrayIndexOutOfBoundsException unused) {
            if (i10 >= 0) {
                return;
            }
            C9987e.m38645a("n < 0");
        }
    }

    /* JADX INFO: renamed from: J */
    public void m33914J(int i10) {
        if (i10 < 0) {
            C9987e.m38645a("newSize < 0");
        } else if (i10 > this.f29363s) {
            C9987e.m38645a("newSize > size");
        } else {
            m33929u();
            this.f29363s = i10;
        }
    }

    /* JADX INFO: renamed from: K */
    public void m33915K() {
        m33929u();
        if (this.f29364t) {
            return;
        }
        Arrays.sort(this.f29362r, 0, this.f29363s);
        this.f29364t = true;
    }

    /* JADX INFO: renamed from: L */
    public int m33916L() {
        return m33920z(this.f29363s - 1);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C8829k)) {
            return false;
        }
        C8829k c8829k = (C8829k) obj;
        if (this.f29364t != c8829k.f29364t || this.f29363s != c8829k.f29363s) {
            return false;
        }
        for (int i10 = 0; i10 < this.f29363s; i10++) {
            if (this.f29362r[i10] != c8829k.f29362r[i10]) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i10 = 0;
        for (int i11 = 0; i11 < this.f29363s; i11++) {
            i10 = (i10 * 31) + this.f29362r[i11];
        }
        return i10;
    }

    public int size() {
        return this.f29363s;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder((this.f29363s * 5) + 10);
        sb2.append('{');
        for (int i10 = 0; i10 < this.f29363s; i10++) {
            if (i10 != 0) {
                sb2.append(", ");
            }
            sb2.append(this.f29362r[i10]);
        }
        sb2.append('}');
        return sb2.toString();
    }

    /* JADX INFO: renamed from: w */
    public void m33917w(int i10) {
        m33929u();
        m33907A();
        int[] iArr = this.f29362r;
        int i11 = this.f29363s;
        int i12 = i11 + 1;
        this.f29363s = i12;
        iArr[i11] = i10;
        if (this.f29364t) {
            if (i12 > 1) {
                this.f29364t = i10 >= iArr[i11 + (-1)];
            }
        }
    }

    /* JADX INFO: renamed from: x */
    public int m33918x(int i10) {
        int i11;
        int i12 = this.f29363s;
        if (!this.f29364t) {
            for (int i13 = 0; i13 < i12; i13++) {
                if (this.f29362r[i13] == i10) {
                    return i13;
                }
            }
            return -i12;
        }
        int i14 = -1;
        int i15 = i12;
        while (i15 > i14 + 1) {
            int i16 = ((i15 - i14) >> 1) + i14;
            if (i10 <= this.f29362r[i16]) {
                i15 = i16;
            } else {
                i14 = i16;
            }
        }
        if (i15 == i12) {
            i11 = -i12;
        } else {
            if (i10 == this.f29362r[i15]) {
                return i15;
            }
            i11 = -i15;
        }
        return i11 - 1;
    }

    /* JADX INFO: renamed from: y */
    public boolean m33919y(int i10) {
        return m33908B(i10) >= 0;
    }

    /* JADX INFO: renamed from: z */
    public int m33920z(int i10) {
        if (i10 >= this.f29363s) {
            throw new IndexOutOfBoundsException("n >= size()");
        }
        try {
            return this.f29362r[i10];
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new IndexOutOfBoundsException("n < 0");
        }
    }

    public C8829k() {
        this(4);
    }
}
