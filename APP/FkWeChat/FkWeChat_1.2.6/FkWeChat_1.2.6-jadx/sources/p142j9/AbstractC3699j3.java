package p142j9;

import java.lang.reflect.Method;
import okhttp3.internal.url._UrlKt;
import p185m8.AbstractC5106t;
import p313v9.AbstractC8865f;

/* JADX INFO: renamed from: j9.j3 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3699j3 {
    /* JADX INFO: renamed from: a */
    public static final CharSequence m13763a(Class cls) {
        cls.getClass();
        return AbstractC8865f.m34030f(cls);
    }

    /* JADX INFO: renamed from: d */
    public static final String m13766d(Method method) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(method.getName());
        Class<?>[] parameterTypes = method.getParameterTypes();
        parameterTypes.getClass();
        sb2.append(AbstractC5106t.m20754u0(parameterTypes, _UrlKt.FRAGMENT_ENCODE_SET, "(", ")", 0, null, C3694i3.f10218q, 24, null));
        Class<?> returnType = method.getReturnType();
        returnType.getClass();
        sb2.append(AbstractC8865f.m34030f(returnType));
        return sb2.toString();
    }
}
