package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class pv0 extends p000.qv0 {

    /* JADX INFO: renamed from: α */
    public final android.content.Context f8731;

    /* JADX INFO: renamed from: β */
    public final java.lang.ClassLoader f8732;

    /* JADX INFO: renamed from: γ */
    public final java.lang.Object f8733;

    /* JADX INFO: renamed from: δ */
    public final java.lang.Object f8734;

    /* JADX INFO: renamed from: ε */
    public final java.lang.String f8735;

    public pv0(android.content.Context r1, java.lang.ClassLoader r2, java.lang.Object r3, java.lang.Object r4, java.lang.String r5) {
            r0 = this;
            r2.getClass()
            r0.<init>()
            r0.f8731 = r1
            r0.f8732 = r2
            r0.f8733 = r3
            r0.f8734 = r4
            r0.f8735 = r5
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L42
        L3:
            boolean r0 = r3 instanceof p000.pv0
            if (r0 != 0) goto L8
            goto L40
        L8:
            pv0 r3 = (p000.pv0) r3
            android.content.Context r0 = r2.f8731
            android.content.Context r1 = r3.f8731
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L15
            goto L40
        L15:
            java.lang.ClassLoader r0 = r2.f8732
            java.lang.ClassLoader r1 = r3.f8732
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L20
            goto L40
        L20:
            java.lang.Object r0 = r2.f8733
            java.lang.Object r1 = r3.f8733
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2b
            goto L40
        L2b:
            java.lang.Object r0 = r2.f8734
            java.lang.Object r1 = r3.f8734
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L36
            goto L40
        L36:
            java.lang.String r2 = r2.f8735
            java.lang.String r3 = r3.f8735
            boolean r2 = p000.ln0.m3626(r2, r3)
            if (r2 != 0) goto L42
        L40:
            r2 = 0
            return r2
        L42:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r3 = this;
            r0 = 0
            android.content.Context r1 = r3.f8731
            if (r1 != 0) goto L7
            r1 = r0
            goto Lb
        L7:
            int r1 = r1.hashCode()
        Lb:
            int r1 = r1 * 31
            java.lang.ClassLoader r2 = r3.f8732
            int r2 = r2.hashCode()
            int r2 = r2 + r1
            int r2 = r2 * 31
            java.lang.Object r1 = r3.f8733
            int r1 = r1.hashCode()
            int r1 = r1 + r2
            int r1 = r1 * 31
            java.lang.Object r2 = r3.f8734
            if (r2 != 0) goto L25
            r2 = r0
            goto L29
        L25:
            int r2 = r2.hashCode()
        L29:
            int r1 = r1 + r2
            int r1 = r1 * 31
            java.lang.String r3 = r3.f8735
            if (r3 != 0) goto L31
            goto L35
        L31:
            int r0 = r3.hashCode()
        L35:
            int r1 = r1 + r0
            int r1 = r1 * 31
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Feed(hostContext="
            r0.<init>(r1)
            android.content.Context r1 = r2.f8731
            r0.append(r1)
            java.lang.String r1 = ", classLoader="
            r0.append(r1)
            java.lang.ClassLoader r1 = r2.f8732
            r0.append(r1)
            java.lang.String r1 = ", panelParams="
            r0.append(r1)
            java.lang.Object r1 = r2.f8733
            r0.append(r1)
            java.lang.String r1 = ", aweme="
            r0.append(r1)
            java.lang.Object r1 = r2.f8734
            r0.append(r1)
            java.lang.String r1 = ", enterFrom="
            r0.append(r1)
            java.lang.String r1 = ", enterMethod=null)"
            java.lang.String r2 = r2.f8735
            java.lang.String r2 = p000.lz1.m3691(r0, r2, r1)
            return r2
    }

    @Override // p000.qv0
    /* JADX INFO: renamed from: α */
    public final android.content.Context mo4297() {
            r0 = this;
            android.content.Context r0 = r0.f8731
            return r0
    }
}
