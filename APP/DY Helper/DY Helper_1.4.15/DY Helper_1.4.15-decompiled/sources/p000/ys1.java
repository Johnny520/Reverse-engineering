package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class ys1 {

    /* JADX INFO: renamed from: α */
    public final java.lang.String f12776;

    /* JADX INFO: renamed from: β */
    public final java.lang.String f12777;

    /* JADX INFO: renamed from: γ */
    public final java.lang.String f12778;

    /* JADX INFO: renamed from: δ */
    public final boolean f12779;

    public ys1(java.lang.String r1, java.lang.String r2, java.lang.String r3, boolean r4) {
            r0 = this;
            r0.<init>()
            r0.f12776 = r1
            r0.f12777 = r2
            r0.f12778 = r3
            r0.f12779 = r4
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L33
        L3:
            boolean r0 = r3 instanceof p000.ys1
            if (r0 != 0) goto L8
            goto L31
        L8:
            ys1 r3 = (p000.ys1) r3
            java.lang.String r0 = r2.f12776
            java.lang.String r1 = r3.f12776
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L15
            goto L31
        L15:
            java.lang.String r0 = r2.f12777
            java.lang.String r1 = r3.f12777
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L20
            goto L31
        L20:
            java.lang.String r0 = r2.f12778
            java.lang.String r1 = r3.f12778
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L2b
            goto L31
        L2b:
            boolean r2 = r2.f12779
            boolean r3 = r3.f12779
            if (r2 == r3) goto L33
        L31:
            r2 = 0
            return r2
        L33:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.f12776
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.f12777
            int r0 = p000.a12.m15(r0, r1, r2)
            java.lang.String r2 = r3.f12778
            int r0 = p000.a12.m15(r0, r1, r2)
            boolean r3 = r3.f12779
            int r3 = java.lang.Boolean.hashCode(r3)
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", title="
            java.lang.String r1 = ", desc="
            java.lang.String r2 = "SettingsBoolRow(key="
            java.lang.String r3 = r5.f12776
            java.lang.String r4 = r5.f12777
            java.lang.StringBuilder r0 = p000.lz1.m3695(r2, r3, r0, r4, r1)
            java.lang.String r1 = r5.f12778
            r0.append(r1)
            java.lang.String r1 = ", def="
            r0.append(r1)
            boolean r5 = r5.f12779
            r0.append(r5)
            java.lang.String r5 = ")"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            return r5
    }
}
