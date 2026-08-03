package b8;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements java.lang.Comparable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f514g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final char f515h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final b8.b f516i;

    public g(int r1, char r2, b8.b r3) {
            r0 = this;
            r0.<init>()
            r0.f514g = r1
            r0.f515h = r2
            r0.f516i = r3
            return
    }

    @Override // java.lang.Comparable
    public final int compareTo(java.lang.Object r5) {
            r4 = this;
            b8.g r5 = (b8.g) r5
            if (r5 != r4) goto L6
            r5 = 0
            return r5
        L6:
            int r0 = r5.f514g
            int r1 = r4.f514g
            int r2 = y7.a.b(r1, r0)
            r3 = 2
            if (r1 == r3) goto L39
            if (r0 != r3) goto L14
            goto L39
        L14:
            b8.b r3 = r4.f516i
            int r3 = r3.b()
            b8.b r5 = r5.f516i
            int r5 = r5.b()
            int r5 = y7.a.b(r3, r5)
            r3 = 3
            if (r1 != 0) goto L2a
            if (r0 != r3) goto L38
            goto L2e
        L2a:
            if (r0 != 0) goto L30
            if (r1 != r3) goto L38
        L2e:
            r5 = 1
            return r5
        L30:
            if (r5 != 0) goto L33
            goto L39
        L33:
            if (r2 != 0) goto L38
            if (r1 != r3) goto L38
            int r5 = -r5
        L38:
            return r5
        L39:
            return r2
    }

    public final java.lang.String toString() {
            r5 = this;
            r0 = 2
            int r1 = r5.f514g
            if (r1 != r0) goto Lc
            char r0 = r5.f515h
            java.lang.String r0 = java.lang.String.valueOf(r0)
            return r0
        Lc:
            r0 = 1
            java.lang.String r2 = ">"
            b8.b r3 = r5.f516i
            java.lang.String r4 = "<"
            if (r1 != r0) goto L29
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r4)
            java.lang.String r1 = r3.getTagName()
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            return r0
        L29:
            if (r1 != 0) goto L41
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r4)
            java.lang.String r1 = r3.getTagName()
            r0.append(r1)
            java.lang.String r1 = "/>"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L41:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "</"
            r0.<init>(r1)
            java.lang.String r1 = r3.getTagName()
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
