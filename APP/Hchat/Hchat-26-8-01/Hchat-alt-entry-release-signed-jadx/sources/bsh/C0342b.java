package bsh;

import bsh.BlockNameSpace;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import java.util.function.Function;

/* JADX INFO: renamed from: bsh.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0342b implements Function {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f991a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [bsh.BlockNameSpace.<clinit>():void, bsh.BshClassManager.<clinit>():void, bsh.BshMethod.getParameterNames():java.lang.String[], bsh.Invocable.getParamTypeDescriptors():java.lang.String[], bsh.Invocable.hashCode():int, bsh.NameSpace.getMethods():bsh.BshMethod[], bsh.Reflect.getEnumConstants(java.lang.Class<T>):T[], bsh.StringUtil.getTypeNamesStream(java.lang.Class<?>[]):java.util.stream.Stream<java.lang.String>] */
    public /* synthetic */ C0342b(int i9) {
        this.f991a = i9;
    }

    /* JADX DEBUG: Class process forced to load method for inline: bsh.BlockNameSpace.h(bsh.BlockNameSpace$UniqueBlock):bsh.BlockNameSpace */
    /* JADX DEBUG: Class process forced to load method for inline: bsh.BshClassManager.a(java.lang.Class):bsh.BshClassManager$MemberCache */
    /* JADX DEBUG: Class process forced to load method for inline: bsh.BshMethod.b(java.lang.Integer):java.lang.String */
    /* JADX DEBUG: Class process forced to load method for inline: bsh.NameSpace.g(java.util.List):java.util.stream.Stream */
    /* JADX DEBUG: Class process forced to load method for inline: bsh.StringUtil.a(java.lang.Class):java.lang.String */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f991a) {
            case 0:
                return BlockNameSpace.lambda$static$0((BlockNameSpace.UniqueBlock) obj);
            case 1:
                return BSHType.getTypeDescriptor((Class) obj);
            case 2:
                return BshClassManager.lambda$static$0((Class) obj);
            case 3:
                return BshMethod.lambda$getParameterNames$0((Integer) obj);
            case 4:
                return StringUtil.variableString((Variable) obj);
            case 5:
                return "    ".concat((String) obj);
            case 6:
                return StringUtil.methodString((BshMethod) obj);
            case 7:
                return StringUtil.variableString((Field) obj);
            case 8:
                return StringUtil.methodString((Method) obj);
            case 9:
                return Character.toChars(((Integer) obj).intValue());
            case 10:
                return String.valueOf((char[]) obj);
            case 11:
                return Invocable.lambda$hashCode$1((Class) obj);
            case 12:
                return ((List) obj).stream();
            case 13:
                return obj.toString();
            case 14:
                return Reflect.lambda$getEnumConstants$7((Field) obj);
            default:
                return StringUtil.getTypeName((Class) obj);
        }
    }
}
