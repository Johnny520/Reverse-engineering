package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۤۡۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C3723<T> extends AbstractC3722<T, T> {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (r1v0 Yue.ۥۣ۠ۢۡ)
  (wrap:Yue.ۥ۟ۧۦۥ:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:Yue.ۥ۟ۧۦۥ:0x0004: SGET  A[WRAPPED] (LINE:1) Yue.ۥ۠۠ۧۦ.ۥۣ۟۟۠ Yue.ۥ۠۠ۧۦ) : (r2v0 Yue.ۥ۟ۧۦۥ))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (-3 int) : (r3v0 int))
  (wrap:Yue.ۥۣۣ۟:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:Yue.ۥۣۣ۟:0x000f: SGET  A[WRAPPED] (LINE:2) Yue.ۥۣۣ۟.ۥۣ۟۟۠ Yue.ۥۣۣ۟) : (r4v0 Yue.ۥۣۣ۟))
 A[MD:(Yue.ۥۣ۠ۢۡ<? extends T>, Yue.ۥ۟ۧۦۥ, int, Yue.ۥۣۣ۟):void (m)] (LINE:3) call: Yue.ۥ۟ۤۡۥ.<init>(Yue.ۥۣ۠ۢۡ, Yue.ۥ۟ۧۦۥ, int, Yue.ۥۣۣ۟):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C3723(InterfaceC4890 interfaceC4890, InterfaceC4225 interfaceC4225, int i, EnumC3602 enumC3602, int i2, C4335 c4335) {
        this(interfaceC4890, (i2 & 2) != 0 ? C4629.f9940 : interfaceC4225, (i2 & 4) != 0 ? -3 : i, (i2 & 8) != 0 ? EnumC3602.SUSPEND : enumC3602);
    }

    @Override // Yue.AbstractC3716
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
    public AbstractC3716<T> mo9980(@InterfaceC6399 InterfaceC4225 interfaceC4225, int i, @InterfaceC6399 EnumC3602 enumC3602) {
        return new C3723(this.f6647, interfaceC4225, i, enumC3602);
    }

    @Override // Yue.AbstractC3716
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟۟۟ */
    public InterfaceC4890<T> mo10173() {
        return (InterfaceC4890<T>) this.f6647;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // Yue.AbstractC3722
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ */
    public Object mo10190(@InterfaceC6399 InterfaceC4892<? super T> interfaceC4892, @InterfaceC6399 InterfaceC4199<? super C8107> interfaceC4199) {
        Object objMo48 = this.f6647.mo48((InterfaceC4892<? super S>) interfaceC4892, interfaceC4199);
        return objMo48 == C5508.m17142() ? objMo48 : C8107.f3222;
    }

    public C3723(@InterfaceC6399 InterfaceC4890<? extends T> interfaceC4890, @InterfaceC6399 InterfaceC4225 interfaceC4225, int i, @InterfaceC6399 EnumC3602 enumC3602) {
        super(interfaceC4890, interfaceC4225, i, enumC3602);
    }
}
