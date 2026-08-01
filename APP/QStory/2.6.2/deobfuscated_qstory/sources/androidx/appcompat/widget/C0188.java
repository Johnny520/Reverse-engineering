package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.res.ColorStateList;
import android.view.View;
import androidx.core.view.InterfaceC2283;
import com.google.android.material.checkbox.C3106;
import com.google.android.material.checkbox.C3110;
import com.google.android.material.focus.FocusRingDrawable;
import com.google.android.material.textfield.C3198;
import java.util.ArrayList;
import p128.AbstractC7482;
import p129.C7485;

/* JADX INFO: renamed from: androidx.appcompat.widget.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0188 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ Object f740;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f741;

    public C0188(InterfaceC2283 interfaceC2283, View view) {
        this.f741 = 1;
        this.f740 = interfaceC2283;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        int i = this.f741;
        Object obj = this.f740;
        switch (i) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) obj;
                actionBarOverlayLayout.f424 = null;
                actionBarOverlayLayout.f433 = false;
                break;
            case 1:
                ((InterfaceC2283) obj).mo607();
                break;
            case 5:
                super.onAnimationCancel(animator);
                FocusRingDrawable focusRingDrawable = (FocusRingDrawable) obj;
                focusRingDrawable.f10394 = 1.0f;
                focusRingDrawable.invalidateSelf();
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        int i = this.f741;
        Object obj = this.f740;
        switch (i) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) obj;
                actionBarOverlayLayout.f424 = null;
                actionBarOverlayLayout.f433 = false;
                break;
            case 1:
                ((InterfaceC2283) obj).mo323();
                break;
            case 2:
                C3198 c3198 = (C3198) obj;
                c3198.m7268();
                c3198.f10785.start();
                break;
            case 3:
                ((AbstractC7482) obj).m12685();
                animator.removeListener(this);
                break;
            case 4:
                C7485 c7485 = (C7485) obj;
                ArrayList arrayList = new ArrayList(c7485.f20282);
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ColorStateList colorStateList = ((C3110) arrayList.get(i2)).f10205.f10188;
                    if (colorStateList != null) {
                        c7485.setTintList(colorStateList);
                    }
                }
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        int i = this.f741;
        Object obj = this.f740;
        switch (i) {
            case 1:
                ((InterfaceC2283) obj).mo324();
                break;
            case 4:
                C7485 c7485 = (C7485) obj;
                ArrayList arrayList = new ArrayList(c7485.f20282);
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    C3106 c3106 = ((C3110) arrayList.get(i2)).f10205;
                    ColorStateList colorStateList = c3106.f10188;
                    if (colorStateList != null) {
                        c7485.setTint(colorStateList.getColorForState(c3106.f10196, colorStateList.getDefaultColor()));
                    }
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public /* synthetic */ C0188(Object obj, int i) {
        this.f741 = i;
        this.f740 = obj;
    }
}
