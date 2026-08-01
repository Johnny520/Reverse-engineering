package p163l;

import p265s1.AbstractC7164y0;

/* JADX INFO: renamed from: l.y */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C4387y implements InterfaceC4288e0 {

    /* JADX INFO: renamed from: a */
    public final float f12848a;

    /* JADX INFO: renamed from: b */
    public final float f12849b;

    /* JADX INFO: renamed from: c */
    public final float f12850c;

    /* JADX INFO: renamed from: d */
    public final float f12851d;

    /* JADX INFO: renamed from: e */
    public final float f12852e;

    /* JADX INFO: renamed from: f */
    public final float f12853f;

    public C4387y(float f10, float f11, float f12, float f13) {
        this.f12848a = f10;
        this.f12849b = f11;
        this.f12850c = f12;
        this.f12851d = f13;
        if (!((Float.isNaN(f10) || Float.isNaN(f11) || Float.isNaN(f12) || Float.isNaN(f13)) ? false : true)) {
            AbstractC4294f1.m16849a("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: " + f10 + ", " + f11 + ", " + f12 + ", " + f13 + '.');
        }
        long jM28264b = AbstractC7164y0.m28264b(0.0f, f11, f13, 1.0f, new float[5], 0);
        this.f12852e = Float.intBitsToFloat((int) (jM28264b >> 32));
        this.f12853f = Float.intBitsToFloat((int) (jM28264b & 4294967295L));
    }

    @Override // p163l.InterfaceC4288e0
    /* JADX INFO: renamed from: a */
    public float mo16839a(float f10) {
        if (f10 > 0.0f && f10 < 1.0f) {
            float fMax = Math.max(f10, 1.1920929E-7f);
            float fM28267e = AbstractC7164y0.m28267e(0.0f - fMax, this.f12848a - fMax, this.f12850c - fMax, 1.0f - fMax);
            if (Float.isNaN(fM28267e)) {
                m17164b(f10);
            }
            f10 = AbstractC7164y0.m28265c(this.f12849b, this.f12851d, fM28267e);
            float f11 = this.f12852e;
            float f12 = this.f12853f;
            if (f10 < f11) {
                f10 = f11;
            }
            if (f10 > f12) {
                return f12;
            }
        }
        return f10;
    }

    /* JADX INFO: renamed from: b */
    public final void m17164b(float f10) {
        throw new IllegalArgumentException("The cubic curve with parameters (" + this.f12848a + ", " + this.f12849b + ", " + this.f12850c + ", " + this.f12851d + ") has no solution at " + f10);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C4387y)) {
            return false;
        }
        C4387y c4387y = (C4387y) obj;
        return this.f12848a == c4387y.f12848a && this.f12849b == c4387y.f12849b && this.f12850c == c4387y.f12850c && this.f12851d == c4387y.f12851d;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.f12848a) * 31) + Float.hashCode(this.f12849b)) * 31) + Float.hashCode(this.f12850c)) * 31) + Float.hashCode(this.f12851d);
    }

    public String toString() {
        return "CubicBezierEasing(a=" + this.f12848a + ", b=" + this.f12849b + ", c=" + this.f12850c + ", d=" + this.f12851d + ')';
    }
}
