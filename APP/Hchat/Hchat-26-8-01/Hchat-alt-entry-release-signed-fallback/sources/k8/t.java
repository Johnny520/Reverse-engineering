package k8;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f7472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f7473b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f7474c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f7475d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f7476e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.lang.String f7477f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f7478g;

    public t(int r1, int r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, long r6, int r8) {
            r0 = this;
            r5.getClass()
            r0.<init>()
            r0.f7472a = r6
            r0.f7473b = r3
            r0.f7474c = r4
            r0.f7475d = r1
            r0.f7476e = r2
            r0.f7477f = r5
            r0.f7478g = r8
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            if (r4 != r5) goto L3
            goto L4a
        L3:
            boolean r0 = r5 instanceof k8.t
            if (r0 != 0) goto L8
            goto L48
        L8:
            k8.t r5 = (k8.t) r5
            long r0 = r4.f7472a
            long r2 = r5.f7472a
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L13
            goto L48
        L13:
            java.lang.String r0 = r4.f7473b
            java.lang.String r1 = r5.f7473b
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1e
            goto L48
        L1e:
            java.lang.String r0 = r4.f7474c
            java.lang.String r1 = r5.f7474c
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L29
            goto L48
        L29:
            int r0 = r4.f7475d
            int r1 = r5.f7475d
            if (r0 == r1) goto L30
            goto L48
        L30:
            int r0 = r4.f7476e
            int r1 = r5.f7476e
            if (r0 == r1) goto L37
            goto L48
        L37:
            java.lang.String r0 = r4.f7477f
            java.lang.String r1 = r5.f7477f
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L42
            goto L48
        L42:
            int r0 = r4.f7478g
            int r5 = r5.f7478g
            if (r0 == r5) goto L4a
        L48:
            r5 = 0
            return r5
        L4a:
            r5 = 1
            return r5
    }

    public final int hashCode() {
            r3 = this;
            long r0 = r3.f7472a
            int r0 = java.lang.Long.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.f7473b
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r2 = r3.f7474c
            int r0 = eh.a.g(r0, r1, r2)
            int r2 = r3.f7475d
            int r0 = eh.a.e(r2, r0, r1)
            int r2 = r3.f7476e
            int r0 = eh.a.e(r2, r0, r1)
            java.lang.String r2 = r3.f7477f
            int r0 = eh.a.g(r0, r1, r2)
            int r1 = r3.f7478g
            int r1 = java.lang.Integer.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "WeChatRetransmitPayload(msgId="
            r0.<init>(r1)
            long r1 = r3.f7472a
            r0.append(r1)
            java.lang.String r1 = ", sourceTalker="
            r0.append(r1)
            java.lang.String r1 = r3.f7473b
            r0.append(r1)
            java.lang.String r1 = ", content="
            r0.append(r1)
            java.lang.String r1 = r3.f7474c
            r0.append(r1)
            java.lang.String r1 = ", retrType="
            r0.append(r1)
            int r1 = r3.f7475d
            r0.append(r1)
            java.lang.String r1 = ", msgFromScene="
            r0.append(r1)
            int r1 = r3.f7476e
            r0.append(r1)
            java.lang.String r1 = ", fileName="
            r0.append(r1)
            java.lang.String r1 = r3.f7477f
            r0.append(r1)
            java.lang.String r1 = ", length="
            r0.append(r1)
            int r1 = r3.f7478g
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
