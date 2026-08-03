package p050c0;

import p031Q0.AbstractC0307g;

/* JADX INFO: renamed from: c0.J0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0598J0 {

    /* JADX INFO: renamed from: a */
    public final boolean f1828a;

    /* JADX INFO: renamed from: b */
    public final boolean f1829b;

    /* JADX INFO: renamed from: c */
    public final String f1830c;

    public /* synthetic */ C0598J0() {
        this("今日已发${totalMsg}条", true, true);
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof C0598J0) == true) goto L8;
        return false;
    L8:
        C0598J0 r52 = (C0598J0) r5;
        boolean r1 = r52.f1828a;
        if (this.f1828a == r1) goto L12;
        return false;
    L12:
        if (this.f1829b == r52.f1829b) goto L15;
        return false;
    L15:
        if (AbstractC0307g.m699a(this.f1830c, r52.f1830c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public final int hashCode() {
        int r02 = Boolean.hashCode(this.f1828a) * 31;
        int r1 = (Boolean.hashCode(this.f1829b) + r02) * 31;
        return this.f1830c.hashCode() + r1;
    }

    public final String toString() {
        return "InputStatsOptions(enabled=" + this.f1828a + ", countSend=" + this.f1829b + ", template=" + this.f1830c + ")";
    }

    public C0598J0(String r2, boolean r3, boolean r4) {
        AbstractC0307g.m703e(r2, "template");
        this.f1828a = r3;
        this.f1829b = r4;
        this.f1830c = r2;
    }
}
