package p077P0;

import p132a3.C1801a;

/* JADX INFO: renamed from: P0.g */
/* JADX INFO: loaded from: classes.dex */
public final class C1120g {

    /* JADX INFO: renamed from: c */
    public static final C1120g f3645c = new C1120g(0.0f, new C1801a(0.0f));

    /* JADX INFO: renamed from: a */
    public final float f3646a;

    /* JADX INFO: renamed from: b */
    public final C1801a f3647b;

    public C1120g(float f2, C1801a c1801a) {
        this.f3646a = f2;
        this.f3647b = c1801a;
        if (Float.isNaN(f2)) {
            throw new IllegalArgumentException("current must not be NaN");
        }
    }

    /* JADX INFO: renamed from: a */
    public final C1801a m2158a() {
        return this.f3647b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1120g)) {
            return false;
        }
        C1120g c1120g = (C1120g) obj;
        return this.f3646a == c1120g.f3646a && this.f3647b.equals(c1120g.f3647b);
    }

    public final int hashCode() {
        return (this.f3647b.hashCode() + (Float.hashCode(this.f3646a) * 31)) * 31;
    }

    public final String toString() {
        return "ProgressBarRangeInfo(current=" + this.f3646a + ", range=" + this.f3647b + ", steps=0)";
    }
}
