package p086r0;

import android.app.Activity;
import android.view.View;
import android.view.Window;
import de.robv.android.xposed.XC_MethodHook;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import p001A0.RunnableC0040m;
import p009E0.C0104d;
import p011F0.AbstractC0120h;
import p011F0.AbstractC0135w;
import p027N0.AbstractC0223g;
import p040U0.AbstractC0299i;
import p040U0.AbstractC0307q;
import p054c0.AbstractC0509a;
import p102z0.AbstractC1126i;
import p102z0.C1124g;

/* JADX INFO: renamed from: r0.C1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0828C1 extends AbstractC0509a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2752a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0831D1 f2753b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0828C1(C0831D1 c0831d1, int i2) {
        this.f2752a = i2;
        this.f2753b = c0831d1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Duplicate block (B:58:0x00da) to fix multi-entry loop: BACK_EDGE: B:58:0x00da -> B:59:0x00db */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x00db, code lost:
    
        r1 = null;
     */
    @Override // p054c0.AbstractC0509a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        View view;
        View view2;
        View view3;
        Object obj;
        Object c0104d;
        switch (this.f2752a) {
            case 0:
                AbstractC0223g.m418e(methodHookParam, "param");
                Object[] objArr = methodHookParam.args;
                AbstractC0223g.m417d(objArr, "args");
                if (AbstractC0223g.m414a(AbstractC0120h.m258f0(0, objArr), Boolean.TRUE)) {
                    Object obj2 = methodHookParam.thisObject;
                    Activity activity = obj2 instanceof Activity ? (Activity) obj2 : null;
                    if (activity != null) {
                        C0831D1 c0831d1 = this.f2753b;
                        if (c0831d1.m1542z(activity)) {
                            C0831D1.m1508a(c0831d1, activity);
                            break;
                        }
                    }
                }
                break;
            case 1:
                AbstractC0223g.m418e(methodHookParam, "param");
                Object obj3 = methodHookParam.thisObject;
                Activity activity2 = obj3 instanceof Activity ? (Activity) obj3 : null;
                if (activity2 != null) {
                    C0831D1 c0831d12 = this.f2753b;
                    if (c0831d12.m1542z(activity2)) {
                        C0831D1.m1508a(c0831d12, activity2);
                        break;
                    }
                }
                break;
            case 2:
                AbstractC0223g.m418e(methodHookParam, "param");
                Object obj4 = methodHookParam.thisObject;
                if (obj4 != null) {
                    C0831D1 c0831d13 = this.f2753b;
                    if (!c0831d13.f2767i && c0831d13.f2763e.contains(obj4) && (view = (View) c0831d13.f2765g.get(obj4)) != null) {
                        view.post(new RunnableC0040m(c0831d13, view, 10));
                        break;
                    }
                }
                break;
            case 3:
                AbstractC0223g.m418e(methodHookParam, "param");
                Object[] objArr2 = methodHookParam.args;
                AbstractC0223g.m417d(objArr2, "args");
                Object objM258f0 = AbstractC0120h.m258f0(0, objArr2);
                if (objM258f0 != null) {
                    Object[] objArr3 = methodHookParam.args;
                    AbstractC0223g.m417d(objArr3, "args");
                    Object objM258f02 = AbstractC0120h.m258f0(1, objArr3);
                    View view4 = null;
                    Number number = objM258f02 instanceof Number ? (Number) objM258f02 : null;
                    if (number != null) {
                        int iIntValue = number.intValue();
                        C0831D1 c0831d14 = this.f2753b;
                        c0831d14.getClass();
                        Iterator it = C0831D1.m1509b(objM258f0.getClass()).iterator();
                        while (true) {
                            if (it.hasNext()) {
                                Field field = (Field) it.next();
                                try {
                                    field.setAccessible(true);
                                    Object obj5 = field.get(objM258f0);
                                    c0104d = obj5 instanceof View ? (View) obj5 : null;
                                } catch (Throwable th) {
                                    c0104d = new C0104d(th);
                                }
                                if (c0104d instanceof C0104d) {
                                    c0104d = null;
                                }
                                view2 = (View) c0104d;
                                if (view2 != null) {
                                }
                            } else {
                                view2 = null;
                            }
                        }
                        if (view2 != null) {
                            Object parent = view2.getParent();
                            if (parent instanceof View) {
                                view3 = (View) parent;
                                while (true) {
                                    if (view3 != null) {
                                        if (C0831D1.m1520u(view3)) {
                                            view4 = view3;
                                        } else {
                                            Object parent2 = view3.getParent();
                                            if (parent2 instanceof View) {
                                                view3 = (View) parent2;
                                            }
                                        }
                                    }
                                }
                                if (c0831d14.m1541x(view4) && (obj = methodHookParam.thisObject) != null) {
                                    Object objM1505F = C0831D1.m1505F(objM258f0);
                                    if (objM1505F == null) {
                                        objM1505F = C0831D1.m1504E(iIntValue, obj);
                                    }
                                    if (C0831D1.m1506K() && c0831d14.f2764f.contains(obj) && objM1505F != null) {
                                        c0831d14.f2772n.add(objM1505F);
                                    }
                                    c0831d14.m1527H(view2, objM1505F);
                                }
                            }
                            view3 = null;
                            break;
                        }
                    }
                }
                break;
            case 5:
                AbstractC0223g.m418e(methodHookParam, "param");
                Object obj6 = methodHookParam.thisObject;
                View view5 = obj6 instanceof View ? (View) obj6 : null;
                if (view5 != null) {
                    C0831D1 c0831d15 = this.f2753b;
                    if (c0831d15.m1541x(view5)) {
                        c0831d15.f2762d.add(view5);
                        Object[] objArr4 = methodHookParam.args;
                        AbstractC0223g.m417d(objArr4, "args");
                        Object objM258f03 = AbstractC0120h.m258f0(0, objArr4);
                        if (objM258f03 == null) {
                            objM258f03 = C0831D1.m1518q(view5);
                        }
                        if (objM258f03 != null) {
                            c0831d15.f2765g.put(objM258f03, view5);
                            if (C0831D1.m1506K() && AbstractC0223g.m414a(C0831D1.m1519r(view5), "m97")) {
                                c0831d15.f2764f.add(objM258f03);
                            }
                            c0831d15.m1525D(objM258f03);
                        }
                        c0831d15.m1529J(view5);
                        break;
                    }
                }
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p054c0.AbstractC0509a
    public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        Object c0104d;
        C0831D1 c0831d1 = this.f2753b;
        switch (this.f2752a) {
            case 1:
                AbstractC0223g.m418e(methodHookParam, "param");
                Object obj = methodHookParam.thisObject;
                Activity activity = obj instanceof Activity ? (Activity) obj : null;
                if (activity != null && c0831d1.m1542z(activity)) {
                    Window window = activity.getWindow();
                    c0831d1.m1528I(window != null ? window.getDecorView() : null);
                }
                break;
            case 2:
                AbstractC0223g.m418e(methodHookParam, "param");
                if (!c0831d1.f2767i) {
                    if (c0831d1.f2763e.contains(methodHookParam.thisObject)) {
                        Object obj2 = methodHookParam.thisObject;
                        AbstractC0223g.m417d(obj2, "thisObject");
                        c0831d1.m1535i(obj2);
                    }
                }
                break;
            case 3:
                AbstractC0223g.m418e(methodHookParam, "param");
                Object[] objArr = methodHookParam.args;
                AbstractC0223g.m417d(objArr, "args");
                Object objM258f0 = AbstractC0120h.m258f0(1, objArr);
                Number number = objM258f0 instanceof Number ? (Number) objM258f0 : null;
                if (number != null) {
                    int iIntValue = number.intValue();
                    Object obj3 = methodHookParam.thisObject;
                    if (obj3 != null) {
                        c0831d1.getClass();
                        Object objM1504E = C0831D1.m1504E(iIntValue, obj3);
                        if (objM1504E != null) {
                            boolean z2 = AbstractC1126i.f3786a;
                            if (C1124g.m2414E()) {
                                Set<String> setM1511d = C0831D1.m1511d();
                                if (!setM1511d.isEmpty()) {
                                    Set setM1532e = c0831d1.m1532e(0, objM1504E);
                                    ArrayList arrayList = new ArrayList();
                                    for (Object obj4 : setM1532e) {
                                        if (setM1511d.contains((String) obj4)) {
                                            arrayList.add(obj4);
                                        }
                                    }
                                    if (!arrayList.isEmpty() && AbstractC0135w.m300Y(setM1532e, setM1511d).isEmpty() && c0831d1.m1540w(objM1504E)) {
                                        for (Field field : C0831D1.m1509b(objM1504E.getClass())) {
                                            if (!Modifier.isStatic(field.getModifiers())) {
                                                Class<?> type = field.getType();
                                                Class cls = Integer.TYPE;
                                                if (AbstractC0223g.m414a(type, cls) || AbstractC0223g.m414a(field.getType(), cls)) {
                                                    field.setAccessible(true);
                                                    Object obj5 = field.get(objM1504E);
                                                    Number number2 = obj5 instanceof Number ? (Number) obj5 : null;
                                                    Integer numValueOf = number2 != null ? Integer.valueOf(number2.intValue()) : null;
                                                    if (numValueOf != null && numValueOf.intValue() != 0) {
                                                        field.setInt(objM1504E, 0);
                                                    }
                                                } else if (AbstractC0223g.m414a(field.getType(), String.class)) {
                                                    try {
                                                        field.setAccessible(true);
                                                        Object obj6 = field.get(objM1504E);
                                                        c0104d = obj6 instanceof String ? (String) obj6 : null;
                                                    } catch (Throwable th) {
                                                        c0104d = new C0104d(th);
                                                    }
                                                    if (c0104d instanceof C0104d) {
                                                        c0104d = null;
                                                    }
                                                    String str = (String) c0104d;
                                                    if (str != null && !setM1511d.isEmpty()) {
                                                        Iterator it = setM1511d.iterator();
                                                        while (true) {
                                                            if (!it.hasNext()) {
                                                            }
                                                            if (AbstractC0299i.m511i0(str, (String) it.next(), false)) {
                                                                String strM537g0 = str;
                                                                for (String str2 : setM1511d) {
                                                                    String strM537g02 = AbstractC0307q.m537g0(strM537g0, str2 + ",", "");
                                                                    StringBuilder sb = new StringBuilder(",");
                                                                    sb.append(str2);
                                                                    strM537g0 = AbstractC0307q.m537g0(AbstractC0307q.m537g0(strM537g02, sb.toString(), ""), str2, "");
                                                                }
                                                                String strM537g03 = AbstractC0307q.m537g0(strM537g0, ",,", ",");
                                                                if (!strM537g03.equals(str)) {
                                                                    try {
                                                                        field.setAccessible(true);
                                                                        field.set(objM1504E, strM537g03);
                                                                    } catch (Throwable unused) {
                                                                    }
                                                                }
                                                            }
                                                            break;
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
                    }
                }
                break;
            case 4:
                AbstractC0223g.m418e(methodHookParam, "param");
                Object obj7 = methodHookParam.thisObject;
                View view = obj7 instanceof View ? (View) obj7 : null;
                if (view != null && c0831d1.m1541x(view)) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    WeakHashMap weakHashMap = c0831d1.f2766h;
                    Long l2 = (Long) weakHashMap.get(view);
                    if (jCurrentTimeMillis - (l2 != null ? l2.longValue() : 0L) >= 120) {
                        weakHashMap.put(view, Long.valueOf(jCurrentTimeMillis));
                        c0831d1.f2762d.add(view);
                        Object objM1518q = C0831D1.m1518q(view);
                        if (objM1518q != null) {
                            c0831d1.f2765g.put(objM1518q, view);
                            if (C0831D1.m1506K() && AbstractC0223g.m414a(C0831D1.m1519r(view), "m97")) {
                                c0831d1.f2764f.add(objM1518q);
                            }
                            c0831d1.m1525D(objM1518q);
                        }
                        c0831d1.m1529J(view);
                        break;
                    }
                }
                break;
        }
    }
}
