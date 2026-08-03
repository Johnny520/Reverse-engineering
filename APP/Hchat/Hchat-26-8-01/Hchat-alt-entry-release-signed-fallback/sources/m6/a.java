package m6;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends h6.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m6.a.C0000a f8721b = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.text.SimpleDateFormat f8722a;

    /* JADX INFO: renamed from: m6.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public class C0000a implements h6.o {
        public C0000a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // h6.o
        public final h6.n a(h6.f r1, n6.a r2) {
                r0 = this;
                java.lang.Class r1 = r2.f9028a
                java.lang.Class<java.sql.Date> r2 = java.sql.Date.class
                if (r1 != r2) goto Ld
                m6.a r1 = new m6.a
                r2 = 0
                r1.<init>(r2)
                return r1
            Ld:
                r1 = 0
                return r1
        }
    }

    static {
            m6.a$a r0 = new m6.a$a
            r0.<init>()
            m6.a.f8721b = r0
            return
    }

    private a() {
            r2 = this;
            r2.<init>()
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.lang.String r1 = "MMM d, yyyy"
            r0.<init>(r1)
            r2.f8722a = r0
            return
    }

    public /* synthetic */ a(int r1) {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // h6.n
    public final void b(o6.a r2, java.lang.Object r3) {
            r1 = this;
            java.sql.Date r3 = (java.sql.Date) r3
            if (r3 != 0) goto L8
            r2.l()
            return
        L8:
            monitor-enter(r1)
            java.text.SimpleDateFormat r0 = r1.f8722a     // Catch: java.lang.Throwable -> L14
            java.lang.String r3 = r0.format(r3)     // Catch: java.lang.Throwable -> L14
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L14
            r2.x(r3)
            return
        L14:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L14
            throw r2
    }
}
