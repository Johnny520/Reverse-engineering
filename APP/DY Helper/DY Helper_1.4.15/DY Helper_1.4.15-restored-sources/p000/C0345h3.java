package p000;

/* JADX INFO: renamed from: h3 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0345h3 extends kotlinx.coroutines.AbstractC0479 {

    /* JADX INFO: renamed from: ρ */
    public static final p000.h22 f4544 = null;

    /* JADX INFO: renamed from: σ */
    public static final p000.C0271f3 f4545 = null;

    /* JADX INFO: renamed from: η */
    public final android.view.Choreographer f4546;

    /* JADX INFO: renamed from: θ */
    public final android.os.Handler f4547;

    /* JADX INFO: renamed from: ι */
    public final java.lang.Object f4548;

    /* JADX INFO: renamed from: κ */
    public final p000.C0936w6 f4549;

    /* JADX INFO: renamed from: λ */
    public java.util.ArrayList f4550;

    /* JADX INFO: renamed from: μ */
    public java.util.ArrayList f4551;

    /* JADX INFO: renamed from: ν */
    public boolean f4552;

    /* JADX INFO: renamed from: ξ */
    public boolean f4553;

    /* JADX INFO: renamed from: ο */
    public final p000.ChoreographerFrameCallbackC0308g3 f4554;

    /* JADX INFO: renamed from: π */
    public final p000.C0455k3 f4555;

    static {
            t1 r0 = p000.C0819t1.f10116
            h22 r1 = new h22
            r1.<init>(r0)
            p000.C0345h3.f4544 = r1
            f3 r0 = new f3
            r1 = 0
            r0.<init>(r1)
            p000.C0345h3.f4545 = r0
            return
    }

    public C0345h3(android.view.Choreographer r1, android.os.Handler r2) {
            r0 = this;
            r0.<init>()
            r0.f4546 = r1
            r0.f4547 = r2
            java.lang.Object r2 = new java.lang.Object
            r2.<init>()
            r0.f4548 = r2
            w6 r2 = new w6
            r2.<init>()
            r0.f4549 = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r0.f4550 = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r0.f4551 = r2
            g3 r2 = new g3
            r2.<init>(r0)
            r0.f4554 = r2
            k3 r2 = new k3
            r2.<init>(r1, r0)
            r0.f4555 = r2
            return
    }

    /* JADX INFO: renamed from: υ */
    public static final void m2344(p000.C0345h3 r4) {
        L0:
            java.lang.Object r0 = r4.f4548
            monitor-enter(r0)
            w6 r1 = r4.f4549     // Catch: java.lang.Throwable -> L4a
            boolean r2 = r1.isEmpty()     // Catch: java.lang.Throwable -> L4a
            r3 = 0
            if (r2 == 0) goto Le
            r1 = r3
            goto L12
        Le:
            java.lang.Object r1 = r1.removeFirst()     // Catch: java.lang.Throwable -> L4a
        L12:
            java.lang.Runnable r1 = (java.lang.Runnable) r1     // Catch: java.lang.Throwable -> L4a
            monitor-exit(r0)
        L15:
            if (r1 == 0) goto L32
            r1.run()
            java.lang.Object r0 = r4.f4548
            monitor-enter(r0)
            w6 r1 = r4.f4549     // Catch: java.lang.Throwable -> L2f
            boolean r2 = r1.isEmpty()     // Catch: java.lang.Throwable -> L2f
            if (r2 == 0) goto L27
            r1 = r3
            goto L2b
        L27:
            java.lang.Object r1 = r1.removeFirst()     // Catch: java.lang.Throwable -> L2f
        L2b:
            java.lang.Runnable r1 = (java.lang.Runnable) r1     // Catch: java.lang.Throwable -> L2f
            monitor-exit(r0)
            goto L15
        L2f:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
        L32:
            java.lang.Object r0 = r4.f4548
            monitor-enter(r0)
            w6 r1 = r4.f4549     // Catch: java.lang.Throwable -> L41
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L41
            if (r1 == 0) goto L43
            r1 = 0
            r4.f4552 = r1     // Catch: java.lang.Throwable -> L41
            goto L44
        L41:
            r4 = move-exception
            goto L48
        L43:
            r1 = 1
        L44:
            monitor-exit(r0)
            if (r1 != 0) goto L0
            return
        L48:
            monitor-exit(r0)
            throw r4
        L4a:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
    }

    @Override // kotlinx.coroutines.AbstractC0479
    /* JADX INFO: renamed from: ρ */
    public final void mo1950(p000.InterfaceC0880up r3, java.lang.Runnable r4) {
            r2 = this;
            java.lang.Object r3 = r2.f4548
            monitor-enter(r3)
            w6 r0 = r2.f4549     // Catch: java.lang.Throwable -> L24
            r0.addLast(r4)     // Catch: java.lang.Throwable -> L24
            boolean r4 = r2.f4552     // Catch: java.lang.Throwable -> L24
            if (r4 != 0) goto L26
            r4 = 1
            r2.f4552 = r4     // Catch: java.lang.Throwable -> L24
            android.os.Handler r0 = r2.f4547     // Catch: java.lang.Throwable -> L24
            g3 r1 = r2.f4554     // Catch: java.lang.Throwable -> L24
            r0.post(r1)     // Catch: java.lang.Throwable -> L24
            boolean r0 = r2.f4553     // Catch: java.lang.Throwable -> L24
            if (r0 != 0) goto L26
            r2.f4553 = r4     // Catch: java.lang.Throwable -> L24
            android.view.Choreographer r4 = r2.f4546     // Catch: java.lang.Throwable -> L24
            g3 r2 = r2.f4554     // Catch: java.lang.Throwable -> L24
            r4.postFrameCallback(r2)     // Catch: java.lang.Throwable -> L24
            goto L26
        L24:
            r2 = move-exception
            goto L28
        L26:
            monitor-exit(r3)
            return
        L28:
            monitor-exit(r3)
            throw r2
    }
}
