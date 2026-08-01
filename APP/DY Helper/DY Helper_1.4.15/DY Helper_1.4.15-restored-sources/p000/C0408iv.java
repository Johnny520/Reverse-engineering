package p000;

/* JADX INFO: renamed from: iv */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0408iv implements java.lang.Comparable {

    /* JADX INFO: renamed from: ε */
    public final float f5209;

    public /* synthetic */ C0408iv(float r1) {
            r0 = this;
            r0.<init>()
            r0.f5209 = r1
            return
    }

    /* JADX INFO: renamed from: α */
    public static int m2805(float r1, float r2) {
            boolean r0 = java.lang.Float.isNaN(r1)
            if (r0 != 0) goto L12
            boolean r0 = java.lang.Float.isNaN(r2)
            if (r0 == 0) goto Ld
            goto L12
        Ld:
            int r1 = java.lang.Float.compare(r1, r2)
            return r1
        L12:
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: β */
    public static final boolean m2806(float r0, float r1) {
            int r0 = java.lang.Float.compare(r0, r1)
            if (r0 != 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: γ */
    public static java.lang.String m2807(float r1) {
            boolean r0 = java.lang.Float.isNaN(r1)
            if (r0 == 0) goto L9
            java.lang.String r1 = "Dp.Unspecified"
            return r1
        L9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = ".dp"
            r0.append(r1)
            java.lang.String r1 = r0.toString()
            return r1
    }

    @Override // java.lang.Comparable
    public final int compareTo(java.lang.Object r1) {
            r0 = this;
            iv r1 = (p000.C0408iv) r1
            float r1 = r1.f5209
            float r0 = r0.f5209
            int r0 = m2805(r0, r1)
            return r0
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof p000.C0408iv
            if (r0 != 0) goto L5
            goto L11
        L5:
            iv r2 = (p000.C0408iv) r2
            float r2 = r2.f5209
            float r1 = r1.f5209
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
            float r0 = r0.f5209
            int r0 = java.lang.Float.hashCode(r0)
            return r0
    }

    public final java.lang.String toString() {
            r0 = this;
            float r0 = r0.f5209
            java.lang.String r0 = m2807(r0)
            return r0
    }
}
