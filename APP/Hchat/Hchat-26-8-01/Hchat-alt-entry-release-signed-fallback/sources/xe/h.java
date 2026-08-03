package xe;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final mh.b f21561c = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.HashSet f21562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.util.HashSet f21563b;

    static {
            java.lang.Class<xe.h> r0 = xe.h.class
            mh.b r0 = mh.d.b(r0)
            xe.h.f21561c = r0
            return
    }

    public h() {
            r1 = this;
            r1.<init>()
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r1.f21562a = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r1.f21563b = r0
            return
    }

    public static void a(ud.k r5, java.lang.String r6, java.lang.Throwable r7) {
            ud.u r0 = r5.n()
            xe.h r0 = r0.f13743b
            monitor-enter(r0)
            java.util.HashSet r1 = r0.f21562a     // Catch: java.lang.Throwable -> L1f
            r2 = r5
            md.i r2 = (md.i) r2     // Catch: java.lang.Throwable -> L1f
            r1.add(r2)     // Catch: java.lang.Throwable -> L1f
            java.lang.String r1 = b(r5, r6)     // Catch: java.lang.Throwable -> L1f
            boolean r2 = r7 instanceof java.lang.StackOverflowError     // Catch: java.lang.Throwable -> L1f
            if (r2 == 0) goto L21
            mh.b r2 = xe.h.f21561c     // Catch: java.lang.Throwable -> L1f
            java.lang.String r3 = "{}, error: StackOverflowError"
            r2.r(r1, r3)     // Catch: java.lang.Throwable -> L1f
            goto L4d
        L1f:
            r5 = move-exception
            goto L5d
        L21:
            boolean r2 = r7 instanceof af.f     // Catch: java.lang.Throwable -> L1f
            if (r2 == 0) goto L48
            java.lang.String r7 = r7.getMessage()     // Catch: java.lang.Throwable -> L1f
            af.f r2 = new af.f     // Catch: java.lang.Throwable -> L1f
            r2.<init>(r7)     // Catch: java.lang.Throwable -> L1f
            if (r7 == 0) goto L3f
            boolean r3 = r7.isEmpty()     // Catch: java.lang.Throwable -> L1f
            if (r3 == 0) goto L37
            goto L3f
        L37:
            mh.b r3 = xe.h.f21561c     // Catch: java.lang.Throwable -> L1f
            java.lang.String r4 = "{}, details: {}"
            r3.n(r1, r4, r7)     // Catch: java.lang.Throwable -> L1f
            goto L46
        L3f:
            mh.b r7 = xe.h.f21561c     // Catch: java.lang.Throwable -> L1f
            java.lang.String r3 = "{}"
            r7.r(r1, r3)     // Catch: java.lang.Throwable -> L1f
        L46:
            r7 = r2
            goto L4d
        L48:
            mh.b r2 = xe.h.f21561c     // Catch: java.lang.Throwable -> L1f
            r2.e(r1, r7)     // Catch: java.lang.Throwable -> L1f
        L4d:
            md.i r5 = (md.i) r5     // Catch: java.lang.Throwable -> L1f
            md.b r1 = md.b.f8848c     // Catch: java.lang.Throwable -> L1f
            nd.p r2 = new nd.p     // Catch: java.lang.Throwable -> L1f
            r2.<init>(r6, r7)     // Catch: java.lang.Throwable -> L1f
            md.e r5 = (md.e) r5     // Catch: java.lang.Throwable -> L1f
            r5.x(r1, r2)     // Catch: java.lang.Throwable -> L1f
            monitor-exit(r0)
            return
        L5d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1f
            throw r5
    }

    public static java.lang.String b(ud.k r3, java.lang.String r4) {
            java.lang.String r0 = r3.typeName()
            java.lang.String r1 = java.lang.String.valueOf(r3)
            java.lang.String r3 = r3.m()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r4)
            java.lang.String r4 = " in "
            r2.append(r4)
            r2.append(r0)
            java.lang.String r4 = ": "
            r2.append(r4)
            r2.append(r1)
            java.lang.String r4 = ", file: "
            java.lang.String r3 = eh.a.r(r2, r4, r3)
            return r3
    }
}
