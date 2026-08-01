package p194l1;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import com.bumptech.glide.AbstractC1923e;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.WeakHashMap;
import me.dartcv.nuke.R;
import p002A1.AbstractC0142o;
import p002A1.AbstractC0150w;
import p002A1.C0147t;
import p002A1.EnumC0141n;
import p002A1.FragmentC0153z;
import p002A1.InterfaceC0145r;
import p056K2.InterfaceC0875a;
import p117X2.AbstractC1665j;
import p186k.C2417N;
import p229r1.AbstractC3092v;
import p229r1.C3091u;
import p229r1.InterfaceC3077g;

/* JADX INFO: renamed from: l1.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractActivityC2494b extends Activity implements InterfaceC0145r, InterfaceC3077g {
    private final C2417N extraDataMap = new C2417N(0);
    private final C0147t lifecycleRegistry = new C0147t(this, true);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0069  */
    @Override // android.app.Activity, android.view.Window.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        Object objInvoke;
        AbstractC1665j.m2985e(keyEvent, "event");
        View decorView = getWindow().getDecorView();
        AbstractC1665j.m2984d(decorView, "getDecorView(...)");
        if (AbstractC1923e.m3483u(decorView, keyEvent)) {
            return true;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return superDispatchKeyEvent(keyEvent);
        }
        onUserInteraction();
        Window window = getWindow();
        boolean z5 = false;
        if (window.hasFeature(8)) {
            ActionBar actionBar = getActionBar();
            if (keyEvent.getKeyCode() == 82 && actionBar != null) {
                if (!AbstractC1923e.f6524b) {
                    try {
                        AbstractC1923e.f6525c = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
                    } catch (NoSuchMethodException unused) {
                    }
                    AbstractC1923e.f6524b = true;
                }
                Method method = AbstractC1923e.f6525c;
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
        int i5 = AbstractC3092v.f9811a;
        if (Build.VERSION.SDK_INT < 28) {
            ArrayList arrayList = C3091u.f9807d;
            C3091u c3091u = (C3091u) decorView2.getTag(R.id.tag_unhandled_key_event_manager);
            if (c3091u == null) {
                c3091u = new C3091u();
                c3091u.f9808a = null;
                c3091u.f9809b = null;
                c3091u.f9810c = null;
                decorView2.setTag(R.id.tag_unhandled_key_event_manager, c3091u);
            }
            if (keyEvent.getAction() == 0) {
                WeakHashMap weakHashMap = c3091u.f9808a;
                if (weakHashMap != null) {
                    weakHashMap.clear();
                }
                ArrayList arrayList2 = C3091u.f9807d;
                if (!arrayList2.isEmpty()) {
                    synchronized (arrayList2) {
                        try {
                            if (c3091u.f9808a == null) {
                                c3091u.f9808a = new WeakHashMap();
                            }
                            for (int size = arrayList2.size() - 1; size >= 0; size--) {
                                ArrayList arrayList3 = C3091u.f9807d;
                                View view = (View) ((WeakReference) arrayList3.get(size)).get();
                                if (view == null) {
                                    arrayList3.remove(size);
                                } else {
                                    c3091u.f9808a.put(view, Boolean.TRUE);
                                    for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                                        c3091u.f9808a.put((View) parent, Boolean.TRUE);
                                    }
                                }
                            }
                        } finally {
                        }
                    }
                }
            }
            View viewM5406a = c3091u.m5406a(decorView2);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (viewM5406a != null && !KeyEvent.isModifierKey(keyCode)) {
                    if (c3091u.f9809b == null) {
                        c3091u.f9809b = new SparseArray();
                    }
                    c3091u.f9809b.put(keyCode, new WeakReference(viewM5406a));
                }
            }
            if (viewM5406a != null) {
                z5 = true;
            }
        }
        if (z5) {
            return true;
        }
        return keyEvent.dispatch(this, decorView2 != null ? decorView2.getKeyDispatcherState() : null, this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        AbstractC1665j.m2985e(keyEvent, "event");
        View decorView = getWindow().getDecorView();
        AbstractC1665j.m2984d(decorView, "getDecorView(...)");
        if (AbstractC1923e.m3483u(decorView, keyEvent)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC0875a
    public <T extends AbstractC2493a> T getExtraData(Class<T> cls) {
        AbstractC1665j.m2985e(cls, "extraDataClass");
        if (this.extraDataMap.get(cls) == null) {
            return null;
        }
        throw new ClassCastException();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC0142o getLifecycle() {
        return this.lifecycleRegistry;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i5 = FragmentC0153z.f550d;
        AbstractC0150w.m195b(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        AbstractC1665j.m2985e(bundle, "outState");
        C0147t c0147t = this.lifecycleRegistry;
        c0147t.m188d("setCurrentState");
        c0147t.m190f(EnumC0141n.f533f);
        super.onSaveInstanceState(bundle);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC0875a
    public void putExtraData(AbstractC2493a abstractC2493a) {
        AbstractC1665j.m2985e(abstractC2493a, "extraData");
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:13:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean shouldDumpInternalState(String[] strArr) {
        boolean z5 = false;
        if (strArr != null && strArr.length != 0) {
            String str = strArr[0];
            switch (str.hashCode()) {
                case -645125871:
                    if (str.equals("--translation") && Build.VERSION.SDK_INT >= 31) {
                        z5 = true;
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
        return !z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p229r1.InterfaceC3077g
    public boolean superDispatchKeyEvent(KeyEvent keyEvent) {
        AbstractC1665j.m2985e(keyEvent, "event");
        return super.dispatchKeyEvent(keyEvent);
    }
}
