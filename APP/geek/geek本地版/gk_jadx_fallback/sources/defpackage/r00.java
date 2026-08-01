package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class r00 implements java.util.concurrent.ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public final java.lang.Thread newThread(java.lang.Runnable r2) {
            r1 = this;
            q00 r0 = new q00
            r0.<init>(r2)
            return r0
    }
}
