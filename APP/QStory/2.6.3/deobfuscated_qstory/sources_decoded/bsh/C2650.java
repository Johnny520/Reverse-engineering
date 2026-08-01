package bsh;

import java.lang.reflect.Method;
import java.util.function.IntFunction;

/* JADX INFO: renamed from: bsh.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2650 implements IntFunction {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f7931;

    public /* synthetic */ C2650(int i) {
        this.f7931 = i;
    }

    @Override // java.util.function.IntFunction
    public final Object apply(int i) {
        switch (this.f7931) {
            case 0:
                return BshMethod.lambda$getParameterNames$1(i);
            case 1:
                return new Method[i];
            case 2:
                return ExternalNameSpace.lambda$getVariableNames$0(i);
            case 3:
                return new String[i];
            case 4:
                return NameSpace.lambda$getVariables$1(i);
            case 5:
                return NameSpace.lambda$getDeclaredVariables$5(i);
            case 6:
                return NameSpace.lambda$getVariableNames$0(i);
            case 7:
                return NameSpace.lambda$getMethods$4(i);
            case 8:
                return NameSpace.lambda$getMethodNames$2(i);
            case 9:
                return new Class[i];
            case 10:
                return new Variable[i];
            case 11:
                return new String[i];
            case 12:
                return new String[i];
            default:
                return new String[i];
        }
    }
}
