package Yue;

import android.os.Handler;

/* JADX INFO: renamed from: Yue.ۥ۠ۤۡ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C5240 {

    /* JADX INFO: renamed from: Yue.ۥ۠ۤۡ۟$ۥ */
    @InterfaceC7507({"SMAP\nHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Handler.kt\nandroidx/core/os/HandlerKt$postAtTime$runnable$1\n*L\n1#1,69:1\n*E\n"})
    public static final class RunnableC0678 implements Runnable {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC5122<C8107> f12479;

        public RunnableC0678(InterfaceC5122<C8107> interfaceC5122) {
            this.f12479 = interfaceC5122;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f12479.invoke();
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۤۡ۟$ۥ۟ */
    @InterfaceC7507({"SMAP\nHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Handler.kt\nandroidx/core/os/HandlerKt$postDelayed$runnable$1\n*L\n1#1,69:1\n*E\n"})
    public static final class RunnableC0679 implements Runnable {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC5122<C8107> f12480;

        public RunnableC0679(InterfaceC5122<C8107> interfaceC5122) {
            this.f12480 = interfaceC5122;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f12480.invoke();
        }
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ */
    public static final Runnable m2004(@InterfaceC6399 Handler handler, long j, @InterfaceC6489 Object obj, @InterfaceC6399 InterfaceC5122<C8107> interfaceC5122) {
        RunnableC0678 runnableC0678 = new RunnableC0678(interfaceC5122);
        handler.postAtTime(runnableC0678, obj, j);
        return runnableC0678;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static /* synthetic */ Runnable m2005(Handler handler, long j, Object obj, InterfaceC5122 interfaceC5122, int i, Object obj2) {
        if ((i & 2) != 0) {
            obj = null;
        }
        RunnableC0678 runnableC0678 = new RunnableC0678(interfaceC5122);
        handler.postAtTime(runnableC0678, obj, j);
        return runnableC0678;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final Runnable m16054(@InterfaceC6399 Handler handler, long j, @InterfaceC6489 Object obj, @InterfaceC6399 InterfaceC5122<C8107> interfaceC5122) {
        RunnableC0679 runnableC0679 = new RunnableC0679(interfaceC5122);
        if (obj == null) {
            handler.postDelayed(runnableC0679, j);
        } else {
            C5234.m16034(handler, runnableC0679, obj, j);
        }
        return runnableC0679;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static /* synthetic */ Runnable m16055(Handler handler, long j, Object obj, InterfaceC5122 interfaceC5122, int i, Object obj2) {
        if ((i & 2) != 0) {
            obj = null;
        }
        RunnableC0679 runnableC0679 = new RunnableC0679(interfaceC5122);
        if (obj == null) {
            handler.postDelayed(runnableC0679, j);
        } else {
            C5234.m16034(handler, runnableC0679, obj, j);
        }
        return runnableC0679;
    }
}
