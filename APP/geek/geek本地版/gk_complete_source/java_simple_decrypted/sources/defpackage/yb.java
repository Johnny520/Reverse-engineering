package defpackage;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yb implements ThreadFactory {
    public final /* synthetic */ String a;

    public /* synthetic */ yb(String r1) {
        this.a = r1;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable r3) {
        Thread r0 = new Thread(r3, this.a);
        r0.setPriority(10);
        return r0;
    }
}
