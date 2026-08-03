package fun.box001.internal.dexformat.instructions;

import fun.box001.internal.dexbridge.RuntimeDexGenerator;
import fun.box001.internal.dexformat.output.C0202d;
import fun.box001.internal.dexformat.writer.code.C0190t;

/* JADX INFO: renamed from: g.H */
/* JADX INFO: loaded from: classes.dex */
public final class C0085H extends AbstractC0106q {
    @Override // fun.box001.internal.dexformat.instructions.AbstractC0106q, fun.box001.internal.dexformat.instructions.AbstractC0108s
    /* JADX INFO: renamed from: a */
    public final void mo242a(C0100k r2) {
        r2.m306p().m332u(m316i().m452h());
    }

    @Override // fun.box001.internal.dexformat.instructions.AbstractC0108s
    /* JADX INFO: renamed from: b */
    public final EnumC0109t mo243b() {
        return EnumC0109t.f410f;
    }

    @Override // fun.box001.internal.dexformat.instructions.AbstractC0108s
    /* JADX INFO: renamed from: c */
    public final int mo232c() {
        return 4;
    }

    @Override // fun.box001.internal.dexformat.instructions.AbstractC0108s
    /* JADX INFO: renamed from: d */
    public final void mo233d(C0100k r4, C0202d r5) {
        C0190t r0 = m316i().m452h();
        int r42 = r4.m306p().m328q(r0);
        if (r5.m486d() == false) goto L5;
        r5.m484b(0, m319g() + ' ' + r0.mo107a());
        r5.m484b(4, "  descriptor_idx: ".concat(RuntimeDexGenerator.m13s(r42)));
    L5:
        r5.m497q(r42);
    }
}
