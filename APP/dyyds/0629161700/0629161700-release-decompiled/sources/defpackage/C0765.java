package defpackage;

/* JADX INFO: renamed from: ᛴᲁᛴᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0765 {

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static final java.util.ArrayDeque f3558 = null;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public java.lang.Object f3559;

    static {
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r1 = 0
            r0.<init>(r1)
            defpackage.C0765.f3558 = r0
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static defpackage.C0765 m1695(java.lang.Object r2) {
            java.util.ArrayDeque r0 = defpackage.C0765.f3558
            monitor-enter(r0)
            java.lang.Object r1 = r0.poll()     // Catch: java.lang.Throwable -> L14
            ᛴᲁᛴᲇ r1 = (defpackage.C0765) r1     // Catch: java.lang.Throwable -> L14
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            if (r1 != 0) goto L11
            ᛴᲁᛴᲇ r1 = new ᛴᲁᛴᲇ
            r1.<init>()
        L11:
            r1.f3559 = r2
            return r1
        L14:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            throw r2
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof defpackage.C0765
            if (r0 == 0) goto L12
            ᛴᲁᛴᲇ r2 = (defpackage.C0765) r2
            java.lang.Object r1 = r1.f3559
            java.lang.Object r2 = r2.f3559
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L12
            r1 = 1
            return r1
        L12:
            r1 = 0
            return r1
    }

    public final int hashCode() {
            r0 = this;
            java.lang.Object r0 = r0.f3559
            int r0 = r0.hashCode()
            return r0
    }
}
