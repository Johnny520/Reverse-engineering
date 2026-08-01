package p063;

import com.bumptech.glide.AbstractC3889;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.InterfaceC6016;
import kotlin.collections.AbstractC5179;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;

/* JADX INFO: renamed from: 飘花落叶言世子兰楪哲苏.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C7321 implements InvocationHandler {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final List f18129;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final InterfaceC6016 f18130;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Map f18131;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final InterfaceC6016 f18132;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Class f18133;

    public C7321(Class cls, Map map, InterfaceC6016 interfaceC6016, InterfaceC6016 interfaceC60162, List list) {
        this.f18133 = cls;
        this.f18131 = map;
        this.f18132 = interfaceC6016;
        this.f18130 = interfaceC60162;
        this.f18129 = list;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) throws IllegalAccessException, InvocationTargetException {
        boolean zM9466;
        String name = method.getName();
        Class cls = this.f18133;
        if (name != null) {
            int iHashCode = name.hashCode();
            if (iHashCode != -1776922004) {
                if (iHashCode != 147696667) {
                    if (iHashCode == 1444986633 && name.equals("annotationType")) {
                        return cls;
                    }
                } else if (name.equals("hashCode")) {
                    return Integer.valueOf(((Number) this.f18130.getValue()).intValue());
                }
            } else if (name.equals("toString")) {
                return (String) this.f18132.getValue();
            }
        }
        boolean zM94662 = AbstractC5227.m9466(name, "equals");
        Map map = this.f18131;
        boolean z = false;
        if (!zM94662 || objArr == null || objArr.length != 1) {
            if (map.containsKey(name)) {
                return map.get(name);
            }
            StringBuilder sb = new StringBuilder("Method is not supported: ");
            sb.append(method);
            sb.append(" (args: ");
            if (objArr == null) {
                objArr = new Object[0];
            }
            sb.append(AbstractC5179.m9405(objArr));
            sb.append(')');
            throw new KotlinReflectionInternalError(sb.toString());
        }
        Object objM9408 = AbstractC5179.m9408(objArr);
        Annotation annotation = objM9408 instanceof Annotation ? (Annotation) objM9408 : null;
        if (AbstractC5227.m9466(annotation != null ? AbstractC3889.m7316(AbstractC3889.m7319(annotation)) : null, cls)) {
            List<Method> list = this.f18129;
            if (list == null || !list.isEmpty()) {
                for (Method method2 : list) {
                    Object obj2 = map.get(method2.getName());
                    Object objInvoke = method2.invoke(objM9408, null);
                    if (obj2 instanceof boolean[]) {
                        objInvoke.getClass();
                        zM9466 = Arrays.equals((boolean[]) obj2, (boolean[]) objInvoke);
                    } else if (obj2 instanceof char[]) {
                        objInvoke.getClass();
                        zM9466 = Arrays.equals((char[]) obj2, (char[]) objInvoke);
                    } else if (obj2 instanceof byte[]) {
                        objInvoke.getClass();
                        zM9466 = Arrays.equals((byte[]) obj2, (byte[]) objInvoke);
                    } else if (obj2 instanceof short[]) {
                        objInvoke.getClass();
                        zM9466 = Arrays.equals((short[]) obj2, (short[]) objInvoke);
                    } else if (obj2 instanceof int[]) {
                        objInvoke.getClass();
                        zM9466 = Arrays.equals((int[]) obj2, (int[]) objInvoke);
                    } else if (obj2 instanceof float[]) {
                        objInvoke.getClass();
                        zM9466 = Arrays.equals((float[]) obj2, (float[]) objInvoke);
                    } else if (obj2 instanceof long[]) {
                        objInvoke.getClass();
                        zM9466 = Arrays.equals((long[]) obj2, (long[]) objInvoke);
                    } else if (obj2 instanceof double[]) {
                        objInvoke.getClass();
                        zM9466 = Arrays.equals((double[]) obj2, (double[]) objInvoke);
                    } else if (obj2 instanceof Object[]) {
                        objInvoke.getClass();
                        zM9466 = Arrays.equals((Object[]) obj2, (Object[]) objInvoke);
                    } else {
                        zM9466 = AbstractC5227.m9466(obj2, objInvoke);
                    }
                    if (!zM9466) {
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
