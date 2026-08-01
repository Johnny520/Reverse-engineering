package p000;

import android.R;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: yj */
/* JADX INFO: loaded from: classes.dex */
public final class C0932yj extends AbstractC0688rz {

    /* JADX INFO: renamed from: C */
    public static final int[] f5433C = {R.attr.state_pressed};

    /* JADX INFO: renamed from: D */
    public static final int[] f5434D = new int[0];

    /* JADX INFO: renamed from: A */
    public int f5435A;

    /* JADX INFO: renamed from: B */
    public final RunnableC0325i7 f5436B;

    /* JADX INFO: renamed from: a */
    public final int f5437a;

    /* JADX INFO: renamed from: b */
    public final int f5438b;

    /* JADX INFO: renamed from: c */
    public final StateListDrawable f5439c;

    /* JADX INFO: renamed from: d */
    public final Drawable f5440d;

    /* JADX INFO: renamed from: e */
    public final int f5441e;

    /* JADX INFO: renamed from: f */
    public final int f5442f;

    /* JADX INFO: renamed from: g */
    public final StateListDrawable f5443g;

    /* JADX INFO: renamed from: h */
    public final Drawable f5444h;

    /* JADX INFO: renamed from: i */
    public final int f5445i;

    /* JADX INFO: renamed from: j */
    public final int f5446j;

    /* JADX INFO: renamed from: k */
    public int f5447k;

    /* JADX INFO: renamed from: l */
    public int f5448l;

    /* JADX INFO: renamed from: m */
    public float f5449m;

    /* JADX INFO: renamed from: n */
    public int f5450n;

    /* JADX INFO: renamed from: o */
    public int f5451o;

    /* JADX INFO: renamed from: p */
    public float f5452p;

    /* JADX INFO: renamed from: s */
    public final RecyclerView f5455s;

    /* JADX INFO: renamed from: z */
    public final ValueAnimator f5462z;

    /* JADX INFO: renamed from: q */
    public int f5453q = 0;

    /* JADX INFO: renamed from: r */
    public int f5454r = 0;

    /* JADX INFO: renamed from: t */
    public boolean f5456t = false;

    /* JADX INFO: renamed from: u */
    public boolean f5457u = false;

    /* JADX INFO: renamed from: v */
    public int f5458v = 0;

    /* JADX INFO: renamed from: w */
    public int f5459w = 0;

    /* JADX INFO: renamed from: x */
    public final int[] f5460x = new int[2];

    /* JADX INFO: renamed from: y */
    public final int[] f5461y = new int[2];

