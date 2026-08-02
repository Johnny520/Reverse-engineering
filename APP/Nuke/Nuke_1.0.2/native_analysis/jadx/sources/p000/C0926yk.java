package p000;

/* JADX INFO: renamed from: yk */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0926yk extends lw1 {

    /* JADX INFO: renamed from: e */
    public final C0122d9 f13493e;

    /* JADX INFO: renamed from: f */
    public final long f13494f;

    /* JADX INFO: renamed from: g */
    public final int f13495g;

    /* JADX INFO: renamed from: h */
    public final long f13496h;

    /* JADX INFO: renamed from: i */
    public float f13497i;

    /* JADX INFO: renamed from: j */
    public C0095cl f13498j;

    public C0926yk(C0122d9 c0122d9) {
        int i;
        long width = (((long) c0122d9.f1913a.getWidth()) << 32) | (((long) c0122d9.f1913a.getHeight()) & 4294967295L);
        this.f13493e = c0122d9;
        this.f13494f = width;
        this.f13495g = 1;
        int i2 = (int) (width >> 32);
        if (i2 < 0 || (i = (int) (width & 4294967295L)) < 0 || i2 > c0122d9.f1913a.getWidth() || i > c0122d9.f1913a.getHeight()) {
            C0676s.m4651j("Failed requirement.");
            throw null;
        }
        this.f13496h = width;
        this.f13497i = 1.0f;
    }

    @Override // p000.lw1
    /* JADX INFO: renamed from: a */
    public final void mo2974a(float f) {
        this.f13497i = f;
    }

    @Override // p000.lw1
    /* JADX INFO: renamed from: b */
    public final void mo2975b(C0095cl c0095cl) {
        this.f13498j = c0095cl;
    }

    @Override // p000.lw1
    /* JADX INFO: renamed from: d */
    public final long mo2977d() {
        return s11.m4715q0(this.f13496h);
    }

    @Override // p000.lw1
    /* JADX INFO: renamed from: e */
    public final void mo2978e(t61 t61Var) {
        C0702sp c0702sp = t61Var.f10581h;
        nc0.m3269V(t61Var, this.f13493e, this.f13494f, (((long) Math.round(Float.intBitsToFloat((int) (c0702sp.mo3280d() >> 32)))) << 32) | (((long) Math.round(Float.intBitsToFloat((int) (c0702sp.mo3280d() & 4294967295L)))) & 4294967295L), this.f13497i, this.f13498j, this.f13495g, 328);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0926yk)) {
            return false;
        }
        C0926yk c0926yk = (C0926yk) obj;
        return t11.m5086l(this.f13493e, c0926yk.f13493e) && z01.m6371a(0L, 0L) && h11.m2041a(this.f13494f, c0926yk.f13494f) && this.f13495g == c0926yk.f13495g;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f13495g) + hk1.m2204c(hk1.m2204c(this.f13493e.hashCode() * 31, 31, 0L), 31, this.f13494f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BitmapPainter(image=");
        sb.append(this.f13493e);
        sb.append(", srcOffset=");
        sb.append((Object) z01.m6374d(0L));
        sb.append(", srcSize=");
        sb.append((Object) h11.m2042b(this.f13494f));
        sb.append(", filterQuality=");
        int i = this.f13495g;
        sb.append((Object) (i == 0 ? "None" : i == 1 ? "Low" : i == 2 ? "Medium" : i == 3 ? "High" : "Unknown"));
        sb.append(')');
        return sb.toString();
    }
}
