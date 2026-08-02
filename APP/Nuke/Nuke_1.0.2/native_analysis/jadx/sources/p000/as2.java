package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class as2 extends w92 implements mn0 {

    /* JADX INFO: renamed from: j */
    public long[] f364j;

    /* JADX INFO: renamed from: k */
    public int f365k;

    /* JADX INFO: renamed from: l */
    public int f366l;

    /* JADX INFO: renamed from: m */
    public int f367m;

    /* JADX INFO: renamed from: n */
    public /* synthetic */ Object f368n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ bs2 f369o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public as2(bs2 bs2Var, t00 t00Var) {
        super(2, t00Var);
        this.f369o = bs2Var;
    }

    @Override // p000.mn0
    /* JADX INFO: renamed from: g */
    public final Object mo12g(Object obj, Object obj2) {
        return ((as2) mo13p((t00) obj2, (vo2) obj)).mo7r(a83.f116a);
    }

    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: p */
    public final t00 mo13p(t00 t00Var, Object obj) {
        as2 as2Var = new as2(this.f369o, t00Var);
        as2Var.f368n = obj;
        return as2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x007e -> B:26:0x0093). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00bc -> B:37:0x00be). Please report as a decompilation issue!!! */
    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo7r(Object obj) {
        vo2 vo2Var;
        long[] jArr;
        int length;
        int i;
        vo2 vo2Var2;
        int i2;
        vo2 vo2Var3;
        int i3;
        bs2 bs2Var = this.f369o;
        long j = bs2Var.f1004h;
        long j2 = bs2Var.f1006j;
        long j3 = bs2Var.f1005i;
        int i4 = this.f367m;
        k20 k20Var = k20.f5323h;
        if (i4 == 0) {
            fg1.m1627T(obj);
            vo2Var = (vo2) this.f368n;
            jArr = bs2Var.f1007k;
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
            return a83.f116a;
        }
        if (i4 == 1) {
            length = this.f366l;
            int i5 = this.f365k;
            jArr = this.f364j;
            vo2Var = (vo2) this.f368n;
            fg1.m1627T(obj);
            i = i5 + 1;
        } else {
            if (i4 != 2) {
                if (i4 != 3) {
                    C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i6 = this.f365k;
                vo2Var3 = (vo2) this.f368n;
                fg1.m1627T(obj);
                i3 = i6 + 1;
                if (i3 < 64) {
                    if (((1 << i3) & j) != 0) {
                        Long l = new Long(j2 + ((long) i3) + 64);
                        this.f368n = vo2Var3;
                        this.f364j = null;
                        this.f365k = i3;
                        this.f367m = 3;
                        vo2Var3.m5746b(this, l);
                        return k20Var;
                    }
                    i6 = i3;
                    i3 = i6 + 1;
                    if (i3 < 64) {
                    }
                }
                return a83.f116a;
            }
            i2 = this.f365k;
            vo2Var2 = (vo2) this.f368n;
            fg1.m1627T(obj);
            i2++;
            if (i2 >= 64) {
                vo2Var = vo2Var2;
                if (j != 0) {
                    vo2Var3 = vo2Var;
                    i3 = 0;
                    if (i3 < 64) {
                    }
                }
                return a83.f116a;
            }
            if ((j3 & (1 << i2)) != 0) {
                Long l2 = new Long(j2 + ((long) i2));
                this.f368n = vo2Var2;
                this.f364j = null;
                this.f365k = i2;
                this.f367m = 2;
                vo2Var2.m5746b(this, l2);
                return k20Var;
            }
            i2++;
            if (i2 >= 64) {
            }
        }
        if (i < length) {
            Long l3 = new Long(jArr[i]);
            this.f368n = vo2Var;
            this.f364j = jArr;
            this.f365k = i;
            this.f366l = length;
            this.f367m = 1;
            vo2Var.m5746b(this, l3);
            return k20Var;
        }
        if (j3 != 0) {
        }
        if (j != 0) {
        }
        return a83.f116a;
    }
}
