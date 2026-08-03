package p255r4;

import bsh.C0353j;
import p009a9.C0031h;
import p227p4.C3315t;
import p281t3.AbstractC4106c;
import p282t4.C4114a;
import p376z4.C6090d;

/* JADX INFO: renamed from: r4.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3659a extends AbstractC3682l0 {

    /* JADX INFO: renamed from: n */
    public static final C0031h f11868n = new C0031h(29);

    /* JADX INFO: renamed from: k */
    public final C4114a f11869k;

    /* JADX INFO: renamed from: l */
    public C3696s0 f11870l;

    /* JADX INFO: renamed from: m */
    public byte[] f11871m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3659a(C3689p c3689p, C4114a c4114a) {
        super(1, -1);
        if (c4114a == null) {
            C0353j.m1305c("annotation == null");
            throw null;
        }
        this.f11869k = c4114a;
        this.f11870l = null;
        this.f11871m = null;
        mo7638a(c3689p);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p255r4.AbstractC3660a0
    /* JADX INFO: renamed from: a */
    public final void mo7638a(C3689p c3689p) {
        C3674h0 c3674h0 = c3689p.f12005g;
        C4114a c4114a = this.f11869k;
        this.f11870l = c3674h0.m7660p(c4114a.f13613h);
        C3315t.m7000i(c3689p, c4114a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p255r4.AbstractC3660a0
    /* JADX INFO: renamed from: b */
    public final EnumC3662b0 mo7639b() {
        return EnumC3662b0.f11874A;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p255r4.AbstractC3682l0
    /* JADX INFO: renamed from: e */
    public final int mo7640e(AbstractC3682l0 abstractC3682l0) {
        return this.f11869k.compareTo(((C3659a) abstractC3682l0).f11869k);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f11869k.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p255r4.AbstractC3682l0
    /* JADX INFO: renamed from: j */
    public final void mo7641j(C3680k0 c3680k0, int i9) {
        C6090d c6090d = new C6090d();
        new C3315t(c3680k0.f11995b, c6090d).m7020I(this.f11869k, false);
        byte[] bArrM10832h = c6090d.m10832h();
        this.f11871m = bArrM10832h;
        m7684k(bArrM10832h.length + 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p255r4.AbstractC3682l0
    /* JADX INFO: renamed from: l */
    public final String mo7642l() {
        return this.f11869k.mo4901a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p255r4.AbstractC3682l0
    /* JADX INFO: renamed from: m */
    public final void mo7643m(C3689p c3689p, C6090d c6090d) {
        boolean zM10829d = c6090d.m10829d();
        C4114a c4114a = this.f11869k;
        int i9 = c4114a.f13614i;
        if (zM10829d) {
            c6090d.m10827b(0, m7682g().concat(" annotation"));
            c6090d.m10827b(1, "  visibility: VISBILITY_".concat(i9 != 1 ? i9 != 2 ? i9 != 3 ? i9 != 4 ? "null" : "EMBEDDED" : "SYSTEM" : "BUILD" : "RUNTIME"));
        }
        int iM8279b = AbstractC4106c.m8279b(i9);
        if (iM8279b == 0) {
            c6090d.m10834j(1);
        } else if (iM8279b == 1) {
            c6090d.m10834j(0);
        } else {
            if (iM8279b != 2) {
                C0353j.m1309g("shouldn't happen");
                return;
            }
            c6090d.m10834j(2);
        }
        if (zM10829d) {
            new C3315t(c3689p, c6090d).m7020I(c4114a, true);
        } else {
            c6090d.m10833i(this.f11871m);
        }
    }
}
