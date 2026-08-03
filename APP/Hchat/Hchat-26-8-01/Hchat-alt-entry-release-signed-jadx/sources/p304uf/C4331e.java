package p304uf;

import bsh.C0353j;
import java.util.Iterator;
import p114hg.InterfaceC1711a;
import p178m3.AbstractC2777c;

/* JADX INFO: renamed from: uf.e */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4331e extends AbstractC2777c implements Iterator, InterfaceC1711a {

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ int f14472k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4331e(C4333g c4333g, int i9) {
        this.f14472k = i9;
        c4333g.getClass();
        this.f9018j = c4333g;
        this.f9016h = -1;
        this.f9017i = c4333g.f14484n;
        m6157d();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f14472k) {
            case 0:
                m6156c();
                int i9 = this.f9015g;
                C4333g c4333g = (C4333g) this.f9018j;
                if (i9 >= c4333g.f14482l) {
                    C0353j.m1307e();
                } else {
                    this.f9015g = i9 + 1;
                    this.f9016h = i9;
                    C4332f c4332f = new C4332f(c4333g, i9);
                    m6157d();
                }
                break;
            case 1:
                m6156c();
                int i10 = this.f9015g;
                C4333g c4333g2 = (C4333g) this.f9018j;
                if (i10 >= c4333g2.f14482l) {
                    C0353j.m1307e();
                } else {
                    this.f9015g = i10 + 1;
                    this.f9016h = i10;
                    Object obj = c4333g2.f14477g[i10];
                    m6157d();
                }
                break;
            default:
                m6156c();
                int i11 = this.f9015g;
                C4333g c4333g3 = (C4333g) this.f9018j;
                if (i11 >= c4333g3.f14482l) {
                    C0353j.m1307e();
                } else {
                    this.f9015g = i11 + 1;
                    this.f9016h = i11;
                    Object[] objArr = c4333g3.f14478h;
                    objArr.getClass();
                    Object obj2 = objArr[this.f9016h];
                    m6157d();
                }
                break;
        }
        return null;
    }
}
