package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.res.ColorStateList;
import android.view.View;
import androidx.core.view.InterfaceC3116;
import com.google.android.material.checkbox.C3939;
import com.google.android.material.checkbox.C3943;
import com.google.android.material.focus.FocusRingDrawable;
import com.google.android.material.textfield.C4031;
import java.util.ArrayList;
import p144.AbstractC8312;
import p145.C8315;

/* JADX INFO: renamed from: androidx.appcompat.widget.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1035 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ Object f1085;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f1086;

    public C1035(InterfaceC3116 interfaceC3116, View view) {
        this.f1086 = 1;
        this.f1085 = interfaceC3116;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        int i = this.f1086;
        Object obj = this.f1085;
        switch (i) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) obj;
                actionBarOverlayLayout.f769 = null;
                actionBarOverlayLayout.f778 = false;
                break;
            case 1:
                ((InterfaceC3116) obj).mo1168();
                break;
            case 5:
                super.onAnimationCancel(animator);
                FocusRingDrawable focusRingDrawable = (FocusRingDrawable) obj;
                focusRingDrawable.f10744 = 1.0f;
                focusRingDrawable.invalidateSelf();
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        int i = this.f1086;
        Object obj = this.f1085;
        switch (i) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) obj;
                actionBarOverlayLayout.f769 = null;
                actionBarOverlayLayout.f778 = false;
                break;
            case 1:
                ((InterfaceC3116) obj).mo884();
                break;
            case 2:
                C4031 c4031 = (C4031) obj;
                c4031.m7814();
                c4031.f11135.start();
                break;
            case 3:
                ((AbstractC8312) obj).m13273();
                animator.removeListener(this);
                break;
            case 4:
                C8315 c8315 = (C8315) obj;
                ArrayList arrayList = new ArrayList(c8315.f20622);
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ColorStateList colorStateList = ((C3943) arrayList.get(i2)).f10555.f10538;
                    if (colorStateList != null) {
                        c8315.setTintList(colorStateList);
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
        int i = this.f1086;
        Object obj = this.f1085;
        switch (i) {
            case 1:
                ((InterfaceC3116) obj).mo885();
                break;
            case 4:
                C8315 c8315 = (C8315) obj;
                ArrayList arrayList = new ArrayList(c8315.f20622);
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    C3939 c3939 = ((C3943) arrayList.get(i2)).f10555;
                    ColorStateList colorStateList = c3939.f10538;
                    if (colorStateList != null) {
                        c8315.setTint(colorStateList.getColorForState(c3939.f10546, colorStateList.getDefaultColor()));
                    }
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public /* synthetic */ C1035(Object obj, int i) {
        this.f1086 = i;
        this.f1085 = obj;
    }
}
