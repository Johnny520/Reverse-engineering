package com.bumptech.glide.request.transition;

/* JADX INFO: loaded from: classes.dex */
public class DrawableCrossFadeTransition implements com.bumptech.glide.request.transition.Transition<android.graphics.drawable.Drawable> {
    private final int duration;
    private final boolean isCrossFadeEnabled;

    public DrawableCrossFadeTransition(int r1, boolean r2) {
            r0 = this;
            r0.<init>()
            r0.duration = r1
            r0.isCrossFadeEnabled = r2
            return
    }

    /* JADX INFO: renamed from: transition, reason: avoid collision after fix types in other method */
    public boolean transition2(android.graphics.drawable.Drawable r3, com.bumptech.glide.request.transition.Transition.ViewAdapter r4) {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r4.getCurrentDrawable()
            if (r0 != 0) goto Lc
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            r1 = 0
            r0.<init>(r1)
        Lc:
            android.graphics.drawable.TransitionDrawable r1 = new android.graphics.drawable.TransitionDrawable
            android.graphics.drawable.Drawable[] r3 = new android.graphics.drawable.Drawable[]{r0, r3}
            r1.<init>(r3)
            boolean r3 = r2.isCrossFadeEnabled
            r1.setCrossFadeEnabled(r3)
            int r3 = r2.duration
            r1.startTransition(r3)
            r4.setDrawable(r1)
            r3 = 1
            return r3
    }

    @Override // com.bumptech.glide.request.transition.Transition
    public /* bridge */ /* synthetic */ boolean transition(android.graphics.drawable.Drawable r1, com.bumptech.glide.request.transition.Transition.ViewAdapter r2) {
            r0 = this;
            android.graphics.drawable.Drawable r1 = (android.graphics.drawable.Drawable) r1
            boolean r1 = r0.transition2(r1, r2)
            return r1
    }
}
