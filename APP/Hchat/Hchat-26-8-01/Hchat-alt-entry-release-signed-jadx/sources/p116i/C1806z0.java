package p116i;

import p085fg.InterfaceC1231l;

/* JADX INFO: renamed from: i.z0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1806z0 implements InterfaceC1751g {

    /* JADX INFO: renamed from: a */
    public final InterfaceC1774n1 f6020a;

    /* JADX INFO: renamed from: b */
    public final C1771m1 f6021b;

    /* JADX INFO: renamed from: c */
    public final Object f6022c;

    /* JADX INFO: renamed from: d */
    public final Object f6023d;

    /* JADX INFO: renamed from: e */
    public final AbstractC1781q f6024e;

    /* JADX INFO: renamed from: f */
    public final AbstractC1781q f6025f;

    /* JADX INFO: renamed from: g */
    public final AbstractC1781q f6026g;

    /* JADX INFO: renamed from: h */
    public long f6027h;

    /* JADX INFO: renamed from: i */
    public AbstractC1781q f6028i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1806z0(InterfaceC1763k interfaceC1763k, C1771m1 c1771m1, Object obj, Object obj2, AbstractC1781q abstractC1781q) {
        this.f6020a = interfaceC1763k.mo4363a(c1771m1);
        this.f6021b = c1771m1;
        this.f6022c = obj2;
        this.f6023d = obj;
        this.f6024e = (AbstractC1781q) c1771m1.f5912a.invoke(obj);
        InterfaceC1231l interfaceC1231l = c1771m1.f5912a;
        this.f6025f = (AbstractC1781q) interfaceC1231l.invoke(obj2);
        this.f6026g = abstractC1781q != null ? AbstractC1742d.m4373i(abstractC1781q) : ((AbstractC1781q) interfaceC1231l.invoke(obj)).mo4425c();
        this.f6027h = -1L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p116i.InterfaceC1751g
    /* JADX INFO: renamed from: a */
    public final boolean mo4394a() {
        return this.f6020a.mo594a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p116i.InterfaceC1751g
    /* JADX INFO: renamed from: b */
    public final long mo4395b() {
        if (this.f6027h < 0) {
            this.f6027h = this.f6020a.mo595b(this.f6024e, this.f6025f, this.f6026g);
        }
        return this.f6027h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p116i.InterfaceC1751g
    /* JADX INFO: renamed from: c */
    public final C1771m1 mo4396c() {
        return this.f6021b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p116i.InterfaceC1751g
    /* JADX INFO: renamed from: d */
    public final AbstractC1781q mo4397d(long j3) {
        if (!m4398e(j3)) {
            return this.f6020a.mo607n(j3, this.f6024e, this.f6025f, this.f6026g);
        }
        AbstractC1781q abstractC1781q = this.f6028i;
        if (abstractC1781q != null) {
            return abstractC1781q;
        }
        AbstractC1781q abstractC1781qMo602g = this.f6020a.mo602g(this.f6024e, this.f6025f, this.f6026g);
        this.f6028i = abstractC1781qMo602g;
        return abstractC1781qMo602g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p116i.InterfaceC1751g
    /* JADX INFO: renamed from: f */
    public final Object mo4399f(long j3) {
        if (m4398e(j3)) {
            return this.f6022c;
        }
        AbstractC1781q abstractC1781qMo612w = this.f6020a.mo612w(j3, this.f6024e, this.f6025f, this.f6026g);
        int iMo4424b = abstractC1781qMo612w.mo4424b();
        for (int i9 = 0; i9 < iMo4424b; i9++) {
            if (Float.isNaN(abstractC1781qMo612w.mo4423a(i9))) {
                AbstractC1776o0.m4430b("AnimationVector cannot contain a NaN. " + abstractC1781qMo612w + ". Animation: " + this + ", playTimeNanos: " + j3);
            }
        }
        return this.f6021b.f5913b.invoke(abstractC1781qMo612w);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p116i.InterfaceC1751g
    /* JADX INFO: renamed from: g */
    public final Object mo4400g() {
        return this.f6022c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "TargetBasedAnimation: " + this.f6023d + " -> " + this.f6022c + ",initial velocity: " + this.f6026g + ", duration: " + (mo4395b() / 1000000) + " ms,animationSpec: " + this.f6020a;
    }
}
