package p000;

/* JADX INFO: renamed from: p2 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0672p2 extends java.util.logging.Handler {

    /* JADX INFO: renamed from: α */
    public static final p000.C0672p2 f8395 = null;

    static {
            p2 r0 = new p2
            r0.<init>()
            p000.C0672p2.f8395 = r0
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
            r8.getClass()
            java.util.concurrent.CopyOnWriteArraySet r7 = p000.AbstractC0608o2.f7871
            java.lang.String r7 = r8.getLoggerName()
            r7.getClass()
            java.util.logging.Level r0 = r8.getLevel()
            int r0 = r0.intValue()
            java.util.logging.Level r1 = java.util.logging.Level.INFO
            int r2 = r1.intValue()
            r3 = 4
            if (r0 <= r2) goto L1f
            r0 = 5
            goto L30
        L1f:
            java.util.logging.Level r0 = r8.getLevel()
            int r0 = r0.intValue()
            int r1 = r1.intValue()
            if (r0 != r1) goto L2f
            r0 = r3
            goto L30
        L2f:
            r0 = 3
        L30:
            java.lang.String r1 = r8.getMessage()
            r1.getClass()
            java.lang.Throwable r8 = r8.getThrown()
            java.util.Map r2 = p000.AbstractC0608o2.f7872
            java.lang.Object r2 = r2.get(r7)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto L4b
            r2 = 23
            java.lang.String r2 = p000.q02.m4693(r7, r2)
        L4b:
            boolean r7 = android.util.Log.isLoggable(r2, r0)
            if (r7 == 0) goto L8f
            r7 = 10
            if (r8 == 0) goto L6b
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r1)
            r4.append(r7)
            java.lang.String r8 = android.util.Log.getStackTraceString(r8)
            r4.append(r8)
            java.lang.String r1 = r4.toString()
        L6b:
            int r8 = r1.length()
            r4 = 0
        L70:
            if (r4 >= r8) goto L8f
            int r5 = p000.q02.m4668(r1, r7, r4, r3)
            r6 = -1
            if (r5 == r6) goto L7a
            goto L7b
        L7a:
            r5 = r8
        L7b:
            int r6 = r4 + 4000
            int r6 = java.lang.Math.min(r5, r6)
            java.lang.String r4 = r1.substring(r4, r6)
            android.util.Log.println(r0, r2, r4)
            if (r6 < r5) goto L8d
            int r4 = r6 + 1
            goto L70
        L8d:
            r4 = r6
            goto L7b
        L8f:
            return
    }
}
