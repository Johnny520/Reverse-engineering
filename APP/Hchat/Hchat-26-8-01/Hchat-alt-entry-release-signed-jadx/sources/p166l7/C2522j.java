package p166l7;

import java.io.IOException;
import p135j7.C2089e;
import p136j8.AbstractC2091b;
import p209o7.C3076j;
import p229p7.C3331a;
import p229p7.C3332b;
import p229p7.C3337g;
import p257r7.AbstractC3712b;
import p257r7.C3713c;
import p257r7.C3726p;
import p344x7.C5705b;

/* JADX INFO: renamed from: l7.j */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2522j extends AbstractC2513a {

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ int f8151o;

    /* JADX INFO: renamed from: p */
    public final AbstractC3712b f8152p;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2522j(int i9) {
        this.f8151o = i9;
        switch (i9) {
            case 1:
                C3331a c3331a = new C3331a((short) 0);
                super(c3331a, 1);
                C3713c c3713c = new C3713c(0, 0);
                this.f8152p = c3713c;
                m6539P(c3713c);
                c3331a.f10724p = this;
                break;
            default:
                C3337g c3337g = new C3337g();
                super(c3337g, 1);
                C3726p c3726p = new C3726p(c3337g.f10740s);
                this.f8152p = c3726p;
                m6539P(c3726p);
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p166l7.AbstractC2513a
    /* JADX INFO: renamed from: Q */
    public void mo5905Q(C3332b c3332b) {
        switch (this.f8151o) {
            case 1:
                break;
            default:
                super.mo5905Q(c3332b);
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p166l7.AbstractC2513a
    /* JADX INFO: renamed from: S */
    public final void mo5907S() {
        switch (this.f8151o) {
            case 0:
                C3726p c3726p = (C3726p) this.f8152p;
                c3726p.f12099m.mo633k(c3726p.f12076k.length / 4);
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: V */
    public byte m5924V() {
        return ((C3337g) this.f8138m).f10739r.f12076k[0];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p152k7.AbstractC2333c, p152k7.AbstractC2331a
    /* JADX INFO: renamed from: r */
    public byte[] mo5552r() {
        switch (this.f8151o) {
            case 1:
                C5705b c5705b = new C5705b(this.f8138m.f10723o.f12083n);
                try {
                    m5549K(c5705b);
                    c5705b.close();
                    break;
                } catch (IOException unused) {
                }
                return c5705b.toByteArray();
            default:
                return super.mo5552r();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p166l7.AbstractC2513a
    public final String toString() {
        switch (this.f8151o) {
            case 0:
                StringBuilder sb2 = new StringBuilder();
                sb2.append(super.toString());
                C3076j c3076j = (C3076j) m5553u(C3076j.class);
                C2089e c2089e = c3076j != null ? c3076j.f9949m : null;
                if (c2089e != null) {
                    sb2.append(", typesCount=");
                    sb2.append(c2089e.f9926k.size());
                }
                return sb2.toString();
            default:
                StringBuilder sb3 = new StringBuilder();
                sb3.append(this.f8138m);
                sb3.append(" {Body=");
                return AbstractC2091b.m5163j(sb3, ((C3713c) this.f8152p).f12076k.length, "}");
        }
    }

    /* JADX INFO: renamed from: W */
    private final void m5923W() {
    }

    /* JADX INFO: renamed from: U */
    private final void m5922U(C3332b c3332b) {
    }
}
