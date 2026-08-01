package p000;

/* JADX INFO: renamed from: qr */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class ThreadFactoryC0734qr implements java.util.concurrent.ThreadFactory {

    /* JADX INFO: renamed from: α */
    public final java.util.concurrent.atomic.AtomicInteger f9084;

    public ThreadFactoryC0734qr() {
            r2 = this;
            r2.<init>()
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r1 = 0
            r0.<init>(r1)
            r2.f9084 = r0
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
            java.util.concurrent.atomic.AtomicInteger r2 = r2.f9084
            int r2 = r2.getAndIncrement()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r0.setName(r2)
            return r0
    }
}
