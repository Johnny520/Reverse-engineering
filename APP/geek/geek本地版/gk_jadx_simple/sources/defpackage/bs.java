package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bs implements Cloneable {
    public static final Object e = null;
    public boolean a;
    public long[] b;
    public Object[] c;
    public int d;

    static {
        e = new Object();
    }

    public bs() {
        this.a = false;
        int r0 = 4;
    L3:
        int r2 = 80;
        if (r0 >= 32) goto L9;
        int r1 = (1 << r0) - 12;
        if (80 <= r1) goto L7;
        r0 = r0 + 1;
        goto L3
    L7:
        r2 = r1;
    L9:
        int r22 = r2 / 8;
        this.b = new long[r22];
        this.c = new Object[r22];
    }

    public final void a() {
        int r0 = this.d;
        Object[] r1 = this.c;
        int r3 = 0;
    L3:
        if (r3 >= r0) goto L5;
        r1[r3] = null;
        r3 = r3 + 1;
        goto L3
    L5:
        this.d = 0;
        this.a = false;
    }

    public final void b() {
        int r0 = this.d;
        long[] r1 = this.b;
        Object[] r2 = this.c;
        int r4 = 0;
        int r5 = 0;
    L3:
        if (r4 >= r0) goto L10;
        Object r6 = r2[r4];
        if (r6 == e) goto L9;
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
        this.a = false;
        this.d = r5;
    }

    public final Object c(long r3, Long r5) {
        int r32 = ff.d(this.b, this.d, r3);
        if (r32 < 0) goto L8;
        Object r33 = this.c[r32];
        if (r33 == e) goto L8;
        return r33;
    L8:
        return r5;
    }

    public final Object clone() {
        bs r0 = (bs) super.clone();     // Catch: CloneNotSupportedException -> L4
        r0.b = (long[]) this.b.clone();     // Catch: CloneNotSupportedException -> L4
        r0.c = (Object[]) this.c.clone();     // Catch: CloneNotSupportedException -> L4
        return r0;
    L4:
        e = move-exception;
        throw new AssertionError(e);
    }

    public final void d(long r8, Object r10) {
        int r0 = ff.d(this.b, this.d, r8);
        if (r0 < 0) goto L6;
        this.c[r0] = r10;
        return;
    L6:
        int r02 = ~r0;
        int r1 = this.d;
        if (r02 >= r1) goto L13;
        Object[] r2 = this.c;
        if (r2[r02] != e) goto L13;
        this.b[r02] = r8;
        r2[r02] = r10;
        return;
    L13:
        if (this.a == true) goto L15;
    L17:
        int r12 = this.d;
        if (r12 < this.b.length) goto L27;
        int r13 = (r12 + 1) * 8;
        int r22 = 4;
    L21:
        if (r22 >= 32) goto L26;
        int r4 = (1 << r22) - 12;
        if (r13 <= r4) goto L24;
        r22 = r22 + 1;
        goto L21
    L24:
        r13 = r4;
    L26:
        int r14 = r13 / 8;
        long[] r23 = new long[r14];
        Object[] r15 = new Object[r14];
        long[] r42 = this.b;
        System.arraycopy(r42, 0, r23, 0, r42.length);
        Object[] r43 = this.c;
        System.arraycopy(r43, 0, r15, 0, r43.length);
        this.b = r23;
        this.c = r15;
    L27:
        int r16 = this.d - r02;
        if (r16 == 0) goto L30;
        long[] r24 = this.b;
        int r44 = r02 + 1;
        System.arraycopy(r24, r02, r24, r44, r16);
        Object[] r17 = this.c;
        System.arraycopy(r17, r02, r17, r44, this.d - r02);
    L30:
        this.b[r02] = r8;
        this.c[r02] = r10;
        this.d++;
        return;
    L15:
        if (r1 < this.b.length) goto L17;
        b();
        r02 = ~ff.d(this.b, this.d, r8);
        goto L17
    }

    public final int e() {
        if (this.a == false) goto L6;
        b();
    L6:
        return this.d;
    }

    public final Object f(int r2) {
        if (this.a == false) goto L6;
        b();
    L6:
        return this.c[r2];
    }

    public final String toString() {
        if (e() > 0) goto L6;
        return "{}";
    L6:
        StringBuilder r0 = new StringBuilder(this.d * 28);
        r0.append('{');
        int r1 = 0;
    L8:
        if (r1 >= this.d) goto L19;
        if (r1 <= 0) goto L12;
        r0.append(", ");
    L12:
        if (this.a == false) goto L14;
        b();
    L14:
        r0.append(this.b[r1]);
        r0.append('=');
        Object r2 = f(r1);
        if (r2 == this) goto L17;
        r0.append(r2);
    L18:
        r1 = r1 + 1;
        goto L8
    L17:
        r0.append("(this Map)");
        goto L18
    L19:
        r0.append('}');
        return r0.toString();
    }
}
