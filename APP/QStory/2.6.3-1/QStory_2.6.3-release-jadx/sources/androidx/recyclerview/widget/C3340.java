package androidx.recyclerview.widget;

import android.R;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import com.android.p002dx.p005io.Opcodes;

/* JADX INFO: renamed from: androidx.recyclerview.widget.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3340 extends AbstractC3370 implements InterfaceC3365 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final RunnableC3337 f7860;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public int f7861;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final ValueAnimator f7862;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final int f7864;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final int f7865;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Drawable f7866;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final StateListDrawable f7867;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f7868;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f7869;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final RecyclerView f7871;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public int f7876;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public float f7877;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public int f7880;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public float f7881;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final Drawable f7882;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final StateListDrawable f7883;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public int f7884;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public int f7885;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final int f7886;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final int f7887;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public static final int[] f7859 = {R.attr.state_pressed};

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public static final int[] f7858 = new int[0];

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f7878 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f7879 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public boolean f7870 = false;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public boolean f7874 = false;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public int f7875 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public int f7872 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final int[] f7873 = new int[2];

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final int[] f7863 = new int[2];

    public C3340(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f7862 = valueAnimatorOfFloat;
        this.f7861 = 0;
        RunnableC3337 runnableC3337 = new RunnableC3337(this, 0);
        this.f7860 = runnableC3337;
        C3341 c3341 = new C3341(this);
        this.f7867 = stateListDrawable;
        this.f7866 = drawable;
        this.f7883 = stateListDrawable2;
        this.f7882 = drawable2;
        this.f7865 = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.f7864 = Math.max(i, drawable.getIntrinsicWidth());
        this.f7886 = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.f7887 = Math.max(i, drawable2.getIntrinsicWidth());
        this.f7869 = i2;
        this.f7868 = i3;
        stateListDrawable.setAlpha(Opcodes.CONST_METHOD_TYPE);
        drawable.setAlpha(Opcodes.CONST_METHOD_TYPE);
        valueAnimatorOfFloat.addListener(new C3342(this));
        valueAnimatorOfFloat.addUpdateListener(new C3339(this, 0));
        RecyclerView recyclerView2 = this.f7871;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            recyclerView2.m5295(this);
            this.f7871.removeOnItemTouchListener(this);
            this.f7871.removeOnScrollListener(c3341);
            this.f7871.removeCallbacks(runnableC3337);
        }
        this.f7871 = recyclerView;
        recyclerView.m5291(this);
        this.f7871.addOnItemTouchListener(this);
        this.f7871.addOnScrollListener(c3341);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static int m5536(float f, float f2, int[] iArr, int i, int i2, int i3) {
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

    @Override // androidx.recyclerview.widget.InterfaceC3365
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final boolean mo5431(MotionEvent motionEvent) {
        int i = this.f7875;
        if (i != 1) {
            return i == 2;
        }
        boolean zM5540 = m5540(motionEvent.getX(), motionEvent.getY());
        boolean zM5539 = m5539(motionEvent.getX(), motionEvent.getY());
        if (motionEvent.getAction() != 0) {
            return false;
        }
        if (!zM5540 && !zM5539) {
            return false;
        }
        if (zM5539) {
            this.f7872 = 1;
            this.f7881 = (int) motionEvent.getX();
        } else if (zM5540) {
            this.f7872 = 2;
            this.f7877 = (int) motionEvent.getY();
        }
        m5538(2);
        return true;
    }

    @Override // androidx.recyclerview.widget.InterfaceC3365
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo5432(MotionEvent motionEvent) {
        if (this.f7875 == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean zM5540 = m5540(motionEvent.getX(), motionEvent.getY());
            boolean zM5539 = m5539(motionEvent.getX(), motionEvent.getY());
            if (zM5540 || zM5539) {
                if (zM5539) {
                    this.f7872 = 1;
                    this.f7881 = (int) motionEvent.getX();
                } else if (zM5540) {
                    this.f7872 = 2;
                    this.f7877 = (int) motionEvent.getY();
                }
                m5538(2);
                return;
            }
            return;
        }
        if (motionEvent.getAction() == 1 && this.f7875 == 2) {
            this.f7877 = 0.0f;
            this.f7881 = 0.0f;
            m5538(1);
            this.f7872 = 0;
            return;
        }
        if (motionEvent.getAction() == 2 && this.f7875 == 2) {
            m5537();
            int i = this.f7872;
            RecyclerView recyclerView = this.f7871;
            int i2 = this.f7868;
            if (i == 1) {
                float x = motionEvent.getX();
                int[] iArr = this.f7863;
                iArr[0] = i2;
                int i3 = this.f7878 - i2;
                iArr[1] = i3;
                float fMax = Math.max(i2, Math.min(i3, x));
                if (Math.abs(this.f7880 - fMax) >= 2.0f) {
                    int iM5536 = m5536(this.f7881, fMax, iArr, recyclerView.computeHorizontalScrollRange(), recyclerView.computeHorizontalScrollOffset(), this.f7878);
                    if (iM5536 != 0) {
                        recyclerView.scrollBy(iM5536, 0);
                    }
                    this.f7881 = fMax;
                }
            }
            if (this.f7872 == 2) {
                float y = motionEvent.getY();
                int[] iArr2 = this.f7873;
                iArr2[0] = i2;
                int i4 = this.f7879 - i2;
                iArr2[1] = i4;
                float fMax2 = Math.max(i2, Math.min(i4, y));
                if (Math.abs(this.f7885 - fMax2) < 2.0f) {
                    return;
                }
                int iM55362 = m5536(this.f7877, fMax2, iArr2, recyclerView.computeVerticalScrollRange(), recyclerView.computeVerticalScrollOffset(), this.f7879);
                if (iM55362 != 0) {
                    recyclerView.scrollBy(0, iM55362);
                }
                this.f7877 = fMax2;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final void m5537() {
        int i = this.f7861;
        ValueAnimator valueAnimator = this.f7862;
        if (i != 0) {
            if (i != 3) {
                return;
            } else {
                valueAnimator.cancel();
            }
        }
        this.f7861 = 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }

    @Override // androidx.recyclerview.widget.AbstractC3370
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final void mo5447(Canvas canvas, RecyclerView recyclerView) {
        int i = this.f7878;
        RecyclerView recyclerView2 = this.f7871;
        if (i != recyclerView2.getWidth() || this.f7879 != recyclerView2.getHeight()) {
            this.f7878 = recyclerView2.getWidth();
            this.f7879 = recyclerView2.getHeight();
            m5538(0);
            return;
        }
        if (this.f7861 != 0) {
            if (this.f7870) {
                int i2 = this.f7878;
                int i3 = this.f7865;
                int i4 = i2 - i3;
                int i5 = this.f7885;
                int i6 = this.f7884;
                int i7 = i5 - (i6 / 2);
                StateListDrawable stateListDrawable = this.f7867;
                stateListDrawable.setBounds(0, 0, i3, i6);
                int i8 = this.f7864;
                int i9 = this.f7879;
                Drawable drawable = this.f7866;
                drawable.setBounds(0, 0, i8, i9);
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
            if (this.f7874) {
                int i10 = this.f7879;
                int i11 = this.f7886;
                int i12 = i10 - i11;
                int i13 = this.f7880;
                int i14 = this.f7876;
                int i15 = i13 - (i14 / 2);
                StateListDrawable stateListDrawable2 = this.f7883;
                stateListDrawable2.setBounds(0, 0, i14, i11);
                int i16 = this.f7878;
                int i17 = this.f7887;
                Drawable drawable2 = this.f7882;
                drawable2.setBounds(0, 0, i16, i17);
                canvas.translate(0.0f, i12);
                drawable2.draw(canvas);
                canvas.translate(i15, 0.0f);
                stateListDrawable2.draw(canvas);
                canvas.translate(-i15, -i12);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void m5538(int i) {
        RecyclerView recyclerView = this.f7871;
        RunnableC3337 runnableC3337 = this.f7860;
        StateListDrawable stateListDrawable = this.f7867;
        if (i == 2 && this.f7875 != 2) {
            stateListDrawable.setState(f7859);
            recyclerView.removeCallbacks(runnableC3337);
        }
        if (i == 0) {
            recyclerView.invalidate();
        } else {
            m5537();
        }
        if (this.f7875 == 2 && i != 2) {
            stateListDrawable.setState(f7858);
            recyclerView.removeCallbacks(runnableC3337);
            recyclerView.postDelayed(runnableC3337, 1200L);
        } else if (i == 1) {
            recyclerView.removeCallbacks(runnableC3337);
            recyclerView.postDelayed(runnableC3337, 1500L);
        }
        this.f7875 = i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final boolean m5539(float f, float f2) {
        if (f2 < this.f7879 - this.f7886) {
            return false;
        }
        int i = this.f7880;
        int i2 = this.f7876;
        return f >= ((float) (i - (i2 / 2))) && f <= ((float) ((i2 / 2) + i));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final boolean m5540(float f, float f2) {
        int layoutDirection = this.f7871.getLayoutDirection();
        int i = this.f7865;
        if (layoutDirection == 1) {
            if (f > i) {
                return false;
            }
        } else if (f < this.f7878 - i) {
            return false;
        }
        int i2 = this.f7885;
        int i3 = this.f7884 / 2;
        return f2 >= ((float) (i2 - i3)) && f2 <= ((float) (i3 + i2));
    }

    @Override // androidx.recyclerview.widget.InterfaceC3365
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo5430(boolean z) {
    }
}
