package a;

/* JADX INFO: renamed from: a.jf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0216jf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a.C0216jf f536a = null;
    public static final java.util.List<java.lang.String> b = null;
    public static volatile a.C0234kf c;
    public static volatile boolean d;
    public static volatile java.lang.String e;

    static {
            a.jf r0 = new a.jf
            r0.<init>()
            a.C0216jf.f536a = r0
            java.lang.String r7 = "tinker_patch"
            java.lang.String r8 = "hotpatch"
            java.lang.String r1 = "tinker"
            java.lang.String r2 = "tinker_temp"
            java.lang.String r3 = "tinker_server"
            java.lang.String r4 = "patch-"
            java.lang.String r5 = "wc_tinker_dir"
            java.lang.String r6 = "app_tinker"
            java.lang.String[] r0 = new java.lang.String[]{r1, r2, r3, r4, r5, r6, r7, r8}
            java.util.List r0 = a.C0294o3.d0(r0)
            a.C0216jf.b = r0
            java.lang.String r0 = "NONE"
            a.C0216jf.e = r0
            return
    }

    public static java.io.File a() {
            java.io.File r0 = new java.io.File
            java.io.File r1 = new java.io.File
            java.io.File r2 = a.gh.b()
            java.lang.String r3 = "shared_prefs"
            r1.<init>(r2, r3)
            java.lang.String r2 = "tinker_symbols_v1.json"
            r0.<init>(r1, r2)
            return r0
    }

    public static a.C0234kf b() {
            boolean r0 = a.C0216jf.d
            if (r0 == 0) goto L7
            a.kf r0 = a.C0216jf.c
            return r0
        L7:
            a.kf r0 = c()     // Catch: java.lang.Throwable -> Lc
            goto L11
        Lc:
            r0 = move-exception
            a.wd$a r0 = a.C0465xd.a(r0)
        L11:
            java.lang.Throwable r1 = a.C0447wd.a(r0)
            r2 = 0
            if (r1 != 0) goto L19
            goto L23
        L19:
            java.lang.String r0 = "[TinkerLocator] locateNow failed"
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r1}
            a.C0453x1.e(r0)
            r0 = r2
        L23:
            a.kf r0 = (a.C0234kf) r0
            if (r0 != 0) goto L2b
            r0 = 1
            a.C0216jf.d = r0
            return r2
        L2b:
            a.C0216jf.c = r0
            java.lang.String r1 = "DEXKIT"
            a.C0216jf.e = r1
            java.io.File r1 = a()     // Catch: java.lang.Throwable -> L49
            java.io.File r1 = r1.getParentFile()     // Catch: java.lang.Throwable -> L49
            if (r1 != 0) goto L3c
            goto L81
        L3c:
            boolean r2 = r1.isDirectory()     // Catch: java.lang.Throwable -> L49
            if (r2 != 0) goto L4b
            boolean r1 = r1.mkdirs()     // Catch: java.lang.Throwable -> L49
            if (r1 != 0) goto L4b
            goto L81
        L49:
            r1 = move-exception
            goto L78
        L4b:
            java.io.File r1 = a()     // Catch: java.lang.Throwable -> L49
            org.json.JSONObject r2 = r0.b()     // Catch: java.lang.Throwable -> L49
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L49
            java.lang.String r3 = "toString(...)"
            a.C0193i9.d(r2, r3)     // Catch: java.lang.Throwable -> L49
            java.nio.charset.Charset r3 = a.V2.f298a     // Catch: java.lang.Throwable -> L49
            java.lang.String r4 = "charset"
            a.C0193i9.e(r3, r4)     // Catch: java.lang.Throwable -> L49
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L49
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L49
            a.C0435w1.Y(r4, r2, r3)     // Catch: java.lang.Throwable -> L71
            a.Wf r1 = a.Wf.f330a     // Catch: java.lang.Throwable -> L71
            r4.close()     // Catch: java.lang.Throwable -> L49
            goto L81
        L71:
            r1 = move-exception
            throw r1     // Catch: java.lang.Throwable -> L73
        L73:
            r2 = move-exception
            a.C0435w1.e(r4, r1)     // Catch: java.lang.Throwable -> L49
            throw r2     // Catch: java.lang.Throwable -> L49
        L78:
            java.lang.String r2 = "[TinkerLocator] saveToFile failed"
            java.lang.Object[] r1 = new java.lang.Object[]{r2, r1}
            a.C0453x1.e(r1)
        L81:
            android.content.Context r1 = a.C0435w1.p
            if (r1 == 0) goto L93
            a.C0043a5.i(r0)     // Catch: java.lang.Throwable -> L89
            goto L93
        L89:
            r1 = move-exception
            java.lang.String r2 = "[TinkerLocator] saveToSp failed"
            java.lang.Object[] r1 = new java.lang.Object[]{r2, r1}
            a.C0453x1.e(r1)
        L93:
            return r0
    }

    public static a.C0234kf c() {
            r0 = 1
            java.lang.String r1 = "tryLoad test test"
            r2 = 0
            java.lang.String r3 = "android.content.Intent"
            r4 = 5
            java.util.List r1 = a.C0435w1.x(r2, r3, r2, r1, r4)
            java.util.Iterator r1 = r1.iterator()
        Lf:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L25
            java.lang.Object r5 = r1.next()
            r6 = r5
            a.lb r6 = (a.C0248lb) r6
            java.util.ArrayList r6 = r6.f
            int r6 = r6.size()
            if (r6 != r0) goto Lf
            goto L26
        L25:
            r5 = r2
        L26:
            a.lb r5 = (a.C0248lb) r5
            r1 = 9
            if (r5 == 0) goto L2e
            goto L9c
        L2e:
            java.lang.String r5 = "tryLoad"
            java.util.List r5 = a.C0435w1.x(r2, r3, r2, r5, r4)
            java.util.Iterator r5 = r5.iterator()
        L38:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L4e
            java.lang.Object r6 = r5.next()
            r7 = r6
            a.lb r7 = (a.C0248lb) r7
            java.util.ArrayList r7 = r7.f
            int r7 = r7.size()
            if (r7 != r0) goto L38
            goto L4f
        L4e:
            r6 = r2
        L4f:
            r5 = r6
            a.lb r5 = (a.C0248lb) r5
            if (r5 == 0) goto L55
            goto L9c
        L55:
            java.util.List r5 = a.C0435w1.K(r2)
            java.util.List r5 = a.C0435w1.x(r2, r3, r5, r2, r1)
            java.util.Iterator r5 = r5.iterator()
        L61:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L8b
            java.lang.Object r6 = r5.next()
            r7 = r6
            a.lb r7 = (a.C0248lb) r7
            a.f5 r8 = r7.b()
            java.lang.String r8 = r8.f469a
            java.lang.String r9 = "Tinker"
            boolean r8 = a.Be.I(r8, r9, r0)
            if (r8 == 0) goto L61
            a.f5 r7 = r7.b()
            java.lang.String r7 = r7.f469a
            java.lang.String r8 = "Loader"
            boolean r7 = a.Be.I(r7, r8, r0)
            if (r7 == 0) goto L61
            goto L8c
        L8b:
            r6 = r2
        L8c:
            r5 = r6
            a.lb r5 = (a.C0248lb) r5
            if (r5 == 0) goto L92
            goto L9c
        L92:
            java.lang.String r5 = "[TinkerLocator] R1 FAILED: tryLoad not located (no fallback)"
            java.lang.Object[] r5 = new java.lang.Object[]{r5}
            a.C0453x1.e(r5)
            r5 = r2
        L9c:
            if (r5 != 0) goto L9f
            return r2
        L9f:
            a.f5 r6 = r5.b()
            java.lang.String r8 = r6.f469a
            a.f5 r6 = r5.b()
            java.lang.String r9 = r6.b
            a.f5 r6 = r5.b()
            java.util.ArrayList r6 = r6.c
            java.lang.Object r6 = a.C0383t3.n0(r6)
            r10 = r6
            java.lang.String r10 = (java.lang.String) r10
            java.lang.String r6 = "."
            if (r10 != 0) goto Le9
            a.f5 r0 = r5.b()
            java.lang.String r0 = r0.f469a
            a.f5 r1 = r5.b()
            java.lang.String r1 = r1.b
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "[TinkerLocator] R2 failed: tryLoad("
            r3.<init>(r4)
            r3.append(r0)
            r3.append(r6)
            r3.append(r1)
            java.lang.String r0 = ") has no param type"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            a.C0453x1.e(r0)
            return r2
        Le9:
            java.lang.String r7 = "long"
            java.lang.String r11 = "android.content.Context"
            java.lang.String[] r7 = new java.lang.String[]{r11, r7, r7}
            java.util.List r7 = a.C0294o3.d0(r7)
            r12 = 8
            java.lang.String r13 = "void"
            java.util.List r7 = a.C0435w1.x(r10, r13, r7, r2, r12)
            java.lang.Object r7 = a.C0383t3.n0(r7)
            a.lb r7 = (a.C0248lb) r7
            r12 = 14
            r14 = 3
            if (r7 == 0) goto L10a
        L108:
            r1 = r7
            goto L166
        L10a:
            java.util.List r7 = a.C0435w1.x(r10, r2, r2, r2, r12)
            java.util.Iterator r7 = r7.iterator()
        L112:
            boolean r15 = r7.hasNext()
            if (r15 == 0) goto L151
            java.lang.Object r15 = r7.next()
            r12 = r15
            a.lb r12 = (a.C0248lb) r12
            int r1 = r12.c
            boolean r1 = java.lang.reflect.Modifier.isPublic(r1)
            if (r1 == 0) goto L14c
            a.f5 r1 = r12.b()
            java.lang.String r1 = r1.d
            boolean r1 = a.C0193i9.a(r1, r13)
            if (r1 == 0) goto L14c
            java.util.ArrayList r1 = r12.f
            int r1 = r1.size()
            if (r1 != r14) goto L14c
            a.f5 r1 = r12.b()
            java.util.ArrayList r1 = r1.c
            java.lang.Object r1 = a.C0383t3.n0(r1)
            boolean r1 = a.C0193i9.a(r1, r11)
            if (r1 == 0) goto L14c
            goto L152
        L14c:
            r1 = 9
            r12 = 14
            goto L112
        L151:
            r15 = r2
        L152:
            r7 = r15
            a.lb r7 = (a.C0248lb) r7
            if (r7 == 0) goto L158
            goto L108
        L158:
            java.lang.String r1 = "[TinkerLocator] R3 FAILED: onBaseContextAttached not located in "
            java.lang.String r1 = r1.concat(r10)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            a.C0453x1.e(r1)
            r1 = r2
        L166:
            java.lang.String r7 = "Tinker.SecurityCheck"
            java.lang.String r11 = "boolean"
            java.util.List r4 = a.C0435w1.x(r2, r11, r2, r7, r4)
            java.util.Iterator r4 = r4.iterator()
        L172:
            boolean r7 = r4.hasNext()
            java.lang.String r12 = "java.io.File"
            if (r7 == 0) goto L19c
            java.lang.Object r7 = r4.next()
            r15 = r7
            a.lb r15 = (a.C0248lb) r15
            java.util.ArrayList r14 = r15.f
            int r14 = r14.size()
            if (r14 != r0) goto L19a
            a.f5 r14 = r15.b()
            java.util.ArrayList r14 = r14.c
            java.lang.Object r14 = a.C0383t3.n0(r14)
            boolean r14 = a.C0193i9.a(r14, r12)
            if (r14 == 0) goto L19a
            goto L19d
        L19a:
            r14 = 3
            goto L172
        L19c:
            r7 = r2
        L19d:
            a.lb r7 = (a.C0248lb) r7
            if (r7 == 0) goto L1a3
        L1a1:
            r4 = r7
            goto L1c1
        L1a3:
            java.util.List r4 = a.C0435w1.K(r12)
            r7 = 9
            java.util.List r4 = a.C0435w1.x(r2, r11, r4, r2, r7)
            java.lang.Object r4 = a.C0383t3.n0(r4)
            r7 = r4
            a.lb r7 = (a.C0248lb) r7
            if (r7 == 0) goto L1b7
            goto L1a1
        L1b7:
            java.lang.String r4 = "[TinkerLocator] R4 FAILED: verifyPatchMetaSignature not located"
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            a.C0453x1.e(r4)
            r4 = r2
        L1c1:
            java.util.LinkedHashSet r7 = new java.util.LinkedHashSet
            r7.<init>()
            java.lang.String r11 = "patch-"
            java.lang.String r12 = "LegacyTinkerCore"
            java.lang.String[] r14 = new java.lang.String[]{r11, r12}
            java.util.List r14 = a.C0435w1.s(r14)
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            java.util.Iterator r14 = r14.iterator()
        L1db:
            boolean r17 = r14.hasNext()
            java.lang.String r0 = "$PatchService"
            if (r17 == 0) goto L1fa
            java.lang.Object r2 = r14.next()
            r23 = r1
            r1 = r2
            java.lang.String r1 = (java.lang.String) r1
            boolean r0 = a.Ae.D(r1, r0)
            if (r0 == 0) goto L1f5
            r15.add(r2)
        L1f5:
            r1 = r23
            r0 = 1
            r2 = 0
            goto L1db
        L1fa:
            r23 = r1
            r7.addAll(r15)
            boolean r1 = r7.isEmpty()
            if (r1 == 0) goto L230
            java.lang.String[] r1 = new java.lang.String[]{r11}
            java.util.List r1 = a.C0435w1.s(r1)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L216:
            boolean r11 = r1.hasNext()
            if (r11 == 0) goto L22d
            java.lang.Object r11 = r1.next()
            r14 = r11
            java.lang.String r14 = (java.lang.String) r14
            boolean r14 = a.Ae.D(r14, r0)
            if (r14 == 0) goto L216
            r2.add(r11)
            goto L216
        L22d:
            r7.addAll(r2)
        L230:
            boolean r1 = r7.isEmpty()
            if (r1 == 0) goto L261
            java.lang.String[] r1 = new java.lang.String[]{r12}
            java.util.List r1 = a.C0435w1.s(r1)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L247:
            boolean r11 = r1.hasNext()
            if (r11 == 0) goto L25e
            java.lang.Object r11 = r1.next()
            r12 = r11
            java.lang.String r12 = (java.lang.String) r12
            boolean r12 = a.Ae.D(r12, r0)
            if (r12 == 0) goto L247
            r2.add(r11)
            goto L247
        L25e:
            r7.addAll(r2)
        L261:
            java.util.Iterator r0 = r7.iterator()
            java.lang.String r1 = "iterator(...)"
            a.C0193i9.d(r0, r1)
        L26a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L321
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            r2 = 0
            r11 = 14
            java.util.List r12 = a.C0435w1.x(r1, r2, r2, r2, r11)
            java.util.Iterator r2 = r12.iterator()
        L281:
            boolean r14 = r2.hasNext()
            if (r14 == 0) goto L2c6
            java.lang.Object r14 = r2.next()
            r15 = r14
            a.lb r15 = (a.C0248lb) r15
            int r11 = r15.c
            boolean r11 = java.lang.reflect.Modifier.isPublic(r11)
            if (r11 == 0) goto L2bf
            a.f5 r11 = r15.b()
            java.lang.String r11 = r11.d
            boolean r11 = a.C0193i9.a(r11, r13)
            if (r11 == 0) goto L2bf
            java.util.ArrayList r11 = r15.f
            int r11 = r11.size()
            r17 = r0
            r0 = 1
            if (r11 != r0) goto L2c1
            a.f5 r0 = r15.b()
            java.util.ArrayList r0 = r0.c
            java.lang.Object r0 = a.C0383t3.n0(r0)
            boolean r0 = a.C0193i9.a(r0, r3)
            if (r0 == 0) goto L2c1
            r2 = r14
            goto L2c9
        L2bf:
            r17 = r0
        L2c1:
            r0 = r17
            r11 = 14
            goto L281
        L2c6:
            r17 = r0
            r2 = 0
        L2c9:
            a.lb r2 = (a.C0248lb) r2
            if (r2 == 0) goto L2d4
            a.f5 r0 = r2.b()
            java.lang.String r2 = r0.b
            goto L314
        L2d4:
            java.util.Iterator r0 = r12.iterator()
        L2d8:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L307
            java.lang.Object r2 = r0.next()
            r11 = r2
            a.lb r11 = (a.C0248lb) r11
            int r12 = r11.c
            boolean r12 = java.lang.reflect.Modifier.isPublic(r12)
            if (r12 == 0) goto L2d8
            java.util.ArrayList r12 = r11.f
            int r12 = r12.size()
            r14 = 3
            if (r12 != r14) goto L2d8
            a.f5 r11 = r11.b()
            java.util.ArrayList r11 = r11.c
            java.lang.Object r11 = a.C0383t3.n0(r11)
            boolean r11 = a.C0193i9.a(r11, r3)
            if (r11 == 0) goto L2d8
            goto L308
        L307:
            r2 = 0
        L308:
            a.lb r2 = (a.C0248lb) r2
            if (r2 == 0) goto L313
            a.f5 r0 = r2.b()
            java.lang.String r2 = r0.b
            goto L314
        L313:
            r2 = 0
        L314:
            if (r2 != 0) goto L31a
            r0 = r17
            goto L26a
        L31a:
            a.mc r0 = new a.mc
            r0.<init>(r1, r2)
            r2 = r0
            goto L33c
        L321:
            r14 = 3
            java.util.List r0 = a.C0383t3.s0(r14, r7)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "[TinkerLocator] R5: patch service not located (wx<8.0.71 or structure changed) candidates="
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            a.C0453x1.b(r0)
            r2 = 0
        L33c:
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            java.util.List<java.lang.String> r1 = a.C0216jf.b
            java.util.Iterator r1 = r1.iterator()
        L347:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L362
            java.lang.Object r3 = r1.next()
            java.lang.String r3 = (java.lang.String) r3
            r7 = 0
            java.util.List r11 = a.C0435w1.r(r3, r7)
            boolean r11 = r11.isEmpty()
            if (r11 != 0) goto L347
            r0.add(r3)
            goto L347
        L362:
            r7 = 0
            a.Me r1 = r5.h
            java.lang.Object r1 = r1.a()
            java.util.List r1 = (java.util.List) r1
            java.util.Iterator r1 = r1.iterator()
        L36f:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L37f
            java.lang.Object r3 = r1.next()
            java.lang.String r3 = (java.lang.String) r3
            r0.add(r3)
            goto L36f
        L37f:
            if (r4 == 0) goto L39f
            a.Me r1 = r4.h
            java.lang.Object r1 = r1.a()
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L39f
            java.util.Iterator r1 = r1.iterator()
        L38f:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L39f
            java.lang.Object r3 = r1.next()
            java.lang.String r3 = (java.lang.String) r3
            r0.add(r3)
            goto L38f
        L39f:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r3 = r0.iterator()
        L3a8:
            boolean r5 = r3.hasNext()
            r11 = 0
            if (r5 == 0) goto L41f
            java.lang.Object r5 = r3.next()
            r12 = r5
            java.lang.String r12 = (java.lang.String) r12
            java.lang.String r13 = "s"
            a.C0193i9.e(r12, r13)
            int r13 = r12.length()
            r14 = 3
            if (r14 > r13) goto L41c
            r15 = 41
            if (r13 >= r15) goto L41c
            r13 = r11
        L3c7:
            int r15 = r12.length()
            if (r13 >= r15) goto L3e3
            char r15 = r12.charAt(r13)
            boolean r16 = java.lang.Character.isWhitespace(r15)
            if (r16 != 0) goto L41c
            boolean r15 = java.lang.Character.isSpaceChar(r15)
            if (r15 == 0) goto L3de
            goto L41c
        L3de:
            r19 = 1
            int r13 = r13 + 1
            goto L3c7
        L3e3:
            r13 = 47
            boolean r13 = a.Be.J(r12, r13)
            if (r13 != 0) goto L403
            r13 = 92
            boolean r13 = a.Be.J(r12, r13)
            if (r13 != 0) goto L403
            r13 = 95
            boolean r13 = a.Be.J(r12, r13)
            if (r13 != 0) goto L403
            r13 = 45
            boolean r13 = a.Be.J(r12, r13)
            if (r13 == 0) goto L41c
        L403:
            int r13 = r12.length()
            if (r11 >= r13) goto L41c
            char r13 = r12.charAt(r11)
            boolean r13 = java.lang.Character.isLetterOrDigit(r13)
            if (r13 != 0) goto L417
            r1.add(r5)
            goto L3a8
        L417:
            r19 = 1
            int r11 = r11 + 1
            goto L403
        L41c:
            r19 = 1
            goto L3a8
        L41f:
            java.util.LinkedHashSet r3 = new java.util.LinkedHashSet
            r3.<init>(r1)
            java.util.List r1 = a.C0383t3.w0(r3)
            int r0 = r0.size()
            int r3 = r1.size()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r12 = "[TinkerLocator] R7: raw="
            r5.<init>(r12)
            r5.append(r0)
            java.lang.String r0 = " pathSegments="
            r5.append(r0)
            r5.append(r3)
            java.lang.String r3 = " segments="
            r5.append(r3)
            r5.append(r1)
            java.lang.String r3 = r5.toString()
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            a.C0453x1.b(r3)
            r22 = r7
            a.kf r7 = new a.kf
            if (r23 == 0) goto L463
            a.f5 r3 = r23.b()
            java.lang.String r3 = r3.b
            r12 = r3
            goto L465
        L463:
            r12 = r22
        L465:
            if (r4 == 0) goto L46f
            a.f5 r3 = r4.b()
            java.lang.String r3 = r3.f469a
            r13 = r3
            goto L471
        L46f:
            r13 = r22
        L471:
            if (r4 == 0) goto L47b
            a.f5 r3 = r4.b()
            java.lang.String r3 = r3.b
            r14 = r3
            goto L47d
        L47b:
            r14 = r22
        L47d:
            if (r2 == 0) goto L485
            A r3 = r2.f578a
            java.lang.String r3 = (java.lang.String) r3
            r15 = r3
            goto L487
        L485:
            r15 = r22
        L487:
            if (r2 == 0) goto L490
            B r3 = r2.b
            java.lang.String r3 = (java.lang.String) r3
            r16 = r3
            goto L492
        L490:
            r16 = r22
        L492:
            long r18 = java.lang.System.currentTimeMillis()
            boolean r3 = a.gh.f488a
            android.content.Context r3 = a.C0435w1.p
            r20 = 0
            if (r3 != 0) goto L4a0
        L49e:
            r5 = r4
            goto L4b2
        L4a0:
            android.content.pm.PackageManager r5 = r3.getPackageManager()     // Catch: java.lang.Throwable -> L49e
            java.lang.String r3 = r3.getPackageName()     // Catch: java.lang.Throwable -> L49e
            android.content.pm.PackageInfo r3 = r5.getPackageInfo(r3, r11)     // Catch: java.lang.Throwable -> L49e
            int r3 = r3.versionCode     // Catch: java.lang.Throwable -> L49e
            r5 = r4
            long r3 = (long) r3
            r20 = r3
        L4b2:
            r11 = r10
            r17 = r1
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r20)
            if (r23 == 0) goto L4c1
            a.f5 r1 = r23.b()
            java.lang.String r1 = r1.b
            goto L4c3
        L4c1:
            r1 = r22
        L4c3:
            if (r5 == 0) goto L4cc
            a.f5 r3 = r5.b()
            java.lang.String r3 = r3.f469a
            goto L4ce
        L4cc:
            r3 = r22
        L4ce:
            if (r5 == 0) goto L4d7
            a.f5 r4 = r5.b()
            java.lang.String r4 = r4.b
            goto L4d9
        L4d7:
            r4 = r22
        L4d9:
            if (r2 == 0) goto L4e0
            A r5 = r2.f578a
            java.lang.String r5 = (java.lang.String) r5
            goto L4e2
        L4e0:
            r5 = r22
        L4e2:
            if (r2 == 0) goto L4e9
            B r2 = r2.b
            java.lang.String r2 = (java.lang.String) r2
            goto L4eb
        L4e9:
            r2 = r22
        L4eb:
            int r11 = r17.size()
            java.lang.String r12 = "[TinkerLocator] located: loader="
            java.lang.String r13 = " app="
            java.lang.StringBuilder r8 = a.C0487z.i(r12, r8, r6, r9, r13)
            r8.append(r10)
            java.lang.String r9 = " appEntry="
            r8.append(r9)
            r8.append(r1)
            java.lang.String r1 = " security="
            r8.append(r1)
            r8.append(r3)
            r8.append(r6)
            r8.append(r4)
            java.lang.String r1 = " patchSvc="
            r8.append(r1)
            r8.append(r5)
            r8.append(r6)
            r8.append(r2)
            r8.append(r0)
            r8.append(r11)
            java.lang.String r0 = r8.toString()
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            a.C0453x1.b(r0)
            return r7
    }
}
