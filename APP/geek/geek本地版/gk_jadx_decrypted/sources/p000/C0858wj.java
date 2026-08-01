package p000;

import android.R;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: wj */
/* JADX INFO: loaded from: classes.dex */
public final class C0858wj extends AbstractC0429kz {

    /* JADX INFO: renamed from: C */
    public static final int[] f4967C = {R.attr.state_pressed};

    /* JADX INFO: renamed from: D */
    public static final int[] f4968D = new int[0];

    /* JADX INFO: renamed from: A */
    public int f4969A;

    /* JADX INFO: renamed from: B */
    public final RunnableC0919y6 f4970B;

    /* JADX INFO: renamed from: a */
    public final int f4971a;

    /* JADX INFO: renamed from: b */
    public final int f4972b;

    /* JADX INFO: renamed from: c */
    public final StateListDrawable f4973c;

    /* JADX INFO: renamed from: d */
    public final Drawable f4974d;

    /* JADX INFO: renamed from: e */
    public final int f4975e;

    /* JADX INFO: renamed from: f */
    public final int f4976f;

    /* JADX INFO: renamed from: g */
    public final StateListDrawable f4977g;

    /* JADX INFO: renamed from: h */
    public final Drawable f4978h;

    /* JADX INFO: renamed from: i */
    public final int f4979i;

    /* JADX INFO: renamed from: j */
    public final int f4980j;

    /* JADX INFO: renamed from: k */
    public int f4981k;

    /* JADX INFO: renamed from: l */
    public int f4982l;

    /* JADX INFO: renamed from: m */
    public float f4983m;

    /* JADX INFO: renamed from: n */
    public int f4984n;

    /* JADX INFO: renamed from: o */
    public int f4985o;

    /* JADX INFO: renamed from: p */
    public float f4986p;

    /* JADX INFO: renamed from: s */
    public final RecyclerView f4989s;

    /* JADX INFO: renamed from: z */
    public final ValueAnimator f4996z;

    /* JADX INFO: renamed from: q */
    public int f4987q = 0;

    /* JADX INFO: renamed from: r */
    public int f4988r = 0;

    /* JADX INFO: renamed from: t */
    public boolean f4990t = false;

    /* JADX INFO: renamed from: u */
    public boolean f4991u = false;

    /* JADX INFO: renamed from: v */
    public int f4992v = 0;

    /* JADX INFO: renamed from: w */
    public int f4993w = 0;

    /* JADX INFO: renamed from: x */
    public final int[] f4994x = new int[2];

    /* JADX INFO: renamed from: y */
    public final int[] f4995y = new int[2];

