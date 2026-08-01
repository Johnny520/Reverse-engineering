package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class t72 {

    /* JADX INFO: renamed from: α */
    public final int f10235;

    /* JADX INFO: renamed from: β */
    public final java.lang.String f10236;

    /* JADX INFO: renamed from: γ */
    public final java.lang.String f10237;

    /* JADX INFO: renamed from: δ */
    public final java.lang.String f10238;

    public t72(int r1, java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            r0 = this;
            r2.getClass()
            r3.getClass()
            r4.getClass()
            r0.<init>()
            r0.f10235 = r1
            r0.f10236 = r2
            r0.f10237 = r3
            r0.f10238 = r4
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p000.t72
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            t72 r5 = (p000.t72) r5
            int r1 = r4.f10235
            int r3 = r5.f10235
            if (r1 == r3) goto L13
            return r2
        L13:
            java.lang.String r1 = r4.f10236
            java.lang.String r3 = r5.f10236
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L1e
            return r2
        L1e:
            java.lang.String r1 = r4.f10237
            java.lang.String r3 = r5.f10237
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L29
            return r2
        L29:
            java.lang.String r4 = r4.f10238
            java.lang.String r5 = r5.f10238
            boolean r4 = p000.ln0.m3626(r4, r5)
            if (r4 != 0) goto L34
            return r2
        L34:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            int r0 = r3.f10235
            int r0 = java.lang.Integer.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.f10236
            int r0 = p000.a12.m15(r0, r1, r2)
            java.lang.String r2 = r3.f10237
            int r0 = p000.a12.m15(r0, r1, r2)
            java.lang.String r3 = r3.f10238
            int r3 = r3.hashCode()
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", versionName="
            java.lang.String r1 = ", downloadUrl="
            int r2 = r5.f10235
            java.lang.String r3 = "UpdateInfo(versionCode="
            java.lang.String r4 = r5.f10236
            java.lang.StringBuilder r0 = p000.a12.m20(r2, r3, r0, r4, r1)
            java.lang.String r1 = r5.f10237
            r0.append(r1)
            java.lang.String r1 = ", message="
            r0.append(r1)
            java.lang.String r5 = r5.f10238
            r0.append(r5)
            java.lang.String r5 = ")"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            return r5
    }
}
