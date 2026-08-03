package p000a;

import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.appcompat.C0983R;

/* JADX INFO: renamed from: a.d1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0528d1 {

    /* JADX INFO: renamed from: a */
    public final ImageView f1918a;

    /* JADX INFO: renamed from: b */
    public C0713mf f1919b;

    /* JADX INFO: renamed from: c */
    public int f1920c = 0;

    public C0528d1(ImageView imageView) {
        this.f1918a = imageView;
    }

    /* JADX INFO: renamed from: a */
    public final void m1303a() {
        C0713mf c0713mf;
        ImageView imageView = this.f1918a;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            C0912x5.m2198a(drawable);
        }
        if (drawable == null || (c0713mf = this.f1919b) == null) {
            return;
        }
        C0434Y0.m1083e(drawable, c0713mf, imageView.getDrawableState());
    }

    /* JADX INFO: renamed from: b */
    public final void m1304b(AttributeSet attributeSet, int i) {
        int resourceId;
        ImageView imageView = this.f1918a;
        C0751of c0751ofM1768e = C0751of.m1768e(imageView.getContext(), attributeSet, C0983R.styleable.AppCompatImageView, i);
        C0866ug.m2002i(imageView, imageView.getContext(), C0983R.styleable.AppCompatImageView, attributeSet, c0751ofM1768e.f2960b, i);
        try {
            Drawable drawable = imageView.getDrawable();
            TypedArray typedArray = c0751ofM1768e.f2960b;
            if (drawable == null && (resourceId = typedArray.getResourceId(C0983R.styleable.AppCompatImageView_srcCompat, -1)) != -1 && (drawable = C0889w1.m2115A(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                C0912x5.m2198a(drawable);
            }
            if (typedArray.hasValue(C0983R.styleable.AppCompatImageView_tint)) {
                C0334S8.m922c(imageView, c0751ofM1768e.m1769a(C0983R.styleable.AppCompatImageView_tint));
            }
            if (typedArray.hasValue(C0983R.styleable.AppCompatImageView_tintMode)) {
                C0334S8.m923d(imageView, C0912x5.m2200c(typedArray.getInt(C0983R.styleable.AppCompatImageView_tintMode, -1), null));
            }
            c0751ofM1768e.m1773f();
        } catch (Throwable th) {
            c0751ofM1768e.m1773f();
            throw th;
        }
    }
}
