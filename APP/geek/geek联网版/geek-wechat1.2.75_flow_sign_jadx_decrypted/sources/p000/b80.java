package p000;

import android.view.ViewGroup;
import com.ljx.wechatmod.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class b80 {

    /* JADX INFO: renamed from: a */
    public static final C0364j7 f694a;

    /* JADX INFO: renamed from: b */
    public static final ThreadLocal f695b;

    /* JADX INFO: renamed from: c */
    public static final ArrayList f696c;

    static {
        C0364j7 c0364j7 = new C0364j7();
        c0364j7.f2671w = new ArrayList();
        c0364j7.f2672x = true;
        c0364j7.f2674z = false;
        c0364j7.f2670A = 0;
        c0364j7.f2672x = false;
        c0364j7.m1580F(new C0672rj(2));
        c0364j7.m1580F(new C0477m9());
        c0364j7.m1580F(new C0672rj(1));
        f694a = c0364j7;
        f695b = new ThreadLocal();
        f696c = new ArrayList();
    }

    /* JADX INFO: renamed from: a */
    public static void m495a(ViewGroup viewGroup, x70 x70Var) {
        ArrayList arrayList = f696c;
        if (arrayList.contains(viewGroup)) {
            return;
        }
        WeakHashMap weakHashMap = oa0.f3426a;
        if (aa0.m40c(viewGroup)) {
            arrayList.add(viewGroup);
            if (x70Var == null) {
                x70Var = f694a;
            }
            x70 x70VarClone = x70Var.clone();
            ArrayList arrayList2 = (ArrayList) m496b().getOrDefault(viewGroup, null);
            if (arrayList2 != null && arrayList2.size() > 0) {
                int size = arrayList2.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList2.get(i);
                    i++;
                    ((x70) obj).mo1586t(viewGroup);
                }
            }
            if (x70VarClone != null) {
                x70VarClone.m2645g(viewGroup, true);
            }
            if (viewGroup.getTag(R.id.transition_current_scene) != null) {
                throw new ClassCastException();
            }
            viewGroup.setTag(R.id.transition_current_scene, null);
            if (x70VarClone != null) {
                a80 a80Var = new a80();
                a80Var.f50a = x70VarClone;
                a80Var.f51b = viewGroup;
                viewGroup.addOnAttachStateChangeListener(a80Var);
                viewGroup.getViewTreeObserver().addOnPreDrawListener(a80Var);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static C0511n6 m496b() {
        C0511n6 c0511n6;
        ThreadLocal threadLocal = f695b;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (c0511n6 = (C0511n6) weakReference.get()) != null) {
            return c0511n6;
        }
        C0511n6 c0511n62 = new C0511n6();
        threadLocal.set(new WeakReference(c0511n62));
        return c0511n62;
    }
}
