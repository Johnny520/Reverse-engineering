package p264s0;

import p024b9.AbstractC1043k;
import p265s1.C7128q1;

/* JADX INFO: renamed from: s0.x8 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C7010x8 {

    /* JADX INFO: renamed from: a */
    public final long f23239a;

    /* JADX INFO: renamed from: b */
    public final long f23240b;

    /* JADX INFO: renamed from: c */
    public final long f23241c;

    /* JADX INFO: renamed from: d */
    public final long f23242d;

    /* JADX INFO: renamed from: e */
    public final long f23243e;

    /* JADX INFO: renamed from: f */
    public final long f23244f;

    /* JADX INFO: renamed from: g */
    public final long f23245g;

    /* JADX INFO: renamed from: h */
    public final long f23246h;

    /* JADX INFO: renamed from: i */
    public final long f23247i;

    /* JADX INFO: renamed from: j */
    public final long f23248j;

    public C7010x8(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19) {
        this.f23239a = j10;
        this.f23240b = j11;
        this.f23241c = j12;
        this.f23242d = j13;
        this.f23243e = j14;
        this.f23244f = j15;
        this.f23245g = j16;
        this.f23246h = j17;
        this.f23247i = j18;
        this.f23248j = j19;
    }

    /* JADX INFO: renamed from: a */
    public final C7010x8 m27652a(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19) {
        return new C7010x8(j10 != 16 ? j10 : this.f23239a, j11 != 16 ? j11 : this.f23240b, j12 != 16 ? j12 : this.f23241c, j13 != 16 ? j13 : this.f23242d, j14 != 16 ? j14 : this.f23243e, j15 != 16 ? j15 : this.f23244f, j16 != 16 ? j16 : this.f23245g, j17 != 16 ? j17 : this.f23246h, j18 != 16 ? j18 : this.f23247i, j19 != 16 ? j19 : this.f23248j, null);
    }

    /* JADX INFO: renamed from: b */
    public final long m27653b(boolean z10) {
        return z10 ? this.f23239a : this.f23244f;
    }

    /* JADX INFO: renamed from: c */
    public final long m27654c(boolean z10, boolean z11) {
        return z10 ? z11 ? this.f23241c : this.f23243e : z11 ? this.f23246h : this.f23248j;
    }

    /* JADX INFO: renamed from: d */
    public final long m27655d(boolean z10, boolean z11) {
        return z10 ? z11 ? this.f23240b : this.f23242d : z11 ? this.f23245g : this.f23247i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C7010x8)) {
            return false;
        }
        C7010x8 c7010x8 = (C7010x8) obj;
        return C7128q1.m28131q(this.f23239a, c7010x8.f23239a) && C7128q1.m28131q(this.f23240b, c7010x8.f23240b) && C7128q1.m28131q(this.f23241c, c7010x8.f23241c) && C7128q1.m28131q(this.f23242d, c7010x8.f23242d) && C7128q1.m28131q(this.f23243e, c7010x8.f23243e) && C7128q1.m28131q(this.f23244f, c7010x8.f23244f) && C7128q1.m28131q(this.f23245g, c7010x8.f23245g) && C7128q1.m28131q(this.f23246h, c7010x8.f23246h) && C7128q1.m28131q(this.f23247i, c7010x8.f23247i) && C7128q1.m28131q(this.f23248j, c7010x8.f23248j);
    }

    public int hashCode() {
        return (((((((((((((((((C7128q1.m28137w(this.f23239a) * 31) + C7128q1.m28137w(this.f23240b)) * 31) + C7128q1.m28137w(this.f23241c)) * 31) + C7128q1.m28137w(this.f23242d)) * 31) + C7128q1.m28137w(this.f23243e)) * 31) + C7128q1.m28137w(this.f23244f)) * 31) + C7128q1.m28137w(this.f23245g)) * 31) + C7128q1.m28137w(this.f23246h)) * 31) + C7128q1.m28137w(this.f23247i)) * 31) + C7128q1.m28137w(this.f23248j);
    }

    public /* synthetic */ C7010x8(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, AbstractC1043k abstractC1043k) {
        this(j10, j11, j12, j13, j14, j15, j16, j17, j18, j19);
    }
}
