package com.abc.core.features;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import p009E0.C0180k;
import p029P0.InterfaceC0286l;
import p031Q0.AbstractC0307g;
import p037U.AbstractC0358S;
import p040V0.AbstractC0407j;
import p040V0.C0401d;
import p040V0.C0402e;
import p042W0.AbstractC0425j;

/* JADX INFO: renamed from: c0.M */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0606M implements InterfaceC0286l {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1861a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f1862b;

    public /* synthetic */ C0606M(int i2, Object obj) {
        this.f1861a = i2;
        this.f1862b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x018c  */
    @Override // p029P0.InterfaceC0286l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        boolean z2 = true;
        Object obj2 = this.f1862b;
        switch (this.f1861a) {
            case 0:
                Method method = (Method) obj;
                AbstractC0307g.m703e(obj2, "$message");
                AbstractC0307g.m703e(method, "method");
                int length = method.getParameterTypes().length;
                if (1 > length || length >= 3 || method.getParameterTypes()[0].isPrimitive() || !method.getParameterTypes()[0].isAssignableFrom(obj2.getClass())) {
                    z2 = false;
                } else {
                    String name = method.getName();
                    AbstractC0307g.m702d(name, "getName(...)");
                    if (!AbstractC0425j.m1005J0(name, "send", true)) {
                        String name2 = method.getName();
                        AbstractC0307g.m702d(name2, "getName(...)");
                        if (!AbstractC0425j.m1005J0(name2, "resend", true)) {
                            String name3 = method.getName();
                            AbstractC0307g.m702d(name3, "getName(...)");
                            if (!AbstractC0425j.m1005J0(name3, "forward", true)) {
                                String name4 = method.getName();
                                AbstractC0307g.m702d(name4, "getName(...)");
                                if (!AbstractC0425j.m1005J0(name4, "repeat", true) && method.getName().length() > 3) {
                                }
                            }
                        }
                    }
                }
                return Boolean.valueOf(z2);
            case 1:
                Method method2 = (Method) obj;
                AbstractC0307g.m703e(obj2, "$message");
                AbstractC0307g.m703e(method2, "method");
                if (!AbstractC0307g.m699a(method2.getName(), "isLayoutModeOptical")) {
                    Class<?>[] parameterTypes = method2.getParameterTypes();
                    AbstractC0307g.m702d(parameterTypes, "getParameterTypes(...)");
                    if (!(!(parameterTypes.length == 0)) || method2.getParameterTypes()[0].isPrimitive() || !method2.getParameterTypes()[0].isAssignableFrom(obj2.getClass()) || (method2.getParameterTypes().length != 1 && (method2.getParameterTypes().length != 2 || method2.getParameterTypes()[1].isPrimitive()))) {
                        z2 = false;
                    } else {
                        String name5 = method2.getName();
                        AbstractC0307g.m702d(name5, "getName(...)");
                        int length2 = method2.getParameterTypes().length;
                        MessageDetailHook messageDetailHook = MessageDetailHook.f1967a;
                        if (AbstractC0358S.m876a0(name5, length2, MessageDetailHook.m1564U(method2)) <= 0) {
                        }
                    }
                }
                return Boolean.valueOf(z2);
            case 2:
                Method method3 = (Method) obj;
                AbstractC0307g.m703e(obj2, "$message");
                AbstractC0307g.m703e(method3, "method");
                return new C0630W(method3, method3.getParameterTypes().length == 1 ? new Object[]{obj2} : new Object[]{obj2, null});
            case 3:
                Field field = (Field) obj;
                AbstractC0307g.m703e(obj2, "$item");
                AbstractC0307g.m703e(field, "field");
                return AbstractC0637Z0.m1541g(field, obj2);
            case 4:
                Field field2 = (Field) obj;
                AbstractC0307g.m703e(obj2, "$item");
                AbstractC0307g.m703e(field2, "field");
                Object objM1541g = AbstractC0637Z0.m1541g(field2, obj2);
                if (objM1541g == null) {
                    return null;
                }
                C0401d c0401d = new C0401d(AbstractC0407j.m995z0(new C0402e(new C0180k(2, AbstractC0637Z0.m1535a(objM1541g.getClass())), false, new C0570A(16)), new C0606M(5, objM1541g)));
                while (c0401d.hasNext()) {
                    Object next = c0401d.next();
                    if (AbstractC0637Z0.m1539e(next)) {
                        return next;
                    }
                }
                return null;
            default:
                Field field3 = (Field) obj;
                AbstractC0307g.m703e(obj2, "$value");
                AbstractC0307g.m703e(field3, "nested");
                return AbstractC0637Z0.m1541g(field3, obj2);
        }
    }
}
