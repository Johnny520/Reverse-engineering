package p073f2;

import java.util.List;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p250r1.C6455e;

/* JADX INFO: renamed from: f2.g0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C2242g0 {

    /* JADX INFO: renamed from: a */
    public final long f6158a;

    /* JADX INFO: renamed from: b */
    public final long f6159b;

    /* JADX INFO: renamed from: c */
    public final long f6160c;

    /* JADX INFO: renamed from: d */
    public final long f6161d;

    /* JADX INFO: renamed from: e */
    public final boolean f6162e;

    /* JADX INFO: renamed from: f */
    public final float f6163f;

    /* JADX INFO: renamed from: g */
    public final int f6164g;

    /* JADX INFO: renamed from: h */
    public final boolean f6165h;

    /* JADX INFO: renamed from: i */
    public final List f6166i;

    /* JADX INFO: renamed from: j */
    public final long f6167j;

    /* JADX INFO: renamed from: k */
    public final long f6168k;

    public C2242g0(long j10, long j11, long j12, long j13, boolean z10, float f10, int i10, boolean z11, List list, long j14, long j15) {
        this.f6158a = j10;
        this.f6159b = j11;
        this.f6160c = j12;
        this.f6161d = j13;
        this.f6162e = z10;
        this.f6163f = f10;
        this.f6164g = i10;
        this.f6165h = z11;
        this.f6166i = list;
        this.f6167j = j14;
        this.f6168k = j15;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m8128a() {
        return this.f6165h;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m8129b() {
        return this.f6162e;
    }

    /* JADX INFO: renamed from: c */
    public final List m8130c() {
        return this.f6166i;
    }

    /* JADX INFO: renamed from: d */
    public final long m8131d() {
        return this.f6158a;
    }

    /* JADX INFO: renamed from: e */
    public final long m8132e() {
        return this.f6168k;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2242g0)) {
            return false;
        }
        C2242g0 c2242g0 = (C2242g0) obj;
        return AbstractC2234c0.m8064b(this.f6158a, c2242g0.f6158a) && this.f6159b == c2242g0.f6159b && C6455e.m25556j(this.f6160c, c2242g0.f6160c) && C6455e.m25556j(this.f6161d, c2242g0.f6161d) && this.f6162e == c2242g0.f6162e && Float.compare(this.f6163f, c2242g0.f6163f) == 0 && AbstractC2264r0.m8244g(this.f6164g, c2242g0.f6164g) && this.f6165h == c2242g0.f6165h && AbstractC1061t.m3842c(this.f6166i, c2242g0.f6166i) && C6455e.m25556j(this.f6167j, c2242g0.f6167j) && C6455e.m25556j(this.f6168k, c2242g0.f6168k);
    }

    /* JADX INFO: renamed from: f */
    public final long m8133f() {
        return this.f6161d;
    }

    /* JADX INFO: renamed from: g */
    public final long m8134g() {
        return this.f6160c;
    }

    /* JADX INFO: renamed from: h */
    public final float m8135h() {
        return this.f6163f;
    }

    public int hashCode() {
        return (((((((((((((((((((AbstractC2234c0.m8065c(this.f6158a) * 31) + Long.hashCode(this.f6159b)) * 31) + C6455e.m25561o(this.f6160c)) * 31) + C6455e.m25561o(this.f6161d)) * 31) + Boolean.hashCode(this.f6162e)) * 31) + Float.hashCode(this.f6163f)) * 31) + AbstractC2264r0.m8245h(this.f6164g)) * 31) + Boolean.hashCode(this.f6165h)) * 31) + this.f6166i.hashCode()) * 31) + C6455e.m25561o(this.f6167j)) * 31) + C6455e.m25561o(this.f6168k);
    }

    /* JADX INFO: renamed from: i */
    public final long m8136i() {
        return this.f6167j;
    }

    /* JADX INFO: renamed from: j */
    public final int m8137j() {
        return this.f6164g;
    }

    /* JADX INFO: renamed from: k */
    public final long m8138k() {
        return this.f6159b;
    }

    public String toString() {
        return "PointerInputEventData(id=" + ((Object) AbstractC2234c0.m8066d(this.f6158a)) + ", uptime=" + this.f6159b + ", positionOnScreen=" + ((Object) C6455e.m25565s(this.f6160c)) + ", position=" + ((Object) C6455e.m25565s(this.f6161d)) + ", down=" + this.f6162e + ", pressure=" + this.f6163f + ", type=" + ((Object) AbstractC2264r0.m8246i(this.f6164g)) + ", activeHover=" + this.f6165h + ", historical=" + this.f6166i + ", scrollDelta=" + ((Object) C6455e.m25565s(this.f6167j)) + ", originalEventPosition=" + ((Object) C6455e.m25565s(this.f6168k)) + ')';
    }

    public /* synthetic */ C2242g0(long j10, long j11, long j12, long j13, boolean z10, float f10, int i10, boolean z11, List list, long j14, long j15, AbstractC1043k abstractC1043k) {
        this(j10, j11, j12, j13, z10, f10, i10, z11, list, j14, j15);
    }
}
