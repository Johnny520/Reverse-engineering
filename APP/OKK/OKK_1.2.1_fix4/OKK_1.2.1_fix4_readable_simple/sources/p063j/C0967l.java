package p063j;

/* JADX INFO: renamed from: j.l */
/* JADX INFO: loaded from: classes.dex */
public final class C0967l implements Cloneable {

    /* JADX INFO: renamed from: d */
    public static final Object f3433d = null;

    /* JADX INFO: renamed from: a */
    public int[] f3434a;

    /* JADX INFO: renamed from: b */
    public Object[] f3435b;

    /* JADX INFO: renamed from: c */
    public int f3436c;

    static {
        f3433d = new Object();
    }

    public C0967l() {
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
        this.f3434a = new int[r32];
        this.f3435b = new Object[r32];
    }

    /* JADX INFO: renamed from: a */
    public final void m2325a(int r8, Object r9) {
        int r02 = this.f3436c;
        if (r02 == 0) goto L9;
        if (r8 > this.f3434a[r02 - 1]) goto L9;
        m2328d(r8, r9);
        return;
    L9:
        if (r02 < this.f3434a.length) goto L18;
        int r1 = (r02 + 1) * 4;
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
        int[] r42 = this.f3434a;
        System.arraycopy(r42, 0, r3, 0, r42.length);
        Object[] r43 = this.f3435b;
        System.arraycopy(r43, 0, r13, 0, r43.length);
        this.f3434a = r3;
        this.f3435b = r13;
    L18:
        this.f3434a[r02] = r8;
        this.f3435b[r02] = r9;
        this.f3436c = r02 + 1;
    }

    /* JADX INFO: renamed from: b */
    public final C0967l m2326b() {
        C0967l r02 = (C0967l) super.clone();     // Catch: CloneNotSupportedException -> L4
        r02.f3434a = (int[]) this.f3434a.clone();     // Catch: CloneNotSupportedException -> L4
        r02.f3435b = (Object[]) this.f3435b.clone();     // Catch: CloneNotSupportedException -> L4
        return r02;
    L4:
        e = move-exception;
        throw new AssertionError(e);
    }

    /* JADX INFO: renamed from: c */
    public final Object m2327c(int r3, Integer r4) {
        int[] r02 = this.f3434a;
        int r32 = AbstractC0959d.m2304a(this.f3436c, r3, r02);
        if (r32 < 0) goto L8;
        Object r33 = this.f3435b[r32];
        if (r33 == f3433d) goto L8;
        return r33;
    L8:
        return r4;
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        return m2326b();
    }

    /* JADX INFO: renamed from: d */
    public final void m2328d(int r8, Object r9) {
        int r02 = AbstractC0959d.m2304a(this.f3436c, r8, this.f3434a);
        if (r02 < 0) goto L5;
        this.f3435b[r02] = r9;
        return;
    L5:
        int r03 = ~r02;
        int r1 = this.f3436c;
        if (r03 >= r1) goto L12;
        Object[] r2 = this.f3435b;
        if (r2[r03] != f3433d) goto L12;
        this.f3434a[r03] = r8;
        r2[r03] = r9;
        return;
    L12:
        if (r1 < this.f3434a.length) goto L21;
        int r12 = (r1 + 1) * 4;
        int r4 = 4;
    L15:
        if (r4 >= 32) goto L20;
        int r5 = (1 << r4) - 12;
        if (r12 <= r5) goto L18;
        r4 = r4 + 1;
        goto L15
    L18:
        r12 = r5;
    L20:
        int r13 = r12 / 4;
        int[] r22 = new int[r13];
        Object[] r14 = new Object[r13];
        int[] r42 = this.f3434a;
        System.arraycopy(r42, 0, r22, 0, r42.length);
        Object[] r43 = this.f3435b;
        System.arraycopy(r43, 0, r14, 0, r43.length);
        this.f3434a = r22;
        this.f3435b = r14;
    L21:
        int r15 = this.f3436c - r03;
        if (r15 == 0) goto L24;
        int[] r23 = this.f3434a;
        int r44 = r03 + 1;
        System.arraycopy(r23, r03, r23, r44, r15);
        Object[] r16 = this.f3435b;
        System.arraycopy(r16, r03, r16, r44, this.f3436c - r03);
    L24:
        this.f3434a[r03] = r8;
        this.f3435b[r03] = r9;
        this.f3436c++;
    }

    public final String toString() {
        int r02 = this.f3436c;
        if (r02 > 0) goto L6;
        return "{}";
    L6:
        StringBuilder r1 = new StringBuilder(r02 * 28);
        r1.append('{');
        int r03 = 0;
    L8:
        if (r03 >= this.f3436c) goto L16;
        if (r03 <= 0) goto L11;
        r1.append(", ");
    L11:
        r1.append(this.f3434a[r03]);
        r1.append('=');
        Object r2 = this.f3435b[r03];
        if (r2 == this) goto L14;
        r1.append(r2);
    L15:
        r03 = r03 + 1;
        goto L8
    L14:
        r1.append("(this Map)");
        goto L15
    L16:
        r1.append('}');
        return r1.toString();
    }
}
