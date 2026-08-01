package xhss;

/* JADX INFO: renamed from: xhss.ᛲᛳᲈᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0150 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public static final android.graphics.PorterDuff.Mode f629 = null;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public static xhss.C0150 f630;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public xhss.C0117 f631;

    static {
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            xhss.C0150.f629 = r0
            return
    }

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public static synchronized void m393() {
            java.lang.Class<xhss.ᛲᛳᲈᛲ> r0 = xhss.C0150.class
            monitor-enter(r0)
            xhss.ᛲᛳᲈᛲ r1 = xhss.C0150.f630     // Catch: java.lang.Throwable -> L26
            if (r1 != 0) goto L28
            xhss.ᛲᛳᲈᛲ r1 = new xhss.ᛲᛳᲈᛲ     // Catch: java.lang.Throwable -> L26
            r1.<init>()     // Catch: java.lang.Throwable -> L26
            xhss.C0150.f630 = r1     // Catch: java.lang.Throwable -> L26
            xhss.ᛱᲈᲁᛴ r2 = xhss.C0117.m310()     // Catch: java.lang.Throwable -> L26
            r1.f631 = r2     // Catch: java.lang.Throwable -> L26
            xhss.ᛲᛳᲈᛲ r1 = xhss.C0150.f630     // Catch: java.lang.Throwable -> L26
            xhss.ᛱᲈᲁᛴ r1 = r1.f631     // Catch: java.lang.Throwable -> L26
            xhss.ᛳᛲᲀᲈ r2 = new xhss.ᛳᛲᲀᲈ     // Catch: java.lang.Throwable -> L26
            r3 = 0
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L26
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L26
            r1.f506 = r2     // Catch: java.lang.Throwable -> L23
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

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final synchronized android.graphics.drawable.Drawable m394(android.content.Context r2, int r3) {
            r1 = this;
            monitor-enter(r1)
            xhss.ᛱᲈᲁᛴ r0 = r1.f631     // Catch: java.lang.Throwable -> L9
            android.graphics.drawable.Drawable r2 = r0.m318(r2, r3)     // Catch: java.lang.Throwable -> L9
            monitor-exit(r1)
            return r2
        L9:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L9
            throw r2
    }
}
