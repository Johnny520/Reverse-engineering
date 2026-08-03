package fun.box001.internal.dexformat.instructions;

import fun.box001.internal.dexformat.C0032i;
import fun.box001.internal.dexformat.C0034k;
import fun.box001.internal.dexformat.C0043t;
import fun.box001.internal.dexformat.C0049z;
import fun.box001.internal.dexformat.output.C0202d;
import fun.box001.internal.dexformat.writer.code.C0187q;
import fun.box001.internal.error.DexGenerationException;

/* JADX INFO: renamed from: g.j */
/* JADX INFO: loaded from: classes.dex */
public final class C0099j extends AbstractC0080C {

    /* JADX INFO: renamed from: e */
    private final C0032i f378e;

    /* JADX INFO: renamed from: f */
    private byte[] f379f;

    /* JADX INFO: renamed from: g */
    private final boolean f380g;

    /* JADX INFO: renamed from: h */
    private final C0187q f381h;

    public C0099j(C0032i c0032i, boolean z, C0187q c0187q) {
        super(1, -1);
        if (c0032i == null) {
            throw new NullPointerException("code == null");
        }
        this.f378e = c0032i;
        this.f380g = z;
        this.f381h = c0187q;
    }

    /* JADX INFO: renamed from: n */
    private byte[] m289n(C0100k c0100k, String str, C0202d c0202d, boolean z) {
        C0032i c0032i = this.f378e;
        C0049z c0049zM127h = c0032i.m127h();
        C0043t c0043tM126g = c0032i.m126g();
        C0034k c0034kM125f = c0032i.m125f();
        C0098i c0098i = new C0098i(c0049zM127h, c0043tM126g, c0100k, c0034kM125f.m147F(), c0034kM125f.m149H(), this.f380g, this.f381h);
        return c0202d == null ? c0098i.m287c() : c0098i.m288e(str, c0202d, z);
    }

    @Override // fun.box001.internal.dexformat.instructions.AbstractC0108s
    /* JADX INFO: renamed from: a */
    public final void mo242a(C0100k c0100k) {
    }

    @Override // fun.box001.internal.dexformat.instructions.AbstractC0108s
    /* JADX INFO: renamed from: b */
    public final EnumC0109t mo243b() {
        return EnumC0109t.f419o;
    }

    @Override // fun.box001.internal.dexformat.instructions.AbstractC0080C
    /* JADX INFO: renamed from: j */
    protected final void mo239j(AbstractC0082E abstractC0082E, int i2) {
        try {
            byte[] bArrM289n = m289n(abstractC0082E.m246d(), null, null, false);
            this.f379f = bArrM289n;
            m240k(bArrM289n.length);
        } catch (RuntimeException e2) {
            throw DexGenerationException.m22b("...while placing debug info for " + this.f381h.mo107a(), e2);
        }
    }

    @Override // fun.box001.internal.dexformat.instructions.AbstractC0080C
    /* JADX INFO: renamed from: l */
    protected final void mo241l(C0100k c0100k, C0202d c0202d) {
        if (c0202d.m486d()) {
            c0202d.m485c(m237h() + " debug info");
            m289n(c0100k, null, c0202d, true);
        }
        c0202d.m495o(this.f379f);
    }

    /* JADX INFO: renamed from: m */
    public final void m290m(C0100k c0100k, C0202d c0202d) {
        m289n(c0100k, "    ", c0202d, false);
    }
}
