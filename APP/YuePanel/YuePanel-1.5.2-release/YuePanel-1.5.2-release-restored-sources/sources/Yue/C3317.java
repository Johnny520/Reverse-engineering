package Yue;

import Yue.C6898;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;

/* JADX INFO: renamed from: Yue.ۥ۟ۡۢۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3317 extends PopupWindow {

    /* JADX INFO: renamed from: ۥ۟ */
    public static final boolean f220 = false;

    /* JADX INFO: renamed from: ۥ */
    public boolean f221;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3317(@InterfaceC6391 Context context, @InterfaceC6490 AttributeSet attributeSet, @InterfaceC3451 int i) {
        super(context, attributeSet, i);
        m385(context, attributeSet, i, 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i, int i2) {
        if (f220 && this.f221) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2);
    }

    @Override // android.widget.PopupWindow
    public void update(View view, int i, int i2, int i3, int i4) {
        if (f220 && this.f221) {
            i2 -= view.getHeight();
        }
        super.update(view, i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: ۥ */
    public final void m385(Context context, AttributeSet attributeSet, int i, int i2) {
        C7837 c7837M24869 = C7837.m24869(context, attributeSet, C6898.C6909.f19669, i, i2);
        if (c7837M24869.m24896(C6898.C6909.f19672)) {
            m386(c7837M24869.m3933(C6898.C6909.f19672, false));
        }
        setBackgroundDrawable(c7837M24869.m24875(C6898.C6909.f19670));
        c7837M24869.m24899();
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public final void m386(boolean z) {
        if (f220) {
            this.f221 = z;
        } else {
            C6711.m21389(this, z);
        }
    }

    public C3317(@InterfaceC6391 Context context, @InterfaceC6490 AttributeSet attributeSet, @InterfaceC3451 int i, @InterfaceC7651 int i2) {
        super(context, attributeSet, i, i2);
        m385(context, attributeSet, i, i2);
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i, int i2, int i3) {
        if (f220 && this.f221) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2, i3);
    }
}
