package fun.box001.internal.dexformat.instructions;

import fun.box001.internal.dexformat.writer.code.AbstractC0174d;

/* JADX INFO: renamed from: g.y */
/* JADX INFO: loaded from: classes.dex */
public final class C0114y extends AbstractC0111v {
    public C0114y(AbstractC0174d abstractC0174d) {
        super(abstractC0174d);
    }

    @Override // fun.box001.internal.dexformat.instructions.AbstractC0111v, fun.box001.internal.dexformat.instructions.AbstractC0106q, fun.box001.internal.dexformat.instructions.AbstractC0108s
    /* JADX INFO: renamed from: a */
    public final void mo242a(C0100k c0100k) {
        super.mo242a(c0100k);
        c0100k.m304n().m334w(((AbstractC0174d) m324j()).m431j());
    }

    @Override // fun.box001.internal.dexformat.instructions.AbstractC0108s
    /* JADX INFO: renamed from: b */
    public final EnumC0109t mo243b() {
        return EnumC0109t.f412h;
    }

    @Override // fun.box001.internal.dexformat.instructions.AbstractC0111v
    /* JADX INFO: renamed from: k */
    protected final int mo325k(C0100k c0100k) {
        return c0100k.m304n().m330s(((AbstractC0174d) m324j()).m431j());
    }

    @Override // fun.box001.internal.dexformat.instructions.AbstractC0111v
    /* JADX INFO: renamed from: l */
    protected final String mo326l() {
        return "proto_idx";
    }
}
