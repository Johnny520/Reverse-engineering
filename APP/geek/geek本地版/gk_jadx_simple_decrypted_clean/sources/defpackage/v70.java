package defpackage;

import android.view.ViewGroup;
import com.ljx.wechatmod.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class v70 {
    public static final z6 a = null;
    public static final ThreadLocal b = null;
    public static final ArrayList c = null;

    static {
        z6 r0 = new z6();
        r0.w = new ArrayList();
        r0.x = true;
        r0.z = false;
        r0.A = 0;
        r0.x = false;
        r0.F(new pj(2));
        r0.F(new b9());
        r0.F(new pj(1));
        a = r0;
        b = new ThreadLocal();
        c = new ArrayList();
    }

    public static void a(ViewGroup r5, r70 r6) {
        ArrayList r0 = c;
        if (r0.contains(r5) == true) goto L26;
        WeakHashMap r1 = ja0.a;
        if (v90.c(r5) == false) goto L28;
        r0.add(r5);
        if (r6 != null) goto L9;
        r6 = a;
    L9:
        r70 r62 = r6.i();
        ArrayList r02 = (ArrayList) b().getOrDefault(r5, null);
        if (r02 != null) goto L12;
    L16:
        if (r62 == null) goto L19;
        r62.g(r5, true);
    L19:
        if (r5.getTag(R.id.transition_current_scene) != null) goto L25;
        r5.setTag(R.id.transition_current_scene, null);
        if (r62 == null) goto L29;
        u70 r03 = new u70();
        r03.a = r62;
        r03.b = r5;
        r5.addOnAttachStateChangeListener(r03);
        r5.getViewTreeObserver().addOnPreDrawListener(r03);
        return;
    L29:
        return;
    L25:
        throw new ClassCastException();
    L12:
        if (r02.size() <= 0) goto L16;
        int r2 = r02.size();
        int r3 = 0;
    L14:
        if (r3 >= r2) goto L16;
        Object r4 = r02.get(r3);
        r3 = r3 + 1;
        ((r70) r4).t(r5);
        goto L14
    L28:
        return;
    }

    public static n6 b() {
        ThreadLocal r0 = b;
        WeakReference r1 = (WeakReference) r0.get();
        if (r1 == null) goto L7;
        n6 r12 = (n6) r1.get();
        if (r12 == null) goto L7;
        return r12;
    L7:
        n6 r13 = new n6();
        r0.set(new WeakReference(r13));
        return r13;
    }
}
