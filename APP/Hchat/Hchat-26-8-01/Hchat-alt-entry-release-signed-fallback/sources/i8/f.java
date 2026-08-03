package i8;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements o8.b, j6.o, j8.m {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f6522g;

    public /* synthetic */ f(int r1) {
            r0 = this;
            r0.f6522g = r1
            r0.<init>()
            return
    }

    public /* synthetic */ f(java.lang.Object r1, int r2) {
            r0 = this;
            r0.f6522g = r2
            r0.<init>()
            return
    }

    public static /* synthetic */ void b(java.lang.Object r2, java.lang.String r3) {
            af.d r0 = new af.d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r3)
            java.lang.String r2 = r2.toString()
            r1.append(r2)
            java.lang.String r2 = r1.toString()
            r0.<init>(r2)
            throw r0
    }

    @Override // j8.m
    public void a(java.lang.String r1) {
            r0 = this;
            i8.i.f(r1)
            return
    }

    @Override // j6.o
    public java.lang.Object d() {
            r2 = this;
            int r0 = r2.f6522g
            switch(r0) {
                case 17: goto L35;
                case 18: goto L2f;
                case 19: goto L29;
                case 20: goto L23;
                case 21: goto L1d;
                case 22: goto L17;
                case 23: goto L11;
                case 24: goto Lb;
                default: goto L5;
            }
        L5:
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            return r0
        Lb:
            java.util.TreeSet r0 = new java.util.TreeSet
            r0.<init>()
            return r0
        L11:
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            return r0
        L17:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            return r0
        L1d:
            java.util.concurrent.ConcurrentSkipListMap r0 = new java.util.concurrent.ConcurrentSkipListMap
            r0.<init>()
            return r0
        L23:
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            return r0
        L29:
            java.util.TreeMap r0 = new java.util.TreeMap
            r0.<init>()
            return r0
        L2f:
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            return r0
        L35:
            j6.n r0 = new j6.n
            r1 = 1
            r0.<init>(r1)
            return r0
    }
}
