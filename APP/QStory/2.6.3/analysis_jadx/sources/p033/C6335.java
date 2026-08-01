package p033;

import androidx.compose.runtime.internal.C1245;
import androidx.window.area.AbstractC2567;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Objects;
import lin.util.ReflectUtils.ReflectException;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言世哲子苏楪兰.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6335 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final HashMap f17457 = new HashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public C1245 f17458;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static C6335 m11853(String str) {
        C6335 c6335 = new C6335();
        C1245 c1245 = new C1245(8);
        c6335.f17458 = c1245;
        c1245.f3621 = str;
        return c6335;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static C6335 m11854(Class cls) {
        C6335 c6335 = new C6335();
        C1245 c1245 = new C1245(8);
        c6335.f17458 = c1245;
        c1245.f3620 = cls;
        c1245.f3621 = cls.getName();
        return c6335;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Method m11855() {
        C1245 c1245 = this.f17458;
        String str = (String) c1245.f3621;
        String str2 = (String) c1245.f3618;
        Class[] clsArr = (Class[]) c1245.f3619;
        Class cls = (Class) c1245.f3617;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(".");
        sb.append(str2);
        sb.append("(");
        for (Class cls2 : clsArr) {
            sb.append(cls2.getName());
            sb.append(",");
        }
        if (sb.charAt(sb.length() - 1) == ',') {
            sb.delete(sb.length() - 1, sb.length());
        }
        sb.append(")");
        if (cls != null) {
            sb.append(cls.getName());
        }
        String string = sb.toString();
        HashMap map = f17457;
        if (map.containsKey(string)) {
            return (Method) map.get(string);
        }
        Class superclass = (Class) c1245.f3620;
        if (superclass == null) {
            superclass = AbstractC6337.m11866((String) c1245.f3621);
        }
        while (superclass != Object.class) {
            for (Method method : superclass.getDeclaredMethods()) {
                if ((((String) c1245.f3618) == null || method.getName().equals((String) c1245.f3618)) && (((Class) c1245.f3617) == null || method.getReturnType().equals((Class) c1245.f3617))) {
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    if (parameterTypes.length == ((Class[]) c1245.f3619).length) {
                        for (int i = 0; i < parameterTypes.length; i++) {
                            Class cls3 = ((Class[]) c1245.f3619)[i];
                            if (cls3 != Object.class && (!Objects.equals(parameterTypes[i], cls3) || !AbstractC2567.m5076(parameterTypes[i], ((Class[]) c1245.f3619)[i]))) {
                                break;
                            }
                        }
                        method.setAccessible(true);
                        map.put(string, method);
                        return method;
                    }
                    continue;
                }
            }
            superclass = superclass.getSuperclass();
        }
        throw new ReflectException("没有查找到方法 : ".concat(string));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Object m11856(Object obj, Object... objArr) {
        try {
            return m11855().invoke(obj, objArr);
        } catch (Exception e) {
            C5925.m11313(e);
            return null;
        }
    }
}
