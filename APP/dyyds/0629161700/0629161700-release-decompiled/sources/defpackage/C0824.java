package defpackage;

/* JADX INFO: renamed from: ᛵᛲᛴᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0824 extends defpackage.AbstractC0762 {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public static final defpackage.ExecutorC1165 f3789 = null;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public static volatile defpackage.C0824 f3790;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final defpackage.C0938 f3791;

    static {
            ᛶᲇᛱᛱ r0 = new ᛶᲇᛱᛱ
            r1 = 0
            r0.<init>(r1)
            defpackage.C0824.f3789 = r0
            return
    }

    public C0824() {
            r1 = this;
            r1.<init>()
            ᛵᛷᲇᛵ r0 = new ᛵᛷᲇᛵ
            r0.<init>()
            r1.f3791 = r0
            return
    }

    /* JADX INFO: renamed from: ᛴᛸᲀ, reason: contains not printable characters */
    public static defpackage.C0824 m1752() {
            ᛵᛲᛴᛵ r0 = defpackage.C0824.f3790
            if (r0 == 0) goto L7
            ᛵᛲᛴᛵ r0 = defpackage.C0824.f3790
            return r0
        L7:
            java.lang.Class<ᛵᛲᛴᛵ> r0 = defpackage.C0824.class
            monitor-enter(r0)
            ᛵᛲᛴᛵ r1 = defpackage.C0824.f3790     // Catch: java.lang.Throwable -> L16
            if (r1 != 0) goto L18
            ᛵᛲᛴᛵ r1 = new ᛵᛲᛴᛵ     // Catch: java.lang.Throwable -> L16
            r1.<init>()     // Catch: java.lang.Throwable -> L16
            defpackage.C0824.f3790 = r1     // Catch: java.lang.Throwable -> L16
            goto L18
        L16:
            r1 = move-exception
            goto L1c
        L18:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            ᛵᛲᛴᛵ r0 = defpackage.C0824.f3790
            return r0
        L1c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            throw r1
    }
}
