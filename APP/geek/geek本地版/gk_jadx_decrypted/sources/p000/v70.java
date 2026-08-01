package p000;

import android.view.ViewGroup;
import com.ljx.wechatmod.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class v70 {

    /* JADX INFO: renamed from: a */
    public static final C0956z6 f4814a;

    /* JADX INFO: renamed from: b */
    public static final ThreadLocal f4815b;

    /* JADX INFO: renamed from: c */
    public static final ArrayList f4816c;

    static {
        C0956z6 c0956z6 = new C0956z6();
        c0956z6.f5461w = new ArrayList();
        c0956z6.f5462x = true;
        c0956z6.f5464z = false;
        c0956z6.f5460A = 0;
        c0956z6.f5462x = false;
        c0956z6.m2781F(new C0599pj(2));
        c0956z6.m2781F(new C0060b9());
        c0956z6.m2781F(new C0599pj(1));
        f4814a = c0956z6;
        f4815b = new ThreadLocal();
        f4816c = new ArrayList();
    }

    /* JADX INFO: renamed from: a */
    public static void m2490a(ViewGroup viewGroup, r70 r70Var) {
        ArrayList arrayList = f4816c;
        if (arrayList.contains(viewGroup)) {
            return;
        }
        WeakHashMap weakHashMap = ja0.f2600a;
        if (v90.m2496c(viewGroup)) {
            arrayList.add(viewGroup);
            if (r70Var == null) {
                r70Var = f4814a;
            }
            r70 r70VarClone = r70Var.clone();
            ArrayList arrayList2 = (ArrayList) m2491b().getOrDefault(viewGroup, null);
            if (arrayList2 != null && arrayList2.size() > 0) {
                int size = arrayList2.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList2.get(i);
                    i++;
                    ((r70) obj).mo2272t(viewGroup);
                }
            }
            if (r70VarClone != null) {
                r70VarClone.m2264g(viewGroup, true);
            }
            if (viewGroup.getTag(R.id.transition_current_scene) != null) {
                throw new ClassCastException();
            }
            viewGroup.setTag(R.id.transition_current_scene, null);
            if (r70VarClone != null) {
                u70 u70Var = new u70();
                u70Var.f4679a = r70VarClone;
                u70Var.f4680b = viewGroup;
                viewGroup.addOnAttachStateChangeListener(u70Var);
                viewGroup.getViewTreeObserver().addOnPreDrawListener(u70Var);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static C0511n6 m2491b() {
        C0511n6 c0511n6;
        ThreadLocal threadLocal = f4815b;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (c0511n6 = (C0511n6) weakReference.get()) != null) {
            return c0511n6;
        }
        C0511n6 c0511n62 = new C0511n6();
        threadLocal.set(new WeakReference(c0511n62));
        return c0511n62;
    }
}
