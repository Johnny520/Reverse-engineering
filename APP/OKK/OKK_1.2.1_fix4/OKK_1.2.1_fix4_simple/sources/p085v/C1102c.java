package p085v;

import android.graphics.Insets;
import p001A0.AbstractC0016B;
import p057g.AbstractC0883T;

/* JADX INFO: renamed from: v.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1102c {

    /* JADX INFO: renamed from: e */
    public static final C1102c f4248e = null;

    /* JADX INFO: renamed from: a */
    public final int f4249a;

    /* JADX INFO: renamed from: b */
    public final int f4250b;

    /* JADX INFO: renamed from: c */
    public final int f4251c;

    /* JADX INFO: renamed from: d */
    public final int f4252d;

    static {
        f4248e = new C1102c(0, 0, 0, 0);
    }

    public C1102c(int r1, int r2, int r3, int r4) {
        this.f4249a = r1;
        this.f4250b = r2;
        this.f4251c = r3;
        this.f4252d = r4;
    }

    /* JADX INFO: renamed from: a */
    public static C1102c m2597a(C1102c r4, C1102c r5) {
        return m2598b(Math.max(r4.f4249a, r5.f4249a), Math.max(r4.f4250b, r5.f4250b), Math.max(r4.f4251c, r5.f4251c), Math.max(r4.f4252d, r5.f4252d));
    }

    /* JADX INFO: renamed from: b */
    public static C1102c m2598b(int r1, int r2, int r3, int r4) {
        if (r1 != 0) goto L9;
        if (r2 != 0) goto L9;
        if (r3 != 0) goto L9;
        if (r4 != 0) goto L9;
        return f4248e;
    L9:
        return new C1102c(r1, r2, r3, r4);
    }

    /* JADX INFO: renamed from: c */
    public static C1102c m2599c(Insets r3) {
        return m2598b(AbstractC0016B.m29b(r3), AbstractC0883T.m2211a(r3), AbstractC0883T.m2216f(r3), AbstractC0883T.m2217g(r3));
    }

    /* JADX INFO: renamed from: d */
    public final Insets m2600d() {
        int r02 = this.f4251c;
        int r1 = this.f4252d;
        return AbstractC1101b.m2596a(this.f4249a, this.f4250b, r02, r1);
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if (r5 != null) goto L8;
    L23:
        return false;
    L8:
        if (C1102c.class != r5.getClass()) goto L23;
        C1102c r52 = (C1102c) r5;
        if (this.f4252d == r52.f4252d) goto L14;
        return false;
    L14:
        if (this.f4249a == r52.f4249a) goto L17;
        return false;
    L17:
        if (this.f4251c == r52.f4251c) goto L20;
        return false;
    L20:
        if (this.f4250b == r52.f4250b) goto L22;
        return false;
    L22:
        return true;
    }

    public final int hashCode() {
        return (((((this.f4249a * 31) + this.f4250b) * 31) + this.f4251c) * 31) + this.f4252d;
    }

    public final String toString() {
        return "Insets{left=" + this.f4249a + ", top=" + this.f4250b + ", right=" + this.f4251c + ", bottom=" + this.f4252d + '}';
    }
}
