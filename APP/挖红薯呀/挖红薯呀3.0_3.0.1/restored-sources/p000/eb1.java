package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class eb1 extends c50 implements InterfaceC0742sw {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f1369d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ fb1 f1370e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ eb1(fb1 fb1Var, int i) {
        super(1);
        this.f1369d = i;
        this.f1370e = fb1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0742sw
    public final Object invoke(Object obj) {
        int i = this.f1369d;
        na1 na1Var = na1.f4229a;
        fb1 fb1Var = this.f1370e;
        switch (i) {
            case 0:
                fb1Var.f1655d = true;
                fb1Var.f1657f.invoke();
                return na1Var;
            default:
                InterfaceC0812uq interfaceC0812uq = (InterfaceC0812uq) obj;
                C0035ay c0035ay = fb1Var.f1653b;
                float f = fb1Var.f1662k;
                float f2 = fb1Var.f1663l;
                C0541o8 c0541o8Mo655t = interfaceC0812uq.mo655t();
                long jM2803h = c0541o8Mo655t.m2803h();
                c0541o8Mo655t.m2802f().mo243i();
                try {
                    ((C0910x1) c0541o8Mo655t.f4480a).m5079s(f, f2, 0L);
                    c0035ay.mo218a(interfaceC0812uq);
                    return na1Var;
                } finally {
                    c0541o8Mo655t.m2802f().mo241g();
                    c0541o8Mo655t.m2812q(jM2803h);
                }
        }
    }
}
