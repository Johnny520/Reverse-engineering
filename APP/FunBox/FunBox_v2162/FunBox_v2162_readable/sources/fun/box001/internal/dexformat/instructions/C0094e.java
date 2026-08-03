package fun.box001.internal.dexformat.instructions;

import fun.box001.internal.dexbridge.RuntimeDexGenerator;
import fun.box001.internal.dexformat.output.AbstractC0203e;
import fun.box001.internal.dexformat.output.C0202d;
import fun.box001.internal.dexformat.writer.code.C0173c;
import fun.box001.internal.dexformat.writer.code.C0190t;
import fun.box001.internal.dexformat.writer.code.C0191u;
import fun.box001.internal.dexformat.writer.data.C0194b;
import fun.box001.internal.dexformat.writer.data.InterfaceC0197e;

/* JADX INFO: renamed from: g.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0094e extends AbstractC0107r {

    /* JADX INFO: renamed from: b */
    private final C0191u f348b;

    /* JADX INFO: renamed from: c */
    private final int f349c;

    /* JADX INFO: renamed from: d */
    private final C0191u f350d;

    /* JADX INFO: renamed from: e */
    private C0086I f351e;

    /* JADX INFO: renamed from: f */
    private final C0190t f352f;

    /* JADX INFO: renamed from: g */
    private final C0093d f353g;

    /* JADX INFO: renamed from: h */
    private C0101l f354h;

    /* JADX INFO: renamed from: i */
    private C0090a f355i;

    public C0094e(C0191u c0191u, int i2, C0191u c0191u2, C0194b c0194b, C0190t c0190t) {
        if (c0191u == null) {
            throw new NullPointerException("thisClass == null");
        }
        if (c0194b == null) {
            throw new NullPointerException("interfaces == null");
        }
        this.f348b = c0191u;
        this.f349c = i2;
        this.f350d = c0191u2;
        this.f351e = c0194b.m504B() == 0 ? null : new C0086I(c0194b);
        this.f352f = c0190t;
        this.f353g = new C0093d(c0191u);
        this.f354h = null;
        this.f355i = new C0090a();
    }

    @Override // fun.box001.internal.dexformat.instructions.AbstractC0108s
    /* JADX INFO: renamed from: a */
    public final void mo242a(C0100k c0100k) {
        C0113x c0113xM307q = c0100k.m307q();
        C0079B c0079bM293c = c0100k.m293c();
        C0079B c0079bM308r = c0100k.m308r();
        C0113x c0113xM306p = c0100k.m306p();
        c0113xM307q.m333v(this.f348b);
        C0093d c0093d = this.f353g;
        if (!c0093d.m274s()) {
            c0100k.m294d().m229o(c0093d);
            C0173c c0173cM273r = c0093d.m273r();
            if (c0173cM273r != null) {
                this.f354h = (C0101l) c0079bM293c.m230p(new C0101l(c0173cM273r));
            }
        }
        C0191u c0191u = this.f350d;
        if (c0191u != null) {
            c0113xM307q.m333v(c0191u);
        }
        C0086I c0086i = this.f351e;
        if (c0086i != null) {
            this.f351e = (C0086I) c0079bM308r.m230p(c0086i);
        }
        C0190t c0190t = this.f352f;
        if (c0190t != null) {
            c0113xM306p.m332u(c0190t);
        }
        this.f355i.getClass();
    }

    @Override // fun.box001.internal.dexformat.instructions.AbstractC0108s
    /* JADX INFO: renamed from: b */
    public final EnumC0109t mo243b() {
        return EnumC0109t.f413i;
    }

    @Override // fun.box001.internal.dexformat.instructions.AbstractC0108s
    /* JADX INFO: renamed from: c */
    public final int mo232c() {
        return 32;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fun.box001.internal.dexformat.instructions.AbstractC0108s
    /* JADX INFO: renamed from: d */
    public final void mo233d(C0100k c0100k, C0202d c0202d) {
        boolean zM486d = c0202d.m486d();
        C0113x c0113xM307q = c0100k.m307q();
        C0191u c0191u = this.f348b;
        int iM329r = c0113xM307q.m329r(c0191u);
        C0191u c0191u2 = this.f350d;
        int iM329r2 = c0191u2 == null ? -1 : c0113xM307q.m329r(c0191u2);
        C0086I c0086i = this.f351e;
        int iM235f = c0086i == null ? 0 : c0086i.m235f();
        this.f355i.getClass();
        C0190t c0190t = this.f352f;
        int iM328q = c0190t != null ? c0100k.m306p().m328q(c0190t) : -1;
        C0093d c0093d = this.f353g;
        int iM235f2 = c0093d.m274s() ? 0 : c0093d.m235f();
        C0101l c0101l = this.f354h;
        int iM235f3 = c0101l == null ? 0 : c0101l.m235f();
        int i2 = this.f349c;
        if (zM486d) {
            c0202d.m484b(0, m319g() + ' ' + c0191u.mo107a());
            c0202d.m484b(4, "  class_idx:           ".concat(RuntimeDexGenerator.m13s(iM329r)));
            StringBuilder sb = new StringBuilder("  access_flags:        ");
            sb.append(RuntimeDexGenerator.m1f(i2));
            c0202d.m484b(4, sb.toString());
            StringBuilder sb2 = new StringBuilder("  superclass_idx:      ");
            sb2.append(RuntimeDexGenerator.m13s(iM329r2));
            sb2.append(" // ");
            sb2.append(c0191u2 == null ? "<none>" : c0191u2.mo107a());
            c0202d.m484b(4, sb2.toString());
            c0202d.m484b(4, "  interfaces_off:      ".concat(RuntimeDexGenerator.m13s(iM235f)));
            if (iM235f != 0) {
                InterfaceC0197e interfaceC0197eM254m = this.f351e.m254m();
                int iM504B = ((AbstractC0203e) interfaceC0197eM254m).m504B();
                for (int i3 = 0; i3 < iM504B; i3++) {
                    c0202d.m484b(0, "    " + interfaceC0197eM254m.mo403b(i3).mo107a());
                }
            }
            StringBuilder sb3 = new StringBuilder("  source_file_idx:     ");
            sb3.append(RuntimeDexGenerator.m13s(iM328q));
            sb3.append(" // ");
            sb3.append(c0190t != null ? c0190t.mo107a() : "<none>");
            c0202d.m484b(4, sb3.toString());
            c0202d.m484b(4, "  annotations_off:     ".concat(RuntimeDexGenerator.m13s(0)));
            c0202d.m484b(4, "  class_data_off:      ".concat(RuntimeDexGenerator.m13s(iM235f2)));
            c0202d.m484b(4, "  static_values_off:   ".concat(RuntimeDexGenerator.m13s(iM235f3)));
        }
        c0202d.m497q(iM329r);
        c0202d.m497q(i2);
        c0202d.m497q(iM329r2);
        c0202d.m497q(iM235f);
        c0202d.m497q(iM328q);
        c0202d.m497q(0);
        c0202d.m497q(iM235f2);
        c0202d.m497q(iM235f3);
    }

    /* JADX INFO: renamed from: i */
    public final void m275i(C0103n c0103n) {
        this.f353g.m271m(c0103n);
    }

    /* JADX INFO: renamed from: j */
    public final void m276j(C0103n c0103n) {
        this.f353g.m272n(c0103n);
    }

    /* JADX INFO: renamed from: k */
    public final InterfaceC0197e m277k() {
        C0086I c0086i = this.f351e;
        return c0086i == null ? C0194b.f722c : c0086i.m254m();
    }

    /* JADX INFO: renamed from: l */
    public final C0191u m278l() {
        return this.f350d;
    }

    /* JADX INFO: renamed from: m */
    public final C0191u m279m() {
        return this.f348b;
    }
}
