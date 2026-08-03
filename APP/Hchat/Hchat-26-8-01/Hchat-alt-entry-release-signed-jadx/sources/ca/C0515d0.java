package ca;

import ac.RunnableC0059l;
import android.app.Activity;
import android.content.SharedPreferences;
import android.os.SystemClock;
import android.view.MenuItem;
import android.view.View;
import de.robv.android.xposed.XC_MethodHook;
import gg.AbstractC1428x;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p068eh.AbstractC0921a;
import p092g4.AbstractC1341a;
import p099h.Hchat.utils.KavaReflector;
import p109hb.C1697t;
import p153k8.AbstractC2338b;
import p218og.AbstractC3156t;
import p343x6.AbstractC5700d;
import tf.AbstractC4165l;

/* JADX INFO: renamed from: ca.d0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0515d0 extends XC_MethodHook {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1572a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0517e0 f1573b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0515d0(C0517e0 c0517e0, int i9) {
        this.f1572a = i9;
        this.f1573b = c0517e0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        Object[] objArr;
        Object objM8366C0;
        Object objInvoke;
        Object field;
        Integer numM1519i;
        MenuItem menuItemM1515a;
        int i9;
        Object[] objArr2;
        Object objM8366C02;
        Object[] objArr3;
        Object objM8366C03;
        switch (this.f1572a) {
            case 1:
                methodHookParam.getClass();
                C0517e0 c0517e0 = this.f1573b;
                c0517e0.f1585g.clear();
                ConcurrentHashMap concurrentHashMap = c0517e0.f1586h;
                concurrentHashMap.clear();
                if (!c0517e0.f1583e.getBoolean("message_forward_enable", false) || (objArr = methodHookParam.args) == null || (objM8366C0 = AbstractC4165l.m8366C0(0, objArr)) == null) {
                    return;
                }
                Object objM8366C04 = AbstractC4165l.m8366C0(1, objArr);
                View view = objM8366C04 instanceof View ? (View) objM8366C04 : null;
                if (view != null) {
                    Object tag = view.getTag();
                    if (tag instanceof View) {
                        tag = ((View) tag).getTag();
                    }
                    if (tag == null) {
                        tag = null;
                    } else if (!AbstractC0921a.m2263z("com.tencent.mm.storage.", tag, false) || c0517e0.m1524g(tag) <= 0) {
                        for (Class<?> superclass = tag.getClass(); superclass != null && !superclass.equals(Object.class); superclass = superclass.getSuperclass()) {
                            for (Field field2 : KavaReflector.declaredFields(superclass)) {
                                if (!KavaReflector.isStatic(field2)) {
                                    Class<?> type = field2.getType();
                                    type.getClass();
                                    if (AbstractC3156t.m6740d0(type.getName(), "com.tencent.mm.storage.", false) && (field = KavaReflector.readField(field2, tag)) != null && c0517e0.m1524g(field) > 0) {
                                        tag = field;
                                    }
                                }
                            }
                        }
                        for (Class<?> superclass2 = tag.getClass(); superclass2 != null && !superclass2.equals(Object.class); superclass2 = superclass2.getSuperclass()) {
                            for (Method method : KavaReflector.declaredMethods(superclass2)) {
                                if (!KavaReflector.isStatic(method)) {
                                    Class<?>[] parameterTypes = method.getParameterTypes();
                                    parameterTypes.getClass();
                                    if (parameterTypes.length == 0) {
                                        Class<?> returnType = method.getReturnType();
                                        returnType.getClass();
                                        if (AbstractC3156t.m6740d0(returnType.getName(), "com.tencent.mm.storage.", false) && (objInvoke = KavaReflector.invoke(method, tag, new Object[0])) != null && c0517e0.m1524g(objInvoke) > 0) {
                                            tag = objInvoke;
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                            }
                        }
                        tag = null;
                    }
                    if (tag == null || (numM1519i = C0517e0.m1519i(tag)) == null) {
                        return;
                    }
                    if (!C0517e0.f1578s.contains(Integer.valueOf(numM1519i.intValue())) || (menuItemM1515a = C0517e0.m1515a(objM8366C0, view, C0517e0.m1520m(objM8366C0), 1212368471)) == null) {
                        return;
                    }
                    C0511b0 c0511b0 = new C0511b0(tag);
                    Map map = c0517e0.f1585g;
                    map.getClass();
                    map.put(menuItemM1515a, c0511b0);
                    concurrentHashMap.put(Integer.valueOf(menuItemM1515a.getGroupId()), c0511b0);
                    for (Class<?> superclass3 = objM8366C0.getClass(); superclass3 != null && !superclass3.equals(Object.class); superclass3 = superclass3.getSuperclass()) {
                        for (Field field3 : KavaReflector.declaredFields(superclass3)) {
                            if (List.class.isAssignableFrom(field3.getType())) {
                                Object field4 = KavaReflector.readField(field3, objM8366C0);
                                List list = AbstractC1428x.m3840e(field4) ? (List) field4 : null;
                                if (list != null) {
                                    Iterator it = list.iterator();
                                    int i10 = 0;
                                    while (true) {
                                        i9 = -1;
                                        if (it.hasNext()) {
                                            Object next = it.next();
                                            if (next != menuItemM1515a) {
                                                MenuItem menuItem = next instanceof MenuItem ? (MenuItem) next : null;
                                                if (menuItem == null || menuItem.getItemId() != 1212368471) {
                                                    i10++;
                                                }
                                            }
                                        } else {
                                            i10 = -1;
                                        }
                                    }
                                    if (i10 >= 0) {
                                        Object objRemove = list.remove(i10);
                                        Iterator it2 = list.iterator();
                                        int i11 = 0;
                                        while (true) {
                                            if (it2.hasNext()) {
                                                Object next2 = it2.next();
                                                MenuItem menuItem2 = next2 instanceof MenuItem ? (MenuItem) next2 : null;
                                                if (menuItem2 == null || menuItem2.getItemId() != 1212371536) {
                                                    i11++;
                                                } else {
                                                    i9 = i11;
                                                }
                                            }
                                        }
                                        int i12 = i9 >= 0 ? i9 + 1 : 0;
                                        int size = list.size();
                                        if (i12 > size) {
                                            i12 = size;
                                        }
                                        list.add(i12, objRemove);
                                        return;
                                    }
                                } else {
                                    continue;
                                }
                            }
                        }
                    }
                    return;
                }
                return;
            case 2:
            default:
                super.afterHookedMethod(methodHookParam);
                return;
            case 3:
                methodHookParam.getClass();
                C0517e0 c0517e02 = this.f1573b;
                if (c0517e02.f1583e.getBoolean("message_forward_favorite_enable", false) && (objArr2 = methodHookParam.args) != null) {
                    Object objM8366C05 = AbstractC4165l.m8366C0(1, objArr2);
                    Object objM3579J = AbstractC1341a.m3579J(objM8366C05 instanceof View ? (View) objM8366C05 : null);
                    if (objM3579J == null && (objM3579J = AbstractC1341a.m3579J(objArr2)) == null && (objM3579J = AbstractC1341a.m3579J(methodHookParam.thisObject)) == null) {
                        return;
                    }
                    long jM3571B = AbstractC1341a.m3571B(objM3579J);
                    if (jM3571B > 0 && (objM8366C02 = AbstractC4165l.m8366C0(0, objArr2)) != null) {
                        Object objM8366C06 = AbstractC4165l.m8366C0(1, objArr2);
                        MenuItem menuItemM1515a2 = C0517e0.m1515a(objM8366C02, objM8366C06 instanceof View ? (View) objM8366C06 : null, C0517e0.m1520m(objM8366C02), 1212368449);
                        if (menuItemM1515a2 != null) {
                            Map map2 = c0517e02.f1587i;
                            map2.getClass();
                            synchronized (map2) {
                                if (!c0517e02.f1587i.containsKey(menuItemM1515a2)) {
                                    Map map3 = c0517e02.f1587i;
                                    map3.getClass();
                                    map3.put(menuItemM1515a2, Long.valueOf(jM3571B));
                                    c0517e02.f1588j = jM3571B;
                                }
                                break;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 4:
                methodHookParam.getClass();
                if (this.f1573b.f1583e.getBoolean("message_forward_multi_moments_enable", false)) {
                    List listM5564b = AbstractC2338b.m5564b(methodHookParam.thisObject);
                    ArrayList arrayList = new ArrayList();
                    Iterator it3 = listM5564b.iterator();
                    while (it3.hasNext()) {
                        Integer numM1519i2 = C0517e0.m1519i(it3.next());
                        if (numM1519i2 != null) {
                            arrayList.add(numM1519i2);
                        }
                    }
                    if (listM5564b.isEmpty() || arrayList.size() != listM5564b.size() || C0517e0.m1518h(arrayList) != null || (objArr3 = methodHookParam.args) == null || (objM8366C03 = AbstractC4165l.m8366C0(0, objArr3)) == null || KavaReflector.invokeMethod(objM8366C03, "findItem", 1212370256) != null) {
                        return;
                    }
                    Object objInvokeMethod = KavaReflector.invokeMethod(objM8366C03, "add", 0, 1212370256, 0, "转发到朋友圈[H]");
                    if (objInvokeMethod == null) {
                        objInvokeMethod = KavaReflector.invokeMethod(objM8366C03, "add", 0, 1212370256, 0, "转发到朋友圈[H]");
                    }
                    if (objInvokeMethod == null && KavaReflector.invokeMethod(objM8366C03, "f", 1212370256, "转发到朋友圈[H]") == null) {
                        KavaReflector.invokeMethod(objM8366C03, "f", 1212370256, "转发到朋友圈[H]");
                        return;
                    }
                    return;
                }
                return;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        Object[] objArr;
        MenuItem menuItem;
        MenuItem menuItem2;
        long jLongValue;
        switch (this.f1572a) {
            case 0:
                methodHookParam.getClass();
                C0517e0 c0517e0 = this.f1573b;
                SharedPreferences sharedPreferences = c0517e0.f1583e;
                ConcurrentHashMap concurrentHashMap = c0517e0.f1586h;
                Map map = c0517e0.f1585g;
                int i9 = 0;
                if (sharedPreferences.getBoolean("message_forward_enable", false) && (objArr = methodHookParam.args) != null) {
                    int length = objArr.length;
                    while (true) {
                        if (i9 < length) {
                            Object obj = objArr[i9];
                            menuItem = obj instanceof MenuItem ? (MenuItem) obj : null;
                            if (menuItem == null) {
                                i9++;
                            }
                        }
                    }
                    if (menuItem == null || menuItem.getItemId() != 1212368471) {
                        return;
                    }
                    C0511b0 c0511b0 = (C0511b0) map.remove(menuItem);
                    if (c0511b0 == null) {
                        c0511b0 = (C0511b0) concurrentHashMap.remove(Integer.valueOf(menuItem.getGroupId()));
                    }
                    map.clear();
                    concurrentHashMap.clear();
                    Activity activityM1516b = C0517e0.m1516b();
                    if (c0511b0 == null || activityM1516b == null) {
                        c0517e0.m1532r(activityM1516b, "消息不可转发");
                        return;
                    }
                    C1697t c1697tM10298y = AbstractC5700d.m10298y(c0511b0.f1563a);
                    if (c1697tM10298y == null) {
                        c0517e0.m1532r(activityM1516b, "该消息暂不支持转发");
                        return;
                    } else {
                        c0517e0.f1582d.post(new RunnableC0059l(activityM1516b, c0517e0, c1697tM10298y, 7));
                        return;
                    }
                }
                return;
            case 1:
            default:
                super.beforeHookedMethod(methodHookParam);
                return;
            case 2:
                methodHookParam.getClass();
                C0517e0 c0517e02 = this.f1573b;
                synchronized (c0517e02) {
                    try {
                        int i10 = 0;
                        if (c0517e02.f1583e.getBoolean("message_forward_favorite_enable", false)) {
                            Object[] objArr2 = methodHookParam.args;
                            if (objArr2 != null) {
                                int length2 = objArr2.length;
                                while (true) {
                                    if (i10 < length2) {
                                        Object obj2 = objArr2[i10];
                                        menuItem2 = obj2 instanceof MenuItem ? (MenuItem) obj2 : null;
                                        if (menuItem2 == null) {
                                            i10++;
                                        }
                                    } else {
                                        menuItem2 = null;
                                    }
                                }
                                if (menuItem2 != null) {
                                    if (menuItem2.getItemId() != 1212368449) {
                                        return;
                                    }
                                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                                    WeakReference weakReference = c0517e02.f1589k;
                                    if ((weakReference != null ? (MenuItem) weakReference.get() : null) != menuItem2 || jElapsedRealtime - c0517e02.f1590l >= 1500) {
                                        methodHookParam.setResult((Object) null);
                                        Activity activityM1516b2 = C0517e0.m1516b();
                                        if (activityM1516b2 != null) {
                                            Long l10 = (Long) c0517e02.f1587i.remove(menuItem2);
                                            if (l10 != null) {
                                                jLongValue = l10.longValue();
                                            } else {
                                                long j3 = c0517e02.f1588j;
                                                Long lValueOf = j3 > 0 ? Long.valueOf(j3) : null;
                                                jLongValue = lValueOf != null ? lValueOf.longValue() : AbstractC1341a.m3571B(AbstractC1341a.m3579J(methodHookParam.args));
                                            }
                                            c0517e02.f1587i.clear();
                                            c0517e02.f1588j = 0L;
                                            if (jLongValue <= 0) {
                                                c0517e02.m1532r(activityM1516b2, "当前收藏不可用");
                                                return;
                                            }
                                            c0517e02.f1589k = new WeakReference(menuItem2);
                                            c0517e02.f1590l = jElapsedRealtime;
                                            c0517e02.f1582d.post(new RunnableC0531r(activityM1516b2, c0517e02, jLongValue, 0));
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                            }
                            return;
                        }
                        return;
                    } finally {
                    }
                }
        }
    }
}
