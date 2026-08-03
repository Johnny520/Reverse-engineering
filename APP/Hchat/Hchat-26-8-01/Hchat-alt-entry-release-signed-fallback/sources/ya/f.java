package ya;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f22381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f22382b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f22383c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f22384d;

    public f(float r1, float r2, float r3, float r4) {
            r0 = this;
            r0.<init>()
            r0.f22381a = r1
            r0.f22382b = r2
            r0.f22383c = r3
            r0.f22384d = r4
            return
    }

    public final boolean a(float r2, float r3) {
            r1 = this;
            float r0 = r1.f22381a
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 < 0) goto L1a
            float r0 = r1.f22383c
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 > 0) goto L1a
            float r2 = r1.f22382b
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 < 0) goto L1a
            float r2 = r1.f22384d
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 > 0) goto L1a
            r2 = 1
            return r2
        L1a:
            r2 = 0
            return r2
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof ya.f
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            ya.f r5 = (ya.f) r5
            float r1 = r4.f22381a
            float r3 = r5.f22381a
            int r1 = java.lang.Float.compare(r1, r3)
            if (r1 == 0) goto L17
            return r2
        L17:
            float r1 = r4.f22382b
            float r3 = r5.f22382b
            int r1 = java.lang.Float.compare(r1, r3)
            if (r1 == 0) goto L22
            return r2
        L22:
            float r1 = r4.f22383c
            float r3 = r5.f22383c
            int r1 = java.lang.Float.compare(r1, r3)
            if (r1 == 0) goto L2d
            return r2
        L2d:
            float r1 = r4.f22384d
            float r5 = r5.f22384d
            int r5 = java.lang.Float.compare(r1, r5)
            if (r5 == 0) goto L38
            return r2
        L38:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            float r0 = r3.f22381a
            int r0 = java.lang.Float.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            float r2 = r3.f22382b
            int r0 = eh.a.d(r2, r0, r1)
            float r2 = r3.f22383c
            int r0 = eh.a.d(r2, r0, r1)
            float r1 = r3.f22384d
            int r1 = java.lang.Float.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ScreenRect(left="
            r0.<init>(r1)
            float r1 = r2.f22381a
            r0.append(r1)
            java.lang.String r1 = ", top="
            r0.append(r1)
            float r1 = r2.f22382b
            r0.append(r1)
            java.lang.String r1 = ", right="
            r0.append(r1)
            float r1 = r2.f22383c
            r0.append(r1)
            java.lang.String r1 = ", bottom="
            r0.append(r1)
            float r1 = r2.f22384d
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
