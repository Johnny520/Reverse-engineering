package p086r0;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.p055lu.wxmask.MainHook;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedBridge;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.regex.Matcher;
import org.json.JSONException;
import p006D.AbstractC0079h;
import p009E0.C0103c;
import p009E0.C0104d;
import p011F0.AbstractC0120h;
import p011F0.AbstractC0123k;
import p022L.AbstractC0174d;
import p027N0.AbstractC0223g;
import p034R0.C0244c;
import p040U0.AbstractC0299i;
import p040U0.AbstractC0307q;
import p040U0.C0294d;
import p040U0.C0297g;
import p054c0.AbstractC0509a;
import p054c0.AbstractC0514f;
import p070i0.AbstractC0731a;
import p102z0.AbstractC1126i;
import p102z0.AbstractC1135r;
import p102z0.C1124g;
import p102z0.EnumC1115A;

/* JADX INFO: renamed from: r0.V */
/* JADX INFO: loaded from: classes.dex */
public final class C0874V extends AbstractC0509a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3010a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0894d0 f3011b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0874V(C0894d0 c0894d0, int i2) {
        this.f3010a = i2;
        this.f3011b = c0894d0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:176:0x02f0  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p054c0.AbstractC0509a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws JSONException {
        Object c0104d;
        String str;
        String str2;
        String str3;
        String string;
        String str4;
        String string2;
        View decorView;
        int i2 = 0;
        Object obj = null;
        View view = null;
        switch (this.f3010a) {
            case 0:
                AbstractC0223g.m418e(methodHookParam, "param");
                Object[] objArr = methodHookParam.args;
                AbstractC0223g.m417d(objArr, "args");
                Object objM258f0 = AbstractC0120h.m258f0(0, objArr);
                if (objM258f0 != null) {
                    Object obj2 = methodHookParam.thisObject;
                    ListView listView = obj2 instanceof ListView ? (ListView) obj2 : null;
                    if (listView != null) {
                        C0894d0 c0894d0 = this.f3011b;
                        c0894d0.getClass();
                        if (C0894d0.m1852n0(listView, objM258f0)) {
                            AbstractC0731a.m1384a("hide contact bind adapter", objM258f0.getClass().getName(), listView.getClass().getName());
                            c0894d0.f3125d = new WeakReference(objM258f0);
                            c0894d0.f3123b = new WeakReference(listView);
                            c0894d0.m1896g0(objM258f0.getClass());
                            break;
                        } else if (C0894d0.m1861v0(listView)) {
                            AbstractC0731a.m1384a("hide contact bind search adapter", objM258f0.getClass().getName(), listView.getClass().getName());
                            c0894d0.f3127f = new WeakReference(objM258f0);
                            c0894d0.f3126e = new WeakReference(listView);
                            Method methodMo1011b = AbstractC0514f.f1622b.mo1011b(objM258f0.getClass(), "getView", Integer.TYPE, View.class, ViewGroup.class);
                            if (methodMo1011b != null) {
                                String strM354j = AbstractC0174d.m354j("hide-contact-search-view-", methodMo1011b);
                                if (!MainHook.uniqueMetaStore.contains(strM354j)) {
                                    AbstractC0514f.m1027d(methodMo1011b, new C0874V(c0894d0, 24));
                                    MainHook.uniqueMetaStore.add(strM354j);
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            case 5:
                AbstractC0223g.m418e(methodHookParam, "param");
                C0894d0 c0894d02 = this.f3011b;
                if (!c0894d02.f3136o) {
                    c0894d02.m1875L0(methodHookParam.thisObject);
                    break;
                }
                break;
            case 6:
                AbstractC0223g.m418e(methodHookParam, "param");
                Object obj3 = methodHookParam.thisObject;
                C0894d0 c0894d03 = this.f3011b;
                if (C0894d0.m1848j(c0894d03, obj3)) {
                    Set setM1867F = c0894d03.m1867F();
                    Object result = methodHookParam.getResult();
                    List list = result instanceof List ? (List) result : null;
                    if (list != null && !setM1867F.isEmpty()) {
                        C0894d0.m1842e(c0894d03, "result", list, setM1867F);
                        ArrayList arrayListM1836b = C0894d0.m1836b(c0894d03, list, setM1867F);
                        if (arrayListM1836b.size() != list.size()) {
                            methodHookParam.setResult(arrayListM1836b);
                            WeakReference weakReference = c0894d03.f3122a;
                            Object obj4 = weakReference != null ? weakReference.get() : null;
                            WeakReference weakReference2 = c0894d03.f3123b;
                            ListView listView2 = weakReference2 != null ? (ListView) weakReference2.get() : null;
                            if (obj4 != null) {
                                try {
                                    c0104d = C0894d0.m1865z(obj4);
                                } catch (Throwable th) {
                                    c0104d = new C0104d(th);
                                }
                                view = (View) (c0104d instanceof C0104d ? null : c0104d);
                            }
                            c0894d03.m1890X0(obj4, listView2, view);
                            break;
                        }
                    }
                }
                break;
            case 10:
                AbstractC0223g.m418e(methodHookParam, "param");
                boolean z2 = AbstractC1126i.f3786a;
                if (C1124g.m2415F()) {
                    Object result2 = methodHookParam.getResult();
                    View view2 = result2 instanceof View ? (View) result2 : null;
                    if (view2 != null) {
                        this.f3011b.getClass();
                        if (C0894d0.m1862w(view2) != null) {
                            C0894d0 c0894d04 = this.f3011b;
                            Object obj5 = methodHookParam.thisObject;
                            c0894d04.getClass();
                            Object objM1828S = C0894d0.m1828S(obj5, "d");
                            if (objM1828S == null) {
                                C0894d0 c0894d05 = this.f3011b;
                                Object obj6 = methodHookParam.thisObject;
                                c0894d05.getClass();
                                objM1828S = C0894d0.m1828S(obj6, "f270194d");
                                if (objM1828S == null) {
                                    String[] strArrM1872J = this.f3011b.m1872J();
                                    C0894d0 c0894d06 = this.f3011b;
                                    int length = strArrM1872J.length;
                                    while (true) {
                                        if (i2 < length) {
                                            String str5 = strArrM1872J[i2];
                                            Object obj7 = methodHookParam.thisObject;
                                            c0894d06.getClass();
                                            Object objM1817E = C0894d0.m1817E(obj7, str5);
                                            if (objM1817E == null) {
                                                i2++;
                                            } else {
                                                objM1828S = objM1817E;
                                            }
                                        } else {
                                            objM1828S = null;
                                        }
                                    }
                                    if (objM1828S == null) {
                                    }
                                }
                            }
                            final Object obj8 = objM1828S;
                            List listM1823N = C0894d0.m1823N(this.f3011b.m1873K(obj8));
                            ArrayList arrayList = new ArrayList();
                            for (Object obj9 : listM1823N) {
                                if (obj9 instanceof MenuItem) {
                                    arrayList.add(obj9);
                                }
                            }
                            Iterator it = arrayList.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    Object next = it.next();
                                    if (C0894d0.m1858s0((MenuItem) next)) {
                                        obj = next;
                                    }
                                }
                            }
                            MenuItem menuItem = (MenuItem) obj;
                            if (menuItem != null) {
                                C0103c c0103c = (C0103c) this.f3011b.f3107F.get(menuItem);
                                if ((c0103c != null && (str = (String) c0103c.f394a) != null) || (str = this.f3011b.f3113L) != null) {
                                    final String str6 = str;
                                    final String str7 = ((c0103c == null || (str2 = (String) c0103c.f395b) == null) && (str2 = this.f3011b.f3114M) == null) ? str6 : str2;
                                    final C0894d0 c0894d07 = this.f3011b;
                                    final int i3 = 0;
                                    view2.setOnClickListener(new View.OnClickListener() { // from class: r0.Y
                                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view3) {
                                            Object obj10 = obj8;
                                            String str8 = str7;
                                            String str9 = str6;
                                            C0894d0 c0894d08 = c0894d07;
                                            switch (i3) {
                                                case 0:
                                                    List list2 = C0894d0.f3085U;
                                                    c0894d08.m1900k(str9, str8);
                                                    c0894d08.m1907s(obj10);
                                                    break;
                                                default:
                                                    List list3 = C0894d0.f3085U;
                                                    c0894d08.m1900k(str9, str8);
                                                    c0894d08.m1907s(obj10);
                                                    break;
                                            }
                                        }
                                    });
                                    this.f3011b.getClass();
                                    TextView textViewM1862w = C0894d0.m1862w(view2);
                                    if (textViewM1862w != null) {
                                        final C0894d0 c0894d08 = this.f3011b;
                                        final int i4 = 1;
                                        textViewM1862w.setOnClickListener(new View.OnClickListener() { // from class: r0.Y
                                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view3) {
                                                Object obj10 = obj8;
                                                String str8 = str7;
                                                String str9 = str6;
                                                C0894d0 c0894d082 = c0894d08;
                                                switch (i4) {
                                                    case 0:
                                                        List list2 = C0894d0.f3085U;
                                                        c0894d082.m1900k(str9, str8);
                                                        c0894d082.m1907s(obj10);
                                                        break;
                                                    default:
                                                        List list3 = C0894d0.f3085U;
                                                        c0894d082.m1900k(str9, str8);
                                                        c0894d082.m1907s(obj10);
                                                        break;
                                                }
                                            }
                                        });
                                    }
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            case 11:
                AbstractC0223g.m418e(methodHookParam, "param");
                C0894d0 c0894d09 = this.f3011b;
                if (!c0894d09.f3116O) {
                    c0894d09.f3113L = null;
                    c0894d09.f3114M = null;
                    c0894d09.f3115N = 0L;
                    c0894d09.f3116O = false;
                    c0894d09.f3117P = null;
                    c0894d09.f3110I.clear();
                    break;
                }
                break;
            case 14:
                AbstractC0223g.m418e(methodHookParam, "param");
                Object obj10 = methodHookParam.thisObject;
                View view3 = obj10 instanceof View ? (View) obj10 : null;
                if (view3 != null) {
                    view3.post(new RunnableC0841H(this.f3011b, view3, 2));
                }
                break;
            case 15:
                AbstractC0223g.m418e(methodHookParam, "param");
                Object obj11 = methodHookParam.thisObject;
                View view4 = obj11 instanceof View ? (View) obj11 : null;
                if (view4 != null) {
                    view4.post(new RunnableC0841H(this.f3011b, view4, 3));
                }
                break;
            case 17:
                AbstractC0223g.m418e(methodHookParam, "param");
                Object obj12 = methodHookParam.thisObject;
                PopupWindow popupWindow = obj12 instanceof PopupWindow ? (PopupWindow) obj12 : null;
                if (popupWindow != null) {
                    Object[] objArr2 = methodHookParam.args;
                    AbstractC0223g.m417d(objArr2, "args");
                    Object objM258f02 = AbstractC0120h.m258f0(0, objArr2);
                    View view5 = objM258f02 instanceof View ? (View) objM258f02 : null;
                    if (view5 != null && (str3 = this.f3011b.f3113L) != null && (string = AbstractC0299i.m507C0(str3).toString()) != null) {
                        String str8 = !AbstractC0307q.m534d0(string) ? string : null;
                        if (str8 != null) {
                            String str9 = this.f3011b.f3114M;
                            if (str9 == null || (string2 = AbstractC0299i.m507C0(str9).toString()) == null) {
                                str4 = str8;
                            } else {
                                String str10 = AbstractC0307q.m534d0(string2) ? null : string2;
                                if (str10 != null) {
                                    str4 = str10;
                                }
                            }
                            C0894d0 c0894d010 = this.f3011b;
                            c0894d010.getClass();
                            if (System.currentTimeMillis() <= c0894d010.f3104C) {
                                this.f3011b.m1894b1(popupWindow, view5, str8, str4, "setContentView-after", null);
                            }
                            break;
                        }
                    }
                }
                break;
            case 18:
                AbstractC0223g.m418e(methodHookParam, "param");
                Object obj13 = methodHookParam.thisObject;
                PopupWindow popupWindow2 = obj13 instanceof PopupWindow ? (PopupWindow) obj13 : null;
                if (popupWindow2 != null) {
                    Object[] objArr3 = methodHookParam.args;
                    AbstractC0223g.m417d(objArr3, "args");
                    Object objM258f03 = AbstractC0120h.m258f0(0, objArr3);
                    C0894d0.m1840d(this.f3011b, popupWindow2, objM258f03 instanceof View ? (View) objM258f03 : null, "showAsDropDown-after");
                    break;
                }
                break;
            case 19:
                AbstractC0223g.m418e(methodHookParam, "param");
                Object obj14 = methodHookParam.thisObject;
                PopupWindow popupWindow3 = obj14 instanceof PopupWindow ? (PopupWindow) obj14 : null;
                if (popupWindow3 != null) {
                    Object[] objArr4 = methodHookParam.args;
                    AbstractC0223g.m417d(objArr4, "args");
                    Object objM258f04 = AbstractC0120h.m258f0(0, objArr4);
                    C0894d0.m1840d(this.f3011b, popupWindow3, objM258f04 instanceof View ? (View) objM258f04 : null, "showAsDropDownXY-after");
                    break;
                }
                break;
            case 20:
                AbstractC0223g.m418e(methodHookParam, "param");
                Object obj15 = methodHookParam.thisObject;
                PopupWindow popupWindow4 = obj15 instanceof PopupWindow ? (PopupWindow) obj15 : null;
                if (popupWindow4 != null) {
                    Object[] objArr5 = methodHookParam.args;
                    AbstractC0223g.m417d(objArr5, "args");
                    Object objM258f05 = AbstractC0120h.m258f0(0, objArr5);
                    C0894d0.m1840d(this.f3011b, popupWindow4, objM258f05 instanceof View ? (View) objM258f05 : null, "showAsDropDownGravity-after");
                    break;
                }
                break;
            case 21:
                AbstractC0223g.m418e(methodHookParam, "param");
                Object obj16 = methodHookParam.thisObject;
                PopupWindow popupWindow5 = obj16 instanceof PopupWindow ? (PopupWindow) obj16 : null;
                if (popupWindow5 != null) {
                    Object[] objArr6 = methodHookParam.args;
                    AbstractC0223g.m417d(objArr6, "args");
                    Object objM258f06 = AbstractC0120h.m258f0(0, objArr6);
                    C0894d0.m1840d(this.f3011b, popupWindow5, objM258f06 instanceof View ? (View) objM258f06 : null, "showAtLocationView-after");
                    break;
                }
                break;
            case 22:
                AbstractC0223g.m418e(methodHookParam, "param");
                Object obj17 = methodHookParam.thisObject;
                PopupWindow popupWindow6 = obj17 instanceof PopupWindow ? (PopupWindow) obj17 : null;
                if (popupWindow6 != null) {
                    C0894d0.m1840d(this.f3011b, popupWindow6, null, "showAtLocationToken-after");
                    break;
                }
                break;
            case 23:
                AbstractC0223g.m418e(methodHookParam, "param");
                Object obj18 = methodHookParam.thisObject;
                Activity activity = obj18 instanceof Activity ? (Activity) obj18 : null;
                if (activity != null) {
                    new WeakReference(activity);
                    C0894d0 c0894d011 = this.f3011b;
                    c0894d011.getClass();
                    Window window = activity.getWindow();
                    if (window != null && (decorView = window.getDecorView()) != null) {
                        decorView.postDelayed(new RunnableC0847J(c0894d011, 2), 96L);
                        break;
                    }
                }
                break;
            case 24:
                AbstractC0223g.m418e(methodHookParam, "param");
                Object result3 = methodHookParam.getResult();
                View view6 = result3 instanceof View ? (View) result3 : null;
                if (view6 == null) {
                    Object[] objArr7 = methodHookParam.args;
                    AbstractC0223g.m417d(objArr7, "args");
                    Object objM258f07 = AbstractC0120h.m258f0(1, objArr7);
                    View view7 = objM258f07 instanceof View ? (View) objM258f07 : null;
                    if (view7 != null) {
                        view6 = view7;
                    }
                }
                C0894d0 c0894d012 = this.f3011b;
                c0894d012.getClass();
                boolean z3 = AbstractC1126i.f3786a;
                if (C1124g.m2450z()) {
                    C0894d0.m1846h(c0894d012, view6);
                } else {
                    c0894d012.m1887U0(view6);
                }
                break;
            case 25:
                AbstractC0223g.m418e(methodHookParam, "param");
                Object obj19 = methodHookParam.thisObject;
                ListView listView3 = obj19 instanceof ListView ? (ListView) obj19 : null;
                if (listView3 != null) {
                    C0894d0 c0894d013 = this.f3011b;
                    c0894d013.getClass();
                    if (C0894d0.m1861v0(listView3)) {
                        boolean z4 = AbstractC1126i.f3786a;
                        if (C1124g.m2450z()) {
                            int childCount = listView3.getChildCount();
                            while (i2 < childCount) {
                                View childAt = listView3.getChildAt(i2);
                                AbstractC0223g.m417d(childAt, "getChildAt(...)");
                                C0894d0.m1846h(c0894d013, childAt);
                                i2++;
                            }
                        } else {
                            listView3.post(new RunnableC0835F(listView3, c0894d013));
                        }
                        break;
                    }
                }
                break;
            case 26:
                AbstractC0223g.m418e(methodHookParam, "param");
                C0894d0 c0894d014 = this.f3011b;
                if (!c0894d014.f3136o) {
                    Object obj20 = methodHookParam.thisObject;
                    String name = obj20 != null ? obj20.getClass().getName() : null;
                    if (C0894d0.m1857q0(name != null ? name : "")) {
                        Class<?> cls = methodHookParam.thisObject.getClass();
                        c0894d014.m1897h0(cls, "q0", new Class[0]);
                        c0894d014.m1897h0(cls, "p0", Bundle.class);
                        c0894d014.m1897h0(cls, "s0", new Class[0]);
                        if (AbstractC1135r.m2485g() == EnumC1115A.WX_8_0_71 || AbstractC0299i.m511i0(cls.getName(), "MvvmAddressUI", true)) {
                            c0894d014.m1897h0(cls, "q0", Bundle.class);
                            c0894d014.m1897h0(cls, "l0", Bundle.class);
                            c0894d014.m1897h0(cls, "t0", new Class[0]);
                            c0894d014.m1897h0(cls, "w0", new Class[0]);
                            c0894d014.m1897h0(cls, "e0", new Class[0]);
                            c0894d014.m1897h0(cls, "r0", new Class[0]);
                            c0894d014.m1897h0(cls, "u0", new Class[0]);
                        }
                        c0894d014.m1897h0(cls, "onViewCreated", View.class, Bundle.class);
                        c0894d014.m1899j0(cls);
                        c0894d014.m1875L0(methodHookParam.thisObject);
                    }
                    break;
                }
                break;
            case 27:
                AbstractC0223g.m418e(methodHookParam, "param");
                Object obj21 = methodHookParam.thisObject;
                View view8 = obj21 instanceof View ? (View) obj21 : null;
                if (view8 != null) {
                    Object[] objArr8 = methodHookParam.args;
                    AbstractC0223g.m417d(objArr8, "args");
                    Object objM258f08 = AbstractC0120h.m258f0(0, objArr8);
                    Context context = view8.getContext();
                    String name2 = context != null ? context.getClass().getName() : null;
                    if (name2 == null) {
                        name2 = "";
                    }
                    C0894d0 c0894d015 = this.f3011b;
                    c0894d015.getClass();
                    if (!C0894d0.m1857q0(name2)) {
                        String name3 = objM258f08 != null ? objM258f08.getClass().getName() : null;
                        if (!c0894d015.m1866E0(name3 != null ? name3 : "")) {
                        }
                    }
                    c0894d015.f3124c = new WeakReference(view8);
                    AbstractC0731a.m1384a("hide contact wx recycler bind", "view=".concat(view8.getClass().getName()), "context=".concat(name2), AbstractC0174d.m352h("adapter=", objM258f08 != null ? objM258f08.getClass().getName() : null));
                    break;
                }
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:420:0x0410 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:424:0x040d */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0499  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x04f7  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0571  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x0618  */
    @Override // p054c0.AbstractC0509a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws JSONException {
        Object obj;
        String string;
        boolean z2;
        boolean z3;
        String strConcat;
        String string2;
        String strConcat2;
        String str;
        String str2;
        String str3;
        MenuItem menuItemM1876M;
        String str4;
        String str5;
        boolean zM1857q0 = true;
        int i2 = 0;
        switch (this.f3010a) {
            case 1:
                AbstractC0223g.m418e(methodHookParam, "param");
                Object obj2 = methodHookParam.thisObject;
                C0894d0 c0894d0 = this.f3011b;
                if (C0894d0.m1847i(c0894d0, obj2)) {
                    Object obj3 = methodHookParam.thisObject;
                    AbstractC0223g.m417d(obj3, "thisObject");
                    int[] iArrM1889W = c0894d0.m1889W(obj3);
                    if (iArrM1889W != null) {
                        methodHookParam.setResult(Integer.valueOf(iArrM1889W.length));
                    } else {
                        Object obj4 = methodHookParam.thisObject;
                        AbstractC0731a.m1387d("hide contact mapping unavailable", obj4 != null ? obj4.getClass().getName() : null);
                    }
                    break;
                }
                break;
            case 2:
                AbstractC0223g.m418e(methodHookParam, "param");
                Object obj5 = methodHookParam.thisObject;
                C0894d0 c0894d02 = this.f3011b;
                if (C0894d0.m1847i(c0894d02, obj5)) {
                    Object[] objArr = methodHookParam.args;
                    AbstractC0223g.m417d(objArr, "args");
                    Object objM258f0 = AbstractC0120h.m258f0(0, objArr);
                    Integer num = objM258f0 instanceof Integer ? (Integer) objM258f0 : null;
                    if (num != null) {
                        int iIntValue = num.intValue();
                        Object obj6 = methodHookParam.thisObject;
                        AbstractC0223g.m417d(obj6, "thisObject");
                        int[] iArrM1889W2 = c0894d02.m1889W(obj6);
                        if (iArrM1889W2 != null) {
                            if (iIntValue >= 0 && iIntValue < iArrM1889W2.length) {
                                Object obj7 = methodHookParam.thisObject;
                                AbstractC0223g.m417d(obj7, "thisObject");
                                int i3 = iArrM1889W2[iIntValue];
                                Method methodM1809A = C0894d0.m1809A(c0894d02.f3130i, obj7);
                                methodHookParam.setResult(methodM1809A == null ? null : XposedBridge.invokeOriginalMethod(methodM1809A, obj7, new Integer[]{Integer.valueOf(i3)}));
                            } else {
                                methodHookParam.setResult((Object) null);
                            }
                            break;
                        }
                    }
                }
                break;
            case 3:
                AbstractC0223g.m418e(methodHookParam, "param");
                Object obj8 = methodHookParam.thisObject;
                C0894d0 c0894d03 = this.f3011b;
                if (C0894d0.m1847i(c0894d03, obj8)) {
                    c0894d03.getClass();
                    Object[] objArr2 = methodHookParam.args;
                    AbstractC0223g.m417d(objArr2, "args");
                    Object objM258f02 = AbstractC0120h.m258f0(0, objArr2);
                    Integer num2 = objM258f02 instanceof Integer ? (Integer) objM258f02 : null;
                    if (num2 != null) {
                        int iIntValue2 = num2.intValue();
                        Object obj9 = methodHookParam.thisObject;
                        AbstractC0223g.m417d(obj9, "thisObject");
                        int[] iArrM1889W3 = c0894d03.m1889W(obj9);
                        if (iArrM1889W3 != null && iIntValue2 >= 0 && iIntValue2 < iArrM1889W3.length) {
                            methodHookParam.args[0] = Integer.valueOf(iArrM1889W3[iIntValue2]);
                        }
                    }
                    break;
                }
                break;
            case 4:
                AbstractC0223g.m418e(methodHookParam, "param");
                this.f3011b.f3128g.remove(methodHookParam.thisObject);
                break;
            case 6:
                AbstractC0223g.m418e(methodHookParam, "param");
                Object obj10 = methodHookParam.thisObject;
                C0894d0 c0894d04 = this.f3011b;
                if (C0894d0.m1848j(c0894d04, obj10)) {
                    Set setM1867F = c0894d04.m1867F();
                    Object[] objArr3 = methodHookParam.args;
                    AbstractC0223g.m417d(objArr3, "args");
                    Object objM258f03 = AbstractC0120h.m258f0(0, objArr3);
                    List list = objM258f03 instanceof List ? (List) objM258f03 : null;
                    if (list != null && !setM1867F.isEmpty()) {
                        C0894d0.m1842e(c0894d04, "input", list, setM1867F);
                        ArrayList arrayListM1836b = C0894d0.m1836b(c0894d04, list, setM1867F);
                        if (arrayListM1836b.size() != list.size()) {
                            methodHookParam.args[0] = arrayListM1836b;
                            break;
                        }
                    }
                }
                break;
            case 7:
                AbstractC0223g.m418e(methodHookParam, "param");
                this.f3011b.getClass();
                if (AbstractC1135r.m2485g() == EnumC1115A.WX_8_0_71 && (obj = methodHookParam.args[1]) != null && (string = obj.toString()) != null) {
                    Locale locale = Locale.ROOT;
                    String lowerCase = string.toLowerCase(locale);
                    AbstractC0223g.m417d(lowerCase, "toLowerCase(...)");
                    if (AbstractC0299i.m511i0(lowerCase, " from rcontact", false) || AbstractC0299i.m511i0(lowerCase, " from (select * from rcontact", false)) {
                        z2 = ((!AbstractC0299i.m511i0(string, " limit 1", true) ? false : C0894d0.f3094d0.m502a(string)) || AbstractC0299i.m511i0(lowerCase, " where username=", false) || AbstractC0299i.m511i0(lowerCase, " where encryptusername=", false)) ? false : true;
                    }
                    if (z2) {
                        String lowerCase2 = string.toLowerCase(locale);
                        AbstractC0223g.m417d(lowerCase2, "toLowerCase(...)");
                        if (AbstractC0299i.m511i0(lowerCase2, "order by showhead", false) || AbstractC0299i.m511i0(lowerCase2, "conremarkpyfull", false) || AbstractC0299i.m511i0(lowerCase2, "usernameflag", false) || AbstractC0299i.m511i0(lowerCase2, "type & 32", false) || AbstractC0299i.m511i0(lowerCase2, "verifyflag", false)) {
                            z3 = false;
                        } else {
                            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
                            AbstractC0223g.m417d(stackTrace, "getStackTrace(...)");
                            int length = stackTrace.length;
                            int i4 = 0;
                            z3 = false;
                            while (i4 < length) {
                                String className = stackTrace[i4].getClassName();
                                AbstractC0223g.m415b(className);
                                if (AbstractC0299i.m511i0(className, "contact.address", true) || AbstractC0299i.m511i0(className, "MvvmAddressUI", true) || AbstractC0299i.m511i0(className, "AddressUI", true)) {
                                    z3 = false;
                                } else {
                                    if (AbstractC0299i.m511i0(className, ".plugin.fts.", true) || AbstractC0299i.m511i0(className, ".ui.search", true) || AbstractC0299i.m511i0(className, "FTS", true)) {
                                        z3 = true;
                                    }
                                    i4++;
                                    z3 = z3;
                                }
                            }
                        }
                        if (z3) {
                            boolean z4 = AbstractC1126i.f3786a;
                            if (C1124g.m2450z()) {
                                List listM1829V = C0894d0.m1829V();
                                if (!listM1829V.isEmpty()) {
                                    String strM271m0 = AbstractC0123k.m271m0(listM1829V, ",", null, null, new C0863P(1), 30);
                                    if (!AbstractC0307q.m534d0(strM271m0)) {
                                        String string3 = AbstractC0299i.m507C0(string).toString();
                                        AbstractC0223g.m418e(string3, "<this>");
                                        if (string3.endsWith(";")) {
                                            string3 = string3.substring(0, string3.length() - 1);
                                            AbstractC0223g.m417d(string3, "substring(...)");
                                        }
                                        C0294d c0294dM503b = C0894d0.f3100j0.m503b(0, string3);
                                        String str6 = c0294dM503b != null ? (String) AbstractC0123k.m269k0(c0294dM503b.m500a(), 1) : null;
                                        if (str6 == null || AbstractC0307q.m534d0(str6)) {
                                            strConcat = AbstractC0299i.m511i0(string3, "rcontact.", true) ? "rcontact.username" : "username";
                                        } else {
                                            String lowerCase3 = str6.toLowerCase(Locale.ROOT);
                                            AbstractC0223g.m417d(lowerCase3, "toLowerCase(...)");
                                            if (!C0894d0.f3101k0.contains(lowerCase3)) {
                                                strConcat = str6.concat(".username");
                                            }
                                        }
                                        String str7 = strConcat + " NOT IN (" + strM271m0 + ")";
                                        C0294d c0294dM503b2 = C0894d0.f3092b0.m503b(0, string3);
                                        C0297g c0297g = C0894d0.f3099i0;
                                        if (c0294dM503b2 != null) {
                                            Matcher matcher = c0294dM503b2.f670a;
                                            int i5 = AbstractC0079h.m176U(matcher.start(), matcher.end()).f584b + 1;
                                            C0294d c0294dM503b3 = c0297g.m503b(i5, string3);
                                            if (c0294dM503b3 != null) {
                                                Matcher matcher2 = c0294dM503b3.f670a;
                                                C0244c c0244cM176U = AbstractC0079h.m176U(matcher2.start(), matcher2.end());
                                                int length2 = c0244cM176U != null ? c0244cM176U.f583a : string3.length();
                                                String strSubstring = string3.substring(i5, length2);
                                                AbstractC0223g.m417d(strSubstring, "substring(...)");
                                                String string4 = AbstractC0299i.m507C0(strSubstring).toString();
                                                if (AbstractC0307q.m534d0(string4)) {
                                                    string2 = null;
                                                } else {
                                                    String strSubstring2 = string3.substring(length2);
                                                    AbstractC0223g.m417d(strSubstring2, "substring(...)");
                                                    String string5 = AbstractC0299i.m510F0(strSubstring2).toString();
                                                    StringBuilder sb = new StringBuilder();
                                                    String strSubstring3 = string3.substring(0, i5);
                                                    AbstractC0223g.m417d(strSubstring3, "substring(...)");
                                                    sb.append(strSubstring3);
                                                    sb.append(" (");
                                                    sb.append(str7);
                                                    sb.append(") AND (");
                                                    sb.append(string4);
                                                    sb.append(")");
                                                    if (!AbstractC0307q.m534d0(string5)) {
                                                        sb.append(' ');
                                                        sb.append(string5);
                                                    }
                                                    string2 = sb.toString();
                                                    AbstractC0223g.m417d(string2, "toString(...)");
                                                }
                                            }
                                        } else {
                                            C0294d c0294dM503b4 = c0297g.m503b(0, string3);
                                            if (c0294dM503b4 != null) {
                                                Matcher matcher3 = c0294dM503b4.f670a;
                                                C0244c c0244cM176U2 = AbstractC0079h.m176U(matcher3.start(), matcher3.end());
                                                int length3 = c0244cM176U2 != null ? c0244cM176U2.f583a : string3.length();
                                                StringBuilder sb2 = new StringBuilder();
                                                String strSubstring4 = string3.substring(0, length3);
                                                AbstractC0223g.m417d(strSubstring4, "substring(...)");
                                                sb2.append(AbstractC0299i.m508D0(strSubstring4).toString());
                                                sb2.append(" WHERE ");
                                                sb2.append(str7);
                                                String strSubstring5 = string3.substring(length3);
                                                AbstractC0223g.m417d(strSubstring5, "substring(...)");
                                                String string6 = AbstractC0299i.m510F0(strSubstring5).toString();
                                                if (!AbstractC0307q.m534d0(string6)) {
                                                    sb2.append(' ');
                                                    sb2.append(string6);
                                                }
                                                string2 = sb2.toString();
                                                AbstractC0223g.m417d(string2, "toString(...)");
                                            }
                                        }
                                        if (string2 != null) {
                                            strConcat2 = string2.concat(";");
                                        } else {
                                            C0294d c0294dM503b5 = C0894d0.f3095e0.m503b(0, string3);
                                            if (c0294dM503b5 == null || (str = (String) AbstractC0123k.m269k0(c0294dM503b5.m500a(), 1)) == null) {
                                                strConcat2 = null;
                                            } else {
                                                String lowerCase4 = str.toLowerCase(Locale.ROOT);
                                                AbstractC0223g.m417d(lowerCase4, "toLowerCase(...)");
                                                if (!C0894d0.f3096f0.m502a(lowerCase4) && (AbstractC0299i.m511i0(lowerCase4, "*", false) || C0894d0.f3097g0.m502a(lowerCase4) || C0894d0.f3098h0.m502a(lowerCase4))) {
                                                    strConcat2 = "SELECT * FROM (" + string3 + ") AS a WHERE username NOT IN (" + strM271m0 + ");";
                                                }
                                            }
                                        }
                                        if (strConcat2 != null) {
                                            methodHookParam.args[1] = strConcat2;
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                break;
            case 8:
                AbstractC0223g.m418e(methodHookParam, "param");
                boolean z5 = AbstractC1126i.f3786a;
                if (C1124g.m2415F()) {
                    Object[] objArr4 = methodHookParam.args;
                    AbstractC0223g.m417d(objArr4, "args");
                    Object objM258f04 = AbstractC0120h.m258f0(0, objArr4);
                    MenuItem menuItem = objM258f04 instanceof MenuItem ? (MenuItem) objM258f04 : null;
                    if (menuItem != null) {
                        this.f3011b.getClass();
                        if (C0894d0.m1858s0(menuItem)) {
                            C0103c c0103c = (C0103c) this.f3011b.f3107F.get(menuItem);
                            if ((c0103c != null && (str2 = (String) c0103c.f394a) != null) || (str2 = this.f3011b.f3113L) != null) {
                                if ((c0103c == null || (str3 = (String) c0103c.f395b) == null) && (str3 = this.f3011b.f3114M) == null) {
                                    str3 = str2;
                                }
                                this.f3011b.m1900k(str2, str3);
                                methodHookParam.setResult((Object) null);
                                break;
                            }
                        }
                    }
                }
                break;
            case 9:
                AbstractC0223g.m418e(methodHookParam, "param");
                Object[] objArr5 = methodHookParam.args;
                AbstractC0223g.m417d(objArr5, "args");
                Object objM258f05 = AbstractC0120h.m258f0(0, objArr5);
                final View.OnCreateContextMenuListener onCreateContextMenuListener = objM258f05 instanceof View.OnCreateContextMenuListener ? (View.OnCreateContextMenuListener) objM258f05 : null;
                if (onCreateContextMenuListener != null && !AbstractC0299i.m511i0(onCreateContextMenuListener.getClass().getName(), "HideContactFriendPluginPart", false)) {
                    Object[] objArr6 = methodHookParam.args;
                    final C0894d0 c0894d05 = this.f3011b;
                    objArr6[0] = new View.OnCreateContextMenuListener() { // from class: r0.X
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        @Override // android.view.View.OnCreateContextMenuListener
                        public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
                            View.OnCreateContextMenuListener onCreateContextMenuListener2 = onCreateContextMenuListener;
                            onCreateContextMenuListener2.onCreateContextMenu(contextMenu, view, contextMenuInfo);
                            boolean z6 = AbstractC1126i.f3786a;
                            if (C1124g.m2415F()) {
                                AdapterView.AdapterContextMenuInfo adapterContextMenuInfo = contextMenuInfo instanceof AdapterView.AdapterContextMenuInfo ? (AdapterView.AdapterContextMenuInfo) contextMenuInfo : null;
                                int i6 = adapterContextMenuInfo != null ? adapterContextMenuInfo.position : -1;
                                AbstractC0223g.m415b(view);
                                List list2 = C0894d0.f3085U;
                                C0894d0 c0894d06 = c0894d05;
                                C0103c c0103cM1883S0 = c0894d06.m1883S0(view, i6, onCreateContextMenuListener2, false);
                                if (c0103cM1883S0 == null) {
                                    return;
                                }
                                AbstractC0223g.m415b(contextMenu);
                                C0894d0.m1834a(c0894d06, contextMenu, (String) c0103cM1883S0.f394a, (String) c0103cM1883S0.f395b);
                            }
                        }
                    };
                }
                break;
            case 12:
                AbstractC0223g.m418e(methodHookParam, "param");
                boolean z6 = AbstractC1126i.f3786a;
                if (C1124g.m2415F()) {
                    C0894d0 c0894d06 = this.f3011b;
                    Object obj11 = methodHookParam.thisObject;
                    if (obj11 != null) {
                        if (!AbstractC0120h.m254b0(c0894d06.m1872J(), obj11.getClass().getName())) {
                            Object objM1828S = C0894d0.m1828S(obj11, "d");
                            if (objM1828S == null && (objM1828S = C0894d0.m1828S(obj11, "f270194d")) == null) {
                                String[] strArrM1872J = c0894d06.m1872J();
                                int length4 = strArrM1872J.length;
                                while (i2 < length4) {
                                    Object objM1817E = C0894d0.m1817E(obj11, strArrM1872J[i2]);
                                    if (objM1817E == null) {
                                        i2++;
                                    } else {
                                        obj11 = objM1817E;
                                    }
                                }
                            } else {
                                obj11 = objM1828S;
                            }
                        }
                        if (obj11 == null) {
                            Object[] objArr7 = methodHookParam.args;
                            AbstractC0223g.m417d(objArr7, "args");
                            Object objM258f06 = AbstractC0120h.m258f0(2, objArr7);
                            Integer num3 = objM258f06 instanceof Integer ? (Integer) objM258f06 : null;
                            if (num3 != null) {
                                int iIntValue3 = num3.intValue();
                                C0894d0 c0894d07 = this.f3011b;
                                if (iIntValue3 < 0) {
                                    c0894d07.getClass();
                                    menuItemM1876M = null;
                                } else {
                                    menuItemM1876M = c0894d07.m1876M(iIntValue3, obj11);
                                    if ((menuItemM1876M == null || !C0894d0.m1858s0(menuItemM1876M)) && (iIntValue3 <= 0 || (menuItemM1876M = c0894d07.m1876M(iIntValue3 - 1, obj11)) == null || !C0894d0.m1858s0(menuItemM1876M))) {
                                        menuItemM1876M = c0894d07.m1876M(iIntValue3, obj11);
                                    }
                                }
                                if (menuItemM1876M != null) {
                                    this.f3011b.getClass();
                                    if (C0894d0.m1858s0(menuItemM1876M)) {
                                        C0103c c0103c2 = (C0103c) this.f3011b.f3107F.get(menuItemM1876M);
                                        if ((c0103c2 != null && (str4 = (String) c0103c2.f394a) != null) || (str4 = this.f3011b.f3113L) != null) {
                                            if ((c0103c2 == null || (str5 = (String) c0103c2.f395b) == null) && (str5 = this.f3011b.f3114M) == null) {
                                                str5 = str4;
                                            }
                                            this.f3011b.m1900k(str4, str5);
                                            this.f3011b.m1907s(obj11);
                                            methodHookParam.setResult((Object) null);
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        c0894d06.getClass();
                    }
                    obj11 = null;
                    if (obj11 == null) {
                    }
                }
                break;
            case 13:
                AbstractC0223g.m418e(methodHookParam, "param");
                Object[] objArr8 = methodHookParam.args;
                AbstractC0223g.m417d(objArr8, "args");
                Object objM258f07 = AbstractC0120h.m258f0(3, objArr8);
                View.OnCreateContextMenuListener onCreateContextMenuListener2 = objM258f07 instanceof View.OnCreateContextMenuListener ? (View.OnCreateContextMenuListener) objM258f07 : null;
                if (onCreateContextMenuListener2 != null) {
                    Object[] objArr9 = methodHookParam.args;
                    AbstractC0223g.m417d(objArr9, "args");
                    Object objM258f08 = AbstractC0120h.m258f0(4, objArr9);
                    C0894d0 c0894d08 = this.f3011b;
                    if (objM258f08 != null) {
                        c0894d08.m1901k0(objM258f08.getClass());
                    }
                    Object[] objArr10 = methodHookParam.args;
                    AbstractC0223g.m417d(objArr10, "args");
                    Object objM258f09 = AbstractC0120h.m258f0(0, objArr10);
                    View view = objM258f09 instanceof View ? (View) objM258f09 : null;
                    if (view != null) {
                        Object[] objArr11 = methodHookParam.args;
                        AbstractC0223g.m417d(objArr11, "args");
                        Object objM258f010 = AbstractC0120h.m258f0(1, objArr11);
                        Integer num4 = objM258f010 instanceof Integer ? (Integer) objM258f010 : null;
                        C0103c c0103cM1883S0 = c0894d08.m1883S0(view, num4 != null ? num4.intValue() : -1, onCreateContextMenuListener2, false);
                        if (c0103cM1883S0 != null) {
                            methodHookParam.args[3] = new ViewOnCreateContextMenuListenerC0882Z(onCreateContextMenuListener2, c0894d08, c0103cM1883S0, methodHookParam, 0);
                            break;
                        }
                    }
                }
                break;
            case 16:
                AbstractC0223g.m418e(methodHookParam, "param");
                Object[] objArr12 = methodHookParam.args;
                AbstractC0223g.m417d(objArr12, "args");
                Object objM258f011 = AbstractC0120h.m258f0(0, objArr12);
                View.OnLongClickListener onLongClickListener = objM258f011 instanceof View.OnLongClickListener ? (View.OnLongClickListener) objM258f011 : null;
                if (onLongClickListener != null && !AbstractC0299i.m511i0(onLongClickListener.getClass().getName(), "HideContactFriendPluginPart", false) && !AbstractC0299i.m511i0(onLongClickListener.getClass().getName(), "HideMainUIListPluginPart", false)) {
                    Object obj12 = methodHookParam.thisObject;
                    View view2 = obj12 instanceof View ? (View) obj12 : null;
                    if (view2 != null) {
                        C0894d0 c0894d09 = this.f3011b;
                        if (!c0894d09.m1908t0(view2)) {
                            if (!c0894d09.m1911x0()) {
                                zM1857q0 = false;
                            } else if (!AbstractC0307q.m538h0(onLongClickListener.getClass().getName(), false, "po5.")) {
                                Context context = view2.getContext();
                                String name = context != null ? context.getClass().getName() : null;
                                if (name == null) {
                                    name = "";
                                }
                                zM1857q0 = C0894d0.m1857q0(name);
                            }
                        }
                        if (zM1857q0) {
                            methodHookParam.args[0] = new ViewOnLongClickListenerC0888b0(onLongClickListener, c0894d09, i2);
                            break;
                        }
                    }
                }
                break;
            case 18:
                AbstractC0223g.m418e(methodHookParam, "param");
                Object obj13 = methodHookParam.thisObject;
                PopupWindow popupWindow = obj13 instanceof PopupWindow ? (PopupWindow) obj13 : null;
                if (popupWindow != null) {
                    Object[] objArr13 = methodHookParam.args;
                    AbstractC0223g.m417d(objArr13, "args");
                    Object objM258f012 = AbstractC0120h.m258f0(0, objArr13);
                    C0894d0.m1840d(this.f3011b, popupWindow, objM258f012 instanceof View ? (View) objM258f012 : null, "showAsDropDown-before");
                    break;
                }
                break;
            case 19:
                AbstractC0223g.m418e(methodHookParam, "param");
                Object obj14 = methodHookParam.thisObject;
                PopupWindow popupWindow2 = obj14 instanceof PopupWindow ? (PopupWindow) obj14 : null;
                if (popupWindow2 != null) {
                    Object[] objArr14 = methodHookParam.args;
                    AbstractC0223g.m417d(objArr14, "args");
                    Object objM258f013 = AbstractC0120h.m258f0(0, objArr14);
                    C0894d0.m1840d(this.f3011b, popupWindow2, objM258f013 instanceof View ? (View) objM258f013 : null, "showAsDropDownXY-before");
                    break;
                }
                break;
            case 20:
                AbstractC0223g.m418e(methodHookParam, "param");
                Object obj15 = methodHookParam.thisObject;
                PopupWindow popupWindow3 = obj15 instanceof PopupWindow ? (PopupWindow) obj15 : null;
                if (popupWindow3 != null) {
                    Object[] objArr15 = methodHookParam.args;
                    AbstractC0223g.m417d(objArr15, "args");
                    Object objM258f014 = AbstractC0120h.m258f0(0, objArr15);
                    C0894d0.m1840d(this.f3011b, popupWindow3, objM258f014 instanceof View ? (View) objM258f014 : null, "showAsDropDownGravity-before");
                    break;
                }
                break;
            case 21:
                AbstractC0223g.m418e(methodHookParam, "param");
                Object obj16 = methodHookParam.thisObject;
                PopupWindow popupWindow4 = obj16 instanceof PopupWindow ? (PopupWindow) obj16 : null;
                if (popupWindow4 != null) {
                    Object[] objArr16 = methodHookParam.args;
                    AbstractC0223g.m417d(objArr16, "args");
                    Object objM258f015 = AbstractC0120h.m258f0(0, objArr16);
                    C0894d0.m1840d(this.f3011b, popupWindow4, objM258f015 instanceof View ? (View) objM258f015 : null, "showAtLocationView-before");
                    break;
                }
                break;
            case 22:
                AbstractC0223g.m418e(methodHookParam, "param");
                Object obj17 = methodHookParam.thisObject;
                PopupWindow popupWindow5 = obj17 instanceof PopupWindow ? (PopupWindow) obj17 : null;
                if (popupWindow5 != null) {
                    C0894d0.m1840d(this.f3011b, popupWindow5, null, "showAtLocationToken-before");
                    break;
                }
                break;
        }
    }
}
