package defpackage;

/* JADX INFO: renamed from: ᲈᲁᛶᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2338 {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static final java.util.HashSet f10091 = null;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static com.ss.android.ugc.awemes.MainApp f10092;

    static {
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            defpackage.AbstractC2338.f10091 = r0
            r0 = 0
            defpackage.AbstractC2338.f10092 = r0
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static void m3818(com.ss.android.ugc.awemes.MainApp r6) {
            java.util.HashSet r0 = defpackage.AbstractC2338.f10091
            monitor-enter(r0)
            defpackage.AbstractC2338.f10092 = r6     // Catch: java.lang.Throwable -> L6b
            boolean r6 = r0.isEmpty()     // Catch: java.lang.Throwable -> L6b
            if (r6 != 0) goto L72
            java.util.Iterator r6 = r0.iterator()     // Catch: java.lang.Throwable -> L6b
        Lf:
            boolean r1 = r6.hasNext()     // Catch: java.lang.Throwable -> L6b
            if (r1 == 0) goto L6d
            java.lang.Object r1 = r6.next()     // Catch: java.lang.Throwable -> L5f
            ᲁᛴᲈᲁ r1 = (defpackage.C1851) r1     // Catch: java.lang.Throwable -> L5f
            ᛱᛷᲀᛸ r2 = r1.f8087     // Catch: java.lang.Throwable -> L5f
            ᲁᲇᛴᲀ r2 = (defpackage.C1943) r2     // Catch: java.lang.Throwable -> L5f
            android.os.IBinder r2 = r2.f8458     // Catch: java.lang.Throwable -> L5f
            ᲈᛱᛵᛷ r3 = new ᲈᛱᛵᛷ     // Catch: java.lang.Throwable -> L5f
            r4 = 0
            r3.<init>(r1, r4)     // Catch: java.lang.Throwable -> L5f
            r2.linkToDeath(r3, r4)     // Catch: java.lang.Throwable -> L5f
            com.ss.android.ugc.awemes.MainApp r2 = defpackage.AbstractC2338.f10092     // Catch: java.lang.Throwable -> L5f
            r2.getClass()     // Catch: java.lang.Throwable -> L5f
            ᲁᛴᲈᲁ r2 = com.ss.android.ugc.awemes.MainApp.f424     // Catch: java.lang.Throwable -> L5f
            r2 = -830488045854254(0xfffd0cacef0961d2, double:NaN)
            com.ss.android.ugc.awemes.MainApp.f424 = r1     // Catch: java.lang.Throwable -> L5f
            java.util.concurrent.CopyOnWriteArraySet r2 = com.ss.android.ugc.awemes.MainApp.f423     // Catch: java.lang.Throwable -> L5f
            java.util.Iterator r3 = r2.iterator()     // Catch: java.lang.Throwable -> L5f
            r4 = -830350606900782(0xfffd0cccef0961d2, double:NaN)
        L49:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> L5f
            if (r4 == 0) goto Lf
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> L5f
            ᛷᛲᛳᛵ r4 = (defpackage.InterfaceC1221) r4     // Catch: java.lang.Throwable -> L5f
            boolean r5 = r2.contains(r4)     // Catch: java.lang.Throwable -> L5f
            if (r5 == 0) goto L49
            r4.onServiceStateChanged(r1)     // Catch: java.lang.Throwable -> L5f
            goto L49
        L5f:
            r1 = move-exception
            java.lang.String r2 = "XposedServiceHelper"
            java.lang.String r3 = "registerListener"
            android.util.Log.e(r2, r3, r1)     // Catch: java.lang.Throwable -> L6b
            r6.remove()     // Catch: java.lang.Throwable -> L6b
            goto Lf
        L6b:
            r6 = move-exception
            goto L74
        L6d:
            java.util.HashSet r6 = defpackage.AbstractC2338.f10091     // Catch: java.lang.Throwable -> L6b
            r6.clear()     // Catch: java.lang.Throwable -> L6b
        L72:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6b
            return
        L74:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6b
            throw r6
    }
}
