package m6;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends h6.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m6.b.a f8723b = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.text.SimpleDateFormat f8724a;

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public class a implements h6.o {
        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // h6.o
        public final h6.n a(h6.f r1, n6.a r2) {
                r0 = this;
                java.lang.Class r1 = r2.f9028a
                java.lang.Class<java.sql.Time> r2 = java.sql.Time.class
                if (r1 != r2) goto Ld
                m6.b r1 = new m6.b
                r2 = 0
                r1.<init>(r2)
                return r1
            Ld:
                r1 = 0
                return r1
        }
    }

    static {
            m6.b$a r0 = new m6.b$a
            r0.<init>()
            m6.b.f8723b = r0
            return
    }

    private b() {
            r2 = this;
            r2.<init>()
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.lang.String r1 = "hh:mm:ss a"
            r0.<init>(r1)
            r2.f8724a = r0
            return
    }

    public /* synthetic */ b(int r1) {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // h6.n
    public final void b(o6.a r2, java.lang.Object r3) {
            r1 = this;
            java.sql.Time r3 = (java.sql.Time) r3
            if (r3 != 0) goto L8
            r2.l()
            return
        L8:
            monitor-enter(r1)
            java.text.SimpleDateFormat r0 = r1.f8724a     // Catch: java.lang.Throwable -> L14
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
