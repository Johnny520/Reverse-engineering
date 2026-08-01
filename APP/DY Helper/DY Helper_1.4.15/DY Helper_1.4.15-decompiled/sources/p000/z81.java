package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class z81 {

    /* JADX INFO: renamed from: α */
    public final java.lang.String f13009;

    /* JADX INFO: renamed from: β */
    public final java.lang.String f13010;

    /* JADX INFO: renamed from: γ */
    public java.lang.ClassLoader f13011;

    /* JADX INFO: renamed from: δ */
    public final android.content.pm.ApplicationInfo f13012;

    public z81(java.lang.String r1, java.lang.String r2, java.lang.ClassLoader r3, android.content.pm.ApplicationInfo r4) {
            r0 = this;
            r0.<init>()
            r0.f13009 = r1
            r0.f13010 = r2
            r0.f13011 = r3
            r0.f13012 = r4
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L37
        L3:
            boolean r0 = r3 instanceof p000.z81
            if (r0 != 0) goto L8
            goto L35
        L8:
            z81 r3 = (p000.z81) r3
            java.lang.String r0 = r2.f13009
            java.lang.String r1 = r3.f13009
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L35
        L15:
            java.lang.String r0 = r2.f13010
            java.lang.String r1 = r3.f13010
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L20
            goto L35
        L20:
            java.lang.ClassLoader r0 = r2.f13011
            java.lang.ClassLoader r1 = r3.f13011
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L2b
            goto L35
        L2b:
            android.content.pm.ApplicationInfo r2 = r2.f13012
            android.content.pm.ApplicationInfo r3 = r3.f13012
            boolean r2 = p000.ln0.m3626(r2, r3)
            if (r2 != 0) goto L37
        L35:
            r2 = 0
            return r2
        L37:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.f13009
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.f13010
            int r0 = p000.a12.m15(r0, r1, r2)
            java.lang.ClassLoader r2 = r3.f13011
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            android.content.pm.ApplicationInfo r3 = r3.f13012
            if (r3 != 0) goto L1d
            r3 = 0
            goto L21
        L1d:
            int r3 = r3.hashCode()
        L21:
            int r2 = r2 + r3
            return r2
    }

    public final java.lang.String toString() {
            r6 = this;
            java.lang.ClassLoader r0 = r6.f13011
            java.lang.String r1 = ", processName="
            java.lang.String r2 = ", classLoader="
            java.lang.String r3 = "LoadPackageParam(packageName="
            java.lang.String r4 = r6.f13009
            java.lang.String r5 = r6.f13010
            java.lang.StringBuilder r1 = p000.lz1.m3695(r3, r4, r1, r5, r2)
            r1.append(r0)
            java.lang.String r0 = ", appInfo="
            r1.append(r0)
            android.content.pm.ApplicationInfo r6 = r6.f13012
            r1.append(r6)
            java.lang.String r6 = ")"
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            return r6
    }
}
