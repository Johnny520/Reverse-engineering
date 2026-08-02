package defpackage;

import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class hi0 extends zf1 {
    public Class g;
    public in0 h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.zf1
    public final Map a() {
        return we1.r0(super.a(), we1.q0(new ow1("isEnumConstant", null), new ow1("isEnumConstantNot", null), new ow1("type", this.g), new ow1("typeCondition", this.h), new ow1("genericType", null), new ow1("genericTypeCondition", null)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final List c() throws NoSuchFieldException, NoSuchMethodException {
        yf1 yf1Var = this.a;
        if (yf1Var == null) {
            s.j("You must provide a configuration to resolve the member use build(configuration).");
            return null;
        }
        List listT = tl.T(this, yf1Var, yf1Var.a, new zh(8, this, yf1Var));
        listT.getClass();
        return listT;
    }
}
