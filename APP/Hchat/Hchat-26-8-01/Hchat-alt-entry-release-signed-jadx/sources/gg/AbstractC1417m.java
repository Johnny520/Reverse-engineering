package gg;

import java.io.Serializable;

/* JADX INFO: renamed from: gg.m */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1417m implements InterfaceC1413i, Serializable {
    private final int arity;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC1417m(int i9) {
        this.arity = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // gg.InterfaceC1413i
    public int getArity() {
        return this.arity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        AbstractC1426v.f4739a.getClass();
        return C1427w.m3835a(this);
    }
}
