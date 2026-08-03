package xe;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final java.lang.String f21577a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final java.lang.String f21578b = null;

    static {
            java.lang.Class<bc.k> r0 = bc.k.class
            java.lang.Package r0 = r0.getPackage()
            java.lang.String r0 = r0.getName()
            xe.s.f21577a = r0
            java.lang.Class<be.h> r0 = be.h.class
            java.lang.String r0 = r0.getName()
            xe.s.f21578b = r0
            return
    }

    public static void a() {
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            boolean r0 = r0.isInterrupted()
            if (r0 != 0) goto Lb
            return
        Lb:
            java.lang.String r0 = "Thread interrupted"
            ah.a.k(r0)
            return
    }

    public static java.lang.String b(java.lang.String r4) {
            r0 = 0
            char r0 = r4.charAt(r0)
            r1 = 76
            if (r0 != r1) goto L23
            int r0 = r4.length()
            r1 = 1
            int r0 = r0 - r1
            char r2 = r4.charAt(r0)
            r3 = 59
            if (r2 != r3) goto L23
            java.lang.String r4 = r4.substring(r1, r0)
            r0 = 47
            r1 = 46
            java.lang.String r4 = r4.replace(r0, r1)
        L23:
            return r4
    }

    public static java.util.List c(java.util.Collection r2, java.util.function.Function r3) {
            if (r2 == 0) goto L29
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L9
            goto L29
        L9:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r2.size()
            r0.<init>(r1)
            java.util.Iterator r2 = r2.iterator()
        L16:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L28
            java.lang.Object r1 = r2.next()
            java.lang.Object r1 = r3.apply(r1)
            r0.add(r1)
            goto L16
        L28:
            return r0
        L29:
            java.util.List r2 = java.util.Collections.EMPTY_LIST
            return r2
    }

    public static void d(java.lang.Throwable r8) {
            java.lang.StackTraceElement[] r0 = r8.getStackTrace()
            int r1 = r0.length
            r2 = 0
            r3 = 0
            r4 = r3
        L8:
            if (r4 >= r1) goto L35
            r5 = r0[r4]
            java.lang.String r6 = r5.getClassName()
            java.lang.String r7 = xe.s.f21578b
            boolean r7 = r6.equals(r7)
            if (r7 != 0) goto L2b
            java.lang.String r7 = xe.s.f21577a
            boolean r6 = r6.startsWith(r7)
            if (r6 != 0) goto L2b
            boolean r2 = java.util.Objects.equals(r2, r5)
            if (r2 == 0) goto L27
            goto L2b
        L27:
            int r4 = r4 + 1
            r2 = r5
            goto L8
        L2b:
            java.lang.Object[] r0 = java.util.Arrays.copyOfRange(r0, r3, r4)
            java.lang.StackTraceElement[] r0 = (java.lang.StackTraceElement[]) r0
            r8.setStackTrace(r0)
            return
        L35:
            int r1 = r1 + (-1)
        L37:
            if (r1 < 0) goto L5d
            r2 = r0[r1]
            java.lang.String r2 = r2.getClassName()
            java.lang.String r4 = "jadx."
            boolean r4 = r2.startsWith(r4)
            if (r4 == 0) goto L5a
            java.lang.String r4 = "jadx.tests."
            boolean r2 = r2.startsWith(r4)
            if (r2 == 0) goto L50
            goto L5a
        L50:
            java.lang.Object[] r0 = java.util.Arrays.copyOfRange(r0, r3, r1)
            java.lang.StackTraceElement[] r0 = (java.lang.StackTraceElement[]) r0
            r8.setStackTrace(r0)
            return
        L5a:
            int r1 = r1 + (-1)
            goto L37
        L5d:
            return
    }

    public static void e(java.lang.Throwable r0) {
            d(r0)     // Catch: java.lang.Exception -> L3
        L3:
            java.lang.Throwable r0 = r0.getCause()
            if (r0 == 0) goto Lc
            e(r0)
        Lc:
            return
    }

    public static java.lang.Object f(java.util.List r2) {
            if (r2 == 0) goto L10
            int r0 = r2.size()
            r1 = 1
            if (r0 == r1) goto La
            goto L10
        La:
            r0 = 0
            java.lang.Object r2 = r2.get(r0)
            return r2
        L10:
            r2 = 0
            return r2
    }

    public static java.lang.String g(java.lang.Throwable r3) {
            if (r3 != 0) goto L5
            java.lang.String r3 = ""
            return r3
        L5:
            java.io.StringWriter r0 = new java.io.StringWriter
            r0.<init>()
            java.io.PrintWriter r1 = new java.io.PrintWriter
            r2 = 1
            r1.<init>(r0, r2)
            e(r3)
            r3.printStackTrace(r1)
            java.lang.StringBuffer r3 = r0.getBuffer()
            java.lang.String r3 = r3.toString()
            return r3
    }

    public static boolean h(java.util.Collection r0) {
            if (r0 == 0) goto Lb
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L9
            goto Lb
        L9:
            r0 = 0
            return r0
        Lb:
            r0 = 1
            return r0
    }

    public static java.lang.Object i(java.util.List r1) {
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L8
            r1 = 0
            return r1
        L8:
            int r0 = r1.size()
            int r0 = r0 + (-1)
            java.lang.Object r1 = r1.get(r0)
            return r1
    }

    public static java.lang.String j(java.lang.Iterable r2, java.lang.String r3) {
            if (r2 != 0) goto L5
            java.lang.String r2 = ""
            return r2
        L5:
            xe.n r0 = new xe.n
            r1 = 1
            r0.<init>(r1)
            java.lang.String r2 = k(r2, r3, r0)
            return r2
    }

    public static java.lang.String k(java.lang.Iterable r1, java.lang.String r2, java.util.function.Function r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            l(r0, r1, r2, r3)
            java.lang.String r1 = r0.toString()
            return r1
    }

    public static void l(java.lang.StringBuilder r1, java.lang.Iterable r2, java.lang.String r3, java.util.function.Function r4) {
            if (r2 != 0) goto L3
            goto L31
        L3:
            java.util.Iterator r2 = r2.iterator()
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L1a
            java.lang.Object r0 = r2.next()
            java.lang.Object r0 = r4.apply(r0)
            java.lang.String r0 = (java.lang.String) r0
            r1.append(r0)
        L1a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L31
            r1.append(r3)
            java.lang.Object r0 = r2.next()
            java.lang.Object r0 = r4.apply(r0)
            java.lang.String r0 = (java.lang.String) r0
            r1.append(r0)
            goto L1a
        L31:
            return
    }

    public static java.util.List m(java.util.List r2) {
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L9
            java.util.List r2 = java.util.Collections.EMPTY_LIST
            return r2
        L9:
            int r0 = r2.size()
            r1 = 1
            if (r0 != r1) goto L1a
            r0 = 0
            java.lang.Object r2 = r2.get(r0)
            java.util.List r2 = java.util.Collections.singletonList(r2)
            return r2
        L1a:
            xe.j r0 = new xe.j
            r0.<init>(r2)
            return r0
    }

    public static boolean n(java.util.Collection r0) {
            if (r0 == 0) goto La
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }
}
