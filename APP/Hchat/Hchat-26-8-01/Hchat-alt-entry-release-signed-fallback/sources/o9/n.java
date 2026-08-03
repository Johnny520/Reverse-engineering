package o9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f9649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f9650b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f9651c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.String f9652d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.String f9653e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.lang.String f9654f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.lang.String f9655g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.String f9656h;

    public n(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r3.getClass()
            r7.getClass()
            r0.<init>()
            r0.f9649a = r1
            r0.f9650b = r2
            r0.f9651c = r3
            r0.f9652d = r4
            r0.f9653e = r5
            r0.f9654f = r6
            r0.f9655g = r7
            r0.f9656h = r8
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L63
        L3:
            boolean r0 = r3 instanceof o9.n
            if (r0 != 0) goto L8
            goto L61
        L8:
            o9.n r3 = (o9.n) r3
            java.lang.String r0 = r2.f9649a
            java.lang.String r1 = r3.f9649a
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L15
            goto L61
        L15:
            java.lang.String r0 = r2.f9650b
            java.lang.String r1 = r3.f9650b
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L20
            goto L61
        L20:
            java.lang.String r0 = r2.f9651c
            java.lang.String r1 = r3.f9651c
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L2b
            goto L61
        L2b:
            java.lang.String r0 = r2.f9652d
            java.lang.String r1 = r3.f9652d
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L36
            goto L61
        L36:
            java.lang.String r0 = r2.f9653e
            java.lang.String r1 = r3.f9653e
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L41
            goto L61
        L41:
            java.lang.String r0 = r2.f9654f
            java.lang.String r1 = r3.f9654f
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L4c
            goto L61
        L4c:
            java.lang.String r0 = r2.f9655g
            java.lang.String r1 = r3.f9655g
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L57
            goto L61
        L57:
            java.lang.String r0 = r2.f9656h
            java.lang.String r3 = r3.f9656h
            boolean r3 = r0.equals(r3)
            if (r3 != 0) goto L63
        L61:
            r3 = 0
            return r3
        L63:
            r3 = 1
            return r3
    }

    public final int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.f9649a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.f9650b
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r2 = r3.f9651c
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r2 = r3.f9652d
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r2 = r3.f9653e
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r2 = r3.f9654f
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r2 = r3.f9655g
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r1 = r3.f9656h
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", userName="
            java.lang.String r1 = ", groupNickname="
            java.lang.String r2 = "ReplyVariables(userWxid="
            java.lang.String r3 = r5.f9649a
            java.lang.String r4 = r5.f9650b
            java.lang.StringBuilder r0 = bc.e.p(r2, r3, r0, r4, r1)
            java.lang.String r1 = ", realNameTail="
            java.lang.String r2 = ", gender="
            java.lang.String r3 = r5.f9651c
            java.lang.String r4 = r5.f9652d
            j8.b.t(r0, r3, r1, r4, r2)
            java.lang.String r1 = ", region="
            java.lang.String r2 = ", groupName="
            java.lang.String r3 = r5.f9653e
            java.lang.String r4 = r5.f9654f
            j8.b.t(r0, r3, r1, r4, r2)
            java.lang.String r1 = ", time="
            java.lang.String r2 = ")"
            java.lang.String r3 = r5.f9655g
            java.lang.String r4 = r5.f9656h
            java.lang.String r0 = j8.b.k(r0, r3, r1, r4, r2)
            return r0
    }
}
