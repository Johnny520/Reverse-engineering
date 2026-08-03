package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class e5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f15831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f15832b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f15833c;

    public e5(float r1, float r2, float r3) {
            r0 = this;
            r0.<init>()
            r0.f15831a = r1
            r0.f15832b = r2
            r0.f15833c = r3
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof wb.e5
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            wb.e5 r5 = (wb.e5) r5
            float r1 = r4.f15831a
            float r3 = r5.f15831a
            int r1 = java.lang.Float.compare(r1, r3)
            if (r1 == 0) goto L17
            return r2
        L17:
            float r1 = r4.f15832b
            float r3 = r5.f15832b
            int r1 = java.lang.Float.compare(r1, r3)
            if (r1 == 0) goto L22
            return r2
        L22:
            float r1 = r4.f15833c
            float r5 = r5.f15833c
            int r5 = java.lang.Float.compare(r1, r5)
            if (r5 == 0) goto L2d
            return r2
        L2d:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            float r0 = r3.f15831a
            int r0 = java.lang.Float.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            float r2 = r3.f15832b
            int r0 = eh.a.d(r2, r0, r1)
            float r1 = r3.f15833c
            int r1 = java.lang.Float.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ColorPickerSelection(hue="
            r0.<init>(r1)
            float r1 = r2.f15831a
            r0.append(r1)
            java.lang.String r1 = ", saturation="
            r0.append(r1)
            float r1 = r2.f15832b
            r0.append(r1)
            java.lang.String r1 = ", value="
            r0.append(r1)
            float r1 = r2.f15833c
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
