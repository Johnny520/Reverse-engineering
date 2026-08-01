package p000;

/* JADX INFO: renamed from: wh */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0889wh extends av0 implements InterfaceC0904ww {

    /* JADX INFO: renamed from: f */
    public int f7125f;

    /* JADX INFO: renamed from: g */
    public int f7126g;

    /* JADX INFO: renamed from: h */
    public int f7127h;

    /* JADX INFO: renamed from: i */
    public int f7128i;

    /* JADX INFO: renamed from: j */
    public /* synthetic */ Object f7129j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ C0926xh f7130k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0889wh(C0926xh c0926xh, InterfaceC0322ik interfaceC0322ik) {
        super(interfaceC0322ik);
        this.f7130k = c0926xh;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0955y9
    /* JADX INFO: renamed from: g */
    public final InterfaceC0322ik mo15g(Object obj, InterfaceC0322ik interfaceC0322ik) {
        C0889wh c0889wh = new C0889wh(this.f7130k, interfaceC0322ik);
        c0889wh.f7129j = obj;
        return c0889wh;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0904ww
    public final Object invoke(Object obj, Object obj2) {
        return ((C0889wh) mo15g((q01) obj, (InterfaceC0322ik) obj2)).mo16m(na1.f4229a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0955y9
    /* JADX INFO: renamed from: m */
    public final Object mo16m(Object obj) {
        q01 q01Var;
        int i;
        int i2;
        int i3;
        String strM4154l;
        int i4;
        int i5;
        String str;
        C0926xh c0926xh = this.f7130k;
        dh0 dh0Var = c0926xh.f7345d;
        tg0 tg0Var = c0926xh.f7347f;
        int i6 = this.f7128i;
        if (i6 == 0) {
            w60.m4891M(obj);
            q01Var = (q01) this.f7129j;
            i = 0;
            i2 = 0;
            i3 = 0;
        } else {
            if (i6 != 1) {
                C0921xc.m5134o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.f7127h;
            i2 = this.f7126g;
            i3 = this.f7125f;
            q01Var = (q01) this.f7129j;
            w60.m4891M(obj);
        }
        if (i3 >= Math.min(c0926xh.f7348g + 10, tg0Var.f6001b)) {
            return na1.f4229a;
        }
        int i7 = i3 + 1;
        int iM4199b = tg0Var.m4199b(i3);
        switch (iM4199b) {
            case 0:
                strM4154l = "up";
                break;
            case 1:
                Object objM702f = dh0Var.m702f(i2);
                i2++;
                strM4154l = "down " + objM702f;
                break;
            case 2:
                strM4154l = "remove " + tg0Var.m4199b(i7) + ' ' + tg0Var.m4199b(i3 + 2);
                i7 = i3 + 3;
                break;
            case 3:
                strM4154l = "move " + tg0Var.m4199b(i7) + ' ' + tg0Var.m4199b(i3 + 2) + ' ' + tg0Var.m4199b(i3 + 3);
                i7 = i3 + 4;
                break;
            case 4:
                strM4154l = "clear";
                break;
            case 5:
                i4 = i3 + 2;
                int iM4199b2 = tg0Var.m4199b(i7);
                i5 = i2 + 1;
                str = "insertBottomUp " + iM4199b2 + ' ' + dh0Var.m702f(i2);
                int i8 = i4;
                strM4154l = str;
                i7 = i8;
                i2 = i5;
                break;
            case 6:
                i4 = i3 + 2;
                int iM4199b3 = tg0Var.m4199b(i7);
                i5 = i2 + 1;
                str = "insertTopDown " + iM4199b3 + ' ' + dh0Var.m702f(i2);
                int i82 = i4;
                strM4154l = str;
                i7 = i82;
                i2 = i5;
                break;
            case 7:
                Object objM702f2 = dh0Var.m702f(i2);
                objM702f2.getClass();
                s91.m4048m(2, objM702f2);
                i2 += 2;
                strM4154l = "apply " + ((InterfaceC0904ww) objM702f2);
                break;
            case 8:
                strM4154l = "reuse " + c0926xh.f7346e.m702f(i);
                i++;
                break;
            case 9:
                strM4154l = "recompose pending";
                break;
            default:
                strM4154l = AbstractC0748t1.m4154l("unknown op: ", iM4199b);
                break;
        }
        this.f7129j = q01Var;
        this.f7125f = i7;
        this.f7126g = i2;
        this.f7127h = i;
        this.f7128i = 1;
        q01Var.m3184b(this, i3 + ": " + strM4154l);
        return EnumC1007zk.f7916d;
    }
}
