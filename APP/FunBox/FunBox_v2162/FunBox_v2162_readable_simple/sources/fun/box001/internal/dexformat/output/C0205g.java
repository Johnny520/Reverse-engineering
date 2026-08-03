package fun.box001.internal.dexformat.output;

import java.util.Arrays;

/* JADX INFO: renamed from: n.g */
/* JADX INFO: loaded from: classes.dex */
public final class C0205g extends AbstractC0208j {

    /* JADX INFO: renamed from: e */
    public static final C0205g f806e = null;

    /* JADX INFO: renamed from: b */
    private int[] f807b;

    /* JADX INFO: renamed from: c */
    private int f808c;

    /* JADX INFO: renamed from: d */
    private boolean f809d;

    static {
        C0205g r0 = new C0205g(0);
        f806e = r0;
        r0.m536g();
    }

    public C0205g(int r2) {
        super(true);
        this.f807b = new int[r2];     // Catch: NegativeArraySizeException -> L6
        this.f808c = 0;
        this.f809d = true;
        return;
    L7:
        throw new IllegalArgumentException("size < 0");
    }

    public final boolean equals(Object r6) {
        if (r6 != this) goto L6;
        return true;
    L6:
        if ((r6 instanceof C0205g) == true) goto L8;
        return false;
    L8:
        C0205g r62 = (C0205g) r6;
        if (this.f809d == r62.f809d) goto L12;
        return false;
    L12:
        if (this.f808c == r62.f808c) goto L14;
        return false;
    L14:
        int r1 = 0;
    L16:
        if (r1 >= this.f808c) goto L21;
        if (this.f807b[r1] != r62.f807b[r1]) goto L19;
        r1 = r1 + 1;
        goto L16
    L19:
        return false;
    L21:
        return true;
    }

    public final int hashCode() {
        int r0 = 0;
        int r1 = 0;
    L4:
        if (r0 >= this.f808c) goto L6;
        r1 = (r1 * 31) + this.f807b[r0];
        r0 = r0 + 1;
        goto L4
    L6:
        return r1;
    }

    /* JADX INFO: renamed from: j */
    public final void m524j(int r5) {
        m537h();
        int r0 = this.f808c;
        int[] r1 = this.f807b;
        boolean r3 = false;
        if (r0 != r1.length) goto L5;
        int[] r2 = new int[((r0 * 3) / 2) + 10];
        System.arraycopy(r1, 0, r2, 0, r0);
        this.f807b = r2;
    L5:
        int[] r02 = this.f807b;
        int r12 = this.f808c;
        int r22 = r12 + 1;
        this.f808c = r22;
        r02[r12] = r5;
        if (this.f809d == true) goto L8;
        return;
    L8:
        if (r22 > 1) goto L10;
        return;
    L10:
        if (r5 < r02[r22 - 2]) goto L12;
        r3 = true;
    L12:
        this.f809d = r3;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m525k(int r9) {
        int r0 = this.f808c;
        int r3 = -1;
        if (this.f809d == true) goto L11;
        int r1 = 0;
    L5:
        if (r1 >= r0) goto L10;
        if (this.f807b[r1] == r9) goto L25;
        r1 = r1 + 1;
    L25:
        if (r1 < 0) goto L27;
        r3 = r1;
    L27:
        if (r3 >= 0) goto L29;
        return false;
    L29:
        return true;
    L10:
        r1 = -r0;
        goto L25
    L11:
        r1 = r0;
        int r5 = -1;
    L13:
        if (r1 <= (r5 + 1)) goto L18;
        int r6 = ((r1 - r5) >> 1) + r5;
        if (r9 <= this.f807b[r6]) goto L16;
        r5 = r6;
        goto L13
    L16:
        r1 = r6;
        goto L13
    L18:
        if (r1 != r0) goto L20;
        int r92 = -r0;
    L24:
        r1 = r92 - 1;
        goto L25
    L20:
        if (r9 == this.f807b[r1]) goto L25;
        r92 = -r1;
        goto L24
    }

    /* JADX INFO: renamed from: l */
    public final int m526l(int r2) {
        if (r2 >= this.f808c) goto L9;
        return this.f807b[r2];
    L7:
        throw new IndexOutOfBoundsException("n < 0");
    L9:
        throw new IndexOutOfBoundsException("n >= size()");
    }

    /* JADX INFO: renamed from: m */
    public final void m527m(int r2, int r3) {
        m537h();
        if (r2 >= this.f808c) goto L11;
        this.f807b[r2] = r3;     // Catch: ArrayIndexOutOfBoundsException -> L6
        this.f809d = false;     // Catch: ArrayIndexOutOfBoundsException -> L6
        return;
    L6:
        if (r2 < 0) goto L9;
        return;
    L9:
        throw new IllegalArgumentException("n < 0");
    L11:
        throw new IndexOutOfBoundsException("n >= size()");
    }

    /* JADX INFO: renamed from: n */
    public final void m528n(int r2) {
        if (r2 < 0) goto L10;
        if (r2 > this.f808c) goto L8;
        m537h();
        this.f808c = r2;
        return;
    L8:
        throw new IllegalArgumentException("newSize > size");
    L10:
        throw new IllegalArgumentException("newSize < 0");
    }

    /* JADX INFO: renamed from: o */
    public final int m529o() {
        return this.f808c;
    }

    /* JADX INFO: renamed from: p */
    public final void m530p() {
        m537h();
        if (this.f809d == true) goto L6;
        Arrays.sort(this.f807b, 0, this.f808c);
        this.f809d = true;
        return;
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder((this.f808c * 5) + 10);
        r0.append('{');
        int r1 = 0;
    L4:
        if (r1 >= this.f808c) goto L8;
        if (r1 == 0) goto L7;
        r0.append(", ");
    L7:
        r0.append(this.f807b[r1]);
        r1 = r1 + 1;
        goto L4
    L8:
        r0.append('}');
        return r0.toString();
    }
}
