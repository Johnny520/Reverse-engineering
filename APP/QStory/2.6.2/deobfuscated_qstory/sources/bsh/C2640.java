package bsh;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.List;
import java.util.function.Function;
import p007.AbstractC6136;

/* JADX INFO: renamed from: bsh.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2640 implements Function {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f7910;

    public /* synthetic */ C2640(int i) {
        this.f7910 = i;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f7910) {
            case 0:
                return BlockNameSpace.lambda$static$0((C2639) obj);
            case 1:
                return BSHType.getTypeDescriptor((Class) obj);
            case 2:
                return new C2655((Class) obj);
            case 3:
                return BshMethod.lambda$getParameterNames$0((Integer) obj);
            case 4:
                return AbstractC2628.m5282((Variable) obj);
            case 5:
                return "    ".concat((String) obj);
            case 6:
                return AbstractC2628.m5285((BshMethod) obj);
            case 7:
                Field field = (Field) obj;
                return Modifier.toString(field.getModifiers()) + " " + AbstractC2628.m5286(field.getType()) + " " + field.getName() + ";";
            case 8:
                Method method = (Method) obj;
                String string = Modifier.toString(method.getModifiers());
                StringBuilder sbM11553 = AbstractC6136.m11553(string, " ");
                sbM11553.append(AbstractC2628.m5286(method.getReturnType()));
                sbM11553.append(" ");
                sbM11553.append(AbstractC2628.m5289(method.getName(), method.getParameterTypes()));
                sbM11553.append(string.contains("abstract") ? ";" : " {}");
                return sbM11553.toString();
            case 9:
                return Character.toChars(((Integer) obj).intValue());
            case 10:
                return String.valueOf((char[]) obj);
            case 11:
                Class cls = (Class) obj;
                return Integer.valueOf(cls == null ? 39 : cls.hashCode());
            case 12:
                return ((List) obj).stream();
            case 13:
                return obj.toString();
            case 14:
                try {
                    return ((Field) obj).get(null);
                } catch (Exception unused) {
                    return null;
                }
            default:
                return AbstractC2628.m5286((Class) obj);
        }
    }
}
