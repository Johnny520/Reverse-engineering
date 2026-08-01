package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class vd1 {

    /* JADX INFO: renamed from: α */
    public final p000.EnumC0831td f11246;

    /* JADX INFO: renamed from: β */
    public final java.lang.Integer f11247;

    public vd1(p000.EnumC0831td r1, java.lang.Integer r2) {
            r0 = this;
            r0.<init>()
            r0.f11246 = r1
            r0.f11247 = r2
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p000.vd1
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            vd1 r5 = (p000.vd1) r5
            td r1 = r4.f11246
            td r3 = r5.f11246
            if (r1 == r3) goto L13
            return r2
        L13:
            java.lang.Integer r4 = r4.f11247
            java.lang.Integer r5 = r5.f11247
            boolean r4 = p000.ln0.m3626(r4, r5)
            if (r4 != 0) goto L1e
            return r2
        L1e:
            return r0
    }

    public final int hashCode() {
            r2 = this;
            r0 = 0
            td r1 = r2.f11246
            if (r1 != 0) goto L7
            r1 = r0
            goto Lb
        L7:
            int r1 = r1.hashCode()
        Lb:
            int r1 = r1 * 31
            java.lang.Integer r2 = r2.f11247
            if (r2 != 0) goto L12
            goto L16
        L12:
            int r0 = r2.hashCode()
        L16:
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Selection(mode="
            r0.<init>(r1)
            td r1 = r2.f11246
            r0.append(r1)
            java.lang.String r1 = ", seedId="
            r0.append(r1)
            java.lang.Integer r2 = r2.f11247
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
