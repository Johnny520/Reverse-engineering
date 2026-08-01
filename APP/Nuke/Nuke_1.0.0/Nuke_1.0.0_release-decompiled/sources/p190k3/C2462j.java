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
        To view partially-correct add '--show-bad-code' argument
    */
    public final p190k3.C2462j m4391f() {
        /*
            r9 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = p190k3.C2462j.f7943e
            java.lang.Object r1 = r0.get(r9)
            k3.j r1 = (p190k3.C2462j) r1
            r2 = 0
            r3 = r1
        La:
            r4 = r2
        Lb:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = p190k3.C2462j.f7942d
            java.lang.Object r6 = r5.get(r3)
            if (r6 != r9) goto L24
            if (r1 != r3) goto L16
            return r3
        L16:
            boolean r2 = r0.compareAndSet(r9, r1, r3)
            if (r2 == 0) goto L1d
            return r3
        L1d:
            java.lang.Object r2 = r0.get(r9)
            if (r2 == r1) goto L16
            goto L0
        L24:
            boolean r7 = r9.mo3950i()
            if (r7 == 0) goto L2b
            return r2
        L2b:
            boolean r7 = r6 instanceof p190k3.C2467o
            if (r7 == 0) goto L4b
            if (r4 == 0) goto L44
            k3.o r6 = (p190k3.C2467o) r6
            k3.j r6 = r6.f7955a
        L35:
            boolean r7 = r5.compareAndSet(r4, r3, r6)
            if (r7 == 0) goto L3d
            r3 = r4
            goto La
        L3d:
            java.lang.Object r7 = r5.get(r4)
            if (r7 == r3) goto L35
            goto L0
        L44:
            java.lang.Object r3 = r0.get(r3)
            k3.j r3 = (p190k3.C2462j) r3
            goto Lb
        L4b:
            java.lang.String r4 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode"
            p117X2.AbstractC1665j.m2983c(r6, r4)
            r4 = r6
            k3.j r4 = (p190k3.C2462j) r4
            r8 = r4
            r4 = r3
            r3 = r8
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: p190k3.C2462j.m4391f():k3.j");
    }

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

    /* JADX INFO: renamed from: i */
    public boolean mo3950i() {
        return f7942d.get(this) instanceof C2467o;
    }

    public String toString() {
        return new C2461i(1, 0, AbstractC2162v.class, this, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;") + '@' + AbstractC2162v.m3987i(this);
    }
}
