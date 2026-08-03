package p370yf;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p249qg.AbstractC3591p;
import p249qg.C3564g;
import vg.AbstractC4552a;
import vg.C4557f;
import wf.C5558d;
import wf.InterfaceC5557c;
import wf.InterfaceC5559e;
import wf.InterfaceC5561g;

/* JADX INFO: renamed from: yf.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6038c extends AbstractC6036a {
    private final InterfaceC5561g _context;
    private transient InterfaceC5557c intercepted;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC6038c(InterfaceC5557c interfaceC5557c) {
        this(interfaceC5557c, interfaceC5557c != null ? interfaceC5557c.getContext() : null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // wf.InterfaceC5557c
    public InterfaceC5561g getContext() {
        InterfaceC5561g interfaceC5561g = this._context;
        interfaceC5561g.getClass();
        return interfaceC5561g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final InterfaceC5557c intercepted() {
        InterfaceC5557c interfaceC5557c = this.intercepted;
        if (interfaceC5557c != null) {
            return interfaceC5557c;
        }
        AbstractC3591p abstractC3591p = (AbstractC3591p) getContext().mo2062s(C5558d.f22660g);
        InterfaceC5557c c4557f = abstractC3591p != null ? new C4557f(abstractC3591p, this) : this;
        this.intercepted = c4557f;
        return c4557f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public void releaseIntercepted() {
        InterfaceC5557c interfaceC5557c = this.intercepted;
        if (interfaceC5557c != null && interfaceC5557c != this) {
            InterfaceC5559e interfaceC5559eMo2062s = getContext().mo2062s(C5558d.f22660g);
            interfaceC5559eMo2062s.getClass();
            C4557f c4557f = (C4557f) interfaceC5557c;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C4557f.f15025n;
            while (atomicReferenceFieldUpdater.get(c4557f) == AbstractC4552a.f15015c) {
            }
            Object obj = atomicReferenceFieldUpdater.get(c4557f);
            C3564g c3564g = obj instanceof C3564g ? (C3564g) obj : null;
            if (c3564g != null) {
                c3564g.m7509l();
            }
        }
        this.intercepted = C6037b.f24494g;
    }

    public AbstractC6038c(InterfaceC5557c interfaceC5557c, InterfaceC5561g interfaceC5561g) {
        super(interfaceC5557c);
        this._context = interfaceC5561g;
    }
}
