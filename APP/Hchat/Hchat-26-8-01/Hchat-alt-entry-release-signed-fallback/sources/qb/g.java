package qb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f10819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f10820b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f10821c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.String f10822d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.String f10823e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.util.List f10824f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.util.List f10825g;

    public g(java.lang.String r1, java.lang.String r2, boolean r3, java.lang.String r4, java.lang.String r5, java.util.List r6, java.util.List r7) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r4.getClass()
            r5.getClass()
            r0.<init>()
            r0.f10819a = r1
            r0.f10820b = r2
            r0.f10821c = r3
            r0.f10822d = r4
            r0.f10823e = r5
            r0.f10824f = r6
            r0.f10825g = r7
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L54
        L3:
            boolean r0 = r3 instanceof qb.g
            if (r0 != 0) goto L8
            goto L52
        L8:
            qb.g r3 = (qb.g) r3
            java.lang.String r0 = r2.f10819a
            java.lang.String r1 = r3.f10819a
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L15
            goto L52
        L15:
            java.lang.String r0 = r2.f10820b
            java.lang.String r1 = r3.f10820b
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L20
            goto L52
        L20:
            boolean r0 = r2.f10821c
            boolean r1 = r3.f10821c
            if (r0 == r1) goto L27
            goto L52
        L27:
            java.lang.String r0 = r2.f10822d
            java.lang.String r1 = r3.f10822d
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L32
            goto L52
        L32:
            java.lang.String r0 = r2.f10823e
            java.lang.String r1 = r3.f10823e
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L3d
            goto L52
        L3d:
            java.util.List r0 = r2.f10824f
            java.util.List r1 = r3.f10824f
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L48
            goto L52
        L48:
            java.util.List r0 = r2.f10825g
            java.util.List r3 = r3.f10825g
            boolean r3 = r0.equals(r3)
            if (r3 != 0) goto L54
        L52:
            r3 = 0
            return r3
        L54:
            r3 = 1
            return r3
    }

    public final int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.f10819a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.f10820b
            int r0 = eh.a.g(r0, r1, r2)
            boolean r2 = r3.f10821c
            int r0 = eh.a.h(r0, r1, r2)
            java.lang.String r2 = r3.f10822d
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r2 = r3.f10823e
            int r0 = eh.a.g(r0, r1, r2)
            java.util.List r2 = r3.f10824f
            int r0 = j8.b.e(r2, r0, r1)
            java.util.List r1 = r3.f10825g
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", label="
            java.lang.String r1 = ", group="
            java.lang.String r2 = "ContactRow(id="
            java.lang.String r3 = r5.f10819a
            java.lang.String r4 = r5.f10820b
            java.lang.StringBuilder r0 = bc.e.p(r2, r3, r0, r4, r1)
            boolean r1 = r5.f10821c
            r0.append(r1)
            java.lang.String r1 = ", avatarUrl="
            r0.append(r1)
            java.lang.String r1 = r5.f10822d
            r0.append(r1)
            java.lang.String r1 = ", avatarBackupUrl="
            r0.append(r1)
            java.lang.String r1 = r5.f10823e
            r0.append(r1)
            java.lang.String r1 = ", labels="
            r0.append(r1)
            java.util.List r1 = r5.f10824f
            r0.append(r1)
            java.lang.String r1 = ", searchAliases="
            r0.append(r1)
            java.util.List r1 = r5.f10825g
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
