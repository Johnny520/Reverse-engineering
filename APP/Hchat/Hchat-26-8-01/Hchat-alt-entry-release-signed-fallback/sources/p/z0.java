package p;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class z0 implements p.x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f10043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f10044b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f10045c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f10046d;

    public z0(float r4, float r5, float r6, float r7) {
            r3 = this;
            r3.<init>()
            r3.f10043a = r4
            r3.f10044b = r5
            r3.f10045c = r6
            r3.f10046d = r7
            r0 = 0
            int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            r1 = 0
            r2 = 1
            if (r4 < 0) goto L14
            r4 = r2
            goto L15
        L14:
            r4 = r1
        L15:
            int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r5 < 0) goto L1b
            r5 = r2
            goto L1c
        L1b:
            r5 = r1
        L1c:
            r4 = r4 & r5
            int r5 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r5 < 0) goto L23
            r5 = r2
            goto L24
        L23:
            r5 = r1
        L24:
            r4 = r4 & r5
            int r5 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r5 < 0) goto L2a
            r1 = r2
        L2a:
            r4 = r4 & r1
            if (r4 != 0) goto L32
            java.lang.String r4 = "Padding must be non-negative"
            q.a.a(r4)
        L32:
            return
    }

    @Override // p.x0
    public final float a() {
            r1 = this;
            float r0 = r1.f10046d
            return r0
    }

    @Override // p.x0
    public final float b(u2.m r2) {
            r1 = this;
            u2.m r0 = u2.m.f13354g
            if (r2 != r0) goto L7
            float r2 = r1.f10045c
            return r2
        L7:
            float r2 = r1.f10043a
            return r2
    }

    @Override // p.x0
    public final float c() {
            r1 = this;
            float r0 = r1.f10044b
            return r0
    }

    @Override // p.x0
    public final float d(u2.m r2) {
            r1 = this;
            u2.m r0 = u2.m.f13354g
            if (r2 != r0) goto L7
            float r2 = r1.f10043a
            return r2
        L7:
            float r2 = r1.f10045c
            return r2
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof p.z0
            if (r0 != 0) goto L5
            goto L31
        L5:
            p.z0 r3 = (p.z0) r3
            float r0 = r3.f10043a
            float r1 = r2.f10043a
            boolean r0 = u2.f.b(r1, r0)
            if (r0 == 0) goto L31
            float r0 = r2.f10044b
            float r1 = r3.f10044b
            boolean r0 = u2.f.b(r0, r1)
            if (r0 == 0) goto L31
            float r0 = r2.f10045c
            float r1 = r3.f10045c
            boolean r0 = u2.f.b(r0, r1)
            if (r0 == 0) goto L31
            float r0 = r2.f10046d
            float r3 = r3.f10046d
            boolean r3 = u2.f.b(r0, r3)
            if (r3 == 0) goto L31
            r3 = 1
            return r3
        L31:
            r3 = 0
            return r3
    }

    public final int hashCode() {
            r3 = this;
            float r0 = r3.f10043a
            int r0 = java.lang.Float.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            float r2 = r3.f10044b
            int r0 = eh.a.d(r2, r0, r1)
            float r2 = r3.f10045c
            int r0 = eh.a.d(r2, r0, r1)
            float r1 = r3.f10046d
            int r1 = java.lang.Float.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "PaddingValues(start="
            r0.<init>(r1)
            float r1 = r2.f10043a
            java.lang.String r1 = u2.f.c(r1)
            r0.append(r1)
            java.lang.String r1 = ", top="
            r0.append(r1)
            float r1 = r2.f10044b
            java.lang.String r1 = u2.f.c(r1)
            r0.append(r1)
            java.lang.String r1 = ", end="
            r0.append(r1)
            float r1 = r2.f10045c
            java.lang.String r1 = u2.f.c(r1)
            r0.append(r1)
            java.lang.String r1 = ", bottom="
            r0.append(r1)
            float r1 = r2.f10046d
            java.lang.String r1 = u2.f.c(r1)
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
