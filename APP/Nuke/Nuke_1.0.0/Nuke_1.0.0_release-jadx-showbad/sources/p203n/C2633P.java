package p203n;

import p112W2.InterfaceC1601c;

/* JADX INFO: renamed from: n.P */
/* JADX INFO: loaded from: classes.dex */
public final class C2633P implements InterfaceC2653f {

    /* JADX INFO: renamed from: a */
    public final InterfaceC2656g0 f8366a;

    /* JADX INFO: renamed from: b */
    public final C2652e0 f8367b;

    /* JADX INFO: renamed from: c */
    public final Object f8368c;

    /* JADX INFO: renamed from: d */
    public final Object f8369d;

    /* JADX INFO: renamed from: e */
    public final AbstractC2670o f8370e;

    /* JADX INFO: renamed from: f */
    public final AbstractC2670o f8371f;

    /* JADX INFO: renamed from: g */
    public final AbstractC2670o f8372g;

    /* JADX INFO: renamed from: h */
    public long f8373h;

    /* JADX INFO: renamed from: i */
    public AbstractC2670o f8374i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2633P(InterfaceC2659i interfaceC2659i, C2652e0 c2652e0, Object obj, Object obj2, AbstractC2670o abstractC2670o) {
        this.f8366a = interfaceC2659i.mo4572a(c2652e0);
        this.f8367b = c2652e0;
        this.f8368c = obj2;
        this.f8369d = obj;
        this.f8370e = (AbstractC2670o) c2652e0.f8459a.mo1h(obj);
        InterfaceC1601c interfaceC1601c = c2652e0.f8459a;
        this.f8371f = (AbstractC2670o) interfaceC1601c.mo1h(obj2);
        this.f8372g = abstractC2670o != null ? AbstractC2649d.m4612e(abstractC2670o) : ((AbstractC2670o) interfaceC1601c.mo1h(obj)).mo4626c();
        this.f8373h = -1L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p203n.InterfaceC2653f
    /* JADX INFO: renamed from: a */
    public final boolean mo4577a() {
        return this.f8366a.mo3116a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p203n.InterfaceC2653f
    /* JADX INFO: renamed from: b */
    public final Object mo4578b(long j5) {
        if (m4623g(j5)) {
            return this.f8368c;
        }
        AbstractC2670o abstractC2670oMo259r = this.f8366a.mo259r(j5, this.f8370e, this.f8371f, this.f8372g);
        int iMo4625b = abstractC2670oMo259r.mo4625b();
        for (int i5 = 0; i5 < iMo4625b; i5++) {
            if (Float.isNaN(abstractC2670oMo259r.mo4624a(i5))) {
                AbstractC2624G.m4575b("AnimationVector cannot contain a NaN. " + abstractC2670oMo259r + ". Animation: " + this + ", playTimeNanos: " + j5);
            }
        }
        return this.f8367b.f8460b.mo1h(abstractC2670oMo259r);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p203n.InterfaceC2653f
    /* JADX INFO: renamed from: c */
    public final long mo4579c() {
        if (this.f8373h < 0) {
            this.f8373h = this.f8366a.mo247b(this.f8370e, this.f8371f, this.f8372g);
        }
        return this.f8373h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p203n.InterfaceC2653f
    /* JADX INFO: renamed from: d */
    public final C2652e0 mo4580d() {
        return this.f8367b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p203n.InterfaceC2653f
    /* JADX INFO: renamed from: e */
    public final Object mo4581e() {
        return this.f8368c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p203n.InterfaceC2653f
    /* JADX INFO: renamed from: f */
    public final AbstractC2670o mo4582f(long j5) {
        if (!m4623g(j5)) {
            return this.f8366a.mo258o(j5, this.f8370e, this.f8371f, this.f8372g);
        }
        AbstractC2670o abstractC2670o = this.f8374i;
        if (abstractC2670o != null) {
            return abstractC2670o;
        }
        AbstractC2670o abstractC2670oMo256m = this.f8366a.mo256m(this.f8370e, this.f8371f, this.f8372g);
        this.f8374i = abstractC2670oMo256m;
        return abstractC2670oMo256m;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "TargetBasedAnimation: " + this.f8369d + " -> " + this.f8368c + ",initial velocity: " + this.f8372g + ", duration: " + (mo4579c() / 1000000) + " ms,animationSpec: " + this.f8366a;
    }
}
