package p207o5;

import bsh.C0353j;
import java.util.Iterator;

/* JADX INFO: renamed from: o5.n */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3059n implements Iterator {

    /* JADX INFO: renamed from: g */
    public int f9894g = 0;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ AbstractC3060o f9895h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3059n(AbstractC3060o abstractC3060o) {
        this.f9895h = abstractC3060o;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f9894g < this.f9895h.size();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            C0353j.m1307e();
            return null;
        }
        int i9 = this.f9894g;
        this.f9894g = i9 + 1;
        return this.f9895h.mo5520a(i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
