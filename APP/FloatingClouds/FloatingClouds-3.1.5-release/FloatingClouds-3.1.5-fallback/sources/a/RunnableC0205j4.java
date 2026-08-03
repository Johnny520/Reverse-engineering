package a;

/* JADX INFO: renamed from: a.j4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0205j4 implements java.lang.Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f522a;
    public final /* synthetic */ a.C0366s4 b;

    public /* synthetic */ RunnableC0205j4(a.C0366s4 r1, int r2) {
            r0 = this;
            r0.f522a = r2
            r0.b = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r7 = this;
            r0 = 1
            r1 = 0
            int r2 = r7.f522a
            switch(r2) {
                case 0: goto L85;
                case 1: goto L18;
                default: goto L7;
            }
        L7:
            a.s4 r0 = r7.b
            android.view.View r1 = r0.i
            if (r1 == 0) goto L17
            r0.d(r1)     // Catch: java.lang.Throwable -> L13
            a.Wf r0 = a.Wf.f330a     // Catch: java.lang.Throwable -> L13
            goto L17
        L13:
            r0 = move-exception
            a.C0465xd.a(r0)
        L17:
            return
        L18:
            a.s4 r2 = r7.b
            r3 = 0
            r2.g = r3
            boolean r3 = a.C0366s4.G
            if (r3 != 0) goto L55
            boolean r3 = a.C0366s4.H
            if (r3 == 0) goto L26
            goto L55
        L26:
            a.C0366s4.a.b(r2)
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.e
            r0.set(r1)
            r2.k()
            android.view.View r0 = r2.i
            if (r0 == 0) goto L84
            r2.c(r0)     // Catch: java.lang.Throwable -> L3b
            a.Wf r0 = a.Wf.f330a     // Catch: java.lang.Throwable -> L3b
            goto L40
        L3b:
            r0 = move-exception
            a.wd$a r0 = a.C0465xd.a(r0)
        L40:
            java.lang.Throwable r0 = a.C0447wd.a(r0)
            if (r0 == 0) goto L84
            java.lang.String r1 = "onPause delayed refresh failed"
            java.lang.Object[] r0 = new java.lang.Object[]{r1, r0}
            r1 = 2
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
            a.C0453x1.e(r0)
            goto L84
        L55:
            boolean r3 = a.C0366s4.G
            boolean r4 = a.C0366s4.H
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "[ProfileWhitelist] onPause delayed rehide SKIPPED (whitelisted page open, profile="
            r5.<init>(r6)
            r5.append(r3)
            java.lang.String r3 = " chatInfo="
            r5.append(r3)
            r5.append(r4)
            java.lang.String r3 = ")"
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r3, r0)
            a.C0453x1.b(r0)
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.e
            r0.set(r1)
        L84:
            return
        L85:
            a.s4 r2 = r7.b
            java.util.concurrent.atomic.AtomicBoolean r3 = r2.e
            boolean r3 = r3.get()
            if (r3 == 0) goto La3
            java.lang.String r3 = "[DIAG] isInBackAnimation fallback reset after 500ms"
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r3, r0)
            a.C0453x1.b(r0)
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.e
            r0.set(r1)
            a.C0366s4.F = r1
        La3:
            return
    }
}
