package p213ob;

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
import java.util.concurrent.RejectedExecutionException;
import okhttp3.internal.http2.Settings;
import p002a1.RunnableC0006d;
import p099h.Hchat.utils.KavaReflector;
import p218og.AbstractC3149m;
import p218og.AbstractC3156t;
import tf.AbstractC4165l;

/* JADX INFO: renamed from: ob.m */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3120m extends XC_MethodHook {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f10108a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C3121n f10109b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C3120m(C3121n c3121n, int i9) {
        this.f10108a = i9;
        this.f10109b = c3121n;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        Object[] objArr;
        C3119l c3119l;
        int groupId;
        int i9;
        MenuItem menuItem;
        MenuItem menuItem2;
        Object next;
        int iM6719r0;
        switch (this.f10108a) {
            case 1:
                methodHookParam.getClass();
                C3121n c3121n = this.f10109b;
                if (c3121n.m6625d() && (objArr = methodHookParam.args) != null) {
                    int identifier = 0;
                    Object objM8366C0 = AbstractC4165l.m8366C0(0, objArr);
                    if (objM8366C0 != null) {
                        char c10 = 1;
                        Object objM8366C02 = AbstractC4165l.m8366C0(1, objArr);
                        View view = objM8366C02 instanceof View ? (View) objM8366C02 : null;
                        if (view != null) {
                            Object tag = view.getTag();
                            Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
                            setNewSetFromMap.getClass();
                            Object objM6621h = C3121n.m6621h(0, tag, setNewSetFromMap);
                            if (objM6621h == null) {
                                Set setNewSetFromMap2 = Collections.newSetFromMap(new IdentityHashMap());
                                setNewSetFromMap2.getClass();
                                objM6621h = C3121n.m6621h(0, objArr, setNewSetFromMap2);
                                if (objM6621h == null) {
                                }
                            }
                            Number numberM6619e = C3121n.m6619e(objM6621h, "getType", "field_type", "type");
                            int i10 = 2;
                            if (numberM6619e == null || (numberM6619e.intValue() & Settings.DEFAULT_INITIAL_WINDOW_SIZE) != 1) {
                                c3119l = null;
                            } else {
                                String strM6620f = C3121n.m6620f(objM6621h, "getTalker", "field_talker", "talker");
                                String strM6620f2 = C3121n.m6620f(objM6621h, "getContent", "field_content", "content");
                                if ((AbstractC3156t.m6733W(strM6620f, "@chatroom", false) || AbstractC3156t.m6733W(strM6620f, "@im.chatroom", false)) && (iM6719r0 = AbstractC3149m.m6719r0(strM6620f2, ":\n", 0, false, 6)) > 0) {
                                    strM6620f2 = strM6620f2.substring(iM6719r0 + 2);
                                }
                                String string = AbstractC3149m.m6703R0(strM6620f2).toString();
                                if (string.length() <= 0) {
                                    string = null;
                                }
                                if (string != null) {
                                    c3119l = new C3119l(string);
                                }
                            }
                            if (c3119l != null) {
                                Object objInvokeMethod = KavaReflector.invokeMethod(objM8366C0, "findItem", 1212372054);
                                MenuItem menuItem3 = objInvokeMethod instanceof MenuItem ? (MenuItem) objInvokeMethod : null;
                                if (menuItem3 != null) {
                                    C3121n.m6618b(objM8366C0, menuItem3);
                                    menuItem2 = menuItem3;
                                } else {
                                    Object objInvokeMethod2 = KavaReflector.invokeMethod(objM8366C0, "size", new Object[0]);
                                    Number number = objInvokeMethod2 instanceof Number ? (Number) objInvokeMethod2 : null;
                                    int iIntValue = number != null ? number.intValue() : 0;
                                    int i11 = 0;
                                    while (true) {
                                        if (i11 >= iIntValue) {
                                            groupId = 0;
                                        } else {
                                            Object objInvokeMethod3 = KavaReflector.invokeMethod(objM8366C0, "getItem", Integer.valueOf(i11));
                                            MenuItem menuItem4 = objInvokeMethod3 instanceof MenuItem ? (MenuItem) objInvokeMethod3 : null;
                                            if (menuItem4 != null) {
                                                groupId = menuItem4.getGroupId();
                                            } else {
                                                i11++;
                                                i10 = 2;
                                            }
                                        }
                                    }
                                    Resources resources = view.getContext().getResources();
                                    String packageName = view.getContext().getPackageName();
                                    String[] strArr = {"raw", "drawable"};
                                    int i12 = 0;
                                    while (true) {
                                        if (i12 >= i10) {
                                            i9 = identifier;
                                        } else {
                                            i9 = identifier;
                                            identifier = resources.getIdentifier("icons_filled_volume_up", strArr[i12], packageName);
                                            if (identifier == 0) {
                                                i12++;
                                                identifier = i9;
                                                i10 = 2;
                                            }
                                        }
                                    }
                                    if (identifier != 0) {
                                        Iterator<T> it = KavaReflector.declaredMethods(objM8366C0.getClass()).iterator();
                                        while (true) {
                                            if (it.hasNext()) {
                                                next = it.next();
                                                Method method = (Method) next;
                                                char c11 = c10;
                                                Class<?>[] parameterTypes = method.getParameterTypes();
                                                if (AbstractC1416l.m3825a(method.getName(), "c") && parameterTypes.length == 5) {
                                                    Class<?> cls = parameterTypes[i9];
                                                    Class cls2 = Integer.TYPE;
                                                    if (!AbstractC1416l.m3825a(cls, cls2) || !AbstractC1416l.m3825a(parameterTypes[c11], cls2) || !AbstractC1416l.m3825a(parameterTypes[i10], cls2) || !parameterTypes[3].isAssignableFrom(String.class) || !AbstractC1416l.m3825a(parameterTypes[4], cls2)) {
                                                    }
                                                }
                                                c10 = c11;
                                                i10 = 2;
                                            } else {
                                                next = null;
                                            }
                                        }
                                        if (KavaReflector.invokeSuccessfully((Method) next, objM8366C0, Integer.valueOf(groupId), 1212372054, 0, "转语音播放[H]", Integer.valueOf(identifier))) {
                                            Object objInvokeMethod4 = KavaReflector.invokeMethod(objM8366C0, "findItem", 1212372054);
                                            menuItem = objInvokeMethod4 instanceof MenuItem ? (MenuItem) objInvokeMethod4 : null;
                                            if (menuItem != null) {
                                                C3121n.m6618b(objM8366C0, menuItem);
                                                menuItem2 = menuItem;
                                            }
                                            menuItem2 = null;
                                        } else {
                                            Object objInvokeMethod5 = KavaReflector.invokeMethod(objM8366C0, "add", Integer.valueOf(groupId), 1212372054, 0, "转语音播放[H]");
                                            if (objInvokeMethod5 == null) {
                                                objInvokeMethod5 = KavaReflector.invokeMethod(objM8366C0, "add", Integer.valueOf(groupId), 1212372054, 0, "转语音播放[H]");
                                            }
                                            if (objInvokeMethod5 instanceof MenuItem) {
                                                if (identifier != 0) {
                                                    try {
                                                        ((MenuItem) objInvokeMethod5).setIcon(identifier);
                                                        break;
                                                    } catch (Throwable unused) {
                                                    }
                                                }
                                                menuItem2 = (MenuItem) objInvokeMethod5;
                                                C3121n.m6618b(objM8366C0, menuItem2);
                                            } else {
                                                Object objInvokeMethod6 = KavaReflector.invokeMethod(objM8366C0, "f", 1212372054, "转语音播放[H]");
                                                if (objInvokeMethod6 == null) {
                                                    objInvokeMethod6 = KavaReflector.invokeMethod(objM8366C0, "f", 1212372054, "转语音播放[H]");
                                                }
                                                menuItem = objInvokeMethod6 instanceof MenuItem ? (MenuItem) objInvokeMethod6 : null;
                                                if (menuItem == null) {
                                                    Object objInvokeMethod7 = KavaReflector.invokeMethod(objM8366C0, "findItem", 1212372054);
                                                    menuItem = objInvokeMethod7 instanceof MenuItem ? (MenuItem) objInvokeMethod7 : null;
                                                }
                                                if (menuItem != null) {
                                                    C3121n.m6618b(objM8366C0, menuItem);
                                                    menuItem2 = menuItem;
                                                }
                                                menuItem2 = null;
                                            }
                                        }
                                    }
                                }
                                if (menuItem2 != null) {
                                    Map map = c3121n.f10119j;
                                    map.getClass();
                                    map.put(menuItem2, c3119l);
                                }
                            }
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
        MenuItem menuItem;
        switch (this.f10108a) {
            case 0:
                methodHookParam.getClass();
                C3121n c3121n = this.f10109b;
                if (c3121n.m6625d() && (objArr = methodHookParam.args) != null) {
                    int length = objArr.length;
                    int i9 = 0;
                    while (true) {
                        if (i9 < length) {
                            Object obj = objArr[i9];
                            menuItem = obj instanceof MenuItem ? (MenuItem) obj : null;
                            if (menuItem == null) {
                                i9++;
                            }
                        }
                    }
                    if (menuItem != null && menuItem.getItemId() == 1212372054) {
                        C3119l c3119l = (C3119l) c3121n.f10119j.remove(menuItem);
                        if (c3119l == null) {
                            c3121n.m6630l("文字消息不可用");
                        } else {
                            c3121n.m6630l("正在生成语音");
                            try {
                                c3121n.f10120k.execute(new RunnableC0006d(c3121n, 25, c3119l.f10107a));
                            } catch (RejectedExecutionException unused) {
                                c3121n.m6630l("待处理语音过多，请稍后重试");
                                return;
                            }
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
