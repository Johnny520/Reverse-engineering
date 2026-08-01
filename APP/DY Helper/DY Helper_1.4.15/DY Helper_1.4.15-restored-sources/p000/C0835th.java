package p000;

/* JADX INFO: renamed from: th */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0835th {
    /* JADX INFO: renamed from: α */
    public static boolean m5711(java.lang.Comparable r0, java.lang.Comparable r1) {
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L12
            r0 = 1
            return r0
        L12:
            r0 = 0
            return r0
    }

    public final boolean equals(java.lang.Object r1) {
            r0 = this;
            boolean r0 = r1 instanceof p000.C0835th
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public final int hashCode() {
            r1 = this;
            r1 = 0
            int r0 = java.lang.Float.hashCode(r1)
            int r0 = r0 * 31
            int r1 = java.lang.Float.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r0 = this;
            java.lang.String r0 = "0.0..0.0"
            return r0
    }
}
