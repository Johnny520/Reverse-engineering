package aa;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f133b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f134c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f135d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.String f136e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.lang.String f137f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.lang.String f138g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.String f139h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f140i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final java.util.Set f141j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final java.lang.String f142k;

    public h(java.lang.String r1, java.lang.String r2, boolean r3, int r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, boolean r9, java.util.Set r10, java.lang.String r11) {
            r0 = this;
            r10.getClass()
            r11.getClass()
            r0.<init>()
            r0.f132a = r1
            r0.f133b = r2
            r0.f134c = r3
            r0.f135d = r4
            r0.f136e = r5
            r0.f137f = r6
            r0.f138g = r7
            r0.f139h = r8
            r0.f140i = r9
            r0.f141j = r10
            r0.f142k = r11
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L4
            goto L7b
        L4:
            boolean r0 = r3 instanceof aa.h
            if (r0 != 0) goto La
            goto L79
        La:
            aa.h r3 = (aa.h) r3
            java.lang.String r0 = r2.f132a
            java.lang.String r1 = r3.f132a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L18
            goto L79
        L18:
            java.lang.String r0 = r2.f133b
            java.lang.String r1 = r3.f133b
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L23
            goto L79
        L23:
            boolean r0 = r2.f134c
            boolean r1 = r3.f134c
            if (r0 == r1) goto L2a
            goto L79
        L2a:
            int r0 = r2.f135d
            int r1 = r3.f135d
            if (r0 == r1) goto L31
            goto L79
        L31:
            java.lang.String r0 = r2.f136e
            java.lang.String r1 = r3.f136e
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L3c
            goto L79
        L3c:
            java.lang.String r0 = r2.f137f
            java.lang.String r1 = r3.f137f
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L47
            goto L79
        L47:
            java.lang.String r0 = r2.f138g
            java.lang.String r1 = r3.f138g
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L52
            goto L79
        L52:
            java.lang.String r0 = r2.f139h
            java.lang.String r1 = r3.f139h
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L5d
            goto L79
        L5d:
            boolean r0 = r2.f140i
            boolean r1 = r3.f140i
            if (r0 == r1) goto L64
            goto L79
        L64:
            java.util.Set r0 = r2.f141j
            java.util.Set r1 = r3.f141j
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L6f
            goto L79
        L6f:
            java.lang.String r0 = r2.f142k
            java.lang.String r3 = r3.f142k
            boolean r3 = gg.l.a(r0, r3)
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
            java.lang.String r0 = r3.f132a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.f133b
            int r0 = eh.a.g(r0, r1, r2)
            boolean r2 = r3.f134c
            int r0 = eh.a.h(r0, r1, r2)
            int r2 = r3.f135d
            int r0 = eh.a.e(r2, r0, r1)
            java.lang.String r2 = r3.f136e
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r2 = r3.f137f
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r2 = r3.f138g
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r2 = r3.f139h
            int r0 = eh.a.g(r0, r1, r2)
            boolean r2 = r3.f140i
            int r0 = eh.a.h(r0, r1, r2)
            java.util.Set r2 = r3.f141j
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            java.lang.String r0 = r3.f142k
            int r0 = r0.hashCode()
            int r0 = r0 + r2
            return r0
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", name="
            java.lang.String r1 = ", enabled="
            java.lang.String r2 = "MessageBlockTemplate(id="
            java.lang.String r3 = r5.f132a
            java.lang.String r4 = r5.f133b
            java.lang.StringBuilder r0 = bc.e.p(r2, r3, r0, r4, r1)
            boolean r1 = r5.f134c
            r0.append(r1)
            java.lang.String r1 = ", mode="
            r0.append(r1)
            int r1 = r5.f135d
            r0.append(r1)
            java.lang.String r1 = ", targets="
            r0.append(r1)
            java.lang.String r1 = ", targetGroupMembers="
            java.lang.String r2 = ", excludes="
            java.lang.String r3 = r5.f136e
            java.lang.String r4 = r5.f137f
            j8.b.t(r0, r3, r1, r4, r2)
            java.lang.String r1 = ", excludeGroupMembers="
            java.lang.String r2 = ", typeAll="
            java.lang.String r3 = r5.f138g
            java.lang.String r4 = r5.f139h
            j8.b.t(r0, r3, r1, r4, r2)
            boolean r1 = r5.f140i
            r0.append(r1)
            java.lang.String r1 = ", types="
            r0.append(r1)
            java.util.Set r1 = r5.f141j
            r0.append(r1)
            java.lang.String r1 = ", textKeywords="
            r0.append(r1)
            java.lang.String r1 = ")"
            java.lang.String r2 = r5.f142k
            java.lang.String r0 = eh.a.r(r0, r2, r1)
            return r0
    }
}
