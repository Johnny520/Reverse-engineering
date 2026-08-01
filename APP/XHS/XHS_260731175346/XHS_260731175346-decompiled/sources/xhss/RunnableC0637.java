package xhss;

/* JADX INFO: renamed from: xhss.ᛷᛳᛴᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0637 implements java.lang.Runnable {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f2189;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final /* synthetic */ android.content.Context f2190;

    public /* synthetic */ RunnableC0637(android.content.Context r1, int r2) {
            r0 = this;
            r0.f2189 = r2
            r0.f2190 = r1
            r0.<init>()
            return
    }

    public /* synthetic */ RunnableC0637(androidx.profileinstaller.ProfileInstallerInitializer r1, android.content.Context r2) {
            r0 = this;
            r1 = 0
            r0.f2189 = r1
            r0.<init>()
            r0.f2190 = r2
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r10 = this;
            int r0 = r10.f2189
            android.content.Context r10 = r10.f2190
            switch(r0) {
                case 0: goto L2d;
                case 1: goto L13;
                default: goto L7;
            }
        L7:
            xhss.ᛲᲀᛸᛶ r0 = new xhss.ᛲᲀᛸᛶ
            r0.<init>()
            xhss.ᛶᛵᲇᛸ r1 = xhss.AbstractC0007.f148
            r2 = 0
            xhss.AbstractC0007.m99(r10, r0, r1, r2)
            return
        L13:
            java.util.concurrent.ThreadPoolExecutor r3 = new java.util.concurrent.ThreadPoolExecutor
            java.util.concurrent.LinkedBlockingQueue r9 = new java.util.concurrent.LinkedBlockingQueue
            r9.<init>()
            r4 = 0
            r5 = 1
            r6 = 0
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.MILLISECONDS
            r3.<init>(r4, r5, r6, r8, r9)
            xhss.ᛷᛳᛴᛸ r0 = new xhss.ᛷᛳᛴᛸ
            r1 = 2
            r0.<init>(r10, r1)
            r3.execute(r0)
            return
        L2d:
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            android.os.Handler r0 = xhss.AbstractC0135.m365(r0)
            java.util.Random r1 = new java.util.Random
            r1.<init>()
            r2 = 1000(0x3e8, float:1.401E-42)
            r3 = 1
            int r2 = java.lang.Math.max(r2, r3)
            int r1 = r1.nextInt(r2)
            xhss.ᛷᛳᛴᛸ r2 = new xhss.ᛷᛳᛴᛸ
            r2.<init>(r10, r3)
            int r1 = r1 + 5000
            long r3 = (long) r1
            r0.postDelayed(r2, r3)
            return
    }
}
