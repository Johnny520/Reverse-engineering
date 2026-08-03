package fun.box001.internal.dexformat.instructions;

import fun.box001.internal.dexformat.writer.code.AbstractC0174d;

/* JADX INFO: renamed from: g.y */
/* JADX INFO: loaded from: classes.dex */
public final class C0114y extends AbstractC0111v {
    public C0114y(AbstractC0174d r1) {
        super(r1);
    }

    @Override // fun.box001.internal.dexformat.instructions.AbstractC0111v, fun.box001.internal.dexformat.instructions.AbstractC0106q, fun.box001.internal.dexformat.instructions.AbstractC0108s
    /* JADX INFO: renamed from: a */
    public final void mo242a(C0100k r2) {
        super.mo242a(r2);
        r2.m304n().m334w(((AbstractC0174d) m324j()).m431j());
    }

    @Override // fun.box001.internal.dexformat.instructions.AbstractC0108s
    /* JADX INFO: renamed from: b */
    public final EnumC0109t mo243b() {
        return EnumC0109t.f412h;
    }

    @Override // fun.box001.internal.dexformat.instructions.AbstractC0111v
    /* JADX INFO: renamed from: k */
    protected final int mo325k(C0100k r2) {
        return r2.m304n().m330s(((AbstractC0174d) m324j()).m431j());
    }

    @Override // fun.box001.internal.dexformat.instructions.AbstractC0111v
    /* JADX INFO: renamed from: l */
    protected final String mo326l() {
        return "proto_idx";
    }
}
