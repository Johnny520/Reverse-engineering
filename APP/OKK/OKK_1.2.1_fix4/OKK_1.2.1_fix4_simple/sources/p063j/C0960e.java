package p063j;

/* JADX INFO: renamed from: j.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0960e implements Cloneable {

    /* JADX INFO: renamed from: e */
    public static final Object f3404e = null;

    /* JADX INFO: renamed from: a */
    public boolean f3405a;

    /* JADX INFO: renamed from: b */
    public long[] f3406b;

    /* JADX INFO: renamed from: c */
    public Object[] f3407c;

    /* JADX INFO: renamed from: d */
    public int f3408d;

    static {
        f3404e = new Object();
    }

    public C0960e() {
        this.f3405a = false;
        int r02 = 4;
    L3:
        int r2 = 80;
        if (r02 >= 32) goto L9;
        int r1 = (1 << r02) - 12;
        if (80 <= r1) goto L7;
        r02 = r02 + 1;
        goto L3
    L7:
        r2 = r1;
    L9:
        int r22 = r2 / 8;
        this.f3406b = new long[r22];
        this.f3407c = new Object[r22];
    }

    /* JADX INFO: renamed from: a */
    public final void m2306a() {
        int r02 = this.f3408d;
        Object[] r1 = this.f3407c;
        int r3 = 0;
    L3:
        if (r3 >= r02) goto L5;
        r1[r3] = null;
        r3 = r3 + 1;
        goto L3
    L5:
        this.f3408d = 0;
        this.f3405a = false;
    }

    /* JADX INFO: renamed from: b */
    public final C0960e m2307b() {
        C0960e r02 = (C0960e) super.clone();     // Catch: CloneNotSupportedException -> L4
        r02.f3406b = (long[]) this.f3406b.clone();     // Catch: CloneNotSupportedException -> L4
        r02.f3407c = (Object[]) this.f3407c.clone();     // Catch: CloneNotSupportedException -> L4
        return r02;
    L4:
        e = move-exception;
        throw new AssertionError(e);
    }

    /* JADX INFO: renamed from: c */
    public final void m2308c() {
        int r02 = this.f3408d;
        long[] r1 = this.f3406b;
        Object[] r2 = this.f3407c;
        int r4 = 0;
        int r5 = 0;
    L3:
        if (r4 >= r02) goto L10;
        Object r6 = r2[r4];
        if (r6 == f3404e) goto L9;
        if (r4 == r5) goto L8;
        r1[r5] = r1[r4];
        r2[r5] = r6;
        r2[r4] = null;
    L8:
        r5 = r5 + 1;
    L9:
        r4 = r4 + 1;
        goto L3
    L10:
        this.f3405a = false;
        this.f3408d = r5;
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        return m2307b();
    }

    /* JADX INFO: renamed from: d */
    public final Object m2309d(long r3, Long r5) {
        int r32 = AbstractC0959d.m2305b(this.f3406b, this.f3408d, r3);
        if (r32 < 0) goto L8;
        Object r33 = this.f3407c[r32];
        if (r33 == f3404e) goto L8;
        return r33;
    L8:
        return r5;
    }

    /* JADX INFO: renamed from: e */
    public final void m2310e(long r8, Object r10) {
        int r02 = AbstractC0959d.m2305b(this.f3406b, this.f3408d, r8);
        if (r02 < 0) goto L5;
        this.f3407c[r02] = r10;
        return;
    L5:
        int r03 = ~r02;
        int r1 = this.f3408d;
        if (r03 >= r1) goto L12;
        Object[] r2 = this.f3407c;
        if (r2[r03] != f3404e) goto L12;
        this.f3406b[r03] = r8;
        r2[r03] = r10;
        return;
    L12:
        if (this.f3405a == true) goto L14;
    L16:
        int r12 = this.f3408d;
        if (r12 < this.f3406b.length) goto L26;
        int r13 = (r12 + 1) * 8;
        int r22 = 4;
    L20:
        if (r22 >= 32) goto L25;
        int r4 = (1 << r22) - 12;
        if (r13 <= r4) goto L23;
        r22 = r22 + 1;
        goto L20
    L23:
        r13 = r4;
    L25:
        int r14 = r13 / 8;
        long[] r23 = new long[r14];
        Object[] r15 = new Object[r14];
        long[] r42 = this.f3406b;
        System.arraycopy(r42, 0, r23, 0, r42.length);
        Object[] r43 = this.f3407c;
        System.arraycopy(r43, 0, r15, 0, r43.length);
        this.f3406b = r23;
        this.f3407c = r15;
    L26:
        int r16 = this.f3408d - r03;
        if (r16 == 0) goto L29;
        long[] r24 = this.f3406b;
        int r44 = r03 + 1;
        System.arraycopy(r24, r03, r24, r44, r16);
        Object[] r17 = this.f3407c;
        System.arraycopy(r17, r03, r17, r44, this.f3408d - r03);
    L29:
        this.f3406b[r03] = r8;
        this.f3407c[r03] = r10;
        this.f3408d++;
        return;
    L14:
        if (r1 < this.f3406b.length) goto L16;
        m2308c();
        r03 = ~AbstractC0959d.m2305b(this.f3406b, this.f3408d, r8);
        goto L16
    }

    /* JADX INFO: renamed from: f */
    public final int m2311f() {
        if (this.f3405a == false) goto L6;
        m2308c();
    L6:
        return this.f3408d;
    }

    /* JADX INFO: renamed from: g */
    public final Object m2312g(int r2) {
        if (this.f3405a == false) goto L6;
        m2308c();
    L6:
        return this.f3407c[r2];
    }

    public final String toString() {
        if (m2311f() > 0) goto L6;
        return "{}";
    L6:
        StringBuilder r02 = new StringBuilder(this.f3408d * 28);
        r02.append('{');
        int r1 = 0;
    L8:
        if (r1 >= this.f3408d) goto L19;
        if (r1 <= 0) goto L12;
        r02.append(", ");
    L12:
        if (this.f3405a == false) goto L14;
        m2308c();
    L14:
        r02.append(this.f3406b[r1]);
        r02.append('=');
        Object r2 = m2312g(r1);
        if (r2 == this) goto L17;
        r02.append(r2);
    L18:
        r1 = r1 + 1;
        goto L8
    L17:
        r02.append("(this Map)");
        goto L18
    L19:
        r02.append('}');
        return r02.toString();
    }
}
