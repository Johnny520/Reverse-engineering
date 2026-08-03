package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: Ky */
/* JADX INFO: loaded from: classes.dex */
public final class C0471Ky implements Cloneable {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ int[] f1529a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object[] f1530b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ int f1531c;

    public C0471Ky() {
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
        this.f1529a = new int[r32];
        this.f1530b = new Object[r32];
    }

    /* JADX INFO: renamed from: a */
    public final void m918a(int r7, Object r8) {
        int r0 = this.f1531c;
        if (r0 == 0) goto L9;
        if (r7 > this.f1529a[r0 - 1]) goto L9;
        m920c(r7, r8);
        return;
    L9:
        if (r0 < this.f1529a.length) goto L18;
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
        this.f1529a = Arrays.copyOf(this.f1529a, r12);
        this.f1530b = Arrays.copyOf(this.f1530b, r12);
    L18:
        this.f1529a[r0] = r7;
        this.f1530b[r0] = r8;
        this.f1531c = r0 + 1;
    }

    /* JADX INFO: renamed from: b */
    public final Object m919b(int r3) {
        int[] r0 = this.f1529a;
        int r32 = AbstractC0714Qj.m1482d(this.f1531c, r3, r0);
        if (r32 < 0) goto L8;
        Object r33 = this.f1530b[r32];
        if (r33 == AbstractC0714Qj.f2298e) goto L10;
        return r33;
    L10:
        return null;
    L8:
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final void m920c(int r7, Object r8) {
        int r0 = AbstractC0714Qj.m1482d(this.f1531c, r7, this.f1529a);
        if (r0 < 0) goto L6;
        this.f1530b[r0] = r8;
        return;
    L6:
        int r02 = ~r0;
        int r1 = this.f1531c;
        if (r02 >= r1) goto L13;
        Object[] r2 = this.f1530b;
        if (r2[r02] != AbstractC0714Qj.f2298e) goto L13;
        this.f1529a[r02] = r7;
        r2[r02] = r8;
        return;
    L13:
        if (r1 < this.f1529a.length) goto L22;
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
        this.f1529a = Arrays.copyOf(this.f1529a, r13);
        this.f1530b = Arrays.copyOf(this.f1530b, r13);
    L22:
        int r14 = this.f1531c;
        if ((r14 - r02) == 0) goto L25;
        int[] r22 = this.f1529a;
        int r42 = r02 + 1;
        AbstractC0650P4.m1309D(r42, r02, r22, r22, r14);
        Object[] r15 = this.f1530b;
        AbstractC0650P4.m1310E(r15, r15, r42, r02, this.f1531c);
    L25:
        this.f1529a[r02] = r7;
        this.f1530b[r02] = r8;
        this.f1531c++;
    }

    public final Object clone() {
        C0471Ky r0 = (C0471Ky) super.clone();
        r0.f1529a = (int[]) this.f1529a.clone();
        r0.f1530b = (Object[]) this.f1530b.clone();
        return r0;
    }

    public final String toString() {
        int r0 = this.f1531c;
        if (r0 > 0) goto L6;
        return "{}";
    L6:
        StringBuilder r1 = new StringBuilder(r0 * 28);
        r1.append('{');
        int r02 = this.f1531c;
        int r2 = 0;
    L7:
        if (r2 >= r02) goto L15;
        if (r2 <= 0) goto L10;
        r1.append(", ");
    L10:
        r1.append(this.f1529a[r2]);
        r1.append('=');
        Object r3 = this.f1530b[r2];
        if (r3 == this) goto L13;
        r1.append(r3);
    L14:
        r2 = r2 + 1;
        goto L7
    L13:
        r1.append("(this Map)");
        goto L14
    L15:
        r1.append('}');
        return r1.toString();
    }
}
