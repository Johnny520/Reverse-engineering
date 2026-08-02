package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class zl2 extends tw2 implements mn0 {

    /* JADX INFO: renamed from: l */
    public int f13944l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ am2 f13945m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ float f13946n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ float f13947o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zl2(am2 am2Var, float f, float f2, t00 t00Var) {
        super(2, t00Var);
        this.f13945m = am2Var;
        this.f13946n = f;
        this.f13947o = f2;
    }

    @Override // p000.mn0
    /* JADX INFO: renamed from: g */
    public final Object mo12g(Object obj, Object obj2) {
        return ((zl2) mo13p((t00) obj2, (j20) obj)).mo7r(a83.f116a);
    }

    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: p */
    public final t00 mo13p(t00 t00Var, Object obj) {
        return new zl2(this.f13945m, this.f13946n, this.f13947o, t00Var);
    }

    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: r */
    public final Object mo7r(Object obj) {
        int i = this.f13944l;
        if (i == 0) {
            fg1.m1627T(obj);
            im2 im2Var = this.f13945m.f276U;
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(this.f13946n)) << 32) | (((long) Float.floatToRawIntBits(this.f13947o)) & 4294967295L);
            this.f13944l = 1;
            Object objM5511a = ul2.m5511a(im2Var, jFloatToRawIntBits, this);
            k20 k20Var = k20.f5323h;
            if (objM5511a == k20Var) {
                return k20Var;
            }
        } else {
            if (i != 1) {
                C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            fg1.m1627T(obj);
        }
        return a83.f116a;
    }
}
