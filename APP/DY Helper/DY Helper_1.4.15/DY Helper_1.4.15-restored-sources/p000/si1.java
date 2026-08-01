package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class si1 {

    /* JADX INFO: renamed from: α */
    public final boolean f9925;

    /* JADX INFO: renamed from: β */
    public final java.util.List f9926;

    /* JADX INFO: renamed from: γ */
    public final int f9927;

    /* JADX INFO: renamed from: δ */
    public final int f9928;

    /* JADX INFO: renamed from: ε */
    public final java.util.List f9929;

    public si1(boolean r1, java.util.List r2, int r3, int r4, java.util.List r5) {
            r0 = this;
            r0.<init>()
            r0.f9925 = r1
            r0.f9926 = r2
            r0.f9927 = r3
            r0.f9928 = r4
            r0.f9929 = r5
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L36
        L3:
            boolean r0 = r3 instanceof p000.si1
            if (r0 != 0) goto L8
            goto L34
        L8:
            si1 r3 = (p000.si1) r3
            boolean r0 = r2.f9925
            boolean r1 = r3.f9925
            if (r0 == r1) goto L11
            goto L34
        L11:
            java.util.List r0 = r2.f9926
            java.util.List r1 = r3.f9926
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1c
            goto L34
        L1c:
            int r0 = r2.f9927
            int r1 = r3.f9927
            if (r0 == r1) goto L23
            goto L34
        L23:
            int r0 = r2.f9928
            int r1 = r3.f9928
            if (r0 == r1) goto L2a
            goto L34
        L2a:
            java.util.List r2 = r2.f9929
            java.util.List r3 = r3.f9929
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L36
        L34:
            r2 = 0
            return r2
        L36:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r3 = this;
            boolean r0 = r3.f9925
            int r0 = java.lang.Boolean.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            java.util.List r2 = r3.f9926
            int r0 = p000.a12.m16(r2, r0, r1)
            int r2 = r3.f9927
            int r0 = p000.a12.m14(r2, r0, r1)
            int r2 = r3.f9928
            int r0 = p000.a12.m14(r2, r0, r1)
            java.util.List r3 = r3.f9929
            int r3 = r3.hashCode()
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ClearAllPrefsResult(success="
            r0.<init>(r1)
            boolean r1 = r5.f9925
            r0.append(r1)
            java.lang.String r1 = ", prefNames="
            r0.append(r1)
            java.util.List r1 = r5.f9926
            r0.append(r1)
            java.lang.String r1 = ", clearedPrefs="
            r0.append(r1)
            java.lang.String r1 = ", deletedFiles="
            java.lang.String r2 = ", failures="
            int r3 = r5.f9927
            int r4 = r5.f9928
            p000.AbstractC0602nx.m4117(r0, r3, r1, r4, r2)
            java.util.List r5 = r5.f9929
            r0.append(r5)
            java.lang.String r5 = ")"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            return r5
    }
}
