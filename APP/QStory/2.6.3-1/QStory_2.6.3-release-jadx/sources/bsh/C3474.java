package bsh;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.List;
import java.util.function.Function;
import p025.AbstractC7012;

/* JADX INFO: renamed from: bsh.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3474 implements Function {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f8257;

    public /* synthetic */ C3474(int i) {
        this.f8257 = i;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f8257) {
            case 0:
                return BlockNameSpace.lambda$static$0((C3473) obj);
            case 1:
                return BSHType.getTypeDescriptor((Class) obj);
            case 2:
                return new C3489((Class) obj);
            case 3:
                return BshMethod.lambda$getParameterNames$0((Integer) obj);
            case 4:
                return AbstractC3462.m5887((Variable) obj);
            case 5:
                return "    ".concat((String) obj);
            case 6:
                return AbstractC3462.m5890((BshMethod) obj);
            case 7:
                Field field = (Field) obj;
                return Modifier.toString(field.getModifiers()) + " " + AbstractC3462.m5891(field.getType()) + " " + field.getName() + ";";
            case 8:
                Method method = (Method) obj;
                String string = Modifier.toString(method.getModifiers());
                StringBuilder sbM12143 = AbstractC7012.m12143(string, " ");
                sbM12143.append(AbstractC3462.m5891(method.getReturnType()));
                sbM12143.append(" ");
                sbM12143.append(AbstractC3462.m5894(method.getName(), method.getParameterTypes()));
                sbM12143.append(string.contains("abstract") ? ";" : " {}");
                return sbM12143.toString();
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
                return AbstractC3462.m5891((Class) obj);
        }
    }
}
