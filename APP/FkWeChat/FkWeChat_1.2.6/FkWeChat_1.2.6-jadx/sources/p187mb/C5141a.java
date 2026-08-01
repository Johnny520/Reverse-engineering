package p187mb;

import p024b9.AbstractC1061t;

/* JADX INFO: renamed from: mb.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5141a {

    /* JADX INFO: renamed from: a */
    public final Object f15740a;

    /* JADX INFO: renamed from: b */
    public final Object f15741b;

    public C5141a(Object obj, Object obj2) {
        this.f15740a = obj;
        this.f15741b = obj2;
    }

    /* JADX INFO: renamed from: a */
    public final Object m21144a() {
        return this.f15740a;
    }

    /* JADX INFO: renamed from: b */
    public final Object m21145b() {
        return this.f15741b;
    }

    /* JADX INFO: renamed from: c */
    public final Object m21146c() {
        return this.f15740a;
    }

    /* JADX INFO: renamed from: d */
    public final Object m21147d() {
        return this.f15741b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5141a)) {
            return false;
        }
        C5141a c5141a = (C5141a) obj;
        return AbstractC1061t.m3842c(this.f15740a, c5141a.f15740a) && AbstractC1061t.m3842c(this.f15741b, c5141a.f15741b);
    }

    public int hashCode() {
        Object obj = this.f15740a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f15741b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public String toString() {
        return "ApproximationBounds(lower=" + this.f15740a + ", upper=" + this.f15741b + ')';
    }
}
