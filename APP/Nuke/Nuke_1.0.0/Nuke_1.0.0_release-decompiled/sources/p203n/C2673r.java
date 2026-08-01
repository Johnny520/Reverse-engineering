package p203n;

import com.bumptech.glide.AbstractC1926h;
import p007B0.C0173F;
import p112W2.InterfaceC1601c;
import p117X2.AbstractC1665j;
import p121Y1.C1753n;
import p197m.AbstractC2533S;
import p197m.AbstractC2542b;
import p197m.C2531P;
import p197m.C2532Q;

/* JADX INFO: renamed from: n.r */
/* JADX INFO: loaded from: classes.dex */
public final class C2673r implements InterfaceC2653f {

    /* JADX INFO: renamed from: a */
    public final C0173F f8533a;

    /* JADX INFO: renamed from: b */
    public final C2652e0 f8534b;

    /* JADX INFO: renamed from: c */
    public final Object f8535c;

    /* JADX INFO: renamed from: d */
    public final AbstractC2670o f8536d;

    /* JADX INFO: renamed from: e */
    public final AbstractC2670o f8537e;

    /* JADX INFO: renamed from: f */
    public final AbstractC2670o f8538f;

    /* JADX INFO: renamed from: g */
    public final Object f8539g;

    /* JADX INFO: renamed from: h */
    public final long f8540h;

    public C2673r(C2674s c2674s, C2652e0 c2652e0, Object obj, AbstractC2670o abstractC2670o) {
        C0173F c0173f = new C0173F(9, c2674s.f8541a);
        this.f8533a = c0173f;
        this.f8534b = c2652e0;
        this.f8535c = obj;
        AbstractC2670o abstractC2670o2 = (AbstractC2670o) c2652e0.f8459a.mo1h(obj);
        this.f8536d = abstractC2670o2;
        this.f8537e = AbstractC2649d.m4612e(abstractC2670o);
        InterfaceC1601c interfaceC1601c = c2652e0.f8460b;
        if (((AbstractC2670o) c0173f.f615h) == null) {
            c0173f.f615h = abstractC2670o2.mo4626c();
        }
        AbstractC2670o abstractC2670o3 = (AbstractC2670o) c0173f.f615h;
        if (abstractC2670o3 == null) {
            AbstractC1665j.m2991k("targetVector");
            throw null;
        }
        int iMo4625b = abstractC2670o3.mo4625b();
        int i5 = 0;
        while (i5 < iMo4625b) {
            AbstractC2670o abstractC2670o4 = (AbstractC2670o) c0173f.f615h;
            if (abstractC2670o4 == null) {
                AbstractC1665j.m2991k("targetVector");
                throw null;
            }
            C1753n c1753n = (C1753n) c0173f.f612e;
            float fMo4624a = abstractC2670o2.mo4624a(i5);
            float fMo4624a2 = abstractC2670o.mo4624a(i5);
            C2532Q c2532q = (C2532Q) c1753n.f6028e;
            double dM4471b = c2532q.m4471b(fMo4624a2);
            double d5 = AbstractC2533S.f8099a;
            int i6 = i5;
            abstractC2670o4.mo4628e((Math.signum(fMo4624a2) * ((float) (Math.exp((d5 / (d5 - 1.0d)) * dM4471b) * ((double) (c2532q.f8097a * c2532q.f8098b))))) + fMo4624a, i6);
            i5 = i6 + 1;
        }
        AbstractC2670o abstractC2670o5 = (AbstractC2670o) c0173f.f615h;
        if (abstractC2670o5 == null) {
            AbstractC1665j.m2991k("targetVector");
            throw null;
        }
        this.f8539g = interfaceC1601c.mo1h(abstractC2670o5);
        C0173F c0173f2 = this.f8533a;
        AbstractC2670o abstractC2670o6 = this.f8536d;
        if (((AbstractC2670o) c0173f2.f614g) == null) {
            c0173f2.f614g = abstractC2670o6.mo4626c();
        }
        AbstractC2670o abstractC2670o7 = (AbstractC2670o) c0173f2.f614g;
        if (abstractC2670o7 == null) {
            AbstractC1665j.m2991k("velocityVector");
            throw null;
        }
        int iMo4625b2 = abstractC2670o7.mo4625b();
        long jMax = 0;
        for (int i7 = 0; i7 < iMo4625b2; i7++) {
            C1753n c1753n2 = (C1753n) c0173f2.f612e;
            abstractC2670o6.getClass();
            jMax = Math.max(jMax, ((long) (Math.exp(((C2532Q) c1753n2.f6028e).m4471b(abstractC2670o.mo4624a(i7)) / (((double) AbstractC2533S.f8099a) - 1.0d)) * 1000.0d)) * 1000000);
        }
        this.f8540h = jMax;
        AbstractC2670o abstractC2670oM4612e = AbstractC2649d.m4612e(this.f8533a.m254i(jMax, this.f8536d, abstractC2670o));
        this.f8538f = abstractC2670oM4612e;
        int iMo4625b3 = abstractC2670oM4612e.mo4625b();
        for (int i8 = 0; i8 < iMo4625b3; i8++) {
            AbstractC2670o abstractC2670o8 = this.f8538f;
            float fMo4624a3 = abstractC2670o8.mo4624a(i8);
            this.f8533a.getClass();
            this.f8533a.getClass();
            abstractC2670o8.mo4628e(AbstractC1926h.m3567j(fMo4624a3, -0.0f, 0.0f), i8);
        }
    }

