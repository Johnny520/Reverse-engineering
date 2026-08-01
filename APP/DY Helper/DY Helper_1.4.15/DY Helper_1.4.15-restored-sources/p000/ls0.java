package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class ls0 {

    /* JADX INFO: renamed from: α */
    public final int f6764;

    /* JADX INFO: renamed from: β */
    public final android.graphics.Bitmap f6765;

    public ls0(int r1, android.graphics.Bitmap r2) {
            r0 = this;
            r2.getClass()
            r0.<init>()
            r0.f6764 = r1
            r0.f6765 = r2
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p000.ls0
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            ls0 r5 = (p000.ls0) r5
            int r1 = r4.f6764
            int r3 = r5.f6764
            if (r1 == r3) goto L13
            return r2
        L13:
            android.graphics.Bitmap r4 = r4.f6765
            android.graphics.Bitmap r5 = r5.f6765
            boolean r4 = p000.ln0.m3626(r4, r5)
            if (r4 != 0) goto L1e
            return r2
        L1e:
            return r0
    }

    public final int hashCode() {
            r1 = this;
            int r0 = r1.f6764
            int r0 = java.lang.Integer.hashCode(r0)
            int r0 = r0 * 31
            android.graphics.Bitmap r1 = r1.f6765
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "BufferTarget(index="
            r0.<init>(r1)
            int r1 = r2.f6764
            r0.append(r1)
            java.lang.String r1 = ", bitmap="
            r0.append(r1)
            android.graphics.Bitmap r2 = r2.f6765
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
