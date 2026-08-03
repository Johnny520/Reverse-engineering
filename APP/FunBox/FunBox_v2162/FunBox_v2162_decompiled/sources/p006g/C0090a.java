package p006g;

import p000a.AbstractC0001b;
import p013n.C0202d;

/* JADX INFO: renamed from: g.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0090a extends AbstractC0080C {
    public C0090a() {
        super(4, -1);
    }

    @Override // p006g.AbstractC0108s
    /* JADX INFO: renamed from: a */
    public final void mo242a(C0100k c0100k) {
        c0100k.getClass();
    }

    @Override // p006g.AbstractC0108s
    /* JADX INFO: renamed from: b */
    public final EnumC0109t mo243b() {
        return EnumC0109t.f421q;
    }

    @Override // p006g.AbstractC0080C
    /* JADX INFO: renamed from: e */
    public final int mo234e(AbstractC0080C abstractC0080C) {
        throw new UnsupportedOperationException("uninternable instance");
    }

    public final int hashCode() {
        return 0;
    }

    @Override // p006g.AbstractC0080C
    /* JADX INFO: renamed from: j */
    protected final void mo239j(AbstractC0082E abstractC0082E, int i2) {
        m240k(16);
    }

    @Override // p006g.AbstractC0080C
    /* JADX INFO: renamed from: l */
    protected final void mo241l(C0100k c0100k, C0202d c0202d) {
        if (c0202d.m486d()) {
            c0202d.m484b(0, m237h() + " annotations directory");
            c0202d.m484b(4, "  class_annotations_off: ".concat(AbstractC0001b.m13s(0)));
            c0202d.m484b(4, "  fields_size:           ".concat(AbstractC0001b.m13s(0)));
            c0202d.m484b(4, "  methods_size:          ".concat(AbstractC0001b.m13s(0)));
            c0202d.m484b(4, "  parameters_size:       ".concat(AbstractC0001b.m13s(0)));
        }
        c0202d.m497q(0);
        c0202d.m497q(0);
        c0202d.m497q(0);
        c0202d.m497q(0);
    }
}
