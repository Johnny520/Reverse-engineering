package com.google.android.material.bottomappbar;

import android.view.View;
import android.view.WindowInsets;
import androidx.compose.p001ui.platform.ViewOnAttachStateChangeListenerC2676;
import androidx.core.view.C3058;
import com.kongzue.dialogx.util.views.C4585;
import com.kongzue.dialogx.util.views.C4586;
import com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout;
import com.kongzue.dialogx.util.views.MaxRelativeLayout;
import com.lihang.ShadowLayout;
import p273.C9052;

/* JADX INFO: renamed from: com.google.android.material.bottomappbar.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnLayoutChangeListenerC3922 implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ Object f10363;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f10364;

    public /* synthetic */ ViewOnLayoutChangeListenerC3922(Object obj, int i) {
        this.f10364 = i;
        this.f10363 = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = this.f10364;
        Object obj = this.f10363;
        switch (i9) {
            case 0:
                throw null;
            case 1:
                WindowInsets rootWindowInsets = view.getRootView().getRootWindowInsets();
                ViewOnAttachStateChangeListenerC2676 viewOnAttachStateChangeListenerC2676 = (ViewOnAttachStateChangeListenerC2676) obj;
                C4585 c4585 = (C4585) viewOnAttachStateChangeListenerC2676.f5690;
                if (rootWindowInsets == null) {
                    int i10 = DialogXBaseRelativeLayout.f11968;
                    return;
                } else {
                    int i11 = DialogXBaseRelativeLayout.f11968;
                    c4585.m8640(C3058.m4623(null, rootWindowInsets), new C4586((C4586) viewOnAttachStateChangeListenerC2676.f5689));
                    return;
                }
            case 2:
                C9052 c9052 = (C9052) obj;
                MaxRelativeLayout maxRelativeLayout = c9052.f23028;
                DialogXBaseRelativeLayout dialogXBaseRelativeLayout = c9052.f23030;
                if (i8 - i6 == i4 - i2 || c9052.f23035 || dialogXBaseRelativeLayout.getFitSystemBarUtils().f12009) {
                    return;
                }
                c9052.m14305();
                float safeHeight = ((dialogXBaseRelativeLayout.getSafeHeight() - c9052.f23038.bottom) - c9052.f23037) - dialogXBaseRelativeLayout.getUnsafePlace().top;
                if (safeHeight < 0.0f) {
                    safeHeight = 0.0f;
                }
                if (safeHeight != c9052.f23033 && maxRelativeLayout.getY() != safeHeight) {
                    float f = c9052.f23033;
                    c9052.f23033 = safeHeight;
                    c9052.m14307((int) f, (int) safeHeight, true);
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
