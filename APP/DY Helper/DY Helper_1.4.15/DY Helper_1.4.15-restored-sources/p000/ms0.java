package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class ms0 {

    /* JADX INFO: renamed from: α */
    public final android.view.SurfaceView f7262;

    /* JADX INFO: renamed from: β */
    public final android.graphics.Rect f7263;

    /* JADX INFO: renamed from: γ */
    public final android.graphics.Rect f7264;

    /* JADX INFO: renamed from: δ */
    public final int f7265;

    public ms0(android.view.SurfaceView r1, android.graphics.Rect r2, android.graphics.Rect r3, int r4) {
            r0 = this;
            r0.<init>()
            r0.f7262 = r1
            r0.f7263 = r2
            r0.f7264 = r3
            r0.f7265 = r4
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L33
        L3:
            boolean r0 = r3 instanceof p000.ms0
            if (r0 != 0) goto L8
            goto L31
        L8:
            ms0 r3 = (p000.ms0) r3
            android.view.SurfaceView r0 = r2.f7262
            android.view.SurfaceView r1 = r3.f7262
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L31
        L15:
            android.graphics.Rect r0 = r2.f7263
            android.graphics.Rect r1 = r3.f7263
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L20
            goto L31
        L20:
            android.graphics.Rect r0 = r2.f7264
            android.graphics.Rect r1 = r3.f7264
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2b
            goto L31
        L2b:
            int r2 = r2.f7265
            int r3 = r3.f7265
            if (r2 == r3) goto L33
        L31:
            r2 = 0
            return r2
        L33:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r2 = this;
            android.view.SurfaceView r0 = r2.f7262
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            android.graphics.Rect r1 = r2.f7263
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            android.graphics.Rect r0 = r2.f7264
            int r0 = r0.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r2 = r2.f7265
            int r2 = java.lang.Integer.hashCode(r2)
            int r2 = r2 + r0
            return r2
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "SurfaceCopyTarget(view="
            r0.<init>(r1)
            android.view.SurfaceView r1 = r2.f7262
            r0.append(r1)
            java.lang.String r1 = ", sourceRect="
            r0.append(r1)
            android.graphics.Rect r1 = r2.f7263
            r0.append(r1)
            java.lang.String r1 = ", destinationRect="
            r0.append(r1)
            android.graphics.Rect r1 = r2.f7264
            r0.append(r1)
            java.lang.String r1 = ", area="
            r0.append(r1)
            int r2 = r2.f7265
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
