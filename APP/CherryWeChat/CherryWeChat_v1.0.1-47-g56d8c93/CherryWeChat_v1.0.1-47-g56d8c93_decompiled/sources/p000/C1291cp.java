package p000;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: cp */
/* JADX INFO: loaded from: classes.dex */
public class C1291cp {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f4720a = AtomicReferenceFieldUpdater.newUpdater(C1291cp.class, Object.class, "_next$volatile");

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f4721b = AtomicReferenceFieldUpdater.newUpdater(C1291cp.class, Object.class, "_prev$volatile");

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f4722c = AtomicReferenceFieldUpdater.newUpdater(C1291cp.class, Object.class, "_removedRef$volatile");
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    /* JADX INFO: renamed from: c */
    public final boolean m2526c(C1291cp c1291cp, int i) {
        while (true) {
            C1291cp c1291cpM2527f = m2527f();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4721b;
            if (c1291cpM2527f == null) {
                Object obj = atomicReferenceFieldUpdater.get(this);
                while (true) {
                    c1291cpM2527f = (C1291cp) obj;
                    if (!c1291cpM2527f.mo1687i()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(c1291cpM2527f);
                }
            }
            if (c1291cpM2527f instanceof C2510so) {
                return (((C2510so) c1291cpM2527f).f8797d & i) == 0 && c1291cpM2527f.m2526c(c1291cp, i);
            }
            atomicReferenceFieldUpdater.set(c1291cp, c1291cpM2527f);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f4720a;
            atomicReferenceFieldUpdater2.set(c1291cp, this);
            while (!atomicReferenceFieldUpdater2.compareAndSet(c1291cpM2527f, this, c1291cp)) {
                if (atomicReferenceFieldUpdater2.get(c1291cpM2527f) != this) {
                    break;
                }
            }
            c1291cp.m2528g(this);
            return true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0031, code lost:
    
        r6 = ((p000.C0854Tv) r6).f2704a;
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
    public final C1291cp m2527f() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4721b;
            C1291cp c1291cp = (C1291cp) atomicReferenceFieldUpdater.get(this);
            C1291cp c1291cp2 = c1291cp;
            while (true) {
                C1291cp c1291cp3 = null;
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f4720a;
                    Object obj = atomicReferenceFieldUpdater2.get(c1291cp2);
                    if (obj == this) {
                        if (c1291cp == c1291cp2) {
                            return c1291cp2;
                        }
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, c1291cp, c1291cp2)) {
                            if (atomicReferenceFieldUpdater.get(this) != c1291cp) {
                                break;
                            }
                        }
                        return c1291cp2;
                    }
                    if (mo1687i()) {
                        return null;
                    }
                    if (!(obj instanceof C0854Tv)) {
                        c1291cp3 = c1291cp2;
                        c1291cp2 = (C1291cp) obj;
                    } else {
                        if (c1291cp3 != null) {
                            break;
                        }
                        c1291cp2 = (C1291cp) atomicReferenceFieldUpdater.get(c1291cp2);
                    }
                }
                c1291cp2 = c1291cp3;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m2528g(C1291cp c1291cp) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4721b;
            C1291cp c1291cp2 = (C1291cp) atomicReferenceFieldUpdater.get(c1291cp);
            if (f4720a.get(this) != c1291cp) {
                return;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(c1291cp, c1291cp2, this)) {
                if (atomicReferenceFieldUpdater.get(c1291cp) != c1291cp2) {
                    break;
                }
            }
            if (mo1687i()) {
                c1291cp.m2527f();
                return;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: h */
    public final C1291cp m2529h() {
        C1291cp c1291cp;
        Object obj = f4720a.get(this);
        C0854Tv c0854Tv = obj instanceof C0854Tv ? (C0854Tv) obj : null;
        return (c0854Tv == null || (c1291cp = c0854Tv.f2704a) == null) ? (C1291cp) obj : c1291cp;
    }

    /* JADX INFO: renamed from: i */
    public boolean mo1687i() {
        return f4720a.get(this) instanceof C0854Tv;
    }

    public String toString() {
        return new C1230bp(1, AbstractC0148Dc.class, this, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;") + '@' + AbstractC0148Dc.m278l(this);
    }
}
