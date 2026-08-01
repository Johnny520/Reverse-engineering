package p000;

/* JADX INFO: renamed from: b7 */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0045b7 {

    /* JADX INFO: renamed from: a */
    public final q91 f430a;

    /* JADX INFO: renamed from: b */
    public final Object f431b;

    /* JADX INFO: renamed from: c */
    public final C0879w7 f432c;

    /* JADX INFO: renamed from: d */
    public final gp0 f433d;

    /* JADX INFO: renamed from: e */
    public final gp0 f434e;

    /* JADX INFO: renamed from: f */
    public final bi0 f435f;

    /* JADX INFO: renamed from: g */
    public final AbstractC0046b8 f436g;

    /* JADX INFO: renamed from: h */
    public final AbstractC0046b8 f437h;

    /* JADX INFO: renamed from: i */
    public final AbstractC0046b8 f438i;

    /* JADX INFO: renamed from: j */
    public final AbstractC0046b8 f439j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0045b7(Object obj, q91 q91Var, Object obj2) {
        this.f430a = q91Var;
        this.f431b = obj2;
        C0879w7 c0879w7 = new C0879w7(q91Var, obj, null, 60);
        this.f432c = c0879w7;
        this.f433d = r60.m3419u(Boolean.FALSE);
        this.f434e = r60.m3419u(obj);
        this.f435f = new bi0();
        new o31(1.0f, 1500.0f, obj2);
        AbstractC0046b8 abstractC0046b8 = c0879w7.f7017f;
        boolean z = abstractC0046b8 instanceof C0916x7;
        AbstractC0046b8 abstractC0046b82 = z ? AbstractC0398kl.f3194e : abstractC0046b8 instanceof C0953y7 ? AbstractC0398kl.f3195f : abstractC0046b8 instanceof C0990z7 ? AbstractC0398kl.f3196g : AbstractC0398kl.f3197h;
        this.f436g = abstractC0046b82;
        AbstractC0046b8 abstractC0046b83 = z ? AbstractC0398kl.f3190a : abstractC0046b8 instanceof C0953y7 ? AbstractC0398kl.f3191b : abstractC0046b8 instanceof C0990z7 ? AbstractC0398kl.f3192c : AbstractC0398kl.f3193d;
        this.f437h = abstractC0046b83;
        this.f438i = abstractC0046b82;
        this.f439j = abstractC0046b83;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final Object m320a(C0045b7 c0045b7, Object obj) {
        q91 q91Var = c0045b7.f430a;
        AbstractC0046b8 abstractC0046b8 = c0045b7.f439j;
        AbstractC0046b8 abstractC0046b82 = c0045b7.f438i;
        if (!p30.m3002l(abstractC0046b82, c0045b7.f436g) || !p30.m3002l(abstractC0046b8, c0045b7.f437h)) {
            AbstractC0046b8 abstractC0046b83 = (AbstractC0046b8) q91Var.f5089a.invoke(obj);
            int iMo27b = abstractC0046b83.mo27b();
            boolean z = false;
            for (int i = 0; i < iMo27b; i++) {
                if (abstractC0046b83.mo26a(i) < abstractC0046b82.mo26a(i) || abstractC0046b83.mo26a(i) > abstractC0046b8.mo26a(i)) {
                    abstractC0046b83.mo30e(w60.m4906m(abstractC0046b83.mo26a(i), abstractC0046b82.mo26a(i), abstractC0046b8.mo26a(i)), i);
                    z = true;
                }
            }
            if (z) {
                return q91Var.f5090b.invoke(abstractC0046b83);
            }
        }
        return obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static final void m321b(C0045b7 c0045b7) {
        C0879w7 c0879w7 = c0045b7.f432c;
        c0879w7.f7017f.mo29d();
        c0879w7.f7018g = Long.MIN_VALUE;
        c0045b7.f433d.setValue(Boolean.FALSE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static Object m322c(C0045b7 c0045b7, Object obj, InterfaceC0830v7 interfaceC0830v7, InterfaceC0742sw interfaceC0742sw, m51 m51Var, int i) {
        Object objInvoke = c0045b7.f430a.f5090b.invoke(c0045b7.f432c.f7017f);
        InterfaceC0742sw interfaceC0742sw2 = (i & 8) != 0 ? null : interfaceC0742sw;
        Object objM323d = c0045b7.m323d();
        q91 q91Var = c0045b7.f430a;
        return bi0.m355a(c0045b7.f435f, new C0989z6(c0045b7, objInvoke, new n61(interfaceC0830v7, q91Var, objM323d, obj, (AbstractC0046b8) q91Var.f5089a.invoke(objInvoke)), c0045b7.f432c.f7018g, interfaceC0742sw2, null), m51Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final Object m323d() {
        return this.f432c.f7016e.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final Object m324e(Object obj, m51 m51Var) {
        Object objM355a = bi0.m355a(this.f435f, new C0008a7(this, obj, null), m51Var);
        return objM355a == EnumC1007zk.f7916d ? objM355a : na1.f4229a;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 java.lang.Object)
  (r2v0 q91)
  (wrap:java.lang.Float:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Float) : (r3v0 java.lang.Float))
 A[MD:(java.lang.Object, q91, java.lang.Object):void (m)] (LINE:104) call: b7.<init>(java.lang.Object, q91, java.lang.Object):void type: THIS */
    public /* synthetic */ C0045b7(Object obj, q91 q91Var, Float f, int i) {
        this(obj, q91Var, (i & 4) != 0 ? null : f);
    }
}
