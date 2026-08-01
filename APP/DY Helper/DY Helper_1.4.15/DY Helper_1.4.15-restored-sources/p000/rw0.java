package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class rw0 {

    /* JADX INFO: renamed from: α */
    public final long f9536;

    /* JADX INFO: renamed from: β */
    public final java.lang.String f9537;

    public /* synthetic */ rw0() {
            r3 = this;
            r0 = 0
            java.lang.String r2 = ""
            r3.<init>(r0, r2)
            return
    }

    public rw0(long r1, java.lang.String r3) {
            r0 = this;
            r0.<init>()
            r0.f9536 = r1
            r0.f9537 = r3
            return
    }

    public final boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof p000.rw0
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            rw0 r8 = (p000.rw0) r8
            long r3 = r7.f9536
            long r5 = r8.f9536
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L15
            return r2
        L15:
            java.lang.String r7 = r7.f9537
            java.lang.String r8 = r8.f9537
            boolean r7 = p000.ln0.m3626(r7, r8)
            if (r7 != 0) goto L20
            return r2
        L20:
            return r0
    }

    public final int hashCode() {
            r2 = this;
            long r0 = r2.f9536
            int r0 = java.lang.Long.hashCode(r0)
            int r0 = r0 * 31
            java.lang.String r2 = r2.f9537
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            return r2
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "HostVersionInfo(versionCode="
            r0.<init>(r1)
            long r1 = r3.f9536
            r0.append(r1)
            java.lang.String r1 = ", versionName="
            r0.append(r1)
            java.lang.String r3 = r3.f9537
            r0.append(r3)
            java.lang.String r3 = ")"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }
}
