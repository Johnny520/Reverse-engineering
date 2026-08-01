package p293u4;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.Log;
import android.view.Display;
import android.view.DisplayCutout;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: u4.i */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8512i {
    /* JADX INFO: renamed from: d */
    public static final DisplayCutout m32761d(Display display) throws Exception {
        try {
            Constructor<?> constructor = Class.forName("android.view.DisplayInfo").getConstructor(null);
            constructor.setAccessible(true);
            Object objNewInstance = constructor.newInstance(null);
            Method declaredMethod = display.getClass().getDeclaredMethod("getDisplayInfo", objNewInstance.getClass());
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(display, objNewInstance);
            Field declaredField = objNewInstance.getClass().getDeclaredField("displayCutout");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(objNewInstance);
            if (AbstractC8510g.m32756a(obj)) {
                return AbstractC8511h.m32757a(obj);
            }
        } catch (Exception e10) {
            if (!(e10 instanceof ClassNotFoundException) && !(e10 instanceof NoSuchMethodException) && !(e10 instanceof NoSuchFieldException) && !(e10 instanceof IllegalAccessException) && !(e10 instanceof InvocationTargetException) && !(e10 instanceof InstantiationException)) {
                throw e10;
            }
            Log.w(InterfaceC8505b.f28398a.m32755b(), e10);
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public static final int m32762e(Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    /* JADX INFO: renamed from: f */
    public static final void m32763f(Activity activity, Rect rect) {
        activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
    }
}
