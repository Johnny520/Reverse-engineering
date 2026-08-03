package p273s7;

import java.util.Iterator;
import okio.C3193a;
import p038ce.C0561n;
import p152k7.AbstractC2331a;
import p152k7.InterfaceC2336f;
import p209o7.C3069c;
import p229p7.C3341k;
import p257r7.AbstractC3721k;
import p257r7.C3713c;
import p314v7.C4490d;
import p379z7.C6107c;
import p379z7.C6112h;
import p379z7.C6115k;

/* JADX INFO: renamed from: s7.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3933b extends AbstractC3935d {

    /* JADX INFO: renamed from: p */
    public static final C0561n f12912p = new C0561n(26);

    /* JADX INFO: renamed from: o */
    public final C3341k f12913o;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3933b(C3341k c3341k, C3934c c3934c) {
        super(c3341k.f10754u, c3934c, C4490d.f14845l);
        this.f12913o = c3341k;
        c3341k.f10756w = new C3932a(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p209o7.C3068b
    /* JADX INFO: renamed from: W */
    public final void mo1894W(AbstractC2331a abstractC2331a) {
        ((C4490d) abstractC2331a).m8927N(null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p273s7.AbstractC3935d, p209o7.C3068b
    /* JADX INFO: renamed from: X */
    public final void mo5141X() {
        super.mo5141X();
        C3713c c3713c = this.f12913o.f10752s;
        int i9 = c3713c.get() & (-4);
        InterfaceC2336f interfaceC2336f = ((C3934c) this.f12915n).f9927l;
        c3713c.m7719P((byte) (i9 | (interfaceC2336f == AbstractC3721k.f12088n ? 2 : interfaceC2336f == AbstractC3721k.f12090p ? 1 : 0)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p273s7.AbstractC3935d
    /* JADX INFO: renamed from: l0 */
    public final C3069c mo8123l0() {
        return (C3934c) this.f12915n;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m0 */
    public final C4490d m8124m0(int i9) {
        C3069c c3069c = this.f12915n;
        InterfaceC2336f interfaceC2336f = ((C3934c) c3069c).f9927l;
        C3193a c3193a = AbstractC3721k.f12090p;
        if (interfaceC2336f == c3193a && ((C3934c) c3069c).f9927l == c3193a) {
            C3934c c3934c = (C3934c) c3069c;
            int size = c3934c.f9926k.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    i9 = -1;
                    break;
                }
                if (i9 == ((AbstractC3721k) c3934c.m6524Q(i10)).mo7729N()) {
                    i9 = i10;
                    break;
                }
                i10++;
            }
        }
        return (C4490d) m6524Q(i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n0 */
    public final Iterator m8125n0(boolean z9) {
        C6107c c6107c = this.f9926k;
        if (!z9) {
            return c6107c.iterator();
        }
        Iterator it = c6107c.iterator();
        return !it.hasNext() ? C6112h.f24664g : new C6115k(it, f12912p);
    }
}
