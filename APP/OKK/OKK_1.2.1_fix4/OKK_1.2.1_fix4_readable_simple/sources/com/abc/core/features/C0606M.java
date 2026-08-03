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

    public /* synthetic */ C0606M(int r1, Object r2) {
        this.f1861a = r1;
        this.f1862b = r2;
    }

    @Override // p029P0.InterfaceC0286l
    public final Object invoke(Object r12) {
        boolean r4 = true;
        Object r9 = this.f1862b;
        switch(this.f1861a) {
            case 0: goto L48;
            case 1: goto L24;
            case 2: goto L18;
            case 3: goto L16;
            case 4: goto L6;
            default: goto L4;
        };
    L4:
        Field r122 = (Field) r12;
        AbstractC0307g.m703e(r9, "$value");
        AbstractC0307g.m703e(r122, "nested");
        return AbstractC0637Z0.m1541g(r122, r9);
    L6:
        Field r123 = (Field) r12;
        AbstractC0307g.m703e(r9, "$item");
        AbstractC0307g.m703e(r123, "field");
        Object r124 = AbstractC0637Z0.m1541g(r123, r9);
        if (r124 == null) goto L73;
        C0401d r02 = new C0401d(AbstractC0407j.m995z0(new C0402e(new C0180k(2, AbstractC0637Z0.m1535a(r124.getClass())), false, new C0570A(16)), new C0606M(5, r124)));
    L11:
        if (r02.hasNext() == false) goto L74;
        Object r125 = r02.next();
        if (AbstractC0637Z0.m1539e(r125) == false) goto L11;
        return r125;
    L74:
        return null;
    L73:
        return null;
    L16:
        Field r126 = (Field) r12;
        AbstractC0307g.m703e(r9, "$item");
        AbstractC0307g.m703e(r126, "field");
        return AbstractC0637Z0.m1541g(r126, r9);
    L18:
        Method r127 = (Method) r12;
        AbstractC0307g.m703e(r9, "$message");
        AbstractC0307g.m703e(r127, "method");
        if (r127.getParameterTypes().length != 1) goto L21;
        Object[] r03 = {r9};
    L23:
        return new C0630W(r127, r03);
    L21:
        r03 = new Object[]{r9, null};
        goto L23
    L24:
        Method r128 = (Method) r12;
        AbstractC0307g.m703e(r9, "$message");
        AbstractC0307g.m703e(r128, "method");
        if (AbstractC0307g.m699a(r128.getName(), "isLayoutModeOptical") == true) goto L45;
        Class<?>[] r1 = r128.getParameterTypes();
        AbstractC0307g.m702d(r1, "getParameterTypes(...)");
        if (r1.length != 0) goto L29;
        boolean r13 = true;
    L31:
        if ((!r13) == false) goto L45;
        if (r128.getParameterTypes()[0].isPrimitive() == true) goto L45;
        if (r128.getParameterTypes()[0].isAssignableFrom(r9.getClass()) == false) goto L45;
        if (r128.getParameterTypes().length != 1) goto L39;
    L42:
        String r14 = r128.getName();
        AbstractC0307g.m702d(r14, "getName(...)");
        int r04 = r128.getParameterTypes().length;
        MessageDetailHook r2 = MessageDetailHook.f1967a;
        if (AbstractC0358S.m876a0(r14, r04, MessageDetailHook.m1564U(r128)) <= 0) goto L45;
    L47:
        return Boolean.valueOf(r4);
    L39:
        if (r128.getParameterTypes().length != 2) goto L45;
        if (r128.getParameterTypes()[1].isPrimitive() == true) goto L45;
    L29:
        r13 = false;
    L45:
        r4 = false;
        goto L47
    L48:
        Method r129 = (Method) r12;
        AbstractC0307g.m703e(r9, "$message");
        AbstractC0307g.m703e(r129, "method");
        int r15 = r129.getParameterTypes().length;
        if (1 <= r15) goto L51;
    L67:
        r4 = false;
    L69:
        return Boolean.valueOf(r4);
    L51:
        if (r15 >= 3) goto L67;
        if (r129.getParameterTypes()[0].isPrimitive() == true) goto L67;
        if (r129.getParameterTypes()[0].isAssignableFrom(r9.getClass()) == false) goto L67;
        String r16 = r129.getName();
        AbstractC0307g.m702d(r16, "getName(...)");
        if (AbstractC0425j.m1005J0(r16, "send", true) == true) goto L69;
        String r17 = r129.getName();
        AbstractC0307g.m702d(r17, "getName(...)");
        if (AbstractC0425j.m1005J0(r17, "resend", true) == true) goto L69;
        String r18 = r129.getName();
        AbstractC0307g.m702d(r18, "getName(...)");
        if (AbstractC0425j.m1005J0(r18, "forward", true) == true) goto L69;
        String r19 = r129.getName();
        AbstractC0307g.m702d(r19, "getName(...)");
        if (AbstractC0425j.m1005J0(r19, "repeat", true) == true) goto L69;
        if (r129.getName().length() > 3) goto L67;
        goto L67
    }
}
