package p370yf;

import gg.AbstractC1426v;
import gg.C1427w;
import gg.InterfaceC1413i;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: yf.i */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6044i extends AbstractC6038c implements InterfaceC1413i {

    /* JADX INFO: renamed from: g */
    public final int f24497g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC6044i(int i9, InterfaceC5557c interfaceC5557c) {
        super(interfaceC5557c);
        this.f24497g = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // gg.InterfaceC1413i
    public final int getArity() {
        return this.f24497g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        AbstractC1426v.f4739a.getClass();
        return C1427w.m3835a(this);
    }
}
