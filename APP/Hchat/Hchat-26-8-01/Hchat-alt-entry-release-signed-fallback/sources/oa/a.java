package oa;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l3.l f9701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f9702b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.Object f9703c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.Object f9704d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.Object f9705e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.lang.Object f9706f;

    public a(h.Hchat.dexkit.DexFinder r2, l3.l r3, na.b r4, na.b r5, na.b r6) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f9702b = r0
            r1.f9703c = r2
            r1.f9701a = r3
            r1.f9704d = r4
            r1.f9705e = r5
            r1.f9706f = r6
            return
    }

    public a(java.lang.ClassLoader r1, l3.l r2, na.b r3, na.b r4, na.b r5) {
            r0 = this;
            r0.<init>()
            r0.f9703c = r1
            r0.f9701a = r2
            r0.f9704d = r3
            r0.f9705e = r4
            r0.f9706f = r5
            return
    }

    public static java.lang.String a(android.content.ContentValues r0, java.lang.String r1) {
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L1b
            if (r0 != 0) goto L7
            goto L1b
        L7:
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> L1b
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L1b
            if (r1 != 0) goto L1b
            java.lang.String r1 = "null"
            boolean r1 = r1.equalsIgnoreCase(r0)     // Catch: java.lang.Throwable -> L1b
            if (r1 == 0) goto L1a
            goto L1b
        L1a:
            return r0
        L1b:
            r0 = 0
            return r0
    }

    public int b(java.lang.String r10) {
            r9 = this;
            r0 = 0
            java.lang.Object r1 = r9.f9703c     // Catch: java.lang.Throwable -> La7
            java.lang.ClassLoader r1 = (java.lang.ClassLoader) r1     // Catch: java.lang.Throwable -> La7
            java.lang.Class r1 = h.Hchat.utils.KavaReflector.loadClass(r10, r1)     // Catch: java.lang.Throwable -> La7
            if (r1 != 0) goto Ld
            goto La7
        Ld:
            java.util.List r1 = h.Hchat.utils.KavaReflector.declaredMethods(r1)     // Catch: java.lang.Throwable -> La7
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> La7
            r2 = r0
        L16:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> La7
            if (r3 == 0) goto L82
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> La7
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3     // Catch: java.lang.Throwable -> La7
            java.lang.String r4 = r3.getName()     // Catch: java.lang.Throwable -> La7
            java.lang.String r5 = "insert"
            boolean r5 = r5.equals(r4)     // Catch: java.lang.Throwable -> La7
            if (r5 != 0) goto L57
            java.lang.String r5 = "insertWithOnConflict"
            boolean r5 = r5.equals(r4)     // Catch: java.lang.Throwable -> La7
            if (r5 != 0) goto L57
            java.lang.String r5 = "replace"
            boolean r5 = r5.equals(r4)     // Catch: java.lang.Throwable -> La7
            if (r5 != 0) goto L57
            java.lang.String r5 = "replaceOrThrow"
            boolean r5 = r5.equals(r4)     // Catch: java.lang.Throwable -> La7
            if (r5 != 0) goto L57
            java.lang.String r5 = "update"
            boolean r5 = r5.equals(r4)     // Catch: java.lang.Throwable -> La7
            if (r5 != 0) goto L57
            java.lang.String r5 = "updateWithOnConflict"
            boolean r4 = r5.equals(r4)     // Catch: java.lang.Throwable -> La7
            if (r4 != 0) goto L57
            goto L16
        L57:
            java.lang.Class[] r4 = r3.getParameterTypes()     // Catch: java.lang.Throwable -> L16
            if (r4 == 0) goto L16
            int r5 = r4.length     // Catch: java.lang.Throwable -> L16
            r6 = 2
            if (r5 >= r6) goto L62
            goto L16
        L62:
            int r5 = r4.length     // Catch: java.lang.Throwable -> L16
            r6 = r0
        L64:
            if (r6 >= r5) goto L16
            r7 = r4[r6]     // Catch: java.lang.Throwable -> L16
            java.lang.Class<android.content.ContentValues> r8 = android.content.ContentValues.class
            boolean r7 = r8.isAssignableFrom(r7)     // Catch: java.lang.Throwable -> L16
            if (r7 == 0) goto L7f
            r8.i r4 = r8.i.f11631b     // Catch: java.lang.Throwable -> La7
            b9.e r5 = new b9.e     // Catch: java.lang.Throwable -> La7
            r6 = 20
            r5.<init>(r9, r6)     // Catch: java.lang.Throwable -> La7
            r4.b(r3, r5)     // Catch: java.lang.Throwable -> La7
            int r2 = r2 + 1
            goto L16
        L7f:
            int r6 = r6 + 1
            goto L64
        L82:
            if (r2 <= 0) goto La6
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La7
            r1.<init>()     // Catch: java.lang.Throwable -> La7
            java.lang.String r3 = "数据库兜底Hook: "
            r1.append(r3)     // Catch: java.lang.Throwable -> La7
            r1.append(r10)     // Catch: java.lang.Throwable -> La7
            java.lang.String r10 = " count="
            r1.append(r10)     // Catch: java.lang.Throwable -> La7
            r1.append(r2)     // Catch: java.lang.Throwable -> La7
            java.lang.String r10 = r1.toString()     // Catch: java.lang.Throwable -> La7
            java.lang.Object r1 = r9.f9706f     // Catch: java.lang.Throwable -> La7
            na.b r1 = (na.b) r1     // Catch: java.lang.Throwable -> La7
            na.e r1 = r1.f9099h     // Catch: java.lang.Throwable -> La7
            r1.d(r10)     // Catch: java.lang.Throwable -> La7
        La6:
            return r2
        La7:
            return r0
    }

    public void c(java.lang.String r2) {
            r1 = this;
            java.lang.Object r0 = r1.f9706f
            na.b r0 = (na.b) r0
            na.e r0 = r0.f9099h
            r0.d(r2)
            return
    }
}
