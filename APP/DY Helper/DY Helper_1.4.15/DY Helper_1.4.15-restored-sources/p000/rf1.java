package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class rf1 {

    /* JADX INFO: renamed from: α */
    public final java.lang.Object f9362;

    /* JADX INFO: renamed from: β */
    public final java.lang.Throwable f9363;

    public rf1(java.lang.Object r3, java.lang.Throwable r4, int r5) {
            r2 = this;
            r0 = r5 & 1
            r1 = 0
            if (r0 == 0) goto L6
            r3 = r1
        L6:
            r5 = r5 & 2
            if (r5 == 0) goto Lb
            r4 = r1
        Lb:
            r2.<init>()
            r2.f9362 = r3
            r2.f9363 = r4
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p000.rf1
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            rf1 r5 = (p000.rf1) r5
            java.lang.Object r1 = r4.f9362
            java.lang.Object r3 = r5.f9362
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.Throwable r4 = r4.f9363
            java.lang.Throwable r5 = r5.f9363
            boolean r4 = p000.ln0.m3626(r4, r5)
            if (r4 != 0) goto L22
            return r2
        L22:
            return r0
    }

    public final int hashCode() {
            r2 = this;
            r0 = 0
            java.lang.Object r1 = r2.f9362
            if (r1 != 0) goto L7
            r1 = r0
            goto Lb
        L7:
            int r1 = r1.hashCode()
        Lb:
            int r1 = r1 * 31
            java.lang.Throwable r2 = r2.f9363
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
            java.lang.String r1 = "PetElfHostCall(data="
            r0.<init>(r1)
            java.lang.Object r1 = r2.f9362
            r0.append(r1)
            java.lang.String r1 = ", error="
            r0.append(r1)
            java.lang.Throwable r2 = r2.f9363
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    /* JADX INFO: renamed from: α */
    public final boolean m5085() {
            r1 = this;
            java.lang.Object r0 = r1.f9362
            if (r0 == 0) goto La
            java.lang.Throwable r1 = r1.f9363
            if (r1 != 0) goto La
            r1 = 1
            return r1
        La:
            r1 = 0
            return r1
    }
}
