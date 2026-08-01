package p150k1;

import p024b9.AbstractC1061t;

/* JADX INFO: renamed from: k1.d */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C3911d {

    /* JADX INFO: renamed from: a */
    public final int f11372a;

    /* JADX INFO: renamed from: b */
    public final C3932y f11373b;

    /* JADX INFO: renamed from: c */
    public final Integer f11374c;

    public C3911d(int i10, C3932y c3932y, Integer num) {
        this.f11372a = i10;
        this.f11373b = c3932y;
        this.f11374c = num;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C3911d m15579b(C3911d c3911d, int i10, C3932y c3932y, Integer num, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = c3911d.f11372a;
        }
        if ((i11 & 2) != 0) {
            c3932y = c3911d.f11373b;
        }
        if ((i11 & 4) != 0) {
            num = c3911d.f11374c;
        }
        return c3911d.m15580a(i10, c3932y, num);
    }

    /* JADX INFO: renamed from: a */
    public final C3911d m15580a(int i10, C3932y c3932y, Integer num) {
        return new C3911d(i10, c3932y, num);
    }

    /* JADX INFO: renamed from: c */
    public final int m15581c() {
        return this.f11372a;
    }

    /* JADX INFO: renamed from: d */
    public final Integer m15582d() {
        return this.f11374c;
    }

    /* JADX INFO: renamed from: e */
    public final C3932y m15583e() {
        return this.f11373b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3911d)) {
            return false;
        }
        C3911d c3911d = (C3911d) obj;
        return this.f11372a == c3911d.f11372a && AbstractC1061t.m3842c(this.f11373b, c3911d.f11373b) && AbstractC1061t.m3842c(this.f11374c, c3911d.f11374c);
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.f11372a) * 31;
        C3932y c3932y = this.f11373b;
        int iHashCode2 = (iHashCode + (c3932y == null ? 0 : c3932y.hashCode())) * 31;
        Integer num = this.f11374c;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return "ComposeStackTraceFrame(groupKey=" + this.f11372a + ", sourceInfo=" + this.f11373b + ", groupOffset=" + this.f11374c + ')';
    }
}
