package p050c0;

import p031Q0.AbstractC0307g;

/* JADX INFO: renamed from: c0.O0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0613O0 {

    /* JADX INFO: renamed from: a */
    public final String f1891a;

    /* JADX INFO: renamed from: b */
    public final String f1892b;

    /* JADX INFO: renamed from: c */
    public final boolean f1893c;

    public C0613O0(String r1, String r2, boolean r3) {
        this.f1891a = r1;
        this.f1892b = r2;
        this.f1893c = r3;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof C0613O0) == true) goto L8;
        return false;
    L8:
        C0613O0 r52 = (C0613O0) r5;
        String r1 = r52.f1891a;
        if (AbstractC0307g.m699a(this.f1891a, r1) == true) goto L12;
        return false;
    L12:
        if (AbstractC0307g.m699a(this.f1892b, r52.f1892b) == true) goto L15;
        return false;
    L15:
        if (this.f1893c == r52.f1893c) goto L17;
        return false;
    L17:
        return true;
    }

    public final int hashCode() {
        int r02 = this.f1891a.hashCode() * 31;
        int r1 = (this.f1892b.hashCode() + r02) * 31;
        return Boolean.hashCode(this.f1893c) + r1;
    }

    public final String toString() {
        return "Identity(room=" + this.f1891a + ", sender=" + this.f1892b + ", isGroup=" + this.f1893c + ")";
    }
}
