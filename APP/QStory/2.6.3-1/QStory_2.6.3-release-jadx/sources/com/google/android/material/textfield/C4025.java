package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.C1072;

/* JADX INFO: renamed from: com.google.android.material.textfield.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4025 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final /* synthetic */ C4017 f11098;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final /* synthetic */ TextView f11099;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ int f11100;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ TextView f11101;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f11102;

    public C4025(C4017 c4017, int i, TextView textView, int i2, TextView textView2) {
        this.f11098 = c4017;
        this.f11102 = i;
        this.f11101 = textView;
        this.f11100 = i2;
        this.f11099 = textView2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C1072 c1072;
        int i = this.f11102;
        C4017 c4017 = this.f11098;
        c4017.f11054 = i;
        c4017.f11063 = null;
        TextView textView = this.f11101;
        if (textView != null) {
            textView.setVisibility(4);
            if (this.f11100 == 1 && (c1072 = c4017.f11057) != null) {
                c1072.setText((CharSequence) null);
            }
        }
        TextView textView2 = this.f11099;
        if (textView2 != null) {
            textView2.setTranslationY(0.0f);
            textView2.setAlpha(1.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        TextView textView = this.f11099;
        if (textView != null) {
            textView.setVisibility(0);
            textView.setAlpha(0.0f);
        }
    }
}
