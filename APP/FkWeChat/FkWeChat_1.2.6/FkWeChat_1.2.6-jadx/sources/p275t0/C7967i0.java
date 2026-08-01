package p275t0;

import p080f9.C2363j;

/* JADX INFO: renamed from: t0.i0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C7967i0 {

    /* JADX INFO: renamed from: a */
    public final int f26533a;

    /* JADX INFO: renamed from: b */
    public final int f26534b;

    /* JADX INFO: renamed from: c */
    public final int f26535c;

    /* JADX INFO: renamed from: d */
    public final int f26536d;

    /* JADX INFO: renamed from: e */
    public final long f26537e;

    /* JADX INFO: renamed from: f */
    public final long f26538f;

    public C7967i0(int i10, int i11, int i12, int i13, long j10) {
        this.f26533a = i10;
        this.f26534b = i11;
        this.f26535c = i12;
        this.f26536d = i13;
        this.f26537e = j10;
        this.f26538f = (j10 + (((long) i12) * 86400000)) - 1;
    }

    /* JADX INFO: renamed from: a */
    public final int m30734a() {
        return this.f26536d;
    }

    /* JADX INFO: renamed from: b */
    public final int m30735b() {
        return this.f26534b;
    }

    /* JADX INFO: renamed from: c */
    public final int m30736c() {
        return this.f26535c;
    }

    /* JADX INFO: renamed from: d */
    public final long m30737d() {
        return this.f26537e;
    }

    /* JADX INFO: renamed from: e */
    public final int m30738e() {
        return this.f26533a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7967i0)) {
            return false;
        }
        C7967i0 c7967i0 = (C7967i0) obj;
        return this.f26533a == c7967i0.f26533a && this.f26534b == c7967i0.f26534b && this.f26535c == c7967i0.f26535c && this.f26536d == c7967i0.f26536d && this.f26537e == c7967i0.f26537e;
    }

    /* JADX INFO: renamed from: f */
    public final int m30739f(C2363j c2363j) {
        return (((this.f26533a - c2363j.m8560o()) * 12) + this.f26534b) - 1;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.f26533a) * 31) + Integer.hashCode(this.f26534b)) * 31) + Integer.hashCode(this.f26535c)) * 31) + Integer.hashCode(this.f26536d)) * 31) + Long.hashCode(this.f26537e);
    }

    public String toString() {
        return "CalendarMonth(year=" + this.f26533a + ", month=" + this.f26534b + ", numberOfDays=" + this.f26535c + ", daysFromStartOfWeekToFirstOfMonth=" + this.f26536d + ", startUtcTimeMillis=" + this.f26537e + ')';
    }
}
