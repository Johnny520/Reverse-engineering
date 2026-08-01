package defpackage;

/* JADX INFO: renamed from: ᛸᛴᛱᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1467 {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final java.util.ArrayDeque f6497;

    public C1467(int r2) {
            r1 = this;
            switch(r2) {
                case 1: goto Lf;
                default: goto L3;
            }
        L3:
            r1.<init>()
            java.util.ArrayDeque r2 = new java.util.ArrayDeque
            r0 = 0
            r2.<init>(r0)
            r1.f6497 = r2
            return
        Lf:
            r1.<init>()
            java.util.ArrayDeque r2 = new java.util.ArrayDeque
            r2.<init>()
            r1.f6497 = r2
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public synchronized void m2662(defpackage.C0876 r2) {
            r1 = this;
            monitor-enter(r1)
            r0 = 0
            r2.f3956 = r0     // Catch: java.lang.Throwable -> Ld
            r2.f3954 = r0     // Catch: java.lang.Throwable -> Ld
            java.util.ArrayDeque r0 = r1.f6497     // Catch: java.lang.Throwable -> Ld
            r0.offer(r2)     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r1)
            return
        Ld:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Ld
            throw r2
    }
}
