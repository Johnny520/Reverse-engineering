package Yue;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: renamed from: Yue.ۥ۠ۡۤۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6839
public class C4763 extends AbstractC4746 {

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final int f10698;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final int f10699;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public final long f10700;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    @InterfaceC6399
    public final String f10701;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    @InterfaceC6399
    public ExecutorC4239 f10702;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r7v0 int)
  (r8v0 int)
  (r9v0 long)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("CoroutineScheduler") : (r11v0 java.lang.String))
 A[MD:(int, int, long, java.lang.String):void (m)] (LINE:2) call: Yue.ۥ۠ۡۤۡ.<init>(int, int, long, java.lang.String):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C4763(int i, int i2, long j, String str, int i3, C4335 c4335) {
        this(i, i2, j, (i3 & 8) != 0 ? "CoroutineScheduler" : str);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۡ, reason: contains not printable characters */
    public static /* synthetic */ AbstractC4232 m14427(C4763 c4763, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: blocking");
        }
        if ((i2 & 1) != 0) {
            i = 16;
        }
        return c4763.m14428(i);
    }

    @Override // Yue.AbstractC4746, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws InterruptedException {
        this.f10702.close();
    }

    @Override // Yue.AbstractC4232
    public void dispatch(@InterfaceC6399 InterfaceC4225 interfaceC4225, @InterfaceC6399 Runnable runnable) {
        try {
            ExecutorC4239.m12189(this.f10702, runnable, null, false, 6, null);
        } catch (RejectedExecutionException unused) {
            RunnableC4337.f8898.dispatch(interfaceC4225, runnable);
        }
    }

    @Override // Yue.AbstractC4232
    public void dispatchYield(@InterfaceC6399 InterfaceC4225 interfaceC4225, @InterfaceC6399 Runnable runnable) {
        try {
            ExecutorC4239.m12189(this.f10702, runnable, null, true, 2, null);
        } catch (RejectedExecutionException unused) {
            RunnableC4337.f8898.dispatchYield(interfaceC4225, runnable);
        }
    }

    @Override // Yue.AbstractC4232
    @InterfaceC6399
    public String toString() {
        return super.toString() + "[scheduler = " + this.f10702 + ']';
    }

    @Override // Yue.AbstractC4746
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۧ۟ */
    public Executor mo12605() {
        return this.f10702;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۧ۠, reason: contains not printable characters */
    public final AbstractC4232 m14428(int i) {
        if (i > 0) {
            return new ExecutorC5700(this, i, null, 1);
        }
        throw new IllegalArgumentException(("Expected positive parallelism level, but have " + i).toString());
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۢ, reason: contains not printable characters */
    public final ExecutorC4239 m14429() {
        return new ExecutorC4239(this.f10698, this.f10699, this.f10700, this.f10701);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
    public final void m14430(@InterfaceC6399 Runnable runnable, @InterfaceC6399 InterfaceC7726 interfaceC7726, boolean z) {
        try {
            this.f10702.m12199(runnable, interfaceC7726, z);
        } catch (RejectedExecutionException unused) {
            RunnableC4337.f8898.mo12589(this.f10702.m12194(runnable, interfaceC7726));
        }
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۧۤ, reason: contains not printable characters */
    public final AbstractC4232 m14431(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException(("Expected positive parallelism level, but have " + i).toString());
        }
        if (i <= this.f10698) {
            return new ExecutorC5700(this, i, null, 0);
        }
        throw new IllegalArgumentException(("Expected parallelism level lesser than core pool size (" + this.f10698 + "), but have " + i).toString());
    }

    public C4763(int i, int i2, long j, @InterfaceC6399 String str) {
        this.f10698 = i;
        this.f10699 = i2;
        this.f10700 = j;
        this.f10701 = str;
        this.f10702 = m14429();
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0012: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0004: SGET  A[WRAPPED] (LINE:9) Yue.ۥۢۡ۟ۤ.ۥ۟۟ int) : (r1v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x000a: SGET  A[WRAPPED] (LINE:10) Yue.ۥۢۡ۟ۤ.ۥ۟۟۟ int) : (r2v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.lang.String:0x0010: SGET  A[WRAPPED] (LINE:11) Yue.ۥۢۡ۟ۤ.ۥ java.lang.String) : (r3v0 java.lang.String))
 A[MD:(int, int, java.lang.String):void (m)] (LINE:12) call: Yue.ۥ۠ۡۤۡ.<init>(int, int, java.lang.String):void type: THIS */
    public /* synthetic */ C4763(int i, int i2, String str, int i3, C4335 c4335) {
        this((i3 & 1) != 0 ? C7737.f23273 : i, (i3 & 2) != 0 ? C7737.f23274 : i2, (i3 & 4) != 0 ? C7737.f3052 : str);
    }

    public C4763(int i, int i2, @InterfaceC6399 String str) {
        this(i, i2, C7737.f23275, str);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0004: SGET  A[WRAPPED] (LINE:14) Yue.ۥۢۡ۟ۤ.ۥ۟۟ int) : (r1v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0006: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x000a: SGET  A[WRAPPED] (LINE:15) Yue.ۥۢۡ۟ۤ.ۥ۟۟۟ int) : (r2v0 int))
 A[MD:(int, int):void (m)] (LINE:16) call: Yue.ۥ۠ۡۤۡ.<init>(int, int):void type: THIS */
    public /* synthetic */ C4763(int i, int i2, int i3, C4335 c4335) {
        this((i3 & 1) != 0 ? C7737.f23273 : i, (i3 & 2) != 0 ? C7737.f23274 : i2);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0009: CONSTRUCTOR 
  (r9v0 int)
  (r10v0 int)
  (wrap:long:0x0000: SGET  A[WRAPPED] (LINE:17) Yue.ۥۢۡ۟ۤ.ۥ۟۟۟۟ long)
  (null java.lang.String)
  (8 int)
  (null Yue.ۥ۟ۨۥۢ)
 A[MD:(int, int, long, java.lang.String, int, Yue.ۥ۟ۨۥۢ):void (m)] (LINE:17) call: Yue.ۥ۠ۡۤۡ.<init>(int, int, long, java.lang.String, int, Yue.ۥ۟ۨۥۢ):void type: THIS */
    @InterfaceC4372(level = EnumC0393.f8972, message = "Binary compatibility for Ktor 1.0-beta")
    public /* synthetic */ C4763(int i, int i2) {
        this(i, i2, C7737.f23275, null, 8, null);
    }
}
