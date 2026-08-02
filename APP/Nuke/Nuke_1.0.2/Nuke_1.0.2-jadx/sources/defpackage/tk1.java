package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class tk1 extends w92 implements mn0 {
    public ro0 j;
    public uk1 k;
    public long[] l;
    public int m;
    public int n;
    public int o;
    public int p;
    public long q;
    public int r;
    public /* synthetic */ Object s;
    public final /* synthetic */ uk1 t;
    public final /* synthetic */ ro0 u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tk1(uk1 uk1Var, ro0 ro0Var, t00 t00Var) {
        super(2, t00Var);
        this.t = uk1Var;
        this.u = ro0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.mn0
    public final Object g(Object obj, Object obj2) {
        return ((tk1) p((t00) obj2, (vo2) obj)).r(a83.a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rj
    public final t00 p(t00 t00Var, Object obj) {
        tk1 tk1Var = new tk1(this.t, this.u, t00Var);
        tk1Var.s = obj;
        return tk1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a1  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x004f -> B:22:0x009f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0051 -> B:14:0x0064). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x006d -> B:19:0x0094). Please report as a decompilation issue!!! */
    @Override // defpackage.rj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object r(Object obj) {
        vo2 vo2Var;
        uk1 uk1Var;
        long[] jArr;
        int length;
        ro0 ro0Var;
        int i;
        long j;
        int i2 = this.r;
        if (i2 == 0) {
            fg1.T(obj);
            vo2Var = (vo2) this.s;
            uk1Var = this.t;
            jArr = uk1Var.i.a;
            length = jArr.length - 2;
            if (length >= 0) {
                ro0Var = this.u;
                i = 0;
                j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                }
                if (i != length) {
                }
            }
            return a83.a;
        }
        if (i2 != 1) {
            s.l("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        int i3 = this.p;
        int i4 = this.o;
        long j2 = this.q;
        int i5 = this.n;
        int i6 = this.m;
        long[] jArr2 = this.l;
        uk1 uk1Var2 = this.k;
        ro0 ro0Var2 = this.j;
        vo2 vo2Var2 = (vo2) this.s;
        fg1.T(obj);
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
                                ro0Var2.i = i7;
                                Object obj2 = uk1Var2.i.b[i7];
                                this.s = vo2Var2;
                                this.j = ro0Var2;
                                this.k = uk1Var2;
                                this.l = jArr2;
                                this.m = i6;
                                this.n = i5;
                                this.q = j2;
                                this.o = i4;
                                this.p = i3;
                                this.r = 1;
                                vo2Var2.b(this, obj2);
                                return k20.h;
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
            return a83.a;
        }
    }
}
