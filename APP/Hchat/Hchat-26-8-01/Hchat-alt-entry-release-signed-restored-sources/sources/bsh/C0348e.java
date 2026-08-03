package bsh;

import java.util.function.IntFunction;

/* JADX INFO: renamed from: bsh.e */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0348e implements IntFunction {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f999a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [bsh.BshMethod.getParameterNames():java.lang.String[], bsh.ClassGeneratorUtil.lambda$checkAbstractMethodImplementation$4(java.util.List, java.lang.Class, java.lang.reflect.Method):void, bsh.ExternalNameSpace.getVariableNames():java.lang.String[], bsh.Invocable.getParamTypeDescriptors():java.lang.String[], bsh.NameSpace.getDeclaredVariables():bsh.Variable[], bsh.NameSpace.getMethodNames():java.lang.String[], bsh.NameSpace.getMethods():bsh.BshMethod[], bsh.NameSpace.getVariableNames():java.lang.String[], bsh.NameSpace.getVariables():bsh.Variable[], bsh.Reflect.constructObject(java.lang.Class<?>, java.lang.Object, java.lang.Object[]):java.lang.Object, bsh.Reflect.getVariableNames(bsh.NameSpace):java.lang.String[], bsh.Reflect.getVariables(bsh.NameSpace, java.lang.String[]):bsh.Variable[], bsh.StringUtil.getTypeNames(java.lang.Class<?>[]):java.lang.String[], bsh.StringUtil.getTypeNames(java.lang.Class<?>[], java.lang.String[]):java.lang.String[]] */
    public /* synthetic */ C0348e(int i9) {
        this.f999a = i9;
    }

    /* JADX DEBUG: Class process forced to load method for inline: bsh.ClassGeneratorUtil.a(int):java.lang.reflect.Method[] */
    /* JADX DEBUG: Class process forced to load method for inline: bsh.ExternalNameSpace.h(int):java.lang.String[] */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.function.IntFunction
    public final Object apply(int i9) {
        switch (this.f999a) {
            case 0:
                return BshMethod.lambda$getParameterNames$1(i9);
            case 1:
                return ClassGeneratorUtil.lambda$checkAbstractMethodImplementation$3(i9);
            case 2:
                return ExternalNameSpace.lambda$getVariableNames$0(i9);
            case 3:
                return Invocable.lambda$getParamTypeDescriptors$0(i9);
            case 4:
                return NameSpace.lambda$getVariables$1(i9);
            case 5:
                return NameSpace.lambda$getDeclaredVariables$5(i9);
            case 6:
                return NameSpace.lambda$getVariableNames$0(i9);
            case 7:
                return NameSpace.lambda$getMethods$4(i9);
            case 8:
                return NameSpace.lambda$getMethodNames$2(i9);
            case 9:
                return Reflect.lambda$constructObject$1(i9);
            case 10:
                return Reflect.lambda$getVariables$5(i9);
            case 11:
                return Reflect.lambda$getVariableNames$3(i9);
            case 12:
                return StringUtil.lambda$getTypeNames$2(i9);
            default:
                return StringUtil.lambda$getTypeNames$0(i9);
        }
    }
}
