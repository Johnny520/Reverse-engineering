package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class qf1 {

    /* JADX INFO: renamed from: α */
    public final java.lang.ClassLoader f8994;

    /* JADX INFO: renamed from: β */
    public final java.lang.Class f8995;

    /* JADX INFO: renamed from: γ */
    public final java.lang.Object f8996;

    public qf1(java.lang.Class r1, java.lang.ClassLoader r2, java.lang.Object r3) {
            r0 = this;
            r2.getClass()
            r0.<init>()
            r0.f8994 = r2
            r0.f8995 = r1
            r0.f8996 = r3
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L2c
        L3:
            boolean r0 = r3 instanceof p000.qf1
            if (r0 != 0) goto L8
            goto L2a
        L8:
            qf1 r3 = (p000.qf1) r3
            java.lang.ClassLoader r0 = r2.f8994
            java.lang.ClassLoader r1 = r3.f8994
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L15
            goto L2a
        L15:
            java.lang.Class r0 = r2.f8995
            java.lang.Class r1 = r3.f8995
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L20
            goto L2a
        L20:
            java.lang.Object r2 = r2.f8996
            java.lang.Object r3 = r3.f8996
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
            r2 = this;
            java.lang.ClassLoader r0 = r2.f8994
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.Class r1 = r2.f8995
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.Object r2 = r2.f8996
            int r2 = r2.hashCode()
            int r2 = r2 + r1
            return r2
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Handle(classLoader="
            r0.<init>(r1)
            java.lang.ClassLoader r1 = r2.f8994
            r0.append(r1)
            java.lang.String r1 = ", apiClass="
            r0.append(r1)
            java.lang.Class r1 = r2.f8995
            r0.append(r1)
            java.lang.String r1 = ", service="
            r0.append(r1)
            java.lang.Object r2 = r2.f8996
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
