package p000;

import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: Ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0193Ee {

    /* JADX INFO: renamed from: a */
    public static final Method f589a = null;

    /* JADX INFO: renamed from: b */
    public static final Method f590b = null;

    /* JADX INFO: renamed from: c */
    public static final Method f591c = null;

    /* JADX INFO: renamed from: d */
    public static final boolean f592d = false;

    static {
        Class r3 = Integer.TYPE;     // Catch: NoSuchMethodException -> L5
        Class r5 = Boolean.TYPE;     // Catch: NoSuchMethodException -> L5
        Class r6 = Float.TYPE;     // Catch: NoSuchMethodException -> L5
        Method r1 = AbsListView.class.getDeclaredMethod("positionSelector", new Class[]{r3, View.class, r5, r6, r6});     // Catch: NoSuchMethodException -> L5
        f589a = r1;     // Catch: NoSuchMethodException -> L5
        r1.setAccessible(true);     // Catch: NoSuchMethodException -> L5
        Method r12 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", new Class[]{r3});     // Catch: NoSuchMethodException -> L5
        f590b = r12;     // Catch: NoSuchMethodException -> L5
        r12.setAccessible(true);     // Catch: NoSuchMethodException -> L5
        Method r0 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", new Class[]{r3});     // Catch: NoSuchMethodException -> L5
        f591c = r0;     // Catch: NoSuchMethodException -> L5
        r0.setAccessible(true);     // Catch: NoSuchMethodException -> L5
        f592d = true;     // Catch: NoSuchMethodException -> L5
        return;
    L5:
        e = move-exception;
        e.printStackTrace();
    }
}
