package p050c0;

import p031Q0.AbstractC0307g;

/* JADX INFO: renamed from: c0.q */
/* JADX INFO: loaded from: classes.dex */
public final class C0686q {

    /* JADX INFO: renamed from: a */
    public final boolean f2145a;

    /* JADX INFO: renamed from: b */
    public final boolean f2146b;

    /* JADX INFO: renamed from: c */
    public final boolean f2147c;

    /* JADX INFO: renamed from: d */
    public final String f2148d;

    /* JADX INFO: renamed from: e */
    public final boolean f2149e;

    /* JADX INFO: renamed from: f */
    public final boolean f2150f;

    /* JADX INFO: renamed from: g */
    public final boolean f2151g;

    /* JADX INFO: renamed from: h */
    public final boolean f2152h;

    /* JADX INFO: renamed from: i */
    public final boolean f2153i;

    public C0686q(boolean r1, boolean r2, boolean r3, String r4, boolean r5, boolean r6, boolean r7, boolean r8, boolean r9, boolean r10) {
        AbstractC0307g.m703e(r4, "revokeNoticeTemplate");
        this.f2145a = r1;
        this.f2146b = r2;
        this.f2147c = r3;
        this.f2148d = r4;
        this.f2149e = r5;
        this.f2150f = r6;
        this.f2151g = r7;
        this.f2152h = r9;
        this.f2153i = r10;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof C0686q) == true) goto L8;
        return false;
    L8:
        C0686q r52 = (C0686q) r5;
        boolean r1 = r52.f2145a;
        if (this.f2145a == r1) goto L12;
        return false;
    L12:
        if (this.f2146b == r52.f2146b) goto L15;
        return false;
    L15:
        if (this.f2147c == r52.f2147c) goto L18;
        return false;
    L18:
        if (AbstractC0307g.m699a(this.f2148d, r52.f2148d) == true) goto L21;
        return false;
    L21:
        if (this.f2149e == r52.f2149e) goto L24;
        return false;
    L24:
        if (this.f2150f == r52.f2150f) goto L27;
        return false;
    L27:
        if (this.f2151g == r52.f2151g) goto L30;
        return false;
    L30:
        if (this.f2152h == r52.f2152h) goto L33;
        return false;
    L33:
        if (this.f2153i == r52.f2153i) goto L35;
        return false;
    L35:
        return true;
    }

    public final int hashCode() {
        int r02 = Boolean.hashCode(this.f2145a) * 31;
        int r1 = (Boolean.hashCode(this.f2146b) + r02) * 31;
        int r03 = (Boolean.hashCode(this.f2147c) + r1) * 31;
        int r12 = (this.f2148d.hashCode() + r03) * 31;
        int r04 = (Boolean.hashCode(this.f2149e) + r12) * 31;
        int r13 = (Boolean.hashCode(this.f2150f) + r04) * 31;
        int r05 = (Boolean.hashCode(this.f2151g) + r13) * 31;
        int r14 = (Boolean.hashCode(false) + r05) * 31;
        int r06 = (Boolean.hashCode(this.f2152h) + r14) * 31;
        return Boolean.hashCode(this.f2153i) + r06;
    }

    public final String toString() {
        return "AppFeatureOptions(antiRevoke=" + this.f2145a + ", revokeNotice=" + this.f2146b + ", keepSelfRevoke=" + this.f2147c + ", revokeNoticeTemplate=" + this.f2148d + ", mediaProtect=" + this.f2149e + ", antiMomentsDelete=" + this.f2150f + ", swipeQuote=" + this.f2151g + ", swipeRepeat=false, customBubble=" + this.f2152h + ", settingsEntry=" + this.f2153i + ")";
    }
}
