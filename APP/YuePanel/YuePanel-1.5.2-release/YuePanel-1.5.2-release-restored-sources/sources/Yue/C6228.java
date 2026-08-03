package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۡۡۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C6228 extends AbstractC5912 implements InterfaceC4364 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @InterfaceC6489
    public final Throwable f15384;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @InterfaceC6489
    public final String f15385;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 java.lang.Throwable)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
 A[MD:(java.lang.Throwable, java.lang.String):void (m)] (LINE:1) call: Yue.ۥۡۡۡۨ.<init>(java.lang.Throwable, java.lang.String):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C6228(Throwable th, String str, int i, C4335 c4335) {
        this(th, (i & 2) != 0 ? null : str);
    }

    @Override // Yue.AbstractC4232
    public boolean isDispatchNeeded(@InterfaceC6399 InterfaceC4225 interfaceC4225) {
        m19244();
        throw new C5667();
    }

    @Override // Yue.AbstractC5912, Yue.AbstractC4232
    @InterfaceC6399
    public AbstractC4232 limitedParallelism(int i) {
        m19244();
        throw new C5667();
    }

    @Override // Yue.AbstractC5912, Yue.AbstractC4232
    @InterfaceC6399
    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("Dispatchers.Main[missing");
        if (this.f15384 != null) {
            str = ", cause=" + this.f15384;
        } else {
            str = "";
        }
        sb.append(str);
        sb.append(']');
        return sb.toString();
    }

    @Override // Yue.InterfaceC4364
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟ۡ۠ */
    public Object mo12617(long j, @InterfaceC6399 InterfaceC4199<?> interfaceC4199) {
        m19244();
        throw new C5667();
    }

    @Override // Yue.InterfaceC4364
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟۟ */
    public InterfaceC4433 mo12587(long j, @InterfaceC6399 Runnable runnable, @InterfaceC6399 InterfaceC4225 interfaceC4225) {
        m19244();
        throw new C5667();
    }

    @Override // Yue.AbstractC5912
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۧ۟ */
    public AbstractC5912 mo16039() {
        return this;
    }

    /* JADX DEBUG: Method merged with bridge method: dispatch(LYue/ۥ۟ۧۦۥ;Ljava/lang/Runnable;)V */
    @Override // Yue.AbstractC4232
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۧۡ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public Void dispatch(@InterfaceC6399 InterfaceC4225 interfaceC4225, @InterfaceC6399 Runnable runnable) {
        m19244();
        throw new C5667();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX INFO: renamed from: ۥ۟۟ۧۢ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Void m19244() {
        String str;
        if (this.f15384 == null) {
            C5921.m18493();
            throw new C5667();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Module with the Main dispatcher had failed to initialize");
        String str2 = this.f15385;
        if (str2 != null) {
            str = ". " + str2;
            if (str == null) {
                str = "";
            }
        }
        sb.append(str);
        throw new IllegalStateException(sb.toString(), this.f15384);
    }

    /* JADX DEBUG: Method merged with bridge method: ۥ۟۟ۤۥ(JLYue/ۥۣ۟ۨ۟;)V */
    @Override // Yue.InterfaceC4364
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public Void mo12618(long j, @InterfaceC6399 InterfaceC3665<? super C8107> interfaceC3665) {
        m19244();
        throw new C5667();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C6228(@InterfaceC6489 Throwable th, @InterfaceC6489 String str) {
        this.f15384 = th;
        this.f15385 = str;
    }
}
