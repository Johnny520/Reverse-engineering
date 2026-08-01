package com.google.android.material.bottomappbar;

import android.view.View;
import android.view.WindowInsets;
import androidx.compose.ui.platform.ViewOnAttachStateChangeListenerC1841;
import androidx.core.view.C2225;
import com.kongzue.dialogx.util.views.C3752;
import com.kongzue.dialogx.util.views.C3753;
import com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout;
import com.kongzue.dialogx.util.views.MaxRelativeLayout;
import com.lihang.ShadowLayout;
import p257.C8222;

/* JADX INFO: renamed from: com.google.android.material.bottomappbar.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnLayoutChangeListenerC3089 implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ Object f10013;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f10014;

    public /* synthetic */ ViewOnLayoutChangeListenerC3089(Object obj, int i) {
        this.f10014 = i;
        this.f10013 = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = this.f10014;
        Object obj = this.f10013;
        switch (i9) {
            case 0:
                throw null;
            case 1:
                WindowInsets rootWindowInsets = view.getRootView().getRootWindowInsets();
                ViewOnAttachStateChangeListenerC1841 viewOnAttachStateChangeListenerC1841 = (ViewOnAttachStateChangeListenerC1841) obj;
                C3752 c3752 = (C3752) viewOnAttachStateChangeListenerC1841.f5344;
                if (rootWindowInsets == null) {
                    int i10 = DialogXBaseRelativeLayout.f11618;
                    return;
                } else {
                    int i11 = DialogXBaseRelativeLayout.f11618;
                    c3752.m8094(C2225.m4053(null, rootWindowInsets), new C3753((C3753) viewOnAttachStateChangeListenerC1841.f5343));
                    return;
                }
            case 2:
                C8222 c8222 = (C8222) obj;
                MaxRelativeLayout maxRelativeLayout = c8222.f22684;
                DialogXBaseRelativeLayout dialogXBaseRelativeLayout = c8222.f22686;
                if (i8 - i6 == i4 - i2 || c8222.f22691 || dialogXBaseRelativeLayout.getFitSystemBarUtils().f11659) {
                    return;
                }
                c8222.m13729();
                float safeHeight = ((dialogXBaseRelativeLayout.getSafeHeight() - c8222.f22694.bottom) - c8222.f22693) - dialogXBaseRelativeLayout.getUnsafePlace().top;
                if (safeHeight < 0.0f) {
                    safeHeight = 0.0f;
                }
                if (safeHeight != c8222.f22689 && maxRelativeLayout.getY() != safeHeight) {
                    float f = c8222.f22689;
                    c8222.f22689 = safeHeight;
                    c8222.m13731((int) f, (int) safeHeight, true);
                    return;
                } else {
                    if (maxRelativeLayout.getY() == safeHeight || safeHeight == 0.0f) {
                        return;
                    }
                    maxRelativeLayout.setY(safeHeight);
                    return;
                }
            default:
                ShadowLayout shadowLayout = (ShadowLayout) obj;
                shadowLayout.removeOnLayoutChangeListener(this);
                shadowLayout.setSelected(shadowLayout.isSelected());
                return;
        }
    }
}
