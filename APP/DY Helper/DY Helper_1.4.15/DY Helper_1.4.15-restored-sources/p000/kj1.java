package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class kj1 {

    /* JADX INFO: renamed from: α */
    public final int f5949;

    /* JADX INFO: renamed from: β */
    public final int f5950;

    /* JADX INFO: renamed from: γ */
    public final long f5951;

    /* JADX INFO: renamed from: δ */
    public final long f5952;

    public kj1(int r1, int r2, long r3, long r5) {
            r0 = this;
            r0.<init>()
            r0.f5949 = r1
            r0.f5950 = r2
            r0.f5951 = r3
            r0.f5952 = r5
            return
    }

    /* JADX INFO: renamed from: α */
    public static p000.kj1 m3287(java.io.File r9) {
            java.io.DataInputStream r1 = new java.io.DataInputStream
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r9)
            r1.<init>(r0)
            kj1 r2 = new kj1     // Catch: java.lang.Throwable -> L23
            int r3 = r1.readInt()     // Catch: java.lang.Throwable -> L23
            int r4 = r1.readInt()     // Catch: java.lang.Throwable -> L23
            long r5 = r1.readLong()     // Catch: java.lang.Throwable -> L23
            long r7 = r1.readLong()     // Catch: java.lang.Throwable -> L23
            r2.<init>(r3, r4, r5, r7)     // Catch: java.lang.Throwable -> L23
            r1.close()
            return r2
        L23:
            r0 = move-exception
            r9 = r0
            r1.close()     // Catch: java.lang.Throwable -> L29
            goto L2d
        L29:
            r0 = move-exception
            r9.addSuppressed(r0)
        L2d:
            throw r9
    }

    public final boolean equals(java.lang.Object r7) {
            r6 = this;
            r0 = 1
            if (r6 != r7) goto L4
            return r0
        L4:
            r1 = 0
            if (r7 == 0) goto L2b
            boolean r2 = r7 instanceof p000.kj1
            if (r2 != 0) goto Lc
            goto L2b
        Lc:
            kj1 r7 = (p000.kj1) r7
            int r2 = r6.f5950
            int r3 = r7.f5950
            if (r2 != r3) goto L2b
            long r2 = r6.f5951
            long r4 = r7.f5951
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L2b
            int r2 = r6.f5949
            int r3 = r7.f5949
            if (r2 != r3) goto L2b
            long r2 = r6.f5952
            long r6 = r7.f5952
            int r6 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r6 != 0) goto L2b
            return r0
        L2b:
            return r1
    }

    public final int hashCode() {
            r5 = this;
            int r0 = r5.f5950
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            long r1 = r5.f5951
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            int r2 = r5.f5949
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            long r3 = r5.f5952
            java.lang.Long r5 = java.lang.Long.valueOf(r3)
            java.lang.Object[] r5 = new java.lang.Object[]{r0, r1, r2, r5}
            int r5 = java.util.Objects.hash(r5)
            return r5
    }

    /* JADX INFO: renamed from: β */
    public final void m3288(java.io.File r4) {
            r3 = this;
            r4.delete()
            java.io.DataOutputStream r0 = new java.io.DataOutputStream
            java.io.FileOutputStream r1 = new java.io.FileOutputStream
            r1.<init>(r4)
            r0.<init>(r1)
            int r4 = r3.f5949     // Catch: java.lang.Throwable -> L25
            r0.writeInt(r4)     // Catch: java.lang.Throwable -> L25
            int r4 = r3.f5950     // Catch: java.lang.Throwable -> L25
            r0.writeInt(r4)     // Catch: java.lang.Throwable -> L25
            long r1 = r3.f5951     // Catch: java.lang.Throwable -> L25
            r0.writeLong(r1)     // Catch: java.lang.Throwable -> L25
            long r3 = r3.f5952     // Catch: java.lang.Throwable -> L25
            r0.writeLong(r3)     // Catch: java.lang.Throwable -> L25
            r0.close()
            return
        L25:
            r3 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L2a
            goto L2e
        L2a:
            r4 = move-exception
            r3.addSuppressed(r4)
        L2e:
            throw r3
    }
}
