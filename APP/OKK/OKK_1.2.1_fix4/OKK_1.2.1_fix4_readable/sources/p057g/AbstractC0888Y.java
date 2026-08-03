package p057g;

import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: g.Y */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0888Y {

    /* JADX INFO: renamed from: a */
    public static final Method f3159a;

    /* JADX INFO: renamed from: b */
    public static final Method f3160b;

    /* JADX INFO: renamed from: c */
    public static final Method f3161c;

    /* JADX INFO: renamed from: d */
    public static final boolean f3162d;

    static {
        try {
            Class cls = Integer.TYPE;
            Class cls2 = Boolean.TYPE;
            Class cls3 = Float.TYPE;
            Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, cls2, cls3, cls3);
            f3159a = declaredMethod;
            declaredMethod.setAccessible(true);
            Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
            f3160b = declaredMethod2;
            declaredMethod2.setAccessible(true);
            Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
            f3161c = declaredMethod3;
            declaredMethod3.setAccessible(true);
            f3162d = true;
        } catch (NoSuchMethodException e2) {
            e2.printStackTrace();
        }
    }
}
