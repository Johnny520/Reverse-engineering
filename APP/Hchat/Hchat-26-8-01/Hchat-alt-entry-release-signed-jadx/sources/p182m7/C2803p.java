package p182m7;

import java.util.Iterator;

/* JADX INFO: renamed from: m7.p */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2803p implements Iterator {

    /* JADX INFO: renamed from: g */
    public AbstractC2804q f9060g;

    /* JADX INFO: renamed from: h */
    public final Class f9061h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2803p(C2797j c2797j) {
        this.f9060g = C2793f.class.isInstance(c2797j) ? null : c2797j;
        this.f9061h = C2793f.class;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f9060g != null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final Object next() {
        Class cls;
        AbstractC2804q abstractC2804q = this.f9060g;
        AbstractC2804q abstractC2804qMo6188L = abstractC2804q.mo6188L();
        if (abstractC2804qMo6188L != null && (cls = this.f9061h) != null && cls.isInstance(abstractC2804qMo6188L)) {
            abstractC2804qMo6188L = null;
        }
        this.f9060g = abstractC2804qMo6188L;
        return abstractC2804q;
    }
}
