package androidx.recyclerview.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p000a.C0181Jg;
import p000a.C0866ug;

/* JADX INFO: renamed from: androidx.recyclerview.widget.l */
/* JADX INFO: loaded from: classes.dex */
public final class C1207l extends RecyclerView.AbstractC1174k implements RecyclerView.InterfaceC1178o {

    /* JADX INFO: renamed from: C */
    public static final int[] f5123C = {R.attr.state_pressed};

    /* JADX INFO: renamed from: D */
    public static final int[] f5124D = new int[0];

    /* JADX INFO: renamed from: A */
    public int f5125A;

    /* JADX INFO: renamed from: B */
    public final a f5126B;

    /* JADX INFO: renamed from: a */
    public final int f5127a;

    /* JADX INFO: renamed from: b */
    public final int f5128b;

    /* JADX INFO: renamed from: c */
    public final StateListDrawable f5129c;

    /* JADX INFO: renamed from: d */
    public final Drawable f5130d;

    /* JADX INFO: renamed from: e */
    public final int f5131e;

    /* JADX INFO: renamed from: f */
    public final int f5132f;

    /* JADX INFO: renamed from: g */
    public final StateListDrawable f5133g;

    /* JADX INFO: renamed from: h */
    public final Drawable f5134h;

    /* JADX INFO: renamed from: i */
    public final int f5135i;

    /* JADX INFO: renamed from: j */
    public final int f5136j;

    /* JADX INFO: renamed from: k */
    public int f5137k;

    /* JADX INFO: renamed from: l */
    public int f5138l;

    /* JADX INFO: renamed from: m */
    public float f5139m;

    /* JADX INFO: renamed from: n */
    public int f5140n;

    /* JADX INFO: renamed from: o */
    public int f5141o;

    /* JADX INFO: renamed from: p */
    public float f5142p;

    /* JADX INFO: renamed from: s */
    public final RecyclerView f5145s;

    /* JADX INFO: renamed from: z */
    public final ValueAnimator f5152z;

    /* JADX INFO: renamed from: q */
    public int f5143q = 0;

    /* JADX INFO: renamed from: r */
    public int f5144r = 0;

    /* JADX INFO: renamed from: t */
    public boolean f5146t = false;

    /* JADX INFO: renamed from: u */
    public boolean f5147u = false;

    /* JADX INFO: renamed from: v */
    public int f5148v = 0;

    /* JADX INFO: renamed from: w */
    public int f5149w = 0;

    /* JADX INFO: renamed from: x */
    public final int[] f5150x = new int[2];

    /* JADX INFO: renamed from: y */
    public final int[] f5151y = new int[2];

