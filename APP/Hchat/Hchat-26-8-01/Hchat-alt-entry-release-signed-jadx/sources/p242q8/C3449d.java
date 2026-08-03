package p242q8;

import android.app.Activity;
import android.content.Context;
import android.os.Process;
import android.view.View;
import android.widget.BaseAdapter;
import de.robv.android.xposed.XC_MethodHook;
import java.util.Objects;
import p007a7.AbstractC0018a;
import p025bc.AbstractC0255e;
import p062e8.C0829c;
import p099h.Hchat.utils.KavaReflector;
import p332wb.C5360u2;
import p366ya.AbstractC6019i;

/* JADX INFO: renamed from: q8.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3449d extends XC_MethodHook {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f11177a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C3453h f11178b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C3449d(C3453h c3453h, int i9) {
        this.f11177a = i9;
        this.f11178b = c3453h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        View view;
        switch (this.f11177a) {
            case 0:
                try {
                    Object obj = methodHookParam.thisObject;
                    if (obj instanceof View) {
                        view = (View) obj;
                    } else if (obj != null) {
                        Class<?> superclass = obj.getClass();
                        while (true) {
                            if (superclass != null && superclass != Object.class) {
                                if (superclass.getName().contains("HomeUI$PlusActionView")) {
                                    try {
                                        Object objInvokeMethod = KavaReflector.invokeMethod(obj, "h", new Object[0]);
                                        if (objInvokeMethod instanceof View) {
                                            view = (View) objInvokeMethod;
                                        }
                                        break;
                                    } catch (Throwable unused) {
                                    }
                                } else {
                                    superclass = superclass.getSuperclass();
                                }
                            }
                        }
                        view = null;
                    } else {
                        view = null;
                    }
                    if (view != null) {
                        Boolean bool = Boolean.TRUE;
                        if (!bool.equals(view.getTag(-1212373074))) {
                            view.setTag(-1212373074, bool);
                            view.setOnLongClickListener(new ViewOnLongClickListenerC3448c());
                        }
                    }
                } catch (Throwable th2) {
                    AbstractC0255e.m1030s(th2, new StringBuilder("[Hchat:SettingsInjector] [PlusLongPress] 绑定加号入口失败: "), th2);
                    return;
                }
                break;
            case 1:
                try {
                    this.f11178b.m7248h(methodHookParam.thisObject, methodHookParam.getResult() instanceof BaseAdapter ? (BaseAdapter) methodHookParam.getResult() : null);
                } catch (Throwable th3) {
                    AbstractC0255e.m1030s(th3, new StringBuilder("[Hchat:SettingsInjector] [PlusMenu] 添加入口失败: "), th3);
                    return;
                }
                break;
            case 2:
            case 5:
            default:
                super.afterHookedMethod(methodHookParam);
                break;
            case 3:
                C3453h c3453h = this.f11178b;
                try {
                    Object[] objArr = methodHookParam.args;
                    if (objArr != null && objArr.length >= 1) {
                        Object result = methodHookParam.getResult();
                        if (result instanceof View) {
                            int iM7236f = C3453h.m7236f(c3453h, C3453h.m7234d(c3453h, methodHookParam.thisObject), ((Integer) methodHookParam.args[0]).intValue());
                            if (iM7236f != Integer.MIN_VALUE) {
                                C3453h.m7232b((View) result, iM7236f);
                            }
                        }
                    }
                } catch (Throwable th4) {
                    AbstractC0255e.m1030s(th4, new StringBuilder("[Hchat:SettingsInjector] [PlusMenu] 设置菜单图标失败: "), th4);
                    return;
                }
                break;
            case 4:
                C3453h.m7231a(this.f11178b, methodHookParam.thisObject);
                break;
            case 6:
                C0829c c0829c = this.f11178b.f11196c;
                Activity activity = (Activity) methodHookParam.thisObject;
                try {
                    Object objNewInstance = KavaReflector.newInstance(KavaReflector.findConstructor(c0829c.f2484f, Context.class), activity);
                    KavaReflector.invoke(c0829c.f2485g, objNewInstance, "Hchat_settings");
                    KavaReflector.invoke(c0829c.f2486h, objNewInstance, "Hchat");
                    KavaReflector.invoke(c0829c.f2488j, KavaReflector.invokeMethod(activity, "getPreferenceScreen", new Object[0]), objNewInstance, 0);
                } catch (Throwable th5) {
                    AbstractC0255e.m1030s(th5, new StringBuilder("[Hchat:SettingsInjector] [Legacy] 插入失败: "), th5);
                    return;
                }
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        Object obj;
        switch (this.f11177a) {
            case 2:
                C3453h c3453h = this.f11178b;
                try {
                    Object[] objArr = methodHookParam.args;
                    if (objArr != null && objArr.length >= 3) {
                        int iM7236f = C3453h.m7236f(c3453h, methodHookParam.thisObject, ((Integer) objArr[2]).intValue());
                        if (iM7236f != Integer.MIN_VALUE) {
                            methodHookParam.setResult((Object) null);
                            try {
                                Objects.toString(KavaReflector.invokeMethod(methodHookParam.thisObject, "a", new Object[0]));
                                break;
                            } catch (Throwable unused) {
                            }
                            if (iM7236f == -1212373072) {
                                Process.killProcess(Process.myPid());
                                System.exit(0);
                            } else {
                                Context contextM7233c = C3453h.m7233c(c3453h, methodHookParam.thisObject);
                                if (contextM7233c != null) {
                                    if (iM7236f == -1212373075) {
                                        AbstractC0018a.m231S(contextM7233c, null, false);
                                    } else if (iM7236f == -1212373071) {
                                        AbstractC0018a.m231S(contextM7233c, new C5360u2(null), false);
                                    } else if (iM7236f == -1212373073) {
                                        AbstractC6019i.m10784e(contextM7233c, true);
                                    }
                                }
                            }
                        }
                    }
                } catch (Throwable th2) {
                    AbstractC0255e.m1030s(th2, new StringBuilder("[Hchat:SettingsInjector] [PlusMenu] 处理菜单点击失败: "), th2);
                    return;
                }
                break;
            case 5:
                C3453h.m7231a(this.f11178b, methodHookParam.thisObject);
                break;
            case 7:
                C3453h c3453h2 = this.f11178b;
                try {
                    Object[] objArr2 = methodHookParam.args;
                    if (objArr2.length >= 2 && (obj = objArr2[1]) != null && "Hchat_settings".equals((String) KavaReflector.invoke(c3453h2.f11196c.f2487i, obj, new Object[0]))) {
                        Activity activity = (Activity) methodHookParam.thisObject;
                        activity.getClass();
                        AbstractC0018a.m231S(activity, null, false);
                        methodHookParam.setResult(Boolean.TRUE);
                    }
                } catch (Throwable unused2) {
                    return;
                }
                break;
            default:
                super.beforeHookedMethod(methodHookParam);
                break;
        }
    }
}
