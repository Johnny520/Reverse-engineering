package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public class gc2 extends p000.fc2 {
    public gc2(p000.oc2 r1, android.view.WindowInsets r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public gc2(p000.oc2 r1, p000.gc2 r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @Override // p000.ec2, p000.lc2
    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p000.gc2
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            gc2 r5 = (p000.gc2) r5
            android.view.WindowInsets r1 = r4.f3488
            android.view.WindowInsets r3 = r5.f3488
            boolean r1 = java.util.Objects.equals(r1, r3)
            if (r1 == 0) goto L2b
            nm0 r1 = r4.f3492
            nm0 r3 = r5.f3492
            boolean r1 = java.util.Objects.equals(r1, r3)
            if (r1 == 0) goto L2b
            int r4 = r4.f3493
            int r5 = r5.f3493
            boolean r4 = p000.ec2.m1900(r4, r5)
            if (r4 == 0) goto L2b
            return r0
        L2b:
            return r2
    }

    @Override // p000.lc2
    public int hashCode() {
            r0 = this;
            android.view.WindowInsets r0 = r0.f3488
            int r0 = r0.hashCode()
            return r0
    }

    @Override // p000.lc2
    /* JADX INFO: renamed from: α */
    public p000.oc2 mo2296() {
            r1 = this;
            android.view.WindowInsets r1 = r1.f3488
            android.view.WindowInsets r1 = r1.consumeDisplayCutout()
            r0 = 0
            oc2 r1 = p000.oc2.m4220(r0, r1)
            return r1
    }

    @Override // p000.lc2
    /* JADX INFO: renamed from: ζ */
    public p000.C0561mt mo2297() {
            r1 = this;
            android.view.WindowInsets r1 = r1.f3488
            android.view.DisplayCutout r1 = r1.getDisplayCutout()
            if (r1 != 0) goto La
            r1 = 0
            return r1
        La:
            mt r0 = new mt
            r0.<init>(r1)
            return r0
    }
}
