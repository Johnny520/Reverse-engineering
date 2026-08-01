package p150k1;

import p024b9.AbstractC1061t;

/* JADX INFO: renamed from: k1.s */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C3926s {

    /* JADX INFO: renamed from: a */
    public final int f11391a;

    /* JADX INFO: renamed from: b */
    public final Integer f11392b;

    public C3926s(int i10, Integer num) {
        this.f11391a = i10;
        this.f11392b = num;
    }

    /* JADX INFO: renamed from: a */
    public final int m15604a() {
        return this.f11391a;
    }

    /* JADX INFO: renamed from: b */
    public final Integer m15605b() {
        return this.f11392b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3926s)) {
            return false;
        }
        C3926s c3926s = (C3926s) obj;
        return this.f11391a == c3926s.f11391a && AbstractC1061t.m3842c(this.f11392b, c3926s.f11392b);
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.f11391a) * 31;
        Integer num = this.f11392b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public String toString() {
        return "ObjectLocation(group=" + this.f11391a + ", dataOffset=" + this.f11392b + ')';
    }
}
