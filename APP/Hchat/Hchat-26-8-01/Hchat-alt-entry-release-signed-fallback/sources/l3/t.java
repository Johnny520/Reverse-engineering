package l3;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.util.SparseArray f7823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public l3.u f7824b;

    public t(int r2) {
            r1 = this;
            r1.<init>()
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>(r2)
            r1.f7823a = r0
            return
    }

    public final void a(l3.u r5, int r6, int r7) {
            r4 = this;
            int r0 = r5.a(r6)
            android.util.SparseArray r1 = r4.f7823a
            if (r1 != 0) goto La
            r0 = 0
            goto L10
        La:
            java.lang.Object r0 = r1.get(r0)
            l3.t r0 = (l3.t) r0
        L10:
            r2 = 1
            if (r0 != 0) goto L1f
            l3.t r0 = new l3.t
            r0.<init>(r2)
            int r3 = r5.a(r6)
            r1.put(r3, r0)
        L1f:
            if (r7 <= r6) goto L26
            int r6 = r6 + r2
            r0.a(r5, r6, r7)
            return
        L26:
            r0.f7824b = r5
            return
    }
}
