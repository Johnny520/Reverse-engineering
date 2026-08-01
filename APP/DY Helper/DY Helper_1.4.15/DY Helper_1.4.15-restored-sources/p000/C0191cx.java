package p000;

/* JADX INFO: renamed from: cx */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0191cx {

    /* JADX INFO: renamed from: α */
    public final java.lang.String f2791;

    public C0191cx(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            r0.f2791 = r1
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L3
            goto L16
        L3:
            boolean r0 = r2 instanceof p000.C0191cx
            if (r0 != 0) goto L8
            goto L14
        L8:
            cx r2 = (p000.C0191cx) r2
            java.lang.String r1 = r1.f2791
            java.lang.String r2 = r2.f2791
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L16
        L14:
            r1 = 0
            return r1
        L16:
            r1 = 1
            return r1
    }

    public final int hashCode() {
            r0 = this;
            java.lang.String r0 = r0.f2791
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "DyDexClassRef(className="
            java.lang.String r1 = ")"
            java.lang.String r2 = r2.f2791
            java.lang.String r2 = p000.lz1.m3674(r0, r2, r1)
            return r2
    }
}
