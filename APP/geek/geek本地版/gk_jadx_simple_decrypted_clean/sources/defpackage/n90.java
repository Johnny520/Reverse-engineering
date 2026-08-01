package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class n90 {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;

    public final boolean a() {
        int r0 = this.a;
        int r2 = 2;
        if ((r0 & 7) == 0) goto L14;
        int r1 = this.d;
        int r5 = this.b;
        if (r1 <= r5) goto L7;
        int r12 = 1;
    L11:
        if ((r12 & r0) != 0) goto L14;
        return false;
    L7:
        if (r1 != r5) goto L9;
        r12 = 2;
        goto L11
    L9:
        r12 = 4;
    L14:
        if ((r0 & 112) == 0) goto L25;
        int r13 = this.d;
        int r52 = this.c;
        if (r13 <= r52) goto L18;
        int r14 = 1;
    L22:
        if (((r14 << 4) & r0) != 0) goto L25;
        return false;
    L18:
        if (r13 != r52) goto L20;
        r14 = 2;
        goto L22
    L20:
        r14 = 4;
    L25:
        if ((r0 & 1792) == 0) goto L36;
        int r15 = this.e;
        int r53 = this.b;
        if (r15 <= r53) goto L29;
        int r16 = 1;
    L33:
        if (((r16 << 8) & r0) != 0) goto L36;
        return false;
    L29:
        if (r15 != r53) goto L31;
        r16 = 2;
        goto L33
    L31:
        r16 = 4;
    L36:
        if ((r0 & 28672) == 0) goto L47;
        int r17 = this.e;
        int r54 = this.c;
        if (r17 <= r54) goto L40;
        r2 = 1;
    L44:
        if ((r0 & (r2 << 12)) != 0) goto L47;
        return false;
    L40:
        if (r17 == r54) goto L44;
        r2 = 4;
    L47:
        return true;
    }
}
