package defpackage;

/* JADX INFO: renamed from: ᛳᛲᛴᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0418 {

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final long f2097;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final long f2098;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final int f2099;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final int f2100;

    public C0418(int r1, int r2, long r3, long r5) {
            r0 = this;
            r0.<init>()
            r0.f2099 = r1
            r0.f2100 = r2
            r0.f2098 = r3
            r0.f2097 = r5
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static defpackage.C0418 m1172(java.io.File r9) {
            java.io.DataInputStream r1 = new java.io.DataInputStream
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r9)
            r1.<init>(r0)
            ᛳᛲᛴᛳ r2 = new ᛳᛲᛴᛳ     // Catch: java.lang.Throwable -> L23
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
            boolean r2 = r7 instanceof defpackage.C0418
            if (r2 != 0) goto Lc
            goto L2b
        Lc:
            ᛳᛲᛴᛳ r7 = (defpackage.C0418) r7
            int r2 = r6.f2100
            int r3 = r7.f2100
            if (r2 != r3) goto L2b
            long r2 = r6.f2098
            long r4 = r7.f2098
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L2b
            int r2 = r6.f2099
            int r3 = r7.f2099
            if (r2 != r3) goto L2b
            long r2 = r6.f2097
            long r6 = r7.f2097
            int r6 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r6 != 0) goto L2b
            return r0
        L2b:
            return r1
    }

    public final int hashCode() {
            r5 = this;
            int r0 = r5.f2100
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            long r1 = r5.f2098
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            int r2 = r5.f2099
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            long r3 = r5.f2097
            java.lang.Long r5 = java.lang.Long.valueOf(r3)
            java.lang.Object[] r5 = new java.lang.Object[]{r0, r1, r2, r5}
            int r5 = java.util.Objects.hash(r5)
            return r5
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final void m1173(java.io.File r4) {
            r3 = this;
            r4.delete()
            java.io.DataOutputStream r0 = new java.io.DataOutputStream
            java.io.FileOutputStream r1 = new java.io.FileOutputStream
            r1.<init>(r4)
            r0.<init>(r1)
            int r4 = r3.f2099     // Catch: java.lang.Throwable -> L25
            r0.writeInt(r4)     // Catch: java.lang.Throwable -> L25
            int r4 = r3.f2100     // Catch: java.lang.Throwable -> L25
            r0.writeInt(r4)     // Catch: java.lang.Throwable -> L25
            long r1 = r3.f2098     // Catch: java.lang.Throwable -> L25
            r0.writeLong(r1)     // Catch: java.lang.Throwable -> L25
            long r3 = r3.f2097     // Catch: java.lang.Throwable -> L25
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
