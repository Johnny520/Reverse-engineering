package com.google.android.material.bottomappbar;

import android.view.View;
import android.view.WindowInsets;
import androidx.compose.ui.platform.ViewOnAttachStateChangeListenerC1841;
import androidx.core.view.C2225;
import com.kongzue.dialogx.util.views.C3753;
import com.kongzue.dialogx.util.views.C3754;
import com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout;
import com.kongzue.dialogx.util.views.MaxRelativeLayout;
import com.lihang.ShadowLayout;
import p257.C8223;

/* JADX INFO: renamed from: com.google.android.material.bottomappbar.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnLayoutChangeListenerC3090 implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ Object f10018;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f10019;

    public /* synthetic */ ViewOnLayoutChangeListenerC3090(Object obj, int i) {
        this.f10019 = i;
        this.f10018 = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = this.f10019;
        Object obj = this.f10018;
        switch (i9) {
            case 0:
                throw null;
            case 1:
                WindowInsets rootWindowInsets = view.getRootView().getRootWindowInsets();
                ViewOnAttachStateChangeListenerC1841 viewOnAttachStateChangeListenerC1841 = (ViewOnAttachStateChangeListenerC1841) obj;
                C3753 c3753 = (C3753) viewOnAttachStateChangeListenerC1841.f5345;
                if (rootWindowInsets == null) {
                    int i10 = DialogXBaseRelativeLayout.f11623;
                    return;
                } else {
                    int i11 = DialogXBaseRelativeLayout.f11623;
                    c3753.m8081(C2225.m4063(null, rootWindowInsets), new C3754((C3754) viewOnAttachStateChangeListenerC1841.f5344));
                    return;
                }
            case 2:
                C8223 c8223 = (C8223) obj;
                MaxRelativeLayout maxRelativeLayout = c8223.f22683;
                DialogXBaseRelativeLayout dialogXBaseRelativeLayout = c8223.f22685;
                if (i8 - i6 == i4 - i2 || c8223.f22690 || dialogXBaseRelativeLayout.getFitSystemBarUtils().f11664) {
                    return;
                }
                c8223.m13746();
                float safeHeight = ((dialogXBaseRelativeLayout.getSafeHeight() - c8223.f22693.bottom) - c8223.f22692) - dialogXBaseRelativeLayout.getUnsafePlace().top;
                if (safeHeight < 0.0f) {
                    safeHeight = 0.0f;
                }
                if (safeHeight != c8223.f22688 && maxRelativeLayout.getY() != safeHeight) {
                    float f = c8223.f22688;
                    c8223.f22688 = safeHeight;
                    c8223.m13748((int) f, (int) safeHeight, true);
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
