package fb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f3458b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f3459c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.String f3460d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f3461e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.lang.String f3462f;

    public c2(int r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, boolean r8, java.lang.String r9, int r10) {
            r3 = this;
            r0 = r10 & 1
            r1 = 0
            if (r0 == 0) goto L6
            r4 = r1
        L6:
            r0 = r10 & 2
            java.lang.String r2 = ""
            if (r0 == 0) goto Ld
            r5 = r2
        Ld:
            r0 = r10 & 4
            if (r0 == 0) goto L12
            r6 = r2
        L12:
            r0 = r10 & 8
            if (r0 == 0) goto L17
            r7 = r2
        L17:
            r0 = r10 & 16
            if (r0 == 0) goto L1c
            r8 = r1
        L1c:
            r10 = r10 & 32
            if (r10 == 0) goto L21
            r9 = 0
        L21:
            r5.getClass()
            r3.<init>()
            r3.f3457a = r4
            r3.f3458b = r5
            r3.f3459c = r6
            r3.f3460d = r7
            r3.f3461e = r8
            r3.f3462f = r9
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L45
        L3:
            boolean r0 = r3 instanceof fb.c2
            if (r0 != 0) goto L8
            goto L43
        L8:
            fb.c2 r3 = (fb.c2) r3
            int r0 = r2.f3457a
            int r1 = r3.f3457a
            if (r0 == r1) goto L11
            goto L43
        L11:
            java.lang.String r0 = r2.f3458b
            java.lang.String r1 = r3.f3458b
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1c
            goto L43
        L1c:
            java.lang.String r0 = r2.f3459c
            java.lang.String r1 = r3.f3459c
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L27
            goto L43
        L27:
            java.lang.String r0 = r2.f3460d
            java.lang.String r1 = r3.f3460d
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L32
            goto L43
        L32:
            boolean r0 = r2.f3461e
            boolean r1 = r3.f3461e
            if (r0 == r1) goto L39
            goto L43
        L39:
            java.lang.String r0 = r2.f3462f
            java.lang.String r3 = r3.f3462f
            boolean r3 = gg.l.a(r0, r3)
            if (r3 != 0) goto L45
        L43:
            r3 = 0
            return r3
        L45:
            r3 = 1
            return r3
    }

    public final int hashCode() {
            r3 = this;
            int r0 = r3.f3457a
            int r0 = java.lang.Integer.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.f3458b
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r2 = r3.f3459c
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r2 = r3.f3460d
            int r0 = eh.a.g(r0, r1, r2)
            boolean r2 = r3.f3461e
            int r0 = eh.a.h(r0, r1, r2)
            java.lang.String r1 = r3.f3462f
            if (r1 != 0) goto L27
            r1 = 0
            goto L2b
        L27:
            int r1 = r1.hashCode()
        L2b:
            int r0 = r0 + r1
            return r0
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "FetchResult(status="
            r0.<init>(r1)
            int r1 = r5.f3457a
            r0.append(r1)
            java.lang.String r1 = ", url="
            r0.append(r1)
            java.lang.String r1 = r5.f3458b
            r0.append(r1)
            java.lang.String r1 = ", contentType="
            r0.append(r1)
            java.lang.String r1 = ", body="
            java.lang.String r2 = ", truncated="
            java.lang.String r3 = r5.f3459c
            java.lang.String r4 = r5.f3460d
            j8.b.t(r0, r3, r1, r4, r2)
            boolean r1 = r5.f3461e
            r0.append(r1)
            java.lang.String r1 = ", error="
            r0.append(r1)
            java.lang.String r1 = r5.f3462f
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
