package androidx.recyclerview.widget;

import Yue.C5157;
import Yue.C5518;
import Yue.C6922;
import Yue.C8273;
import Yue.InterfaceC5517;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: androidx.recyclerview.widget.ۥ۟۟۟ۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C8973 extends RecyclerView.AbstractC8918 implements RecyclerView.InterfaceC8923 {

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static final int f30227 = 1;

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static final int f30228 = 2;

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public static final int f30229 = 4;

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public static final int f30230 = 8;

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public static final int f30231 = 16;

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public static final int f30232 = 32;

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public static final int f30233 = 0;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public static final int f30234 = 1;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public static final int f30235 = 2;

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public static final int f30236 = 2;

    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public static final int f30237 = 4;

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public static final int f30238 = 8;

    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public static final String f30239 = "ItemTouchHelper";

    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public static final boolean f30240 = false;

    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    public static final int f30241 = -1;

    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    public static final int f30242 = 8;

    /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
    public static final int f30243 = 255;

    /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
    public static final int f30244 = 65280;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final int f30245 = 16711680;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final int f30246 = 1000;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public float f30248;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public float f30249;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public float f30250;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public float f30251;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public float f30252;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public float f30253;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public float f30254;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public float f30255;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    @InterfaceC6391
    public AbstractC8977 f30257;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public int f30259;

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public int f30261;

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public RecyclerView f30262;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public VelocityTracker f30264;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public List<RecyclerView.AbstractC8938> f30265;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public List<Integer> f30266;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public C5157 f30270;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public C8978 f30271;

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public Rect f30273;

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public long f30274;

    /* JADX INFO: renamed from: ۥ */
    public final List<View> f3962 = new ArrayList();

    /* JADX INFO: renamed from: ۥ۟ */
    public final float[] f3963 = new float[2];

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public RecyclerView.AbstractC8938 f30247 = null;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public int f30256 = -1;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public int f30258 = 0;

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public List<C8979> f30260 = new ArrayList();

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public final Runnable f30263 = new RunnableC1773();

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public RecyclerView.InterfaceC8912 f30267 = null;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public View f30268 = null;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public int f30269 = -1;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public final RecyclerView.InterfaceC8925 f30272 = new C1774();

    /* JADX INFO: renamed from: androidx.recyclerview.widget.ۥ۟۟۟ۥ$ۥ */
    public class RunnableC1773 implements Runnable {
        public RunnableC1773() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C8973 c8973 = C8973.this;
            if (c8973.f30247 == null || !c8973.m30642()) {
                return;
            }
            C8973 c89732 = C8973.this;
            RecyclerView.AbstractC8938 abstractC8938 = c89732.f30247;
            if (abstractC8938 != null) {
                c89732.m30637(abstractC8938);
            }
            C8973 c89733 = C8973.this;
            c89733.f30262.removeCallbacks(c89733.f30263);
            C8273.m27427(C8973.this.f30262, this);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.ۥ۟۟۟ۥ$ۥ۟ */
    public class C1774 implements RecyclerView.InterfaceC8925 {
        public C1774() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC8925
        /* JADX INFO: renamed from: ۥ */
        public void mo4932(@InterfaceC6391 RecyclerView recyclerView, @InterfaceC6391 MotionEvent motionEvent) {
            C8973.this.f30270.m1938(motionEvent);
            VelocityTracker velocityTracker = C8973.this.f30264;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            if (C8973.this.f30256 == -1) {
                return;
            }
            int actionMasked = motionEvent.getActionMasked();
            int iFindPointerIndex = motionEvent.findPointerIndex(C8973.this.f30256);
            if (iFindPointerIndex >= 0) {
                C8973.this.m30628(actionMasked, motionEvent, iFindPointerIndex);
            }
            C8973 c8973 = C8973.this;
            RecyclerView.AbstractC8938 abstractC8938 = c8973.f30247;
            if (abstractC8938 == null) {
                return;
            }
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (iFindPointerIndex >= 0) {
                        c8973.m30649(motionEvent, c8973.f30259, iFindPointerIndex);
                        C8973.this.m30637(abstractC8938);
                        C8973 c89732 = C8973.this;
                        c89732.f30262.removeCallbacks(c89732.f30263);
                        C8973.this.f30263.run();
                        C8973.this.f30262.invalidate();
                        return;
                    }
                    return;
                }
                if (actionMasked != 3) {
                    if (actionMasked != 6) {
                        return;
                    }
                    int actionIndex = motionEvent.getActionIndex();
                    int pointerId = motionEvent.getPointerId(actionIndex);
                    C8973 c89733 = C8973.this;
                    if (pointerId == c89733.f30256) {
                        c89733.f30256 = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                        C8973 c89734 = C8973.this;
                        c89734.m30649(motionEvent, c89734.f30259, actionIndex);
                        return;
                    }
                    return;
                }
                VelocityTracker velocityTracker2 = c8973.f30264;
                if (velocityTracker2 != null) {
                    velocityTracker2.clear();
                }
            }
            C8973.this.m30643(null, 0);
            C8973.this.f30256 = -1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC8925
        /* JADX INFO: renamed from: ۥ۟۟ */
        public boolean mo30309(@InterfaceC6391 RecyclerView recyclerView, @InterfaceC6391 MotionEvent motionEvent) {
            int iFindPointerIndex;
            C8979 c8979M30631;
            C8973.this.f30270.m1938(motionEvent);
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                C8973.this.f30256 = motionEvent.getPointerId(0);
                C8973.this.f30248 = motionEvent.getX();
                C8973.this.f30249 = motionEvent.getY();
                C8973.this.m30638();
                C8973 c8973 = C8973.this;
                if (c8973.f30247 == null && (c8979M30631 = c8973.m30631(motionEvent)) != null) {
                    C8973 c89732 = C8973.this;
                    c89732.f30248 -= c8979M30631.f30295;
                    c89732.f30249 -= c8979M30631.f30296;
                    c89732.m30630(c8979M30631.f30290, true);
                    if (C8973.this.f3962.remove(c8979M30631.f30290.itemView)) {
                        C8973 c89733 = C8973.this;
                        c89733.f30257.m30654(c89733.f30262, c8979M30631.f30290);
                    }
                    C8973.this.m30643(c8979M30631.f30290, c8979M30631.f30291);
                    C8973 c89734 = C8973.this;
                    c89734.m30649(motionEvent, c89734.f30259, 0);
                }
            } else if (actionMasked == 3 || actionMasked == 1) {
                C8973 c89735 = C8973.this;
                c89735.f30256 = -1;
                c89735.m30643(null, 0);
            } else {
                int i = C8973.this.f30256;
                if (i != -1 && (iFindPointerIndex = motionEvent.findPointerIndex(i)) >= 0) {
                    C8973.this.m30628(actionMasked, motionEvent, iFindPointerIndex);
                }
            }
            VelocityTracker velocityTracker = C8973.this.f30264;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            return C8973.this.f30247 != null;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC8925
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public void mo30310(boolean z) {
            if (z) {
                C8973.this.m30643(null, 0);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.ۥ۟۟۟ۥ$ۥ۟۟, reason: contains not printable characters */
    public class C8974 extends C8979 {

        /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ int f30276;

        /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
        public final /* synthetic */ RecyclerView.AbstractC8938 f30277;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8974(RecyclerView.AbstractC8938 abstractC8938, int i, int i2, float f, float f2, float f3, float f4, int i3, RecyclerView.AbstractC8938 abstractC89382) {
            super(abstractC8938, i, i2, f, f2, f3, f4);
            this.f30276 = i3;
            this.f30277 = abstractC89382;
        }

        @Override // androidx.recyclerview.widget.C8973.C8979, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            if (this.f30297) {
                return;
            }
            if (this.f30276 <= 0) {
                C8973 c8973 = C8973.this;
                c8973.f30257.m30654(c8973.f30262, this.f30277);
            } else {
                C8973.this.f3962.add(this.f30277.itemView);
                this.f30294 = true;
                int i = this.f30276;
                if (i > 0) {
                    C8973.this.m30639(this, i);
                }
            }
            C8973 c89732 = C8973.this;
            View view = c89732.f30268;
            View view2 = this.f30277.itemView;
            if (view == view2) {
                c89732.m30641(view2);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.ۥ۟۟۟ۥ$ۥ۟۟۟, reason: contains not printable characters */
    public class RunnableC8975 implements Runnable {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ C8979 f30279;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ int f30280;

        public RunnableC8975(C8979 c8979, int i) {
            this.f30279 = c8979;
            this.f30280 = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = C8973.this.f30262;
            if (recyclerView == null || !recyclerView.isAttachedToWindow()) {
                return;
            }
            C8979 c8979 = this.f30279;
            if (c8979.f30297 || c8979.f30290.getAdapterPosition() == -1) {
                return;
            }
            RecyclerView.AbstractC8914 itemAnimator = C8973.this.f30262.getItemAnimator();
            if ((itemAnimator == null || !itemAnimator.m30285(null)) && !C8973.this.m30636()) {
                C8973.this.f30257.m30677(this.f30279.f30290, this.f30280);
            } else {
                C8973.this.f30262.post(this);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.ۥ۟۟۟ۥ$ۥ۟۟۟۟, reason: contains not printable characters */
    public class C8976 implements RecyclerView.InterfaceC8912 {
        public C8976() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC8912
        /* JADX INFO: renamed from: ۥ */
        public int mo4917(int i, int i2) {
            C8973 c8973 = C8973.this;
            View view = c8973.f30268;
            if (view == null) {
                return i2;
            }
            int iIndexOfChild = c8973.f30269;
            if (iIndexOfChild == -1) {
                iIndexOfChild = c8973.f30262.indexOfChild(view);
                C8973.this.f30269 = iIndexOfChild;
            }
            return i2 == i + (-1) ? iIndexOfChild : i2 < iIndexOfChild ? i2 : i2 + 1;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.ۥ۟۟۟ۥ$ۥ۟۟۟۠, reason: contains not printable characters */
    public static abstract class AbstractC8977 {

        /* JADX INFO: renamed from: ۥ۟ */
        public static final int f3966 = 200;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static final int f30282 = 250;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static final int f30283 = 3158064;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static final int f30284 = 789516;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public static final Interpolator f30285 = new InterpolatorC1775();

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public static final Interpolator f30286 = new InterpolatorC1776();

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public static final long f30287 = 2000;

        /* JADX INFO: renamed from: ۥ */
        public int f3967 = -1;

        /* JADX INFO: renamed from: androidx.recyclerview.widget.ۥ۟۟۟ۥ$ۥ۟۟۟۠$ۥ */
        public static class InterpolatorC1775 implements Interpolator {
            @Override // android.animation.TimeInterpolator
            public float getInterpolation(float f) {
                return f * f * f * f * f;
            }
        }

        /* JADX INFO: renamed from: androidx.recyclerview.widget.ۥ۟۟۟ۥ$ۥ۟۟۟۠$ۥ۟ */
        public static class InterpolatorC1776 implements Interpolator {
            @Override // android.animation.TimeInterpolator
            public float getInterpolation(float f) {
                float f2 = f - 1.0f;
                return (f2 * f2 * f2 * f2 * f2) + 1.0f;
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static int m30650(int i, int i2) {
            int i3;
            int i4 = i & f30284;
            if (i4 == 0) {
                return i;
            }
            int i5 = i & (~i4);
            if (i2 == 0) {
                i3 = i4 << 2;
            } else {
                int i6 = i4 << 1;
                i5 |= (-789517) & i6;
                i3 = (i6 & f30284) << 2;
            }
            return i5 | i3;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public static InterfaceC5517 m30651() {
            return C5518.f1546;
        }

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public static int m30652(int i, int i2) {
            return i2 << (i * 8);
        }

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public static int m30653(int i, int i2) {
            return m30652(2, i) | m30652(1, i2) | m30652(0, i2 | i);
        }

        /* JADX INFO: renamed from: ۥ */
        public boolean m4991(@InterfaceC6391 RecyclerView recyclerView, @InterfaceC6391 RecyclerView.AbstractC8938 abstractC8938, @InterfaceC6391 RecyclerView.AbstractC8938 abstractC89382) {
            return true;
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public RecyclerView.AbstractC8938 m4992(@InterfaceC6391 RecyclerView.AbstractC8938 abstractC8938, @InterfaceC6391 List<RecyclerView.AbstractC8938> list, int i, int i2) {
            int bottom;
            int iAbs;
            int top;
            int iAbs2;
            int left;
            int iAbs3;
            int right;
            int iAbs4;
            int width = i + abstractC8938.itemView.getWidth();
            int height = i2 + abstractC8938.itemView.getHeight();
            int left2 = i - abstractC8938.itemView.getLeft();
            int top2 = i2 - abstractC8938.itemView.getTop();
            int size = list.size();
            RecyclerView.AbstractC8938 abstractC89382 = null;
            int i3 = -1;
            for (int i4 = 0; i4 < size; i4++) {
                RecyclerView.AbstractC8938 abstractC89383 = list.get(i4);
                if (left2 > 0 && (right = abstractC89383.itemView.getRight() - width) < 0 && abstractC89383.itemView.getRight() > abstractC8938.itemView.getRight() && (iAbs4 = Math.abs(right)) > i3) {
                    abstractC89382 = abstractC89383;
                    i3 = iAbs4;
                }
                if (left2 < 0 && (left = abstractC89383.itemView.getLeft() - i) > 0 && abstractC89383.itemView.getLeft() < abstractC8938.itemView.getLeft() && (iAbs3 = Math.abs(left)) > i3) {
                    abstractC89382 = abstractC89383;
                    i3 = iAbs3;
                }
                if (top2 < 0 && (top = abstractC89383.itemView.getTop() - i2) > 0 && abstractC89383.itemView.getTop() < abstractC8938.itemView.getTop() && (iAbs2 = Math.abs(top)) > i3) {
                    abstractC89382 = abstractC89383;
                    i3 = iAbs2;
                }
                if (top2 > 0 && (bottom = abstractC89383.itemView.getBottom() - height) < 0 && abstractC89383.itemView.getBottom() > abstractC8938.itemView.getBottom() && (iAbs = Math.abs(bottom)) > i3) {
                    abstractC89382 = abstractC89383;
                    i3 = iAbs;
                }
            }
            return abstractC89382;
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public void m30654(@InterfaceC6391 RecyclerView recyclerView, @InterfaceC6391 RecyclerView.AbstractC8938 abstractC8938) {
            C5518.f1546.mo2262(abstractC8938.itemView);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public int m30655(int i, int i2) {
            int i3;
            int i4 = i & f30283;
            if (i4 == 0) {
                return i;
            }
            int i5 = i & (~i4);
            if (i2 == 0) {
                i3 = i4 >> 2;
            } else {
                int i6 = i4 >> 1;
                i5 |= (-3158065) & i6;
                i3 = (i6 & f30283) >> 2;
            }
            return i5 | i3;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public final int m30656(RecyclerView recyclerView, RecyclerView.AbstractC8938 abstractC8938) {
            return m30655(mo30661(recyclerView, abstractC8938), C8273.m27356(recyclerView));
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public long m30657(@InterfaceC6391 RecyclerView recyclerView, int i, float f, float f2) {
            RecyclerView.AbstractC8914 itemAnimator = recyclerView.getItemAnimator();
            return itemAnimator == null ? i == 8 ? 200L : 250L : i == 8 ? itemAnimator.m30282() : itemAnimator.m30283();
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public int m30658() {
            return 0;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public final int m30659(RecyclerView recyclerView) {
            if (this.f3967 == -1) {
                this.f3967 = recyclerView.getResources().getDimensionPixelSize(C6922.C6923.f19937);
            }
            return this.f3967;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public float m30660(@InterfaceC6391 RecyclerView.AbstractC8938 abstractC8938) {
            return 0.5f;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public abstract int mo30661(@InterfaceC6391 RecyclerView recyclerView, @InterfaceC6391 RecyclerView.AbstractC8938 abstractC8938);

        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        public float m30662(float f) {
            return f;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
        public float m30663(@InterfaceC6391 RecyclerView.AbstractC8938 abstractC8938) {
            return 0.5f;
        }

        /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
        public float m30664(float f) {
            return f;
        }

        /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
        public boolean m30665(RecyclerView recyclerView, RecyclerView.AbstractC8938 abstractC8938) {
            return (m30656(recyclerView, abstractC8938) & C8973.f30245) != 0;
        }

        /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
        public boolean m30666(RecyclerView recyclerView, RecyclerView.AbstractC8938 abstractC8938) {
            return (m30656(recyclerView, abstractC8938) & 65280) != 0;
        }

        /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
        public int m30667(@InterfaceC6391 RecyclerView recyclerView, int i, int i2, int i3, long j) {
            int iSignum = (int) (((int) (((int) Math.signum(i2)) * m30659(recyclerView) * f30286.getInterpolation(Math.min(1.0f, (Math.abs(i2) * 1.0f) / i)))) * f30285.getInterpolation(j <= f30287 ? j / 2000.0f : 1.0f));
            return iSignum == 0 ? i2 > 0 ? 1 : -1 : iSignum;
        }

        /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
        public boolean m30668() {
            return true;
        }

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public boolean m30669() {
            return true;
        }

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public void m30670(@InterfaceC6391 Canvas canvas, @InterfaceC6391 RecyclerView recyclerView, @InterfaceC6391 RecyclerView.AbstractC8938 abstractC8938, float f, float f2, int i, boolean z) {
            C5518.f1546.mo17147(canvas, recyclerView, abstractC8938.itemView, f, f2, i, z);
        }

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public void m30671(@InterfaceC6391 Canvas canvas, @InterfaceC6391 RecyclerView recyclerView, RecyclerView.AbstractC8938 abstractC8938, float f, float f2, int i, boolean z) {
            C5518.f1546.mo17146(canvas, recyclerView, abstractC8938.itemView, f, f2, i, z);
        }

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public void m30672(Canvas canvas, RecyclerView recyclerView, RecyclerView.AbstractC8938 abstractC8938, List<C8979> list, int i, float f, float f2) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                C8979 c8979 = list.get(i2);
                c8979.m30680();
                int iSave = canvas.save();
                m30670(canvas, recyclerView, c8979.f30290, c8979.f30295, c8979.f30296, c8979.f30291, false);
                canvas.restoreToCount(iSave);
            }
            if (abstractC8938 != null) {
                int iSave2 = canvas.save();
                m30670(canvas, recyclerView, abstractC8938, f, f2, i, true);
                canvas.restoreToCount(iSave2);
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
        public void m30673(Canvas canvas, RecyclerView recyclerView, RecyclerView.AbstractC8938 abstractC8938, List<C8979> list, int i, float f, float f2) {
            int size = list.size();
            boolean z = false;
            for (int i2 = 0; i2 < size; i2++) {
                C8979 c8979 = list.get(i2);
                int iSave = canvas.save();
                m30671(canvas, recyclerView, c8979.f30290, c8979.f30295, c8979.f30296, c8979.f30291, false);
                canvas.restoreToCount(iSave);
            }
            if (abstractC8938 != null) {
                int iSave2 = canvas.save();
                m30671(canvas, recyclerView, abstractC8938, f, f2, i, true);
                canvas.restoreToCount(iSave2);
            }
            for (int i3 = size - 1; i3 >= 0; i3--) {
                C8979 c89792 = list.get(i3);
                boolean z2 = c89792.f30298;
                if (z2 && !c89792.f30294) {
                    list.remove(i3);
                } else if (!z2) {
                    z = true;
                }
            }
            if (z) {
                recyclerView.invalidate();
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
        public abstract boolean m30674(@InterfaceC6391 RecyclerView recyclerView, @InterfaceC6391 RecyclerView.AbstractC8938 abstractC8938, @InterfaceC6391 RecyclerView.AbstractC8938 abstractC89382);

        /* JADX DEBUG: Multi-variable search result rejected for r4v1, resolved type: androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
        public void m30675(@InterfaceC6391 RecyclerView recyclerView, @InterfaceC6391 RecyclerView.AbstractC8938 abstractC8938, int i, @InterfaceC6391 RecyclerView.AbstractC8938 abstractC89382, int i2, int i3, int i4) {
            RecyclerView.AbstractC8919 layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof InterfaceC8981) {
                ((InterfaceC8981) layoutManager).prepareForDrop(abstractC8938.itemView, abstractC89382.itemView, i3, i4);
                return;
            }
            if (layoutManager.canScrollHorizontally()) {
                if (layoutManager.getDecoratedLeft(abstractC89382.itemView) <= recyclerView.getPaddingLeft()) {
                    recyclerView.scrollToPosition(i2);
                }
                if (layoutManager.getDecoratedRight(abstractC89382.itemView) >= recyclerView.getWidth() - recyclerView.getPaddingRight()) {
                    recyclerView.scrollToPosition(i2);
                }
            }
            if (layoutManager.canScrollVertically()) {
                if (layoutManager.getDecoratedTop(abstractC89382.itemView) <= recyclerView.getPaddingTop()) {
                    recyclerView.scrollToPosition(i2);
                }
                if (layoutManager.getDecoratedBottom(abstractC89382.itemView) >= recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                    recyclerView.scrollToPosition(i2);
                }
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
        public void m30676(@InterfaceC6490 RecyclerView.AbstractC8938 abstractC8938, int i) {
            if (abstractC8938 != null) {
                C5518.f1546.mo2263(abstractC8938.itemView);
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
        public abstract void m30677(@InterfaceC6391 RecyclerView.AbstractC8938 abstractC8938, int i);
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.ۥ۟۟۟ۥ$ۥ۟۟۟ۡ, reason: contains not printable characters */
    public class C8978 extends GestureDetector.SimpleOnGestureListener {

        /* JADX INFO: renamed from: ۥ */
        public boolean f3968 = true;

        public C8978() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
            View viewM30632;
            RecyclerView.AbstractC8938 childViewHolder;
            if (!this.f3968 || (viewM30632 = C8973.this.m30632(motionEvent)) == null || (childViewHolder = C8973.this.f30262.getChildViewHolder(viewM30632)) == null) {
                return;
            }
            C8973 c8973 = C8973.this;
            if (c8973.f30257.m30665(c8973.f30262, childViewHolder)) {
                int pointerId = motionEvent.getPointerId(0);
                int i = C8973.this.f30256;
                if (pointerId == i) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(i);
                    float x = motionEvent.getX(iFindPointerIndex);
                    float y = motionEvent.getY(iFindPointerIndex);
                    C8973 c89732 = C8973.this;
                    c89732.f30248 = x;
                    c89732.f30249 = y;
                    c89732.f30253 = 0.0f;
                    c89732.f30252 = 0.0f;
                    if (c89732.f30257.m30669()) {
                        C8973.this.m30643(childViewHolder, 2);
                    }
                }
            }
        }

        /* JADX INFO: renamed from: ۥ */
        public void m4993() {
            this.f3968 = false;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.ۥ۟۟۟ۥ$ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static class C8979 implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: ۥ */
        public final float f3970;

        /* JADX INFO: renamed from: ۥ۟ */
        public final float f3971;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final float f30288;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final float f30289;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final RecyclerView.AbstractC8938 f30290;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public final int f30291;

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public final ValueAnimator f30292;

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public final int f30293;

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public boolean f30294;

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public float f30295;

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public float f30296;

        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public boolean f30297 = false;

        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        public boolean f30298 = false;

        /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
        public float f30299;

        /* JADX INFO: renamed from: androidx.recyclerview.widget.ۥ۟۟۟ۥ$ۥ۟۟۟ۢ$ۥ */
        public class C1777 implements ValueAnimator.AnimatorUpdateListener {
            public C1777() {
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                C8979.this.m30678(valueAnimator.getAnimatedFraction());
            }
        }

        public C8979(RecyclerView.AbstractC8938 abstractC8938, int i, int i2, float f, float f2, float f3, float f4) {
            this.f30291 = i2;
            this.f30293 = i;
            this.f30290 = abstractC8938;
            this.f3970 = f;
            this.f3971 = f2;
            this.f30288 = f3;
            this.f30289 = f4;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f30292 = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new C1777());
            valueAnimatorOfFloat.setTarget(abstractC8938.itemView);
            valueAnimatorOfFloat.addListener(this);
            m30678(0.0f);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            m30678(1.0f);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!this.f30298) {
                this.f30290.setIsRecyclable(true);
            }
            this.f30298 = true;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }

        /* JADX INFO: renamed from: ۥ */
        public void m4994() {
            this.f30292.cancel();
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public void m4995(long j) {
            this.f30292.setDuration(j);
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public void m30678(float f) {
            this.f30299 = f;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public void m30679() {
            this.f30290.setIsRecyclable(false);
            this.f30292.start();
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public void m30680() {
            float f = this.f3970;
            float f2 = this.f30288;
            if (f == f2) {
                this.f30295 = this.f30290.itemView.getTranslationX();
            } else {
                this.f30295 = f + (this.f30299 * (f2 - f));
            }
            float f3 = this.f3971;
            float f4 = this.f30289;
            if (f3 == f4) {
                this.f30296 = this.f30290.itemView.getTranslationY();
            } else {
                this.f30296 = f3 + (this.f30299 * (f4 - f3));
            }
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.ۥ۟۟۟ۥ$ۥۣ۟۟۟, reason: contains not printable characters */
    public static abstract class AbstractC8980 extends AbstractC8977 {

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public int f30300;

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public int f30301;

        public AbstractC8980(int i, int i2) {
            this.f30300 = i2;
            this.f30301 = i;
        }

        @Override // androidx.recyclerview.widget.C8973.AbstractC8977
        /* JADX INFO: renamed from: ۥ۟۟۟ۦ */
        public int mo30661(@InterfaceC6391 RecyclerView recyclerView, @InterfaceC6391 RecyclerView.AbstractC8938 abstractC8938) {
            return AbstractC8977.m30653(m30681(recyclerView, abstractC8938), m30682(recyclerView, abstractC8938));
        }

        /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
        public int m30681(@InterfaceC6391 RecyclerView recyclerView, @InterfaceC6391 RecyclerView.AbstractC8938 abstractC8938) {
            return this.f30301;
        }

        /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
        public int m30682(@InterfaceC6391 RecyclerView recyclerView, @InterfaceC6391 RecyclerView.AbstractC8938 abstractC8938) {
            return this.f30300;
        }

        /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
        public void m30683(int i) {
            this.f30301 = i;
        }

        /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
        public void m30684(int i) {
            this.f30300 = i;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.ۥ۟۟۟ۥ$ۥ۟۟۟ۤ, reason: contains not printable characters */
    public interface InterfaceC8981 {
        void prepareForDrop(@InterfaceC6391 View view, @InterfaceC6391 View view2, int i, int i2);
    }

    public C8973(@InterfaceC6391 AbstractC8977 abstractC8977) {
        this.f30257 = abstractC8977;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    private void m30622() {
        this.f30262.removeItemDecoration(this);
        this.f30262.removeOnItemTouchListener(this.f30272);
        this.f30262.removeOnChildAttachStateChangeListener(this);
        for (int size = this.f30260.size() - 1; size >= 0; size--) {
            this.f30257.m30654(this.f30262, this.f30260.get(0).f30290);
        }
        this.f30260.clear();
        this.f30268 = null;
        this.f30269 = -1;
        m30640();
        m30647();
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static boolean m30623(View view, float f, float f2, float f3, float f4) {
        return f >= f3 && f <= f3 + ((float) view.getWidth()) && f2 >= f4 && f2 <= f4 + ((float) view.getHeight());
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    private void m30624() {
        this.f30261 = ViewConfiguration.get(this.f30262.getContext()).getScaledTouchSlop();
        this.f30262.addItemDecoration(this);
        this.f30262.addOnItemTouchListener(this.f30272);
        this.f30262.addOnChildAttachStateChangeListener(this);
        m30645();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8918
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C8935 c8935) {
        rect.setEmpty();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8918
    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.C8935 c8935) {
        float f;
        float f2;
        this.f30269 = -1;
        if (this.f30247 != null) {
            m30635(this.f3963);
            float[] fArr = this.f3963;
            float f3 = fArr[0];
            f2 = fArr[1];
            f = f3;
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        this.f30257.m30672(canvas, recyclerView, this.f30247, this.f30260, this.f30258, f, f2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8918
    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.C8935 c8935) {
        float f;
        float f2;
        if (this.f30247 != null) {
            m30635(this.f3963);
            float[] fArr = this.f3963;
            float f3 = fArr[0];
            f2 = fArr[1];
            f = f3;
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        this.f30257.m30673(canvas, recyclerView, this.f30247, this.f30260, this.f30258, f, f2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC8923
    /* JADX INFO: renamed from: ۥ۟ */
    public void mo4311(@InterfaceC6391 View view) {
        m30641(view);
        RecyclerView.AbstractC8938 childViewHolder = this.f30262.getChildViewHolder(view);
        if (childViewHolder == null) {
            return;
        }
        RecyclerView.AbstractC8938 abstractC8938 = this.f30247;
        if (abstractC8938 != null && childViewHolder == abstractC8938) {
            m30643(null, 0);
            return;
        }
        m30630(childViewHolder, false);
        if (this.f3962.remove(childViewHolder.itemView)) {
            this.f30257.m30654(this.f30262, childViewHolder);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC8923
    /* JADX INFO: renamed from: ۥ۟۟۟ */
    public void mo27810(@InterfaceC6391 View view) {
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final void m30625() {
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public void m30626(@InterfaceC6490 RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f30262;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            m30622();
        }
        this.f30262 = recyclerView;
        if (recyclerView != null) {
            Resources resources = recyclerView.getResources();
            this.f30250 = resources.getDimension(C6922.C6923.f19939);
            this.f30251 = resources.getDimension(C6922.C6923.f19938);
            m30624();
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final int m30627(RecyclerView.AbstractC8938 abstractC8938, int i) {
        if ((i & 12) == 0) {
            return 0;
        }
        int i2 = this.f30252 > 0.0f ? 8 : 4;
        VelocityTracker velocityTracker = this.f30264;
        if (velocityTracker != null && this.f30256 > -1) {
            velocityTracker.computeCurrentVelocity(1000, this.f30257.m30664(this.f30251));
            float xVelocity = this.f30264.getXVelocity(this.f30256);
            float yVelocity = this.f30264.getYVelocity(this.f30256);
            int i3 = xVelocity > 0.0f ? 8 : 4;
            float fAbs = Math.abs(xVelocity);
            if ((i3 & i) != 0 && i2 == i3 && fAbs >= this.f30257.m30662(this.f30250) && fAbs > Math.abs(yVelocity)) {
                return i3;
            }
        }
        float width = this.f30262.getWidth() * this.f30257.m30663(abstractC8938);
        if ((i & i2) == 0 || Math.abs(this.f30252) <= width) {
            return 0;
        }
        return i2;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public void m30628(int i, MotionEvent motionEvent, int i2) {
        RecyclerView.AbstractC8938 abstractC8938M30634;
        int iM30656;
        if (this.f30247 != null || i != 2 || this.f30258 == 2 || !this.f30257.m30668() || this.f30262.getScrollState() == 1 || (abstractC8938M30634 = m30634(motionEvent)) == null || (iM30656 = (this.f30257.m30656(this.f30262, abstractC8938M30634) & 65280) >> 8) == 0) {
            return;
        }
        float x = motionEvent.getX(i2);
        float y = motionEvent.getY(i2);
        float f = x - this.f30248;
        float f2 = y - this.f30249;
        float fAbs = Math.abs(f);
        float fAbs2 = Math.abs(f2);
        int i3 = this.f30261;
        if (fAbs >= i3 || fAbs2 >= i3) {
            if (fAbs > fAbs2) {
                if (f < 0.0f && (iM30656 & 4) == 0) {
                    return;
                }
                if (f > 0.0f && (iM30656 & 8) == 0) {
                    return;
                }
            } else {
                if (f2 < 0.0f && (iM30656 & 1) == 0) {
                    return;
                }
                if (f2 > 0.0f && (iM30656 & 2) == 0) {
                    return;
                }
            }
            this.f30253 = 0.0f;
            this.f30252 = 0.0f;
            this.f30256 = motionEvent.getPointerId(0);
            m30643(abstractC8938M30634, 1);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final int m30629(RecyclerView.AbstractC8938 abstractC8938, int i) {
        if ((i & 3) == 0) {
            return 0;
        }
        int i2 = this.f30253 > 0.0f ? 2 : 1;
        VelocityTracker velocityTracker = this.f30264;
        if (velocityTracker != null && this.f30256 > -1) {
            velocityTracker.computeCurrentVelocity(1000, this.f30257.m30664(this.f30251));
            float xVelocity = this.f30264.getXVelocity(this.f30256);
            float yVelocity = this.f30264.getYVelocity(this.f30256);
            int i3 = yVelocity > 0.0f ? 2 : 1;
            float fAbs = Math.abs(yVelocity);
            if ((i3 & i) != 0 && i3 == i2 && fAbs >= this.f30257.m30662(this.f30250) && fAbs > Math.abs(xVelocity)) {
                return i3;
            }
        }
        float height = this.f30262.getHeight() * this.f30257.m30663(abstractC8938);
        if ((i & i2) == 0 || Math.abs(this.f30253) <= height) {
            return 0;
        }
        return i2;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public void m30630(RecyclerView.AbstractC8938 abstractC8938, boolean z) {
        for (int size = this.f30260.size() - 1; size >= 0; size--) {
            C8979 c8979 = this.f30260.get(size);
            if (c8979.f30290 == abstractC8938) {
                c8979.f30297 |= z;
                if (!c8979.f30298) {
                    c8979.m4994();
                }
                this.f30260.remove(size);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public C8979 m30631(MotionEvent motionEvent) {
        if (this.f30260.isEmpty()) {
            return null;
        }
        View viewM30632 = m30632(motionEvent);
        for (int size = this.f30260.size() - 1; size >= 0; size--) {
            C8979 c8979 = this.f30260.get(size);
            if (c8979.f30290.itemView == viewM30632) {
                return c8979;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public View m30632(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        RecyclerView.AbstractC8938 abstractC8938 = this.f30247;
        if (abstractC8938 != null) {
            View view = abstractC8938.itemView;
            if (m30623(view, x, y, this.f30254 + this.f30252, this.f30255 + this.f30253)) {
                return view;
            }
        }
        for (int size = this.f30260.size() - 1; size >= 0; size--) {
            C8979 c8979 = this.f30260.get(size);
            View view2 = c8979.f30290.itemView;
            if (m30623(view2, x, y, c8979.f30295, c8979.f30296)) {
                return view2;
            }
        }
        return this.f30262.findChildViewUnder(x, y);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public final List<RecyclerView.AbstractC8938> m30633(RecyclerView.AbstractC8938 abstractC8938) {
        RecyclerView.AbstractC8938 abstractC89382 = abstractC8938;
        List<RecyclerView.AbstractC8938> list = this.f30265;
        if (list == null) {
            this.f30265 = new ArrayList();
            this.f30266 = new ArrayList();
        } else {
            list.clear();
            this.f30266.clear();
        }
        int iM30658 = this.f30257.m30658();
        int iRound = Math.round(this.f30254 + this.f30252) - iM30658;
        int iRound2 = Math.round(this.f30255 + this.f30253) - iM30658;
        int i = iM30658 * 2;
        int width = abstractC89382.itemView.getWidth() + iRound + i;
        int height = abstractC89382.itemView.getHeight() + iRound2 + i;
        int i2 = (iRound + width) / 2;
        int i3 = (iRound2 + height) / 2;
        RecyclerView.AbstractC8919 layoutManager = this.f30262.getLayoutManager();
        int childCount = layoutManager.getChildCount();
        int i4 = 0;
        while (i4 < childCount) {
            View childAt = layoutManager.getChildAt(i4);
            if (childAt != abstractC89382.itemView && childAt.getBottom() >= iRound2 && childAt.getTop() <= height && childAt.getRight() >= iRound && childAt.getLeft() <= width) {
                RecyclerView.AbstractC8938 childViewHolder = this.f30262.getChildViewHolder(childAt);
                if (this.f30257.m4991(this.f30262, this.f30247, childViewHolder)) {
                    int iAbs = Math.abs(i2 - ((childAt.getLeft() + childAt.getRight()) / 2));
                    int iAbs2 = Math.abs(i3 - ((childAt.getTop() + childAt.getBottom()) / 2));
                    int i5 = (iAbs * iAbs) + (iAbs2 * iAbs2);
                    int size = this.f30265.size();
                    int i6 = 0;
                    for (int i7 = 0; i7 < size && i5 > this.f30266.get(i7).intValue(); i7++) {
                        i6++;
                    }
                    this.f30265.add(i6, childViewHolder);
                    this.f30266.add(i6, Integer.valueOf(i5));
                }
            }
            i4++;
            abstractC89382 = abstractC8938;
        }
        return this.f30265;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public final RecyclerView.AbstractC8938 m30634(MotionEvent motionEvent) {
        View viewM30632;
        RecyclerView.AbstractC8919 layoutManager = this.f30262.getLayoutManager();
        int i = this.f30256;
        if (i == -1) {
            return null;
        }
        int iFindPointerIndex = motionEvent.findPointerIndex(i);
        float x = motionEvent.getX(iFindPointerIndex) - this.f30248;
        float y = motionEvent.getY(iFindPointerIndex) - this.f30249;
        float fAbs = Math.abs(x);
        float fAbs2 = Math.abs(y);
        int i2 = this.f30261;
        if (fAbs < i2 && fAbs2 < i2) {
            return null;
        }
        if (fAbs > fAbs2 && layoutManager.canScrollHorizontally()) {
            return null;
        }
        if ((fAbs2 <= fAbs || !layoutManager.canScrollVertically()) && (viewM30632 = m30632(motionEvent)) != null) {
            return this.f30262.getChildViewHolder(viewM30632);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public final void m30635(float[] fArr) {
        if ((this.f30259 & 12) != 0) {
            fArr[0] = (this.f30254 + this.f30252) - this.f30247.itemView.getLeft();
        } else {
            fArr[0] = this.f30247.itemView.getTranslationX();
        }
        if ((this.f30259 & 3) != 0) {
            fArr[1] = (this.f30255 + this.f30253) - this.f30247.itemView.getTop();
        } else {
            fArr[1] = this.f30247.itemView.getTranslationY();
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public boolean m30636() {
        int size = this.f30260.size();
        for (int i = 0; i < size; i++) {
            if (!this.f30260.get(i).f30298) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public void m30637(RecyclerView.AbstractC8938 abstractC8938) {
        if (!this.f30262.isLayoutRequested() && this.f30258 == 2) {
            float fM30660 = this.f30257.m30660(abstractC8938);
            int i = (int) (this.f30254 + this.f30252);
            int i2 = (int) (this.f30255 + this.f30253);
            if (Math.abs(i2 - abstractC8938.itemView.getTop()) >= abstractC8938.itemView.getHeight() * fM30660 || Math.abs(i - abstractC8938.itemView.getLeft()) >= abstractC8938.itemView.getWidth() * fM30660) {
                List<RecyclerView.AbstractC8938> listM30633 = m30633(abstractC8938);
                if (listM30633.size() == 0) {
                    return;
                }
                RecyclerView.AbstractC8938 abstractC8938M4992 = this.f30257.m4992(abstractC8938, listM30633, i, i2);
                if (abstractC8938M4992 == null) {
                    this.f30265.clear();
                    this.f30266.clear();
                    return;
                }
                int adapterPosition = abstractC8938M4992.getAdapterPosition();
                int adapterPosition2 = abstractC8938.getAdapterPosition();
                if (this.f30257.m30674(this.f30262, abstractC8938, abstractC8938M4992)) {
                    this.f30257.m30675(this.f30262, abstractC8938, adapterPosition2, abstractC8938M4992, adapterPosition, i, i2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public void m30638() {
        VelocityTracker velocityTracker = this.f30264;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.f30264 = VelocityTracker.obtain();
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public void m30639(C8979 c8979, int i) {
        this.f30262.post(new RunnableC8975(c8979, i));
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public final void m30640() {
        VelocityTracker velocityTracker = this.f30264;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f30264 = null;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public void m30641(View view) {
        if (view == this.f30268) {
            this.f30268 = null;
            if (this.f30267 != null) {
                this.f30262.setChildDrawingOrderCallback(null);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c4  */
    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean m30642() {
        int iM30667;
        int iM306672;
        int i;
        int width;
        if (this.f30247 == null) {
            this.f30274 = Long.MIN_VALUE;
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = this.f30274;
        long j2 = j == Long.MIN_VALUE ? 0L : jCurrentTimeMillis - j;
        RecyclerView.AbstractC8919 layoutManager = this.f30262.getLayoutManager();
        if (this.f30273 == null) {
            this.f30273 = new Rect();
        }
        layoutManager.calculateItemDecorationsForChild(this.f30247.itemView, this.f30273);
        if (layoutManager.canScrollHorizontally()) {
            int i2 = (int) (this.f30254 + this.f30252);
            int paddingLeft = (i2 - this.f30273.left) - this.f30262.getPaddingLeft();
            float f = this.f30252;
            iM30667 = (f >= 0.0f || paddingLeft >= 0) ? (f <= 0.0f || (width = ((i2 + this.f30247.itemView.getWidth()) + this.f30273.right) - (this.f30262.getWidth() - this.f30262.getPaddingRight())) <= 0) ? 0 : width : paddingLeft;
        }
        if (layoutManager.canScrollVertically()) {
            int i3 = (int) (this.f30255 + this.f30253);
            int paddingTop = (i3 - this.f30273.top) - this.f30262.getPaddingTop();
            float f2 = this.f30253;
            if (f2 < 0.0f && paddingTop < 0) {
                iM306672 = paddingTop;
            } else if (f2 <= 0.0f || (iM306672 = ((i3 + this.f30247.itemView.getHeight()) + this.f30273.bottom) - (this.f30262.getHeight() - this.f30262.getPaddingBottom())) <= 0) {
                iM306672 = 0;
            }
        }
        if (iM30667 != 0) {
            iM30667 = this.f30257.m30667(this.f30262, this.f30247.itemView.getWidth(), iM30667, this.f30262.getWidth(), j2);
        }
        int i4 = iM30667;
        if (iM306672 != 0) {
            i = i4;
            iM306672 = this.f30257.m30667(this.f30262, this.f30247.itemView.getHeight(), iM306672, this.f30262.getHeight(), j2);
        } else {
            i = i4;
        }
        if (i == 0 && iM306672 == 0) {
            this.f30274 = Long.MIN_VALUE;
            return false;
        }
        if (this.f30274 == Long.MIN_VALUE) {
            this.f30274 = jCurrentTimeMillis;
        }
        this.f30262.scrollBy(i, iM306672);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0121  */
    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m30643(@InterfaceC6490 RecyclerView.AbstractC8938 abstractC8938, int i) {
        boolean z;
        boolean z2;
        float fSignum;
        float fSignum2;
        if (abstractC8938 == this.f30247 && i == this.f30258) {
            return;
        }
        this.f30274 = Long.MIN_VALUE;
        int i2 = this.f30258;
        m30630(abstractC8938, true);
        this.f30258 = i;
        if (i == 2) {
            if (abstractC8938 == null) {
                throw new IllegalArgumentException("Must pass a ViewHolder when dragging");
            }
            this.f30268 = abstractC8938.itemView;
            m30625();
        }
        int i3 = (1 << ((i * 8) + 8)) - 1;
        RecyclerView.AbstractC8938 abstractC89382 = this.f30247;
        if (abstractC89382 != null) {
            if (abstractC89382.itemView.getParent() != null) {
                int iM30648 = i2 == 2 ? 0 : m30648(abstractC89382);
                m30640();
                if (iM30648 == 1 || iM30648 == 2) {
                    fSignum = 0.0f;
                    fSignum2 = Math.signum(this.f30253) * this.f30262.getHeight();
                } else if (iM30648 == 4 || iM30648 == 8 || iM30648 == 16 || iM30648 == 32) {
                    fSignum2 = 0.0f;
                    fSignum = Math.signum(this.f30252) * this.f30262.getWidth();
                } else {
                    fSignum = 0.0f;
                    fSignum2 = 0.0f;
                }
                int i4 = i2 == 2 ? 8 : iM30648 > 0 ? 2 : 4;
                m30635(this.f3963);
                float[] fArr = this.f3963;
                float f = fArr[0];
                float f2 = fArr[1];
                C8974 c8974 = new C8974(abstractC89382, i4, i2, f, f2, fSignum, fSignum2, iM30648, abstractC89382);
                c8974.m4995(this.f30257.m30657(this.f30262, i4, fSignum - f, fSignum2 - f2));
                this.f30260.add(c8974);
                c8974.m30679();
                z = true;
            } else {
                m30641(abstractC89382.itemView);
                this.f30257.m30654(this.f30262, abstractC89382);
                z = false;
            }
            this.f30247 = null;
        } else {
            z = false;
        }
        if (abstractC8938 != null) {
            this.f30259 = (this.f30257.m30656(this.f30262, abstractC8938) & i3) >> (this.f30258 * 8);
            this.f30254 = abstractC8938.itemView.getLeft();
            this.f30255 = abstractC8938.itemView.getTop();
            this.f30247 = abstractC8938;
            if (i == 2) {
                z2 = false;
                abstractC8938.itemView.performHapticFeedback(0);
            } else {
                z2 = false;
            }
        }
        ViewParent parent = this.f30262.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(this.f30247 != null ? true : z2);
        }
        if (!z) {
            this.f30262.getLayoutManager().requestSimpleAnimationsInNextLayout();
        }
        this.f30257.m30676(this.f30247, this.f30258);
        this.f30262.invalidate();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public void m30644(@InterfaceC6391 RecyclerView.AbstractC8938 abstractC8938) {
        if (!this.f30257.m30665(this.f30262, abstractC8938)) {
            Log.e(f30239, "Start drag has been called but dragging is not enabled");
            return;
        }
        if (abstractC8938.itemView.getParent() != this.f30262) {
            Log.e(f30239, "Start drag has been called with a view holder which is not a child of the RecyclerView which is controlled by this ItemTouchHelper.");
            return;
        }
        m30638();
        this.f30253 = 0.0f;
        this.f30252 = 0.0f;
        m30643(abstractC8938, 2);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public final void m30645() {
        this.f30271 = new C8978();
        this.f30270 = new C5157(this.f30262.getContext(), this.f30271);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public void m30646(@InterfaceC6391 RecyclerView.AbstractC8938 abstractC8938) {
        if (!this.f30257.m30666(this.f30262, abstractC8938)) {
            Log.e(f30239, "Start swipe has been called but swiping is not enabled");
            return;
        }
        if (abstractC8938.itemView.getParent() != this.f30262) {
            Log.e(f30239, "Start swipe has been called with a view holder which is not a child of the RecyclerView controlled by this ItemTouchHelper.");
            return;
        }
        m30638();
        this.f30253 = 0.0f;
        this.f30252 = 0.0f;
        m30643(abstractC8938, 1);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public final void m30647() {
        C8978 c8978 = this.f30271;
        if (c8978 != null) {
            c8978.m4993();
            this.f30271 = null;
        }
        if (this.f30270 != null) {
            this.f30270 = null;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public final int m30648(RecyclerView.AbstractC8938 abstractC8938) {
        if (this.f30258 == 2) {
            return 0;
        }
        int iMo30661 = this.f30257.mo30661(this.f30262, abstractC8938);
        int iM30655 = (this.f30257.m30655(iMo30661, C8273.m27356(this.f30262)) & 65280) >> 8;
        if (iM30655 == 0) {
            return 0;
        }
        int i = (iMo30661 & 65280) >> 8;
        if (Math.abs(this.f30252) > Math.abs(this.f30253)) {
            int iM30627 = m30627(abstractC8938, iM30655);
            if (iM30627 > 0) {
                return (i & iM30627) == 0 ? AbstractC8977.m30650(iM30627, C8273.m27356(this.f30262)) : iM30627;
            }
            int iM30629 = m30629(abstractC8938, iM30655);
            if (iM30629 > 0) {
                return iM30629;
            }
        } else {
            int iM306292 = m30629(abstractC8938, iM30655);
            if (iM306292 > 0) {
                return iM306292;
            }
            int iM306272 = m30627(abstractC8938, iM30655);
            if (iM306272 > 0) {
                return (i & iM306272) == 0 ? AbstractC8977.m30650(iM306272, C8273.m27356(this.f30262)) : iM306272;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public void m30649(MotionEvent motionEvent, int i, int i2) {
        float x = motionEvent.getX(i2);
        float y = motionEvent.getY(i2);
        float f = x - this.f30248;
        this.f30252 = f;
        this.f30253 = y - this.f30249;
        if ((i & 4) == 0) {
            this.f30252 = Math.max(0.0f, f);
        }
        if ((i & 8) == 0) {
            this.f30252 = Math.min(0.0f, this.f30252);
        }
        if ((i & 1) == 0) {
            this.f30253 = Math.max(0.0f, this.f30253);
        }
        if ((i & 2) == 0) {
            this.f30253 = Math.min(0.0f, this.f30253);
        }
    }
}
