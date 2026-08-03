package p379z7;

import bsh.C0353j;
import java.util.Iterator;
import java.util.function.Predicate;

/* JADX INFO: renamed from: z7.k */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class C6115k implements Iterator, Predicate {

    /* JADX INFO: renamed from: g */
    public final Iterator f24668g;

    /* JADX INFO: renamed from: h */
    public Object f24669h;

    /* JADX INFO: renamed from: i */
    public final Predicate f24670i;

    /* JADX INFO: renamed from: j */
    public boolean f24671j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C6115k(Iterator it, Predicate predicate) {
        this.f24668g = it;
        this.f24670i = predicate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final Object m10878a() {
        Object next;
        Predicate predicate;
        if (this.f24669h == null) {
            while (true) {
                Iterator it = this.f24668g;
                if (!it.hasNext()) {
                    break;
                }
                next = it.next();
                if (next != null && test(next) && ((predicate = this.f24670i) == null || predicate.test(next))) {
                    break;
                }
            }
            this.f24669h = next;
        }
        return this.f24669h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f24671j) {
            return false;
        }
        if (m10878a() != null) {
            return true;
        }
        this.f24671j = true;
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final Object next() {
        Object objM10878a = m10878a();
        if (objM10878a != null) {
            this.f24669h = null;
            return objM10878a;
        }
        C0353j.m1307e();
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean test(Object obj) {
        return obj != null;
    }
}
