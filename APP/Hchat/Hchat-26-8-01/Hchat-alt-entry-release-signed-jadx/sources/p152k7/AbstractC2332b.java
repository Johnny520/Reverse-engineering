package p152k7;

import java.util.Iterator;
import p038ce.C0561n;
import p209o7.C3068b;
import p241q7.C3445b;
import p379z7.C6107c;
import p379z7.C6112h;
import p379z7.C6115k;

/* JADX INFO: renamed from: k7.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2332b extends C3068b implements InterfaceC2336f {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC2332b() {
        super(null);
        m6532b0(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p152k7.AbstractC2331a
    /* JADX INFO: renamed from: B */
    public void mo1893B(C3445b c3445b) {
        mo6529Y(c3445b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p209o7.C3068b
    /* JADX INFO: renamed from: W */
    public final void mo1894W(AbstractC2331a abstractC2331a) {
        abstractC2331a.m5548J(null);
        abstractC2331a.m5546H(-1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p209o7.C3068b
    /* JADX INFO: renamed from: c0 */
    public final void mo5557c0(int i9) {
        int size = this.f9926k.size();
        for (int i10 = i9; i10 < size; i10++) {
            mo1894W(m6524Q(i10));
        }
        mo6520d0(i9, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j0 */
    public final Iterator m5558j0(boolean z9) {
        C6107c c6107c = this.f9926k;
        if (!z9) {
            return c6107c.iterator();
        }
        C0561n c0561n = new C0561n(9);
        Iterator it = c6107c.iterator();
        return !it.hasNext() ? C6112h.f24664g : new C6115k(it, c0561n);
    }
}
