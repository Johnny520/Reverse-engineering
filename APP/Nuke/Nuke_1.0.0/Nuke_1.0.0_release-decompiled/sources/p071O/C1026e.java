package p071O;

import android.R;
import android.app.PendingIntent;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.animation.AnimationUtils;
import p000A.C0099z;
import p028F.RunnableC0346g;
import p117X2.AbstractC1665j;
import p127Z2.AbstractC1784a;
import p211o0.AbstractC2767z;
import p211o0.C2762u;
import p232s.C3164k;

/* JADX INFO: renamed from: O.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1026e extends View {

    /* JADX INFO: renamed from: i */
    public static final int[] f3187i = {R.attr.state_pressed, R.attr.state_enabled};

    /* JADX INFO: renamed from: j */
    public static final int[] f3188j = new int[0];

    /* JADX INFO: renamed from: d */
    public C1029h f3189d;

    /* JADX INFO: renamed from: e */
    public Boolean f3190e;

    /* JADX INFO: renamed from: f */
    public Long f3191f;

    /* JADX INFO: renamed from: g */
    public RunnableC0346g f3192g;

    /* JADX INFO: renamed from: h */
    public C0099z f3193h;

    private final void setRippleState(boolean z5) {
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        Runnable runnable = this.f3192g;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        Long l3 = this.f3191f;
        long jLongValue = jCurrentAnimationTimeMillis - (l3 != null ? l3.longValue() : 0L);
        if (z5 || jLongValue >= 5) {
            int[] iArr = z5 ? f3187i : f3188j;
            C1029h c1029h = this.f3189d;
            if (c1029h != null) {
                c1029h.setState(iArr);
            }
        } else {
            RunnableC0346g runnableC0346g = new RunnableC0346g(3, this);
            this.f3192g = runnableC0346g;
            postDelayed(runnableC0346g, 50L);
        }
        this.f3191f = Long.valueOf(jCurrentAnimationTimeMillis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setRippleState$lambda$1(C1026e c1026e) {
        C1029h c1029h = c1026e.f3189d;
        if (c1029h != null) {
            c1029h.setState(f3188j);
        }
        c1026e.f3192g = null;
    }

    /* JADX INFO: renamed from: b */
    public final void m2106b(C3164k c3164k, boolean z5, long j5, int i5, long j6, C0099z c0099z) {
        if (this.f3189d == null || !Boolean.valueOf(z5).equals(this.f3190e)) {
            C1029h c1029h = new C1029h(z5);
            setBackground(c1029h);
            this.f3189d = c1029h;
            this.f3190e = Boolean.valueOf(z5);
        }
        C1029h c1029h2 = this.f3189d;
        AbstractC1665j.m2982b(c1029h2);
        this.f3193h = c0099z;
        m2109e(i5, j5, j6);
        if (z5) {
            c1029h2.setHotspot(Float.intBitsToFloat((int) (c3164k.f9916a >> 32)), Float.intBitsToFloat((int) (c3164k.f9916a & 4294967295L)));
        } else {
            c1029h2.setHotspot(c1029h2.getBounds().centerX(), c1029h2.getBounds().centerY());
        }
        setRippleState(true);
    }

    /* JADX INFO: renamed from: c */
    public final void m2107c() {
        this.f3193h = null;
        RunnableC0346g runnableC0346g = this.f3192g;
        if (runnableC0346g != null) {
            removeCallbacks(runnableC0346g);
            RunnableC0346g runnableC0346g2 = this.f3192g;
            AbstractC1665j.m2982b(runnableC0346g2);
            runnableC0346g2.run();
        } else {
            C1029h c1029h = this.f3189d;
            if (c1029h != null) {
                c1029h.setState(f3188j);
            }
        }
        C1029h c1029h2 = this.f3189d;
        if (c1029h2 == null) {
            return;
        }
        c1029h2.setVisible(false, false);
        unscheduleDrawable(c1029h2);
    }

    /* JADX INFO: renamed from: d */
    public final void m2108d() {
        setRippleState(false);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (isAttachedToWindow()) {
            super.draw(canvas);
        } else {
            m2107c();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m2109e(int i5, long j5, long j6) {
        C1029h c1029h = this.f3189d;
        if (c1029h == null) {
            return;
        }
        Integer num = c1029h.f3202f;
        if (num == null || num.intValue() != i5) {
            c1029h.f3202f = Integer.valueOf(i5);
            c1029h.setRadius(i5);
        }
        float f2 = Build.VERSION.SDK_INT < 28 ? 0.1f * 2 : 0.1f;
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        long jM4920b = C2762u.m4920b(f2, j6);
        C2762u c2762u = c1029h.f3201e;
        if (!(c2762u == null ? false : C2762u.m4921c(c2762u.f8764a, jM4920b))) {
            c1029h.f3201e = new C2762u(jM4920b);
            c1029h.setColor(ColorStateList.valueOf(AbstractC2767z.m4952w(jM4920b)));
        }
        Rect rect = new Rect(0, 0, AbstractC1784a.m3200N(Float.intBitsToFloat((int) (j5 >> 32))), AbstractC1784a.m3200N(Float.intBitsToFloat((int) (j5 & 4294967295L))));
        setLeft(rect.left);
        setTop(rect.top);
        setRight(rect.right);
        setBottom(rect.bottom);
        c1029h.setBounds(rect);
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) throws PendingIntent.CanceledException {
        C0099z c0099z = this.f3193h;
        if (c0099z != null) {
            c0099z.mo6a();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i5, int i6) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
    }

    @Override // android.view.View
    public final void onLayout(boolean z5, int i5, int i6, int i7, int i8) {
    }
}
