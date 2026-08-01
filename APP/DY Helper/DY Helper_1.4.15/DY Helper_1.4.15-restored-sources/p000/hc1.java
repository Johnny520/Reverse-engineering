package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class hc1 {

    /* JADX INFO: renamed from: α */
    public final p000.kc1 f4685;

    /* JADX INFO: renamed from: β */
    public final java.lang.Throwable f4686;

    public hc1(p000.kc1 r1, java.lang.Throwable r2) {
            r0 = this;
            r0.<init>()
            r0.f4685 = r1
            r0.f4686 = r2
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p000.hc1
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            hc1 r5 = (p000.hc1) r5
            kc1 r1 = r4.f4685
            kc1 r3 = r5.f4685
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.Throwable r4 = r4.f4686
            java.lang.Throwable r5 = r5.f4686
            boolean r4 = p000.ln0.m3626(r4, r5)
            if (r4 != 0) goto L22
            return r2
        L22:
            return r0
    }

    public final int hashCode() {
            r2 = this;
            r0 = 0
            kc1 r1 = r2.f4685
            if (r1 != 0) goto L7
            r1 = r0
            goto Lb
        L7:
            int r1 = r1.hashCode()
        Lb:
            int r1 = r1 * 31
            java.lang.Throwable r2 = r2.f4686
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
            java.lang.String r1 = "WriteOutcome(result="
            r0.<init>(r1)
            kc1 r1 = r2.f4685
            r0.append(r1)
            java.lang.String r1 = ", error="
            r0.append(r1)
            java.lang.Throwable r2 = r2.f4686
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    /* JADX INFO: renamed from: α */
    public final p000.kc1 m2488() {
            r0 = this;
            kc1 r0 = r0.f4685
            return r0
    }

    /* JADX INFO: renamed from: β */
    public final boolean m2489() {
            r2 = this;
            r0 = 0
            kc1 r2 = r2.f4685
            if (r2 == 0) goto Ld
            boolean r2 = r2.m3187()
            r1 = 1
            if (r2 != r1) goto Ld
            return r1
        Ld:
            return r0
    }
}
