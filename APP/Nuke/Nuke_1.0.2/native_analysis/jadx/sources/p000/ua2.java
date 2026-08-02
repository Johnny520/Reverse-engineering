package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ua2 implements my0 {

    /* JADX INFO: renamed from: a */
    public final boolean f11196a;

    /* JADX INFO: renamed from: b */
    public final long f11197b;

    public ua2(long j, boolean z) {
        this.f11196a = z;
        this.f11197b = j;
    }

    @Override // p000.my0
    /* JADX INFO: renamed from: a */
    public final t60 mo2436a(bk1 bk1Var) {
        return new x60(bk1Var, this.f11196a, new hh1(7, this));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ua2)) {
            return false;
        }
        ua2 ua2Var = (ua2) obj;
        if (this.f11196a == ua2Var.f11196a && za0.m6404b(Float.NaN, Float.NaN)) {
            return C0363ju.m2566c(this.f11197b, ua2Var.f11197b);
        }
        return false;
    }

    public final int hashCode() {
        int iM5684c = vi0.m5684c(Float.NaN, Boolean.hashCode(this.f11196a) * 31, 961);
        int i = C0363ju.f5218h;
        return Long.hashCode(this.f11197b) + iM5684c;
    }
}
