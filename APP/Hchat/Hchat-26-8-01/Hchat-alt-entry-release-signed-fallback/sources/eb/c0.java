package eb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f2506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f2507b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.io.File f2508c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.io.File f2509d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.String f2510e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.lang.String f2511f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.lang.String f2512g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.String f2513h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.util.Set f2514i;

    public c0(java.lang.String r1, java.lang.String r2, java.io.File r3, java.io.File r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.util.Set r9) {
            r0 = this;
            r9.getClass()
            r0.<init>()
            r0.f2506a = r1
            r0.f2507b = r2
            r0.f2508c = r3
            r0.f2509d = r4
            r0.f2510e = r5
            r0.f2511f = r6
            r0.f2512g = r7
            r0.f2513h = r8
            r0.f2514i = r9
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L4
            goto L70
        L4:
            boolean r0 = r3 instanceof eb.c0
            if (r0 != 0) goto La
            goto L6e
        La:
            eb.c0 r3 = (eb.c0) r3
            java.lang.String r0 = r2.f2506a
            java.lang.String r1 = r3.f2506a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L17
            goto L6e
        L17:
            java.lang.String r0 = r2.f2507b
            java.lang.String r1 = r3.f2507b
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L22
            goto L6e
        L22:
            java.io.File r0 = r2.f2508c
            java.io.File r1 = r3.f2508c
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2d
            goto L6e
        L2d:
            java.io.File r0 = r2.f2509d
            java.io.File r1 = r3.f2509d
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L38
            goto L6e
        L38:
            java.lang.String r0 = r2.f2510e
            java.lang.String r1 = r3.f2510e
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L43
            goto L6e
        L43:
            java.lang.String r0 = r2.f2511f
            java.lang.String r1 = r3.f2511f
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L4e
            goto L6e
        L4e:
            java.lang.String r0 = r2.f2512g
            java.lang.String r1 = r3.f2512g
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L59
            goto L6e
        L59:
            java.lang.String r0 = r2.f2513h
            java.lang.String r1 = r3.f2513h
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L64
            goto L6e
        L64:
            java.util.Set r0 = r2.f2514i
            java.util.Set r3 = r3.f2514i
            boolean r3 = gg.l.a(r0, r3)
            if (r3 != 0) goto L70
        L6e:
            r3 = 0
            return r3
        L70:
            r3 = 1
            return r3
    }

    public final int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.f2506a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.f2507b
            int r0 = eh.a.g(r0, r1, r2)
            java.io.File r2 = r3.f2508c
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            java.io.File r0 = r3.f2509d
            int r0 = r0.hashCode()
            int r0 = r0 + r2
            int r0 = r0 * r1
            java.lang.String r2 = r3.f2510e
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r2 = r3.f2511f
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r2 = r3.f2512g
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r2 = r3.f2513h
            if (r2 != 0) goto L37
            r2 = 0
            goto L3b
        L37:
            int r2 = r2.hashCode()
        L3b:
            int r0 = r0 + r2
            int r0 = r0 * r1
            java.util.Set r1 = r3.f2514i
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", name="
            java.lang.String r1 = ", dir="
            java.lang.String r2 = "ScriptPlugin(id="
            java.lang.String r3 = r5.f2506a
            java.lang.String r4 = r5.f2507b
            java.lang.StringBuilder r0 = bc.e.p(r2, r3, r0, r4, r1)
            java.io.File r1 = r5.f2508c
            r0.append(r1)
            java.lang.String r1 = ", mainFile="
            r0.append(r1)
            java.io.File r1 = r5.f2509d
            r0.append(r1)
            java.lang.String r1 = ", author="
            r0.append(r1)
            java.lang.String r1 = ", version="
            java.lang.String r2 = ", updateTime="
            java.lang.String r3 = r5.f2510e
            java.lang.String r4 = r5.f2511f
            j8.b.t(r0, r3, r1, r4, r2)
            java.lang.String r1 = ", displayName="
            java.lang.String r2 = ", processScope="
            java.lang.String r3 = r5.f2512g
            java.lang.String r4 = r5.f2513h
            j8.b.t(r0, r3, r1, r4, r2)
            java.util.Set r1 = r5.f2514i
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
