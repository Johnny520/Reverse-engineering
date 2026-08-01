package defpackage;

/* JADX INFO: renamed from: ᲀᛸᛴᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1721 extends java.util.logging.Handler {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static final defpackage.C1721 f7638 = null;

    static {
            ᲀᛸᛴᛲ r0 = new ᲀᛸᛴᛲ
            r0.<init>()
            defpackage.C1721.f7638 = r0
            return
    }

    @Override // java.util.logging.Handler
    public final void close() {
            r0 = this;
            return
    }

    @Override // java.util.logging.Handler
    public final void flush() {
            r0 = this;
            return
    }

    @Override // java.util.logging.Handler
    public final void publish(java.util.logging.LogRecord r8) {
            r7 = this;
            java.util.concurrent.CopyOnWriteArraySet r7 = defpackage.AbstractC2178.f9257
            java.lang.String r7 = r8.getLoggerName()
            java.util.logging.Level r0 = r8.getLevel()
            int r0 = r0.intValue()
            java.util.logging.Level r1 = java.util.logging.Level.INFO
            int r2 = r1.intValue()
            r3 = 4
            if (r0 <= r2) goto L19
            r0 = 5
            goto L2a
        L19:
            java.util.logging.Level r0 = r8.getLevel()
            int r0 = r0.intValue()
            int r1 = r1.intValue()
            if (r0 != r1) goto L29
            r0 = r3
            goto L2a
        L29:
            r0 = 3
        L2a:
            java.lang.String r1 = r8.getMessage()
            java.lang.Throwable r8 = r8.getThrown()
            java.util.Map r2 = defpackage.AbstractC2178.f9258
            java.lang.Object r2 = r2.get(r7)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto L42
            r2 = 23
            java.lang.String r2 = defpackage.AbstractC1347.m2523(r2, r7)
        L42:
            boolean r7 = android.util.Log.isLoggable(r2, r0)
            if (r7 == 0) goto L83
            r7 = 10
            if (r8 == 0) goto L5f
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r1)
            r4.append(r7)
            java.lang.String r8 = android.util.Log.getStackTraceString(r8)
            r4.append(r8)
            java.lang.String r1 = r4.toString()
        L5f:
            int r8 = r1.length()
            r4 = 0
        L64:
            if (r4 >= r8) goto L83
            int r5 = defpackage.AbstractC1347.m2514(r1, r7, r4, r3)
            r6 = -1
            if (r5 == r6) goto L6e
            goto L6f
        L6e:
            r5 = r8
        L6f:
            int r6 = r4 + 4000
            int r6 = java.lang.Math.min(r5, r6)
            java.lang.String r4 = r1.substring(r4, r6)
            android.util.Log.println(r0, r2, r4)
            if (r6 < r5) goto L81
            int r4 = r6 + 1
            goto L64
        L81:
            r4 = r6
            goto L6f
        L83:
            return
    }
}
