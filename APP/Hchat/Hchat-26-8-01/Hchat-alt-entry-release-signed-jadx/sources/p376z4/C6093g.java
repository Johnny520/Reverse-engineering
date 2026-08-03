package p376z4;

import java.util.Arrays;
import okio.C3193a;
import p136j8.C2104o;

/* JADX INFO: renamed from: z4.g */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C6093g extends AbstractC6096j {

    /* JADX INFO: renamed from: k */
    public static final C6093g f24608k;

    /* JADX INFO: renamed from: h */
    public int[] f24609h;

    /* JADX INFO: renamed from: i */
    public int f24610i;

    /* JADX INFO: renamed from: j */
    public boolean f24611j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        C6093g c6093g = new C6093g(0);
        f24608k = c6093g;
        c6093g.f24613g = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C6093g(int i9) {
        super(true);
        try {
            this.f24609h = new int[i9];
            this.f24610i = 0;
            this.f24611j = true;
        } catch (NegativeArraySizeException unused) {
            C2104o.m5294t("size < 0");
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public static C6093g m10843o(int i9) {
        C6093g c6093g = new C6093g(1);
        c6093g.m10844l(i9);
        c6093g.f24613g = false;
        return c6093g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6093g)) {
            return false;
        }
        C6093g c6093g = (C6093g) obj;
        if (this.f24611j != c6093g.f24611j || this.f24610i != c6093g.f24610i) {
            return false;
        }
        for (int i9 = 0; i9 < this.f24610i; i9++) {
            if (this.f24609h[i9] != c6093g.f24609h[i9]) {
                return false;
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int i9 = 0;
        for (int i10 = 0; i10 < this.f24610i; i10++) {
            i9 = (i9 * 31) + this.f24609h[i10];
        }
        return i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public final void m10844l(int i9) {
        m10855j();
        int i10 = this.f24610i;
        int[] iArr = this.f24609h;
        if (i10 == iArr.length) {
            int[] iArr2 = new int[((i10 * 3) / 2) + 10];
            System.arraycopy(iArr, 0, iArr2, 0, i10);
            this.f24609h = iArr2;
        }
        int[] iArr3 = this.f24609h;
        int i11 = this.f24610i;
        int i12 = i11 + 1;
        this.f24610i = i12;
        iArr3[i11] = i9;
        if (!this.f24611j || i12 <= 1) {
            return;
        }
        this.f24611j = i9 >= iArr3[i11 + (-1)];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public final int m10845m(int i9) {
        int i10;
        int i11 = this.f24610i;
        if (!this.f24611j) {
            for (int i12 = 0; i12 < i11; i12++) {
                if (this.f24609h[i12] == i9) {
                    return i12;
                }
            }
            return -i11;
        }
        int i13 = -1;
        int i14 = i11;
        while (i14 > i13 + 1) {
            int i15 = ((i14 - i13) >> 1) + i13;
            if (i9 <= this.f24609h[i15]) {
                i14 = i15;
            } else {
                i13 = i15;
            }
        }
        if (i14 == i11) {
            i10 = -i11;
        } else {
            if (i9 == this.f24609h[i14]) {
                return i14;
            }
            i10 = -i14;
        }
        return i10 - 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public final int m10846n(int i9) {
        if (i9 >= this.f24610i) {
            C3193a.m6820i("n >= size()");
            return 0;
        }
        try {
            return this.f24609h[i9];
        } catch (ArrayIndexOutOfBoundsException unused) {
            C3193a.m6820i("n < 0");
            return 0;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public final C6093g m10847p() {
        int i9 = this.f24610i;
        C6093g c6093g = new C6093g(i9);
        for (int i10 = 0; i10 < i9; i10++) {
            c6093g.m10844l(this.f24609h[i10]);
        }
        return c6093g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public final void m10848q(int i9, int i10) {
        m10855j();
        if (i9 >= this.f24610i) {
            C3193a.m6820i("n >= size()");
            return;
        }
        try {
            this.f24609h[i9] = i10;
            this.f24611j = false;
        } catch (ArrayIndexOutOfBoundsException unused) {
            if (i9 >= 0) {
                return;
            }
            C2104o.m5294t("n < 0");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public final void m10849r(int i9) {
        if (i9 < 0) {
            C2104o.m5294t("newSize < 0");
        } else if (i9 > this.f24610i) {
            C2104o.m5294t("newSize > size");
        } else {
            m10855j();
            this.f24610i = i9;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public final void m10850s() {
        m10855j();
        if (this.f24611j) {
            return;
        }
        Arrays.sort(this.f24609h, 0, this.f24610i);
        this.f24611j = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder((this.f24610i * 5) + 10);
        sb2.append('{');
        for (int i9 = 0; i9 < this.f24610i; i9++) {
            if (i9 != 0) {
                sb2.append(", ");
            }
            sb2.append(this.f24609h[i9]);
        }
        sb2.append('}');
        return sb2.toString();
    }
}