    public C0932yj(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f5462z = valueAnimatorOfFloat;
        this.f5435A = 0;
        RunnableC0325i7 runnableC0325i7 = new RunnableC0325i7(6, this);
        this.f5436B = runnableC0325i7;
        C0895xj c0895xj = new C0895xj(this);
        this.f5439c = stateListDrawable;
        this.f5440d = drawable;
        this.f5443g = stateListDrawable2;
        this.f5444h = drawable2;
        this.f5441e = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.f5442f = Math.max(i, drawable.getIntrinsicWidth());
        this.f5445i = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.f5446j = Math.max(i, drawable2.getIntrinsicWidth());
        this.f5437a = i2;
        this.f5438b = i3;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        valueAnimatorOfFloat.addListener(new C0635qj(this));
        valueAnimatorOfFloat.addUpdateListener(new C0009a8(1, this));
        RecyclerView recyclerView2 = this.f5455s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            ArrayList arrayList = recyclerView2.f570m;
            AbstractC0799uz abstractC0799uz = recyclerView2.f568l;
            if (abstractC0799uz != null) {
                abstractC0799uz.mo338c("Cannot remove item decoration during a scroll  or layout");
            }
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                recyclerView2.setWillNotDraw(recyclerView2.getOverScrollMode() == 2);
            }
            recyclerView2.m369N();
            recyclerView2.requestLayout();
            RecyclerView recyclerView3 = this.f5455s;
            recyclerView3.f572n.remove(this);
            if (recyclerView3.f574o == this) {
                recyclerView3.f574o = null;
            }
            ArrayList arrayList2 = this.f5455s.f555e0;
            if (arrayList2 != null) {
                arrayList2.remove(c0895xj);
            }
            this.f5455s.removeCallbacks(runnableC0325i7);
        }
        this.f5455s = recyclerView;
        recyclerView.m386g(this);
        this.f5455s.f572n.add(this);
        this.f5455s.m387h(c0895xj);
    }

    /* JADX INFO: renamed from: e */
    public static int m2765e(float f, float f2, int[] iArr, int i, int i2, int i3) {
        int i4 = iArr[1] - iArr[0];
        if (i4 != 0) {
            int i5 = i - i3;
            int i6 = (int) (((f2 - f) / i4) * i5);
            int i7 = i2 + i6;
            if (i7 < i5 && i7 >= 0) {
                return i6;
            }
        }
        return 0;
    }

    @Override // p000.AbstractC0688rz
    /* JADX INFO: renamed from: b */
    public final void mo2302b(Canvas canvas, RecyclerView recyclerView) {
        int i = this.f5453q;
        RecyclerView recyclerView2 = this.f5455s;
        if (i != recyclerView2.getWidth() || this.f5454r != recyclerView2.getHeight()) {
            this.f5453q = recyclerView2.getWidth();
            this.f5454r = recyclerView2.getHeight();
            m2768f(0);
            return;
        }
        if (this.f5435A != 0) {
            if (this.f5456t) {
                int i2 = this.f5453q;
                int i3 = this.f5441e;
                int i4 = i2 - i3;
                int i5 = this.f5448l;
                int i6 = this.f5447k;
                int i7 = i5 - (i6 / 2);
                StateListDrawable stateListDrawable = this.f5439c;
                stateListDrawable.setBounds(0, 0, i3, i6);
                int i8 = this.f5442f;
                int i9 = this.f5454r;
                Drawable drawable = this.f5440d;
                drawable.setBounds(0, 0, i8, i9);
                WeakHashMap weakHashMap = oa0.f3426a;
                if (y90.m2732d(recyclerView2) == 1) {
                    drawable.draw(canvas);
                    canvas.translate(i3, i7);
                    canvas.scale(-1.0f, 1.0f);
                    stateListDrawable.draw(canvas);
                    canvas.scale(1.0f, 1.0f);
                    canvas.translate(-i3, -i7);
                } else {
                    canvas.translate(i4, 0.0f);
                    drawable.draw(canvas);
                    canvas.translate(0.0f, i7);
                    stateListDrawable.draw(canvas);
                    canvas.translate(-i4, -i7);
                }
            }
            if (this.f5457u) {
                int i10 = this.f5454r;
                int i11 = this.f5445i;
                int i12 = i10 - i11;
                int i13 = this.f5451o;
                int i14 = this.f5450n;
                int i15 = i13 - (i14 / 2);
                StateListDrawable stateListDrawable2 = this.f5443g;
                stateListDrawable2.setBounds(0, 0, i14, i11);
                int i16 = this.f5453q;
                int i17 = this.f5446j;
                Drawable drawable2 = this.f5444h;
                drawable2.setBounds(0, 0, i16, i17);
                canvas.translate(0.0f, i12);
                drawable2.draw(canvas);
                canvas.translate(i15, 0.0f);
                stateListDrawable2.draw(canvas);
                canvas.translate(-i15, -i12);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m2766c(float f, float f2) {
        if (f2 < this.f5454r - this.f5445i) {
            return false;
        }
        int i = this.f5451o;
        int i2 = this.f5450n;
        return f >= ((float) (i - (i2 / 2))) && f <= ((float) ((i2 / 2) + i));
    }

    /* JADX INFO: renamed from: d */
    public final boolean m2767d(float f, float f2) {
        WeakHashMap weakHashMap = oa0.f3426a;
        int iM2732d = y90.m2732d(this.f5455s);
        int i = this.f5441e;
        if (iM2732d == 1) {
            if (f > i / 2) {
                return false;
            }
        } else if (f < this.f5453q - i) {
            return false;
        }
        int i2 = this.f5448l;
        int i3 = this.f5447k / 2;
        return f2 >= ((float) (i2 - i3)) && f2 <= ((float) (i3 + i2));
    }

    /* JADX INFO: renamed from: f */
    public final void m2768f(int i) {
        RunnableC0325i7 runnableC0325i7 = this.f5436B;
        StateListDrawable stateListDrawable = this.f5439c;
        if (i == 2 && this.f5458v != 2) {
            stateListDrawable.setState(f5433C);
            this.f5455s.removeCallbacks(runnableC0325i7);
        }
        if (i == 0) {
            this.f5455s.invalidate();
        } else {
            m2769g();
        }
        if (this.f5458v == 2 && i != 2) {
            stateListDrawable.setState(f5434D);
            this.f5455s.removeCallbacks(runnableC0325i7);
            this.f5455s.postDelayed(runnableC0325i7, 1200);
        } else if (i == 1) {
            this.f5455s.removeCallbacks(runnableC0325i7);
            this.f5455s.postDelayed(runnableC0325i7, 1500);
        }
        this.f5458v = i;
    }

    /* JADX INFO: renamed from: g */
    public final void m2769g() {
        int i = this.f5435A;
        ValueAnimator valueAnimator = this.f5462z;
        if (i != 0) {
            if (i != 3) {
                return;
            } else {
                valueAnimator.cancel();
            }
        }
        this.f5435A = 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }
}
