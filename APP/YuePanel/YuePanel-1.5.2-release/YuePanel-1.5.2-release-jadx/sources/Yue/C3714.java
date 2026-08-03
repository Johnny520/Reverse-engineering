package Yue;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: Yue.ۥ۟ۤۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C3714<T> extends AbstractC3716<T> {

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f6617 = AtomicIntegerFieldUpdater.newUpdater(C3714.class, "consumed");

    @InterfaceC6399
    private volatile /* synthetic */ int consumed;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    @InterfaceC6399
    public final InterfaceC7042<T> f6618;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public final boolean f6619;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0017: CONSTRUCTOR 
  (r7v0 Yue.ۥۡۦۡۡ)
  (r8v0 boolean)
  (wrap:Yue.ۥ۟ۧۦۥ:0x0006: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:Yue.ۥ۟ۧۦۥ:0x0004: SGET  A[WRAPPED] (LINE:1) Yue.ۥ۠۠ۧۦ.ۥۣ۟۟۠ Yue.ۥ۠۠ۧۦ) : (r9v0 Yue.ۥ۟ۧۦۥ))
  (wrap:int:0x000c: TERNARY null = ((wrap:int:0x0007: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (-3 int) : (r10v0 int))
  (wrap:Yue.ۥۣۣ۟:?: TERNARY null = ((wrap:int:0x000d: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:Yue.ۥۣۣ۟:0x0011: SGET  A[WRAPPED] (LINE:2) Yue.ۥۣۣ۟.ۥۣ۟۟۠ Yue.ۥۣۣ۟) : (r11v0 Yue.ۥۣۣ۟))
 A[MD:(Yue.ۥۡۦۡۡ<? extends T>, boolean, Yue.ۥ۟ۧۦۥ, int, Yue.ۥۣۣ۟):void (m)] (LINE:3) call: Yue.ۥ۟ۤۡ.<init>(Yue.ۥۡۦۡۡ, boolean, Yue.ۥ۟ۧۦۥ, int, Yue.ۥۣۣ۟):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C3714(InterfaceC7042 interfaceC7042, boolean z, InterfaceC4225 interfaceC4225, int i, EnumC3602 enumC3602, int i2, C4335 c4335) {
        this(interfaceC7042, z, (i2 & 4) != 0 ? C4629.f9940 : interfaceC4225, (i2 & 8) != 0 ? -3 : i, (i2 & 16) != 0 ? EnumC3602.SUSPEND : enumC3602);
    }

    @Override // Yue.AbstractC3716, Yue.InterfaceC4890
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ */
    public Object mo48(@InterfaceC6399 InterfaceC4892<? super T> interfaceC4892, @InterfaceC6399 InterfaceC4199<? super C8107> interfaceC4199) {
        if (this.f6622 != -3) {
            Object objMo48 = super.mo48(interfaceC4892, interfaceC4199);
            return objMo48 == C5508.m17142() ? objMo48 : C8107.f3222;
        }
        m10175();
        Object objM15323 = C4909.m15323(interfaceC4892, this.f6618, this.f6619, interfaceC4199);
        return objM15323 == C5508.m17142() ? objM15323 : C8107.f3222;
    }

    @Override // Yue.AbstractC3716
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public String mo10172() {
        return "channel=" + this.f6618;
    }

    @Override // Yue.AbstractC3716
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
    public Object mo9979(@InterfaceC6399 InterfaceC6809<? super T> interfaceC6809, @InterfaceC6399 InterfaceC4199<? super C8107> interfaceC4199) {
        Object objM15323 = C4909.m15323(new C7324(interfaceC6809), this.f6618, this.f6619, interfaceC4199);
        return objM15323 == C5508.m17142() ? objM15323 : C8107.f3222;
    }

    @Override // Yue.AbstractC3716
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
    public AbstractC3716<T> mo9980(@InterfaceC6399 InterfaceC4225 interfaceC4225, int i, @InterfaceC6399 EnumC3602 enumC3602) {
        return new C3714(this.f6618, this.f6619, interfaceC4225, i, enumC3602);
    }

    @Override // Yue.AbstractC3716
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public InterfaceC4890<T> mo10173() {
        return new C3714(this.f6618, this.f6619, null, 0, null, 28, null);
    }

    @Override // Yue.AbstractC3716
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public InterfaceC7042<T> mo10174(@InterfaceC6399 InterfaceC4243 interfaceC4243) {
        m10175();
        return this.f6622 == -3 ? this.f6618 : super.mo10174(interfaceC4243);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public final void m10175() {
        if (this.f6619 && f6617.getAndSet(this, 1) != 0) {
            throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once".toString());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Yue.ۥۡۦۡۡ<? extends T> */
    /* JADX WARN: Multi-variable type inference failed */
    public C3714(@InterfaceC6399 InterfaceC7042<? extends T> interfaceC7042, boolean z, @InterfaceC6399 InterfaceC4225 interfaceC4225, int i, @InterfaceC6399 EnumC3602 enumC3602) {
        super(interfaceC4225, i, enumC3602);
        this.f6618 = interfaceC7042;
        this.f6619 = z;
        this.consumed = 0;
    }
}
