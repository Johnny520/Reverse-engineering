package p001;

import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XC_MethodReplacement;
import de.robv.android.xposed.XposedHelpers;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Locale;
import p001.AbstractC0149b0;

/* JADX INFO: renamed from: ۟.s3 */
/* JADX INFO: loaded from: classes.dex */
public final class C0386s3 {

    /* JADX INFO: renamed from: ۟.s3$a */
    public static final class a extends XC_MethodReplacement {
        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        public final Object replaceHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
            Member member = methodHookParam != null ? methodHookParam.method : null;
            C0237h4.m1088("null cannot be cast to non-null type java.lang.reflect.Method", member);
            String simpleName = ((Method) member).getReturnType().getSimpleName();
            switch (simpleName.hashCode()) {
                case -1325958191:
                    if (simpleName.equals("double")) {
                        C0155b6.m1017();
                        return 0;
                    }
                    return null;
                case 104431:
                    if (simpleName.equals("int")) {
                        C0155b6.m1017();
                        return 0;
                    }
                    return null;
                case 3327612:
                    if (simpleName.equals("long")) {
                        C0155b6.m1017();
                        return 0L;
                    }
                    return null;
                case 64711720:
                    if (simpleName.equals("boolean")) {
                        C0155b6.m1017();
                        return Boolean.FALSE;
                    }
                    return null;
                case 97526364:
                    if (simpleName.equals("float")) {
                        C0155b6.m1017();
                        return Float.valueOf(0.0f);
                    }
                    return null;
                default:
                    return null;
            }
        }
    }

    static {
        new a();
    }

    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: ۥ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m935(InterfaceC0222g3<? super XC_MethodHook.MethodHookParam, ? extends Object> interfaceC0222g3, XC_MethodHook.MethodHookParam methodHookParam) {
        String strM915;
        C0237h4.m1090("hooker", interfaceC0222g3);
        C0237h4.m1090("param", methodHookParam);
        Object objMo984 = interfaceC0222g3.mo984(methodHookParam);
        if (objMo984 != null) {
            strM915 = objMo984.getClass().getSimpleName().toLowerCase(Locale.ROOT);
            C0237h4.m1089("toLowerCase(...)", strM915);
        } else {
            strM915 = "null";
        }
        Member member = methodHookParam.method;
        C0237h4.m1088("null cannot be cast to non-null type java.lang.reflect.Method", member);
        String simpleName = ((Method) member).getReturnType().getSimpleName();
        "getSimpleName(...)";
        String lowerCase = simpleName.toLowerCase(Locale.ROOT);
        C0237h4.m1089("toLowerCase(...)", lowerCase);
        switch (lowerCase.hashCode()) {
            case -1325958191:
                if (!lowerCase.equals("double")) {
                    return objMo984;
                }
                if (C0237h4.m864(strM915, lowerCase)) {
                    return objMo984;
                }
                C0155b6.m1017();
                return C0373r3.m1213(methodHookParam);
            case 104431:
                if (!lowerCase.equals("int") || C0237h4.m864(strM915, "int") || C0237h4.m864(strM915, "integer")) {
                    return objMo984;
                }
                C0155b6.m1017();
                return C0373r3.m1213(methodHookParam);
            case 3327612:
                if (!lowerCase.equals("long")) {
                    return objMo984;
                }
                if (C0237h4.m864(strM915, lowerCase)) {
                }
                C0155b6.m1017();
                return C0373r3.m1213(methodHookParam);
            case 64711720:
                if (!lowerCase.equals("boolean") || C0237h4.m864(strM915, lowerCase)) {
                    return objMo984;
                }
                C0155b6.m1017();
                return C0373r3.m1213(methodHookParam);
            case 97526364:
                if (!lowerCase.equals("float")) {
                    return objMo984;
                }
                if (C0237h4.m864(strM915, lowerCase)) {
                }
                C0155b6.m1017();
                return C0373r3.m1213(methodHookParam);
            default:
                return objMo984;
        }
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static final XC_MethodHook.Unhook m936(Method method, InterfaceC0222g3 interfaceC0222g3) {
        "<this>";
        "hooker";
        return C0373r3.m1212(method, new C0399t3(interfaceC0222g3));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static void m1225(String str, String str2, Object[] objArr, InterfaceC0222g3 interfaceC0222g3) {
        boolean z;
        ClassLoader classLoaderM1137 = C0292l3.m1137();
        "<this>";
        "args";
        "cl";
        "hooker";
        Class clsM1199 = C0373r3.m1199(str, classLoaderM1137, 2);
        if (clsM1199 != null) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            "<this>";
            C0237h4.m1090("args", objArrCopyOf);
            "hooker";
            if (str2 != null) {
                try {
                    z = str2.length() == 0;
                } catch (Throwable th) {
                    StringBuilder sb = AbstractC0149b0.f695;
                    AbstractC0149b0.a.m817(th);
                    return;
                }
            }
            if (z) {
                return;
            }
            Method methodFindMethodExact = XposedHelpers.findMethodExact(clsM1199, str2, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
            C0237h4.m1089("findMethodExact(...)", methodFindMethodExact);
            m936(methodFindMethodExact, interfaceC0222g3);
        }
    }
}
