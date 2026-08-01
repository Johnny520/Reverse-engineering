package p029c2;

import p024b9.AbstractC1043k;
import p073f2.AbstractC2234c0;
import p250r1.C6455e;

/* JADX INFO: renamed from: c2.f */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C1313f {

    /* JADX INFO: renamed from: a */
    public final long f3937a;

    /* JADX INFO: renamed from: b */
    public final long f3938b;

    /* JADX INFO: renamed from: c */
    public final long f3939c;

    /* JADX INFO: renamed from: d */
    public final boolean f3940d;

    /* JADX INFO: renamed from: e */
    public final float f3941e;

    /* JADX INFO: renamed from: f */
    public final long f3942f;

    /* JADX INFO: renamed from: g */
    public final long f3943g;

    /* JADX INFO: renamed from: h */
    public final boolean f3944h;

    /* JADX INFO: renamed from: i */
    public boolean f3945i;

    public C1313f(long j10, long j11, long j12, boolean z10, float f10, long j13, long j14, boolean z11) {
        this.f3937a = j10;
        this.f3938b = j11;
        this.f3939c = j12;
        this.f3940d = z10;
        this.f3941e = f10;
        this.f3942f = j13;
        this.f3943g = j14;
        this.f3944h = z11;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m5290a() {
        return this.f3945i;
    }

    public String toString() {
        return "IndirectPointerInputChange(id=" + ((Object) AbstractC2234c0.m8066d(this.f3937a)) + ", uptimeMillis=" + this.f3938b + ", position=" + ((Object) C6455e.m25565s(this.f3939c)) + ", pressed=" + this.f3940d + ", pressure=" + this.f3941e + ", previousUptimeMillis=" + this.f3942f + ", previousPosition=" + ((Object) C6455e.m25565s(this.f3943g)) + ", previousPressed=" + this.f3944h + ", isConsumed=" + this.f3945i + ')';
    }

    public /* synthetic */ C1313f(long j10, long j11, long j12, boolean z10, float f10, long j13, long j14, boolean z11, AbstractC1043k abstractC1043k) {
        this(j10, j11, j12, z10, f10, j13, j14, z11);
    }
}
