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

    public /* synthetic */ C0641b(Serializable r1, Object r2, int r3) {
        this.f1996a = r3;
        this.f1997b = r1;
        this.f1998c = r2;
    }

    @Override // p029P0.InterfaceC0286l
    public final Object invoke(Object r13) {
        C0146l r02 = C0146l.f339a;
        Object r1 = this.f1998c;
        Object r3 = this.f1997b;
        boolean r4 = false;
        r4 = false;
        switch(this.f1996a) {
            case 0: goto L50;
            case 1: goto L45;
            default: goto L4;
        };
    L4:
        AbstractC0685p1 r132 = (AbstractC0685p1) r13;
        String r32 = (String) r3;
        AbstractC0307g.m703e(r32, "$sender");
        AbstractC0307g.m703e(r132, "result");
        boolean r5 = r132 instanceof C0679n1;
        RealNameTailHook r6 = RealNameTailHook.f2163a;
        if (r5 == false) goto L37;
        ConcurrentHashMap r52 = RealNameTailHook.f2170h;
        String r62 = ((C0679n1) r132).f2136a;
        r52.put(r32, r62);
        RealNameTailHook.m1780q();
        String r53 = RealNameTailHook.m1767b(r62);
        if (r53.length() != 0) goto L9;
        String r2 = "";
    L30:
        RealNameTailHook.m1782s("got " + r32 + " => " + r62 + " tail=" + r2);
        InterfaceC0286l r12 = (InterfaceC0286l) r1;
        if (r12 == null) goto L33;
        r12.invoke(r62);
    L33:
        RealNameTailHook.f2169g.post(new RunnableC0673l1(r32, r132, r4 ? 1 : 0));
    L42:
        return r02;
    L9:
        StringBuilder r7 = new StringBuilder();
        int r8 = r53.length();
        int r9 = 0;
    L10:
        if (r9 >= r8) goto L23;
        char r10 = r53.charAt(r9);
        if (r10 == '*') goto L22;
        if (r10 == 65290) goto L22;
        if (r10 == 'x') goto L22;
        if (r10 == 'X') goto L22;
        if (r10 == '?') goto L22;
        r7.append(r10);
    L22:
        r9 = r9 + 1;
        goto L10
    L23:
        String r22 = r7.toString();
        AbstractC0307g.m702d(r22, "toString(...)");
        if (r22.length() != 0) goto L27;
    L29:
        r2 = r53;
        goto L30
    L27:
        if (r22.length() == 0) goto L35;
        r53 = String.valueOf(r22.charAt(AbstractC0425j.m1007L0(r22)));
        goto L29
    L35:
        throw new NoSuchElementException("Char sequence is empty.");
    L37:
        if (r132.equals(C0682o1.f2140a) == false) goto L40;
        RealNameTailHook.m1782s("no real name ".concat(r32));
        goto L42
    L40:
        if ((r132 instanceof C0676m1) == false) goto L44;
        RealNameTailHook.f2171i.remove(r32);
        RealNameTailHook.m1782s("fetch fail " + r32 + ": " + ((C0676m1) r132).f2104a);
        goto L42
    L44:
        throw new C0137c();
    L45:
        String r133 = (String) r13;
        AtomicBoolean r33 = (AtomicBoolean) r3;
        AbstractC0307g.m703e(r33, "$done");
        Activity r14 = (Activity) r1;
        AbstractC0307g.m703e(r14, "$activity");
        AbstractC0307g.m703e(r133, "name");
        if (r33.compareAndSet(false, true) == false) goto L49;
        RealNameTailHook.f2169g.post(new RunnableC0328h(r14, r133, 2));
    L49:
        return r02;
    L50:
        Method r134 = (Method) r13;
        AbstractC0307g.m703e((MomentsCommentProtectHook) r3, "$this_runCatching");
        ClassLoader r15 = (ClassLoader) r1;
        AbstractC0307g.m703e(r15, "$classLoader");
        AbstractC0307g.m703e(r134, "method");
        if (r134.getParameterTypes().length != 1) goto L65;
        if (AbstractC0307g.m699a(r134.getParameterTypes()[0], byte[].class) == false) goto L65;
        r134.setAccessible(true);     // Catch: Throwable -> L58
        AbstractC0762d.m1952b(r134, new C0653f(r15, 0));     // Catch: Throwable -> L58
        Object r135 = Boolean.TRUE;     // Catch: Throwable -> L58
    L60:
        Boolean r03 = Boolean.FALSE;
        boolean r16 = r135 instanceof C0140f;
        Object r136 = r135;
        if (r16 == false) goto L63;
        r136 = r03;
    L63:
        r4 = ((Boolean) r136).booleanValue();
    L58:
        th = move-exception;
        r135 = AbstractC0040p.m116u(th);
    L65:
        return Boolean.valueOf(r4);
    }

    public /* synthetic */ C0641b(ClassLoader r2) {
        this.f1996a = 0;
        this.f1997b = MomentsCommentProtectHook.f2040a;
        this.f1998c = r2;
    }
}
