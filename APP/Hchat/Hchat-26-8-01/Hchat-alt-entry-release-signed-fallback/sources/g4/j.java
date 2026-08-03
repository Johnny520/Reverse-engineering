package g4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final g4.j f4299d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final g4.j f4300e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final g4.j f4301f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final g4.j f4302g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final g4.j f4303h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final g4.j f4304i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final g4.j f4305j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final g4.j f4306k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final g4.j f4307l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final g4.j f4308m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final g4.j f4309n = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final java.util.HashMap f4310o = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f4311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w4.c f4312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v4.d0 f4313c;

    static {
            g4.j r0 = new g4.j
            w4.c r1 = w4.c.f14866o
            r0.<init>(r1)
            g4.j.f4299d = r0
            g4.j r1 = new g4.j
            w4.c r2 = w4.c.f14867p
            r1.<init>(r2)
            g4.j.f4300e = r1
            g4.j r2 = new g4.j
            w4.c r3 = w4.c.f14868q
            r2.<init>(r3)
            g4.j.f4301f = r2
            g4.j r3 = new g4.j
            w4.c r4 = w4.c.f14869r
            r3.<init>(r4)
            g4.j.f4302g = r3
            g4.j r4 = new g4.j
            w4.c r5 = w4.c.f14870s
            r4.<init>(r5)
            g4.j.f4303h = r4
            g4.j r5 = new g4.j
            w4.c r6 = w4.c.f14871t
            r5.<init>(r6)
            g4.j.f4304i = r5
            g4.j r6 = new g4.j
            w4.c r7 = w4.c.f14872u
            r6.<init>(r7)
            g4.j.f4305j = r6
            g4.j r7 = new g4.j
            w4.c r8 = w4.c.f14873v
            r7.<init>(r8)
            g4.j.f4306k = r7
            g4.j r8 = new g4.j
            w4.c r9 = w4.c.f14874w
            r8.<init>(r9)
            g4.j.f4307l = r8
            g4.j r9 = new g4.j
            w4.c r10 = w4.c.E
            r9.<init>(r10)
            g4.j.f4308m = r9
            g4.j r9 = new g4.j
            w4.c r10 = w4.c.G
            r9.<init>(r10)
            g4.j.f4309n = r9
            java.util.HashMap r9 = new java.util.HashMap
            r9.<init>()
            g4.j.f4310o = r9
            java.lang.Class r10 = java.lang.Boolean.TYPE
            r9.put(r10, r0)
            java.lang.Class r0 = java.lang.Byte.TYPE
            r9.put(r0, r1)
            java.lang.Class r0 = java.lang.Character.TYPE
            r9.put(r0, r2)
            java.lang.Class r0 = java.lang.Double.TYPE
            r9.put(r0, r3)
            java.lang.Class r0 = java.lang.Float.TYPE
            r9.put(r0, r4)
            java.lang.Class r0 = java.lang.Integer.TYPE
            r9.put(r0, r5)
            java.lang.Class r0 = java.lang.Long.TYPE
            r9.put(r0, r6)
            java.lang.Class r0 = java.lang.Short.TYPE
            r9.put(r0, r7)
            java.lang.Class r0 = java.lang.Void.TYPE
            r9.put(r0, r8)
            return
    }

    public j(java.lang.String r1, w4.c r2) {
            r0 = this;
            r0.<init>()
            if (r1 == 0) goto L12
            if (r2 == 0) goto L12
            r0.f4311a = r1
            r0.f4312b = r2
            v4.d0 r1 = v4.d0.l(r2)
            r0.f4313c = r1
            return
        L12:
            r1 = 0
            throw r1
    }

    public j(w4.c r2) {
            r1 = this;
            java.lang.String r0 = r2.f14878g
            r1.<init>(r0, r2)
            return
    }

    public static g4.j a(java.lang.Class r3) {
            boolean r0 = r3.isPrimitive()
            if (r0 == 0) goto Lf
            java.util.HashMap r0 = g4.j.f4310o
            java.lang.Object r3 = r0.get(r3)
            g4.j r3 = (g4.j) r3
            return r3
        Lf:
            java.lang.String r0 = r3.getName()
            r1 = 46
            r2 = 47
            java.lang.String r0 = r0.replace(r1, r2)
            boolean r3 = r3.isArray()
            if (r3 == 0) goto L22
            goto L35
        L22:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r1 = "L"
            r3.<init>(r1)
            r3.append(r0)
            r0 = 59
            r3.append(r0)
            java.lang.String r0 = r3.toString()
        L35:
            g4.j r3 = new g4.j
            w4.c r1 = w4.c.o(r0)
            r3.<init>(r0, r1)
            return r3
    }

    public final g4.i b(g4.j r3, java.lang.String r4, g4.j... r5) {
            r2 = this;
            g4.i r0 = new g4.i
            g4.k r1 = new g4.k
            r1.<init>(r5)
            r0.<init>(r2, r3, r4, r1)
            return r0
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof g4.j
            if (r0 == 0) goto L12
            g4.j r2 = (g4.j) r2
            java.lang.String r2 = r2.f4311a
            java.lang.String r0 = r1.f4311a
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L12
            r2 = 1
            return r2
        L12:
            r2 = 0
            return r2
    }

    public final int hashCode() {
            r1 = this;
            java.lang.String r0 = r1.f4311a
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.f4311a
            return r0
    }
}
