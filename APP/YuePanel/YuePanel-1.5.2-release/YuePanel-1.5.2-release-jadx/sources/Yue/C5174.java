package Yue;

import Yue.C6934;
import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;

/* JADX INFO: renamed from: Yue.ۥۣ۠ۥۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"ViewConstructor"})
public class C5174 extends ViewGroup implements InterfaceC5171 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public ViewGroup f12223;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public View f12224;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final View f12225;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public int f12226;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    @InterfaceC6490
    public Matrix f12227;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public final ViewTreeObserver.OnPreDrawListener f12228;

    /* JADX INFO: renamed from: Yue.ۥۣ۠ۥۥ$ۥ */
    public class ViewTreeObserverOnPreDrawListenerC0655 implements ViewTreeObserver.OnPreDrawListener {
        public ViewTreeObserverOnPreDrawListenerC0655() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            View view;
            C5174.this.postInvalidateOnAnimation();
            C5174 c5174 = C5174.this;
            ViewGroup viewGroup = c5174.f12223;
            if (viewGroup == null || (view = c5174.f12224) == null) {
                return true;
            }
            viewGroup.endViewTransition(view);
            C5174.this.f12223.postInvalidateOnAnimation();
            C5174 c51742 = C5174.this;
            c51742.f12223 = null;
            c51742.f12224 = null;
            return true;
        }
    }

    public C5174(View view) {
        super(view.getContext());
        this.f12228 = new ViewTreeObserverOnPreDrawListenerC0655();
        this.f12225 = view;
        setWillNotDraw(false);
        setClipChildren(false);
        setLayerType(2, null);
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static C5174 m1948(View view, ViewGroup viewGroup, Matrix matrix) {
        int i;
        C5172 c5172;
        if (!(view.getParent() instanceof ViewGroup)) {
            throw new IllegalArgumentException("Ghosted views must be parented by a ViewGroup");
        }
        C5172 c5172M1944 = C5172.m1944(viewGroup);
        C5174 c5174M15858 = m15858(view);
        if (c5174M15858 == null || (c5172 = (C5172) c5174M15858.getParent()) == c5172M1944) {
            i = 0;
        } else {
            i = c5174M15858.f12226;
            c5172.removeView(c5174M15858);
            c5174M15858 = null;
        }
        if (c5174M15858 == null) {
            if (matrix == null) {
                matrix = new Matrix();
                m15856(view, viewGroup, matrix);
            }
            c5174M15858 = new C5174(view);
            c5174M15858.m15861(matrix);
            if (c5172M1944 == null) {
                c5172M1944 = new C5172(viewGroup);
            } else {
                c5172M1944.m15851();
            }
            m15857(viewGroup, c5172M1944);
            m15857(viewGroup, c5174M15858);
            c5172M1944.m1945(c5174M15858);
            c5174M15858.f12226 = i;
        } else if (matrix != null) {
            c5174M15858.m15861(matrix);
        }
        c5174M15858.f12226++;
        return c5174M15858;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static void m15856(View view, ViewGroup viewGroup, Matrix matrix) {
        ViewGroup viewGroup2 = (ViewGroup) view.getParent();
        matrix.reset();
        C8371.m27936(viewGroup2, matrix);
        matrix.preTranslate(-viewGroup2.getScrollX(), -viewGroup2.getScrollY());
        C8371.m27937(viewGroup, matrix);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static void m15857(View view, View view2) {
        C8371.m27933(view2, view2.getLeft(), view2.getTop(), view2.getLeft() + view.getWidth(), view2.getTop() + view.getHeight());
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static C5174 m15858(View view) {
        return (C5174) view.getTag(C6934.C1117.f2500);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static void m15859(View view) {
        C5174 c5174M15858 = m15858(view);
        if (c5174M15858 != null) {
            int i = c5174M15858.f12226 - 1;
            c5174M15858.f12226 = i;
            if (i <= 0) {
                ((C5172) c5174M15858.getParent()).removeView(c5174M15858);
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static void m15860(@InterfaceC6391 View view, @InterfaceC6490 C5174 c5174) {
        view.setTag(C6934.C1117.f2500, c5174);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m15860(this.f12225, this);
        this.f12225.getViewTreeObserver().addOnPreDrawListener(this.f12228);
        C8371.m27935(this.f12225, 4);
        if (this.f12225.getParent() != null) {
            ((View) this.f12225.getParent()).invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.f12225.getViewTreeObserver().removeOnPreDrawListener(this.f12228);
        C8371.m27935(this.f12225, 0);
        m15860(this.f12225, null);
        if (this.f12225.getParent() != null) {
            ((View) this.f12225.getParent()).invalidate();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(@InterfaceC6391 Canvas canvas) {
        C3677.m745(canvas, true);
        canvas.setMatrix(this.f12227);
        C8371.m27935(this.f12225, 0);
        this.f12225.invalidate();
        C8371.m27935(this.f12225, 4);
        drawChild(canvas, this.f12225, getDrawingTime());
        C3677.m745(canvas, false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View, Yue.InterfaceC5171
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (m15858(this.f12225) == this) {
            C8371.m27935(this.f12225, i == 0 ? 4 : 0);
        }
    }

    @Override // Yue.InterfaceC5171
    /* JADX INFO: renamed from: ۥ */
    public void mo1943(ViewGroup viewGroup, View view) {
        this.f12223 = viewGroup;
        this.f12224 = view;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public void m15861(@InterfaceC6391 Matrix matrix) {
        this.f12227 = matrix;
    }
}
