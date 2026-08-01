package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class n00 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: α */
    public final /* synthetic */ p000.o00 f7339;

    public n00(p000.o00 r1) {
            r0 = this;
            r0.<init>()
            r0.f7339 = r1
            return
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator r2) {
            r1 = this;
            java.lang.Object r2 = r2.getAnimatedValue()
            java.lang.Float r2 = (java.lang.Float) r2
            float r2 = r2.floatValue()
            r0 = 1132396544(0x437f0000, float:255.0)
            float r2 = r2 * r0
            int r2 = (int) r2
            o00 r1 = r1.f7339
            android.graphics.drawable.StateListDrawable r0 = r1.f7832
            r0.setAlpha(r2)
            android.graphics.drawable.Drawable r0 = r1.f7833
            r0.setAlpha(r2)
            androidx.recyclerview.widget.RecyclerView r1 = r1.f7844
            r1.invalidate()
            return
    }
}
