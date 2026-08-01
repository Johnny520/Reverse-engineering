package p150;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.inputmethodservice.InputMethodService;
import android.util.Log;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.WindowManager;
import androidx.window.layout.C3432;
import com.alibaba.fastjson2.reader.AbstractC3576;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p163.C8396;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言子兰哲世楪苏.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8340 implements InterfaceC8341, InterfaceC8338, InterfaceC8343 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ int f20729;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C8340 f20727 = new C8340(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C8340 f20726 = new C8340(1);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C8340 f20725 = new C8340(2);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C8340 f20724 = new C8340(3);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final C8340 f20728 = new C8340(4);

    public /* synthetic */ C8340(int i) {
        this.f20729 = i;
    }

    @Override // p150.InterfaceC8338
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public float mo13287(Context context) {
        context.getClass();
        return context.getResources().getDisplayMetrics().density;
    }

    @Override // p150.InterfaceC8343
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public C3432 mo13288(Context context, InterfaceC8338 interfaceC8338) {
        context.getClass();
        interfaceC8338.getClass();
        Context baseContext = context;
        while (true) {
            if (!(baseContext instanceof ContextWrapper)) {
                baseContext = context;
                break;
            }
            if ((baseContext instanceof Activity) || (baseContext instanceof InputMethodService)) {
                break;
            }
            ContextWrapper contextWrapper = (ContextWrapper) baseContext;
            if (contextWrapper.getBaseContext() == null) {
                break;
            }
            baseContext = contextWrapper.getBaseContext();
            baseContext.getClass();
        }
        if (baseContext instanceof Activity) {
            return mo13289((Activity) baseContext, interfaceC8338);
        }
        if (!(baseContext instanceof InputMethodService) && !(baseContext instanceof Application)) {
            C6755.m11869("Must provide a UiContext or Application Context");
            return null;
        }
        Object systemService = context.getSystemService("window");
        systemService.getClass();
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        defaultDisplay.getClass();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        return new C3432(new Rect(0, 0, point.x, point.y), interfaceC8338.mo13287(context));
    }

    @Override // p150.InterfaceC8343
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public C3432 mo13289(Activity activity, InterfaceC8338 interfaceC8338) {
        activity.getClass();
        interfaceC8338.getClass();
        InterfaceC8341.f20730.getClass();
        return new C3432(new C8396(C8342.m13291().mo13290(activity)), interfaceC8338.mo13287(activity));
    }

    @Override // p150.InterfaceC8341
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public Rect mo13290(Activity activity) throws Exception {
        int i = this.f20729;
        C8342 c8342 = InterfaceC8341.f20730;
        DisplayCutout displayCutoutM6126 = null;
        activity.getClass();
        switch (i) {
            case 0:
                Rect rect = new Rect();
                Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
                defaultDisplay.getRectSize(rect);
                if (!activity.isInMultiWindowMode()) {
                    Point point = new Point();
                    defaultDisplay.getRealSize(point);
                    Resources resources = activity.getResources();
                    int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
                    int dimensionPixelSize = identifier > 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    int i2 = rect.bottom + dimensionPixelSize;
                    if (i2 == point.y) {
                        rect.bottom = i2;
                    } else {
                        int i3 = rect.right + dimensionPixelSize;
                        if (i3 == point.x) {
                            rect.right = i3;
                        }
                    }
                }
                return rect;
            case 1:
                Rect rect2 = new Rect();
                Configuration configuration = activity.getResources().getConfiguration();
                try {
                    Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
                    declaredField.setAccessible(true);
                    Object obj = declaredField.get(configuration);
                    if (activity.isInMultiWindowMode()) {
                        Object objInvoke = obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null);
                        objInvoke.getClass();
                        rect2.set((Rect) objInvoke);
                    } else {
                        Object objInvoke2 = obj.getClass().getDeclaredMethod("getAppBounds", null).invoke(obj, null);
                        objInvoke2.getClass();
                        rect2.set((Rect) objInvoke2);
                    }
                    break;
                } catch (Exception e) {
                    if (!(e instanceof NoSuchFieldException) && !(e instanceof NoSuchMethodException) && !(e instanceof IllegalAccessException) && !(e instanceof InvocationTargetException)) {
                        throw e;
                    }
                    c8342.getClass();
                    Log.w(C8342.f20731, e);
                    activity.getWindowManager().getDefaultDisplay().getRectSize(rect2);
                }
                Display defaultDisplay2 = activity.getWindowManager().getDefaultDisplay();
                Point point2 = new Point();
                defaultDisplay2.getRealSize(point2);
                if (!activity.isInMultiWindowMode()) {
                    Resources resources2 = activity.getResources();
                    int identifier2 = resources2.getIdentifier("navigation_bar_height", "dimen", "android");
                    int dimensionPixelSize2 = identifier2 > 0 ? resources2.getDimensionPixelSize(identifier2) : 0;
                    int i4 = rect2.bottom + dimensionPixelSize2;
                    if (i4 == point2.y) {
                        rect2.bottom = i4;
                    } else {
                        int i5 = rect2.right + dimensionPixelSize2;
                        if (i5 == point2.x) {
                            rect2.right = i5;
                        } else if (rect2.left == dimensionPixelSize2) {
                            rect2.left = 0;
                        }
                    }
                }
                if ((rect2.width() < point2.x || rect2.height() < point2.y) && !activity.isInMultiWindowMode()) {
                    try {
                        Constructor<?> constructor = Class.forName("android.view.DisplayInfo").getConstructor(null);
                        constructor.setAccessible(true);
                        Object objNewInstance = constructor.newInstance(null);
                        Method declaredMethod = defaultDisplay2.getClass().getDeclaredMethod("getDisplayInfo", objNewInstance.getClass());
                        declaredMethod.setAccessible(true);
                        declaredMethod.invoke(defaultDisplay2, objNewInstance);
                        Field declaredField2 = objNewInstance.getClass().getDeclaredField("displayCutout");
                        declaredField2.setAccessible(true);
                        Object obj2 = declaredField2.get(objNewInstance);
                        if (AbstractC3576.m6113(obj2)) {
                            displayCutoutM6126 = AbstractC3576.m6126(obj2);
                        }
                    } catch (Exception e2) {
                        if (!(e2 instanceof ClassNotFoundException) && !(e2 instanceof NoSuchMethodException) && !(e2 instanceof NoSuchFieldException) && !(e2 instanceof IllegalAccessException) && !(e2 instanceof InvocationTargetException) && !(e2 instanceof InstantiationException)) {
                            throw e2;
                        }
                        c8342.getClass();
                        Log.w(C8342.f20731, e2);
                    }
                    if (displayCutoutM6126 != null) {
                        if (rect2.left == displayCutoutM6126.getSafeInsetLeft()) {
                            rect2.left = 0;
                        }
                        if (point2.x - rect2.right == displayCutoutM6126.getSafeInsetRight()) {
                            rect2.right = displayCutoutM6126.getSafeInsetRight() + rect2.right;
                        }
                        if (rect2.top == displayCutoutM6126.getSafeInsetTop()) {
                            rect2.top = 0;
                        }
                        if (point2.y - rect2.bottom == displayCutoutM6126.getSafeInsetBottom()) {
                            rect2.bottom = displayCutoutM6126.getSafeInsetBottom() + rect2.bottom;
                        }
                    }
                    break;
                }
                return rect2;
            default:
                Configuration configuration2 = activity.getResources().getConfiguration();
                try {
                    Field declaredField3 = Configuration.class.getDeclaredField("windowConfiguration");
                    declaredField3.setAccessible(true);
                    Object obj3 = declaredField3.get(configuration2);
                    Object objInvoke3 = obj3.getClass().getDeclaredMethod("getBounds", null).invoke(obj3, null);
                    objInvoke3.getClass();
                    return new Rect((Rect) objInvoke3);
                } catch (Exception e3) {
                    if (!(e3 instanceof NoSuchFieldException) && !(e3 instanceof NoSuchMethodException) && !(e3 instanceof IllegalAccessException) && !(e3 instanceof InvocationTargetException)) {
                        throw e3;
                    }
                    c8342.getClass();
                    Log.w(C8342.f20731, e3);
                    return f20726.mo13290(activity);
                }
        }
    }
}
