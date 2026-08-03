package p078f9;

import ac.RunnableC0059l;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.lifecycle.C0114s;
import androidx.lifecycle.EnumC0107l;
import be.AbstractC0283h;
import de.robv.android.xposed.XC_MethodHook;
import gg.AbstractC1416l;
import gg.AbstractC1428x;
import gg.C1425u;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import lb.C2541c;
import lb.C2542d;
import lb.C2547i;
import okhttp3.HttpUrl;
import p036c9.C0416a1;
import p036c9.C0443h0;
import p036c9.C0467n0;
import p036c9.C0479q0;
import p036c9.C0482r0;
import p036c9.RunnableC0476p1;
import p068eh.AbstractC0921a;
import p080fb.AbstractC1184v0;
import p099h.Hchat.hooks.api.core.WeChatApis;
import p099h.Hchat.hooks.api.model.WeChatMessage;
import p099h.Hchat.utils.KavaReflector;
import p153k8.C2355s;
import p218og.AbstractC3149m;
import p218og.AbstractC3156t;
import p242q8.C3458m;
import p242q8.C3460o;
import p244qb.C3488i;
import p244qb.C3490k;
import p258r8.C3742g;
import p266s0.C3874d;
import p276sf.C3959f;
import p300ub.AbstractC4302b;
import p343x6.AbstractC5700d;
import p357y1.C5868c1;
import p357y1.C5928r1;
import tf.AbstractC4165l;

