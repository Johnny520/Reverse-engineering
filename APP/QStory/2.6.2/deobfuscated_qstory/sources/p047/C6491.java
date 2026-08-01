package p047;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.InterfaceC5183;
import kotlin.collections.AbstractC4346;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import p053.AbstractC6560;

/* JADX INFO: renamed from: 飘花落叶言世子兰楪哲苏.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C6491 implements InvocationHandler {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final List f17788;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final InterfaceC5183 f17789;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Map f17790;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final InterfaceC5183 f17791;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Class f17792;

    public C6491(Class cls, Map map, InterfaceC5183 interfaceC5183, InterfaceC5183 interfaceC51832, List list) {
        this.f17792 = cls;
        this.f17790 = map;
        this.f17791 = interfaceC5183;
        this.f17789 = interfaceC51832;
        this.f17788 = list;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) throws IllegalAccessException, InvocationTargetException {
        boolean zM8917;
        String name = method.getName();
        Class cls = this.f17792;
        if (name != null) {
            int iHashCode = name.hashCode();
            if (iHashCode != -1776922004) {
                if (iHashCode != 147696667) {
                    if (iHashCode == 1444986633 && name.equals("annotationType")) {
                        return cls;
                    }
                } else if (name.equals("hashCode")) {
                    return Integer.valueOf(((Number) this.f17789.getValue()).intValue());
                }
            } else if (name.equals("toString")) {
                return (String) this.f17791.getValue();
            }
        }
        boolean zM89172 = AbstractC4394.m8917(name, "equals");
        Map map = this.f17790;
        boolean z = false;
        if (!zM89172 || objArr == null || objArr.length != 1) {
            if (map.containsKey(name)) {
                return map.get(name);
            }
            StringBuilder sb = new StringBuilder("Method is not supported: ");
            sb.append(method);
            sb.append(" (args: ");
            if (objArr == null) {
                objArr = new Object[0];
            }
            sb.append(AbstractC4346.m8850(objArr));
            sb.append(')');
            throw new KotlinReflectionInternalError(sb.toString());
        }
        Object objM8853 = AbstractC4346.m8853(objArr);
        Annotation annotation = objM8853 instanceof Annotation ? (Annotation) objM8853 : null;
        if (AbstractC4394.m8917(annotation != null ? AbstractC6560.m12029(AbstractC6560.m12033(annotation)) : null, cls)) {
            List<Method> list = this.f17788;
            if (list == null || !list.isEmpty()) {
                for (Method method2 : list) {
                    Object obj2 = map.get(method2.getName());
                    Object objInvoke = method2.invoke(objM8853, null);
                    if (obj2 instanceof boolean[]) {
                        objInvoke.getClass();
                        zM8917 = Arrays.equals((boolean[]) obj2, (boolean[]) objInvoke);
                    } else if (obj2 instanceof char[]) {
                        objInvoke.getClass();
                        zM8917 = Arrays.equals((char[]) obj2, (char[]) objInvoke);
                    } else if (obj2 instanceof byte[]) {
                        objInvoke.getClass();
                        zM8917 = Arrays.equals((byte[]) obj2, (byte[]) objInvoke);
                    } else if (obj2 instanceof short[]) {
                        objInvoke.getClass();
                        zM8917 = Arrays.equals((short[]) obj2, (short[]) objInvoke);
                    } else if (obj2 instanceof int[]) {
                        objInvoke.getClass();
                        zM8917 = Arrays.equals((int[]) obj2, (int[]) objInvoke);
                    } else if (obj2 instanceof float[]) {
                        objInvoke.getClass();
                        zM8917 = Arrays.equals((float[]) obj2, (float[]) objInvoke);
                    } else if (obj2 instanceof long[]) {
                        objInvoke.getClass();
                        zM8917 = Arrays.equals((long[]) obj2, (long[]) objInvoke);
                    } else if (obj2 instanceof double[]) {
                        objInvoke.getClass();
                        zM8917 = Arrays.equals((double[]) obj2, (double[]) objInvoke);
                    } else if (obj2 instanceof Object[]) {
                        objInvoke.getClass();
                        zM8917 = Arrays.equals((Object[]) obj2, (Object[]) objInvoke);
                    } else {
                        zM8917 = AbstractC4394.m8917(obj2, objInvoke);
                    }
                    if (!zM8917) {
                        break;
                    }
                }
                z = true;
            } else {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }
}
