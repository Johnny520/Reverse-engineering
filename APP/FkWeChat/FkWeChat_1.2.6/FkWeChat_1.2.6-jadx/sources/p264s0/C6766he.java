package p264s0;

import p024b9.AbstractC1043k;
import p163l.AbstractC4298g0;
import p265s1.AbstractC7138s1;
import p265s1.C7128q1;

/* JADX INFO: renamed from: s0.he */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C6766he {

    /* JADX INFO: renamed from: a */
    public final long f21530a;

    /* JADX INFO: renamed from: b */
    public final long f21531b;

    /* JADX INFO: renamed from: c */
    public final long f21532c;

    /* JADX INFO: renamed from: d */
    public final long f21533d;

    /* JADX INFO: renamed from: e */
    public final long f21534e;

    /* JADX INFO: renamed from: f */
    public final long f21535f;

    public C6766he(long j10, long j11, long j12, long j13, long j14, long j15) {
        this.f21530a = j10;
        this.f21531b = j11;
        this.f21532c = j12;
        this.f21533d = j13;
        this.f21534e = j14;
        this.f21535f = j15;
    }

    /* JADX INFO: renamed from: a */
    public final long m26828a(float f10) {
        return AbstractC7138s1.m28204h(this.f21530a, this.f21531b, AbstractC4298g0.m16927b().mo16839a(f10));
    }

    /* JADX INFO: renamed from: b */
    public final C6766he m26829b(long j10, long j11, long j12, long j13, long j14, long j15) {
        return new C6766he(j10 != 16 ? j10 : this.f21530a, j11 != 16 ? j11 : this.f21531b, j12 != 16 ? j12 : this.f21532c, j13 != 16 ? j13 : this.f21533d, j14 != 16 ? j14 : this.f21534e, j15 != 16 ? j15 : this.f21535f, null);
    }

    /* JADX INFO: renamed from: c */
    public final long m26830c() {
        return this.f21534e;
    }

    /* JADX INFO: renamed from: d */
    public final long m26831d() {
        return this.f21532c;
    }

    /* JADX INFO: renamed from: e */
    public final long m26832e() {
        return this.f21535f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C6766he)) {
            return false;
        }
        C6766he c6766he = (C6766he) obj;
        return C7128q1.m28131q(this.f21530a, c6766he.f21530a) && C7128q1.m28131q(this.f21531b, c6766he.f21531b) && C7128q1.m28131q(this.f21532c, c6766he.f21532c) && C7128q1.m28131q(this.f21533d, c6766he.f21533d) && C7128q1.m28131q(this.f21534e, c6766he.f21534e) && C7128q1.m28131q(this.f21535f, c6766he.f21535f);
    }

    /* JADX INFO: renamed from: f */
    public final long m26833f() {
        return this.f21533d;
    }

    public int hashCode() {
        return (((((((((C7128q1.m28137w(this.f21530a) * 31) + C7128q1.m28137w(this.f21531b)) * 31) + C7128q1.m28137w(this.f21532c)) * 31) + C7128q1.m28137w(this.f21533d)) * 31) + C7128q1.m28137w(this.f21534e)) * 31) + C7128q1.m28137w(this.f21535f);
    }

    public /* synthetic */ C6766he(long j10, long j11, long j12, long j13, long j14, long j15, AbstractC1043k abstractC1043k) {
        this(j10, j11, j12, j13, j14, j15);
    }
}
