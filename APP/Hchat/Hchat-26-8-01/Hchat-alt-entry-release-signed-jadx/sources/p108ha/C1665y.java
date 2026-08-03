package p108ha;

import android.view.View;
import android.widget.Adapter;
import de.robv.android.xposed.XC_MethodHook;
import java.lang.reflect.Method;
import java.util.Iterator;
import p099h.Hchat.utils.KavaReflector;
import p276sf.C3959f;
import tf.AbstractC4165l;

/* JADX INFO: renamed from: ha.y */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1665y extends XC_MethodHook {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5474a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1666z f5475b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C1665y(C1666z c1666z, int i9) {
        this.f5474a = i9;
        this.f5475b = c1666z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        Object c3959f;
        switch (this.f5474a) {
            case 0:
                methodHookParam.getClass();
                Object obj = methodHookParam.thisObject;
                Object obj2 = null;
                View view = obj instanceof View ? (View) obj : null;
                if (view != null) {
                    Object[] objArr = methodHookParam.args;
                    objArr.getClass();
                    Object objM8366C0 = AbstractC4165l.m8366C0(1, objArr);
                    C1666z c1666z = this.f5475b;
                    if (objM8366C0 == null) {
                        c1666z.getClass();
                    } else if (c1666z.m4254j(objM8366C0)) {
                        obj2 = objM8366C0;
                    } else {
                        C1664x c1664xM4260p = (C1664x) c1666z.f5484i.get(objM8366C0.getClass());
                        if (c1664xM4260p != null || (c1664xM4260p = c1666z.m4260p(objM8366C0.getClass())) != null) {
                            Iterator it = c1664xM4260p.f5473a.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    objM8366C0 = KavaReflector.invoke((Method) it.next(), objM8366C0, new Object[0]);
                                    if (objM8366C0 != null) {
                                    }
                                } else if (c1666z.m4254j(objM8366C0)) {
                                }
                            }
                        }
                    }
                    if (obj2 != null) {
                        C1666z.m4245a(c1666z, view, obj2);
                    }
                }
                break;
            case 1:
                methodHookParam.getClass();
                Object result = methodHookParam.getResult();
                View view2 = result instanceof View ? (View) result : null;
                if (view2 != null) {
                    Object[] objArr2 = methodHookParam.args;
                    objArr2.getClass();
                    Object objM8366C02 = AbstractC4165l.m8366C0(0, objArr2);
                    if (objM8366C02 != null) {
                        C1666z.m4245a(this.f5475b, view2, objM8366C02);
                    }
                }
                break;
            case 2:
                methodHookParam.getClass();
                Object result2 = methodHookParam.getResult();
                View view3 = result2 instanceof View ? (View) result2 : null;
                if (view3 != null) {
                    Object obj3 = methodHookParam.thisObject;
                    Adapter adapter = obj3 instanceof Adapter ? (Adapter) obj3 : null;
                    if (adapter != null) {
                        Object[] objArr3 = methodHookParam.args;
                        objArr3.getClass();
                        Object objM8366C03 = AbstractC4165l.m8366C0(0, objArr3);
                        Number number = objM8366C03 instanceof Number ? (Number) objM8366C03 : null;
                        if (number != null) {
                            try {
                                c3959f = adapter.getItem(number.intValue());
                            } catch (Throwable th2) {
                                c3959f = new C3959f(th2);
                            }
                            Object obj4 = c3959f instanceof C3959f ? null : c3959f;
                            if (obj4 != null) {
                                C1666z.m4245a(this.f5475b, view3, obj4);
                            }
                        }
                    }
                }
                break;
            default:
                super.afterHookedMethod(methodHookParam);
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        int i9 = this.f5474a;
        methodHookParam.getClass();
        switch (i9) {
            case 0:
                Object obj = methodHookParam.thisObject;
                View view = obj instanceof View ? (View) obj : null;
                if (view != null) {
                    C1666z c1666z = this.f5475b;
                    c1666z.f5482g.remove(view);
                    c1666z.m4261q(view);
                }
                break;
            case 1:
                Object[] objArr = methodHookParam.args;
                objArr.getClass();
                Object objM8366C0 = AbstractC4165l.m8366C0(3, objArr);
                View view2 = objM8366C0 instanceof View ? (View) objM8366C0 : null;
                if (view2 != null) {
                    C1666z c1666z2 = this.f5475b;
                    c1666z2.f5482g.remove(view2);
                    c1666z2.m4261q(view2);
                }
                break;
            case 2:
                Object[] objArr2 = methodHookParam.args;
                objArr2.getClass();
                Object objM8366C02 = AbstractC4165l.m8366C0(1, objArr2);
                View view3 = objM8366C02 instanceof View ? (View) objM8366C02 : null;
                if (view3 != null) {
                    C1666z c1666z3 = this.f5475b;
                    c1666z3.f5482g.remove(view3);
                    c1666z3.m4261q(view3);
                }
                break;
            default:
                if (!this.f5475b.m4250b().isEmpty()) {
                    methodHookParam.setResult(Boolean.FALSE);
                }
                break;
        }
    }
}
