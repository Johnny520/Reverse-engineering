package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import io.github.cherrywechat.R;
import p000.AbstractC0982Wu;
import p000.AbstractC2562tx;
import p000.C2300o0;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public boolean f3716a;

    /* JADX INFO: renamed from: b */
    public View f3717b;

    /* JADX INFO: renamed from: c */
    public View f3718c;

    /* JADX INFO: renamed from: d */
    public Drawable f3719d;

    /* JADX INFO: renamed from: e */
    public Drawable f3720e;

    /* JADX INFO: renamed from: f */
    public Drawable f3721f;

    /* JADX INFO: renamed from: g */
    public final boolean f3722g;

    /* JADX INFO: renamed from: h */
    public boolean f3723h;

    /* JADX INFO: renamed from: i */
    public final int f3724i;

    public ActionBarContainer(Context r4, AttributeSet r5) {
        super(r4, r5);
        setBackground(new C2300o0(this));
        TypedArray r42 = r4.obtainStyledAttributes(r5, AbstractC0982Wu.f3066a);
        boolean r52 = false;
        this.f3719d = r42.getDrawable(0);
        this.f3720e = r42.getDrawable(2);
        this.f3724i = r42.getDimensionPixelSize(13, -1);
        if (getId() != R.id.split_action_bar) goto L5;
        this.f3722g = true;
        this.f3721f = r42.getDrawable(1);
    L5:
        r42.recycle();
        if (this.f3722g == false) goto L11;
        if (this.f3721f != null) goto L15;
    L9:
        r52 = true;
    L15:
        setWillNotDraw(r52);
        return;
    L11:
        if (this.f3719d != null) goto L15;
        if (this.f3720e != null) goto L15;
        goto L15
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable r0 = this.f3719d;
        if (r0 != null) goto L5;
    L7:
        Drawable r02 = this.f3720e;
        if (r02 != null) goto L10;
    L12:
        Drawable r03 = this.f3721f;
        if (r03 != null) goto L15;
        return;
    L15:
        if (r03.isStateful() == false) goto L19;
        this.f3721f.setState(getDrawableState());
        return;
    L19:
        return;
    L10:
        if (r02.isStateful() == false) goto L12;
        this.f3720e.setState(getDrawableState());
        goto L12
    L5:
        if (r0.isStateful() == false) goto L7;
        this.f3719d.setState(getDrawableState());
        goto L7
    }

    public View getTabContainer() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable r0 = this.f3719d;
        if (r0 == null) goto L5;
        r0.jumpToCurrentState();
    L5:
        Drawable r02 = this.f3720e;
        if (r02 == null) goto L8;
        r02.jumpToCurrentState();
    L8:
        Drawable r03 = this.f3721f;
        if (r03 == null) goto L12;
        r03.jumpToCurrentState();
        return;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f3717b = findViewById(R.id.action_bar);
        this.f3718c = findViewById(R.id.action_context_bar);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent r1) {
        super.onHoverEvent(r1);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent r2) {
        if (this.f3716a == false) goto L5;
        return true;
    L5:
        if (super.onInterceptTouchEvent(r2) == true) goto L11;
        return false;
    L11:
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean r4, int r5, int r6, int r7, int r8) {
        super.onLayout(r4, r5, r6, r7, r8);
        boolean r62 = true;
        if (this.f3722g == false) goto L9;
        Drawable r52 = this.f3721f;
        if (r52 == null) goto L7;
        r52.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
    L21:
        if (r62 == false) goto L24;
        invalidate();
        return;
    L24:
        return;
    L7:
        r62 = false;
        goto L21
    L9:
        if (this.f3719d != null) goto L11;
        r62 = false;
    L20:
        this.f3723h = false;
        goto L21
    L11:
        if (this.f3717b.getVisibility() != 0) goto L13;
        this.f3719d.setBounds(this.f3717b.getLeft(), this.f3717b.getTop(), this.f3717b.getRight(), this.f3717b.getBottom());
        goto L20
    L13:
        View r53 = this.f3718c;
        if (r53 != null) goto L16;
    L18:
        this.f3719d.setBounds(0, 0, 0, 0);
        goto L20
    L16:
        if (r53.getVisibility() != 0) goto L18;
        this.f3719d.setBounds(this.f3718c.getLeft(), this.f3718c.getTop(), this.f3718c.getRight(), this.f3718c.getBottom());
        goto L20
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int r3, int r4) {
        if (this.f3717b == null) goto L5;
    L9:
        super.onMeasure(r3, r4);
        if (this.f3717b != null) goto L12;
        return;
    L12:
        View.MeasureSpec.getMode(r4);
        return;
    L5:
        if (View.MeasureSpec.getMode(r4) != Integer.MIN_VALUE) goto L9;
        int r0 = this.f3724i;
        if (r0 < 0) goto L9;
        r4 = View.MeasureSpec.makeMeasureSpec(Math.min(r0, View.MeasureSpec.getSize(r4)), Integer.MIN_VALUE);
        goto L9
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent r1) {
        super.onTouchEvent(r1);
        return true;
    }

    public void setPrimaryBackground(Drawable r5) {
        Drawable r0 = this.f3719d;
        if (r0 == null) goto L5;
        r0.setCallback(null);
        unscheduleDrawable(this.f3719d);
    L5:
        this.f3719d = r5;
        if (r5 == null) goto L10;
        r5.setCallback(this);
        View r52 = this.f3717b;
        if (r52 == null) goto L10;
        this.f3719d.setBounds(r52.getLeft(), this.f3717b.getTop(), this.f3717b.getRight(), this.f3717b.getBottom());
    L10:
        boolean r02 = false;
        if (this.f3722g == false) goto L16;
        if (this.f3721f != null) goto L20;
    L14:
        r02 = true;
    L20:
        setWillNotDraw(r02);
        invalidate();
        invalidateOutline();
        return;
    L16:
        if (this.f3719d != null) goto L20;
        if (this.f3720e != null) goto L20;
        goto L20
    }

    public void setSplitBackground(Drawable r5) {
        Drawable r0 = this.f3721f;
        if (r0 == null) goto L5;
        r0.setCallback(null);
        unscheduleDrawable(this.f3721f);
    L5:
        this.f3721f = r5;
        boolean r02 = this.f3722g;
        boolean r1 = false;
        if (r5 == null) goto L13;
        r5.setCallback(this);
        if (r02 == false) goto L13;
        Drawable r52 = this.f3721f;
        if (r52 == null) goto L13;
        r52.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
    L13:
        if (r02 == false) goto L18;
        if (this.f3721f != null) goto L22;
    L16:
        r1 = true;
    L22:
        setWillNotDraw(r1);
        invalidate();
        invalidateOutline();
        return;
    L18:
        if (this.f3719d != null) goto L22;
        if (this.f3720e != null) goto L22;
        goto L22
    }

    public void setStackedBackground(Drawable r3) {
        Drawable r0 = this.f3720e;
        if (r0 == null) goto L5;
        r0.setCallback(null);
        unscheduleDrawable(this.f3720e);
    L5:
        this.f3720e = r3;
        if (r3 == null) goto L13;
        r3.setCallback(this);
        if (this.f3723h == false) goto L13;
        if (this.f3720e == null) goto L13;
        throw null;
    L13:
        boolean r02 = false;
        if (this.f3722g == false) goto L19;
        if (this.f3721f != null) goto L23;
    L17:
        r02 = true;
    L23:
        setWillNotDraw(r02);
        invalidate();
        invalidateOutline();
        return;
    L19:
        if (this.f3719d != null) goto L23;
        if (this.f3720e != null) goto L23;
        goto L23
    }

    public void setTabContainer(AbstractC2562tx r1) {
    }

    public void setTransitioning(boolean r1) {
        this.f3716a = r1;
        if (r1 == false) goto L5;
        int r12 = 393216;
    L6:
        setDescendantFocusability(r12);
        return;
    L5:
        r12 = 262144;
        goto L6
    }

    @Override // android.view.View
    public void setVisibility(int r3) {
        super.setVisibility(r3);
        if (r3 != 0) goto L5;
        boolean r32 = true;
    L6:
        Drawable r1 = this.f3719d;
        if (r1 == null) goto L9;
        r1.setVisible(r32, false);
    L9:
        Drawable r12 = this.f3720e;
        if (r12 == null) goto L12;
        r12.setVisible(r32, false);
    L12:
        Drawable r13 = this.f3721f;
        if (r13 == null) goto L16;
        r13.setVisible(r32, false);
        return;
    L16:
        return;
    L5:
        r32 = false;
        goto L6
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View r1, ActionMode.Callback r2) {
        return null;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable r3) {
        Drawable r0 = this.f3719d;
        boolean r1 = this.f3722g;
        if (r3 != r0) goto L6;
        if (r1 == true) goto L6;
        return true;
    L6:
        if (r3 != this.f3720e) goto L10;
        if (this.f3723h == false) goto L10;
        return true;
    L10:
        if (r3 != this.f3721f) goto L13;
        if (r1 == false) goto L13;
        return true;
    L13:
        if (super.verifyDrawable(r3) == true) goto L20;
        return false;
    L20:
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View r1, ActionMode.Callback r2, int r3) {
        if (r3 != 0) goto L4;
        return null;
    L4:
        return super.startActionModeForChild(r1, r2, r3);
    }
}
