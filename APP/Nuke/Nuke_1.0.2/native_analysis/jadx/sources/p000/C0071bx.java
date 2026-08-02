package p000;

/* JADX INFO: renamed from: bx */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0071bx extends tw2 implements mn0 {

    /* JADX INFO: renamed from: l */
    public int f1060l;

    /* JADX INFO: renamed from: m */
    public /* synthetic */ float f1061m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ ScrollCaptureCallbackC0109cx f1062n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0071bx(ScrollCaptureCallbackC0109cx scrollCaptureCallbackC0109cx, t00 t00Var) {
        super(2, t00Var);
        this.f1062n = scrollCaptureCallbackC0109cx;
    }

    @Override // p000.mn0
    /* JADX INFO: renamed from: g */
    public final Object mo12g(Object obj, Object obj2) {
        return ((C0071bx) mo13p((t00) obj2, Float.valueOf(((Number) obj).floatValue()))).mo7r(a83.f116a);
    }

    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: p */
    public final t00 mo13p(t00 t00Var, Object obj) {
        C0071bx c0071bx = new C0071bx(this.f1062n, t00Var);
        c0071bx.f1061m = ((Number) obj).floatValue();
        return c0071bx;
    }

    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: r */
    public final Object mo7r(Object obj) {
        int i = this.f1060l;
        if (i == 0) {
            fg1.m1627T(obj);
            float f = this.f1061m;
            ScrollCaptureCallbackC0109cx scrollCaptureCallbackC0109cx = this.f1062n;
            Object objM4505g = scrollCaptureCallbackC0109cx.f1759a.f9050d.f6221h.m4505g(kn2.f5663e);
            mn0 mn0Var = (mn0) (objM4505g != null ? objM4505g : null);
            if (mn0Var == null) {
                throw vi0.m5686e("Required value was null.");
            }
            rs1 rs1Var = new rs1((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L));
            this.f1060l = 1;
            obj = mn0Var.mo12g(rs1Var, this);
            k20 k20Var = k20.f5323h;
            if (obj == k20Var) {
                return k20Var;
            }
        } else {
            if (i != 1) {
                C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            fg1.m1627T(obj);
        }
        return new Float(Float.intBitsToFloat((int) (((rs1) obj).f9744a & 4294967295L)));
    }
}
