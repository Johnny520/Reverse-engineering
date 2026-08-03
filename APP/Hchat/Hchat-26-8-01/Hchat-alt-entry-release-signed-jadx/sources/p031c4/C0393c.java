package p031c4;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.inputmethodservice.InputMethodService;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.WindowManager;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p004a4.C0015a;
import p015b0.AbstractC0132b0;
import p019b4.C0177a;
import p136j8.C2104o;

/* JADX INFO: renamed from: c4.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0393c implements InterfaceC0392b, InterfaceC0395e, InterfaceC0397g {

    /* JADX INFO: renamed from: c */
    public static final C0393c f1086c = new C0393c(0);

    /* JADX INFO: renamed from: d */
    public static final C0393c f1087d = new C0393c(1);

    /* JADX INFO: renamed from: e */
    public static final C0393c f1088e = new C0393c(2);

    /* JADX INFO: renamed from: f */
    public static final C0393c f1089f = new C0393c(3);

    /* JADX INFO: renamed from: g */
    public static final C0393c f1090g = new C0393c(4);

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f1091b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [c4.c.<clinit>():void] */
    public /* synthetic */ C0393c(int i9) {
        this.f1091b = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p031c4.InterfaceC0392b
    /* JADX INFO: renamed from: a */
    public Rect mo1361a(Activity activity) throws Exception {
        int i9 = this.f1091b;
        C0391a c0391a = InterfaceC0392b.f1085a;
        DisplayCutout displayCutoutM690d = null;
        switch (i9) {
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
                    int i10 = rect.bottom + dimensionPixelSize;
                    if (i10 == point.y) {
                        rect.bottom = i10;
                    } else {
                        int i11 = rect.right + dimensionPixelSize;
                        if (i11 == point.x) {
                            rect.right = i11;
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
                } catch (Exception e6) {
                    if (!(e6 instanceof NoSuchFieldException) && !(e6 instanceof NoSuchMethodException) && !(e6 instanceof IllegalAccessException) && !(e6 instanceof InvocationTargetException)) {
                        throw e6;
                    }
                    c0391a.getClass();
                    Log.w(C0391a.f1084b, e6);
                    activity.getWindowManager().getDefaultDisplay().getRectSize(rect2);
                }
                Display defaultDisplay2 = activity.getWindowManager().getDefaultDisplay();
                Point point2 = new Point();
                defaultDisplay2.getRealSize(point2);
                if (!activity.isInMultiWindowMode()) {
                    Resources resources2 = activity.getResources();
                    int identifier2 = resources2.getIdentifier("navigation_bar_height", "dimen", "android");
                    int dimensionPixelSize2 = identifier2 > 0 ? resources2.getDimensionPixelSize(identifier2) : 0;
                    int i12 = rect2.bottom + dimensionPixelSize2;
                    if (i12 == point2.y) {
                        rect2.bottom = i12;
                    } else {
                        int i13 = rect2.right + dimensionPixelSize2;
                        if (i13 == point2.x) {
                            rect2.right = i13;
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
                        if (AbstractC0132b0.m710x(obj2)) {
                            displayCutoutM690d = AbstractC0132b0.m690d(obj2);
                        }
                    } catch (Exception e7) {
                        if (!(e7 instanceof ClassNotFoundException) && !(e7 instanceof NoSuchMethodException) && !(e7 instanceof NoSuchFieldException) && !(e7 instanceof IllegalAccessException) && !(e7 instanceof InvocationTargetException) && !(e7 instanceof InstantiationException)) {
                            throw e7;
                        }
                        c0391a.getClass();
                        Log.w(C0391a.f1084b, e7);
                    }
                    if (displayCutoutM690d != null) {
                        if (rect2.left == displayCutoutM690d.getSafeInsetLeft()) {
                            rect2.left = 0;
                        }
                        if (point2.x - rect2.right == displayCutoutM690d.getSafeInsetRight()) {
                            rect2.right = displayCutoutM690d.getSafeInsetRight() + rect2.right;
                        }
                        if (rect2.top == displayCutoutM690d.getSafeInsetTop()) {
                            rect2.top = 0;
                        }
                        if (point2.y - rect2.bottom == displayCutoutM690d.getSafeInsetBottom()) {
                            rect2.bottom = displayCutoutM690d.getSafeInsetBottom() + rect2.bottom;
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
                } catch (Exception e10) {
                    if (!(e10 instanceof NoSuchFieldException) && !(e10 instanceof NoSuchMethodException) && !(e10 instanceof IllegalAccessException) && !(e10 instanceof InvocationTargetException)) {
                        throw e10;
                    }
                    c0391a.getClass();
                    Log.w(C0391a.f1084b, e10);
                    return f1087d.mo1361a(activity);
                }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p031c4.InterfaceC0395e
    /* JADX INFO: renamed from: b */
    public float mo1362b(ContextWrapper contextWrapper) {
        return contextWrapper.getResources().getDisplayMetrics().density;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p031c4.InterfaceC0397g
    /* JADX INFO: renamed from: c */
    public C0177a mo1363c(ContextWrapper contextWrapper, InterfaceC0395e interfaceC0395e) {
        interfaceC0395e.getClass();
        Context baseContext = contextWrapper;
        while (true) {
            if (!(baseContext instanceof ContextWrapper)) {
                baseContext = contextWrapper;
                break;
            }
            if ((baseContext instanceof Activity) || (baseContext instanceof InputMethodService)) {
                break;
            }
            ContextWrapper contextWrapper2 = (ContextWrapper) baseContext;
            if (contextWrapper2.getBaseContext() == null) {
                break;
            }
            baseContext = contextWrapper2.getBaseContext();
            baseContext.getClass();
        }
        if (baseContext instanceof Activity) {
            Activity activity = (Activity) baseContext;
            InterfaceC0392b.f1085a.getClass();
            int i9 = Build.VERSION.SDK_INT;
            return new C0177a(new C0015a((i9 >= 30 ? C0394d.f1092b : i9 >= 29 ? f1088e : i9 >= 28 ? f1087d : f1086c).mo1361a(activity)), interfaceC0395e.mo1362b(activity));
        }
        if (!(baseContext instanceof InputMethodService) && !(baseContext instanceof Application)) {
            C2104o.m5294t("Must provide a UiContext or Application Context");
            return null;
        }
        Object systemService = contextWrapper.getSystemService("window");
        systemService.getClass();
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        defaultDisplay.getClass();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        return new C0177a(new Rect(0, 0, point.x, point.y), interfaceC0395e.mo1362b(contextWrapper));
    }
}
