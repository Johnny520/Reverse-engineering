package f6;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f3306b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3307c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public java.lang.Object f3308d;

    public /* synthetic */ b() {
            r1 = this;
            r0 = 0
            r1.f3305a = r0
            r1.<init>()
            return
    }

    public b(k7.a r2) {
            r1 = this;
            r0 = 1
            r1.f3305a = r0
            r1.<init>()
            r1.f3308d = r2
            return
    }

    public void a(java.lang.Object r6) {
            r5 = this;
            r6.getClass()
            java.lang.Object r0 = r5.f3308d
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            int r1 = r0.length
            int r2 = r5.f3307c
            int r3 = r2 + 1
            if (r3 < 0) goto L44
            if (r3 > r1) goto L11
            goto L23
        L11:
            int r4 = r1 >> 1
            int r1 = r1 + r4
            int r1 = r1 + 1
            if (r1 >= r3) goto L1e
            int r1 = java.lang.Integer.highestOneBit(r2)
            int r1 = r1 << 1
        L1e:
            if (r1 >= 0) goto L23
            r1 = 2147483647(0x7fffffff, float:NaN)
        L23:
            int r0 = r0.length
            if (r1 > r0) goto L2a
            boolean r0 = r5.f3306b
            if (r0 == 0) goto L37
        L2a:
            java.lang.Object r0 = r5.f3308d
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
            r5.f3308d = r0
            r0 = 0
            r5.f3306b = r0
        L37:
            java.lang.Object r0 = r5.f3308d
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            int r1 = r5.f3307c
            int r2 = r1 + 1
            r5.f3307c = r2
            r0[r1] = r6
            return
        L44:
            java.lang.String r6 = "cannot store more than Integer.MAX_VALUE elements"
            j8.o.t(r6)
            return
    }

    public java.lang.String toString() {
            r2 = this;
            int r0 = r2.f3305a
            switch(r0) {
                case 1: goto La;
                default: goto L5;
            }
        L5:
            java.lang.String r0 = super.toString()
            return r0
        La:
            boolean r0 = r2.f3306b
            int r1 = r2.f3307c
            if (r0 == 0) goto L17
            java.lang.String r0 = "FOUND="
            java.lang.String r0 = eh.a.l(r1, r0)
            goto L1b
        L17:
            java.lang.String r0 = java.lang.String.valueOf(r1)
        L1b:
            return r0
    }
}
