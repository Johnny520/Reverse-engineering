package m2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m2.p f8706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m2.k f8707b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f8708c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f8709d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.Object f8710e;

    public q(m2.p r1, m2.k r2, int r3, int r4, java.lang.Object r5) {
            r0 = this;
            r0.<init>()
            r0.f8706a = r1
            r0.f8707b = r2
            r0.f8708c = r3
            r0.f8709d = r4
            r0.f8710e = r5
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof m2.q
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            m2.q r5 = (m2.q) r5
            m2.p r1 = r4.f8706a
            m2.p r3 = r5.f8706a
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            m2.k r1 = r4.f8707b
            m2.k r3 = r5.f8707b
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            int r1 = r4.f8708c
            int r3 = r5.f8708c
            if (r1 != r3) goto L3a
            int r1 = r4.f8709d
            int r3 = r5.f8709d
            if (r1 != r3) goto L3a
            java.lang.Object r1 = r4.f8710e
            java.lang.Object r5 = r5.f8710e
            boolean r5 = gg.l.a(r1, r5)
            if (r5 != 0) goto L39
            return r2
        L39:
            return r0
        L3a:
            return r2
    }

    public final int hashCode() {
            r4 = this;
            r0 = 0
            m2.p r1 = r4.f8706a
            if (r1 != 0) goto L7
            r1 = r0
            goto Lb
        L7:
            int r1 = r1.hashCode()
        Lb:
            r2 = 31
            int r1 = r1 * r2
            m2.k r3 = r4.f8707b
            int r3 = r3.f8701g
            int r1 = r1 + r3
            int r1 = r1 * r2
            int r3 = r4.f8708c
            int r1 = eh.a.e(r3, r1, r2)
            int r3 = r4.f8709d
            int r1 = eh.a.e(r3, r1, r2)
            java.lang.Object r2 = r4.f8710e
            if (r2 != 0) goto L25
            goto L29
        L25:
            int r0 = r2.hashCode()
        L29:
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "TypefaceRequest(fontFamily="
            r0.<init>(r1)
            m2.p r1 = r4.f8706a
            r0.append(r1)
            java.lang.String r1 = ", fontWeight="
            r0.append(r1)
            m2.k r1 = r4.f8707b
            r0.append(r1)
            java.lang.String r1 = ", fontStyle="
            r0.append(r1)
            java.lang.String r1 = "Invalid"
            r2 = 1
            int r3 = r4.f8708c
            if (r3 != 0) goto L25
            java.lang.String r3 = "Normal"
            goto L2b
        L25:
            if (r3 != r2) goto L2a
            java.lang.String r3 = "Italic"
            goto L2b
        L2a:
            r3 = r1
        L2b:
            r0.append(r3)
            java.lang.String r3 = ", fontSynthesis="
            r0.append(r3)
            int r3 = r4.f8709d
            if (r3 != 0) goto L3a
            java.lang.String r1 = "None"
            goto L4c
        L3a:
            if (r3 != r2) goto L3f
            java.lang.String r1 = "Weight"
            goto L4c
        L3f:
            r2 = 2
            if (r3 != r2) goto L45
            java.lang.String r1 = "Style"
            goto L4c
        L45:
            r2 = 65535(0xffff, float:9.1834E-41)
            if (r3 != r2) goto L4c
            java.lang.String r1 = "All"
        L4c:
            r0.append(r1)
            java.lang.String r1 = ", resourceLoaderCacheKey="
            r0.append(r1)
            java.lang.Object r1 = r4.f8710e
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
