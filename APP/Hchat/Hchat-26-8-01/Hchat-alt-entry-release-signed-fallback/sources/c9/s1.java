package c9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class s1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f1353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1354b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f1355c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f1356d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f1357e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.lang.String f1358f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f1359g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f1360h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.lang.String f1361i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final java.lang.String f1362j;

    public s1(java.lang.String r1, int r2, int r3, int r4, long r5, java.lang.String r7, int r8, long r9, java.lang.String r11, java.lang.String r12) {
            r0 = this;
            r0.<init>()
            r0.f1353a = r1
            r0.f1354b = r2
            r0.f1355c = r3
            r0.f1356d = r4
            r0.f1357e = r5
            r0.f1358f = r7
            r0.f1359g = r8
            r0.f1360h = r9
            r0.f1361i = r11
            r0.f1362j = r12
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            if (r4 != r5) goto L4
            goto L66
        L4:
            boolean r0 = r5 instanceof c9.s1
            if (r0 != 0) goto L9
            goto L64
        L9:
            c9.s1 r5 = (c9.s1) r5
            java.lang.String r0 = r4.f1353a
            java.lang.String r1 = r5.f1353a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L16
            goto L64
        L16:
            int r0 = r4.f1354b
            int r1 = r5.f1354b
            if (r0 == r1) goto L1d
            goto L64
        L1d:
            int r0 = r4.f1355c
            int r1 = r5.f1355c
            if (r0 == r1) goto L24
            goto L64
        L24:
            int r0 = r4.f1356d
            int r1 = r5.f1356d
            if (r0 == r1) goto L2b
            goto L64
        L2b:
            long r0 = r4.f1357e
            long r2 = r5.f1357e
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L34
            goto L64
        L34:
            java.lang.String r0 = r4.f1358f
            java.lang.String r1 = r5.f1358f
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L3f
            goto L64
        L3f:
            int r0 = r4.f1359g
            int r1 = r5.f1359g
            if (r0 == r1) goto L46
            goto L64
        L46:
            long r0 = r4.f1360h
            long r2 = r5.f1360h
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L4f
            goto L64
        L4f:
            java.lang.String r0 = r4.f1361i
            java.lang.String r1 = r5.f1361i
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L5a
            goto L64
        L5a:
            java.lang.String r0 = r4.f1362j
            java.lang.String r5 = r5.f1362j
            boolean r5 = r0.equals(r5)
            if (r5 != 0) goto L66
        L64:
            r5 = 0
            return r5
        L66:
            r5 = 1
            return r5
    }

    public final int hashCode() {
            r4 = this;
            java.lang.String r0 = r4.f1353a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            int r2 = r4.f1354b
            int r0 = eh.a.e(r2, r0, r1)
            int r2 = r4.f1355c
            int r0 = eh.a.e(r2, r0, r1)
            int r2 = r4.f1356d
            int r0 = eh.a.e(r2, r0, r1)
            long r2 = r4.f1357e
            int r0 = eh.a.f(r0, r1, r2)
            java.lang.String r2 = r4.f1358f
            int r0 = eh.a.g(r0, r1, r2)
            int r2 = r4.f1359g
            int r0 = eh.a.e(r2, r0, r1)
            long r2 = r4.f1360h
            int r0 = eh.a.f(r0, r1, r2)
            java.lang.String r2 = r4.f1361i
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r1 = r4.f1362j
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", unreadCount="
            java.lang.String r1 = ", status="
            int r2 = r5.f1354b
            java.lang.String r3 = "ConversationRecord(username="
            java.lang.String r4 = r5.f1353a
            java.lang.StringBuilder r0 = eh.a.u(r2, r3, r4, r0, r1)
            java.lang.String r1 = ", isSend="
            java.lang.String r2 = ", conversationTime="
            int r3 = r5.f1355c
            int r4 = r5.f1356d
            wb.en.p(r0, r3, r1, r4, r2)
            long r1 = r5.f1357e
            r0.append(r1)
            java.lang.String r1 = ", content="
            r0.append(r1)
            java.lang.String r1 = r5.f1358f
            r0.append(r1)
            java.lang.String r1 = ", messageType="
            r0.append(r1)
            int r1 = r5.f1359g
            r0.append(r1)
            java.lang.String r1 = ", flag="
            r0.append(r1)
            long r1 = r5.f1360h
            r0.append(r1)
            java.lang.String r1 = ", digest="
            r0.append(r1)
            java.lang.String r1 = r5.f1361i
            r0.append(r1)
            java.lang.String r1 = ", digestUser="
            r0.append(r1)
            java.lang.String r1 = r5.f1362j
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
