package bsh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j {
    public static /* synthetic */ void a() {
            bsh.ParseException r0 = new bsh.ParseException
            r0.<init>()
            throw r0
    }

    public static /* synthetic */ void b(java.lang.Object r1, java.lang.String r2, java.lang.Object r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r2)
            r0.append(r1)
            r0.append(r3)
            java.lang.String r1 = r0.toString()
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            r2.<init>(r1)
            throw r2
    }

    public static /* synthetic */ void c(java.lang.String r1) {
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
    }

    public static /* synthetic */ void d(java.lang.String r2, java.lang.Throwable r3) {
            bsh.InterpreterError r0 = new bsh.InterpreterError
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r2 = r1.toString()
            r0.<init>(r2, r3)
            throw r0
    }

    public static /* synthetic */ void e() {
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
    }

    public static /* synthetic */ void f(java.lang.String r1) {
            bsh.InterpreterError r0 = new bsh.InterpreterError
            r0.<init>(r1)
            throw r0
    }

    public static /* synthetic */ void g(java.lang.String r1) {
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
    }
}
