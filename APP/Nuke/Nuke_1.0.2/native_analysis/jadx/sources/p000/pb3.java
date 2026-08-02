package p000;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import me.dartcv.nuke.R;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class pb3 {

    /* JADX INFO: renamed from: a */
    public static long f8247a;

    /* JADX INFO: renamed from: b */
    public static Method f8248b;

    /* JADX INFO: renamed from: a */
    public static void m3844a(String str) {
        if (str.length() > 127) {
            str = str.substring(0, 127);
        }
        Trace.beginSection(str);
    }

    /* JADX INFO: renamed from: b */
    public static final ViewParent m3845b(View view) {
        view.getClass();
        ViewParent parent = view.getParent();
        if (parent != null) {
            return parent;
        }
        Object tag = view.getTag(R.id.view_tree_disjoint_parent);
        if (tag instanceof ViewParent) {
            return (ViewParent) tag;
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m3846c() {
        if (Build.VERSION.SDK_INT >= 29) {
            return z23.m6381a();
        }
        try {
            if (f8248b == null) {
                f8247a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f8248b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f8248b.invoke(null, Long.valueOf(f8247a))).booleanValue();
        } catch (Exception e) {
            if (!(e instanceof InvocationTargetException)) {
                Log.v("Trace", "Unable to call isTagEnabled via reflection", e);
                return false;
            }
            Throwable cause = e.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
    }
}
