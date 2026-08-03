package p255r4;

import bsh.C0353j;
import p000a.AbstractC0000a;
import p311v4.C4451c0;
import p326w4.C4681a;
import p326w4.C4682b;
import p326w4.C4683c;
import p376z4.C6090d;

/* JADX INFO: renamed from: r4.n0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3686n0 extends AbstractC3706z {

    /* JADX INFO: renamed from: h */
    public final C4681a f11987h;

    /* JADX INFO: renamed from: i */
    public final C4451c0 f11988i;

    /* JADX INFO: renamed from: j */
    public C3698t0 f11989j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3686n0(C4681a c4681a) {
        if (c4681a == null) {
            C0353j.m1305c("prototype == null");
            throw null;
        }
        C4682b c4682b = c4681a.f15571i;
        this.f11987h = c4681a;
        int length = c4682b.f24601h.length;
        StringBuilder sb2 = new StringBuilder(length + 1);
        char cCharAt = c4681a.f15570h.f15648g.charAt(0);
        sb2.append(cCharAt == '[' ? 'L' : cCharAt);
        for (int i9 = 0; i9 < length; i9++) {
            char cCharAt2 = ((C4683c) c4682b.m10840l(i9)).f15648g.charAt(0);
            if (cCharAt2 == '[') {
                cCharAt2 = 'L';
            }
            sb2.append(cCharAt2);
        }
        this.f11988i = new C4451c0(sb2.toString());
        this.f11989j = c4682b.f24601h.length == 0 ? null : new C3698t0(c4682b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p255r4.AbstractC3660a0
    /* JADX INFO: renamed from: a */
    public final void mo7638a(C3689p c3689p) {
        C3674h0 c3674h0 = c3689p.f12004f;
        C3674h0 c3674h02 = c3689p.f12005g;
        C3680k0 c3680k0 = c3689p.f12001c;
        c3674h02.m7664t(this.f11987h.f15570h);
        c3674h0.m7662r(this.f11988i);
        C3698t0 c3698t0 = this.f11989j;
        if (c3698t0 != null) {
            this.f11989j = (C3698t0) c3680k0.m7679l(c3698t0);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p255r4.AbstractC3660a0
    /* JADX INFO: renamed from: b */
    public final EnumC3662b0 mo7639b() {
        return EnumC3662b0.f11883m;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p255r4.AbstractC3660a0
    /* JADX INFO: renamed from: c */
    public final int mo7644c() {
        return 12;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p255r4.AbstractC3660a0
    /* JADX INFO: renamed from: d */
    public final void mo7645d(C3689p c3689p, C6090d c6090d) {
        C3674h0 c3674h0 = c3689p.f12004f;
        C4451c0 c4451c0 = this.f11988i;
        int iM7656l = c3674h0.m7656l(c4451c0);
        C3674h0 c3674h02 = c3689p.f12005g;
        C4681a c4681a = this.f11987h;
        C4683c c4683c = c4681a.f15570h;
        C4683c c4683c2 = c4681a.f15570h;
        int iM7659o = c3674h02.m7659o(c4683c);
        C3698t0 c3698t0 = this.f11989j;
        int iM7681f = c3698t0 == null ? 0 : c3698t0.m7681f();
        if (c6090d.m10829d()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(c4683c2.mo4901a());
            sb2.append(" proto(");
            C4682b c4682b = c4681a.f15571i;
            int length = c4682b.f24601h.length;
            for (int i9 = 0; i9 < length; i9++) {
                if (i9 != 0) {
                    sb2.append(", ");
                }
                sb2.append(((C4683c) c4682b.m10840l(i9)).mo4901a());
            }
            sb2.append(")");
            c6090d.m10827b(0, m7710f() + ' ' + sb2.toString());
            c6090d.m10827b(4, "  shorty_idx:      " + AbstractC0000a.m48Y0(iM7656l) + " // " + c4451c0.m8901l());
            c6090d.m10827b(4, "  return_type_idx: " + AbstractC0000a.m48Y0(iM7659o) + " // " + c4683c2.mo4901a());
            c6090d.m10827b(4, "  parameters_off:  ".concat(AbstractC0000a.m48Y0(iM7681f)));
        }
        c6090d.m10835k(iM7656l);
        c6090d.m10835k(iM7659o);
        c6090d.m10835k(iM7681f);
    }
}
