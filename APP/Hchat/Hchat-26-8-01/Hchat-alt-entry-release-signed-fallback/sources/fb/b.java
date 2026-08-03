package fb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f3400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.util.Set f3401b;

    public b() {
            r2 = this;
            r2.<init>()
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            r2.f3400a = r0
            java.util.Set r0 = j8.b.o()
            r2.f3401b = r0
            return
    }

    public final void a(okhttp3.Call r4) {
            r3 = this;
            r4.getClass()
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.f3400a
            boolean r1 = r0.get()
            if (r1 == 0) goto Lf
            r4.cancel()
            return
        Lf:
            java.util.Set r1 = r3.f3401b
            r1.getClass()
            r2 = r1
            java.util.Collection r2 = (java.util.Collection) r2
            r2.add(r4)
            boolean r0 = r0.get()
            if (r0 == 0) goto L29
            boolean r0 = r1.remove(r4)
            if (r0 == 0) goto L29
            r4.cancel()
        L29:
            return
    }

    public final boolean b(java.lang.Throwable r3) {
            r2 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.f3400a
            boolean r0 = r0.get()
            r1 = 1
            if (r0 != 0) goto L24
            boolean r0 = r3 instanceof java.util.concurrent.CancellationException
            if (r0 != 0) goto L24
            boolean r0 = r3 instanceof java.io.IOException
            if (r0 == 0) goto L22
            java.lang.String r3 = r3.getMessage()
            if (r3 != 0) goto L19
            java.lang.String r3 = ""
        L19:
            java.lang.String r0 = "cancel"
            boolean r3 = og.m.h0(r3, r0, r1)
            if (r3 == 0) goto L22
            goto L24
        L22:
            r3 = 0
            return r3
        L24:
            return r1
    }

    public final boolean c() {
            r1 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.f3400a
            boolean r0 = r0.get()
            return r0
    }

    public final void d() {
            r2 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.f3400a
            boolean r0 = r0.get()
            if (r0 != 0) goto L9
            return
        L9:
            java.util.concurrent.CancellationException r0 = new java.util.concurrent.CancellationException
            java.lang.String r1 = "Agent 已中断"
            r0.<init>(r1)
            throw r0
    }
}
