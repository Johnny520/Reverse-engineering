package p007a7;

import java.util.Iterator;
import java.util.List;
import p034c7.AbstractC0409e;

/* JADX INFO: renamed from: a7.e */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0022e implements Iterable {

    /* JADX INFO: renamed from: g */
    public final List f75g;

    /* JADX INFO: renamed from: h */
    public final AbstractC0409e f76h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0022e(AbstractC0409e abstractC0409e, List list) {
        this.f76h = abstractC0409e;
        this.f75g = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0022e) {
            return this.f76h.m1368a().equals(((C0022e) obj).f76h.m1368a());
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f76h.m1368a().hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f75g.iterator();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return this.f76h.m1368a();
    }
}
