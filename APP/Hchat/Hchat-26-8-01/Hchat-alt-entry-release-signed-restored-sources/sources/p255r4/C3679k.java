package p255r4;

import be.AbstractC0283h;
import bsh.C0353j;
import p000a.AbstractC0000a;
import p136j8.C2104o;
import p311v4.AbstractC4446a;
import p311v4.C4451c0;
import p311v4.C4452d;
import p311v4.C4453d0;
import p326w4.InterfaceC4685e;
import p376z4.C6090d;

/* JADX INFO: renamed from: r4.k */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3679k extends AbstractC3706z {

    /* JADX INFO: renamed from: h */
    public final C4453d0 f11947h;

    /* JADX INFO: renamed from: i */
    public final int f11948i;

    /* JADX INFO: renamed from: j */
    public final C4453d0 f11949j;

    /* JADX INFO: renamed from: k */
    public C3698t0 f11950k;

    /* JADX INFO: renamed from: l */
    public final C4451c0 f11951l;

    /* JADX INFO: renamed from: m */
    public final C3677j f11952m;

    /* JADX INFO: renamed from: n */
    public C3691q f11953n;

    /* JADX INFO: renamed from: o */
    public C3667e f11954o;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3679k(C4453d0 c4453d0, int i9, C4453d0 c4453d02, InterfaceC4685e interfaceC4685e, C4451c0 c4451c0) {
        if (c4453d0 == null) {
            C0353j.m1305c("thisClass == null");
            throw null;
        }
        if (interfaceC4685e == null) {
            C0353j.m1305c("interfaces == null");
            throw null;
        }
        this.f11947h = c4453d0;
        this.f11948i = i9;
        this.f11949j = c4453d02;
        this.f11950k = interfaceC4685e.size() == 0 ? null : new C3698t0(interfaceC4685e);
        this.f11951l = c4451c0;
        this.f11952m = new C3677j(c4453d0);
        this.f11953n = null;
        C3667e c3667e = new C3667e(4, -1);
        c3667e.f11917k = null;
        c3667e.f11918l = null;
        c3667e.f11919m = null;
        c3667e.f11920n = null;
        this.f11954o = c3667e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p255r4.AbstractC3660a0
    /* JADX INFO: renamed from: a */
    public final void mo7638a(C3689p c3689p) {
        C3674h0 c3674h0 = c3689p.f12005g;
        C3680k0 c3680k0 = c3689p.f12013o;
        C3680k0 c3680k02 = c3689p.f12000b;
        C3680k0 c3680k03 = c3689p.f12001c;
        C3674h0 c3674h02 = c3689p.f12004f;
        c3674h0.m7660p(this.f11947h);
        C3677j c3677j = this.f11952m;
        if (!c3677j.m7670r()) {
            c3689p.f12010l.m7678k(c3677j);
            C4452d c4452dM7669q = c3677j.m7669q();
            if (c4452dM7669q != null) {
                this.f11953n = (C3691q) c3680k0.m7679l(new C3691q(c4452dM7669q));
            }
        }
        C4453d0 c4453d0 = this.f11949j;
        if (c4453d0 != null) {
            c3674h0.m7660p(c4453d0);
        }
        C3698t0 c3698t0 = this.f11950k;
        if (c3698t0 != null) {
            this.f11950k = (C3698t0) c3680k03.m7679l(c3698t0);
        }
        C4451c0 c4451c0 = this.f11951l;
        if (c4451c0 != null) {
            c3674h02.m7662r(c4451c0);
        }
        C3667e c3667e = this.f11954o;
        C3661b c3661b = c3667e.f11917k;
        if (c3661b == null && c3667e.f11918l == null && c3667e.f11919m == null && c3667e.f11920n == null) {
            return;
        }
        if (c3661b != null && c3667e.f11918l == null && c3667e.f11919m == null && c3667e.f11920n == null) {
            this.f11954o = (C3667e) c3680k02.m7679l(c3667e);
        } else {
            c3680k02.m7678k(c3667e);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p255r4.AbstractC3660a0
    /* JADX INFO: renamed from: b */
    public final EnumC3662b0 mo7639b() {
        return EnumC3662b0.f11886p;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p255r4.AbstractC3660a0
    /* JADX INFO: renamed from: c */
    public final int mo7644c() {
        return 32;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p255r4.AbstractC3660a0
    /* JADX INFO: renamed from: d */
    public final void mo7645d(C3689p c3689p, C6090d c6090d) {
        boolean zM10829d = c6090d.m10829d();
        C3674h0 c3674h0 = c3689p.f12005g;
        C4453d0 c4453d0 = this.f11947h;
        int iM7657m = c3674h0.m7657m(c4453d0);
        C4453d0 c4453d02 = this.f11949j;
        int iM7657m2 = c4453d02 == null ? -1 : c3674h0.m7657m(c4453d02);
        C3698t0 c3698t0 = this.f11950k;
        int iM7681f = c3698t0 == null ? 0 : c3698t0.m7681f();
        C3667e c3667e = this.f11954o;
        int iM7681f2 = (c3667e.f11917k == null && c3667e.f11918l == null && c3667e.f11919m == null && c3667e.f11920n == null) ? 0 : c3667e.m7681f();
        C4451c0 c4451c0 = this.f11951l;
        int iM7656l = c4451c0 != null ? c3689p.f12004f.m7656l(c4451c0) : -1;
        C3677j c3677j = this.f11952m;
        int iM7681f3 = c3677j.m7670r() ? 0 : c3677j.m7681f();
        C3691q c3691q = this.f11953n;
        int iM7681f4 = c3691q == null ? 0 : c3691q.m7681f();
        int i9 = this.f11948i;
        if (zM10829d) {
            c6090d.m10827b(0, m7710f() + ' ' + c4453d0.f14784g.mo4901a());
            c6090d.m10827b(4, "  class_idx:           ".concat(AbstractC0000a.m48Y0(iM7657m)));
            StringBuilder sb2 = new StringBuilder("  access_flags:        ");
            sb2.append(AbstractC0283h.m1121A(i9, 30257, 1));
            c6090d.m10827b(4, sb2.toString());
            StringBuilder sb3 = new StringBuilder("  superclass_idx:      ");
            sb3.append(AbstractC0000a.m48Y0(iM7657m2));
            sb3.append(" // ");
            sb3.append(c4453d02 == null ? "<none>" : c4453d02.f14784g.mo4901a());
            c6090d.m10827b(4, sb3.toString());
            c6090d.m10827b(4, "  interfaces_off:      ".concat(AbstractC0000a.m48Y0(iM7681f)));
            if (iM7681f != 0) {
                InterfaceC4685e interfaceC4685e = this.f11950k.f12032k;
                int i10 = 0;
                for (int size = interfaceC4685e.size(); i10 < size; size = size) {
                    c6090d.m10827b(0, "    " + interfaceC4685e.getType(i10).mo4901a());
                    i10++;
                }
            }
            StringBuilder sb4 = new StringBuilder("  source_file_idx:     ");
            sb4.append(AbstractC0000a.m48Y0(iM7656l));
            sb4.append(" // ");
            sb4.append(c4451c0 != null ? c4451c0.mo4901a() : "<none>");
            c6090d.m10827b(4, sb4.toString());
            c6090d.m10827b(4, "  annotations_off:     ".concat(AbstractC0000a.m48Y0(iM7681f2)));
            c6090d.m10827b(4, "  class_data_off:      ".concat(AbstractC0000a.m48Y0(iM7681f3)));
            c6090d.m10827b(4, "  static_values_off:   ".concat(AbstractC0000a.m48Y0(iM7681f4)));
        }
        c6090d.m10835k(iM7657m);
        c6090d.m10835k(i9);
        c6090d.m10835k(iM7657m2);
        c6090d.m10835k(iM7681f);
        c6090d.m10835k(iM7656l);
        c6090d.m10835k(iM7681f2);
        c6090d.m10835k(iM7681f3);
        c6090d.m10835k(iM7681f4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final void m7673i(C3693r c3693r, AbstractC4446a abstractC4446a) {
        C3677j c3677j = this.f11952m;
        if (c3677j.f11944q != null) {
            C2104o.m5297w("static fields already sorted");
        } else {
            c3677j.f11939l.add(c3693r);
            c3677j.f11940m.put(c3693r, abstractC4446a);
        }
    }
}
