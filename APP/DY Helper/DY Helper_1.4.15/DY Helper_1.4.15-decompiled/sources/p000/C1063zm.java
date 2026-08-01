package p000;

/* JADX INFO: renamed from: zm */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1063zm implements p000.e80, p000.n80, java.io.Serializable {

    /* JADX INFO: renamed from: ε */
    public final java.lang.Object f13162;

    /* JADX INFO: renamed from: ζ */
    public final java.lang.Class f13163;

    /* JADX INFO: renamed from: η */
    public final java.lang.String f13164;

    /* JADX INFO: renamed from: θ */
    public final java.lang.String f13165;

    /* JADX INFO: renamed from: ι */
    public final boolean f13166;

    /* JADX INFO: renamed from: κ */
    public final int f13167;

    /* JADX INFO: renamed from: λ */
    public final int f13168;

    public C1063zm(int r1, java.lang.Class r2, java.lang.Object r3, java.lang.String r4, java.lang.String r5) {
            r0 = this;
            r0.<init>()
            r0.f13162 = r3
            r0.f13163 = r2
            r0.f13164 = r4
            r0.f13165 = r5
            r2 = 0
            r0.f13166 = r2
            r0.f13167 = r1
            r1 = 4
            r0.f13168 = r1
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L44
        L3:
            boolean r0 = r3 instanceof p000.C1063zm
            if (r0 != 0) goto L8
            goto L46
        L8:
            zm r3 = (p000.C1063zm) r3
            boolean r0 = r2.f13166
            boolean r1 = r3.f13166
            if (r0 != r1) goto L46
            int r0 = r2.f13167
            int r1 = r3.f13167
            if (r0 != r1) goto L46
            int r0 = r2.f13168
            int r1 = r3.f13168
            if (r0 != r1) goto L46
            java.lang.Object r0 = r2.f13162
            java.lang.Object r1 = r3.f13162
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L46
            java.lang.Class r0 = r2.f13163
            java.lang.Class r1 = r3.f13163
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L46
            java.lang.String r0 = r2.f13164
            java.lang.String r1 = r3.f13164
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L46
            java.lang.String r2 = r2.f13165
            java.lang.String r3 = r3.f13165
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L46
        L44:
            r2 = 1
            return r2
        L46:
            r2 = 0
            return r2
    }

    @Override // p000.n80
    public final int getArity() {
            r0 = this;
            int r0 = r0.f13167
            return r0
    }

    public final int hashCode() {
            r3 = this;
            java.lang.Object r0 = r3.f13162
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.Class r2 = r3.f13163
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            java.lang.String r0 = r3.f13164
            int r0 = p000.a12.m15(r2, r1, r0)
            java.lang.String r2 = r3.f13165
            int r0 = p000.a12.m15(r0, r1, r2)
            boolean r2 = r3.f13166
            if (r2 == 0) goto L24
            r2 = 1231(0x4cf, float:1.725E-42)
            goto L26
        L24:
            r2 = 1237(0x4d5, float:1.733E-42)
        L26:
            int r0 = r0 + r2
            int r0 = r0 * r1
            int r2 = r3.f13167
            int r0 = r0 + r2
            int r0 = r0 * r1
            int r3 = r3.f13168
            int r0 = r0 + r3
            return r0
    }

    @Override // p000.e80
    public final java.lang.Object invoke(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            v80 r1 = (p000.v80) r1
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            java.lang.Object r0 = r0.f13162
            an r0 = (p000.C0024an) r0
            r0.m180(r1, r2)
            s62 r0 = p000.s62.f9751
            return r0
    }

    public final java.lang.String toString() {
            r1 = this;
            wm1 r0 = p000.vm1.f11350
            r0.getClass()
            java.lang.String r1 = p000.wm1.m6397(r1)
            return r1
    }
}
