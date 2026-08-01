package p000;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: vr */
/* JADX INFO: loaded from: classes.dex */
public class C0829vr {

    /* JADX INFO: renamed from: a */
    public static final AtomicReferenceFieldUpdater f4882a = AtomicReferenceFieldUpdater.newUpdater(C0829vr.class, Object.class, "_next");

    /* JADX INFO: renamed from: b */
    public static final AtomicReferenceFieldUpdater f4883b = AtomicReferenceFieldUpdater.newUpdater(C0829vr.class, Object.class, "_prev");

    /* JADX INFO: renamed from: c */
    public static final AtomicReferenceFieldUpdater f4884c = AtomicReferenceFieldUpdater.newUpdater(C0829vr.class, Object.class, "_removedRef");
    private volatile Object _next = this;
    private volatile Object _prev = this;
    private volatile Object _removedRef;

    /* JADX WARN: Code restructure failed: missing block: B:25:0x003e, code lost:
    
        r6 = ((p000.m00) r6).f3121a;
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
    public final p000.C0829vr m2521e() {
        /*
            r9 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = p000.C0829vr.f4883b
            java.lang.Object r1 = r0.get(r9)
            vr r1 = (p000.C0829vr) r1
            r2 = 0
            r3 = r1
        La:
            r4 = r2
        Lb:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = p000.C0829vr.f4882a
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
            boolean r7 = r9.mo1877j()
            if (r7 == 0) goto L2b
            return r2
        L2b:
            if (r6 != 0) goto L2e
        L2d:
            return r3
        L2e:
            boolean r7 = r6 instanceof p000.AbstractC0166dx
            if (r7 == 0) goto L38
            dx r6 = (p000.AbstractC0166dx) r6
            r6.mo961a(r3)
            goto L0
        L38:
            boolean r7 = r6 instanceof p000.m00
            if (r7 == 0) goto L58
            if (r4 == 0) goto L51
            m00 r6 = (p000.m00) r6
            vr r6 = r6.f3121a
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
            vr r3 = (p000.C0829vr) r3
            goto Lb
        L58:
            java.lang.String r4 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"
            p000.AbstractC0346ip.m1501m(r4, r6)
            r4 = r6
            vr r4 = (p000.C0829vr) r4
            r8 = r4
            r4 = r3
            r3 = r8
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0829vr.m2521e():vr");
    }

    /* JADX INFO: renamed from: g */
    public final void m2522g(C0829vr c0829vr) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4883b;
            C0829vr c0829vr2 = (C0829vr) atomicReferenceFieldUpdater.get(c0829vr);
            if (m2523h() != c0829vr) {
                return;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(c0829vr, c0829vr2, this)) {
                if (atomicReferenceFieldUpdater.get(c0829vr) != c0829vr2) {
                    break;
                }
            }
            if (mo1877j()) {
                c0829vr.m2521e();
                return;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: h */
    public final Object m2523h() {
        while (true) {
            Object obj = f4882a.get(this);
            if (!(obj instanceof AbstractC0166dx)) {
                return obj;
            }
            ((AbstractC0166dx) obj).mo961a(this);
        }
    }

    /* JADX INFO: renamed from: i */
    public final C0829vr m2524i() {
        C0829vr c0829vr;
        Object objM2523h = m2523h();
        m00 m00Var = objM2523h instanceof m00 ? (m00) objM2523h : null;
        if (m00Var != null && (c0829vr = m00Var.f3121a) != null) {
            return c0829vr;
        }
        AbstractC0346ip.m1501m("null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }", objM2523h);
        return (C0829vr) objM2523h;
    }

    /* JADX INFO: renamed from: j */
    public boolean mo1877j() {
        return m2523h() instanceof m00;
    }

    public String toString() {
        return new C0792ur(this) + '@' + AbstractC0222ff.m1197s(this);
    }
}
