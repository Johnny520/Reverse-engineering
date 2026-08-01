package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class oc2 {

    /* JADX INFO: renamed from: β */
    public static final p000.oc2 f8032 = null;

    /* JADX INFO: renamed from: α */
    public final p000.lc2 f8033;

    static {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto Lb
            oc2 r0 = p000.kc2.f5855
            p000.oc2.f8032 = r0
            return
        Lb:
            oc2 r0 = p000.ic2.f5002
            p000.oc2.f8032 = r0
            return
    }

    public oc2(android.view.WindowInsets r3) {
            r2 = this;
            r2.<init>()
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto L11
            kc2 r0 = new kc2
            r0.<init>(r2, r3)
            r2.f8033 = r0
            return
        L11:
            r1 = 31
            if (r0 < r1) goto L1d
            jc2 r0 = new jc2
            r0.<init>(r2, r3)
            r2.f8033 = r0
            return
        L1d:
            ic2 r0 = new ic2
            r0.<init>(r2, r3)
            r2.f8033 = r0
            return
    }

    public oc2(p000.oc2 r3) {
            r2 = this;
            r2.<init>()
            if (r3 == 0) goto L85
            lc2 r3 = r3.f8033
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto L1c
            boolean r1 = r3 instanceof p000.kc2
            if (r1 == 0) goto L1c
            kc2 r0 = new kc2
            r1 = r3
            kc2 r1 = (p000.kc2) r1
            r0.<init>(r2, r1)
            r2.f8033 = r0
            goto L81
        L1c:
            r1 = 31
            if (r0 < r1) goto L2f
            boolean r0 = r3 instanceof p000.jc2
            if (r0 == 0) goto L2f
            jc2 r0 = new jc2
            r1 = r3
            jc2 r1 = (p000.jc2) r1
            r0.<init>(r2, r1)
            r2.f8033 = r0
            goto L81
        L2f:
            boolean r0 = r3 instanceof p000.ic2
            if (r0 == 0) goto L3e
            ic2 r0 = new ic2
            r1 = r3
            ic2 r1 = (p000.ic2) r1
            r0.<init>(r2, r1)
            r2.f8033 = r0
            goto L81
        L3e:
            boolean r0 = r3 instanceof p000.hc2
            if (r0 == 0) goto L4d
            hc2 r0 = new hc2
            r1 = r3
            hc2 r1 = (p000.hc2) r1
            r0.<init>(r2, r1)
            r2.f8033 = r0
            goto L81
        L4d:
            boolean r0 = r3 instanceof p000.gc2
            if (r0 == 0) goto L5c
            gc2 r0 = new gc2
            r1 = r3
            gc2 r1 = (p000.gc2) r1
            r0.<init>(r2, r1)
            r2.f8033 = r0
            goto L81
        L5c:
            boolean r0 = r3 instanceof p000.fc2
            if (r0 == 0) goto L6b
            fc2 r0 = new fc2
            r1 = r3
            fc2 r1 = (p000.fc2) r1
            r0.<init>(r2, r1)
            r2.f8033 = r0
            goto L81
        L6b:
            boolean r0 = r3 instanceof p000.ec2
            if (r0 == 0) goto L7a
            ec2 r0 = new ec2
            r1 = r3
            ec2 r1 = (p000.ec2) r1
            r0.<init>(r2, r1)
            r2.f8033 = r0
            goto L81
        L7a:
            lc2 r0 = new lc2
            r0.<init>(r2)
            r2.f8033 = r0
        L81:
            r3.mo1905(r2)
            return
        L85:
            lc2 r3 = new lc2
            r3.<init>(r2)
            r2.f8033 = r3
            return
    }

    /* JADX INFO: renamed from: ε */
    public static p000.nm0 m4219(p000.nm0 r5, int r6, int r7, int r8, int r9) {
            int r0 = r5.f7674
            int r0 = r0 - r6
            r1 = 0
            int r0 = java.lang.Math.max(r1, r0)
            int r2 = r5.f7675
            int r2 = r2 - r7
            int r2 = java.lang.Math.max(r1, r2)
            int r3 = r5.f7676
            int r3 = r3 - r8
            int r3 = java.lang.Math.max(r1, r3)
            int r4 = r5.f7677
            int r4 = r4 - r9
            int r1 = java.lang.Math.max(r1, r4)
            if (r0 != r6) goto L26
            if (r2 != r7) goto L26
            if (r3 != r8) goto L26
            if (r1 != r9) goto L26
            return r5
        L26:
            nm0 r5 = p000.nm0.m4080(r0, r2, r3, r1)
            return r5
    }

    /* JADX INFO: renamed from: θ */
    public static p000.oc2 m4220(android.view.View r2, android.view.WindowInsets r3) {
            oc2 r0 = new oc2
            r3.getClass()
            r0.<init>(r3)
            if (r2 == 0) goto L29
            boolean r3 = r2.isAttachedToWindow()
            if (r3 == 0) goto L29
            java.util.WeakHashMap r3 = p000.b92.f1572
            oc2 r3 = p000.v82.m6137(r2)
            lc2 r1 = r0.f8033
            r1.mo1914(r3)
            android.view.View r3 = r2.getRootView()
            r1.mo1904(r3)
            int r2 = r2.getWindowSystemUiVisibility()
            r1.mo1915(r2)
        L29:
            return r0
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L4
            r1 = 1
            return r1
        L4:
            boolean r0 = r2 instanceof p000.oc2
            if (r0 != 0) goto La
            r1 = 0
            return r1
        La:
            oc2 r2 = (p000.oc2) r2
            lc2 r1 = r1.f8033
            lc2 r2 = r2.f8033
            boolean r1 = java.util.Objects.equals(r1, r2)
            return r1
    }

    public final int hashCode() {
            r0 = this;
            lc2 r0 = r0.f8033
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            int r0 = r0.hashCode()
            return r0
    }

    /* JADX INFO: renamed from: α */
    public final int m4221() {
            r0 = this;
            lc2 r0 = r0.f8033
            nm0 r0 = r0.mo1908()
            int r0 = r0.f7677
            return r0
    }

    /* JADX INFO: renamed from: β */
    public final int m4222() {
            r0 = this;
            lc2 r0 = r0.f8033
            nm0 r0 = r0.mo1908()
            int r0 = r0.f7674
            return r0
    }

    /* JADX INFO: renamed from: γ */
    public final int m4223() {
            r0 = this;
            lc2 r0 = r0.f8033
            nm0 r0 = r0.mo1908()
            int r0 = r0.f7676
            return r0
    }

    /* JADX INFO: renamed from: δ */
    public final int m4224() {
            r0 = this;
            lc2 r0 = r0.f8033
            nm0 r0 = r0.mo1908()
            int r0 = r0.f7675
            return r0
    }

    /* JADX INFO: renamed from: ζ */
    public final p000.oc2 m4225(int r3, int r4, int r5, int r6) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto Lc
            cc2 r0 = new cc2
            r0.<init>(r2)
            goto L1b
        Lc:
            r1 = 31
            if (r0 < r1) goto L16
            bc2 r0 = new bc2
            r0.<init>(r2)
            goto L1b
        L16:
            ac2 r0 = new ac2
            r0.<init>(r2)
        L1b:
            nm0 r2 = p000.nm0.m4080(r3, r4, r5, r6)
            r0.mo1700(r2)
            oc2 r2 = r0.mo1698()
            return r2
    }

    /* JADX INFO: renamed from: η */
    public final android.view.WindowInsets m4226() {
            r1 = this;
            lc2 r1 = r1.f8033
            boolean r0 = r1 instanceof p000.ec2
            if (r0 == 0) goto Lb
            ec2 r1 = (p000.ec2) r1
            android.view.WindowInsets r1 = r1.f3488
            return r1
        Lb:
            r1 = 0
            return r1
    }
}
