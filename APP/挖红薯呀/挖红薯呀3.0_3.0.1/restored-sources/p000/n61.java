package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class n61 implements InterfaceC0642q7 {

    /* JADX INFO: renamed from: a */
    public final mb1 f4186a;

    /* JADX INFO: renamed from: b */
    public final q91 f4187b;

    /* JADX INFO: renamed from: c */
    public final Object f4188c;

    /* JADX INFO: renamed from: d */
    public final Object f4189d;

    /* JADX INFO: renamed from: e */
    public final AbstractC0046b8 f4190e;

    /* JADX INFO: renamed from: f */
    public final AbstractC0046b8 f4191f;

    /* JADX INFO: renamed from: g */
    public final AbstractC0046b8 f4192g;

    /* JADX INFO: renamed from: h */
    public long f4193h;

    /* JADX INFO: renamed from: i */
    public AbstractC0046b8 f4194i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public n61(InterfaceC0830v7 interfaceC0830v7, q91 q91Var, Object obj, Object obj2, AbstractC0046b8 abstractC0046b8) {
        this.f4186a = interfaceC0830v7.mo969a(q91Var);
        this.f4187b = q91Var;
        this.f4188c = obj2;
        this.f4189d = obj;
        this.f4190e = (AbstractC0046b8) q91Var.f5089a.invoke(obj);
        InterfaceC0742sw interfaceC0742sw = q91Var.f5089a;
        this.f4191f = (AbstractC0046b8) interfaceC0742sw.invoke(obj2);
        this.f4192g = abstractC0046b8 != null ? AbstractC0307i4.m1537m(abstractC0046b8) : ((AbstractC0046b8) interfaceC0742sw.invoke(obj)).mo28c();
        this.f4193h = -1L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0642q7
    /* JADX INFO: renamed from: a */
    public final boolean mo2023a() {
        return this.f4186a.mo2486a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0642q7
    /* JADX INFO: renamed from: b */
    public final Object mo2024b(long j) {
        if (m3207g(j)) {
            return this.f4188c;
        }
        AbstractC0046b8 abstractC0046b8Mo379h = this.f4186a.mo379h(j, this.f4190e, this.f4191f, this.f4192g);
        int iMo27b = abstractC0046b8Mo379h.mo27b();
        for (int i = 0; i < iMo27b; i++) {
            if (Float.isNaN(abstractC0046b8Mo379h.mo26a(i))) {
                yr0.m5293b("AnimationVector cannot contain a NaN. " + abstractC0046b8Mo379h + ". Animation: " + this + ", playTimeNanos: " + j);
            }
        }
        return this.f4187b.f5090b.invoke(abstractC0046b8Mo379h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0642q7
    /* JADX INFO: renamed from: c */
    public final long mo2025c() {
        if (this.f4193h < 0) {
            this.f4193h = this.f4186a.mo2487b(this.f4190e, this.f4191f, this.f4192g);
        }
        return this.f4193h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0642q7
    /* JADX INFO: renamed from: d */
    public final q91 mo2026d() {
        return this.f4187b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0642q7
    /* JADX INFO: renamed from: e */
    public final Object mo2027e() {
        return this.f4188c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0642q7
    /* JADX INFO: renamed from: f */
    public final AbstractC0046b8 mo2028f(long j) {
        if (!m3207g(j)) {
            return this.f4186a.mo376e(j, this.f4190e, this.f4191f, this.f4192g);
        }
        AbstractC0046b8 abstractC0046b8 = this.f4194i;
        if (abstractC0046b8 != null) {
            return abstractC0046b8;
        }
        AbstractC0046b8 abstractC0046b8Mo2488i = this.f4186a.mo2488i(this.f4190e, this.f4191f, this.f4192g);
        this.f4194i = abstractC0046b8Mo2488i;
        return abstractC0046b8Mo2488i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "TargetBasedAnimation: " + this.f4189d + " -> " + this.f4188c + ",initial velocity: " + this.f4192g + ", duration: " + (mo2025c() / 1000000) + " ms,animationSpec: " + this.f4186a;
    }
}