/* JADX INFO: renamed from: f9.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1093d extends XC_MethodHook {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3509a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f3510b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f3511c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C1093d(boolean z9, Object obj, int i9) {
        this.f3509a = i9;
        this.f3510b = z9;
        this.f3511c = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:186:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x051a A[PHI: r0
  0x051a: PHI (r0v6 android.content.Context) = (r0v5 android.content.Context), (r0v15 android.content.Context) binds: [B:320:0x0509, B:326:0x0518] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0550  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x05af  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x05d5  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x05ea  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x0606  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x0608  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x060c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        Object[] objArr;
        Object obj;
        char c10;
        long j3;
        Object objInvoke;
        Object field;
        C1097h c1097hM1182t;
        int groupId;
        int i9;
        int i10;
        int identifier;
        int i11;
        Map map;
        Object objInvokeMethod;
        boolean z9;
        Object next;
        int i12;
        Object[] objArr2;
        Object objM8366C0;
        Object tag;
        Object objM5966K;
        Object c3959f;
        int groupId2;
        char c11;
        char c12;
        int identifier2;
        int i13;
        MenuItem menuItem;
        Object next2;
        Iterator it;
        Object[] objArr3;
        Object obj2;
        Object tag2;
        int i14 = this.f3509a;
        methodHookParam.getClass();
        switch (i14) {
            case 0:
                if (this.f3510b) {
                    C1094e c1094e = (C1094e) this.f3511c;
                    ConcurrentHashMap concurrentHashMap = c1094e.f3516e;
                    Map map2 = c1094e.f3515d;
                    map2.clear();
                    concurrentHashMap.clear();
                    C3742g c3742g = c1094e.f3512a;
                    int i15 = 0;
                    if (AbstractC4302b.m8640c(c3742g.f12143a, "Hchat_edit_message_config").getBoolean("edit_message_enable", false) && (objArr = methodHookParam.args) != null && objArr.length >= 3 && (obj = objArr[0]) != null) {
                        Object objM8366C02 = AbstractC4165l.m8366C0(1, objArr);
                        View view = objM8366C02 instanceof View ? (View) objM8366C02 : null;
                        if (view != null) {
                            Object tag3 = view.getTag();
                            if (tag3 instanceof View) {
                                tag3 = ((View) tag3).getTag();
                            }
                            long j4 = 0;
                            if (tag3 == null) {
                                c10 = 1;
                                j3 = 0;
                            } else {
                                c10 = 1;
                                if (!AbstractC0921a.m2263z("com.tencent.mm.storage.", tag3, false) || c1094e.m2818c(tag3) <= 0 || c1094e.m2818c(tag3) <= 0) {
                                    for (Class<?> superclass = tag3.getClass(); superclass != null && !superclass.equals(Object.class); superclass = superclass.getSuperclass()) {
                                        for (Field field2 : KavaReflector.declaredFields(superclass)) {
                                            j3 = j4;
                                            if (!KavaReflector.isStatic(field2)) {
                                                Class<?> type = field2.getType();
                                                type.getClass();
                                                if (AbstractC3156t.m6740d0(type.getName(), "com.tencent.mm.storage.", false) && (field = KavaReflector.readField(field2, tag3)) != null && c1094e.m2818c(field) > j3) {
                                                    tag3 = field;
                                                }
                                            }
                                            j4 = j3;
                                        }
                                    }
                                    j3 = j4;
                                    for (Class<?> superclass2 = tag3.getClass(); superclass2 != null && !superclass2.equals(Object.class); superclass2 = superclass2.getSuperclass()) {
                                        for (Method method : KavaReflector.declaredMethods(superclass2)) {
                                            if (!KavaReflector.isStatic(method)) {
                                                Class<?>[] parameterTypes = method.getParameterTypes();
                                                parameterTypes.getClass();
                                                if (parameterTypes.length == 0) {
                                                    Class<?> returnType = method.getReturnType();
                                                    returnType.getClass();
                                                    if (AbstractC3156t.m6740d0(returnType.getName(), "com.tencent.mm.storage.", false) && (objInvoke = KavaReflector.invoke(method, tag3, new Object[0])) != null && c1094e.m2818c(objInvoke) > j3) {
                                                        tag3 = objInvoke;
                                                    }
                                                } else {
                                                    continue;
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    j3 = 0;
                                }
                                if (tag3 == null && (c1097hM1182t = AbstractC0283h.m1182t(c3742g.f12143a, c1094e.m2818c(tag3))) != null) {
                                    long j5 = c1097hM1182t.f3529a;
                                    if (j5 > j3) {
                                        Object objInvokeMethod2 = KavaReflector.invokeMethod(obj, "size", new Object[0]);
                                        Number number = objInvokeMethod2 instanceof Number ? (Number) objInvokeMethod2 : null;
                                        int iIntValue = number != null ? number.intValue() : 0;
                                        int i16 = 0;
                                        while (true) {
                                            if (i16 >= iIntValue) {
                                                groupId = i15;
                                            } else {
                                                Object objInvokeMethod3 = KavaReflector.invokeMethod(obj, "getItem", Integer.valueOf(i16));
                                                MenuItem menuItem2 = objInvokeMethod3 instanceof MenuItem ? (MenuItem) objInvokeMethod3 : null;
                                                if (menuItem2 != null) {
                                                    groupId = menuItem2.getGroupId();
                                                } else {
                                                    i16++;
                                                    i15 = i15;
                                                }
                                            }
                                        }
                                        Integer numValueOf = Integer.valueOf(i15);
                                        MenuItem menuItemM2815a = C1094e.m2815a(obj);
                                        if (menuItemM2815a != null) {
                                            map = map2;
                                            i9 = i15;
                                        } else {
                                            Context context = view.getContext();
                                            int i17 = 2;
                                            if (context == null) {
                                                C3460o c3460oCurrentActivity = WeChatApis.currentActivity();
                                                context = c3460oCurrentActivity != null ? c3460oCurrentActivity.m7263a() : null;
                                                if (context != null) {
                                                    Resources resources = context.getResources();
                                                    String packageName = context.getPackageName();
                                                    i9 = i15;
                                                    String[] strArr = {"raw", "drawable"};
                                                    int i18 = i9;
                                                    while (true) {
                                                        i10 = i17;
                                                        if (i18 < i17) {
                                                            identifier = resources.getIdentifier("icons_filled_edit_photo_pencil", strArr[i18], packageName);
                                                            if (identifier == 0) {
                                                                i18++;
                                                                i17 = i10;
                                                            }
                                                        }
                                                    }
                                                    if (identifier == 0) {
                                                        Iterator<T> it2 = KavaReflector.declaredMethods(obj.getClass()).iterator();
                                                        while (true) {
                                                            if (it2.hasNext()) {
                                                                next = it2.next();
                                                                Method method2 = (Method) next;
                                                                Class<?>[] parameterTypes2 = method2.getParameterTypes();
                                                                i11 = groupId;
                                                                if (AbstractC1416l.m3825a(method2.getName(), "c") && parameterTypes2.length == 5) {
                                                                    Class<?> cls = parameterTypes2[i9];
                                                                    Class cls2 = Integer.TYPE;
                                                                    if (AbstractC1416l.m3825a(cls, cls2) && AbstractC1416l.m3825a(parameterTypes2[c10], cls2) && AbstractC1416l.m3825a(parameterTypes2[i10], cls2)) {
                                                                        map = map2;
                                                                        if (!parameterTypes2[3].isAssignableFrom(String.class) || !AbstractC1416l.m3825a(parameterTypes2[4], cls2)) {
                                                                        }
                                                                    }
                                                                } else {
                                                                    map = map2;
                                                                }
                                                                groupId = i11;
                                                                map2 = map;
                                                            } else {
                                                                i11 = groupId;
                                                                map = map2;
                                                                next = null;
                                                            }
                                                        }
                                                        if (KavaReflector.invokeSuccessfully((Method) next, obj, Integer.valueOf(i11), 1212368196, numValueOf, "修改[H]", Integer.valueOf(identifier))) {
                                                            menuItemM2815a = C1094e.m2815a(obj);
                                                        }
                                                    } else {
                                                        i11 = groupId;
                                                        map = map2;
                                                    }
                                                    objInvokeMethod = KavaReflector.invokeMethod(obj, "add", Integer.valueOf(i11), 1212368196, numValueOf, "修改[H]");
                                                    if (objInvokeMethod == null) {
                                                        objInvokeMethod = KavaReflector.invokeMethod(obj, "add", Integer.valueOf(i11), 1212368196, numValueOf, "修改[H]");
                                                    }
                                                    z9 = objInvokeMethod instanceof MenuItem;
                                                    if (!z9 && identifier != 0) {
                                                        try {
                                                            ((MenuItem) objInvokeMethod).setIcon(identifier);
                                                            break;
                                                        } catch (Throwable unused) {
                                                        }
                                                        menuItemM2815a = (MenuItem) objInvokeMethod;
                                                    } else if (!z9) {
                                                        menuItemM2815a = (MenuItem) objInvokeMethod;
                                                    } else if (objInvokeMethod != null) {
                                                        menuItemM2815a = C1094e.m2815a(obj);
                                                    } else {
                                                        Object objInvokeMethod4 = KavaReflector.invokeMethod(obj, "f", 1212368196, "修改[H]");
                                                        if (objInvokeMethod4 == null) {
                                                            objInvokeMethod4 = KavaReflector.invokeMethod(obj, "f", 1212368196, "修改[H]");
                                                        }
                                                        menuItemM2815a = objInvokeMethod4 instanceof MenuItem ? (MenuItem) objInvokeMethod4 : null;
                                                        if (menuItemM2815a == null) {
                                                            menuItemM2815a = C1094e.m2815a(obj);
                                                        }
                                                    }
                                                } else {
                                                    i10 = 2;
                                                    i9 = i15;
                                                }
                                                identifier = i9;
                                                if (identifier == 0) {
                                                }
                                                objInvokeMethod = KavaReflector.invokeMethod(obj, "add", Integer.valueOf(i11), 1212368196, numValueOf, "修改[H]");
                                                if (objInvokeMethod == null) {
                                                }
                                                z9 = objInvokeMethod instanceof MenuItem;
                                                if (!z9) {
                                                    if (!z9) {
                                                    }
                                                }
                                            }
                                        }
                                        if (menuItemM2815a != null) {
                                            C1092c c1092c = new C1092c(tag3, j5);
                                            map.getClass();
                                            map.put(menuItemM2815a, c1092c);
                                            concurrentHashMap.put(Integer.valueOf(menuItemM2815a.getGroupId()), c1092c);
                                            for (Class<?> superclass3 = obj.getClass(); superclass3 != null && !superclass3.equals(Object.class); superclass3 = superclass3.getSuperclass()) {
                                                for (Field field3 : KavaReflector.declaredFields(superclass3)) {
                                                    if (List.class.isAssignableFrom(field3.getType())) {
                                                        Object field4 = KavaReflector.readField(field3, obj);
                                                        List list = AbstractC1428x.m3840e(field4) ? (List) field4 : null;
                                                        if (list != null) {
                                                            Iterator it3 = list.iterator();
                                                            int i19 = i9;
                                                            while (true) {
                                                                i12 = -1;
                                                                if (it3.hasNext()) {
                                                                    Object next3 = it3.next();
                                                                    if (next3 != menuItemM2815a) {
                                                                        MenuItem menuItem3 = next3 instanceof MenuItem ? (MenuItem) next3 : null;
                                                                        if (menuItem3 != null && menuItem3.getItemId() == 1212368196) {
                                                                        }
                                                                        i19++;
                                                                    }
                                                                } else {
                                                                    i19 = -1;
                                                                }
                                                            }
                                                            if (i19 >= 0) {
                                                                Object objRemove = list.remove(i19);
                                                                Iterator it4 = list.iterator();
                                                                int i20 = i9;
                                                                while (true) {
                                                                    if (it4.hasNext()) {
                                                                        Object next4 = it4.next();
                                                                        MenuItem menuItem4 = next4 instanceof MenuItem ? (MenuItem) next4 : null;
                                                                        if (menuItem4 == null || menuItem4.getItemId() != 1212368471) {
                                                                            i20++;
                                                                        }
                                                                    } else {
                                                                        i20 = -1;
                                                                    }
                                                                }
                                                                Iterator it5 = list.iterator();
                                                                int i21 = i9;
                                                                while (true) {
                                                                    if (it5.hasNext()) {
                                                                        Object next5 = it5.next();
                                                                        MenuItem menuItem5 = next5 instanceof MenuItem ? (MenuItem) next5 : null;
                                                                        if (menuItem5 == null || menuItem5.getItemId() != 1212371536) {
                                                                            i21++;
                                                                        } else {
                                                                            i12 = i21;
                                                                        }
                                                                    }
                                                                }
                                                                int i22 = i20 >= 0 ? i20 + 1 : i12 >= 0 ? i12 + 1 : i9;
                                                                int size = list.size();
                                                                if (i22 > size) {
                                                                    i22 = size;
                                                                }
                                                                list.add(i22, objRemove);
                                                                break;
                                                            }
                                                        } else {
                                                            continue;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            tag3 = null;
                            if (tag3 == null) {
                            }
                        }
                    }
                }
                break;
            case 1:
                if (this.f3510b) {
                    C2547i c2547i = (C2547i) this.f3511c;
                    ConcurrentHashMap concurrentHashMap2 = c2547i.f8270s;
                    Map map3 = c2547i.f8269r;
                    map3.clear();
                    concurrentHashMap2.clear();
                    int i23 = 0;
                    if (AbstractC4302b.m8640c(c2547i.f8252a.f12143a, "Hchat_swipe_quote_config").getBoolean("repeat_menu_enable", false) && (objArr2 = methodHookParam.args) != null && (objM8366C0 = AbstractC4165l.m8366C0(0, objArr2)) != null) {
                        char c13 = 1;
                        Object objM8366C03 = AbstractC4165l.m8366C0(1, objArr2);
                        View view2 = objM8366C03 instanceof View ? (View) objM8366C03 : null;
                        if (view2 != null && (tag = view2.getTag()) != null && (objM5966K = C2547i.m5966K(tag)) != null) {
                            long jM5976x = C2547i.m5976x(objM5966K);
                            C3458m c3458mChatPage = WeChatApis.chatPage();
                            String strM7258a = c3458mChatPage != null ? c3458mChatPage.m7258a() : null;
                            if (strM7258a == null) {
                                strM7258a = HttpUrl.FRAGMENT_ENCODE_SET;
                            }
                            if (jM5976x > 0 && !AbstractC3149m.m6721t0(strM7258a)) {
                                C2541c c2541c = new C2541c(jM5976x, strM7258a, objM5966K);
                                try {
                                    c3959f = c2547i.m5998w(jM5976x, strM7258a, objM5966K);
                                    if (c3959f == null) {
                                        C2355s c2355sMessageStore = WeChatApis.messageStore();
                                        c3959f = c2355sMessageStore != null ? c2355sMessageStore.m5661c(jM5976x) : null;
                                        break;
                                    }
                                } catch (Throwable th2) {
                                    c3959f = new C3959f(th2);
                                }
                                if (c3959f instanceof C3959f) {
                                    c3959f = null;
                                }
                                WeChatMessage weChatMessage = (WeChatMessage) c3959f;
                                if (weChatMessage != null && !weChatMessage.isRedPacket() && !weChatMessage.isTransfer()) {
                                    int i24 = weChatMessage.type;
                                    if (i24 > 0) {
                                        int i25 = i24 & 255;
                                        int i26 = 65535 & i24;
                                        if ((i24 >>> 16) != 0) {
                                            if (i26 == 10000 || i26 == 10002) {
                                                i24 = i26;
                                            } else if (i25 != 0 && i26 == i25) {
                                                i24 = i25;
                                            }
                                        }
                                    }
                                    if (weChatMessage.isQuote() || weChatMessage.isVoice() || AbstractC1184v0.m3215y(weChatMessage) || weChatMessage.isText() || weChatMessage.isShareCard() || weChatMessage.isImage() || weChatMessage.isEmoji() || weChatMessage.isLocation() || weChatMessage.isVideo() || i24 == 62) {
                                        Object objInvokeMethod5 = KavaReflector.invokeMethod(objM8366C0, "size", new Object[0]);
                                        Number number2 = objInvokeMethod5 instanceof Number ? (Number) objInvokeMethod5 : null;
                                        int iIntValue2 = number2 != null ? number2.intValue() : 0;
                                        int i27 = 0;
                                        while (true) {
                                            if (i27 >= iIntValue2) {
                                                groupId2 = 0;
                                            } else {
                                                Object objInvokeMethod6 = KavaReflector.invokeMethod(objM8366C0, "getItem", Integer.valueOf(i27));
                                                MenuItem menuItem6 = objInvokeMethod6 instanceof MenuItem ? (MenuItem) objInvokeMethod6 : null;
                                                if (menuItem6 != null) {
                                                    groupId2 = menuItem6.getGroupId();
                                                } else {
                                                    i27++;
                                                }
                                            }
                                        }
                                        Context context2 = view2.getContext();
                                        context2.getClass();
                                        C2542d c2542d = new C2542d(context2);
                                        MenuItem menuItemM5971f = C2547i.m5971f(objM8366C0);
                                        if (menuItemM5971f == null) {
                                            Resources resources2 = view2.getContext().getResources();
                                            String packageName2 = view2.getContext().getPackageName();
                                            String[] strArr2 = {"raw", "drawable"};
                                            int i28 = 0;
                                            while (true) {
                                                c11 = 2;
                                                c12 = c13;
                                                if (i28 >= 2) {
                                                    identifier2 = i23;
                                                    i13 = identifier2;
                                                } else {
                                                    i13 = i23;
                                                    identifier2 = resources2.getIdentifier("icons_filled_edit_photo_pencil", strArr2[i28], packageName2);
                                                    if (identifier2 == 0) {
                                                        i28++;
                                                        c13 = c12;
                                                        i23 = i13;
                                                    }
                                                }
                                            }
                                            if (identifier2 != 0) {
                                                Iterator it6 = KavaReflector.declaredMethods(objM8366C0.getClass()).iterator();
                                                while (true) {
                                                    if (it6.hasNext()) {
                                                        next2 = it6.next();
                                                        Method method3 = (Method) next2;
                                                        char c14 = c11;
                                                        Class<?>[] parameterTypes3 = method3.getParameterTypes();
                                                        if (AbstractC1416l.m3825a(method3.getName(), "c") && parameterTypes3.length == 5) {
                                                            Class<?> cls3 = parameterTypes3[i13];
                                                            Class cls4 = Integer.TYPE;
                                                            if (AbstractC1416l.m3825a(cls3, cls4) && AbstractC1416l.m3825a(parameterTypes3[c12], cls4) && AbstractC1416l.m3825a(parameterTypes3[c14], cls4)) {
                                                                it = it6;
                                                                if (!parameterTypes3[3].isAssignableFrom(String.class) || !AbstractC1416l.m3825a(parameterTypes3[4], cls4)) {
                                                                }
                                                            }
                                                        } else {
                                                            it = it6;
                                                        }
                                                        it6 = it;
                                                        c11 = c14;
                                                    } else {
                                                        next2 = null;
                                                    }
                                                }
                                                if (KavaReflector.invokeSuccessfully((Method) next2, objM8366C0, Integer.valueOf(groupId2), 1212371536, 0, "复读[H]", Integer.valueOf(identifier2))) {
                                                    menuItemM5971f = C2547i.m5971f(objM8366C0);
                                                    if (menuItemM5971f != null) {
                                                        C2547i.m5969a(objM8366C0, menuItemM5971f, c2542d);
                                                    }
                                                    menuItem = null;
                                                } else {
                                                    Object objInvokeMethod7 = KavaReflector.invokeMethod(objM8366C0, "add", Integer.valueOf(groupId2), 1212371536, 0, "复读[H]");
                                                    if (objInvokeMethod7 == null) {
                                                        objInvokeMethod7 = KavaReflector.invokeMethod(objM8366C0, "add", Integer.valueOf(groupId2), 1212371536, 0, "复读[H]");
                                                    }
                                                    if (objInvokeMethod7 instanceof MenuItem) {
                                                        menuItem = (MenuItem) objInvokeMethod7;
                                                        C2547i.m5969a(objM8366C0, menuItem, c2542d);
                                                    } else {
                                                        if (objInvokeMethod7 != null) {
                                                            menuItemM5971f = C2547i.m5971f(objM8366C0);
                                                            if (menuItemM5971f != null) {
                                                                C2547i.m5969a(objM8366C0, menuItemM5971f, c2542d);
                                                            }
                                                        } else {
                                                            Object objInvokeMethod8 = KavaReflector.invokeMethod(objM8366C0, "f", 1212371536, "复读[H]");
                                                            if (objInvokeMethod8 == null) {
                                                                objInvokeMethod8 = KavaReflector.invokeMethod(objM8366C0, "f", 1212371536, "复读[H]");
                                                            }
                                                            MenuItem menuItemM5971f2 = objInvokeMethod8 instanceof MenuItem ? (MenuItem) objInvokeMethod8 : null;
                                                            if (menuItemM5971f2 == null) {
                                                                menuItemM5971f2 = C2547i.m5971f(objM8366C0);
                                                            }
                                                            if (menuItemM5971f2 != null) {
                                                                C2547i.m5969a(objM8366C0, menuItemM5971f2, c2542d);
                                                                menuItem = menuItemM5971f2;
                                                            }
                                                        }
                                                        menuItem = null;
                                                    }
                                                }
                                            }
                                            if (menuItem == null) {
                                                map3.getClass();
                                                map3.put(menuItem, c2541c);
                                                concurrentHashMap2.put(Integer.valueOf(menuItem.getGroupId()), c2541c);
                                            }
                                        } else {
                                            C2547i.m5969a(objM8366C0, menuItemM5971f, c2542d);
                                        }
                                        menuItem = menuItemM5971f;
                                        if (menuItem == null) {
                                        }
                                    }
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            default:
                if (this.f3510b) {
                    C3490k c3490k = (C3490k) this.f3511c;
                    if (c3490k.m7330p()) {
                        int iIntValue3 = 0;
                        boolean z10 = c3490k.m7321O("voice_forward_chat_forward_enable") && !c3490k.f11333d.getBoolean("message_forward_enable", false);
                        boolean zM7321O = c3490k.m7321O("voice_forward_chat_save_enable");
                        if ((z10 || zM7321O) && (objArr3 = methodHookParam.args) != null && objArr3.length >= 3 && (obj2 = objArr3[0]) != null) {
                            Set setNewSetFromMap = Collections.newSetFromMap(new WeakHashMap());
                            setNewSetFromMap.getClass();
                            Object objM7311C = c3490k.m7311C(0, objArr3, setNewSetFromMap);
                            if (objM7311C != null && C3490k.m7307u(objM7311C)) {
                                Object objM8366C04 = AbstractC4165l.m8366C0(1, objArr3);
                                View view3 = objM8366C04 instanceof View ? (View) objM8366C04 : null;
                                if (view3 != null && (tag2 = view3.getTag()) != null) {
                                    String[] strArr3 = {"c", "d"};
                                    int i29 = 0;
                                    while (true) {
                                        if (i29 < 2) {
                                            Object objInvokeMethod9 = KavaReflector.invokeMethod(tag2, strArr3[i29], new Object[0]);
                                            if (objInvokeMethod9 instanceof Number) {
                                                iIntValue3 = ((Number) objInvokeMethod9).intValue();
                                            } else {
                                                i29++;
                                            }
                                        }
                                    }
                                }
                                int i30 = iIntValue3;
                                Object objM8366C05 = AbstractC4165l.m8366C0(1, objArr3);
                                View view4 = objM8366C05 instanceof View ? (View) objM8366C05 : null;
                                if (z10) {
                                    C3490k.m7296a(obj2, view4, i30, 1212372550, "转发[H]", "icons_filled_share");
                                }
                                if (zM7321O) {
                                    C3490k.m7296a(obj2, view4, i30, 1212372563, "保存[H]", "icons_filled_download");
                                }
                                break;
                            }
                        }
                    }
                }
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:142:0x020c A[PHI: r6
  0x020c: PHI (r6v20 android.app.Activity) = (r6v12 android.app.Activity), (r6v7 android.app.Activity) binds: [B:167:0x0272, B:141:0x020a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x02b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        Object[] objArr;
        MenuItem menuItem;
        Activity activity;
        Object next;
        C1097h c1097hM1182t;
        MenuItem menuItem2;
        Object[] objArr2;
        Object next2;
        int i9 = this.f3509a;
        methodHookParam.getClass();
        switch (i9) {
            case 0:
                if (!this.f3510b) {
                    C1094e c1094e = (C1094e) this.f3511c;
                    ConcurrentHashMap concurrentHashMap = c1094e.f3516e;
                    Map map = c1094e.f3515d;
                    C3742g c3742g = c1094e.f3512a;
                    if (AbstractC4302b.m8640c(c3742g.f12143a, "Hchat_edit_message_config").getBoolean("edit_message_enable", false) && (objArr = methodHookParam.args) != null) {
                        int length = objArr.length;
                        int i10 = 0;
                        while (true) {
                            if (i10 < length) {
                                Object obj = objArr[i10];
                                menuItem = obj instanceof MenuItem ? (MenuItem) obj : null;
                                if (menuItem == null) {
                                    i10++;
                                }
                            } else {
                                menuItem = null;
                            }
                        }
                        if (menuItem != null && menuItem.getItemId() == 1212368196) {
                            Object obj2 = methodHookParam.thisObject;
                            C3460o c3460oCurrentActivity = WeChatApis.currentActivity();
                            Activity activityM7263a = c3460oCurrentActivity != null ? c3460oCurrentActivity.m7263a() : null;
                            if (activityM7263a == null || activityM7263a.isFinishing()) {
                                if (obj2 != null) {
                                    ConcurrentHashMap concurrentHashMap2 = c1094e.f3518g;
                                    Class<?> cls = obj2.getClass();
                                    Method method = (Method) concurrentHashMap2.get(cls);
                                    if (method == null) {
                                        Iterator<T> it = KavaReflector.declaredMethods(obj2.getClass()).iterator();
                                        while (true) {
                                            if (it.hasNext()) {
                                                next = it.next();
                                                Method method2 = (Method) next;
                                                Class<?>[] parameterTypes = method2.getParameterTypes();
                                                parameterTypes.getClass();
                                                if (parameterTypes.length != 0 || !Activity.class.isAssignableFrom(method2.getReturnType())) {
                                                }
                                            } else {
                                                next = null;
                                            }
                                        }
                                        method = (Method) next;
                                        if (method != null) {
                                            concurrentHashMap2.putIfAbsent(cls, method);
                                        } else {
                                            method = null;
                                        }
                                    }
                                    if (method != null) {
                                        Object objInvoke = KavaReflector.invoke(method, obj2, new Object[0]);
                                        activityM7263a = objInvoke instanceof Activity ? (Activity) objInvoke : null;
                                        if (activityM7263a != null && !activityM7263a.isFinishing()) {
                                            activity = activityM7263a;
                                        }
                                    }
                                }
                                activity = null;
                            }
                            C1092c c1092c = (C1092c) map.remove(menuItem);
                            if (c1092c == null) {
                                c1092c = (C1092c) concurrentHashMap.remove(Integer.valueOf(menuItem.getGroupId()));
                            }
                            C1092c c1092c2 = c1092c;
                            map.clear();
                            concurrentHashMap.clear();
                            if (c1092c2 != null) {
                                long j3 = c1092c2.f3507a;
                                Long lValueOf = Long.valueOf(j3);
                                if (j3 <= 0) {
                                    lValueOf = null;
                                }
                                c1097hM1182t = lValueOf != null ? AbstractC0283h.m1182t(c3742g.f12143a, lValueOf.longValue()) : null;
                            }
                            if (activity == null || c1092c2 == null || c1097hM1182t == null) {
                                C1094e.m2816d(activity, "消息不可修改");
                            } else {
                                C3874d c3874d = new C3874d(1119126588, new C0443h0(c1097hM1182t, new C0479q0(c1094e, c1097hM1182t, c1092c2, activity), new C0467n0(c1094e, c1097hM1182t, c1092c2, activity, 4), 3), true);
                                Window window = activity.getWindow();
                                View decorView = window != null ? window.getDecorView() : null;
                                ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
                                if (viewGroup != null) {
                                    C0416a1 c0416a1 = new C0416a1(1);
                                    AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                                    FrameLayout frameLayout = new FrameLayout(activity);
                                    frameLayout.setBackgroundColor(0);
                                    frameLayout.setClickable(true);
                                    frameLayout.setFocusable(true);
                                    frameLayout.setFocusableInTouchMode(true);
                                    frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                                    AbstractC5700d.m10251H(viewGroup, c0416a1, c0416a1, c0416a1, c0416a1);
                                    AbstractC5700d.m10251H(frameLayout, c0416a1, c0416a1, c0416a1, c0416a1);
                                    if (!c0416a1.f1198l) {
                                        c0416a1.f1195i.m7017F(Bundle.EMPTY);
                                        c0416a1.f1198l = true;
                                    }
                                    C0114s c0114s = c0416a1.f1194h;
                                    c0114s.m554c("setCurrentState");
                                    c0114s.m556e(EnumC0107l.f291i);
                                    c0114s.m554c("setCurrentState");
                                    c0114s.m556e(EnumC0107l.f292j);
                                    c0114s.m554c("setCurrentState");
                                    c0114s.m556e(EnumC0107l.f293k);
                                    C1425u c1425u = new C1425u();
                                    C0482r0 c0482r0 = new C0482r0(atomicBoolean, frameLayout, viewGroup, c0416a1, c1425u, 6);
                                    C5868c1 c5868c1 = new C5868c1(activity);
                                    AbstractC5700d.m10251H(c5868c1, c0416a1, c0416a1, c0416a1, c0416a1);
                                    c5868c1.setViewCompositionStrategy(C5928r1.f24042h);
                                    c5868c1.setContent(new C3874d(-1864497144, new C0479q0(c0416a1, activity, c3874d, c0482r0, 4), true));
                                    c1425u.f4738g = c5868c1;
                                    frameLayout.addView(c5868c1, new FrameLayout.LayoutParams(-1, -1));
                                    viewGroup.addView(frameLayout);
                                    frameLayout.requestFocus();
                                }
                            }
                            break;
                        }
                    }
                }
                break;
            case 1:
                if (!this.f3510b) {
                    C2547i c2547i = (C2547i) this.f3511c;
                    ConcurrentHashMap concurrentHashMap3 = c2547i.f8270s;
                    Map map2 = c2547i.f8269r;
                    Object[] objArr3 = methodHookParam.args;
                    if (objArr3 != null) {
                        int length2 = objArr3.length;
                        int i11 = 0;
                        while (true) {
                            if (i11 < length2) {
                                Object obj3 = objArr3[i11];
                                menuItem2 = obj3 instanceof MenuItem ? (MenuItem) obj3 : null;
                                if (menuItem2 == null) {
                                    i11++;
                                }
                            } else {
                                menuItem2 = null;
                            }
                        }
                        if (menuItem2 != null && menuItem2.getItemId() == 1212371536) {
                            C2541c c2541c = (C2541c) map2.remove(menuItem2);
                            if (c2541c == null) {
                                c2541c = (C2541c) concurrentHashMap3.remove(Integer.valueOf(menuItem2.getGroupId()));
                            }
                            map2.clear();
                            concurrentHashMap3.clear();
                            if (c2541c == null || !c2547i.m5980F(c2541c)) {
                                C3460o c3460oCurrentActivity2 = WeChatApis.currentActivity();
                                Context contextM7263a = c3460oCurrentActivity2 != null ? c3460oCurrentActivity2.m7263a() : null;
                                if (contextM7263a == null) {
                                    contextM7263a = c2547i.f8252a.f12143a;
                                }
                                c2547i.f8263l.post(new RunnableC0476p1(contextM7263a, 2));
                            }
                            break;
                        }
                    }
                }
                break;
            default:
                if (!this.f3510b) {
                    C3490k c3490k = (C3490k) this.f3511c;
                    if (c3490k.m7330p() && (objArr2 = methodHookParam.args) != null) {
                        Object objM8366C0 = AbstractC4165l.m8366C0(0, objArr2);
                        Activity activity2 = null;
                        MenuItem menuItem3 = objM8366C0 instanceof MenuItem ? (MenuItem) objM8366C0 : null;
                        if (menuItem3 != null) {
                            if (menuItem3.getItemId() == 1212372550 || menuItem3.getItemId() == 1212372563) {
                                if (menuItem3.getItemId() != 1212372550 || c3490k.m7321O("voice_forward_chat_forward_enable")) {
                                    if (menuItem3.getItemId() != 1212372563 || c3490k.m7321O("voice_forward_chat_save_enable")) {
                                        Set setNewSetFromMap = Collections.newSetFromMap(new WeakHashMap());
                                        setNewSetFromMap.getClass();
                                        Object objM7311C = c3490k.m7311C(0, objArr2, setNewSetFromMap);
                                        Object objM8366C02 = AbstractC4165l.m8366C0(1, objArr2);
                                        C3460o c3460oCurrentActivity3 = WeChatApis.currentActivity();
                                        Activity activityM7263a2 = c3460oCurrentActivity3 != null ? c3460oCurrentActivity3.m7263a() : null;
                                        if (activityM7263a2 != null && !activityM7263a2.isFinishing()) {
                                            activity2 = activityM7263a2;
                                        } else if (objM8366C02 != null) {
                                            ConcurrentHashMap concurrentHashMap4 = c3490k.f11340k;
                                            Class<?> cls2 = objM8366C02.getClass();
                                            Method method3 = (Method) concurrentHashMap4.get(cls2);
                                            if (method3 == null) {
                                                Iterator<T> it2 = KavaReflector.declaredMethods(objM8366C02.getClass()).iterator();
                                                while (true) {
                                                    if (it2.hasNext()) {
                                                        next2 = it2.next();
                                                        Method method4 = (Method) next2;
                                                        Class<?>[] parameterTypes2 = method4.getParameterTypes();
                                                        parameterTypes2.getClass();
                                                        if (parameterTypes2.length != 0 || !Activity.class.isAssignableFrom(method4.getReturnType())) {
                                                        }
                                                    } else {
                                                        next2 = null;
                                                    }
                                                }
                                                method3 = (Method) next2;
                                                if (method3 != null) {
                                                    concurrentHashMap4.put(cls2, method3);
                                                } else {
                                                    method3 = null;
                                                }
                                            }
                                            if (method3 != null) {
                                                Object objInvoke2 = KavaReflector.invoke(method3, objM8366C02, new Object[0]);
                                                Activity activity3 = objInvoke2 instanceof Activity ? (Activity) objInvoke2 : null;
                                                if (activity3 != null && !activity3.isFinishing()) {
                                                    activity2 = activity3;
                                                }
                                            }
                                        }
                                        if (objM7311C == null || activity2 == null) {
                                            C3490k.m7295N(activity2, "语音消息不可用");
                                            methodHookParam.setResult(Boolean.TRUE);
                                        } else {
                                            C3488i c3488iM7312D = c3490k.m7312D(objM7311C);
                                            if (c3488iM7312D != null) {
                                                if (menuItem3.getItemId() == 1212372563) {
                                                    new Thread(new RunnableC0059l(c3490k, activity2, c3488iM7312D, 29), "Hchat-VoiceSave").start();
                                                } else {
                                                    c3490k.m7318J(activity2, c3488iM7312D);
                                                }
                                                methodHookParam.setResult(Boolean.TRUE);
                                            } else {
                                                C3490k.m7295N(activity2, "语音文件不存在");
                                                methodHookParam.setResult(Boolean.TRUE);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                break;
        }
    }
}
