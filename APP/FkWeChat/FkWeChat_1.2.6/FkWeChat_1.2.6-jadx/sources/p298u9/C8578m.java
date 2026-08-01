package p298u9;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Iterator;
import p024b9.AbstractC1027c;
import p313v9.AbstractC8865f;

/* JADX INFO: renamed from: u9.m */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8578m {

    /* JADX INFO: renamed from: a */
    public static final C8578m f28622a = new C8578m();

    /* JADX INFO: renamed from: a */
    public final String m32996a(Constructor constructor) {
        constructor.getClass();
        StringBuilder sb2 = new StringBuilder("(");
        Iterator itM3774a = AbstractC1027c.m3774a(constructor.getParameterTypes());
        while (itM3774a.hasNext()) {
            Class cls = (Class) itM3774a.next();
            cls.getClass();
            sb2.append(AbstractC8865f.m34030f(cls));
        }
        sb2.append(")V");
        return sb2.toString();
    }

    /* JADX INFO: renamed from: b */
    public final String m32997b(Field field) {
        field.getClass();
        Class<?> type = field.getType();
        type.getClass();
        return AbstractC8865f.m34030f(type);
    }

    /* JADX INFO: renamed from: c */
    public final String m32998c(Method method) {
        method.getClass();
        StringBuilder sb2 = new StringBuilder("(");
        Iterator itM3774a = AbstractC1027c.m3774a(method.getParameterTypes());
        while (itM3774a.hasNext()) {
            Class cls = (Class) itM3774a.next();
            cls.getClass();
            sb2.append(AbstractC8865f.m34030f(cls));
        }
        sb2.append(")");
        Class<?> returnType = method.getReturnType();
        returnType.getClass();
        sb2.append(AbstractC8865f.m34030f(returnType));
        return sb2.toString();
    }
}
