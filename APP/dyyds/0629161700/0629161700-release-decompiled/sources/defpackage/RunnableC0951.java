package defpackage;

/* JADX INFO: renamed from: ᛵᛸᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0951 implements java.lang.Runnable {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final /* synthetic */ java.lang.Object f4255;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ java.lang.Object f4256;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f4257;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final /* synthetic */ java.lang.Object f4258;

    public /* synthetic */ RunnableC0951(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3, int r4) {
            r0 = this;
            r0.f4257 = r4
            r0.f4256 = r1
            r0.f4255 = r2
            r0.f4258 = r3
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r4 = this;
            int r0 = r4.f4257
            switch(r0) {
                case 0: goto L15;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r4.f4256
            com.ss.android.ugc.awemes.MainActivity r0 = (com.ss.android.ugc.awemes.MainActivity) r0
            java.lang.Object r1 = r4.f4255
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r4 = r4.f4258
            java.util.LinkedHashMap r4 = (java.util.LinkedHashMap) r4
            com.ss.android.ugc.awemes.MainActivity.m291(r0, r1, r4)
            return
        L15:
            java.lang.Object r0 = r4.f4256
            ᛷᲁᛷᛶ r0 = (defpackage.C1372) r0
            java.lang.Object r1 = r4.f4255
            ᛸᛷᲀᲈ r1 = (defpackage.AbstractC1533) r1
            java.lang.Object r4 = r4.f4258
            java.util.concurrent.ThreadPoolExecutor r4 = (java.util.concurrent.ThreadPoolExecutor) r4
            android.content.Context r0 = r0.f6000     // Catch: java.lang.Throwable -> L42
            ᛶᲁᲇᛸ r0 = defpackage.AbstractC1592.m2888(r0)     // Catch: java.lang.Throwable -> L42
            if (r0 == 0) goto L47
            java.lang.Object r2 = r0.f9097     // Catch: java.lang.Throwable -> L42
            ᲇᛱᲈᛲ r2 = (defpackage.InterfaceC1991) r2     // Catch: java.lang.Throwable -> L42
            ᛶᲇᲀᲀ r2 = (defpackage.C1174) r2     // Catch: java.lang.Throwable -> L42
            java.lang.Object r3 = r2.f5297     // Catch: java.lang.Throwable -> L42
            monitor-enter(r3)     // Catch: java.lang.Throwable -> L42
            r2.f5301 = r4     // Catch: java.lang.Throwable -> L44
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L44
            java.lang.Object r0 = r0.f9097     // Catch: java.lang.Throwable -> L42
            ᲇᛱᲈᛲ r0 = (defpackage.InterfaceC1991) r0     // Catch: java.lang.Throwable -> L42
            ᲈᛶᛱᛱ r2 = new ᲈᛶᛱᛱ     // Catch: java.lang.Throwable -> L42
            r2.<init>(r1, r4)     // Catch: java.lang.Throwable -> L42
            r0.mo2284(r2)     // Catch: java.lang.Throwable -> L42
            goto L55
        L42:
            r0 = move-exception
            goto L4f
        L44:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L44
            throw r0     // Catch: java.lang.Throwable -> L42
        L47:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L42
            java.lang.String r2 = "EmojiCompat font provider not available on this device."
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L42
            throw r0     // Catch: java.lang.Throwable -> L42
        L4f:
            r1.mo1878(r0)
            r4.shutdown()
        L55:
            return
    }
}
