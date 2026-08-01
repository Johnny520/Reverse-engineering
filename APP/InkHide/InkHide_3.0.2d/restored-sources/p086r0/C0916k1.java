package p086r0;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import de.robv.android.xposed.XC_MethodHook;
import p011F0.AbstractC0120h;
import p027N0.AbstractC0223g;
import p054c0.AbstractC0509a;
import p102z0.AbstractC1126i;
import p102z0.C1124g;

/* JADX INFO: renamed from: r0.k1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0916k1 extends AbstractC0509a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3244a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0919l1 f3245b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0916k1(C0919l1 c0919l1, int i2) {
        this.f3244a = i2;
        this.f3245b = c0919l1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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
    public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        Activity activityM2013k;
        View rootView;
        C0919l1 c0919l1 = this.f3245b;
        switch (this.f3244a) {
            case 0:
                AbstractC0223g.m418e(methodHookParam, "param");
                boolean z2 = AbstractC1126i.f3786a;
                if (C1124g.m2413D()) {
                    Object obj = methodHookParam.thisObject;
                    AbsListView absListView = obj instanceof AbsListView ? (AbsListView) obj : null;
                    if (absListView != null) {
                        c0919l1.getClass();
                        if (C0919l1.m2000B(absListView)) {
                            Object result = methodHookParam.getResult();
                            View view = result instanceof View ? (View) result : null;
                            if (view != null) {
                                if (!C0919l1.m2001C(absListView)) {
                                    c0919l1.m2034v((ListAdapter) absListView.getAdapter());
                                    C0919l1.m2007b(c0919l1, absListView, view);
                                } else {
                                    c0919l1.m2022G((ListAdapter) absListView.getAdapter());
                                }
                                break;
                            }
                        }
                    }
                }
                break;
            case 1:
                AbstractC0223g.m418e(methodHookParam, "param");
                boolean z3 = AbstractC1126i.f3786a;
                if (C1124g.m2413D()) {
                    Object obj2 = methodHookParam.thisObject;
                    AbsListView absListView2 = obj2 instanceof AbsListView ? (AbsListView) obj2 : null;
                    if (absListView2 != null) {
                        c0919l1.getClass();
                        if (C0919l1.m2000B(absListView2)) {
                            if (!C0919l1.m2001C(absListView2)) {
                                c0919l1.m2034v((ListAdapter) absListView2.getAdapter());
                                C0919l1.m2007b(c0919l1, absListView2, absListView2);
                            } else {
                                c0919l1.m2022G((ListAdapter) absListView2.getAdapter());
                            }
                            break;
                        }
                    }
                }
                break;
            case 2:
                AbstractC0223g.m418e(methodHookParam, "param");
                c0919l1.f3277h.remove();
                boolean z4 = AbstractC1126i.f3786a;
                if (C1124g.m2413D()) {
                    Object[] objArr = methodHookParam.args;
                    AbstractC0223g.m417d(objArr, "args");
                    Object objM258f0 = AbstractC0120h.m258f0(2, objArr);
                    AbsListView absListView3 = objM258f0 instanceof AbsListView ? (AbsListView) objM258f0 : null;
                    if (absListView3 != null && C0919l1.m2019z(absListView3)) {
                        Object result2 = methodHookParam.getResult();
                        View view2 = result2 instanceof View ? (View) result2 : null;
                        if (view2 != null && (activityM2013k = C0919l1.m2013k(absListView3.getContext())) != null) {
                            Window window = activityM2013k.getWindow();
                            if (((window != null && (rootView = window.getDecorView()) != null) || (rootView = absListView3.getRootView()) != null) && c0919l1.m2036x(activityM2013k, rootView)) {
                                if (c0919l1.f3273d.contains(methodHookParam.thisObject) || C0919l1.m2001C(absListView3)) {
                                    c0919l1.m2024K(view2);
                                }
                                break;
                            }
                        }
                    }
                }
                break;
            case 3:
                AbstractC0223g.m418e(methodHookParam, "param");
                Object obj3 = methodHookParam.thisObject;
                AbsListView absListView4 = obj3 instanceof AbsListView ? (AbsListView) obj3 : null;
                if (absListView4 != null) {
                    c0919l1.getClass();
                    if (C0919l1.m2000B(absListView4) && C0919l1.m2019z(absListView4)) {
                        if (!C0919l1.m2001C(absListView4)) {
                            Object[] objArr2 = methodHookParam.args;
                            AbstractC0223g.m417d(objArr2, "args");
                            Object obj4 = objArr2.length == 0 ? null : objArr2[0];
                            c0919l1.m2034v(obj4 instanceof ListAdapter ? (ListAdapter) obj4 : null);
                            C0919l1.m2007b(c0919l1, absListView4, absListView4);
                        } else {
                            Object[] objArr3 = methodHookParam.args;
                            AbstractC0223g.m417d(objArr3, "args");
                            Object obj5 = objArr3.length == 0 ? null : objArr3[0];
                            c0919l1.m2022G(obj5 instanceof ListAdapter ? (ListAdapter) obj5 : null);
                        }
                    }
                    break;
                }
                break;
            case 4:
                AbstractC0223g.m418e(methodHookParam, "param");
                boolean z5 = AbstractC1126i.f3786a;
                if (C1124g.m2413D() && c0919l1.f3273d.contains(methodHookParam.thisObject)) {
                    Object obj6 = methodHookParam.thisObject;
                    AbstractC0223g.m417d(obj6, "thisObject");
                    methodHookParam.setResult(Integer.valueOf(c0919l1.m2031s(obj6).length));
                }
                break;
            case 6:
                AbstractC0223g.m418e(methodHookParam, "param");
                Object obj7 = methodHookParam.thisObject;
                Activity activity = obj7 instanceof Activity ? (Activity) obj7 : null;
                if (activity != null) {
                    C0919l1.m2008c(c0919l1, activity);
                    break;
                }
                break;
            case 7:
                AbstractC0223g.m418e(methodHookParam, "param");
                Object obj8 = methodHookParam.thisObject;
                Activity activity2 = obj8 instanceof Activity ? (Activity) obj8 : null;
                if (activity2 != null) {
                    C0919l1.m2008c(c0919l1, activity2);
                    break;
                }
                break;
            case 8:
                AbstractC0223g.m418e(methodHookParam, "param");
                boolean z6 = AbstractC1126i.f3786a;
                if (C1124g.m2413D()) {
                    Object obj9 = methodHookParam.thisObject;
                    ViewGroup viewGroup = obj9 instanceof ViewGroup ? (ViewGroup) obj9 : null;
                    if (viewGroup != null) {
                        Object[] objArr4 = methodHookParam.args;
                        AbstractC0223g.m417d(objArr4, "args");
                        Object obj10 = objArr4.length == 0 ? null : objArr4[0];
                        View view3 = obj10 instanceof View ? (View) obj10 : null;
                        if (view3 != null) {
                            Context context = viewGroup.getContext();
                            c0919l1.getClass();
                            Activity activityM2013k2 = C0919l1.m2013k(context);
                            if (activityM2013k2 != null && activityM2013k2.getClass().getName().equals("com.tencent.mm.ui.vas.VASCommonActivity")) {
                                if (C0919l1.m2006a(c0919l1, viewGroup) || C0919l1.m2006a(c0919l1, view3)) {
                                    view3.post(new RunnableC0904g1(activityM2013k2, c0919l1, 3));
                                }
                            }
                            break;
                        }
                    }
                }
                break;
            case 9:
                AbstractC0223g.m418e(methodHookParam, "param");
                Object obj11 = methodHookParam.thisObject;
                Activity activity3 = obj11 instanceof Activity ? (Activity) obj11 : null;
                if (activity3 != null) {
                    C0919l1.m2009d(c0919l1, activity3);
                    break;
                }
                break;
            case 10:
                AbstractC0223g.m418e(methodHookParam, "param");
                Object[] objArr5 = methodHookParam.args;
                AbstractC0223g.m417d(objArr5, "args");
                if (AbstractC0223g.m414a(objArr5.length == 0 ? null : objArr5[0], Boolean.TRUE)) {
                    Object obj12 = methodHookParam.thisObject;
                    Activity activity4 = obj12 instanceof Activity ? (Activity) obj12 : null;
                    if (activity4 != null) {
                        C0919l1.m2009d(c0919l1, activity4);
                        break;
                    }
                }
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p054c0.AbstractC0509a
    public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        C0919l1 c0919l1 = this.f3245b;
        switch (this.f3244a) {
            case 2:
                AbstractC0223g.m418e(methodHookParam, "param");
                Object[] objArr = methodHookParam.args;
                AbstractC0223g.m417d(objArr, "args");
                Object objM258f0 = AbstractC0120h.m258f0(2, objArr);
                AbsListView absListView = objM258f0 instanceof AbsListView ? (AbsListView) objM258f0 : null;
                if (absListView != null) {
                    c0919l1.getClass();
                    if (C0919l1.m2019z(absListView)) {
                        Object obj = methodHookParam.thisObject;
                        ListAdapter listAdapter = obj instanceof ListAdapter ? (ListAdapter) obj : null;
                        if (listAdapter != null) {
                            if (C0919l1.m2001C(absListView)) {
                                if (c0919l1.m2029q().contains(listAdapter.getClass().getName())) {
                                    c0919l1.m2022G(listAdapter);
                                    Object[] objArr2 = methodHookParam.args;
                                    AbstractC0223g.m417d(objArr2, "args");
                                    Object objM258f02 = AbstractC0120h.m258f0(0, objArr2);
                                    Integer num = objM258f02 instanceof Integer ? (Integer) objM258f02 : null;
                                    if (num != null) {
                                        int iIntValue = num.intValue();
                                        int[] iArrM2031s = c0919l1.m2031s(listAdapter);
                                        if (iIntValue >= 0 && iIntValue < iArrM2031s.length) {
                                            methodHookParam.args[0] = Integer.valueOf(iArrM2031s[iIntValue]);
                                        }
                                        c0919l1.f3277h.set(Boolean.TRUE);
                                    }
                                }
                            }
                            Object[] objArr3 = methodHookParam.args;
                            AbstractC0223g.m417d(objArr3, "args");
                            Object objM258f03 = AbstractC0120h.m258f0(1, objArr3);
                            View view = objM258f03 instanceof View ? (View) objM258f03 : null;
                            if (view != null) {
                                C0919l1.m2004J(view);
                                break;
                            }
                        }
                    }
                }
                break;
            case 5:
                AbstractC0223g.m418e(methodHookParam, "param");
                boolean z2 = AbstractC1126i.f3786a;
                if (C1124g.m2413D() && !AbstractC0223g.m414a(c0919l1.f3277h.get(), Boolean.TRUE)) {
                    if (c0919l1.f3273d.contains(methodHookParam.thisObject)) {
                        Object[] objArr4 = methodHookParam.args;
                        AbstractC0223g.m417d(objArr4, "args");
                        Object objM258f04 = AbstractC0120h.m258f0(0, objArr4);
                        Integer num2 = objM258f04 instanceof Integer ? (Integer) objM258f04 : null;
                        if (num2 != null) {
                            int iIntValue2 = num2.intValue();
                            Object obj2 = methodHookParam.thisObject;
                            AbstractC0223g.m417d(obj2, "thisObject");
                            int[] iArrM2031s2 = c0919l1.m2031s(obj2);
                            if (iIntValue2 >= 0 && iIntValue2 < iArrM2031s2.length) {
                                methodHookParam.args[0] = Integer.valueOf(iArrM2031s2[iIntValue2]);
                                break;
                            }
                        }
                    }
                }
                break;
        }
    }
}
