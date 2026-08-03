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
            C0237h4.m1088(C0341oa.m915(new byte[]{67, 6, -48, -90, 82, -37, 76, 29, -46, -91, 6, -104, 79, 22, -100, -87, 19, -53, 89, 83, -56, -91, 82, -42, 66, 29, -111, -92, 7, -44, 65, 83, -56, -77, 2, -35, 13, 25, -35, -68, 19, -106, 65, 18, -46, -83, 92, -54, 72, 21, -48, -81, 17, -52, 3, 62, -39, -66, 26, -41, 73}, new byte[]{45, 115, -68, -54, 114, -72}), member);
            String simpleName = ((Method) member).getReturnType().getSimpleName();
            switch (simpleName.hashCode()) {
                case -1325958191:
                    if (simpleName.equals(C0341oa.m915(new byte[]{21, -78, -99, 1, -115, -107}, new byte[]{113, -35, -24, 99, -31, -16}))) {
                        C0155b6.m1017();
                        return 0;
                    }
                    return null;
                case 104431:
                    if (simpleName.equals(C0341oa.m915(new byte[]{-19, 13, 52}, new byte[]{-124, 99, 64, -69, -125, 48}))) {
                        C0155b6.m1017();
                        return 0;
                    }
                    return null;
                case 3327612:
                    if (simpleName.equals(C0341oa.m915(new byte[]{126, -64, -10, 118}, new byte[]{18, -81, -104, 17, 57, 14}))) {
                        C0155b6.m1017();
                        return 0L;
                    }
                    return null;
                case 64711720:
                    if (simpleName.equals(C0341oa.m915(new byte[]{109, 22, 124, -5, -47, 8, 97}, new byte[]{15, 121, 19, -105, -76, 105}))) {
                        C0155b6.m1017();
                        return Boolean.FALSE;
                    }
                    return null;
                case 97526364:
                    if (simpleName.equals(C0341oa.m915(new byte[]{-43, 122, -32, -102, 105}, new byte[]{-77, 22, -113, -5, 29, 98}))) {
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
        C0237h4.m1090(C0341oa.m915(new byte[]{85, -108, 34, -111, 78, 91}, new byte[]{61, -5, 77, -6, 43, 41}), interfaceC0222g3);
        C0237h4.m1090(C0341oa.m915(new byte[]{59, 60, -16, 18, -88}, new byte[]{75, 93, -126, 115, -59, 32}), methodHookParam);
        Object objMo984 = interfaceC0222g3.mo984(methodHookParam);
        if (objMo984 != null) {
            strM915 = objMo984.getClass().getSimpleName().toLowerCase(Locale.ROOT);
            C0237h4.m1089(C0341oa.m915(new byte[]{104, -12, 49, 91, 41, 125, 110, -40, 28, 71, 59, 48, 50, -75, 83, 29}, new byte[]{28, -101, 125, 52, 94, 24}), strM915);
        } else {
            strM915 = C0341oa.m915(new byte[]{32, 46, -123, 11}, new byte[]{78, 91, -23, 103, -107, 105});
        }
        Member member = methodHookParam.method;
        C0237h4.m1088(C0341oa.m915(new byte[]{-20, 49, 79, -2, -50, 91, -29, 42, 77, -3, -102, 24, -32, 33, 3, -15, -113, 75, -10, 100, 87, -3, -50, 86, -19, 42, 14, -4, -101, 84, -18, 100, 87, -21, -98, 93, -94, 46, 66, -28, -113, 22, -18, 37, 77, -11, -64, 74, -25, 34, 79, -9, -115, 76, -84, 9, 70, -26, -122, 87, -26}, new byte[]{-126, 68, 35, -110, -18, 56}), member);
        String simpleName = ((Method) member).getReturnType().getSimpleName();
        C0341oa.m915(new byte[]{64, 34, -65, 105, 29, 19, 87, 43, -82, 116, 21, 19, 66, 111, -27, 20, 90, 87}, new byte[]{39, 71, -53, 58, 116, 126});
        String lowerCase = simpleName.toLowerCase(Locale.ROOT);
        C0237h4.m1089(C0341oa.m915(new byte[]{5, 30, -87, 14, -62, -32, 3, 50, -124, 18, -48, -83, 95, 95, -53, 72}, new byte[]{113, 113, -27, 97, -75, -123}), lowerCase);
        switch (lowerCase.hashCode()) {
            case -1325958191:
                if (!lowerCase.equals(C0341oa.m915(new byte[]{78, -16, -111, 28, 27, -114}, new byte[]{42, -97, -28, 126, 119, -21}))) {
                    return objMo984;
                }
                if (C0237h4.m864(strM915, lowerCase)) {
                    return objMo984;
                }
                C0155b6.m1017();
                return C0373r3.m1213(methodHookParam);
            case 104431:
                if (!lowerCase.equals(C0341oa.m915(new byte[]{11, 2, 20}, new byte[]{98, 108, 96, -46, 120, 20})) || C0237h4.m864(strM915, C0341oa.m915(new byte[]{-117, 90, 16}, new byte[]{-30, 52, 100, -55, -95, -76})) || C0237h4.m864(strM915, C0341oa.m915(new byte[]{-79, 85, -29, 104, 31, 79, -86}, new byte[]{-40, 59, -105, 13, 120, 42}))) {
                    return objMo984;
                }
                C0155b6.m1017();
                return C0373r3.m1213(methodHookParam);
            case 3327612:
                if (!lowerCase.equals(C0341oa.m915(new byte[]{72, -66, 123, -91}, new byte[]{36, -47, 21, -62, -45, 83}))) {
                    return objMo984;
                }
                if (C0237h4.m864(strM915, lowerCase)) {
                }
                C0155b6.m1017();
                return C0373r3.m1213(methodHookParam);
            case 64711720:
                if (!lowerCase.equals(C0341oa.m915(new byte[]{109, 39, -108, -102, -13, 85, 97}, new byte[]{15, 72, -5, -10, -106, 52})) || C0237h4.m864(strM915, lowerCase)) {
                    return objMo984;
                }
                C0155b6.m1017();
                return C0373r3.m1213(methodHookParam);
            case 97526364:
                if (!lowerCase.equals(C0341oa.m915(new byte[]{77, 52, -44, 42, 109}, new byte[]{43, 88, -69, 75, 25, -83}))) {
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
        C0341oa.m915(new byte[]{126, 113, -60, -124, -100, 26}, new byte[]{66, 5, -84, -19, -17, 36});
        C0341oa.m915(new byte[]{-96, -14, -79, -96, -111, 127}, new byte[]{-56, -99, -34, -53, -12, 13});
        return C0373r3.m1212(method, new C0399t3(interfaceC0222g3));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static void m1225(String str, String str2, Object[] objArr, InterfaceC0222g3 interfaceC0222g3) {
        boolean z;
        ClassLoader classLoaderM1137 = C0292l3.m1137();
        C0341oa.m915(new byte[]{-101, -111, -45, -126, 34, 58}, new byte[]{-89, -27, -69, -21, 81, 4});
        C0341oa.m915(new byte[]{-44, 36, -32, -78}, new byte[]{-75, 86, -121, -63, -83, -21});
        C0341oa.m915(new byte[]{123, -111}, new byte[]{24, -3, -48, -51, 31, 112});
        C0341oa.m915(new byte[]{68, 104, -90, -79, -50, 58}, new byte[]{44, 7, -55, -38, -85, 72});
        Class clsM1199 = C0373r3.m1199(str, classLoaderM1137, 2);
        if (clsM1199 != null) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            C0341oa.m915(new byte[]{-88, 70, 30, 108, 84, 104}, new byte[]{-108, 50, 118, 5, 39, 86});
            C0237h4.m1090(C0341oa.m915(new byte[]{-33, 15, 66, 47}, new byte[]{-66, 125, 37, 92, 18, 54}), objArrCopyOf);
            C0341oa.m915(new byte[]{104, 53, 91, -3, 88, -81}, new byte[]{0, 90, 52, -106, 61, -35});
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
            C0237h4.m1089(C0341oa.m915(new byte[]{26, 101, 22, -108, 14, 113, 8, 100, 23, -108, 6, 108, 29, 111, 12, -40, 109, 58, 82, 37}, new byte[]{124, 12, 120, -16, 67, 20}), methodFindMethodExact);
            m936(methodFindMethodExact, interfaceC0222g3);
        }
    }
}
