package nb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final nb.c f9211a = null;

    static {
            nb.c r0 = new nb.c
            r0.<init>()
            nb.c.f9211a = r0
            return
    }

    public static java.util.List a(android.content.Context r2, java.lang.String r3) {
            r2.getClass()
            r3.getClass()
            java.lang.CharSequence r3 = og.m.R0(r3)
            java.lang.String r3 = r3.toString()
            int r0 = r3.length()
            if (r0 <= 0) goto L19
            java.util.List r2 = a.a.x0(r3)
            return r2
        L19:
            uf.c r3 = a.a.E()
            java.lang.String r0 = ""
            r3.add(r0)
            java.lang.String r0 = c(r2)
            boolean r1 = og.m.t0(r0)
            if (r1 != 0) goto L2d
            goto L2e
        L2d:
            r0 = 0
        L2e:
            if (r0 == 0) goto L33
            r3.add(r0)
        L33:
            nb.c r0 = nb.c.f9211a
            java.util.List r2 = r0.b(r2)
            java.util.Iterator r2 = r2.iterator()
        L3d:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L4f
            java.lang.Object r0 = r2.next()
            nb.d r0 = (nb.d) r0
            java.lang.String r0 = r0.f9226a
            r3.add(r0)
            goto L3d
        L4f:
            uf.c r2 = a.a.t(r3)
            java.util.List r2 = tf.m.p1(r2)
            return r2
    }

    public static java.lang.String c(android.content.Context r2) {
            java.lang.String r0 = ""
            r2.getClass()
            android.content.ContentResolver r2 = r2.getContentResolver()     // Catch: java.lang.Throwable -> L1b
            java.lang.String r1 = "tts_default_synth"
            java.lang.String r2 = android.provider.Settings.Secure.getString(r2, r1)     // Catch: java.lang.Throwable -> L1b
            if (r2 != 0) goto L12
            r2 = r0
        L12:
            java.lang.CharSequence r2 = og.m.R0(r2)     // Catch: java.lang.Throwable -> L1b
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L1b
            goto L22
        L1b:
            r2 = move-exception
            sf.f r1 = new sf.f
            r1.<init>(r2)
            r2 = r1
        L22:
            boolean r1 = r2 instanceof sf.f
            if (r1 == 0) goto L28
            goto L29
        L28:
            r0 = r2
        L29:
            java.lang.String r0 = (java.lang.String) r0
            return r0
    }

    public final java.util.List b(android.content.Context r6) {
            r5 = this;
            tf.t r0 = tf.t.f13167g
            r6.getClass()
            android.content.pm.PackageManager r6 = r6.getPackageManager()     // Catch: java.lang.Throwable -> L1f
            android.content.Intent r1 = new android.content.Intent     // Catch: java.lang.Throwable -> L1f
            java.lang.String r2 = "android.intent.action.TTS_SERVICE"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L1f
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L1f
            r3 = 33
            if (r2 < r3) goto L22
            android.content.pm.PackageManager$ResolveInfoFlags r2 = ai.a.c()     // Catch: java.lang.Throwable -> L1f
            java.util.List r1 = ai.a.q(r6, r1, r2)     // Catch: java.lang.Throwable -> L1f
            goto L28
        L1f:
            r6 = move-exception
            goto L97
        L22:
            r2 = 131072(0x20000, float:1.83671E-40)
            java.util.List r1 = r6.queryIntentServices(r1, r2)     // Catch: java.lang.Throwable -> L1f
        L28:
            r1.getClass()     // Catch: java.lang.Throwable -> L1f
            dg.n r2 = new dg.n     // Catch: java.lang.Throwable -> L1f
            r3 = 6
            r2.<init>(r1, r3)     // Catch: java.lang.Throwable -> L1f
            nb.a r1 = new nb.a     // Catch: java.lang.Throwable -> L1f
            r1.<init>(r5, r6)     // Catch: java.lang.Throwable -> L1f
            ng.i r6 = ng.m.X(r2, r1)     // Catch: java.lang.Throwable -> L1f
            nb.b r1 = nb.b.f9208n     // Catch: java.lang.Throwable -> L1f
            r1.getClass()     // Catch: java.lang.Throwable -> L1f
            b8.c r2 = new b8.c     // Catch: java.lang.Throwable -> L1f
            r3 = 7
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L1f
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L1f
            r3.<init>()     // Catch: java.lang.Throwable -> L1f
            ng.b r4 = new ng.b     // Catch: java.lang.Throwable -> L1f
            java.util.Iterator r6 = r6.iterator()     // Catch: java.lang.Throwable -> L1f
            r4.<init>(r6, r1)     // Catch: java.lang.Throwable -> L1f
        L53:
            boolean r6 = r4.hasNext()     // Catch: java.lang.Throwable -> L1f
            if (r6 == 0) goto L61
            java.lang.Object r6 = r4.next()     // Catch: java.lang.Throwable -> L1f
            r3.add(r6)     // Catch: java.lang.Throwable -> L1f
            goto L53
        L61:
            tf.q.g1(r3, r2)     // Catch: java.lang.Throwable -> L1f
            java.util.Iterator r6 = r3.iterator()     // Catch: java.lang.Throwable -> L1f
            boolean r1 = r6.hasNext()     // Catch: java.lang.Throwable -> L1f
            if (r1 != 0) goto L70
            r6 = r0
            goto L9d
        L70:
            java.lang.Object r1 = r6.next()     // Catch: java.lang.Throwable -> L1f
            boolean r2 = r6.hasNext()     // Catch: java.lang.Throwable -> L1f
            if (r2 != 0) goto L7f
            java.util.List r6 = a.a.x0(r1)     // Catch: java.lang.Throwable -> L1f
            goto L9d
        L7f:
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L1f
            r2.<init>()     // Catch: java.lang.Throwable -> L1f
            r2.add(r1)     // Catch: java.lang.Throwable -> L1f
        L87:
            boolean r1 = r6.hasNext()     // Catch: java.lang.Throwable -> L1f
            if (r1 == 0) goto L95
            java.lang.Object r1 = r6.next()     // Catch: java.lang.Throwable -> L1f
            r2.add(r1)     // Catch: java.lang.Throwable -> L1f
            goto L87
        L95:
            r6 = r2
            goto L9d
        L97:
            sf.f r1 = new sf.f
            r1.<init>(r6)
            r6 = r1
        L9d:
            boolean r1 = r6 instanceof sf.f
            if (r1 == 0) goto La3
            goto La4
        La3:
            r0 = r6
        La4:
            java.util.List r0 = (java.util.List) r0
            return r0
    }
}
