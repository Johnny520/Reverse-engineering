package p185;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.OverScroller;
import androidx.appcompat.app.RunnableC0909;
import androidx.core.view.AbstractC3103;
import bsh.C3466;
import com.bumptech.glide.AbstractC3887;
import com.google.protobuf.DescriptorProtos$Edition;
import java.util.Arrays;
import java.util.WeakHashMap;
import p166.InterpolatorC8410;
import p352.C9620;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8546 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static final InterpolatorC8410 f21275 = new InterpolatorC8410(1);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public float[] f21276;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public float[] f21277;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public float[] f21278;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f21280;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public int f21281;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final ViewGroup f21282;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public boolean f21283;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public InterpolatorC8410 f21284;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final float f21286;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final float f21287;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final AbstractC3887 f21288;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public View f21289;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final int f21290;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final OverScroller f21291;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public int[] f21292;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public float[] f21293;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public int f21294;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public VelocityTracker f21295;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public int[] f21296;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public int[] f21297;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int f21279 = -1;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final RunnableC0909 f21285 = new RunnableC0909(this, 19);

    public C8546(Context context, ViewGroup viewGroup, AbstractC3887 abstractC3887) {
        if (abstractC3887 == null) {
            C3466.m5903("Callback may not be null");
            throw null;
        }
        this.f21282 = viewGroup;
        this.f21288 = abstractC3887;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f21290 = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f21280 = viewConfiguration.getScaledTouchSlop();
        this.f21287 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f21286 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f21284 = f21275;
        this.f21291 = new OverScroller(context, new InterpolatorC8547(this));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final boolean m13577(boolean z) {
        if (this.f21281 == 2) {
            OverScroller overScroller = this.f21291;
            boolean zComputeScrollOffset = overScroller.computeScrollOffset();
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int left = currX - this.f21289.getLeft();
            int top2 = currY - this.f21289.getTop();
            if (left != 0) {
                View view = this.f21289;
                WeakHashMap weakHashMap = AbstractC3103.f6939;
                view.offsetLeftAndRight(left);
            }
            if (top2 != 0) {
                View view2 = this.f21289;
                WeakHashMap weakHashMap2 = AbstractC3103.f6939;
                view2.offsetTopAndBottom(top2);
            }
            if (left != 0 || top2 != 0) {
                this.f21288.mo7229(this.f21289, currX, currY, left, top2);
            }
            if (zComputeScrollOffset && currX == overScroller.getFinalX() && currY == overScroller.getFinalY()) {
                overScroller.abortAnimation();
                zComputeScrollOffset = false;
            }
            if (!zComputeScrollOffset) {
                if (z) {
                    this.f21282.post(this.f21285);
                } else {
                    m13584(0);
                }
            }
        }
        return this.f21281 == 2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final int m13578(int i, int i2, int i3) {
        if (i == 0) {
            return 0;
        }
        float width = this.f21282.getWidth() / 2;
        float fSin = (((float) Math.sin((Math.min(1.0f, Math.abs(i) / r3) - 0.5f) * 0.47123894f)) * width) + width;
        int iAbs = Math.abs(i2);
        return Math.min(iAbs > 0 ? Math.round(Math.abs(fSin / iAbs) * 1000.0f) * 4 : (int) (((Math.abs(i) / i3) + 1.0f) * 256.0f), 600);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m13579(int i) {
        float[] fArr = this.f21278;
        if (fArr != null) {
            int i2 = this.f21294;
            int i3 = 1 << i;
            if ((i2 & i3) != 0) {
                fArr[i] = 0.0f;
                this.f21277[i] = 0.0f;
                this.f21276[i] = 0.0f;
                this.f21293[i] = 0.0f;
                this.f21292[i] = 0;
                this.f21296[i] = 0;
                this.f21297[i] = 0;
                this.f21294 = (~i3) & i2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0040 A[RETURN] */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m13580(View view, float f, float f2) {
        if (view != null) {
            AbstractC3887 abstractC3887 = this.f21288;
            boolean z = abstractC3887.mo7232(view) > 0;
            boolean z2 = abstractC3887.mo7233() > 0;
            int i = this.f21280;
            if (z && z2) {
                if ((f2 * f2) + (f * f) > i * i) {
                }
            } else if (!z ? !(!z2 || Math.abs(f2) <= i) : Math.abs(f) > i) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m13581(View view, int i) {
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = this.f21282;
        if (parent != viewGroup) {
            C9620.m15031(viewGroup, "captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (", ")");
            return;
        }
        this.f21289 = view;
        this.f21279 = i;
        this.f21288.mo7227(view, i);
        m13584(1);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m13582() {
        this.f21279 = -1;
        float[] fArr = this.f21278;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f21277, 0.0f);
            Arrays.fill(this.f21276, 0.0f);
            Arrays.fill(this.f21293, 0.0f);
            Arrays.fill(this.f21292, 0);
            Arrays.fill(this.f21296, 0);
            Arrays.fill(this.f21297, 0);
            this.f21294 = 0;
        }
        VelocityTracker velocityTracker = this.f21295;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f21295 = null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final boolean m13583(int i, int i2) {
        if (this.f21283) {
            return m13588(i, i2, (int) this.f21295.getXVelocity(this.f21279), (int) this.f21295.getYVelocity(this.f21279));
        }
        C6755.m11870("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final void m13584(int i) {
        this.f21282.removeCallbacks(this.f21285);
        if (this.f21281 != i) {
            this.f21281 = i;
            this.f21288.mo7226(i);
            if (this.f21281 == 0) {
                this.f21289 = null;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final boolean m13585(View view, int i) {
        if (view == this.f21289 && this.f21279 == i) {
            return true;
        }
        if (view == null || !this.f21288.mo7225(view, i)) {
            return false;
        }
        this.f21279 = i;
        m13581(view, i);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x010c  */
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m13586(MotionEvent motionEvent) {
        View viewM13589;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            m13582();
        }
        if (this.f21295 == null) {
            this.f21295 = VelocityTracker.obtain();
        }
        this.f21295.addMovement(motionEvent);
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            m13590(x, y, pointerId);
            View viewM135892 = m13589((int) x, (int) y);
            if (viewM135892 == this.f21289 && this.f21281 == 2) {
                m13585(viewM135892, pointerId);
            }
            int i = this.f21292[pointerId];
        } else if (actionMasked == 1) {
            m13582();
        } else if (actionMasked != 2) {
            if (actionMasked != 3) {
                if (actionMasked == 5) {
                    int pointerId2 = motionEvent.getPointerId(actionIndex);
                    float x2 = motionEvent.getX(actionIndex);
                    float y2 = motionEvent.getY(actionIndex);
                    m13590(x2, y2, pointerId2);
                    int i2 = this.f21281;
                    if (i2 == 0) {
                        int i3 = this.f21292[pointerId2];
                    } else if (i2 == 2 && (viewM13589 = m13589((int) x2, (int) y2)) == this.f21289) {
                        m13585(viewM13589, pointerId2);
                    }
                } else if (actionMasked == 6) {
                    m13579(motionEvent.getPointerId(actionIndex));
                }
            }
        } else if (this.f21278 != null && this.f21277 != null) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i4 = 0; i4 < pointerCount; i4++) {
                int pointerId3 = motionEvent.getPointerId(i4);
                if ((this.f21294 & (1 << pointerId3)) != 0) {
                    float x3 = motionEvent.getX(i4);
                    float y3 = motionEvent.getY(i4);
                    float f = x3 - this.f21278[pointerId3];
                    float f2 = y3 - this.f21277[pointerId3];
                    View viewM135893 = m13589((int) x3, (int) y3);
                    boolean zM13580 = m13580(viewM135893, f, f2);
                    if (zM13580) {
                        int left = viewM135893.getLeft();
                        AbstractC3887 abstractC3887 = this.f21288;
                        int iMo7231 = abstractC3887.mo7231(viewM135893, ((int) f) + left);
                        int top2 = viewM135893.getTop();
                        int i5 = (int) f2;
                        int iMo7230 = abstractC3887.mo7230(viewM135893, top2 + i5, i5);
                        int iMo7232 = abstractC3887.mo7232(viewM135893);
                        int iMo7233 = abstractC3887.mo7233();
                        if ((iMo7232 == 0 || (iMo7232 > 0 && iMo7231 == left)) && (iMo7233 == 0 || (iMo7233 > 0 && iMo7230 == top2))) {
                            break;
                        }
                        Math.abs(f);
                        Math.abs(f2);
                        int i6 = this.f21292[pointerId3];
                        Math.abs(f2);
                        Math.abs(f);
                        int i7 = this.f21292[pointerId3];
                        Math.abs(f);
                        Math.abs(f2);
                        int i8 = this.f21292[pointerId3];
                        Math.abs(f2);
                        Math.abs(f);
                        int i9 = this.f21292[pointerId3];
                        if (this.f21281 == 1 || (zM13580 && m13585(viewM135893, pointerId3))) {
                            break;
                        }
                    }
                }
            }
            m13591(motionEvent);
        }
        return this.f21281 == 1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final boolean m13587(View view, int i, int i2) {
        this.f21289 = view;
        this.f21279 = -1;
        boolean zM13588 = m13588(i, i2, 0, 0);
        if (!zM13588 && this.f21281 == 0 && this.f21289 != null) {
            this.f21289 = null;
        }
        return zM13588;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final boolean m13588(int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        float f4;
        int left = this.f21289.getLeft();
        int top2 = this.f21289.getTop();
        int i5 = i - left;
        int i6 = i2 - top2;
        OverScroller overScroller = this.f21291;
        if (i5 == 0 && i6 == 0) {
            overScroller.abortAnimation();
            m13584(0);
            return false;
        }
        View view = this.f21289;
        int i7 = (int) this.f21286;
        int i8 = (int) this.f21287;
        int iAbs = Math.abs(i3);
        if (iAbs < i7) {
            i3 = 0;
        } else if (iAbs > i8) {
            i3 = i3 > 0 ? i8 : -i8;
        }
        int iAbs2 = Math.abs(i4);
        if (iAbs2 < i7) {
            i4 = 0;
        } else if (iAbs2 > i8) {
            i4 = i4 > 0 ? i8 : -i8;
        }
        int iAbs3 = Math.abs(i5);
        int iAbs4 = Math.abs(i6);
        int iAbs5 = Math.abs(i3);
        int iAbs6 = Math.abs(i4);
        int i9 = iAbs5 + iAbs6;
        int i10 = iAbs3 + iAbs4;
        if (i3 != 0) {
            f = iAbs5;
            f2 = i9;
        } else {
            f = iAbs3;
            f2 = i10;
        }
        float f5 = f / f2;
        if (i4 != 0) {
            f3 = iAbs6;
            f4 = i9;
        } else {
            f3 = iAbs4;
            f4 = i10;
        }
        float f6 = f3 / f4;
        AbstractC3887 abstractC3887 = this.f21288;
        this.f21284 = f21275;
        overScroller.startScroll(left, top2, i5, i6, (int) ((m13578(i6, i4, abstractC3887.mo7233()) * f6) + (m13578(i5, i3, abstractC3887.mo7232(view)) * f5)));
        m13584(2);
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final View m13589(int i, int i2) {
        ViewGroup viewGroup = this.f21282;
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            this.f21288.getClass();
            View childAt = viewGroup.getChildAt(childCount);
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void m13590(float f, float f2, int i) {
        float[] fArr = this.f21278;
        if (fArr == null || fArr.length <= i) {
            int i2 = i + 1;
            float[] fArr2 = new float[i2];
            float[] fArr3 = new float[i2];
            float[] fArr4 = new float[i2];
            float[] fArr5 = new float[i2];
            int[] iArr = new int[i2];
            int[] iArr2 = new int[i2];
            int[] iArr3 = new int[i2];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f21277;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f21276;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f21293;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f21292;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f21296;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f21297;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f21278 = fArr2;
            this.f21277 = fArr3;
            this.f21276 = fArr4;
            this.f21293 = fArr5;
            this.f21292 = iArr;
            this.f21296 = iArr2;
            this.f21297 = iArr3;
        }
        float[] fArr9 = this.f21278;
        this.f21276[i] = f;
        fArr9[i] = f;
        float[] fArr10 = this.f21277;
        this.f21293[i] = f2;
        fArr10[i] = f2;
        int[] iArr7 = this.f21292;
        int i3 = (int) f;
        int i4 = (int) f2;
        ViewGroup viewGroup = this.f21282;
        int left = viewGroup.getLeft();
        int i5 = this.f21290;
        int i6 = i3 < left + i5 ? 1 : 0;
        if (i4 < viewGroup.getTop() + i5) {
            i6 |= 4;
        }
        if (i3 > viewGroup.getRight() - i5) {
            i6 |= 2;
        }
        if (i4 > viewGroup.getBottom() - i5) {
            i6 |= 8;
        }
        iArr7[i] = i6;
        this.f21294 |= 1 << i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void m13591(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if ((this.f21294 & (1 << pointerId)) != 0) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.f21276[pointerId] = x;
                this.f21293[pointerId] = y;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void m13592(MotionEvent motionEvent) {
        int iFindPointerIndex;
        int i;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            m13582();
        }
        if (this.f21295 == null) {
            this.f21295 = VelocityTracker.obtain();
        }
        this.f21295.addMovement(motionEvent);
        int i2 = 0;
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View viewM13589 = m13589((int) x, (int) y);
            m13590(x, y, pointerId);
            m13585(viewM13589, pointerId);
            int i3 = this.f21292[pointerId];
            return;
        }
        if (actionMasked == 1) {
            if (this.f21281 == 1) {
                m13593();
            }
            m13582();
            return;
        }
        AbstractC3887 abstractC3887 = this.f21288;
        if (actionMasked != 2) {
            if (actionMasked == 3) {
                if (this.f21281 == 1) {
                    this.f21283 = true;
                    abstractC3887.mo7228(this.f21289, 0.0f, 0.0f);
                    this.f21283 = false;
                    if (this.f21281 == 1) {
                        m13584(0);
                    }
                }
                m13582();
                return;
            }
            if (actionMasked == 5) {
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                float x2 = motionEvent.getX(actionIndex);
                float y2 = motionEvent.getY(actionIndex);
                m13590(x2, y2, pointerId2);
                if (this.f21281 == 0) {
                    m13585(m13589((int) x2, (int) y2), pointerId2);
                    int i4 = this.f21292[pointerId2];
                    return;
                }
                int i5 = (int) x2;
                int i6 = (int) y2;
                View view = this.f21289;
                if (view != null && i5 >= view.getLeft() && i5 < view.getRight() && i6 >= view.getTop() && i6 < view.getBottom()) {
                    m13585(this.f21289, pointerId2);
                    return;
                }
                return;
            }
            if (actionMasked != 6) {
                return;
            }
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            if (this.f21281 == 1 && pointerId3 == this.f21279) {
                int pointerCount = motionEvent.getPointerCount();
                while (true) {
                    if (i2 >= pointerCount) {
                        i = -1;
                        break;
                    }
                    int pointerId4 = motionEvent.getPointerId(i2);
                    if (pointerId4 != this.f21279) {
                        View viewM135892 = m13589((int) motionEvent.getX(i2), (int) motionEvent.getY(i2));
                        View view2 = this.f21289;
                        if (viewM135892 == view2 && m13585(view2, pointerId4)) {
                            i = this.f21279;
                            break;
                        }
                    }
                    i2++;
                }
                if (i == -1) {
                    m13593();
                }
            }
            m13579(pointerId3);
            return;
        }
        if (this.f21281 == 1) {
            int i7 = this.f21279;
            if ((this.f21294 & (1 << i7)) == 0 || (iFindPointerIndex = motionEvent.findPointerIndex(i7)) == -1) {
                return;
            }
            float x3 = motionEvent.getX(iFindPointerIndex);
            float y3 = motionEvent.getY(iFindPointerIndex);
            float[] fArr = this.f21276;
            int i8 = this.f21279;
            int i9 = (int) (x3 - fArr[i8]);
            int i10 = (int) (y3 - this.f21293[i8]);
            int left = this.f21289.getLeft() + i9;
            int top2 = this.f21289.getTop() + i10;
            int left2 = this.f21289.getLeft();
            int top3 = this.f21289.getTop();
            if (i9 != 0) {
                left = abstractC3887.mo7231(this.f21289, left);
                WeakHashMap weakHashMap = AbstractC3103.f6939;
                this.f21289.offsetLeftAndRight(left - left2);
            }
            int i11 = left;
            if (i10 != 0) {
                top2 = abstractC3887.mo7230(this.f21289, top2, i10);
                WeakHashMap weakHashMap2 = AbstractC3103.f6939;
                this.f21289.offsetTopAndBottom(top2 - top3);
            }
            int i12 = top2;
            if (i9 != 0 || i10 != 0) {
                this.f21288.mo7229(this.f21289, i11, i12, i11 - left2, i12 - top3);
            }
        } else {
            int pointerCount2 = motionEvent.getPointerCount();
            while (i2 < pointerCount2) {
                int pointerId5 = motionEvent.getPointerId(i2);
                if ((this.f21294 & (1 << pointerId5)) != 0) {
                    float x4 = motionEvent.getX(i2);
                    float y4 = motionEvent.getY(i2);
                    float f = x4 - this.f21278[pointerId5];
                    float f2 = y4 - this.f21277[pointerId5];
                    Math.abs(f);
                    Math.abs(f2);
                    int i13 = this.f21292[pointerId5];
                    Math.abs(f2);
                    Math.abs(f);
                    int i14 = this.f21292[pointerId5];
                    Math.abs(f);
                    Math.abs(f2);
                    int i15 = this.f21292[pointerId5];
                    Math.abs(f2);
                    Math.abs(f);
                    int i16 = this.f21292[pointerId5];
                    if (this.f21281 != 1) {
                        View viewM135893 = m13589((int) x4, (int) y4);
                        if (m13580(viewM135893, f, f2) && m13585(viewM135893, pointerId5)) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                i2++;
            }
        }
        m13591(motionEvent);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void m13593() {
        VelocityTracker velocityTracker = this.f21295;
        float f = this.f21287;
        velocityTracker.computeCurrentVelocity(DescriptorProtos$Edition.EDITION_2023_VALUE, f);
        float xVelocity = this.f21295.getXVelocity(this.f21279);
        float fAbs = Math.abs(xVelocity);
        float f2 = this.f21286;
        if (fAbs < f2) {
            xVelocity = 0.0f;
        } else if (fAbs > f) {
            xVelocity = xVelocity > 0.0f ? f : -f;
        }
        float yVelocity = this.f21295.getYVelocity(this.f21279);
        float fAbs2 = Math.abs(yVelocity);
        if (fAbs2 < f2) {
            f = 0.0f;
        } else if (fAbs2 <= f) {
            f = yVelocity;
        } else if (yVelocity <= 0.0f) {
            f = -f;
        }
        this.f21283 = true;
        this.f21288.mo7228(this.f21289, xVelocity, f);
        this.f21283 = false;
        if (this.f21281 == 1) {
            m13584(0);
        }
    }
}
