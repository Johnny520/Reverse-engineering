package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class y90 {

    /* JADX INFO: renamed from: α */
    public final java.lang.String f12500;

    /* JADX INFO: renamed from: β */
    public final float f12501;

    /* JADX INFO: renamed from: γ */
    public final int f12502;

    /* JADX INFO: renamed from: δ */
    public final android.graphics.Typeface f12503;

    public y90(java.lang.String r1, float r2, int r3, android.graphics.Typeface r4) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.f12500 = r1
            r0.f12501 = r2
            r0.f12502 = r3
            r0.f12503 = r4
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L33
        L3:
            boolean r0 = r3 instanceof p000.y90
            if (r0 != 0) goto L8
            goto L31
        L8:
            y90 r3 = (p000.y90) r3
            java.lang.String r0 = r2.f12500
            java.lang.String r1 = r3.f12500
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L15
            goto L31
        L15:
            float r0 = r2.f12501
            float r1 = r3.f12501
            int r0 = java.lang.Float.compare(r0, r1)
            if (r0 == 0) goto L20
            goto L31
        L20:
            int r0 = r2.f12502
            int r1 = r3.f12502
            if (r0 == r1) goto L27
            goto L31
        L27:
            android.graphics.Typeface r2 = r2.f12503
            android.graphics.Typeface r3 = r3.f12503
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L33
        L31:
            r2 = 0
            return r2
        L33:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.f12500
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            float r2 = r3.f12501
            int r0 = p000.lz1.m3676(r2, r0, r1)
            int r2 = r3.f12502
            int r0 = p000.a12.m14(r2, r0, r1)
            android.graphics.Typeface r3 = r3.f12503
            int r3 = r3.hashCode()
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "TextLine(text="
            r0.<init>(r1)
            java.lang.String r1 = r2.f12500
            r0.append(r1)
            java.lang.String r1 = ", size="
            r0.append(r1)
            float r1 = r2.f12501
            r0.append(r1)
            java.lang.String r1 = ", color="
            r0.append(r1)
            int r1 = r2.f12502
            r0.append(r1)
            java.lang.String r1 = ", typeface="
            r0.append(r1)
            android.graphics.Typeface r2 = r2.f12503
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
