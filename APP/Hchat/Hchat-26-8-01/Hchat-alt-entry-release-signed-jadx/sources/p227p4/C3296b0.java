package p227p4;

import bsh.C0353j;
import bsh.ParserConstants;
import p089g1.C1275d;
import p295u4.C4266p;
import p295u4.C4270t;

/* JADX INFO: renamed from: p4.b0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3296b0 extends AbstractC3307l {

    /* JADX INFO: renamed from: f */
    public final C3301f f10477f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3296b0(C3305j c3305j, C4270t c4270t, C4266p c4266p, C3301f c3301f) {
        super(c3305j, c4270t, c4266p);
        if (c3301f != null) {
            this.f10477f = c3301f;
        } else {
            C0353j.m1305c("target == null");
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p227p4.AbstractC3303h
    /* JADX INFO: renamed from: a */
    public final String mo6968a() {
        C3301f c3301f = this.f10477f;
        return c3301f == null ? "????" : c3301f.m6990f();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p227p4.AbstractC3307l, p227p4.AbstractC3303h
    /* JADX INFO: renamed from: i */
    public final AbstractC3303h mo6975i(C3305j c3305j) {
        return new C3296b0(c3305j, this.f10489c, this.f10490d, this.f10477f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p227p4.AbstractC3303h
    /* JADX INFO: renamed from: k */
    public final AbstractC3303h mo6971k(C4266p c4266p) {
        return new C3296b0(this.f10488b, this.f10489c, c4266p, this.f10477f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public final int m6976m() {
        return this.f10477f.m6989e() - m6989e();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public final boolean m6977n() {
        return this.f10487a >= 0 && this.f10477f.f10487a >= 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public final C3296b0 m6978o(C3301f c3301f) {
        C3305j c3305j;
        C3305j c3305j2 = this.f10488b;
        switch (c3305j2.f10492a) {
            case 50:
                c3305j = AbstractC3306k.f10548R;
                break;
            case 51:
                c3305j = AbstractC3306k.f10545Q;
                break;
            case 52:
                c3305j = AbstractC3306k.f10554T;
                break;
            case 53:
                c3305j = AbstractC3306k.f10551S;
                break;
            case 54:
                c3305j = AbstractC3306k.f10560V;
                break;
            case 55:
                c3305j = AbstractC3306k.f10557U;
                break;
            case 56:
                c3305j = AbstractC3306k.f10566X;
                break;
            case 57:
                c3305j = AbstractC3306k.f10563W;
                break;
            case 58:
                c3305j = AbstractC3306k.f10572Z;
                break;
            case ParserConstants.VOLATILE /* 59 */:
                c3305j = AbstractC3306k.f10569Y;
                break;
            case ParserConstants.WHEN /* 60 */:
                c3305j = AbstractC3306k.f10580b0;
                break;
            case ParserConstants.WHILE /* 61 */:
                c3305j = AbstractC3306k.f10576a0;
                break;
            default:
                C1275d.m3412f(c3305j2, "bogus opcode: ");
                return null;
        }
        return new C3296b0(c3305j, this.f10489c, this.f10490d, c3301f);
    }
}
