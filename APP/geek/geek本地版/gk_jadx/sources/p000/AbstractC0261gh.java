package p000;

import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: gh */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0261gh {

    /* JADX INFO: renamed from: a */
    public static final Method f2127a;

    /* JADX INFO: renamed from: b */
    public static final Method f2128b;

    /* JADX INFO: renamed from: c */
    public static final Method f2129c;

    /* JADX INFO: renamed from: d */
    public static final boolean f2130d;

    static {
        try {
            Class cls = Integer.TYPE;
            Class cls2 = Boolean.TYPE;
            Class cls3 = Float.TYPE;
            Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, cls2, cls3, cls3);
            f2127a = declaredMethod;
            declaredMethod.setAccessible(true);
            Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
            f2128b = declaredMethod2;
            declaredMethod2.setAccessible(true);
            Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
            f2129c = declaredMethod3;
            declaredMethod3.setAccessible(true);
            f2130d = true;
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
