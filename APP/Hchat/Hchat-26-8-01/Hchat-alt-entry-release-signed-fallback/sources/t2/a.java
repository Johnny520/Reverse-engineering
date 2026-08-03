package t2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f12994a;

    public /* synthetic */ a(float r1) {
            r0 = this;
            r0.<init>()
            r0.f12994a = r1
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof t2.a
            if (r0 != 0) goto L5
            goto L11
        L5:
            t2.a r2 = (t2.a) r2
            float r2 = r2.f12994a
            float r0 = r1.f12994a
            int r2 = java.lang.Float.compare(r0, r2)
            if (r2 == 0) goto L13
        L11:
            r2 = 0
            return r2
        L13:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r1 = this;
            float r0 = r1.f12994a
            int r0 = java.lang.Float.hashCode(r0)
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "BaselineShift(multiplier="
            r0.<init>(r1)
            float r1 = r2.f12994a
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
