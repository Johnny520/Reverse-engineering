package Yue;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import net.bytebuddy.pool.TypePool;

/* JADX INFO: renamed from: Yue.ۥ۟ۦۣۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C4050 {

    /* JADX INFO: renamed from: ۥ۟ */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f636 = AtomicIntegerFieldUpdater.newUpdater(C4050.class, "_handled");

    @InterfaceC6399
    private volatile /* synthetic */ int _handled;

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6399
    @InterfaceC5568
    public final Throwable f637;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4050(@InterfaceC6399 Throwable th, boolean z) {
        this.f637 = th;
        this._handled = z ? 1 : 0;
    }

    @InterfaceC6399
    public String toString() {
        return C4325.m1288(this) + TypePool.Default.LazyTypeDescription.GenericTypeToken.COMPONENT_TYPE_PATH + this.f637 + ']';
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    /* JADX INFO: renamed from: ۥ */
    public final boolean m1002() {
        return this._handled;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public final boolean m1003() {
        return f636.compareAndSet(this, 0, 1);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 java.lang.Throwable)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r2v0 boolean))
 A[MD:(java.lang.Throwable, boolean):void (m)] (LINE:4) call: Yue.ۥ۟ۦۣۢ.<init>(java.lang.Throwable, boolean):void type: THIS */
    public /* synthetic */ C4050(Throwable th, boolean z, int i, C4335 c4335) {
        this(th, (i & 2) != 0 ? false : z);
    }
}
