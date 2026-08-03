package fun.box001.internal.dexformat;

import java.util.HashSet;

/* JADX INFO: renamed from: e.i */
/* JADX INFO: loaded from: classes.dex */
public final class C0032i {

    /* JADX INFO: renamed from: a */
    private final int f96a;

    /* JADX INFO: renamed from: b */
    private C0047x f97b;

    /* JADX INFO: renamed from: c */
    private C0024a f98c;

    /* JADX INFO: renamed from: d */
    private C0028e f99d;

    /* JADX INFO: renamed from: e */
    private C0049z f100e;

    /* JADX INFO: renamed from: f */
    private C0043t f101f;

    /* JADX INFO: renamed from: g */
    private C0034k f102g;

    public C0032i(int i2, C0047x c0047x, C0024a c0024a) {
        if (c0047x == null) {
            throw new NullPointerException("unprocessedInsns == null");
        }
        this.f96a = i2;
        this.f97b = c0047x;
        this.f98c = c0024a;
        this.f99d = null;
        this.f100e = null;
        this.f101f = null;
        this.f102g = null;
    }

    /* JADX INFO: renamed from: b */
    private void m120b() {
        if (this.f102g != null) {
            return;
        }
        C0034k c0034kM206f = this.f97b.m206f();
        this.f102g = c0034kM206f;
        this.f100e = C0049z.m215F(c0034kM206f, this.f96a);
        C0034k c0034k = this.f102g;
        C0043t c0043t = C0043t.f268c;
        int iM504B = c0034k.m504B();
        C0042s c0042s = new C0042s(iM504B);
        for (int i2 = 0; i2 < iM504B; i2++) {
            AbstractC0033j abstractC0033jL = c0034k.m509l(i2);
            if (abstractC0033jL instanceof AbstractC0044u) {
                c0042s.m190g(abstractC0033jL.m135h(), ((AbstractC0044u) abstractC0033jL).m193y());
            } else if (abstractC0033jL instanceof AbstractC0045v) {
                c0042s.m191h(abstractC0033jL.m135h(), ((AbstractC0045v) abstractC0033jL).m194y());
            }
        }
        this.f101f = c0042s.m189f();
        this.f99d = this.f98c.m94a();
        this.f97b = null;
        this.f98c = null;
    }

    /* JADX INFO: renamed from: a */
    public final void m121a(InterfaceC0031h interfaceC0031h) {
        this.f97b.m205c(interfaceC0031h);
    }

    /* JADX INFO: renamed from: c */
    public final HashSet m122c() {
        return this.f98c.m95b();
    }

    /* JADX INFO: renamed from: d */
    public final C0028e m123d() {
        m120b();
        return this.f99d;
    }

    /* JADX INFO: renamed from: e */
    public final HashSet m124e() {
        return this.f97b.m208h();
    }

    /* JADX INFO: renamed from: f */
    public final C0034k m125f() {
        m120b();
        return this.f102g;
    }

    /* JADX INFO: renamed from: g */
    public final C0043t m126g() {
        m120b();
        return this.f101f;
    }

    /* JADX INFO: renamed from: h */
    public final C0049z m127h() {
        m120b();
        return this.f100e;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m128i() {
        return this.f98c.m100g();
    }

    /* JADX INFO: renamed from: j */
    public final boolean m129j() {
        return this.f97b.m209i();
    }

    /* JADX INFO: renamed from: k */
    public final boolean m130k() {
        return this.f96a != 1 && this.f97b.m210j();
    }
}
