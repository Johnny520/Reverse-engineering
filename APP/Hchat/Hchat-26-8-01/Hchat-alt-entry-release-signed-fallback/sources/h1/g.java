package h1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends h1.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f5044b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f5045c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f5046d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f5047e;

    public g(float r3, float r4, int r5, int r6, int r7) {
            r2 = this;
            r0 = r7 & 2
            if (r0 == 0) goto L6
            r4 = 1082130432(0x40800000, float:4.0)
        L6:
            r0 = r7 & 4
            r1 = 0
            if (r0 == 0) goto Lc
            r5 = r1
        Lc:
            r7 = r7 & 8
            if (r7 == 0) goto L11
            r6 = r1
        L11:
            r2.<init>()
            r2.f5044b = r3
            r2.f5045c = r4
            r2.f5046d = r5
            r2.f5047e = r6
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof h1.g
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            h1.g r5 = (h1.g) r5
            float r1 = r5.f5044b
            float r3 = r4.f5044b
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 != 0) goto L29
            float r1 = r4.f5045c
            float r3 = r5.f5045c
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L29
            int r1 = r4.f5046d
            int r3 = r5.f5046d
            if (r1 != r3) goto L29
            int r1 = r4.f5047e
            int r5 = r5.f5047e
            if (r1 != r5) goto L29
            return r0
        L29:
            return r2
    }

    public final int hashCode() {
            r3 = this;
            float r0 = r3.f5044b
            int r0 = java.lang.Float.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            float r2 = r3.f5045c
            int r0 = eh.a.d(r2, r0, r1)
            int r2 = r3.f5046d
            int r0 = eh.a.e(r2, r0, r1)
            int r2 = r3.f5047e
            int r0 = eh.a.e(r2, r0, r1)
            return r0
    }

    public final java.lang.String toString() {
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Stroke(width="
            r0.<init>(r1)
            float r1 = r6.f5044b
            r0.append(r1)
            java.lang.String r1 = ", miter="
            r0.append(r1)
            float r1 = r6.f5045c
            r0.append(r1)
            java.lang.String r1 = ", cap="
            r0.append(r1)
            java.lang.String r1 = "Unknown"
            r2 = 2
            java.lang.String r3 = "Round"
            r4 = 1
            int r5 = r6.f5046d
            if (r5 != 0) goto L28
            java.lang.String r5 = "Butt"
            goto L32
        L28:
            if (r5 != r4) goto L2c
            r5 = r3
            goto L32
        L2c:
            if (r5 != r2) goto L31
            java.lang.String r5 = "Square"
            goto L32
        L31:
            r5 = r1
        L32:
            r0.append(r5)
            java.lang.String r5 = ", join="
            r0.append(r5)
            int r5 = r6.f5047e
            if (r5 != 0) goto L41
            java.lang.String r1 = "Miter"
            goto L49
        L41:
            if (r5 != r4) goto L45
            r1 = r3
            goto L49
        L45:
            if (r5 != r2) goto L49
            java.lang.String r1 = "Bevel"
        L49:
            r0.append(r1)
            java.lang.String r1 = ", pathEffect=null)"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
