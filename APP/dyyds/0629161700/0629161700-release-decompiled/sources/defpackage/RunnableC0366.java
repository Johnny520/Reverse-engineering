package defpackage;

/* JADX INFO: renamed from: ᛲᲁᲇᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0366 implements java.lang.Runnable {

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f1905;

    public /* synthetic */ RunnableC0366() {
            r1 = this;
            r0 = 1
            r1.f1905 = r0
            r1.<init>()
            return
    }

    public RunnableC0366(defpackage.C1180 r1, int r2) {
            r0 = this;
            r1 = 0
            r0.f1905 = r1
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    private final void m1090() {
            r0 = this;
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r0 = this;
            int r0 = r0.f1905
            switch(r0) {
                case 0: goto L23;
                default: goto L5;
            }
        L5:
            java.lang.String r0 = "EmojiCompat.EmojiCompatInitializer.run"
            android.os.Trace.beginSection(r0)     // Catch: java.lang.Throwable -> L1e
            ᛴᲁᛶᲈ r0 = defpackage.C0766.f3561     // Catch: java.lang.Throwable -> L1e
            if (r0 == 0) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            if (r0 == 0) goto L1a
            ᛴᲁᛶᲈ r0 = defpackage.C0766.m1696()     // Catch: java.lang.Throwable -> L1e
            r0.m1699()     // Catch: java.lang.Throwable -> L1e
        L1a:
            android.os.Trace.endSection()
            return
        L1e:
            r0 = move-exception
            android.os.Trace.endSection()
            throw r0
        L23:
            return
    }
}
