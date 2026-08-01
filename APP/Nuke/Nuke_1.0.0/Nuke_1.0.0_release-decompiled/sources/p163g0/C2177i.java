package p163g0;

import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: g0.i */
/* JADX INFO: loaded from: classes.dex */
public final class C2177i {

    /* JADX INFO: renamed from: a */
    public final int f7136a;

    /* JADX INFO: renamed from: b */
    public final Integer f7137b;

    public C2177i(int i5, Integer num) {
        this.f7136a = i5;
        this.f7137b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2177i)) {
            return false;
        }
        C2177i c2177i = (C2177i) obj;
        return this.f7136a == c2177i.f7136a && AbstractC1665j.m2981a(this.f7137b, c2177i.f7137b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f7136a) * 31;
        Integer num = this.f7137b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "ObjectLocation(group=" + this.f7136a + ", dataOffset=" + this.f7137b + ')';
    }
}
