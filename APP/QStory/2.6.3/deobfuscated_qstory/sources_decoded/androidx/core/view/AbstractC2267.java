package androidx.core.view;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.util.SparseArray;
import android.view.Display;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.View;
import android.view.Window;
import com.davemorrissey.labs.subscaleview.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.WeakHashMap;
import kotlin.collections.C4346;
import kotlin.sequences.AbstractC5122;
import kotlin.sequences.InterfaceC5127;
import p009.AbstractC6183;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: androidx.core.view.飘花落叶言子苏世兰楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2267 implements InterfaceC2283 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static Field f6581 = null;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static boolean f6582 = false;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static Method f6583 = null;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static boolean f6584 = false;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C4346 m4225(View view) {
        return new C4346(new ViewKt$allViews$1(view, null), 2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static boolean m4226(InterfaceC2256 interfaceC2256, View view, Window.Callback callback, KeyEvent keyEvent) {
        DialogInterface.OnKeyListener onKeyListener;
        boolean zBooleanValue = false;
        if (interfaceC2256 != null) {
            if (Build.VERSION.SDK_INT >= 28) {
                return interfaceC2256.superDispatchKeyEvent(keyEvent);
            }
            if (callback instanceof Activity) {
                Activity activity = (Activity) callback;
                activity.onUserInteraction();
                Window window = activity.getWindow();
                if (window.hasFeature(8)) {
                    ActionBar actionBar = activity.getActionBar();
                    if (keyEvent.getKeyCode() == 82 && actionBar != null) {
                        if (!f6584) {
                            try {
                                f6583 = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
                            } catch (NoSuchMethodException unused) {
                            }
                            f6584 = true;
                        }
                        Method method = f6583;
                        if (method != null) {
                            try {
                                Object objInvoke = method.invoke(actionBar, keyEvent);
                                if (objInvoke != null) {
                                    zBooleanValue = ((Boolean) objInvoke).booleanValue();
                                }
                            } catch (IllegalAccessException | InvocationTargetException unused2) {
                            }
                        }
                        if (zBooleanValue) {
                            return true;
                        }
                    }
                }
                if (window.superDispatchKeyEvent(keyEvent)) {
                    return true;
                }
                View decorView = window.getDecorView();
                if (AbstractC2270.m4235(decorView, keyEvent)) {
                    return true;
                }
                return keyEvent.dispatch(activity, decorView != null ? decorView.getKeyDispatcherState() : null, activity);
            }
            if (callback instanceof Dialog) {
                Dialog dialog = (Dialog) callback;
                if (!f6582) {
                    try {
                        Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                        f6581 = declaredField;
                        declaredField.setAccessible(true);
                    } catch (NoSuchFieldException unused3) {
                    }
                    f6582 = true;
                }
                Field field = f6581;
                if (field != null) {
                    try {
                        onKeyListener = (DialogInterface.OnKeyListener) field.get(dialog);
                    } catch (IllegalAccessException unused4) {
                        onKeyListener = null;
                    }
                } else {
                    onKeyListener = null;
                }
                if (onKeyListener != null && onKeyListener.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
                    return true;
                }
                Window window2 = dialog.getWindow();
                if (window2.superDispatchKeyEvent(keyEvent)) {
                    return true;
                }
                View decorView2 = window2.getDecorView();
                if (AbstractC2270.m4235(decorView2, keyEvent)) {
                    return true;
                }
                return keyEvent.dispatch(dialog, decorView2 != null ? decorView2.getKeyDispatcherState() : null, dialog);
            }
            if ((view != null && AbstractC2270.m4235(view, keyEvent)) || interfaceC2256.superDispatchKeyEvent(keyEvent)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static boolean m4227(View view, KeyEvent keyEvent) {
        int iIndexOfKey;
        WeakHashMap weakHashMap = AbstractC2270.f6594;
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList = C2271.f6595;
        C2271 c2271 = (C2271) view.getTag(R.id.tag_unhandled_key_event_manager);
        WeakReference weakReference = null;
        if (c2271 == null) {
            c2271 = new C2271();
            c2271.f6598 = null;
            c2271.f6597 = null;
            c2271.f6596 = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, c2271);
        }
        WeakReference weakReference2 = c2271.f6596;
        if (weakReference2 != null && weakReference2.get() == keyEvent) {
            return false;
        }
        c2271.f6596 = new WeakReference(keyEvent);
        if (c2271.f6597 == null) {
            c2271.f6597 = new SparseArray();
        }
        SparseArray sparseArray = c2271.f6597;
        if (keyEvent.getAction() == 1 && (iIndexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
            weakReference = (WeakReference) sparseArray.valueAt(iIndexOfKey);
            sparseArray.removeAt(iIndexOfKey);
        }
        if (weakReference == null) {
            weakReference = (WeakReference) sparseArray.get(keyEvent.getKeyCode());
        }
        if (weakReference == null) {
            return false;
        }
        View view2 = (View) weakReference.get();
        if (view2 != null && view2.isAttachedToWindow()) {
            C2271.m4251(view2, keyEvent);
        }
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static C2202 m4228(Display display, int i) {
        RoundedCorner roundedCorner;
        int i2;
        if (Build.VERSION.SDK_INT < 31 || (roundedCorner = display.getRoundedCorner(i)) == null) {
            return null;
        }
        int position = roundedCorner.getPosition();
        if (position != 0) {
            i2 = 1;
            if (position != 1) {
                i2 = 2;
                if (position != 2) {
                    i2 = 3;
                    if (position != 3) {
                        C5925.m11310(AbstractC6183.m11588(position, "Invalid position: "));
                        return null;
                    }
                }
            }
        } else {
            i2 = 0;
        }
        return new C2202(i2, roundedCorner.getRadius(), roundedCorner.getCenter());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final InterfaceC5127 m4229(View view) {
        return AbstractC5122.m10115(view.getParent(), ViewKt$ancestors$1.INSTANCE);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static void m4230(Window window, boolean z) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            AbstractC2263.m4221(window, z);
        } else {
            if (i >= 30) {
                AbstractC2263.m4222(window, z);
                return;
            }
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static int m4231(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 4) {
            return 2;
        }
        if (i == 8) {
            return 3;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 32) {
            return 5;
        }
        if (i == 64) {
            return 6;
        }
        if (i == 128) {
            return 7;
        }
        if (i == 256) {
            return 8;
        }
        if (i == 512) {
            return 9;
        }
        C5925.m11310(AbstractC6183.m11588(i, "type needs to be >= FIRST and <= LAST, type="));
        return 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static boolean m4232(MotionEvent motionEvent, int i) {
        return (motionEvent.getSource() & i) == i;
    }

    @Override // androidx.core.view.InterfaceC2283
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public void mo325() {
    }

    @Override // androidx.core.view.InterfaceC2283
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public void mo608() {
    }
}
