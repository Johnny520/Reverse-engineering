package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۢ۠ۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class ThreadFactoryC4363 implements java.util.concurrent.ThreadFactory {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final java.util.concurrent.ThreadFactory f13905;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final java.util.concurrent.atomic.AtomicInteger f13906;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final java.lang.String f13907;

    public ThreadFactoryC4363(java.lang.String r3) {
            r2 = this;
            r2.<init>()
            java.util.concurrent.ThreadFactory r0 = java.util.concurrent.Executors.defaultThreadFactory()
            r2.f13905 = r0
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r1 = 1
            r0.<init>(r1)
            r2.f13906 = r0
            r2.f13907 = r3
            return
    }

    @Override // java.util.concurrent.ThreadFactory
    public java.lang.Thread newThread(java.lang.Runnable r3) {
            r2 = this;
            java.util.concurrent.ThreadFactory r0 = r2.f13905
            java.lang.Thread r3 = r0.newThread(r3)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r2.f13907
            r0.append(r1)
            java.lang.String r1 = "-"
            r0.append(r1)
            java.util.concurrent.atomic.AtomicInteger r1 = r2.f13906
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3.setName(r0)
            return r3
    }
}
