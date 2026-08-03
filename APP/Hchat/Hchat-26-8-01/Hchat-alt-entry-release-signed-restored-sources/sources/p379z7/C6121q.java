package p379z7;

import java.util.Iterator;

/* JADX INFO: renamed from: z7.q */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C6121q implements Iterator {

    /* JADX INFO: renamed from: g */
    public Object f24687g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static Iterator m10883a(Object obj) {
        if (obj == null) {
            return C6112h.f24664g;
        }
        C6121q c6121q = new C6121q();
        c6121q.f24687g = obj;
        return c6121q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f24687g != null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final Object next() {
        Object obj = this.f24687g;
        this.f24687g = null;
        return obj;
    }
}
