package a;

/* JADX INFO: loaded from: classes.dex */
public final class K5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a.K5.a f150a;

    public static class a extends a.K5.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final android.widget.EditText f151a;
        public final a.T5 b;

        public a(android.widget.EditText r6) {
                r5 = this;
                r5.<init>()
                r5.f151a = r6
                a.T5 r0 = new a.T5
                r0.<init>(r6)
                r5.b = r0
                r6.addTextChangedListener(r0)
                a.L5 r0 = a.L5.b
                if (r0 != 0) goto L37
                java.lang.Object r0 = a.L5.f161a
                monitor-enter(r0)
                a.L5 r1 = a.L5.b     // Catch: java.lang.Throwable -> L31
                if (r1 != 0) goto L33
                a.L5 r1 = new a.L5     // Catch: java.lang.Throwable -> L31
                r1.<init>()     // Catch: java.lang.Throwable -> L31
                java.lang.String r2 = "android.text.DynamicLayout$ChangeWatcher"
                java.lang.Class<a.L5> r3 = a.L5.class
                java.lang.ClassLoader r3 = r3.getClassLoader()     // Catch: java.lang.Throwable -> L2e
                r4 = 0
                java.lang.Class r2 = java.lang.Class.forName(r2, r4, r3)     // Catch: java.lang.Throwable -> L2e
                a.L5.c = r2     // Catch: java.lang.Throwable -> L2e
            L2e:
                a.L5.b = r1     // Catch: java.lang.Throwable -> L31
                goto L33
            L31:
                r6 = move-exception
                goto L35
            L33:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L31
                goto L37
            L35:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L31
                throw r6
            L37:
                a.L5 r0 = a.L5.b
                r6.setEditableFactory(r0)
                return
        }
    }

    public static class b {
    }

    public K5(android.widget.EditText r2) {
            r1 = this;
            r1.<init>()
            a.K5$a r0 = new a.K5$a
            r0.<init>(r2)
            r1.f150a = r0
            return
    }
}
