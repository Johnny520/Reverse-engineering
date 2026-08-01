package bsh;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.regex.Pattern;
import p007.AbstractC6136;

/* JADX INFO: renamed from: bsh.飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2619 extends AbstractC2635 {

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public static final Pattern f7850 = Pattern.compile("(?:[gs]et|is)\\p{javaUpperCase}.*");

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public Method f7851;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final Class f7852;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final boolean f7853;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final boolean f7854;

    public C2619(Method method) {
        super(method);
        this.f7854 = false;
        this.f7853 = false;
        this.f7851 = method;
        Class<?> returnType = method.getReturnType();
        this.f7852 = returnType;
        this.f7881 = this.f7898 - (this.f7897 ? 1 : 0);
        if (f7850.matcher(this.f7878).matches()) {
            boolean zStartsWith = this.f7878.startsWith("set");
            this.f7853 = zStartsWith;
            Class<?> cls = Void.TYPE;
            boolean z = (zStartsWith || this.f7898 != 0 || returnType == cls) ? false : true;
            this.f7854 = z;
            this.f7853 = zStartsWith & (this.f7898 == 1 && returnType == cls);
            if (z && this.f7878.startsWith("is")) {
                this.f7854 = returnType == Boolean.class || returnType == Boolean.TYPE;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static MethodHandle m5247(Method method) {
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
        C2632.m5294(AbstractC6136.m11549(declaringClass, AbstractC6136.m11550("MethodHandle lookup failed to find a ", name, " in ")));
        return null;
    }

    @Override // bsh.AbstractC2635, bsh.AbstractC2624
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C2621 mo5248(Object obj, Object[] objArr) throws InvocationTargetException {
        C2621 c2621Mo5248 = super.mo5248(obj, objArr);
        boolean z = this.f7884;
        ArrayList arrayList = this.f7880;
        if (!z) {
            arrayList.add(0, obj);
        }
        return new C2621(arrayList, c2621Mo5248.f7860);
    }

    @Override // bsh.AbstractC2624
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final boolean mo5249() {
        return this.f7853;
    }

    @Override // bsh.AbstractC2624
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final MethodHandle mo5250(MethodHandle methodHandle) {
        try {
            try {
                MethodHandle methodHandleM5247 = m5247(this.f7851);
                if (this.f7897 && methodHandleM5247 != null) {
                    methodHandleM5247 = methodHandleM5247.asVarargsCollector(this.f7900);
                }
                return methodHandleM5247;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        } finally {
            this.f7851 = null;
        }
    }

    @Override // bsh.AbstractC2624
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final Class mo5251() {
        return this.f7852;
    }

    @Override // bsh.AbstractC2624
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final boolean mo5252() {
        return this.f7854;
    }
}
