package f2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final f2.h f3151d = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f3152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lg.a f3153b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f3154c;

    static {
            f2.h r0 = new f2.h
            lg.a r1 = new lg.a
            r2 = 0
            r1.<init>(r2, r2)
            r3 = 0
            r0.<init>(r2, r1, r3)
            f2.h.f3151d = r0
            return
    }

    public h(float r1, lg.a r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.f3152a = r1
            r0.f3153b = r2
            r0.f3154c = r3
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L10
            return
        L10:
            java.lang.String r1 = "current must not be NaN"
            j8.o.t(r1)
            r1 = 0
            throw r1
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L24
        L3:
            boolean r0 = r3 instanceof f2.h
            if (r0 != 0) goto L8
            goto L26
        L8:
            f2.h r3 = (f2.h) r3
            float r0 = r3.f3152a
            float r1 = r2.f3152a
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L26
            lg.a r0 = r2.f3153b
            lg.a r1 = r3.f3153b
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1d
            goto L26
        L1d:
            int r0 = r2.f3154c
            int r3 = r3.f3154c
            if (r0 == r3) goto L24
            goto L26
        L24:
            r3 = 1
            return r3
        L26:
            r3 = 0
            return r3
    }

    public final int hashCode() {
            r2 = this;
            float r0 = r2.f3152a
            int r0 = java.lang.Float.hashCode(r0)
            int r0 = r0 * 31
            lg.a r1 = r2.f3153b
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            int r0 = r2.f3154c
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ProgressBarRangeInfo(current="
            r0.<init>(r1)
            float r1 = r3.f3152a
            r0.append(r1)
            java.lang.String r1 = ", range="
            r0.append(r1)
            lg.a r1 = r3.f3153b
            r0.append(r1)
            java.lang.String r1 = ", steps="
            r0.append(r1)
            int r1 = r3.f3154c
            r2 = 41
            java.lang.String r0 = p.a.n(r0, r1, r2)
            return r0
    }
}
