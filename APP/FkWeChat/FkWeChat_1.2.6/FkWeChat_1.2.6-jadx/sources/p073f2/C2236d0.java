package p073f2;

import java.util.List;
import p024b9.AbstractC1043k;
import p185m8.AbstractC5114x;
import p250r1.C6455e;

/* JADX INFO: renamed from: f2.d0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C2236d0 {

    /* JADX INFO: renamed from: a */
    public final long f6115a;

    /* JADX INFO: renamed from: b */
    public final long f6116b;

    /* JADX INFO: renamed from: c */
    public final long f6117c;

    /* JADX INFO: renamed from: d */
    public final boolean f6118d;

    /* JADX INFO: renamed from: e */
    public final float f6119e;

    /* JADX INFO: renamed from: f */
    public final long f6120f;

    /* JADX INFO: renamed from: g */
    public final long f6121g;

    /* JADX INFO: renamed from: h */
    public final boolean f6122h;

    /* JADX INFO: renamed from: i */
    public final int f6123i;

    /* JADX INFO: renamed from: j */
    public final long f6124j;

    /* JADX INFO: renamed from: k */
    public List f6125k;

    /* JADX INFO: renamed from: l */
    public long f6126l;

    /* JADX INFO: renamed from: m */
    public boolean f6127m;

    /* JADX INFO: renamed from: n */
    public boolean f6128n;

    /* JADX INFO: renamed from: o */
    public C2236d0 f6129o;

    public /* synthetic */ C2236d0(long j10, long j11, long j12, boolean z10, float f10, long j13, long j14, boolean z11, boolean z12, int i10, long j15, int i11, AbstractC1043k abstractC1043k) {
        this(j10, j11, j12, z10, f10, j13, j14, z11, z12, (i11 & 512) != 0 ? AbstractC2264r0.f6219a.m8250d() : i10, (i11 & 1024) != 0 ? C6455e.f20314b.m25569c() : j15, null);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ C2236d0 m8070c(C2236d0 c2236d0, long j10, long j11, long j12, boolean z10, long j13, long j14, boolean z11, int i10, List list, long j15, int i11, Object obj) {
        long j16;
        long j17 = (i11 & 1) != 0 ? c2236d0.f6115a : j10;
        long j18 = (i11 & 2) != 0 ? c2236d0.f6116b : j11;
        long j19 = (i11 & 4) != 0 ? c2236d0.f6117c : j12;
        boolean z12 = (i11 & 8) != 0 ? c2236d0.f6118d : z10;
        long j20 = (i11 & 16) != 0 ? c2236d0.f6120f : j13;
        long j21 = (i11 & 32) != 0 ? c2236d0.f6121g : j14;
        boolean z13 = (i11 & 64) != 0 ? c2236d0.f6122h : z11;
        int i12 = (i11 & 128) != 0 ? c2236d0.f6123i : i10;
        if ((i11 & 512) != 0) {
            j16 = c2236d0.f6124j;
            j17 = j17;
        } else {
            j16 = j15;
        }
        return c2236d0.m8072b(j17, j18, j19, z12, j20, j21, z13, i12, list, j16);
    }

    /* JADX INFO: renamed from: a */
    public final void m8071a() {
        C2236d0 c2236d0 = this.f6129o;
        if (c2236d0 == null) {
            this.f6127m = true;
            this.f6128n = true;
        } else if (c2236d0 != null) {
            c2236d0.m8071a();
        }
    }

    /* JADX INFO: renamed from: b */
    public final C2236d0 m8072b(long j10, long j11, long j12, boolean z10, long j13, long j14, boolean z11, int i10, List list, long j15) {
        C2236d0 c2236d0M8073d = m8073d(j10, j11, j12, z10, this.f6119e, j13, j14, z11, i10, list, j15);
        C2236d0 c2236d0 = this.f6129o;
        if (c2236d0 == null) {
            c2236d0 = this;
        }
        c2236d0M8073d.f6129o = c2236d0;
        return c2236d0M8073d;
    }

    /* JADX INFO: renamed from: d */
    public final C2236d0 m8073d(long j10, long j11, long j12, boolean z10, float f10, long j13, long j14, boolean z11, int i10, List list, long j15) {
        C2236d0 c2236d0 = new C2236d0(j10, j11, j12, z10, f10, j13, j14, z11, false, i10, list, j15, this.f6126l, null);
        C2236d0 c2236d02 = this.f6129o;
        if (c2236d02 == null) {
            c2236d02 = this;
        }
        c2236d0.f6129o = c2236d02;
        return c2236d0;
    }

    /* JADX INFO: renamed from: e */
    public final List m8074e() {
        List list = this.f6125k;
        return list == null ? AbstractC5114x.m20800o() : list;
    }

    /* JADX INFO: renamed from: f */
    public final long m8075f() {
        return this.f6115a;
    }

    /* JADX INFO: renamed from: g */
    public final long m8076g() {
        return this.f6126l;
    }

    /* JADX INFO: renamed from: h */
    public final long m8077h() {
        return this.f6117c;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m8078i() {
        return this.f6118d;
    }

    /* JADX INFO: renamed from: j */
    public final float m8079j() {
        return this.f6119e;
    }

    /* JADX INFO: renamed from: k */
    public final long m8080k() {
        return this.f6121g;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m8081l() {
        return this.f6122h;
    }

    /* JADX INFO: renamed from: m */
    public final long m8082m() {
        return this.f6124j;
    }

    /* JADX INFO: renamed from: n */
    public final int m8083n() {
        return this.f6123i;
    }

    /* JADX INFO: renamed from: o */
    public final long m8084o() {
        return this.f6116b;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m8085p() {
        C2236d0 c2236d0 = this.f6129o;
        return c2236d0 != null ? c2236d0.m8085p() : this.f6127m || this.f6128n;
    }

    public String toString() {
        return "PointerInputChange(id=" + ((Object) AbstractC2234c0.m8066d(this.f6115a)) + ", uptimeMillis=" + this.f6116b + ", position=" + ((Object) C6455e.m25565s(this.f6117c)) + ", pressed=" + this.f6118d + ", pressure=" + this.f6119e + ", previousUptimeMillis=" + this.f6120f + ", previousPosition=" + ((Object) C6455e.m25565s(this.f6121g)) + ", previousPressed=" + this.f6122h + ", isConsumed=" + m8085p() + ", type=" + ((Object) AbstractC2264r0.m8246i(this.f6123i)) + ", historical=" + m8074e() + ",scrollDelta=" + ((Object) C6455e.m25565s(this.f6124j)) + ')';
    }

    public /* synthetic */ C2236d0(long j10, long j11, long j12, boolean z10, float f10, long j13, long j14, boolean z11, boolean z12, int i10, List list, long j15, long j16, AbstractC1043k abstractC1043k) {
        this(j10, j11, j12, z10, f10, j13, j14, z11, z12, i10, list, j15, j16);
    }

    public C2236d0(long j10, long j11, long j12, boolean z10, float f10, long j13, long j14, boolean z11, boolean z12, int i10, long j15) {
        this.f6115a = j10;
        this.f6116b = j11;
        this.f6117c = j12;
        this.f6118d = z10;
        this.f6119e = f10;
        this.f6120f = j13;
        this.f6121g = j14;
        this.f6122h = z11;
        this.f6123i = i10;
        this.f6124j = j15;
        this.f6126l = C6455e.f20314b.m25569c();
        this.f6127m = z12;
        this.f6128n = z12;
    }

    public /* synthetic */ C2236d0(long j10, long j11, long j12, boolean z10, float f10, long j13, long j14, boolean z11, boolean z12, int i10, long j15, AbstractC1043k abstractC1043k) {
        this(j10, j11, j12, z10, f10, j13, j14, z11, z12, i10, j15);
    }

    public C2236d0(long j10, long j11, long j12, boolean z10, float f10, long j13, long j14, boolean z11, boolean z12, int i10, List list, long j15, long j16) {
        this(j10, j11, j12, z10, f10, j13, j14, z11, z12, i10, j15, null);
        this.f6125k = list;
        this.f6126l = j16;
    }
}
