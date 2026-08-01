package p047;

import com.bumptech.glide.AbstractC3057;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.InterfaceC5184;
import kotlin.collections.AbstractC4347;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;

/* JADX INFO: renamed from: 飘花落叶言世子兰楪哲苏.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C6492 implements InvocationHandler {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final List f17784;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final InterfaceC5184 f17785;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Map f17786;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final InterfaceC5184 f17787;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Class f17788;

    public C6492(Class cls, Map map, InterfaceC5184 interfaceC5184, InterfaceC5184 interfaceC51842, List list) {
        this.f17788 = cls;
        this.f17786 = map;
        this.f17787 = interfaceC5184;
        this.f17785 = interfaceC51842;
        this.f17784 = list;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) throws IllegalAccessException, InvocationTargetException {
        boolean zM8907;
        String name = method.getName();
        Class cls = this.f17788;
        if (name != null) {
            int iHashCode = name.hashCode();
            if (iHashCode != -1776922004) {
                if (iHashCode != 147696667) {
                    if (iHashCode == 1444986633 && name.equals("annotationType")) {
                        return cls;
                    }
                } else if (name.equals("hashCode")) {
                    return Integer.valueOf(((Number) this.f17785.getValue()).intValue());
                }
            } else if (name.equals("toString")) {
                return (String) this.f17787.getValue();
            }
        }
        boolean zM89072 = AbstractC4395.m8907(name, "equals");
        Map map = this.f17786;
        boolean z = false;
        if (!zM89072 || objArr == null || objArr.length != 1) {
            if (map.containsKey(name)) {
                return map.get(name);
            }
            StringBuilder sb = new StringBuilder("Method is not supported: ");
            sb.append(method);
            sb.append(" (args: ");
            if (objArr == null) {
                objArr = new Object[0];
            }
            sb.append(AbstractC4347.m8846(objArr));
            sb.append(')');
            throw new KotlinReflectionInternalError(sb.toString());
        }
        Object objM8849 = AbstractC4347.m8849(objArr);
        Annotation annotation = objM8849 instanceof Annotation ? (Annotation) objM8849 : null;
        if (AbstractC4395.m8907(annotation != null ? AbstractC3057.m6756(AbstractC3057.m6759(annotation)) : null, cls)) {
            List<Method> list = this.f17784;
            if (list == null || !list.isEmpty()) {
                for (Method method2 : list) {
                    Object obj2 = map.get(method2.getName());
                    Object objInvoke = method2.invoke(objM8849, null);
                    if (obj2 instanceof boolean[]) {
                        objInvoke.getClass();
                        zM8907 = Arrays.equals((boolean[]) obj2, (boolean[]) objInvoke);
                    } else if (obj2 instanceof char[]) {
                        objInvoke.getClass();
                        zM8907 = Arrays.equals((char[]) obj2, (char[]) objInvoke);
                    } else if (obj2 instanceof byte[]) {
                        objInvoke.getClass();
                        zM8907 = Arrays.equals((byte[]) obj2, (byte[]) objInvoke);
                    } else if (obj2 instanceof short[]) {
                        objInvoke.getClass();
                        zM8907 = Arrays.equals((short[]) obj2, (short[]) objInvoke);
                    } else if (obj2 instanceof int[]) {
                        objInvoke.getClass();
                        zM8907 = Arrays.equals((int[]) obj2, (int[]) objInvoke);
                    } else if (obj2 instanceof float[]) {
                        objInvoke.getClass();
                        zM8907 = Arrays.equals((float[]) obj2, (float[]) objInvoke);
                    } else if (obj2 instanceof long[]) {
                        objInvoke.getClass();
                        zM8907 = Arrays.equals((long[]) obj2, (long[]) objInvoke);
                    } else if (obj2 instanceof double[]) {
                        objInvoke.getClass();
                        zM8907 = Arrays.equals((double[]) obj2, (double[]) objInvoke);
                    } else if (obj2 instanceof Object[]) {
                        objInvoke.getClass();
                        zM8907 = Arrays.equals((Object[]) obj2, (Object[]) objInvoke);
                    } else {
                        zM8907 = AbstractC4395.m8907(obj2, objInvoke);
                    }
                    if (!zM8907) {
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
