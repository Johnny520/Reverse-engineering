package a;

/* JADX INFO: renamed from: a.hg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0182hg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a.C0182hg f502a = null;

    /* JADX INFO: renamed from: a.hg$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final java.lang.String f503a;
        public final java.lang.String b;
        public final java.lang.String c;
        public final java.lang.String d;
        public final java.lang.String e;
        public final java.lang.String f;

        public a() {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                return
        }

        public /* synthetic */ a(int r8) {
                r7 = this;
                r1 = 0
                r2 = 0
                r3 = 0
                r4 = 0
                r5 = 0
                r6 = 0
                r0 = r7
                r0.<init>(r1, r2, r3, r4, r5, r6)
                return
        }

        public a(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6) {
                r0 = this;
                r0.<init>()
                r0.f503a = r1
                r0.b = r2
                r0.c = r3
                r0.d = r4
                r0.e = r5
                r0.f = r6
                return
        }

        public final boolean equals(java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof a.C0182hg.a
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                a.hg$a r5 = (a.C0182hg.a) r5
                java.lang.String r1 = r5.f503a
                java.lang.String r3 = r4.f503a
                boolean r1 = a.C0193i9.a(r3, r1)
                if (r1 != 0) goto L17
                return r2
            L17:
                java.lang.String r1 = r4.b
                java.lang.String r3 = r5.b
                boolean r1 = a.C0193i9.a(r1, r3)
                if (r1 != 0) goto L22
                return r2
            L22:
                java.lang.String r1 = r4.c
                java.lang.String r3 = r5.c
                boolean r1 = a.C0193i9.a(r1, r3)
                if (r1 != 0) goto L2d
                return r2
            L2d:
                java.lang.String r1 = r4.d
                java.lang.String r3 = r5.d
                boolean r1 = a.C0193i9.a(r1, r3)
                if (r1 != 0) goto L38
                return r2
            L38:
                java.lang.String r1 = r4.e
                java.lang.String r3 = r5.e
                boolean r1 = a.C0193i9.a(r1, r3)
                if (r1 != 0) goto L43
                return r2
            L43:
                java.lang.String r1 = r4.f
                java.lang.String r5 = r5.f
                boolean r5 = a.C0193i9.a(r1, r5)
                if (r5 != 0) goto L4e
                return r2
            L4e:
                return r0
        }

        public final int hashCode() {
                r3 = this;
                r0 = 0
                java.lang.String r1 = r3.f503a
                if (r1 != 0) goto L7
                r1 = r0
                goto Lb
            L7:
                int r1 = r1.hashCode()
            Lb:
                int r1 = r1 * 31
                java.lang.String r2 = r3.b
                if (r2 != 0) goto L13
                r2 = r0
                goto L17
            L13:
                int r2 = r2.hashCode()
            L17:
                int r1 = r1 + r2
                int r1 = r1 * 31
                java.lang.String r2 = r3.c
                if (r2 != 0) goto L20
                r2 = r0
                goto L24
            L20:
                int r2 = r2.hashCode()
            L24:
                int r1 = r1 + r2
                int r1 = r1 * 31
                java.lang.String r2 = r3.d
                if (r2 != 0) goto L2d
                r2 = r0
                goto L31
            L2d:
                int r2 = r2.hashCode()
            L31:
                int r1 = r1 + r2
                int r1 = r1 * 31
                java.lang.String r2 = r3.e
                if (r2 != 0) goto L3a
                r2 = r0
                goto L3e
            L3a:
                int r2 = r2.hashCode()
            L3e:
                int r1 = r1 + r2
                int r1 = r1 * 31
                java.lang.String r2 = r3.f
                if (r2 != 0) goto L46
                goto L4a
            L46:
                int r0 = r2.hashCode()
            L4a:
                int r1 = r1 + r0
                return r1
        }

        public final java.lang.String toString() {
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "SemanticFields(bVer="
                r0.<init>(r1)
                java.lang.String r1 = r3.f503a
                r0.append(r1)
                java.lang.String r1 = ", tag="
                r0.append(r1)
                java.lang.String r1 = r3.b
                r0.append(r1)
                java.lang.String r1 = ", time="
                r0.append(r1)
                java.lang.String r1 = r3.c
                r0.append(r1)
                java.lang.String r1 = ", rev="
                r0.append(r1)
                java.lang.String r1 = r3.d
                r0.append(r1)
                java.lang.String r1 = ", patchEnabled="
                r0.append(r1)
                java.lang.String r1 = r3.e
                r0.append(r1)
                java.lang.String r1 = ", patchAppend="
                r0.append(r1)
                java.lang.String r1 = r3.f
                java.lang.String r2 = ")"
                java.lang.String r0 = a.C0487z.h(r0, r1, r2)
                return r0
        }
    }

    static {
            a.hg r0 = new a.hg
            r0.<init>()
            a.C0182hg.f502a = r0
            return
    }

    public static a.C0182hg.a a(java.lang.String r8) {
            java.util.LinkedHashMap r8 = e(r8)
            java.util.Set r8 = r8.entrySet()
            java.util.Iterator r8 = r8.iterator()
            r0 = 0
            r2 = r0
            r3 = r2
            r4 = r3
            r5 = r4
        L11:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L7a
            java.lang.Object r0 = r8.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L11
            a.mc r6 = d(r0)
            B r6 = r6.b
            java.lang.String r6 = (java.lang.String) r6
            if (r6 != 0) goto L3e
            a.mc r0 = d(r0)
            A r0 = r0.f578a
            java.lang.String r0 = (java.lang.String) r0
            goto L3f
        L3e:
            r0 = r6
        L3f:
            int r6 = r1.hashCode()
            switch(r6) {
                case 112803: goto L6d;
                case 114586: goto L60;
                case 3005409: goto L54;
                case 3560141: goto L47;
                default: goto L46;
            }
        L46:
            goto L11
        L47:
            java.lang.String r6 = "time"
            boolean r1 = r1.equals(r6)
            if (r1 != 0) goto L50
            goto L11
        L50:
            if (r4 != 0) goto L11
            r4 = r0
            goto L11
        L54:
            java.lang.String r6 = "bVer"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L11
            if (r2 != 0) goto L11
            r2 = r0
            goto L11
        L60:
            java.lang.String r6 = "tag"
            boolean r1 = r1.equals(r6)
            if (r1 != 0) goto L69
            goto L11
        L69:
            if (r3 != 0) goto L11
            r3 = r0
            goto L11
        L6d:
            java.lang.String r6 = "rev"
            boolean r1 = r1.equals(r6)
            if (r1 != 0) goto L76
            goto L11
        L76:
            if (r5 != 0) goto L11
            r5 = r0
            goto L11
        L7a:
            a.hg$a r1 = new a.hg$a
            r6 = 0
            r7 = 0
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return r1
    }

    public static java.lang.String b(java.lang.Class r7, java.lang.String r8) {
            r0 = 0
            if (r8 != 0) goto L5
            goto L86
        L5:
            java.lang.reflect.Method[] r1 = r7.getDeclaredMethods()     // Catch: java.lang.Throwable -> L41
            java.lang.String r2 = "getDeclaredMethods(...)"
            a.C0193i9.d(r1, r2)     // Catch: java.lang.Throwable -> L41
            int r2 = r1.length     // Catch: java.lang.Throwable -> L41
            r3 = 0
        L10:
            if (r3 >= r2) goto L46
            r4 = r1[r3]     // Catch: java.lang.Throwable -> L41
            java.lang.String r5 = r4.getName()     // Catch: java.lang.Throwable -> L41
            boolean r5 = a.C0193i9.a(r5, r8)     // Catch: java.lang.Throwable -> L41
            if (r5 == 0) goto L43
            int r5 = r4.getModifiers()     // Catch: java.lang.Throwable -> L41
            boolean r5 = java.lang.reflect.Modifier.isStatic(r5)     // Catch: java.lang.Throwable -> L41
            if (r5 == 0) goto L43
            java.lang.Class[] r5 = r4.getParameterTypes()     // Catch: java.lang.Throwable -> L41
            java.lang.String r6 = "getParameterTypes(...)"
            a.C0193i9.d(r5, r6)     // Catch: java.lang.Throwable -> L41
            int r5 = r5.length     // Catch: java.lang.Throwable -> L41
            if (r5 != 0) goto L43
            java.lang.Class r5 = r4.getReturnType()     // Catch: java.lang.Throwable -> L41
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            boolean r5 = a.C0193i9.a(r5, r6)     // Catch: java.lang.Throwable -> L41
            if (r5 == 0) goto L43
            goto L47
        L41:
            r7 = move-exception
            goto L7d
        L43:
            int r3 = r3 + 1
            goto L10
        L46:
            r4 = r0
        L47:
            if (r4 != 0) goto L6e
            java.lang.String r7 = r7.getName()     // Catch: java.lang.Throwable -> L41
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L41
            r1.<init>()     // Catch: java.lang.Throwable -> L41
            java.lang.String r2 = "[VersionCollector] format method not found: "
            r1.append(r2)     // Catch: java.lang.Throwable -> L41
            r1.append(r7)     // Catch: java.lang.Throwable -> L41
            java.lang.String r7 = "."
            r1.append(r7)     // Catch: java.lang.Throwable -> L41
            r1.append(r8)     // Catch: java.lang.Throwable -> L41
            java.lang.String r7 = r1.toString()     // Catch: java.lang.Throwable -> L41
            java.lang.Object[] r7 = new java.lang.Object[]{r7}     // Catch: java.lang.Throwable -> L41
            a.C0453x1.e(r7)     // Catch: java.lang.Throwable -> L41
            return r0
        L6e:
            r7 = 1
            r4.setAccessible(r7)     // Catch: java.lang.Throwable -> L41
            java.lang.Object r7 = r4.invoke(r0, r0)     // Catch: java.lang.Throwable -> L41
            boolean r8 = r7 instanceof java.lang.String     // Catch: java.lang.Throwable -> L41
            if (r8 == 0) goto L86
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Throwable -> L41
            return r7
        L7d:
            java.lang.String r8 = "[VersionCollector] callFormatMethod failed"
            java.lang.Object[] r7 = new java.lang.Object[]{r8, r7}
            a.C0453x1.e(r7)
        L86:
            return r0
    }

    public static a.C0199ig c(java.lang.ClassLoader r19) {
            r0 = r19
            java.lang.String r1 = "[VersionCollector] z class resolved via DexKit: "
            java.lang.String r2 = "[VersionCollector] collected: ver="
            java.lang.String r3 = "[VersionCollector] z class load failed: "
            java.lang.String r4 = "classLoader"
            a.C0193i9.e(r0, r4)
            long r6 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L19c
            android.content.Context r4 = a.C0435w1.p     // Catch: java.lang.Throwable -> L19c
            r5 = 0
            r8 = 0
            if (r4 == 0) goto L24
            android.content.pm.PackageManager r4 = r4.getPackageManager()     // Catch: java.lang.Throwable -> L19c
            if (r4 == 0) goto L24
            java.lang.String r9 = "com.tencent.mm"
            android.content.pm.PackageInfo r4 = r4.getPackageInfo(r9, r5)     // Catch: java.lang.Throwable -> L19c
            goto L25
        L24:
            r4 = r8
        L25:
            if (r4 == 0) goto L2b
            java.lang.String r9 = r4.versionName     // Catch: java.lang.Throwable -> L19c
            if (r9 != 0) goto L2d
        L2b:
            java.lang.String r9 = ""
        L2d:
            if (r4 == 0) goto L32
            int r4 = r4.versionCode     // Catch: java.lang.Throwable -> L19c
            goto L33
        L32:
            r4 = r5
        L33:
            a.jg r10 = a.C0217jg.f537a     // Catch: java.lang.Throwable -> L19c
            r10.getClass()     // Catch: java.lang.Throwable -> L19c
            a.kg r10 = a.C0217jg.d()     // Catch: java.lang.Throwable -> L19c
            if (r10 == 0) goto L190
            java.lang.String r11 = r10.f551a     // Catch: java.lang.Throwable -> L19c
            java.lang.String r12 = r10.b     // Catch: java.lang.Throwable -> L19c
            if (r12 == 0) goto L190
            java.lang.Class r11 = a.A1.b(r0, r11)     // Catch: java.lang.Throwable -> L19c
            if (r11 != 0) goto L67
            java.lang.String r0 = r10.f551a     // Catch: java.lang.Throwable -> L19c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L19c
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L19c
            r1.append(r0)     // Catch: java.lang.Throwable -> L19c
            java.lang.String r0 = " (no fallback)"
            r1.append(r0)     // Catch: java.lang.Throwable -> L19c
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L19c
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> L19c
            a.C0453x1.e(r0)     // Catch: java.lang.Throwable -> L19c
            a.ig r0 = a.C0199ig.m     // Catch: java.lang.Throwable -> L19c
            return r0
        L67:
            java.lang.String r3 = r10.f551a     // Catch: java.lang.Throwable -> L19c
            java.lang.String r1 = r1.concat(r3)     // Catch: java.lang.Throwable -> L19c
            java.lang.Object[] r1 = new java.lang.Object[]{r1}     // Catch: java.lang.Throwable -> L19c
            r3 = 1
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r3)     // Catch: java.lang.Throwable -> L19c
            a.C0453x1.b(r1)     // Catch: java.lang.Throwable -> L19c
            java.lang.String r1 = r10.c     // Catch: java.lang.Throwable -> L19c
            if (r1 == 0) goto L82
            java.lang.Class r0 = a.A1.b(r0, r1)     // Catch: java.lang.Throwable -> L19c
            goto L83
        L82:
            r0 = r8
        L83:
            java.lang.String r1 = r10.b     // Catch: java.lang.Throwable -> L19c
            java.lang.String r1 = b(r11, r1)     // Catch: java.lang.Throwable -> L19c
            if (r0 == 0) goto L97
            a.hg r12 = a.C0182hg.f502a     // Catch: java.lang.Throwable -> L19c
            java.lang.Object r13 = r10.e     // Catch: java.lang.Throwable -> L19c
            r12.getClass()     // Catch: java.lang.Throwable -> L19c
            a.hg$a r0 = f(r0, r13)     // Catch: java.lang.Throwable -> L19c
            goto L9c
        L97:
            a.hg$a r0 = new a.hg$a     // Catch: java.lang.Throwable -> L19c
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L19c
        L9c:
            java.lang.String r12 = r0.f503a     // Catch: java.lang.Throwable -> L19c
            if (r12 != 0) goto Lae
            java.lang.String r12 = r0.b     // Catch: java.lang.Throwable -> L19c
            if (r12 != 0) goto Lae
            java.lang.String r12 = r0.c     // Catch: java.lang.Throwable -> L19c
            if (r12 != 0) goto Lae
            java.lang.String r12 = r0.d     // Catch: java.lang.Throwable -> L19c
            if (r12 != 0) goto Lae
            r12 = r3
            goto Laf
        Lae:
            r12 = r5
        Laf:
            if (r12 == 0) goto Lc0
            if (r1 == 0) goto Lc0
            a.hg$a r0 = a(r1)     // Catch: java.lang.Throwable -> L19c
            java.lang.String r12 = "[VersionCollector] mp0 class missing/invalid, baseline from format output (composite parsing)"
            java.lang.Object[] r12 = new java.lang.Object[]{r12}     // Catch: java.lang.Throwable -> L19c
            a.C0453x1.b(r12)     // Catch: java.lang.Throwable -> L19c
        Lc0:
            java.util.ArrayList r10 = r10.d     // Catch: java.lang.Throwable -> L19c
            a.hg$a r10 = f(r11, r10)     // Catch: java.lang.Throwable -> L19c
            if (r1 == 0) goto Lde
            java.lang.String r11 = r0.f503a     // Catch: java.lang.Throwable -> L19c
            if (r11 != 0) goto Ld9
            java.lang.String r11 = r0.b     // Catch: java.lang.Throwable -> L19c
            if (r11 != 0) goto Ld9
            java.lang.String r11 = r0.c     // Catch: java.lang.Throwable -> L19c
            if (r11 != 0) goto Ld9
            java.lang.String r11 = r0.d     // Catch: java.lang.Throwable -> L19c
            if (r11 != 0) goto Ld9
            r5 = r3
        Ld9:
            if (r5 != 0) goto Lde
            g(r1, r0, r10)     // Catch: java.lang.Throwable -> L19c
        Lde:
            java.lang.String r1 = r0.e     // Catch: java.lang.Throwable -> L19c
            if (r1 == 0) goto Lf8
            java.lang.String r5 = "true"
            boolean r5 = r1.equals(r5)     // Catch: java.lang.Throwable -> L19c
            if (r5 == 0) goto Led
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L19c
            goto Lf9
        Led:
            java.lang.String r5 = "false"
            boolean r1 = r1.equals(r5)     // Catch: java.lang.Throwable -> L19c
            if (r1 == 0) goto Lf8
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L19c
            goto Lf9
        Lf8:
            r1 = r8
        Lf9:
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L19c
            boolean r5 = a.C0193i9.a(r1, r5)     // Catch: java.lang.Throwable -> L19c
            if (r5 == 0) goto L124
            java.lang.String r8 = r0.d     // Catch: java.lang.Throwable -> L19c
            java.lang.String r5 = r0.f     // Catch: java.lang.Throwable -> L19c
            if (r5 == 0) goto L124
            int r11 = r5.length()     // Catch: java.lang.Throwable -> L19c
            if (r11 != 0) goto L10e
            goto L124
        L10e:
            if (r8 == 0) goto L124
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L19c
            r11.<init>()     // Catch: java.lang.Throwable -> L19c
            r11.append(r8)     // Catch: java.lang.Throwable -> L19c
            java.lang.String r8 = "."
            r11.append(r8)     // Catch: java.lang.Throwable -> L19c
            r11.append(r5)     // Catch: java.lang.Throwable -> L19c
            java.lang.String r8 = r11.toString()     // Catch: java.lang.Throwable -> L19c
        L124:
            r16 = r8
            a.ig r5 = new a.ig     // Catch: java.lang.Throwable -> L19c
            java.lang.String r8 = r10.b     // Catch: java.lang.Throwable -> L19c
            java.lang.String r11 = r0.b     // Catch: java.lang.Throwable -> L19c
            java.lang.String r12 = r10.c     // Catch: java.lang.Throwable -> L19c
            java.lang.String r13 = r0.c     // Catch: java.lang.Throwable -> L19c
            java.lang.String r14 = r10.d     // Catch: java.lang.Throwable -> L19c
            java.lang.String r15 = r0.d     // Catch: java.lang.Throwable -> L19c
            java.lang.String r3 = r0.f503a     // Catch: java.lang.Throwable -> L19c
            if (r3 != 0) goto L13a
            java.lang.String r3 = r10.f503a     // Catch: java.lang.Throwable -> L19c
        L13a:
            r18 = r1
            r17 = r3
            r1 = r10
            r10 = r8
            r8 = r9
            r9 = r4
            r5.<init>(r6, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)     // Catch: java.lang.Throwable -> L19c
            r3 = r18
            boolean r4 = r5.a()     // Catch: java.lang.Throwable -> L19c
            java.lang.String r1 = r1.b     // Catch: java.lang.Throwable -> L19c
            java.lang.String r0 = r0.b     // Catch: java.lang.Throwable -> L19c
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L19c
            r6.<init>(r2)     // Catch: java.lang.Throwable -> L19c
            r6.append(r8)     // Catch: java.lang.Throwable -> L19c
            java.lang.String r2 = "("
            r6.append(r2)     // Catch: java.lang.Throwable -> L19c
            r6.append(r9)     // Catch: java.lang.Throwable -> L19c
            java.lang.String r2 = ") hotUpdated="
            r6.append(r2)     // Catch: java.lang.Throwable -> L19c
            r6.append(r4)     // Catch: java.lang.Throwable -> L19c
            java.lang.String r2 = " patchEnabled="
            r6.append(r2)     // Catch: java.lang.Throwable -> L19c
            r6.append(r3)     // Catch: java.lang.Throwable -> L19c
            java.lang.String r2 = " currentTag="
            r6.append(r2)     // Catch: java.lang.Throwable -> L19c
            r6.append(r1)     // Catch: java.lang.Throwable -> L19c
            java.lang.String r1 = " baselineTag="
            r6.append(r1)     // Catch: java.lang.Throwable -> L19c
            r6.append(r0)     // Catch: java.lang.Throwable -> L19c
            java.lang.String r0 = r6.toString()     // Catch: java.lang.Throwable -> L19c
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> L19c
            r1 = 1
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)     // Catch: java.lang.Throwable -> L19c
            a.C0453x1.b(r0)     // Catch: java.lang.Throwable -> L19c
            return r5
        L190:
            java.lang.String r0 = "[VersionCollector] symbols not located (no fallback)"
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> L19c
            a.C0453x1.e(r0)     // Catch: java.lang.Throwable -> L19c
            a.ig r0 = a.C0199ig.m     // Catch: java.lang.Throwable -> L19c
            return r0
        L19c:
            r0 = move-exception
            java.lang.String r1 = "[VersionCollector] collect failed (no fallback)"
            java.lang.Object[] r0 = new java.lang.Object[]{r1, r0}
            a.C0453x1.e(r0)
            a.ig r0 = a.C0199ig.m
            return r0
    }

    public static a.C0267mc d(java.lang.String r4) {
            r0 = 40
            int r0 = a.Be.Q(r4, r0)
            if (r0 <= 0) goto L2f
            java.lang.String r1 = ")"
            boolean r1 = r4.endsWith(r1)
            if (r1 == 0) goto L2f
            r1 = 0
            java.lang.String r1 = r4.substring(r1, r0)
            java.lang.String r2 = "substring(...)"
            a.C0193i9.d(r1, r2)
            int r0 = r0 + 1
            int r3 = r4.length()
            int r3 = r3 + (-1)
            java.lang.String r4 = r4.substring(r0, r3)
            a.C0193i9.d(r4, r2)
            a.mc r0 = new a.mc
            r0.<init>(r1, r4)
            return r0
        L2f:
            a.mc r0 = new a.mc
            r1 = 0
            r0.<init>(r4, r1)
            return r0
    }

    public static java.util.LinkedHashMap e(java.lang.String r7) {
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            a.C9 r1 = new a.C9
            r1.<init>(r7)
            boolean r7 = r1.hasNext()
            if (r7 != 0) goto L13
            a.Y5 r7 = a.Y5.f351a
            goto L39
        L13:
            java.lang.Object r7 = r1.next()
            boolean r2 = r1.hasNext()
            if (r2 != 0) goto L22
            java.util.List r7 = a.C0435w1.K(r7)
            goto L39
        L22:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r2.add(r7)
        L2a:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto L38
            java.lang.Object r7 = r1.next()
            r2.add(r7)
            goto L2a
        L38:
            r7 = r2
        L39:
            java.util.Iterator r7 = r7.iterator()
        L3d:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto Ld1
            java.lang.Object r1 = r7.next()
            java.lang.String r1 = (java.lang.String) r1
            r2 = 93
            r3 = 6
            r4 = 0
            int r2 = a.Be.O(r1, r2, r4, r3)
            r3 = 0
            if (r2 < 0) goto L7f
            int r5 = r2 + 2
            int r6 = r1.length()
            if (r5 < r6) goto L5d
            goto L7f
        L5d:
            int r2 = r2 + 1
            java.lang.String r2 = r1.substring(r2)
            java.lang.String r5 = "substring(...)"
            a.C0193i9.d(r2, r5)
            java.lang.CharSequence r2 = a.Be.V(r2)
            java.lang.String r2 = r2.toString()
            int r5 = r2.length()
            if (r5 <= 0) goto L7f
            java.lang.String r5 = "null"
            boolean r5 = r2.equals(r5)
            if (r5 != 0) goto L7f
            r3 = r2
        L7f:
            if (r3 != 0) goto L82
            goto L3d
        L82:
            java.lang.String r2 = "[b.ver]"
            boolean r2 = a.Ae.H(r1, r2, r4)
            if (r2 == 0) goto L90
            java.lang.String r1 = "bVer"
            r0.put(r1, r3)
            goto L3d
        L90:
            java.lang.String r2 = "[tag"
            boolean r2 = a.Ae.H(r1, r2, r4)
            if (r2 == 0) goto L9e
            java.lang.String r1 = "tag"
            r0.put(r1, r3)
            goto L3d
        L9e:
            java.lang.String r2 = "[time"
            boolean r2 = a.Ae.H(r1, r2, r4)
            if (r2 == 0) goto Lac
            java.lang.String r1 = "time"
            r0.put(r1, r3)
            goto L3d
        Lac:
            java.lang.String r2 = "[p.rev]"
            boolean r2 = a.Ae.H(r1, r2, r4)
            if (r2 == 0) goto Lba
            java.lang.String r1 = "pRev"
            r0.put(r1, r3)
            goto L3d
        Lba:
            java.lang.String r2 = "[rev"
            boolean r2 = a.Ae.H(r1, r2, r4)
            if (r2 == 0) goto L3d
            java.lang.String r2 = "[p.rev"
            boolean r1 = a.Ae.H(r1, r2, r4)
            if (r1 != 0) goto L3d
            java.lang.String r1 = "rev"
            r0.put(r1, r3)
            goto L3d
        Ld1:
            return r0
    }

    public static a.C0182hg.a f(java.lang.Class r10, java.util.List r11) {
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r11 = r11.iterator()
        L9:
            boolean r0 = r11.hasNext()
            r2 = 0
            if (r0 == 0) goto L5a
            java.lang.Object r0 = r11.next()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.reflect.Field r3 = r10.getDeclaredField(r0)     // Catch: java.lang.Throwable -> L29
            r4 = 1
            r3.setAccessible(r4)     // Catch: java.lang.Throwable -> L29
            java.lang.Object r3 = r3.get(r2)     // Catch: java.lang.Throwable -> L29
            boolean r4 = r3 instanceof java.lang.String     // Catch: java.lang.Throwable -> L29
            if (r4 == 0) goto L2b
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L29
            goto L2c
        L29:
            r0 = move-exception
            goto L48
        L2b:
            r3 = r2
        L2c:
            if (r3 == 0) goto L46
            int r4 = r3.length()     // Catch: java.lang.Throwable -> L29
            if (r4 <= 0) goto L3d
            java.lang.String r4 = "null"
            boolean r4 = r3.equals(r4)     // Catch: java.lang.Throwable -> L29
            if (r4 != 0) goto L3d
            goto L3e
        L3d:
            r3 = r2
        L3e:
            if (r3 == 0) goto L46
            a.mc r4 = new a.mc     // Catch: java.lang.Throwable -> L29
            r4.<init>(r0, r3)     // Catch: java.lang.Throwable -> L29
            goto L4c
        L46:
            r4 = r2
            goto L4c
        L48:
            a.wd$a r4 = a.C0465xd.a(r0)
        L4c:
            boolean r0 = r4 instanceof a.C0447wd.a
            if (r0 == 0) goto L51
            goto L52
        L51:
            r2 = r4
        L52:
            a.mc r2 = (a.C0267mc) r2
            if (r2 == 0) goto L9
            r1.add(r2)
            goto L9
        L5a:
            java.util.Map r10 = a.C0067ba.G(r1)
            java.util.Set r10 = r10.entrySet()
            java.util.Iterator r10 = r10.iterator()
            r4 = r2
            r5 = r4
            r6 = r5
            r7 = r6
            r8 = r7
            r9 = r8
        L6c:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto Lda
            java.lang.Object r11 = r10.next()
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            java.lang.Object r11 = r11.getValue()
            r2 = r11
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r11 = a.C0235kg.a.a(r2)
            if (r11 == 0) goto L6c
            int r0 = r11.hashCode()
            switch(r0) {
                case 112803: goto Lcd;
                case 114586: goto Lc0;
                case 3005409: goto Lb4;
                case 3560141: goto La7;
                case 30049666: goto L9a;
                case 115384793: goto L8d;
                default: goto L8c;
            }
        L8c:
            goto L6c
        L8d:
            java.lang.String r0 = "patchEnabled"
            boolean r11 = r11.equals(r0)
            if (r11 != 0) goto L96
            goto L6c
        L96:
            if (r8 != 0) goto L6c
            r8 = r2
            goto L6c
        L9a:
            java.lang.String r0 = "patchAppend"
            boolean r11 = r11.equals(r0)
            if (r11 != 0) goto La3
            goto L6c
        La3:
            if (r9 != 0) goto L6c
            r9 = r2
            goto L6c
        La7:
            java.lang.String r0 = "time"
            boolean r11 = r11.equals(r0)
            if (r11 != 0) goto Lb0
            goto L6c
        Lb0:
            if (r6 != 0) goto L6c
            r6 = r2
            goto L6c
        Lb4:
            java.lang.String r0 = "bVer"
            boolean r11 = r11.equals(r0)
            if (r11 == 0) goto L6c
            if (r4 != 0) goto L6c
            r4 = r2
            goto L6c
        Lc0:
            java.lang.String r0 = "tag"
            boolean r11 = r11.equals(r0)
            if (r11 != 0) goto Lc9
            goto L6c
        Lc9:
            if (r5 != 0) goto L6c
            r5 = r2
            goto L6c
        Lcd:
            java.lang.String r0 = "rev"
            boolean r11 = r11.equals(r0)
            if (r11 != 0) goto Ld6
            goto L6c
        Ld6:
            if (r7 != 0) goto L6c
            r7 = r2
            goto L6c
        Lda:
            a.hg$a r3 = new a.hg$a
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return r3
    }

    public static void g(java.lang.String r7, a.C0182hg.a r8, a.C0182hg.a r9) {
            java.util.LinkedHashMap r7 = e(r7)
            java.util.Set r7 = r7.entrySet()
            java.util.Iterator r7 = r7.iterator()
        Lc:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto Lcf
            java.lang.Object r0 = r7.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            int r2 = r1.hashCode()
            switch(r2) {
                case 112803: goto L50;
                case 114586: goto L44;
                case 3005409: goto L38;
                case 3560141: goto L2c;
                default: goto L2b;
            }
        L2b:
            goto L58
        L2c:
            java.lang.String r2 = "time"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L35
            goto L58
        L35:
            java.lang.String r2 = r8.c
            goto L5c
        L38:
            java.lang.String r2 = "bVer"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L41
            goto L58
        L41:
            java.lang.String r2 = r8.f503a
            goto L5c
        L44:
            java.lang.String r2 = "tag"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L4d
            goto L58
        L4d:
            java.lang.String r2 = r8.b
            goto L5c
        L50:
            java.lang.String r2 = "rev"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L5a
        L58:
            r2 = 0
            goto L5c
        L5a:
            java.lang.String r2 = r8.d
        L5c:
            if (r0 == 0) goto Lc
            if (r2 != 0) goto L61
            goto Lc
        L61:
            a.mc r0 = d(r0)
            A r3 = r0.f578a
            java.lang.String r3 = (java.lang.String) r3
            B r0 = r0.b
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r4 = "[VersionCollector] cross-check ["
            if (r3 == 0) goto Laf
            java.lang.String r5 = r9.b
            boolean r5 = r3.equals(r5)
            if (r5 != 0) goto Laf
            java.lang.String r5 = r9.c
            boolean r5 = r3.equals(r5)
            if (r5 != 0) goto Laf
            java.lang.String r5 = r9.d
            boolean r5 = r3.equals(r5)
            if (r5 != 0) goto Laf
            java.lang.String r5 = r9.f503a
            boolean r5 = r3.equals(r5)
            if (r5 != 0) goto Laf
            java.lang.String r5 = "]: format="
            java.lang.String r6 = " differs from current fields, baseline split="
            java.lang.StringBuilder r3 = a.C0487z.i(r4, r1, r5, r3, r6)
            r3.append(r0)
            java.lang.String r5 = " direct="
            r3.append(r5)
            r3.append(r2)
            java.lang.String r3 = r3.toString()
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            a.C0453x1.e(r3)
        Laf:
            if (r0 == 0) goto Lc
            boolean r3 = r0.equals(r2)
            if (r3 != 0) goto Lc
            java.lang.String r3 = "]: baseline split="
            java.lang.String r5 = " != mp0 direct="
            java.lang.StringBuilder r0 = a.C0487z.i(r4, r1, r3, r0, r5)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            a.C0453x1.e(r0)
            goto Lc
        Lcf:
            return
    }
}
