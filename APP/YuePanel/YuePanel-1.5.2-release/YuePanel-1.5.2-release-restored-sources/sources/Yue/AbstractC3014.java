package Yue;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: Yue.ۥۣ۟۟ۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7470(version = "1.1")
public abstract class AbstractC3014<E> extends AbstractC2979<E> implements Set<E>, InterfaceC5591 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @InterfaceC6399
    public static final C0027 f4377 = new C0027(null);

    /* JADX INFO: renamed from: Yue.ۥۣ۟۟ۢ$ۥ */
    public static final class C0027 {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: Yue.ۥۣ۟۟ۢ.ۥ.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ C0027(C4335 c4335) {
            this();
        }

        /* JADX INFO: renamed from: ۥ */
        public final boolean m76(@InterfaceC6399 Set<?> set, @InterfaceC6399 Set<?> set2) {
            C5499.m17103(set, "c");
            C5499.m17103(set2, "other");
            if (set.size() != set2.size()) {
                return false;
            }
            return set.containsAll(set2);
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public final int m77(@InterfaceC6399 Collection<?> collection) {
            C5499.m17103(collection, "c");
            Iterator<?> it = collection.iterator();
            int iHashCode = 0;
            while (it.hasNext()) {
                Object next = it.next();
                iHashCode += next != null ? next.hashCode() : 0;
            }
            return iHashCode;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C0027() {
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(@InterfaceC6489 Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            return f4377.m76(this, (Set) obj);
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return f4377.m77(this);
    }

    @Override // Yue.AbstractC2979, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
