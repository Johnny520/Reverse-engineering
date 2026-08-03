package e9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f2436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f2437b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f2438c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final android.graphics.Bitmap f2439d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f2440e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f2441f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f2442g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final android.app.PendingIntent f2443h;

    public l(java.lang.String r2, java.lang.String r3, int r4, android.graphics.Bitmap r5, long r6, long r8, long r10, android.app.PendingIntent r12, int r13) {
            r1 = this;
            r0 = r13 & 32
            if (r0 == 0) goto L6
            r8 = 0
        L6:
            r13 = r13 & 128(0x80, float:1.8E-43)
            if (r13 == 0) goto Lb
            r12 = 0
        Lb:
            r2.getClass()
            r1.<init>()
            r1.f2436a = r2
            r1.f2437b = r3
            r1.f2438c = r4
            r1.f2439d = r5
            r1.f2440e = r6
            r1.f2441f = r8
            r1.f2442g = r10
            r1.f2443h = r12
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            if (r4 != r5) goto L3
            goto L59
        L3:
            boolean r0 = r5 instanceof e9.l
            if (r0 != 0) goto L8
            goto L57
        L8:
            e9.l r5 = (e9.l) r5
            java.lang.String r0 = r4.f2436a
            java.lang.String r1 = r5.f2436a
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L15
            goto L57
        L15:
            java.lang.String r0 = r4.f2437b
            java.lang.String r1 = r5.f2437b
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L20
            goto L57
        L20:
            int r0 = r4.f2438c
            int r1 = r5.f2438c
            if (r0 == r1) goto L27
            goto L57
        L27:
            android.graphics.Bitmap r0 = r4.f2439d
            android.graphics.Bitmap r1 = r5.f2439d
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L32
            goto L57
        L32:
            long r0 = r4.f2440e
            long r2 = r5.f2440e
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L3b
            goto L57
        L3b:
            long r0 = r4.f2441f
            long r2 = r5.f2441f
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L44
            goto L57
        L44:
            long r0 = r4.f2442g
            long r2 = r5.f2442g
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L4d
            goto L57
        L4d:
            android.app.PendingIntent r0 = r4.f2443h
            android.app.PendingIntent r5 = r5.f2443h
            boolean r5 = gg.l.a(r0, r5)
            if (r5 != 0) goto L59
        L57:
            r5 = 0
            return r5
        L59:
            r5 = 1
            return r5
    }

    public final int hashCode() {
            r5 = this;
            java.lang.String r0 = r5.f2436a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r5.f2437b
            int r0 = eh.a.g(r0, r1, r2)
            int r2 = r5.f2438c
            int r0 = eh.a.e(r2, r0, r1)
            r2 = 0
            android.graphics.Bitmap r3 = r5.f2439d
            if (r3 != 0) goto L1c
            r3 = r2
            goto L20
        L1c:
            int r3 = r3.hashCode()
        L20:
            int r0 = r0 + r3
            int r0 = r0 * r1
            long r3 = r5.f2440e
            int r0 = eh.a.f(r0, r1, r3)
            long r3 = r5.f2441f
            int r0 = eh.a.f(r0, r1, r3)
            long r3 = r5.f2442g
            int r0 = eh.a.f(r0, r1, r3)
            android.app.PendingIntent r1 = r5.f2443h
            if (r1 != 0) goto L39
            goto L3d
        L39:
            int r2 = r1.hashCode()
        L3d:
            int r0 = r0 + r2
            return r0
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", text="
            java.lang.String r1 = ", unreadCount="
            java.lang.String r2 = "NotifyPayload(title="
            java.lang.String r3 = r5.f2436a
            java.lang.String r4 = r5.f2437b
            java.lang.StringBuilder r0 = bc.e.p(r2, r3, r0, r4, r1)
            int r1 = r5.f2438c
            r0.append(r1)
            java.lang.String r1 = ", largeIcon="
            r0.append(r1)
            android.graphics.Bitmap r1 = r5.f2439d
            r0.append(r1)
            java.lang.String r1 = ", whenMillis="
            r0.append(r1)
            long r1 = r5.f2440e
            r0.append(r1)
            java.lang.String r1 = ", msgId="
            java.lang.String r2 = ", msgSvrId="
            long r3 = r5.f2441f
            j8.b.s(r0, r1, r3, r2)
            long r1 = r5.f2442g
            r0.append(r1)
            java.lang.String r1 = ", contentIntent="
            r0.append(r1)
            android.app.PendingIntent r1 = r5.f2443h
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
