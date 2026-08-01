package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class oy {
    public final int a;
    public final int b;
    public final long c;
    public final long d;

    public oy(int r1, int r2, long r3, long r5) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r5
            return
    }

    public static defpackage.oy a(java.io.File r9) {
            java.io.DataInputStream r1 = new java.io.DataInputStream
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r9)
            r1.<init>(r0)
            oy r2 = new oy     // Catch: java.lang.Throwable -> L23
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
            int r4 = r3.a     // Catch: java.lang.Throwable -> L25
            r0.writeInt(r4)     // Catch: java.lang.Throwable -> L25
            int r4 = r3.b     // Catch: java.lang.Throwable -> L25
            r0.writeInt(r4)     // Catch: java.lang.Throwable -> L25
            long r1 = r3.c     // Catch: java.lang.Throwable -> L25
            r0.writeLong(r1)     // Catch: java.lang.Throwable -> L25
            long r1 = r3.d     // Catch: java.lang.Throwable -> L25
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
            boolean r2 = r7 instanceof defpackage.oy
            if (r2 != 0) goto Lc
            goto L2b
        Lc:
            oy r7 = (defpackage.oy) r7
            int r2 = r6.b
            int r3 = r7.b
            if (r2 != r3) goto L2b
            long r2 = r6.c
            long r4 = r7.c
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L2b
            int r2 = r6.a
            int r3 = r7.a
            if (r2 != r3) goto L2b
            long r2 = r6.d
            long r4 = r7.d
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 != 0) goto L2b
            return r0
        L2b:
            return r1
    }

    public final int hashCode() {
            r5 = this;
            int r0 = r5.b
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            long r1 = r5.c
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            int r2 = r5.a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            long r3 = r5.d
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r1, r2, r3}
            int r0 = java.util.Objects.hash(r0)
            return r0
    }
}
