package p086r0;

import android.app.Activity;
import android.app.Notification;
import android.content.ContentValues;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.p055lu.wxmask.bean.MaskItemBean;
import de.robv.android.xposed.XC_MethodHook;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.regex.Pattern;
import org.json.JSONException;
import p001A0.C0037j;
import p003B0.AbstractC0056b;
import p006D.AbstractC0079h;
import p009E0.C0103c;
import p009E0.C0104d;
import p011F0.AbstractC0120h;
import p011F0.AbstractC0123k;
import p011F0.AbstractC0125m;
import p011F0.C0131s;
import p022L.AbstractC0174d;
import p027N0.AbstractC0223g;
import p040U0.AbstractC0299i;
import p040U0.AbstractC0306p;
import p040U0.AbstractC0307q;
import p052b1.AbstractC0503h;
import p054c0.AbstractC0509a;
import p054c0.AbstractC0514f;
import p069i.C0716t;
import p070i0.AbstractC0731a;
import p084q0.C0808h;
import p097x.InterfaceC1033a;
import p102z0.AbstractC1126i;
import p102z0.AbstractC1129l;
import p102z0.AbstractC1135r;
import p102z0.C1124g;
import p102z0.C1142y;
import p102z0.C1143z;

/* JADX INFO: renamed from: r0.C0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0827C0 extends AbstractC0509a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2750a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0842H0 f2751b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0827C0(C0842H0 c0842h0, int i2) {
        this.f2750a = i2;
        this.f2751b = c0842h0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0194 A[PHI: r2
  0x0194: PHI (r2v3 r0.l) = (r2v2 r0.l), (r2v6 r0.l) binds: [B:61:0x015e, B:66:0x0170] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void m1502a(XC_MethodHook.MethodHookParam methodHookParam) throws JSONException {
        Object c0104d;
        View view;
        String str;
        C0917l c0917lM1360e;
        AbstractC0223g.m418e(methodHookParam, "param");
        Object[] objArr = methodHookParam.args;
        AbstractC0223g.m417d(objArr, "args");
        Object objM258f0 = AbstractC0120h.m258f0(1, objArr);
        Integer num = objM258f0 instanceof Integer ? (Integer) objM258f0 : null;
        if (num != null) {
            int iIntValue = num.intValue();
            try {
                c0104d = AbstractC0514f.f1622b.mo1012c(methodHookParam.thisObject, "getItem", num);
            } catch (Throwable th) {
                c0104d = new C0104d(th);
            }
            if (c0104d instanceof C0104d) {
                c0104d = null;
            }
            if (c0104d == null) {
                return;
            }
            C0842H0 c0842h0 = this.f2751b;
            c0842h0.getClass();
            String strM1599O = C0842H0.m1599O(c0104d);
            if (strM1599O == null) {
                return;
            }
            if (C0842H0.m1617Y0() && iIntValue < 3) {
                AbstractC0731a.m1387d("8076 recycler onBind", "adapter=".concat(methodHookParam.thisObject.getClass().getName()), "item=".concat(c0104d.getClass().getName()), "user=".concat(strM1599O));
            }
            c0842h0.m1675a1(methodHookParam.thisObject, c0104d);
            Object[] objArr2 = methodHookParam.args;
            AbstractC0223g.m417d(objArr2, "args");
            Object objM258f02 = AbstractC0120h.m258f0(0, objArr2);
            if (objM258f02 instanceof View) {
                view = (View) objM258f02;
            } else {
                for (Class<?> superclass = objM258f02 != null ? objM258f02.getClass() : null; superclass != null && !superclass.equals(Object.class); superclass = superclass.getSuperclass()) {
                    try {
                        Field declaredField = superclass.getDeclaredField("itemView");
                        declaredField.setAccessible(true);
                        Object obj = declaredField.get(objM258f02);
                        view = obj instanceof View ? (View) obj : null;
                        break;
                    } catch (Throwable unused) {
                    }
                }
                view = null;
            }
            if (view != null) {
                Object obj2 = methodHookParam.thisObject;
                AbstractC0223g.m417d(obj2, "thisObject");
                if (C0842H0.m1611V0(obj2.getClass(), obj2.getClass().getName(), c0104d)) {
                    C0716t c0716t = c0842h0.f2838O;
                    c0716t.getClass();
                    View viewM1354i = C0716t.m1354i(view);
                    if (viewM1354i == null) {
                        c0917lM1360e = null;
                        if (c0917lM1360e != null) {
                            String strConcat = "adapter=".concat(obj2.getClass().getName());
                            View view2 = c0917lM1360e.f3247b;
                            String name = view2 != null ? view2.getClass().getName() : null;
                            if (name == null) {
                                name = "";
                            }
                            AbstractC0731a.m1387d("8076 recycler cache hit", strConcat, "rv=".concat(name), "source=" + c0917lM1360e.f3253h);
                            c0842h0.m1700r(c0917lM1360e);
                        } else {
                            View viewM1354i2 = C0716t.m1354i(view);
                            c0917lM1360e = viewM1354i2 == null ? null : c0716t.m1360e(viewM1354i2, obj2, c0716t.m1362l(viewM1354i2, obj2));
                            if (c0917lM1360e == null) {
                                AbstractC0731a.m1387d("8076 recycler cache miss", "adapter=".concat(obj2.getClass().getName()), "item=".concat(c0104d.getClass().getName()));
                            }
                        }
                    } else if (((C0915k0) c0716t.f2421e).m1998b(obj2.getClass(), obj2.getClass().getName(), c0104d).booleanValue() && (str = (String) ((C0915k0) c0716t.f2420d).mo8c(c0104d)) != null) {
                        if (AbstractC0307q.m534d0(str)) {
                            str = null;
                        }
                        if (str != null) {
                            c0917lM1360e = c0716t.m1360e(viewM1354i, obj2, new C0920m(AbstractC0079h.m167E(str), AbstractC0079h.m167E(c0104d.getClass().getName()), 1));
                        }
                        if (c0917lM1360e != null) {
                        }
                    }
                } else {
                    AbstractC0731a.m1387d("8076 recycler cache skip", "adapter=".concat(obj2.getClass().getName()), "item=".concat(c0104d.getClass().getName()));
                }
                AbstractC1129l.m2451a(view, strM1599O);
            }
            c0842h0.m1705t1(c0104d, strM1599O);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x0540  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x0587  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x058f  */
    /* JADX WARN: Removed duplicated region for block: B:487:0x07a9  */
    /* JADX WARN: Removed duplicated region for block: B:505:0x080f  */
    /* JADX WARN: Removed duplicated region for block: B:650:0x09e6  */
    /* JADX WARN: Removed duplicated region for block: B:655:0x09f2  */
    @Override // p054c0.AbstractC0509a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws JSONException {
        boolean zM1596M0;
        boolean z2;
        Object c0104d;
        boolean zBooleanValue;
        Integer num;
        boolean z3;
        String strM1599O;
        int i2;
        Object c0104d2;
        Object c0104d3;
        String str;
        String str2;
        boolean zMatches;
        TextView textViewM1576A;
        Object obj;
        String strM1614X;
        String strM1699q1;
        String str3;
        Object obj2;
        Object obj3;
        Object obj4;
        int i3;
        Integer asInteger;
        Object next;
        String str4;
        View decorView;
        Object item;
        boolean z4;
        String str5;
        int i4;
        int i5;
        View viewFindViewWithTag;
        int i6 = 0;
        switch (this.f2750a) {
            case 0:
                AbstractC0223g.m418e(methodHookParam, "param");
                Object obj5 = methodHookParam.args[0];
                C0842H0 c0842h0 = this.f2751b;
                c0842h0.getClass();
                Object objM1584D1 = C0842H0.m1584D1(obj5);
                if (objM1584D1 == null) {
                    return;
                }
                if (C0842H0.m1583D0(objM1584D1.getClass()) || C0842H0.m1596M0()) {
                    c0842h0.m1697q(methodHookParam.thisObject, objM1584D1);
                    c0842h0.m1696p0(objM1584D1.getClass());
                    return;
                }
                return;
            case 1:
                AbstractC0223g.m418e(methodHookParam, "param");
                Object[] objArr = methodHookParam.args;
                Object obj6 = objArr[0];
                ContextMenu contextMenu = obj6 instanceof ContextMenu ? (ContextMenu) obj6 : null;
                if (contextMenu == null) {
                    return;
                }
                Object obj7 = objArr[1];
                View view = obj7 instanceof View ? (View) obj7 : null;
                Object obj8 = methodHookParam.thisObject;
                if (obj8 == null) {
                    return;
                }
                C0842H0 c0842h02 = this.f2751b;
                c0842h02.getClass();
                boolean z5 = AbstractC1126i.f3786a;
                if (C1124g.m2415F()) {
                    String strM1605R = C0842H0.m1605R(obj8);
                    if (strM1605R == null && (strM1605R = C0842H0.m1614X(view)) == null && (strM1605R = (String) c0842h02.f2831H.get(obj8)) == null) {
                        return;
                    }
                    c0842h02.m1693o(contextMenu, strM1605R, c0842h02.m1699q1(view, obj8, strM1605R));
                    return;
                }
                return;
            case 2:
                AbstractC0223g.m418e(methodHookParam, "param");
                Object obj9 = methodHookParam.thisObject;
                ListView listView = obj9 instanceof ListView ? (ListView) obj9 : null;
                if (listView == null) {
                    return;
                }
                C0842H0 c0842h03 = this.f2751b;
                Object[] objArr2 = methodHookParam.args;
                AbstractC0223g.m417d(objArr2, "args");
                Object objM258f0 = AbstractC0120h.m258f0(0, objArr2);
                c0842h03.getClass();
                Object objM1584D12 = C0842H0.m1584D1(objM258f0);
                if (objM1584D12 == null) {
                    return;
                }
                C0842H0 c0842h04 = this.f2751b;
                c0842h04.getClass();
                Class<?> cls = objM1584D12.getClass();
                if (C0842H0.m1583D0(cls) || c0842h04.m1669J0(cls) || c0842h04.m1670K0(cls)) {
                    zM1596M0 = true;
                } else if (AbstractC1135r.m2494p() >= 3060) {
                    C0037j c0037j = c0842h04.f2846W;
                    List list = c0037j != null ? c0037j.f241a : null;
                    if (list == null) {
                        list = C0131s.f426a;
                    }
                    if (list.contains(cls.getName())) {
                        z2 = true;
                        zM1596M0 = z2;
                    } else {
                        if (AbstractC1135r.m2498t()) {
                            if (C0842H0.m1641l(objM1584D12.getClass())) {
                                try {
                                    num = (Integer) AbstractC0514f.f1622b.mo1012c(objM1584D12, "getCount", new Object[0]);
                                } catch (Throwable th) {
                                    th = th;
                                }
                                if (num != null) {
                                    int iMin = Math.min(num.intValue(), 8);
                                    int i7 = 0;
                                    while (i7 < iMin) {
                                        Object objMo1012c = AbstractC0514f.f1622b.mo1012c(objM1584D12, "getItem", Integer.valueOf(i7));
                                        if (objMo1012c == null || (strM1599O = C0842H0.m1599O(objMo1012c)) == null) {
                                            i2 = 1;
                                        } else {
                                            try {
                                                i2 = 1;
                                            } catch (Throwable th2) {
                                                th = th2;
                                                c0104d = new C0104d(th);
                                            }
                                            if (!AbstractC0307q.m534d0(strM1599O)) {
                                                z3 = true;
                                                c0104d = Boolean.valueOf(z3);
                                                Object obj10 = Boolean.FALSE;
                                                if (c0104d instanceof C0104d) {
                                                    c0104d = obj10;
                                                }
                                                zBooleanValue = ((Boolean) c0104d).booleanValue();
                                            }
                                        }
                                        i7 += i2;
                                    }
                                    z3 = false;
                                    c0104d = Boolean.valueOf(z3);
                                    Object obj102 = Boolean.FALSE;
                                    if (c0104d instanceof C0104d) {
                                    }
                                    zBooleanValue = ((Boolean) c0104d).booleanValue();
                                } else {
                                    z3 = false;
                                    c0104d = Boolean.valueOf(z3);
                                    Object obj1022 = Boolean.FALSE;
                                    if (c0104d instanceof C0104d) {
                                    }
                                    zBooleanValue = ((Boolean) c0104d).booleanValue();
                                }
                            } else {
                                zBooleanValue = false;
                            }
                            if (zBooleanValue) {
                            }
                            zM1596M0 = z2;
                        }
                        z2 = false;
                        zM1596M0 = z2;
                    }
                } else {
                    zM1596M0 = C0842H0.m1596M0();
                }
                if (zM1596M0 && this.f2751b.m1697q(listView, objM1584D12)) {
                    this.f2751b.m1696p0(objM1584D12.getClass());
                    return;
                }
                return;
            case 3:
                AbstractC0223g.m418e(methodHookParam, "param");
                Object obj11 = methodHookParam.thisObject;
                if (obj11 == null) {
                    return;
                }
                C0842H0 c0842h05 = this.f2751b;
                c0842h05.getClass();
                Object obj12 = methodHookParam.thisObject;
                Object[] objArr3 = methodHookParam.args;
                AbstractC0223g.m417d(objArr3, "args");
                Object objM258f02 = AbstractC0120h.m258f0(1, objArr3);
                View view2 = objM258f02 instanceof View ? (View) objM258f02 : null;
                String strM1605R2 = obj12 != null ? C0842H0.m1605R(obj12) : null;
                String strM1614X2 = C0842H0.m1614X(view2);
                Object[] objArr4 = methodHookParam.args;
                AbstractC0223g.m417d(objArr4, "args");
                Object objM258f03 = AbstractC0120h.m258f0(0, objArr4);
                AdapterView adapterView = objM258f03 instanceof AdapterView ? (AdapterView) objM258f03 : null;
                if (adapterView == null) {
                    c0104d3 = null;
                } else {
                    Object[] objArr5 = methodHookParam.args;
                    AbstractC0223g.m417d(objArr5, "args");
                    Object objM258f04 = AbstractC0120h.m258f0(2, objArr5);
                    Integer num2 = objM258f04 instanceof Integer ? (Integer) objM258f04 : null;
                    if (num2 != null) {
                        int iIntValue = num2.intValue();
                        try {
                            c0104d2 = adapterView.getItemAtPosition(iIntValue);
                        } catch (Throwable th3) {
                            c0104d2 = new C0104d(th3);
                        }
                        if (c0104d2 instanceof C0104d) {
                            c0104d2 = null;
                        }
                        if (c0104d2 != null) {
                            c0104d3 = c0104d2;
                        } else {
                            ListView listView2 = adapterView instanceof ListView ? (ListView) adapterView : null;
                            int headerViewsCount = iIntValue - (listView2 != null ? listView2.getHeaderViewsCount() : 0);
                            if (headerViewsCount >= 0) {
                                try {
                                    Adapter adapter = adapterView.getAdapter();
                                    ListAdapter listAdapter = adapter instanceof ListAdapter ? (ListAdapter) adapter : null;
                                    c0104d3 = listAdapter != null ? listAdapter.getItem(headerViewsCount) : null;
                                } catch (Throwable th4) {
                                    c0104d3 = new C0104d(th4);
                                }
                                if (c0104d3 instanceof C0104d) {
                                }
                                break;
                            }
                        }
                        break;
                    }
                }
                if (c0104d3 != null) {
                    String strM1616Y = C0842H0.m1616Y(c0104d3);
                    if (strM1616Y == null) {
                        strM1616Y = C0842H0.m1599O(c0104d3);
                    }
                    str = strM1616Y;
                } else {
                    str = null;
                }
                WeakHashMap weakHashMap = c0842h05.f2831H;
                String[] strArr = {strM1605R2, strM1614X2, str, obj12 != null ? (String) weakHashMap.get(obj12) : null};
                int i8 = 0;
                while (true) {
                    if (i8 >= 4) {
                        str2 = null;
                    } else {
                        String str6 = strArr[i8];
                        String string = str6 != null ? AbstractC0299i.m507C0(str6).toString() : null;
                        if (string != null && !AbstractC0307q.m534d0(string)) {
                            String string2 = AbstractC0299i.m507C0(string).toString();
                            if (AbstractC0307q.m534d0(string2) || string2.length() > 80 || AbstractC0299i.m512j0(string2, '\n') || C0842H0.m1588H0(string2) || C0842H0.m1600O0(string2)) {
                                zMatches = false;
                            } else if (C0842H0.m1604Q0(string2)) {
                                zMatches = true;
                            } else {
                                Pattern patternCompile = Pattern.compile("^[A-Za-z0-9_@.\\-]{3,80}$");
                                AbstractC0223g.m417d(patternCompile, "compile(...)");
                                zMatches = patternCompile.matcher(string2).matches();
                            }
                            if (zMatches) {
                                str2 = string;
                            }
                        }
                        i8++;
                    }
                }
                if (str2 == null || AbstractC0307q.m534d0(str2)) {
                    return;
                }
                weakHashMap.put(obj11, str2);
                return;
            case 4:
                AbstractC0223g.m418e(methodHookParam, "param");
                C0842H0 c0842h06 = this.f2751b;
                c0842h06.getClass();
                boolean z6 = AbstractC1126i.f3786a;
                if (C1124g.m2415F()) {
                    Object result = methodHookParam.getResult();
                    View view3 = result instanceof View ? (View) result : null;
                    if (view3 == null || (textViewM1576A = C0842H0.m1576A(view3)) == null) {
                        return;
                    }
                    Object objM1622b0 = C0842H0.m1622b0(methodHookParam.thisObject, "f270194d");
                    if (objM1622b0 == null && (objM1622b0 = C0842H0.m1622b0(methodHookParam.thisObject, "d")) == null) {
                        String[] strArrM1671S = c0842h06.m1671S();
                        int length = strArrM1671S.length;
                        int i9 = 0;
                        while (true) {
                            if (i9 < length) {
                                Object objM1593L = C0842H0.m1593L(methodHookParam.thisObject, strArrM1671S[i9]);
                                if (objM1593L == null) {
                                    i9++;
                                } else {
                                    obj2 = objM1593L;
                                }
                            } else {
                                obj2 = null;
                            }
                        }
                        if (obj2 == null) {
                            return;
                        } else {
                            obj = obj2;
                        }
                    } else {
                        obj = objM1622b0;
                    }
                    MenuItem menuItemM1710z = c0842h06.m1710z(obj);
                    if (menuItemM1710z == null) {
                        return;
                    }
                    C0103c c0103c = (C0103c) c0842h06.f2832I.get(menuItemM1710z);
                    View viewM1612W = C0842H0.m1612W(obj);
                    if (c0103c == null || (strM1614X = (String) c0103c.f394a) == null) {
                        strM1614X = viewM1612W != null ? C0842H0.m1614X(viewM1612W) : null;
                        if (strM1614X == null) {
                            return;
                        }
                    }
                    if (c0103c == null || (str3 = (String) c0103c.f395b) == null || (strM1699q1 = AbstractC0299i.m507C0(str3).toString()) == null) {
                        strM1699q1 = c0842h06.m1699q1(viewM1612W, null, strM1614X);
                    } else {
                        if (!C0842H0.m1602P0(strM1699q1, strM1614X)) {
                            strM1699q1 = null;
                        }
                        if (strM1699q1 == null) {
                        }
                    }
                    String str7 = strM1614X;
                    String str8 = strM1699q1;
                    textViewM1576A.setOnClickListener(new ViewOnClickListenerC0939s0(c0842h06, str7, str8, obj, 1));
                    view3.setOnClickListener(new ViewOnClickListenerC0939s0(c0842h06, str7, str8, obj, 2));
                    return;
                }
                return;
            case 5:
                AbstractC0223g.m418e(methodHookParam, "param");
                C0842H0 c0842h07 = this.f2751b;
                if (c0842h07.f2842S) {
                    return;
                }
                c0842h07.f2839P = null;
                c0842h07.f2840Q = null;
                c0842h07.f2841R = 0L;
                c0842h07.f2842S = false;
                c0842h07.f2843T = null;
                c0842h07.f2844U = null;
                c0842h07.f2845V.clear();
                return;
            case 6:
            case 7:
            case 8:
            case 9:
            case 11:
            case 13:
            case 14:
            case 18:
            case 20:
            case 21:
            case 22:
            default:
                return;
            case 10:
                AbstractC0223g.m418e(methodHookParam, "param");
                C0842H0.m1621b(this.f2751b, methodHookParam.thisObject, "o");
                return;
            case 12:
                AbstractC0223g.m418e(methodHookParam, "param");
                Object result2 = methodHookParam.getResult();
                if ((result2 instanceof Number) && ((Number) result2).longValue() == -1) {
                    return;
                }
                this.f2751b.f2880y = methodHookParam.thisObject;
                Object[] objArr6 = methodHookParam.args;
                AbstractC0223g.m417d(objArr6, "args");
                int length2 = objArr6.length;
                int i10 = 0;
                while (true) {
                    if (i10 < length2) {
                        obj3 = objArr6[i10];
                        if (!(obj3 instanceof String)) {
                            i10++;
                        }
                    } else {
                        obj3 = null;
                    }
                }
                String str9 = obj3 instanceof String ? (String) obj3 : null;
                Object[] objArr7 = methodHookParam.args;
                AbstractC0223g.m417d(objArr7, "args");
                int length3 = objArr7.length;
                int i11 = 0;
                while (true) {
                    if (i11 < length3) {
                        obj4 = objArr7[i11];
                        if (!(obj4 instanceof ContentValues)) {
                            i11++;
                        }
                    } else {
                        obj4 = null;
                    }
                }
                ContentValues contentValues = obj4 instanceof ContentValues ? (ContentValues) obj4 : null;
                if (contentValues == null) {
                    return;
                }
                C0842H0 c0842h08 = this.f2751b;
                Object[] objArr8 = methodHookParam.args;
                c0842h08.getClass();
                if (str9 != null) {
                    String lowerCase = str9.toLowerCase(Locale.ROOT);
                    AbstractC0223g.m417d(lowerCase, "toLowerCase(...)");
                    if (AbstractC0299i.m511i0(lowerCase, "conversation", false)) {
                        String[] strArr2 = C0842H0.f2823q0;
                        int length4 = strArr2.length;
                        int i12 = 0;
                        while (true) {
                            if (i12 >= length4) {
                                asInteger = null;
                            } else {
                                asInteger = contentValues.getAsInteger(strArr2[i12]);
                                if (asInteger == null) {
                                    i12++;
                                }
                            }
                        }
                        if (asInteger != null) {
                            int iIntValue2 = asInteger.intValue();
                            String asString = contentValues.getAsString("username");
                            if (asString == null && (asString = contentValues.getAsString("field_username")) == null && (asString = contentValues.getAsString("talker")) == null && (asString = contentValues.getAsString("field_talker")) == null) {
                                if (objArr8 == null) {
                                    str4 = null;
                                    if (str4 != null) {
                                        asString = str4;
                                        if (C0842H0.m1606R0(asString)) {
                                        }
                                    }
                                } else {
                                    int length5 = objArr8.length;
                                    int i13 = 0;
                                    while (i13 < length5) {
                                        Object obj13 = objArr8[i13];
                                        if (obj13 instanceof String) {
                                            String str10 = (String) obj13;
                                            if (C0842H0.m1606R0(str10)) {
                                                str4 = str10;
                                            } else {
                                                if (obj13 instanceof Object[]) {
                                                    Object[] objArr9 = (Object[]) obj13;
                                                    ArrayList arrayList = new ArrayList();
                                                    int length6 = objArr9.length;
                                                    for (int i14 = i6; i14 < length6; i14++) {
                                                        Object obj14 = objArr9[i14];
                                                        if (obj14 instanceof String) {
                                                            arrayList.add(obj14);
                                                        }
                                                    }
                                                    Iterator it = arrayList.iterator();
                                                    while (true) {
                                                        if (it.hasNext()) {
                                                            next = it.next();
                                                            if (C0842H0.m1606R0((String) next)) {
                                                            }
                                                        } else {
                                                            next = null;
                                                        }
                                                    }
                                                    str4 = (String) next;
                                                    if (str4 != null) {
                                                    }
                                                }
                                                i13++;
                                                i6 = 0;
                                            }
                                            if (str4 != null) {
                                            }
                                        }
                                    }
                                    str4 = null;
                                    if (str4 != null) {
                                    }
                                }
                            } else if (C0842H0.m1606R0(asString)) {
                                c0842h08.f2827D = 0L;
                                c0842h08.m1665E1(iIntValue2, asString);
                            }
                        }
                    }
                }
                C0842H0 c0842h09 = this.f2751b;
                c0842h09.getClass();
                if (str9 != null) {
                    String lowerCase2 = str9.toLowerCase(Locale.ROOT);
                    AbstractC0223g.m417d(lowerCase2, "toLowerCase(...)");
                    if (lowerCase2.equals("message") || AbstractC0307q.m538h0(lowerCase2, false, "message_") || lowerCase2.endsWith("_message")) {
                        String asString2 = contentValues.getAsString("talker");
                        if (asString2 == null && (asString2 = contentValues.getAsString("field_talker")) == null && (asString2 = contentValues.getAsString("username")) == null) {
                            return;
                        }
                        String str11 = asString2;
                        if (C0842H0.m1606R0(str11)) {
                            Integer asInteger2 = contentValues.getAsInteger("isSend");
                            if (asInteger2 == null) {
                                asInteger2 = contentValues.getAsInteger("field_isSend");
                            }
                            if (asInteger2 != null && asInteger2.intValue() == 1) {
                                return;
                            }
                            if (AbstractC1135r.f3833e == -1) {
                                try {
                                    i3 = AbstractC0503h.m991x().getPackageManager().getPackageInfo(AbstractC0503h.m991x().getPackageName(), 0).versionCode;
                                } catch (Exception e2) {
                                    AbstractC0731a.m1385b(e2);
                                    i3 = -1;
                                }
                                AbstractC1135r.f3833e = i3;
                                break;
                            }
                            if (AbstractC1135r.f3833e == 3080) {
                                Long asLong = contentValues.getAsLong("createTime");
                                long jCurrentTimeMillis = (asLong == null && (asLong = contentValues.getAsLong("field_createTime")) == null && (asLong = contentValues.getAsLong("msgCreateTime")) == null && (asLong = contentValues.getAsLong("field_msgCreateTime")) == null) ? System.currentTimeMillis() : asLong.longValue();
                                synchronized (c0842h09.f2830G) {
                                    try {
                                        Long l2 = (Long) c0842h09.f2830G.get(str11);
                                        if (jCurrentTimeMillis > (l2 != null ? l2.longValue() : 0L)) {
                                            c0842h09.f2830G.put(str11, Long.valueOf(jCurrentTimeMillis));
                                        }
                                    } catch (Throwable th5) {
                                        throw th5;
                                    }
                                    break;
                                }
                            }
                            Long asLong2 = contentValues.getAsLong("msgId");
                            long jCurrentTimeMillis2 = (asLong2 == null && (asLong2 = contentValues.getAsLong("msgSvrId")) == null && (asLong2 = contentValues.getAsLong("createTime")) == null) ? System.currentTimeMillis() : asLong2.longValue();
                            String asString3 = contentValues.getAsString("content");
                            if (asString3 == null && (asString3 = contentValues.getAsString("field_content")) == null) {
                                asString3 = "";
                            }
                            c0842h09.m1666F1("db:" + str11 + ":" + jCurrentTimeMillis2 + ":" + asString3.hashCode(), str11);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 15:
                AbstractC0223g.m418e(methodHookParam, "param");
                Object[] objArr10 = methodHookParam.args;
                AbstractC0223g.m417d(objArr10, "args");
                if (AbstractC0223g.m414a(AbstractC0120h.m258f0(0, objArr10), Boolean.TRUE)) {
                    Object obj15 = methodHookParam.thisObject;
                    Activity activity = obj15 instanceof Activity ? (Activity) obj15 : null;
                    if (activity == null) {
                        return;
                    }
                    C0842H0 c0842h010 = this.f2751b;
                    if (c0842h010.m1660A1(activity)) {
                        Iterator it2 = AbstractC0120h.m252Z(new Long[]{0L, 300L, 1000L}).iterator();
                        while (it2.hasNext()) {
                            long jLongValue = ((Number) it2.next()).longValue();
                            Window window = activity.getWindow();
                            if (window != null && (decorView = window.getDecorView()) != null) {
                                decorView.postDelayed(new RunnableC0836F0(c0842h010, activity, 0), jLongValue);
                            }
                        }
                        return;
                    }
                    return;
                }
                return;
            case 16:
                AbstractC0223g.m418e(methodHookParam, "param");
                Object obj16 = methodHookParam.thisObject;
                AbstractC0223g.m416c(obj16, "null cannot be cast to non-null type android.widget.ListAdapter");
                ListAdapter listAdapter2 = (ListAdapter) obj16;
                Object obj17 = methodHookParam.args[0];
                Integer num3 = obj17 instanceof Integer ? (Integer) obj17 : null;
                if (num3 == null || (item = listAdapter2.getItem(num3.intValue())) == null) {
                    return;
                }
                if (AbstractC1135r.m2499u()) {
                    if (AbstractC1135r.f3833e == -1) {
                        try {
                            i5 = AbstractC0503h.m991x().getPackageManager().getPackageInfo(AbstractC0503h.m991x().getPackageName(), 0).versionCode;
                        } catch (Exception e3) {
                            AbstractC0731a.m1385b(e3);
                            i5 = -1;
                        }
                        AbstractC1135r.f3833e = i5;
                    }
                    if (AbstractC1135r.f3833e >= 3060) {
                        z4 = true;
                    }
                    break;
                } else {
                    z4 = false;
                }
                C0842H0 c0842h011 = this.f2751b;
                if (!z4) {
                    C0842H0.m1639j(c0842h011, listAdapter2, item);
                }
                c0842h011.getClass();
                String strM1599O2 = C0842H0.m1599O(item);
                if (strM1599O2 == null) {
                    return;
                }
                if (!c0842h011.m1686l0()) {
                    Object[] objArr11 = methodHookParam.args;
                    AbstractC0223g.m417d(objArr11, "args");
                    c0842h011.m1697q(AbstractC0120h.m258f0(2, objArr11), listAdapter2);
                }
                boolean zM1606R0 = C0842H0.m1606R0(strM1599O2);
                Object result3 = methodHookParam.getResult();
                View view4 = result3 instanceof View ? (View) result3 : null;
                if (view4 == null) {
                    Object obj18 = methodHookParam.args[1];
                    View view5 = obj18 instanceof View ? (View) obj18 : null;
                    if (view5 == null) {
                        return;
                    } else {
                        view4 = view5;
                    }
                }
                AbstractC1129l.m2451a(view4, strM1599O2);
                if (!z4 || zM1606R0) {
                    c0842h011.m1705t1(item, strM1599O2);
                    if (C0842H0.m1608T0() && C0842H0.m1608T0()) {
                        C0842H0.m1646s1(view4);
                    }
                    if ((z4 || !C0842H0.m1619a(c0842h011, view4, strM1599O2, item)) && zM1606R0) {
                        C0842H0.m1640k(c0842h011, item, strM1599O2);
                        boolean z7 = AbstractC1126i.f3786a;
                        if (C1124g.m2447w()) {
                            if (C0842H0.m1638i(c0842h011, item)) {
                                C0842H0.m1624c(c0842h011, item, strM1599O2);
                            } else {
                                C0842H0.m1656x1(item);
                            }
                            if (AbstractC1135r.f3833e == -1) {
                                try {
                                    i4 = AbstractC0503h.m991x().getPackageManager().getPackageInfo(AbstractC0503h.m991x().getPackageName(), 0).versionCode;
                                } catch (Exception e4) {
                                    AbstractC0731a.m1385b(e4);
                                    i4 = -1;
                                }
                                AbstractC1135r.f3833e = i4;
                            }
                            int i15 = AbstractC1135r.f3833e;
                            int iM103a = AbstractC0056b.m103a((i15 < 0 || i15 >= 2141) ? (2140 > i15 || i15 >= 2421) ? i15 == 2429 ? "i2_" : "ht5" : "fhs" : "last_msg_tv");
                            if (iM103a != 0 && iM103a != -1) {
                                try {
                                    View viewFindViewById = view4.findViewById(iM103a);
                                    if (viewFindViewById != null) {
                                        AbstractC0514f.m1024a(viewFindViewById, "setText", "");
                                    }
                                } catch (Throwable th6) {
                                    AbstractC0731a.m1387d("hide last message text fail", th6);
                                }
                            }
                            View viewFindViewWithTag2 = view4.findViewWithTag("last_msg_tv");
                            if (viewFindViewWithTag2 != null) {
                                AbstractC0514f.m1024a(viewFindViewWithTag2, "setText", "");
                            }
                            if (iM103a == -1 || iM103a == 0) {
                                AbstractC0731a.m1387d("???last???id?��?????????????????", AbstractC1135r.m2493o());
                                ClassLoader classLoader = AbstractC0503h.m991x().getClassLoader();
                                AbstractC0223g.m418e(classLoader, "classLoader");
                                final Class clsMo1021l = AbstractC0514f.f1622b.mo1021l(classLoader, "com.tencent.mm.ui.base.NoMeasuredTextView");
                                InterfaceC1033a interfaceC1033a = new InterfaceC1033a() { // from class: r0.G0
                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                    /* JADX WARN: Removed duplicated region for block: B:7:0x0012 A[Catch: all -> 0x0029, TryCatch #0 {all -> 0x0029, blocks: (B:4:0x0006, B:9:0x001e, B:7:0x0012), top: B:12:0x0006 }] */
                                    @Override // p097x.InterfaceC1033a
                                    /* JADX INFO: renamed from: a */
                                    /*
                                        Code decompiled incorrectly, please refer to instructions dump.
                                    */
                                    public final void mo1575a(Object obj19) {
                                        View view6 = (View) obj19;
                                        Class cls2 = clsMo1021l;
                                        if (cls2 != null) {
                                            try {
                                                if (!cls2.isAssignableFrom(view6.getClass())) {
                                                    if (!TextView.class.isAssignableFrom(view6.getClass())) {
                                                        return;
                                                    }
                                                }
                                            } catch (Throwable unused) {
                                                return;
                                            }
                                        }
                                        AbstractC0514f.m1024a(view6, "setText", "");
                                    }
                                };
                                if (view4 instanceof ViewGroup) {
                                    interfaceC1033a.mo1575a(view4);
                                    ArrayList arrayList2 = new ArrayList();
                                    arrayList2.add((ViewGroup) view4);
                                    while (arrayList2.size() > 0) {
                                        ViewGroup viewGroup = (ViewGroup) arrayList2.get(0);
                                        arrayList2.remove(0);
                                        for (int i16 = 0; i16 < viewGroup.getChildCount(); i16++) {
                                            View childAt = viewGroup.getChildAt(i16);
                                            interfaceC1033a.mo1575a(childAt);
                                            if (childAt instanceof ViewGroup) {
                                                arrayList2.add((ViewGroup) childAt);
                                            }
                                        }
                                    }
                                }
                            }
                            break;
                        }
                        if (C0842H0.m1637h(c0842h011)) {
                            if (C0842H0.m1638i(c0842h011, item)) {
                                C0842H0.m1626d(c0842h011, item);
                            } else {
                                C0842H0.m1658y1(item);
                            }
                            int iM2494p = AbstractC1135r.m2494p();
                            if (iM2494p >= 0 && iM2494p < 2141) {
                                str5 = "tipcnt_tv";
                            } else if (iM2494p == 2429) {
                                str5 = "oqu";
                            } else {
                                if (2140 <= iM2494p) {
                                }
                                str5 = "kmv";
                            }
                            View viewFindViewById2 = view4.findViewById(AbstractC0056b.m103a(str5));
                            if (viewFindViewById2 != null) {
                                viewFindViewById2.setVisibility(4);
                            }
                            int iM2494p2 = AbstractC1135r.m2494p();
                            View viewFindViewById3 = view4.findViewById(AbstractC0056b.m103a((iM2494p2 < 0 || iM2494p2 >= 2421) ? iM2494p2 == 2429 ? "a_w" : "o_u" : "a2f"));
                            if (viewFindViewById3 != null) {
                                viewFindViewById3.setVisibility(4);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 17:
                AbstractC0223g.m418e(methodHookParam, "param");
                Object result4 = methodHookParam.getResult();
                if (result4 == null) {
                    return;
                }
                C0842H0 c0842h012 = this.f2751b;
                c0842h012.getClass();
                String strM1599O3 = C0842H0.m1599O(result4);
                if (strM1599O3 == null) {
                    return;
                }
                WeakReference weakReference = c0842h012.f2856d;
                C0842H0.m1639j(c0842h012, weakReference != null ? weakReference.get() : null, result4);
                boolean z8 = AbstractC1126i.f3786a;
                MaskItemBean maskItemBean = !C1124g.m2443s() ? null : (MaskItemBean) ((C0808h) AbstractC0503h.m988u(C0808h.class)).f2686c.get(strM1599O3);
                Object[] objArr12 = methodHookParam.args;
                AbstractC0223g.m417d(objArr12, "args");
                Object objM258f05 = AbstractC0120h.m258f0(1, objArr12);
                View view6 = objM258f05 instanceof View ? (View) objM258f05 : null;
                if ((view6 == null || !C0842H0.m1619a(c0842h012, view6, strM1599O3, result4)) && maskItemBean != null) {
                    c0842h012.m1705t1(result4, strM1599O3);
                    C0842H0.m1640k(c0842h012, result4, strM1599O3);
                    if (C1124g.m2447w()) {
                        C0842H0.m1656x1(result4);
                        if (view6 != null && (viewFindViewWithTag = view6.findViewWithTag("last_msg_tv")) != null) {
                            try {
                                AbstractC0514f.f1622b.mo1012c(viewFindViewWithTag, "setText", "");
                                break;
                            } catch (Throwable unused) {
                            }
                        }
                    }
                    if (C0842H0.m1637h(c0842h012)) {
                        C0842H0.m1658y1(result4);
                        return;
                    }
                    return;
                }
                return;
            case 19:
                AbstractC0223g.m418e(methodHookParam, "param");
                Object obj19 = methodHookParam.thisObject;
                PopupWindow popupWindow = obj19 instanceof PopupWindow ? (PopupWindow) obj19 : null;
                if (popupWindow == null) {
                    return;
                }
                Object[] objArr13 = methodHookParam.args;
                AbstractC0223g.m417d(objArr13, "args");
                Object objM258f06 = AbstractC0120h.m258f0(0, objArr13);
                View view7 = objM258f06 instanceof View ? (View) objM258f06 : null;
                if (view7 == null) {
                    return;
                }
                C0842H0 c0842h013 = this.f2751b;
                c0842h013.m1709y0(popupWindow, "setContentView");
                if (C0842H0.m1576A(view7) != null || c0842h013.m1664E0()) {
                    c0842h013.m1690m1(popupWindow, "setContentView");
                    return;
                }
                return;
            case 23:
                m1502a(methodHookParam);
                return;
            case 24:
                AbstractC0223g.m418e(methodHookParam, "param");
                Object obj20 = methodHookParam.thisObject;
                Activity activity2 = obj20 instanceof Activity ? (Activity) obj20 : null;
                if (activity2 == null) {
                    return;
                }
                C0842H0 c0842h014 = this.f2751b;
                if (c0842h014.m1660A1(activity2) && !c0842h014.m1686l0()) {
                    c0842h014.m1708x("launcher-resume");
                    return;
                }
                return;
            case 25:
                AbstractC0223g.m418e(methodHookParam, "param");
                Object[] objArr14 = methodHookParam.args;
                AbstractC0223g.m417d(objArr14, "args");
                Object objM258f07 = AbstractC0120h.m258f0(0, objArr14);
                if (objM258f07 == null) {
                    return;
                }
                C0842H0 c0842h015 = this.f2751b;
                c0842h015.getClass();
                String strM1616Y2 = C0842H0.m1616Y(objM258f07);
                if (C0842H0.m1606R0(strM1616Y2)) {
                    C0842H0.m1640k(c0842h015, objM258f07, strM1616Y2);
                    boolean z9 = AbstractC1126i.f3786a;
                    if (C1124g.m2447w()) {
                        C0842H0.m1624c(c0842h015, methodHookParam.getResult(), strM1616Y2);
                    }
                    if (C0842H0.m1637h(c0842h015)) {
                        C0842H0.m1626d(c0842h015, methodHookParam.getResult());
                        return;
                    }
                    return;
                }
                return;
            case 26:
                AbstractC0223g.m418e(methodHookParam, "param");
                Object[] objArr15 = methodHookParam.args;
                AbstractC0223g.m417d(objArr15, "args");
                Object objM258f08 = AbstractC0120h.m258f0(0, objArr15);
                if (objM258f08 == null) {
                    return;
                }
                Object[] objArr16 = methodHookParam.args;
                AbstractC0223g.m417d(objArr16, "args");
                Object objM258f09 = AbstractC0120h.m258f0(1, objArr16);
                C0842H0 c0842h016 = this.f2751b;
                c0842h016.getClass();
                String strM1616Y3 = C0842H0.m1616Y(objM258f08);
                if (C0842H0.m1606R0(strM1616Y3)) {
                    C0842H0.m1640k(c0842h016, objM258f08, strM1616Y3);
                    boolean z10 = AbstractC1126i.f3786a;
                    if (C1124g.m2447w()) {
                        C0842H0.m1624c(c0842h016, objM258f09, strM1616Y3);
                    }
                    if (C0842H0.m1637h(c0842h016)) {
                        C0842H0.m1626d(c0842h016, objM258f09);
                        return;
                    }
                    return;
                }
                return;
            case 27:
                AbstractC0223g.m418e(methodHookParam, "param");
                Object[] objArr17 = methodHookParam.args;
                AbstractC0223g.m417d(objArr17, "args");
                Object objM258f010 = AbstractC0120h.m258f0(1, objArr17);
                if (objM258f010 == null) {
                    return;
                }
                Object[] objArr18 = methodHookParam.args;
                AbstractC0223g.m417d(objArr18, "args");
                Object objM258f011 = AbstractC0120h.m258f0(2, objArr18);
                C0842H0 c0842h017 = this.f2751b;
                c0842h017.getClass();
                String strM1616Y4 = C0842H0.m1616Y(objM258f010);
                if (C0842H0.m1606R0(strM1616Y4)) {
                    C0842H0.m1640k(c0842h017, objM258f010, strM1616Y4);
                    boolean z11 = AbstractC1126i.f3786a;
                    if (C1124g.m2447w()) {
                        C0842H0.m1624c(c0842h017, objM258f011, strM1616Y4);
                        methodHookParam.setResult("");
                    }
                    if (C0842H0.m1637h(c0842h017)) {
                        C0842H0.m1626d(c0842h017, objM258f011);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:134:0x0246 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:592:0x0378 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0551  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x06dd  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x072b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:446:0x07cf  */
    /* JADX WARN: Removed duplicated region for block: B:548:0x093a  */
    /* JADX WARN: Removed duplicated region for block: B:596:0x036f A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v3, types: [java.lang.Object, java.util.Collection, java.util.Set] */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v6, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r14v8, types: [java.lang.Object, java.util.Collection, java.util.LinkedHashSet] */
    /* JADX WARN: Type inference failed for: r7v49, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v50, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v51, types: [java.util.ArrayList] */
    @Override // p054c0.AbstractC0509a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        View view;
        Object obj;
        MenuItem menuItemM1629e;
        String strM1614X;
        Object obj2;
        String str;
        String string;
        Object objM1622b0;
        String strM1605R;
        Object objM1622b02;
        Integer numM1618Z;
        MenuItem menuItemM1629e2;
        String strM1614X2;
        Object obj3;
        String str2;
        String string2;
        Object obj4;
        String maskId;
        String str3;
        C0842H0 c0842h0;
        String str4;
        Object next;
        Object next2;
        Object c0104d;
        int iIntValue;
        int i2;
        int iIntValue2;
        Integer numM530Z;
        int i3;
        String string3;
        ArrayList arrayList;
        ?? M281w0;
        String string4;
        Object next3;
        String string5;
        String string6;
        String string7;
        Object obj5;
        boolean z2 = true;
        z2 = true;
        int i4 = 0;
        switch (this.f2750a) {
            case 6:
                View.OnCreateContextMenuListener onCreateContextMenuListener = null;
                AbstractC0223g.m418e(methodHookParam, "param");
                Object obj6 = methodHookParam.args[3];
                if (obj6 instanceof View.OnCreateContextMenuListener) {
                    view = null;
                    onCreateContextMenuListener = (View.OnCreateContextMenuListener) obj6;
                } else {
                    view = null;
                }
                if (onCreateContextMenuListener != null) {
                    C0842H0 c0842h02 = this.f2751b;
                    c0842h02.getClass();
                    boolean z3 = AbstractC1126i.f3786a;
                    if (C1124g.m2415F()) {
                        Object[] objArr = methodHookParam.args;
                        Object obj7 = objArr[0];
                        View view2 = obj7 instanceof View ? (View) obj7 : view;
                        boolean z4 = AbstractC0120h.m258f0(1, objArr) instanceof Integer;
                        String strM1605R2 = C0842H0.m1605R(onCreateContextMenuListener);
                        if (strM1605R2 == null && (strM1605R2 = C0842H0.m1614X(view2)) == null) {
                            strM1605R2 = (String) c0842h02.f2831H.get(onCreateContextMenuListener);
                        }
                        String str5 = strM1605R2;
                        if (str5 != null && !AbstractC0307q.m534d0(str5)) {
                            methodHookParam.args[3] = new ViewOnCreateContextMenuListenerC0882Z(onCreateContextMenuListener, c0842h02, str5, methodHookParam, 1);
                            break;
                        }
                    }
                }
                break;
            case 7:
                AbstractC0223g.m418e(methodHookParam, "param");
                C0842H0 c0842h03 = this.f2751b;
                c0842h03.getClass();
                boolean z5 = AbstractC1126i.f3786a;
                if (C1124g.m2415F()) {
                    Object obj8 = methodHookParam.thisObject;
                    if (obj8 == null) {
                        obj = null;
                    } else if (AbstractC0120h.m254b0(c0842h03.m1671S(), obj8.getClass().getName())) {
                        obj = obj8;
                    } else {
                        Object objM1622b03 = C0842H0.m1622b0(obj8, "d");
                        if (objM1622b03 == null && (objM1622b03 = C0842H0.m1622b0(obj8, "f270194d")) == null) {
                            String[] strArrM1671S = c0842h03.m1671S();
                            int length = strArrM1671S.length;
                            while (i4 < length) {
                                Object objM1593L = C0842H0.m1593L(obj8, strArrM1671S[i4]);
                                if (objM1593L == null) {
                                    i4++;
                                } else {
                                    obj = objM1593L;
                                }
                            }
                            obj = null;
                        } else {
                            obj = objM1622b03;
                        }
                    }
                    if (obj != null) {
                        Object[] objArr2 = methodHookParam.args;
                        AbstractC0223g.m417d(objArr2, "args");
                        Object objM258f0 = AbstractC0120h.m258f0(2, objArr2);
                        Integer num = objM258f0 instanceof Integer ? (Integer) objM258f0 : null;
                        if (num != null && (menuItemM1629e = C0842H0.m1629e(c0842h03, obj, num.intValue())) != null && C0842H0.m1586F0(menuItemM1629e)) {
                            C0103c c0103c = (C0103c) c0842h03.f2832I.get(menuItemM1629e);
                            View viewM1612W = C0842H0.m1612W(obj);
                            if (c0103c == null || (strM1614X = (String) c0103c.f394a) == null) {
                                strM1614X = viewM1612W != null ? C0842H0.m1614X(viewM1612W) : null;
                                if (strM1614X == null) {
                                }
                            }
                            if (c0103c == null || (str = (String) c0103c.f395b) == null || (string = AbstractC0299i.m507C0(str).toString()) == null) {
                                obj2 = null;
                                c0842h03.m1699q1(viewM1612W, null, strM1614X);
                            } else {
                                if (!C0842H0.m1602P0(string, strM1614X)) {
                                    string = null;
                                }
                                if (string != null) {
                                    obj2 = null;
                                }
                            }
                            c0842h03.m1688m(strM1614X);
                            c0842h03.m1706v(obj);
                            methodHookParam.setResult(obj2);
                            break;
                        }
                    }
                }
                break;
            case 8:
                AbstractC0223g.m418e(methodHookParam, "param");
                C0842H0 c0842h04 = this.f2751b;
                c0842h04.getClass();
                boolean z6 = AbstractC1126i.f3786a;
                if (C1124g.m2415F()) {
                    Object[] objArr3 = methodHookParam.args;
                    AbstractC0223g.m417d(objArr3, "args");
                    Object objM258f02 = AbstractC0120h.m258f0(0, objArr3);
                    MenuItem menuItem = objM258f02 instanceof MenuItem ? (MenuItem) objM258f02 : null;
                    if (menuItem != null && menuItem.getItemId() == 1835102465) {
                        Object obj9 = methodHookParam.thisObject;
                        if (obj9 == null) {
                            objM1622b0 = null;
                        } else {
                            String[] strArr = {"f203780d", "f206374d", "f207175d"};
                            while (i4 < 3) {
                                objM1622b0 = C0842H0.m1622b0(obj9, strArr[i4]);
                                if (objM1622b0 == null) {
                                    i4++;
                                }
                            }
                            objM1622b0 = null;
                        }
                        if (objM1622b0 == null || (strM1605R = C0842H0.m1605R(objM1622b0)) == null) {
                            strM1605R = objM1622b0 != null ? (String) c0842h04.f2831H.get(objM1622b0) : null;
                            if (strM1605R == null) {
                            }
                        }
                        if (objM1622b0 != null) {
                            C0842H0.m1601P(objM1622b0, strM1605R);
                        }
                        c0842h04.m1688m(strM1605R);
                        methodHookParam.setResult((Object) null);
                    }
                    break;
                }
                break;
            case 9:
                AbstractC0223g.m418e(methodHookParam, "param");
                Object[] objArr4 = methodHookParam.args;
                AbstractC0223g.m417d(objArr4, "args");
                Object objM258f03 = AbstractC0120h.m258f0(0, objArr4);
                View.OnLongClickListener onLongClickListener = objM258f03 instanceof View.OnLongClickListener ? (View.OnLongClickListener) objM258f03 : null;
                if (onLongClickListener != null && !AbstractC0299i.m511i0(onLongClickListener.getClass().getName(), "HideMainUIListPluginPart", false)) {
                    methodHookParam.args[0] = new ViewOnLongClickListenerC0888b0(onLongClickListener, this.f2751b, z2 ? 1 : 0);
                }
                break;
            case 11:
                AbstractC0223g.m418e(methodHookParam, "param");
                C0842H0 c0842h05 = this.f2751b;
                c0842h05.getClass();
                boolean z7 = AbstractC1126i.f3786a;
                if (C1124g.m2415F() && (objM1622b02 = C0842H0.m1622b0(methodHookParam.thisObject, "f270168e")) != null && (numM1618Z = C0842H0.m1618Z(methodHookParam.thisObject, "f270167d")) != null && (menuItemM1629e2 = C0842H0.m1629e(c0842h05, objM1622b02, numM1618Z.intValue())) != null && C0842H0.m1586F0(menuItemM1629e2)) {
                    C0103c c0103c2 = (C0103c) c0842h05.f2832I.get(menuItemM1629e2);
                    View view3 = (View) C0842H0.m1622b0(objM1622b02, "f270201f");
                    if (c0103c2 == null || (strM1614X2 = (String) c0103c2.f394a) == null) {
                        strM1614X2 = view3 != null ? C0842H0.m1614X(view3) : null;
                        if (strM1614X2 == null) {
                        }
                    }
                    if (c0103c2 == null || (str2 = (String) c0103c2.f395b) == null || (string2 = AbstractC0299i.m507C0(str2).toString()) == null) {
                        obj3 = null;
                        c0842h05.m1699q1(view3, null, strM1614X2);
                    } else {
                        if (!C0842H0.m1602P0(string2, strM1614X2)) {
                            string2 = null;
                        }
                        if (string2 != null) {
                            obj3 = null;
                        }
                    }
                    c0842h05.m1688m(strM1614X2);
                    c0842h05.m1706v(objM1622b02);
                    methodHookParam.setResult(obj3);
                }
                break;
            case 13:
                AbstractC0223g.m418e(methodHookParam, "param");
                boolean z8 = AbstractC1126i.f3786a;
                if (C1124g.m2448x()) {
                    Object[] objArr5 = methodHookParam.args;
                    AbstractC0223g.m417d(objArr5, "args");
                    int length2 = objArr5.length;
                    int i5 = 0;
                    while (true) {
                        if (i5 < length2) {
                            obj4 = objArr5[i5];
                            if (!(obj4 instanceof Notification)) {
                                i5++;
                            }
                        } else {
                            obj4 = null;
                        }
                    }
                    Notification notification = obj4 instanceof Notification ? (Notification) obj4 : null;
                    if (notification != null) {
                        this.f2751b.getClass();
                        Bundle bundle = notification.extras;
                        String[] strArr2 = {"android.title", "android.text", "android.subText", "android.bigText", "android.title", "android.text", "android.subText", "android.bigText"};
                        StringBuilder sb = new StringBuilder();
                        for (int i6 = 0; i6 < 8; i6++) {
                            String str6 = strArr2[i6];
                            if (bundle != null) {
                                try {
                                    c0104d = bundle.get(str6);
                                } catch (Throwable th) {
                                    c0104d = new C0104d(th);
                                }
                            } else {
                                c0104d = null;
                            }
                            if (c0104d instanceof C0104d) {
                                c0104d = null;
                            }
                            if (c0104d != null) {
                                sb.append(c0104d);
                                sb.append(' ');
                            }
                            break;
                        }
                        sb.append(bundle);
                        String string8 = sb.toString();
                        AbstractC0223g.m417d(string8, "toString(...)");
                        this.f2751b.getClass();
                        if (AbstractC0307q.m534d0(string8)) {
                            maskId = null;
                        } else {
                            ((C0808h) AbstractC0503h.m988u(C0808h.class)).m1474c();
                            boolean z9 = AbstractC1126i.f3786a;
                            ArrayList arrayListM266h0 = AbstractC0123k.m266h0(!C1124g.m2443s() ? C0131s.f426a : new ArrayList(((C0808h) AbstractC0503h.m988u(C0808h.class)).f2684a));
                            ArrayList arrayList2 = new ArrayList();
                            for (Object obj10 : arrayListM266h0) {
                                if (!AbstractC0307q.m534d0((String) obj10)) {
                                    arrayList2.add(obj10);
                                }
                            }
                            Iterator it = arrayList2.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    next = it.next();
                                    if (AbstractC0299i.m511i0(string8, (String) next, false)) {
                                    }
                                } else {
                                    next = null;
                                }
                            }
                            maskId = (String) next;
                            if (maskId == null) {
                                boolean z10 = AbstractC1126i.f3786a;
                                Iterator it2 = C1124g.m2433i().iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        next2 = it2.next();
                                        MaskItemBean maskItemBean = (MaskItemBean) next2;
                                        if (AbstractC0307q.m534d0(maskItemBean.getTagName()) || !AbstractC0299i.m511i0(string8, maskItemBean.getTagName(), false)) {
                                        }
                                    } else {
                                        next2 = null;
                                    }
                                }
                                MaskItemBean maskItemBean2 = (MaskItemBean) next2;
                                if (maskItemBean2 != null) {
                                    maskId = maskItemBean2.getMaskId();
                                }
                            }
                        }
                        if (maskId == null && (str4 = (c0842h0 = this.f2751b).f2881z) != null && C0842H0.m1606R0(str4)) {
                            boolean z11 = AbstractC1126i.f3786a;
                            if (!C1124g.m2429e(str4)) {
                                long jCurrentTimeMillis = System.currentTimeMillis() - c0842h0.f2824A;
                                if (0 <= jCurrentTimeMillis && jCurrentTimeMillis < 8001 && (str3 = c0842h0.f2881z) != null && C0842H0.m1606R0(str3) && !C1124g.m2429e(str3)) {
                                    long jCurrentTimeMillis2 = System.currentTimeMillis() - c0842h0.f2824A;
                                    if (0 > jCurrentTimeMillis2 || jCurrentTimeMillis2 >= 8001) {
                                    }
                                }
                            }
                        } else {
                            str3 = null;
                        }
                        if (maskId == null) {
                            if (str3 != null) {
                                maskId = str3;
                            }
                        }
                        this.f2751b.m1666F1("notification:" + maskId + ":" + string8.hashCode(), maskId);
                        methodHookParam.setResult((Object) null);
                        break;
                    }
                }
                break;
            case 14:
                AbstractC0223g.m418e(methodHookParam, "param");
                boolean z12 = AbstractC1126i.f3786a;
                if (C1124g.m2448x()) {
                    Object[] objArr6 = methodHookParam.args;
                    AbstractC0223g.m417d(objArr6, "args");
                    Object objM258f04 = AbstractC0120h.m258f0(0, objArr6);
                    Number number = objM258f04 instanceof Number ? (Number) objM258f04 : null;
                    if (number != null && (iIntValue = number.intValue()) > 0) {
                        C0842H0 c0842h06 = this.f2751b;
                        c0842h06.getClass();
                        LinkedHashSet<String> linkedHashSet = new LinkedHashSet();
                        Iterator it3 = C1124g.m2433i().iterator();
                        while (it3.hasNext()) {
                            String string9 = AbstractC0299i.m507C0(((MaskItemBean) it3.next()).getMaskId()).toString();
                            if (!AbstractC0307q.m534d0(string9)) {
                                boolean z13 = AbstractC1126i.f3786a;
                                if (!C1124g.m2429e(string9)) {
                                    linkedHashSet.add(string9);
                                    C1143z c1143z = C1143z.f3876a;
                                    C1142y c1142yM2528b = C1143z.m2528b(string9);
                                    if (c1142yM2528b != null) {
                                        List<String> listM252Z = AbstractC0120h.m252Z(new String[]{c1142yM2528b.f3868a, c1142yM2528b.f3869b, c1142yM2528b.f3870c});
                                        ArrayList arrayList3 = new ArrayList();
                                        for (String str7 : listM252Z) {
                                            if (str7 == null || (string3 = AbstractC0299i.m507C0(str7).toString()) == null || AbstractC0307q.m534d0(string3)) {
                                                string3 = null;
                                            }
                                            if (string3 != null) {
                                                arrayList3.add(string3);
                                            }
                                        }
                                        Iterator it4 = arrayList3.iterator();
                                        while (it4.hasNext()) {
                                            linkedHashSet.add((String) it4.next());
                                        }
                                    }
                                }
                            }
                        }
                        if (linkedHashSet.isEmpty()) {
                            c0842h06.f2829F = true;
                            i2 = 0;
                        } else {
                            String strM271m0 = AbstractC0123k.m271m0(AbstractC0123k.m275q0(linkedHashSet), ",", null, null, null, 62);
                            C1143z c1143z2 = C1143z.f3876a;
                            String str8 = C1143z.f3879d + "|" + strM271m0;
                            long jCurrentTimeMillis3 = System.currentTimeMillis();
                            if (!AbstractC0223g.m414a(str8, c0842h06.f2826C) || jCurrentTimeMillis3 - c0842h06.f2827D >= 200) {
                                String strM353i = AbstractC0174d.m353i("select username,unReadCount from rconversation where username in (", AbstractC0123k.m271m0(linkedHashSet, ",", null, null, new C0863P(16), 30), ")");
                                ArrayList arrayList4 = new ArrayList(AbstractC0125m.m289c0(linkedHashSet));
                                for (String str9 : linkedHashSet) {
                                    AbstractC0223g.m416c(str9, "null cannot be cast to non-null type kotlin.Any");
                                    arrayList4.add(str9);
                                }
                                List listM2531e = C1143z.m2531e(strM353i, arrayList4.toArray(new Object[0]));
                                if (!listM2531e.isEmpty() || c0842h06.f2828E <= 0) {
                                    if (listM2531e.isEmpty()) {
                                        C1143z c1143z3 = C1143z.f3876a;
                                        if (C1143z.m2531e("select count(*) as total from rconversation", new Object[0]).isEmpty()) {
                                            z2 = false;
                                        }
                                    }
                                    Iterator it5 = listM2531e.iterator();
                                    int i7 = 0;
                                    while (it5.hasNext()) {
                                        String str10 = (String) ((Map) it5.next()).get("unReadCount");
                                        if (str10 == null || (numM530Z = AbstractC0306p.m530Z(str10)) == null || (iIntValue2 = numM530Z.intValue()) < 0) {
                                            iIntValue2 = 0;
                                        }
                                        i7 += iIntValue2;
                                    }
                                    c0842h06.f2826C = str8;
                                    c0842h06.f2827D = jCurrentTimeMillis3;
                                    c0842h06.f2828E = i7;
                                    c0842h06.f2829F = z2;
                                    i2 = i7;
                                } else {
                                    String str11 = c0842h06.f2826C;
                                    if (AbstractC0223g.m414a(str11 != null ? AbstractC0299i.m524v0(str11, '|') : null, strM271m0) && jCurrentTimeMillis3 - c0842h06.f2827D < 1500) {
                                        c0842h06.f2827D = jCurrentTimeMillis3;
                                        i2 = c0842h06.f2828E;
                                    }
                                }
                            } else {
                                i2 = c0842h06.f2828E;
                            }
                        }
                        if (!this.f2751b.f2829F || (i3 = iIntValue - i2) < 0) {
                            i3 = 0;
                        }
                        if (i3 != iIntValue) {
                            methodHookParam.args[0] = Integer.valueOf(i3);
                        }
                        break;
                    }
                }
                break;
            case 18:
                AbstractC0223g.m418e(methodHookParam, "param");
                this.f2751b.getClass();
                if (C0842H0.m1608T0() && !AbstractC0223g.m414a(this.f2751b.f2859e0.get(), Boolean.TRUE)) {
                    Object[] objArr7 = methodHookParam.args;
                    AbstractC0223g.m417d(objArr7, "args");
                    Object objM258f05 = AbstractC0120h.m258f0(0, objArr7);
                    List list = objM258f05 instanceof List ? (List) objM258f05 : null;
                    if (list != null) {
                        C0842H0 c0842h07 = this.f2751b;
                        c0842h07.getClass();
                        if (list.isEmpty() || list.isEmpty()) {
                            arrayList = null;
                        } else {
                            Iterator it6 = list.iterator();
                            while (true) {
                                if (it6.hasNext()) {
                                    if (C0842H0.m1599O(it6.next()) != null) {
                                        boolean z14 = AbstractC1126i.f3786a;
                                        if (C1124g.m2448x()) {
                                            M281w0 = new ArrayList();
                                            for (Object obj11 : list) {
                                                String strM1599O = C0842H0.m1599O(obj11);
                                                if (strM1599O != null && (string4 = AbstractC0299i.m507C0(strM1599O).toString()) != null) {
                                                    if (AbstractC0307q.m534d0(string4)) {
                                                        string4 = null;
                                                    }
                                                    if (string4 != null) {
                                                        boolean z15 = AbstractC1126i.f3786a;
                                                        ArrayList arrayListM2433i = C1124g.m2433i();
                                                        ArrayList<String> arrayList5 = new ArrayList();
                                                        Iterator it7 = arrayListM2433i.iterator();
                                                        while (it7.hasNext()) {
                                                            String maskId2 = ((MaskItemBean) it7.next()).getMaskId();
                                                            if (maskId2 == null || (string7 = AbstractC0299i.m507C0(maskId2).toString()) == null || AbstractC0307q.m534d0(string7)) {
                                                                string7 = null;
                                                            }
                                                            if (string7 != null) {
                                                                arrayList5.add(string7);
                                                            }
                                                        }
                                                        String strM271m02 = AbstractC0123k.m271m0(arrayList5, "|", null, null, null, 62);
                                                        boolean z16 = c0842h07.f2880y != null;
                                                        ?? r14 = c0842h07.f2857d0;
                                                        if (AbstractC0223g.m414a(c0842h07.f2855c0, strM271m02)) {
                                                            boolean zIsEmpty = r14.isEmpty();
                                                            ?? linkedHashSet2 = r14;
                                                            if (zIsEmpty) {
                                                                linkedHashSet2 = 0;
                                                                if (linkedHashSet2 == 0) {
                                                                    C1143z.f3876a.m2534h(c0842h07.f2880y);
                                                                    linkedHashSet2 = new LinkedHashSet();
                                                                    for (String str12 : arrayList5) {
                                                                        linkedHashSet2.add(str12);
                                                                        C1143z c1143z4 = C1143z.f3876a;
                                                                        C1142y c1142yM2528b2 = C1143z.m2528b(str12);
                                                                        if (c1142yM2528b2 != null) {
                                                                            List<String> listM252Z2 = AbstractC0120h.m252Z(new String[]{c1142yM2528b2.f3868a, c1142yM2528b2.f3869b, c1142yM2528b2.f3870c});
                                                                            ArrayList arrayList6 = new ArrayList();
                                                                            for (String str13 : listM252Z2) {
                                                                                if (str13 == null || (string6 = AbstractC0299i.m507C0(str13).toString()) == null || AbstractC0307q.m534d0(string6)) {
                                                                                    string6 = null;
                                                                                }
                                                                                if (string6 != null) {
                                                                                    arrayList6.add(string6);
                                                                                }
                                                                            }
                                                                            Iterator it8 = arrayList6.iterator();
                                                                            while (it8.hasNext()) {
                                                                                linkedHashSet2.add((String) it8.next());
                                                                            }
                                                                        }
                                                                    }
                                                                    c0842h07.f2855c0 = strM271m02;
                                                                    c0842h07.f2857d0 = linkedHashSet2;
                                                                }
                                                                if (linkedHashSet2.contains(string4)) {
                                                                    String string10 = AbstractC0299i.m507C0(string4).toString();
                                                                    if (string10 == null) {
                                                                        string10 = null;
                                                                        if (string10 == null) {
                                                                            string10 = string4;
                                                                        }
                                                                        boolean z17 = AbstractC1126i.f3786a;
                                                                        if (!C1124g.m2429e(string4) || C1124g.m2429e(string10)) {
                                                                        }
                                                                    } else {
                                                                        if (AbstractC0307q.m534d0(string10)) {
                                                                            string10 = null;
                                                                        }
                                                                        if (string10 != null) {
                                                                            if (!C0842H0.m1606R0(string10)) {
                                                                                if (!string10.endsWith("@chatroom")) {
                                                                                    C1143z.f3876a.m2534h(c0842h07.f2880y);
                                                                                    C1142y c1142yM2528b3 = C1143z.m2528b(string10);
                                                                                    if (c1142yM2528b3 != null) {
                                                                                        List<String> listM252Z3 = AbstractC0120h.m252Z(new String[]{c1142yM2528b3.f3868a, c1142yM2528b3.f3869b, c1142yM2528b3.f3870c});
                                                                                        ArrayList arrayList7 = new ArrayList();
                                                                                        for (String str14 : listM252Z3) {
                                                                                            if (str14 == null || (string5 = AbstractC0299i.m507C0(str14).toString()) == null || AbstractC0307q.m534d0(string5)) {
                                                                                                string5 = null;
                                                                                            }
                                                                                            if (string5 != null) {
                                                                                                arrayList7.add(string5);
                                                                                            }
                                                                                        }
                                                                                        Iterator it9 = arrayList7.iterator();
                                                                                        while (true) {
                                                                                            if (it9.hasNext()) {
                                                                                                next3 = it9.next();
                                                                                                if (C0842H0.m1606R0((String) next3)) {
                                                                                                }
                                                                                            } else {
                                                                                                next3 = null;
                                                                                            }
                                                                                        }
                                                                                        string10 = (String) next3;
                                                                                    }
                                                                                }
                                                                            }
                                                                            if (string10 == null) {
                                                                            }
                                                                            boolean z172 = AbstractC1126i.f3786a;
                                                                            if (!C1124g.m2429e(string4)) {
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            } else {
                                                                if (z16) {
                                                                    int size = r14.size();
                                                                    linkedHashSet2 = r14;
                                                                    if (size <= arrayList5.size()) {
                                                                    }
                                                                }
                                                                if (linkedHashSet2 == 0) {
                                                                }
                                                                if (linkedHashSet2.contains(string4)) {
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                M281w0.add(obj11);
                                            }
                                        } else {
                                            M281w0 = AbstractC0123k.m281w0(list);
                                        }
                                        if (list.size() == M281w0.size()) {
                                            int size2 = list.size();
                                            for (int i8 = 0; i8 < size2; i8++) {
                                                if (list.get(i8) == M281w0.get(i8)) {
                                                }
                                            }
                                        }
                                        String strM351g = AbstractC0174d.m351g(list.size(), "raw=");
                                        String strM351g2 = AbstractC0174d.m351g(list.size(), "source=");
                                        String strM351g3 = AbstractC0174d.m351g(M281w0.size(), "next=");
                                        boolean z18 = AbstractC1126i.f3786a;
                                        AbstractC0731a.m1387d("play8072 index input filter", strM351g, strM351g2, strM351g3, AbstractC0174d.m355k("hide=", C1124g.m2448x()));
                                        arrayList = new ArrayList((Collection) M281w0);
                                    }
                                }
                            }
                            arrayList = null;
                        }
                        if (arrayList != null) {
                            methodHookParam.args[0] = arrayList;
                            break;
                        }
                    }
                }
                break;
            case 20:
                AbstractC0223g.m418e(methodHookParam, "param");
                Object obj12 = methodHookParam.thisObject;
                PopupWindow popupWindow = obj12 instanceof PopupWindow ? (PopupWindow) obj12 : null;
                if (popupWindow != null) {
                    Object[] objArr8 = methodHookParam.args;
                    AbstractC0223g.m417d(objArr8, "args");
                    boolean z19 = AbstractC0120h.m258f0(0, objArr8) instanceof View;
                    C0842H0.m1635g(this.f2751b, "showAtLocation", popupWindow);
                    break;
                }
                break;
            case 21:
                AbstractC0223g.m418e(methodHookParam, "param");
                Object obj13 = methodHookParam.thisObject;
                PopupWindow popupWindow2 = obj13 instanceof PopupWindow ? (PopupWindow) obj13 : null;
                if (popupWindow2 != null) {
                    Object[] objArr9 = methodHookParam.args;
                    AbstractC0223g.m417d(objArr9, "args");
                    boolean z20 = AbstractC0120h.m258f0(0, objArr9) instanceof View;
                    C0842H0.m1635g(this.f2751b, "showAsDropDown", popupWindow2);
                    break;
                }
                break;
            case 22:
                AbstractC0223g.m418e(methodHookParam, "param");
                Object obj14 = methodHookParam.thisObject;
                PopupWindow popupWindow3 = obj14 instanceof PopupWindow ? (PopupWindow) obj14 : null;
                if (popupWindow3 != null) {
                    Object[] objArr10 = methodHookParam.args;
                    AbstractC0223g.m417d(objArr10, "args");
                    boolean z21 = AbstractC0120h.m258f0(0, objArr10) instanceof View;
                    C0842H0.m1635g(this.f2751b, "showAsDropDownGravity", popupWindow3);
                    break;
                }
                break;
            case 28:
                AbstractC0223g.m418e(methodHookParam, "param");
                Object obj15 = methodHookParam.thisObject;
                View view4 = obj15 instanceof View ? (View) obj15 : null;
                if (view4 != null && AbstractC0223g.m414a(view4.getTag(), "last_msg_tv")) {
                    C0037j c0037j = this.f2751b.f2846W;
                    String str15 = c0037j != null ? (String) AbstractC0123k.m268j0(c0037j.f244d) : null;
                    List listM2477E = AbstractC1135r.m2477E("conversation", "holder", AbstractC0079h.m167E((String) AbstractC1135r.m2475C("va5.n", "kc5.n", "sd5.n", "yf5.n", "va5.n")));
                    if (str15 != null && !AbstractC0307q.m534d0(str15)) {
                        listM2477E = AbstractC0123k.m281w0(AbstractC0123k.m264A0(AbstractC0123k.m273o0(AbstractC0079h.m167E(str15), listM2477E)));
                    }
                    while (view4 != null) {
                        Object tag = view4.getTag();
                        if (tag != null && (listM2477E.contains(tag.getClass().getName()) || C0842H0.m1636g0(tag) != null)) {
                            obj5 = tag;
                            if (obj5 == null) {
                                this.f2751b.getClass();
                                String strM1636g0 = C0842H0.m1636g0(obj5);
                                this.f2751b.getClass();
                                if (C0842H0.m1606R0(strM1636g0)) {
                                    this.f2751b.getClass();
                                    boolean z22 = AbstractC1126i.f3786a;
                                    if (C1124g.m2447w()) {
                                        methodHookParam.args[0] = "";
                                    }
                                }
                                break;
                            }
                        } else {
                            Object parent = view4.getParent();
                            view4 = parent instanceof View ? (View) parent : null;
                        }
                    }
                    obj5 = null;
                    if (obj5 == null) {
                    }
                }
                break;
            case 29:
                AbstractC0223g.m418e(methodHookParam, "param");
                this.f2751b.f2880y = methodHookParam.thisObject;
                C1143z.f3876a.m2534h(methodHookParam.thisObject);
                break;
        }
    }
}
