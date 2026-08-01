package p185m8;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import p024b9.AbstractC1043k;
import p036c9.InterfaceC1400a;

/* JADX INFO: renamed from: m8.m */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5092m extends AbstractC5066b implements Set, InterfaceC1400a {

    /* JADX INFO: renamed from: q */
    public static final a f15402q = new a(null);

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            return f15402q.m20614a(this, (Set) obj);
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return f15402q.m20615b(this);
    }

    /* JADX INFO: renamed from: m8.m$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final boolean m20614a(Set set, Set set2) {
            set.getClass();
            set2.getClass();
            if (set.size() != set2.size()) {
                return false;
            }
            return set.containsAll(set2);
        }

        /* JADX INFO: renamed from: b */
        public final int m20615b(Collection collection) {
            collection.getClass();
            Iterator it = collection.iterator();
            int iHashCode = 0;
            while (it.hasNext()) {
                Object next = it.next();
                iHashCode += next != null ? next.hashCode() : 0;
            }
            return iHashCode;
        }

        public a() {
        }
    }
}
