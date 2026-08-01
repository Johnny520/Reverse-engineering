package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class ue1 extends m51 implements InterfaceC0904ww {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f6207h;

    /* JADX INFO: renamed from: i */
    public int f6208i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ we1 f6209j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ue1(we1 we1Var, InterfaceC0322ik interfaceC0322ik, int i) {
        super(2, interfaceC0322ik);
        this.f6207h = i;
        this.f6209j = we1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0955y9
    /* JADX INFO: renamed from: g */
    public final InterfaceC0322ik mo15g(Object obj, InterfaceC0322ik interfaceC0322ik) {
        int i = this.f6207h;
        we1 we1Var = this.f6209j;
        switch (i) {
            case 0:
                return new ue1(we1Var, interfaceC0322ik, 0);
            default:
                return new ue1(we1Var, interfaceC0322ik, 1);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0904ww
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f6207h;
        na1 na1Var = na1.f4229a;
        InterfaceC0966yk interfaceC0966yk = (InterfaceC0966yk) obj;
        InterfaceC0322ik interfaceC0322ik = (InterfaceC0322ik) obj2;
        switch (i) {
        }
        return ((ue1) mo15g(interfaceC0966yk, interfaceC0322ik)).mo16m(na1Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0955y9
    /* JADX INFO: renamed from: m */
    public final Object mo16m(Object obj) throws Throwable {
        int i = this.f6207h;
        we1 we1Var = this.f6209j;
        EnumC1007zk enumC1007zk = EnumC1007zk.f7916d;
        na1 na1Var = na1.f4229a;
        switch (i) {
            case 0:
                int i2 = this.f6208i;
                if (i2 == 0) {
                    w60.m4891M(obj);
                    ViewTreeObserverOnGlobalLayoutListenerC0875w3 viewTreeObserverOnGlobalLayoutListenerC0875w3 = we1Var.f7116d;
                    this.f6208i = 1;
                    Object objM460d = viewTreeObserverOnGlobalLayoutListenerC0875w3.f6913B.m460d(this);
                    if (objM460d != enumC1007zk) {
                        objM460d = na1Var;
                    }
                    if (objM460d == enumC1007zk) {
                    }
                } else if (i2 != 1) {
                    C0921xc.m5134o("call to 'resume' before 'invoke' with coroutine");
                } else {
                    w60.m4891M(obj);
                }
                break;
            default:
                int i3 = this.f6208i;
                if (i3 == 0) {
                    w60.m4891M(obj);
                    ViewTreeObserverOnGlobalLayoutListenerC0875w3 viewTreeObserverOnGlobalLayoutListenerC0875w32 = we1Var.f7116d;
                    this.f6208i = 1;
                    Object objM4387d = viewTreeObserverOnGlobalLayoutListenerC0875w32.f6915C.m4387d(this);
                    if (objM4387d != enumC1007zk) {
                        objM4387d = na1Var;
                    }
                    if (objM4387d == enumC1007zk) {
                    }
                } else if (i3 != 1) {
                    C0921xc.m5134o("call to 'resume' before 'invoke' with coroutine");
                } else {
                    w60.m4891M(obj);
                }
                break;
        }
        return enumC1007zk;
    }
}
