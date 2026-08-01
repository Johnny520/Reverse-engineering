package p088s0;

import p022L.AbstractC0174d;

/* JADX INFO: renamed from: s0.K */
/* JADX INFO: loaded from: classes.dex */
public final class C0977K {

    /* JADX INFO: renamed from: a */
    public final boolean f3498a;

    /* JADX INFO: renamed from: b */
    public final int f3499b;

    /* JADX INFO: renamed from: c */
    public final int f3500c;

    /* JADX INFO: renamed from: d */
    public final int f3501d;

    /* JADX INFO: renamed from: e */
    public final int f3502e;

    /* JADX INFO: renamed from: f */
    public final int f3503f;

    /* JADX INFO: renamed from: g */
    public final int f3504g;

    /* JADX INFO: renamed from: h */
    public final int f3505h;

    /* JADX INFO: renamed from: i */
    public final int f3506i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0977K(boolean z2, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        this.f3498a = z2;
        this.f3499b = i2;
        this.f3500c = i3;
        this.f3501d = i4;
        this.f3502e = i5;
        this.f3503f = i6;
        this.f3504g = i7;
        this.f3505h = i8;
        this.f3506i = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0977K)) {
            return false;
        }
        C0977K c0977k = (C0977K) obj;
        return this.f3498a == c0977k.f3498a && this.f3499b == c0977k.f3499b && this.f3500c == c0977k.f3500c && this.f3501d == c0977k.f3501d && this.f3502e == c0977k.f3502e && this.f3503f == c0977k.f3503f && this.f3504g == c0977k.f3504g && this.f3505h == c0977k.f3505h && this.f3506i == c0977k.f3506i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Integer.hashCode(-2519774) + AbstractC0174d.m345a(-2466443, AbstractC0174d.m345a(-12999829, AbstractC0174d.m345a(-8820520, AbstractC0174d.m345a(-12812566, AbstractC0174d.m345a(-15292005, AbstractC0174d.m345a(this.f3506i, AbstractC0174d.m345a(this.f3505h, AbstractC0174d.m345a(this.f3504g, AbstractC0174d.m345a(this.f3503f, AbstractC0174d.m345a(this.f3502e, AbstractC0174d.m345a(this.f3501d, AbstractC0174d.m345a(this.f3500c, AbstractC0174d.m345a(this.f3499b, Boolean.hashCode(this.f3498a) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "Palette(isDark=" + this.f3498a + ", header=" + this.f3499b + ", pageBg=" + this.f3500c + ", card=" + this.f3501d + ", fieldBg=" + this.f3502e + ", textPrimary=" + this.f3503f + ", textSecondary=" + this.f3504g + ", textTertiary=" + this.f3505h + ", divider=" + this.f3506i + ", accentTeal=-15292005, accentBlue=-12812566, accentPurple=-8820520, accentGreen=-12999829, accentPink=-2466443, accentOrange=-2519774)";
    }
}
