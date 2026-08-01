package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yb implements java.util.concurrent.ThreadFactory {
    public final /* synthetic */ java.lang.String a;

    public /* synthetic */ yb(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // java.util.concurrent.ThreadFactory
    public final java.lang.Thread newThread(java.lang.Runnable r3) {
            r2 = this;
            java.lang.Thread r0 = new java.lang.Thread
            java.lang.String r1 = r2.a
            r0.<init>(r3, r1)
            r3 = 10
            r0.setPriority(r3)
            return r0
    }
}
