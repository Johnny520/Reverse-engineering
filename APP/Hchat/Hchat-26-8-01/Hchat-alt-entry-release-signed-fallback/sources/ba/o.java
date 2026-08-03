package ba;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.graphics.Bitmap f619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f620b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final android.graphics.Rect f621c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f622d;

    public o(android.graphics.Bitmap r1, byte[] r2, android.graphics.Rect r3, int r4) {
            r0 = this;
            r0.<init>()
            r0.f619a = r1
            r0.f620b = r2
            r0.f621c = r3
            r0.f622d = r4
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L33
        L3:
            boolean r0 = r3 instanceof ba.o
            if (r0 != 0) goto L8
            goto L31
        L8:
            ba.o r3 = (ba.o) r3
            android.graphics.Bitmap r0 = r2.f619a
            android.graphics.Bitmap r1 = r3.f619a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L31
        L15:
            byte[] r0 = r2.f620b
            byte[] r1 = r3.f620b
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L20
            goto L31
        L20:
            android.graphics.Rect r0 = r2.f621c
            android.graphics.Rect r1 = r3.f621c
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L2b
            goto L31
        L2b:
            int r0 = r2.f622d
            int r3 = r3.f622d
            if (r0 == r3) goto L33
        L31:
            r3 = 0
            return r3
        L33:
            r3 = 1
            return r3
    }

    public final int hashCode() {
            r3 = this;
            android.graphics.Bitmap r0 = r3.f619a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            r1 = 0
            byte[] r2 = r3.f620b
            if (r2 != 0) goto Lf
            r2 = r1
            goto L13
        Lf:
            int r2 = java.util.Arrays.hashCode(r2)
        L13:
            int r0 = r0 + r2
            int r0 = r0 * 31
            android.graphics.Rect r2 = r3.f621c
            if (r2 != 0) goto L1b
            goto L1f
        L1b:
            int r1 = r2.hashCode()
        L1f:
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r3.f622d
            int r1 = java.lang.Integer.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r3 = this;
            byte[] r0 = r3.f620b
            java.lang.String r0 = java.util.Arrays.toString(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "BubbleAsset(bitmap="
            r1.<init>(r2)
            android.graphics.Bitmap r2 = r3.f619a
            r1.append(r2)
            java.lang.String r2 = ", ninePatchChunk="
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = ", padding="
            r1.append(r0)
            android.graphics.Rect r0 = r3.f621c
            r1.append(r0)
            java.lang.String r0 = ", textColor="
            r1.append(r0)
            int r0 = r3.f622d
            r1.append(r0)
            java.lang.String r0 = ")"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }
}
