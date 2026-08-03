package de.robv.android.xposed;

import io.github.libxposed.api.XposedInterface;
import io.github.libxposed.api.XposedModule;
import java.lang.reflect.Executable;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import p001A0.AbstractC0040p;
import p009E0.AbstractC0181l;
import p009E0.AbstractC0183n;
import p031Q0.AbstractC0307g;
import p046a.InterfaceC0470a;
import p089x0.C1121e;

/* JADX INFO: renamed from: de.robv.android.xposed.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0762d {

    /* JADX INFO: renamed from: a */
    public static volatile XposedModule f2675a;

    static {
        ClassLoader.getSystemClassLoader();
    }

    /* JADX INFO: renamed from: a */
    public static final void m1951a(Class cls, String str, AbstractC0761c abstractC0761c) {
        Method[] declaredMethods = cls.getDeclaredMethods();
        AbstractC0307g.m702d(declaredMethods, "getDeclaredMethods(...)");
        ArrayList<Method> arrayList = new ArrayList();
        for (Method method : declaredMethods) {
            if (AbstractC0307g.m699a(method.getName(), str)) {
                arrayList.add(method);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC0183n.m559k0(arrayList, 10));
        for (Method method2 : arrayList) {
            AbstractC0307g.m700b(method2);
            arrayList2.add(m1952b(method2, abstractC0761c));
        }
        AbstractC0181l.m542B0(arrayList2);
    }

    /* JADX INFO: renamed from: b */
    public static final C1121e m1952b(Member member, final AbstractC0761c abstractC0761c) {
        AbstractC0307g.m703e(member, "member");
        final Executable executable = member instanceof Executable ? (Executable) member : null;
        if (executable == null) {
            throw new IllegalArgumentException("Only methods and constructors can be hooked: " + member);
        }
        XposedModule xposedModule = f2675a;
        if (xposedModule == null) {
            throw new IllegalStateException("libxposed module is not initialized".toString());
        }
        AbstractC0307g.m702d(xposedModule.hook(executable).setPriority(abstractC0761c.f2674a).setExceptionMode(XposedInterface.ExceptionMode.PASSTHROUGH).intercept(new XposedInterface.Hooker(executable, abstractC0761c) { // from class: de.robv.android.xposed.XposedBridge$LegacyHooker
            private final AbstractC0761c callback;
            private final Executable executable;

            {
                AbstractC0307g.m703e(executable, "executable");
                AbstractC0307g.m703e(abstractC0761c, "callback");
                this.executable = executable;
                this.callback = abstractC0761c;
            }

            @InterfaceC0470a
            public Object intercept(XposedInterface.Chain chain) throws Throwable {
                AbstractC0307g.m703e(chain, "chain");
                C0760b c0760b = new C0760b();
                c0760b.f2668a = this.executable;
                c0760b.f2669b = chain.getThisObject();
                List args = chain.getArgs();
                AbstractC0307g.m702d(args, "getArgs(...)");
                c0760b.f2670c = args.toArray(new Object[0]);
                try {
                    this.callback.m1950d(c0760b);
                } catch (Throwable th) {
                    AbstractC0762d.m1955e(th);
                }
                if (!c0760b.f2671d) {
                    try {
                        c0760b.m1947d(chain.proceed(c0760b.f2670c));
                    } catch (Throwable th2) {
                        c0760b.m1948e(th2);
                    }
                }
                try {
                    this.callback.m1949c(c0760b);
                } catch (Throwable th3) {
                    AbstractC0762d.m1955e(th3);
                }
                Throwable thM1945b = c0760b.m1945b();
                if (thM1945b == null) {
                    return c0760b.m1944a();
                }
                throw thM1945b;
            }
        }), "intercept(...)");
        return new C1121e(28);
    }

    /* JADX INFO: renamed from: c */
    public static final void m1953c(XposedModule xposedModule) {
        AbstractC0307g.m703e(xposedModule, "module");
        f2675a = xposedModule;
    }

    /* JADX INFO: renamed from: d */
    public static final void m1954d(String str) {
        AbstractC0307g.m703e(str, "text");
        try {
            XposedModule xposedModule = f2675a;
            if (xposedModule != null) {
                xposedModule.log(4, "OKK-Xposed", str, (Throwable) null);
            }
        } catch (Throwable th) {
            AbstractC0040p.m116u(th);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m1955e(Throwable th) {
        th.getMessage();
        try {
            XposedModule xposedModule = f2675a;
            if (xposedModule != null) {
                String message = th.getMessage();
                if (message == null) {
                    message = th.getClass().getName();
                }
                xposedModule.log(6, "OKK-Xposed", message, th);
            }
        } catch (Throwable th2) {
            AbstractC0040p.m116u(th2);
        }
    }
}
