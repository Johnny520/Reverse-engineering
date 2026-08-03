package Yue;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: Yue.ۥ۠ۥۨ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5515 extends AbstractC5544 {

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f13494 = AtomicIntegerFieldUpdater.newUpdater(C5515.class, "_invoked");

    @InterfaceC6399
    private volatile /* synthetic */ int _invoked = 0;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    @InterfaceC6399
    public final InterfaceC5124<Throwable, C8107> f13495;

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Yue.ۥۣ۠ۡ۟<? super java.lang.Throwable, Yue.ۥۣۢ۠ۤ> */
    /* JADX WARN: Multi-variable type inference failed */
    public C5515(@InterfaceC6399 InterfaceC5124<? super Throwable, C8107> interfaceC5124) {
        this.f13495 = interfaceC5124;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // Yue.InterfaceC5124
    public /* bridge */ /* synthetic */ C8107 invoke(Throwable th) {
        mo9329(th);
        return C8107.f3222;
    }

    @Override // Yue.AbstractC4052
    /* JADX INFO: renamed from: ۥ۟۟ۦۤ */
    public void mo9329(@InterfaceC6489 Throwable th) {
        if (f13494.compareAndSet(this, 0, 1)) {
            this.f13495.invoke(th);
        }
    }
}
