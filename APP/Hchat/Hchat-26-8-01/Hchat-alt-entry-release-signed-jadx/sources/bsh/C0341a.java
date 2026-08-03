package bsh;

import java.lang.reflect.Method;
import java.util.Objects;
import java.util.function.Predicate;

/* JADX INFO: renamed from: bsh.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0341a implements Predicate {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f990g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [bsh.BSHClassDeclaration.generateClass(bsh.CallStack, bsh.Interpreter):java.lang.Class<?>, bsh.BshClassManager.MemberCache.findStaticMethod(java.lang.String):bsh.Invocable, bsh.BshMethod.classLoaderChanged():void, bsh.ClassGeneratorUtil.checkAbstractMethodImplementation(java.lang.Class<?>):void, bsh.Reflect.<clinit>():void, bsh.Reflect.getEnumConstants(java.lang.Class<T>):T[], bsh.Reflect.getVariableNames(bsh.NameSpace):java.lang.String[], bsh.Reflect.getVariables(bsh.NameSpace, java.lang.String[]):bsh.Variable[]] */
    public /* synthetic */ C0341a(int i9) {
        this.f990g = i9;
    }

    /* JADX DEBUG: Class process forced to load method for inline: bsh.BSHClassDeclaration.a(bsh.BshMethod):boolean */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f990g) {
            case 0:
                return BSHClassDeclaration.lambda$generateClass$0((BshMethod) obj);
            case 1:
                return ((Invocable) obj).isStatic();
            case 2:
                return Reflect.isGeneratedClass((Class) obj);
            case 3:
                return ClassGeneratorUtil.lambda$checkAbstractMethodImplementation$0((Method) obj);
            case 4:
                return Objects.nonNull((Variable) obj);
            case 5:
                return Objects.nonNull(obj);
            case 6:
                return Reflect.lambda$getVariableNames$2((String) obj);
            default:
                return Reflect.lambda$static$0((String) obj);
        }
    }
}
