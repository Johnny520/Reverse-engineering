package p097g9;

import ac.RunnableC0059l;
import android.app.Activity;
import android.content.res.Resources;
import android.view.MenuItem;
import android.view.View;
import de.robv.android.xposed.XC_MethodHook;
import gg.AbstractC1416l;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import okhttp3.HttpUrl;
import okhttp3.internal.http2.Settings;
import p036c9.RunnableC0487t;
import p068eh.AbstractC0921a;
import p099h.Hchat.hooks.api.core.WeChatApis;
import p099h.Hchat.hooks.api.model.WeChatMessage;
import p099h.Hchat.utils.KavaReflector;
import p167l8.C2529d;
import p218og.AbstractC3149m;
import p218og.C3147k;
import p242q8.C3460o;
import tf.AbstractC4165l;

/* JADX INFO: renamed from: g9.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1374c extends XC_MethodHook {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4561a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1375d f4562b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C1374c(C1375d c1375d, int i9) {
        this.f4561a = i9;
        this.f4562b = c1375d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:82:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x018d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        Object[] objArr;
        Object objM8366C0;
        int groupId;
        char c10;
        int i9;
        MenuItem menuItem;
        Object next;
        switch (this.f4561a) {
            case 1:
                methodHookParam.getClass();
                C1375d c1375d = this.f4562b;
                int identifier = 0;
                if (c1375d.f4567c.getBoolean("emoji_save_enable", false) && (objArr = methodHookParam.args) != null && (objM8366C0 = AbstractC4165l.m8366C0(0, objArr)) != null) {
                    char c11 = 1;
                    Object objM8366C02 = AbstractC4165l.m8366C0(1, objArr);
                    View view = objM8366C02 instanceof View ? (View) objM8366C02 : null;
                    if (view != null) {
                        Object tag = view.getTag();
                        Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
                        setNewSetFromMap.getClass();
                        Object objM3745e = C1375d.m3745e(0, tag, setNewSetFromMap);
                        if (objM3745e == null) {
                            Set setNewSetFromMap2 = Collections.newSetFromMap(new IdentityHashMap());
                            setNewSetFromMap2.getClass();
                            objM3745e = C1375d.m3745e(0, objArr, setNewSetFromMap2);
                            if (objM3745e == null) {
                            }
                        }
                        Number numberM3743c = C1375d.m3743c(objM3745e, "getType", "field_type", "type");
                        if (numberM3743c != null && (numberM3743c.intValue() & Settings.DEFAULT_INITIAL_WINDOW_SIZE) == 47) {
                            Object objInvokeMethod = KavaReflector.invokeMethod(objM8366C0, "findItem", 1212368211);
                            MenuItem menuItem2 = objInvokeMethod instanceof MenuItem ? (MenuItem) objInvokeMethod : null;
                            if (menuItem2 != null) {
                                menuItem = menuItem2;
                            } else {
                                Object objInvokeMethod2 = KavaReflector.invokeMethod(objM8366C0, "size", new Object[0]);
                                Number number = objInvokeMethod2 instanceof Number ? (Number) objInvokeMethod2 : null;
                                int iIntValue = number != null ? number.intValue() : 0;
                                int i10 = 0;
                                while (true) {
                                    if (i10 >= iIntValue) {
                                        groupId = 0;
                                    } else {
                                        Object objInvokeMethod3 = KavaReflector.invokeMethod(objM8366C0, "getItem", Integer.valueOf(i10));
                                        MenuItem menuItem3 = objInvokeMethod3 instanceof MenuItem ? (MenuItem) objInvokeMethod3 : null;
                                        if (menuItem3 != null) {
                                            groupId = menuItem3.getGroupId();
                                        } else {
                                            i10++;
                                        }
                                    }
                                }
                                Resources resources = view.getContext().getResources();
                                String packageName = view.getContext().getPackageName();
                                String[] strArr = {"raw", "drawable"};
                                int i11 = 0;
                                while (true) {
                                    c10 = 2;
                                    if (i11 >= 2) {
                                        i9 = identifier;
                                    } else {
                                        i9 = identifier;
                                        identifier = resources.getIdentifier("icons_filled_download", strArr[i11], packageName);
                                        if (identifier == 0) {
                                            i11++;
                                            identifier = i9;
                                        }
                                    }
                                }
                                if (identifier != 0) {
                                    Iterator<T> it = KavaReflector.declaredMethods(objM8366C0.getClass()).iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            next = it.next();
                                            Method method = (Method) next;
                                            char c12 = c11;
                                            Class<?>[] parameterTypes = method.getParameterTypes();
                                            if (AbstractC1416l.m3825a(method.getName(), "c") && parameterTypes.length == 5) {
                                                Class<?> cls = parameterTypes[i9];
                                                Class cls2 = Integer.TYPE;
                                                if (!AbstractC1416l.m3825a(cls, cls2) || !AbstractC1416l.m3825a(parameterTypes[c12], cls2) || !AbstractC1416l.m3825a(parameterTypes[c10], cls2) || !parameterTypes[3].isAssignableFrom(String.class) || !AbstractC1416l.m3825a(parameterTypes[4], cls2)) {
                                                }
                                            }
                                            c11 = c12;
                                            c10 = 2;
                                        } else {
                                            next = null;
                                        }
                                    }
                                    if (KavaReflector.invokeSuccessfully((Method) next, objM8366C0, Integer.valueOf(groupId), 1212368211, 0, "保存[H]", Integer.valueOf(identifier))) {
                                        Object objInvokeMethod4 = KavaReflector.invokeMethod(objM8366C0, "findItem", 1212368211);
                                        menuItem = objInvokeMethod4 instanceof MenuItem ? (MenuItem) objInvokeMethod4 : null;
                                    } else {
                                        Object objInvokeMethod5 = KavaReflector.invokeMethod(objM8366C0, "add", Integer.valueOf(groupId), 1212368211, 0, "保存[H]");
                                        if (objInvokeMethod5 == null) {
                                            objInvokeMethod5 = KavaReflector.invokeMethod(objM8366C0, "add", Integer.valueOf(groupId), 1212368211, 0, "保存[H]");
                                        }
                                        if (objInvokeMethod5 instanceof MenuItem) {
                                            if (identifier != 0) {
                                                try {
                                                    ((MenuItem) objInvokeMethod5).setIcon(identifier);
                                                    break;
                                                } catch (Throwable unused) {
                                                }
                                            }
                                            menuItem = (MenuItem) objInvokeMethod5;
                                        } else {
                                            Object objInvokeMethod6 = KavaReflector.invokeMethod(objM8366C0, "f", 1212368211, "保存[H]");
                                            if (objInvokeMethod6 == null) {
                                                objInvokeMethod6 = KavaReflector.invokeMethod(objM8366C0, "f", 1212368211, "保存[H]");
                                            }
                                            MenuItem menuItem4 = objInvokeMethod6 instanceof MenuItem ? (MenuItem) objInvokeMethod6 : null;
                                            if (menuItem4 != null) {
                                                menuItem = menuItem4;
                                            } else {
                                                Object objInvokeMethod7 = KavaReflector.invokeMethod(objM8366C0, "findItem", 1212368211);
                                                if (objInvokeMethod7 instanceof MenuItem) {
                                                    menuItem = (MenuItem) objInvokeMethod7;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            if (menuItem != null) {
                                Map map = c1375d.f4570f;
                                map.getClass();
                                map.put(menuItem, objM3745e);
                            }
                            break;
                        }
                    }
                }
                break;
            default:
                super.afterHookedMethod(methodHookParam);
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        Object[] objArr;
        String str;
        MenuItem menuItem;
        switch (this.f4561a) {
            case 0:
                methodHookParam.getClass();
                C1375d c1375d = this.f4562b;
                if (c1375d.f4567c.getBoolean("emoji_save_enable", false) && (objArr = methodHookParam.args) != null) {
                    int length = objArr.length;
                    int i9 = 0;
                    while (true) {
                        if (i9 < length) {
                            Object obj = objArr[i9];
                            menuItem = obj instanceof MenuItem ? (MenuItem) obj : null;
                            if (menuItem == null) {
                                i9++;
                            }
                        } else {
                            menuItem = null;
                        }
                    }
                    if (menuItem != null && menuItem.getItemId() == 1212368211) {
                        C3460o c3460oCurrentActivity = WeChatApis.currentActivity();
                        Activity activityM7263a = c3460oCurrentActivity != null ? c3460oCurrentActivity.m7263a() : null;
                        Object objRemove = c1375d.f4570f.remove(menuItem);
                        if (objRemove == null) {
                            Object[] objArr2 = methodHookParam.args;
                            Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
                            setNewSetFromMap.getClass();
                            objRemove = C1375d.m3745e(0, objArr2, setNewSetFromMap);
                        }
                        String str2 = HttpUrl.FRAGMENT_ENCODE_SET;
                        if (objRemove != null) {
                            String string = AbstractC3149m.m6703R0(C1375d.m3744d(objRemove, "getImgPath", "field_imgPath", "imgPath")).toString();
                            C3147k c3147k = C1375d.f4563g;
                            if (c3147k.m6683d(string)) {
                                str = string;
                            } else {
                                String strM3744d = C1375d.m3744d(objRemove, "getContent", "field_content", "content");
                                WeChatMessage.Companion.getClass();
                                String strM5947m = C2529d.m5947m(strM3744d, "md5");
                                if (AbstractC3149m.m6721t0(strM5947m)) {
                                    strM5947m = C2529d.m5949o(strM3744d, "md5");
                                }
                                String string2 = AbstractC3149m.m6703R0(strM5947m).toString();
                                if (!c3147k.m6683d(string2)) {
                                    string2 = null;
                                }
                                if (string2 == null) {
                                    string2 = HttpUrl.FRAGMENT_ENCODE_SET;
                                }
                                if (AbstractC3149m.m6721t0(string2)) {
                                    str = AbstractC0921a.m2262y(string) ? string : null;
                                    if (str == null) {
                                        str = HttpUrl.FRAGMENT_ENCODE_SET;
                                    }
                                } else {
                                    str = string2;
                                }
                            }
                        }
                        if (str != null) {
                            str2 = str;
                        }
                        if (!AbstractC3149m.m6721t0(str2)) {
                            new Thread(new RunnableC0059l(c1375d, activityM7263a, str2, 14), "Hchat-EmojiSave").start();
                        } else {
                            c1375d.f4568d.post(new RunnableC0487t(activityM7263a, "表情消息不可用", 5));
                        }
                        break;
                    }
                }
                break;
            default:
                super.beforeHookedMethod(methodHookParam);
                break;
        }
    }
}
