package p224p1;

import p057e1.C0807b;
import p267s1.AbstractC3913s;

/* JADX INFO: renamed from: p1.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3287b {

    /* JADX INFO: renamed from: a */
    public final long f10450a;

    /* JADX INFO: renamed from: b */
    public final long f10451b;

    /* JADX INFO: renamed from: c */
    public final long f10452c;

    /* JADX INFO: renamed from: d */
    public final boolean f10453d;

    /* JADX INFO: renamed from: e */
    public final float f10454e;

    /* JADX INFO: renamed from: f */
    public final long f10455f;

    /* JADX INFO: renamed from: g */
    public final long f10456g;

    /* JADX INFO: renamed from: h */
    public final boolean f10457h;

    /* JADX INFO: renamed from: i */
    public boolean f10458i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3287b(long j3, long j4, long j5, boolean z9, float f3, long j10, long j11, boolean z10) {
        this.f10450a = j3;
        this.f10451b = j4;
        this.f10452c = j5;
        this.f10453d = z9;
        this.f10454e = f3;
        this.f10455f = j10;
        this.f10456g = j11;
        this.f10457h = z10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "IndirectPointerInputChange(id=" + ((Object) AbstractC3913s.m8117j(this.f10450a)) + ", uptimeMillis=" + this.f10451b + ", position=" + ((Object) C0807b.m2044g(this.f10452c)) + ", pressed=" + this.f10453d + ", pressure=" + this.f10454e + ", previousUptimeMillis=" + this.f10455f + ", previousPosition=" + ((Object) C0807b.m2044g(this.f10456g)) + ", previousPressed=" + this.f10457h + ", isConsumed=" + this.f10458i + ')';
    }
}
