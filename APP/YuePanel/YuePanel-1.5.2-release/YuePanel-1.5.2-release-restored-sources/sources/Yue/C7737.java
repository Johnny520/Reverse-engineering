package Yue;

import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: Yue.ۥۢۡ۟ۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C7737 {

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6399
    public static final String f3052 = "DefaultDispatcher";

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final int f23277 = 0;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final int f23278 = 1;

    /* JADX INFO: renamed from: ۥ۟ */
    @InterfaceC5568
    public static final long f3053 = C7707.m24507("kotlinx.coroutines.scheduler.resolution.ns", 100000, 0, 0, 12, null);

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @InterfaceC5568
    public static final int f23273 = C7707.m24506("kotlinx.coroutines.scheduler.core.pool.size", C7007.m21661(C7705.m3805(), 2), 1, 0, 8, null);

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    @InterfaceC5568
    public static final int f23274 = C7707.m24506("kotlinx.coroutines.scheduler.max.pool.size", ExecutorC4239.f8608, 0, ExecutorC4239.f8608, 4, null);

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    @InterfaceC5568
    public static final long f23275 = TimeUnit.SECONDS.toNanos(C7707.m24507("kotlinx.coroutines.scheduler.keep.alive.sec", 60, 0, 0, 12, null));

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    @InterfaceC6399
    @InterfaceC5568
    public static AbstractC7241 f23276 = C6351.f2029;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    @InterfaceC6399
    @InterfaceC5568
    public static final InterfaceC7726 f23279 = new C7727(0);

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    @InterfaceC6399
    @InterfaceC5568
    public static final InterfaceC7726 f23280 = new C7727(1);

    /* JADX INFO: renamed from: ۥ */
    public static final boolean m3834(@InterfaceC6399 AbstractRunnableC7725 abstractRunnableC7725) {
        return abstractRunnableC7725.f23251.mo17604() == 1;
    }
}
