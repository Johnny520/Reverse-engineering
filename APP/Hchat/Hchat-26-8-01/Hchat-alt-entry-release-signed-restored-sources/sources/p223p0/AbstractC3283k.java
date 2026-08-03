package p223p0;

import java.util.Iterator;
import p114hg.InterfaceC1711a;

/* JADX INFO: renamed from: p0.k */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3283k implements Iterator, InterfaceC1711a {

    /* JADX INFO: renamed from: g */
    public Object[] f10444g = C3282j.f10439e.f10443d;

    /* JADX INFO: renamed from: h */
    public int f10445h;

    /* JADX INFO: renamed from: i */
    public int f10446i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m6967a(Object[] objArr, int i9, int i10) {
        this.f10444g = objArr;
        this.f10445h = i9;
        this.f10446i = i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f10446i < this.f10445h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
