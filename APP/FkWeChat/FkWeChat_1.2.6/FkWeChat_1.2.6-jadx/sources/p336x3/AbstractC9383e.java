package p336x3;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: x3.e */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9383e {

    /* JADX INFO: renamed from: a */
    public static boolean f31961a;

    /* JADX INFO: renamed from: b */
    public static Method f31962b;

    /* JADX INFO: renamed from: c */
    public static boolean f31963c;

    /* JADX INFO: renamed from: d */
    public static Field f31964d;

    /* JADX INFO: renamed from: x3.e$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public interface a {
        /* JADX INFO: renamed from: d */
        boolean mo23920d(KeyEvent keyEvent);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m36514a(ActionBar actionBar, KeyEvent keyEvent) {
        if (!f31961a) {
            try {
                f31962b = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
            } catch (NoSuchMethodException unused) {
            }
            f31961a = true;
        }
        Method method = f31962b;
        if (method != null) {
            try {
                Object objInvoke = method.invoke(actionBar, keyEvent);
                if (objInvoke == null) {
                    return false;
                }
                return ((Boolean) objInvoke).booleanValue();
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m36515b(Activity activity, KeyEvent keyEvent) {
        activity.onUserInteraction();
        Window window = activity.getWindow();
        if (window.hasFeature(8)) {
            ActionBar actionBar = activity.getActionBar();
            if (keyEvent.getKeyCode() == 82 && actionBar != null && m36514a(actionBar, keyEvent)) {
                return true;
            }
        }
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView = window.getDecorView();
        if (AbstractC9428u.m36652b(decorView, keyEvent)) {
            return true;
        }
        return keyEvent.dispatch(activity, decorView != null ? decorView.getKeyDispatcherState() : null, activity);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m36516c(Dialog dialog, KeyEvent keyEvent) {
        DialogInterface.OnKeyListener onKeyListenerM36519f = m36519f(dialog);
        if (onKeyListenerM36519f != null && onKeyListenerM36519f.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
            return true;
        }
        Window window = dialog.getWindow();
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView = window.getDecorView();
        if (AbstractC9428u.m36652b(decorView, keyEvent)) {
            return true;
        }
        return keyEvent.dispatch(dialog, decorView != null ? decorView.getKeyDispatcherState() : null, dialog);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m36517d(View view, KeyEvent keyEvent) {
        return AbstractC9428u.m36653c(view, keyEvent);
    }

    /* JADX INFO: renamed from: e */
    public static boolean m36518e(a aVar, View view, Window.Callback callback, KeyEvent keyEvent) {
        if (aVar == null) {
            return false;
        }
        return Build.VERSION.SDK_INT >= 28 ? aVar.mo23920d(keyEvent) : callback instanceof Activity ? m36515b((Activity) callback, keyEvent) : callback instanceof Dialog ? m36516c((Dialog) callback, keyEvent) : (view != null && AbstractC9428u.m36652b(view, keyEvent)) || aVar.mo23920d(keyEvent);
    }

    /* JADX INFO: renamed from: f */
    public static DialogInterface.OnKeyListener m36519f(Dialog dialog) {
        if (!f31963c) {
            try {
                Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                f31964d = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f31963c = true;
        }
        Field field = f31964d;
        if (field == null) {
            return null;
        }
        try {
            return (DialogInterface.OnKeyListener) field.get(dialog);
        } catch (IllegalAccessException unused2) {
            return null;
        }
    }
}
