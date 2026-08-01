package androidx.recyclerview.widget;

import android.R;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import com.android.dx.io.Opcodes;

/* JADX INFO: renamed from: androidx.recyclerview.widget.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2507 extends AbstractC2537 implements InterfaceC2532 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final RunnableC2504 f7514;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public int f7515;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final ValueAnimator f7516;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final int f7518;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final int f7519;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Drawable f7520;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final StateListDrawable f7521;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f7522;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f7523;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final RecyclerView f7525;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public int f7530;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public float f7531;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public int f7534;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public float f7535;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final Drawable f7536;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final StateListDrawable f7537;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public int f7538;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public int f7539;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final int f7540;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final int f7541;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public static final int[] f7513 = {R.attr.state_pressed};

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public static final int[] f7512 = new int[0];

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f7532 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f7533 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public boolean f7524 = false;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public boolean f7528 = false;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public int f7529 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public int f7526 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final int[] f7527 = new int[2];

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final int[] f7517 = new int[2];

    public C2507(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f7516 = valueAnimatorOfFloat;
        this.f7515 = 0;
        RunnableC2504 runnableC2504 = new RunnableC2504(this, 0);
        this.f7514 = runnableC2504;
        C2508 c2508 = new C2508(this);
        this.f7521 = stateListDrawable;
        this.f7520 = drawable;
        this.f7537 = stateListDrawable2;
        this.f7536 = drawable2;
        this.f7519 = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.f7518 = Math.max(i, drawable.getIntrinsicWidth());
        this.f7540 = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.f7541 = Math.max(i, drawable2.getIntrinsicWidth());
        this.f7523 = i2;
        this.f7522 = i3;
        stateListDrawable.setAlpha(Opcodes.CONST_METHOD_TYPE);
        drawable.setAlpha(Opcodes.CONST_METHOD_TYPE);
        valueAnimatorOfFloat.addListener(new C2509(this));
        valueAnimatorOfFloat.addUpdateListener(new C2506(this, 0));
        RecyclerView recyclerView2 = this.f7525;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            recyclerView2.m4725(this);
            this.f7525.removeOnItemTouchListener(this);
            this.f7525.removeOnScrollListener(c2508);
            this.f7525.removeCallbacks(runnableC2504);
        }
        this.f7525 = recyclerView;
        recyclerView.m4721(this);
        this.f7525.addOnItemTouchListener(this);
        this.f7525.addOnScrollListener(c2508);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static int m4966(float f, float f2, int[] iArr, int i, int i2, int i3) {
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

    @Override // androidx.recyclerview.widget.InterfaceC2532
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final boolean mo4861(MotionEvent motionEvent) {
        int i = this.f7529;
        if (i != 1) {
            return i == 2;
        }
        boolean zM4970 = m4970(motionEvent.getX(), motionEvent.getY());
        boolean zM4969 = m4969(motionEvent.getX(), motionEvent.getY());
        if (motionEvent.getAction() != 0) {
            return false;
        }
        if (!zM4970 && !zM4969) {
            return false;
        }
        if (zM4969) {
            this.f7526 = 1;
            this.f7535 = (int) motionEvent.getX();
        } else if (zM4970) {
            this.f7526 = 2;
            this.f7531 = (int) motionEvent.getY();
        }
        m4968(2);
        return true;
    }

    @Override // androidx.recyclerview.widget.InterfaceC2532
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo4862(MotionEvent motionEvent) {
        if (this.f7529 == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean zM4970 = m4970(motionEvent.getX(), motionEvent.getY());
            boolean zM4969 = m4969(motionEvent.getX(), motionEvent.getY());
            if (zM4970 || zM4969) {
                if (zM4969) {
                    this.f7526 = 1;
                    this.f7535 = (int) motionEvent.getX();
                } else if (zM4970) {
                    this.f7526 = 2;
                    this.f7531 = (int) motionEvent.getY();
                }
                m4968(2);
                return;
            }
            return;
        }
        if (motionEvent.getAction() == 1 && this.f7529 == 2) {
            this.f7531 = 0.0f;
            this.f7535 = 0.0f;
            m4968(1);
            this.f7526 = 0;
            return;
        }
        if (motionEvent.getAction() == 2 && this.f7529 == 2) {
            m4967();
            int i = this.f7526;
            RecyclerView recyclerView = this.f7525;
            int i2 = this.f7522;
            if (i == 1) {
                float x = motionEvent.getX();
                int[] iArr = this.f7517;
                iArr[0] = i2;
                int i3 = this.f7532 - i2;
                iArr[1] = i3;
                float fMax = Math.max(i2, Math.min(i3, x));
                if (Math.abs(this.f7534 - fMax) >= 2.0f) {
                    int iM4966 = m4966(this.f7535, fMax, iArr, recyclerView.computeHorizontalScrollRange(), recyclerView.computeHorizontalScrollOffset(), this.f7532);
                    if (iM4966 != 0) {
                        recyclerView.scrollBy(iM4966, 0);
                    }
                    this.f7535 = fMax;
                }
            }
            if (this.f7526 == 2) {
                float y = motionEvent.getY();
                int[] iArr2 = this.f7527;
                iArr2[0] = i2;
                int i4 = this.f7533 - i2;
                iArr2[1] = i4;
                float fMax2 = Math.max(i2, Math.min(i4, y));
                if (Math.abs(this.f7539 - fMax2) < 2.0f) {
                    return;
                }
                int iM49662 = m4966(this.f7531, fMax2, iArr2, recyclerView.computeVerticalScrollRange(), recyclerView.computeVerticalScrollOffset(), this.f7533);
                if (iM49662 != 0) {
                    recyclerView.scrollBy(0, iM49662);
                }
                this.f7531 = fMax2;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final void m4967() {
        int i = this.f7515;
        ValueAnimator valueAnimator = this.f7516;
        if (i != 0) {
            if (i != 3) {
                return;
            } else {
                valueAnimator.cancel();
            }
        }
        this.f7515 = 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }

    @Override // androidx.recyclerview.widget.AbstractC2537
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final void mo4877(Canvas canvas, RecyclerView recyclerView) {
        int i = this.f7532;
        RecyclerView recyclerView2 = this.f7525;
        if (i != recyclerView2.getWidth() || this.f7533 != recyclerView2.getHeight()) {
            this.f7532 = recyclerView2.getWidth();
            this.f7533 = recyclerView2.getHeight();
            m4968(0);
            return;
        }
        if (this.f7515 != 0) {
            if (this.f7524) {
                int i2 = this.f7532;
                int i3 = this.f7519;
                int i4 = i2 - i3;
                int i5 = this.f7539;
                int i6 = this.f7538;
                int i7 = i5 - (i6 / 2);
                StateListDrawable stateListDrawable = this.f7521;
                stateListDrawable.setBounds(0, 0, i3, i6);
                int i8 = this.f7518;
                int i9 = this.f7533;
                Drawable drawable = this.f7520;
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
            if (this.f7528) {
                int i10 = this.f7533;
                int i11 = this.f7540;
                int i12 = i10 - i11;
                int i13 = this.f7534;
                int i14 = this.f7530;
                int i15 = i13 - (i14 / 2);
                StateListDrawable stateListDrawable2 = this.f7537;
                stateListDrawable2.setBounds(0, 0, i14, i11);
                int i16 = this.f7532;
                int i17 = this.f7541;
                Drawable drawable2 = this.f7536;
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
    public final void m4968(int i) {
        RecyclerView recyclerView = this.f7525;
        RunnableC2504 runnableC2504 = this.f7514;
        StateListDrawable stateListDrawable = this.f7521;
        if (i == 2 && this.f7529 != 2) {
            stateListDrawable.setState(f7513);
            recyclerView.removeCallbacks(runnableC2504);
        }
        if (i == 0) {
            recyclerView.invalidate();
        } else {
            m4967();
        }
        if (this.f7529 == 2 && i != 2) {
            stateListDrawable.setState(f7512);
            recyclerView.removeCallbacks(runnableC2504);
            recyclerView.postDelayed(runnableC2504, 1200L);
        } else if (i == 1) {
            recyclerView.removeCallbacks(runnableC2504);
            recyclerView.postDelayed(runnableC2504, 1500L);
        }
        this.f7529 = i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final boolean m4969(float f, float f2) {
        if (f2 < this.f7533 - this.f7540) {
            return false;
        }
        int i = this.f7534;
        int i2 = this.f7530;
        return f >= ((float) (i - (i2 / 2))) && f <= ((float) ((i2 / 2) + i));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final boolean m4970(float f, float f2) {
        int layoutDirection = this.f7525.getLayoutDirection();
        int i = this.f7519;
        if (layoutDirection == 1) {
            if (f > i) {
                return false;
            }
        } else if (f < this.f7532 - i) {
            return false;
        }
        int i2 = this.f7539;
        int i3 = this.f7538 / 2;
        return f2 >= ((float) (i2 - i3)) && f2 <= ((float) (i3 + i2));
    }

    @Override // androidx.recyclerview.widget.InterfaceC2532
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo4860(boolean z) {
    }
}
