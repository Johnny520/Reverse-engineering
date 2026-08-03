package com.google.android.material.datepicker;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.GridView;
import android.widget.ListAdapter;
import org.luckypray.dexkit.C1031R;
import p006D.AbstractC0080Q;
import p017J.C0219h;

/* JADX INFO: loaded from: classes.dex */
final class MaterialCalendarGridView extends GridView {

    /* JADX INFO: renamed from: a */
    public final boolean f2388a;

    public MaterialCalendarGridView(Context r2, AttributeSet r3) {
        super(r2, r3, 0);
        AbstractC0721f.m1880a(null);
        if (C0717b.m1876j(getContext(), R.attr.windowFullscreen) == false) goto L5;
        setNextFocusLeftId(C1031R.id.cancel_button);
        setNextFocusRightId(C1031R.id.confirm_button);
    L5:
        this.f2388a = C0717b.m1876j(getContext(), C1031R.attr.nestedScrollable);
        AbstractC0080Q.m291j(this, new C0219h(1));
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final Adapter getAdapter() {
        return (AbstractC0719d) super.getAdapter();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((AbstractC0719d) super.getAdapter()).notifyDataSetChanged();
    }

    @Override // android.view.View
    public final void onDraw(Canvas r4) {
        super.onDraw(r4);
        AbstractC0719d r42 = (AbstractC0719d) super.getAdapter();
        r42.getClass();
        int r02 = Math.max(r42.m1877a(), getFirstVisiblePosition());
        int r1 = Math.min(r42.m1879c(), getLastVisiblePosition());
        r42.m1878b(r02);
        r42.m1878b(r1);
        throw null;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onFocusChanged(boolean r1, int r2, Rect r3) {
        if (r1 == true) goto L4;
        super.onFocusChanged(false, r2, r3);
        return;
    L4:
        if (r2 != 33) goto L7;
        setSelection(((AbstractC0719d) super.getAdapter()).m1879c());
        return;
    L7:
        if (r2 != 130) goto L9;
        setSelection(((AbstractC0719d) super.getAdapter()).m1877a());
        return;
    L9:
        super.onFocusChanged(true, r2, r3);
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int r4, KeyEvent r5) {
        if (super.onKeyDown(r4, r5) == true) goto L6;
        return false;
    L6:
        if (getSelectedItemPosition() != (-1)) goto L8;
    L15:
        return true;
    L8:
        if (getSelectedItemPosition() >= ((AbstractC0719d) super.getAdapter()).m1877a()) goto L15;
        if (19 != r4) goto L14;
        setSelection(((AbstractC0719d) super.getAdapter()).m1877a());
        return true;
    L14:
        return false;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onMeasure(int r2, int r3) {
        if (this.f2388a == false) goto L5;
        super.onMeasure(r2, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
        ViewGroup.LayoutParams r22 = getLayoutParams();
        r22.height = getMeasuredHeight();
        return;
    L5:
        super.onMeasure(r2, r3);
    }

    @Override // android.widget.AdapterView
    public final /* bridge */ /* synthetic */ void setAdapter(Adapter r1) {
        setAdapter((ListAdapter) r1);
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final void setSelection(int r2) {
        if (r2 >= ((AbstractC0719d) super.getAdapter()).m1877a()) goto L5;
        super.setSelection(((AbstractC0719d) super.getAdapter()).m1877a());
        return;
    L5:
        super.setSelection(r2);
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final ListAdapter getAdapter() {
        return (AbstractC0719d) super.getAdapter();
    }

    @Override // android.widget.GridView, android.widget.AbsListView
    public final void setAdapter(ListAdapter r3) {
        if ((r3 instanceof AbstractC0719d) == false) goto L7;
        super.setAdapter(r3);
        return;
    L7:
        throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", new Object[]{MaterialCalendarGridView.class.getCanonicalName(), AbstractC0719d.class.getCanonicalName()}));
    }
}
