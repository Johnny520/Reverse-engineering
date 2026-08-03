package r7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k extends r7.b implements java.lang.Comparable {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final okio.a f11565n = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final okio.a f11566o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final okio.a f11567p = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f11568m;

    static {
            okio.a r0 = new okio.a
            r1 = 11
            r0.<init>(r1)
            r7.k.f11565n = r0
            okio.a r0 = new okio.a
            r1 = 10
            r0.<init>(r1)
            r7.k.f11566o = r0
            okio.a r0 = new okio.a
            r1 = 9
            r0.<init>(r1)
            r7.k.f11567p = r0
            return
    }

    public static void R(int r2) {
            r0 = -1
            if (r2 == r0) goto L1a
            r0 = -65536(0xffffffffffff0000, float:NaN)
            r0 = r0 & r2
            if (r0 != 0) goto L9
            goto L1a
        L9:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            r1 = 1
            java.lang.String r2 = y7.a.k(r2, r1)
            java.lang.String r1 = "Value out of range [0 - 0xffff]: "
            java.lang.String r2 = r1.concat(r2)
            r0.<init>(r2)
            throw r0
        L1a:
            return
    }

    @Override // r7.b
    public void L() {
            r1 = this;
            int r0 = r1.P()
            r1.f11568m = r0
            return
    }

    public int N() {
            r1 = this;
            int r0 = r1.f7388g
            return r0
    }

    public boolean O() {
            r2 = this;
            int r0 = r2.f11568m
            r1 = -1
            if (r0 != r1) goto L7
            r0 = 1
            return r0
        L7:
            r0 = 0
            return r0
    }

    public abstract int P();

    public void Q(int r1) {
            r0 = this;
            return
    }

    public abstract void S(int r1);

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "("
            r0.<init>(r1)
            int r1 = r2.N()
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            boolean r1 = r2.O()
            if (r1 == 0) goto L1f
            java.lang.String r1 = "NO_ENTRY"
            r0.append(r1)
            goto L24
        L1f:
            int r1 = r2.f11568m
            r0.append(r1)
        L24:
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
