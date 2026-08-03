package fun.box001.internal.dexformat.writer;

import fun.box001.internal.dexformat.output.AbstractC0208j;

/* JADX INFO: renamed from: j.p */
/* JADX INFO: loaded from: classes.dex */
public final class C0165p extends AbstractC0208j {

    /* JADX INFO: renamed from: b */
    private final C0162m[] f513b;

    /* JADX INFO: renamed from: c */
    private int f514c;

    static {
        new C0165p(0);
    }

    public C0165p(int r3) {
        if (r3 == 0) goto L5;
        boolean r1 = true;
    L6:
        super(r1);
        this.f513b = new C0162m[r3];
        this.f514c = 0;
        return;
    L5:
        r1 = false;
        goto L6
    }

    public final boolean equals(Object r7) {
        if ((r7 instanceof C0165p) == true) goto L5;
        return false;
    L5:
        C0165p r72 = (C0165p) r7;
        C0162m[] r0 = r72.f513b;
        C0162m[] r2 = this.f513b;
        int r3 = r2.length;
        if (r3 == r0.length) goto L8;
    L23:
        return false;
    L8:
        if (m410p() != r72.m410p()) goto L23;
        int r73 = 0;
    L11:
        if (r73 >= r3) goto L21;
        C0162m r4 = r2[r73];
        Object r5 = r0[r73];
        if (r4 == r5) goto L19;
        if (r4 == null) goto L20;
        if (r4.equals(r5) == true) goto L19;
    L20:
        return false;
    L19:
        r73 = r73 + 1;
        goto L11
    L21:
        return true;
    }

    public final int hashCode() {
        C0162m[] r0 = this.f513b;
        int r1 = r0.length;
        int r3 = 0;
        int r4 = 0;
    L3:
        if (r3 >= r1) goto L9;
        C0162m r5 = r0[r3];
        if (r5 != null) goto L7;
        int r52 = 0;
    L8:
        r4 = (r4 * 31) + r52;
        r3 = r3 + 1;
        goto L3
    L7:
        r52 = r5.hashCode();
        goto L8
    L9:
        return r4;
    }

    /* JADX INFO: renamed from: j */
    public final C0162m m404j(C0162m r6) {
        C0162m[] r0 = this.f513b;
        int r1 = r0.length;
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L11;
        C0162m r3 = r0[r2];
        if (r3 == null) goto L10;
        if (r6.m387n(r3) == false) goto L10;
        return r3;
    L10:
        r2 = r2 + 1;
        goto L3
    L11:
        return null;
    }

    /* JADX INFO: renamed from: k */
    public final C0162m m405k(int r2) {
        return this.f513b[r2];
    L5:
        throw new IllegalArgumentException("bogus reg");
    }

    /* JADX INFO: renamed from: l */
    public final int m406l() {
        return this.f513b.length;
    }

    /* JADX INFO: renamed from: m */
    public final void m407m(C0162m r7) {
        C0162m[] r0 = this.f513b;
        m537h();
        if (r7 == null) goto L19;
        this.f514c = -1;
        int r1 = r7.m384i();     // Catch: ArrayIndexOutOfBoundsException -> L16
        r0[r1] = r7;     // Catch: ArrayIndexOutOfBoundsException -> L16
        if (r1 <= 0) goto L13;
        int r4 = r1 - 1;
        C0162m r5 = r0[r4];     // Catch: ArrayIndexOutOfBoundsException -> L16
        if (r5 == null) goto L13;
        if (r5.m382g() != 2) goto L13;
        r0[r4] = null;     // Catch: ArrayIndexOutOfBoundsException -> L16
    L13:
        if (r7.m382g() != 2) goto L22;
        r0[r1 + 1] = null;     // Catch: ArrayIndexOutOfBoundsException -> L16
        return;
    L22:
        return;
    L17:
        throw new IllegalArgumentException("spec.getReg() out of range");
    L19:
        throw new NullPointerException("spec == null");
    }

    /* JADX INFO: renamed from: n */
    public final void m408n(C0165p r4) {
        int r0 = r4.f513b.length;
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L8;
        C0162m r2 = r4.m405k(r1);
        if (r2 == null) goto L7;
        m407m(r2);
    L7:
        r1 = r1 + 1;
        goto L3
    }

    /* JADX INFO: renamed from: o */
    public final void m409o(C0162m r3) {
        this.f513b[r3.m384i()] = null;     // Catch: ArrayIndexOutOfBoundsException -> L4
        this.f514c = -1;     // Catch: ArrayIndexOutOfBoundsException -> L4
        return;
    L5:
        throw new IllegalArgumentException("bogus reg");
    }

    /* JADX INFO: renamed from: p */
    public final int m410p() {
        int r0 = this.f514c;
        if (r0 >= 0) goto L15;
        C0162m[] r02 = this.f513b;
        int r1 = r02.length;
        int r2 = 0;
        int r3 = 0;
    L5:
        if (r3 >= r1) goto L10;
        if (r02[r3] == null) goto L9;
        r2 = r2 + 1;
    L9:
        r3 = r3 + 1;
        goto L5
    L10:
        this.f514c = r2;
        return r2;
    L15:
        return r0;
    }

    public final String toString() {
        C0162m[] r0 = this.f513b;
        int r1 = r0.length;
        StringBuilder r2 = new StringBuilder(r1 * 25);
        r2.append('{');
        int r3 = 0;
        boolean r4 = false;
    L3:
        if (r3 >= r1) goto L11;
        C0162m r5 = r0[r3];
        if (r5 == null) goto L10;
        if (r4 == false) goto L8;
        r2.append(", ");
    L9:
        r2.append(r5);
        goto L10
    L8:
        r4 = true;
    L10:
        r3 = r3 + 1;
        goto L3
    L11:
        r2.append('}');
        return r2.toString();
    }
}
