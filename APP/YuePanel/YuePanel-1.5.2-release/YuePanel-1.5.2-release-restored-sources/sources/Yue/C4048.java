package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۦۣ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4048 {

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC5568
    @InterfaceC6489
    public final Object f634;

    /* JADX INFO: renamed from: ۥ۟ */
    @InterfaceC5568
    @InterfaceC6489
    public final AbstractC3661 f635;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @InterfaceC5568
    @InterfaceC6489
    public final InterfaceC5124<Throwable, C8107> f8117;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    @InterfaceC5568
    @InterfaceC6489
    public final Object f8118;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    @InterfaceC5568
    @InterfaceC6489
    public final Throwable f8119;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: Yue.ۥۣ۠ۡ۟<? super java.lang.Throwable, Yue.ۥۣۢ۠ۤ> */
    /* JADX WARN: Multi-variable type inference failed */
    public C4048(@InterfaceC6489 Object obj, @InterfaceC6489 AbstractC3661 abstractC3661, @InterfaceC6489 InterfaceC5124<? super Throwable, C8107> interfaceC5124, @InterfaceC6489 Object obj2, @InterfaceC6489 Throwable th) {
        this.f634 = obj;
        this.f635 = abstractC3661;
        this.f8117 = interfaceC5124;
        this.f8118 = obj2;
        this.f8119 = th;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: Yue.ۥ۟ۦۣ۠ */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static /* synthetic */ C4048 m11476(C4048 c4048, Object obj, AbstractC3661 abstractC3661, InterfaceC5124 interfaceC5124, Object obj2, Throwable th, int i, Object obj3) {
        if ((i & 1) != 0) {
            obj = c4048.f634;
        }
        if ((i & 2) != 0) {
            abstractC3661 = c4048.f635;
        }
        AbstractC3661 abstractC36612 = abstractC3661;
        if ((i & 4) != 0) {
            interfaceC5124 = c4048.f8117;
        }
        InterfaceC5124 interfaceC51242 = interfaceC5124;
        if ((i & 8) != 0) {
            obj2 = c4048.f8118;
        }
        Object obj4 = obj2;
        if ((i & 16) != 0) {
            th = c4048.f8119;
        }
        return c4048.m11480(obj, abstractC36612, interfaceC51242, obj4, th);
    }

    public boolean equals(@InterfaceC6489 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4048)) {
            return false;
        }
        C4048 c4048 = (C4048) obj;
        return C5499.m17094(this.f634, c4048.f634) && C5499.m17094(this.f635, c4048.f635) && C5499.m17094(this.f8117, c4048.f8117) && C5499.m17094(this.f8118, c4048.f8118) && C5499.m17094(this.f8119, c4048.f8119);
    }

    public int hashCode() {
        Object obj = this.f634;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        AbstractC3661 abstractC3661 = this.f635;
        int iHashCode2 = (iHashCode + (abstractC3661 == null ? 0 : abstractC3661.hashCode())) * 31;
        InterfaceC5124<Throwable, C8107> interfaceC5124 = this.f8117;
        int iHashCode3 = (iHashCode2 + (interfaceC5124 == null ? 0 : interfaceC5124.hashCode())) * 31;
        Object obj2 = this.f8118;
        int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f8119;
        return iHashCode4 + (th != null ? th.hashCode() : 0);
    }

    @InterfaceC6399
    public String toString() {
        return "CompletedContinuation(result=" + this.f634 + ", cancelHandler=" + this.f635 + ", onCancellation=" + this.f8117 + ", idempotentResume=" + this.f8118 + ", cancelCause=" + this.f8119 + ')';
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ */
    public final Object m1000() {
        return this.f634;
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟ */
    public final AbstractC3661 m1001() {
        return this.f635;
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final InterfaceC5124<Throwable, C8107> m11477() {
        return this.f8117;
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final Object m11478() {
        return this.f8118;
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final Throwable m11479() {
        return this.f8119;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final C4048 m11480(@InterfaceC6489 Object obj, @InterfaceC6489 AbstractC3661 abstractC3661, @InterfaceC6489 InterfaceC5124<? super Throwable, C8107> interfaceC5124, @InterfaceC6489 Object obj2, @InterfaceC6489 Throwable th) {
        return new C4048(obj, abstractC3661, interfaceC5124, obj2, th);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final boolean m11481() {
        return this.f8119 != null;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final void m11482(@InterfaceC6399 C3666<?> c3666, @InterfaceC6399 Throwable th) {
        AbstractC3661 abstractC3661 = this.f635;
        if (abstractC3661 != null) {
            c3666.m10030(abstractC3661, th);
        }
        InterfaceC5124<Throwable, C8107> interfaceC5124 = this.f8117;
        if (interfaceC5124 != null) {
            c3666.m10033(interfaceC5124, th);
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001f: CONSTRUCTOR 
  (r8v0 java.lang.Object)
  (wrap:Yue.ۥۣ۟ۧۦ:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null Yue.ۥۣ۟ۧۦ) : (r9v0 Yue.ۥۣ۟ۧۦ))
  (wrap:Yue.ۥۣ۠ۡ۟:?: TERNARY null = ((wrap:int:0x0008: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null Yue.ۥۣ۠ۡ۟) : (r10v0 Yue.ۥۣ۠ۡ۟))
  (wrap:java.lang.Object:?: TERNARY null = ((wrap:int:0x000f: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Object) : (r11v0 java.lang.Object))
  (wrap:java.lang.Throwable:?: TERNARY null = ((wrap:int:0x0016: ARITH (r13v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Throwable) : (r12v0 java.lang.Throwable))
 A[MD:(java.lang.Object, Yue.ۥۣ۟ۧۦ, Yue.ۥۣ۠ۡ۟<? super java.lang.Throwable, Yue.ۥۣۢ۠ۤ>, java.lang.Object, java.lang.Throwable):void (m)] (LINE:7) call: Yue.ۥ۟ۦۣ۠.<init>(java.lang.Object, Yue.ۥۣ۟ۧۦ, Yue.ۥۣ۠ۡ۟, java.lang.Object, java.lang.Throwable):void type: THIS */
    public /* synthetic */ C4048(Object obj, AbstractC3661 abstractC3661, InterfaceC5124 interfaceC5124, Object obj2, Throwable th, int i, C4335 c4335) {
        this(obj, (i & 2) != 0 ? null : abstractC3661, (i & 4) != 0 ? null : interfaceC5124, (i & 8) != 0 ? null : obj2, (i & 16) != 0 ? null : th);
    }
}
