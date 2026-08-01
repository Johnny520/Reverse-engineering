package bsh;

import bsh.AbstractC1241q2;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: bsh.w2 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class C1277w2 extends AbstractC1175f2 {

    /* JADX INFO: renamed from: H */
    public static final Pattern f3853H = Pattern.compile("(?:[gs]et|is)\\p{javaUpperCase}.*");

    /* JADX INFO: renamed from: D */
    public final Class f3854D;

    /* JADX INFO: renamed from: E */
    public Method f3855E;

    /* JADX INFO: renamed from: F */
    public boolean f3856F;

    /* JADX INFO: renamed from: G */
    public boolean f3857G;

    public C1277w2(Method method) {
        super(method);
        this.f3856F = false;
        this.f3857G = false;
        this.f3855E = method;
        Class<?> returnType = method.getReturnType();
        this.f3854D = returnType;
        this.f3782y = mo4320l() - (mo4323w() ? 1 : 0);
        if (f3853H.matcher(getName()).matches()) {
            boolean zStartsWith = getName().startsWith("set");
            this.f3857G = zStartsWith;
            Class<?> cls = Void.TYPE;
            this.f3856F = (zStartsWith || mo4320l() != 0 || returnType == cls) ? false : true;
            this.f3857G &= mo4320l() == 1 && returnType == cls;
            if (this.f3856F && getName().startsWith("is")) {
                this.f3856F = returnType == Boolean.class || returnType == Boolean.TYPE;
            }
        }
    }

    /* JADX INFO: renamed from: A */
    public static MethodHandle m5166A(Method method) {
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
        C1271v2.m5124a("MethodHandle lookup failed to find a ", name, " in ", declaringClass.getName());
        return null;
    }

    @Override // bsh.AbstractC1175f2, bsh.AbstractC1241q2
    /* JADX INFO: renamed from: e */
    public AbstractC1241q2.a mo4106e(Object obj, Object[] objArr) throws InvocationTargetException {
        AbstractC1241q2.a aVarMo4106e = super.mo4106e(obj, objArr);
        if (!mo4109v()) {
            this.f3781x.add(0, obj);
        }
        return new AbstractC1241q2.a(this.f3781x, aVarMo4106e.f3784b);
    }

    @Override // bsh.AbstractC1241q2
    /* JADX INFO: renamed from: n */
    public Class mo4107n() {
        return this.f3854D;
    }

    @Override // bsh.AbstractC1241q2
    /* JADX INFO: renamed from: s */
    public boolean mo5061s() {
        return this.f3856F;
    }

    @Override // bsh.AbstractC1241q2
    /* JADX INFO: renamed from: u */
    public boolean mo5062u() {
        return this.f3857G;
    }

    @Override // bsh.AbstractC1175f2, bsh.AbstractC1241q2
    /* JADX INFO: renamed from: x */
    public MethodHandle mo4110x(MethodHandle methodHandle) {
        try {
            try {
                return super.mo4110x(m5166A(this.f3855E));
            } catch (Exception e10) {
                throw new RuntimeException(e10);
            }
        } finally {
            this.f3855E = null;
        }
    }
}
