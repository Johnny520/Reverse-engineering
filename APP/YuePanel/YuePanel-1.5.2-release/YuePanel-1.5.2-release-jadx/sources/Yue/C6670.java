package Yue;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.regex.MatchResult;

/* JADX INFO: renamed from: Yue.ۥۡۤۡۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\nPlatformImplementations.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlatformImplementations.kt\nkotlin/internal/PlatformImplementations\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,79:1\n1#2:80\n*E\n"})
public class C6670 {

    /* JADX INFO: renamed from: Yue.ۥۡۤۡۤ$ۥ */
    @InterfaceC7507({"SMAP\nPlatformImplementations.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlatformImplementations.kt\nkotlin/internal/PlatformImplementations$ReflectThrowable\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,79:1\n1#2:80\n*E\n"})
    public static final class C1055 {

        /* JADX INFO: renamed from: ۥ */
        @InterfaceC6399
        public static final C1055 f2228 = new C1055();

        /* JADX INFO: renamed from: ۥ۟ */
        @InterfaceC5568
        @InterfaceC6489
        public static final Method f2229;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        @InterfaceC5568
        @InterfaceC6489
        public static final Method f17138;

        static {
            Method method;
            Method method2;
            Method[] methods = Throwable.class.getMethods();
            C5499.m17102(methods, "throwableMethods");
            int length = methods.length;
            int i = 0;
            int i2 = 0;
            while (true) {
                method = null;
                if (i2 >= length) {
                    method2 = null;
                    break;
                }
                method2 = methods[i2];
                if (C5499.m17094(method2.getName(), "addSuppressed")) {
                    Class<?>[] parameterTypes = method2.getParameterTypes();
                    C5499.m17102(parameterTypes, "it.parameterTypes");
                    if (C5499.m17094(C3411.m8658(parameterTypes), Throwable.class)) {
                        break;
                    }
                }
                i2++;
            }
            f2229 = method2;
            int length2 = methods.length;
            while (true) {
                if (i >= length2) {
                    break;
                }
                Method method3 = methods[i];
                if (C5499.m17094(method3.getName(), "getSuppressed")) {
                    method = method3;
                    break;
                }
                i++;
            }
            f17138 = method;
        }
    }

    /* JADX INFO: renamed from: ۥ */
    public void mo2264(@InterfaceC6399 Throwable th, @InterfaceC6399 Throwable th2) throws IllegalAccessException, InvocationTargetException {
        C5499.m17103(th, "cause");
        C5499.m17103(th2, "exception");
        Method method = C1055.f2229;
        if (method != null) {
            method.invoke(th, th2);
        }
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ */
    public AbstractC7000 mo2265() {
        return new C4788();
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟ */
    public C5955 mo17151(@InterfaceC6399 MatchResult matchResult, @InterfaceC6399 String str) {
        C5499.m17103(matchResult, "matchResult");
        C5499.m17103(str, "name");
        throw new UnsupportedOperationException("Retrieving groups by name is not supported on this platform.");
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ */
    public List<Throwable> mo17150(@InterfaceC6399 Throwable th) {
        Object objInvoke;
        List<Throwable> listM7069;
        C5499.m17103(th, "exception");
        Method method = C1055.f17138;
        return (method == null || (objInvoke = method.invoke(th, null)) == null || (listM7069 = C3404.m7069((Throwable[]) objInvoke)) == null) ? C3880.m10735() : listM7069;
    }
}
