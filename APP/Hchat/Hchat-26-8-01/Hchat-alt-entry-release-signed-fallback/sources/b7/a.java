package b7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b7.a f501c = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a7.d f502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public java.util.HashMap f503b;

    static {
            b7.a r0 = new b7.a
            r0.<init>()
            b7.a.f501c = r0
            return
    }

    public final a7.d a() {
            r1 = this;
            monitor-enter(r1)
            a7.d r0 = r1.f502a     // Catch: java.lang.Throwable -> L8
            if (r0 != 0) goto La
            r0 = 0
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8
            return r0
        L8:
            r0 = move-exception
            goto Lf
        La:
            r0.x()     // Catch: java.lang.Throwable -> L8
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8
            return r0
        Lf:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8
            throw r0
    }

    public final java.util.Map b() {
            r5 = this;
            java.util.HashMap r0 = r5.f503b
            if (r0 == 0) goto L5
            return r0
        L5:
            monitor-enter(r5)
            java.util.HashMap r0 = new java.util.HashMap     // Catch: java.lang.Throwable -> L44
            r0.<init>()     // Catch: java.lang.Throwable -> L44
            r1 = 36
            r2 = 23
        Lf:
            if (r2 >= r1) goto L40
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L44
            java.lang.String r4 = "/frameworks/android/android-"
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L44
            r3.append(r2)     // Catch: java.lang.Throwable -> L44
            java.lang.String r4 = ".apk"
            r3.append(r4)     // Catch: java.lang.Throwable -> L44
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L44
            java.lang.Class<b7.a> r4 = b7.a.class
            java.io.InputStream r4 = r4.getResourceAsStream(r3)     // Catch: java.lang.Throwable -> L44
            if (r4 != 0) goto L2d
            goto L3d
        L2d:
            r4.close()     // Catch: java.io.IOException -> L30 java.lang.Throwable -> L44
        L30:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L44
            r0.put(r4, r3)     // Catch: java.lang.Throwable -> L44
            int r3 = r2 + 1
            if (r3 != r1) goto L3d
            int r1 = r1 + 1
        L3d:
            int r2 = r2 + 1
            goto Lf
        L40:
            r5.f503b = r0     // Catch: java.lang.Throwable -> L44
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L44
            return r0
        L44:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L44
            throw r0
    }

    public final a7.d c(int r9) {
            r8 = this;
            java.util.Map r0 = r8.b()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L7f
            r9 = 47
            int r9 = r0.lastIndexOf(r9)
            if (r9 >= 0) goto L20
            char r9 = java.io.File.separatorChar
            int r9 = r0.lastIndexOf(r9)
        L20:
            if (r9 <= 0) goto L29
            int r9 = r9 + 1
            java.lang.String r9 = r0.substring(r9)
            goto L2a
        L29:
            r9 = r0
        L2a:
            r1 = 46
            int r1 = r9.lastIndexOf(r1)
            r2 = 0
            if (r1 < 0) goto L37
            java.lang.String r9 = r9.substring(r2, r1)
        L37:
            java.lang.Class<a7.a> r1 = a7.a.class
            java.io.InputStream r0 = r1.getResourceAsStream(r0)
            c7.a r1 = new c7.a
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream
            r3.<init>()
            r4 = 1024000(0xfa000, float:1.43493E-39)
            byte[] r5 = new byte[r4]
        L49:
            int r6 = r5.length
            int r6 = r0.read(r5, r2, r6)
            if (r6 < 0) goto L5f
            r3.write(r5, r2, r6)
            int r7 = r5.length
            if (r6 != r7) goto L49
            r6 = 10240000(0x9c4000, float:1.4349296E-38)
            if (r7 >= r6) goto L49
            int r7 = r7 + r4
            byte[] r5 = new byte[r7]
            goto L49
        L5f:
            r0.close()
            r3.close()
            byte[] r0 = r3.toByteArray()
            i7.d r2 = new i7.d
            r2.<init>(r0)
            r0 = 0
            r1.<init>(r2, r0)
            c7.f r0 = r1.a()
            a7.d r1 = new a7.d
            r1.<init>(r9, r0)
            r1.w()
            return r1
        L7f:
            java.lang.String r0 = "No resource found for version: "
            java.lang.String r9 = eh.a.l(r9, r0)
            j8.o.y(r9)
            r9 = 0
            return r9
    }
}
