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

    public C0613OA(Context r3) {
        AbstractC0295Gu.m625r(-490863222323253L);
        super(r3, null);
        this.f1960a = new Matrix();
        this.f1961b = new float[9];
        this.f1964e = 1.0f;
        this.f1965f = 1.0f;
        this.f1966g = 4.0f;
        setScaleType(ImageView.ScaleType.MATRIX);
        this.f1962c = new ScaleGestureDetector(r3, new C0570NA(this));
        this.f1963d = new GestureDetector(r3, new C0527MA(this));
    }

    /* JADX INFO: renamed from: a */
    public final void m1189a(final float r8, final float r9, final float r10) {
        final float r1 = this.f1964e;
        ValueAnimator r6 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        r6.setDuration(250);
        r6.setInterpolator(new DecelerateInterpolator());
        r6.addUpdateListener(new C0484LA(r1, r8, this, r9, r10));
        r6.start();
    }

    /* JADX INFO: renamed from: b */
    public final void m1190b() {
        Matrix r0 = this.f1960a;
        float[] r1 = this.f1961b;
        r0.getValues(r1);
        float r2 = r1[2];
        float r3 = r1[5];
        float r12 = r1[0];
        float r4 = this.f1972m * r12;
        float r5 = this.f1973n * r12;
        int r13 = this.f1970k;
        float r8 = 0.0f;
        if (r4 > r13) goto L5;
        float r14 = (r13 - r4) / 2.0f;
    L10:
        float r15 = r14 - r2;
    L13:
        int r22 = this.f1971l;
        if (r5 > r22) goto L16;
        float r23 = (r22 - r5) / 2.0f;
    L21:
        r8 = r23 - r3;
    L23:
        r0.postTranslate(r15, r8);
        return;
    L16:
        if (r3 <= 0.0f) goto L18;
        r8 = -r3;
        goto L23
    L18:
        r3 = r3 + r5;
        if (r3 >= r22) goto L23;
        r23 = r22;
        goto L21
    L5:
        if (r2 <= 0.0f) goto L7;
        r15 = -r2;
        goto L13
    L7:
        r2 = r2 + r4;
        if (r2 >= r13) goto L11;
        r14 = r13;
        goto L10
    L11:
        r15 = 0.0f;
        goto L13
    }

    /* JADX INFO: renamed from: c */
    public final void m1191c() {
        int r0 = this.f1970k;
        if (r0 == 0) goto L13;
        int r1 = this.f1971l;
        if (r1 == 0) goto L14;
        int r2 = this.f1972m;
        if (r2 == 0) goto L15;
        int r3 = this.f1973n;
        if (r3 == 0) goto L16;
        float r02 = Math.min(r0 / r2, r1 / r3);
        Matrix r12 = this.f1960a;
        r12.setScale(r02, r02);
        this.f1964e = r02;
        float r32 = 2;
        r12.postTranslate((this.f1970k - (this.f1972m * r02)) / r32, (this.f1971l - (this.f1973n * r02)) / r32);
        setImageMatrix(r12);
        return;
    L16:
        return;
    L15:
        return;
    L14:
        return;
    }

    @Override // android.view.View
    public final void onSizeChanged(int r1, int r2, int r3, int r4) {
        super.onSizeChanged(r1, r2, r3, r4);
        this.f1970k = r1;
        this.f1971l = r2;
        m1191c();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent r6) {
        AbstractC0295Gu.m625r(-490897582061621L);
        this.f1962c.onTouchEvent(r6);
        this.f1963d.onTouchEvent(r6);
        int r0 = r6.getActionMasked();
        ViewGroup r1 = null;
        float r2 = this.f1965f;
        if (r0 == 0) goto L24;
        if (r0 != 1) goto L6;
    L22:
        this.f1969j = false;
        return true;
    L6:
        if (r0 == 2) goto L11;
        if (r0 == 3) goto L22;
    L33:
        return true;
    L11:
        if (this.f1969j == false) goto L33;
        if (this.f1964e <= r2) goto L33;
        float r02 = r6.getX() - this.f1967h;
        float r22 = r6.getY() - this.f1968i;
        Matrix r4 = this.f1960a;
        r4.postTranslate(r02, r22);
        m1190b();
        setImageMatrix(r4);
        this.f1967h = r6.getX();
        this.f1968i = r6.getY();
        ViewParent r62 = getParent();
        if ((r62 instanceof ViewGroup) == false) goto L17;
        r1 = (ViewGroup) r62;
    L17:
        if (r1 == null) goto L33;
        ViewParent r63 = r1.getParent();
        if (r63 == null) goto L33;
        r63.requestDisallowInterceptTouchEvent(true);
        return true;
    L24:
        this.f1967h = r6.getX();
        this.f1968i = r6.getY();
        this.f1969j = true;
        if (this.f1964e <= r2) goto L33;
        ViewParent r64 = getParent();
        if ((r64 instanceof ViewGroup) == false) goto L29;
        r1 = (ViewGroup) r64;
    L29:
        if (r1 == null) goto L33;
        ViewParent r65 = r1.getParent();
        if (r65 == null) goto L33;
        r65.requestDisallowInterceptTouchEvent(true);
        goto L33
    }

    @Override // android.widget.ImageView
    public final void setImageDrawable(Drawable r2) {
        super.setImageDrawable(r2);
        if (r2 == null) goto L6;
        this.f1972m = r2.getIntrinsicWidth();
        this.f1973n = r2.getIntrinsicHeight();
        m1191c();
        return;
    }
}