    /* JADX INFO: renamed from: androidx.recyclerview.widget.l$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            C1207l c1207l = C1207l.this;
            int i = c1207l.f5125A;
            ValueAnimator valueAnimator = c1207l.f5152z;
            if (i == 1) {
                valueAnimator.cancel();
            } else if (i != 2) {
                return;
            }
            c1207l.f5125A = 3;
            valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
            valueAnimator.setDuration(500);
            valueAnimator.start();
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.l$b */
    public class b extends RecyclerView.AbstractC1179p {
        public b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1179p
        /* JADX INFO: renamed from: b */
        public final void mo440b(RecyclerView recyclerView, int i, int i2) {
            int iComputeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
            int iComputeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
            C1207l c1207l = C1207l.this;
            int iComputeVerticalScrollRange = c1207l.f5145s.computeVerticalScrollRange();
            int i3 = c1207l.f5144r;
            int i4 = iComputeVerticalScrollRange - i3;
            int i5 = c1207l.f5127a;
            c1207l.f5146t = i4 > 0 && i3 >= i5;
            int iComputeHorizontalScrollRange = c1207l.f5145s.computeHorizontalScrollRange();
            int i6 = c1207l.f5143q;
            boolean z = iComputeHorizontalScrollRange - i6 > 0 && i6 >= i5;
            c1207l.f5147u = z;
            boolean z2 = c1207l.f5146t;
            if (!z2 && !z) {
                if (c1207l.f5148v != 0) {
                    c1207l.m2970h(0);
                    return;
                }
                return;
            }
            if (z2) {
                float f = i3;
                c1207l.f5138l = (int) ((((f / 2.0f) + iComputeVerticalScrollOffset) * f) / iComputeVerticalScrollRange);
                c1207l.f5137k = Math.min(i3, (i3 * i3) / iComputeVerticalScrollRange);
            }
            if (c1207l.f5147u) {
                float f2 = iComputeHorizontalScrollOffset;
                float f3 = i6;
                c1207l.f5141o = (int) ((((f3 / 2.0f) + f2) * f3) / iComputeHorizontalScrollRange);
                c1207l.f5140n = Math.min(i6, (i6 * i6) / iComputeHorizontalScrollRange);
            }
            int i7 = c1207l.f5148v;
            if (i7 == 0 || i7 == 1) {
                c1207l.m2970h(1);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.l$c */
    public class c extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public boolean f5155a = false;

        public c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            this.f5155a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            if (this.f5155a) {
                this.f5155a = false;
                return;
            }
            C1207l c1207l = C1207l.this;
            if (((Float) c1207l.f5152z.getAnimatedValue()).floatValue() == 0.0f) {
                c1207l.f5125A = 0;
                c1207l.m2970h(0);
            } else {
                c1207l.f5125A = 2;
                c1207l.f5145s.invalidate();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.l$d */
    public class d implements ValueAnimator.AnimatorUpdateListener {
        public d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            int iFloatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            C1207l c1207l = C1207l.this;
            c1207l.f5129c.setAlpha(iFloatValue);
            c1207l.f5130d.setAlpha(iFloatValue);
            c1207l.f5145s.invalidate();
        }
    }

    public C1207l(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f5152z = valueAnimatorOfFloat;
        this.f5125A = 0;
        a aVar = new a();
        this.f5126B = aVar;
        b bVar = new b();
        this.f5129c = stateListDrawable;
        this.f5130d = drawable;
        this.f5133g = stateListDrawable2;
        this.f5134h = drawable2;
        this.f5131e = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.f5132f = Math.max(i, drawable.getIntrinsicWidth());
        this.f5135i = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.f5136j = Math.max(i, drawable2.getIntrinsicWidth());
        this.f5127a = i2;
        this.f5128b = i3;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        valueAnimatorOfFloat.addListener(new c());
        valueAnimatorOfFloat.addUpdateListener(new d());
        RecyclerView recyclerView2 = this.f5145s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            RecyclerView.AbstractC1175l abstractC1175l = recyclerView2.f4864m;
            if (abstractC1175l != null) {
                abstractC1175l.mo2713c("Cannot remove item decoration during a scroll  or layout");
            }
            ArrayList<RecyclerView.AbstractC1174k> arrayList = recyclerView2.f4870p;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                recyclerView2.setWillNotDraw(recyclerView2.getOverScrollMode() == 2);
            }
            recyclerView2.m2758Q();
            recyclerView2.requestLayout();
            RecyclerView recyclerView3 = this.f5145s;
            recyclerView3.f4872q.remove(this);
            if (recyclerView3.f4874r == this) {
                recyclerView3.f4874r = null;
            }
            ArrayList arrayList2 = this.f5145s.f4855h0;
            if (arrayList2 != null) {
                arrayList2.remove(bVar);
            }
            this.f5145s.removeCallbacks(aVar);
        }
        this.f5145s = recyclerView;
        if (recyclerView != null) {
            recyclerView.m2777i(this);
            this.f5145s.f4872q.add(this);
            this.f5145s.m2779j(bVar);
        }
    }

