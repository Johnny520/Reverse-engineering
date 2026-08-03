package com.google.android.material.snackbar;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.C1247R;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import java.util.WeakHashMap;
import p000a.C0181Jg;
import p000a.C0247Na;
import p000a.C0324Rg;
import p000a.C0336Sa;
import p000a.C0354Ta;
import p000a.C0393Vd;
import p000a.C0408Wa;
import p000a.C0655je;
import p000a.C0866ug;
import p000a.C0888w0;
import p000a.C0893w5;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseTransientBottomBar<B extends BaseTransientBottomBar<B>> {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f5860a = 0;

    public static class Behavior extends SwipeDismissBehavior<View> {

        /* JADX INFO: renamed from: i */
        public final C1308b f5861i;

        public Behavior() {
            C1308b c1308b = new C1308b();
            this.f5401f = Math.min(Math.max(0.0f, 0.1f), 1.0f);
            this.f5402g = Math.min(Math.max(0.0f, 0.6f), 1.0f);
            this.f5399d = 0;
            this.f5861i = c1308b;
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC1059c
        /* JADX INFO: renamed from: g */
        public final boolean mo1271g(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            this.f5861i.getClass();
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    synchronized (C0655je.m1519a().f2460a) {
                    }
                }
            } else if (coordinatorLayout.m2446l(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                synchronized (C0655je.m1519a().f2460a) {
                }
            }
            return super.mo1271g(coordinatorLayout, view, motionEvent);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior
        /* JADX INFO: renamed from: s */
        public final boolean mo3085s(View view) {
            this.f5861i.getClass();
            return view instanceof C1309c;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$a */
    public class C1307a implements Handler.Callback {
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                ((BaseTransientBottomBar) message.obj).getClass();
                throw null;
            }
            if (i != 1) {
                return false;
            }
            ((BaseTransientBottomBar) message.obj).getClass();
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$b */
    public static class C1308b {
    }

    /* JADX INFO: renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$c */
    public static class C1309c extends FrameLayout {

        /* JADX INFO: renamed from: j */
        public static final a f5862j = new a();

        /* JADX INFO: renamed from: a */
        public BaseTransientBottomBar<?> f5863a;

        /* JADX INFO: renamed from: b */
        public final C0393Vd f5864b;

        /* JADX INFO: renamed from: c */
        public int f5865c;

        /* JADX INFO: renamed from: d */
        public final float f5866d;

        /* JADX INFO: renamed from: e */
        public final float f5867e;

        /* JADX INFO: renamed from: f */
        public final int f5868f;

        /* JADX INFO: renamed from: g */
        public final int f5869g;

        /* JADX INFO: renamed from: h */
        public ColorStateList f5870h;

        /* JADX INFO: renamed from: i */
        public PorterDuff.Mode f5871i;

        /* JADX INFO: renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$c$a */
        public class a implements View.OnTouchListener {
            @Override // android.view.View.OnTouchListener
            @SuppressLint({"ClickableViewAccessibility"})
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        }

        public C1309c(Context context, AttributeSet attributeSet) {
            Drawable drawable;
            super(C0408Wa.m1054a(context, attributeSet, 0, 0), attributeSet);
            Context context2 = getContext();
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, C1247R.styleable.SnackbarLayout);
            if (typedArrayObtainStyledAttributes.hasValue(C1247R.styleable.SnackbarLayout_elevation)) {
                float dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(C1247R.styleable.SnackbarLayout_elevation, 0);
                WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
                C0866ug.d.m2027s(this, dimensionPixelSize);
            }
            this.f5865c = typedArrayObtainStyledAttributes.getInt(C1247R.styleable.SnackbarLayout_animationMode, 0);
            if (typedArrayObtainStyledAttributes.hasValue(C1247R.styleable.SnackbarLayout_shapeAppearance) || typedArrayObtainStyledAttributes.hasValue(C1247R.styleable.SnackbarLayout_shapeAppearanceOverlay)) {
                this.f5864b = C0393Vd.m1023b(context2, attributeSet, 0, 0).m1028a();
            }
            this.f5866d = typedArrayObtainStyledAttributes.getFloat(C1247R.styleable.SnackbarLayout_backgroundOverlayColorAlpha, 1.0f);
            setBackgroundTintList(C0336Sa.m925b(context2, typedArrayObtainStyledAttributes, C1247R.styleable.SnackbarLayout_backgroundTint));
            setBackgroundTintMode(C0324Rg.m896b(typedArrayObtainStyledAttributes.getInt(C1247R.styleable.SnackbarLayout_backgroundTintMode, -1), PorterDuff.Mode.SRC_IN));
            this.f5867e = typedArrayObtainStyledAttributes.getFloat(C1247R.styleable.SnackbarLayout_actionTextColorAlpha, 1.0f);
            this.f5868f = typedArrayObtainStyledAttributes.getDimensionPixelSize(C1247R.styleable.SnackbarLayout_android_maxWidth, -1);
            this.f5869g = typedArrayObtainStyledAttributes.getDimensionPixelSize(C1247R.styleable.SnackbarLayout_maxActionInlineWidth, -1);
            typedArrayObtainStyledAttributes.recycle();
            setOnTouchListener(f5862j);
            setFocusable(true);
            if (getBackground() == null) {
                int iM686d = C0247Na.m686d(C0247Na.m684b(this, C1247R.attr.colorSurface), C0247Na.m684b(this, C1247R.attr.colorOnSurface), getBackgroundOverlayColorAlpha());
                C0393Vd c0393Vd = this.f5864b;
                if (c0393Vd != null) {
                    int i = BaseTransientBottomBar.f5860a;
                    C0354Ta c0354Ta = new C0354Ta(c0393Vd);
                    c0354Ta.m967k(ColorStateList.valueOf(iM686d));
                    drawable = c0354Ta;
                } else {
                    Resources resources = getResources();
                    int i2 = BaseTransientBottomBar.f5860a;
                    float dimension = resources.getDimension(C1247R.dimen.mtrl_snackbar_background_corner_radius);
                    GradientDrawable gradientDrawable = new GradientDrawable();
                    gradientDrawable.setShape(0);
                    gradientDrawable.setCornerRadius(dimension);
                    gradientDrawable.setColor(iM686d);
                    drawable = gradientDrawable;
                }
                ColorStateList colorStateList = this.f5870h;
                if (colorStateList != null) {
                    C0893w5.a.m2176h(drawable, colorStateList);
                }
                WeakHashMap<View, C0181Jg> weakHashMap2 = C0866ug.f3395a;
                setBackground(drawable);
            }
        }

        private void setBaseTransientBottomBar(BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.f5863a = baseTransientBottomBar;
        }

        public float getActionTextColorAlpha() {
            return this.f5867e;
        }

        public int getAnimationMode() {
            return this.f5865c;
        }

        public float getBackgroundOverlayColorAlpha() {
            return this.f5866d;
        }

        public int getMaxInlineActionWidth() {
            return this.f5869g;
        }

        public int getMaxWidth() {
            return this.f5868f;
        }

        @Override // android.view.ViewGroup, android.view.View
        public final void onAttachedToWindow() {
            super.onAttachedToWindow();
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f5863a;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.getClass();
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
            }
            WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
            C0866ug.c.m2008c(this);
        }

        @Override // android.view.ViewGroup, android.view.View
        public final void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            if (this.f5863a != null) {
                synchronized (C0655je.m1519a().f2460a) {
                }
            }
        }

        @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
        public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            if (this.f5863a != null) {
                throw null;
            }
        }

        @Override // android.widget.FrameLayout, android.view.View
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            int i3 = this.f5868f;
            if (i3 <= 0 || getMeasuredWidth() <= i3) {
                return;
            }
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
        }

        public void setAnimationMode(int i) {
            this.f5865c = i;
        }

        @Override // android.view.View
        public void setBackground(Drawable drawable) {
            setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundDrawable(Drawable drawable) {
            if (drawable != null && this.f5870h != null) {
                drawable = drawable.mutate();
                C0893w5.a.m2176h(drawable, this.f5870h);
                C0893w5.a.m2177i(drawable, this.f5871i);
            }
            super.setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundTintList(ColorStateList colorStateList) {
            this.f5870h = colorStateList;
            if (getBackground() != null) {
                Drawable drawableMutate = getBackground().mutate();
                C0893w5.a.m2176h(drawableMutate, colorStateList);
                C0893w5.a.m2177i(drawableMutate, this.f5871i);
                if (drawableMutate != getBackground()) {
                    super.setBackgroundDrawable(drawableMutate);
                }
            }
        }

        @Override // android.view.View
        public void setBackgroundTintMode(PorterDuff.Mode mode) {
            this.f5871i = mode;
            if (getBackground() != null) {
                Drawable drawableMutate = getBackground().mutate();
                C0893w5.a.m2177i(drawableMutate, mode);
                if (drawableMutate != getBackground()) {
                    super.setBackgroundDrawable(drawableMutate);
                }
            }
        }

        @Override // android.view.View
        public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            super.setLayoutParams(layoutParams);
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                if (this.f5863a == null) {
                    return;
                }
                int i = BaseTransientBottomBar.f5860a;
                throw null;
            }
        }

        @Override // android.view.View
        public void setOnClickListener(View.OnClickListener onClickListener) {
            setOnTouchListener(onClickListener != null ? null : f5862j);
            super.setOnClickListener(onClickListener);
        }
    }

    static {
        LinearInterpolator linearInterpolator = C0888w0.f3468a;
        new Handler(Looper.getMainLooper(), new C1307a());
    }
}
