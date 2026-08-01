package p000;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: y9 */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0955y9 implements InterfaceC0322ik, InterfaceC0022al, Serializable {

    /* JADX INFO: renamed from: d */
    private final InterfaceC0322ik f7582d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC0955y9(InterfaceC0322ik interfaceC0322ik) {
        this.f7582d = interfaceC0322ik;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public InterfaceC0322ik mo25c(InterfaceC0322ik interfaceC0322ik) {
        interfaceC0322ik.getClass();
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public InterfaceC0022al mo180d() {
        InterfaceC0322ik interfaceC0322ik = this.f7582d;
        if (interfaceC0322ik instanceof InterfaceC0022al) {
            return (InterfaceC0022al) interfaceC0322ik;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public InterfaceC0322ik mo15g(Object obj, InterfaceC0322ik interfaceC0322ik) {
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final InterfaceC0322ik m5222h() {
        return this.f7582d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    @Override // p000.InterfaceC0322ik
    /* JADX INFO: renamed from: i */
    public final void mo541i(Object obj) {
        ?? r2 = this;
        while (true) {
            AbstractC0955y9 abstractC0955y9 = (AbstractC0955y9) r2;
            InterfaceC0322ik interfaceC0322ik = abstractC0955y9.f7582d;
            interfaceC0322ik.getClass();
            try {
                obj = abstractC0955y9.mo16m(obj);
                if (obj == EnumC1007zk.f7916d) {
                    return;
                }
            } catch (Throwable th) {
                obj = new bv0(th);
            }
            abstractC0955y9.mo1718n();
            if (!(interfaceC0322ik instanceof AbstractC0955y9)) {
                interfaceC0322ik.mo541i(obj);
                return;
            }
            r2 = interfaceC0322ik;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public StackTraceElement mo2604l() {
        int iIntValue;
        String strM1721c;
        Method method;
        Object objInvoke;
        Method method2;
        Object objInvoke2;
        InterfaceC0359jl interfaceC0359jl = (InterfaceC0359jl) getClass().getAnnotation(InterfaceC0359jl.class);
        String str = null;
        if (interfaceC0359jl == null || interfaceC0359jl.m1725v() < 1) {
            return null;
        }
        try {
            Field declaredField = getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            iIntValue = (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            iIntValue = -1;
        }
        int i = iIntValue >= 0 ? interfaceC0359jl.m1723l()[iIntValue] : -1;
        C0541o8 c0541o8 = s91.f5717s;
        C0541o8 c0541o82 = s91.f5718t;
        if (c0541o82 == null) {
            try {
                C0541o8 c0541o83 = new C0541o8(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
                s91.f5718t = c0541o83;
                c0541o82 = c0541o83;
            } catch (Exception unused2) {
                s91.f5718t = c0541o8;
                c0541o82 = c0541o8;
            }
        }
        if (c0541o82 != c0541o8 && (method = (Method) c0541o82.f4480a) != null && (objInvoke = method.invoke(getClass(), null)) != null && (method2 = (Method) c0541o82.f4481b) != null && (objInvoke2 = method2.invoke(objInvoke, null)) != null) {
            Method method3 = (Method) c0541o82.f4482c;
            Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, null) : null;
            if (objInvoke3 instanceof String) {
                str = (String) objInvoke3;
            }
        }
        if (str == null) {
            strM1721c = interfaceC0359jl.m1721c();
        } else {
            strM1721c = str + '/' + interfaceC0359jl.m1721c();
        }
        return new StackTraceElement(strM1721c, interfaceC0359jl.m1724m(), interfaceC0359jl.m1722f(), i);
    }

    /* JADX INFO: renamed from: m */
    public abstract Object mo16m(Object obj);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Object objMo2604l = mo2604l();
        if (objMo2604l == null) {
            objMo2604l = getClass().getName();
        }
        sb.append(objMo2604l);
        return sb.toString();
    }

    /* JADX INFO: renamed from: n */
    public void mo1718n() {
    }
}
