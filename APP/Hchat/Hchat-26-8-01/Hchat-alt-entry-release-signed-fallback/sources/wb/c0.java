package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f15328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f15329b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f15330c;

    public c0(float r1, float r2, float r3) {
            r0 = this;
            r0.<init>()
            r0.f15328a = r1
            r0.f15329b = r2
            r0.f15330c = r3
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof wb.c0
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            wb.c0 r5 = (wb.c0) r5
            float r1 = r4.f15328a
            float r3 = r5.f15328a
            int r1 = java.lang.Float.compare(r1, r3)
            if (r1 == 0) goto L17
            return r2
        L17:
            float r1 = r4.f15329b
            float r3 = r5.f15329b
            int r1 = java.lang.Float.compare(r1, r3)
            if (r1 == 0) goto L22
            return r2
        L22:
            float r1 = r4.f15330c
            float r5 = r5.f15330c
            int r5 = java.lang.Float.compare(r1, r5)
            if (r5 == 0) goto L2d
            return r2
        L2d:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            float r0 = r3.f15328a
            int r0 = java.lang.Float.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            float r2 = r3.f15329b
            int r0 = eh.a.d(r2, r0, r1)
            float r1 = r3.f15330c
            int r1 = java.lang.Float.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ColorPickerSelection(hue="
            r0.<init>(r1)
            float r1 = r2.f15328a
            r0.append(r1)
            java.lang.String r1 = ", saturation="
            r0.append(r1)
            float r1 = r2.f15329b
            r0.append(r1)
            java.lang.String r1 = ", value="
            r0.append(r1)
            float r1 = r2.f15330c
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
