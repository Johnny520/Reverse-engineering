package xhss;

/* JADX INFO: renamed from: xhss.ᲀᛸᲁᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0888 implements java.lang.Runnable {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f2866;

    public /* synthetic */ RunnableC0888() {
            r1 = this;
            r0 = 1
            r1.f2866 = r0
            r1.<init>()
            return
    }

    public RunnableC0888(xhss.C1037 r1, int r2) {
            r0 = this;
            r1 = 0
            r0.f2866 = r1
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    private final void m1452() {
            r0 = this;
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r0 = this;
            int r0 = r0.f2866
            switch(r0) {
                case 0: goto L23;
                default: goto L5;
            }
        L5:
            java.lang.String r0 = "EmojiCompat.EmojiCompatInitializer.run"
            android.os.Trace.beginSection(r0)     // Catch: java.lang.Throwable -> L1e
            xhss.ᛵᲁᛱᲁ r0 = xhss.C0514.f1869     // Catch: java.lang.Throwable -> L1e
            if (r0 == 0) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            if (r0 == 0) goto L1a
            xhss.ᛵᲁᛱᲁ r0 = xhss.C0514.m921()     // Catch: java.lang.Throwable -> L1e
            r0.m923()     // Catch: java.lang.Throwable -> L1e
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
