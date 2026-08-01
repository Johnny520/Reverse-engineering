package p086r0;

import android.view.View;
import android.widget.ListView;
import de.robv.android.xposed.XC_MethodHook;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import p011F0.AbstractC0120h;
import p027N0.AbstractC0223g;
import p054c0.AbstractC0509a;

/* JADX INFO: renamed from: r0.a1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0886a1 extends AbstractC0509a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3064a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0854L0 f3065b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0886a1(C0854L0 c0854l0, int i2) {
        this.f3064a = i2;
        this.f3065b = c0854l0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p054c0.AbstractC0509a
    public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        switch (this.f3064a) {
            case 4:
                AbstractC0223g.m418e(methodHookParam, "param");
                C0854L0 c0854l0 = this.f3065b;
                ((ThreadLocal) c0854l0.f2937o).remove();
                Object[] objArr = methodHookParam.args;
                AbstractC0223g.m417d(objArr, "args");
                Object objM258f0 = AbstractC0120h.m258f0(2, objArr);
                ListView listView = objM258f0 instanceof ListView ? (ListView) objM258f0 : null;
                if (listView != null) {
                    Set set = c0854l0.f2926d;
                    if (set.contains(listView) || C0854L0.m1714O(listView)) {
                        set.add(listView);
                        Object result = methodHookParam.getResult();
                        View view = result instanceof View ? (View) result : null;
                        if (view != null) {
                            c0854l0.m1748R(view, listView);
                            break;
                        }
                    }
                }
                break;
            case 6:
                AbstractC0223g.m418e(methodHookParam, "param");
                Object obj = methodHookParam.thisObject;
                ListView listView2 = obj instanceof ListView ? (ListView) obj : null;
                if (listView2 != null) {
                    C0854L0 c0854l02 = this.f3065b;
                    c0854l02.getClass();
                    if (C0854L0.m1714O(listView2)) {
                        c0854l02.f2926d.add(listView2);
                        C0854L0.m1719e(c0854l02, listView2, true);
                        int childCount = listView2.getChildCount();
                        for (int i2 = 0; i2 < childCount; i2++) {
                            View childAt = listView2.getChildAt(i2);
                            AbstractC0223g.m417d(childAt, "getChildAt(...)");
                            c0854l02.m1748R(childAt, listView2);
                        }
                        break;
                    }
                }
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p054c0.AbstractC0509a
    public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        switch (this.f3064a) {
            case 0:
                AbstractC0223g.m418e(methodHookParam, "param");
                Object obj = methodHookParam.thisObject;
                C0854L0 c0854l0 = this.f3065b;
                if (C0854L0.m1721g(c0854l0, obj)) {
                    Object obj2 = methodHookParam.thisObject;
                    AbstractC0223g.m417d(obj2, "thisObject");
                    methodHookParam.setResult(Integer.valueOf(c0854l0.m1735D(obj2).size()));
                    break;
                }
                break;
            case 1:
                AbstractC0223g.m418e(methodHookParam, "param");
                Object obj3 = methodHookParam.thisObject;
                C0854L0 c0854l02 = this.f3065b;
                if (C0854L0.m1721g(c0854l02, obj3)) {
                    Object[] objArr = methodHookParam.args;
                    AbstractC0223g.m417d(objArr, "args");
                    Object objM258f0 = AbstractC0120h.m258f0(0, objArr);
                    Integer num = objM258f0 instanceof Integer ? (Integer) objM258f0 : null;
                    if (num != null) {
                        int iIntValue = num.intValue();
                        Integer num2 = (Integer) ((ThreadLocal) c0854l02.f2937o).get();
                        if (num2 == null || num2.intValue() != iIntValue) {
                            Object obj4 = methodHookParam.thisObject;
                            AbstractC0223g.m417d(obj4, "thisObject");
                            List listM1735D = c0854l02.m1735D(obj4);
                            if (iIntValue < 0 || iIntValue >= listM1735D.size()) {
                                methodHookParam.setResult((Object) null);
                            } else {
                                Object obj5 = methodHookParam.thisObject;
                                AbstractC0223g.m417d(obj5, "thisObject");
                                methodHookParam.setResult(c0854l02.m1741J(((Number) listM1735D.get(iIntValue)).intValue(), obj5));
                            }
                            break;
                        }
                    }
                }
                break;
            case 2:
                AbstractC0223g.m418e(methodHookParam, "param");
                Object obj6 = methodHookParam.thisObject;
                C0854L0 c0854l03 = this.f3065b;
                if (C0854L0.m1721g(c0854l03, obj6)) {
                    Object[] objArr2 = methodHookParam.args;
                    AbstractC0223g.m417d(objArr2, "args");
                    Object objM258f02 = AbstractC0120h.m258f0(0, objArr2);
                    Integer num3 = objM258f02 instanceof Integer ? (Integer) objM258f02 : null;
                    if (num3 != null) {
                        int iIntValue2 = num3.intValue();
                        Integer num4 = (Integer) ((ThreadLocal) c0854l03.f2937o).get();
                        if (num4 == null || num4.intValue() != iIntValue2) {
                            Object obj7 = methodHookParam.thisObject;
                            AbstractC0223g.m417d(obj7, "thisObject");
                            List listM1735D2 = c0854l03.m1735D(obj7);
                            if (iIntValue2 < 0 || iIntValue2 >= listM1735D2.size()) {
                                methodHookParam.setResult(0L);
                            } else {
                                methodHookParam.args[0] = listM1735D2.get(iIntValue2);
                            }
                            break;
                        }
                    }
                }
                break;
            case 3:
                AbstractC0223g.m418e(methodHookParam, "param");
                C0854L0 c0854l04 = this.f3065b;
                c0854l04.f2930h.remove(methodHookParam.thisObject);
                if (!c0854l04.f2929g.contains(methodHookParam.thisObject)) {
                    ((WeakHashMap) c0854l04.f2934l).remove(methodHookParam.thisObject);
                }
                break;
            case 4:
                AbstractC0223g.m418e(methodHookParam, "param");
                Object obj8 = methodHookParam.thisObject;
                C0854L0 c0854l05 = this.f3065b;
                if (C0854L0.m1721g(c0854l05, obj8)) {
                    Object[] objArr3 = methodHookParam.args;
                    AbstractC0223g.m417d(objArr3, "args");
                    Object objM258f03 = AbstractC0120h.m258f0(0, objArr3);
                    Integer num5 = objM258f03 instanceof Integer ? (Integer) objM258f03 : null;
                    if (num5 != null) {
                        int iIntValue3 = num5.intValue();
                        Object obj9 = methodHookParam.thisObject;
                        AbstractC0223g.m417d(obj9, "thisObject");
                        List listM1735D3 = c0854l05.m1735D(obj9);
                        if (iIntValue3 < 0 || iIntValue3 >= listM1735D3.size()) {
                            ((ThreadLocal) c0854l05.f2937o).remove();
                        } else {
                            int iIntValue4 = ((Number) listM1735D3.get(iIntValue3)).intValue();
                            ((ThreadLocal) c0854l05.f2937o).set(Integer.valueOf(iIntValue4));
                            methodHookParam.args[0] = Integer.valueOf(iIntValue4);
                        }
                    }
                    break;
                }
                break;
            case 5:
                AbstractC0223g.m418e(methodHookParam, "param");
                Object obj10 = methodHookParam.thisObject;
                ListView listView = obj10 instanceof ListView ? (ListView) obj10 : null;
                if (listView != null) {
                    C0854L0 c0854l06 = this.f3065b;
                    if (!c0854l06.f2926d.contains(listView)) {
                        if (C0854L0.m1714O(listView)) {
                            c0854l06.f2926d.add(listView);
                        }
                    }
                    C0854L0.m1719e(c0854l06, listView, false);
                    int childCount = listView.getChildCount();
                    for (int i2 = 0; i2 < childCount; i2++) {
                        View childAt = listView.getChildAt(i2);
                        AbstractC0223g.m417d(childAt, "getChildAt(...)");
                        c0854l06.m1748R(childAt, listView);
                    }
                    break;
                }
                break;
        }
    }
}
