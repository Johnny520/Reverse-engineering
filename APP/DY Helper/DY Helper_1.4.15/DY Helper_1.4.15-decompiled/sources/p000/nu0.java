package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class nu0 {

    /* JADX INFO: renamed from: α */
    public final p000.ou0 f7754;

    public nu0(p000.ou0 r1) {
            r0 = this;
            r0.<init>()
            r0.f7754 = r1
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L3
            goto L12
        L3:
            boolean r0 = r2 instanceof p000.nu0
            if (r0 != 0) goto L8
            goto L10
        L8:
            nu0 r2 = (p000.nu0) r2
            ou0 r1 = r1.f7754
            ou0 r2 = r2.f7754
            if (r1 == r2) goto L12
        L10:
            r1 = 0
            return r1
        L12:
            r1 = 1
            return r1
    }

    public final int hashCode() {
            r0 = this;
            ou0 r0 = r0.f7754
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "MotionPhotoBuildOptions(format="
            r0.<init>(r1)
            ou0 r2 = r2.f7754
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
