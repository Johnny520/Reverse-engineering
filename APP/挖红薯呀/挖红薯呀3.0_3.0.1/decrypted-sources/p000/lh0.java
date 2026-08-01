package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class lh0 extends av0 implements InterfaceC0904ww {

    /* JADX INFO: renamed from: f */
    public C0410kx f3485f;

    /* JADX INFO: renamed from: g */
    public mh0 f3486g;

    /* JADX INFO: renamed from: h */
    public long[] f3487h;

    /* JADX INFO: renamed from: i */
    public int f3488i;

    /* JADX INFO: renamed from: j */
    public int f3489j;

    /* JADX INFO: renamed from: k */
    public int f3490k;

    /* JADX INFO: renamed from: l */
    public int f3491l;

    /* JADX INFO: renamed from: m */
    public long f3492m;

    /* JADX INFO: renamed from: n */
    public int f3493n;

    /* JADX INFO: renamed from: o */
    public /* synthetic */ Object f3494o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ mh0 f3495p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ C0410kx f3496q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lh0(mh0 mh0Var, C0410kx c0410kx, InterfaceC0322ik interfaceC0322ik) {
        super(interfaceC0322ik);
        this.f3495p = mh0Var;
        this.f3496q = c0410kx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0955y9
    /* JADX INFO: renamed from: g */
    public final InterfaceC0322ik mo15g(Object obj, InterfaceC0322ik interfaceC0322ik) {
        lh0 lh0Var = new lh0(this.f3495p, this.f3496q, interfaceC0322ik);
        lh0Var.f3494o = obj;
        return lh0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0904ww
    public final Object invoke(Object obj, Object obj2) {
        return ((lh0) mo15g((q01) obj, (InterfaceC0322ik) obj2)).mo16m(na1.f4229a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a1  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x004f -> B:22:0x009f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0051 -> B:14:0x0064). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x006d -> B:19:0x0094). Please report as a decompilation issue!!! */
    @Override // p000.AbstractC0955y9
    /* JADX INFO: renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo16m(Object obj) {
        q01 q01Var;
        mh0 mh0Var;
        long[] jArr;
        int length;
        C0410kx c0410kx;
        int i;
        long j;
        int i2 = this.f3493n;
        if (i2 == 0) {
            w60.m4891M(obj);
            q01Var = (q01) this.f3494o;
            mh0Var = this.f3495p;
            jArr = mh0Var.f3982e.f3150a;
            length = jArr.length - 2;
            if (length >= 0) {
                c0410kx = this.f3496q;
                i = 0;
                j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                }
                if (i != length) {
                }
            }
            return na1.f4229a;
        }
        if (i2 != 1) {
            C0921xc.m5134o("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        int i3 = this.f3491l;
        int i4 = this.f3490k;
        long j2 = this.f3492m;
        int i5 = this.f3489j;
        int i6 = this.f3488i;
        long[] jArr2 = this.f3487h;
        mh0 mh0Var2 = this.f3486g;
        C0410kx c0410kx2 = this.f3485f;
        q01 q01Var2 = (q01) this.f3494o;
        w60.m4891M(obj);
        j2 >>= 8;
        i3++;
        if (i3 < i4) {
            if (i4 == 8) {
                length = i6;
                jArr = jArr2;
                mh0Var = mh0Var2;
                q01Var = q01Var2;
                i = i5;
                c0410kx = c0410kx2;
                if (i != length) {
                    i++;
                    j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        q01Var2 = q01Var;
                        i3 = 0;
                        mh0Var2 = mh0Var;
                        jArr2 = jArr;
                        i4 = 8 - ((~(i - length)) >>> 31);
                        c0410kx2 = c0410kx;
                        i5 = i;
                        i6 = length;
                        j2 = j;
                        if (i3 < i4) {
                            if ((255 & j2) < 128) {
                                int i7 = (i5 << 3) + i3;
                                c0410kx2.f3281e = i7;
                                Object obj2 = mh0Var2.f3982e.f3151b[i7];
                                this.f3494o = q01Var2;
                                this.f3485f = c0410kx2;
                                this.f3486g = mh0Var2;
                                this.f3487h = jArr2;
                                this.f3488i = i6;
                                this.f3489j = i5;
                                this.f3492m = j2;
                                this.f3490k = i4;
                                this.f3491l = i3;
                                this.f3493n = 1;
                                q01Var2.m3184b(this, obj2);
                                return EnumC1007zk.f7916d;
                            }
                            j2 >>= 8;
                            i3++;
                            if (i3 < i4) {
                            }
                        }
                    }
                    if (i != length) {
                    }
                }
            }
            return na1.f4229a;
        }
    }
}
