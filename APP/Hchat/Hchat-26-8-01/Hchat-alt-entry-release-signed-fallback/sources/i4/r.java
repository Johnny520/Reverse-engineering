package i4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class r extends z4.e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final i4.r f6485i = null;

    static {
            i4.r r0 = new i4.r
            r1 = 0
            r0.<init>(r1)
            i4.r.f6485i = r0
            return
    }

    public final i4.q o(int r6, int r7) {
            r5 = this;
            java.lang.Object[] r0 = r5.f22543h
            int r0 = r0.length
            r1 = 0
        L4:
            if (r1 >= r0) goto L1d
            java.lang.Object r2 = r5.l(r1)
            i4.q r2 = (i4.q) r2
            int r3 = r2.f6484f
            if (r7 != r3) goto L1a
            int r3 = r2.f6479a
            if (r6 < r3) goto L1a
            int r4 = r2.f6480b
            int r3 = r3 + r4
            if (r6 >= r3) goto L1a
            return r2
        L1a:
            int r1 = r1 + 1
            goto L4
        L1d:
            r6 = 0
            return r6
    }
}
