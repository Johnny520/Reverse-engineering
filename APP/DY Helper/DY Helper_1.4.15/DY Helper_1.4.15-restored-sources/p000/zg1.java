package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class zg1 {

    /* JADX INFO: renamed from: α */
    public final java.lang.String f13091;

    /* JADX INFO: renamed from: β */
    public final java.lang.String f13092;

    /* JADX INFO: renamed from: γ */
    public final int f13093;

    /* JADX INFO: renamed from: δ */
    public final java.lang.String f13094;

    public zg1(int r1, java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            r0 = this;
            r0.<init>()
            r0.f13091 = r2
            r0.f13092 = r3
            r0.f13093 = r1
            r0.f13094 = r4
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L33
        L3:
            boolean r0 = r3 instanceof p000.zg1
            if (r0 != 0) goto L8
            goto L31
        L8:
            zg1 r3 = (p000.zg1) r3
            java.lang.String r0 = r2.f13091
            java.lang.String r1 = r3.f13091
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L31
        L15:
            java.lang.String r0 = r2.f13092
            java.lang.String r1 = r3.f13092
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L20
            goto L31
        L20:
            int r0 = r2.f13093
            int r1 = r3.f13093
            if (r0 == r1) goto L27
            goto L31
        L27:
            java.lang.String r2 = r2.f13094
            java.lang.String r3 = r3.f13094
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
            java.lang.String r0 = r3.f13091
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.f13092
            int r0 = p000.a12.m15(r0, r1, r2)
            int r2 = r3.f13093
            int r0 = p000.a12.m14(r2, r0, r1)
            java.lang.String r3 = r3.f13094
            int r3 = r3.hashCode()
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", title="
            java.lang.String r1 = ", count="
            java.lang.String r2 = "MutualMessageRequirement(taskId="
            java.lang.String r3 = r5.f13091
            java.lang.String r4 = r5.f13092
            java.lang.StringBuilder r0 = p000.lz1.m3695(r2, r3, r0, r4, r1)
            int r1 = r5.f13093
            r0.append(r1)
            java.lang.String r1 = ", source="
            r0.append(r1)
            java.lang.String r5 = r5.f13094
            r0.append(r5)
            java.lang.String r5 = ")"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            return r5
    }
}
