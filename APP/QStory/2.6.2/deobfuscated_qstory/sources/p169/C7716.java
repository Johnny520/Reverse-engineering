package p169;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.OverScroller;
import androidx.appcompat.app.RunnableC0062;
import androidx.core.view.AbstractC2270;
import bsh.C2632;
import com.alibaba.fastjson2.AbstractC2904;
import com.google.protobuf.DescriptorProtos$Edition;
import java.util.Arrays;
import java.util.WeakHashMap;
import p150.InterpolatorC7580;
import p330.C8796;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7716 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static final InterpolatorC7580 f20935 = new InterpolatorC7580(1);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public float[] f20936;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public float[] f20937;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public float[] f20938;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f20940;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public int f20941;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final ViewGroup f20942;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public boolean f20943;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public InterpolatorC7580 f20944;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final float f20946;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final float f20947;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final AbstractC2904 f20948;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public View f20949;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final int f20950;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final OverScroller f20951;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public int[] f20952;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public float[] f20953;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public int f20954;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public VelocityTracker f20955;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public int[] f20956;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public int[] f20957;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int f20939 = -1;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final RunnableC0062 f20945 = new RunnableC0062(this, 19);

    public C7716(Context context, ViewGroup viewGroup, AbstractC2904 abstractC2904) {
        if (abstractC2904 == null) {
            C2632.m5298("Callback may not be null");
            throw null;
        }
        this.f20942 = viewGroup;
        this.f20948 = abstractC2904;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f20950 = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f20940 = viewConfiguration.getScaledTouchSlop();
        this.f20947 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f20946 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f20944 = f20935;
        this.f20951 = new OverScroller(context, new InterpolatorC7717(this));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final boolean m12988(boolean z) {
        if (this.f20941 == 2) {
            OverScroller overScroller = this.f20951;
            boolean zComputeScrollOffset = overScroller.computeScrollOffset();
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int left = currX - this.f20949.getLeft();
            int top2 = currY - this.f20949.getTop();
            if (left != 0) {
                View view = this.f20949;
                WeakHashMap weakHashMap = AbstractC2270.f6593;
                view.offsetLeftAndRight(left);
            }
            if (top2 != 0) {
                View view2 = this.f20949;
                WeakHashMap weakHashMap2 = AbstractC2270.f6593;
                view2.offsetTopAndBottom(top2);
            }
            if (left != 0 || top2 != 0) {
                this.f20948.mo6274(this.f20949, currX, currY, left, top2);
            }
            if (zComputeScrollOffset && currX == overScroller.getFinalX() && currY == overScroller.getFinalY()) {
                overScroller.abortAnimation();
                zComputeScrollOffset = false;
            }
            if (!zComputeScrollOffset) {
                if (z) {
                    this.f20942.post(this.f20945);
                } else {
                    m12995(0);
                }
            }
        }
        return this.f20941 == 2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final int m12989(int i, int i2, int i3) {
        if (i == 0) {
            return 0;
        }
        float width = this.f20942.getWidth() / 2;
        float fSin = (((float) Math.sin((Math.min(1.0f, Math.abs(i) / r3) - 0.5f) * 0.47123894f)) * width) + width;
        int iAbs = Math.abs(i2);
        return Math.min(iAbs > 0 ? Math.round(Math.abs(fSin / iAbs) * 1000.0f) * 4 : (int) (((Math.abs(i) / i3) + 1.0f) * 256.0f), 600);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m12990(int i) {
        float[] fArr = this.f20938;
        if (fArr != null) {
            int i2 = this.f20954;
            int i3 = 1 << i;
            if ((i2 & i3) != 0) {
                fArr[i] = 0.0f;
                this.f20937[i] = 0.0f;
                this.f20936[i] = 0.0f;
                this.f20953[i] = 0.0f;
                this.f20952[i] = 0;
                this.f20956[i] = 0;
                this.f20957[i] = 0;
                this.f20954 = (~i3) & i2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0040 A[RETURN] */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m12991(android.view.View r4, float r5, float r6) {
        /*
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L4
            goto L41
        L4:
            com.alibaba.fastjson2.飘花落叶言子哲苏世兰楪 r1 = r3.f20948
            int r4 = r1.mo6278(r4)
            r2 = 1
            if (r4 <= 0) goto Lf
            r4 = r2
            goto L10
        Lf:
            r4 = r0
        L10:
            int r1 = r1.mo6277()
            if (r1 <= 0) goto L18
            r1 = r2
            goto L19
        L18:
            r1 = r0
        L19:
            int r3 = r3.f20940
            if (r4 == 0) goto L29
            if (r1 == 0) goto L29
            float r5 = r5 * r5
            float r6 = r6 * r6
            float r6 = r6 + r5
            int r3 = r3 * r3
            float r3 = (float) r3
            int r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r3 <= 0) goto L41
            goto L40
        L29:
            if (r4 == 0) goto L35
            float r4 = java.lang.Math.abs(r5)
            float r3 = (float) r3
            int r3 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r3 <= 0) goto L41
            goto L40
        L35:
            if (r1 == 0) goto L41
            float r4 = java.lang.Math.abs(r6)
            float r3 = (float) r3
            int r3 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r3 <= 0) goto L41
        L40:
            return r2
        L41:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p169.C7716.m12991(android.view.View, float, float):boolean");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m12992(View view, int i) {
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = this.f20942;
        if (parent != viewGroup) {
            C8796.m14448(viewGroup, "captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (", ")");
            return;
        }
        this.f20949 = view;
        this.f20939 = i;
        this.f20948.mo6279(view, i);
        m12995(1);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m12993() {
        this.f20939 = -1;
        float[] fArr = this.f20938;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f20937, 0.0f);
            Arrays.fill(this.f20936, 0.0f);
            Arrays.fill(this.f20953, 0.0f);
            Arrays.fill(this.f20952, 0);
            Arrays.fill(this.f20956, 0);
            Arrays.fill(this.f20957, 0);
            this.f20954 = 0;
        }
        VelocityTracker velocityTracker = this.f20955;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f20955 = null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final boolean m12994(int i, int i2) {
        if (this.f20943) {
            return m12999(i, i2, (int) this.f20955.getXVelocity(this.f20939), (int) this.f20955.getYVelocity(this.f20939));
        }
        C5919.m11250("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final void m12995(int i) {
        this.f20942.removeCallbacks(this.f20945);
        if (this.f20941 != i) {
            this.f20941 = i;
            this.f20948.mo6275(i);
            if (this.f20941 == 0) {
                this.f20949 = null;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final boolean m12996(View view, int i) {
        if (view == this.f20949 && this.f20939 == i) {
            return true;
        }
        if (view == null || !this.f20948.mo6272(view, i)) {
            return false;
        }
        this.f20939 = i;
        m12992(view, i);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x010c  */
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m12997(android.view.MotionEvent r18) {
        /*
            Method dump skipped, instruction units count: 317
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p169.C7716.m12997(android.view.MotionEvent):boolean");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final boolean m12998(View view, int i, int i2) {
        this.f20949 = view;
        this.f20939 = -1;
        boolean zM12999 = m12999(i, i2, 0, 0);
        if (!zM12999 && this.f20941 == 0 && this.f20949 != null) {
            this.f20949 = null;
        }
        return zM12999;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final boolean m12999(int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        float f4;
        int left = this.f20949.getLeft();
        int top2 = this.f20949.getTop();
        int i5 = i - left;
        int i6 = i2 - top2;
        OverScroller overScroller = this.f20951;
        if (i5 == 0 && i6 == 0) {
            overScroller.abortAnimation();
            m12995(0);
            return false;
        }
        View view = this.f20949;
        int i7 = (int) this.f20946;
        int i8 = (int) this.f20947;
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
        AbstractC2904 abstractC2904 = this.f20948;
        this.f20944 = f20935;
        overScroller.startScroll(left, top2, i5, i6, (int) ((m12989(i6, i4, abstractC2904.mo6277()) * f6) + (m12989(i5, i3, abstractC2904.mo6278(view)) * f5)));
        m12995(2);
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final View m13000(int i, int i2) {
        ViewGroup viewGroup = this.f20942;
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            this.f20948.getClass();
            View childAt = viewGroup.getChildAt(childCount);
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void m13001(float f, float f2, int i) {
        float[] fArr = this.f20938;
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
                float[] fArr6 = this.f20937;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f20936;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f20953;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f20952;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f20956;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f20957;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f20938 = fArr2;
            this.f20937 = fArr3;
            this.f20936 = fArr4;
            this.f20953 = fArr5;
            this.f20952 = iArr;
            this.f20956 = iArr2;
            this.f20957 = iArr3;
        }
        float[] fArr9 = this.f20938;
        this.f20936[i] = f;
        fArr9[i] = f;
        float[] fArr10 = this.f20937;
        this.f20953[i] = f2;
        fArr10[i] = f2;
        int[] iArr7 = this.f20952;
        int i3 = (int) f;
        int i4 = (int) f2;
        ViewGroup viewGroup = this.f20942;
        int left = viewGroup.getLeft();
        int i5 = this.f20950;
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
        this.f20954 |= 1 << i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void m13002(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if ((this.f20954 & (1 << pointerId)) != 0) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.f20936[pointerId] = x;
                this.f20953[pointerId] = y;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void m13003(MotionEvent motionEvent) {
        int iFindPointerIndex;
        int i;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            m12993();
        }
        if (this.f20955 == null) {
            this.f20955 = VelocityTracker.obtain();
        }
        this.f20955.addMovement(motionEvent);
        int i2 = 0;
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View viewM13000 = m13000((int) x, (int) y);
            m13001(x, y, pointerId);
            m12996(viewM13000, pointerId);
            int i3 = this.f20952[pointerId];
            return;
        }
        if (actionMasked == 1) {
            if (this.f20941 == 1) {
                m13004();
            }
            m12993();
            return;
        }
        AbstractC2904 abstractC2904 = this.f20948;
        if (actionMasked != 2) {
            if (actionMasked == 3) {
                if (this.f20941 == 1) {
                    this.f20943 = true;
                    abstractC2904.mo6276(this.f20949, 0.0f, 0.0f);
                    this.f20943 = false;
                    if (this.f20941 == 1) {
                        m12995(0);
                    }
                }
                m12993();
                return;
            }
            if (actionMasked == 5) {
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                float x2 = motionEvent.getX(actionIndex);
                float y2 = motionEvent.getY(actionIndex);
                m13001(x2, y2, pointerId2);
                if (this.f20941 == 0) {
                    m12996(m13000((int) x2, (int) y2), pointerId2);
                    int i4 = this.f20952[pointerId2];
                    return;
                }
                int i5 = (int) x2;
                int i6 = (int) y2;
                View view = this.f20949;
                if (view != null && i5 >= view.getLeft() && i5 < view.getRight() && i6 >= view.getTop() && i6 < view.getBottom()) {
                    m12996(this.f20949, pointerId2);
                    return;
                }
                return;
            }
            if (actionMasked != 6) {
                return;
            }
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            if (this.f20941 == 1 && pointerId3 == this.f20939) {
                int pointerCount = motionEvent.getPointerCount();
                while (true) {
                    if (i2 >= pointerCount) {
                        i = -1;
                        break;
                    }
                    int pointerId4 = motionEvent.getPointerId(i2);
                    if (pointerId4 != this.f20939) {
                        View viewM130002 = m13000((int) motionEvent.getX(i2), (int) motionEvent.getY(i2));
                        View view2 = this.f20949;
                        if (viewM130002 == view2 && m12996(view2, pointerId4)) {
                            i = this.f20939;
                            break;
                        }
                    }
                    i2++;
                }
                if (i == -1) {
                    m13004();
                }
            }
            m12990(pointerId3);
            return;
        }
        if (this.f20941 == 1) {
            int i7 = this.f20939;
            if ((this.f20954 & (1 << i7)) == 0 || (iFindPointerIndex = motionEvent.findPointerIndex(i7)) == -1) {
                return;
            }
            float x3 = motionEvent.getX(iFindPointerIndex);
            float y3 = motionEvent.getY(iFindPointerIndex);
            float[] fArr = this.f20936;
            int i8 = this.f20939;
            int i9 = (int) (x3 - fArr[i8]);
            int i10 = (int) (y3 - this.f20953[i8]);
            int left = this.f20949.getLeft() + i9;
            int top2 = this.f20949.getTop() + i10;
            int left2 = this.f20949.getLeft();
            int top3 = this.f20949.getTop();
            if (i9 != 0) {
                left = abstractC2904.mo6282(this.f20949, left);
                WeakHashMap weakHashMap = AbstractC2270.f6593;
                this.f20949.offsetLeftAndRight(left - left2);
            }
            int i11 = left;
            if (i10 != 0) {
                top2 = abstractC2904.mo6281(this.f20949, top2, i10);
                WeakHashMap weakHashMap2 = AbstractC2270.f6593;
                this.f20949.offsetTopAndBottom(top2 - top3);
            }
            int i12 = top2;
            if (i9 != 0 || i10 != 0) {
                this.f20948.mo6274(this.f20949, i11, i12, i11 - left2, i12 - top3);
            }
        } else {
            int pointerCount2 = motionEvent.getPointerCount();
            while (i2 < pointerCount2) {
                int pointerId5 = motionEvent.getPointerId(i2);
                if ((this.f20954 & (1 << pointerId5)) != 0) {
                    float x4 = motionEvent.getX(i2);
                    float y4 = motionEvent.getY(i2);
                    float f = x4 - this.f20938[pointerId5];
                    float f2 = y4 - this.f20937[pointerId5];
                    Math.abs(f);
                    Math.abs(f2);
                    int i13 = this.f20952[pointerId5];
                    Math.abs(f2);
                    Math.abs(f);
                    int i14 = this.f20952[pointerId5];
                    Math.abs(f);
                    Math.abs(f2);
                    int i15 = this.f20952[pointerId5];
                    Math.abs(f2);
                    Math.abs(f);
                    int i16 = this.f20952[pointerId5];
                    if (this.f20941 != 1) {
                        View viewM130003 = m13000((int) x4, (int) y4);
                        if (m12991(viewM130003, f, f2) && m12996(viewM130003, pointerId5)) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                i2++;
            }
        }
        m13002(motionEvent);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void m13004() {
        VelocityTracker velocityTracker = this.f20955;
        float f = this.f20947;
        velocityTracker.computeCurrentVelocity(DescriptorProtos$Edition.EDITION_2023_VALUE, f);
        float xVelocity = this.f20955.getXVelocity(this.f20939);
        float fAbs = Math.abs(xVelocity);
        float f2 = this.f20946;
        if (fAbs < f2) {
            xVelocity = 0.0f;
        } else if (fAbs > f) {
            xVelocity = xVelocity > 0.0f ? f : -f;
        }
        float yVelocity = this.f20955.getYVelocity(this.f20939);
        float fAbs2 = Math.abs(yVelocity);
        if (fAbs2 < f2) {
            f = 0.0f;
        } else if (fAbs2 <= f) {
            f = yVelocity;
        } else if (yVelocity <= 0.0f) {
            f = -f;
        }
        this.f20943 = true;
        this.f20948.mo6276(this.f20949, xVelocity, f);
        this.f20943 = false;
        if (this.f20941 == 1) {
            m12995(0);
        }
    }
}
