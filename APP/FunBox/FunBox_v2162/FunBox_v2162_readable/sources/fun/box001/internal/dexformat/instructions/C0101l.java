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

    public C0101l(C0173c c0173c) {
        super(1, -1);
        this.f400e = c0173c;
        this.f401f = null;
    }

    @Override // fun.box001.internal.dexformat.instructions.AbstractC0108s
    /* JADX INFO: renamed from: a */
    public final void mo242a(C0100k c0100k) {
        C0089L.m257a(c0100k, this.f400e);
    }

    @Override // fun.box001.internal.dexformat.instructions.AbstractC0108s
    /* JADX INFO: renamed from: b */
    public final EnumC0109t mo243b() {
        return EnumC0109t.f420p;
    }

    @Override // fun.box001.internal.dexformat.instructions.AbstractC0080C
    /* JADX INFO: renamed from: e */
    protected final int mo234e(AbstractC0080C abstractC0080C) {
        return this.f400e.compareTo(((C0101l) abstractC0080C).f400e);
    }

    public final int hashCode() {
        return this.f400e.hashCode();
    }

    @Override // fun.box001.internal.dexformat.instructions.AbstractC0080C
    /* JADX INFO: renamed from: j */
    protected final void mo239j(AbstractC0082E abstractC0082E, int i2) {
        C0202d c0202d = new C0202d();
        new C0089L(abstractC0082E.m246d(), c0202d).m259c(this.f400e, false);
        byte[] bArrM493m = c0202d.m493m();
        this.f401f = bArrM493m;
        m240k(bArrM493m.length);
    }

    @Override // fun.box001.internal.dexformat.instructions.AbstractC0080C
    /* JADX INFO: renamed from: l */
    protected final void mo241l(C0100k c0100k, C0202d c0202d) {
        if (!c0202d.m486d()) {
            c0202d.m495o(this.f401f);
            return;
        }
        c0202d.m484b(0, m237h() + " encoded array");
        new C0089L(c0100k, c0202d).m259c(this.f400e, true);
    }
}
