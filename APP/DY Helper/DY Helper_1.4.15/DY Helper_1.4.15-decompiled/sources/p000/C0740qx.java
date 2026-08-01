package p000;

/* JADX INFO: renamed from: qx */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0740qx {

    /* JADX INFO: renamed from: α */
    public final java.lang.String f9152;

    /* JADX INFO: renamed from: β */
    public final java.lang.String f9153;

    /* JADX INFO: renamed from: γ */
    public final p000.p70 f9154;

    public C0740qx(java.lang.String r1, java.lang.String r2, p000.p70 r3) {
            r0 = this;
            r2.getClass()
            r0.<init>()
            r0.f9152 = r1
            r0.f9153 = r2
            r0.f9154 = r3
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L2c
        L3:
            boolean r0 = r3 instanceof p000.C0740qx
            if (r0 != 0) goto L8
            goto L2a
        L8:
            qx r3 = (p000.C0740qx) r3
            java.lang.String r0 = r2.f9152
            java.lang.String r1 = r3.f9152
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L2a
        L15:
            java.lang.String r0 = r2.f9153
            java.lang.String r1 = r3.f9153
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L20
            goto L2a
        L20:
            p70 r2 = r2.f9154
            p70 r3 = r3.f9154
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L2c
        L2a:
            r2 = 0
            return r2
        L2c:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.f9152
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.f9153
            int r0 = p000.a12.m15(r0, r1, r2)
            p70 r3 = r3.f9154
            int r3 = r3.hashCode()
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", progressText="
            java.lang.String r1 = ", action="
            java.lang.String r2 = "Task(taskId="
            java.lang.String r3 = r5.f9152
            java.lang.String r4 = r5.f9153
            java.lang.StringBuilder r0 = p000.lz1.m3695(r2, r3, r0, r4, r1)
            p70 r5 = r5.f9154
            r0.append(r5)
            java.lang.String r5 = ")"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            return r5
    }
}
