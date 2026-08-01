package p063e7;

import p024b9.AbstractC1061t;

/* JADX INFO: renamed from: e7.m */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C2046m {

    /* JADX INFO: renamed from: a */
    public final String f5757a;

    /* JADX INFO: renamed from: b */
    public final int f5758b;

    /* JADX INFO: renamed from: c */
    public final long f5759c;

    /* JADX INFO: renamed from: d */
    public final boolean f5760d;

    public C2046m(String str, int i10, long j10, boolean z10) {
        str.getClass();
        this.f5757a = str;
        this.f5758b = i10;
        this.f5759c = j10;
        this.f5760d = z10;
    }

    /* JADX INFO: renamed from: a */
    public final long m7382a() {
        return this.f5759c;
    }

    /* JADX INFO: renamed from: b */
    public final String m7383b() {
        return this.f5757a;
    }

    /* JADX INFO: renamed from: c */
    public final int m7384c() {
        return this.f5758b;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m7385d() {
        return this.f5760d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2046m)) {
            return false;
        }
        C2046m c2046m = (C2046m) obj;
        return AbstractC1061t.m3842c(this.f5757a, c2046m.f5757a) && this.f5758b == c2046m.f5758b && this.f5759c == c2046m.f5759c && this.f5760d == c2046m.f5760d;
    }

    public int hashCode() {
        return (((((this.f5757a.hashCode() * 31) + Integer.hashCode(this.f5758b)) * 31) + Long.hashCode(this.f5759c)) * 31) + Boolean.hashCode(this.f5760d);
    }

    public String toString() {
        return "HttpServerSettings(host=" + this.f5757a + ", port=" + this.f5758b + ", connectionIdleTimeoutSeconds=" + this.f5759c + ", reuseAddress=" + this.f5760d + ')';
    }
}
