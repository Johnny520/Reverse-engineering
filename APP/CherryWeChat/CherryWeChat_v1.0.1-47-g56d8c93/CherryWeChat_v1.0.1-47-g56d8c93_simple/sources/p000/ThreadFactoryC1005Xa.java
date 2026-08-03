package p000;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: Xa */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ThreadFactoryC1005Xa implements ThreadFactory {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f3207a;

    public /* synthetic */ ThreadFactoryC1005Xa(String r1) {
        this.f3207a = r1;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable r3) {
        Thread r0 = new Thread(r3, this.f3207a);
        r0.setPriority(10);
        return r0;
    }
}
