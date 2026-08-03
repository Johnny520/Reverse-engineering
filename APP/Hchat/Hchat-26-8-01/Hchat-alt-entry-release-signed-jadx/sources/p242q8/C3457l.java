package p242q8;

import android.text.TextUtils;
import de.robv.android.xposed.XC_MethodHook;
import java.lang.reflect.Method;
import okhttp3.HttpUrl;
import p099h.Hchat.utils.KavaReflector;

/* JADX INFO: renamed from: q8.l */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3457l extends XC_MethodHook {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f11208a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Method f11209b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C3458m f11210c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C3457l(C3458m c3458m, Method method, int i9) {
        this.f11208a = i9;
        this.f11210c = c3458m;
        this.f11209b = method;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        Method methodFindDeclaredMethod;
        switch (this.f11208a) {
            case 1:
                Object obj = methodHookParam.thisObject;
                String strTrim = HttpUrl.FRAGMENT_ENCODE_SET;
                if (obj != null) {
                    Class<?> superclass = obj.getClass();
                    while (true) {
                        if (superclass != null) {
                            try {
                                methodFindDeclaredMethod = KavaReflector.findDeclaredMethod(superclass, "getStringExtra", String.class);
                                break;
                            } catch (Throwable unused) {
                            }
                            if (methodFindDeclaredMethod.getReturnType() != String.class) {
                                superclass = superclass.getSuperclass();
                            }
                        } else {
                            methodFindDeclaredMethod = null;
                        }
                    }
                    if (methodFindDeclaredMethod != null) {
                        try {
                            Object objInvoke = KavaReflector.invoke(methodFindDeclaredMethod, obj, "Chat_User");
                            if (objInvoke instanceof String) {
                                strTrim = ((String) objInvoke).trim();
                            }
                            break;
                        } catch (Throwable unused2) {
                        }
                    }
                }
                if (TextUtils.isEmpty(strTrim)) {
                    strTrim = this.f11210c.f11221k;
                }
                if (!TextUtils.isEmpty(strTrim)) {
                    C3458m c3458m = this.f11210c;
                    C3458m.m7256f(this.f11209b);
                    c3458m.m7260c(strTrim);
                }
                break;
            case 2:
                String str = this.f11210c.f11220j;
                this.f11210c.f11220j = HttpUrl.FRAGMENT_ENCODE_SET;
                this.f11210c.f11221k = HttpUrl.FRAGMENT_ENCODE_SET;
                if (!TextUtils.isEmpty(str)) {
                    C3458m c3458m2 = this.f11210c;
                    C3458m.m7256f(this.f11209b);
                    c3458m2.m7259b("exit", str);
                }
                break;
            default:
                super.afterHookedMethod(methodHookParam);
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        String strTrim;
        switch (this.f11208a) {
            case 0:
                Object[] objArr = methodHookParam.args;
                if (objArr == null) {
                    strTrim = HttpUrl.FRAGMENT_ENCODE_SET;
                } else {
                    for (Object obj : objArr) {
                        if (obj instanceof String) {
                            strTrim = ((String) obj).trim();
                        }
                    }
                    strTrim = HttpUrl.FRAGMENT_ENCODE_SET;
                }
                if (!TextUtils.isEmpty(strTrim)) {
                    this.f11210c.f11221k = strTrim;
                    C3458m c3458m = this.f11210c;
                    C3458m.m7256f(this.f11209b);
                    c3458m.m7260c(strTrim);
                    break;
                }
                break;
            default:
                super.beforeHookedMethod(methodHookParam);
                break;
        }
    }
}
