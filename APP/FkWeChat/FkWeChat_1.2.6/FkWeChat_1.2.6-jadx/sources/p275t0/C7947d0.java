package p275t0;

import p024b9.AbstractC1061t;

/* JADX INFO: renamed from: t0.d0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C7947d0 implements Comparable {

    /* JADX INFO: renamed from: q */
    public final int f26496q;

    /* JADX INFO: renamed from: r */
    public final int f26497r;

    /* JADX INFO: renamed from: s */
    public final int f26498s;

    /* JADX INFO: renamed from: t */
    public final long f26499t;

    public C7947d0(int i10, int i11, int i12, long j10) {
        this.f26496q = i10;
        this.f26497r = i11;
        this.f26498s = i12;
        this.f26499t = j10;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(C7947d0 c7947d0) {
        return AbstractC1061t.m3844e(this.f26499t, c7947d0.f26499t);
    }

    /* JADX INFO: renamed from: c */
    public final int m30676c() {
        return this.f26497r;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7947d0)) {
            return false;
        }
        C7947d0 c7947d0 = (C7947d0) obj;
        return this.f26496q == c7947d0.f26496q && this.f26497r == c7947d0.f26497r && this.f26498s == c7947d0.f26498s && this.f26499t == c7947d0.f26499t;
    }

    /* JADX INFO: renamed from: g */
    public final long m30677g() {
        return this.f26499t;
    }

    /* JADX INFO: renamed from: h */
    public final int m30678h() {
        return this.f26496q;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.f26496q) * 31) + Integer.hashCode(this.f26497r)) * 31) + Integer.hashCode(this.f26498s)) * 31) + Long.hashCode(this.f26499t);
    }

    public String toString() {
        return "CalendarDate(year=" + this.f26496q + ", month=" + this.f26497r + ", dayOfMonth=" + this.f26498s + ", utcTimeMillis=" + this.f26499t + ')';
    }
}
