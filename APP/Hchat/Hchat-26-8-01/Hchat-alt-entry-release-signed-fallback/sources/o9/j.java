package o9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f9638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f9639b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f9640c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.String f9641d;

    public j(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            r0 = this;
            r4.getClass()
            r0.<init>()
            r0.f9638a = r1
            r0.f9639b = r2
            r0.f9640c = r3
            r0.f9641d = r4
            return
    }

    public final java.lang.String a() {
            r8 = this;
            java.lang.String r0 = r8.f9640c
            boolean r1 = og.m.t0(r0)
            r2 = 0
            r3 = 1
            java.lang.String r4 = r8.f9641d
            if (r1 != 0) goto L14
            boolean r1 = r0.equals(r4)
            if (r1 != 0) goto L14
            r1 = r3
            goto L15
        L14:
            r1 = r2
        L15:
            r5 = 0
            if (r1 == 0) goto L19
            goto L1a
        L19:
            r0 = r5
        L1a:
            java.lang.String r1 = ""
            if (r0 != 0) goto L1f
            r0 = r1
        L1f:
            java.lang.String r6 = r8.f9638a
            boolean r7 = og.m.t0(r6)
            if (r7 != 0) goto L2e
            boolean r7 = r6.equals(r4)
            if (r7 != 0) goto L2e
            r2 = r3
        L2e:
            if (r2 == 0) goto L31
            r5 = r6
        L31:
            if (r5 != 0) goto L34
            goto L35
        L34:
            r1 = r5
        L35:
            boolean r2 = og.m.t0(r0)
            if (r2 == 0) goto L4c
            boolean r0 = og.m.t0(r1)
            if (r0 == 0) goto L4b
            java.lang.String r0 = r8.f9639b
            boolean r1 = og.m.t0(r0)
            if (r1 == 0) goto L4a
            return r4
        L4a:
            return r0
        L4b:
            return r1
        L4c:
            return r0
    }

    public final java.lang.String b() {
            r4 = this;
            java.lang.String r0 = r4.f9638a
            boolean r1 = og.m.t0(r0)
            java.lang.String r2 = r4.f9640c
            java.lang.String r3 = r4.f9641d
            if (r1 != 0) goto L1a
            boolean r1 = r0.equals(r3)
            if (r1 != 0) goto L1a
            boolean r1 = r0.equals(r2)
            if (r1 != 0) goto L1a
            r1 = 1
            goto L1b
        L1a:
            r1 = 0
        L1b:
            if (r1 == 0) goto L1e
            goto L1f
        L1e:
            r0 = 0
        L1f:
            if (r0 != 0) goto L23
            java.lang.String r0 = ""
        L23:
            boolean r1 = og.m.t0(r0)
            if (r1 == 0) goto L39
            java.lang.String r0 = r4.f9639b
            boolean r1 = og.m.t0(r0)
            if (r1 == 0) goto L39
            boolean r0 = og.m.t0(r2)
            if (r0 == 0) goto L38
            return r3
        L38:
            return r2
        L39:
            return r0
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L37
        L3:
            boolean r0 = r3 instanceof o9.j
            if (r0 != 0) goto L8
            goto L35
        L8:
            o9.j r3 = (o9.j) r3
            java.lang.String r0 = r2.f9638a
            java.lang.String r1 = r3.f9638a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L35
        L15:
            java.lang.String r0 = r2.f9639b
            java.lang.String r1 = r3.f9639b
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L20
            goto L35
        L20:
            java.lang.String r0 = r2.f9640c
            java.lang.String r1 = r3.f9640c
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2b
            goto L35
        L2b:
            java.lang.String r0 = r2.f9641d
            java.lang.String r3 = r3.f9641d
            boolean r3 = gg.l.a(r0, r3)
            if (r3 != 0) goto L37
        L35:
            r3 = 0
            return r3
        L37:
            r3 = 1
            return r3
    }

    public final int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.f9638a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.f9639b
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r2 = r3.f9640c
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r1 = r3.f9641d
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", wechatNick="
            java.lang.String r1 = ", remarkName="
            java.lang.String r2 = "MemberDisplay(groupNick="
            java.lang.String r3 = r5.f9638a
            java.lang.String r4 = r5.f9639b
            java.lang.StringBuilder r0 = bc.e.p(r2, r3, r0, r4, r1)
            java.lang.String r1 = ", memberId="
            java.lang.String r2 = ")"
            java.lang.String r3 = r5.f9640c
            java.lang.String r4 = r5.f9641d
            java.lang.String r0 = j8.b.k(r0, r3, r1, r4, r2)
            return r0
    }
}
