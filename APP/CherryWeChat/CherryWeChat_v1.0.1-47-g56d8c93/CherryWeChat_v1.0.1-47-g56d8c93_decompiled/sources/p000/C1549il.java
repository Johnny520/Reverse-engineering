package p000;

/* JADX INFO: renamed from: il */
/* JADX INFO: loaded from: classes.dex */
public final class C1549il {

    /* JADX INFO: renamed from: a */
    public final int f5502a;

    /* JADX INFO: renamed from: b */
    public final Object f5503b;

    public C1549il(int i, Object obj) {
        this.f5502a = i;
        this.f5503b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1549il)) {
            return false;
        }
        C1549il c1549il = (C1549il) obj;
        return this.f5502a == c1549il.f5502a && AbstractC0585Nj.m1134a(this.f5503b, c1549il.f5503b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f5502a) * 31;
        Object obj = this.f5503b;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "IndexedValue(index=" + this.f5502a + ", value=" + this.f5503b + ')';
    }
}
