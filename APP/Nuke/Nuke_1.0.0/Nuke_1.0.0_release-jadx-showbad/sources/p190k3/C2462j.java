package p190k3;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p117X2.AbstractC1665j;
import p160f3.AbstractC2162v;

/* JADX INFO: renamed from: k3.j */
/* JADX INFO: loaded from: classes.dex */
public class C2462j {

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f7942d = AtomicReferenceFieldUpdater.newUpdater(C2462j.class, Object.class, "_next$volatile");

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f7943e = AtomicReferenceFieldUpdater.newUpdater(C2462j.class, Object.class, "_prev$volatile");

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f7944f = AtomicReferenceFieldUpdater.newUpdater(C2462j.class, Object.class, "_removedRef$volatile");
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:5:0x000e */
    /* JADX INFO: renamed from: e */
    public final boolean m4390e(C2462j c2462j, int i5) {
        while (true) {
            C2462j c2462jM4391f = m4391f();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7943e;
            if (c2462jM4391f == null) {
                Object obj = atomicReferenceFieldUpdater.get(this);
                while (true) {
                    c2462jM4391f = (C2462j) obj;
                    if (!c2462jM4391f.mo3950i()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(c2462jM4391f);
                }
            }
            if (c2462jM4391f instanceof C2460h) {
                return (((C2460h) c2462jM4391f).f7940g & i5) == 0 && c2462jM4391f.m4390e(c2462j, i5);
            }
            atomicReferenceFieldUpdater.set(c2462j, c2462jM4391f);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f7942d;
            atomicReferenceFieldUpdater2.set(c2462j, this);
            while (!atomicReferenceFieldUpdater2.compareAndSet(c2462jM4391f, this, c2462j)) {
                if (atomicReferenceFieldUpdater2.get(c2462jM4391f) != this) {
                    break;
                }
            }
            c2462j.m4392g(this);
            return true;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0031, code lost:
    
        r6 = ((p190k3.C2467o) r6).f7955a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0039, code lost:
    
        if (r5.compareAndSet(r4, r3, r6) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0041, code lost:
    
        if (r5.get(r4) == r3) goto L43;
     */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C2462j m4391f() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7943e;
            C2462j c2462j = (C2462j) atomicReferenceFieldUpdater.get(this);
            C2462j c2462j2 = c2462j;
            while (true) {
                C2462j c2462j3 = null;
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f7942d;
                    Object obj = atomicReferenceFieldUpdater2.get(c2462j2);
                    if (obj == this) {
                        if (c2462j == c2462j2) {
                            return c2462j2;
                        }
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, c2462j, c2462j2)) {
                            if (atomicReferenceFieldUpdater.get(this) != c2462j) {
                                break;
                            }
                        }
                        return c2462j2;
                    }
                    if (mo3950i()) {
                        return null;
                    }
                    if (!(obj instanceof C2467o)) {
                        AbstractC1665j.m2983c(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
                        c2462j3 = c2462j2;
                        c2462j2 = (C2462j) obj;
                    } else {
                        if (c2462j3 != null) {
                            break;
                        }
                        c2462j2 = (C2462j) atomicReferenceFieldUpdater.get(c2462j2);
                    }
                }
                c2462j2 = c2462j3;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final void m4392g(C2462j c2462j) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7943e;
            C2462j c2462j2 = (C2462j) atomicReferenceFieldUpdater.get(c2462j);
            if (f7942d.get(this) != c2462j) {
                return;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(c2462j, c2462j2, this)) {
                if (atomicReferenceFieldUpdater.get(c2462j) != c2462j2) {
                    break;
                }
            }
            if (mo3950i()) {
                c2462j.m4391f();
                return;
            }
            return;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final C2462j m4393h() {
        C2462j c2462j;
        Object obj = f7942d.get(this);
        C2467o c2467o = obj instanceof C2467o ? (C2467o) obj : null;
        if (c2467o != null && (c2462j = c2467o.f7955a) != null) {
            return c2462j;
        }
        AbstractC1665j.m2983c(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        return (C2462j) obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public boolean mo3950i() {
        return f7942d.get(this) instanceof C2467o;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        return new C2461i(1, 0, AbstractC2162v.class, this, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;") + '@' + AbstractC2162v.m3987i(this);
    }
}
