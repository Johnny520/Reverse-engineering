package top.suzhelan.qstory.hook.item;

import android.app.Activity;
import android.widget.FrameLayout;
import de.robv.android.xposed.XC_MethodHook;
import java.lang.reflect.Method;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.text.AbstractC5964;
import p049.AbstractC7166;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6722 extends XC_MethodHook {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ C6721 f16414;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f16415;

    public /* synthetic */ C6722(C6721 c6721, int i) {
        this.f16415 = i;
        this.f16414 = c6721;
    }

    public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        switch (this.f16415) {
            case 3:
                "param";
                methodHookParam.getClass();
                if (this.f16414.f17770.booleanValue()) {
                    Object obj = methodHookParam.thisObject;
                    FrameLayout frameLayout = obj instanceof FrameLayout ? (FrameLayout) obj : null;
                    if (frameLayout != null) {
                        frameLayout.setVisibility(8);
                        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(0, 0));
                        break;
                    }
                }
                break;
            default:
                super.afterHookedMethod(methodHookParam);
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x00e8, code lost:
    
        if (top.suzhelan.qstory.hook.item.C6721.m11847() == null) goto L59;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        String str;
        String str2;
        Object objInvoke;
        int i = this.f16415;
        C6721 c6721 = this.f16414;
        switch (i) {
            case 0:
                "param";
                methodHookParam.getClass();
                if (c6721.f17770.booleanValue()) {
                    try {
                        Object obj = methodHookParam.args[0];
                        if (AbstractC5227.m9466(obj instanceof String ? (String) obj : null, "socialError")) {
                            ConcurrentHashMap concurrentHashMap = C6721.f16413;
                            try {
                                Method declaredMethod = AbstractC7166.m12425("com.tencent.mobileqq.app.QQAppInterface").getDeclaredMethod("getCurrentUin", null);
                                declaredMethod.setAccessible(true);
                                objInvoke = declaredMethod.invoke(null, null);
                            } catch (Exception unused) {
                            }
                            str = objInvoke instanceof String ? (String) objInvoke : null;
                            if (str != null) {
                                Boolean bool = (Boolean) C6721.f16413.get(str);
                                if (!(bool != null ? bool.booleanValue() : false)) {
                                    Object obj2 = methodHookParam.args[1];
                                    byte[] bArr = obj2 instanceof byte[] ? (byte[]) obj2 : null;
                                    if (bArr != null) {
                                        str2 = new String(bArr, AbstractC5964.f15033);
                                        try {
                                            Object objInvoke2 = AbstractC7166.m12425("android.app.ActivityManager").getMethod("getRunningAppProcesses", null).invoke(null, null);
                                            if ((objInvoke2 instanceof List ? (List) objInvoke2 : null) != null) {
                                                break;
                                            }
                                            methodHookParam.setResult((Object) null);
                                        } catch (Exception unused2) {
                                        }
                                    }
                                } else {
                                    methodHookParam.setResult((Object) null);
                                }
                                break;
                            }
                        }
                    } catch (Exception unused3) {
                        return;
                    }
                    break;
                }
                break;
            case 1:
                "param";
                methodHookParam.getClass();
                if (c6721.f17770.booleanValue()) {
                    methodHookParam.setResult((Object) null);
                }
                break;
            case 2:
                "param";
                methodHookParam.getClass();
                if (c6721.f17770.booleanValue()) {
                    Object obj3 = methodHookParam.thisObject;
                    Activity activity = obj3 instanceof Activity ? (Activity) obj3 : null;
                    if (activity != null) {
                        activity.finish();
                    }
                    methodHookParam.setResult(Boolean.TRUE);
                }
                break;
            default:
                super.beforeHookedMethod(methodHookParam);
                break;
        }
        return;
        String strM11850 = C6721.m11850(c6721, str2);
        Object[] objArr = methodHookParam.args;
        byte[] bytes = strM11850.getBytes(AbstractC5964.f15033);
        "getBytes(...)";
        bytes.getClass();
        objArr[1] = bytes;
        C6721.f16413.put(str, Boolean.TRUE);
    }
}
