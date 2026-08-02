package p000;

import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class hi0 extends zf1 {

    /* JADX INFO: renamed from: g */
    public Class f4030g;

    /* JADX INFO: renamed from: h */
    public in0 f4031h;

    @Override // p000.zf1
    /* JADX INFO: renamed from: a */
    public final Map mo2193a() {
        return we1.m5877r0(super.mo2193a(), we1.m5876q0(new ow1("isEnumConstant", null), new ow1("isEnumConstantNot", null), new ow1("type", this.f4030g), new ow1("typeCondition", this.f4031h), new ow1("genericType", null), new ow1("genericTypeCondition", null)));
    }

    /* JADX INFO: renamed from: c */
    public final List m2194c() throws NoSuchFieldException, NoSuchMethodException {
        yf1 yf1Var = this.f13870a;
        if (yf1Var == null) {
            C0676s.m4651j("You must provide a configuration to resolve the member use build(configuration).");
            return null;
        }
        List listM5291T = AbstractC0738tl.m5291T(this, yf1Var, yf1Var.f13434a, new C0962zh(8, this, yf1Var));
        listM5291T.getClass();
        return listM5291T;
    }
}
