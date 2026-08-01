package p000;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: bk */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0058bk extends m51 implements InterfaceC0904ww {

    /* JADX INFO: renamed from: h */
    public int f522h;

    /* JADX INFO: renamed from: i */
    public /* synthetic */ Object f523i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ C0095ck f524j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ va1 f525k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ InterfaceC0386kb f526l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ long f527m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0058bk(C0095ck c0095ck, va1 va1Var, InterfaceC0386kb interfaceC0386kb, long j, InterfaceC0322ik interfaceC0322ik) {
        super(2, interfaceC0322ik);
        this.f524j = c0095ck;
        this.f525k = va1Var;
        this.f526l = interfaceC0386kb;
        this.f527m = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0955y9
    /* JADX INFO: renamed from: g */
    public final InterfaceC0322ik mo15g(Object obj, InterfaceC0322ik interfaceC0322ik) {
        C0058bk c0058bk = new C0058bk(this.f524j, this.f525k, this.f526l, this.f527m, interfaceC0322ik);
        c0058bk.f523i = obj;
        return c0058bk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0904ww
    public final Object invoke(Object obj, Object obj2) {
        return ((C0058bk) mo15g((InterfaceC0966yk) obj, (InterfaceC0322ik) obj2)).mo16m(na1.f4229a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0955y9
    /* JADX INFO: renamed from: m */
    public final Object mo16m(Object obj) {
        C0095ck c0095ck = this.f524j;
        C0166eb c0166eb = c0095ck.f836w;
        int i = this.f522h;
        try {
            try {
                if (i == 0) {
                    w60.m4891M(obj);
                    c40 c40VarM3065y = pf1.m3065y(((InterfaceC0966yk) this.f523i).mo1328f());
                    c0095ck.f839z = true;
                    lz0 lz0Var = c0095ck.f832s;
                    vh0 vh0Var = vh0.f6718d;
                    C0021ak c0021ak = new C0021ak(this.f525k, c0095ck, this.f526l, this.f527m, c40VarM3065y, null);
                    this.f522h = 1;
                    Object objM2095f = lz0Var.m2095f(vh0Var, c0021ak, this);
                    EnumC1007zk enumC1007zk = EnumC1007zk.f7916d;
                    if (objM2095f == enumC1007zk) {
                        return enumC1007zk;
                    }
                } else {
                    if (i != 1) {
                        C0921xc.m5134o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w60.m4891M(obj);
                }
                c0166eb.m826b();
                c0095ck.f839z = false;
                c0166eb.m825a(null);
                c0095ck.f837x = false;
                return na1.f4229a;
            } catch (CancellationException e) {
                throw e;
            }
        } catch (Throwable th) {
            c0095ck.f839z = false;
            c0166eb.m825a(null);
            c0095ck.f837x = false;
            throw th;
        }
    }
}
