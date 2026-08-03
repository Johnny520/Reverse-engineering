package fun.box001.internal.dexformat.instructions;

import fun.box001.internal.dexbridge.RuntimeDexGenerator;
import fun.box001.internal.dexformat.output.C0200b;
import fun.box001.internal.dexformat.output.C0202d;
import fun.box001.internal.dexformat.writer.code.C0190t;

/* JADX INFO: renamed from: g.F */
/* JADX INFO: loaded from: classes.dex */
public final class C0083F extends AbstractC0080C {

    /* JADX INFO: renamed from: e */
    private final C0190t f324e;

    public C0083F(C0190t r3) {
        int r0 = RuntimeDexGenerator.m15u(r3.m446i());
        super(1, (r3.m447j() + r0) + 1);
        this.f324e = r3;
    }

    @Override // fun.box001.internal.dexformat.instructions.AbstractC0108s
    /* JADX INFO: renamed from: a */
    public final void mo242a(C0100k r1) {
    }

    @Override // fun.box001.internal.dexformat.instructions.AbstractC0108s
    /* JADX INFO: renamed from: b */
    public final EnumC0109t mo243b() {
        return EnumC0109t.f418n;
    }

    @Override // fun.box001.internal.dexformat.instructions.AbstractC0080C
    /* JADX INFO: renamed from: e */
    protected final int mo234e(AbstractC0080C r2) {
        return this.f324e.m425b(((C0083F) r2).f324e);
    }

    @Override // fun.box001.internal.dexformat.instructions.AbstractC0080C
    /* JADX INFO: renamed from: l */
    public final void mo241l(C0100k r6, C0202d r7) {
        C0190t r62 = this.f324e;
        C0200b r0 = r62.m444g();
        int r1 = r62.m446i();
        if (r7.m486d() == false) goto L5;
        r7.m484b(RuntimeDexGenerator.m15u(r1), "utf16_size: ".concat(RuntimeDexGenerator.m13s(r1)));
        r7.m484b(r0.m478b() + 1, r62.m448k());
    L5:
        r7.m500t(r1);
        r7.m494n(r0);
        r7.m496p(0);
    }
}
