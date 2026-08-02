package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class sg1 extends zf1 {
    public Class C;
    public in0 D;
    public in0 i;
    public Integer l;
    public final ArrayList g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final LinkedHashSet j = new LinkedHashSet();
    public final LinkedHashSet k = new LinkedHashSet();
    public final LinkedHashSet m = new LinkedHashSet();
    public final LinkedHashSet n = new LinkedHashSet();
    public final LinkedHashSet o = new LinkedHashSet();
    public final LinkedHashSet p = new LinkedHashSet();
    public final LinkedHashSet q = new LinkedHashSet();
    public final LinkedHashSet r = new LinkedHashSet();
    public final ArrayList s = new ArrayList();
    public final ArrayList t = new ArrayList();
    public final LinkedHashSet u = new LinkedHashSet();
    public final LinkedHashSet v = new LinkedHashSet();
    public final LinkedHashSet w = new LinkedHashSet();
    public final LinkedHashSet x = new LinkedHashSet();
    public final LinkedHashSet y = new LinkedHashSet();
    public final LinkedHashSet z = new LinkedHashSet();
    public final LinkedHashSet A = new LinkedHashSet();
    public final LinkedHashSet B = new LinkedHashSet();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.zf1
    public final Map a() {
        return we1.r0(we1.r0(super.a(), we1.q0(new ow1("parameters", this.g), new ow1("parametersNot", this.h), new ow1("parametersCondition", this.i), new ow1("parameterCount", this.l), new ow1("parameterCountCondition", null), new ow1("typeParameters", this.j), new ow1("typeParametersNot", this.k), new ow1("exceptionTypes", this.m), new ow1("exceptionTypesNot", this.n), new ow1("genericExceptionTypes", this.o), new ow1("genericExceptionTypesNot", this.p), new ow1("genericParameters", this.q), new ow1("genericParametersNot", this.r), new ow1("isVarArgs", null), new ow1("isVarArgsNot", null), new ow1("parameterAnnotations", this.s), new ow1("parameterAnnotationsNot", this.t), new ow1("annotatedReturnType", this.u), new ow1("annotatedReturnTypeNot", this.v), new ow1("annotatedReceiverType", this.w), new ow1("annotatedReceiverTypeNot", this.x), new ow1("annotatedParameterTypes", this.y), new ow1("annotatedParameterTypesNot", this.z), new ow1("annotatedExceptionTypes", this.A), new ow1("annotatedExceptionTypesNot", this.B))), we1.q0(new ow1("returnType", this.C), new ow1("returnTypeCondition", this.D), new ow1("genericReturnType", null), new ow1("genericReturnTypeCondition", null), new ow1("isBridge", null), new ow1("isBridgeNot", null), new ow1("isDefault", null), new ow1("isDefaultNot", null), new ow1("defaultValue", null), new ow1("defaultValueCondition", null)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final List c() throws NoSuchFieldException, NoSuchMethodException {
        yf1 yf1Var = this.a;
        if (yf1Var == null) {
            s.j("You must provide a configuration to resolve the member use build(configuration).");
            return null;
        }
        List listT = tl.T(this, yf1Var, yf1Var.a, new zh(7, this, yf1Var));
        listT.getClass();
        return listT;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d(Object... objArr) {
        iu.h0(this.g, Arrays.copyOf(objArr, objArr.length));
    }
}
