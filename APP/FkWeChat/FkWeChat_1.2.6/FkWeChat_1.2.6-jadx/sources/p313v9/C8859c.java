package p313v9;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: v9.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8859c {

    /* JADX INFO: renamed from: a */
    public static final C8859c f29420a = new C8859c();

    /* JADX INFO: renamed from: b */
    public static a f29421b;

    /* JADX INFO: renamed from: v9.c$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final Method f29422a;

        /* JADX INFO: renamed from: b */
        public final Method f29423b;

        public a(Method method, Method method2) {
            this.f29422a = method;
            this.f29423b = method2;
        }

        /* JADX INFO: renamed from: a */
        public final Method m34019a() {
            return this.f29423b;
        }

        /* JADX INFO: renamed from: b */
        public final Method m34020b() {
            return this.f29422a;
        }
    }

    /* JADX INFO: renamed from: a */
    public final a m34017a(Member member) {
        member.getClass();
        Class<?> cls = member.getClass();
        try {
            return new a(cls.getMethod("getParameters", null), AbstractC8865f.m34034j(cls).loadClass("java.lang.reflect.Parameter").getMethod("getName", null));
        } catch (NoSuchMethodException unused) {
            return new a(null, null);
        }
    }

    /* JADX INFO: renamed from: b */
    public final List m34018b(Member member) throws IllegalAccessException, InvocationTargetException {
        Method methodM34019a;
        member.getClass();
        a aVarM34017a = f29421b;
        if (aVarM34017a == null) {
            synchronized (this) {
                aVarM34017a = f29421b;
                if (aVarM34017a == null) {
                    aVarM34017a = f29420a.m34017a(member);
                    f29421b = aVarM34017a;
                }
            }
        }
        Method methodM34020b = aVarM34017a.m34020b();
        if (methodM34020b == null || (methodM34019a = aVarM34017a.m34019a()) == null) {
            return null;
        }
        Object objInvoke = methodM34020b.invoke(member, null);
        objInvoke.getClass();
        Object[] objArr = (Object[]) objInvoke;
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            Object objInvoke2 = methodM34019a.invoke(obj, null);
            objInvoke2.getClass();
            arrayList.add((String) objInvoke2);
        }
        return arrayList;
    }
}
