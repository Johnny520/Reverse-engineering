package t3;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f13061b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f13062c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f13063d;

    public h(int r1, int r2, long r3, long r5) {
            r0 = this;
            r0.<init>()
            r0.f13060a = r1
            r0.f13061b = r2
            r0.f13062c = r3
            r0.f13063d = r5
            return
    }

    public static t3.h a(java.io.File r9) {
            java.io.DataInputStream r1 = new java.io.DataInputStream
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r9)
            r1.<init>(r0)
            t3.h r2 = new t3.h     // Catch: java.lang.Throwable -> L23
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

    public final void b(java.io.File r4) {
            r3 = this;
            r4.delete()
            java.io.DataOutputStream r0 = new java.io.DataOutputStream
            java.io.FileOutputStream r1 = new java.io.FileOutputStream
            r1.<init>(r4)
            r0.<init>(r1)
            int r4 = r3.f13060a     // Catch: java.lang.Throwable -> L25
            r0.writeInt(r4)     // Catch: java.lang.Throwable -> L25
            int r4 = r3.f13061b     // Catch: java.lang.Throwable -> L25
            r0.writeInt(r4)     // Catch: java.lang.Throwable -> L25
            long r1 = r3.f13062c     // Catch: java.lang.Throwable -> L25
            r0.writeLong(r1)     // Catch: java.lang.Throwable -> L25
            long r1 = r3.f13063d     // Catch: java.lang.Throwable -> L25
            r0.writeLong(r1)     // Catch: java.lang.Throwable -> L25
            r0.close()
            return
        L25:
            r4 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L2a
            goto L2e
        L2a:
            r0 = move-exception
            r4.addSuppressed(r0)
        L2e:
            throw r4
    }

    public final boolean equals(java.lang.Object r7) {
            r6 = this;
            r0 = 1
            if (r6 != r7) goto L4
            return r0
        L4:
            r1 = 0
            if (r7 == 0) goto L2b
            boolean r2 = r7 instanceof t3.h
            if (r2 != 0) goto Lc
            goto L2b
        Lc:
            t3.h r7 = (t3.h) r7
            int r2 = r6.f13061b
            int r3 = r7.f13061b
            if (r2 != r3) goto L2b
            long r2 = r6.f13062c
            long r4 = r7.f13062c
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L2b
            int r2 = r6.f13060a
            int r3 = r7.f13060a
            if (r2 != r3) goto L2b
            long r2 = r6.f13063d
            long r4 = r7.f13063d
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 != 0) goto L2b
            return r0
        L2b:
            return r1
    }

    public final int hashCode() {
            r5 = this;
            int r0 = r5.f13061b
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            long r1 = r5.f13062c
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            int r2 = r5.f13060a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            long r3 = r5.f13063d
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r1, r2, r3}
            int r0 = java.util.Objects.hash(r0)
            return r0
    }
}
