package n9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f9069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f9070b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.util.Set f9071c;

    public a(java.lang.String r1, java.lang.String r2, java.util.Set r3) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r0.<init>()
            r0.f9069a = r1
            r0.f9070b = r2
            r0.f9071c = r3
            return
    }

    public static n9.a a(n9.a r1, java.lang.String r2, java.util.Set r3, int r4) {
            java.lang.String r0 = r1.f9069a
            r4 = r4 & 2
            if (r4 == 0) goto L8
            java.lang.String r2 = r1.f9070b
        L8:
            r1.getClass()
            r0.getClass()
            r2.getClass()
            n9.a r1 = new n9.a
            r1.<init>(r0, r2, r3)
            return r1
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L2c
        L3:
            boolean r0 = r3 instanceof n9.a
            if (r0 != 0) goto L8
            goto L2a
        L8:
            n9.a r3 = (n9.a) r3
            java.lang.String r0 = r2.f9069a
            java.lang.String r1 = r3.f9069a
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L15
            goto L2a
        L15:
            java.lang.String r0 = r2.f9070b
            java.lang.String r1 = r3.f9070b
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L20
            goto L2a
        L20:
            java.util.Set r0 = r2.f9071c
            java.util.Set r3 = r3.f9071c
            boolean r3 = r0.equals(r3)
            if (r3 != 0) goto L2c
        L2a:
            r3 = 0
            return r3
        L2c:
            r3 = 1
            return r3
    }

    public final int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.f9069a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.f9070b
            int r0 = eh.a.g(r0, r1, r2)
            java.util.Set r1 = r3.f9071c
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", name="
            java.lang.String r1 = ", groupIds="
            java.lang.String r2 = "GroupChatLabel(id="
            java.lang.String r3 = r5.f9069a
            java.lang.String r4 = r5.f9070b
            java.lang.StringBuilder r0 = bc.e.p(r2, r3, r0, r4, r1)
            java.util.Set r1 = r5.f9071c
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
