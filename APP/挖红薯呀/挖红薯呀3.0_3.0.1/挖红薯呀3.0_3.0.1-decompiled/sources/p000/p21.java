package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class p21 extends av0 implements InterfaceC0904ww {

    /* JADX INFO: renamed from: f */
    public long[] f4697f;

    /* JADX INFO: renamed from: g */
    public int f4698g;

    /* JADX INFO: renamed from: h */
    public int f4699h;

    /* JADX INFO: renamed from: i */
    public int f4700i;

    /* JADX INFO: renamed from: j */
    public /* synthetic */ Object f4701j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ q21 f4702k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p21(q21 q21Var, InterfaceC0322ik interfaceC0322ik) {
        super(interfaceC0322ik);
        this.f4702k = q21Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0955y9
    /* JADX INFO: renamed from: g */
    public final InterfaceC0322ik mo15g(Object obj, InterfaceC0322ik interfaceC0322ik) {
        p21 p21Var = new p21(this.f4702k, interfaceC0322ik);
        p21Var.f4701j = obj;
        return p21Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0904ww
    public final Object invoke(Object obj, Object obj2) {
        return ((p21) mo15g((q01) obj, (InterfaceC0322ik) obj2)).mo16m(na1.f4229a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x007e -> B:26:0x0093). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00bc -> B:37:0x00be). Please report as a decompilation issue!!! */
    @Override // p000.AbstractC0955y9
    /* JADX INFO: renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo16m(Object obj) {
        q01 q01Var;
        long[] jArr;
        int length;
        int i;
        q01 q01Var2;
        int i2;
        q01 q01Var3;
        int i3;
        q21 q21Var = this.f4702k;
        long j = q21Var.f5029d;
        long j2 = q21Var.f5031f;
        long j3 = q21Var.f5030e;
        int i4 = this.f4700i;
        EnumC1007zk enumC1007zk = EnumC1007zk.f7916d;
        if (i4 == 0) {
            w60.m4891M(obj);
            q01Var = (q01) this.f4701j;
            jArr = q21Var.f5032g;
            if (jArr != null) {
                length = jArr.length;
                i = 0;
            }
            if (j3 != 0) {
                q01Var2 = q01Var;
                i2 = 0;
                if (i2 >= 64) {
                }
            }
            if (j != 0) {
            }
            return na1.f4229a;
        }
        if (i4 == 1) {
            length = this.f4699h;
            int i5 = this.f4698g;
            jArr = this.f4697f;
            q01Var = (q01) this.f4701j;
            w60.m4891M(obj);
            i = i5 + 1;
        } else {
            if (i4 != 2) {
                if (i4 != 3) {
                    C0921xc.m5134o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i6 = this.f4698g;
                q01Var3 = (q01) this.f4701j;
                w60.m4891M(obj);
                i3 = i6 + 1;
                if (i3 < 64) {
                    if (((1 << i3) & j) != 0) {
                        Long l = new Long(j2 + ((long) i3) + 64);
                        this.f4701j = q01Var3;
                        this.f4697f = null;
                        this.f4698g = i3;
                        this.f4700i = 3;
                        q01Var3.m3184b(this, l);
                        return enumC1007zk;
                    }
                    i6 = i3;
                    i3 = i6 + 1;
                    if (i3 < 64) {
                    }
                }
                return na1.f4229a;
            }
            i2 = this.f4698g;
            q01Var2 = (q01) this.f4701j;
            w60.m4891M(obj);
            i2++;
            if (i2 >= 64) {
                q01Var = q01Var2;
                if (j != 0) {
                    q01Var3 = q01Var;
                    i3 = 0;
                    if (i3 < 64) {
                    }
                }
                return na1.f4229a;
            }
            if ((j3 & (1 << i2)) != 0) {
                Long l2 = new Long(j2 + ((long) i2));
                this.f4701j = q01Var2;
                this.f4697f = null;
                this.f4698g = i2;
                this.f4700i = 2;
                q01Var2.m3184b(this, l2);
                return enumC1007zk;
            }
            i2++;
            if (i2 >= 64) {
            }
        }
        if (i < length) {
            Long l3 = new Long(jArr[i]);
            this.f4701j = q01Var;
            this.f4697f = jArr;
            this.f4698g = i;
            this.f4699h = length;
            this.f4700i = 1;
            q01Var.m3184b(this, l3);
            return enumC1007zk;
        }
        if (j3 != 0) {
        }
        if (j != 0) {
        }
        return na1.f4229a;
    }
}
