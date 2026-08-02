package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class tk1 extends w92 implements mn0 {

    /* JADX INFO: renamed from: j */
    public ro0 f10805j;

    /* JADX INFO: renamed from: k */
    public uk1 f10806k;

    /* JADX INFO: renamed from: l */
    public long[] f10807l;

    /* JADX INFO: renamed from: m */
    public int f10808m;

    /* JADX INFO: renamed from: n */
    public int f10809n;

    /* JADX INFO: renamed from: o */
    public int f10810o;

    /* JADX INFO: renamed from: p */
    public int f10811p;

    /* JADX INFO: renamed from: q */
    public long f10812q;

    /* JADX INFO: renamed from: r */
    public int f10813r;

    /* JADX INFO: renamed from: s */
    public /* synthetic */ Object f10814s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ uk1 f10815t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ ro0 f10816u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tk1(uk1 uk1Var, ro0 ro0Var, t00 t00Var) {
        super(2, t00Var);
        this.f10815t = uk1Var;
        this.f10816u = ro0Var;
    }

    @Override // p000.mn0
    /* JADX INFO: renamed from: g */
    public final Object mo12g(Object obj, Object obj2) {
        return ((tk1) mo13p((t00) obj2, (vo2) obj)).mo7r(a83.f116a);
    }

    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: p */
    public final t00 mo13p(t00 t00Var, Object obj) {
        tk1 tk1Var = new tk1(this.f10815t, this.f10816u, t00Var);
        tk1Var.f10814s = obj;
        return tk1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a1  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x004f -> B:22:0x009f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0051 -> B:14:0x0064). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x006d -> B:19:0x0094). Please report as a decompilation issue!!! */
    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo7r(Object obj) {
        vo2 vo2Var;
        uk1 uk1Var;
        long[] jArr;
        int length;
        ro0 ro0Var;
        int i;
        long j;
        int i2 = this.f10813r;
        if (i2 == 0) {
            fg1.m1627T(obj);
            vo2Var = (vo2) this.f10814s;
            uk1Var = this.f10815t;
            jArr = uk1Var.f11341i.f10174a;
            length = jArr.length - 2;
            if (length >= 0) {
                ro0Var = this.f10816u;
                i = 0;
                j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                }
                if (i != length) {
                }
            }
            return a83.f116a;
        }
        if (i2 != 1) {
            C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        int i3 = this.f10811p;
        int i4 = this.f10810o;
        long j2 = this.f10812q;
        int i5 = this.f10809n;
        int i6 = this.f10808m;
        long[] jArr2 = this.f10807l;
        uk1 uk1Var2 = this.f10806k;
        ro0 ro0Var2 = this.f10805j;
        vo2 vo2Var2 = (vo2) this.f10814s;
        fg1.m1627T(obj);
        j2 >>= 8;
        i3++;
        if (i3 < i4) {
            if (i4 == 8) {
                length = i6;
                jArr = jArr2;
                uk1Var = uk1Var2;
                vo2Var = vo2Var2;
                i = i5;
                ro0Var = ro0Var2;
                if (i != length) {
                    i++;
                    j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        vo2Var2 = vo2Var;
                        i3 = 0;
                        uk1Var2 = uk1Var;
                        jArr2 = jArr;
                        i4 = 8 - ((~(i - length)) >>> 31);
                        ro0Var2 = ro0Var;
                        i5 = i;
                        i6 = length;
                        j2 = j;
                        if (i3 < i4) {
                            if ((255 & j2) < 128) {
                                int i7 = (i5 << 3) + i3;
                                ro0Var2.f9654i = i7;
                                Object obj2 = uk1Var2.f11341i.f10175b[i7];
                                this.f10814s = vo2Var2;
                                this.f10805j = ro0Var2;
                                this.f10806k = uk1Var2;
                                this.f10807l = jArr2;
                                this.f10808m = i6;
                                this.f10809n = i5;
                                this.f10812q = j2;
                                this.f10810o = i4;
                                this.f10811p = i3;
                                this.f10813r = 1;
                                vo2Var2.m5746b(this, obj2);
                                return k20.f5323h;
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
            return a83.f116a;
        }
    }
}
