package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class ap0 implements InterfaceC0120d8 {

    /* JADX INFO: renamed from: a */
    public final int f224a;

    /* JADX INFO: renamed from: b */
    public final int f225b;

    /* JADX INFO: renamed from: c */
    public final long f226c;

    /* JADX INFO: renamed from: d */
    public final z61 f227d;

    /* JADX INFO: renamed from: e */
    public final er0 f228e;

    /* JADX INFO: renamed from: f */
    public final la0 f229f;

    /* JADX INFO: renamed from: g */
    public final int f230g;

    /* JADX INFO: renamed from: h */
    public final int f231h;

    /* JADX INFO: renamed from: i */
    public final k71 f232i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ap0(int i, int i2, long j, z61 z61Var, er0 er0Var, la0 la0Var, int i3, int i4, k71 k71Var) {
        this.f224a = i;
        this.f225b = i2;
        this.f226c = j;
        this.f227d = z61Var;
        this.f228e = er0Var;
        this.f229f = la0Var;
        this.f230g = i3;
        this.f231h = i4;
        this.f232i = k71Var;
        if (u71.m4286a(j, u71.f6158c) || u71.m4288c(j) >= 0.0f) {
            return;
        }
        x10.m5083b("lineHeight can't be negative (" + u71.m4288c(j) + ')');
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final ap0 m195a(ap0 ap0Var) {
        return ap0Var == null ? this : bp0.m360a(this, ap0Var.f224a, ap0Var.f225b, ap0Var.f226c, ap0Var.f227d, ap0Var.f228e, ap0Var.f229f, ap0Var.f230g, ap0Var.f231h, ap0Var.f232i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ap0)) {
            return false;
        }
        ap0 ap0Var = (ap0) obj;
        return this.f224a == ap0Var.f224a && this.f225b == ap0Var.f225b && u71.m4286a(this.f226c, ap0Var.f226c) && p30.m3002l(this.f227d, ap0Var.f227d) && p30.m3002l(this.f228e, ap0Var.f228e) && p30.m3002l(this.f229f, ap0Var.f229f) && this.f230g == ap0Var.f230g && this.f231h == ap0Var.f231h && p30.m3002l(this.f232i, ap0Var.f232i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iM4144b = AbstractC0748t1.m4144b(this.f225b, Integer.hashCode(this.f224a) * 31, 31);
        v71[] v71VarArr = u71.f6157b;
        int iM4146d = AbstractC0748t1.m4146d(this.f226c, iM4144b, 31);
        z61 z61Var = this.f227d;
        int iHashCode = (iM4146d + (z61Var != null ? z61Var.hashCode() : 0)) * 31;
        er0 er0Var = this.f228e;
        int iHashCode2 = (iHashCode + (er0Var != null ? er0Var.hashCode() : 0)) * 31;
        la0 la0Var = this.f229f;
        int iM4144b2 = AbstractC0748t1.m4144b(this.f231h, AbstractC0748t1.m4144b(this.f230g, (iHashCode2 + (la0Var != null ? la0Var.hashCode() : 0)) * 31, 31), 31);
        k71 k71Var = this.f232i;
        return iM4144b2 + (k71Var != null ? k71Var.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "ParagraphStyle(textAlign=" + ((Object) r61.m3425a(this.f224a)) + ", textDirection=" + ((Object) w61.m4920a(this.f225b)) + ", lineHeight=" + ((Object) u71.m4289d(this.f226c)) + ", textIndent=" + this.f227d + ", platformStyle=" + this.f228e + ", lineHeightStyle=" + this.f229f + ", lineBreak=" + ((Object) ga0.m1235a(this.f230g)) + ", hyphens=" + ((Object) C0336iz.m1605a(this.f231h)) + ", textMotion=" + this.f232i + ')';
    }
}
