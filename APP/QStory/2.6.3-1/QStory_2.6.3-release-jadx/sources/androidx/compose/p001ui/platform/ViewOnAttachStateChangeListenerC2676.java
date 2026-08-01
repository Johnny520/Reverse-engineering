package androidx.compose.p001ui.platform;

import android.app.Activity;
import android.app.Application;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.IBinder;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.compose.runtime.C2218;
import androidx.core.view.AbstractC3103;
import androidx.fragment.app.AbstractComponentCallbacksC3171;
import androidx.fragment.app.C3137;
import androidx.fragment.app.C3182;
import androidx.fragment.app.LayoutInflaterFactory2C3149;
import com.google.android.material.bottomappbar.ViewOnLayoutChangeListenerC3922;
import com.kongzue.dialogx.interfaces.AbstractC4570;
import com.kongzue.dialogx.util.views.C4585;
import com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import p152.C8356;
import p167.C8415;

/* JADX INFO: renamed from: androidx.compose.ui.platform.飘花落叶言子兰世楪苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC2676 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Object f5689;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final Object f5690;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f5691;

    public ViewOnAttachStateChangeListenerC2676(C8356 c8356, Activity activity) {
        this.f5691 = 4;
        c8356.getClass();
        this.f5689 = c8356;
        this.f5690 = new WeakReference(activity);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x006b  */
    @Override // android.view.View.OnAttachStateChangeListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onViewAttachedToWindow(View view) {
        Window window;
        WindowManager.LayoutParams attributes;
        int i = this.f5691;
        Object obj = this.f5689;
        Object obj2 = this.f5690;
        switch (i) {
            case 0:
                break;
            case 1:
                C3137 c3137 = (C3137) obj;
                AbstractComponentCallbacksC3171 abstractComponentCallbacksC3171 = c3137.f7099;
                c3137.m4904();
                C3182.m5027((ViewGroup) abstractComponentCallbacksC3171.f7226.getParent(), ((LayoutInflaterFactory2C3149) obj2).f7154).m5028();
                break;
            case 2:
                break;
            case 3:
                view.removeOnAttachStateChangeListener(this);
                C4585 c4585 = (C4585) obj2;
                int i2 = DialogXBaseRelativeLayout.f11968;
                if (Build.VERSION.SDK_INT >= 30) {
                    int i3 = -1;
                    try {
                        Application applicationM8601 = AbstractC4570.m8601();
                        if (applicationM8601 != null) {
                            i3 = applicationM8601.getPackageManager().getApplicationInfo(applicationM8601.getPackageName(), 0).targetSdkVersion;
                            break;
                        }
                    } catch (PackageManager.NameNotFoundException e) {
                        e.printStackTrace();
                    }
                    if (i3 < 30) {
                        View view2 = (View) view.getParent();
                        ViewOnLayoutChangeListenerC3922 viewOnLayoutChangeListenerC3922 = c4585.f12005;
                        if (viewOnLayoutChangeListenerC3922 != null) {
                            view2.removeOnLayoutChangeListener(viewOnLayoutChangeListenerC3922);
                        }
                        ViewOnLayoutChangeListenerC3922 viewOnLayoutChangeListenerC39222 = new ViewOnLayoutChangeListenerC3922(this, 1);
                        c4585.f12005 = viewOnLayoutChangeListenerC39222;
                        view2.addOnLayoutChangeListener(viewOnLayoutChangeListenerC39222);
                        view2.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC2676(this, 2, view2));
                    }
                }
                WeakHashMap weakHashMap = AbstractC3103.f6939;
                view.requestApplyInsets();
                break;
            case 4:
                view.getClass();
                view.removeOnAttachStateChangeListener(this);
                Activity activity = (Activity) ((WeakReference) obj2).get();
                IBinder iBinder = (activity == null || (window = activity.getWindow()) == null || (attributes = window.getAttributes()) == null) ? null : attributes.token;
                if (activity != null && iBinder != null) {
                    ((C8356) obj).m13309(iBinder, activity);
                }
                break;
            default:
                ((ViewGroup) obj).addView((C8415) obj2, 0);
                view.removeOnAttachStateChangeListener(this);
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        int i = this.f5691;
        Object obj = this.f5690;
        Object obj2 = this.f5689;
        switch (i) {
            case 0:
                ((View) obj2).removeOnAttachStateChangeListener(this);
                ((C2218) obj).m3086();
                break;
            case 1:
                break;
            case 2:
                ((View) obj2).removeOnLayoutChangeListener(((C4585) ((ViewOnAttachStateChangeListenerC2676) obj).f5690).f12005);
                break;
            case 3:
                break;
            case 4:
                view.getClass();
                break;
            default:
                ((ViewGroup) obj2).addView((C8415) obj, 0);
                view.removeOnAttachStateChangeListener(this);
                break;
        }
    }

    public /* synthetic */ ViewOnAttachStateChangeListenerC2676(Object obj, int i, Object obj2) {
        this.f5691 = i;
        this.f5690 = obj;
        this.f5689 = obj2;
    }

    public /* synthetic */ ViewOnAttachStateChangeListenerC2676(int i, View view, Object obj) {
        this.f5691 = i;
        this.f5689 = view;
        this.f5690 = obj;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    private final void m4034(View view) {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    private final void m4035(View view) {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    private final void m4036(View view) {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    private final void m4037(View view) {
    }
}
