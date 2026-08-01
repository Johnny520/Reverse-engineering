package p086r0;

import android.content.Context;
import android.view.View;
import android.widget.ListView;
import de.robv.android.xposed.XC_MethodHook;
import java.lang.ref.WeakReference;
import p009E0.C0104d;
import p011F0.AbstractC0120h;
import p027N0.AbstractC0223g;
import p054c0.AbstractC0509a;
import p054c0.AbstractC0514f;
import p070i0.AbstractC0731a;

/* JADX INFO: renamed from: r0.W */
/* JADX INFO: loaded from: classes.dex */
public final class C0876W extends AbstractC0509a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3017a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f3018b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0894d0 f3019c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0876W(boolean z2, C0894d0 c0894d0, int i2) {
        this.f3017a = i2;
        this.f3018b = z2;
        this.f3019c = c0894d0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0088  */
    @Override // p054c0.AbstractC0509a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        Object obj;
        Object c0104d;
        String name;
        boolean zM1857q0;
        switch (this.f3017a) {
            case 0:
                AbstractC0223g.m418e(methodHookParam, "param");
                Object[] objArr = methodHookParam.args;
                AbstractC0223g.m417d(objArr, "args");
                if (AbstractC0223g.m414a(objArr.length == 0 ? null : objArr[0], Boolean.valueOf(this.f3018b)) && (obj = methodHookParam.thisObject) != null) {
                    WeakReference weakReference = new WeakReference(obj);
                    C0894d0 c0894d0 = this.f3019c;
                    c0894d0.f3122a = weakReference;
                    WeakReference weakReference2 = c0894d0.f3123b;
                    ListView listView = weakReference2 != null ? (ListView) weakReference2.get() : null;
                    WeakReference weakReference3 = c0894d0.f3124c;
                    View viewM1827R0 = C0894d0.m1827R0(obj, listView, weakReference3 != null ? (View) weakReference3.get() : null);
                    if (viewM1827R0 != null) {
                        viewM1827R0.post(new RunnableC0847J(c0894d0, 0));
                        viewM1827R0.postDelayed(new RunnableC0847J(c0894d0, 1), 96L);
                        break;
                    }
                }
                break;
            default:
                AbstractC0223g.m418e(methodHookParam, "param");
                Object[] objArr2 = methodHookParam.args;
                AbstractC0223g.m417d(objArr2, "args");
                Object objM258f0 = AbstractC0120h.m258f0(0, objArr2);
                if (objM258f0 != null) {
                    try {
                        c0104d = (View) AbstractC0514f.f1622b.mo1015f(objM258f0, "itemView");
                    } catch (Throwable th) {
                        c0104d = new C0104d(th);
                    }
                    if (c0104d instanceof C0104d) {
                        c0104d = null;
                    }
                    View view = (View) c0104d;
                    if (view != null) {
                        boolean z2 = this.f3018b;
                        C0894d0 c0894d02 = this.f3019c;
                        if (!z2 || c0894d02.m1866E0(methodHookParam.thisObject.getClass().getName())) {
                            WeakReference weakReference4 = c0894d02.f3122a;
                            Object obj2 = weakReference4 != null ? weakReference4.get() : null;
                            View viewM1865z = obj2 != null ? C0894d0.m1865z(obj2) : null;
                            if (viewM1865z != null) {
                                View view2 = view;
                                while (view2 != null) {
                                    if (view2 == viewM1865z) {
                                        zM1857q0 = true;
                                    } else {
                                        Object parent = view2.getParent();
                                        view2 = parent instanceof View ? (View) parent : null;
                                    }
                                }
                                Context context = view.getContext();
                                name = context != null ? context.getClass().getName() : null;
                                if (name == null) {
                                    name = "";
                                }
                                zM1857q0 = C0894d0.m1857q0(name);
                            } else {
                                Context context2 = view.getContext();
                                if (context2 != null) {
                                }
                                if (name == null) {
                                }
                                zM1857q0 = C0894d0.m1857q0(name);
                            }
                            if (zM1857q0) {
                                if (!c0894d02.m1867F().isEmpty()) {
                                    String strConcat = "adapter=".concat(methodHookParam.thisObject.getClass().getName());
                                    Object[] objArr3 = methodHookParam.args;
                                    AbstractC0223g.m417d(objArr3, "args");
                                    AbstractC0731a.m1384a("hide contact mvvm bind", strConcat, "position=" + AbstractC0120h.m258f0(1, objArr3));
                                    c0894d02.m1891Y0(view);
                                    view.post(new RunnableC0841H(c0894d02, view, 4));
                                } else {
                                    c0894d02.m1887U0(view);
                                }
                                break;
                            }
                        }
                    }
                    break;
                }
                break;
        }
    }
}
