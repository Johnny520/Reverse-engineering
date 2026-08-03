package vg;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p249qg.AbstractC3603v;
import p251r.C3627l;

/* JADX INFO: renamed from: vg.i */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class C4560i {

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f15037g = AtomicReferenceFieldUpdater.newUpdater(C4560i.class, Object.class, "_next$volatile");

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f15038h = AtomicReferenceFieldUpdater.newUpdater(C4560i.class, Object.class, "_prev$volatile");

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f15039i = AtomicReferenceFieldUpdater.newUpdater(C4560i.class, Object.class, "_removedRef$volatile");
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:5:0x000e */
    /* JADX INFO: renamed from: e */
    public final boolean m8999e(C4560i c4560i, int i9) {
        while (true) {
            C4560i c4560iM9000f = m9000f();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15038h;
            if (c4560iM9000f == null) {
                Object obj = atomicReferenceFieldUpdater.get(this);
                while (true) {
                    c4560iM9000f = (C4560i) obj;
                    if (!c4560iM9000f.mo7478i()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(c4560iM9000f);
                }
            }
            if (c4560iM9000f instanceof C4559h) {
                return (((C4559h) c4560iM9000f).f15036j & i9) == 0 && c4560iM9000f.m8999e(c4560i, i9);
            }
            atomicReferenceFieldUpdater.set(c4560i, c4560iM9000f);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f15037g;
            atomicReferenceFieldUpdater2.set(c4560i, this);
            while (!atomicReferenceFieldUpdater2.compareAndSet(c4560iM9000f, this, c4560i)) {
                if (atomicReferenceFieldUpdater2.get(c4560iM9000f) != this) {
                    break;
                }
            }
            c4560i.m9001g(this);
            return true;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0031, code lost:
    
        r6 = ((vg.C4565n) r6).f15050a;
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
    public final C4560i m9000f() {
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15038h;
            C4560i c4560i = (C4560i) atomicReferenceFieldUpdater.get(this);
            C4560i c4560i2 = c4560i;
            while (true) {
                C4560i c4560i3 = null;
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f15037g;
                    Object obj = atomicReferenceFieldUpdater2.get(c4560i2);
                    if (obj == this) {
                        if (c4560i != c4560i2) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, c4560i, c4560i2)) {
                                if (atomicReferenceFieldUpdater.get(this) != c4560i) {
                                    break;
                                }
                            }
                            break loop0;
                        }
                        break;
                    }
                    if (mo7478i()) {
                        return null;
                    }
                    if (!(obj instanceof C4565n)) {
                        obj.getClass();
                        c4560i3 = c4560i2;
                        c4560i2 = (C4560i) obj;
                    } else {
                        if (c4560i3 != null) {
                            break;
                        }
                        c4560i2 = (C4560i) atomicReferenceFieldUpdater.get(c4560i2);
                    }
                }
                c4560i2 = c4560i3;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final void m9001g(C4560i c4560i) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15038h;
            C4560i c4560i2 = (C4560i) atomicReferenceFieldUpdater.get(c4560i);
            if (f15037g.get(this) != c4560i) {
                return;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(c4560i, c4560i2, this)) {
                if (atomicReferenceFieldUpdater.get(c4560i) != c4560i2) {
                    break;
                }
            }
            if (mo7478i()) {
                c4560i.m9000f();
                return;
            }
            return;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final C4560i m9002h() {
        Object obj = f15037g.get(this);
        C4565n c4565n = obj instanceof C4565n ? (C4565n) obj : null;
        if (c4565n != null) {
            return c4565n.f15050a;
        }
        obj.getClass();
        return (C4560i) obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public boolean mo7478i() {
        return f15037g.get(this) instanceof C4565n;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        return new C3627l(1, 1, AbstractC3603v.class, this, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;") + '@' + AbstractC3603v.m7556j(this);
    }
}
