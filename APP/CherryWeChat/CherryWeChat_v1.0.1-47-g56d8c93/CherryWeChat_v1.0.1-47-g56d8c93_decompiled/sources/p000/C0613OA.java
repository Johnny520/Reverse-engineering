package p000;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;

/* JADX INFO: renamed from: OA */
/* JADX INFO: loaded from: classes.dex */
public final class C0613OA extends ImageView {

    /* JADX INFO: renamed from: a */
    public final Matrix f1960a;

    /* JADX INFO: renamed from: b */
    public final float[] f1961b;

    /* JADX INFO: renamed from: c */
    public final ScaleGestureDetector f1962c;

    /* JADX INFO: renamed from: d */
    public final GestureDetector f1963d;

    /* JADX INFO: renamed from: e */
    public float f1964e;

    /* JADX INFO: renamed from: f */
    public final float f1965f;

    /* JADX INFO: renamed from: g */
    public final float f1966g;

    /* JADX INFO: renamed from: h */
    public float f1967h;

    /* JADX INFO: renamed from: i */
    public float f1968i;

    /* JADX INFO: renamed from: j */
    public boolean f1969j;

    /* JADX INFO: renamed from: k */
    public int f1970k;

    /* JADX INFO: renamed from: l */
    public int f1971l;

    /* JADX INFO: renamed from: m */
    public int f1972m;

    /* JADX INFO: renamed from: n */
    public int f1973n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0613OA(Context context) {
        super(context, null);
        AbstractC0295Gu.m625r(-490863222323253L);
        this.f1960a = new Matrix();
        this.f1961b = new float[9];
        this.f1964e = 1.0f;
        this.f1965f = 1.0f;
        this.f1966g = 4.0f;
        setScaleType(ImageView.ScaleType.MATRIX);
        this.f1962c = new ScaleGestureDetector(context, new C0570NA(this));
        this.f1963d = new GestureDetector(context, new C0527MA(this));
    }

    /* JADX INFO: renamed from: a */
    public final void m1189a(final float f, final float f2, final float f3) {
        final float f4 = this.f1964e;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(250L);
        valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: LA
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                AbstractC0295Gu.m625r(-490407955789877L);
                Object animatedValue = valueAnimator.getAnimatedValue();
                AbstractC0295Gu.m625r(-490420840691765L);
                float fFloatValue = ((Float) animatedValue).floatValue();
                float f5 = f;
                float f6 = f4;
                float f7 = ((f5 - f6) * fFloatValue) + f6;
                C0613OA c0613oa = this;
                float f8 = f7 / c0613oa.f1964e;
                Matrix matrix = c0613oa.f1960a;
                matrix.postScale(f8, f8, f2, f3);
                c0613oa.f1964e = f7;
                c0613oa.m1190b();
                c0613oa.setImageMatrix(matrix);
            }
        });
        valueAnimatorOfFloat.start();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004e  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1190b() {
        float f;
        float f2;
        int i;
        float f3;
        Matrix matrix = this.f1960a;
        float[] fArr = this.f1961b;
        matrix.getValues(fArr);
        float f4 = fArr[2];
        float f5 = fArr[5];
        float f6 = fArr[0];
        float f7 = this.f1972m * f6;
        float f8 = this.f1973n * f6;
        int i2 = this.f1970k;
        float f9 = 0.0f;
        if (f7 > i2) {
            if (f4 > 0.0f) {
                f2 = -f4;
            } else {
                f4 += f7;
                if (f4 < i2) {
                    f = i2;
                } else {
                    f2 = 0.0f;
                }
            }
            i = this.f1971l;
            if (f8 <= i) {
                if (f5 > 0.0f) {
                    f9 = -f5;
                } else {
                    f5 += f8;
                    if (f5 < i) {
                        f3 = i;
                    }
                }
                matrix.postTranslate(f2, f9);
            }
            f3 = (i - f8) / 2.0f;
            f9 = f3 - f5;
            matrix.postTranslate(f2, f9);
        }
        f = (i2 - f7) / 2.0f;
        f2 = f - f4;
        i = this.f1971l;
        if (f8 <= i) {
        }
        f9 = f3 - f5;
        matrix.postTranslate(f2, f9);
    }

    /* JADX INFO: renamed from: c */
    public final void m1191c() {
        int i;
        int i2;
        int i3;
        int i4 = this.f1970k;
        if (i4 == 0 || (i = this.f1971l) == 0 || (i2 = this.f1972m) == 0 || (i3 = this.f1973n) == 0) {
            return;
        }
        float fMin = Math.min(i4 / i2, i / i3);
        Matrix matrix = this.f1960a;
        matrix.setScale(fMin, fMin);
        this.f1964e = fMin;
        float f = 2;
        matrix.postTranslate((this.f1970k - (this.f1972m * fMin)) / f, (this.f1971l - (this.f1973n * fMin)) / f);
        setImageMatrix(matrix);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f1970k = i;
        this.f1971l = i2;
        m1191c();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0022, code lost:
    
        if (r0 != 3) goto L33;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ViewGroup viewGroup;
        ViewParent parent;
        ViewParent parent2;
        AbstractC0295Gu.m625r(-490897582061621L);
        this.f1962c.onTouchEvent(motionEvent);
        this.f1963d.onTouchEvent(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        float f = this.f1965f;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (this.f1969j && this.f1964e > f) {
                        float x = motionEvent.getX() - this.f1967h;
                        float y = motionEvent.getY() - this.f1968i;
                        Matrix matrix = this.f1960a;
                        matrix.postTranslate(x, y);
                        m1190b();
                        setImageMatrix(matrix);
                        this.f1967h = motionEvent.getX();
                        this.f1968i = motionEvent.getY();
                        ViewParent parent3 = getParent();
                        viewGroup = parent3 instanceof ViewGroup ? (ViewGroup) parent3 : null;
                        if (viewGroup != null && (parent2 = viewGroup.getParent()) != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                            return true;
                        }
                    }
                }
            }
            this.f1969j = false;
            return true;
        }
        this.f1967h = motionEvent.getX();
        this.f1968i = motionEvent.getY();
        this.f1969j = true;
        if (this.f1964e > f) {
            ViewParent parent4 = getParent();
            viewGroup = parent4 instanceof ViewGroup ? (ViewGroup) parent4 : null;
            if (viewGroup != null && (parent = viewGroup.getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
        return true;
    }

    @Override // android.widget.ImageView
    public final void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        if (drawable != null) {
            this.f1972m = drawable.getIntrinsicWidth();
            this.f1973n = drawable.getIntrinsicHeight();
            m1191c();
        }
    }
}
