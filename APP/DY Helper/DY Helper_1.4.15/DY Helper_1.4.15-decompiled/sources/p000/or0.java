package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class or0 {

    /* JADX INFO: renamed from: α */
    public final float f8178;

    /* JADX INFO: renamed from: β */
    public final float f8179;

    public or0(float r1, float r2) {
            r0 = this;
            r0.<init>()
            r0.f8178 = r1
            r0.f8179 = r2
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L2a
        L3:
            boolean r0 = r3 instanceof p000.or0
            if (r0 != 0) goto L8
            goto L28
        L8:
            or0 r3 = (p000.or0) r3
            r0 = 1056964608(0x3f000000, float:0.5)
            int r0 = java.lang.Float.compare(r0, r0)
            if (r0 == 0) goto L13
            goto L28
        L13:
            float r0 = r2.f8178
            float r1 = r3.f8178
            int r0 = java.lang.Float.compare(r0, r1)
            if (r0 == 0) goto L1e
            goto L28
        L1e:
            float r2 = r2.f8179
            float r3 = r3.f8179
            int r2 = java.lang.Float.compare(r2, r3)
            if (r2 == 0) goto L2a
        L28:
            r2 = 0
            return r2
        L2a:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r3 = this;
            r0 = 1056964608(0x3f000000, float:0.5)
            int r0 = java.lang.Float.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            float r2 = r3.f8178
            int r0 = p000.lz1.m3676(r2, r0, r1)
            float r3 = r3.f8179
            int r3 = java.lang.Float.hashCode(r3)
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "LightPosition(x=0.5, y="
            r0.<init>(r1)
            float r1 = r2.f8178
            r0.append(r1)
            java.lang.String r1 = ", z="
            r0.append(r1)
            float r2 = r2.f8179
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
