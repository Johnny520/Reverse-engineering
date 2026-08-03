package p255r4;

import p000a.AbstractC0000a;
import p136j8.C2104o;
import p311v4.AbstractC4454e;
import p311v4.C4464m;
import p311v4.C4467p;
import p311v4.C4475x;
import p376z4.C6090d;

/* JADX INFO: renamed from: r4.g0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3672g0 extends AbstractC3706z {

    /* JADX INFO: renamed from: h */
    public final C4475x f11928h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3672g0(C4475x c4475x) {
        this.f11928h = c4475x;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p255r4.AbstractC3660a0
    /* JADX INFO: renamed from: a */
    public final void mo7638a(C3689p c3689p) {
        c3689p.f12012n.m7661q(this.f11928h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p255r4.AbstractC3660a0
    /* JADX INFO: renamed from: b */
    public final EnumC3662b0 mo7639b() {
        return EnumC3662b0.f11888r;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p255r4.AbstractC3660a0
    /* JADX INFO: renamed from: c */
    public final int mo7644c() {
        return 8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p255r4.AbstractC3660a0
    /* JADX INFO: renamed from: d */
    public final void mo7645d(C3689p c3689p, C6090d c6090d) {
        int iM7654i = m7654i(c3689p);
        C4475x c4475x = this.f11928h;
        int i9 = c4475x.f14824g;
        if (c6090d.m10829d()) {
            c6090d.m10827b(0, m7710f() + ' ' + c4475x.toString());
            c6090d.m10827b(2, "type:     " + AbstractC0000a.m46X0(i9) + (" // " + C4475x.f14823i[i9]));
            c6090d.m10827b(2, "reserved: ".concat(AbstractC0000a.m46X0(0)));
            String str = " // " + c4475x.f14825h.toString();
            if (C4475x.m8915k(c4475x.f14824g)) {
                c6090d.m10827b(2, "fieldId:  " + AbstractC0000a.m46X0(iM7654i) + str);
            } else {
                c6090d.m10827b(2, "methodId: " + AbstractC0000a.m46X0(iM7654i) + str);
            }
            c6090d.m10827b(2, "reserved: ".concat(AbstractC0000a.m46X0(0)));
        }
        c6090d.m10836l(i9);
        c6090d.m10836l(0);
        c6090d.m10836l(m7654i(c3689p));
        c6090d.m10836l(0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final int m7654i(C3689p c3689p) {
        C4475x c4475x = this.f11928h;
        Object objM8911l = c4475x.f14825h;
        if (C4475x.m8915k(c4475x.f14824g)) {
            return c3689p.f12007i.m7707l((C4464m) objM8911l);
        }
        switch (c4475x.f14824g) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                if (objM8911l instanceof C4467p) {
                    objM8911l = ((C4467p) objM8911l).m8911l();
                }
                return c3689p.f12008j.m7671l((AbstractC4454e) objM8911l);
            default:
                C2104o.m5276A("Unhandled invocation type");
                return 0;
        }
    }
}
