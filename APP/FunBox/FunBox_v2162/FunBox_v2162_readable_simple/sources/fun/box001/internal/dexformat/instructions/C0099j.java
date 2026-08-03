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

    public C0099j(C0032i r3, boolean r4, C0187q r5) {
        super(1, -1);
        if (r3 == null) goto L7;
        this.f378e = r3;
        this.f380g = r4;
        this.f381h = r5;
        return;
    L7:
        throw new NullPointerException("code == null");
    }

    /* JADX INFO: renamed from: n */
    private byte[] m289n(C0100k r10, String r11, C0202d r12, boolean r13) {
        C0032i r0 = this.f378e;
        C0049z r2 = r0.m127h();
        C0043t r3 = r0.m126g();
        C0034k r02 = r0.m125f();
        C0098i r03 = new C0098i(r2, r3, r10, r02.m147F(), r02.m149H(), this.f380g, this.f381h);
        if (r12 != null) goto L6;
        return r03.m287c();
    L6:
        return r03.m288e(r11, r12, r13);
    }

    @Override // fun.box001.internal.dexformat.instructions.AbstractC0108s
    /* JADX INFO: renamed from: a */
    public final void mo242a(C0100k r1) {
    }

    @Override // fun.box001.internal.dexformat.instructions.AbstractC0108s
    /* JADX INFO: renamed from: b */
    public final EnumC0109t mo243b() {
        return EnumC0109t.f419o;
    }

    @Override // fun.box001.internal.dexformat.instructions.AbstractC0080C
    /* JADX INFO: renamed from: j */
    protected final void mo239j(AbstractC0082E r2, int r3) {
        byte[] r22 = m289n(r2.m246d(), null, null, false);     // Catch: RuntimeException -> L4
        this.f379f = r22;     // Catch: RuntimeException -> L4
        m240k(r22.length);     // Catch: RuntimeException -> L4
        return;
    L4:
        e = move-exception;
        throw DexGenerationException.m22b("...while placing debug info for " + this.f381h.mo107a(), e);
    }

    @Override // fun.box001.internal.dexformat.instructions.AbstractC0080C
    /* JADX INFO: renamed from: l */
    protected final void mo241l(C0100k r3, C0202d r4) {
        if (r4.m486d() == false) goto L5;
        r4.m485c(m237h() + " debug info");
        m289n(r3, null, r4, true);
    L5:
        r4.m495o(this.f379f);
    }

    /* JADX INFO: renamed from: m */
    public final void m290m(C0100k r3, C0202d r4) {
        m289n(r3, "    ", r4, false);
    }
}
