package w;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i0.m2 f14572a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static java.lang.Boolean f14573b;

    static {
            k.s1 r0 = new k.s1
            r1 = 18
            r0.<init>(r1)
            i0.m2 r1 = new i0.m2
            r1.<init>(r0)
            w.n.f14572a = r1
            return
    }

    public static final void a(i2.g r10, i2.n0 r11, m2.d r12, java.util.List r13, i0.h0 r14) {
            i0.m2 r0 = w.n.f14572a
            java.lang.Object r0 = r14.j(r0)
            java.util.concurrent.Executor r0 = (java.util.concurrent.Executor) r0
            r1 = 0
            if (r0 == 0) goto L3f
            java.lang.String r2 = r10.f6314h
            int r2 = r2.length()
            boolean r2 = b(r2)
            if (r2 == 0) goto L3f
            r2 = -518737659(0xffffffffe114b105, float:-1.714296E20)
            r14.a0(r2)
            i0.m2 r2 = y1.h1.f21952n
            java.lang.Object r2 = r14.j(r2)
            r5 = r2
            u2.m r5 = (u2.m) r5
            i0.m2 r2 = y1.h1.f21946h
            java.lang.Object r2 = r14.j(r2)
            r8 = r2
            u2.c r8 = (u2.c) r8
            c9.w r3 = new c9.w     // Catch: java.util.concurrent.RejectedExecutionException -> L3b
            r7 = r10
            r4 = r11
            r9 = r12
            r6 = r13
            r3.<init>(r4, r5, r6, r7, r8, r9)     // Catch: java.util.concurrent.RejectedExecutionException -> L3b
            r0.execute(r3)     // Catch: java.util.concurrent.RejectedExecutionException -> L3b
        L3b:
            r14.p(r1)
            return
        L3f:
            r10 = -517090505(0xffffffffe12dd337, float:-2.0040665E20)
            r14.a0(r10)
            r14.p(r1)
            return
    }

    public static final boolean b(int r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            r2 = 0
            if (r0 < r1) goto L34
            r0 = 8
            if (r3 < r0) goto L34
            r0 = 1000(0x3e8, float:1.401E-42)
            if (r3 >= r0) goto L34
            java.lang.Boolean r3 = w.n.f14573b
            r0 = 1
            if (r3 != 0) goto L28
            java.lang.Runtime r3 = java.lang.Runtime.getRuntime()
            int r3 = r3.availableProcessors()
            r1 = 4
            if (r3 < r1) goto L21
            r3 = r0
            goto L22
        L21:
            r3 = r2
        L22:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            w.n.f14573b = r3
        L28:
            java.lang.Boolean r3 = w.n.f14573b
            r3.getClass()
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L34
            return r0
        L34:
            return r2
    }
}
