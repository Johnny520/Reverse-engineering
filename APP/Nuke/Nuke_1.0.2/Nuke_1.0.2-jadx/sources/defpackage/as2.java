package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class as2 extends w92 implements mn0 {
    public long[] j;
    public int k;
    public int l;
    public int m;
    public /* synthetic */ Object n;
    public final /* synthetic */ bs2 o;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public as2(bs2 bs2Var, t00 t00Var) {
        super(2, t00Var);
        this.o = bs2Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.mn0
    public final Object g(Object obj, Object obj2) {
        return ((as2) p((t00) obj2, (vo2) obj)).r(a83.a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rj
    public final t00 p(t00 t00Var, Object obj) {
        as2 as2Var = new as2(this.o, t00Var);
        as2Var.n = obj;
        return as2Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x007e -> B:26:0x0093). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00bc -> B:37:0x00be). Please report as a decompilation issue!!! */
    @Override // defpackage.rj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object r(Object obj) {
        vo2 vo2Var;
        long[] jArr;
        int length;
        int i;
        vo2 vo2Var2;
        int i2;
        vo2 vo2Var3;
        int i3;
        bs2 bs2Var = this.o;
        long j = bs2Var.h;
        long j2 = bs2Var.j;
        long j3 = bs2Var.i;
        int i4 = this.m;
        k20 k20Var = k20.h;
        if (i4 == 0) {
            fg1.T(obj);
            vo2Var = (vo2) this.n;
            jArr = bs2Var.k;
            if (jArr != null) {
                length = jArr.length;
                i = 0;
            }
            if (j3 != 0) {
                vo2Var2 = vo2Var;
                i2 = 0;
                if (i2 >= 64) {
                }
            }
            if (j != 0) {
            }
            return a83.a;
        }
        if (i4 == 1) {
            length = this.l;
            int i5 = this.k;
            jArr = this.j;
            vo2Var = (vo2) this.n;
            fg1.T(obj);
            i = i5 + 1;
        } else {
            if (i4 != 2) {
                if (i4 != 3) {
                    s.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i6 = this.k;
                vo2Var3 = (vo2) this.n;
                fg1.T(obj);
                i3 = i6 + 1;
                if (i3 < 64) {
                    if (((1 << i3) & j) != 0) {
                        Long l = new Long(j2 + ((long) i3) + 64);
                        this.n = vo2Var3;
                        this.j = null;
                        this.k = i3;
                        this.m = 3;
                        vo2Var3.b(this, l);
                        return k20Var;
                    }
                    i6 = i3;
                    i3 = i6 + 1;
                    if (i3 < 64) {
                    }
                }
                return a83.a;
            }
            i2 = this.k;
            vo2Var2 = (vo2) this.n;
            fg1.T(obj);
            i2++;
            if (i2 >= 64) {
                vo2Var = vo2Var2;
                if (j != 0) {
                    vo2Var3 = vo2Var;
                    i3 = 0;
                    if (i3 < 64) {
                    }
                }
                return a83.a;
            }
            if ((j3 & (1 << i2)) != 0) {
                Long l2 = new Long(j2 + ((long) i2));
                this.n = vo2Var2;
                this.j = null;
                this.k = i2;
                this.m = 2;
                vo2Var2.b(this, l2);
                return k20Var;
            }
            i2++;
            if (i2 >= 64) {
            }
        }
        if (i < length) {
            Long l3 = new Long(jArr[i]);
            this.n = vo2Var;
            this.j = jArr;
            this.k = i;
            this.l = length;
            this.m = 1;
            vo2Var.b(this, l3);
            return k20Var;
        }
        if (j3 != 0) {
        }
        if (j != 0) {
        }
        return a83.a;
    }
}
