package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class v10 {

    /* JADX INFO: renamed from: α */
    public boolean f11052;

    /* JADX INFO: renamed from: β */
    public float f11053;

    /* JADX INFO: renamed from: γ */
    public float f11054;

    /* JADX INFO: renamed from: δ */
    public long f11055;

    /* JADX INFO: renamed from: ε */
    public java.lang.String f11056;

    /* JADX INFO: renamed from: ζ */
    public java.lang.String f11057;

    /* JADX INFO: renamed from: η */
    public boolean f11058;

    /* JADX INFO: renamed from: θ */
    public boolean f11059;

    /* JADX INFO: renamed from: ι */
    public android.view.View f11060;

    /* JADX INFO: renamed from: κ */
    public java.lang.Runnable f11061;

    /* JADX INFO: renamed from: λ */
    public long f11062;

    /* JADX INFO: renamed from: μ */
    public boolean f11063;

    public v10() {
            r4 = this;
            r4.<init>()
            r0 = 0
            r4.f11052 = r0
            r1 = 0
            r4.f11053 = r1
            r4.f11054 = r1
            r1 = 0
            r4.f11055 = r1
            java.lang.String r3 = ""
            r4.f11056 = r3
            java.lang.String r3 = "无"
            r4.f11057 = r3
            r4.f11058 = r0
            r4.f11059 = r0
            r3 = 0
            r4.f11060 = r3
            r4.f11061 = r3
            r4.f11062 = r1
            r4.f11063 = r0
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            if (r4 != r5) goto L4
            goto L7e
        L4:
            boolean r0 = r5 instanceof p000.v10
            if (r0 != 0) goto La
            goto L7c
        La:
            v10 r5 = (p000.v10) r5
            boolean r0 = r4.f11052
            boolean r1 = r5.f11052
            if (r0 == r1) goto L14
            goto L7c
        L14:
            float r0 = r4.f11053
            float r1 = r5.f11053
            int r0 = java.lang.Float.compare(r0, r1)
            if (r0 == 0) goto L1f
            goto L7c
        L1f:
            float r0 = r4.f11054
            float r1 = r5.f11054
            int r0 = java.lang.Float.compare(r0, r1)
            if (r0 == 0) goto L2a
            goto L7c
        L2a:
            long r0 = r4.f11055
            long r2 = r5.f11055
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L33
            goto L7c
        L33:
            java.lang.String r0 = r4.f11056
            java.lang.String r1 = r5.f11056
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L3e
            goto L7c
        L3e:
            java.lang.String r0 = r4.f11057
            java.lang.String r1 = r5.f11057
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L49
            goto L7c
        L49:
            boolean r0 = r4.f11058
            boolean r1 = r5.f11058
            if (r0 == r1) goto L50
            goto L7c
        L50:
            boolean r0 = r4.f11059
            boolean r1 = r5.f11059
            if (r0 == r1) goto L57
            goto L7c
        L57:
            android.view.View r0 = r4.f11060
            android.view.View r1 = r5.f11060
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L62
            goto L7c
        L62:
            java.lang.Runnable r0 = r4.f11061
            java.lang.Runnable r1 = r5.f11061
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L6d
            goto L7c
        L6d:
            long r0 = r4.f11062
            long r2 = r5.f11062
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L76
            goto L7c
        L76:
            boolean r4 = r4.f11063
            boolean r5 = r5.f11063
            if (r4 == r5) goto L7e
        L7c:
            r4 = 0
            return r4
        L7e:
            r4 = 1
            return r4
    }

    public final int hashCode() {
            r4 = this;
            boolean r0 = r4.f11052
            int r0 = java.lang.Boolean.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            float r2 = r4.f11053
            int r0 = p000.lz1.m3676(r2, r0, r1)
            float r2 = r4.f11054
            int r0 = p000.lz1.m3676(r2, r0, r1)
            long r2 = r4.f11055
            int r0 = p000.lz1.m3677(r0, r1, r2)
            java.lang.String r2 = r4.f11056
            int r0 = p000.a12.m15(r0, r1, r2)
            java.lang.String r2 = r4.f11057
            int r0 = p000.a12.m15(r0, r1, r2)
            boolean r2 = r4.f11058
            int r0 = p000.lz1.m3678(r0, r1, r2)
            boolean r2 = r4.f11059
            int r0 = p000.lz1.m3678(r0, r1, r2)
            android.view.View r2 = r4.f11060
            r3 = 0
            if (r2 != 0) goto L3a
            r2 = r3
            goto L3e
        L3a:
            int r2 = r2.hashCode()
        L3e:
            int r0 = r0 + r2
            int r0 = r0 * r1
            java.lang.Runnable r2 = r4.f11061
            if (r2 != 0) goto L45
            goto L49
        L45:
            int r3 = r2.hashCode()
        L49:
            int r0 = r0 + r3
            int r0 = r0 * r1
            long r2 = r4.f11062
            int r0 = p000.lz1.m3677(r0, r1, r2)
            boolean r4 = r4.f11063
            int r4 = java.lang.Boolean.hashCode(r4)
            int r4 = r4 + r0
            return r4
    }

    public final java.lang.String toString() {
            r15 = this;
            boolean r0 = r15.f11052
            float r1 = r15.f11053
            float r2 = r15.f11054
            long r3 = r15.f11055
            java.lang.String r5 = r15.f11056
            java.lang.String r6 = r15.f11057
            boolean r7 = r15.f11058
            boolean r8 = r15.f11059
            android.view.View r9 = r15.f11060
            java.lang.Runnable r10 = r15.f11061
            long r11 = r15.f11062
            boolean r15 = r15.f11063
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r14 = "GestureState(trackingDown="
            r13.<init>(r14)
            r13.append(r0)
            java.lang.String r0 = ", downX="
            r13.append(r0)
            r13.append(r1)
            java.lang.String r0 = ", downY="
            r13.append(r0)
            r13.append(r2)
            java.lang.String r0 = ", downTime="
            r13.append(r0)
            r13.append(r3)
            java.lang.String r0 = ", downArea="
            java.lang.String r1 = ", downLongAction="
            p000.AbstractC0602nx.m4119(r13, r0, r5, r1, r6)
            java.lang.String r0 = ", movedTooFar="
            r13.append(r0)
            r13.append(r7)
            java.lang.String r0 = ", longFired="
            r13.append(r0)
            r13.append(r8)
            java.lang.String r0 = ", longHost="
            r13.append(r0)
            r13.append(r9)
            java.lang.String r0 = ", longRunnable="
            r13.append(r0)
            r13.append(r10)
            java.lang.String r0 = ", contextCacheAt="
            java.lang.String r1 = ", contextCacheAllowed="
            p000.AbstractC0602nx.m4118(r13, r0, r11, r1)
            java.lang.String r0 = ")"
            java.lang.String r15 = p000.lz1.m3693(r13, r15, r0)
            return r15
    }
}
