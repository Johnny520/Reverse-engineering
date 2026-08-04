package yyds;

import android.animation.ValueAnimator;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.widget.TextView;

/* JADX INFO: renamed from: yyds.ᲀᲀᛱᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2063 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ float f10211;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final /* synthetic */ int[] f10212;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ TextView f10213;

    public /* synthetic */ C2063(float f, int[] iArr, TextView textView) {
        this.f10211 = f;
        this.f10212 = iArr;
        this.f10213 = textView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        AbstractC2328.m4341(-695870174167918L);
        Object animatedValue = valueAnimator.getAnimatedValue();
        AbstractC2328.m4341(-695913123840878L);
        float fFloatValue = ((Float) animatedValue).floatValue();
        LinearGradient linearGradient = new LinearGradient(-fFloatValue, 0.0f, this.f10211 - fFloatValue, 0.0f, this.f10212, (float[]) null, Shader.TileMode.CLAMP);
        TextView textView = this.f10213;
        textView.getPaint().setShader(linearGradient);
        textView.invalidate();
    }
}
