package p073f2;

import p024b9.AbstractC1043k;
import p250r1.C6455e;

/* JADX INFO: renamed from: f2.d */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C2235d {

    /* JADX INFO: renamed from: a */
    public final long f6112a;

    /* JADX INFO: renamed from: b */
    public final long f6113b;

    /* JADX INFO: renamed from: c */
    public long f6114c;

    public C2235d(long j10, long j11) {
        this.f6112a = j10;
        this.f6113b = j11;
        this.f6114c = C6455e.f20314b.m25569c();
    }

    /* JADX INFO: renamed from: a */
    public final long m8067a() {
        return this.f6114c;
    }

    /* JADX INFO: renamed from: b */
    public final long m8068b() {
        return this.f6113b;
    }

    /* JADX INFO: renamed from: c */
    public final long m8069c() {
        return this.f6112a;
    }

    public String toString() {
        return "HistoricalChange(uptimeMillis=" + this.f6112a + ", position=" + ((Object) C6455e.m25565s(this.f6113b)) + ')';
    }

    public /* synthetic */ C2235d(long j10, long j11, AbstractC1043k abstractC1043k) {
        this(j10, j11);
    }

    public /* synthetic */ C2235d(long j10, long j11, long j12, AbstractC1043k abstractC1043k) {
        this(j10, j11, j12);
    }

    public C2235d(long j10, long j11, long j12) {
        this(j10, j11, (AbstractC1043k) null);
        this.f6114c = j12;
    }
}
