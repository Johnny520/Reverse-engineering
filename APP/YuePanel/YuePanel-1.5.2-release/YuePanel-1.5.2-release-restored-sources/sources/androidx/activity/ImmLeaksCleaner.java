package androidx.activity;

import Yue.InterfaceC5922;
import Yue.InterfaceC6391;
import Yue.InterfaceC7113;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.Lifecycle;
import android.view.LifecycleEventObserver;
import android.view.LifecycleOwner;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC7113(19)
final class ImmLeaksCleaner implements LifecycleEventObserver {

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static final int f25572 = 0;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static final int f25573 = 1;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static final int f25574 = 2;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static int f25575;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static Field f25576;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static Field f25577;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static Field f25578;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public Activity f25579;

    public ImmLeaksCleaner(Activity activity) {
        this.f25579 = activity;
    }

    @InterfaceC5922
    @SuppressLint({"SoonBlockedPrivateApi"})
    /* JADX INFO: renamed from: ۥ */
    public static void m4580() {
        try {
            f25575 = 2;
            Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
            f25577 = declaredField;
            declaredField.setAccessible(true);
            Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
            f25578 = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
            f25576 = declaredField3;
            declaredField3.setAccessible(true);
            f25575 = 1;
        } catch (NoSuchFieldException unused) {
        }
    }

    @Override // android.view.LifecycleEventObserver
    public void onStateChanged(@InterfaceC6391 LifecycleOwner lifecycleOwner, @InterfaceC6391 Lifecycle.Event event) {
        if (event != Lifecycle.Event.ON_DESTROY) {
            return;
        }
        if (f25575 == 0) {
            m4580();
        }
        if (f25575 == 1) {
            InputMethodManager inputMethodManager = (InputMethodManager) this.f25579.getSystemService("input_method");
            try {
                Object obj = f25576.get(inputMethodManager);
                if (obj == null) {
                    return;
                }
                synchronized (obj) {
                    try {
                        try {
                            try {
                                View view = (View) f25577.get(inputMethodManager);
                                if (view == null) {
                                    return;
                                }
                                if (view.isAttachedToWindow()) {
                                    return;
                                }
                                try {
                                    f25578.set(inputMethodManager, null);
                                    inputMethodManager.isActive();
                                } catch (IllegalAccessException unused) {
                                }
                            } catch (ClassCastException unused2) {
                            }
                        } catch (IllegalAccessException unused3) {
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (IllegalAccessException unused4) {
            }
        }
    }
}
