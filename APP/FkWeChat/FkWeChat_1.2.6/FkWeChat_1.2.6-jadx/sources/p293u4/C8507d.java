package p293u4;

import android.app.Activity;
import android.content.res.Configuration;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.Log;
import android.view.Display;
import android.view.DisplayCutout;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: u4.d */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C8507d implements InterfaceC8505b {

    /* JADX INFO: renamed from: b */
    public static final C8507d f28402b = new C8507d();

    @Override // p293u4.InterfaceC8505b
    /* JADX INFO: renamed from: a */
    public Rect mo32753a(Activity activity) throws Exception {
        DisplayCutout displayCutoutM32761d;
        activity.getClass();
        Rect rect = new Rect();
        Configuration configuration = activity.getResources().getConfiguration();
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            if (C8504a.f28397a.m32752a(activity)) {
                Object objInvoke = obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null);
                objInvoke.getClass();
                rect.set((Rect) objInvoke);
            } else {
                Object objInvoke2 = obj.getClass().getDeclaredMethod("getAppBounds", null).invoke(obj, null);
                objInvoke2.getClass();
                rect.set((Rect) objInvoke2);
            }
        } catch (Exception e10) {
            if (!(e10 instanceof NoSuchFieldException) && !(e10 instanceof NoSuchMethodException) && !(e10 instanceof IllegalAccessException) && !(e10 instanceof InvocationTargetException)) {
                throw e10;
            }
            Log.w(InterfaceC8505b.f28398a.m32755b(), e10);
            AbstractC8512i.m32763f(activity, rect);
        }
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        C8504a c8504a = C8504a.f28397a;
        if (!c8504a.m32752a(activity)) {
            int iM32762e = AbstractC8512i.m32762e(activity);
            int i10 = rect.bottom;
            if (i10 + iM32762e == point.y) {
                rect.bottom = i10 + iM32762e;
            } else {
                int i11 = rect.right;
                if (i11 + iM32762e == point.x) {
                    rect.right = i11 + iM32762e;
                } else if (rect.left == iM32762e) {
                    rect.left = 0;
                }
            }
        }
        if ((rect.width() < point.x || rect.height() < point.y) && !c8504a.m32752a(activity) && (displayCutoutM32761d = AbstractC8512i.m32761d(defaultDisplay)) != null) {
            int i12 = rect.left;
            C8521r c8521r = C8521r.f28410a;
            if (i12 == c8521r.m32772b(displayCutoutM32761d)) {
                rect.left = 0;
            }
            if (point.x - rect.right == c8521r.m32773c(displayCutoutM32761d)) {
                rect.right += c8521r.m32773c(displayCutoutM32761d);
            }
            if (rect.top == c8521r.m32774d(displayCutoutM32761d)) {
                rect.top = 0;
            }
            if (point.y - rect.bottom == c8521r.m32771a(displayCutoutM32761d)) {
                rect.bottom += c8521r.m32771a(displayCutoutM32761d);
            }
        }
        return rect;
    }
}
