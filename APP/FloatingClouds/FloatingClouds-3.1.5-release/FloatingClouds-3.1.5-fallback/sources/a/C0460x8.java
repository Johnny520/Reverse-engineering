package a;

/* JADX INFO: renamed from: a.x8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0460x8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a.C0460x8 f762a = null;
    public static volatile a.C0086ca.b b;

    static {
            a.x8 r0 = new a.x8
            r0.<init>()
            a.C0460x8.f762a = r0
            a.ca$b r0 = a.C0086ca.b.f424a
            a.C0460x8.b = r0
            return
    }

    public static boolean a() {
            a.ca$b r0 = a.C0460x8.b
            a.ca$b r1 = a.C0086ca.b.f424a
            if (r0 == r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    public final void b(a.C0086ca.c r5) {
            r4 = this;
            a.ca$b r0 = a.C0086ca.b.f424a
            java.lang.String r1 = "HideStateCtrl: force: "
            monitor-enter(r4)
            a.ca$b r2 = a.C0460x8.b     // Catch: java.lang.Throwable -> L46
            if (r2 != r0) goto Lb
            monitor-exit(r4)
            return
        Lb:
            a.C0460x8.b = r0     // Catch: java.lang.Throwable -> L46
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L46
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L46
            r3.append(r2)     // Catch: java.lang.Throwable -> L46
            java.lang.String r1 = " -> "
            r3.append(r1)     // Catch: java.lang.Throwable -> L46
            r3.append(r0)     // Catch: java.lang.Throwable -> L46
            java.lang.String r1 = " (source="
            r3.append(r1)     // Catch: java.lang.Throwable -> L46
            r3.append(r5)     // Catch: java.lang.Throwable -> L46
            java.lang.String r1 = ")"
            r3.append(r1)     // Catch: java.lang.Throwable -> L46
            java.lang.String r1 = r3.toString()     // Catch: java.lang.Throwable -> L46
            java.lang.Object[] r1 = new java.lang.Object[]{r1}     // Catch: java.lang.Throwable -> L46
            r3 = 1
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r3)     // Catch: java.lang.Throwable -> L46
            a.C0453x1.b(r1)     // Catch: java.lang.Throwable -> L46
            java.util.concurrent.CopyOnWriteArrayList<a.ca$d> r1 = a.C0086ca.f421a     // Catch: java.lang.Throwable -> L46
            a.ca$a$a r1 = new a.ca$a$a     // Catch: java.lang.Throwable -> L46
            r1.<init>(r0, r2, r5)     // Catch: java.lang.Throwable -> L46
            a.C0086ca.a(r1)     // Catch: java.lang.Throwable -> L46
            monitor-exit(r4)
            return
        L46:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L46
            throw r5
    }

    public final synchronized boolean c(a.C0086ca.b r5, a.C0086ca.c r6, java.util.Set<? extends a.C0086ca.b> r7) {
            r4 = this;
            java.lang.String r0 = "HideStateCtrl: transition: "
            java.lang.String r1 = "HideStateCtrl: transition BLOCKED: "
            monitor-enter(r4)
            a.ca$b r2 = a.C0460x8.b     // Catch: java.lang.Throwable -> L47
            boolean r2 = r7.contains(r2)     // Catch: java.lang.Throwable -> L47
            r3 = 1
            if (r2 != 0) goto L49
            a.ca$b r0 = a.C0460x8.b     // Catch: java.lang.Throwable -> L47
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L47
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L47
            r2.append(r0)     // Catch: java.lang.Throwable -> L47
            java.lang.String r0 = " -> "
            r2.append(r0)     // Catch: java.lang.Throwable -> L47
            r2.append(r5)     // Catch: java.lang.Throwable -> L47
            java.lang.String r5 = " (source="
            r2.append(r5)     // Catch: java.lang.Throwable -> L47
            r2.append(r6)     // Catch: java.lang.Throwable -> L47
            java.lang.String r5 = ", allowed="
            r2.append(r5)     // Catch: java.lang.Throwable -> L47
            r2.append(r7)     // Catch: java.lang.Throwable -> L47
            java.lang.String r5 = ")"
            r2.append(r5)     // Catch: java.lang.Throwable -> L47
            java.lang.String r5 = r2.toString()     // Catch: java.lang.Throwable -> L47
            java.lang.Object[] r5 = new java.lang.Object[]{r5}     // Catch: java.lang.Throwable -> L47
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r5, r3)     // Catch: java.lang.Throwable -> L47
            a.C0453x1.b(r5)     // Catch: java.lang.Throwable -> L47
            monitor-exit(r4)
            r5 = 0
            return r5
        L47:
            r5 = move-exception
            goto L85
        L49:
            a.ca$b r7 = a.C0460x8.b     // Catch: java.lang.Throwable -> L47
            a.C0460x8.b = r5     // Catch: java.lang.Throwable -> L47
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L47
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L47
            r1.append(r7)     // Catch: java.lang.Throwable -> L47
            java.lang.String r0 = " -> "
            r1.append(r0)     // Catch: java.lang.Throwable -> L47
            r1.append(r5)     // Catch: java.lang.Throwable -> L47
            java.lang.String r0 = " (source="
            r1.append(r0)     // Catch: java.lang.Throwable -> L47
            r1.append(r6)     // Catch: java.lang.Throwable -> L47
            java.lang.String r0 = ")"
            r1.append(r0)     // Catch: java.lang.Throwable -> L47
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L47
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> L47
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r3)     // Catch: java.lang.Throwable -> L47
            a.C0453x1.b(r0)     // Catch: java.lang.Throwable -> L47
            java.util.concurrent.CopyOnWriteArrayList<a.ca$d> r0 = a.C0086ca.f421a     // Catch: java.lang.Throwable -> L47
            a.ca$a$a r0 = new a.ca$a$a     // Catch: java.lang.Throwable -> L47
            r0.<init>(r5, r7, r6)     // Catch: java.lang.Throwable -> L47
            a.C0086ca.a(r0)     // Catch: java.lang.Throwable -> L47
            monitor-exit(r4)
            return r3
        L85:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L47
            throw r5
    }

    public final java.lang.String toString() {
            r3 = this;
            a.ca$b r0 = a.C0460x8.b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "HideStateController(state="
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = ")"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }
}
