package com.google.android.material.internal;

import android.animation.ValueAnimator;
import android.view.View;
import com.google.android.material.internal.MultiViewUpdateListener;

/* JADX INFO: renamed from: com.google.android.material.internal.ۥ */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2125 implements MultiViewUpdateListener.Listener {
    /* JADX DEBUG: Class process forced to load method for inline: com.google.android.material.internal.MultiViewUpdateListener.ۥ۟۟۟(android.animation.ValueAnimator, android.view.View):void */
    @Override // com.google.android.material.internal.MultiViewUpdateListener.Listener
    public final void onAnimationUpdate(ValueAnimator valueAnimator, View view) {
        MultiViewUpdateListener.setTranslationX(valueAnimator, view);
    }
}
