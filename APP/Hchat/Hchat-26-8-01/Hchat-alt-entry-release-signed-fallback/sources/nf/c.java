package nf;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements java.io.Closeable {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final mh.b f9414j = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final nf.b f9415g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.util.ArrayList f9416h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.util.HashMap f9417i;

    static {
            java.lang.Class<nf.c> r0 = nf.c.class
            mh.b r0 = mh.d.b(r0)
            nf.c.f9414j = r0
            return
    }

    public c(nf.b r5, java.util.ArrayList r6) {
            r4 = this;
            r4.<init>()
            r4.f9415g = r5
            r4.f9416h = r6
            java.util.HashMap r0 = new java.util.HashMap
            int r1 = r6.size()
            r0.<init>(r1)
            java.util.Iterator r6 = r6.iterator()
        L14:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L34
            java.lang.Object r1 = r6.next()
            nf.a r1 = (nf.a) r1
            java.lang.String r2 = r1.getName()
            java.lang.Object r1 = r0.put(r2, r1)
            nf.a r1 = (nf.a) r1
            if (r1 == 0) goto L14
            mh.b r1 = nf.c.f9414j
            java.lang.String r3 = "Found duplicate entry: {} in {}"
            r1.s(r2, r3, r5)
            goto L14
        L34:
            r4.f9417i = r0
            return
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r1 = this;
            nf.b r0 = r1.f9415g
            r0.close()
            return
    }
}
