package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class u31 extends m51 implements InterfaceC0941xw {

    /* JADX INFO: renamed from: h */
    public int f6122h;

    /* JADX INFO: renamed from: i */
    public /* synthetic */ InterfaceC0331iu f6123i;

    /* JADX INFO: renamed from: j */
    public /* synthetic */ int f6124j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ v31 f6125k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u31(v31 v31Var, InterfaceC0322ik interfaceC0322ik) {
        super(3, interfaceC0322ik);
        this.f6125k = v31Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0941xw
    /* JADX INFO: renamed from: a */
    public final Object mo353a(Object obj, Object obj2, Object obj3) {
        int iIntValue = ((Number) obj2).intValue();
        u31 u31Var = new u31(this.f6125k, (InterfaceC0322ik) obj3);
        u31Var.f6123i = (InterfaceC0331iu) obj;
        u31Var.f6124j = iIntValue;
        return u31Var.mo16m(na1.f4229a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0044, code lost:
    
        if (r0.mo827f(p000.h11.f2123d, r8) == r7) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007b, code lost:
    
        if (r0.mo827f(p000.h11.f2125f, r8) != r7) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0061 A[PHI: r0
  0x0061: PHI (r0v3 iu) = (r0v2 iu), (r0v6 iu) binds: [B:25:0x005e, B:13:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0071 A[PHI: r0
  0x0071: PHI (r0v4 iu) = (r0v3 iu), (r0v7 iu) binds: [B:28:0x006e, B:12:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p000.AbstractC0955y9
    /* JADX INFO: renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo16m(Object obj) {
        InterfaceC0331iu interfaceC0331iu;
        int i = this.f6122h;
        EnumC1007zk enumC1007zk = EnumC1007zk.f7916d;
        if (i == 0) {
            w60.m4891M(obj);
            interfaceC0331iu = this.f6123i;
            if (this.f6124j > 0) {
                this.f6122h = 1;
            } else {
                this.f6123i = interfaceC0331iu;
                this.f6122h = 2;
                if (s91.m4056u(0L, this) != enumC1007zk) {
                    this.f6123i = interfaceC0331iu;
                    this.f6122h = 3;
                    if (interfaceC0331iu.mo827f(h11.f2124e, this) != enumC1007zk) {
                    }
                }
            }
            return enumC1007zk;
        }
        if (i != 1) {
            if (i == 2) {
                interfaceC0331iu = this.f6123i;
                w60.m4891M(obj);
                this.f6123i = interfaceC0331iu;
                this.f6122h = 3;
                if (interfaceC0331iu.mo827f(h11.f2124e, this) != enumC1007zk) {
                    this.f6123i = interfaceC0331iu;
                    this.f6122h = 4;
                    if (s91.m4056u(Long.MAX_VALUE, this) != enumC1007zk) {
                    }
                }
                return enumC1007zk;
            }
            if (i == 3) {
                interfaceC0331iu = this.f6123i;
                w60.m4891M(obj);
                this.f6123i = interfaceC0331iu;
                this.f6122h = 4;
                if (s91.m4056u(Long.MAX_VALUE, this) != enumC1007zk) {
                    this.f6123i = null;
                    this.f6122h = 5;
                }
                return enumC1007zk;
            }
            if (i == 4) {
                interfaceC0331iu = this.f6123i;
                w60.m4891M(obj);
                this.f6123i = null;
                this.f6122h = 5;
            } else if (i != 5) {
                C0921xc.m5134o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }
        w60.m4891M(obj);
        return na1.f4229a;
    }
}
