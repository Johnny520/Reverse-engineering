package p000;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: z6 */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0989z6 extends m51 implements InterfaceC0742sw {

    /* JADX INFO: renamed from: h */
    public C0879w7 f7807h;

    /* JADX INFO: renamed from: i */
    public vt0 f7808i;

    /* JADX INFO: renamed from: j */
    public int f7809j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ C0045b7 f7810k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Object f7811l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ n61 f7812m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ long f7813n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ InterfaceC0742sw f7814o;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0989z6(C0045b7 c0045b7, Object obj, n61 n61Var, long j, InterfaceC0742sw interfaceC0742sw, InterfaceC0322ik interfaceC0322ik) {
        super(1, interfaceC0322ik);
        this.f7810k = c0045b7;
        this.f7811l = obj;
        this.f7812m = n61Var;
        this.f7813n = j;
        this.f7814o = interfaceC0742sw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0955y9
    /* JADX INFO: renamed from: c */
    public final InterfaceC0322ik mo25c(InterfaceC0322ik interfaceC0322ik) {
        return new C0989z6(this.f7810k, this.f7811l, this.f7812m, this.f7813n, this.f7814o, interfaceC0322ik);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0742sw
    public final Object invoke(Object obj) {
        return ((C0989z6) mo25c((InterfaceC0322ik) obj)).mo16m(na1.f4229a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0955y9
    /* JADX INFO: renamed from: m */
    public final Object mo16m(Object obj) {
        C0045b7 c0045b7;
        C0879w7 c0879w7;
        vt0 vt0Var;
        long j;
        C0952y6 c0952y6;
        C0879w7 c0879w72;
        vt0 vt0Var2;
        CancellationException cancellationException;
        n61 n61Var = this.f7812m;
        int i = this.f7809j;
        C0045b7 c0045b72 = this.f7810k;
        if (i == 0) {
            w60.m4891M(obj);
            try {
                c0045b72.f432c.f7017f = (AbstractC0046b8) c0045b72.f430a.f5089a.invoke(this.f7811l);
                c0045b72.f434e.setValue(n61Var.f4188c);
                c0045b72.f433d.setValue(Boolean.TRUE);
                C0879w7 c0879w73 = c0045b72.f432c;
                c0879w7 = new C0879w7(c0879w73.f7015d, c0879w73.f7016e.getValue(), AbstractC0307i4.m1537m(c0879w73.f7017f), c0879w73.f7018g, Long.MIN_VALUE, c0879w73.f7020i);
                vt0Var = new vt0();
                j = this.f7813n;
                c0952y6 = new C0952y6(c0045b72, c0879w7, this.f7814o, vt0Var, 0);
                c0045b7 = c0045b72;
            } catch (CancellationException e) {
                e = e;
                c0045b7 = c0045b72;
                cancellationException = e;
                C0045b7.m321b(c0045b7);
                throw cancellationException;
            }
            try {
                this.f7807h = c0879w7;
                this.f7808i = vt0Var;
                this.f7809j = 1;
                Object objM5435e = z60.m5435e(c0879w7, n61Var, j, c0952y6, this);
                EnumC1007zk enumC1007zk = EnumC1007zk.f7916d;
                if (objM5435e == enumC1007zk) {
                    return enumC1007zk;
                }
                c0879w72 = c0879w7;
                vt0Var2 = vt0Var;
            } catch (CancellationException e2) {
                e = e2;
                cancellationException = e;
                C0045b7.m321b(c0045b7);
                throw cancellationException;
            }
        } else {
            if (i != 1) {
                C0921xc.m5134o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            vt0Var2 = this.f7808i;
            c0879w72 = this.f7807h;
            try {
                w60.m4891M(obj);
                c0045b7 = c0045b72;
            } catch (CancellationException e3) {
                cancellationException = e3;
                c0045b7 = c0045b72;
                C0045b7.m321b(c0045b7);
                throw cancellationException;
            }
        }
        EnumC0679r7 enumC0679r7 = vt0Var2.f6825d ? EnumC0679r7.f5307d : EnumC0679r7.f5308e;
        C0045b7.m321b(c0045b7);
        return new C0754t7(c0879w72, enumC0679r7);
    }
}
