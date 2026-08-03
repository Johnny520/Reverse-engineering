package p255r4;

import java.util.ArrayList;
import java.util.Collections;
import p000a.AbstractC0000a;
import p136j8.C2104o;
import p311v4.C4464m;
import p311v4.C4476y;
import p376z4.C6090d;

/* JADX INFO: renamed from: r4.e */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3667e extends AbstractC3682l0 {

    /* JADX INFO: renamed from: k */
    public C3661b f11917k;

    /* JADX INFO: renamed from: l */
    public ArrayList f11918l;

    /* JADX INFO: renamed from: m */
    public ArrayList f11919m;

    /* JADX INFO: renamed from: n */
    public ArrayList f11920n;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public static int m7650n(ArrayList arrayList) {
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p255r4.AbstractC3660a0
    /* JADX INFO: renamed from: a */
    public final void mo7638a(C3689p c3689p) {
        C3680k0 c3680k0 = c3689p.f12000b;
        C3678j0 c3678j0 = c3689p.f12008j;
        C3661b c3661b = this.f11917k;
        if (c3661b != null) {
            this.f11917k = (C3661b) c3680k0.m7679l(c3661b);
        }
        ArrayList<C3699u> arrayList = this.f11918l;
        if (arrayList != null) {
            for (C3699u c3699u : arrayList) {
                c3699u.getClass();
                c3689p.f12007i.m7708m(c3699u.f12033g);
                c3699u.f12034h = (C3661b) c3680k0.m7679l(c3699u.f12034h);
            }
        }
        ArrayList<C3670f0> arrayList2 = this.f11919m;
        if (arrayList2 != null) {
            for (C3670f0 c3670f0 : arrayList2) {
                c3670f0.getClass();
                c3678j0.m7672m(c3670f0.f11923g);
                c3670f0.f11924h = (C3661b) c3680k0.m7679l(c3670f0.f11924h);
            }
        }
        ArrayList<C3684m0> arrayList3 = this.f11920n;
        if (arrayList3 != null) {
            for (C3684m0 c3684m0 : arrayList3) {
                c3684m0.getClass();
                c3678j0.m7672m(c3684m0.f11971g);
                c3680k0.m7678k(c3684m0.f11972h);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p255r4.AbstractC3660a0
    /* JADX INFO: renamed from: b */
    public final EnumC3662b0 mo7639b() {
        return EnumC3662b0.f11876C;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p255r4.AbstractC3682l0
    /* JADX INFO: renamed from: e */
    public final int mo7640e(AbstractC3682l0 abstractC3682l0) {
        C3661b c3661b = this.f11917k;
        if (c3661b == null || this.f11918l != null || this.f11919m != null || this.f11920n != null) {
            C2104o.m5297w("uninternable instance");
            return 0;
        }
        C3661b c3661b2 = ((C3667e) abstractC3682l0).f11917k;
        if (c3661b == c3661b2) {
            c3661b.getClass();
            return 0;
        }
        EnumC3662b0 enumC3662b0Mo7639b = c3661b.mo7639b();
        EnumC3662b0 enumC3662b0Mo7639b2 = c3661b2.mo7639b();
        return enumC3662b0Mo7639b != enumC3662b0Mo7639b2 ? enumC3662b0Mo7639b.compareTo(enumC3662b0Mo7639b2) : c3661b.mo7640e(c3661b2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        C3661b c3661b = this.f11917k;
        if (c3661b == null) {
            return 0;
        }
        return c3661b.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p255r4.AbstractC3682l0
    /* JADX INFO: renamed from: j */
    public final void mo7641j(C3680k0 c3680k0, int i9) {
        m7684k(((m7650n(this.f11920n) + m7650n(this.f11919m) + m7650n(this.f11918l)) * 8) + 16);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p255r4.AbstractC3682l0
    /* JADX INFO: renamed from: l */
    public final String mo7642l() {
        throw new RuntimeException("unsupported");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p255r4.AbstractC3682l0
    /* JADX INFO: renamed from: m */
    public final void mo7643m(C3689p c3689p, C6090d c6090d) {
        boolean zM10829d = c6090d.m10829d();
        C3661b c3661b = this.f11917k;
        int iM7681f = c3661b == null ? 0 : c3661b.m7681f();
        int iM7650n = m7650n(this.f11918l);
        int iM7650n2 = m7650n(this.f11919m);
        int iM7650n3 = m7650n(this.f11920n);
        if (zM10829d) {
            c6090d.m10827b(0, m7682g().concat(" annotations directory"));
            c6090d.m10827b(4, "  class_annotations_off: ".concat(AbstractC0000a.m48Y0(iM7681f)));
            c6090d.m10827b(4, "  fields_size:           ".concat(AbstractC0000a.m48Y0(iM7650n)));
            c6090d.m10827b(4, "  methods_size:          ".concat(AbstractC0000a.m48Y0(iM7650n2)));
            c6090d.m10827b(4, "  parameters_size:       ".concat(AbstractC0000a.m48Y0(iM7650n3)));
        }
        c6090d.m10835k(iM7681f);
        c6090d.m10835k(iM7650n);
        c6090d.m10835k(iM7650n2);
        c6090d.m10835k(iM7650n3);
        if (iM7650n != 0) {
            Collections.sort(this.f11918l);
            if (zM10829d) {
                c6090d.m10827b(0, "  fields:");
            }
            for (C3699u c3699u : this.f11918l) {
                c3699u.getClass();
                C3703w c3703w = c3689p.f12007i;
                C4464m c4464m = c3699u.f12033g;
                int iM7707l = c3703w.m7707l(c4464m);
                int iM7681f2 = c3699u.f12034h.m7681f();
                if (c6090d.m10829d()) {
                    c6090d.m10827b(0, "    ".concat(c4464m.mo4901a()));
                    c6090d.m10827b(4, "      field_idx:       ".concat(AbstractC0000a.m48Y0(iM7707l)));
                    c6090d.m10827b(4, "      annotations_off: ".concat(AbstractC0000a.m48Y0(iM7681f2)));
                }
                c6090d.m10835k(iM7707l);
                c6090d.m10835k(iM7681f2);
            }
        }
        if (iM7650n2 != 0) {
            Collections.sort(this.f11919m);
            if (zM10829d) {
                c6090d.m10827b(0, "  methods:");
            }
            for (C3670f0 c3670f0 : this.f11919m) {
                c3670f0.getClass();
                C3678j0 c3678j0 = c3689p.f12008j;
                C4476y c4476y = c3670f0.f11923g;
                int iM7671l = c3678j0.m7671l(c4476y);
                int iM7681f3 = c3670f0.f11924h.m7681f();
                if (c6090d.m10829d()) {
                    c6090d.m10827b(0, "    ".concat(c4476y.mo4901a()));
                    c6090d.m10827b(4, "      method_idx:      ".concat(AbstractC0000a.m48Y0(iM7671l)));
                    c6090d.m10827b(4, "      annotations_off: ".concat(AbstractC0000a.m48Y0(iM7681f3)));
                }
                c6090d.m10835k(iM7671l);
                c6090d.m10835k(iM7681f3);
            }
        }
        if (iM7650n3 != 0) {
            Collections.sort(this.f11920n);
            if (zM10829d) {
                c6090d.m10827b(0, "  parameters:");
            }
            for (C3684m0 c3684m0 : this.f11920n) {
                c3684m0.getClass();
                C3678j0 c3678j02 = c3689p.f12008j;
                C4476y c4476y2 = c3684m0.f11971g;
                int iM7671l2 = c3678j02.m7671l(c4476y2);
                int iM7681f4 = c3684m0.f11972h.m7681f();
                if (c6090d.m10829d()) {
                    c6090d.m10827b(0, "    ".concat(c4476y2.mo4901a()));
                    c6090d.m10827b(4, "      method_idx:      ".concat(AbstractC0000a.m48Y0(iM7671l2)));
                    c6090d.m10827b(4, "      annotations_off: ".concat(AbstractC0000a.m48Y0(iM7681f4)));
                }
                c6090d.m10835k(iM7671l2);
                c6090d.m10835k(iM7681f4);
            }
        }
    }
}
