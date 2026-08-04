package yyds;

import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.p000ss.android.ugc.aweme.yyds.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: yyds.ᛸᲁᛲᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1877 extends AbstractC1744 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public float f9441;

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public final AbstractC2450 f9442;

    /* JADX INFO: renamed from: ᛲᛳᛴᛸ, reason: contains not printable characters */
    public Rect f9443;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public float f9444;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public float f9445;

    /* JADX INFO: renamed from: ᛲᛶᛱᲈ, reason: contains not printable characters */
    public GestureDetector f9446;

    /* JADX INFO: renamed from: ᛳᛸᛴᛶ, reason: contains not printable characters */
    public VelocityTracker f9448;

    /* JADX INFO: renamed from: ᛳᲁᲁᲇ, reason: contains not printable characters */
    public int f9449;

    /* JADX INFO: renamed from: ᛵᛶᛲᲀ, reason: contains not printable characters */
    public C1213 f9450;

    /* JADX INFO: renamed from: ᛶᛳᛶᛵ, reason: contains not printable characters */
    public int f9454;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public float f9455;

    /* JADX INFO: renamed from: ᛶᛸᲀᲁ, reason: contains not printable characters */
    public ArrayList f9456;

    /* JADX INFO: renamed from: ᛶᲈᛴᲈ, reason: contains not printable characters */
    public ArrayList f9457;

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public float f9458;

    /* JADX INFO: renamed from: ᛷᛸᲇᛶ, reason: contains not printable characters */
    public long f9460;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public float f9461;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public float f9465;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public float f9466;

    /* JADX INFO: renamed from: ᲈᲀᛲᲀ, reason: contains not printable characters */
    public C0091 f9467;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final ArrayList f9447 = new ArrayList();

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final float[] f9451 = new float[2];

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public AbstractC0185 f9463 = null;

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public int f9459 = -1;

    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public int f9440 = 0;

    /* JADX INFO: renamed from: ᲇᛱᛲ, reason: contains not printable characters */
    public final ArrayList f9464 = new ArrayList();

    /* JADX INFO: renamed from: ᲀᛲᛲᲇ, reason: contains not printable characters */
    public final RunnableC0871 f9462 = new RunnableC0871(10, this);

    /* JADX INFO: renamed from: ᛵᲀᲈᛴ, reason: contains not printable characters */
    public View f9453 = null;

    /* JADX INFO: renamed from: ᛵᲀᛵᛸ, reason: contains not printable characters */
    public final C1755 f9452 = new C1755(this);

    public C1877(AbstractC2450 abstractC2450) {
        this.f9442 = abstractC2450;
    }

    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public static boolean m3660(View view, float f, float f2, float f3, float f4) {
        return f >= f3 && f <= f3 + ((float) view.getWidth()) && f2 >= f4 && f2 <= f4 + ((float) view.getHeight());
    }

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final int m3661(int i) {
        if ((i & 12) == 0) {
            return 0;
        }
        int i2 = this.f9441 > 0.0f ? 8 : 4;
        VelocityTracker velocityTracker = this.f9448;
        if (velocityTracker != null && this.f9459 > -1) {
            velocityTracker.computeCurrentVelocity(1000, this.f9455);
            float xVelocity = this.f9448.getXVelocity(this.f9459);
            float yVelocity = this.f9448.getYVelocity(this.f9459);
            int i3 = xVelocity > 0.0f ? 8 : 4;
            float fAbs = Math.abs(xVelocity);
            if ((i3 & i) != 0 && i2 == i3 && fAbs >= this.f9465 && fAbs > Math.abs(yVelocity)) {
                return i3;
            }
        }
        float width = this.f9450.getWidth() * 0.5f;
        if ((i & i2) == 0 || Math.abs(this.f9441) <= width) {
            return 0;
        }
        return i2;
    }

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public final void m3662(float[] fArr) {
        if ((this.f9449 & 12) != 0) {
            fArr[0] = (this.f9461 + this.f9441) - this.f9463.f1093.getLeft();
        } else {
            fArr[0] = this.f9463.f1093.getTranslationX();
        }
        if ((this.f9449 & 3) != 0) {
            fArr[1] = (this.f9458 + this.f9444) - this.f9463.f1093.getTop();
        } else {
            fArr[1] = this.f9463.f1093.getTranslationY();
        }
    }

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final void m3663(int i, int i2, MotionEvent motionEvent) {
        int iM4491;
        View viewM3668;
        if (this.f9463 != null || i != 2 || this.f9440 == 2 || this.f9450.getScrollState() == 1) {
            return;
        }
        AbstractC2551 layoutManager = this.f9450.getLayoutManager();
        int i3 = this.f9459;
        AbstractC0185 abstractC0185M2419 = null;
        if (i3 != -1) {
            int iFindPointerIndex = motionEvent.findPointerIndex(i3);
            float x = motionEvent.getX(iFindPointerIndex) - this.f9466;
            float y = motionEvent.getY(iFindPointerIndex) - this.f9445;
            float fAbs = Math.abs(x);
            float fAbs2 = Math.abs(y);
            float f = this.f9454;
            if ((fAbs >= f || fAbs2 >= f) && ((fAbs <= fAbs2 || !layoutManager.mo206()) && ((fAbs2 <= fAbs || !layoutManager.mo174()) && (viewM3668 = m3668(motionEvent)) != null))) {
                abstractC0185M2419 = this.f9450.m2419(viewM3668);
            }
        }
        if (abstractC0185M2419 == null || (iM4491 = (AbstractC2450.m4491(196611, this.f9450.getLayoutDirection()) & 65280) >> 8) == 0) {
            return;
        }
        float x2 = motionEvent.getX(i2);
        float y2 = motionEvent.getY(i2);
        float f2 = x2 - this.f9466;
        float f3 = y2 - this.f9445;
        float fAbs3 = Math.abs(f2);
        float fAbs4 = Math.abs(f3);
        float f4 = this.f9454;
        if (fAbs3 >= f4 || fAbs4 >= f4) {
            if (fAbs3 > fAbs4) {
                if (f2 < 0.0f && (iM4491 & 4) == 0) {
                    return;
                }
                if (f2 > 0.0f && (iM4491 & 8) == 0) {
                    return;
                }
            } else {
                if (f3 < 0.0f && (iM4491 & 1) == 0) {
                    return;
                }
                if (f3 > 0.0f && (iM4491 & 2) == 0) {
                    return;
                }
            }
            this.f9444 = 0.0f;
            this.f9441 = 0.0f;
            this.f9459 = motionEvent.getPointerId(0);
            m3670(abstractC0185M2419, 1);
        }
    }

    @Override // yyds.AbstractC1744
    /* JADX INFO: renamed from: ᛲᛴᛳᛲ */
    public final void mo1241(Canvas canvas, C1213 c1213) {
        float f;
        float f2;
        if (this.f9463 != null) {
            float[] fArr = this.f9451;
            m3662(fArr);
            f = fArr[0];
            f2 = fArr[1];
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        AbstractC0185 abstractC0185 = this.f9463;
        ArrayList arrayList = this.f9464;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C1472 c1472 = (C1472) arrayList.get(i);
            AbstractC0185 abstractC01852 = c1472.f6993;
            float f3 = c1472.f6994;
            float f4 = c1472.f7001;
            if (f3 == f4) {
                c1472.f6992 = abstractC01852.f1093.getTranslationX();
            } else {
                c1472.f6992 = ((f4 - f3) * c1472.f6991) + f3;
            }
            float f5 = c1472.f6996;
            float f6 = c1472.f7004;
            if (f5 == f6) {
                c1472.f7000 = abstractC01852.f1093.getTranslationY();
            } else {
                c1472.f7000 = ((f6 - f5) * c1472.f6991) + f5;
            }
            int iSave = canvas.save();
            AbstractC2450.m4490(c1213, c1472.f6993, c1472.f6992, c1472.f7000, false);
            canvas.restoreToCount(iSave);
        }
        if (abstractC0185 != null) {
            int iSave2 = canvas.save();
            AbstractC2450.m4490(c1213, abstractC0185, f, f2, true);
            canvas.restoreToCount(iSave2);
        }
    }

    /* JADX INFO: renamed from: ᛳᲁᲁᲇ, reason: contains not printable characters */
    public final void m3664(AbstractC0185 abstractC0185) {
        int bottom;
        int iAbs;
        int top;
        int iAbs2;
        int left;
        int iAbs3;
        int right;
        int iAbs4;
        int i;
        int i2;
        int i3;
        if (this.f9450.isLayoutRequested()) {
            return;
        }
        char c = 2;
        if (this.f9440 != 2) {
            return;
        }
        int i4 = (int) (this.f9461 + this.f9441);
        int i5 = (int) (this.f9458 + this.f9444);
        View view = abstractC0185.f1093;
        if (Math.abs(i5 - view.getTop()) >= view.getHeight() * 0.5f || Math.abs(i4 - view.getLeft()) >= view.getWidth() * 0.5f) {
            ArrayList arrayList = this.f9457;
            if (arrayList == null) {
                this.f9457 = new ArrayList();
                this.f9456 = new ArrayList();
            } else {
                arrayList.clear();
                this.f9456.clear();
            }
            int iRound = Math.round(this.f9461 + this.f9441);
            int iRound2 = Math.round(this.f9458 + this.f9444);
            int width = view.getWidth() + iRound;
            int height = view.getHeight() + iRound2;
            int i6 = (iRound + width) / 2;
            int i7 = (iRound2 + height) / 2;
            AbstractC2551 layoutManager = this.f9450.getLayoutManager();
            int iM4613 = layoutManager.m4613();
            int i8 = 0;
            while (i8 < iM4613) {
                char c2 = c;
                View viewM4614 = layoutManager.m4614(i8);
                if (viewM4614 != view && viewM4614.getBottom() >= iRound2 && viewM4614.getTop() <= height && viewM4614.getRight() >= iRound && viewM4614.getLeft() <= width) {
                    AbstractC0185 abstractC0185M2419 = this.f9450.m2419(viewM4614);
                    int iAbs5 = Math.abs(i6 - ((viewM4614.getRight() + viewM4614.getLeft()) / 2));
                    int iAbs6 = Math.abs(i7 - ((viewM4614.getBottom() + viewM4614.getTop()) / 2));
                    int i9 = (iAbs6 * iAbs6) + (iAbs5 * iAbs5);
                    i = i4;
                    int size = this.f9457.size();
                    i2 = i5;
                    i3 = iRound;
                    int i10 = 0;
                    int i11 = 0;
                    while (i10 < size) {
                        int i12 = size;
                        if (i9 <= ((Integer) this.f9456.get(i10)).intValue()) {
                            break;
                        }
                        i11++;
                        i10++;
                        size = i12;
                    }
                    this.f9457.add(i11, abstractC0185M2419);
                    this.f9456.add(i11, Integer.valueOf(i9));
                } else {
                    i = i4;
                    i2 = i5;
                    i3 = iRound;
                }
                i8++;
                c = c2;
                i4 = i;
                i5 = i2;
                iRound = i3;
            }
            int i13 = i4;
            int i14 = i5;
            ArrayList arrayList2 = this.f9457;
            if (arrayList2.size() == 0) {
                return;
            }
            int width2 = view.getWidth() + i13;
            int height2 = view.getHeight() + i14;
            int left2 = i13 - view.getLeft();
            int top2 = i14 - view.getTop();
            int size2 = arrayList2.size();
            AbstractC0185 abstractC01852 = null;
            int i15 = -1;
            for (int i16 = 0; i16 < size2; i16++) {
                AbstractC0185 abstractC01853 = (AbstractC0185) arrayList2.get(i16);
                if (left2 > 0 && (right = abstractC01853.f1093.getRight() - width2) < 0 && abstractC01853.f1093.getRight() > view.getRight() && (iAbs4 = Math.abs(right)) > i15) {
                    i15 = iAbs4;
                    abstractC01852 = abstractC01853;
                }
                if (left2 < 0 && (left = abstractC01853.f1093.getLeft() - i13) > 0 && abstractC01853.f1093.getLeft() < view.getLeft() && (iAbs3 = Math.abs(left)) > i15) {
                    i15 = iAbs3;
                    abstractC01852 = abstractC01853;
                }
                if (top2 < 0 && (top = abstractC01853.f1093.getTop() - i14) > 0 && abstractC01853.f1093.getTop() < view.getTop() && (iAbs2 = Math.abs(top)) > i15) {
                    i15 = iAbs2;
                    abstractC01852 = abstractC01853;
                }
                if (top2 > 0 && (bottom = abstractC01853.f1093.getBottom() - height2) < 0 && abstractC01853.f1093.getBottom() > view.getBottom() && (iAbs = Math.abs(bottom)) > i15) {
                    i15 = iAbs;
                    abstractC01852 = abstractC01853;
                }
            }
            if (abstractC01852 == null) {
                this.f9457.clear();
                this.f9456.clear();
                return;
            }
            View view2 = abstractC01852.f1093;
            int iM778 = abstractC01852.m778();
            abstractC0185.m778();
            if (this.f9442.mo1234(this.f9450, abstractC0185, abstractC01852)) {
                C1213 c1213 = this.f9450;
                AbstractC2551 layoutManager2 = c1213.getLayoutManager();
                if (!(layoutManager2 instanceof LinearLayoutManager)) {
                    if (layoutManager2.mo206()) {
                        if (AbstractC2551.m4598(view2) <= c1213.getPaddingLeft()) {
                            c1213.m2464(iM778);
                        }
                        if (AbstractC2551.m4602(view2) >= c1213.getWidth() - c1213.getPaddingRight()) {
                            c1213.m2464(iM778);
                        }
                    }
                    if (layoutManager2.mo174()) {
                        if (AbstractC2551.m4594(view2) <= c1213.getPaddingTop()) {
                            c1213.m2464(iM778);
                        }
                        if (AbstractC2551.m4604(view2) >= c1213.getHeight() - c1213.getPaddingBottom()) {
                            c1213.m2464(iM778);
                            return;
                        }
                        return;
                    }
                    return;
                }
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager2;
                linearLayoutManager.mo196("Cannot drop a view during a scroll or layout calculation");
                linearLayoutManager.m209();
                linearLayoutManager.m184();
                int iM4603 = AbstractC2551.m4603(view);
                int iM46032 = AbstractC2551.m4603(view2);
                byte b = iM4603 < iM46032 ? (byte) 1 : (byte) -1;
                boolean z = linearLayoutManager.f339;
                AbstractC0353 abstractC0353 = linearLayoutManager.f334;
                if (z) {
                    if (b == 1) {
                        linearLayoutManager.m197(iM46032, abstractC0353.mo1039() - (linearLayoutManager.f334.mo1040(view) + linearLayoutManager.f334.mo1046(view2)));
                        return;
                    } else {
                        linearLayoutManager.m197(iM46032, abstractC0353.mo1039() - linearLayoutManager.f334.mo1056(view2));
                        return;
                    }
                }
                if (b == -1) {
                    linearLayoutManager.m197(iM46032, abstractC0353.mo1046(view2));
                } else {
                    linearLayoutManager.m197(iM46032, abstractC0353.mo1056(view2) - linearLayoutManager.f334.mo1040(view));
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᛶᛳᛶᛵ, reason: contains not printable characters */
    public final void m3665(int i, int i2, MotionEvent motionEvent) {
        float x = motionEvent.getX(i2);
        float y = motionEvent.getY(i2);
        float fMax = x - this.f9466;
        this.f9441 = fMax;
        this.f9444 = y - this.f9445;
        if ((i & 4) == 0) {
            fMax = Math.max(0.0f, fMax);
            this.f9441 = fMax;
        }
        if ((i & 8) == 0) {
            this.f9441 = Math.min(0.0f, fMax);
        }
        if ((i & 1) == 0) {
            this.f9444 = Math.max(0.0f, this.f9444);
        }
        if ((i & 2) == 0) {
            this.f9444 = Math.min(0.0f, this.f9444);
        }
    }

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final void m3666(C1213 c1213) {
        C1213 c12132 = this.f9450;
        if (c12132 == c1213) {
            return;
        }
        C1755 c1755 = this.f9452;
        if (c12132 != null) {
            c12132.m2436(this);
            C1213 c12133 = this.f9450;
            c12133.f5572.remove(c1755);
            if (c12133.f5536 == c1755) {
                c12133.f5536 = null;
            }
            ArrayList arrayList = this.f9450.f5571;
            if (arrayList != null) {
                arrayList.remove(this);
            }
            ArrayList arrayList2 = this.f9464;
            int size = arrayList2.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                C1472 c1472 = (C1472) arrayList2.get(0);
                c1472.f6997.cancel();
                this.f9442.mo1232(this.f9450, c1472.f6993);
            }
            arrayList2.clear();
            this.f9453 = null;
            VelocityTracker velocityTracker = this.f9448;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f9448 = null;
            }
            C0091 c0091 = this.f9467;
            if (c0091 != null) {
                c0091.f687 = false;
                this.f9467 = null;
            }
            if (this.f9446 != null) {
                this.f9446 = null;
            }
        }
        this.f9450 = c1213;
        Resources resources = c1213.getResources();
        this.f9465 = resources.getDimension(R.dimen.item_touch_helper_swipe_escape_velocity);
        this.f9455 = resources.getDimension(R.dimen.item_touch_helper_swipe_escape_max_velocity);
        this.f9454 = ViewConfiguration.get(this.f9450.getContext()).getScaledTouchSlop();
        this.f9450.m2421(this);
        this.f9450.f5572.add(c1755);
        C1213 c12134 = this.f9450;
        ArrayList arrayList3 = c12134.f5571;
        if (arrayList3 == null) {
            arrayList3 = new ArrayList();
            c12134.f5571 = arrayList3;
        }
        arrayList3.add(this);
        this.f9467 = new C0091(this);
        this.f9446 = new GestureDetector(this.f9450.getContext(), this.f9467);
    }

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public final void m3667(AbstractC0185 abstractC0185, boolean z) {
        ArrayList arrayList = this.f9464;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C1472 c1472 = (C1472) arrayList.get(size);
            if (c1472.f6993 == abstractC0185) {
                c1472.f6998 |= z;
                if (!c1472.f6999) {
                    c1472.f6997.cancel();
                }
                arrayList.remove(size);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public final View m3668(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        AbstractC0185 abstractC0185 = this.f9463;
        if (abstractC0185 != null) {
            View view = abstractC0185.f1093;
            if (m3660(view, x, y, this.f9461 + this.f9441, this.f9458 + this.f9444)) {
                return view;
            }
        }
        ArrayList arrayList = this.f9464;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C1472 c1472 = (C1472) arrayList.get(size);
            View view2 = c1472.f6993.f1093;
            if (m3660(view2, x, y, c1472.f6992, c1472.f7000)) {
                return view2;
            }
        }
        C1213 c1213 = this.f9450;
        for (int iM4917 = c1213.f5523.m4917() - 1; iM4917 >= 0; iM4917--) {
            View viewM4919 = c1213.f5523.m4919(iM4917);
            float translationX = viewM4919.getTranslationX();
            float translationY = viewM4919.getTranslationY();
            if (x >= viewM4919.getLeft() + translationX && x <= viewM4919.getRight() + translationX && y >= viewM4919.getTop() + translationY && y <= viewM4919.getBottom() + translationY) {
                return viewM4919;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public final int m3669(int i) {
        if ((i & 3) == 0) {
            return 0;
        }
        int i2 = this.f9444 > 0.0f ? 2 : 1;
        VelocityTracker velocityTracker = this.f9448;
        if (velocityTracker != null && this.f9459 > -1) {
            velocityTracker.computeCurrentVelocity(1000, this.f9455);
            float xVelocity = this.f9448.getXVelocity(this.f9459);
            float yVelocity = this.f9448.getYVelocity(this.f9459);
            int i3 = yVelocity > 0.0f ? 2 : 1;
            float fAbs = Math.abs(yVelocity);
            if ((i3 & i) != 0 && i3 == i2 && fAbs >= this.f9465 && fAbs > Math.abs(xVelocity)) {
                return i3;
            }
        }
        float height = this.f9450.getHeight() * 0.5f;
        if ((i & i2) == 0 || Math.abs(this.f9444) <= height) {
            return 0;
        }
        return i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0121  */
    /* JADX WARN: Type inference failed for: r0v6, types: [android.view.ViewParent] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r2v1, types: [yyds.ᛱᛸᛳᛵ] */
    /* JADX WARN: Type inference failed for: r4v1, types: [yyds.ᲇᛵᛷᛶ] */
    /* JADX WARN: Type inference failed for: r4v2, types: [yyds.ᲇᛵᛷᛶ] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: ᲇᛱᛲ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m3670(AbstractC0185 abstractC0185, int i) {
        ?? r12;
        boolean z;
        ?? r4;
        ?? r122;
        AbstractC0185 abstractC01852;
        ?? r42;
        int iM4491;
        int iM4492;
        VelocityTracker velocityTracker;
        char c;
        float fSignum;
        char c2;
        if (abstractC0185 == this.f9463 && i == this.f9440) {
            return;
        }
        this.f9460 = Long.MIN_VALUE;
        int i2 = this.f9440;
        m3667(abstractC0185, true);
        this.f9440 = i;
        if (i == 2) {
            if (abstractC0185 == null) {
                C0188.m798("Must pass a ViewHolder when dragging");
                return;
            }
            this.f9453 = abstractC0185.f1093;
        }
        int i3 = (1 << ((i * 8) + 8)) - 1;
        ?? r2 = this.f9463;
        AbstractC2450 abstractC2450 = this.f9442;
        if (r2 != 0) {
            View view = r2.f1093;
            if (view.getParent() == null) {
                r122 = 0;
                if (view == this.f9453) {
                    abstractC01852 = null;
                    this.f9453 = null;
                } else {
                    abstractC01852 = null;
                }
                ?? r43 = abstractC2450;
                r43.mo1232(this.f9450, r2);
                z = false;
                r42 = r43;
            } else if (i2 != 2 && this.f9440 != 2 && (iM4491 = (AbstractC2450.m4491(196611, this.f9450.getLayoutDirection()) & 65280) >> 8) != 0) {
                if (Math.abs(this.f9441) > Math.abs(this.f9444)) {
                    int iM3661 = m3661(iM4491);
                    if (iM3661 > 0) {
                        iM4492 = AbstractC2450.m4492(iM3661, this.f9450.getLayoutDirection());
                    } else {
                        iM4492 = m3669(iM4491);
                        if (iM4492 <= 0) {
                            iM4492 = 0;
                        }
                    }
                    velocityTracker = this.f9448;
                    if (velocityTracker != null) {
                        velocityTracker.recycle();
                        this.f9448 = null;
                    }
                    float fSignum2 = 0.0f;
                    if (iM4492 != 1 || iM4492 == 2) {
                        c = 0;
                        fSignum = Math.signum(this.f9444) * this.f9450.getHeight();
                        c2 = 4;
                    } else if (iM4492 == 4 || iM4492 == 8 || iM4492 == 16 || iM4492 == 32) {
                        c = 0;
                        fSignum2 = Math.signum(this.f9441) * this.f9450.getWidth();
                        c2 = 4;
                        fSignum = 0.0f;
                    } else {
                        c2 = 4;
                        fSignum = 0.0f;
                        c = 0;
                    }
                    if (i2 != 2) {
                        c2 = '\b';
                    } else if (iM4492 > 0) {
                        c2 = 2;
                    }
                    float[] fArr = this.f9451;
                    m3662(fArr);
                    char c3 = c2;
                    ?? r123 = c;
                    C1472 c1472 = new C1472(this, r2, i2, fArr[c], fArr[1], fSignum2, fSignum, iM4492, r2);
                    AbstractC2411 itemAnimator = this.f9450.getItemAnimator();
                    long j = itemAnimator != null ? c3 == '\b' ? 200L : 250L : c3 == '\b' ? itemAnimator.f11851 : itemAnimator.f11856;
                    ValueAnimator valueAnimator = c1472.f6997;
                    valueAnimator.setDuration(j);
                    this.f9464.add(c1472);
                    r2.m777(r123);
                    valueAnimator.start();
                    r42 = abstractC2450;
                    abstractC01852 = null;
                    z = true;
                    r122 = r123;
                } else {
                    int iM3669 = m3669(iM4491);
                    if (iM3669 > 0) {
                        iM4492 = iM3669;
                    } else {
                        int iM36612 = m3661(iM4491);
                        if (iM36612 > 0) {
                            iM4492 = AbstractC2450.m4492(iM36612, this.f9450.getLayoutDirection());
                        }
                    }
                    velocityTracker = this.f9448;
                    if (velocityTracker != null) {
                    }
                    float fSignum22 = 0.0f;
                    if (iM4492 != 1) {
                        c = 0;
                        fSignum = Math.signum(this.f9444) * this.f9450.getHeight();
                        c2 = 4;
                        if (i2 != 2) {
                        }
                        float[] fArr2 = this.f9451;
                        m3662(fArr2);
                        char c32 = c2;
                        ?? r1232 = c;
                        C1472 c14722 = new C1472(this, r2, i2, fArr2[c], fArr2[1], fSignum22, fSignum, iM4492, r2);
                        AbstractC2411 itemAnimator2 = this.f9450.getItemAnimator();
                        if (itemAnimator2 != null) {
                        }
                        ValueAnimator valueAnimator2 = c14722.f6997;
                        valueAnimator2.setDuration(j);
                        this.f9464.add(c14722);
                        r2.m777(r1232);
                        valueAnimator2.start();
                        r42 = abstractC2450;
                        abstractC01852 = null;
                        z = true;
                        r122 = r1232;
                    }
                }
            }
            this.f9463 = abstractC01852;
            r4 = r42;
            r12 = r122;
        } else {
            r12 = 0;
            z = false;
            r4 = abstractC2450;
        }
        if (abstractC0185 != null) {
            View view2 = abstractC0185.f1093;
            this.f9449 = (AbstractC2450.m4491(196611, this.f9450.getLayoutDirection()) & i3) >> (this.f9440 * 8);
            this.f9461 = view2.getLeft();
            this.f9458 = view2.getTop();
            this.f9463 = abstractC0185;
            if (i == 2) {
                view2.performHapticFeedback(r12 == true ? 1 : 0);
            }
        }
        ?? parent = this.f9450.getParent();
        if (parent != 0) {
            ?? r124 = r12;
            if (this.f9463 != null) {
                r124 = 1;
            }
            parent.requestDisallowInterceptTouchEvent(r124);
        }
        if (!z) {
            this.f9450.getLayoutManager().f12606 = true;
        }
        r4.mo1233(this.f9463, this.f9440);
        this.f9450.invalidate();
    }

    @Override // yyds.AbstractC1744
    /* JADX INFO: renamed from: ᲇᲇᲇᛱ */
    public final void mo3484(Canvas canvas, C1213 c1213) {
        boolean z = false;
        if (this.f9463 != null) {
            float[] fArr = this.f9451;
            m3662(fArr);
            float f = fArr[0];
            float f2 = fArr[1];
        }
        AbstractC0185 abstractC0185 = this.f9463;
        ArrayList arrayList = this.f9464;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C1472 c1472 = (C1472) arrayList.get(i);
            int iSave = canvas.save();
            View view = c1472.f6993.f1093;
            canvas.restoreToCount(iSave);
        }
        if (abstractC0185 != null) {
            canvas.restoreToCount(canvas.save());
        }
        for (int i2 = size - 1; i2 >= 0; i2--) {
            C1472 c14722 = (C1472) arrayList.get(i2);
            boolean z2 = c14722.f6999;
            if (z2 && !c14722.f6990) {
                arrayList.remove(i2);
            } else if (!z2) {
                z = true;
            }
        }
        if (z) {
            c1213.invalidate();
        }
    }

    @Override // yyds.AbstractC1744
    /* JADX INFO: renamed from: ᲇᲈᛵᛷ */
    public final void mo3485(Rect rect, View view) {
        rect.setEmpty();
    }
}
