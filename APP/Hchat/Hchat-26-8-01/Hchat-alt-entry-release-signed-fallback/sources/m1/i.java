package m1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends m1.b0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f8608c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f8609d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f8610e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f8611f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f8612g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f8613h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f8614i;

    public i(float r2, float r3, float r4, boolean r5, boolean r6, float r7, float r8) {
            r1 = this;
            r0 = 3
            r1.<init>(r0)
            r1.f8608c = r2
            r1.f8609d = r3
            r1.f8610e = r4
            r1.f8611f = r5
            r1.f8612g = r6
            r1.f8613h = r7
            r1.f8614i = r8
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof m1.i
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            m1.i r5 = (m1.i) r5
            float r1 = r4.f8608c
            float r3 = r5.f8608c
            int r1 = java.lang.Float.compare(r1, r3)
            if (r1 == 0) goto L17
            return r2
        L17:
            float r1 = r4.f8609d
            float r3 = r5.f8609d
            int r1 = java.lang.Float.compare(r1, r3)
            if (r1 == 0) goto L22
            return r2
        L22:
            float r1 = r4.f8610e
            float r3 = r5.f8610e
            int r1 = java.lang.Float.compare(r1, r3)
            if (r1 == 0) goto L2d
            return r2
        L2d:
            boolean r1 = r4.f8611f
            boolean r3 = r5.f8611f
            if (r1 == r3) goto L34
            return r2
        L34:
            boolean r1 = r4.f8612g
            boolean r3 = r5.f8612g
            if (r1 == r3) goto L3b
            return r2
        L3b:
            float r1 = r4.f8613h
            float r3 = r5.f8613h
            int r1 = java.lang.Float.compare(r1, r3)
            if (r1 == 0) goto L46
            return r2
        L46:
            float r1 = r4.f8614i
            float r5 = r5.f8614i
            int r5 = java.lang.Float.compare(r1, r5)
            if (r5 == 0) goto L51
            return r2
        L51:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            float r0 = r3.f8608c
            int r0 = java.lang.Float.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            float r2 = r3.f8609d
            int r0 = eh.a.d(r2, r0, r1)
            float r2 = r3.f8610e
            int r0 = eh.a.d(r2, r0, r1)
            boolean r2 = r3.f8611f
            int r0 = eh.a.h(r0, r1, r2)
            boolean r2 = r3.f8612g
            int r0 = eh.a.h(r0, r1, r2)
            float r2 = r3.f8613h
            int r0 = eh.a.d(r2, r0, r1)
            float r1 = r3.f8614i
            int r1 = java.lang.Float.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ArcTo(horizontalEllipseRadius="
            r0.<init>(r1)
            float r1 = r3.f8608c
            r0.append(r1)
            java.lang.String r1 = ", verticalEllipseRadius="
            r0.append(r1)
            float r1 = r3.f8609d
            r0.append(r1)
            java.lang.String r1 = ", theta="
            r0.append(r1)
            float r1 = r3.f8610e
            r0.append(r1)
            java.lang.String r1 = ", isMoreThanHalf="
            r0.append(r1)
            boolean r1 = r3.f8611f
            r0.append(r1)
            java.lang.String r1 = ", isPositiveArc="
            r0.append(r1)
            boolean r1 = r3.f8612g
            r0.append(r1)
            java.lang.String r1 = ", arcStartX="
            r0.append(r1)
            float r1 = r3.f8613h
            r0.append(r1)
            java.lang.String r1 = ", arcStartY="
            r0.append(r1)
            float r1 = r3.f8614i
            r2 = 41
            java.lang.String r0 = eh.a.o(r0, r1, r2)
            return r0
    }
}
