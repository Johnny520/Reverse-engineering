package p000;

import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: ih */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0334ih {

    /* JADX INFO: renamed from: a */
    public static final Method f2539a;

    /* JADX INFO: renamed from: b */
    public static final Method f2540b;

    /* JADX INFO: renamed from: c */
    public static final Method f2541c;

    /* JADX INFO: renamed from: d */
    public static final boolean f2542d;

    static {
        try {
            Class cls = Integer.TYPE;
            Class cls2 = Boolean.TYPE;
            Class cls3 = Float.TYPE;
            Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, cls2, cls3, cls3);
            f2539a = declaredMethod;
            declaredMethod.setAccessible(true);
            Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
            f2540b = declaredMethod2;
            declaredMethod2.setAccessible(true);
            Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
            f2541c = declaredMethod3;
            declaredMethod3.setAccessible(true);
            f2542d = true;
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
