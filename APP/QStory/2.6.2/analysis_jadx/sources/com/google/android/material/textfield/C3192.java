package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.C0225;

/* JADX INFO: renamed from: com.google.android.material.textfield.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3192 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final /* synthetic */ C3184 f10748;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final /* synthetic */ TextView f10749;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ int f10750;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ TextView f10751;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f10752;

    public C3192(C3184 c3184, int i, TextView textView, int i2, TextView textView2) {
        this.f10748 = c3184;
        this.f10752 = i;
        this.f10751 = textView;
        this.f10750 = i2;
        this.f10749 = textView2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C0225 c0225;
        int i = this.f10752;
        C3184 c3184 = this.f10748;
        c3184.f10704 = i;
        c3184.f10713 = null;
        TextView textView = this.f10751;
        if (textView != null) {
            textView.setVisibility(4);
            if (this.f10750 == 1 && (c0225 = c3184.f10707) != null) {
                c0225.setText((CharSequence) null);
            }
        }
        TextView textView2 = this.f10749;
        if (textView2 != null) {
            textView2.setTranslationY(0.0f);
            textView2.setAlpha(1.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        TextView textView = this.f10749;
        if (textView != null) {
            textView.setVisibility(0);
            textView.setAlpha(0.0f);
        }
    }
}
