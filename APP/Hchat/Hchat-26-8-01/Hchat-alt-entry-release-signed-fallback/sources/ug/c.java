package ug;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final wf.c[] f13806a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l3.q f13807b = null;

    static {
            r0 = 0
            wf.c[] r0 = new wf.c[r0]
            ug.c.f13806a = r0
            l3.q r0 = new l3.q
            java.lang.String r1 = "NULL"
            r2 = 1
            r0.<init>(r1, r2)
            ug.c.f13807b = r0
            return
    }

    public static final java.lang.Object a(wf.g r2, java.lang.Object r3, java.lang.Object r4, fg.p r5, wf.c r6) {
            java.lang.Object r4 = vg.a.l(r2, r4)
            ug.o r0 = new ug.o     // Catch: java.lang.Throwable -> L10
            r0.<init>(r6, r2)     // Catch: java.lang.Throwable -> L10
            if (r5 != 0) goto L12
            java.lang.Object r3 = fb.v0.Q(r5, r3, r0)     // Catch: java.lang.Throwable -> L10
            goto L1a
        L10:
            r3 = move-exception
            goto L25
        L12:
            r1 = 2
            gg.x.c(r1, r5)     // Catch: java.lang.Throwable -> L10
            java.lang.Object r3 = r5.invoke(r3, r0)     // Catch: java.lang.Throwable -> L10
        L1a:
            vg.a.g(r2, r4)
            xf.a r2 = xf.a.f21579g
            if (r3 != r2) goto L24
            r6.getClass()
        L24:
            return r3
        L25:
            vg.a.g(r2, r4)
            throw r3
    }
}
