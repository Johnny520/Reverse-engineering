package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class y02 extends p000.kn0 {

    /* JADX INFO: renamed from: π */
    public final float f12420;

    public y02(float r1) {
            r0 = this;
            r0.<init>()
            r0.f12420 = r1
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            r0 = 1
            if (r2 != r3) goto L4
            return r0
        L4:
            boolean r1 = r3 instanceof p000.y02
            if (r1 != 0) goto L9
            goto L14
        L9:
            y02 r3 = (p000.y02) r3
            float r3 = r3.f12420
            float r2 = r2.f12420
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 != 0) goto L14
            return r0
        L14:
            r2 = 0
            return r2
    }

    public final int hashCode() {
            r2 = this;
            float r2 = r2.f12420
            int r2 = java.lang.Float.hashCode(r2)
            r0 = 31
            int r2 = r2 * r0
            r1 = 1082130432(0x40800000, float:4.0)
            int r2 = p000.lz1.m3676(r1, r2, r0)
            r1 = 0
            int r2 = p000.a12.m14(r1, r2, r0)
            int r2 = p000.a12.m14(r1, r2, r0)
            return r2
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Stroke(width="
            r0.<init>(r1)
            float r2 = r2.f12420
            r0.append(r2)
            java.lang.String r2 = ", miter=4.0, cap="
            r0.append(r2)
            java.lang.String r2 = "Butt"
            r0.append(r2)
            java.lang.String r2 = ", join="
            r0.append(r2)
            java.lang.String r2 = "Miter"
            r0.append(r2)
            java.lang.String r2 = ", pathEffect=null)"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
