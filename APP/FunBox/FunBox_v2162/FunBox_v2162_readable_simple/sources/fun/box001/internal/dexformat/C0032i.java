package fun.box001.internal.dexformat;

import fun.box001.internal.dexformat.writer.C0162m;
import fun.box001.internal.dexformat.writer.C0165p;
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

    public C0032i(int r1, C0047x r2, C0024a r3) {
        if (r2 == null) goto L7;
        this.f96a = r1;
        this.f97b = r2;
        this.f98c = r3;
        this.f99d = null;
        this.f100e = null;
        this.f101f = null;
        this.f102g = null;
        return;
    L7:
        throw new NullPointerException("unprocessedInsns == null");
    }

    /* JADX INFO: renamed from: b */
    private void m120b() {
        if (this.f102g == null) goto L5;
        return;
    L5:
        C0034k r0 = this.f97b.m206f();
        this.f102g = r0;
        this.f100e = C0049z.m215F(r0, this.f96a);
        C0034k r02 = this.f102g;
        C0043t r1 = C0043t.f268c;
        int r12 = r02.m504B();
        C0042s r2 = new C0042s(r12);
        int r3 = 0;
    L6:
        if (r3 >= r12) goto L14;
        AbstractC0033j r4 = r02.m509l(r3);
        if ((r4 instanceof AbstractC0044u) == false) goto L11;
        C0165p r5 = ((AbstractC0044u) r4).m193y();
        r2.m190g(r4.m135h(), r5);
    L13:
        r3 = r3 + 1;
        goto L6
    L11:
        if ((r4 instanceof AbstractC0045v) == false) goto L13;
        C0162m r52 = ((AbstractC0045v) r4).m194y();
        r2.m191h(r4.m135h(), r52);
        goto L13
    L14:
        this.f101f = r2.m189f();
        this.f99d = this.f98c.m94a();
        this.f97b = null;
        this.f98c = null;
    }

    /* JADX INFO: renamed from: a */
    public final void m121a(InterfaceC0031h r2) {
        this.f97b.m205c(r2);
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
        if (this.f96a != 1) goto L5;
    L7:
        return false;
    L5:
        if (this.f97b.m210j() == false) goto L7;
        return true;
    }
}
