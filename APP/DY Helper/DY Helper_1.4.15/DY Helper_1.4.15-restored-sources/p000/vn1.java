package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class vn1 {

    /* JADX INFO: renamed from: α */
    public final android.content.res.Resources f11353;

    /* JADX INFO: renamed from: β */
    public final android.content.res.Resources.Theme f11354;

    public vn1(android.content.res.Resources r1, android.content.res.Resources.Theme r2) {
            r0 = this;
            r0.<init>()
            r0.f11353 = r1
            r0.f11354 = r2
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L27
            java.lang.Class<vn1> r2 = p000.vn1.class
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L10
            goto L27
        L10:
            vn1 r5 = (p000.vn1) r5
            android.content.res.Resources r2 = r4.f11353
            android.content.res.Resources r3 = r5.f11353
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L27
            android.content.res.Resources$Theme r4 = r4.f11354
            android.content.res.Resources$Theme r5 = r5.f11354
            boolean r4 = java.util.Objects.equals(r4, r5)
            if (r4 == 0) goto L27
            return r0
        L27:
            return r1
    }

    public final int hashCode() {
            r1 = this;
            android.content.res.Resources r0 = r1.f11353
            android.content.res.Resources$Theme r1 = r1.f11354
            java.lang.Object[] r1 = new java.lang.Object[]{r0, r1}
            int r1 = java.util.Objects.hash(r1)
            return r1
    }
}
