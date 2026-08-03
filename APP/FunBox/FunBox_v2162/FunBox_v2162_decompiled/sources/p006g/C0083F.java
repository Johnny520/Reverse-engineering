package p006g;

import p000a.AbstractC0001b;
import p010k.C0190t;
import p013n.C0200b;
import p013n.C0202d;

/* JADX INFO: renamed from: g.F */
/* JADX INFO: loaded from: classes.dex */
public final class C0083F extends AbstractC0080C {

    /* JADX INFO: renamed from: e */
    private final C0190t f324e;

    public C0083F(C0190t c0190t) {
        super(1, c0190t.m447j() + AbstractC0001b.m15u(c0190t.m446i()) + 1);
        this.f324e = c0190t;
    }

    @Override // p006g.AbstractC0108s
    /* JADX INFO: renamed from: a */
    public final void mo242a(C0100k c0100k) {
    }

    @Override // p006g.AbstractC0108s
    /* JADX INFO: renamed from: b */
    public final EnumC0109t mo243b() {
        return EnumC0109t.f418n;
    }

    @Override // p006g.AbstractC0080C
    /* JADX INFO: renamed from: e */
    protected final int mo234e(AbstractC0080C abstractC0080C) {
        return this.f324e.compareTo(((C0083F) abstractC0080C).f324e);
    }

    @Override // p006g.AbstractC0080C
    /* JADX INFO: renamed from: l */
    public final void mo241l(C0100k c0100k, C0202d c0202d) {
        C0190t c0190t = this.f324e;
        C0200b c0200bM444g = c0190t.m444g();
        int iM446i = c0190t.m446i();
        if (c0202d.m486d()) {
            c0202d.m484b(AbstractC0001b.m15u(iM446i), "utf16_size: ".concat(AbstractC0001b.m13s(iM446i)));
            c0202d.m484b(c0200bM444g.m478b() + 1, c0190t.m448k());
        }
        c0202d.m500t(iM446i);
        c0202d.m494n(c0200bM444g);
        c0202d.m496p(0);
    }
}
