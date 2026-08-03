package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۤۡۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C3717<T> extends AbstractC3716<T> {

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    @InterfaceC6399
    public final InterfaceC5138<InterfaceC6809<? super T>, InterfaceC4199<? super C8107>, Object> f6631;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (r1v0 Yue.ۥۣ۠ۢۢ)
  (wrap:Yue.ۥ۟ۧۦۥ:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:Yue.ۥ۟ۧۦۥ:0x0004: SGET  A[WRAPPED] (LINE:1) Yue.ۥ۠۠ۧۦ.ۥۣ۟۟۠ Yue.ۥ۠۠ۧۦ) : (r2v0 Yue.ۥ۟ۧۦۥ))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (-2 int) : (r3v0 int))
  (wrap:Yue.ۥۣۣ۟:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:Yue.ۥۣۣ۟:0x000f: SGET  A[WRAPPED] (LINE:2) Yue.ۥۣۣ۟.ۥۣ۟۟۠ Yue.ۥۣۣ۟) : (r4v0 Yue.ۥۣۣ۟))
 A[MD:(Yue.ۥۣ۠ۢۢ<? super Yue.ۥۡۥۡۤ<? super T>, ? super Yue.ۥ۟ۧۤۢ<? super Yue.ۥۣۢ۠ۤ>, ? extends java.lang.Object>, Yue.ۥ۟ۧۦۥ, int, Yue.ۥۣۣ۟):void (m)] (LINE:3) call: Yue.ۥ۟ۤۡۡ.<init>(Yue.ۥۣ۠ۢۢ, Yue.ۥ۟ۧۦۥ, int, Yue.ۥۣۣ۟):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C3717(InterfaceC5138 interfaceC5138, InterfaceC4225 interfaceC4225, int i, EnumC3602 enumC3602, int i2, C4335 c4335) {
        this(interfaceC5138, (i2 & 2) != 0 ? C4629.f9940 : interfaceC4225, (i2 & 4) != 0 ? -2 : i, (i2 & 8) != 0 ? EnumC3602.SUSPEND : enumC3602);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static /* synthetic */ Object m10182(C3717 c3717, InterfaceC6809 interfaceC6809, InterfaceC4199 interfaceC4199) {
        Object objInvoke = c3717.f6631.invoke(interfaceC6809, interfaceC4199);
        return objInvoke == C5508.m17142() ? objInvoke : C8107.f3222;
    }

    @Override // Yue.AbstractC3716
    @InterfaceC6399
    public String toString() {
        return "block[" + this.f6631 + "] -> " + super.toString();
    }

    @Override // Yue.AbstractC3716
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
    public Object mo9979(@InterfaceC6399 InterfaceC6809<? super T> interfaceC6809, @InterfaceC6399 InterfaceC4199<? super C8107> interfaceC4199) {
        return m10182(this, interfaceC6809, interfaceC4199);
    }

    @Override // Yue.AbstractC3716
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
    public AbstractC3716<T> mo9980(@InterfaceC6399 InterfaceC4225 interfaceC4225, int i, @InterfaceC6399 EnumC3602 enumC3602) {
        return new C3717(this.f6631, interfaceC4225, i, enumC3602);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Yue.ۥۣ۠ۢۢ<? super Yue.ۥۡۥۡۤ<? super T>, ? super Yue.ۥ۟ۧۤۢ<? super Yue.ۥۣۢ۠ۤ>, ? extends java.lang.Object> */
    /* JADX WARN: Multi-variable type inference failed */
    public C3717(@InterfaceC6399 InterfaceC5138<? super InterfaceC6809<? super T>, ? super InterfaceC4199<? super C8107>, ? extends Object> interfaceC5138, @InterfaceC6399 InterfaceC4225 interfaceC4225, int i, @InterfaceC6399 EnumC3602 enumC3602) {
        super(interfaceC4225, i, enumC3602);
        this.f6631 = interfaceC5138;
    }
}
