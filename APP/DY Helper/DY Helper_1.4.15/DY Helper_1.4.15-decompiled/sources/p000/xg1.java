package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class xg1 {

    /* JADX INFO: renamed from: α */
    public final p000.ky1 f12169;

    /* JADX INFO: renamed from: β */
    public final java.lang.String f12170;

    /* JADX INFO: renamed from: γ */
    public final java.util.ArrayList f12171;

    /* JADX INFO: renamed from: δ */
    public final java.util.ArrayList f12172;

    public xg1(p000.ky1 r1, java.lang.String r2, java.util.ArrayList r3, java.util.ArrayList r4) {
            r0 = this;
            r2.getClass()
            r0.<init>()
            r0.f12169 = r1
            r0.f12170 = r2
            r0.f12171 = r3
            r0.f12172 = r4
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L37
        L3:
            boolean r0 = r3 instanceof p000.xg1
            if (r0 != 0) goto L8
            goto L35
        L8:
            xg1 r3 = (p000.xg1) r3
            ky1 r0 = r2.f12169
            ky1 r1 = r3.f12169
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L35
        L15:
            java.lang.String r0 = r2.f12170
            java.lang.String r1 = r3.f12170
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L20
            goto L35
        L20:
            java.util.ArrayList r0 = r2.f12171
            java.util.ArrayList r1 = r3.f12171
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2b
            goto L35
        L2b:
            java.util.ArrayList r2 = r2.f12172
            java.util.ArrayList r3 = r3.f12172
            boolean r2 = r2.equals(r3)
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
            ky1 r0 = r3.f12169
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.f12170
            int r0 = p000.a12.m15(r0, r1, r2)
            java.util.ArrayList r2 = r3.f12171
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            java.util.ArrayList r3 = r3.f12172
            int r3 = r3.hashCode()
            int r3 = r3 + r2
            return r3
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ContentSharePlan(spark="
            r0.<init>(r1)
            ky1 r1 = r2.f12169
            r0.append(r1)
            java.lang.String r1 = ", displayName="
            r0.append(r1)
            java.lang.String r1 = r2.f12170
            r0.append(r1)
            java.lang.String r1 = ", taskIds="
            r0.append(r1)
            java.util.ArrayList r1 = r2.f12171
            r0.append(r1)
            java.lang.String r1 = ", titles="
            r0.append(r1)
            java.util.ArrayList r2 = r2.f12172
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
