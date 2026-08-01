package p250r1;

/* JADX INFO: renamed from: r1.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C6453c {

    /* JADX INFO: renamed from: a */
    public float f20310a;

    /* JADX INFO: renamed from: b */
    public float f20311b;

    /* JADX INFO: renamed from: c */
    public float f20312c;

    /* JADX INFO: renamed from: d */
    public float f20313d;

    public C6453c(float f10, float f11, float f12, float f13) {
        this.f20310a = f10;
        this.f20311b = f11;
        this.f20312c = f12;
        this.f20313d = f13;
    }

    /* JADX INFO: renamed from: a */
    public final float m25533a() {
        return this.f20313d;
    }

    /* JADX INFO: renamed from: b */
    public final float m25534b() {
        return this.f20310a;
    }

    /* JADX INFO: renamed from: c */
    public final float m25535c() {
        return this.f20312c;
    }

    /* JADX INFO: renamed from: d */
    public final float m25536d() {
        return this.f20311b;
    }

    /* JADX INFO: renamed from: e */
    public final void m25537e(float f10, float f11, float f12, float f13) {
        this.f20310a = Math.max(f10, this.f20310a);
        this.f20311b = Math.max(f11, this.f20311b);
        this.f20312c = Math.min(f12, this.f20312c);
        this.f20313d = Math.min(f13, this.f20313d);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m25538f() {
        return (this.f20310a >= this.f20312c) | (this.f20311b >= this.f20313d);
    }

    /* JADX INFO: renamed from: g */
    public final void m25539g(float f10, float f11, float f12, float f13) {
        this.f20310a = f10;
        this.f20311b = f11;
        this.f20312c = f12;
        this.f20313d = f13;
    }

    /* JADX INFO: renamed from: h */
    public final void m25540h(float f10) {
        this.f20313d = f10;
    }

    /* JADX INFO: renamed from: i */
    public final void m25541i(float f10) {
        this.f20310a = f10;
    }

    /* JADX INFO: renamed from: j */
    public final void m25542j(float f10) {
        this.f20312c = f10;
    }

    /* JADX INFO: renamed from: k */
    public final void m25543k(float f10) {
        this.f20311b = f10;
    }

    /* JADX INFO: renamed from: l */
    public final void m25544l(float f10, float f11) {
        this.f20310a += f10;
        this.f20311b += f11;
        this.f20312c += f10;
        this.f20313d += f11;
    }

    /* JADX INFO: renamed from: m */
    public final void m25545m(long j10) {
        m25544l(Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & 4294967295L)));
    }

    public String toString() {
        return "MutableRect(" + AbstractC6452b.m25532a(this.f20310a, 1) + ", " + AbstractC6452b.m25532a(this.f20311b, 1) + ", " + AbstractC6452b.m25532a(this.f20312c, 1) + ", " + AbstractC6452b.m25532a(this.f20313d, 1) + ')';
    }
}
