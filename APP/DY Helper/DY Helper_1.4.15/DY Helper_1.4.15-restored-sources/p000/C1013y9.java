package p000;

/* JADX INFO: renamed from: y9 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C1013y9 {

    /* JADX INFO: renamed from: α */
    public final float f12499;

    public C1013y9(float r1) {
            r0 = this;
            r0.<init>()
            r0.f12499 = r1
            return
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof p000.C1013y9
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            y9 r4 = (p000.C1013y9) r4
            float r3 = r3.f12499
            float r4 = r4.f12499
            int r3 = java.lang.Float.compare(r3, r4)
            if (r3 == 0) goto L17
            return r2
        L17:
            return r0
    }

    public final int hashCode() {
            r0 = this;
            float r0 = r0.f12499
            int r0 = java.lang.Float.hashCode(r0)
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Horizontal(bias="
            r0.<init>(r1)
            float r2 = r2.f12499
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
