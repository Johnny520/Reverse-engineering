package fun.box001.internal.dexformat.instructions;

import fun.box001.internal.dexbridge.RuntimeDexGenerator;
import fun.box001.internal.dexformat.output.C0202d;
import fun.box001.internal.dexformat.writer.code.AbstractC0186p;
import fun.box001.internal.dexformat.writer.code.C0188r;

/* JADX INFO: renamed from: g.v */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0111v extends AbstractC0106q {

    /* JADX INFO: renamed from: c */
    private final AbstractC0186p f430c;

    public AbstractC0111v(AbstractC0186p r2) {
        super(r2.m440g());
        this.f430c = r2;
    }

    @Override // fun.box001.internal.dexformat.instructions.AbstractC0106q, fun.box001.internal.dexformat.instructions.AbstractC0108s
    /* JADX INFO: renamed from: a */
    public void mo242a(C0100k r2) {
        super.mo242a(r2);
        r2.m306p().m332u(this.f430c.m441h().m443h());
    }

    @Override // fun.box001.internal.dexformat.instructions.AbstractC0108s
    /* JADX INFO: renamed from: c */
    public final int mo232c() {
        return 8;
    }

    @Override // fun.box001.internal.dexformat.instructions.AbstractC0108s
    /* JADX INFO: renamed from: d */
    public final void mo233d(C0100k r6, C0202d r7) {
        C0113x r0 = r6.m307q();
        C0113x r1 = r6.m306p();
        AbstractC0186p r2 = this.f430c;
        C0188r r3 = r2.m441h();
        int r02 = r0.m329r(m316i());
        int r12 = r1.m328q(r3.m443h());
        int r62 = mo325k(r6);
        if (r7.m486d() == false) goto L5;
        r7.m484b(0, m319g() + ' ' + r2.mo107a());
        r7.m484b(2, "  class_idx: ".concat(RuntimeDexGenerator.m11q(r02)));
        r7.m484b(2, String.format("  %-10s %s", new Object[]{mo326l() + ':', RuntimeDexGenerator.m11q(r62)}));
        r7.m484b(4, "  name_idx:  ".concat(RuntimeDexGenerator.m13s(r12)));
    L5:
        r7.m498r(r02);
        r7.m498r(r62);
        r7.m497q(r12);
    }

    /* JADX INFO: renamed from: j */
    public final AbstractC0186p m324j() {
        return this.f430c;
    }

    /* JADX INFO: renamed from: k */
    protected abstract int mo325k(C0100k r1);

    /* JADX INFO: renamed from: l */
    protected abstract String mo326l();
}
