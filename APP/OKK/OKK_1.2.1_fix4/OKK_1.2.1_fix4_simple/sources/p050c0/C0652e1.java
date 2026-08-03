package p050c0;

import p031Q0.AbstractC0307g;

/* JADX INFO: renamed from: c0.e1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0652e1 {

    /* JADX INFO: renamed from: a */
    public final int f2024a;

    /* JADX INFO: renamed from: b */
    public final String f2025b;

    /* JADX INFO: renamed from: c */
    public final String f2026c;

    /* JADX INFO: renamed from: d */
    public final long f2027d;

    /* JADX INFO: renamed from: e */
    public final String f2028e;

    /* JADX INFO: renamed from: f */
    public final long f2029f;

    public C0652e1(int r1, String r2, String r3, long r4, String r6, long r7) {
        this.f2024a = r1;
        this.f2025b = r2;
        this.f2026c = r3;
        this.f2027d = r4;
        this.f2028e = r6;
        this.f2029f = r7;
    }

    public final boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof C0652e1) == true) goto L8;
        return false;
    L8:
        C0652e1 r82 = (C0652e1) r8;
        int r1 = r82.f2024a;
        if (this.f2024a == r1) goto L12;
        return false;
    L12:
        if (AbstractC0307g.m699a(this.f2025b, r82.f2025b) == true) goto L15;
        return false;
    L15:
        if (AbstractC0307g.m699a(this.f2026c, r82.f2026c) == true) goto L18;
        return false;
    L18:
        if (this.f2027d == r82.f2027d) goto L21;
        return false;
    L21:
        if (AbstractC0307g.m699a(this.f2028e, r82.f2028e) == true) goto L24;
        return false;
    L24:
        if (this.f2029f == r82.f2029f) goto L26;
        return false;
    L26:
        return true;
    }

    public final int hashCode() {
        int r1 = (this.f2025b.hashCode() + (Integer.hashCode(this.f2024a) * 31)) * 31;
        int r02 = 0;
        String r2 = this.f2026c;
        if (r2 != null) goto L5;
        int r22 = 0;
    L6:
        int r23 = (Long.hashCode(this.f2027d) + ((r1 + r22) * 31)) * 31;
        String r12 = this.f2028e;
        if (r12 == null) goto L11;
        r02 = r12.hashCode();
    L11:
        return Long.hashCode(this.f2029f) + ((r23 + r02) * 31);
    L5:
        r22 = r2.hashCode();
        goto L6
    }

    public final String toString() {
        return "OriginalMessage(type=" + this.f2024a + ", content=" + this.f2025b + ", talker=" + this.f2026c + ", createTime=" + this.f2027d + ", sender=" + this.f2028e + ", msgSvrId=" + this.f2029f + ")";
    }
}
