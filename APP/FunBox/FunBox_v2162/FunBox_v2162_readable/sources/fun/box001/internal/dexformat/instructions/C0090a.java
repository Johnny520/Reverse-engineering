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
    public final void mo242a(C0100k c0100k) {
        c0100k.getClass();
    }

    @Override // fun.box001.internal.dexformat.instructions.AbstractC0108s
    /* JADX INFO: renamed from: b */
    public final EnumC0109t mo243b() {
        return EnumC0109t.f421q;
    }

    @Override // fun.box001.internal.dexformat.instructions.AbstractC0080C
    /* JADX INFO: renamed from: e */
    public final int mo234e(AbstractC0080C abstractC0080C) {
        throw new UnsupportedOperationException("uninternable instance");
    }

    public final int hashCode() {
        return 0;
    }

    @Override // fun.box001.internal.dexformat.instructions.AbstractC0080C
    /* JADX INFO: renamed from: j */
    protected final void mo239j(AbstractC0082E abstractC0082E, int i2) {
        m240k(16);
    }

    @Override // fun.box001.internal.dexformat.instructions.AbstractC0080C
    /* JADX INFO: renamed from: l */
    protected final void mo241l(C0100k c0100k, C0202d c0202d) {
        if (c0202d.m486d()) {
            c0202d.m484b(0, m237h() + " annotations directory");
            c0202d.m484b(4, "  class_annotations_off: ".concat(RuntimeDexGenerator.m13s(0)));
            c0202d.m484b(4, "  fields_size:           ".concat(RuntimeDexGenerator.m13s(0)));
            c0202d.m484b(4, "  methods_size:          ".concat(RuntimeDexGenerator.m13s(0)));
            c0202d.m484b(4, "  parameters_size:       ".concat(RuntimeDexGenerator.m13s(0)));
        }
        c0202d.m497q(0);
        c0202d.m497q(0);
        c0202d.m497q(0);
        c0202d.m497q(0);
    }
}
