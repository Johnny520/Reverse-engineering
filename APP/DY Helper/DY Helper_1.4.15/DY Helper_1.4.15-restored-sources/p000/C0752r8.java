package p000;

/* JADX INFO: renamed from: r8 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0752r8 {

    /* JADX INFO: renamed from: α */
    public final float f9286;

    public /* synthetic */ C0752r8(float r1) {
            r0 = this;
            r0.<init>()
            r0.f9286 = r1
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof p000.C0752r8
            if (r0 != 0) goto L5
            goto L11
        L5:
            r8 r2 = (p000.C0752r8) r2
            float r2 = r2.f9286
            float r1 = r1.f9286
            int r1 = java.lang.Float.compare(r1, r2)
            if (r1 == 0) goto L13
        L11:
            r1 = 0
            return r1
        L13:
            r1 = 1
            return r1
    }

    public final int hashCode() {
            r0 = this;
            float r0 = r0.f9286
            int r0 = java.lang.Float.hashCode(r0)
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "BaselineShift(multiplier="
            r0.<init>(r1)
            float r2 = r2.f9286
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