    @Override // p203n.InterfaceC2653f
    /* JADX INFO: renamed from: a */
    public final boolean mo4577a() {
        return false;
    }

    @Override // p203n.InterfaceC2653f
    /* JADX INFO: renamed from: b */
    public final Object mo4578b(long j5) {
        if (m4623g(j5)) {
            return this.f8539g;
        }
        InterfaceC1601c interfaceC1601c = this.f8534b.f8460b;
        C0173F c0173f = this.f8533a;
        AbstractC2670o abstractC2670o = (AbstractC2670o) c0173f.f613f;
        AbstractC2670o abstractC2670o2 = this.f8536d;
        if (abstractC2670o == null) {
            c0173f.f613f = abstractC2670o2.mo4626c();
        }
        AbstractC2670o abstractC2670o3 = (AbstractC2670o) c0173f.f613f;
        if (abstractC2670o3 == null) {
            AbstractC1665j.m2991k("valueVector");
            throw null;
        }
        int iMo4625b = abstractC2670o3.mo4625b();
        for (int i5 = 0; i5 < iMo4625b; i5++) {
            AbstractC2670o abstractC2670o4 = (AbstractC2670o) c0173f.f613f;
            if (abstractC2670o4 == null) {
                AbstractC1665j.m2991k("valueVector");
                throw null;
            }
            C1753n c1753n = (C1753n) c0173f.f612e;
            float fMo4624a = abstractC2670o2.mo4624a(i5);
            long j6 = j5 / 1000000;
            C2531P c2531pM4470a = ((C2532Q) c1753n.f6028e).m4470a(this.f8537e.mo4624a(i5));
            long j7 = c2531pM4470a.f8096c;
            abstractC2670o4.mo4628e((Math.signum(c2531pM4470a.f8094a) * c2531pM4470a.f8095b * AbstractC2542b.m4473a(j7 > 0 ? j6 / j7 : 1.0f).f8112a) + fMo4624a, i5);
        }
        AbstractC2670o abstractC2670o5 = (AbstractC2670o) c0173f.f613f;
        if (abstractC2670o5 != null) {
            return interfaceC1601c.mo1h(abstractC2670o5);
        }
        AbstractC1665j.m2991k("valueVector");
        throw null;
    }

    @Override // p203n.InterfaceC2653f
    /* JADX INFO: renamed from: c */
    public final long mo4579c() {
        return this.f8540h;
    }

    @Override // p203n.InterfaceC2653f
    /* JADX INFO: renamed from: d */
    public final C2652e0 mo4580d() {
        return this.f8534b;
    }

    @Override // p203n.InterfaceC2653f
    /* JADX INFO: renamed from: e */
    public final Object mo4581e() {
        return this.f8539g;
    }

    @Override // p203n.InterfaceC2653f
    /* JADX INFO: renamed from: f */
    public final AbstractC2670o mo4582f(long j5) {
        if (m4623g(j5)) {
            return this.f8538f;
        }
        return this.f8533a.m254i(j5, this.f8536d, this.f8537e);
    }
}
