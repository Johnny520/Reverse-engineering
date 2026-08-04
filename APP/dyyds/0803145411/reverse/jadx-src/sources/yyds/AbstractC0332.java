package yyds;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: yyds.ᛲᛴᛷᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0332 implements InterfaceC0274, InterfaceC1431, Serializable {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final InterfaceC0274 f1754;

    public AbstractC0332(InterfaceC0274 interfaceC0274) {
        this.f1754 = interfaceC0274;
    }

    public String toString() {
        int iIntValue;
        String strM9c;
        Method method;
        Object objInvoke;
        Method method2;
        Object objInvoke2;
        StringBuilder sb = new StringBuilder("Continuation at ");
        InterfaceC2023 interfaceC2023 = (InterfaceC2023) getClass().getAnnotation(InterfaceC2023.class);
        Object name = null;
        str = null;
        str = null;
        str = null;
        str = null;
        str = null;
        String str = null;
        name = null;
        if (interfaceC2023 != null && interfaceC2023.m13v() >= 1) {
            try {
                Field declaredField = getClass().getDeclaredField("label");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(this);
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                iIntValue = (num != null ? num.intValue() : 0) - 1;
            } catch (Exception unused) {
                iIntValue = -1;
            }
            int i = iIntValue >= 0 ? interfaceC2023.m11l()[iIntValue] : -1;
            C0644 c0644 = AbstractC0181.f1022;
            C0644 c06442 = AbstractC0181.f1026;
            if (c06442 == null) {
                try {
                    C0644 c06443 = new C0644(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null), 25);
                    AbstractC0181.f1026 = c06443;
                    c06442 = c06443;
                } catch (Exception unused2) {
                    AbstractC0181.f1026 = c0644;
                    c06442 = c0644;
                }
            }
            if (c06442 != c0644 && (method = (Method) c06442.f3099) != null && (objInvoke = method.invoke(getClass(), null)) != null && (method2 = (Method) c06442.f3102) != null && (objInvoke2 = method2.invoke(objInvoke, null)) != null) {
                Method method3 = (Method) c06442.f3101;
                Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, null) : null;
                if (objInvoke3 instanceof String) {
                    str = (String) objInvoke3;
                }
            }
            if (str == null) {
                strM9c = interfaceC2023.m9c();
            } else {
                strM9c = str + '/' + interfaceC2023.m9c();
            }
            name = new StackTraceElement(strM9c, interfaceC2023.m12m(), interfaceC2023.m10f(), i);
        }
        if (name == null) {
            name = getClass().getName();
        }
        sb.append(name);
        return sb.toString();
    }

    /* JADX INFO: renamed from: ᛱᛳᲇ */
    public abstract Object mo474(Object obj);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    @Override // yyds.InterfaceC0274
    /* JADX INFO: renamed from: ᛱᲈᲁ */
    public final void mo812(Object obj) {
        ?? r2 = this;
        while (true) {
            AbstractC0332 abstractC0332 = (AbstractC0332) r2;
            InterfaceC0274 interfaceC0274 = abstractC0332.f1754;
            try {
                obj = abstractC0332.mo474(obj);
                if (obj == EnumC1765.f8858) {
                    return;
                }
            } catch (Throwable th) {
                obj = new C2658(th);
            }
            abstractC0332.mo1007();
            if (!(interfaceC0274 instanceof AbstractC0332)) {
                interfaceC0274.mo812(obj);
                return;
            }
            r2 = interfaceC0274;
        }
    }

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ */
    public InterfaceC0274 mo630(Object obj, InterfaceC0274 interfaceC0274) {
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    /* JADX INFO: renamed from: ᛳᲁᲁᲇ, reason: contains not printable characters */
    public void mo1007() {
    }

    @Override // yyds.InterfaceC1431
    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final InterfaceC1431 mo1008() {
        InterfaceC0274 interfaceC0274 = this.f1754;
        if (interfaceC0274 instanceof InterfaceC1431) {
            return (InterfaceC1431) interfaceC0274;
        }
        return null;
    }
}
