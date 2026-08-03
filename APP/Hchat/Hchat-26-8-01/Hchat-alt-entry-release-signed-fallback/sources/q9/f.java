package q9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f10749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f10750b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f10751c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.String f10752d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.String f10753e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.lang.String f10754f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.lang.String f10755g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.String f10756h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.lang.String f10757i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final java.lang.String f10758j;

    public f(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10) {
            r0 = this;
            r1.getClass()
            r9.getClass()
            r0.<init>()
            r0.f10749a = r1
            r0.f10750b = r2
            r0.f10751c = r3
            r0.f10752d = r4
            r0.f10753e = r5
            r0.f10754f = r6
            r0.f10755g = r7
            r0.f10756h = r8
            r0.f10757i = r9
            r0.f10758j = r10
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L4
            goto L7b
        L4:
            boolean r0 = r3 instanceof q9.f
            if (r0 != 0) goto La
            goto L79
        La:
            q9.f r3 = (q9.f) r3
            java.lang.String r0 = r2.f10749a
            java.lang.String r1 = r3.f10749a
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L17
            goto L79
        L17:
            java.lang.String r0 = r2.f10750b
            java.lang.String r1 = r3.f10750b
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L22
            goto L79
        L22:
            java.lang.String r0 = r2.f10751c
            java.lang.String r1 = r3.f10751c
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2d
            goto L79
        L2d:
            java.lang.String r0 = r2.f10752d
            java.lang.String r1 = r3.f10752d
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L38
            goto L79
        L38:
            java.lang.String r0 = r2.f10753e
            java.lang.String r1 = r3.f10753e
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L43
            goto L79
        L43:
            java.lang.String r0 = r2.f10754f
            java.lang.String r1 = r3.f10754f
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L4e
            goto L79
        L4e:
            java.lang.String r0 = r2.f10755g
            java.lang.String r1 = r3.f10755g
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L59
            goto L79
        L59:
            java.lang.String r0 = r2.f10756h
            java.lang.String r1 = r3.f10756h
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L64
            goto L79
        L64:
            java.lang.String r0 = r2.f10757i
            java.lang.String r1 = r3.f10757i
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L6f
            goto L79
        L6f:
            java.lang.String r0 = r2.f10758j
            java.lang.String r3 = r3.f10758j
            boolean r3 = r0.equals(r3)
            if (r3 != 0) goto L7b
        L79:
            r3 = 0
            return r3
        L7b:
            r3 = 1
            return r3
    }

    public final int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.f10749a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.f10750b
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r2 = r3.f10751c
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r2 = r3.f10752d
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r2 = r3.f10753e
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r2 = r3.f10754f
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r2 = r3.f10755g
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r2 = r3.f10756h
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r2 = r3.f10757i
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r1 = r3.f10758j
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", userName="
            java.lang.String r1 = ", groupNickname="
            java.lang.String r2 = "ReplyVariables(userWxid="
            java.lang.String r3 = r5.f10749a
            java.lang.String r4 = r5.f10750b
            java.lang.StringBuilder r0 = bc.e.p(r2, r3, r0, r4, r1)
            java.lang.String r1 = ", oldGroupNickname="
            java.lang.String r2 = ", newGroupNickname="
            java.lang.String r3 = r5.f10751c
            java.lang.String r4 = r5.f10752d
            j8.b.t(r0, r3, r1, r4, r2)
            java.lang.String r1 = ", realNameTail="
            java.lang.String r2 = ", gender="
            java.lang.String r3 = r5.f10753e
            java.lang.String r4 = r5.f10754f
            j8.b.t(r0, r3, r1, r4, r2)
            java.lang.String r1 = ", region="
            java.lang.String r2 = ", groupName="
            java.lang.String r3 = r5.f10755g
            java.lang.String r4 = r5.f10756h
            j8.b.t(r0, r3, r1, r4, r2)
            java.lang.String r1 = ", time="
            java.lang.String r2 = ")"
            java.lang.String r3 = r5.f10757i
            java.lang.String r4 = r5.f10758j
            java.lang.String r0 = j8.b.k(r0, r3, r1, r4, r2)
            return r0
    }
}
