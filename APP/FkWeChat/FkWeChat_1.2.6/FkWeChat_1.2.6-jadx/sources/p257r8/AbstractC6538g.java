package p257r8;

import java.lang.reflect.Field;

/* JADX INFO: renamed from: r8.g */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6538g {
    /* JADX INFO: renamed from: a */
    public static final InterfaceC6537f m25855a(AbstractC6532a abstractC6532a) {
        return (InterfaceC6537f) abstractC6532a.getClass().getAnnotation(InterfaceC6537f.class);
    }

    /* JADX INFO: renamed from: b */
    public static final int m25856b(AbstractC6532a abstractC6532a) {
        try {
            Field declaredField = abstractC6532a.getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(abstractC6532a);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            return (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            return -1;
        }
    }

    /* JADX INFO: renamed from: c */
    public static final StackTraceElement m25857c(AbstractC6532a abstractC6532a) {
        String strM25850c;
        abstractC6532a.getClass();
        InterfaceC6537f interfaceC6537fM25855a = m25855a(abstractC6532a);
        if (interfaceC6537fM25855a == null || interfaceC6537fM25855a.m25854v() < 1) {
            return null;
        }
        int iM25856b = m25856b(abstractC6532a);
        int i10 = iM25856b < 0 ? -1 : interfaceC6537fM25855a.m25852l()[iM25856b];
        String strM25862b = C6540i.f20491a.m25862b(abstractC6532a);
        if (strM25862b == null) {
            strM25850c = interfaceC6537fM25855a.m25850c();
        } else {
            strM25850c = strM25862b + '/' + interfaceC6537fM25855a.m25850c();
        }
        return new StackTraceElement(strM25850c, interfaceC6537fM25855a.m25853m(), interfaceC6537fM25855a.m25851f(), i10);
    }
}
