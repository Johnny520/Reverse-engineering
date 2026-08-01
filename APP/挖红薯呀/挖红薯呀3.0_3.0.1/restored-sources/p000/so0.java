package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
final class so0 extends te0 {

    /* JADX INFO: renamed from: a */
    public final ro0 f5810a;

    /* JADX INFO: renamed from: b */
    public final C0276ha f5811b;

    /* JADX INFO: renamed from: c */
    public final C0675r3 f5812c;

    /* JADX INFO: renamed from: d */
    public final float f5813d;

    /* JADX INFO: renamed from: e */
    public final C0348ja f5814e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public so0(ro0 ro0Var, C0276ha c0276ha, C0675r3 c0675r3, float f, C0348ja c0348ja) {
        this.f5810a = ro0Var;
        this.f5811b = c0276ha;
        this.f5812c = c0675r3;
        this.f5813d = f;
        this.f5814e = c0348ja;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.te0
    /* JADX INFO: renamed from: e */
    public final oe0 mo228e() {
        to0 to0Var = new to0();
        to0Var.f6023r = this.f5810a;
        to0Var.f6024s = true;
        to0Var.f6025t = this.f5811b;
        to0Var.f6026u = this.f5812c;
        to0Var.f6027v = this.f5813d;
        to0Var.f6028w = this.f5814e;
        return to0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof so0)) {
            return false;
        }
        so0 so0Var = (so0) obj;
        return p30.m3002l(this.f5810a, so0Var.f5810a) && p30.m3002l(this.f5811b, so0Var.f5811b) && p30.m3002l(this.f5812c, so0Var.f5812c) && Float.compare(this.f5813d, so0Var.f5813d) == 0 && p30.m3002l(this.f5814e, so0Var.f5814e);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.te0
    /* JADX INFO: renamed from: f */
    public final void mo229f(oe0 oe0Var) {
        to0 to0Var = (to0) oe0Var;
        boolean z = to0Var.f6024s;
        ro0 ro0Var = this.f5810a;
        boolean z2 = (z && q11.m3185a(to0Var.f6023r.mo1568d(), ro0Var.mo1568d())) ? false : true;
        to0Var.f6023r = ro0Var;
        to0Var.f6024s = true;
        to0Var.f6025t = this.f5811b;
        to0Var.f6026u = this.f5812c;
        to0Var.f6027v = this.f5813d;
        to0Var.f6028w = this.f5814e;
        if (z2) {
            v50.m4407m(to0Var);
        }
        AbstractC0398kl.m1932r(to0Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iM4143a = AbstractC0748t1.m4143a(this.f5813d, (this.f5812c.hashCode() + ((this.f5811b.hashCode() + AbstractC0748t1.m4145c(this.f5810a.hashCode() * 31, 31, true)) * 31)) * 31, 31);
        C0348ja c0348ja = this.f5814e;
        return iM4143a + (c0348ja == null ? 0 : c0348ja.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "PainterElement(painter=" + this.f5810a + ", sizeToIntrinsics=true, alignment=" + this.f5811b + ", contentScale=" + this.f5812c + ", alpha=" + this.f5813d + ", colorFilter=" + this.f5814e + ')';
    }
}
