package Yue;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: Yue.ۥۡۧۤۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C7239 extends AbstractC4746 {

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final int f21880;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final int f21881;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public final long f21882;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    @InterfaceC6399
    public final String f21883;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    @InterfaceC6399
    public ExecutorC4239 f21884;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C7239() {
        this(0, 0, 0L, null, 15, null);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧ۠, reason: contains not printable characters */
    private final ExecutorC4239 m22673() {
        return new ExecutorC4239(this.f21880, this.f21881, this.f21882, this.f21883);
    }

    @Override // Yue.AbstractC4746, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws InterruptedException {
        this.f21884.close();
    }

    @Override // Yue.AbstractC4232
    public void dispatch(@InterfaceC6399 InterfaceC4225 interfaceC4225, @InterfaceC6399 Runnable runnable) {
        ExecutorC4239.m12189(this.f21884, runnable, null, false, 6, null);
    }

    @Override // Yue.AbstractC4232
    public void dispatchYield(@InterfaceC6399 InterfaceC4225 interfaceC4225, @InterfaceC6399 Runnable runnable) {
        ExecutorC4239.m12189(this.f21884, runnable, null, true, 2, null);
    }

    @Override // Yue.AbstractC4746
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۧ۟ */
    public Executor mo12605() {
        return this.f21884;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۡ, reason: contains not printable characters */
    public final void m22674(@InterfaceC6399 Runnable runnable, @InterfaceC6399 InterfaceC7726 interfaceC7726, boolean z) {
        this.f21884.m12199(runnable, interfaceC7726, z);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۢ, reason: contains not printable characters */
    public final void m22675() {
        m22677();
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
    public final synchronized void m22676(long j) {
        this.f21884.m12210(j);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۤ, reason: contains not printable characters */
    public final synchronized void m22677() {
        this.f21884.m12210(1000L);
        this.f21884 = m22673();
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0020: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r9v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0004: SGET  A[WRAPPED] (LINE:2) Yue.ۥۢۡ۟ۤ.ۥ۟۟ int) : (r4v0 int))
  (wrap:int:0x000c: TERNARY null = ((wrap:int:0x0006: ARITH (r9v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x000a: SGET  A[WRAPPED] (LINE:3) Yue.ۥۢۡ۟ۤ.ۥ۟۟۟ int) : (r5v0 int))
  (wrap:long:0x0013: TERNARY null = ((wrap:int:0x000d: ARITH (r9v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:long:0x0011: SGET  A[WRAPPED] (LINE:4) Yue.ۥۢۡ۟ۤ.ۥ۟۟۟۟ long) : (r6v0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r9v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("CoroutineScheduler") : (r8v0 java.lang.String))
 A[MD:(int, int, long, java.lang.String):void (m)] (LINE:6) call: Yue.ۥۡۧۤۦ.<init>(int, int, long, java.lang.String):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public /* synthetic */ C7239(int i, int i2, long j, String str, int i3, C4335 c4335) {
        this((i3 & 1) != 0 ? C7737.f23273 : i, (i3 & 2) != 0 ? C7737.f23274 : i2, (i3 & 4) != 0 ? C7737.f23275 : j, (i3 & 8) != 0 ? "CoroutineScheduler" : str);
    }

    public C7239(int i, int i2, long j, @InterfaceC6399 String str) {
        this.f21880 = i;
        this.f21881 = i2;
        this.f21882 = j;
        this.f21883 = str;
        this.f21884 = m22673();
    }
}
