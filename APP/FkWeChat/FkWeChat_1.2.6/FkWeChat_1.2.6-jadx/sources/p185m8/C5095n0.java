package p185m8;

import p024b9.AbstractC1061t;

/* JADX INFO: renamed from: m8.n0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C5095n0 {

    /* JADX INFO: renamed from: a */
    public final int f15405a;

    /* JADX INFO: renamed from: b */
    public final Object f15406b;

    public C5095n0(int i10, Object obj) {
        this.f15405a = i10;
        this.f15406b = obj;
    }

    /* JADX INFO: renamed from: a */
    public final int m20619a() {
        return this.f15405a;
    }

    /* JADX INFO: renamed from: b */
    public final Object m20620b() {
        return this.f15406b;
    }

    /* JADX INFO: renamed from: c */
    public final int m20621c() {
        return this.f15405a;
    }

    /* JADX INFO: renamed from: d */
    public final Object m20622d() {
        return this.f15406b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5095n0)) {
            return false;
        }
        C5095n0 c5095n0 = (C5095n0) obj;
        return this.f15405a == c5095n0.f15405a && AbstractC1061t.m3842c(this.f15406b, c5095n0.f15406b);
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.f15405a) * 31;
        Object obj = this.f15406b;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    public String toString() {
        return "IndexedValue(index=" + this.f15405a + ", value=" + this.f15406b + ')';
    }
}