    /* JADX INFO: renamed from: g */
    public static int m2967g(float f, float f2, int[] iArr, int i, int i2, int i3) {
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

    @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC1178o
    /* JADX INFO: renamed from: a */
    public final boolean mo2865a(MotionEvent motionEvent) {
        int i = this.f5148v;
        if (i != 1) {
            return i == 2;
        }
        boolean zM2969f = m2969f(motionEvent.getX(), motionEvent.getY());
        boolean zM2968e = m2968e(motionEvent.getX(), motionEvent.getY());
        if (motionEvent.getAction() != 0) {
            return false;
        }
        if (!zM2969f && !zM2968e) {
            return false;
        }
        if (zM2968e) {
            this.f5149w = 1;
            this.f5142p = (int) motionEvent.getX();
        } else if (zM2969f) {
            this.f5149w = 2;
            this.f5139m = (int) motionEvent.getY();
        }
        m2970h(2);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC1178o
    /* JADX INFO: renamed from: b */
    public final void mo2866b(MotionEvent motionEvent) {
        if (this.f5148v == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean zM2969f = m2969f(motionEvent.getX(), motionEvent.getY());
            boolean zM2968e = m2968e(motionEvent.getX(), motionEvent.getY());
            if (zM2969f || zM2968e) {
                if (zM2968e) {
                    this.f5149w = 1;
                    this.f5142p = (int) motionEvent.getX();
                } else if (zM2969f) {
                    this.f5149w = 2;
                    this.f5139m = (int) motionEvent.getY();
                }
                m2970h(2);
                return;
            }
            return;
        }
        if (motionEvent.getAction() == 1 && this.f5148v == 2) {
            this.f5139m = 0.0f;
            this.f5142p = 0.0f;
            m2970h(1);
            this.f5149w = 0;
            return;
        }
        if (motionEvent.getAction() == 2 && this.f5148v == 2) {
            m2971i();
            int i = this.f5149w;
            int i2 = this.f5128b;
            if (i == 1) {
                float x = motionEvent.getX();
                int[] iArr = this.f5151y;
                iArr[0] = i2;
                int i3 = this.f5143q - i2;
                iArr[1] = i3;
                float fMax = Math.max(i2, Math.min(i3, x));
                if (Math.abs(this.f5141o - fMax) >= 2.0f) {
                    int iM2967g = m2967g(this.f5142p, fMax, iArr, this.f5145s.computeHorizontalScrollRange(), this.f5145s.computeHorizontalScrollOffset(), this.f5143q);
                    if (iM2967g != 0) {
                        this.f5145s.scrollBy(iM2967g, 0);
                    }
                    this.f5142p = fMax;
                }
            }
            if (this.f5149w == 2) {
                float y = motionEvent.getY();
                int[] iArr2 = this.f5150x;
                iArr2[0] = i2;
                int i4 = this.f5144r - i2;
                iArr2[1] = i4;
                float fMax2 = Math.max(i2, Math.min(i4, y));
                if (Math.abs(this.f5138l - fMax2) < 2.0f) {
                    return;
                }
                int iM2967g2 = m2967g(this.f5139m, fMax2, iArr2, this.f5145s.computeVerticalScrollRange(), this.f5145s.computeVerticalScrollOffset(), this.f5144r);
                if (iM2967g2 != 0) {
                    this.f5145s.scrollBy(0, iM2967g2);
                }
                this.f5139m = fMax2;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1174k
    /* JADX INFO: renamed from: d */
    public final void mo2825d(Canvas canvas, RecyclerView recyclerView) {
        int i = this.f5143q;
        RecyclerView recyclerView2 = this.f5145s;
        if (i != recyclerView2.getWidth() || this.f5144r != recyclerView2.getHeight()) {
            this.f5143q = recyclerView2.getWidth();
            this.f5144r = recyclerView2.getHeight();
            m2970h(0);
            return;
        }
        if (this.f5125A != 0) {
            if (this.f5146t) {
                int i2 = this.f5143q;
                int i3 = this.f5131e;
                int i4 = i2 - i3;
                int i5 = this.f5138l;
                int i6 = this.f5137k;
                int i7 = i5 - (i6 / 2);
                StateListDrawable stateListDrawable = this.f5129c;
                stateListDrawable.setBounds(0, 0, i3, i6);
                int i8 = this.f5144r;
                int i9 = this.f5132f;
                Drawable drawable = this.f5130d;
                drawable.setBounds(0, 0, i9, i8);
                WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
                if (recyclerView2.getLayoutDirection() == 1) {
                    drawable.draw(canvas);
                    canvas.translate(i3, i7);
                    canvas.scale(-1.0f, 1.0f);
                    stateListDrawable.draw(canvas);
                    canvas.scale(-1.0f, 1.0f);
                    canvas.translate(-i3, -i7);
                } else {
                    canvas.translate(i4, 0.0f);
                    drawable.draw(canvas);
                    canvas.translate(0.0f, i7);
                    stateListDrawable.draw(canvas);
                    canvas.translate(-i4, -i7);
                }
            }
            if (this.f5147u) {
                int i10 = this.f5144r;
                int i11 = this.f5135i;
                int i12 = i10 - i11;
                int i13 = this.f5141o;
                int i14 = this.f5140n;
                int i15 = i13 - (i14 / 2);
                StateListDrawable stateListDrawable2 = this.f5133g;
                stateListDrawable2.setBounds(0, 0, i14, i11);
                int i16 = this.f5143q;
                int i17 = this.f5136j;
                Drawable drawable2 = this.f5134h;
                drawable2.setBounds(0, 0, i16, i17);
                canvas.translate(0.0f, i12);
                drawable2.draw(canvas);
                canvas.translate(i15, 0.0f);
                stateListDrawable2.draw(canvas);
                canvas.translate(-i15, -i12);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final boolean m2968e(float f, float f2) {
        if (f2 < this.f5144r - this.f5135i) {
            return false;
        }
        int i = this.f5141o;
        int i2 = this.f5140n;
        return f >= ((float) (i - (i2 / 2))) && f <= ((float) ((i2 / 2) + i));
    }

    /* JADX INFO: renamed from: f */
    public final boolean m2969f(float f, float f2) {
        RecyclerView recyclerView = this.f5145s;
        WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
        boolean z = recyclerView.getLayoutDirection() == 1;
        int i = this.f5131e;
        if (!z ? f >= this.f5143q - i : f <= i) {
            int i2 = this.f5138l;
            int i3 = this.f5137k / 2;
            if (f2 >= i2 - i3 && f2 <= i3 + i2) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public final void m2970h(int i) {
        a aVar = this.f5126B;
        StateListDrawable stateListDrawable = this.f5129c;
        if (i == 2 && this.f5148v != 2) {
            stateListDrawable.setState(f5123C);
            this.f5145s.removeCallbacks(aVar);
        }
        if (i == 0) {
            this.f5145s.invalidate();
        } else {
            m2971i();
        }
        if (this.f5148v == 2 && i != 2) {
            stateListDrawable.setState(f5124D);
            this.f5145s.removeCallbacks(aVar);
            this.f5145s.postDelayed(aVar, 1200);
        } else if (i == 1) {
            this.f5145s.removeCallbacks(aVar);
            this.f5145s.postDelayed(aVar, 1500);
        }
        this.f5148v = i;
    }

    /* JADX INFO: renamed from: i */
    public final void m2971i() {
        int i = this.f5125A;
        ValueAnimator valueAnimator = this.f5152z;
        if (i != 0) {
            if (i != 3) {
                return;
            } else {
                valueAnimator.cancel();
            }
        }
        this.f5125A = 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }
}
