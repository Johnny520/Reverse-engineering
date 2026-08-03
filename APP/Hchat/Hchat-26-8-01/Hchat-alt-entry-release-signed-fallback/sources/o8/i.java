package o8;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f9598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final android.app.PendingIntent f9599b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ca.r f9600c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final db.d f9601d;

    public i(long r1, android.app.PendingIntent r3, ca.r r4, db.d r5) {
            r0 = this;
            r0.<init>()
            r0.f9598a = r1
            r0.f9599b = r3
            r0.f9600c = r4
            r0.f9601d = r5
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            if (r4 != r5) goto L3
            goto L35
        L3:
            boolean r0 = r5 instanceof o8.i
            if (r0 != 0) goto L8
            goto L33
        L8:
            o8.i r5 = (o8.i) r5
            long r0 = r4.f9598a
            long r2 = r5.f9598a
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L13
            goto L33
        L13:
            android.app.PendingIntent r0 = r4.f9599b
            android.app.PendingIntent r1 = r5.f9599b
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1e
            goto L33
        L1e:
            ca.r r0 = r4.f9600c
            ca.r r1 = r5.f9600c
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L29
            goto L33
        L29:
            db.d r0 = r4.f9601d
            db.d r5 = r5.f9601d
            boolean r5 = r0.equals(r5)
            if (r5 != 0) goto L35
        L33:
            r5 = 0
            return r5
        L35:
            r5 = 1
            return r5
    }

    public final int hashCode() {
            r2 = this;
            long r0 = r2.f9598a
            int r0 = java.lang.Long.hashCode(r0)
            int r0 = r0 * 31
            android.app.PendingIntent r1 = r2.f9599b
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            ca.r r0 = r2.f9600c
            int r0 = r0.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            db.d r1 = r2.f9601d
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ExactTask(token="
            r0.<init>(r1)
            long r1 = r3.f9598a
            r0.append(r1)
            java.lang.String r1 = ", pendingIntent="
            r0.append(r1)
            android.app.PendingIntent r1 = r3.f9599b
            r0.append(r1)
            java.lang.String r1 = ", fallback="
            r0.append(r1)
            ca.r r1 = r3.f9600c
            r0.append(r1)
            java.lang.String r1 = ", runnable="
            r0.append(r1)
            db.d r1 = r3.f9601d
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
