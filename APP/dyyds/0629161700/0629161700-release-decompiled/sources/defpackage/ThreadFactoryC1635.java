package defpackage;

/* JADX INFO: renamed from: ᲀᛲᲁᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class ThreadFactoryC1635 implements java.util.concurrent.ThreadFactory {

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final java.util.concurrent.atomic.AtomicInteger f7318;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final java.lang.String f7319;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final boolean f7320;

    public ThreadFactoryC1635(defpackage.ThreadFactoryC0773 r1, java.lang.String r2, boolean r3) {
            r0 = this;
            r0.<init>()
            java.util.concurrent.atomic.AtomicInteger r1 = new java.util.concurrent.atomic.AtomicInteger
            r1.<init>()
            r0.f7318 = r1
            r0.f7319 = r2
            r0.f7320 = r3
            return
    }

    @Override // java.util.concurrent.ThreadFactory
    public final java.lang.Thread newThread(java.lang.Runnable r3) {
            r2 = this;
            ᛱᲈᛷᲀ r0 = new ᛱᲈᛷᲀ
            r1 = 3
            r0.<init>(r2, r1, r3)
            ᛳᛲᲇᛸ r3 = new ᛳᛲᲇᛸ
            r3.<init>(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "glide-"
            r0.<init>(r1)
            java.lang.String r1 = r2.f7319
            r0.append(r1)
            java.lang.String r1 = "-thread-"
            r0.append(r1)
            java.util.concurrent.atomic.AtomicInteger r2 = r2.f7318
            int r2 = r2.getAndIncrement()
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            r3.setName(r2)
            return r3
    }
}
