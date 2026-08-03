package p036c9;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import de.robv.android.xposed.XC_MethodHook;
import gg.AbstractC1416l;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Iterator;
import okhttp3.HttpUrl;
import p099h.Hchat.hooks.api.core.WeChatApis;
import p099h.Hchat.utils.KavaReflector;
import p211o9.C3090c;
import p218og.AbstractC3149m;
import p218og.AbstractC3156t;
import p242q8.C3458m;
import p258r8.C3742g;

/* JADX INFO: renamed from: c9.b2 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0421b2 extends XC_MethodHook {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1205a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C3742g f1206b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Method f1207c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0421b2(Method method, C3742g c3742g) {
        this.f1207c = method;
        this.f1206b = c3742g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        switch (this.f1205a) {
            case 0:
                methodHookParam.getClass();
                C0429d2 c0429d2 = C0429d2.f1235a;
                Object obj = methodHookParam.thisObject;
                Method method = this.f1207c;
                Context context = this.f1206b.f12143a;
                if (obj != null && method.getDeclaringClass().isInstance(obj) && C0429d2.f1251q != obj) {
                    C0429d2.f1251q = obj;
                    C0429d2.m1445y(context);
                    break;
                }
                break;
            default:
                super.afterHookedMethod(methodHookParam);
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0142 A[LOOP:0: B:10:0x0019->B:89:0x0142, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0077 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        String string;
        String string2;
        Context context;
        Object obj;
        switch (this.f1205a) {
            case 1:
                methodHookParam.getClass();
                Object[] objArr = methodHookParam.args;
                String str = HttpUrl.FRAGMENT_ENCODE_SET;
                if (objArr == null) {
                    string = null;
                } else {
                    for (Object obj2 : objArr) {
                        if (obj2 != null) {
                            if (obj2 instanceof CharSequence) {
                                string = obj2.toString();
                            } else {
                                String string3 = obj2.toString();
                                if (AbstractC3156t.m6740d0(string3, "weixin://weixinhongbao/hchat/group_leave_profile/", false)) {
                                    string = string3;
                                } else {
                                    for (Class<?> superclass = obj2.getClass(); superclass != null && !superclass.equals(Object.class); superclass = superclass.getSuperclass()) {
                                        Iterator<Field> it = KavaReflector.declaredFields(superclass).iterator();
                                        while (it.hasNext()) {
                                            Object field = KavaReflector.readField(it.next(), obj2);
                                            if (field != null) {
                                                String string4 = field.toString();
                                                if (AbstractC3156t.m6740d0(string4, "weixin://weixinhongbao/hchat/group_leave_profile/", false)) {
                                                    string = string4;
                                                }
                                            }
                                        }
                                    }
                                    string = HttpUrl.FRAGMENT_ENCODE_SET;
                                }
                            }
                            if (AbstractC3156t.m6740d0(string, "weixin://weixinhongbao/hchat/group_leave_profile/", false)) {
                            }
                        } else {
                            string = HttpUrl.FRAGMENT_ENCODE_SET;
                            if (AbstractC3156t.m6740d0(string, "weixin://weixinhongbao/hchat/group_leave_profile/", false)) {
                            }
                        }
                    }
                    string = null;
                }
                if (string != null) {
                    if (AbstractC3156t.m6740d0(string, "weixin://weixinhongbao/hchat/group_leave_profile/", false)) {
                        String strDecode = Uri.decode(string.substring(49));
                        if (strDecode == null) {
                            strDecode = HttpUrl.FRAGMENT_ENCODE_SET;
                        }
                        string2 = AbstractC3149m.m6703R0(strDecode).toString();
                    } else {
                        string2 = HttpUrl.FRAGMENT_ENCODE_SET;
                    }
                    if (!AbstractC3149m.m6721t0(string2)) {
                        Object[] objArr2 = methodHookParam.args;
                        if (objArr2 != null) {
                            int length = objArr2.length;
                            int i9 = 0;
                            while (true) {
                                if (i9 < length) {
                                    obj = objArr2[i9];
                                    if (!(obj instanceof View)) {
                                        i9++;
                                    }
                                } else {
                                    obj = null;
                                }
                            }
                            if (obj == null || (context = ((View) obj).getContext()) == null) {
                                context = this.f1206b.f12143a;
                            }
                        }
                        if (!AbstractC3149m.m6721t0(string2)) {
                            C3458m c3458mChatPage = WeChatApis.chatPage();
                            String strM7258a = c3458mChatPage != null ? c3458mChatPage.m7258a() : null;
                            if (strM7258a != null) {
                                str = strM7258a;
                            }
                            Intent intent = new Intent();
                            intent.setComponent(new ComponentName(context.getPackageName(), "com.tencent.mm.plugin.profile.ui.ContactInfoUI"));
                            intent.putExtra("Contact_User", string2);
                            if (AbstractC3156t.m6733W(str, "@chatroom", false) || AbstractC3156t.m6733W(str, "@im.chatroom", false)) {
                                intent.putExtra("Contact_ChatRoomId", str);
                                intent.putExtra("room_name", str);
                                intent.putExtra("Contact_Scene", 14);
                            } else {
                                intent.putExtra("Contact_Scene", 3);
                            }
                            if (!(context instanceof Activity)) {
                                intent.addFlags(268435456);
                            }
                            try {
                                context.startActivity(intent);
                                break;
                            } catch (Throwable unused) {
                            }
                        }
                        Method method = this.f1207c;
                        methodHookParam.setResult((AbstractC1416l.m3825a(method.getReturnType(), Boolean.TYPE) || AbstractC1416l.m3825a(method.getReturnType(), Boolean.class)) ? Boolean.TRUE : null);
                        break;
                    }
                }
                break;
            default:
                super.beforeHookedMethod(methodHookParam);
                break;
        }
    }

    public C0421b2(C3090c c3090c, C3742g c3742g, Method method) {
        this.f1206b = c3742g;
        this.f1207c = method;
    }
}
