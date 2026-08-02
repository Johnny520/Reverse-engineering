package p000;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.WeakHashMap;
import me.dartcv.nuke.R;

/* JADX INFO: renamed from: cw */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractActivityC0108cw extends Activity implements ia1 {
    private final uq2 extraDataMap = new uq2(0);
    private final la1 lifecycleRegistry = new la1(this, true);

    /* JADX WARN: Removed duplicated region for block: B:22:0x0065  */
    @Override // android.app.Activity, android.view.Window.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        Object objInvoke;
        keyEvent.getClass();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        if (pp0.m3918p(decorView, keyEvent)) {
            return true;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return superDispatchKeyEvent(keyEvent);
        }
        onUserInteraction();
        Window window = getWindow();
        boolean z = false;
        if (window.hasFeature(8)) {
            ActionBar actionBar = getActionBar();
            if (keyEvent.getKeyCode() == 82 && actionBar != null) {
                if (!pp0.f8443l) {
                    try {
                        pp0.f8444m = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
                    } catch (NoSuchMethodException unused) {
                    }
                    pp0.f8443l = true;
                }
                Method method = pp0.f8444m;
                if (method != null) {
                    try {
                        objInvoke = method.invoke(actionBar, keyEvent);
                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                    }
                    boolean zBooleanValue = objInvoke == null ? false : ((Boolean) objInvoke).booleanValue();
                    if (zBooleanValue) {
                        return true;
                    }
                }
            }
        }
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView2 = window.getDecorView();
        int i = wa3.f12444a;
        if (Build.VERSION.SDK_INT < 28) {
            ArrayList arrayList = va3.f11868d;
            va3 va3Var = (va3) decorView2.getTag(R.id.tag_unhandled_key_event_manager);
            if (va3Var == null) {
                va3Var = new va3();
                va3Var.f11869a = null;
                va3Var.f11870b = null;
                va3Var.f11871c = null;
                decorView2.setTag(R.id.tag_unhandled_key_event_manager, va3Var);
            }
            if (keyEvent.getAction() == 0) {
                WeakHashMap weakHashMap = va3Var.f11869a;
                if (weakHashMap != null) {
                    weakHashMap.clear();
                }
                ArrayList arrayList2 = va3.f11868d;
                if (!arrayList2.isEmpty()) {
                    synchronized (arrayList2) {
                        try {
                            if (va3Var.f11869a == null) {
                                va3Var.f11869a = new WeakHashMap();
                            }
                            for (int size = arrayList2.size() - 1; size >= 0; size--) {
                                ArrayList arrayList3 = va3.f11868d;
                                View view = (View) ((WeakReference) arrayList3.get(size)).get();
                                if (view == null) {
                                    arrayList3.remove(size);
                                } else {
                                    va3Var.f11869a.put(view, Boolean.TRUE);
                                    for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                                        va3Var.f11869a.put((View) parent, Boolean.TRUE);
                                    }
                                }
                            }
                        } finally {
                        }
                    }
                }
            }
            View viewM5662a = va3Var.m5662a(decorView2);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (viewM5662a != null && !KeyEvent.isModifierKey(keyCode)) {
                    if (va3Var.f11870b == null) {
                        va3Var.f11870b = new SparseArray();
                    }
                    va3Var.f11870b.put(keyCode, new WeakReference(viewM5662a));
                }
            }
            if (viewM5662a != null) {
                z = true;
            }
        }
        if (z) {
            return true;
        }
        return keyEvent.dispatch(this, decorView2 != null ? decorView2.getKeyDispatcherState() : null, this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        keyEvent.getClass();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        if (pp0.m3918p(decorView, keyEvent)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    @j70
    public <T extends AbstractC0900xv> T getExtraData(Class<T> cls) {
        cls.getClass();
        if (this.extraDataMap.get(cls) == null) {
            return null;
        }
        c80.m664g();
        return null;
    }

    @Override // p000.ia1
    public ba1 getLifecycle() {
        return this.lifecycleRegistry;
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = j82.f4919h;
        h82.m2123b(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        la1 la1Var = this.lifecycleRegistry;
        la1Var.m2891d("setCurrentState");
        la1Var.m2893f(aa1.f121j);
        super.onSaveInstanceState(bundle);
    }

    @j70
    public void putExtraData(AbstractC0900xv abstractC0900xv) {
        throw null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:13:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean shouldDumpInternalState(String[] strArr) {
        boolean z = false;
        if (strArr != null && strArr.length != 0) {
            String str = strArr[0];
            switch (str.hashCode()) {
                case -645125871:
                    if (str.equals("--translation") && Build.VERSION.SDK_INT >= 31) {
                        z = true;
                    }
                    break;
                case 100470631:
                    if (str.equals("--dump-dumpable")) {
                        if (Build.VERSION.SDK_INT >= 33) {
                        }
                    }
                    break;
                case 472614934:
                    if (str.equals("--list-dumpables")) {
                    }
                    break;
                case 1159329357:
                    if (str.equals("--contentcapture") && Build.VERSION.SDK_INT >= 29) {
                    }
                    break;
                case 1455016274:
                    if (str.equals("--autofill")) {
                    }
                    break;
            }
        }
        return true ^ z;
    }

    public boolean superDispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getClass();
        return super.dispatchKeyEvent(keyEvent);
    }
}
