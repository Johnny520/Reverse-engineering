package com.abc.core.features;

import android.app.Activity;
import de.robv.android.xposed.AbstractC0762d;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import p001A0.AbstractC0040p;
import p007D0.C0137c;
import p007D0.C0140f;
import p007D0.C0146l;
import p029P0.InterfaceC0286l;
import p031Q0.AbstractC0307g;
import p034S.RunnableC0328h;
import p042W0.AbstractC0425j;

/* JADX INFO: renamed from: c0.b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0641b implements InterfaceC0286l {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1996a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f1997b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f1998c;

    public /* synthetic */ C0641b(Serializable serializable, Object obj, int i2) {
        this.f1996a = i2;
        this.f1997b = serializable;
        this.f1998c = obj;
    }

    @Override // p029P0.InterfaceC0286l
    public final Object invoke(Object obj) {
        Object objM116u;
        String str;
        C0146l c0146l = C0146l.f339a;
        Object obj2 = this.f1998c;
        Object obj3 = this.f1997b;
        boolean zBooleanValue = false;
        zBooleanValue = false;
        switch (this.f1996a) {
            case 0:
                Method method = (Method) obj;
                AbstractC0307g.m703e((MomentsCommentProtectHook) obj3, "$this_runCatching");
                ClassLoader classLoader = (ClassLoader) obj2;
                AbstractC0307g.m703e(classLoader, "$classLoader");
                AbstractC0307g.m703e(method, "method");
                if (method.getParameterTypes().length == 1 && AbstractC0307g.m699a(method.getParameterTypes()[0], byte[].class)) {
                    try {
                        method.setAccessible(true);
                        AbstractC0762d.m1952b(method, new C0653f(classLoader, 0));
                        objM116u = Boolean.TRUE;
                    } catch (Throwable th) {
                        objM116u = AbstractC0040p.m116u(th);
                    }
                    Boolean bool = Boolean.FALSE;
                    boolean z2 = objM116u instanceof C0140f;
                    Object obj4 = objM116u;
                    if (z2) {
                        obj4 = bool;
                    }
                    zBooleanValue = ((Boolean) obj4).booleanValue();
                    break;
                }
                return Boolean.valueOf(zBooleanValue);
            case 1:
                String str2 = (String) obj;
                AtomicBoolean atomicBoolean = (AtomicBoolean) obj3;
                AbstractC0307g.m703e(atomicBoolean, "$done");
                Activity activity = (Activity) obj2;
                AbstractC0307g.m703e(activity, "$activity");
                AbstractC0307g.m703e(str2, "name");
                if (atomicBoolean.compareAndSet(false, true)) {
                    RealNameTailHook.f2169g.post(new RunnableC0328h(activity, str2, 2));
                }
                return c0146l;
            default:
                AbstractC0685p1 abstractC0685p1 = (AbstractC0685p1) obj;
                String str3 = (String) obj3;
                AbstractC0307g.m703e(str3, "$sender");
                AbstractC0307g.m703e(abstractC0685p1, "result");
                boolean z3 = abstractC0685p1 instanceof C0679n1;
                RealNameTailHook realNameTailHook = RealNameTailHook.f2163a;
                if (z3) {
                    ConcurrentHashMap concurrentHashMap = RealNameTailHook.f2170h;
                    String str4 = ((C0679n1) abstractC0685p1).f2136a;
                    concurrentHashMap.put(str3, str4);
                    RealNameTailHook.m1780q();
                    String strM1767b = RealNameTailHook.m1767b(str4);
                    if (strM1767b.length() == 0) {
                        str = "";
                    } else {
                        StringBuilder sb = new StringBuilder();
                        int length = strM1767b.length();
                        for (int i2 = 0; i2 < length; i2++) {
                            char cCharAt = strM1767b.charAt(i2);
                            if (cCharAt != '*' && cCharAt != 65290 && cCharAt != 'x' && cCharAt != 'X' && cCharAt != '?') {
                                sb.append(cCharAt);
                            }
                        }
                        String string = sb.toString();
                        AbstractC0307g.m702d(string, "toString(...)");
                        if (string.length() != 0) {
                            if (string.length() == 0) {
                                throw new NoSuchElementException("Char sequence is empty.");
                            }
                            strM1767b = String.valueOf(string.charAt(AbstractC0425j.m1007L0(string)));
                        }
                        str = strM1767b;
                    }
                    RealNameTailHook.m1782s("got " + str3 + " => " + str4 + " tail=" + str);
                    InterfaceC0286l interfaceC0286l = (InterfaceC0286l) obj2;
                    if (interfaceC0286l != null) {
                        interfaceC0286l.invoke(str4);
                    }
                    RealNameTailHook.f2169g.post(new RunnableC0673l1(str3, abstractC0685p1, zBooleanValue ? 1 : 0));
                } else if (abstractC0685p1.equals(C0682o1.f2140a)) {
                    RealNameTailHook.m1782s("no real name ".concat(str3));
                } else {
                    if (!(abstractC0685p1 instanceof C0676m1)) {
                        throw new C0137c();
                    }
                    RealNameTailHook.f2171i.remove(str3);
                    RealNameTailHook.m1782s("fetch fail " + str3 + ": " + ((C0676m1) abstractC0685p1).f2104a);
                }
                return c0146l;
        }
    }

    public /* synthetic */ C0641b(ClassLoader classLoader) {
        this.f1996a = 0;
        this.f1997b = MomentsCommentProtectHook.f2040a;
        this.f1998c = classLoader;
    }
}
