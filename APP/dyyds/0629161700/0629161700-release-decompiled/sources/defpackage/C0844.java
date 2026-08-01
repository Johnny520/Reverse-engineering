package defpackage;

/* JADX INFO: renamed from: ᛵᛲᲈᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0844 {

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public static defpackage.C0844 f3868;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static final android.graphics.PorterDuff.Mode f3869 = null;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public defpackage.C2070 f3870;

    static {
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            defpackage.C0844.f3869 = r0
            return
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public static synchronized void m1773() {
            java.lang.Class<ᛵᛲᲈᛲ> r0 = defpackage.C0844.class
            monitor-enter(r0)
            ᛵᛲᲈᛲ r1 = defpackage.C0844.f3868     // Catch: java.lang.Throwable -> L26
            if (r1 != 0) goto L28
            ᛵᛲᲈᛲ r1 = new ᛵᛲᲈᛲ     // Catch: java.lang.Throwable -> L26
            r1.<init>()     // Catch: java.lang.Throwable -> L26
            defpackage.C0844.f3868 = r1     // Catch: java.lang.Throwable -> L26
            ᲇᛶᛸᲈ r2 = defpackage.C2070.m3478()     // Catch: java.lang.Throwable -> L26
            r1.f3870 = r2     // Catch: java.lang.Throwable -> L26
            ᛵᛲᲈᛲ r1 = defpackage.C0844.f3868     // Catch: java.lang.Throwable -> L26
            ᲇᛶᛸᲈ r1 = r1.f3870     // Catch: java.lang.Throwable -> L26
            ᛳᛵᛴᛴ r2 = new ᛳᛵᛴᛴ     // Catch: java.lang.Throwable -> L26
            r3 = 0
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L26
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L26
            r1.f8893 = r2     // Catch: java.lang.Throwable -> L23
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L26
            goto L28
        L23:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L23
            throw r2     // Catch: java.lang.Throwable -> L26
        L26:
            r1 = move-exception
            goto L2a
        L28:
            monitor-exit(r0)
            return
        L2a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L26
            throw r1
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static synchronized defpackage.C0844 m1774() {
            java.lang.Class<ᛵᛲᲈᛲ> r0 = defpackage.C0844.class
            monitor-enter(r0)
            ᛵᛲᲈᛲ r1 = defpackage.C0844.f3868     // Catch: java.lang.Throwable -> Lb
            if (r1 != 0) goto Ld
            m1773()     // Catch: java.lang.Throwable -> Lb
            goto Ld
        Lb:
            r1 = move-exception
            goto L11
        Ld:
            ᛵᛲᲈᛲ r1 = defpackage.C0844.f3868     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r0)
            return r1
        L11:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            throw r1
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final synchronized android.graphics.drawable.Drawable m1775(android.content.Context r2, int r3) {
            r1 = this;
            monitor-enter(r1)
            ᲇᛶᛸᲈ r0 = r1.f3870     // Catch: java.lang.Throwable -> L9
            android.graphics.drawable.Drawable r2 = r0.m3482(r2, r3)     // Catch: java.lang.Throwable -> L9
            monitor-exit(r1)
            return r2
        L9:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L9
            throw r2
    }
}
