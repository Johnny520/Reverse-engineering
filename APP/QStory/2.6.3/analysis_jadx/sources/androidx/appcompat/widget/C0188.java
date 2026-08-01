package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.res.ColorStateList;
import android.view.View;
import androidx.core.view.InterfaceC2283;
import com.google.android.material.checkbox.C3107;
import com.google.android.material.checkbox.C3111;
import com.google.android.material.focus.FocusRingDrawable;
import com.google.android.material.textfield.C3199;
import java.util.ArrayList;
import p128.AbstractC7483;
import p129.C7486;

/* JADX INFO: renamed from: androidx.appcompat.widget.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
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
                ((InterfaceC2283) obj).mo608();
                break;
            case 5:
                super.onAnimationCancel(animator);
                FocusRingDrawable focusRingDrawable = (FocusRingDrawable) obj;
                focusRingDrawable.f10399 = 1.0f;
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
                ((InterfaceC2283) obj).mo324();
                break;
            case 2:
                C3199 c3199 = (C3199) obj;
                c3199.m7255();
                c3199.f10790.start();
                break;
            case 3:
                ((AbstractC7483) obj).m12714();
                animator.removeListener(this);
                break;
            case 4:
                C7486 c7486 = (C7486) obj;
                ArrayList arrayList = new ArrayList(c7486.f20277);
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ColorStateList colorStateList = ((C3111) arrayList.get(i2)).f10210.f10193;
                    if (colorStateList != null) {
                        c7486.setTintList(colorStateList);
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
                ((InterfaceC2283) obj).mo325();
                break;
            case 4:
                C7486 c7486 = (C7486) obj;
                ArrayList arrayList = new ArrayList(c7486.f20277);
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    C3107 c3107 = ((C3111) arrayList.get(i2)).f10210;
                    ColorStateList colorStateList = c3107.f10193;
                    if (colorStateList != null) {
                        c7486.setTint(colorStateList.getColorForState(c3107.f10201, colorStateList.getDefaultColor()));
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
