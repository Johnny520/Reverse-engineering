package defpackage;

import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public abstract class gh {
    public static final Method a = null;
    public static final Method b = null;
    public static final Method c = null;
    public static final boolean d = false;

    static {
        Class r3 = Integer.TYPE;     // Catch: NoSuchMethodException -> L5
        Class r5 = Boolean.TYPE;     // Catch: NoSuchMethodException -> L5
        Class r6 = Float.TYPE;     // Catch: NoSuchMethodException -> L5
        Method r1 = AbsListView.class.getDeclaredMethod("positionSelector", new Class[]{r3, View.class, r5, r6, r6});     // Catch: NoSuchMethodException -> L5
        a = r1;     // Catch: NoSuchMethodException -> L5
        r1.setAccessible(true);     // Catch: NoSuchMethodException -> L5
        Method r12 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", new Class[]{r3});     // Catch: NoSuchMethodException -> L5
        b = r12;     // Catch: NoSuchMethodException -> L5
        r12.setAccessible(true);     // Catch: NoSuchMethodException -> L5
        Method r0 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", new Class[]{r3});     // Catch: NoSuchMethodException -> L5
        c = r0;     // Catch: NoSuchMethodException -> L5
        r0.setAccessible(true);     // Catch: NoSuchMethodException -> L5
        d = true;     // Catch: NoSuchMethodException -> L5
        return;
    L5:
        e = move-exception;
        e.printStackTrace();
    }
}
