package defpackage;

/* JADX INFO: renamed from: ᛸᲈᛷᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class ThreadFactoryC1605 implements java.util.concurrent.ThreadFactory {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final java.util.concurrent.atomic.AtomicInteger f7099;

    public ThreadFactoryC1605() {
            r2 = this;
            r2.<init>()
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r1 = 0
            r0.<init>(r1)
            r2.f7099 = r0
            return
    }

    @Override // java.util.concurrent.ThreadFactory
    public final java.lang.Thread newThread(java.lang.Runnable r3) {
            r2 = this;
            java.lang.Thread r0 = new java.lang.Thread
            r0.<init>(r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r1 = "arch_disk_io_"
            r3.<init>(r1)
            java.util.concurrent.atomic.AtomicInteger r2 = r2.f7099
            int r2 = r2.getAndIncrement()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r0.setName(r2)
            return r0
    }
}
