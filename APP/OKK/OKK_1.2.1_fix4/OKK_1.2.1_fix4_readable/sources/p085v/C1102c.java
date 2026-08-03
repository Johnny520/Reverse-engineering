package p085v;

import android.graphics.Insets;

/* JADX INFO: renamed from: v.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1102c {

    /* JADX INFO: renamed from: e */
    public static final C1102c f4248e = new C1102c(0, 0, 0, 0);

    /* JADX INFO: renamed from: a */
    public final int f4249a;

    /* JADX INFO: renamed from: b */
    public final int f4250b;

    /* JADX INFO: renamed from: c */
    public final int f4251c;

    /* JADX INFO: renamed from: d */
    public final int f4252d;

    public C1102c(int i2, int i3, int i4, int i5) {
        this.f4249a = i2;
        this.f4250b = i3;
        this.f4251c = i4;
        this.f4252d = i5;
    }

    /* JADX INFO: renamed from: a */
    public static C1102c m2597a(C1102c c1102c, C1102c c1102c2) {
        return m2598b(Math.max(c1102c.f4249a, c1102c2.f4249a), Math.max(c1102c.f4250b, c1102c2.f4250b), Math.max(c1102c.f4251c, c1102c2.f4251c), Math.max(c1102c.f4252d, c1102c2.f4252d));
    }

    /* JADX INFO: renamed from: b */
    public static C1102c m2598b(int i2, int i3, int i4, int i5) {
        return (i2 == 0 && i3 == 0 && i4 == 0 && i5 == 0) ? f4248e : new C1102c(i2, i3, i4, i5);
    }

    /* JADX INFO: renamed from: c */
    public static C1102c m2599c(Insets insets) {
        return m2598b(insets.left, insets.top, insets.right, insets.bottom);
    }

    /* JADX INFO: renamed from: d */
    public final Insets m2600d() {
        return AbstractC1101b.m2596a(this.f4249a, this.f4250b, this.f4251c, this.f4252d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1102c.class != obj.getClass()) {
            return false;
        }
        C1102c c1102c = (C1102c) obj;
        return this.f4252d == c1102c.f4252d && this.f4249a == c1102c.f4249a && this.f4251c == c1102c.f4251c && this.f4250b == c1102c.f4250b;
    }

    public final int hashCode() {
        return (((((this.f4249a * 31) + this.f4250b) * 31) + this.f4251c) * 31) + this.f4252d;
    }

    public final String toString() {
        return "Insets{left=" + this.f4249a + ", top=" + this.f4250b + ", right=" + this.f4251c + ", bottom=" + this.f4252d + '}';
    }
}
