package defpackage;

/* JADX INFO: renamed from: ᛵᲈᛳᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0991 extends java.lang.Exception {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public static final java.lang.StackTraceElement[] f4421 = null;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public int f4422;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public defpackage.InterfaceC1711 f4423;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final java.util.List f4424;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public java.lang.Class f4425;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final java.lang.String f4426;

    static {
            r0 = 0
            java.lang.StackTraceElement[] r0 = new java.lang.StackTraceElement[r0]
            defpackage.C0991.f4421 = r0
            return
    }

    public C0991(java.lang.String r2) {
            r1 = this;
            java.util.List r0 = java.util.Collections.EMPTY_LIST
            r1.<init>(r0, r2)
            return
    }

    public C0991(java.util.List r1, java.lang.String r2) {
            r0 = this;
            r0.<init>()
            r0.f4426 = r2
            java.lang.StackTraceElement[] r2 = defpackage.C0991.f4421
            r0.setStackTrace(r2)
            r0.f4424 = r1
            return
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public static void m1948(java.lang.Throwable r1, java.lang.Appendable r2) {
            java.lang.Class r0 = r1.getClass()     // Catch: java.io.IOException -> L20
            java.lang.String r0 = r0.toString()     // Catch: java.io.IOException -> L20
            java.lang.Appendable r2 = r2.append(r0)     // Catch: java.io.IOException -> L20
            java.lang.String r0 = ": "
            java.lang.Appendable r2 = r2.append(r0)     // Catch: java.io.IOException -> L20
            java.lang.String r0 = r1.getMessage()     // Catch: java.io.IOException -> L20
            java.lang.Appendable r2 = r2.append(r0)     // Catch: java.io.IOException -> L20
            r0 = 10
            r2.append(r0)     // Catch: java.io.IOException -> L20
            return
        L20:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            r2.<init>(r1)
            throw r2
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static void m1949(java.lang.Throwable r1, java.util.ArrayList r2) {
            boolean r0 = r1 instanceof defpackage.C0991
            if (r0 == 0) goto L1c
            ᛵᲈᛳᛲ r1 = (defpackage.C0991) r1
            java.util.List r1 = r1.f4424
            java.util.Iterator r1 = r1.iterator()
        Lc:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L21
            java.lang.Object r0 = r1.next()
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            m1949(r0, r2)
            goto Lc
        L1c:
            if (r1 == 0) goto L21
            r2.add(r1)
        L21:
            return
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static void m1950(java.util.List r4, defpackage.C1941 r5) {
            int r0 = r4.size()
            r1 = 0
        L5:
            if (r1 >= r0) goto L3b
            java.lang.String r2 = "Cause ("
            r5.append(r2)
            int r2 = r1 + 1
            java.lang.String r3 = java.lang.String.valueOf(r2)
            r5.append(r3)
            java.lang.String r3 = " of "
            r5.append(r3)
            java.lang.String r3 = java.lang.String.valueOf(r0)
            r5.append(r3)
            java.lang.String r3 = "): "
            r5.append(r3)
            java.lang.Object r1 = r4.get(r1)
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            boolean r3 = r1 instanceof defpackage.C0991
            if (r3 == 0) goto L36
            ᛵᲈᛳᛲ r1 = (defpackage.C0991) r1
            r1.m1951(r5)
            goto L39
        L36:
            m1948(r1, r5)
        L39:
            r1 = r2
            goto L5
        L3b:
            return
    }

    @Override // java.lang.Throwable
    public final java.lang.Throwable fillInStackTrace() {
            r0 = this;
            return r0
    }

    @Override // java.lang.Throwable
    public final java.lang.String getMessage() {
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 71
            r0.<init>(r1)
            java.lang.String r1 = r6.f4426
            r0.append(r1)
            java.lang.Class r1 = r6.f4425
            java.lang.String r2 = ""
            java.lang.String r3 = ", "
            if (r1 == 0) goto L23
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r3)
            java.lang.Class r4 = r6.f4425
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            goto L24
        L23:
            r1 = r2
        L24:
            r0.append(r1)
            int r1 = r6.f4422
            r4 = 1
            if (r1 == 0) goto L50
            if (r1 == r4) goto L49
            r5 = 2
            if (r1 == r5) goto L46
            r5 = 3
            if (r1 == r5) goto L43
            r5 = 4
            if (r1 == r5) goto L40
            r5 = 5
            if (r1 == r5) goto L3d
            java.lang.String r1 = "null"
            goto L4b
        L3d:
            java.lang.String r1 = "MEMORY_CACHE"
            goto L4b
        L40:
            java.lang.String r1 = "RESOURCE_DISK_CACHE"
            goto L4b
        L43:
            java.lang.String r1 = "DATA_DISK_CACHE"
            goto L4b
        L46:
            java.lang.String r1 = "REMOTE"
            goto L4b
        L49:
            java.lang.String r1 = "LOCAL"
        L4b:
            java.lang.String r1 = r3.concat(r1)
            goto L51
        L50:
            r1 = r2
        L51:
            r0.append(r1)
            ᲀᛷᛶᲈ r1 = r6.f4423
            if (r1 == 0) goto L66
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r3)
            ᲀᛷᛶᲈ r2 = r6.f4423
            r1.append(r2)
            java.lang.String r2 = r1.toString()
        L66:
            r0.append(r2)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            m1949(r6, r1)
            boolean r6 = r1.isEmpty()
            if (r6 == 0) goto L7c
            java.lang.String r6 = r0.toString()
            return r6
        L7c:
            int r6 = r1.size()
            if (r6 != r4) goto L88
            java.lang.String r6 = "\nThere was 1 root cause:"
            r0.append(r6)
            goto L99
        L88:
            java.lang.String r6 = "\nThere were "
            r0.append(r6)
            int r6 = r1.size()
            r0.append(r6)
            java.lang.String r6 = " root causes:"
            r0.append(r6)
        L99:
            java.util.Iterator r6 = r1.iterator()
        L9d:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto Lcb
            java.lang.Object r1 = r6.next()
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            r2 = 10
            r0.append(r2)
            java.lang.Class r2 = r1.getClass()
            java.lang.String r2 = r2.getName()
            r0.append(r2)
            r2 = 40
            r0.append(r2)
            java.lang.String r1 = r1.getMessage()
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            goto L9d
        Lcb:
            java.lang.String r6 = "\n call GlideException#logRootCauses(String) for more detail"
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            return r6
    }

    @Override // java.lang.Throwable
    public final void printStackTrace() {
            r1 = this;
            java.io.PrintStream r0 = java.lang.System.err
            r1.m1951(r0)
            return
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(java.io.PrintStream r1) {
            r0 = this;
            r0.m1951(r1)
            return
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(java.io.PrintWriter r1) {
            r0 = this;
            r0.m1951(r1)
            return
    }

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final void m1951(java.lang.Appendable r2) {
            r1 = this;
            m1948(r1, r2)
            java.util.List r1 = r1.f4424
            ᲁᲇᛴᛴ r0 = new ᲁᲇᛴᛴ
            r0.<init>(r2)
            m1950(r1, r0)     // Catch: java.io.IOException -> Le
            return
        Le:
            r1 = move-exception
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            r2.<init>(r1)
            throw r2
    }

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final void m1952() {
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            m1949(r5, r0)
            int r5 = r0.size()
            r1 = 0
        Ld:
            if (r1 >= r5) goto L39
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Root cause ("
            r2.<init>(r3)
            int r3 = r1 + 1
            r2.append(r3)
            java.lang.String r4 = " of "
            r2.append(r4)
            r2.append(r5)
            java.lang.String r4 = ")"
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            java.lang.Object r1 = r0.get(r1)
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            java.lang.String r4 = "Glide"
            android.util.Log.i(r4, r2, r1)
            r1 = r3
            goto Ld
        L39:
            return
    }
}
