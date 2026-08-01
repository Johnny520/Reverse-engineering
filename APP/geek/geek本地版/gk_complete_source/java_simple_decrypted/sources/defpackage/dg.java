package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class dg implements ThreadFactory {
    public final AtomicInteger a;

    public dg() {
        this.a = new AtomicInteger(0);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable r3) {
        Thread r0 = new Thread(r3);
        r0.setName("arch_disk_io_" + this.a.getAndIncrement());
        return r0;
    }
}
