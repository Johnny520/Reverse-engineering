package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: xu */
/* JADX INFO: loaded from: classes.dex */
public final class C2731xu extends C0564N4 {

    /* JADX INFO: renamed from: f */
    public C0256Fy[] f9331f;

    /* JADX INFO: renamed from: g */
    public C0256Fy[] f9332g;

    /* JADX INFO: renamed from: h */
    public int f9333h;

    /* JADX INFO: renamed from: i */
    public C0649P3 f9334i;

    @Override // p000.C0564N4
    /* JADX INFO: renamed from: d */
    public final C0256Fy mo1106d(boolean[] r10) {
        int r1 = 0;
        int r2 = -1;
    L4:
        if (r1 >= this.f9333h) goto L27;
        C0256Fy[] r3 = this.f9331f;
        C0256Fy r4 = r3[r1];
        if (r10[r4.f830b] == true) goto L26;
        C0649P3 r5 = this.f9334i;
        r5.f2089b = r4;
        int r42 = 8;
        if (r2 != (-1)) goto L18;
    L10:
        if (r42 < 0) goto L26;
        float r32 = ((C0256Fy) r5.f2089b).f836h[r42];
        if (r32 > 0.0f) goto L26;
        if (r32 < 0.0f) goto L25;
        r42 = r42 - 1;
    L25:
        r2 = r1;
        goto L26
    L18:
        C0256Fy r33 = r3[r2];
    L19:
        if (r42 < 0) goto L26;
        float r6 = r33.f836h[r42];
        float r7 = ((C0256Fy) r5.f2089b).f836h[r42];
        if (r7 != r6) goto L24;
        r42 = r42 - 1;
        goto L19
    L24:
        if (r7 < r6) goto L25;
    L26:
        r1 = r1 + 1;
        goto L4
    L27:
        if (r2 != (-1)) goto L31;
        return null;
    L31:
        return this.f9331f[r2];
    }

    @Override // p000.C0564N4
    /* JADX INFO: renamed from: e */
    public final boolean mo1107e() {
        if (this.f9333h != 0) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // p000.C0564N4
    /* JADX INFO: renamed from: i */
    public final void mo1111i(C2244mo r19, C0564N4 r20, boolean r21) {
        C0256Fy r2 = r20.f1842a;
        if (r2 != null) goto L5;
        return;
    L5:
        float[] r3 = r2.f836h;
        C0177E4 r4 = r20.f1845d;
        int r5 = r4.m364d();
        int r7 = 0;
    L6:
        if (r7 >= r5) goto L30;
        C0256Fy r8 = r4.m365e(r7);
        float r9 = r4.m366f(r7);
        C0649P3 r10 = this.f9334i;
        r10.f2089b = r8;
        if (r8.f829a == false) goto L18;
        boolean r82 = true;
        int r11 = 0;
    L10:
        if (r11 >= 9) goto L16;
        float[] r15 = ((C0256Fy) r10.f2089b).f836h;
        float r17 = (r3[r11] * r9) + r15[r11];
        r15[r11] = r17;
        if (Math.abs(r17) >= 1.0E-4f) goto L14;
        ((C0256Fy) r10.f2089b).f836h[r11] = 0.0f;
    L15:
        r11 = r11 + 1;
        goto L10
    L14:
        r82 = false;
        goto L15
    L16:
        if (r82 == false) goto L29;
        ((C2731xu) r10.f2090c).m5298k((C0256Fy) r10.f2089b);
    L29:
        this.f1843b = (r20.f1843b * r9) + this.f1843b;
        r7 = r7 + 1;
        goto L6
    L18:
        int r112 = 0;
    L19:
        if (r112 >= 9) goto L28;
        float r152 = r3[r112];
        if (r152 == 0.0f) goto L26;
        float r153 = r152 * r9;
        if (Math.abs(r153) >= 1.0E-4f) goto L25;
        r153 = 0.0f;
    L25:
        ((C0256Fy) r10.f2089b).f836h[r112] = r153;
    L27:
        r112 = r112 + 1;
        goto L19
    L26:
        ((C0256Fy) r10.f2089b).f836h[r112] = 0.0f;
        goto L27
    L28:
        m5297j(r8);
        goto L29
    L30:
        m5298k(r2);
    }

    /* JADX INFO: renamed from: j */
    public final void m5297j(C0256Fy r7) {
        int r0 = this.f9333h + 1;
        C0256Fy[] r2 = this.f9331f;
        if (r0 <= r2.length) goto L5;
        C0256Fy[] r02 = (C0256Fy[]) Arrays.copyOf(r2, r2.length * 2);
        this.f9331f = r02;
        this.f9332g = (C0256Fy[]) Arrays.copyOf(r02, r02.length * 2);
    L5:
        C0256Fy[] r03 = this.f9331f;
        int r22 = this.f9333h;
        r03[r22] = r7;
        int r3 = r22 + 1;
        this.f9333h = r3;
        if (r3 > 1) goto L8;
    L17:
        r7.f829a = true;
        r7.m533a(this);
        return;
    L8:
        if (r03[r22].f830b <= r7.f830b) goto L17;
        int r04 = 0;
        int r23 = 0;
    L10:
        int r32 = this.f9333h;
        if (r23 >= r32) goto L13;
        this.f9332g[r23] = this.f9331f[r23];
        r23 = r23 + 1;
        goto L10
    L13:
        Arrays.sort(this.f9332g, 0, r32, new C0963Wb(6));
    L15:
        if (r04 >= this.f9333h) goto L17;
        this.f9331f[r04] = this.f9332g[r04];
        r04 = r04 + 1;
        goto L15
    }

    /* JADX INFO: renamed from: k */
    public final void m5298k(C0256Fy r6) {
        int r1 = 0;
    L4:
        if (r1 >= this.f9333h) goto L13;
        if (this.f9331f[r1] == r6) goto L7;
        r1 = r1 + 1;
    L7:
        int r2 = this.f9333h;
        if (r1 >= (r2 - 1)) goto L10;
        C0256Fy[] r22 = this.f9331f;
        int r3 = r1 + 1;
        r22[r1] = r22[r3];
        r1 = r3;
        goto L7
    L10:
        this.f9333h = r2 - 1;
        r6.f829a = false;
        return;
    }

    @Override // p000.C0564N4
    public final String toString() {
        C0649P3 r0 = this.f9334i;
        String r1 = " goal -> (" + this.f1843b + ") : ";
        int r2 = 0;
    L4:
        if (r2 >= this.f9333h) goto L6;
        r0.f2089b = this.f9331f[r2];
        r1 = r1 + r0 + " ";
        r2 = r2 + 1;
        goto L4
    L6:
        return r1;
    }
}
