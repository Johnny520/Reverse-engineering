package p370yf;

import gg.AbstractC1426v;
import gg.C1427w;
import gg.InterfaceC1413i;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: yf.h */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6043h extends AbstractC6042g implements InterfaceC1413i {
    private final int arity;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC6043h(InterfaceC5557c interfaceC5557c) {
        super(interfaceC5557c);
        this.arity = 2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // gg.InterfaceC1413i
    public int getArity() {
        return this.arity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        AbstractC1426v.f4739a.getClass();
        return C1427w.m3835a(this);
    }
}
