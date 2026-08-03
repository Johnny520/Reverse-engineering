package p229p7;

import p136j8.AbstractC2091b;
import p152k7.AbstractC2331a;
import p166l7.C2522j;
import p209o7.AbstractC3070d;
import p241q7.C3445b;
import p241q7.InterfaceC3444a;
import p257r7.C3711a;
import p257r7.C3713c;
import p257r7.C3716f;
import p281t3.AbstractC4106c;
import p363y7.AbstractC5999a;

/* JADX INFO: renamed from: p7.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class C3331a extends AbstractC3070d implements InterfaceC3444a {

    /* JADX INFO: renamed from: m */
    public final C3711a f10721m;

    /* JADX INFO: renamed from: n */
    public final C3711a f10722n;

    /* JADX INFO: renamed from: o */
    public final C3716f f10723o;

    /* JADX INFO: renamed from: p */
    public C2522j f10724p;

    /* JADX INFO: renamed from: q */
    public final C3713c f10725q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3331a(short s10) {
        super(3);
        C3711a c3711a = new C3711a(s10);
        this.f10721m = c3711a;
        C3711a c3711a2 = new C3711a(1, false);
        this.f10722n = c3711a2;
        C3716f c3716f = new C3716f(false);
        this.f10723o = c3716f;
        this.f10725q = new C3713c(0, 0);
        m6539P(c3711a);
        m6539P(c3711a2);
        m6539P(c3716f);
        c3711a.f7660j = this;
        c3711a2.f7660j = this;
        c3716f.f7660j = this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p152k7.AbstractC2333c, p152k7.AbstractC2331a
    /* JADX INFO: renamed from: B */
    public void mo1893B(C3445b c3445b) {
        int i9 = c3445b.f11162k;
        super.mo1893B(c3445b);
        int i10 = this.f10722n.f12074o - (c3445b.f11162k - i9);
        C3713c c3713c = this.f10725q;
        mo7052R(c3713c, i10);
        if (c3713c.f12076k.length > 0) {
            c3713c.m5545G(c3445b);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Q */
    public final int m7051Q() {
        short s10 = (short) this.f10721m.f12074o;
        for (int i9 : AbstractC4106c.m8280c(18)) {
            if (AbstractC2091b.m5156c(i9) == s10) {
                return i9;
            }
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: R */
    public void mo7052R(C3713c c3713c, int i9) {
        if (i9 == 0) {
            return;
        }
        if (c3713c.f7658h == null) {
            m6539P(c3713c);
        }
        c3713c.m7720Q(i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p241q7.InterfaceC3444a
    /* JADX INFO: renamed from: m */
    public final void mo1926m(AbstractC2331a abstractC2331a) {
        C3711a c3711a = this.f10721m;
        if (abstractC2331a == c3711a) {
            int i9 = c3711a.f12074o;
            return;
        }
        C3711a c3711a2 = this.f10722n;
        if (abstractC2331a == c3711a2) {
            mo7053S(c3711a2.f12074o);
            return;
        }
        C3716f c3716f = this.f10723o;
        if (abstractC2331a == c3716f) {
            int i10 = c3711a2.f12074o;
            int i11 = c3716f.f12083n;
            C2522j c2522j = this.f10724p;
            if (c2522j != null) {
                ((C3713c) c2522j.f8152p).m7720Q(i11 - i10);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        short s10 = (short) this.f10721m.f12074o;
        int[] iArrM8280c = AbstractC4106c.m8280c(18);
        int length = iArrM8280c.length;
        int i9 = 0;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            int i11 = iArrM8280c[i10];
            if (AbstractC2091b.m5156c(i11) == s10) {
                i9 = i11;
                break;
            }
            i10++;
        }
        StringBuilder sb2 = new StringBuilder();
        if (i9 != 0) {
            sb2.append(AbstractC2091b.m5155b(i9));
        } else {
            sb2.append("Unknown type=");
            sb2.append(AbstractC5999a.m10752o(s10));
        }
        sb2.append("{ValueHeader=");
        sb2.append(this.f10722n.f12074o);
        sb2.append(", Chunk=");
        return AbstractC2091b.m5163j(sb2, this.f10723o.f12083n, "}");
    }

    @Override // p209o7.AbstractC3070d, p152k7.AbstractC2333c
    /* JADX INFO: renamed from: N */
    public final void mo1891N() {
    }

    @Override // p152k7.AbstractC2333c
    /* JADX INFO: renamed from: O */
    public final void mo5561O() {
    }

    /* JADX INFO: renamed from: S */
    public void mo7053S(int i9) {
    }
}
