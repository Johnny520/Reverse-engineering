package da;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.content.res.ColorStateList f2136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final android.content.res.ColorStateList f2137b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f2138c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final android.graphics.Shader f2139d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f2140e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public android.graphics.LinearGradient f2141f;

    public b(android.content.res.ColorStateList r1, android.content.res.ColorStateList r2, int r3, android.graphics.Shader r4, int r5) {
            r0 = this;
            r0.<init>()
            r0.f2136a = r1
            r0.f2137b = r2
            r0.f2138c = r3
            r0.f2139d = r4
            r0.f2140e = r5
            r1 = 0
            r0.f2141f = r1
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L45
        L3:
            boolean r0 = r3 instanceof da.b
            if (r0 != 0) goto L8
            goto L43
        L8:
            da.b r3 = (da.b) r3
            android.content.res.ColorStateList r0 = r2.f2136a
            android.content.res.ColorStateList r1 = r3.f2136a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L43
        L15:
            android.content.res.ColorStateList r0 = r2.f2137b
            android.content.res.ColorStateList r1 = r3.f2137b
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L20
            goto L43
        L20:
            int r0 = r2.f2138c
            int r1 = r3.f2138c
            if (r0 == r1) goto L27
            goto L43
        L27:
            android.graphics.Shader r0 = r2.f2139d
            android.graphics.Shader r1 = r3.f2139d
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L32
            goto L43
        L32:
            int r0 = r2.f2140e
            int r1 = r3.f2140e
            if (r0 == r1) goto L39
            goto L43
        L39:
            android.graphics.LinearGradient r0 = r2.f2141f
            android.graphics.LinearGradient r3 = r3.f2141f
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
            r4 = this;
            android.content.res.ColorStateList r0 = r4.f2136a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            android.content.res.ColorStateList r2 = r4.f2137b
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            int r0 = r4.f2138c
            int r0 = eh.a.e(r0, r2, r1)
            r2 = 0
            android.graphics.Shader r3 = r4.f2139d
            if (r3 != 0) goto L1e
            r3 = r2
            goto L22
        L1e:
            int r3 = r3.hashCode()
        L22:
            int r0 = r0 + r3
            int r0 = r0 * r1
            int r3 = r4.f2140e
            int r0 = eh.a.e(r3, r0, r1)
            android.graphics.LinearGradient r1 = r4.f2141f
            if (r1 != 0) goto L2f
            goto L33
        L2f:
            int r2 = r1.hashCode()
        L33:
            int r0 = r0 + r2
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            android.graphics.LinearGradient r0 = r3.f2141f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "AppliedTextState(originalTextColors="
            r1.<init>(r2)
            android.content.res.ColorStateList r2 = r3.f2136a
            r1.append(r2)
            java.lang.String r2 = ", originalLinkTextColors="
            r1.append(r2)
            android.content.res.ColorStateList r2 = r3.f2137b
            r1.append(r2)
            java.lang.String r2 = ", originalLinkColor="
            r1.append(r2)
            int r2 = r3.f2138c
            r1.append(r2)
            java.lang.String r2 = ", originalShader="
            r1.append(r2)
            android.graphics.Shader r2 = r3.f2139d
            r1.append(r2)
            java.lang.String r2 = ", appliedColor="
            r1.append(r2)
            int r2 = r3.f2140e
            r1.append(r2)
            java.lang.String r2 = ", appliedShader="
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = ")"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }
}
