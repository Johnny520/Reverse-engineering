package p347xa;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import de.robv.android.xposed.XC_MethodHook;
import gg.AbstractC1416l;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import okhttp3.HttpUrl;
import p000a.AbstractC0000a;
import p024b9.RunnableC0217c;
import p024b9.SharedPreferencesOnSharedPreferenceChangeListenerC0216b;
import p085fg.InterfaceC1220a;
import p096g8.C1368i;
import p096g8.C1370k;
import p099h.Hchat.hooks.api.core.WeChatApis;
import p099h.Hchat.hooks.api.model.WeChatContact;
import p099h.Hchat.utils.KavaReflector;
import p126ia.C2026t;
import p144k.C2209s1;
import p218og.AbstractC3149m;
import p218og.AbstractC3156t;
import p222p.AbstractC3199a;
import p258r8.C3742g;
import p258r8.C3744i;
import p276sf.C3958e;
import p276sf.C3959f;
import p276sf.C3960g;
import p300ub.AbstractC4302b;
import p332wb.C4819dj;
import p332wb.C5491y2;
import p332wb.EnumC5092lv;

/* JADX INFO: renamed from: xa.m */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5752m {

    /* JADX INFO: renamed from: a */
    public final C3742g f23413a;

    /* JADX INFO: renamed from: b */
    public final C2026t f23414b;

    /* JADX INFO: renamed from: c */
    public final SharedPreferences f23415c;

    /* JADX INFO: renamed from: d */
    public final Handler f23416d;

    /* JADX INFO: renamed from: e */
    public final ConcurrentHashMap.KeySetView f23417e;

    /* JADX INFO: renamed from: f */
    public final Map f23418f;

    /* JADX INFO: renamed from: g */
    public final Map f23419g;

    /* JADX INFO: renamed from: h */
    public volatile C5748i f23420h;

    /* JADX INFO: renamed from: i */
    public final Map f23421i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5752m(C3742g c3742g, C2026t c2026t) {
        c3742g.getClass();
        this.f23413a = c3742g;
        this.f23414b = c2026t;
        SharedPreferences sharedPreferencesM8640c = AbstractC4302b.m8640c(c3742g.f12143a, "Hchat_quick_contact_edit_config");
        this.f23415c = sharedPreferencesM8640c;
        this.f23416d = new Handler(Looper.getMainLooper());
        this.f23417e = ConcurrentHashMap.newKeySet();
        this.f23418f = AbstractC3199a.m6843p();
        this.f23419g = AbstractC3199a.m6843p();
        this.f23421i = AbstractC3199a.m6843p();
        sharedPreferencesM8640c.registerOnSharedPreferenceChangeListener(new SharedPreferencesOnSharedPreferenceChangeListenerC0216b(this, 11));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static boolean m10441a(Activity activity) {
        return (activity.isFinishing() || activity.isDestroyed()) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static Activity m10442c(Context context) {
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            Context baseContext = ((ContextWrapper) context).getBaseContext();
            if (baseContext == context) {
                break;
            }
            context = baseContext;
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0093 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0094  */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String m10443d(int i9, Object obj, Set set) {
        String string;
        Object field;
        String strM10443d;
        String string2;
        if (obj != null && i9 <= 3 && set.add(obj)) {
            if (obj.getClass().getName().equals("com.tencent.mm.plugin.sns.storage.SnsInfo")) {
                Object objInvokeMethod = KavaReflector.invokeMethod(obj, "getUserName", new Object[0]);
                if (objInvokeMethod == null) {
                    objInvokeMethod = KavaReflector.readField(obj, "field_userName");
                }
                if (objInvokeMethod == null || (string2 = objInvokeMethod.toString()) == null || (string = AbstractC3149m.m6703R0(string2).toString()) == null || string.length() <= 0) {
                    string = null;
                }
                if (string == null) {
                    return string;
                }
                if (i9 != 3) {
                    for (Class<?> superclass = obj.getClass(); superclass != null && !superclass.equals(Object.class); superclass = superclass.getSuperclass()) {
                        for (Field field2 : KavaReflector.declaredFields(superclass)) {
                            if (!Modifier.isStatic(field2.getModifiers()) && !field2.getType().isPrimitive() && (field = KavaReflector.readField(field2, obj)) != null) {
                                String name = field.getClass().getName();
                                if (!(field instanceof String) && !AbstractC3156t.m6740d0(name, "android.", false) && !AbstractC3156t.m6740d0(name, "androidx.", false) && !AbstractC3156t.m6740d0(name, "java.", false) && !AbstractC3156t.m6740d0(name, "kotlin.", false) && !AbstractC3156t.m6740d0(name, "kotlinx.", false) && (strM10443d = m10443d(i9 + 1, field, set)) != null) {
                                    return strM10443d;
                                }
                            }
                        }
                    }
                }
            } else {
                Method methodFindMethodRecursive = KavaReflector.findMethodRecursive(obj.getClass(), "getUserName", new Class[0]);
                if (methodFindMethodRecursive != null) {
                    Class<?>[] parameterTypes = methodFindMethodRecursive.getParameterTypes();
                    parameterTypes.getClass();
                    if (parameterTypes.length != 0 || !AbstractC1416l.m3825a(methodFindMethodRecursive.getReturnType(), String.class)) {
                        methodFindMethodRecursive = null;
                    }
                    if (methodFindMethodRecursive != null) {
                        Object objInvoke = KavaReflector.invoke(methodFindMethodRecursive, obj, new Object[0]);
                        String str = objInvoke instanceof String ? (String) objInvoke : null;
                        if (str == null || (string = AbstractC3149m.m6703R0(str).toString()) == null || string.length() <= 0) {
                        }
                        if (string == null) {
                        }
                    }
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x006d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m10444f(String str) {
        Object c3959f;
        boolean zBooleanValue;
        boolean z9;
        Object c3959f2;
        WeChatContact weChatContactM3725n;
        boolean z10 = true;
        boolean z11 = false;
        if (AbstractC3149m.m6721t0(str)) {
            zBooleanValue = false;
        } else {
            try {
                C1368i c1368iContacts = WeChatApis.contacts();
                c3959f = Boolean.valueOf(c1368iContacts != null && c1368iContacts.m3705H(str));
            } catch (Throwable th2) {
                c3959f = new C3959f(th2);
            }
            Object obj = Boolean.FALSE;
            if (c3959f instanceof C3959f) {
                c3959f = obj;
            }
            zBooleanValue = ((Boolean) c3959f).booleanValue();
        }
        if (zBooleanValue) {
            return true;
        }
        if (AbstractC3156t.m6733W(str, "@openim", true)) {
            C1370k c1370kUsers = WeChatApis.users();
            if (c1370kUsers == null) {
                z9 = false;
                if (!z9) {
                    try {
                        C1368i c1368iContacts2 = WeChatApis.contacts();
                        if (c1368iContacts2 != null && (weChatContactM3725n = c1368iContacts2.m3725n(str)) != null) {
                            if (weChatContactM3725n.isGroup() || weChatContactM3725n.isOfficialAccount()) {
                                z10 = false;
                            }
                            z11 = z10;
                        }
                        c3959f2 = Boolean.valueOf(z11);
                    } catch (Throwable th3) {
                        c3959f2 = new C3959f(th3);
                    }
                    Object obj2 = Boolean.FALSE;
                    if (c3959f2 instanceof C3959f) {
                        c3959f2 = obj2;
                    }
                    return ((Boolean) c3959f2).booleanValue();
                }
            } else {
                String strM3652c = c1370kUsers.f4554a.m3652c();
                if (strM3652c == null) {
                    strM3652c = HttpUrl.FRAGMENT_ENCODE_SET;
                }
                if ((TextUtils.isEmpty(str) || TextUtils.isEmpty(strM3652c) || !str.equals(strM3652c)) ? false : true) {
                    z9 = true;
                }
                if (!z9) {
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final boolean m10445b() {
        return this.f23415c.getBoolean("quick_contact_edit_enable", false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final boolean m10446e(Method method, XC_MethodHook xC_MethodHook) {
        Object c3959f;
        if (Modifier.isAbstract(method.getModifiers()) || method.getDeclaringClass().isInterface()) {
            return false;
        }
        ConcurrentHashMap.KeySetView keySetView = this.f23417e;
        if (!keySetView.add(method)) {
            return true;
        }
        try {
            C3744i c3744i = C3744i.f12154b;
            Method methodAccessible = KavaReflector.accessible(method);
            if (methodAccessible == null) {
                methodAccessible = method;
            }
            c3744i.m7763b(methodAccessible, xC_MethodHook);
            c3959f = Boolean.TRUE;
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Throwable thM8182b = C3960g.m8182b(c3959f);
        if (thM8182b != null) {
            keySetView.remove(method);
            this.f23414b.invoke("安装快捷设置 Hook 失败: " + method.toGenericString(), thM8182b);
            c3959f = Boolean.FALSE;
        }
        return ((Boolean) c3959f).booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final void m10447g(Activity activity, String str, InterfaceC1220a interfaceC1220a) {
        if (m10441a(activity)) {
            new Thread(new RunnableC0217c(interfaceC1220a, this, C5491y2.m9813X1(activity, new C2209s1(7), "设置备注和标签", str), activity, 27), "Hchat-QuickContactUpdate").start();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final View.OnLongClickListener m10448h(View view) {
        C5747h c5747h;
        Map map = this.f23421i;
        map.getClass();
        synchronized (map) {
            c5747h = (C5747h) this.f23421i.remove(view);
        }
        if (c5747h == null) {
            return null;
        }
        try {
            view.setOnLongClickListener(c5747h.f23404c);
            view.setLongClickable(c5747h.f23405d);
        } catch (Throwable unused) {
        }
        return c5747h.f23404c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final void m10449i(C5748i c5748i) {
        C1368i c1368iContacts;
        Object c3959f;
        Activity activity = c5748i.f23406a;
        String str = c5748i.f23407b;
        if (m10441a(activity) && (c1368iContacts = WeChatApis.contacts()) != null) {
            try {
                c3959f = c1368iContacts.m3725n(str);
            } catch (Throwable th2) {
                c3959f = new C3959f(th2);
            }
            if (c3959f instanceof C3959f) {
                c3959f = null;
            }
            WeChatContact weChatContact = (WeChatContact) c3959f;
            if (weChatContact != null) {
                WeChatContact weChatContact2 = c1368iContacts.m3705H(str) || (c5748i.f23408c && m10444f(str)) ? weChatContact : null;
                if (weChatContact2 != null) {
                    String str2 = weChatContact2.remarkName;
                    if (AbstractC3149m.m6721t0(str2)) {
                        str2 = "未设置";
                    }
                    C5491y2.m9799Q1(activity, "设置备注和标签", weChatContact2.displayName(), AbstractC0000a.m101y0(new C3958e("修改备注", "当前备注：".concat(str2)), new C3958e("设置好友标签", "勾选、取消或清空已有标签"), new C3958e("新建并添加标签", "创建微信好友标签并添加给该好友")), new C4819dj(this, c5748i, weChatContact2, 11), new C2209s1(7), EnumC5092lv.f18824j);
                }
            }
        }
    }
}
