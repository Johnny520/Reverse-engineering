package yyds;

import android.app.Application;
import android.content.pm.PackageManager;
import android.view.View;
import com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: yyds.ᛴᛱᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC0762 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final /* synthetic */ Object f3511;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f3512;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final /* synthetic */ Object f3513;

    public /* synthetic */ ViewOnAttachStateChangeListenerC0762(Object obj, int i, Object obj2) {
        this.f3512 = i;
        this.f3511 = obj;
        this.f3513 = obj2;
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    private final void m1707(View view) {
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    private final void m1708(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.f3512) {
            case 0:
                break;
            default:
                view.removeOnAttachStateChangeListener(this);
                C2173 c2173 = (C2173) this.f3511;
                int i = DialogXBaseRelativeLayout.f416;
                int i2 = 0;
                int i3 = -1;
                try {
                    Application applicationM1072 = C0373.m1072();
                    if (applicationM1072 != null) {
                        i3 = applicationM1072.getPackageManager().getApplicationInfo(applicationM1072.getPackageName(), 0).targetSdkVersion;
                        break;
                    }
                } catch (PackageManager.NameNotFoundException e) {
                    e.printStackTrace();
                }
                if (i3 < 30) {
                    View view2 = (View) view.getParent();
                    ViewOnLayoutChangeListenerC0926 viewOnLayoutChangeListenerC0926 = c2173.f10649;
                    if (viewOnLayoutChangeListenerC0926 != null) {
                        view2.removeOnLayoutChangeListener(viewOnLayoutChangeListenerC0926);
                    }
                    ViewOnLayoutChangeListenerC0926 viewOnLayoutChangeListenerC09262 = new ViewOnLayoutChangeListenerC0926(0, this);
                    c2173.f10649 = viewOnLayoutChangeListenerC09262;
                    view2.addOnLayoutChangeListener(viewOnLayoutChangeListenerC09262);
                    view2.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC0762(this, i2, view2));
                }
                WeakHashMap weakHashMap = AbstractC1640.f8352;
                view.requestApplyInsets();
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f3512) {
            case 0:
                ((View) this.f3513).removeOnLayoutChangeListener(((C2173) ((ViewOnAttachStateChangeListenerC0762) this.f3511).f3511).f10649);
                break;
        }
    }
}
