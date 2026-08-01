package p000;

/* JADX INFO: renamed from: и */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1110 implements com.google.common.util.concurrent.ListenableFuture {

    /* JADX INFO: renamed from: δ */
    public static final java.util.logging.Logger f13436 = null;

    /* JADX INFO: renamed from: ε */
    public static final p000.h62 f13437 = null;

    /* JADX INFO: renamed from: ζ */
    public static final java.lang.Object f13438 = null;

    /* JADX INFO: renamed from: α */
    public volatile java.lang.Object f13439;

    /* JADX INFO: renamed from: β */
    public volatile p000.C1106 f13440;

    /* JADX INFO: renamed from: γ */
    public volatile p000.C1109 f13441;

    static {
            java.lang.String r0 = "β"
            java.lang.String r1 = "α"
            java.lang.Class<з> r2 = p000.C1109.class
            java.lang.String r3 = "guava.concurrent.generate_cancellation_cause"
            java.lang.String r4 = "false"
            java.lang.String r3 = java.lang.System.getProperty(r3, r4)
            java.lang.Boolean.parseBoolean(r3)
            java.lang.Class<и> r3 = p000.AbstractC1110.class
            java.lang.String r3 = r3.getName()
            java.util.logging.Logger r3 = java.util.logging.Logger.getLogger(r3)
            p000.AbstractC1110.f13436 = r3
            е r3 = new е     // Catch: java.lang.Throwable -> L44
            java.lang.Class<java.lang.Thread> r4 = java.lang.Thread.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r4, r1)     // Catch: java.lang.Throwable -> L44
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r2, r0)     // Catch: java.lang.Throwable -> L44
            java.lang.Class<и> r4 = p000.AbstractC1110.class
            java.lang.String r5 = "γ"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r4, r2, r5)     // Catch: java.lang.Throwable -> L44
            java.lang.Class<и> r4 = p000.AbstractC1110.class
            java.lang.Class<д> r5 = p000.C1106.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r4, r5, r0)     // Catch: java.lang.Throwable -> L44
            java.lang.Class<и> r4 = p000.AbstractC1110.class
            java.lang.Class<java.lang.Object> r5 = java.lang.Object.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r4, r5, r1)     // Catch: java.lang.Throwable -> L44
            r3.<init>(r2, r0, r1)     // Catch: java.lang.Throwable -> L44
            r0 = 0
            goto L4a
        L44:
            r0 = move-exception
            ж r3 = new ж
            r3.<init>()
        L4a:
            p000.AbstractC1110.f13437 = r3
            if (r0 == 0) goto L57
            java.util.logging.Logger r1 = p000.AbstractC1110.f13436
            java.util.logging.Level r2 = java.util.logging.Level.SEVERE
            java.lang.String r3 = "SafeAtomicHelper is broken!"
            r1.log(r2, r3, r0)
        L57:
            return
    }

    /* JADX INFO: renamed from: β */
    public static java.lang.Object m7285(java.util.concurrent.Future r1) {
            r0 = 0
        L1:
            java.lang.Object r1 = r1.get()     // Catch: java.lang.Throwable -> Lf java.lang.InterruptedException -> L1a
            if (r0 == 0) goto Le
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        Le:
            return r1
        Lf:
            r1 = move-exception
            if (r0 == 0) goto L19
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L19:
            throw r1
        L1a:
            r0 = 1
            goto L1
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = super.toString()
            r0.append(r1)
            java.lang.String r1 = "[status="
            r0.append(r1)
            java.lang.Object r1 = r5.f13439
            boolean r1 = r1 instanceof p000.AbstractC1105
            java.lang.String r2 = "]"
            if (r1 == 0) goto L1f
            java.lang.String r5 = "CANCELLED"
            r0.append(r5)
            goto L7e
        L1f:
            java.lang.Object r1 = r5.f13439
            if (r1 == 0) goto L27
            r5.m7286(r0)
            goto L7e
        L27:
            boolean r1 = r5 instanceof java.util.concurrent.ScheduledFuture     // Catch: java.lang.RuntimeException -> L4a
            if (r1 == 0) goto L48
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.RuntimeException -> L4a
            java.lang.String r3 = "remaining delay=["
            r1.<init>(r3)     // Catch: java.lang.RuntimeException -> L4a
            r3 = r5
            java.util.concurrent.ScheduledFuture r3 = (java.util.concurrent.ScheduledFuture) r3     // Catch: java.lang.RuntimeException -> L4a
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.RuntimeException -> L4a
            long r3 = r3.getDelay(r4)     // Catch: java.lang.RuntimeException -> L4a
            r1.append(r3)     // Catch: java.lang.RuntimeException -> L4a
            java.lang.String r3 = " ms]"
            r1.append(r3)     // Catch: java.lang.RuntimeException -> L4a
            java.lang.String r1 = r1.toString()     // Catch: java.lang.RuntimeException -> L4a
            goto L5d
        L48:
            r1 = 0
            goto L5d
        L4a:
            r1 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Exception thrown from implementation: "
            r3.<init>(r4)
            java.lang.Class r1 = r1.getClass()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
        L5d:
            if (r1 == 0) goto L71
            boolean r3 = r1.isEmpty()
            if (r3 != 0) goto L71
            java.lang.String r5 = "PENDING, info=["
            r0.append(r5)
            r0.append(r1)
            r0.append(r2)
            goto L7e
        L71:
            java.lang.Object r1 = r5.f13439
            if (r1 == 0) goto L79
            r5.m7286(r0)
            goto L7e
        L79:
            java.lang.String r5 = "PENDING"
            r0.append(r5)
        L7e:
            r0.append(r2)
            java.lang.String r5 = r0.toString()
            return r5
    }

    /* JADX INFO: renamed from: α */
    public final void m7286(java.lang.StringBuilder r4) {
            r3 = this;
            java.lang.String r0 = "]"
            java.lang.Object r1 = m7285(r3)     // Catch: java.lang.RuntimeException -> L1b java.util.concurrent.ExecutionException -> L1d java.util.concurrent.CancellationException -> L31
            java.lang.String r2 = "SUCCESS, result=["
            r4.append(r2)     // Catch: java.lang.RuntimeException -> L1b java.util.concurrent.ExecutionException -> L1d java.util.concurrent.CancellationException -> L31
            if (r1 != r3) goto L10
            java.lang.String r3 = "this future"
            goto L14
        L10:
            java.lang.String r3 = java.lang.String.valueOf(r1)     // Catch: java.lang.RuntimeException -> L1b java.util.concurrent.ExecutionException -> L1d java.util.concurrent.CancellationException -> L31
        L14:
            r4.append(r3)     // Catch: java.lang.RuntimeException -> L1b java.util.concurrent.ExecutionException -> L1d java.util.concurrent.CancellationException -> L31
            r4.append(r0)     // Catch: java.lang.RuntimeException -> L1b java.util.concurrent.ExecutionException -> L1d java.util.concurrent.CancellationException -> L31
            return
        L1b:
            r3 = move-exception
            goto L1f
        L1d:
            r3 = move-exception
            goto L37
        L1f:
            java.lang.String r0 = "UNKNOWN, cause=["
            r4.append(r0)
            java.lang.Class r3 = r3.getClass()
            r4.append(r3)
            java.lang.String r3 = " thrown from get()]"
            r4.append(r3)
            goto L46
        L31:
            java.lang.String r3 = "CANCELLED"
            r4.append(r3)
            goto L46
        L37:
            java.lang.String r1 = "FAILURE, cause=["
            r4.append(r1)
            java.lang.Throwable r3 = r3.getCause()
            r4.append(r3)
            r4.append(r0)
        L46:
            return
    }
}
