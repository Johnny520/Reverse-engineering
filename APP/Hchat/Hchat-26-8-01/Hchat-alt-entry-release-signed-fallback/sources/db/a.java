package db;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f2167b;

    public a(int r1, java.lang.String r2) {
            r0 = this;
            r2.getClass()
            r0.<init>()
            r0.f2166a = r1
            r0.f2167b = r2
            return
    }

    public static db.a a(db.a r1, java.lang.String r2) {
            int r0 = r1.f2166a
            r1.getClass()
            r2.getClass()
            db.a r1 = new db.a
            r1.<init>(r0, r2)
            return r1
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof db.a
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            db.a r5 = (db.a) r5
            int r1 = r4.f2166a
            int r3 = r5.f2166a
            if (r1 == r3) goto L13
            return r2
        L13:
            java.lang.String r1 = r4.f2167b
            java.lang.String r5 = r5.f2167b
            boolean r5 = gg.l.a(r1, r5)
            if (r5 != 0) goto L1e
            return r2
        L1e:
            return r0
    }

    public final int hashCode() {
            r2 = this;
            int r0 = r2.f2166a
            int r0 = java.lang.Integer.hashCode(r0)
            int r0 = r0 * 31
            java.lang.String r1 = r2.f2167b
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ScheduledTaskContentItem(type="
            r0.<init>(r1)
            int r1 = r2.f2166a
            r0.append(r1)
            java.lang.String r1 = ", value="
            r0.append(r1)
            java.lang.String r1 = r2.f2167b
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
