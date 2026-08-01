package p134;

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
import androidx.window.layout.C2599;
import com.alibaba.fastjson2.reader.AbstractC2743;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p147.C7567;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言子兰哲世楪苏.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7511 implements InterfaceC7512, InterfaceC7509, InterfaceC7514 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ int f20384;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C7511 f20382 = new C7511(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C7511 f20381 = new C7511(1);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C7511 f20380 = new C7511(2);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C7511 f20379 = new C7511(3);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final C7511 f20383 = new C7511(4);

    public /* synthetic */ C7511(int i) {
        this.f20384 = i;
    }

    @Override // p134.InterfaceC7509
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public float mo12728(Context context) {
        context.getClass();
        return context.getResources().getDisplayMetrics().density;
    }

    @Override // p134.InterfaceC7514
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public C2599 mo12729(Context context, InterfaceC7509 interfaceC7509) {
        context.getClass();
        interfaceC7509.getClass();
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
            return mo12730((Activity) baseContext, interfaceC7509);
        }
        if (!(baseContext instanceof InputMethodService) && !(baseContext instanceof Application)) {
            C5925.m11310("Must provide a UiContext or Application Context");
            return null;
        }
        Object systemService = context.getSystemService("window");
        systemService.getClass();
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        defaultDisplay.getClass();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        return new C2599(new Rect(0, 0, point.x, point.y), interfaceC7509.mo12728(context));
    }

    @Override // p134.InterfaceC7514
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public C2599 mo12730(Activity activity, InterfaceC7509 interfaceC7509) {
        activity.getClass();
        interfaceC7509.getClass();
        InterfaceC7512.f20385.getClass();
        return new C2599(new C7567(C7513.m12732().mo12731(activity)), interfaceC7509.mo12728(activity));
    }

    @Override // p134.InterfaceC7512
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public Rect mo12731(Activity activity) throws Exception {
        int i = this.f20384;
        C7513 c7513 = InterfaceC7512.f20385;
        DisplayCutout displayCutoutM5566 = null;
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
                    c7513.getClass();
                    Log.w(C7513.f20386, e);
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
                        if (AbstractC2743.m5553(obj2)) {
                            displayCutoutM5566 = AbstractC2743.m5566(obj2);
                        }
                    } catch (Exception e2) {
                        if (!(e2 instanceof ClassNotFoundException) && !(e2 instanceof NoSuchMethodException) && !(e2 instanceof NoSuchFieldException) && !(e2 instanceof IllegalAccessException) && !(e2 instanceof InvocationTargetException) && !(e2 instanceof InstantiationException)) {
                            throw e2;
                        }
                        c7513.getClass();
                        Log.w(C7513.f20386, e2);
                    }
                    if (displayCutoutM5566 != null) {
                        if (rect2.left == displayCutoutM5566.getSafeInsetLeft()) {
                            rect2.left = 0;
                        }
                        if (point2.x - rect2.right == displayCutoutM5566.getSafeInsetRight()) {
                            rect2.right = displayCutoutM5566.getSafeInsetRight() + rect2.right;
                        }
                        if (rect2.top == displayCutoutM5566.getSafeInsetTop()) {
                            rect2.top = 0;
                        }
                        if (point2.y - rect2.bottom == displayCutoutM5566.getSafeInsetBottom()) {
                            rect2.bottom = displayCutoutM5566.getSafeInsetBottom() + rect2.bottom;
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
                    c7513.getClass();
                    Log.w(C7513.f20386, e3);
                    return f20381.mo12731(activity);
                }
        }
    }
}
