package p000;

/* JADX INFO: renamed from: gl */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0326gl {

    /* JADX INFO: renamed from: δ */
    public static final p000.C0326gl f4402 = null;

    /* JADX INFO: renamed from: ε */
    public static final p000.C0326gl f4403 = null;

    /* JADX INFO: renamed from: ζ */
    public static final p000.C0326gl f4404 = null;

    /* JADX INFO: renamed from: η */
    public static final p000.C0326gl f4405 = null;

    /* JADX INFO: renamed from: α */
    public final boolean f4406;

    /* JADX INFO: renamed from: β */
    public final boolean f4407;

    /* JADX INFO: renamed from: γ */
    public final boolean f4408;

    static {
            gl r0 = new gl
            r1 = 1
            r0.<init>(r1, r1, r1)
            p000.C0326gl.f4402 = r0
            gl r0 = new gl
            r2 = 0
            r0.<init>(r1, r1, r2)
            p000.C0326gl.f4403 = r0
            gl r0 = new gl
            r0.<init>(r2, r1, r1)
            p000.C0326gl.f4404 = r0
            gl r0 = new gl
            r0.<init>(r2, r2, r1)
            p000.C0326gl.f4405 = r0
            return
    }

    public C0326gl(boolean r1, boolean r2, boolean r3) {
            r0 = this;
            r0.<init>()
            r0.f4406 = r1
            r0.f4407 = r2
            r0.f4408 = r3
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L20
        L3:
            boolean r0 = r3 instanceof p000.C0326gl
            if (r0 != 0) goto L8
            goto L1e
        L8:
            gl r3 = (p000.C0326gl) r3
            boolean r0 = r2.f4406
            boolean r1 = r3.f4406
            if (r0 == r1) goto L11
            goto L1e
        L11:
            boolean r0 = r2.f4407
            boolean r1 = r3.f4407
            if (r0 == r1) goto L18
            goto L1e
        L18:
            boolean r2 = r2.f4408
            boolean r3 = r3.f4408
            if (r2 == r3) goto L20
        L1e:
            r2 = 0
            return r2
        L20:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r3 = this;
            boolean r0 = r3.f4406
            int r0 = java.lang.Boolean.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            boolean r2 = r3.f4407
            int r0 = p000.lz1.m3678(r0, r1, r2)
            boolean r3 = r3.f4408
            int r3 = java.lang.Boolean.hashCode(r3)
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Channels(visibility="
            r0.<init>(r1)
            boolean r1 = r2.f4406
            r0.append(r1)
            java.lang.String r1 = ", alpha="
            r0.append(r1)
            boolean r1 = r2.f4407
            r0.append(r1)
            java.lang.String r1 = ", color="
            r0.append(r1)
            java.lang.String r1 = ")"
            boolean r2 = r2.f4408
            java.lang.String r2 = p000.lz1.m3693(r0, r2, r1)
            return r2
    }
}
