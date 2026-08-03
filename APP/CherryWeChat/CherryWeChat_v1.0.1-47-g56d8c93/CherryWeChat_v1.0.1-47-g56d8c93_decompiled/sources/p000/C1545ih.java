package p000;

import android.R;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: ih */
/* JADX INFO: loaded from: classes.dex */
public final class C1545ih extends AbstractC2251mv implements InterfaceC2560tv {

    /* JADX INFO: renamed from: C */
    public static final int[] f5466C = {R.attr.state_pressed};

    /* JADX INFO: renamed from: D */
    public static final int[] f5467D = new int[0];

    /* JADX INFO: renamed from: A */
    public int f5468A;

    /* JADX INFO: renamed from: B */
    public final RunnableC0431K0 f5469B;

    /* JADX INFO: renamed from: a */
    public final int f5470a;

    /* JADX INFO: renamed from: b */
    public final int f5471b;

    /* JADX INFO: renamed from: c */
    public final StateListDrawable f5472c;

    /* JADX INFO: renamed from: d */
    public final Drawable f5473d;

    /* JADX INFO: renamed from: e */
    public final int f5474e;

    /* JADX INFO: renamed from: f */
    public final int f5475f;

    /* JADX INFO: renamed from: g */
    public final StateListDrawable f5476g;

    /* JADX INFO: renamed from: h */
    public final Drawable f5477h;

    /* JADX INFO: renamed from: i */
    public final int f5478i;

    /* JADX INFO: renamed from: j */
    public final int f5479j;

    /* JADX INFO: renamed from: k */
    public int f5480k;

    /* JADX INFO: renamed from: l */
    public int f5481l;

    /* JADX INFO: renamed from: m */
    public float f5482m;

    /* JADX INFO: renamed from: n */
    public int f5483n;

    /* JADX INFO: renamed from: o */
    public int f5484o;

    /* JADX INFO: renamed from: p */
    public float f5485p;

    /* JADX INFO: renamed from: s */
    public final RecyclerView f5488s;

    /* JADX INFO: renamed from: z */
    public final ValueAnimator f5495z;

    /* JADX INFO: renamed from: q */
    public int f5486q = 0;

    /* JADX INFO: renamed from: r */
    public int f5487r = 0;

    /* JADX INFO: renamed from: t */
    public boolean f5489t = false;

    /* JADX INFO: renamed from: u */
    public boolean f5490u = false;

    /* JADX INFO: renamed from: v */
    public int f5491v = 0;

    /* JADX INFO: renamed from: w */
    public int f5492w = 0;

    /* JADX INFO: renamed from: x */
    public final int[] f5493x = new int[2];

    /* JADX INFO: renamed from: y */
    public final int[] f5494y = new int[2];

