package p018J0;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import p001A0.AbstractC0040p;
import p014H0.InterfaceC0202a;
import p016I0.EnumC0209a;
import p031Q0.AbstractC0307g;

/* JADX INFO: renamed from: J0.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0231a implements InterfaceC0202a, Serializable {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0202a f471a;

    public AbstractC0231a(InterfaceC0202a interfaceC0202a) {
        this.f471a = interfaceC0202a;
    }

    @Override // p014H0.InterfaceC0202a
    /* JADX INFO: renamed from: a */
    public final void mo587a(Object obj) {
        InterfaceC0202a interfaceC0202a = this;
        while (true) {
            AbstractC0231a abstractC0231a = (AbstractC0231a) interfaceC0202a;
            InterfaceC0202a interfaceC0202a2 = abstractC0231a.f471a;
            AbstractC0307g.m700b(interfaceC0202a2);
            try {
                obj = abstractC0231a.mo520f(obj);
                if (obj == EnumC0209a.f425a) {
                    return;
                }
            } catch (Throwable th) {
                obj = AbstractC0040p.m116u(th);
            }
            abstractC0231a.mo591g();
            if (!(interfaceC0202a2 instanceof AbstractC0231a)) {
                interfaceC0202a2.mo587a(obj);
                return;
            }
            interfaceC0202a = interfaceC0202a2;
        }
    }

    /* JADX INFO: renamed from: d */
    public InterfaceC0202a mo519d(Object obj, InterfaceC0202a interfaceC0202a) {
        AbstractC0307g.m703e(interfaceC0202a, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    /* JADX INFO: renamed from: e */
    public final StackTraceElement m631e() {
        int iIntValue;
        String strM632c;
        InterfaceC0233c interfaceC0233c = (InterfaceC0233c) getClass().getAnnotation(InterfaceC0233c.class);
        String str = null;
        if (interfaceC0233c == null) {
            return null;
        }
        int iM636v = interfaceC0233c.m636v();
        if (iM636v > 1) {
            throw new IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + iM636v + ". Please update the Kotlin standard library.").toString());
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
        int i2 = iIntValue >= 0 ? interfaceC0233c.m634l()[iIntValue] : -1;
        C0234d c0234d = AbstractC0235e.f478b;
        C0234d c0234d2 = AbstractC0235e.f477a;
        if (c0234d == null) {
            try {
                C0234d c0234d3 = new C0234d(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
                AbstractC0235e.f478b = c0234d3;
                c0234d = c0234d3;
            } catch (Exception unused2) {
                AbstractC0235e.f478b = c0234d2;
                c0234d = c0234d2;
            }
        }
        if (c0234d != c0234d2) {
            Method method = (Method) c0234d.f474b;
            Object objInvoke = method != null ? method.invoke(getClass(), null) : null;
            if (objInvoke != null) {
                Method method2 = (Method) c0234d.f475c;
                Object objInvoke2 = method2 != null ? method2.invoke(objInvoke, null) : null;
                if (objInvoke2 != null) {
                    Method method3 = (Method) c0234d.f476d;
                    Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, null) : null;
                    if (objInvoke3 instanceof String) {
                        str = (String) objInvoke3;
                    }
                }
            }
        }
        if (str == null) {
            strM632c = interfaceC0233c.m632c();
        } else {
            strM632c = str + '/' + interfaceC0233c.m632c();
        }
        return new StackTraceElement(strM632c, interfaceC0233c.m635m(), interfaceC0233c.m633f(), i2);
    }

    /* JADX INFO: renamed from: f */
    public abstract Object mo520f(Object obj);

    /* JADX INFO: renamed from: g */
    public void mo591g() {
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Object objM631e = m631e();
        if (objM631e == null) {
            objM631e = getClass().getName();
        }
        sb.append(objM631e);
        return sb.toString();
    }
}
