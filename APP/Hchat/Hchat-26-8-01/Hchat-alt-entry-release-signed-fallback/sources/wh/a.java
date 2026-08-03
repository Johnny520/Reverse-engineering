package wh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final wh.a f20789e = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f20790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f20791b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f20792c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f20793d;

    static {
            wh.a r0 = new wh.a
            r1 = 0
            r0.<init>(r1, r1, r1, r1)
            wh.a.f20789e = r0
            return
    }

    public a(float r1, float r2, float r3, float r4) {
            r0 = this;
            r0.<init>()
            r0.f20790a = r1
            r0.f20791b = r2
            r0.f20792c = r3
            r0.f20793d = r4
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof wh.a
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            wh.a r5 = (wh.a) r5
            float r1 = r4.f20790a
            float r3 = r5.f20790a
            int r1 = java.lang.Float.compare(r1, r3)
            if (r1 == 0) goto L17
            return r2
        L17:
            float r1 = r4.f20791b
            float r3 = r5.f20791b
            int r1 = java.lang.Float.compare(r1, r3)
            if (r1 == 0) goto L22
            return r2
        L22:
            float r1 = r4.f20792c
            float r3 = r5.f20792c
            int r1 = java.lang.Float.compare(r1, r3)
            if (r1 == 0) goto L2d
            return r2
        L2d:
            float r1 = r4.f20793d
            float r5 = r5.f20793d
            int r5 = java.lang.Float.compare(r1, r5)
            if (r5 == 0) goto L38
            return r2
        L38:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            float r0 = r3.f20790a
            int r0 = java.lang.Float.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            float r2 = r3.f20791b
            int r0 = eh.a.d(r2, r0, r1)
            float r2 = r3.f20792c
            int r0 = eh.a.d(r2, r0, r1)
            float r1 = r3.f20793d
            int r1 = java.lang.Float.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "DeviceTilt(pitch="
            r0.<init>(r1)
            float r1 = r2.f20790a
            r0.append(r1)
            java.lang.String r1 = ", roll="
            r0.append(r1)
            float r1 = r2.f20791b
            r0.append(r1)
            java.lang.String r1 = ", gravityX="
            r0.append(r1)
            float r1 = r2.f20792c
            r0.append(r1)
            java.lang.String r1 = ", gravityY="
            r0.append(r1)
            float r1 = r2.f20793d
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
