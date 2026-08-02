package p000;

/* JADX INFO: renamed from: wu */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0860wu implements l03 {

    /* JADX INFO: renamed from: h */
    public final long f12648h;

    public C0860wu(long j) {
        this.f12648h = j;
        if (j != 16) {
            return;
        }
        lz0.m2988a("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
    }

    @Override // p000.l03
    /* JADX INFO: renamed from: a */
    public final float mo863a() {
        return C0363ju.m2567d(this.f12648h);
    }

    @Override // p000.l03
    /* JADX INFO: renamed from: b */
    public final long mo864b() {
        return this.f12648h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0860wu) && C0363ju.m2566c(this.f12648h, ((C0860wu) obj).f12648h);
    }

    public final int hashCode() {
        int i = C0363ju.f5218h;
        return Long.hashCode(this.f12648h);
    }

    @Override // p000.l03
    /* JADX INFO: renamed from: k */
    public final AbstractC0024an mo865k() {
        return null;
    }

    public final String toString() {
        return "ColorStyle(value=" + ((Object) C0363ju.m2572i(this.f12648h)) + ')';
    }
}
