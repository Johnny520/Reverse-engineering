package k6;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends h6.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k6.e f7347b = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f7348a;

    static {
            k6.e r0 = new k6.e
            r0.<init>()
            k6.h.f7347b = r0
            return
    }

    public h(k6.g r7, int r8, int r9) {
            r6 = this;
            r6.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r6.f7348a = r0
            java.util.Objects.requireNonNull(r7)
            java.util.Locale r7 = java.util.Locale.US
            java.text.DateFormat r1 = java.text.DateFormat.getDateTimeInstance(r8, r9, r7)
            r0.add(r1)
            java.util.Locale r1 = java.util.Locale.getDefault()
            boolean r1 = r1.equals(r7)
            if (r1 != 0) goto L27
            java.text.DateFormat r1 = java.text.DateFormat.getDateTimeInstance(r8, r9)
            r0.add(r1)
        L27:
            int r1 = j6.i.f6734a
            r2 = 9
            if (r1 < r2) goto L83
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unknown DateFormat style: "
            r3 = 3
            r4 = 2
            r5 = 1
            if (r8 == 0) goto L51
            if (r8 == r5) goto L4e
            if (r8 == r4) goto L4b
            if (r8 != r3) goto L42
            java.lang.String r8 = "M/d/yy"
            goto L53
        L42:
            java.lang.String r7 = eh.a.l(r8, r2)
            j8.o.t(r7)
            r7 = 0
            throw r7
        L4b:
            java.lang.String r8 = "MMM d, yyyy"
            goto L53
        L4e:
            java.lang.String r8 = "MMMM d, yyyy"
            goto L53
        L51:
            java.lang.String r8 = "EEEE, MMMM d, yyyy"
        L53:
            r1.append(r8)
            java.lang.String r8 = " "
            r1.append(r8)
            if (r9 == 0) goto L72
            if (r9 == r5) goto L72
            if (r9 == r4) goto L6f
            if (r9 != r3) goto L66
            java.lang.String r8 = "h:mm a"
            goto L74
        L66:
            java.lang.String r7 = eh.a.l(r9, r2)
            j8.o.t(r7)
            r7 = 0
            throw r7
        L6f:
            java.lang.String r8 = "h:mm:ss a"
            goto L74
        L72:
            java.lang.String r8 = "h:mm:ss a z"
        L74:
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            java.text.SimpleDateFormat r9 = new java.text.SimpleDateFormat
            r9.<init>(r8, r7)
            r0.add(r9)
        L83:
            return
    }

    @Override // h6.n
    public final void b(o6.a r3, java.lang.Object r4) {
            r2 = this;
            java.util.Date r4 = (java.util.Date) r4
            if (r4 != 0) goto L8
            r3.l()
            return
        L8:
            java.util.ArrayList r0 = r2.f7348a
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            java.text.DateFormat r0 = (java.text.DateFormat) r0
            java.util.ArrayList r1 = r2.f7348a
            monitor-enter(r1)
            java.lang.String r4 = r0.format(r4)     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1d
            r3.x(r4)
            return
        L1d:
            r3 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1d
            throw r3
    }

    public final java.lang.String toString() {
            r4 = this;
            java.util.ArrayList r0 = r4.f7348a
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            java.text.DateFormat r0 = (java.text.DateFormat) r0
            boolean r1 = r0 instanceof java.text.SimpleDateFormat
            r2 = 41
            java.lang.String r3 = "DefaultDateTypeAdapter("
            if (r1 == 0) goto L27
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r3)
            java.text.SimpleDateFormat r0 = (java.text.SimpleDateFormat) r0
            java.lang.String r0 = r0.toPattern()
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            return r0
        L27:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r3)
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            return r0
    }
}
