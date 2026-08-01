package bsh;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.regex.Pattern;
import p009.AbstractC6183;

/* JADX INFO: renamed from: bsh.飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2620 extends AbstractC2636 {

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public static final Pattern f7852 = Pattern.compile("(?:[gs]et|is)\\p{javaUpperCase}.*");

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public Method f7853;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final Class f7854;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final boolean f7855;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final boolean f7856;

    public C2620(Method method) {
        super(method);
        this.f7856 = false;
        this.f7855 = false;
        this.f7853 = method;
        Class<?> returnType = method.getReturnType();
        this.f7854 = returnType;
        this.f7883 = this.f7900 - (this.f7899 ? 1 : 0);
        if (f7852.matcher(this.f7880).matches()) {
            boolean zStartsWith = this.f7880.startsWith("set");
            this.f7855 = zStartsWith;
            Class<?> cls = Void.TYPE;
            boolean z = (zStartsWith || this.f7900 != 0 || returnType == cls) ? false : true;
            this.f7856 = z;
            this.f7855 = zStartsWith & (this.f7900 == 1 && returnType == cls);
            if (z && this.f7880.startsWith("is")) {
                this.f7856 = returnType == Boolean.class || returnType == Boolean.TYPE;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static MethodHandle m5292(Method method) {
        String name = method.getName();
        Class<?>[] parameterTypes = method.getParameterTypes();
        Class<?> declaringClass = method.getDeclaringClass();
        MethodHandles.Lookup lookup = MethodHandles.lookup();
        Class<?> superclass = declaringClass;
        while (superclass != null) {
            if (method != null) {
                try {
                    return lookup.unreflect(method);
                } catch (IllegalAccessException unused) {
                }
            }
            for (Class<?> cls : superclass.getInterfaces()) {
                try {
                    return lookup.unreflect(cls.getDeclaredMethod(name, parameterTypes));
                } catch (IllegalAccessException | NoSuchMethodException | SecurityException unused2) {
                }
            }
            superclass = superclass.getSuperclass();
            if (superclass != null) {
                try {
                    method = superclass.getDeclaredMethod(name, parameterTypes);
                } catch (NoSuchMethodException | SecurityException unused3) {
                    method = null;
                }
            }
        }
        C2633.m5339(AbstractC6183.m11589(declaringClass, AbstractC6183.m11585("MethodHandle lookup failed to find a ", name, " in ")));
        return null;
    }

    @Override // bsh.AbstractC2636, bsh.AbstractC2625
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C2622 mo5293(Object obj, Object[] objArr) throws InvocationTargetException {
        C2622 c2622Mo5293 = super.mo5293(obj, objArr);
        boolean z = this.f7886;
        ArrayList arrayList = this.f7882;
        if (!z) {
            arrayList.add(0, obj);
        }
        return new C2622(arrayList, c2622Mo5293.f7862);
    }

    @Override // bsh.AbstractC2625
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final boolean mo5294() {
        return this.f7855;
    }

    @Override // bsh.AbstractC2625
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final MethodHandle mo5295(MethodHandle methodHandle) {
        try {
            try {
                MethodHandle methodHandleM5292 = m5292(this.f7853);
                if (this.f7899 && methodHandleM5292 != null) {
                    methodHandleM5292 = methodHandleM5292.asVarargsCollector(this.f7902);
                }
                return methodHandleM5292;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        } finally {
            this.f7853 = null;
        }
    }

    @Override // bsh.AbstractC2625
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final Class mo5296() {
        return this.f7854;
    }

    @Override // bsh.AbstractC2625
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final boolean mo5297() {
        return this.f7856;
    }
}
