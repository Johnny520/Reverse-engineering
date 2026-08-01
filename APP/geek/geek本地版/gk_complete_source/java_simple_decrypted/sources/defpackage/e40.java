package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class e40 implements Cloneable {
    public static final Object d = null;
    public int[] a;
    public Object[] b;
    public int c;

    static {
        d = new Object();
    }

    public e40() {
        int r1 = 4;
    L3:
        int r3 = 40;
        if (r1 >= 32) goto L9;
        int r2 = (1 << r1) - 12;
        if (40 <= r2) goto L7;
        r1 = r1 + 1;
        goto L3
    L7:
        r3 = r2;
    L9:
        int r32 = r3 / 4;
        this.a = new int[r32];
        this.b = new Object[r32];
    }

    public final void a(int r8, Object r9) {
        int r0 = this.c;
        if (r0 == 0) goto L9;
        if (r8 > this.a[r0 - 1]) goto L9;
        c(r8, r9);
        return;
    L9:
        if (r0 < this.a.length) goto L18;
        int r1 = (r0 + 1) * 4;
        int r4 = 4;
    L12:
        if (r4 >= 32) goto L17;
        int r5 = (1 << r4) - 12;
        if (r1 <= r5) goto L15;
        r4 = r4 + 1;
        goto L12
    L15:
        r1 = r5;
    L17:
        int r12 = r1 / 4;
        int[] r3 = new int[r12];
        Object[] r13 = new Object[r12];
        int[] r42 = this.a;
        System.arraycopy(r42, 0, r3, 0, r42.length);
        Object[] r43 = this.b;
        System.arraycopy(r43, 0, r13, 0, r43.length);
        this.a = r3;
        this.b = r13;
    L18:
        this.a[r0] = r8;
        this.b[r0] = r9;
        this.c = r0 + 1;
    }

    public final Object b(int r3, Integer r4) {
        int[] r0 = this.a;
        int r32 = ff.c(this.c, r3, r0);
        if (r32 < 0) goto L8;
        Object r33 = this.b[r32];
        if (r33 == d) goto L8;
        return r33;
    L8:
        return r4;
    }

    public final void c(int r8, Object r9) {
        int r0 = ff.c(this.c, r8, this.a);
        if (r0 < 0) goto L6;
        this.b[r0] = r9;
        return;
    L6:
        int r02 = ~r0;
        int r1 = this.c;
        if (r02 >= r1) goto L13;
        Object[] r2 = this.b;
        if (r2[r02] != d) goto L13;
        this.a[r02] = r8;
        r2[r02] = r9;
        return;
    L13:
        if (r1 < this.a.length) goto L22;
        int r12 = (r1 + 1) * 4;
        int r4 = 4;
    L16:
        if (r4 >= 32) goto L21;
        int r5 = (1 << r4) - 12;
        if (r12 <= r5) goto L19;
        r4 = r4 + 1;
        goto L16
    L19:
        r12 = r5;
    L21:
        int r13 = r12 / 4;
        int[] r22 = new int[r13];
        Object[] r14 = new Object[r13];
        int[] r42 = this.a;
        System.arraycopy(r42, 0, r22, 0, r42.length);
        Object[] r43 = this.b;
        System.arraycopy(r43, 0, r14, 0, r43.length);
        this.a = r22;
        this.b = r14;
    L22:
        int r15 = this.c - r02;
        if (r15 == 0) goto L25;
        int[] r23 = this.a;
        int r44 = r02 + 1;
        System.arraycopy(r23, r02, r23, r44, r15);
        Object[] r16 = this.b;
        System.arraycopy(r16, r02, r16, r44, this.c - r02);
    L25:
        this.a[r02] = r8;
        this.b[r02] = r9;
        this.c++;
    }

    public final Object clone() {
        e40 r0 = (e40) super.clone();     // Catch: CloneNotSupportedException -> L4
        r0.a = (int[]) this.a.clone();     // Catch: CloneNotSupportedException -> L4
        r0.b = (Object[]) this.b.clone();     // Catch: CloneNotSupportedException -> L4
        return r0;
    L4:
        e = move-exception;
        throw new AssertionError(e);
    }

    public final String toString() {
        int r0 = this.c;
        if (r0 > 0) goto L6;
        return "{}";
    L6:
        StringBuilder r1 = new StringBuilder(r0 * 28);
        r1.append('{');
        int r02 = 0;
    L8:
        if (r02 >= this.c) goto L16;
        if (r02 <= 0) goto L11;
        r1.append(", ");
    L11:
        r1.append(this.a[r02]);
        r1.append('=');
        Object r2 = this.b[r02];
        if (r2 == this) goto L14;
        r1.append(r2);
    L15:
        r02 = r02 + 1;
        goto L8
    L14:
        r1.append("(this Map)");
        goto L15
    L16:
        r1.append('}');
        return r1.toString();
    }
}
