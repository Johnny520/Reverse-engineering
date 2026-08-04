package yyds;

import java.util.concurrent.locks.LockSupport;

/* JADX INFO: renamed from: yyds.ᛳᲁᛴᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0701 extends AbstractC0191 {

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final AbstractC0467 f3306;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final Thread f3307;

    public C0701(InterfaceC2213 interfaceC2213, Thread thread, AbstractC0467 abstractC0467) {
        super(interfaceC2213, true);
        this.f3307 = thread;
        this.f3306 = abstractC0467;
    }

    @Override // yyds.AbstractC0986
    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final void mo1619(Object obj) {
        Thread threadCurrentThread = Thread.currentThread();
        Thread thread = this.f3307;
        if (AbstractC1544.m3188(threadCurrentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
