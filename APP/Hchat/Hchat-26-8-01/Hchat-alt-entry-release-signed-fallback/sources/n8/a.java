package n8;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f9049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f9050b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f9051c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.String f9052d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f9053e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.lang.String f9054f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f9055g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.String f9056h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f9057i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final java.lang.String f9058j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final java.lang.String f9059k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final java.lang.String f9060l;

    public a(java.lang.String r1, java.lang.String r2, int r3, java.lang.String r4, int r5, int r6, java.lang.String r7, long r8, java.lang.String r10) {
            r0 = this;
            r0.<init>()
            r0.f9049a = r1
            r0.f9050b = r2
            r0.f9051c = r3
            r0.f9052d = r4
            r0.f9053e = r5
            java.lang.String r1 = ""
            r0.f9054f = r1
            r0.f9055g = r6
            r0.f9056h = r7
            r0.f9057i = r8
            r0.f9058j = r1
            r0.f9059k = r10
            r0.f9060l = r1
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            if (r4 != r5) goto L4
            goto L84
        L4:
            boolean r0 = r5 instanceof n8.a
            if (r0 != 0) goto La
            goto L82
        La:
            n8.a r5 = (n8.a) r5
            java.lang.String r0 = r4.f9049a
            java.lang.String r1 = r5.f9049a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L18
            goto L82
        L18:
            java.lang.String r0 = r4.f9050b
            java.lang.String r1 = r5.f9050b
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L23
            goto L82
        L23:
            int r0 = r4.f9051c
            int r1 = r5.f9051c
            if (r0 == r1) goto L2a
            goto L82
        L2a:
            java.lang.String r0 = r4.f9052d
            java.lang.String r1 = r5.f9052d
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L35
            goto L82
        L35:
            int r0 = r4.f9053e
            int r1 = r5.f9053e
            if (r0 == r1) goto L3c
            goto L82
        L3c:
            java.lang.String r0 = r4.f9054f
            java.lang.String r1 = r5.f9054f
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L47
            goto L82
        L47:
            int r0 = r4.f9055g
            int r1 = r5.f9055g
            if (r0 == r1) goto L4e
            goto L82
        L4e:
            java.lang.String r0 = r4.f9056h
            java.lang.String r1 = r5.f9056h
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L59
            goto L82
        L59:
            long r0 = r4.f9057i
            long r2 = r5.f9057i
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L62
            goto L82
        L62:
            java.lang.String r0 = r4.f9058j
            java.lang.String r1 = r5.f9058j
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L6d
            goto L82
        L6d:
            java.lang.String r0 = r4.f9059k
            java.lang.String r1 = r5.f9059k
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L78
            goto L82
        L78:
            java.lang.String r0 = r4.f9060l
            java.lang.String r5 = r5.f9060l
            boolean r5 = r0.equals(r5)
            if (r5 != 0) goto L84
        L82:
            r5 = 0
            return r5
        L84:
            r5 = 1
            return r5
    }

    public final int hashCode() {
            r4 = this;
            java.lang.String r0 = r4.f9049a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r4.f9050b
            int r0 = eh.a.g(r0, r1, r2)
            int r2 = r4.f9051c
            int r0 = eh.a.e(r2, r0, r1)
            java.lang.String r2 = r4.f9052d
            int r0 = eh.a.g(r0, r1, r2)
            int r2 = r4.f9053e
            int r0 = eh.a.e(r2, r0, r1)
            java.lang.String r2 = r4.f9054f
            int r0 = eh.a.g(r0, r1, r2)
            int r2 = r4.f9055g
            int r0 = eh.a.e(r2, r0, r1)
            java.lang.String r2 = r4.f9056h
            int r0 = eh.a.g(r0, r1, r2)
            long r2 = r4.f9057i
            int r0 = eh.a.f(r0, r1, r2)
            java.lang.String r2 = r4.f9058j
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r2 = r4.f9059k
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r2 = r4.f9060l
            int r0 = eh.a.g(r0, r1, r2)
            return r0
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", transId="
            java.lang.String r1 = ", totalFee="
            java.lang.String r2 = "TransferOperationParams(transactionId="
            java.lang.String r3 = r5.f9049a
            java.lang.String r4 = r5.f9050b
            java.lang.StringBuilder r0 = bc.e.p(r2, r3, r0, r4, r1)
            int r1 = r5.f9051c
            r0.append(r1)
            java.lang.String r1 = ", username="
            r0.append(r1)
            java.lang.String r1 = r5.f9052d
            r0.append(r1)
            java.lang.String r1 = ", invalidTime="
            r0.append(r1)
            int r1 = r5.f9053e
            r0.append(r1)
            java.lang.String r1 = ", groupUsername="
            r0.append(r1)
            java.lang.String r1 = r5.f9054f
            r0.append(r1)
            java.lang.String r1 = ", recvAccountType="
            r0.append(r1)
            int r1 = r5.f9055g
            r0.append(r1)
            java.lang.String r1 = ", bindSerial="
            r0.append(r1)
            java.lang.String r1 = r5.f9056h
            r0.append(r1)
            java.lang.String r1 = ", subRecvChannelId="
            r0.append(r1)
            long r1 = r5.f9057i
            r0.append(r1)
            java.lang.String r1 = ", leftButtonContinue="
            r0.append(r1)
            java.lang.String r1 = r5.f9058j
            r0.append(r1)
            java.lang.String r1 = ", transferAttach="
            java.lang.String r2 = ", displayName="
            java.lang.String r3 = r5.f9059k
            java.lang.String r4 = r5.f9060l
            j8.b.t(r0, r1, r3, r2, r4)
            java.lang.String r1 = ", subTitleClicked=null)"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
