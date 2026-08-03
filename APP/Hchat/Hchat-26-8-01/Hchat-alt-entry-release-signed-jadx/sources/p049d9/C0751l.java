package p049d9;

import android.app.Activity;
import android.app.Notification;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.ViewParent;
import android.widget.ImageView;
import bi.C0315c;
import de.robv.android.xposed.XC_MethodHook;
import gg.AbstractC1416l;
import gg.AbstractC1428x;
import gg.C1425u;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import ng.AbstractC3015m;
import ng.C3010h;
import ng.C3011i;
import okhttp3.HttpUrl;
import p000a.AbstractC0000a;
import p007a7.AbstractC0018a;
import p019b4.C0178b;
import p036c9.C0456k1;
import p054dg.C0795n;
import p063e9.C0846q;
import p068eh.AbstractC0921a;
import p096g8.C1368i;
import p099h.Hchat.hooks.api.core.WeChatApis;
import p099h.Hchat.hooks.api.model.WeChatContact;
import p099h.Hchat.utils.KavaReflector;
import p218og.AbstractC3149m;
import p258r8.C3742g;
import p276sf.C3958e;
import p276sf.C3959f;
import p300ub.AbstractC4302b;
import p304uf.C4329c;
import p332wb.C5491y2;
import p332wb.EnumC5092lv;
import tf.AbstractC4165l;
import tf.AbstractC4166m;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: d9.l */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0751l extends XC_MethodHook {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2238a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0752m f2239b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0751l(C0752m c0752m, int i9) {
        this.f2238a = i9;
        this.f2239b = c0752m;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0180  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        Bitmap bitmapM1948e;
        String str;
        Object c3959f;
        Activity activity;
        Object next;
        C1368i c1368iContacts;
        Object next2;
        Object c3959f2;
        switch (this.f2238a) {
            case 0:
                methodHookParam.getClass();
                Object[] objArr = methodHookParam.args;
                objArr.getClass();
                Object objM8366C0 = AbstractC4165l.m8366C0(1, objArr);
                String str2 = objM8366C0 instanceof String ? (String) objM8366C0 : null;
                if (str2 != null && !AbstractC3149m.m6721t0(str2)) {
                    C0752m c0752m = this.f2239b;
                    Map map = c0752m.f2244d;
                    map.getClass();
                    map.put(methodHookParam.thisObject, str2);
                    Map map2 = c0752m.f2245e;
                    map2.getClass();
                    Object obj = methodHookParam.thisObject;
                    Object[] objArr2 = methodHookParam.args;
                    objArr2.getClass();
                    map2.put(obj, AbstractC0018a.m256t(AbstractC4165l.m8366C0(0, objArr2)));
                    Map map3 = c0752m.f2246f;
                    map3.getClass();
                    Object obj2 = methodHookParam.thisObject;
                    Object[] objArr3 = methodHookParam.args;
                    objArr3.getClass();
                    map3.put(obj2, Float.valueOf(C0752m.m1937b(c0752m, objArr3, 2, 5)));
                    break;
                }
                break;
            case 2:
                methodHookParam.getClass();
                Object[] objArr4 = methodHookParam.args;
                objArr4.getClass();
                Object objM8366C02 = AbstractC4165l.m8366C0(0, objArr4);
                ImageView imageView = objM8366C02 instanceof ImageView ? (ImageView) objM8366C02 : null;
                if (imageView != null) {
                    Object[] objArr5 = methodHookParam.args;
                    objArr5.getClass();
                    Object objM8366C03 = AbstractC4165l.m8366C0(1, objArr5);
                    String str3 = objM8366C03 instanceof String ? (String) objM8366C03 : null;
                    if (str3 != null) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(imageView.getClass().getName());
                        ViewParent parent = imageView.getParent();
                        for (int i9 = 0; i9 < 8; i9++) {
                            if (parent != null) {
                                arrayList.add(parent.getClass().getName());
                                parent = parent.getParent();
                            }
                        }
                        arrayList.add(imageView.getContext().getClass().getName());
                        EnumC0740a enumC0740aM244h = AbstractC0018a.m244h(arrayList);
                        C0752m c0752m2 = this.f2239b;
                        if (C0752m.m1936a(c0752m2, str3, enumC0740aM244h) && (bitmapM1948e = AbstractC0754o.m1948e(c0752m2.f2241a.f12143a, str3)) != null) {
                            Object[] objArr6 = methodHookParam.args;
                            objArr6.getClass();
                            Object objM8366C04 = AbstractC4165l.m8366C0(2, objArr6);
                            Number number = objM8366C04 instanceof Number ? (Number) objM8366C04 : null;
                            imageView.setImageBitmap(C0752m.m1938c(c0752m2, bitmapM1948e, number != null ? Float.valueOf(number.floatValue()) : null));
                            methodHookParam.setResult((Object) null);
                        }
                    }
                }
                break;
            case 5:
                methodHookParam.getClass();
                C0752m c0752m3 = this.f2239b;
                Context context = c0752m3.f2241a.f12143a;
                if (AbstractC4302b.m8640c(context, "Hchat_custom_friend_avatar_config").getBoolean("enable", false) && AbstractC4302b.m8640c(context, "Hchat_custom_friend_avatar_config").getBoolean("conversation_menu", true)) {
                    Object[] objArr7 = methodHookParam.args;
                    objArr7.getClass();
                    Object objM8366C05 = AbstractC4165l.m8366C0(0, objArr7);
                    Object obj3 = null;
                    ContextMenu contextMenu = objM8366C05 instanceof ContextMenu ? (ContextMenu) objM8366C05 : null;
                    if (contextMenu != null) {
                        Object obj4 = methodHookParam.thisObject;
                        if (obj4 == null || (c1368iContacts = WeChatApis.contacts()) == null) {
                            str = null;
                        } else {
                            C3010h c3010h = new C3010h(new C3011i(AbstractC3015m.m6413W(AbstractC3015m.m6414X(new C3011i(AbstractC4166m.m8415m1(KavaReflector.declaredFields(obj4.getClass())), true, new C0178b(20)), new C0456k1(obj4, 5)), new C0178b(21)), true, new C0178b(22)));
                            while (true) {
                                if (c3010h.hasNext()) {
                                    next2 = c3010h.next();
                                    try {
                                        c3959f2 = Boolean.valueOf(c1368iContacts.m3705H((String) next2));
                                    } catch (Throwable th2) {
                                        c3959f2 = new C3959f(th2);
                                    }
                                    Boolean bool = Boolean.FALSE;
                                    boolean z9 = c3959f2 instanceof C3959f;
                                    Object obj5 = c3959f2;
                                    if (z9) {
                                        obj5 = bool;
                                    }
                                    if (((Boolean) obj5).booleanValue()) {
                                    }
                                } else {
                                    next2 = null;
                                }
                                break;
                            }
                            str = (String) next2;
                        }
                        if (str != null) {
                            contextMenu.removeItem(7999489);
                            try {
                                c3959f = Integer.valueOf(contextMenu.getItem(0).getGroupId());
                            } catch (Throwable th3) {
                                c3959f = new C3959f(th3);
                            }
                            boolean z10 = c3959f instanceof C3959f;
                            Object obj6 = c3959f;
                            if (z10) {
                                obj6 = 0;
                            }
                            MenuItem menuItemAdd = contextMenu.add(((Number) obj6).intValue(), 7999489, 0, "设置自定义头像");
                            menuItemAdd.getClass();
                            for (Class<?> superclass = contextMenu.getClass(); superclass != null && !superclass.equals(Object.class); superclass = superclass.getSuperclass()) {
                                for (Field field : KavaReflector.declaredFields(superclass)) {
                                    if (List.class.isAssignableFrom(field.getType())) {
                                        Object field2 = KavaReflector.readField(field, contextMenu);
                                        List list = AbstractC1428x.m3840e(field2) ? (List) field2 : null;
                                        if (list != null) {
                                            Iterator it = list.iterator();
                                            int i10 = 0;
                                            while (true) {
                                                if (it.hasNext()) {
                                                    Object next3 = it.next();
                                                    if (next3 != menuItemAdd) {
                                                        MenuItem menuItem = next3 instanceof MenuItem ? (MenuItem) next3 : null;
                                                        if (menuItem == null || menuItem.getItemId() != menuItemAdd.getItemId()) {
                                                            i10++;
                                                        }
                                                    }
                                                } else {
                                                    i10 = -1;
                                                }
                                            }
                                            if (i10 > 0) {
                                                try {
                                                    list.add(0, list.remove(i10));
                                                    break;
                                                } catch (Throwable unused) {
                                                }
                                            }
                                            if (i10 >= 0) {
                                                Object obj7 = methodHookParam.thisObject;
                                                Object objInvokeMethod = KavaReflector.invokeMethod(obj7, "getActivity", new Object[0]);
                                                activity = !(objInvokeMethod instanceof Activity) ? (Activity) objInvokeMethod : null;
                                                if (activity == null) {
                                                    Object objInvokeMethod2 = KavaReflector.invokeMethod(obj7, "getContext", new Object[0]);
                                                    activity = objInvokeMethod2 instanceof Activity ? (Activity) objInvokeMethod2 : null;
                                                    if (activity == null) {
                                                        C1425u c1425u = new C1425u();
                                                        c1425u.f4738g = obj7;
                                                        int i11 = 0;
                                                        while (true) {
                                                            if (i11 < 4) {
                                                                Object obj8 = c1425u.f4738g;
                                                                if (obj8 instanceof Activity) {
                                                                    activity = (Activity) obj8;
                                                                } else {
                                                                    if (obj8 instanceof ContextWrapper) {
                                                                        c1425u.f4738g = ((ContextWrapper) obj8).getBaseContext();
                                                                    } else {
                                                                        int i12 = 0;
                                                                        C3010h c3010h2 = new C3010h(AbstractC3015m.m6414X(new C0795n(new C0750k((Object) (obj8 != null ? obj8.getClass() : null), (InterfaceC5557c) (false ? 1 : 0), i12)), new C0746g(c1425u, i12)));
                                                                        while (true) {
                                                                            if (c3010h2.hasNext()) {
                                                                                next = c3010h2.next();
                                                                                if ((next instanceof Activity) || (next instanceof ContextWrapper)) {
                                                                                }
                                                                            } else {
                                                                                next = null;
                                                                            }
                                                                        }
                                                                        c1425u.f4738g = next;
                                                                    }
                                                                    i11++;
                                                                }
                                                            } else {
                                                                activity = null;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (activity == null) {
                                                    Map map4 = c0752m3.f2247g;
                                                    map4.getClass();
                                                    map4.put(menuItemAdd, new C3958e(activity, str));
                                                    Object obj9 = methodHookParam.thisObject;
                                                    if (obj9 != null) {
                                                        C3010h c3010h3 = new C3010h(AbstractC3015m.m6414X(AbstractC3015m.m6414X(new C3011i(AbstractC4166m.m8415m1(KavaReflector.declaredFields(obj9.getClass())), false, new C0178b(18)), new C0456k1(obj9, 4)), new C0178b(19)));
                                                        while (true) {
                                                            if (c3010h3.hasNext()) {
                                                                Object next4 = c3010h3.next();
                                                                Method method = (Method) next4;
                                                                if (AbstractC1416l.m3825a(method.getReturnType(), Void.TYPE) && AbstractC0921a.m2236A(method, false, "com.tencent.mm.ui.conversation.")) {
                                                                    obj3 = next4;
                                                                }
                                                            }
                                                        }
                                                        Method method2 = (Method) obj3;
                                                        if (method2 != null) {
                                                            c0752m3.m1942e(method2, new C0751l(c0752m3, 4));
                                                        }
                                                    }
                                                }
                                                break;
                                            }
                                        } else {
                                            continue;
                                        }
                                    }
                                }
                            }
                            Object obj72 = methodHookParam.thisObject;
                            Object objInvokeMethod3 = KavaReflector.invokeMethod(obj72, "getActivity", new Object[0]);
                            if (!(objInvokeMethod3 instanceof Activity)) {
                            }
                            if (activity == null) {
                            }
                            if (activity == null) {
                            }
                        }
                    }
                    break;
                }
                break;
            default:
                super.afterHookedMethod(methodHookParam);
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        Bitmap bitmapM1948e;
        Object c3959f;
        WeChatContact weChatContactM3725n;
        int i9 = this.f2238a;
        String str = HttpUrl.FRAGMENT_ENCODE_SET;
        C0752m c0752m = this.f2239b;
        switch (i9) {
            case 1:
                methodHookParam.getClass();
                String str2 = (String) c0752m.f2244d.get(methodHookParam.thisObject);
                if (str2 != null) {
                    str = str2;
                }
                if (!AbstractC3149m.m6721t0(str)) {
                    EnumC0740a enumC0740a = (EnumC0740a) c0752m.f2245e.get(methodHookParam.thisObject);
                    if (enumC0740a == null) {
                        enumC0740a = EnumC0740a.f2205l;
                    }
                    if (C0752m.m1936a(c0752m, str, enumC0740a) && (bitmapM1948e = AbstractC0754o.m1948e(c0752m.f2241a.f12143a, str)) != null) {
                        Object[] objArr = methodHookParam.args;
                        objArr.getClass();
                        Object objM8366C0 = AbstractC4165l.m8366C0(0, objArr);
                        Canvas canvas = objM8366C0 instanceof Canvas ? (Canvas) objM8366C0 : null;
                        if (canvas != null) {
                            Object obj = methodHookParam.thisObject;
                            Drawable drawable = obj instanceof Drawable ? (Drawable) obj : null;
                            if (drawable != null) {
                                canvas.drawBitmap(C0752m.m1938c(c0752m, bitmapM1948e, (Float) c0752m.f2246f.get(obj)), (Rect) null, drawable.getBounds(), C0752m.f2240j);
                                methodHookParam.setResult((Object) null);
                            }
                        }
                    }
                    break;
                }
                break;
            case 2:
            case 5:
            default:
                super.beforeHookedMethod(methodHookParam);
                break;
            case 3:
                methodHookParam.getClass();
                Object[] objArr2 = methodHookParam.args;
                objArr2.getClass();
                Object objM8366C02 = AbstractC4165l.m8366C0(0, objArr2);
                if (objM8366C02 != null) {
                    Object[] objArr3 = methodHookParam.args;
                    objArr3.getClass();
                    Object objM8366C03 = AbstractC4165l.m8366C0(2, objArr3);
                    String str3 = objM8366C03 instanceof String ? (String) objM8366C03 : null;
                    if (str3 != null && !AbstractC3149m.m6721t0(str3)) {
                        Map map = c0752m.f2244d;
                        map.getClass();
                        map.put(objM8366C02, str3);
                        Map map2 = c0752m.f2245e;
                        map2.getClass();
                        Object[] objArr4 = methodHookParam.args;
                        objArr4.getClass();
                        map2.put(objM8366C02, AbstractC0018a.m256t(AbstractC4165l.m8366C0(1, objArr4)));
                        Map map3 = c0752m.f2246f;
                        map3.getClass();
                        Object[] objArr5 = methodHookParam.args;
                        objArr5.getClass();
                        map3.put(objM8366C02, Float.valueOf(C0752m.m1937b(c0752m, objArr5, 3, 6)));
                        break;
                    }
                }
                break;
            case 4:
                methodHookParam.getClass();
                Object[] objArr6 = methodHookParam.args;
                objArr6.getClass();
                Object objM8366C04 = AbstractC4165l.m8366C0(0, objArr6);
                MenuItem menuItem = objM8366C04 instanceof MenuItem ? (MenuItem) objM8366C04 : null;
                if (menuItem != null && menuItem.getItemId() == 7999489) {
                    C0752m c0752m2 = this.f2239b;
                    C3958e c3958e = (C3958e) c0752m2.f2247g.remove(menuItem);
                    if (c3958e != null) {
                        methodHookParam.setResult((Object) null);
                        Activity activity = (Activity) c3958e.f12961g;
                        String str4 = (String) c3958e.f12962h;
                        C3742g c3742g = c0752m2.f2241a;
                        if (activity != null && AbstractC4302b.m8640c(c3742g.f12143a, "Hchat_custom_friend_avatar_config").getBoolean("enable", false)) {
                            boolean zM1947d = AbstractC0754o.m1947d(c3742g.f12143a, str4);
                            try {
                                C1368i c1368iContacts = WeChatApis.contacts();
                                c3959f = (c1368iContacts != null && (weChatContactM3725n = c1368iContacts.m3725n(str4)) != null) ? weChatContactM3725n.displayName() : null;
                            } catch (Throwable th2) {
                                c3959f = new C3959f(th2);
                            }
                            String str5 = (String) (c3959f instanceof C3959f ? null : c3959f);
                            if (str5 != null) {
                                str = str5;
                            }
                            String str6 = AbstractC3149m.m6721t0(str) ? str4 : str;
                            C4329c c4329cM7E = AbstractC0000a.m7E();
                            c4329cM7E.add(new C3958e("设置或更换头像", "从系统相册或文件中选择图片"));
                            if (zM1947d) {
                                c4329cM7E.add(new C3958e("恢复微信头像", "移除本地自定义头像"));
                            }
                            C5491y2.m9799Q1(activity, "设置自定义头像", str6, AbstractC0000a.m90t(c4329cM7E), new C0747h(activity, str4, zM1947d, c0752m2, 0), new C0315c(13), EnumC5092lv.f18824j);
                            break;
                        }
                    }
                }
                break;
            case 6:
                methodHookParam.getClass();
                C3742g c3742g2 = c0752m.f2241a;
                Context context = c3742g2.f12143a;
                if (AbstractC4302b.m8640c(context, "Hchat_custom_friend_avatar_config").getBoolean("enable", false) && AbstractC4302b.m8640c(context, "Hchat_custom_friend_avatar_config").getBoolean("scope_notifications", true)) {
                    Object[] objArr7 = methodHookParam.args;
                    objArr7.getClass();
                    Object obj2 = objArr7.length == 0 ? null : objArr7[objArr7.length - 1];
                    Notification notification = obj2 instanceof Notification ? (Notification) obj2 : null;
                    if (notification != null) {
                        AtomicBoolean atomicBoolean = C0846q.f2580a;
                        Bundle bundle = notification.extras;
                        String string = bundle != null ? bundle.getString("hchat_custom_notification_talker") : null;
                        if (string != null) {
                            str = string;
                        }
                        Bitmap bitmapM1948e2 = AbstractC0754o.m1948e(c3742g2.f12143a, str);
                        if (bitmapM1948e2 != null) {
                            Bitmap bitmapM1938c = C0752m.m1938c(c0752m, bitmapM1948e2, Float.valueOf(0.1f));
                            try {
                                notification.largeIcon = bitmapM1938c;
                                break;
                            } catch (Throwable unused) {
                            }
                            Icon iconCreateWithBitmap = Icon.createWithBitmap(bitmapM1938c);
                            iconCreateWithBitmap.getClass();
                            KavaReflector.writeField(notification, "mLargeIcon", iconCreateWithBitmap);
                            if (notification.extras == null) {
                                notification.extras = new Bundle();
                            }
                            notification.extras.putParcelable("android.largeIcon", iconCreateWithBitmap);
                        }
                    }
                    break;
                }
                break;
        }
    }
}
