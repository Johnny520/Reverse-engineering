package p000;

import android.graphics.Insets;

/* JADX INFO: renamed from: yl */
/* JADX INFO: loaded from: classes.dex */
public final class C2765yl {

    /* JADX INFO: renamed from: e */
    public static final C2765yl f9404e = null;

    /* JADX INFO: renamed from: a */
    public final int f9405a;

    /* JADX INFO: renamed from: b */
    public final int f9406b;

    /* JADX INFO: renamed from: c */
    public final int f9407c;

    /* JADX INFO: renamed from: d */
    public final int f9408d;

    static {
        f9404e = new C2765yl(0, 0, 0, 0);
    }

    public C2765yl(int r1, int r2, int r3, int r4) {
        this.f9405a = r1;
        this.f9406b = r2;
        this.f9407c = r3;
        this.f9408d = r4;
    }

    /* JADX INFO: renamed from: a */
    public static C2765yl m5336a(C2765yl r4, C2765yl r5) {
        return m5337b(Math.max(r4.f9405a, r5.f9405a), Math.max(r4.f9406b, r5.f9406b), Math.max(r4.f9407c, r5.f9407c), Math.max(r4.f9408d, r5.f9408d));
    }

    /* JADX INFO: renamed from: b */
    public static C2765yl m5337b(int r1, int r2, int r3, int r4) {
        if (r1 != 0) goto L9;
        if (r2 != 0) goto L9;
        if (r3 != 0) goto L9;
        if (r4 != 0) goto L9;
        return f9404e;
    L9:
        return new C2765yl(r1, r2, r3, r4);
    }

    /* JADX INFO: renamed from: c */
    public static C2765yl m5338c(Insets r3) {
        return m5337b(AbstractC0688Q.m1397a(r3), AbstractC0688Q.m1418v(r3), AbstractC0688Q.m1422z(r3), AbstractC0688Q.m1395C(r3));
    }

    /* JADX INFO: renamed from: d */
    public final Insets m5339d() {
        int r0 = this.f9407c;
        int r1 = this.f9408d;
        return AbstractC2785z4.m5357b(this.f9405a, this.f9406b, r0, r1);
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if (r5 != null) goto L8;
    L23:
        return false;
    L8:
        if (C2765yl.class != r5.getClass()) goto L23;
        C2765yl r52 = (C2765yl) r5;
        if (this.f9408d == r52.f9408d) goto L14;
        return false;
    L14:
        if (this.f9405a == r52.f9405a) goto L17;
        return false;
    L17:
        if (this.f9407c == r52.f9407c) goto L20;
        return false;
    L20:
        if (this.f9406b == r52.f9406b) goto L22;
        return false;
    L22:
        return true;
    }

    public final int hashCode() {
        return (((((this.f9405a * 31) + this.f9406b) * 31) + this.f9407c) * 31) + this.f9408d;
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder("Insets{left=");
        r0.append(this.f9405a);
        r0.append(", top=");
        r0.append(this.f9406b);
        r0.append(", right=");
        r0.append(this.f9407c);
        r0.append(", bottom=");
        return AbstractC0213Ey.m408f(r0, this.f9408d, '}');
    }
}
