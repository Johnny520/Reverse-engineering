package top.sacz.xphelper.util;

import androidx.fragment.app.C2308;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;
import net.bytebuddy.description.method.MethodDescription;
import net.bytebuddy.pool.TypePool;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class DexMethodDescriptor implements Serializable {
    public final String declaringClass;
    public final String name;
    public final String signature;

    public DexMethodDescriptor(String str) {
        str.getClass();
        int iIndexOf = str.indexOf("->");
        int iIndexOf2 = str.indexOf(40, iIndexOf);
        if (iIndexOf < 0 || iIndexOf2 < 0) {
            C5925.m11310(str);
            throw null;
        }
        this.declaringClass = str.substring(0, iIndexOf);
        this.name = str.substring(iIndexOf + 2, iIndexOf2);
        this.signature = str.substring(iIndexOf2);
    }

    public static String getConstructorTypeSig(Constructor<?> constructor) {
        StringBuilder sb = new StringBuilder("(");
        for (Class<?> cls : constructor.getParameterTypes()) {
            sb.append(getTypeSig(cls));
        }
        sb.append(")V");
        return sb.toString();
    }

    public static String getMethodTypeSig(Method method) {
        StringBuilder sb = new StringBuilder("(");
        for (Class<?> cls : method.getParameterTypes()) {
            sb.append(getTypeSig(cls));
        }
        sb.append(")");
        sb.append(getTypeSig(method.getReturnType()));
        return sb.toString();
    }

    public static String getTypeSig(Class<?> cls) {
        if (!cls.isPrimitive()) {
            if (cls.isArray()) {
                return "[" + getTypeSig(cls.getComponentType());
            }
            return "L" + cls.getName().replace(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, '/') + ";";
        }
        if (Integer.TYPE.equals(cls)) {
            return "I";
        }
        if (Void.TYPE.equals(cls)) {
            return "V";
        }
        if (Boolean.TYPE.equals(cls)) {
            return "Z";
        }
        if (Character.TYPE.equals(cls)) {
            return "C";
        }
        if (Byte.TYPE.equals(cls)) {
            return "B";
        }
        if (Short.TYPE.equals(cls)) {
            return "S";
        }
        if (Float.TYPE.equals(cls)) {
            return "F";
        }
        if (Long.TYPE.equals(cls)) {
            return "J";
        }
        if (Double.TYPE.equals(cls)) {
            return "D";
        }
        C2308.m4354(cls.getName(), "Type: ", " is not a primitive type");
        return null;
    }

    public static List<String> splitParameterTypes(String str) {
        int iIndexOf;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            if (cCharAt == 'L') {
                iIndexOf = str.indexOf(59, i) + 1;
                arrayList.add(str.substring(i, iIndexOf));
            } else if (cCharAt == '[') {
                int iIndexOf2 = i;
                while (str.charAt(iIndexOf2) == '[') {
                    iIndexOf2++;
                }
                if (str.charAt(iIndexOf2) == 'L') {
                    iIndexOf2 = str.indexOf(59, iIndexOf2);
                }
                iIndexOf = iIndexOf2 + 1;
                arrayList.add(str.substring(i, iIndexOf));
            } else {
                arrayList.add(String.valueOf(cCharAt));
                i++;
            }
            i = iIndexOf;
            i++;
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return toString().equals(obj.toString());
    }

    public Constructor<?> getConstructorInstance(ClassLoader classLoader) throws NoSuchMethodException {
        try {
            String str = this.declaringClass;
            for (Constructor<?> constructor : classLoader.loadClass(str.substring(1, str.length() - 1).replace('/', TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH)).getDeclaredConstructors()) {
                if (getConstructorTypeSig(constructor).equals(this.signature)) {
                    return constructor;
                }
            }
            for (Class<? super Object> superclass = r9.getSuperclass(); superclass != null; superclass = superclass.getSuperclass()) {
                for (Constructor<?> constructor2 : superclass.getDeclaredConstructors()) {
                    int modifiers = constructor2.getModifiers();
                    if (!Modifier.isPrivate(modifiers) && !Modifier.isStatic(modifiers) && getConstructorTypeSig(constructor2).equals(this.signature)) {
                        return constructor2;
                    }
                }
            }
            throw new NoSuchMethodException(this.declaringClass + "->" + this.name + this.signature);
        } catch (ClassNotFoundException e) {
            NoSuchMethodException noSuchMethodException = new NoSuchMethodException(this.declaringClass + "->" + this.name + this.signature);
            noSuchMethodException.initCause(e);
            throw noSuchMethodException;
        }
    }

    public String getDeclaringClassName() {
        String str = this.declaringClass;
        return str.substring(1, str.length() - 1).replace('/', TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
    }

    public String getDescriptor() {
        return this.declaringClass + "->" + this.name + this.signature;
    }

    public Method getMethodInstance(ClassLoader classLoader) {
        try {
            String str = this.declaringClass;
            Class<?> clsLoadClass = classLoader.loadClass(str.substring(1, str.length() - 1).replace('/', TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH));
            for (Method method : clsLoadClass.getDeclaredMethods()) {
                if (method.getName().equals(this.name) && getMethodTypeSig(method).equals(this.signature)) {
                    return method;
                }
            }
            while (true) {
                clsLoadClass = clsLoadClass.getSuperclass();
                if (clsLoadClass == null) {
                    throw new NoSuchMethodException(this.declaringClass + "->" + this.name + this.signature);
                }
                for (Method method2 : clsLoadClass.getDeclaredMethods()) {
                    if (!Modifier.isPrivate(method2.getModifiers()) && !Modifier.isStatic(method2.getModifiers()) && method2.getName().equals(this.name) && getMethodTypeSig(method2).equals(this.signature)) {
                        return method2;
                    }
                }
            }
        } catch (ClassNotFoundException e) {
            throw ((NoSuchMethodException) new NoSuchMethodException(this.declaringClass + "->" + this.name + this.signature).initCause(e));
        }
    }

    public List<String> getParameterTypes() {
        String str = this.signature;
        return splitParameterTypes(str.substring(1, str.indexOf(41)));
    }

    public String getReturnType() {
        return this.signature.substring(this.signature.indexOf(41) + 1);
    }

    public int hashCode() {
        return toString().hashCode();
    }

    public String toString() {
        return this.declaringClass + "->" + this.name + this.signature;
    }

    public DexMethodDescriptor(Constructor<?> constructor) {
        constructor.getClass();
        this.declaringClass = getTypeSig(constructor.getDeclaringClass());
        this.name = MethodDescription.CONSTRUCTOR_INTERNAL_NAME;
        this.signature = getConstructorTypeSig(constructor);
    }

    public DexMethodDescriptor(Method method) {
        method.getClass();
        this.declaringClass = getTypeSig(method.getDeclaringClass());
        this.name = method.getName();
        this.signature = getMethodTypeSig(method);
    }

    public DexMethodDescriptor(String str, String str2, String str3) {
        if (str != null && str2 != null && str3 != null) {
            this.declaringClass = str;
            this.name = str2;
            this.signature = str3;
            return;
        }
        throw null;
    }

    public DexMethodDescriptor(Class<?> cls, String str, String str2) {
        if (cls != null && str != null && str2 != null) {
            this.declaringClass = getTypeSig(cls);
            this.name = str;
            this.signature = str2;
            return;
        }
        throw null;
    }
}
