package p250r1;

import p024b9.AbstractC1043k;

/* JADX INFO: renamed from: r1.i */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C6459i {

    /* JADX INFO: renamed from: i */
    public static final a f20325i = new a(null);

    /* JADX INFO: renamed from: j */
    public static final C6459i f20326j = AbstractC6460j.m25610c(0.0f, 0.0f, 0.0f, 0.0f, AbstractC6451a.f20308a.m25531a());

    /* JADX INFO: renamed from: a */
    public final float f20327a;

    /* JADX INFO: renamed from: b */
    public final float f20328b;

    /* JADX INFO: renamed from: c */
    public final float f20329c;

    /* JADX INFO: renamed from: d */
    public final float f20330d;

    /* JADX INFO: renamed from: e */
    public final long f20331e;

    /* JADX INFO: renamed from: f */
    public final long f20332f;

    /* JADX INFO: renamed from: g */
    public final long f20333g;

    /* JADX INFO: renamed from: h */
    public final long f20334h;

    public C6459i(float f10, float f11, float f12, float f13, long j10, long j11, long j12, long j13) {
        this.f20327a = f10;
        this.f20328b = f11;
        this.f20329c = f12;
        this.f20330d = f13;
        this.f20331e = j10;
        this.f20332f = j11;
        this.f20333g = j12;
        this.f20334h = j13;
    }

    /* JADX INFO: renamed from: a */
    public final float m25598a() {
        return this.f20330d;
    }

    /* JADX INFO: renamed from: b */
    public final long m25599b() {
        return this.f20334h;
    }

    /* JADX INFO: renamed from: c */
    public final long m25600c() {
        return this.f20333g;
    }

    /* JADX INFO: renamed from: d */
    public final float m25601d() {
        return this.f20330d - this.f20328b;
    }

    /* JADX INFO: renamed from: e */
    public final float m25602e() {
        return this.f20327a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6459i)) {
            return false;
        }
        C6459i c6459i = (C6459i) obj;
        return Float.compare(this.f20327a, c6459i.f20327a) == 0 && Float.compare(this.f20328b, c6459i.f20328b) == 0 && Float.compare(this.f20329c, c6459i.f20329c) == 0 && Float.compare(this.f20330d, c6459i.f20330d) == 0 && AbstractC6451a.m25528c(this.f20331e, c6459i.f20331e) && AbstractC6451a.m25528c(this.f20332f, c6459i.f20332f) && AbstractC6451a.m25528c(this.f20333g, c6459i.f20333g) && AbstractC6451a.m25528c(this.f20334h, c6459i.f20334h);
    }

    /* JADX INFO: renamed from: f */
    public final float m25603f() {
        return this.f20329c;
    }

    /* JADX INFO: renamed from: g */
    public final float m25604g() {
        return this.f20328b;
    }

    /* JADX INFO: renamed from: h */
    public final long m25605h() {
        return this.f20331e;
    }

    public int hashCode() {
        return (((((((((((((Float.hashCode(this.f20327a) * 31) + Float.hashCode(this.f20328b)) * 31) + Float.hashCode(this.f20329c)) * 31) + Float.hashCode(this.f20330d)) * 31) + AbstractC6451a.m25529d(this.f20331e)) * 31) + AbstractC6451a.m25529d(this.f20332f)) * 31) + AbstractC6451a.m25529d(this.f20333g)) * 31) + AbstractC6451a.m25529d(this.f20334h);
    }

    /* JADX INFO: renamed from: i */
    public final long m25606i() {
        return this.f20332f;
    }

    /* JADX INFO: renamed from: j */
    public final float m25607j() {
        return this.f20329c - this.f20327a;
    }

    public String toString() {
        long j10 = this.f20331e;
        long j11 = this.f20332f;
        long j12 = this.f20333g;
        long j13 = this.f20334h;
        String str = AbstractC6452b.m25532a(this.f20327a, 1) + ", " + AbstractC6452b.m25532a(this.f20328b, 1) + ", " + AbstractC6452b.m25532a(this.f20329c, 1) + ", " + AbstractC6452b.m25532a(this.f20330d, 1);
        if (!AbstractC6451a.m25528c(j10, j11) || !AbstractC6451a.m25528c(j11, j12) || !AbstractC6451a.m25528c(j12, j13)) {
            return "RoundRect(rect=" + str + ", topLeft=" + ((Object) AbstractC6451a.m25530e(j10)) + ", topRight=" + ((Object) AbstractC6451a.m25530e(j11)) + ", bottomRight=" + ((Object) AbstractC6451a.m25530e(j12)) + ", bottomLeft=" + ((Object) AbstractC6451a.m25530e(j13)) + ')';
        }
        int i10 = (int) (j10 >> 32);
        int i11 = (int) (j10 & 4294967295L);
        if (Float.intBitsToFloat(i10) == Float.intBitsToFloat(i11)) {
            return "RoundRect(rect=" + str + ", radius=" + AbstractC6452b.m25532a(Float.intBitsToFloat(i10), 1) + ')';
        }
        return "RoundRect(rect=" + str + ", x=" + AbstractC6452b.m25532a(Float.intBitsToFloat(i10), 1) + ", y=" + AbstractC6452b.m25532a(Float.intBitsToFloat(i11), 1) + ')';
    }

    /* JADX INFO: renamed from: r1.i$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        public a() {
        }
    }

    public /* synthetic */ C6459i(float f10, float f11, float f12, float f13, long j10, long j11, long j12, long j13, AbstractC1043k abstractC1043k) {
        this(f10, f11, f12, f13, j10, j11, j12, j13);
    }
}
