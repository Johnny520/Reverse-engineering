package p069i;

import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import p099y.AbstractC1048L;

/* JADX INFO: renamed from: i.t1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0718t1 {

    /* JADX INFO: renamed from: a */
    public static final Method f2436a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        try {
            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
            f2436a = declaredMethod;
            if (declaredMethod.isAccessible()) {
                return;
            }
            declaredMethod.setAccessible(true);
        } catch (NoSuchMethodException unused) {
            Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static boolean m1366a(View view) {
        WeakHashMap weakHashMap = AbstractC1048L.f3662a;
        return view.getLayoutDirection() == 1;
    }
}
