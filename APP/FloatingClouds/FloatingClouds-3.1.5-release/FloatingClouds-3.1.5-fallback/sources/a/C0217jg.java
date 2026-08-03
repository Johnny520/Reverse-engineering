package a;

/* JADX INFO: renamed from: a.jg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0217jg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a.C0217jg f537a = null;

    static {
            a.jg r0 = new a.jg
            r0.<init>()
            a.C0217jg.f537a = r0
            return
    }

    public static a.C0235kg a(java.lang.String r7, java.lang.String r8) {
            a.lb r0 = b(r7)
            if (r0 == 0) goto Le
            a.f5 r0 = r0.b()
            java.lang.String r0 = r0.b
        Lc:
            r3 = r0
            goto L10
        Le:
            r0 = 0
            goto Lc
        L10:
            java.util.ArrayList r5 = h(r7)
            if (r8 == 0) goto L21
            a.jg r0 = a.C0217jg.f537a
            r0.getClass()
            java.util.ArrayList r0 = h(r8)
        L1f:
            r6 = r0
            goto L24
        L21:
            a.Y5 r0 = a.Y5.f351a
            goto L1f
        L24:
            a.kg r1 = new a.kg
            r2 = r7
            r4 = r8
            r1.<init>(r2, r3, r4, r5, r6)
            return r1
    }

    public static a.C0248lb b(java.lang.String r7) {
            java.lang.String r0 = "java.lang.String"
            r1 = 0
            java.lang.String r2 = "[b.ver]"
            r3 = 4
            java.util.List r3 = a.C0435w1.x(r7, r0, r1, r2, r3)
            java.util.Iterator r3 = r3.iterator()
        Le:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L2c
            java.lang.Object r4 = r3.next()
            r5 = r4
            a.lb r5 = (a.C0248lb) r5
            java.util.ArrayList r6 = r5.f
            int r6 = r6.size()
            if (r6 != 0) goto Le
            int r5 = r5.c
            boolean r5 = java.lang.reflect.Modifier.isStatic(r5)
            if (r5 == 0) goto Le
            goto L2d
        L2c:
            r4 = r1
        L2d:
            a.lb r4 = (a.C0248lb) r4
            if (r4 == 0) goto L32
            return r4
        L32:
            r3 = 14
            java.util.List r3 = a.C0435w1.x(r7, r1, r1, r1, r3)
            java.util.Iterator r3 = r3.iterator()
        L3c:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L74
            java.lang.Object r4 = r3.next()
            r5 = r4
            a.lb r5 = (a.C0248lb) r5
            int r6 = r5.c
            boolean r6 = java.lang.reflect.Modifier.isStatic(r6)
            if (r6 == 0) goto L3c
            java.util.ArrayList r6 = r5.f
            int r6 = r6.size()
            if (r6 != 0) goto L3c
            a.f5 r6 = r5.b()
            java.lang.String r6 = r6.d
            boolean r6 = a.C0193i9.a(r6, r0)
            if (r6 == 0) goto L3c
            a.Me r5 = r5.h
            java.lang.Object r5 = r5.a()
            java.util.List r5 = (java.util.List) r5
            boolean r5 = r5.contains(r2)
            if (r5 == 0) goto L3c
            goto L75
        L74:
            r4 = r1
        L75:
            a.lb r4 = (a.C0248lb) r4
            if (r4 == 0) goto L7a
            return r4
        L7a:
            java.lang.String r0 = "[VersionLocator] V2 FAILED: format method not located in "
            java.lang.String r7 = r0.concat(r7)
            java.lang.Object[] r7 = new java.lang.Object[]{r7}
            a.C0453x1.e(r7)
            return r1
    }

    public static boolean c(java.lang.String r3) {
            java.lang.String r0 = "java.lang.String"
            r1 = 0
            r2 = 12
            java.util.List r3 = a.C0435w1.x(r3, r0, r1, r1, r2)
            if (r3 == 0) goto L12
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L12
            goto L34
        L12:
            java.util.Iterator r3 = r3.iterator()
        L16:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L34
            java.lang.Object r0 = r3.next()
            a.lb r0 = (a.C0248lb) r0
            java.util.ArrayList r1 = r0.f
            int r1 = r1.size()
            if (r1 != 0) goto L16
            int r0 = r0.c
            boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
            if (r0 == 0) goto L16
            r3 = 1
            return r3
        L34:
            r3 = 0
            return r3
    }

    public static a.C0235kg d() {
            java.lang.Object r0 = a.C0043a5.f384a
            r1 = 0
            if (r0 == 0) goto L16
            java.lang.String r2 = "version_info_v1"
            java.lang.Object r0 = r0.get(r2)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L10
            goto L16
        L10:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Exception -> L16
            r2.<init>(r0)     // Catch: java.lang.Exception -> L16
            goto L17
        L16:
            r2 = r1
        L17:
            if (r2 != 0) goto L1b
        L19:
            r3 = r1
            goto L44
        L1b:
            java.lang.String r0 = "versionFormatClass"
            java.lang.String r3 = ""
            java.lang.String r0 = r2.optString(r0, r3)
            java.lang.String r4 = "baselineInfoClass"
            java.lang.String r2 = r2.optString(r4, r3)
            a.C0193i9.b(r0)
            boolean r3 = a.Be.P(r0)
            if (r3 == 0) goto L3c
            a.C0193i9.b(r2)
            boolean r3 = a.Be.P(r2)
            if (r3 == 0) goto L3c
            goto L19
        L3c:
            a.a5$k r3 = new a.a5$k
            a.C0193i9.b(r2)
            r3.<init>(r0, r2)
        L44:
            if (r3 != 0) goto L48
        L46:
            r0 = r1
            goto L5f
        L48:
            java.lang.String r0 = r3.f395a
            boolean r2 = a.Be.P(r0)
            if (r2 == 0) goto L51
            goto L46
        L51:
            java.lang.String r2 = r3.b
            boolean r3 = a.Be.P(r2)
            if (r3 != 0) goto L5a
            goto L5b
        L5a:
            r2 = r1
        L5b:
            a.kg r0 = a(r0, r2)
        L5f:
            if (r0 == 0) goto L62
            return r0
        L62:
            org.luckypray.dexkit.DexKitBridge r0 = a.C0435w1.l
            if (r0 == 0) goto L6b
            a.kg r0 = e()
            return r0
        L6b:
            return r1
    }

    public static a.C0235kg e() {
            a.kg r0 = f()     // Catch: java.lang.Throwable -> L5
            goto La
        L5:
            r0 = move-exception
            a.wd$a r0 = a.C0465xd.a(r0)
        La:
            java.lang.Throwable r1 = a.C0447wd.a(r0)
            if (r1 != 0) goto L11
            goto L1b
        L11:
            java.lang.String r0 = "[VersionLocator] locateNow failed"
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r1}
            a.C0453x1.e(r0)
            r0 = 0
        L1b:
            a.kg r0 = (a.C0235kg) r0
            if (r0 != 0) goto L28
            java.lang.String r1 = "[VersionLocator] locate FAILED (no fallback)"
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            a.C0453x1.e(r1)
        L28:
            return r0
    }

    public static a.C0235kg f() {
            java.lang.String r0 = "[b.ver]"
            java.lang.String r1 = "[p.rev]"
            java.lang.String[] r2 = new java.lang.String[]{r0, r1}
            java.util.List r2 = a.C0435w1.s(r2)
            java.util.Iterator r2 = r2.iterator()
        L10:
            boolean r3 = r2.hasNext()
            a.jg r4 = a.C0217jg.f537a
            r5 = 0
            if (r3 == 0) goto L2a
            java.lang.Object r3 = r2.next()
            r6 = r3
            java.lang.String r6 = (java.lang.String) r6
            r4.getClass()
            boolean r6 = c(r6)
            if (r6 == 0) goto L10
            goto L2b
        L2a:
            r3 = r5
        L2b:
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto L31
            goto La6
        L31:
            java.util.List r2 = a.C0435w1.r(r0, r5)
            java.util.List r1 = a.C0435w1.r(r1, r5)
            java.util.Iterator r2 = r2.iterator()
        L3d:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L5a
            java.lang.Object r3 = r2.next()
            r6 = r3
            java.lang.String r6 = (java.lang.String) r6
            boolean r7 = r1.contains(r6)
            if (r7 == 0) goto L3d
            r4.getClass()
            boolean r6 = c(r6)
            if (r6 == 0) goto L3d
            goto L5b
        L5a:
            r3 = r5
        L5b:
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto L60
            goto La6
        L60:
            java.util.List r0 = a.C0435w1.r(r0, r5)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L6d:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L92
            java.lang.Object r2 = r0.next()
            r3 = r2
            java.lang.String r3 = (java.lang.String) r3
            r4.getClass()
            java.util.ArrayList r6 = h(r3)
            int r6 = r6.size()
            r7 = 5
            if (r6 < r7) goto L6d
            boolean r3 = c(r3)
            if (r3 == 0) goto L6d
            r1.add(r2)
            goto L6d
        L92:
            java.lang.Object r0 = a.C0383t3.n0(r1)
            r3 = r0
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto L9c
            goto La6
        L9c:
            java.lang.String r0 = "[VersionLocator] V1 FAILED: z class not located"
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            a.C0453x1.e(r0)
            r3 = r5
        La6:
            if (r3 != 0) goto La9
            goto Laf
        La9:
            a.lb r0 = b(r3)
            if (r0 != 0) goto Lb0
        Laf:
            return r5
        Lb0:
            a.Me r1 = r0.i
            java.lang.Object r1 = r1.a()
            java.util.List r1 = (java.util.List) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        Lc1:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto Le5
            java.lang.Object r6 = r1.next()
            a.Yf r6 = (a.Yf) r6
            a.r6 r6 = r6.f364a
            a.Y4 r6 = r6.b()
            java.lang.String r6 = r6.f350a
            r7 = 36
            boolean r7 = a.Be.J(r6, r7)
            if (r7 != 0) goto Lde
            goto Ldf
        Lde:
            r6 = r5
        Ldf:
            if (r6 == 0) goto Lc1
            r2.add(r6)
            goto Lc1
        Le5:
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>(r2)
            java.util.List r1 = a.C0383t3.w0(r1)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        Lf7:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L114
            java.lang.Object r6 = r1.next()
            r7 = r6
            java.lang.String r7 = (java.lang.String) r7
            a.f5 r8 = r0.b()
            java.lang.String r8 = r8.f469a
            boolean r7 = a.C0193i9.a(r7, r8)
            if (r7 != 0) goto Lf7
            r2.add(r6)
            goto Lf7
        L114:
            a.Z4 r1 = new a.Z4
            r6 = 3
            r1.<init>(r6)
            java.util.List r1 = a.C0383t3.r0(r2, r1)
            java.util.Iterator r1 = r1.iterator()
        L122:
            boolean r2 = r1.hasNext()
            r6 = 6
            if (r2 == 0) goto L145
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            int r7 = g(r2)
            if (r7 < r6) goto L122
            java.lang.String r0 = "[VersionLocator] V3: mp0 class located via usingFields: "
            java.lang.String r0 = a.C0487z.k(r0, r2)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            a.C0453x1.b(r0)
            r5 = r2
            goto L1d6
        L145:
            a.f5 r1 = r0.b()
            java.lang.String r1 = r1.f469a
            java.lang.String r2 = ""
            java.lang.String r1 = a.Be.U(r1, r2)
            java.util.List r1 = a.C0435w1.q(r1)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L15e:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto L184
            java.lang.Object r7 = r1.next()
            r8 = r7
            java.lang.String r8 = (java.lang.String) r8
            a.f5 r9 = r0.b()
            java.lang.String r9 = r9.f469a
            boolean r9 = a.C0193i9.a(r8, r9)
            if (r9 != 0) goto L15e
            r4.getClass()
            int r8 = g(r8)
            if (r8 < r6) goto L15e
            r2.add(r7)
            goto L15e
        L184:
            java.util.Iterator r0 = r2.iterator()
            boolean r1 = r0.hasNext()
            if (r1 != 0) goto L190
            r1 = r5
            goto L1ba
        L190:
            java.lang.Object r1 = r0.next()
            boolean r2 = r0.hasNext()
            if (r2 != 0) goto L19b
            goto L1ba
        L19b:
            r2 = r1
            java.lang.String r2 = (java.lang.String) r2
            r4.getClass()
            int r2 = g(r2)
        L1a5:
            java.lang.Object r4 = r0.next()
            r6 = r4
            java.lang.String r6 = (java.lang.String) r6
            int r6 = g(r6)
            if (r2 >= r6) goto L1b4
            r1 = r4
            r2 = r6
        L1b4:
            boolean r4 = r0.hasNext()
            if (r4 != 0) goto L1a5
        L1ba:
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L1cd
            java.lang.String r0 = "[VersionLocator] V3': mp0 class located via package structure scan: "
            java.lang.String r0 = r0.concat(r1)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            a.C0453x1.b(r0)
            r5 = r1
            goto L1d6
        L1cd:
            java.lang.String r0 = "[VersionLocator] V3 FAILED: mp0 class not located (baseline falls back to composite parsing)"
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            a.C0453x1.e(r0)
        L1d6:
            a.kg r0 = a(r3, r5)
            return r0
    }

    public static int g(java.lang.String r0) {
            java.util.ArrayList r0 = h(r0)
            int r0 = r0.size()
            return r0
    }

    public static java.util.ArrayList h(java.lang.String r3) {
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            java.lang.String r2 = "java.lang.String"
            java.util.List r3 = a.C0435w1.t(r3, r2, r0, r1)
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = a.C0312p3.g0(r3, r1)
            r0.<init>(r1)
            java.util.Iterator r3 = r3.iterator()
        L19:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L2f
            java.lang.Object r1 = r3.next()
            a.r6 r1 = (a.C0350r6) r1
            a.Y4 r1 = r1.b()
            java.lang.String r1 = r1.b
            r0.add(r1)
            goto L19
        L2f:
            return r0
    }
}
