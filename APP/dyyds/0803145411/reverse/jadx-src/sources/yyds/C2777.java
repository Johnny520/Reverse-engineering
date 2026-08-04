package yyds;

import android.R;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import java.util.ArrayList;

/* JADX INFO: renamed from: yyds.ᲈᲇᛲᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2777 extends AbstractC1744 implements InterfaceC2310 {

    /* JADX INFO: renamed from: ᛱᛳᛶᛳ, reason: contains not printable characters */
    public static final int[] f13531 = {R.attr.state_pressed};

    /* JADX INFO: renamed from: ᛸᛸᛷᛱ, reason: contains not printable characters */
    public static final int[] f13532 = new int[0];

    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public int f13533;

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final Drawable f13534;

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public float f13535;

    /* JADX INFO: renamed from: ᛲᛳᛴᛸ, reason: contains not printable characters */
    public int f13536;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final int f13537;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final int f13538;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final int f13540;

    /* JADX INFO: renamed from: ᛳᲁᲁᲇ, reason: contains not printable characters */
    public int f13542;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final int f13544;

    /* JADX INFO: renamed from: ᛵᲀᛵᛸ, reason: contains not printable characters */
    public final ValueAnimator f13545;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final StateListDrawable f13548;

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public int f13551;

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public int f13552;

    /* JADX INFO: renamed from: ᛷᛸᲇᛶ, reason: contains not printable characters */
    public final RunnableC0871 f13553;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public final int f13554;

    /* JADX INFO: renamed from: ᲀᛲᛲᲇ, reason: contains not printable characters */
    public final C1213 f13555;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final StateListDrawable f13556;

    /* JADX INFO: renamed from: ᲇᛱᛲ, reason: contains not printable characters */
    public float f13557;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final int f13558;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final Drawable f13559;

    /* JADX INFO: renamed from: ᛶᛳᛶᛵ, reason: contains not printable characters */
    public int f13547 = 0;

    /* JADX INFO: renamed from: ᛵᛶᛲᲀ, reason: contains not printable characters */
    public int f13543 = 0;

    /* JADX INFO: renamed from: ᛳᛸᛴᛶ, reason: contains not printable characters */
    public boolean f13541 = false;

    /* JADX INFO: renamed from: ᛶᲈᛴᲈ, reason: contains not printable characters */
    public boolean f13550 = false;

    /* JADX INFO: renamed from: ᛶᛸᲀᲁ, reason: contains not printable characters */
    public int f13549 = 0;

    /* JADX INFO: renamed from: ᛵᲀᲈᛴ, reason: contains not printable characters */
    public int f13546 = 0;

    /* JADX INFO: renamed from: ᛲᛶᛱᲈ, reason: contains not printable characters */
    public final int[] f13539 = new int[2];

    /* JADX INFO: renamed from: ᲈᲀᛲᲀ, reason: contains not printable characters */
    public final int[] f13560 = new int[2];

    public C2777(C1213 c1213, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f13545 = valueAnimatorOfFloat;
        this.f13536 = 0;
        RunnableC0871 runnableC0871 = new RunnableC0871(7, this);
        this.f13553 = runnableC0871;
        C0478 c0478 = new C0478(0, this);
        this.f13556 = stateListDrawable;
        this.f13559 = drawable;
        this.f13548 = stateListDrawable2;
        this.f13534 = drawable2;
        this.f13538 = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.f13558 = Math.max(i, drawable.getIntrinsicWidth());
        this.f13537 = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.f13554 = Math.max(i, drawable2.getIntrinsicWidth());
        this.f13540 = i2;
        this.f13544 = i3;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        valueAnimatorOfFloat.addListener(new C2541(this));
        valueAnimatorOfFloat.addUpdateListener(new C0383(0, this));
        C1213 c12132 = this.f13555;
        if (c12132 == c1213) {
            return;
        }
        if (c12132 != null) {
            c12132.m2436(this);
            C1213 c12133 = this.f13555;
            c12133.f5572.remove(this);
            if (c12133.f5536 == this) {
                c12133.f5536 = null;
            }
            ArrayList arrayList = this.f13555.f5574;
            if (arrayList != null) {
                arrayList.remove(c0478);
            }
            this.f13555.removeCallbacks(runnableC0871);
        }
        this.f13555 = c1213;
        c1213.m2421(this);
        this.f13555.f5572.add(this);
        this.f13555.m2426(c0478);
    }

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public static int m4896(float f, float f2, int[] iArr, int i, int i2, int i3) {
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

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final boolean m4897(float f, float f2) {
        int layoutDirection = this.f13555.getLayoutDirection();
        int i = this.f13538;
        if (layoutDirection == 1) {
            if (f > i) {
                return false;
            }
        } else if (f < this.f13547 - i) {
            return false;
        }
        int i2 = this.f13552;
        int i3 = this.f13551 / 2;
        return f2 >= ((float) (i2 - i3)) && f2 <= ((float) (i3 + i2));
    }

    @Override // yyds.InterfaceC2310
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public final void mo3487(MotionEvent motionEvent) {
        if (this.f13549 == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean zM4897 = m4897(motionEvent.getX(), motionEvent.getY());
            boolean zM4898 = m4898(motionEvent.getX(), motionEvent.getY());
            if (zM4897 || zM4898) {
                if (zM4898) {
                    this.f13546 = 1;
                    this.f13557 = (int) motionEvent.getX();
                } else if (zM4897) {
                    this.f13546 = 2;
                    this.f13535 = (int) motionEvent.getY();
                }
                m4900(2);
                return;
            }
            return;
        }
        if (motionEvent.getAction() == 1 && this.f13549 == 2) {
            this.f13535 = 0.0f;
            this.f13557 = 0.0f;
            m4900(1);
            this.f13546 = 0;
            return;
        }
        if (motionEvent.getAction() == 2 && this.f13549 == 2) {
            m4899();
            int i = this.f13546;
            C1213 c1213 = this.f13555;
            int i2 = this.f13544;
            if (i == 1) {
                float x = motionEvent.getX();
                int[] iArr = this.f13560;
                iArr[0] = i2;
                int i3 = this.f13547 - i2;
                iArr[1] = i3;
                float fMax = Math.max(i2, Math.min(i3, x));
                if (Math.abs(this.f13542 - fMax) >= 2.0f) {
                    int iM4896 = m4896(this.f13557, fMax, iArr, c1213.computeHorizontalScrollRange(), c1213.computeHorizontalScrollOffset(), this.f13547);
                    if (iM4896 != 0) {
                        c1213.scrollBy(iM4896, 0);
                    }
                    this.f13557 = fMax;
                }
            }
            if (this.f13546 == 2) {
                float y = motionEvent.getY();
                int[] iArr2 = this.f13539;
                iArr2[0] = i2;
                int i4 = this.f13543 - i2;
                iArr2[1] = i4;
                float fMax2 = Math.max(i2, Math.min(i4, y));
                if (Math.abs(this.f13552 - fMax2) < 2.0f) {
                    return;
                }
                int iM48962 = m4896(this.f13535, fMax2, iArr2, c1213.computeVerticalScrollRange(), c1213.computeVerticalScrollOffset(), this.f13543);
                if (iM48962 != 0) {
                    c1213.scrollBy(0, iM48962);
                }
                this.f13535 = fMax2;
            }
        }
    }

    @Override // yyds.InterfaceC2310
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public final boolean mo3488(MotionEvent motionEvent) {
        int i = this.f13549;
        if (i != 1) {
            return i == 2;
        }
        boolean zM4897 = m4897(motionEvent.getX(), motionEvent.getY());
        boolean zM4898 = m4898(motionEvent.getX(), motionEvent.getY());
        if (motionEvent.getAction() != 0) {
            return false;
        }
        if (!zM4897 && !zM4898) {
            return false;
        }
        if (zM4898) {
            this.f13546 = 1;
            this.f13557 = (int) motionEvent.getX();
        } else if (zM4897) {
            this.f13546 = 2;
            this.f13535 = (int) motionEvent.getY();
        }
        m4900(2);
        return true;
    }

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final boolean m4898(float f, float f2) {
        if (f2 < this.f13543 - this.f13537) {
            return false;
        }
        int i = this.f13542;
        int i2 = this.f13533;
        return f >= ((float) (i - (i2 / 2))) && f <= ((float) ((i2 / 2) + i));
    }

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public final void m4899() {
        int i = this.f13536;
        ValueAnimator valueAnimator = this.f13545;
        if (i != 0) {
            if (i != 3) {
                return;
            } else {
                valueAnimator.cancel();
            }
        }
        this.f13536 = 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public final void m4900(int i) {
        C1213 c1213 = this.f13555;
        RunnableC0871 runnableC0871 = this.f13553;
        StateListDrawable stateListDrawable = this.f13556;
        if (i == 2 && this.f13549 != 2) {
            stateListDrawable.setState(f13531);
            c1213.removeCallbacks(runnableC0871);
        }
        if (i == 0) {
            c1213.invalidate();
        } else {
            m4899();
        }
        if (this.f13549 == 2 && i != 2) {
            stateListDrawable.setState(f13532);
            c1213.removeCallbacks(runnableC0871);
            c1213.postDelayed(runnableC0871, 1200L);
        } else if (i == 1) {
            c1213.removeCallbacks(runnableC0871);
            c1213.postDelayed(runnableC0871, 1500L);
        }
        this.f13549 = i;
    }

    @Override // yyds.InterfaceC2310
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ */
    public final void mo3489(boolean z) {
    }

    @Override // yyds.AbstractC1744
    /* JADX INFO: renamed from: ᲇᲇᲇᛱ */
    public final void mo3484(Canvas canvas, C1213 c1213) {
        int i = this.f13547;
        C1213 c12132 = this.f13555;
        if (i != c12132.getWidth() || this.f13543 != c12132.getHeight()) {
            this.f13547 = c12132.getWidth();
            this.f13543 = c12132.getHeight();
            m4900(0);
            return;
        }
        if (this.f13536 != 0) {
            if (this.f13541) {
                int i2 = this.f13547;
                int i3 = this.f13538;
                int i4 = i2 - i3;
                int i5 = this.f13552;
                int i6 = this.f13551;
                int i7 = i5 - (i6 / 2);
                StateListDrawable stateListDrawable = this.f13556;
                stateListDrawable.setBounds(0, 0, i3, i6);
                int i8 = this.f13558;
                int i9 = this.f13543;
                Drawable drawable = this.f13559;
                drawable.setBounds(0, 0, i8, i9);
                if (c12132.getLayoutDirection() == 1) {
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
            if (this.f13550) {
                int i10 = this.f13543;
                int i11 = this.f13537;
                int i12 = i10 - i11;
                int i13 = this.f13542;
                int i14 = this.f13533;
                int i15 = i13 - (i14 / 2);
                StateListDrawable stateListDrawable2 = this.f13548;
                stateListDrawable2.setBounds(0, 0, i14, i11);
                int i16 = this.f13547;
                int i17 = this.f13554;
                Drawable drawable2 = this.f13534;
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
