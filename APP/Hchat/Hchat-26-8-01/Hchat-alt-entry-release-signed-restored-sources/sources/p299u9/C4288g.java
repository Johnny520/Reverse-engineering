package p299u9;

import android.app.Activity;
import android.view.View;
import android.view.Window;
import de.robv.android.xposed.XC_MethodHook;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Iterator;
import p099h.Hchat.utils.KavaReflector;

/* JADX INFO: renamed from: u9.g */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4288g extends XC_MethodHook {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f14215a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C4289h f14216b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C4288g(C4289h c4289h, int i9) {
        this.f14215a = i9;
        this.f14216b = c4289h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        Window window;
        View decorView;
        View viewM8606d;
        Activity activity;
        Object next;
        Window window2;
        View decorView2;
        View viewM8606d2;
        int i9 = this.f14215a;
        methodHookParam.getClass();
        switch (i9) {
            case 0:
                Object obj = methodHookParam.thisObject;
                Activity activity2 = obj instanceof Activity ? (Activity) obj : null;
                if (activity2 != null && (window = activity2.getWindow()) != null && (decorView = window.getDecorView()) != null && (viewM8606d = C4289h.m8606d(decorView)) != null) {
                    C4289h c4289h = this.f14216b;
                    c4289h.m8608a(viewM8606d, c4289h.f14221e.getBoolean("hide_wechat_bottom_bar_enable", false));
                    break;
                }
                break;
            default:
                Object obj2 = methodHookParam.thisObject;
                if (obj2 instanceof Activity) {
                    activity = (Activity) obj2;
                } else if (obj2 != null) {
                    Class<?> superclass = obj2.getClass();
                    while (true) {
                        if (superclass != null && !superclass.equals(Object.class)) {
                            Iterator<T> it = KavaReflector.declaredFields(superclass).iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    next = it.next();
                                    Field field = (Field) next;
                                    if (Modifier.isStatic(field.getModifiers()) || !Activity.class.isAssignableFrom(field.getType())) {
                                    }
                                } else {
                                    next = null;
                                }
                            }
                            Field field2 = (Field) next;
                            if (field2 != null) {
                                Object field3 = KavaReflector.readField(field2, obj2);
                                if (field3 instanceof Activity) {
                                    activity = (Activity) field3;
                                }
                            } else {
                                superclass = superclass.getSuperclass();
                            }
                        }
                    }
                    activity = null;
                } else {
                    activity = null;
                }
                if (activity != null && (window2 = activity.getWindow()) != null && (decorView2 = window2.getDecorView()) != null && (viewM8606d2 = C4289h.m8606d(decorView2)) != null) {
                    C4289h c4289h2 = this.f14216b;
                    c4289h2.m8608a(viewM8606d2, c4289h2.f14221e.getBoolean("hide_wechat_bottom_bar_enable", false));
                    break;
                }
                break;
        }
    }
}
