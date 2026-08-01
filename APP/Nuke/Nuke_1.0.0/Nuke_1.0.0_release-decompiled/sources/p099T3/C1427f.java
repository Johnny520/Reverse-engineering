package p099T3;

import p011B4.AbstractC0231b;
import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: T3.f */
/* JADX INFO: loaded from: classes.dex */
public final class C1427f {
    public static final C1423b Companion = new C1423b();

    /* JADX INFO: renamed from: a */
    public final int f5082a;

    /* JADX INFO: renamed from: b */
    public final int f5083b;

    /* JADX INFO: renamed from: c */
    public final C1426e f5084c;

    public /* synthetic */ C1427f(int i5, int i6, int i7, C1426e c1426e) {
        if ((i5 & 1) == 0) {
            this.f5082a = 0;
        } else {
            this.f5082a = i6;
        }
        if ((i5 & 2) == 0) {
            this.f5083b = 0;
        } else {
            this.f5083b = i7;
        }
        if ((i5 & 4) == 0) {
            this.f5084c = new C1426e(null);
        } else {
            this.f5084c = c1426e;
        }
    }

    /* JADX INFO: renamed from: a */
    public static C1427f m2721a(C1427f c1427f, int i5, int i6, C1426e c1426e, int i7) {
        if ((i7 & 1) != 0) {
            i5 = c1427f.f5082a;
        }
        if ((i7 & 2) != 0) {
            i6 = c1427f.f5083b;
        }
        if ((i7 & 4) != 0) {
            c1426e = c1427f.f5084c;
        }
        AbstractC1665j.m2985e(c1426e, "theme");
        return new C1427f(i5, i6, c1426e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1427f)) {
            return false;
        }
        C1427f c1427f = (C1427f) obj;
        return this.f5082a == c1427f.f5082a && this.f5083b == c1427f.f5083b && AbstractC1665j.m2981a(this.f5084c, c1427f.f5084c);
    }

    public final int hashCode() {
        return this.f5084c.hashCode() + AbstractC0231b.m391b(this.f5083b, Integer.hashCode(this.f5082a) * 31, 31);
    }

    public final String toString() {
        return "UIConfig(appearanceMode=" + this.f5082a + ", languageMode=" + this.f5083b + ", theme=" + this.f5084c + ")";
    }

    public C1427f(int i5, int i6, C1426e c1426e) {
        this.f5082a = i5;
        this.f5083b = i6;
        this.f5084c = c1426e;
    }

    public /* synthetic */ C1427f() {
        this(0, 0, new C1426e(null));
    }
}
