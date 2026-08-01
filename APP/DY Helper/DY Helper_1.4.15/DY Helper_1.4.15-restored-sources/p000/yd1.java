package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class yd1 {

    /* JADX INFO: renamed from: α */
    public final java.util.ArrayList f12588;

    /* JADX INFO: renamed from: β */
    public final p000.jb1 f12589;

    public yd1(java.util.ArrayList r1, p000.jb1 r2) {
            r0 = this;
            r2.getClass()
            r0.<init>()
            r0.f12588 = r1
            r0.f12589 = r2
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L21
        L3:
            boolean r0 = r3 instanceof p000.yd1
            if (r0 != 0) goto L8
            goto L1f
        L8:
            yd1 r3 = (p000.yd1) r3
            java.util.ArrayList r0 = r2.f12588
            java.util.ArrayList r1 = r3.f12588
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L1f
        L15:
            jb1 r2 = r2.f12589
            jb1 r3 = r3.f12589
            boolean r2 = p000.ln0.m3626(r2, r3)
            if (r2 != 0) goto L21
        L1f:
            r2 = 0
            return r2
        L21:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r1 = this;
            java.util.ArrayList r0 = r1.f12588
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            jb1 r1 = r1.f12589
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "PetElfCampSevenDayStatistics(days="
            r0.<init>(r1)
            java.util.ArrayList r1 = r2.f12588
            r0.append(r1)
            java.lang.String r1 = ", today="
            r0.append(r1)
            jb1 r2 = r2.f12589
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
