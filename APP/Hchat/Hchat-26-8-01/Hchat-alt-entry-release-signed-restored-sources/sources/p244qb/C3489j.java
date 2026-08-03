package p244qb;

import ac.RunnableC0059l;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.view.MenuItem;
import android.view.View;
import de.robv.android.xposed.XC_MethodHook;
import gg.AbstractC1416l;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import okhttp3.HttpUrl;
import p010aa.C0035c;
import p036c9.C0467n0;
import p051db.C0768f;
import p092g4.AbstractC1341a;
import p099h.Hchat.hooks.api.core.WeChatApis;
import p099h.Hchat.utils.KavaReflector;
import p153k8.AbstractC2338b;
import p218og.AbstractC3149m;
import p218og.AbstractC3156t;
import p242q8.C3458m;
import p242q8.C3460o;
import p266s0.C3874d;
import p332wb.C5491y2;
import p381zb.AbstractC6134c;
import tf.AbstractC4165l;

/* JADX INFO: renamed from: qb.j */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3489j extends XC_MethodHook {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f11328a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C3490k f11329b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C3489j(C3490k c3490k, int i9) {
        this.f11328a = i9;
        this.f11329b = c3490k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:102:0x014f A[PHI: r13
  0x014f: PHI (r13v13 android.app.Activity) = (r13v5 android.app.Activity), (r13v8 android.app.Activity) binds: [B:101:0x014d, B:107:0x015d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        Object[] objArr;
        Object objM8366C0;
        View view;
        Object objM8366C02;
        switch (this.f11328a) {
            case 1:
                methodHookParam.getClass();
                C3490k c3490k = this.f11329b;
                if (c3490k.m7330p()) {
                    boolean z9 = c3490k.m7321O("voice_forward_favorite_forward_enable") && !c3490k.f11333d.getBoolean("message_forward_favorite_enable", false);
                    boolean zM7321O = c3490k.m7321O("voice_forward_favorite_save_enable");
                    if ((z9 || zM7321O) && (objArr = methodHookParam.args) != null && (objM8366C0 = AbstractC4165l.m8366C0(0, objArr)) != null) {
                        Object objM3579J = AbstractC1341a.m3579J(methodHookParam.thisObject);
                        if ((objM3579J != null || (objM3579J = AbstractC1341a.m3579J(objArr)) != null) && C3490k.m7304r(objM3579J)) {
                            Object objM8366C03 = AbstractC4165l.m8366C0(1, objArr);
                            View view2 = objM8366C03 instanceof View ? (View) objM8366C03 : null;
                            Object obj = methodHookParam.thisObject;
                            if (obj != null) {
                                Map map = c3490k.f11342m;
                                map.getClass();
                                map.put(obj, objM3579J);
                            }
                            Context context = view2 != null ? view2.getContext() : null;
                            Activity activityM7263a = context instanceof Activity ? (Activity) context : null;
                            if (activityM7263a == null) {
                                C3460o c3460oCurrentActivity = WeChatApis.currentActivity();
                                activityM7263a = c3460oCurrentActivity != null ? c3460oCurrentActivity.m7263a() : null;
                                if (activityM7263a == null) {
                                    activityM7263a = null;
                                }
                            }
                            if (activityM7263a != null && !activityM7263a.isFinishing()) {
                                Map map2 = c3490k.f11343n;
                                map2.getClass();
                                map2.put(activityM7263a, objM3579J);
                            }
                            c3490k.f11348s = objM3579J;
                            C3488i c3488iM7310B = c3490k.m7310B(objM3579J);
                            if (c3488iM7310B != null) {
                                Object obj2 = methodHookParam.thisObject;
                                if (obj2 != null) {
                                    Map map3 = c3490k.f11344o;
                                    map3.getClass();
                                    map3.put(obj2, c3488iM7310B);
                                }
                                Context context2 = view2 != null ? view2.getContext() : null;
                                Activity activityM7263a2 = context2 instanceof Activity ? (Activity) context2 : null;
                                if (activityM7263a2 == null) {
                                    C3460o c3460oCurrentActivity2 = WeChatApis.currentActivity();
                                    activityM7263a2 = c3460oCurrentActivity2 != null ? c3460oCurrentActivity2.m7263a() : null;
                                    Activity activity = activityM7263a2 != null ? activityM7263a2 : null;
                                    if (activity != null && !activity.isFinishing()) {
                                        Map map4 = c3490k.f11345p;
                                        map4.getClass();
                                        map4.put(activity, c3488iM7310B);
                                    }
                                    c3490k.f11349t = c3488iM7310B;
                                }
                            }
                            if (z9) {
                                view = view2;
                                C3490k.m7296a(objM8366C0, view, 0, 1212372550, "转发[H]", "icons_filled_share");
                            } else {
                                view = view2;
                            }
                            if (zM7321O) {
                                C3490k.m7296a(objM8366C0, view, 0, 1212372563, "保存[H]", "icons_filled_download");
                            }
                            break;
                        }
                    }
                }
                break;
            case 2:
            default:
                super.afterHookedMethod(methodHookParam);
                break;
            case 3:
                methodHookParam.getClass();
                C3490k c3490k2 = this.f11329b;
                boolean zM7330p = c3490k2.m7330p();
                SharedPreferences sharedPreferences = c3490k2.f11332c;
                if (zM7330p) {
                    if (c3490k2.m7321O("voice_forward_chat_multi_forward_enable") || sharedPreferences.getBoolean("voice_forward_chat_multi_merge_enable", false)) {
                        List listM5564b = AbstractC2338b.m5564b(methodHookParam.thisObject);
                        if (!listM5564b.isEmpty()) {
                            if (!listM5564b.isEmpty()) {
                                Iterator it = listM5564b.iterator();
                                while (it.hasNext()) {
                                    if (!C3490k.m7307u(it.next())) {
                                        break;
                                    }
                                }
                            }
                            Object[] objArr2 = methodHookParam.args;
                            if (objArr2 != null && (objM8366C02 = AbstractC4165l.m8366C0(0, objArr2)) != null) {
                                if (c3490k2.m7321O("voice_forward_chat_multi_forward_enable")) {
                                    C3490k.m7296a(objM8366C02, null, 0, 1212372557, "逐条转发语音[H]", "icons_filled_share");
                                }
                                if (sharedPreferences.getBoolean("voice_forward_chat_multi_merge_enable", false) && listM5564b.size() >= 2) {
                                    C3490k.m7296a(objM8366C02, null, 0, 1212372558, "合并语音[H]", "icons_filled_share");
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        Object[] objArr;
        Object obj;
        C3488i c3488iM7310B;
        Object obj2;
        Object objM3579J;
        String strM7258a;
        switch (this.f11328a) {
            case 0:
                methodHookParam.getClass();
                C3490k c3490k = this.f11329b;
                if (c3490k.m7330p() && (objArr = methodHookParam.args) != null) {
                    Object objM8366C0 = AbstractC4165l.m8366C0(0, objArr);
                    MenuItem menuItem = objM8366C0 instanceof MenuItem ? (MenuItem) objM8366C0 : null;
                    if (menuItem != null) {
                        if (menuItem.getItemId() == 1212372550 || menuItem.getItemId() == 1212372563) {
                            if (menuItem.getItemId() != 1212372550 || (c3490k.m7321O("voice_forward_favorite_forward_enable") && !c3490k.f11333d.getBoolean("message_forward_favorite_enable", false))) {
                                if (menuItem.getItemId() != 1212372563 || c3490k.m7321O("voice_forward_favorite_save_enable")) {
                                    C3460o c3460oCurrentActivity = WeChatApis.currentActivity();
                                    Activity activityM7263a = c3460oCurrentActivity != null ? c3460oCurrentActivity.m7263a() : null;
                                    if (activityM7263a == null) {
                                        activityM7263a = null;
                                    }
                                    Object objM3579J2 = AbstractC1341a.m3579J(methodHookParam.thisObject);
                                    if (objM3579J2 == null && (objM3579J2 = AbstractC1341a.m3579J(objArr)) == null) {
                                        Object obj3 = methodHookParam.thisObject;
                                        if ((obj3 == null || (obj2 = c3490k.f11342m.get(obj3)) == null) && (activityM7263a == null || (obj2 = c3490k.f11343n.get(activityM7263a)) == null)) {
                                            obj2 = c3490k.f11348s;
                                        }
                                        objM3579J2 = obj2;
                                    }
                                    if ((objM3579J2 == null || (c3488iM7310B = c3490k.m7310B(objM3579J2)) == null) && (((obj = methodHookParam.thisObject) == null || (c3488iM7310B = (C3488i) c3490k.f11344o.get(obj)) == null) && (activityM7263a == null || (c3488iM7310B = (C3488i) c3490k.f11345p.get(activityM7263a)) == null))) {
                                        c3488iM7310B = c3490k.f11349t;
                                    }
                                    if (c3488iM7310B == null) {
                                        C3490k.m7295N(activityM7263a, objM3579J2 == null ? "收藏语音不可用" : "收藏语音文件不存在");
                                        methodHookParam.setResult((Object) null);
                                    } else if (activityM7263a == null) {
                                        methodHookParam.setResult((Object) null);
                                    } else {
                                        if (menuItem.getItemId() == 1212372563) {
                                            new Thread(new RunnableC0059l(c3490k, activityM7263a, c3488iM7310B, 29), "Hchat-VoiceSave").start();
                                        } else {
                                            c3490k.m7318J(activityM7263a, c3488iM7310B);
                                        }
                                        methodHookParam.setResult((Object) null);
                                    }
                                }
                            }
                        }
                    }
                }
                break;
            case 1:
            default:
                super.beforeHookedMethod(methodHookParam);
                break;
            case 2:
                methodHookParam.getClass();
                C3490k c3490k2 = this.f11329b;
                Set set = c3490k2.f11341l;
                if (c3490k2.m7330p() && c3490k2.m7321O("voice_forward_favorite_forward_enable")) {
                    Object[] objArr2 = methodHookParam.args;
                    Object objM8366C02 = objArr2 != null ? AbstractC4165l.m8366C0(1, objArr2) : null;
                    View view = objM8366C02 instanceof View ? (View) objM8366C02 : null;
                    if (view != null && (objM3579J = AbstractC1341a.m3579J(view)) != null && C3490k.m7304r(objM3579J)) {
                        Object obj4 = methodHookParam.thisObject;
                        Activity activityM7263a2 = obj4 instanceof Activity ? (Activity) obj4 : null;
                        if (activityM7263a2 == null) {
                            C3460o c3460oCurrentActivity2 = WeChatApis.currentActivity();
                            activityM7263a2 = c3460oCurrentActivity2 != null ? c3460oCurrentActivity2.m7263a() : null;
                            if (activityM7263a2 == null) {
                                activityM7263a2 = null;
                            }
                        }
                        Object obj5 = methodHookParam.thisObject;
                        String[] strArr = {"T", "P", "S", "Q"};
                        int i9 = 0;
                        while (true) {
                            if (i9 >= 4) {
                                C3458m c3458mChatPage = WeChatApis.chatPage();
                                if (c3458mChatPage == null || (strM7258a = c3458mChatPage.m7258a()) == null) {
                                    strM7258a = HttpUrl.FRAGMENT_ENCODE_SET;
                                    if (obj5 != null) {
                                        Class<?> superclass = obj5.getClass();
                                        while (true) {
                                            if (superclass != null && !superclass.equals(Object.class)) {
                                                for (Field field : KavaReflector.declaredFields(superclass)) {
                                                    if (AbstractC1416l.m3825a(field.getType(), String.class)) {
                                                        Object field2 = KavaReflector.readField(field, obj5);
                                                        String str = field2 instanceof String ? (String) field2 : null;
                                                        if (str != null) {
                                                            String string = AbstractC3149m.m6703R0(str).toString();
                                                            if (!((AbstractC1416l.m3825a(string, "filehelper") || AbstractC3156t.m6733W(string, "@chatroom", false) || AbstractC3156t.m6733W(string, "@im.chatroom", false) || AbstractC3156t.m6733W(string, "@openim", false)) ? true : AbstractC6134c.m10905b(string))) {
                                                                str = null;
                                                            }
                                                            if (str != null) {
                                                                strM7258a = str;
                                                            }
                                                        } else {
                                                            continue;
                                                        }
                                                    }
                                                }
                                                superclass = superclass.getSuperclass();
                                            }
                                        }
                                    }
                                } else {
                                    if (!C3490k.m7305s(strM7258a)) {
                                        strM7258a = null;
                                    }
                                    if (strM7258a == null) {
                                    }
                                }
                            } else {
                                Object field3 = KavaReflector.readField(obj5, strArr[i9]);
                                String str2 = field3 instanceof String ? (String) field3 : null;
                                if (str2 != null) {
                                    if (!C3490k.m7305s(str2)) {
                                        str2 = null;
                                    }
                                    if (str2 != null) {
                                        strM7258a = str2;
                                    }
                                }
                                i9++;
                            }
                        }
                        if (AbstractC3149m.m6721t0(strM7258a)) {
                            C3490k.m7295N(activityM7263a2, "当前聊天不可用");
                            methodHookParam.setResult((Object) null);
                        } else {
                            C3488i c3488iM7310B2 = c3490k2.m7310B(objM3579J);
                            if (c3488iM7310B2 == null) {
                                C3490k.m7295N(activityM7263a2, "收藏语音文件不存在");
                                methodHookParam.setResult((Object) null);
                            } else if (activityM7263a2 == null || activityM7263a2.isFinishing()) {
                                methodHookParam.setResult((Object) null);
                            } else {
                                if (!set.contains(activityM7263a2)) {
                                    set.add(activityM7263a2);
                                    C5491y2.m9796P1(activityM7263a2, new C3482c(c3490k2, activityM7263a2, 1), new C3874d(1484979892, new C0768f(new C0035c(c3490k2, 26, c3488iM7310B2), 21, new C0467n0(c3490k2, c3488iM7310B2, strM7258a, activityM7263a2)), true));
                                }
                                methodHookParam.setResult((Object) null);
                            }
                        }
                        break;
                    }
                }
                break;
        }
    }
}
