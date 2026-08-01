package p000;

/* JADX INFO: renamed from: iu */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0407iu {

    /* JADX INFO: renamed from: α */
    public final java.lang.String f5185;

    /* JADX INFO: renamed from: β */
    public final java.lang.String f5186;

    /* JADX INFO: renamed from: γ */
    public final boolean f5187;

    public C0407iu(java.lang.String r1, java.lang.String r2, boolean r3) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.f5185 = r1
            r0.f5186 = r2
            r0.f5187 = r3
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p000.C0407iu
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            iu r5 = (p000.C0407iu) r5
            java.lang.String r1 = r4.f5185
            java.lang.String r3 = r5.f5185
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r4.f5186
            java.lang.String r3 = r5.f5186
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            boolean r4 = r4.f5187
            boolean r5 = r5.f5187
            if (r4 == r5) goto L29
            return r2
        L29:
            return r0
    }

    public final int hashCode() {
            r2 = this;
            java.lang.String r0 = r2.f5185
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.String r1 = r2.f5186
            if (r1 != 0) goto Le
            r1 = 0
            goto L12
        Le:
            int r1 = r1.hashCode()
        L12:
            int r0 = r0 + r1
            int r0 = r0 * 31
            boolean r2 = r2.f5187
            int r2 = java.lang.Boolean.hashCode(r2)
            int r2 = r2 + r0
            return r2
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", uri="
            java.lang.String r1 = ", canWrite="
            java.lang.String r2 = "Status(state="
            java.lang.String r3 = r5.f5185
            java.lang.String r4 = r5.f5186
            java.lang.StringBuilder r0 = p000.lz1.m3695(r2, r3, r0, r4, r1)
            java.lang.String r1 = ")"
            boolean r5 = r5.f5187
            java.lang.String r5 = p000.lz1.m3693(r0, r5, r1)
            return r5
    }

    /* JADX INFO: renamed from: α */
    public final boolean m2799() {
            r1 = this;
            java.lang.String r0 = r1.f5186
            if (r0 == 0) goto L11
            boolean r0 = p000.q02.m4671(r0)
            if (r0 == 0) goto Lb
            goto L11
        Lb:
            boolean r1 = r1.f5187
            if (r1 == 0) goto L11
            r1 = 1
            return r1
        L11:
            r1 = 0
            return r1
    }
}
