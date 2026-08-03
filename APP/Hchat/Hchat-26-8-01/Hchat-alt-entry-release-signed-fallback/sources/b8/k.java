package b8;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k extends b8.j implements java.lang.Iterable, z7.s {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final z7.b f519j = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public z7.c f520h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f521i;

    static {
            z7.b r0 = z7.c.f22583o
            b8.k.f519j = r0
            return
    }

    public k() {
            r1 = this;
            r1.<init>()
            z7.b r0 = b8.k.f519j
            r1.f520h = r0
            return
    }

    @Override // z7.s
    public final java.lang.Object get(int r2) {
            r1 = this;
            monitor-enter(r1)
            z7.c r0 = r1.f520h     // Catch: java.lang.Throwable -> Lb
            java.lang.Object[] r0 = r0.f22584g     // Catch: java.lang.Throwable -> Lb
            r2 = r0[r2]     // Catch: java.lang.Throwable -> Lb
            b8.j r2 = (b8.j) r2     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb
            return r2
        Lb:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb
            throw r2
    }

    @Override // b8.j, java.lang.Iterable
    public final java.util.Iterator iterator() {
            r1 = this;
            z7.l r0 = new z7.l
            r0.<init>(r1)
            return r0
    }

    public final void m(b8.j r4) {
            r3 = this;
            java.lang.String r0 = "Duplicate node: "
            if (r4 != r3) goto L5
            return
        L5:
            monitor-enter(r3)
            z7.c r1 = r3.f520h     // Catch: java.lang.Throwable -> L15
            z7.b r2 = b8.k.f519j     // Catch: java.lang.Throwable -> L15
            if (r1 != r2) goto L17
            z7.c r1 = new z7.c     // Catch: java.lang.Throwable -> L15
            r2 = 0
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L15
            r3.f520h = r1     // Catch: java.lang.Throwable -> L15
            goto L17
        L15:
            r4 = move-exception
            goto L56
        L17:
            z7.c r1 = r3.f520h     // Catch: java.lang.Throwable -> L15
            boolean r1 = r1.c(r4)     // Catch: java.lang.Throwable -> L15
            if (r1 != 0) goto L44
            z7.c r0 = r3.f520h     // Catch: java.lang.Throwable -> L15
            r0.add(r4)     // Catch: java.lang.Throwable -> L15
            if (r3 == r4) goto L28
            r4.f518g = r3     // Catch: java.lang.Throwable -> L15
        L28:
            z7.c r4 = r3.f520h     // Catch: java.lang.Throwable -> L15
            int r4 = r4.size()     // Catch: java.lang.Throwable -> L15
            int r0 = r3.f521i     // Catch: java.lang.Throwable -> L15
            int r4 = r4 - r0
            r0 = 1000(0x3e8, float:1.401E-42)
            if (r4 <= r0) goto L42
            z7.c r4 = r3.f520h     // Catch: java.lang.Throwable -> L15
            r4.m()     // Catch: java.lang.Throwable -> L15
            z7.c r4 = r3.f520h     // Catch: java.lang.Throwable -> L15
            int r4 = r4.size()     // Catch: java.lang.Throwable -> L15
            r3.f521i = r4     // Catch: java.lang.Throwable -> L15
        L42:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L15
            return
        L44:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L15
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L15
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L15
            r2.append(r4)     // Catch: java.lang.Throwable -> L15
            java.lang.String r4 = r2.toString()     // Catch: java.lang.Throwable -> L15
            r1.<init>(r4)     // Catch: java.lang.Throwable -> L15
            throw r1     // Catch: java.lang.Throwable -> L15
        L56:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L15
            throw r4
    }

    public abstract b8.f n();

    public abstract b8.h o();

    @Override // z7.r
    public final int size() {
            r1 = this;
            z7.c r0 = r1.f520h
            int r0 = r0.size()
            return r0
    }
}
