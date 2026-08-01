package p086r0;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import de.robv.android.xposed.XC_MethodHook;
import java.util.Set;
import p011F0.AbstractC0120h;
import p022L.AbstractC0174d;
import p027N0.AbstractC0223g;
import p052b1.AbstractC0503h;
import p054c0.AbstractC0509a;

/* JADX INFO: renamed from: r0.f0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0900f0 extends AbstractC0509a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3165a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0903g0 f3166b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0900f0(C0903g0 c0903g0, int i2) {
        this.f3165a = i2;
        this.f3166b = c0903g0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p054c0.AbstractC0509a
    public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        switch (this.f3165a) {
            case 0:
                AbstractC0223g.m418e(methodHookParam, "param");
                Object[] objArr = methodHookParam.args;
                AbstractC0223g.m417d(objArr, "args");
                if (AbstractC0223g.m414a(AbstractC0120h.m258f0(0, objArr), Boolean.TRUE)) {
                    Object obj = methodHookParam.thisObject;
                    Activity activity = obj instanceof Activity ? (Activity) obj : null;
                    if (activity != null) {
                        String name = activity.getClass().getName();
                        C0903g0 c0903g0 = this.f3166b;
                        if (c0903g0.m1941m(name)) {
                            c0903g0.m1937e("activity focus", activity.getClass().getName());
                            c0903g0.m1944p("focus", activity.getClass().getName(), AbstractC0174d.m355k("tag=", AbstractC0503h.m970F(activity)));
                        }
                        Window window = activity.getWindow();
                        c0903g0.m1948t(window != null ? window.getDecorView() : null);
                        break;
                    }
                }
                break;
            case 2:
                AbstractC0223g.m418e(methodHookParam, "param");
                Object obj2 = methodHookParam.thisObject;
                View view = obj2 instanceof View ? (View) obj2 : null;
                if (view != null) {
                    C0903g0 c0903g02 = this.f3166b;
                    if (c0903g02.m1943o(view)) {
                        String name2 = view.getClass().getName();
                        String strM1934i = C0903g0.m1934i(view);
                        if (strM1934i == null) {
                            strM1934i = "";
                        }
                        c0903g02.m1937e("tag page setAdapter", name2, strM1934i);
                        c0903g02.f3187c.add(view);
                        Object[] objArr2 = methodHookParam.args;
                        AbstractC0223g.m417d(objArr2, "args");
                        Object objM258f0 = AbstractC0120h.m258f0(0, objArr2);
                        if (objM258f0 == null) {
                            objM258f0 = C0903g0.m1933h(view);
                        }
                        if (objM258f0 != null) {
                            c0903g02.m1940k(objM258f0.getClass());
                        }
                        c0903g02.m1949u(view);
                        break;
                    }
                }
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p054c0.AbstractC0509a
    public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        boolean zM1936c;
        switch (this.f3165a) {
            case 1:
                AbstractC0223g.m418e(methodHookParam, "param");
                Object obj = methodHookParam.thisObject;
                View view = obj instanceof View ? (View) obj : null;
                if (view != null) {
                    C0903g0 c0903g0 = this.f3166b;
                    c0903g0.getClass();
                    String strM1934i = C0903g0.m1934i(view);
                    if (AbstractC0223g.m414a(strM1934i, "mim") || AbstractC0223g.m414a(strM1934i, "k12")) {
                        String name = view.getClass().getName();
                        if (strM1934i == null) {
                            strM1934i = "";
                        }
                        c0903g0.m1937e("recycler beforeRender raw", name, strM1934i);
                    }
                    if (c0903g0.m1943o(view)) {
                        String name2 = view.getClass().getName();
                        String strM1934i2 = C0903g0.m1934i(view);
                        c0903g0.m1937e("tag page beforeRender", name2, strM1934i2 != null ? strM1934i2 : "");
                        c0903g0.f3187c.add(view);
                        Object objM1933h = C0903g0.m1933h(view);
                        if (objM1933h != null) {
                            c0903g0.m1940k(objM1933h.getClass());
                        }
                        c0903g0.m1949u(view);
                        break;
                    }
                }
                break;
            case 3:
                AbstractC0223g.m418e(methodHookParam, "param");
                Object obj2 = methodHookParam.thisObject;
                ViewGroup viewGroup = obj2 instanceof ViewGroup ? (ViewGroup) obj2 : null;
                if (viewGroup != null) {
                    C0903g0 c0903g02 = this.f3166b;
                    c0903g02.getClass();
                    String strM1934i3 = C0903g0.m1934i(viewGroup);
                    if (AbstractC0223g.m414a(strM1934i3, "mim") || AbstractC0223g.m414a(strM1934i3, "k12")) {
                        String name3 = viewGroup.getClass().getName();
                        if (strM1934i3 == null) {
                            strM1934i3 = "";
                        }
                        c0903g02.m1937e("viewgroup dispatch", name3, strM1934i3);
                    }
                    if (c0903g02.m1943o(viewGroup)) {
                        Set set = c0903g02.f3187c;
                        if (set.contains(viewGroup)) {
                            zM1936c = c0903g02.m1936c(viewGroup);
                        } else if (c0903g02.m1943o(viewGroup)) {
                            String name4 = viewGroup.getClass().getName();
                            String strM1934i4 = C0903g0.m1934i(viewGroup);
                            c0903g02.m1944p("tag recycler target", name4, strM1934i4 != null ? strM1934i4 : "");
                            set.add(viewGroup);
                            zM1936c = c0903g02.m1936c(viewGroup);
                        } else {
                            zM1936c = false;
                        }
                        if (zM1936c) {
                            Object objM1933h2 = C0903g0.m1933h(viewGroup);
                            if (objM1933h2 != null) {
                                c0903g02.m1940k(objM1933h2.getClass());
                            }
                            c0903g02.m1949u(viewGroup);
                        }
                        break;
                    }
                }
                break;
        }
    }
}
