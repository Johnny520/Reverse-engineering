package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class zd0 {

    /* JADX INFO: renamed from: α */
    public final java.lang.String f13043;

    /* JADX INFO: renamed from: β */
    public final boolean f13044;

    /* JADX INFO: renamed from: γ */
    public final java.util.List f13045;

    /* JADX INFO: renamed from: δ */
    public final p000.C0574n5 f13046;

    public zd0(java.lang.String r1, boolean r2, java.util.List r3, p000.C0574n5 r4) {
            r0 = this;
            r0.<init>()
            r0.f13043 = r1
            r0.f13044 = r2
            r0.f13045 = r3
            r0.f13046 = r4
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L33
        L3:
            boolean r0 = r3 instanceof p000.zd0
            if (r0 != 0) goto L8
            goto L31
        L8:
            zd0 r3 = (p000.zd0) r3
            java.lang.String r0 = r2.f13043
            java.lang.String r1 = r3.f13043
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L31
        L15:
            boolean r0 = r2.f13044
            boolean r1 = r3.f13044
            if (r0 == r1) goto L1c
            goto L31
        L1c:
            java.util.List r0 = r2.f13045
            java.util.List r1 = r3.f13045
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L27
            goto L31
        L27:
            n5 r2 = r2.f13046
            n5 r3 = r3.f13046
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
            java.lang.String r0 = r3.f13043
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            boolean r2 = r3.f13044
            int r0 = p000.lz1.m3678(r0, r1, r2)
            java.util.List r2 = r3.f13045
            int r0 = p000.a12.m16(r2, r0, r1)
            n5 r3 = r3.f13046
            int r3 = r3.hashCode()
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Snapshot(accountUid="
            r0.<init>(r1)
            java.lang.String r1 = r2.f13043
            r0.append(r1)
            java.lang.String r1 = ", enabled="
            r0.append(r1)
            boolean r1 = r2.f13044
            r0.append(r1)
            java.lang.String r1 = ", records="
            r0.append(r1)
            java.util.List r1 = r2.f13045
            r0.append(r1)
            java.lang.String r1 = ", index="
            r0.append(r1)
            n5 r2 = r2.f13046
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
