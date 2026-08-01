package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class up implements defpackage.vo {
    public static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater b = null;
    public static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater c = null;
    public static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater d = null;
    private volatile java.lang.Object _exceptionsHolder;
    private volatile int _isCompleting;
    private volatile java.lang.Object _rootCause;
    public final defpackage.mw a;

    static {
            java.lang.String r0 = "_isCompleting"
            java.lang.Class<up> r1 = defpackage.up.class
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r1, r0)
            defpackage.up.b = r0
            java.lang.String r0 = "_rootCause"
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r2, r0)
            defpackage.up.c = r0
            java.lang.String r0 = "_exceptionsHolder"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r2, r0)
            defpackage.up.d = r0
            return
    }

    public up(defpackage.mw r1, java.lang.Throwable r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r1 = 0
            r0._isCompleting = r1
            r0._rootCause = r2
            return
    }

    @Override // defpackage.vo
    public final boolean a() {
            r1 = this;
            java.lang.Throwable r0 = r1.c()
            if (r0 != 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    public final void b(java.lang.Throwable r5) {
            r4 = this;
            java.lang.Throwable r0 = r4.c()
            if (r0 != 0) goto Lc
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.up.c
            r0.set(r4, r5)
            return
        Lc:
            if (r5 != r0) goto Lf
            goto L21
        Lf:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.up.d
            java.lang.Object r1 = r0.get(r4)
            if (r1 != 0) goto L1b
            r0.set(r4, r5)
            return
        L1b:
            boolean r2 = r1 instanceof java.lang.Throwable
            if (r2 == 0) goto L32
            if (r5 != r1) goto L22
        L21:
            return
        L22:
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 4
            r2.<init>(r3)
            r2.add(r1)
            r2.add(r5)
            r0.set(r4, r2)
            return
        L32:
            boolean r0 = r1 instanceof java.util.ArrayList
            if (r0 == 0) goto L3c
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            r1.add(r5)
            return
        L3c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "State is "
            r0.<init>(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
    }

    public final java.lang.Throwable c() {
            r1 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.up.c
            java.lang.Object r0 = r0.get(r1)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            return r0
    }

    @Override // defpackage.vo
    public final defpackage.mw d() {
            r1 = this;
            mw r0 = r1.a
            return r0
    }

    public final boolean e() {
            r1 = this;
            java.lang.Throwable r0 = r1.c()
            if (r0 == 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    public final boolean f() {
            r1 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = defpackage.up.b
            int r0 = r0.get(r1)
            if (r0 == 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    public final java.util.ArrayList g(java.lang.Throwable r5) {
            r4 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.up.d
            java.lang.Object r1 = r0.get(r4)
            r2 = 4
            if (r1 != 0) goto Lf
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r2)
            goto L23
        Lf:
            boolean r3 = r1 instanceof java.lang.Throwable
            if (r3 == 0) goto L1d
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r2)
            r3.add(r1)
            r1 = r3
            goto L23
        L1d:
            boolean r2 = r1 instanceof java.util.ArrayList
            if (r2 == 0) goto L3e
            java.util.ArrayList r1 = (java.util.ArrayList) r1
        L23:
            java.lang.Throwable r2 = r4.c()
            if (r2 == 0) goto L2d
            r3 = 0
            r1.add(r3, r2)
        L2d:
            if (r5 == 0) goto L38
            boolean r2 = r5.equals(r2)
            if (r2 != 0) goto L38
            r1.add(r5)
        L38:
            l0 r5 = defpackage.ip.j
            r0.set(r4, r5)
            return r1
        L3e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "State is "
            r0.<init>(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Finishing[cancelling="
            r0.<init>(r1)
            boolean r1 = r2.e()
            r0.append(r1)
            java.lang.String r1 = ", completing="
            r0.append(r1)
            boolean r1 = r2.f()
            r0.append(r1)
            java.lang.String r1 = ", rootCause="
            r0.append(r1)
            java.lang.Throwable r1 = r2.c()
            r0.append(r1)
            java.lang.String r1 = ", exceptions="
            r0.append(r1)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = defpackage.up.d
            java.lang.Object r1 = r1.get(r2)
            r0.append(r1)
            java.lang.String r1 = ", list="
            r0.append(r1)
            mw r1 = r2.a
            r0.append(r1)
            r1 = 93
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
