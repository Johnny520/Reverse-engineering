package lb;

import android.app.Activity;
import android.content.SharedPreferences;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import ch.C0570e;
import de.robv.android.xposed.XC_MethodHook;
import gg.AbstractC1416l;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import okhttp3.HttpUrl;
import okio.C3193a;
import org.luckypray.dexkit.DexKitBridge;
import p000a.AbstractC0000a;
import p062e8.C0828b;
import p068eh.AbstractC0921a;
import p086fh.C1253k;
import p099h.Hchat.hooks.api.core.WeChatApis;
import p099h.Hchat.utils.KavaReflector;
import p115hh.C1730o;
import p218og.AbstractC3156t;
import p242q8.C3458m;
import p242q8.C3460o;
import p259r9.AbstractC3754e0;
import p276sf.C3959f;
import p300ub.AbstractC4302b;
import tf.AbstractC4165l;

/* JADX INFO: renamed from: lb.h */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2546h extends XC_MethodHook {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f8249a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2547i f8250b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C2546h(C2547i c2547i, int i9) {
        this.f8249a = i9;
        this.f8250b = c2547i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        Object obj;
        Object objM5972h;
        Object next;
        Object objM5975v;
        Object next2;
        Object objM5966K;
        switch (this.f8249a) {
            case 1:
                methodHookParam.getClass();
                C2547i c2547i = this.f8250b;
                Object[] objArr = methodHookParam.args;
                if (objArr != null && objArr.length >= 2 && (obj = objArr[0]) != null) {
                    Object obj2 = objArr[1];
                    View view = null;
                    Integer num = obj2 instanceof Integer ? (Integer) obj2 : null;
                    if (num != null) {
                        int iIntValue = num.intValue();
                        Object obj3 = methodHookParam.thisObject;
                        if (obj3 != null) {
                            ConcurrentHashMap concurrentHashMap = c2547i.f8254c;
                            if (iIntValue < 0) {
                                objM5972h = null;
                            } else {
                                Method method = (Method) concurrentHashMap.get(obj3.getClass());
                                if (method != null) {
                                    objM5972h = KavaReflector.invoke(method, obj3, num);
                                } else {
                                    for (Class<?> superclass = obj3.getClass(); superclass != null && !superclass.equals(Object.class); superclass = superclass.getSuperclass()) {
                                        Iterator<T> it = KavaReflector.declaredMethods(superclass).iterator();
                                        while (true) {
                                            if (it.hasNext()) {
                                                next2 = it.next();
                                                Method method2 = (Method) next2;
                                                if (method2.getParameterTypes().length == 1) {
                                                    Class<?> cls = method2.getParameterTypes()[0];
                                                    Class cls2 = Integer.TYPE;
                                                    if (AbstractC1416l.m3825a(cls, cls2) || AbstractC1416l.m3825a(method2.getParameterTypes()[0], cls2)) {
                                                        if (AbstractC1416l.m3825a(method2.getName(), "J0") || AbstractC1416l.m3825a(method2.getName(), "getItem") || AbstractC1416l.m3825a(method2.getName(), "get")) {
                                                        }
                                                    }
                                                }
                                            } else {
                                                next2 = null;
                                            }
                                        }
                                        Method method3 = (Method) next2;
                                        if (method3 != null) {
                                            concurrentHashMap.put(obj3.getClass(), method3);
                                            Object objInvoke = KavaReflector.invoke(method3, obj3, num);
                                            if (objInvoke != null) {
                                                objM5972h = objInvoke;
                                            }
                                        }
                                    }
                                    ConcurrentHashMap concurrentHashMap2 = c2547i.f8255d;
                                    Field field = (Field) concurrentHashMap2.get(obj3.getClass());
                                    if (field == null || (objM5975v = C2547i.m5975v(iIntValue, KavaReflector.readField(field, obj3))) == null) {
                                        for (Class<?> superclass2 = obj3.getClass(); superclass2 != null && !superclass2.equals(Object.class); superclass2 = superclass2.getSuperclass()) {
                                            Iterator<T> it2 = KavaReflector.declaredFields(superclass2).iterator();
                                            while (true) {
                                                if (it2.hasNext()) {
                                                    next = it2.next();
                                                    Field field2 = (Field) next;
                                                    if (AbstractC1416l.m3825a(field2.getName(), "K") || AbstractC1416l.m3825a(field2.getName(), "items") || AbstractC1416l.m3825a(field2.getName(), "data") || AbstractC1416l.m3825a(field2.getName(), "list")) {
                                                    }
                                                } else {
                                                    next = null;
                                                }
                                            }
                                            Field field3 = (Field) next;
                                            if (field3 != null) {
                                                concurrentHashMap2.put(obj3.getClass(), field3);
                                                objM5972h = C2547i.m5975v(iIntValue, KavaReflector.readField(field3, obj3));
                                            }
                                        }
                                        Set setNewSetFromMap = Collections.newSetFromMap(new WeakHashMap());
                                        setNewSetFromMap.getClass();
                                        objM5972h = C2547i.m5972h(obj3, iIntValue, setNewSetFromMap, 0);
                                    } else {
                                        objM5972h = objM5975v;
                                    }
                                }
                            }
                            if (objM5972h != null && (objM5966K = C2547i.m5966K(objM5972h)) != null) {
                                long jM5976x = C2547i.m5976x(objM5966K);
                                if (jM5976x > 0) {
                                    C3458m c3458mChatPage = WeChatApis.chatPage();
                                    String strM7258a = c3458mChatPage != null ? c3458mChatPage.m7258a() : null;
                                    if (strM7258a == null) {
                                        strM7258a = HttpUrl.FRAGMENT_ENCODE_SET;
                                    }
                                    if (strM7258a.length() != 0) {
                                        Object field4 = KavaReflector.readField(obj, "itemView");
                                        View view2 = field4 instanceof View ? (View) field4 : null;
                                        if (view2 != null) {
                                            view = view2;
                                        } else {
                                            Object field5 = KavaReflector.readField(c2547i.m5987i(obj.getClass()), obj);
                                            if (field5 instanceof View) {
                                                view = (View) field5;
                                            }
                                        }
                                        if (view != null) {
                                            C2547i.m5970b(view);
                                            Map map = c2547i.f8267p;
                                            map.getClass();
                                            map.put(view, new C2541c(jM5976x, strM7258a, objM5966K));
                                        }
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
                break;
            case 2:
                methodHookParam.getClass();
                Object obj4 = methodHookParam.thisObject;
                if (obj4 instanceof View) {
                    this.f8250b.f8266o = new WeakReference(obj4);
                }
                break;
            case 3:
                methodHookParam.getClass();
                if (this.f8250b.f8266o.get() == methodHookParam.thisObject) {
                    this.f8250b.f8266o = new WeakReference(null);
                }
                break;
            default:
                super.afterHookedMethod(methodHookParam);
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:493:0x055e */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:494:0x0550 */
    /* JADX WARN: Code restructure failed: missing block: B:303:0x04af, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0308 A[PHI: r0
  0x0308: PHI (r0v28 java.lang.Object) = (r0v24 java.lang.Object), (r0v29 java.lang.Object) binds: [B:213:0x032a, B:200:0x0306] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0493  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x05b5  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x0656  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x06ad  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x06b5  */
    /* JADX WARN: Removed duplicated region for block: B:438:0x04fd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:462:0x04b9 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v167 */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r0v40 */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r0v49 */
    /* JADX WARN: Type inference failed for: r0v55 */
    /* JADX WARN: Type inference failed for: r0v62, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r0v63 */
    /* JADX WARN: Type inference failed for: r0v64 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        C2540b c2540b;
        boolean z9;
        EnumC2544f enumC2544f;
        View view;
        boolean zM5980F;
        int iOrdinal;
        Object objM5984d;
        Window window;
        long j3;
        ?? c3959f;
        DexKitBridge dexKitBridge;
        C0570e c0570e;
        C1253k c1253k;
        Object c3959f2;
        Iterator it;
        Object obj;
        Method methodAccessible;
        boolean zIsAssignableFrom;
        Object obj2;
        int i9;
        float fM5983c;
        ViewParent parent;
        int iOrdinal2;
        float fM5983c2;
        View view2;
        float fM5983c3;
        int iOrdinal3;
        float f3;
        C2541c c2541cM5988j;
        switch (this.f8249a) {
            case 0:
                EnumC2544f enumC2544f2 = EnumC2544f.f8233g;
                methodHookParam.getClass();
                Object obj3 = methodHookParam.thisObject;
                View view3 = obj3 instanceof View ? (View) obj3 : null;
                if (view3 != null) {
                    Object[] objArr = methodHookParam.args;
                    Object objM8366C0 = objArr != null ? AbstractC4165l.m8366C0(0, objArr) : null;
                    MotionEvent motionEvent = objM8366C0 instanceof MotionEvent ? (MotionEvent) objM8366C0 : null;
                    if (motionEvent != null) {
                        C2547i c2547i = this.f8250b;
                        if (AbstractC4302b.m8640c(c2547i.f8252a.f12143a, "Hchat_swipe_quote_config").getBoolean("swipe_quote_enable", false) || AbstractC4302b.m8640c(c2547i.f8252a.f12143a, "Hchat_swipe_quote_config").getBoolean("swipe_repeat_enable", false)) {
                            C2547i c2547i2 = this.f8250b;
                            float x4 = motionEvent.getX();
                            float y10 = motionEvent.getY();
                            ViewGroup viewGroup = view3 instanceof ViewGroup ? (ViewGroup) view3 : null;
                            if (viewGroup != null) {
                                for (int childCount = viewGroup.getChildCount() - 1; -1 < childCount; childCount--) {
                                    View childAt = viewGroup.getChildAt(childCount);
                                    if (childAt != null && x4 >= childAt.getLeft() && x4 <= childAt.getRight() && y10 >= childAt.getTop() && y10 <= childAt.getBottom() && (c2541cM5988j = c2547i2.m5988j(childAt)) != null) {
                                        c2540b = new C2540b(childAt, c2541cM5988j);
                                    }
                                }
                                c2540b = null;
                            } else {
                                c2540b = null;
                            }
                            C2547i c2547i3 = this.f8250b;
                            Map map = c2547i3.f8268q;
                            map.getClass();
                            Map map2 = map;
                            Object obj4 = map2.get(view3);
                            Object obj5 = obj4;
                            if (obj4 == null) {
                                C2545g c2545g = new C2545g();
                                c2545g.f8241e = enumC2544f2;
                                c2545g.f8248l = -1;
                                map2.put(view3, c2545g);
                                obj5 = c2545g;
                            }
                            C2545g c2545g2 = (C2545g) obj5;
                            if (motionEvent.getActionMasked() == 2 && c2545g2.f8247k == motionEvent.getEventTime() && c2545g2.f8248l == motionEvent.getActionMasked()) {
                                z9 = c2545g2.f8243g;
                            } else {
                                c2545g2.f8247k = motionEvent.getEventTime();
                                c2545g2.f8248l = motionEvent.getActionMasked();
                                int actionMasked = motionEvent.getActionMasked();
                                if (actionMasked == 0) {
                                    C2547i.m5964I(c2545g2);
                                    c2545g2.f8237a = motionEvent.getRawX();
                                    c2545g2.f8238b = motionEvent.getRawY();
                                    c2545g2.f8239c = c2540b;
                                    c2545g2.f8241e = enumC2544f2;
                                    c2545g2.f8243g = false;
                                    c2545g2.f8244h = false;
                                    c2545g2.f8245i = false;
                                    c2545g2.f8242f = true;
                                    c2545g2.f8246j = false;
                                    c2545g2.f8240d = null;
                                    z9 = false;
                                } else if (actionMasked == 1) {
                                    C2540b c2540b2 = c2545g2.f8239c;
                                    if (c2540b2 != null) {
                                        c2540b = c2540b2;
                                    }
                                    if (motionEvent.getActionMasked() == 1 && c2545g2.f8244h && c2540b != null && (iOrdinal = c2545g2.f8241e.ordinal()) != 0) {
                                        if (iOrdinal != 1) {
                                            if (iOrdinal != 2) {
                                                C3193a.m6822k();
                                            } else {
                                                zM5980F = c2547i3.m5980F(c2540b.f8223b);
                                                enumC2544f = enumC2544f2;
                                                view = view3;
                                            }
                                            break;
                                        } else {
                                            View view4 = c2540b.f8222a;
                                            C2541c c2541c = c2540b.f8223b;
                                            C3458m c3458mChatPage = WeChatApis.chatPage();
                                            String strM7258a = c3458mChatPage != null ? c3458mChatPage.m7258a() : null;
                                            if (strM7258a == null) {
                                                strM7258a = HttpUrl.FRAGMENT_ENCODE_SET;
                                            }
                                            if (strM7258a.length() != 0 && strM7258a.equals(c2541c.f8224a)) {
                                                Object obj6 = c2547i3.f8266o.get();
                                                if (!(obj6 instanceof View) || !((View) obj6).isAttachedToWindow()) {
                                                    View rootView = view4.getRootView();
                                                    if (rootView == null || (objM5984d = c2547i3.m5984d(rootView)) == null) {
                                                        C3460o c3460oCurrentActivity = WeChatApis.currentActivity();
                                                        Activity activityM7263a = c3460oCurrentActivity != null ? c3460oCurrentActivity.m7263a() : null;
                                                        View decorView = (activityM7263a == null || (window = activityM7263a.getWindow()) == null) ? null : window.getDecorView();
                                                        obj6 = (decorView == null || (objM5984d = c2547i3.m5984d(decorView)) == null) ? null : objM5984d;
                                                    }
                                                }
                                                if (obj6 != null) {
                                                    Object obj7 = c2541c.f8226c;
                                                    ConcurrentHashMap concurrentHashMap = c2547i3.f8258g;
                                                    ArrayList arrayList = new ArrayList();
                                                    arrayList.add(obj7);
                                                    long jM5976x = C2547i.m5976x(obj7);
                                                    for (Class<?> superclass = obj7.getClass(); superclass != null && !superclass.equals(Object.class); superclass = superclass.getSuperclass()) {
                                                        Iterator<Field> it2 = KavaReflector.declaredFields(superclass).iterator();
                                                        while (it2.hasNext()) {
                                                            Object field = KavaReflector.readField(it2.next(), obj7);
                                                            if (field != null) {
                                                                if (field == obj7) {
                                                                    obj2 = obj7;
                                                                } else if (arrayList.isEmpty()) {
                                                                    obj2 = obj7;
                                                                    if ((AbstractC0921a.m2263z("com.tencent.mm.storage.", field, false) || jM5976x > 0) && (jM5976x <= 0 || C2547i.m5976x(field) == jM5976x)) {
                                                                        arrayList.add(field);
                                                                    }
                                                                } else {
                                                                    Iterator it3 = arrayList.iterator();
                                                                    while (it3.hasNext()) {
                                                                        obj2 = obj7;
                                                                        if (it3.next() != field) {
                                                                            obj7 = obj2;
                                                                        }
                                                                    }
                                                                    obj2 = obj7;
                                                                    if (AbstractC0921a.m2263z("com.tencent.mm.storage.", field, false)) {
                                                                        arrayList.add(field);
                                                                    } else {
                                                                        arrayList.add(field);
                                                                    }
                                                                }
                                                                obj7 = obj2;
                                                            }
                                                        }
                                                    }
                                                    Iterator it4 = arrayList.iterator();
                                                    while (true) {
                                                        boolean zHasNext = it4.hasNext();
                                                        Class cls = Void.TYPE;
                                                        if (zHasNext) {
                                                            Object next = it4.next();
                                                            Class<?> cls2 = obj6.getClass();
                                                            Method method = (Method) concurrentHashMap.get(cls2);
                                                            if (method != null) {
                                                                Class<?>[] parameterTypes = method.getParameterTypes();
                                                                parameterTypes.getClass();
                                                                it = it4;
                                                                Class cls3 = (Class) AbstractC4165l.m8391z0(parameterTypes);
                                                                if (cls3 == null || next == null) {
                                                                    obj = next;
                                                                    zIsAssignableFrom = false;
                                                                } else {
                                                                    obj = next;
                                                                    zIsAssignableFrom = cls3.isAssignableFrom(obj.getClass());
                                                                }
                                                                if (!zIsAssignableFrom) {
                                                                    method = null;
                                                                }
                                                                if (method != null) {
                                                                    view = view3;
                                                                    methodAccessible = method;
                                                                }
                                                                if (methodAccessible != null) {
                                                                    if (KavaReflector.invokeSuccessfully(methodAccessible, obj6, obj)) {
                                                                        c2547i3.m5996r(obj6, c2541c.f8225b);
                                                                        c2547i3.m5979D(obj6);
                                                                        c2547i3.m5978C(obj6, c2541c.f8225b);
                                                                        c2547i3.m5989k(obj6);
                                                                        enumC2544f = enumC2544f2;
                                                                    } else {
                                                                        concurrentHashMap.remove(obj6.getClass());
                                                                    }
                                                                    break;
                                                                }
                                                                it4 = it;
                                                                view3 = view;
                                                            } else {
                                                                it = it4;
                                                                obj = next;
                                                            }
                                                            Class<?> superclass2 = cls2;
                                                            while (superclass2 != null && !superclass2.equals(Object.class)) {
                                                                Iterator<Method> it5 = KavaReflector.declaredMethods(superclass2).iterator();
                                                                while (it5.hasNext()) {
                                                                    Method next2 = it5.next();
                                                                    Class<?> cls4 = superclass2;
                                                                    Class<?>[] parameterTypes2 = next2.getParameterTypes();
                                                                    Iterator<Method> it6 = it5;
                                                                    if (!AbstractC1416l.m3825a(next2.getReturnType(), cls) || Modifier.isStatic(next2.getModifiers())) {
                                                                        view = view3;
                                                                    } else {
                                                                        view = view3;
                                                                        if (AbstractC1416l.m3825a(next2.getName(), "setLastQuoteMsgInfo") && parameterTypes2.length == 1) {
                                                                            Class<?> cls5 = parameterTypes2[0];
                                                                            if ((cls5 == null || obj == null) ? false : cls5.isAssignableFrom(obj.getClass())) {
                                                                                methodAccessible = KavaReflector.accessible(next2);
                                                                                if (methodAccessible != null) {
                                                                                    concurrentHashMap.put(cls2, methodAccessible);
                                                                                }
                                                                                if (methodAccessible != null) {
                                                                                }
                                                                                it4 = it;
                                                                                view3 = view;
                                                                            }
                                                                        }
                                                                    }
                                                                    superclass2 = cls4;
                                                                    it5 = it6;
                                                                    view3 = view;
                                                                }
                                                                superclass2 = superclass2.getSuperclass();
                                                            }
                                                            view = view3;
                                                            methodAccessible = null;
                                                            if (methodAccessible != null) {
                                                            }
                                                            it4 = it;
                                                            view3 = view;
                                                        } else {
                                                            view = view3;
                                                            long j4 = c2541c.f8225b;
                                                            Object obj8 = c2541c.f8226c;
                                                            Class<?> cls6 = obj6.getClass();
                                                            Method methodAccessible2 = c2547i3.f8265n;
                                                            if (methodAccessible2 != null) {
                                                                enumC2544f = enumC2544f2;
                                                                j3 = j4;
                                                            } else {
                                                                String strM5999y = c2547i3.m5999y();
                                                                j3 = j4;
                                                                Method methodM2087c = C0828b.m2087c(c2547i3.f8272u, strM5999y, c2547i3.f8252a.f12145c, "quote_method");
                                                                if (methodM2087c == null) {
                                                                    try {
                                                                        dexKitBridge = c2547i3.f8252a.f12146d;
                                                                        c0570e = new C0570e();
                                                                        c1253k = new C1253k();
                                                                        enumC2544f = enumC2544f2;
                                                                    } catch (Throwable th2) {
                                                                        th = th2;
                                                                        enumC2544f = enumC2544f2;
                                                                    }
                                                                    try {
                                                                        C1253k.m3367u0(c1253k, AbstractC0000a.m99x0("invalid quote msg id"));
                                                                        c0570e.f1764h = c1253k;
                                                                        Iterator it7 = dexKitBridge.findMethod(c0570e).iterator();
                                                                        while (true) {
                                                                            if (it7.hasNext()) {
                                                                                try {
                                                                                    c3959f2 = ((C1730o) it7.next()).m4350r(c2547i3.f8252a.f12145c);
                                                                                } catch (Throwable th3) {
                                                                                    c3959f2 = new C3959f(th3);
                                                                                }
                                                                                if (c3959f2 instanceof C3959f) {
                                                                                    c3959f2 = null;
                                                                                }
                                                                                c3959f = (Method) c3959f2;
                                                                                if (c3959f == 0 || !C2547i.m5973t(c3959f)) {
                                                                                    c3959f = 0;
                                                                                }
                                                                                if (c3959f != 0) {
                                                                                }
                                                                            } else {
                                                                                c3959f = 0;
                                                                            }
                                                                        }
                                                                    } catch (Throwable th4) {
                                                                        th = th4;
                                                                        c3959f = new C3959f(th);
                                                                    }
                                                                    boolean z10 = c3959f instanceof C3959f;
                                                                    ?? r02 = c3959f;
                                                                    if (z10) {
                                                                        r02 = 0;
                                                                    }
                                                                    Method method2 = (Method) r02;
                                                                    if (method2 != null) {
                                                                        c2547i3.f8265n = KavaReflector.accessible(method2);
                                                                        C0828b.m2092h(c2547i3.f8272u, strM5999y, "quote_method", method2);
                                                                    } else {
                                                                        SharedPreferences sharedPreferences = c2547i3.f8272u;
                                                                        sharedPreferences.getClass();
                                                                        try {
                                                                            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                                                                            if (!AbstractC1416l.m3825a(sharedPreferences.getString("cache.key", HttpUrl.FRAGMENT_ENCODE_SET), strM5999y)) {
                                                                                editorEdit.clear().putString("cache.key", strM5999y);
                                                                            }
                                                                            editorEdit.remove("quote_method").apply();
                                                                            break;
                                                                        } catch (Throwable unused) {
                                                                        }
                                                                    }
                                                                    methodAccessible2 = c2547i3.f8265n;
                                                                    break;
                                                                } else {
                                                                    if (!C2547i.m5973t(methodM2087c)) {
                                                                        methodM2087c = null;
                                                                    }
                                                                    if (methodM2087c != null) {
                                                                        c2547i3.f8265n = KavaReflector.accessible(methodM2087c);
                                                                        methodAccessible2 = c2547i3.f8265n;
                                                                        enumC2544f = enumC2544f2;
                                                                    }
                                                                }
                                                            }
                                                            if (methodAccessible2 == null) {
                                                                methodAccessible2 = (Method) c2547i3.f8257f.get(cls6);
                                                                if (methodAccessible2 == null) {
                                                                    for (Class<?> superclass3 = cls6; superclass3 != null && !superclass3.equals(Object.class); superclass3 = superclass3.getSuperclass()) {
                                                                        for (Method method3 : KavaReflector.declaredMethods(superclass3)) {
                                                                            Class<?>[] parameterTypes3 = method3.getParameterTypes();
                                                                            if (AbstractC1416l.m3825a(method3.getReturnType(), cls) && !Modifier.isStatic(method3.getModifiers()) && parameterTypes3.length == 3 && AbstractC1416l.m3825a(parameterTypes3[0], String.class) && (AbstractC1416l.m3825a(parameterTypes3[1], Long.TYPE) || AbstractC1416l.m3825a(parameterTypes3[1], Long.class))) {
                                                                                if (!parameterTypes3[2].isPrimitive() && !AbstractC3156t.m6740d0(parameterTypes3[2].getName(), "java.", false) && !AbstractC3156t.m6740d0(parameterTypes3[2].getName(), "android.", false)) {
                                                                                    methodAccessible2 = KavaReflector.accessible(method3);
                                                                                    if (methodAccessible2 != null) {
                                                                                        c2547i3.f8257f.put(cls6, methodAccessible2);
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    methodAccessible2 = null;
                                                                }
                                                                if (methodAccessible2 != null) {
                                                                    if (!KavaReflector.invokeSuccessfully(methodAccessible2, obj6, strM7258a, Long.valueOf(j3), null)) {
                                                                        Class<?>[] parameterTypes4 = methodAccessible2.getParameterTypes();
                                                                        parameterTypes4.getClass();
                                                                        Class cls7 = (Class) AbstractC4165l.m8366C0(2, parameterTypes4);
                                                                        if (!(cls7 != null ? cls7.isAssignableFrom(obj8.getClass()) : false) || !KavaReflector.invokeSuccessfully(methodAccessible2, obj6, strM7258a, Long.valueOf(j3), obj8)) {
                                                                            c2547i3.f8257f.remove(obj6.getClass());
                                                                            if (methodAccessible2.equals(c2547i3.f8265n)) {
                                                                                c2547i3.f8265n = null;
                                                                            }
                                                                            if (c2547i3.m5996r(obj6, c2541c.f8225b)) {
                                                                            }
                                                                        }
                                                                    }
                                                                    c2547i3.m5979D(obj6);
                                                                    c2547i3.m5989k(obj6);
                                                                } else if (c2547i3.m5996r(obj6, c2541c.f8225b)) {
                                                                    c2547i3.m5979D(obj6);
                                                                    c2547i3.m5978C(obj6, c2541c.f8225b);
                                                                    c2547i3.m5989k(obj6);
                                                                }
                                                                break;
                                                            } else {
                                                                if (!cls6.isAssignableFrom(methodAccessible2.getDeclaringClass()) && !methodAccessible2.getDeclaringClass().isAssignableFrom(cls6)) {
                                                                    methodAccessible2 = null;
                                                                }
                                                                if (methodAccessible2 == null) {
                                                                }
                                                                if (methodAccessible2 != null) {
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    enumC2544f = enumC2544f2;
                                                    view = view3;
                                                }
                                                boolean z11 = false;
                                                zM5980F = z11;
                                            }
                                        }
                                    } else {
                                        enumC2544f = enumC2544f2;
                                        view = view3;
                                        zM5980F = false;
                                    }
                                    if (zM5980F) {
                                        c2545g2.f8246j = true;
                                    }
                                    boolean z12 = c2545g2.f8243g || c2545g2.f8246j;
                                    C2547i.m5964I(c2545g2);
                                    c2545g2.f8242f = false;
                                    c2545g2.f8246j = false;
                                    c2545g2.f8239c = null;
                                    c2545g2.f8241e = enumC2544f;
                                    c2545g2.f8243g = false;
                                    c2545g2.f8244h = false;
                                    c2545g2.f8245i = false;
                                    ViewParent parent2 = view.getParent();
                                    if (parent2 != null) {
                                        parent2.requestDisallowInterceptTouchEvent(false);
                                    }
                                    z9 = z12;
                                } else {
                                    if (actionMasked == 2) {
                                        if (c2545g2.f8242f) {
                                            if (!c2545g2.f8246j) {
                                                C2540b c2540b3 = c2545g2.f8239c;
                                                if (c2540b3 != null) {
                                                    c2540b = c2540b3;
                                                } else if (c2540b != null) {
                                                }
                                                float rawX = motionEvent.getRawX() - c2545g2.f8237a;
                                                float rawY = motionEvent.getRawY() - c2545g2.f8238b;
                                                boolean z13 = AbstractC4302b.m8640c(c2547i3.f8252a.f12143a, "Hchat_swipe_quote_config").getBoolean("swipe_quote_enable", false);
                                                boolean z14 = AbstractC4302b.m8640c(c2547i3.f8252a.f12143a, "Hchat_swipe_quote_config").getBoolean("swipe_repeat_enable", false);
                                                if (c2545g2.f8243g || Math.abs(rawY) <= c2547i3.m5983c(32.0f) || Math.abs(rawY) <= Math.abs(rawX) * 1.2f) {
                                                    if (c2545g2.f8243g) {
                                                        i9 = 1;
                                                    } else {
                                                        EnumC2544f enumC2544f3 = (((Math.abs(rawX) > c2547i3.m5983c(6.0f) ? 1 : (Math.abs(rawX) == c2547i3.m5983c(6.0f) ? 0 : -1)) > 0 && (Math.abs(rawX) > (Math.abs(rawY) * 1.15f) ? 1 : (Math.abs(rawX) == (Math.abs(rawY) * 1.15f) ? 0 : -1)) > 0) && rawX < 0.0f && z13) ? EnumC2544f.f8234h : (((Math.abs(rawX) > c2547i3.m5983c(18.0f) ? 1 : (Math.abs(rawX) == c2547i3.m5983c(18.0f) ? 0 : -1)) > 0 && (Math.abs(rawX) > (Math.abs(rawY) * 1.35f) ? 1 : (Math.abs(rawX) == (Math.abs(rawY) * 1.35f) ? 0 : -1)) > 0) && rawX > 0.0f && z14) ? EnumC2544f.f8235i : enumC2544f2;
                                                        if (enumC2544f3 != enumC2544f2) {
                                                            c2545g2.f8241e = enumC2544f3;
                                                            i9 = 1;
                                                            c2545g2.f8243g = true;
                                                        }
                                                    }
                                                    int iOrdinal4 = c2545g2.f8241e.ordinal();
                                                    if (iOrdinal4 != 0) {
                                                        if (iOrdinal4 == i9) {
                                                            float f10 = -rawX;
                                                            if (f10 >= 0.0f) {
                                                                rawX = f10;
                                                            }
                                                            fM5983c = c2547i3.m5983c(150.0f);
                                                            if (rawX > fM5983c) {
                                                            }
                                                            parent = view3.getParent();
                                                            if (parent != null) {
                                                            }
                                                            iOrdinal2 = c2545g2.f8241e.ordinal();
                                                            if (iOrdinal2 != 0) {
                                                            }
                                                            c2545g2.f8244h = rawX < fM5983c2;
                                                            view2 = c2540b.f8222a;
                                                            if (c2545g2.f8240d != view2) {
                                                            }
                                                            fM5983c3 = c2547i3.m5983c(132.0f);
                                                            if (rawX > fM5983c3) {
                                                            }
                                                            iOrdinal3 = c2545g2.f8241e.ordinal();
                                                            if (iOrdinal3 != 0) {
                                                            }
                                                            view2.setTranslationX(f3);
                                                            view2.setAlpha(1.0f - (AbstractC3754e0.m7907q(rawX / fM5983c3, 0.0f, 1.0f) * 0.07f));
                                                            if (c2545g2.f8244h) {
                                                                view3.performHapticFeedback(4);
                                                                c2545g2.f8245i = true;
                                                            }
                                                        } else if (iOrdinal4 != 2) {
                                                            C3193a.m6822k();
                                                        } else {
                                                            if (rawX < 0.0f) {
                                                                rawX = 0.0f;
                                                            }
                                                            fM5983c = c2547i3.m5983c(150.0f);
                                                            if (rawX > fM5983c) {
                                                                rawX = fM5983c;
                                                            }
                                                            parent = view3.getParent();
                                                            if (parent != null) {
                                                                parent.requestDisallowInterceptTouchEvent(true);
                                                            }
                                                            iOrdinal2 = c2545g2.f8241e.ordinal();
                                                            if (iOrdinal2 != 0) {
                                                                fM5983c2 = Float.MAX_VALUE;
                                                            } else if (iOrdinal2 == 1) {
                                                                fM5983c2 = c2547i3.m5983c(52.0f);
                                                            } else if (iOrdinal2 != 2) {
                                                                C3193a.m6822k();
                                                            } else {
                                                                fM5983c2 = c2547i3.m5983c(92.0f);
                                                            }
                                                            c2545g2.f8244h = rawX < fM5983c2;
                                                            view2 = c2540b.f8222a;
                                                            if (c2545g2.f8240d != view2) {
                                                                C2547i.m5964I(c2545g2);
                                                                c2545g2.f8240d = view2;
                                                                C2547i.m5970b(view2);
                                                            }
                                                            fM5983c3 = c2547i3.m5983c(132.0f);
                                                            if (rawX > fM5983c3) {
                                                                rawX = fM5983c3;
                                                            }
                                                            iOrdinal3 = c2545g2.f8241e.ordinal();
                                                            if (iOrdinal3 != 0) {
                                                                f3 = 0.0f;
                                                            } else if (iOrdinal3 == 1) {
                                                                f3 = 0.0f - rawX;
                                                            } else if (iOrdinal3 != 2) {
                                                                C3193a.m6822k();
                                                            } else {
                                                                f3 = 0.0f + rawX;
                                                            }
                                                            view2.setTranslationX(f3);
                                                            view2.setAlpha(1.0f - (AbstractC3754e0.m7907q(rawX / fM5983c3, 0.0f, 1.0f) * 0.07f));
                                                            if (c2545g2.f8244h && !c2545g2.f8245i) {
                                                                view3.performHapticFeedback(4);
                                                                c2545g2.f8245i = true;
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    C2547i.m5964I(c2545g2);
                                                    c2545g2.f8242f = false;
                                                }
                                            }
                                            z9 = true;
                                        }
                                        break;
                                    } else if (actionMasked != 3) {
                                    }
                                    z9 = false;
                                }
                            }
                            if (z9) {
                                methodHookParam.setResult(Boolean.TRUE);
                            }
                        }
                    }
                }
                break;
            default:
                super.beforeHookedMethod(methodHookParam);
                break;
        }
    }
}
