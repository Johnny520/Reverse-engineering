package p069m;

import java.util.Arrays;
import p037U.C0375k;

/* JADX INFO: renamed from: m.g */
/* JADX INFO: loaded from: classes.dex */
public final class C0987g extends C0983c {

    /* JADX INFO: renamed from: f */
    public C0989i[] f3502f;

    /* JADX INFO: renamed from: g */
    public C0989i[] f3503g;

    /* JADX INFO: renamed from: h */
    public int f3504h;

    /* JADX INFO: renamed from: i */
    public C0986f f3505i;

    @Override // p069m.C0983c
    /* JADX INFO: renamed from: d */
    public final C0989i mo2347d(boolean[] r10) {
        int r1 = 0;
        int r2 = -1;
    L4:
        if (r1 >= this.f3504h) goto L27;
        C0989i[] r3 = this.f3502f;
        C0989i r4 = r3[r1];
        if (r10[r4.f3507b] == true) goto L26;
        C0986f r5 = this.f3505i;
        r5.f3500a = r4;
        int r42 = 8;
        if (r2 != (-1)) goto L18;
    L10:
        if (r42 < 0) goto L26;
        float r32 = r5.f3500a.f3513h[r42];
        if (r32 > 0.0f) goto L26;
        if (r32 < 0.0f) goto L25;
        r42 = r42 - 1;
    L25:
        r2 = r1;
        goto L26
    L18:
        C0989i r33 = r3[r2];
    L19:
        if (r42 < 0) goto L26;
        float r6 = r33.f3513h[r42];
        float r7 = r5.f3500a.f3513h[r42];
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
        return this.f3502f[r2];
    }

    @Override // p069m.C0983c
    /* JADX INFO: renamed from: h */
    public final void mo2351h(C0983c r19, boolean r20) {
        C0989i r2 = r19.f3479a;
        if (r2 != null) goto L5;
        return;
    L5:
        InterfaceC0982b r3 = r19.f3482d;
        int r4 = r3.mo2343k();
        int r6 = 0;
    L6:
        if (r6 >= r4) goto L30;
        C0989i r7 = r3.mo2336d(r6);
        float r8 = r3.mo2333a(r6);
        C0986f r9 = this.f3505i;
        r9.f3500a = r7;
        boolean r10 = r7.f3506a;
        float[] r11 = r2.f3513h;
        if (r10 == false) goto L18;
        boolean r72 = true;
        int r102 = 0;
    L10:
        if (r102 >= 9) goto L16;
        float[] r15 = r9.f3500a.f3513h;
        float r17 = (r11[r102] * r8) + r15[r102];
        r15[r102] = r17;
        if (Math.abs(r17) >= 1.0E-4f) goto L14;
        r9.f3500a.f3513h[r102] = 0.0f;
    L15:
        r102 = r102 + 1;
        goto L10
    L14:
        r72 = false;
        goto L15
    L16:
        if (r72 == false) goto L29;
        r9.f3501b.m2371j(r9.f3500a);
    L29:
        this.f3480b = (r19.f3480b * r8) + this.f3480b;
        r6 = r6 + 1;
        goto L6
    L18:
        int r103 = 0;
    L19:
        if (r103 >= 9) goto L28;
        float r152 = r11[r103];
        if (r152 == 0.0f) goto L26;
        float r153 = r152 * r8;
        if (Math.abs(r153) >= 1.0E-4f) goto L25;
        r153 = 0.0f;
    L25:
        r9.f3500a.f3513h[r103] = r153;
    L27:
        r103 = r103 + 1;
        goto L19
    L26:
        r9.f3500a.f3513h[r103] = 0.0f;
        goto L27
    L28:
        m2370i(r7);
        goto L29
    L30:
        m2371j(r2);
    }

    /* JADX INFO: renamed from: i */
    public final void m2370i(C0989i r7) {
        int r02 = this.f3504h + 1;
        C0989i[] r2 = this.f3502f;
        if (r02 <= r2.length) goto L5;
        C0989i[] r03 = (C0989i[]) Arrays.copyOf(r2, r2.length * 2);
        this.f3502f = r03;
        this.f3503g = (C0989i[]) Arrays.copyOf(r03, r03.length * 2);
    L5:
        C0989i[] r04 = this.f3502f;
        int r22 = this.f3504h;
        r04[r22] = r7;
        int r3 = r22 + 1;
        this.f3504h = r3;
        if (r3 > 1) goto L8;
    L17:
        r7.f3506a = true;
        r7.m2373a(this);
        return;
    L8:
        if (r04[r22].f3507b <= r7.f3507b) goto L17;
        int r05 = 0;
        int r23 = 0;
    L10:
        int r32 = this.f3504h;
        if (r23 >= r32) goto L13;
        this.f3503g[r23] = this.f3502f[r23];
        r23 = r23 + 1;
        goto L10
    L13:
        Arrays.sort(this.f3503g, 0, r32, new C0375k(2));
    L15:
        if (r05 >= this.f3504h) goto L17;
        this.f3502f[r05] = this.f3503g[r05];
        r05 = r05 + 1;
        goto L15
    }

    /* JADX INFO: renamed from: j */
    public final void m2371j(C0989i r6) {
        int r1 = 0;
    L4:
        if (r1 >= this.f3504h) goto L13;
        if (this.f3502f[r1] == r6) goto L7;
        r1 = r1 + 1;
    L7:
        int r2 = this.f3504h;
        if (r1 >= (r2 - 1)) goto L10;
        C0989i[] r22 = this.f3502f;
        int r3 = r1 + 1;
        r22[r1] = r22[r3];
        r1 = r3;
        goto L7
    L10:
        this.f3504h = r2 - 1;
        r6.f3506a = false;
        return;
    }

    @Override // p069m.C0983c
    public final String toString() {
        String r02 = " goal -> (" + this.f3480b + ") : ";
        int r1 = 0;
    L4:
        if (r1 >= this.f3504h) goto L6;
        C0989i r2 = this.f3502f[r1];
        C0986f r3 = this.f3505i;
        r3.f3500a = r2;
        r02 = r02 + r3 + " ";
        r1 = r1 + 1;
        goto L4
    L6:
        return r02;
    }
}
