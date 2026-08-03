package androidx.emoji2.text;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: androidx.emoji2.text.a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ThreadFactoryC0476a implements ThreadFactory {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f1346a;

    public /* synthetic */ ThreadFactoryC0476a(String r1) {
        this.f1346a = r1;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable r3) {
        Thread r02 = new Thread(r3, this.f1346a);
        r02.setPriority(10);
        return r02;
    }
}
