package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: vp */
/* JADX INFO: loaded from: classes.dex */
public final class C2640vp implements Cloneable {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ boolean f9150a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ long[] f9151b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object[] f9152c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ int f9153d;

    public C2640vp() {
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
        this.f9151b = new long[r22];
        this.f9152c = new Object[r22];
    }

    /* JADX INFO: renamed from: a */
    public final void m5166a() {
        int r0 = this.f9153d;
        Object[] r1 = this.f9152c;
        int r3 = 0;
    L3:
        if (r3 >= r0) goto L5;
        r1[r3] = null;
        r3 = r3 + 1;
        goto L3
    L5:
        this.f9153d = 0;
        this.f9150a = false;
    }

    /* JADX INFO: renamed from: b */
    public final Object m5167b(long r3) {
        int r32 = AbstractC0714Qj.m1483e(this.f9151b, this.f9153d, r3);
        if (r32 < 0) goto L8;
        Object r33 = this.f9152c[r32];
        if (r33 == AbstractC1406fG.f4985d) goto L10;
        return r33;
    L10:
        return null;
    L8:
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final int m5168c(long r10) {
        if (this.f9150a == false) goto L14;
        int r0 = this.f9153d;
        long[] r1 = this.f9151b;
        Object[] r2 = this.f9152c;
        int r4 = 0;
        int r5 = 0;
    L5:
        if (r4 >= r0) goto L12;
        Object r6 = r2[r4];
        if (r6 == AbstractC1406fG.f4985d) goto L11;
        if (r4 == r5) goto L10;
        r1[r5] = r1[r4];
        r2[r5] = r6;
        r2[r4] = null;
    L10:
        r5 = r5 + 1;
    L11:
        r4 = r4 + 1;
        goto L5
    L12:
        this.f9150a = false;
        this.f9153d = r5;
    L14:
        return AbstractC0714Qj.m1483e(this.f9151b, this.f9153d, r10);
    }

    public final Object clone() {
        C2640vp r0 = (C2640vp) super.clone();
        r0.f9151b = (long[]) this.f9151b.clone();
        r0.f9152c = (Object[]) this.f9152c.clone();
        return r0;
    }

    /* JADX INFO: renamed from: d */
    public final long m5169d(int r10) {
        if (r10 < 0) goto L19;
        int r0 = this.f9153d;
        if (r10 >= r0) goto L19;
        if (this.f9150a == false) goto L17;
        long[] r1 = this.f9151b;
        Object[] r2 = this.f9152c;
        int r4 = 0;
        int r5 = 0;
    L8:
        if (r4 >= r0) goto L15;
        Object r6 = r2[r4];
        if (r6 == AbstractC1406fG.f4985d) goto L14;
        if (r4 == r5) goto L13;
        r1[r5] = r1[r4];
        r2[r5] = r6;
        r2[r4] = null;
    L13:
        r5 = r5 + 1;
    L14:
        r4 = r4 + 1;
        goto L8
    L15:
        this.f9150a = false;
        this.f9153d = r5;
    L17:
        return this.f9151b[r10];
    L19:
        throw new IllegalArgumentException(AbstractC2374ph.m4812i(r10, "Expected index to be within 0..size()-1, but was ").toString());
    }

    /* JADX INFO: renamed from: e */
    public final void m5170e(long r11, Object r13) {
        Object r0 = AbstractC1406fG.f4985d;
        int r1 = AbstractC0714Qj.m1483e(this.f9151b, this.f9153d, r11);
        if (r1 < 0) goto L6;
        this.f9152c[r1] = r13;
        return;
    L6:
        int r12 = ~r1;
        int r2 = this.f9153d;
        if (r12 >= r2) goto L13;
        Object[] r3 = this.f9152c;
        if (r3[r12] != r0) goto L13;
        this.f9151b[r12] = r11;
        r3[r12] = r13;
        return;
    L13:
        if (this.f9150a == false) goto L25;
        long[] r32 = this.f9151b;
        if (r2 < r32.length) goto L25;
        Object[] r14 = this.f9152c;
        int r5 = 0;
        int r6 = 0;
    L17:
        if (r5 >= r2) goto L24;
        Object r7 = r14[r5];
        if (r7 == r0) goto L23;
        if (r5 == r6) goto L22;
        r32[r6] = r32[r5];
        r14[r6] = r7;
        r14[r5] = null;
    L22:
        r6 = r6 + 1;
    L23:
        r5 = r5 + 1;
        goto L17
    L24:
        this.f9150a = false;
        this.f9153d = r6;
        r12 = ~AbstractC0714Qj.m1483e(this.f9151b, r6, r11);
    L25:
        int r02 = this.f9153d;
        if (r02 < this.f9151b.length) goto L35;
        int r03 = (r02 + 1) * 8;
        int r22 = 4;
    L29:
        if (r22 >= 32) goto L34;
        int r4 = (1 << r22) - 12;
        if (r03 <= r4) goto L32;
        r22 = r22 + 1;
        goto L29
    L32:
        r03 = r4;
    L34:
        int r04 = r03 / 8;
        this.f9151b = Arrays.copyOf(this.f9151b, r04);
        this.f9152c = Arrays.copyOf(this.f9152c, r04);
    L35:
        int r05 = this.f9153d - r12;
        if (r05 == 0) goto L38;
        long[] r23 = this.f9151b;
        int r42 = r12 + 1;
        System.arraycopy(r23, r12, r23, r42, r05);
        Object[] r06 = this.f9152c;
        AbstractC0650P4.m1310E(r06, r06, r42, r12, this.f9153d);
    L38:
        this.f9151b[r12] = r11;
        this.f9152c[r12] = r13;
        this.f9153d++;
    }

    /* JADX INFO: renamed from: f */
    public final void m5171f(long r3) {
        int r32 = AbstractC0714Qj.m1483e(this.f9151b, this.f9153d, r3);
        if (r32 < 0) goto L8;
        Object[] r4 = this.f9152c;
        Object r0 = r4[r32];
        Object r1 = AbstractC1406fG.f4985d;
        if (r0 == r1) goto L9;
        r4[r32] = r1;
        this.f9150a = true;
        return;
    L9:
        return;
    }

    /* JADX INFO: renamed from: g */
    public final int m5172g() {
        if (this.f9150a == false) goto L14;
        int r0 = this.f9153d;
        long[] r1 = this.f9151b;
        Object[] r2 = this.f9152c;
        int r4 = 0;
        int r5 = 0;
    L5:
        if (r4 >= r0) goto L12;
        Object r6 = r2[r4];
        if (r6 == AbstractC1406fG.f4985d) goto L11;
        if (r4 == r5) goto L10;
        r1[r5] = r1[r4];
        r2[r5] = r6;
        r2[r4] = null;
    L10:
        r5 = r5 + 1;
    L11:
        r4 = r4 + 1;
        goto L5
    L12:
        this.f9150a = false;
        this.f9153d = r5;
    L14:
        return this.f9153d;
    }

    /* JADX INFO: renamed from: h */
    public final Object m5173h(int r10) {
        if (r10 < 0) goto L19;
        int r0 = this.f9153d;
        if (r10 >= r0) goto L19;
        if (this.f9150a == false) goto L17;
        long[] r1 = this.f9151b;
        Object[] r2 = this.f9152c;
        int r4 = 0;
        int r5 = 0;
    L8:
        if (r4 >= r0) goto L15;
        Object r6 = r2[r4];
        if (r6 == AbstractC1406fG.f4985d) goto L14;
        if (r4 == r5) goto L13;
        r1[r5] = r1[r4];
        r2[r5] = r6;
        r2[r4] = null;
    L13:
        r5 = r5 + 1;
    L14:
        r4 = r4 + 1;
        goto L8
    L15:
        this.f9150a = false;
        this.f9153d = r5;
    L17:
        return this.f9152c[r10];
    L19:
        throw new IllegalArgumentException(AbstractC2374ph.m4812i(r10, "Expected index to be within 0..size()-1, but was ").toString());
    }

    public final String toString() {
        if (m5172g() > 0) goto L6;
        return "{}";
    L6:
        StringBuilder r1 = new StringBuilder(this.f9153d * 28);
        r1.append('{');
        int r0 = this.f9153d;
        int r2 = 0;
    L7:
        if (r2 >= r0) goto L15;
        if (r2 <= 0) goto L10;
        r1.append(", ");
    L10:
        r1.append(m5169d(r2));
        r1.append('=');
        Object r3 = m5173h(r2);
        if (r3 == r1) goto L13;
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
