package Yue;

import Yue.InterfaceC7144;
import android.annotation.SuppressLint;
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

/* JADX INFO: renamed from: Yue.ۥ۠ۦۥۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
public class C5637 {

    /* JADX INFO: renamed from: ۥ */
    public static boolean f1584;

    /* JADX INFO: renamed from: ۥ۟ */
    public static Method f1585;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static boolean f13706;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static Field f13707;

    /* JADX INFO: renamed from: Yue.ۥ۠ۦۥۤ$ۥ */
    public interface InterfaceC0820 {
        boolean superDispatchKeyEvent(@InterfaceC6391 KeyEvent keyEvent);
    }

    /* JADX INFO: renamed from: ۥ */
    public static boolean m2341(ActionBar actionBar, KeyEvent keyEvent) {
        if (!f1584) {
            try {
                f1585 = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
            } catch (NoSuchMethodException unused) {
            }
            f1584 = true;
        }
        Method method = f1585;
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

    /* JADX INFO: renamed from: ۥ۟ */
    public static boolean m2342(Activity activity, KeyEvent keyEvent) {
        activity.onUserInteraction();
        Window window = activity.getWindow();
        if (window.hasFeature(8)) {
            ActionBar actionBar = activity.getActionBar();
            if (keyEvent.getKeyCode() == 82 && actionBar != null && m2341(actionBar, keyEvent)) {
                return true;
            }
        }
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView = window.getDecorView();
        if (C8273.m27327(decorView, keyEvent)) {
            return true;
        }
        return keyEvent.dispatch(activity, decorView != null ? decorView.getKeyDispatcherState() : null, activity);
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static boolean m17496(Dialog dialog, KeyEvent keyEvent) {
        DialogInterface.OnKeyListener onKeyListenerM17499 = m17499(dialog);
        if (onKeyListenerM17499 != null && onKeyListenerM17499.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
            return true;
        }
        Window window = dialog.getWindow();
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView = window.getDecorView();
        if (C8273.m27327(decorView, keyEvent)) {
            return true;
        }
        return keyEvent.dispatch(dialog, decorView != null ? decorView.getKeyDispatcherState() : null, dialog);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static boolean m17497(@InterfaceC6391 View view, @InterfaceC6391 KeyEvent keyEvent) {
        return C8273.m27328(view, keyEvent);
    }

    @SuppressLint({"LambdaLast"})
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static boolean m17498(@InterfaceC6391 InterfaceC0820 interfaceC0820, @InterfaceC6490 View view, @InterfaceC6490 Window.Callback callback, @InterfaceC6391 KeyEvent keyEvent) {
        if (interfaceC0820 == null) {
            return false;
        }
        return Build.VERSION.SDK_INT >= 28 ? interfaceC0820.superDispatchKeyEvent(keyEvent) : callback instanceof Activity ? m2342((Activity) callback, keyEvent) : callback instanceof Dialog ? m17496((Dialog) callback, keyEvent) : (view != null && C8273.m27327(view, keyEvent)) || interfaceC0820.superDispatchKeyEvent(keyEvent);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static DialogInterface.OnKeyListener m17499(Dialog dialog) {
        if (!f13706) {
            try {
                Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                f13707 = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f13706 = true;
        }
        Field field = f13707;
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