    public C0858wj(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f4996z = valueAnimatorOfFloat;
        this.f4969A = 0;
        RunnableC0919y6 runnableC0919y6 = new RunnableC0919y6(6, this);
        this.f4970B = runnableC0919y6;
        C0821vj c0821vj = new C0821vj(this);
        this.f4973c = stateListDrawable;
        this.f4974d = drawable;
        this.f4977g = stateListDrawable2;
        this.f4978h = drawable2;
        this.f4975e = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.f4976f = Math.max(i, drawable.getIntrinsicWidth());
        this.f4979i = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.f4980j = Math.max(i, drawable2.getIntrinsicWidth());
        this.f4971a = i2;
        this.f4972b = i3;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        valueAnimatorOfFloat.addListener(new C0561oj(this));
        valueAnimatorOfFloat.addUpdateListener(new C0624q7(1, this));
        RecyclerView recyclerView2 = this.f4989s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            ArrayList arrayList = recyclerView2.f607m;
            AbstractC0540nz abstractC0540nz = recyclerView2.f605l;
            if (abstractC0540nz != null) {
                abstractC0540nz.mo353c("Cannot remove item decoration during a scroll  or layout");
            }
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                recyclerView2.setWillNotDraw(recyclerView2.getOverScrollMode() == 2);
            }
            recyclerView2.m384N();
            recyclerView2.requestLayout();
            RecyclerView recyclerView3 = this.f4989s;
            recyclerView3.f609n.remove(this);
            if (recyclerView3.f611o == this) {
                recyclerView3.f611o = null;
            }
            ArrayList arrayList2 = this.f4989s.f592e0;
            if (arrayList2 != null) {
                arrayList2.remove(c0821vj);
            }
            this.f4989s.removeCallbacks(runnableC0919y6);
        }
        this.f4989s = recyclerView;
        recyclerView.m401g(this);
        this.f4989s.f609n.add(this);
        this.f4989s.m402h(c0821vj);
    }

    /* JADX INFO: renamed from: e */
    public static int m2570e(float f, float f2, int[] iArr, int i, int i2, int i3) {
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

    @Override // p000.AbstractC0429kz
    /* JADX INFO: renamed from: b */
    public final void mo1732b(Canvas canvas, RecyclerView recyclerView) {
        int i = this.f4987q;
        RecyclerView recyclerView2 = this.f4989s;
        if (i != recyclerView2.getWidth() || this.f4988r != recyclerView2.getHeight()) {
            this.f4987q = recyclerView2.getWidth();
            this.f4988r = recyclerView2.getHeight();
            m2573f(0);
            return;
        }
        if (this.f4969A != 0) {
            if (this.f4990t) {
                int i2 = this.f4987q;
                int i3 = this.f4975e;
                int i4 = i2 - i3;
                int i5 = this.f4982l;
                int i6 = this.f4981k;
                int i7 = i5 - (i6 / 2);
                StateListDrawable stateListDrawable = this.f4973c;
                stateListDrawable.setBounds(0, 0, i3, i6);
                int i8 = this.f4976f;
                int i9 = this.f4988r;
                Drawable drawable = this.f4974d;
                drawable.setBounds(0, 0, i8, i9);
                WeakHashMap weakHashMap = ja0.f2600a;
                if (t90.m2367d(recyclerView2) == 1) {
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
            if (this.f4991u) {
                int i10 = this.f4988r;
                int i11 = this.f4979i;
                int i12 = i10 - i11;
                int i13 = this.f4985o;
                int i14 = this.f4984n;
                int i15 = i13 - (i14 / 2);
                StateListDrawable stateListDrawable2 = this.f4977g;
                stateListDrawable2.setBounds(0, 0, i14, i11);
                int i16 = this.f4987q;
                int i17 = this.f4980j;
                Drawable drawable2 = this.f4978h;
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
    public final boolean m2571c(float f, float f2) {
        if (f2 < this.f4988r - this.f4979i) {
            return false;
        }
        int i = this.f4985o;
        int i2 = this.f4984n;
        return f >= ((float) (i - (i2 / 2))) && f <= ((float) ((i2 / 2) + i));
    }

    /* JADX INFO: renamed from: d */
    public final boolean m2572d(float f, float f2) {
        WeakHashMap weakHashMap = ja0.f2600a;
        int iM2367d = t90.m2367d(this.f4989s);
        int i = this.f4975e;
        if (iM2367d == 1) {
            if (f > i / 2) {
                return false;
            }
        } else if (f < this.f4987q - i) {
            return false;
        }
        int i2 = this.f4982l;
        int i3 = this.f4981k / 2;
        return f2 >= ((float) (i2 - i3)) && f2 <= ((float) (i3 + i2));
    }

    /* JADX INFO: renamed from: f */
    public final void m2573f(int i) {
        RunnableC0919y6 runnableC0919y6 = this.f4970B;
        StateListDrawable stateListDrawable = this.f4973c;
        if (i == 2 && this.f4992v != 2) {
            stateListDrawable.setState(f4967C);
            this.f4989s.removeCallbacks(runnableC0919y6);
        }
        if (i == 0) {
            this.f4989s.invalidate();
        } else {
            m2574g();
        }
        if (this.f4992v == 2 && i != 2) {
            stateListDrawable.setState(f4968D);
            this.f4989s.removeCallbacks(runnableC0919y6);
            this.f4989s.postDelayed(runnableC0919y6, 1200);
        } else if (i == 1) {
            this.f4989s.removeCallbacks(runnableC0919y6);
            this.f4989s.postDelayed(runnableC0919y6, 1500);
        }
        this.f4992v = i;
    }

    /* JADX INFO: renamed from: g */
    public final void m2574g() {
        int i = this.f4969A;
        ValueAnimator valueAnimator = this.f4996z;
        if (i != 0) {
            if (i != 3) {
                return;
            } else {
                valueAnimator.cancel();
            }
        }
        this.f4969A = 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }
}
