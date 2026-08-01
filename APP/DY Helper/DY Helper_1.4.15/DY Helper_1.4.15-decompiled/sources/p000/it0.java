package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class it0 {

    /* JADX INFO: renamed from: α */
    public final java.lang.String f5181;

    /* JADX INFO: renamed from: β */
    public final android.graphics.Bitmap f5182;

    public it0(java.lang.String r1, android.graphics.Bitmap r2) {
            r0 = this;
            r0.<init>()
            r0.f5181 = r1
            r0.f5182 = r2
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L21
        L3:
            boolean r0 = r3 instanceof p000.it0
            if (r0 != 0) goto L8
            goto L1f
        L8:
            it0 r3 = (p000.it0) r3
            java.lang.String r0 = r2.f5181
            java.lang.String r1 = r3.f5181
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L1f
        L15:
            android.graphics.Bitmap r2 = r2.f5182
            android.graphics.Bitmap r3 = r3.f5182
            boolean r2 = p000.ln0.m3626(r2, r3)
            if (r2 != 0) goto L21
        L1f:
            r2 = 0
            return r2
        L21:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r1 = this;
            java.lang.String r0 = r1.f5181
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            android.graphics.Bitmap r1 = r1.f5182
            if (r1 != 0) goto Le
            r1 = 0
            goto L12
        Le:
            int r1 = r1.hashCode()
        L12:
            int r0 = r0 + r1
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "IconCacheEntry(signature="
            r0.<init>(r1)
            java.lang.String r1 = r2.f5181
            r0.append(r1)
            java.lang.String r1 = ", bitmap="
            r0.append(r1)
            android.graphics.Bitmap r2 = r2.f5182
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
