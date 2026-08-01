package bsh;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.regex.Pattern;
import p025.AbstractC7012;

/* JADX INFO: renamed from: bsh.飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3453 extends AbstractC3469 {

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public static final Pattern f8197 = Pattern.compile("(?:[gs]et|is)\\p{javaUpperCase}.*");

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public Method f8198;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final Class f8199;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final boolean f8200;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final boolean f8201;

    public C3453(Method method) {
        super(method);
        this.f8201 = false;
        this.f8200 = false;
        this.f8198 = method;
        Class<?> returnType = method.getReturnType();
        this.f8199 = returnType;
        this.f8228 = this.f8245 - (this.f8244 ? 1 : 0);
        if (f8197.matcher(this.f8225).matches()) {
            boolean zStartsWith = this.f8225.startsWith("set");
            this.f8200 = zStartsWith;
            Class<?> cls = Void.TYPE;
            boolean z = (zStartsWith || this.f8245 != 0 || returnType == cls) ? false : true;
            this.f8201 = z;
            this.f8200 = zStartsWith & (this.f8245 == 1 && returnType == cls);
            if (z && this.f8225.startsWith("is")) {
                this.f8201 = returnType == Boolean.class || returnType == Boolean.TYPE;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static MethodHandle m5852(Method method) {
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
        C3466.m5899(AbstractC7012.m12148(declaringClass, AbstractC7012.m12144("MethodHandle lookup failed to find a ", name, " in ")));
        return null;
    }

    @Override // bsh.AbstractC3469, bsh.AbstractC3458
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C3455 mo5853(Object obj, Object[] objArr) throws InvocationTargetException {
        C3455 c3455Mo5853 = super.mo5853(obj, objArr);
        boolean z = this.f8231;
        ArrayList arrayList = this.f8227;
        if (!z) {
            arrayList.add(0, obj);
        }
        return new C3455(arrayList, c3455Mo5853.f8207);
    }

    @Override // bsh.AbstractC3458
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final boolean mo5854() {
        return this.f8200;
    }

    @Override // bsh.AbstractC3458
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final MethodHandle mo5855(MethodHandle methodHandle) {
        try {
            try {
                MethodHandle methodHandleM5852 = m5852(this.f8198);
                if (this.f8244 && methodHandleM5852 != null) {
                    methodHandleM5852 = methodHandleM5852.asVarargsCollector(this.f8247);
                }
                return methodHandleM5852;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        } finally {
            this.f8198 = null;
        }
    }

    @Override // bsh.AbstractC3458
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final Class mo5856() {
        return this.f8199;
    }

    @Override // bsh.AbstractC3458
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final boolean mo5857() {
        return this.f8201;
    }
}