    public C1545ih(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f5495z = valueAnimatorOfFloat;
        this.f5468A = 0;
        RunnableC0431K0 runnableC0431K0 = new RunnableC0431K0(6, this);
        this.f5469B = runnableC0431K0;
        C1458gh c1458gh = new C1458gh(this);
        this.f5472c = stateListDrawable;
        this.f5473d = drawable;
        this.f5476g = stateListDrawable2;
        this.f5477h = drawable2;
        this.f5474e = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.f5475f = Math.max(i, drawable.getIntrinsicWidth());
        this.f5478i = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.f5479j = Math.max(i, drawable2.getIntrinsicWidth());
        this.f5470a = i2;
        this.f5471b = i3;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        valueAnimatorOfFloat.addListener(new C1502hh(this));
        valueAnimatorOfFloat.addUpdateListener(new C0994X5(1, this));
        RecyclerView recyclerView2 = this.f5488s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            recyclerView2.removeItemDecoration(this);
            this.f5488s.removeOnItemTouchListener(this);
            this.f5488s.removeOnScrollListener(c1458gh);
            this.f5488s.removeCallbacks(runnableC0431K0);
        }
        this.f5488s = recyclerView;
        recyclerView.addItemDecoration(this);
        this.f5488s.addOnItemTouchListener(this);
        this.f5488s.addOnScrollListener(c1458gh);
    }

    /* JADX INFO: renamed from: f */
    public static int m2964f(float f, float f2, int[] iArr, int i, int i2, int i3) {
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

    @Override // p000.InterfaceC2560tv
    /* JADX INFO: renamed from: a */
    public final void mo1552a(MotionEvent motionEvent) {
        if (this.f5491v == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean zM2966e = m2966e(motionEvent.getX(), motionEvent.getY());
            boolean zM2965d = m2965d(motionEvent.getX(), motionEvent.getY());
            if (zM2966e || zM2965d) {
                if (zM2965d) {
                    this.f5492w = 1;
                    this.f5485p = (int) motionEvent.getX();
                } else if (zM2966e) {
                    this.f5492w = 2;
                    this.f5482m = (int) motionEvent.getY();
                }
                m2967g(2);
                return;
            }
            return;
        }
        if (motionEvent.getAction() == 1 && this.f5491v == 2) {
            this.f5482m = 0.0f;
            this.f5485p = 0.0f;
            m2967g(1);
            this.f5492w = 0;
            return;
        }
        if (motionEvent.getAction() == 2 && this.f5491v == 2) {
            m2968h();
            int i = this.f5492w;
            int i2 = this.f5471b;
            if (i == 1) {
                float x = motionEvent.getX();
                int[] iArr = this.f5494y;
                iArr[0] = i2;
                int i3 = this.f5486q - i2;
                iArr[1] = i3;
                float fMax = Math.max(i2, Math.min(i3, x));
                if (Math.abs(this.f5484o - fMax) >= 2.0f) {
                    int iM2964f = m2964f(this.f5485p, fMax, iArr, this.f5488s.computeHorizontalScrollRange(), this.f5488s.computeHorizontalScrollOffset(), this.f5486q);
                    if (iM2964f != 0) {
                        this.f5488s.scrollBy(iM2964f, 0);
                    }
                    this.f5485p = fMax;
                }
            }
            if (this.f5492w == 2) {
                float y = motionEvent.getY();
                int[] iArr2 = this.f5493x;
                iArr2[0] = i2;
                int i4 = this.f5487r - i2;
                iArr2[1] = i4;
                float fMax2 = Math.max(i2, Math.min(i4, y));
                if (Math.abs(this.f5481l - fMax2) < 2.0f) {
                    return;
                }
                int iM2964f2 = m2964f(this.f5482m, fMax2, iArr2, this.f5488s.computeVerticalScrollRange(), this.f5488s.computeVerticalScrollOffset(), this.f5487r);
                if (iM2964f2 != 0) {
                    this.f5488s.scrollBy(0, iM2964f2);
                }
                this.f5482m = fMax2;
            }
        }
    }

    @Override // p000.InterfaceC2560tv
    /* JADX INFO: renamed from: b */
    public final boolean mo1553b(MotionEvent motionEvent) {
        int i = this.f5491v;
        if (i != 1) {
            return i == 2;
        }
        boolean zM2966e = m2966e(motionEvent.getX(), motionEvent.getY());
        boolean zM2965d = m2965d(motionEvent.getX(), motionEvent.getY());
        if (motionEvent.getAction() != 0) {
            return false;
        }
        if (!zM2966e && !zM2965d) {
            return false;
        }
        if (zM2965d) {
            this.f5492w = 1;
            this.f5485p = (int) motionEvent.getX();
        } else if (zM2966e) {
            this.f5492w = 2;
            this.f5482m = (int) motionEvent.getY();
        }
        m2967g(2);
        return true;
    }

    @Override // p000.InterfaceC2560tv
    /* JADX INFO: renamed from: c */
    public final void mo1554c(boolean z) {
    }

    /* JADX INFO: renamed from: d */
    public final boolean m2965d(float f, float f2) {
        if (f2 < this.f5487r - this.f5478i) {
            return false;
        }
        int i = this.f5484o;
        int i2 = this.f5483n;
        return f >= ((float) (i - (i2 / 2))) && f <= ((float) ((i2 / 2) + i));
    }

    /* JADX INFO: renamed from: e */
    public final boolean m2966e(float f, float f2) {
        WeakHashMap weakHashMap = AbstractC2185lE.f7617a;
        int layoutDirection = this.f5488s.getLayoutDirection();
        int i = this.f5474e;
        if (layoutDirection == 1) {
            if (f > i) {
                return false;
            }
        } else if (f < this.f5486q - i) {
            return false;
        }
        int i2 = this.f5481l;
        int i3 = this.f5480k / 2;
        return f2 >= ((float) (i2 - i3)) && f2 <= ((float) (i3 + i2));
    }

    /* JADX INFO: renamed from: g */
    public final void m2967g(int i) {
        RunnableC0431K0 runnableC0431K0 = this.f5469B;
        StateListDrawable stateListDrawable = this.f5472c;
        if (i == 2 && this.f5491v != 2) {
            stateListDrawable.setState(f5466C);
            this.f5488s.removeCallbacks(runnableC0431K0);
        }
        if (i == 0) {
            this.f5488s.invalidate();
        } else {
            m2968h();
        }
        if (this.f5491v == 2 && i != 2) {
            stateListDrawable.setState(f5467D);
            this.f5488s.removeCallbacks(runnableC0431K0);
            this.f5488s.postDelayed(runnableC0431K0, 1200);
        } else if (i == 1) {
            this.f5488s.removeCallbacks(runnableC0431K0);
            this.f5488s.postDelayed(runnableC0431K0, 1500);
        }
        this.f5491v = i;
    }

    /* JADX INFO: renamed from: h */
    public final void m2968h() {
        int i = this.f5468A;
        ValueAnimator valueAnimator = this.f5495z;
        if (i != 0) {
            if (i != 3) {
                return;
            } else {
                valueAnimator.cancel();
            }
        }
        this.f5468A = 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }

    @Override // p000.AbstractC2251mv
    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, C0038Av c0038Av) {
        int i = this.f5486q;
        RecyclerView recyclerView2 = this.f5488s;
        if (i != recyclerView2.getWidth() || this.f5487r != recyclerView2.getHeight()) {
            this.f5486q = recyclerView2.getWidth();
            this.f5487r = recyclerView2.getHeight();
            m2967g(0);
            return;
        }
        if (this.f5468A != 0) {
            if (this.f5489t) {
                int i2 = this.f5486q;
                int i3 = this.f5474e;
                int i4 = i2 - i3;
                int i5 = this.f5481l;
                int i6 = this.f5480k;
                int i7 = i5 - (i6 / 2);
                StateListDrawable stateListDrawable = this.f5472c;
                stateListDrawable.setBounds(0, 0, i3, i6);
                int i8 = this.f5475f;
                int i9 = this.f5487r;
                Drawable drawable = this.f5473d;
                drawable.setBounds(0, 0, i8, i9);
                WeakHashMap weakHashMap = AbstractC2185lE.f7617a;
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
            if (this.f5490u) {
                int i10 = this.f5487r;
                int i11 = this.f5478i;
                int i12 = i10 - i11;
                int i13 = this.f5484o;
                int i14 = this.f5483n;
                int i15 = i13 - (i14 / 2);
                StateListDrawable stateListDrawable2 = this.f5476g;
                stateListDrawable2.setBounds(0, 0, i14, i11);
                int i16 = this.f5486q;
                int i17 = this.f5479j;
                Drawable drawable2 = this.f5477h;
                drawable2.setBounds(0, 0, i16, i17);
                canvas.translate(0.0f, i12);
                drawable2.draw(canvas);
                canvas.translate(i15, 0.0f);
                stateListDrawable2.draw(canvas);
                canvas.translate(-i15, -i12);
            }
        }
    }
}
