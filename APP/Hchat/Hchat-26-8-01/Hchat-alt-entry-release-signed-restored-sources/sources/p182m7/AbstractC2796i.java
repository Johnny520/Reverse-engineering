package p182m7;

import bsh.C0353j;
import java.util.Iterator;
import p025bc.C0259i;
import p047d7.C0719b;
import p136j8.AbstractC2091b;
import p152k7.AbstractC2333c;
import p166l7.C2522j;
import p379z7.C6110f;
import p379z7.C6112h;

/* JADX INFO: renamed from: m7.i */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2796i extends AbstractC2804q {

    /* JADX INFO: renamed from: l */
    public C2805r f9052l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p182m7.AbstractC2804q
    /* JADX INFO: renamed from: L */
    public final AbstractC2804q mo6188L() {
        return (AbstractC2796i) super.mo6188L();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p182m7.AbstractC2804q
    /* JADX INFO: renamed from: M */
    public void mo6189M() {
        Iterator it = mo6185R().f9926k.iterator();
        while (it.hasNext()) {
            ((AbstractC2804q) it.next()).mo6189M();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p182m7.AbstractC2804q
    /* JADX INFO: renamed from: N */
    public void mo6190N() {
        mo6185R().m6521N();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: O */
    public final C2797j m6191O(String str) {
        C6110f c6110f = new C6110f(mo6185R().f9926k.iterator(), C2797j.class, new C0259i(str, 1));
        return (C2797j) (!c6110f.hasNext() ? null : c6110f.next());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: P */
    public final Iterator m6192P(String... strArr) {
        return strArr.length == 0 ? C6112h.f24664g : m6193Q(strArr, 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Q */
    public final Iterator m6193Q(String[] strArr, int i9) {
        int length = strArr.length - 1;
        if (i9 > length) {
            return C6112h.f24664g;
        }
        C6110f c6110f = new C6110f(mo6185R().f9926k.iterator(), C2797j.class, new C0259i(strArr[i9], 1));
        return (i9 == length || !c6110f.hasNext()) ? c6110f : new C2795h(c6110f, strArr, i9 + 1);
    }

    /* JADX INFO: renamed from: R */
    public abstract C0719b mo6185R();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: S */
    public final AbstractC2796i m6194S() {
        return (AbstractC2796i) super.mo6188L();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: T */
    public final C2811x m6195T(int i9) {
        AbstractC2333c c2810w;
        C2811x c2812y;
        if (i9 == 8 || i9 == 6 || i9 == 9) {
            if (i9 == 8) {
                c2810w = new C2799l();
            } else if (i9 == 6) {
                c2810w = new C2800m();
            } else {
                if (i9 != 9) {
                    C0353j.m1309g("Invalid chunk type: ".concat(AbstractC2091b.m5174u(i9)));
                    return null;
                }
                c2810w = new C2810w();
            }
            c2812y = new C2812y(c2810w, 1);
        } else {
            c2812y = new C2811x(new C2522j(1), 1);
        }
        mo6185R().mo6519M(c2812y);
        return c2812y;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p182m7.AbstractC2804q
    public String toString() {
        m6194S();
        if (this.f9052l == null) {
            this.f9052l = new C2805r(this);
        }
        return this.f9062k.toString();
    }
}
