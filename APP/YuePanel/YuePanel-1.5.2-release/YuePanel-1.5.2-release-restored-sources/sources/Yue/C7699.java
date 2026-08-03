package Yue;

import java.io.Serializable;

/* JADX INFO: renamed from: Yue.ۥۢ۠ۦۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C7699<T> implements InterfaceC5684<T>, Serializable {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @InterfaceC6489
    public InterfaceC5122<? extends T> f23200;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @InterfaceC6489
    public volatile Object f23201;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    @InterfaceC6399
    public final Object f23202;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C7699(@InterfaceC6399 InterfaceC5122<? extends T> interfaceC5122, @InterfaceC6489 Object obj) {
        C5499.m17103(interfaceC5122, "initializer");
        this.f23200 = interfaceC5122;
        this.f23201 = C8072.f3213;
        this.f23202 = obj == null ? this : obj;
    }

    /* JADX INFO: renamed from: ۥ */
    private final Object m3800() {
        return new C5434(getValue());
    }

    @Override // Yue.InterfaceC5684
    public T getValue() {
        T tInvoke;
        T t = (T) this.f23201;
        C8072 c8072 = C8072.f3213;
        if (t != c8072) {
            return t;
        }
        synchronized (this.f23202) {
            tInvoke = (T) this.f23201;
            if (tInvoke == c8072) {
                InterfaceC5122<? extends T> interfaceC5122 = this.f23200;
                C5499.m17100(interfaceC5122);
                tInvoke = interfaceC5122.invoke();
                this.f23201 = tInvoke;
                this.f23200 = null;
            }
        }
        return tInvoke;
    }

    @Override // Yue.InterfaceC5684
    public boolean isInitialized() {
        return this.f23201 != C8072.f3213;
    }

    @InterfaceC6399
    public String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 Yue.ۥۣ۠۠ۨ)
  (wrap:java.lang.Object:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Object) : (r2v0 java.lang.Object))
 A[MD:(Yue.ۥۣ۠۠ۨ<? extends T>, java.lang.Object):void (m)] (LINE:5) call: Yue.ۥۢ۠ۦۧ.<init>(Yue.ۥۣ۠۠ۨ, java.lang.Object):void type: THIS */
    public /* synthetic */ C7699(InterfaceC5122 interfaceC5122, Object obj, int i, C4335 c4335) {
        this(interfaceC5122, (i & 2) != 0 ? null : obj);
    }
}
