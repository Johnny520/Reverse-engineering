package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.luckypray.dexkit.C1031R;
import p048b.AbstractC0550a;
import p057g.AbstractC0939y0;
import p057g.C0890a;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public boolean f1092a;

    /* JADX INFO: renamed from: b */
    public View f1093b;

    /* JADX INFO: renamed from: c */
    public View f1094c;

    /* JADX INFO: renamed from: d */
    public Drawable f1095d;

    /* JADX INFO: renamed from: e */
    public Drawable f1096e;

    /* JADX INFO: renamed from: f */
    public Drawable f1097f;

    /* JADX INFO: renamed from: g */
    public final boolean f1098g;

    /* JADX INFO: renamed from: h */
    public boolean f1099h;

    /* JADX INFO: renamed from: i */
    public final int f1100i;

    public ActionBarContainer(Context r4, AttributeSet r5) {
        super(r4, r5);
        setBackground(new C0890a(this));
        TypedArray r42 = r4.obtainStyledAttributes(r5, AbstractC0550a.f1616a);
        boolean r52 = false;
        this.f1095d = r42.getDrawable(0);
        this.f1096e = r42.getDrawable(2);
        this.f1100i = r42.getDimensionPixelSize(13, -1);
        if (getId() != C1031R.id.split_action_bar) goto L5;
        this.f1098g = true;
        this.f1097f = r42.getDrawable(1);
    L5:
        r42.recycle();
        if (this.f1098g == false) goto L11;
        if (this.f1097f != null) goto L15;
    L9:
        r52 = true;
    L15:
        setWillNotDraw(r52);
        return;
    L11:
        if (this.f1095d != null) goto L15;
        if (this.f1096e != null) goto L15;
        goto L15
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable r02 = this.f1095d;
        if (r02 != null) goto L5;
    L7:
        Drawable r03 = this.f1096e;
        if (r03 != null) goto L10;
    L12:
        Drawable r04 = this.f1097f;
        if (r04 != null) goto L15;
        return;
    L15:
        if (r04.isStateful() == false) goto L19;
        this.f1097f.setState(getDrawableState());
        return;
    L19:
        return;
    L10:
        if (r03.isStateful() == false) goto L12;
        this.f1096e.setState(getDrawableState());
        goto L12
    L5:
        if (r02.isStateful() == false) goto L7;
        this.f1095d.setState(getDrawableState());
        goto L7
    }

    public View getTabContainer() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable r02 = this.f1095d;
        if (r02 == null) goto L5;
        r02.jumpToCurrentState();
    L5:
        Drawable r03 = this.f1096e;
        if (r03 == null) goto L8;
        r03.jumpToCurrentState();
    L8:
        Drawable r04 = this.f1097f;
        if (r04 == null) goto L12;
        r04.jumpToCurrentState();
        return;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f1093b = findViewById(C1031R.id.action_bar);
        this.f1094c = findViewById(C1031R.id.action_context_bar);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent r1) {
        super.onHoverEvent(r1);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent r2) {
        if (this.f1092a == false) goto L5;
    L8:
        return true;
    L5:
        if (super.onInterceptTouchEvent(r2) == true) goto L8;
        return false;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean r3, int r4, int r5, int r6, int r7) {
        super.onLayout(r3, r4, r5, r6, r7);
        boolean r42 = true;
        if (this.f1098g == false) goto L9;
        Drawable r32 = this.f1097f;
        if (r32 == null) goto L7;
        r32.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
    L21:
        if (r42 == false) goto L24;
        invalidate();
        return;
    L24:
        return;
    L7:
        r42 = false;
        goto L21
    L9:
        if (this.f1095d != null) goto L11;
        r42 = false;
    L20:
        this.f1099h = false;
        goto L21
    L11:
        if (this.f1093b.getVisibility() != 0) goto L13;
        this.f1095d.setBounds(this.f1093b.getLeft(), this.f1093b.getTop(), this.f1093b.getRight(), this.f1093b.getBottom());
        goto L20
    L13:
        View r33 = this.f1094c;
        if (r33 != null) goto L16;
    L18:
        this.f1095d.setBounds(0, 0, 0, 0);
        goto L20
    L16:
        if (r33.getVisibility() != 0) goto L18;
        this.f1095d.setBounds(this.f1094c.getLeft(), this.f1094c.getTop(), this.f1094c.getRight(), this.f1094c.getBottom());
        goto L20
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int r3, int r4) {
        if (this.f1093b == null) goto L5;
    L9:
        super.onMeasure(r3, r4);
        if (this.f1093b != null) goto L12;
        return;
    L12:
        View.MeasureSpec.getMode(r4);
        return;
    L5:
        if (View.MeasureSpec.getMode(r4) != Integer.MIN_VALUE) goto L9;
        int r02 = this.f1100i;
        if (r02 < 0) goto L9;
        r4 = View.MeasureSpec.makeMeasureSpec(Math.min(r02, View.MeasureSpec.getSize(r4)), Integer.MIN_VALUE);
        goto L9
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent r1) {
        super.onTouchEvent(r1);
        return true;
    }

    public void setPrimaryBackground(Drawable r5) {
        Drawable r02 = this.f1095d;
        if (r02 == null) goto L5;
        r02.setCallback(null);
        unscheduleDrawable(this.f1095d);
    L5:
        this.f1095d = r5;
        if (r5 == null) goto L10;
        r5.setCallback(this);
        View r52 = this.f1093b;
        if (r52 == null) goto L10;
        this.f1095d.setBounds(r52.getLeft(), this.f1093b.getTop(), this.f1093b.getRight(), this.f1093b.getBottom());
    L10:
        boolean r03 = false;
        if (this.f1098g == false) goto L16;
        if (this.f1097f != null) goto L20;
    L14:
        r03 = true;
    L20:
        setWillNotDraw(r03);
        invalidate();
        invalidateOutline();
        return;
    L16:
        if (this.f1095d != null) goto L20;
        if (this.f1096e != null) goto L20;
        goto L20
    }

    public void setSplitBackground(Drawable r5) {
        Drawable r02 = this.f1097f;
        if (r02 == null) goto L5;
        r02.setCallback(null);
        unscheduleDrawable(this.f1097f);
    L5:
        this.f1097f = r5;
        boolean r03 = this.f1098g;
        boolean r1 = false;
        if (r5 == null) goto L13;
        r5.setCallback(this);
        if (r03 == false) goto L13;
        Drawable r52 = this.f1097f;
        if (r52 == null) goto L13;
        r52.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
    L13:
        if (r03 == false) goto L18;
        if (this.f1097f != null) goto L22;
    L16:
        r1 = true;
    L22:
        setWillNotDraw(r1);
        invalidate();
        invalidateOutline();
        return;
    L18:
        if (this.f1095d != null) goto L22;
        if (this.f1096e != null) goto L22;
        goto L22
    }

    public void setStackedBackground(Drawable r3) {
        Drawable r02 = this.f1096e;
        if (r02 == null) goto L5;
        r02.setCallback(null);
        unscheduleDrawable(this.f1096e);
    L5:
        this.f1096e = r3;
        if (r3 == null) goto L13;
        r3.setCallback(this);
        if (this.f1099h == false) goto L13;
        if (this.f1096e == null) goto L13;
        throw null;
    L13:
        boolean r03 = false;
        if (this.f1098g == false) goto L19;
        if (this.f1097f != null) goto L23;
    L17:
        r03 = true;
    L23:
        setWillNotDraw(r03);
        invalidate();
        invalidateOutline();
        return;
    L19:
        if (this.f1095d != null) goto L23;
        if (this.f1096e != null) goto L23;
        goto L23
    }

    public void setTabContainer(AbstractC0939y0 r1) {
    }

    public void setTransitioning(boolean r1) {
        this.f1092a = r1;
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
        Drawable r1 = this.f1095d;
        if (r1 == null) goto L9;
        r1.setVisible(r32, false);
    L9:
        Drawable r12 = this.f1096e;
        if (r12 == null) goto L12;
        r12.setVisible(r32, false);
    L12:
        Drawable r13 = this.f1097f;
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
        Drawable r02 = this.f1095d;
        boolean r1 = this.f1098g;
        if (r3 != r02) goto L6;
        if (r1 == true) goto L6;
    L14:
        return true;
    L6:
        if (r3 != this.f1096e) goto L10;
        if (this.f1099h == true) goto L14;
    L10:
        if (r3 != this.f1097f) goto L13;
        if (r1 == true) goto L14;
    L13:
        if (super.verifyDrawable(r3) == true) goto L14;
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View r1, ActionMode.Callback r2, int r3) {
        if (r3 != 0) goto L4;
        return null;
    L4:
        return super.startActionModeForChild(r1, r2, r3);
    }
}
