package p000;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: zr */
/* JADX INFO: loaded from: classes.dex */
public class C0977zr {

    /* JADX INFO: renamed from: a */
    public static final AtomicReferenceFieldUpdater f5613a = AtomicReferenceFieldUpdater.newUpdater(C0977zr.class, Object.class, "_next");

    /* JADX INFO: renamed from: b */
    public static final AtomicReferenceFieldUpdater f5614b = AtomicReferenceFieldUpdater.newUpdater(C0977zr.class, Object.class, "_prev");

    /* JADX INFO: renamed from: c */
    public static final AtomicReferenceFieldUpdater f5615c = AtomicReferenceFieldUpdater.newUpdater(C0977zr.class, Object.class, "_removedRef");
    private volatile Object _next = this;
    private volatile Object _prev = this;
    private volatile Object _removedRef;

    /* JADX WARN: Code restructure failed: missing block: B:25:0x003e, code lost:
    
        r6 = ((p000.t00) r6).f4384a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0046, code lost:
    
        if (r5.compareAndSet(r4, r3, r6) == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x004e, code lost:
    
        if (r5.get(r4) == r3) goto L51;
     */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p000.C0977zr m2849e() {
        /*
            r9 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = p000.C0977zr.f5614b
            java.lang.Object r1 = r0.get(r9)
            zr r1 = (p000.C0977zr) r1
            r2 = 0
            r3 = r1
        La:
            r4 = r2
        Lb:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = p000.C0977zr.f5613a
            java.lang.Object r6 = r5.get(r3)
            if (r6 != r9) goto L24
            if (r1 != r3) goto L16
            goto L2d
        L16:
            boolean r2 = r0.compareAndSet(r9, r1, r3)
            if (r2 == 0) goto L1d
            goto L2d
        L1d:
            java.lang.Object r2 = r0.get(r9)
            if (r2 == r1) goto L16
            goto L0
        L24:
            boolean r7 = r9.mo2499j()
            if (r7 == 0) goto L2b
            return r2
        L2b:
            if (r6 != 0) goto L2e
        L2d:
            return r3
        L2e:
            boolean r7 = r6 instanceof p000.AbstractC0464lx
            if (r7 == 0) goto L38
            lx r6 = (p000.AbstractC0464lx) r6
            r6.mo1780a(r3)
            goto L0
        L38:
            boolean r7 = r6 instanceof p000.t00
            if (r7 == 0) goto L58
            if (r4 == 0) goto L51
            t00 r6 = (p000.t00) r6
            zr r6 = r6.f4384a
        L42:
            boolean r7 = r5.compareAndSet(r4, r3, r6)
            if (r7 == 0) goto L4a
            r3 = r4
            goto La
        L4a:
            java.lang.Object r7 = r5.get(r4)
            if (r7 == r3) goto L42
            goto L0
        L51:
            java.lang.Object r3 = r0.get(r3)
            zr r3 = (p000.C0977zr) r3
            goto Lb
        L58:
            java.lang.String r4 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"
            p000.AbstractC0493mp.m1855e(r4, r6)
            r4 = r6
            zr r4 = (p000.C0977zr) r4
            r8 = r4
            r4 = r3
            r3 = r8
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0977zr.m2849e():zr");
    }

    /* JADX INFO: renamed from: g */
    public final void m2850g(C0977zr c0977zr) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5614b;
            C0977zr c0977zr2 = (C0977zr) atomicReferenceFieldUpdater.get(c0977zr);
            if (m2851h() != c0977zr) {
                return;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(c0977zr, c0977zr2, this)) {
                if (atomicReferenceFieldUpdater.get(c0977zr) != c0977zr2) {
                    break;
                }
            }
            if (mo2499j()) {
                c0977zr.m2849e();
                return;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: h */
    public final Object m2851h() {
        while (true) {
            Object obj = f5613a.get(this);
            if (!(obj instanceof AbstractC0464lx)) {
                return obj;
            }
            ((AbstractC0464lx) obj).mo1780a(this);
        }
    }

    /* JADX INFO: renamed from: i */
    public final C0977zr m2852i() {
        C0977zr c0977zr;
        Object objM2851h = m2851h();
        t00 t00Var = objM2851h instanceof t00 ? (t00) objM2851h : null;
        if (t00Var != null && (c0977zr = t00Var.f4384a) != null) {
            return c0977zr;
        }
        AbstractC0493mp.m1855e("null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }", objM2851h);
        return (C0977zr) objM2851h;
    }

    /* JADX INFO: renamed from: j */
    public boolean mo2499j() {
        return m2851h() instanceof t00;
    }

    public String toString() {
        return new C0940yr(this) + '@' + AbstractC0259gf.m1262x(this);
    }
}
