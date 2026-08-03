package z6;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements f1.r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f22579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z6.c f22580b;

    public d(float r1) {
            r0 = this;
            r0.<init>()
            r0.f22579a = r1
            z6.c r1 = z6.c.f22577h
            r0.f22580b = r1
            return
    }

    @Override // f1.r0
    public final f1.c0 a(long r3, u2.m r5, u2.c r6) {
            r2 = this;
            r5.getClass()
            r6.getClass()
            float r5 = r2.f22579a
            float r5 = r6.x0(r5)
            float r6 = e1.e.b(r3)
            r0 = 1056964608(0x3f000000, float:0.5)
            float r6 = r6 * r0
            r0 = 0
            int r1 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r1 >= 0) goto L19
            r5 = r0
        L19:
            int r0 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r0 <= 0) goto L1e
            goto L1f
        L1e:
            r6 = r5
        L1f:
            z6.c r5 = r2.f22580b
            f1.c0 r3 = ac.p.K(r3, r6, r5)
            return r3
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L1d
        L3:
            boolean r0 = r3 instanceof z6.d
            if (r0 != 0) goto L8
            goto L1b
        L8:
            z6.d r3 = (z6.d) r3
            float r0 = r3.f22579a
            float r1 = r2.f22579a
            boolean r0 = u2.f.b(r1, r0)
            if (r0 != 0) goto L15
            goto L1b
        L15:
            z6.c r0 = r2.f22580b
            z6.c r3 = r3.f22580b
            if (r0 == r3) goto L1d
        L1b:
            r3 = 0
            return r3
        L1d:
            r3 = 1
            return r3
    }

    public final int hashCode() {
            r2 = this;
            float r0 = r2.f22579a
            int r0 = java.lang.Float.hashCode(r0)
            int r0 = r0 * 31
            z6.c r1 = r2.f22580b
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r3 = this;
            float r0 = r3.f22579a
            java.lang.String r0 = u2.f.c(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "RoundedRectangle(cornerRadius="
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = ", style="
            r1.append(r0)
            z6.c r0 = r3.f22580b
            r1.append(r0)
            java.lang.String r0 = ")"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }
}
