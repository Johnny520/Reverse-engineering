package hb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f5444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.util.ArrayList f5445b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.util.List f5446c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final fg.q f5447d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f5448e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f5449f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f5450g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f5451h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f5452i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public hb.p f5453j;

    public q(java.lang.String r1, java.util.ArrayList r2, java.util.List r3, fg.q r4) {
            r0 = this;
            r0.<init>()
            r0.f5444a = r1
            r0.f5445b = r2
            r0.f5446c = r3
            r0.f5447d = r4
            r1 = 0
            r0.f5448e = r1
            r0.f5449f = r1
            r0.f5450g = r1
            r0.f5451h = r1
            r1 = -1
            r0.f5452i = r1
            r1 = 0
            r0.f5453j = r1
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L4
            goto L66
        L4:
            boolean r0 = r3 instanceof hb.q
            if (r0 != 0) goto L9
            goto L64
        L9:
            hb.q r3 = (hb.q) r3
            java.lang.String r0 = r2.f5444a
            java.lang.String r1 = r3.f5444a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L16
            goto L64
        L16:
            java.util.ArrayList r0 = r2.f5445b
            java.util.ArrayList r1 = r3.f5445b
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L21
            goto L64
        L21:
            java.util.List r0 = r2.f5446c
            java.util.List r1 = r3.f5446c
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2c
            goto L64
        L2c:
            fg.q r0 = r2.f5447d
            fg.q r1 = r3.f5447d
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L37
            goto L64
        L37:
            int r0 = r2.f5448e
            int r1 = r3.f5448e
            if (r0 == r1) goto L3e
            goto L64
        L3e:
            int r0 = r2.f5449f
            int r1 = r3.f5449f
            if (r0 == r1) goto L45
            goto L64
        L45:
            int r0 = r2.f5450g
            int r1 = r3.f5450g
            if (r0 == r1) goto L4c
            goto L64
        L4c:
            int r0 = r2.f5451h
            int r1 = r3.f5451h
            if (r0 == r1) goto L53
            goto L64
        L53:
            int r0 = r2.f5452i
            int r1 = r3.f5452i
            if (r0 == r1) goto L5a
            goto L64
        L5a:
            hb.p r0 = r2.f5453j
            hb.p r3 = r3.f5453j
            boolean r3 = gg.l.a(r0, r3)
            if (r3 != 0) goto L66
        L64:
            r3 = 0
            return r3
        L66:
            r3 = 1
            return r3
    }

    public final int hashCode() {
            r4 = this;
            java.lang.String r0 = r4.f5444a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.util.ArrayList r2 = r4.f5445b
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            java.util.List r0 = r4.f5446c
            int r0 = j8.b.e(r0, r2, r1)
            r2 = 0
            fg.q r3 = r4.f5447d
            if (r3 != 0) goto L1e
            r3 = r2
            goto L22
        L1e:
            int r3 = r3.hashCode()
        L22:
            int r0 = r0 + r3
            int r0 = r0 * r1
            int r3 = r4.f5448e
            int r0 = eh.a.e(r3, r0, r1)
            int r3 = r4.f5449f
            int r0 = eh.a.e(r3, r0, r1)
            int r3 = r4.f5450g
            int r0 = eh.a.e(r3, r0, r1)
            int r3 = r4.f5451h
            int r0 = eh.a.e(r3, r0, r1)
            int r3 = r4.f5452i
            int r0 = eh.a.e(r3, r0, r1)
            hb.p r1 = r4.f5453j
            if (r1 != 0) goto L47
            goto L4b
        L47:
            int r2 = r1.hashCode()
        L4b:
            int r0 = r0 + r2
            return r0
    }

    public final java.lang.String toString() {
            r9 = this;
            int r0 = r9.f5448e
            int r1 = r9.f5449f
            int r2 = r9.f5450g
            int r3 = r9.f5451h
            int r4 = r9.f5452i
            hb.p r5 = r9.f5453j
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "SendBatch(id="
            r6.<init>(r7)
            java.lang.String r7 = r9.f5444a
            r6.append(r7)
            java.lang.String r7 = ", snapshots="
            r6.append(r7)
            java.util.ArrayList r7 = r9.f5445b
            r6.append(r7)
            java.lang.String r7 = ", targets="
            r6.append(r7)
            java.util.List r7 = r9.f5446c
            r6.append(r7)
            java.lang.String r7 = ", onComplete="
            r6.append(r7)
            fg.q r7 = r9.f5447d
            r6.append(r7)
            java.lang.String r7 = ", index="
            r6.append(r7)
            java.lang.String r7 = ", targetIndex="
            java.lang.String r8 = ", success="
            wb.en.p(r6, r0, r7, r1, r8)
            java.lang.String r0 = ", total="
            java.lang.String r1 = ", preparedSnapshotIndex="
            wb.en.p(r6, r2, r0, r3, r1)
            r6.append(r4)
            java.lang.String r0 = ", directPlan="
            r6.append(r0)
            r6.append(r5)
            java.lang.String r0 = ")"
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            return r0
    }
}
