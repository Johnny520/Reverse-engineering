package p162l3;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: l3.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ThreadFactoryC2447a implements ThreadFactory {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f8051a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, this.f8051a);
        thread.setPriority(10);
        return thread;
    }
}
