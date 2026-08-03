package p037U;

/* JADX INFO: renamed from: U.X */
/* JADX INFO: loaded from: classes.dex */
public final class C0363X {

    /* JADX INFO: renamed from: a */
    public int f767a;

    /* JADX INFO: renamed from: b */
    public int f768b;

    /* JADX INFO: renamed from: c */
    public int f769c;

    /* JADX INFO: renamed from: d */
    public int f770d;

    /* JADX INFO: renamed from: e */
    public int f771e;

    /* JADX INFO: renamed from: a */
    public final boolean m935a() {
        int r02 = this.f767a;
        int r2 = 2;
        if ((r02 & 7) == 0) goto L14;
        int r1 = this.f770d;
        int r6 = this.f768b;
        if (r1 <= r6) goto L7;
        int r12 = 1;
    L11:
        if ((r12 & r02) != 0) goto L14;
        return false;
    L7:
        if (r1 != r6) goto L9;
        r12 = 2;
        goto L11
    L9:
        r12 = 4;
    L14:
        if ((r02 & 112) == 0) goto L25;
        int r13 = this.f770d;
        int r62 = this.f769c;
        if (r13 <= r62) goto L18;
        int r14 = 1;
    L22:
        if (((r14 << 4) & r02) != 0) goto L25;
        return false;
    L18:
        if (r13 != r62) goto L20;
        r14 = 2;
        goto L22
    L20:
        r14 = 4;
    L25:
        if ((r02 & 1792) == 0) goto L36;
        int r15 = this.f771e;
        int r63 = this.f768b;
        if (r15 <= r63) goto L29;
        int r16 = 1;
    L33:
        if (((r16 << 8) & r02) != 0) goto L36;
        return false;
    L29:
        if (r15 != r63) goto L31;
        r16 = 2;
        goto L33
    L31:
        r16 = 4;
    L36:
        if ((r02 & 28672) == 0) goto L46;
        int r17 = this.f771e;
        int r64 = this.f769c;
        if (r17 <= r64) goto L40;
        r2 = 1;
    L44:
        if ((r02 & (r2 << 12)) != 0) goto L46;
        return false;
    L40:
        if (r17 == r64) goto L44;
        r2 = 4;
    L46:
        return true;
    }
}
