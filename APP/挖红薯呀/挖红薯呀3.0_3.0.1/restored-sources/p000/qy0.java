package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
final class qy0 extends te0 {

    /* JADX INFO: renamed from: a */
    public final ez0 f5233a;

    /* JADX INFO: renamed from: b */
    public final um0 f5234b;

    /* JADX INFO: renamed from: c */
    public final boolean f5235c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC0975yt f5236d;

    /* JADX INFO: renamed from: e */
    public final xg0 f5237e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC0386kb f5238f;

    /* JADX INFO: renamed from: g */
    public final boolean f5239g;

    /* JADX INFO: renamed from: h */
    public final C0343j5 f5240h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public qy0(C0343j5 c0343j5, InterfaceC0386kb interfaceC0386kb, InterfaceC0975yt interfaceC0975yt, xg0 xg0Var, um0 um0Var, ez0 ez0Var, boolean z, boolean z2) {
        this.f5233a = ez0Var;
        this.f5234b = um0Var;
        this.f5235c = z;
        this.f5236d = interfaceC0975yt;
        this.f5237e = xg0Var;
        this.f5238f = interfaceC0386kb;
        this.f5239g = z2;
        this.f5240h = c0343j5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.te0
    /* JADX INFO: renamed from: e */
    public final oe0 mo228e() {
        ry0 ry0Var = new ry0();
        ry0Var.f5578t = this.f5233a;
        ry0Var.f5579u = this.f5234b;
        ry0Var.f5580v = this.f5235c;
        ry0Var.f5581w = this.f5236d;
        ry0Var.f5582x = this.f5237e;
        ry0Var.f5583y = this.f5238f;
        ry0Var.f5584z = this.f5239g;
        ry0Var.f5572A = this.f5240h;
        return ry0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || qy0.class != obj.getClass()) {
            return false;
        }
        qy0 qy0Var = (qy0) obj;
        return p30.m3002l(this.f5233a, qy0Var.f5233a) && this.f5234b == qy0Var.f5234b && this.f5235c == qy0Var.f5235c && p30.m3002l(this.f5236d, qy0Var.f5236d) && p30.m3002l(this.f5237e, qy0Var.f5237e) && p30.m3002l(this.f5238f, qy0Var.f5238f) && this.f5239g == qy0Var.f5239g && p30.m3002l(this.f5240h, qy0Var.f5240h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.te0
    /* JADX INFO: renamed from: f */
    public final void mo229f(oe0 oe0Var) {
        xg0 xg0Var = this.f5237e;
        ((ry0) oe0Var).m3988B0(this.f5240h, this.f5238f, this.f5236d, xg0Var, this.f5234b, this.f5233a, this.f5239g, this.f5235c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iM4145c = AbstractC0748t1.m4145c(AbstractC0748t1.m4145c((this.f5234b.hashCode() + (this.f5233a.hashCode() * 31)) * 31, 31, this.f5235c), 31, false);
        InterfaceC0975yt interfaceC0975yt = this.f5236d;
        int iHashCode = (iM4145c + (interfaceC0975yt != null ? interfaceC0975yt.hashCode() : 0)) * 31;
        xg0 xg0Var = this.f5237e;
        int iHashCode2 = (iHashCode + (xg0Var != null ? xg0Var.hashCode() : 0)) * 31;
        InterfaceC0386kb interfaceC0386kb = this.f5238f;
        int iM4145c2 = AbstractC0748t1.m4145c((iHashCode2 + (interfaceC0386kb != null ? interfaceC0386kb.hashCode() : 0)) * 31, 31, this.f5239g);
        C0343j5 c0343j5 = this.f5240h;
        return iM4145c2 + (c0343j5 != null ? c0343j5.hashCode() : 0);
    }
}
