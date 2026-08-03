package fun.box001.internal.dexformat.instructions;

import fun.box001.internal.dexformat.output.C0202d;
import fun.box001.internal.dexformat.writer.code.C0173c;

/* JADX INFO: renamed from: g.l */
/* JADX INFO: loaded from: classes.dex */
public final class C0101l extends AbstractC0080C {

    /* JADX INFO: renamed from: e */
    private final C0173c f400e;

    /* JADX INFO: renamed from: f */
    private byte[] f401f;

    public C0101l(C0173c r3) {
        super(1, -1);
        this.f400e = r3;
        this.f401f = null;
    }

    @Override // fun.box001.internal.dexformat.instructions.AbstractC0108s
    /* JADX INFO: renamed from: a */
    public final void mo242a(C0100k r2) {
        C0089L.m257a(r2, this.f400e);
    }

    @Override // fun.box001.internal.dexformat.instructions.AbstractC0108s
    /* JADX INFO: renamed from: b */
    public final EnumC0109t mo243b() {
        return EnumC0109t.f420p;
    }

    @Override // fun.box001.internal.dexformat.instructions.AbstractC0080C
    /* JADX INFO: renamed from: e */
    protected final int mo234e(AbstractC0080C r2) {
        return this.f400e.m425b(((C0101l) r2).f400e);
    }

    public final int hashCode() {
        return this.f400e.hashCode();
    }

    @Override // fun.box001.internal.dexformat.instructions.AbstractC0080C
    /* JADX INFO: renamed from: j */
    protected final void mo239j(AbstractC0082E r3, int r4) {
        C0202d r42 = new C0202d();
        new C0089L(r3.m246d(), r42).m259c(this.f400e, false);
        byte[] r32 = r42.m493m();
        this.f401f = r32;
        m240k(r32.length);
    }

    @Override // fun.box001.internal.dexformat.instructions.AbstractC0080C
    /* JADX INFO: renamed from: l */
    protected final void mo241l(C0100k r3, C0202d r4) {
        if (r4.m486d() == false) goto L5;
        r4.m484b(0, m237h() + " encoded array");
        new C0089L(r3, r4).m259c(this.f400e, true);
        return;
    L5:
        r4.m495o(this.f401f);
    }
}
