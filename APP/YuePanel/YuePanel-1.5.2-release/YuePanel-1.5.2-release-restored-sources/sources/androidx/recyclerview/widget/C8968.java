package androidx.recyclerview.widget;

import Yue.C8273;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import Yue.InterfaceC8392;
import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: androidx.recyclerview.widget.ۥۣ۟۟۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8392
public class C8968 extends RecyclerView.AbstractC8918 implements RecyclerView.InterfaceC8925 {

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static final int f30171 = 0;

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static final int f30172 = 1;

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static final int f30173 = 2;

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public static final int f30174 = 0;

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public static final int f30175 = 1;

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public static final int f30176 = 2;

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public static final int f30177 = 0;

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public static final int f30178 = 1;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public static final int f30179 = 2;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public static final int f30180 = 3;

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public static final int f30181 = 500;

    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public static final int f30182 = 1500;

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public static final int f30183 = 1200;

    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public static final int f30184 = 500;

    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public static final int f30185 = 255;

    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    public static final int[] f30186 = {R.attr.state_pressed};

    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    public static final int[] f30187 = new int[0];

    /* JADX INFO: renamed from: ۥ */
    public final int f3952;

    /* JADX INFO: renamed from: ۥ۟ */
    public final int f3953;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final StateListDrawable f30188;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final Drawable f30189;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final int f30190;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final int f30191;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final StateListDrawable f30192;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final Drawable f30193;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final int f30194;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final int f30195;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    @InterfaceC8392
    public int f30196;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    @InterfaceC8392
    public int f30197;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    @InterfaceC8392
    public float f30198;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    @InterfaceC8392
    public int f30199;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    @InterfaceC8392
    public int f30200;

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    @InterfaceC8392
    public float f30201;

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public RecyclerView f30204;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public final ValueAnimator f30211;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public int f30212;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public final Runnable f30213;

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public final RecyclerView.AbstractC8926 f30214;

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public int f30202 = 0;

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public int f30203 = 0;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public boolean f30205 = false;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public boolean f30206 = false;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public int f30207 = 0;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public int f30208 = 0;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public final int[] f30209 = new int[2];

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public final int[] f30210 = new int[2];

    /* JADX INFO: renamed from: androidx.recyclerview.widget.ۥۣ۟۟۟$ۥ */
    public class RunnableC1769 implements Runnable {
        public RunnableC1769() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C8968.this.m30596(500);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.ۥۣ۟۟۟$ۥ۟ */
    public class C1770 extends RecyclerView.AbstractC8926 {
        public C1770() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8926
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            C8968.this.m30609(recyclerView.computeHorizontalScrollOffset(), recyclerView.computeVerticalScrollOffset());
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.ۥۣ۟۟۟$ۥ۟۟, reason: contains not printable characters */
    public class C8969 extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: ۥ */
        public boolean f3955 = false;

        public C8969() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f3955 = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f3955) {
                this.f3955 = false;
                return;
            }
            if (((Float) C8968.this.f30211.getAnimatedValue()).floatValue() == 0.0f) {
                C8968 c8968 = C8968.this;
                c8968.f30212 = 0;
                c8968.m30606(0);
            } else {
                C8968 c89682 = C8968.this;
                c89682.f30212 = 2;
                c89682.m30603();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.ۥۣ۟۟۟$ۥ۟۟۟, reason: contains not printable characters */
    public class C8970 implements ValueAnimator.AnimatorUpdateListener {
        public C8970() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int iFloatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            C8968.this.f30188.setAlpha(iFloatValue);
            C8968.this.f30189.setAlpha(iFloatValue);
            C8968.this.m30603();
        }
    }

