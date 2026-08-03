package fun.box001.internal.dexformat.instructions;

import fun.box001.internal.dexbridge.RuntimeDexGenerator;
import fun.box001.internal.dexformat.output.C0202d;

/* JADX INFO: renamed from: g.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0090a extends AbstractC0080C {
    public C0090a() {
        super(4, -1);
    }

    @Override // fun.box001.internal.dexformat.instructions.AbstractC0108s
    /* JADX INFO: renamed from: a */
    public final void mo242a(C0100k r1) {
        r1.getClass();
    }

    @Override // fun.box001.internal.dexformat.instructions.AbstractC0108s
    /* JADX INFO: renamed from: b */
    public final EnumC0109t mo243b() {
        return EnumC0109t.f421q;
    }

    @Override // fun.box001.internal.dexformat.instructions.AbstractC0080C
    /* JADX INFO: renamed from: e */
    public final int mo234e(AbstractC0080C r2) {
        throw new UnsupportedOperationException("uninternable instance");
    }

    public final int hashCode() {
        return 0;
    }

    @Override // fun.box001.internal.dexformat.instructions.AbstractC0080C
    /* JADX INFO: renamed from: j */
    protected final void mo239j(AbstractC0082E r1, int r2) {
        m240k(16);
    }

    @Override // fun.box001.internal.dexformat.instructions.AbstractC0080C
    /* JADX INFO: renamed from: l */
    protected final void mo241l(C0100k r4, C0202d r5) {
        if (r5.m486d() == false) goto L5;
        r5.m484b(0, m237h() + " annotations directory");
        r5.m484b(4, "  class_annotations_off: ".concat(RuntimeDexGenerator.m13s(0)));
        r5.m484b(4, "  fields_size:           ".concat(RuntimeDexGenerator.m13s(0)));
        r5.m484b(4, "  methods_size:          ".concat(RuntimeDexGenerator.m13s(0)));
        r5.m484b(4, "  parameters_size:       ".concat(RuntimeDexGenerator.m13s(0)));
    L5:
        r5.m497q(0);
        r5.m497q(0);
        r5.m497q(0);
        r5.m497q(0);
    }
}
