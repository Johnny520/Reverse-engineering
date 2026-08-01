package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class hm0 {

    /* JADX INFO: renamed from: α */
    public final /* synthetic */ int f4771;

    /* JADX INFO: renamed from: β */
    public final p000.te0 f4772;

    /* JADX INFO: renamed from: γ */
    public final p000.te0 f4773;

    /* JADX INFO: renamed from: δ */
    public final p000.te0 f4774;

    /* JADX INFO: renamed from: ε */
    public final p000.te0 f4775;

    /* JADX INFO: renamed from: ζ */
    public final java.io.Serializable f4776;

    public hm0(java.lang.String r3) {
            r2 = this;
            r0 = 1
            r2.f4771 = r0
            r2.<init>()
            r2.f4776 = r3
            te0 r3 = new te0
            r1 = 0
            r3.<init>(r0, r1)
            r2.f4772 = r3
            te0 r3 = new te0
            r0 = 0
            r3.<init>(r0, r1)
            r2.f4773 = r3
            te0 r3 = new te0
            r0 = 1
            r3.<init>(r0, r1)
            r2.f4774 = r3
            te0 r3 = new te0
            r0 = 0
            r3.<init>(r0, r1)
            r2.f4775 = r3
            return
    }

    public hm0(p000.hm0[] r5) {
            r4 = this;
            r0 = 0
            r4.f4771 = r0
            r4.<init>()
            r4.f4776 = r5
            int r5 = r5.length
            te0[] r0 = new p000.te0[r5]
            r1 = 0
            r2 = r1
        Ld:
            if (r2 >= r5) goto L1e
            java.io.Serializable r3 = r4.f4776
            hm0[] r3 = (p000.hm0[]) r3
            r3 = r3[r2]
            te0 r3 = r3.m2520()
            r0[r2] = r3
            int r2 = r2 + 1
            goto Ld
        L1e:
            y72 r5 = new y72
            r2 = 0
            r5.<init>(r0, r2)
            te0 r0 = new te0
            r2 = 1
            r0.<init>(r2, r5)
            r4.f4772 = r0
            java.io.Serializable r5 = r4.f4776
            hm0[] r5 = (p000.hm0[]) r5
            int r5 = r5.length
            te0[] r0 = new p000.te0[r5]
            r2 = r1
        L34:
            if (r2 >= r5) goto L45
            java.io.Serializable r3 = r4.f4776
            hm0[] r3 = (p000.hm0[]) r3
            r3 = r3[r2]
            te0 r3 = r3.m2522()
            r0[r2] = r3
            int r2 = r2 + 1
            goto L34
        L45:
            te0 r5 = new te0
            se0 r2 = new se0
            r3 = 0
            r2.<init>(r0, r3)
            r0 = 0
            r5.<init>(r0, r2)
            r4.f4773 = r5
            java.io.Serializable r5 = r4.f4776
            hm0[] r5 = (p000.hm0[]) r5
            int r5 = r5.length
            te0[] r0 = new p000.te0[r5]
            r2 = r1
        L5b:
            if (r2 >= r5) goto L6c
            java.io.Serializable r3 = r4.f4776
            hm0[] r3 = (p000.hm0[]) r3
            r3 = r3[r2]
            te0 r3 = r3.m2521()
            r0[r2] = r3
            int r2 = r2 + 1
            goto L5b
        L6c:
            y72 r5 = new y72
            r2 = 1
            r5.<init>(r0, r2)
            te0 r0 = new te0
            r0.<init>(r2, r5)
            r4.f4774 = r0
            java.io.Serializable r5 = r4.f4776
            hm0[] r5 = (p000.hm0[]) r5
            int r5 = r5.length
            te0[] r0 = new p000.te0[r5]
        L80:
            if (r1 >= r5) goto L91
            java.io.Serializable r2 = r4.f4776
            hm0[] r2 = (p000.hm0[]) r2
            r2 = r2[r1]
            te0 r2 = r2.m2519()
            r0[r1] = r2
            int r1 = r1 + 1
            goto L80
        L91:
            te0 r5 = new te0
            se0 r1 = new se0
            r2 = 1
            r1.<init>(r0, r2)
            r0 = 0
            r5.<init>(r0, r1)
            r4.f4775 = r5
            return
    }

    public final java.lang.String toString() {
            r3 = this;
            int r0 = r3.f4771
            switch(r0) {
                case 0: goto L1d;
                default: goto L5;
            }
        L5:
            java.io.Serializable r3 = r3.f4776
            java.lang.String r3 = (java.lang.String) r3
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "RectRulers("
            r0.<init>(r1)
            r0.append(r3)
            r3 = 41
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
        L1d:
            java.io.Serializable r3 = r3.f4776
            hm0[] r3 = (p000.hm0[]) r3
            java.lang.String r0 = "innermostOf("
            r1 = 57
            r2 = 0
            java.lang.String r3 = p000.AbstractC0312g7.m2256(r3, r2, r0, r2, r1)
            return r3
    }

    /* JADX INFO: renamed from: α */
    public final p000.te0 m2519() {
            r1 = this;
            int r0 = r1.f4771
            switch(r0) {
                case 0: goto L8;
                default: goto L5;
            }
        L5:
            te0 r1 = r1.f4775
            return r1
        L8:
            te0 r1 = r1.f4775
            return r1
    }

    /* JADX INFO: renamed from: β */
    public final p000.te0 m2520() {
            r1 = this;
            int r0 = r1.f4771
            switch(r0) {
                case 0: goto L8;
                default: goto L5;
            }
        L5:
            te0 r1 = r1.f4772
            return r1
        L8:
            te0 r1 = r1.f4772
            return r1
    }

    /* JADX INFO: renamed from: γ */
    public final p000.te0 m2521() {
            r1 = this;
            int r0 = r1.f4771
            switch(r0) {
                case 0: goto L8;
                default: goto L5;
            }
        L5:
            te0 r1 = r1.f4774
            return r1
        L8:
            te0 r1 = r1.f4774
            return r1
    }

    /* JADX INFO: renamed from: δ */
    public final p000.te0 m2522() {
            r1 = this;
            int r0 = r1.f4771
            switch(r0) {
                case 0: goto L8;
                default: goto L5;
            }
        L5:
            te0 r1 = r1.f4773
            return r1
        L8:
            te0 r1 = r1.f4773
            return r1
    }
}
