package p000;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class w70 extends av0 implements InterfaceC0904ww {

    /* JADX INFO: renamed from: f */
    public nr0 f7021f;

    /* JADX INFO: renamed from: g */
    public nr0 f7022g;

    /* JADX INFO: renamed from: h */
    public int f7023h;

    /* JADX INFO: renamed from: i */
    public /* synthetic */ Object f7024i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ C0399km f7025j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w70(C0399km c0399km, InterfaceC0322ik interfaceC0322ik) {
        super(interfaceC0322ik);
        this.f7025j = c0399km;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0955y9
    /* JADX INFO: renamed from: g */
    public final InterfaceC0322ik mo15g(Object obj, InterfaceC0322ik interfaceC0322ik) {
        w70 w70Var = new w70(this.f7025j, interfaceC0322ik);
        w70Var.f7024i = obj;
        return w70Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0904ww
    public final Object invoke(Object obj, Object obj2) {
        return ((w70) mo15g((r51) obj, (InterfaceC0322ik) obj2)).mo16m(na1.f4229a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003e, code lost:
    
        if (r14 == r7) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0080 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x005f -> B:19:0x0063). Please report as a decompilation issue!!! */
    @Override // p000.AbstractC0955y9
    /* JADX INFO: renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo16m(Object obj) {
        r51 r51Var;
        nr0 nr0Var;
        r51 r51Var2;
        gp0 gp0Var = this.f7025j.f3542c;
        int i = this.f7023h;
        nr0 nr0Var2 = null;
        jr0 jr0Var = jr0.f2933d;
        EnumC1007zk enumC1007zk = EnumC1007zk.f7916d;
        if (i == 0) {
            w60.m4891M(obj);
            r51Var = (r51) this.f7024i;
            this.f7024i = r51Var;
            this.f7023h = 1;
            obj = m61.m2438b(r51Var, false, jr0Var, this);
        } else if (i == 1) {
            r51Var = (r51) this.f7024i;
            w60.m4891M(obj);
        } else {
            if (i != 2) {
                C0921xc.m5134o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            nr0 nr0Var3 = this.f7022g;
            nr0 nr0Var4 = this.f7021f;
            r51Var2 = (r51) this.f7024i;
            w60.m4891M(obj);
            ir0 ir0Var = (ir0) obj;
            List list = ir0Var.f2610a;
            int size = list.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    nr0 nr0Var5 = nr0Var4;
                    nr0Var2 = (nr0) ir0Var.f2610a.get(0);
                    nr0Var = nr0Var5;
                    break;
                }
                if (!w60.m4903j((nr0) list.get(i2))) {
                    nr0Var = nr0Var4;
                    nr0Var2 = nr0Var3;
                    break;
                }
                i2++;
            }
            if (nr0Var2 == null) {
                this.f7024i = r51Var2;
                this.f7021f = nr0Var;
                this.f7022g = nr0Var2;
                this.f7023h = 2;
                Object objM3387a = r51Var2.m3387a(jr0Var, this);
                if (objM3387a != enumC1007zk) {
                    nr0 nr0Var6 = nr0Var2;
                    nr0Var4 = nr0Var;
                    obj = objM3387a;
                    nr0Var3 = nr0Var6;
                    ir0 ir0Var2 = (ir0) obj;
                    List list2 = ir0Var2.f2610a;
                    int size2 = list2.size();
                    int i22 = 0;
                    while (true) {
                        if (i22 >= size2) {
                        }
                        i22++;
                    }
                    if (nr0Var2 == null) {
                        gp0Var.setValue(new ok0(ok0.m2933d(nr0Var2.f4307c, nr0Var.f4307c)));
                        return na1.f4229a;
                    }
                }
                return enumC1007zk;
            }
        }
        nr0Var = (nr0) obj;
        gp0Var.setValue(new ok0(0L));
        r51Var2 = r51Var;
        if (nr0Var2 == null) {
        }
    }
}
