package p153e1;

import p011B4.AbstractC0231b;
import p237s4.AbstractC3202a;

/* JADX INFO: renamed from: e1.k */
/* JADX INFO: loaded from: classes.dex */
public final class C2015k {

    /* JADX INFO: renamed from: e */
    public static final C2015k f6736e = new C2015k(0, 0, 0, 0);

    /* JADX INFO: renamed from: a */
    public final int f6737a;

    /* JADX INFO: renamed from: b */
    public final int f6738b;

    /* JADX INFO: renamed from: c */
    public final int f6739c;

    /* JADX INFO: renamed from: d */
    public final int f6740d;

    public C2015k(int i5, int i6, int i7, int i8) {
        this.f6737a = i5;
        this.f6738b = i6;
        this.f6739c = i7;
        this.f6740d = i8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2015k)) {
            return false;
        }
        C2015k c2015k = (C2015k) obj;
        return this.f6737a == c2015k.f6737a && this.f6738b == c2015k.f6738b && this.f6739c == c2015k.f6739c && this.f6740d == c2015k.f6740d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f6740d) + AbstractC0231b.m391b(this.f6739c, AbstractC0231b.m391b(this.f6738b, Integer.hashCode(this.f6737a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IntRect.fromLTRB(");
        sb.append(this.f6737a);
        sb.append(", ");
        sb.append(this.f6738b);
        sb.append(", ");
        sb.append(this.f6739c);
        sb.append(", ");
        return AbstractC3202a.m5466a(sb, this.f6740d, ')');
    }
}