    public C8968(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f30211 = valueAnimatorOfFloat;
        this.f30212 = 0;
        this.f30213 = new RunnableC1769();
        this.f30214 = new C1770();
        this.f30188 = stateListDrawable;
        this.f30189 = drawable;
        this.f30192 = stateListDrawable2;
        this.f30193 = drawable2;
        this.f30190 = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.f30191 = Math.max(i, drawable.getIntrinsicWidth());
        this.f30194 = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.f30195 = Math.max(i, drawable2.getIntrinsicWidth());
        this.f3952 = i2;
        this.f3953 = i3;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        valueAnimatorOfFloat.addListener(new C8969());
        valueAnimatorOfFloat.addUpdateListener(new C8970());
        m30585(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8918
    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.C8935 c8935) {
        if (this.f30202 != this.f30204.getWidth() || this.f30203 != this.f30204.getHeight()) {
            this.f30202 = this.f30204.getWidth();
            this.f30203 = this.f30204.getHeight();
            m30606(0);
        } else if (this.f30212 != 0) {
            if (this.f30205) {
                m30589(canvas);
            }
            if (this.f30206) {
                m30588(canvas);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC8925
    /* JADX INFO: renamed from: ۥ */
    public void mo4932(@InterfaceC6391 RecyclerView recyclerView, @InterfaceC6391 MotionEvent motionEvent) {
        if (this.f30207 == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean zM30601 = m30601(motionEvent.getX(), motionEvent.getY());
            boolean zM30600 = m30600(motionEvent.getX(), motionEvent.getY());
            if (zM30601 || zM30600) {
                if (zM30600) {
                    this.f30208 = 1;
                    this.f30201 = (int) motionEvent.getX();
                } else if (zM30601) {
                    this.f30208 = 2;
                    this.f30198 = (int) motionEvent.getY();
                }
                m30606(2);
                return;
            }
            return;
        }
        if (motionEvent.getAction() == 1 && this.f30207 == 2) {
            this.f30198 = 0.0f;
            this.f30201 = 0.0f;
            m30606(1);
            this.f30208 = 0;
            return;
        }
        if (motionEvent.getAction() == 2 && this.f30207 == 2) {
            m30608();
            if (this.f30208 == 1) {
                m30597(motionEvent.getX());
            }
            if (this.f30208 == 2) {
                m30610(motionEvent.getY());
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC8925
    /* JADX INFO: renamed from: ۥ۟۟ */
    public boolean mo30309(@InterfaceC6391 RecyclerView recyclerView, @InterfaceC6391 MotionEvent motionEvent) {
        int i = this.f30207;
        if (i == 1) {
            boolean zM30601 = m30601(motionEvent.getX(), motionEvent.getY());
            boolean zM30600 = m30600(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() != 0) {
                return false;
            }
            if (!zM30601 && !zM30600) {
                return false;
            }
            if (zM30600) {
                this.f30208 = 1;
                this.f30201 = (int) motionEvent.getX();
            } else if (zM30601) {
                this.f30208 = 2;
                this.f30198 = (int) motionEvent.getY();
            }
            m30606(2);
        } else if (i != 2) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC8925
    /* JADX INFO: renamed from: ۥ۟۟۟۟ */
    public void mo30310(boolean z) {
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public void m30585(@InterfaceC6490 RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f30204;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            m30587();
        }
        this.f30204 = recyclerView;
        if (recyclerView != null) {
            m30607();
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final void m30586() {
        this.f30204.removeCallbacks(this.f30213);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final void m30587() {
        this.f30204.removeItemDecoration(this);
        this.f30204.removeOnItemTouchListener(this);
        this.f30204.removeOnScrollListener(this.f30214);
        m30586();
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final void m30588(Canvas canvas) {
        int i = this.f30203;
        int i2 = this.f30194;
        int i3 = this.f30200;
        int i4 = this.f30199;
        this.f30192.setBounds(0, 0, i4, i2);
        this.f30193.setBounds(0, 0, this.f30202, this.f30195);
        canvas.translate(0.0f, i - i2);
        this.f30193.draw(canvas);
        canvas.translate(i3 - (i4 / 2), 0.0f);
        this.f30192.draw(canvas);
        canvas.translate(-r2, -r0);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final void m30589(Canvas canvas) {
        int i = this.f30202;
        int i2 = this.f30190;
        int i3 = i - i2;
        int i4 = this.f30197;
        int i5 = this.f30196;
        int i6 = i4 - (i5 / 2);
        this.f30188.setBounds(0, 0, i2, i5);
        this.f30189.setBounds(0, 0, this.f30191, this.f30203);
        if (!m30599()) {
            canvas.translate(i3, 0.0f);
            this.f30189.draw(canvas);
            canvas.translate(0.0f, i6);
            this.f30188.draw(canvas);
            canvas.translate(-i3, -i6);
            return;
        }
        this.f30189.draw(canvas);
        canvas.translate(this.f30190, i6);
        canvas.scale(-1.0f, 1.0f);
        this.f30188.draw(canvas);
        canvas.scale(1.0f, 1.0f);
        canvas.translate(-this.f30190, -i6);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public final int[] m30590() {
        int[] iArr = this.f30210;
        int i = this.f3953;
        iArr[0] = i;
        iArr[1] = this.f30202 - i;
        return iArr;
    }

    @InterfaceC8392
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public Drawable m30591() {
        return this.f30192;
    }

    @InterfaceC8392
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public Drawable m30592() {
        return this.f30193;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public final int[] m30593() {
        int[] iArr = this.f30209;
        int i = this.f3953;
        iArr[0] = i;
        iArr[1] = this.f30203 - i;
        return iArr;
    }

    @InterfaceC8392
    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public Drawable m30594() {
        return this.f30188;
    }

    @InterfaceC8392
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public Drawable m30595() {
        return this.f30189;
    }

    @InterfaceC8392
    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public void m30596(int i) {
        int i2 = this.f30212;
        if (i2 == 1) {
            this.f30211.cancel();
        } else if (i2 != 2) {
            return;
        }
        this.f30212 = 3;
        ValueAnimator valueAnimator = this.f30211;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
        this.f30211.setDuration(i);
        this.f30211.start();
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public final void m30597(float f) {
        int[] iArrM30590 = m30590();
        float fMax = Math.max(iArrM30590[0], Math.min(iArrM30590[1], f));
        if (Math.abs(this.f30200 - fMax) < 2.0f) {
            return;
        }
        int iM30605 = m30605(this.f30201, fMax, iArrM30590, this.f30204.computeHorizontalScrollRange(), this.f30204.computeHorizontalScrollOffset(), this.f30202);
        if (iM30605 != 0) {
            this.f30204.scrollBy(iM30605, 0);
        }
        this.f30201 = fMax;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public boolean m30598() {
        return this.f30207 == 2;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final boolean m30599() {
        return C8273.m27356(this.f30204) == 1;
    }

    @InterfaceC8392
    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public boolean m30600(float f, float f2) {
        if (f2 >= this.f30203 - this.f30194) {
            int i = this.f30200;
            int i2 = this.f30199;
            if (f >= i - (i2 / 2) && f <= i + (i2 / 2)) {
                return true;
            }
        }
        return false;
    }

    @InterfaceC8392
    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public boolean m30601(float f, float f2) {
        if (!m30599() ? f >= this.f30202 - this.f30190 : f <= this.f30190 / 2) {
            int i = this.f30197;
            int i2 = this.f30196;
            if (f2 >= i - (i2 / 2) && f2 <= i + (i2 / 2)) {
                return true;
            }
        }
        return false;
    }

    @InterfaceC8392
    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public boolean m30602() {
        return this.f30207 == 1;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public void m30603() {
        this.f30204.invalidate();
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public final void m30604(int i) {
        m30586();
        this.f30204.postDelayed(this.f30213, i);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public final int m30605(float f, float f2, int[] iArr, int i, int i2, int i3) {
        int i4 = iArr[1] - iArr[0];
        if (i4 == 0) {
            return 0;
        }
        int i5 = i - i3;
        int i6 = (int) (((f2 - f) / i4) * i5);
        int i7 = i2 + i6;
        if (i7 >= i5 || i7 < 0) {
            return 0;
        }
        return i6;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public void m30606(int i) {
        if (i == 2 && this.f30207 != 2) {
            this.f30188.setState(f30186);
            m30586();
        }
        if (i == 0) {
            m30603();
        } else {
            m30608();
        }
        if (this.f30207 == 2 && i != 2) {
            this.f30188.setState(f30187);
            m30604(f30183);
        } else if (i == 1) {
            m30604(f30182);
        }
        this.f30207 = i;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public final void m30607() {
        this.f30204.addItemDecoration(this);
        this.f30204.addOnItemTouchListener(this);
        this.f30204.addOnScrollListener(this.f30214);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public void m30608() {
        int i = this.f30212;
        if (i != 0) {
            if (i != 3) {
                return;
            } else {
                this.f30211.cancel();
            }
        }
        this.f30212 = 1;
        ValueAnimator valueAnimator = this.f30211;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        this.f30211.setDuration(500L);
        this.f30211.setStartDelay(0L);
        this.f30211.start();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public void m30609(int i, int i2) {
        int iComputeVerticalScrollRange = this.f30204.computeVerticalScrollRange();
        int i3 = this.f30203;
        this.f30205 = iComputeVerticalScrollRange - i3 > 0 && i3 >= this.f3952;
        int iComputeHorizontalScrollRange = this.f30204.computeHorizontalScrollRange();
        int i4 = this.f30202;
        boolean z = iComputeHorizontalScrollRange - i4 > 0 && i4 >= this.f3952;
        this.f30206 = z;
        boolean z2 = this.f30205;
        if (!z2 && !z) {
            if (this.f30207 != 0) {
                m30606(0);
                return;
            }
            return;
        }
        if (z2) {
            float f = i3;
            this.f30197 = (int) ((f * (i2 + (f / 2.0f))) / iComputeVerticalScrollRange);
            this.f30196 = Math.min(i3, (i3 * i3) / iComputeVerticalScrollRange);
        }
        if (this.f30206) {
            float f2 = i4;
            this.f30200 = (int) ((f2 * (i + (f2 / 2.0f))) / iComputeHorizontalScrollRange);
            this.f30199 = Math.min(i4, (i4 * i4) / iComputeHorizontalScrollRange);
        }
        int i5 = this.f30207;
        if (i5 == 0 || i5 == 1) {
            m30606(1);
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public final void m30610(float f) {
        int[] iArrM30593 = m30593();
        float fMax = Math.max(iArrM30593[0], Math.min(iArrM30593[1], f));
        if (Math.abs(this.f30197 - fMax) < 2.0f) {
            return;
        }
        int iM30605 = m30605(this.f30198, fMax, iArrM30593, this.f30204.computeVerticalScrollRange(), this.f30204.computeVerticalScrollOffset(), this.f30203);
        if (iM30605 != 0) {
            this.f30204.scrollBy(0, iM30605);
        }
        this.f30198 = fMax;
    }
}
