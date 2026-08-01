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
import defpackage.aw;
import defpackage.bu;
import defpackage.ja0;
import defpackage.qt;
import defpackage.u80;

/* JADX INFO: loaded from: classes.dex */
final class MaterialCalendarGridView extends GridView {
    public final boolean a;

    public MaterialCalendarGridView(Context r2, AttributeSet r3) {
        super(r2, r3, 0);
        u80.c(null);
        if (bu.G(getContext(), R.attr.windowFullscreen) == false) goto L5;
        setNextFocusLeftId(com.ljx.wechatmod.R.id.cancel_button);
        setNextFocusRightId(com.ljx.wechatmod.R.id.confirm_button);
    L5:
        this.a = bu.G(getContext(), com.ljx.wechatmod.R.attr.nestedScrollable);
        ja0.l(this, new qt(2));
    }

    public final aw a() {
        return (aw) super.getAdapter();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final Adapter getAdapter() {
        return (aw) super.getAdapter();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((aw) super.getAdapter()).notifyDataSetChanged();
    }

    @Override // android.view.View
    public final void onDraw(Canvas r4) {
        super.onDraw(r4);
        aw r42 = (aw) super.getAdapter();
        r42.getClass();
        int r0 = Math.max(r42.a(), getFirstVisiblePosition());
        int r1 = Math.min(r42.c(), getLastVisiblePosition());
        r42.b(r0);
        r42.b(r1);
        throw null;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onFocusChanged(boolean r1, int r2, Rect r3) {
        if (r1 == true) goto L4;
        super.onFocusChanged(false, r2, r3);
        return;
    L4:
        if (r2 != 33) goto L8;
        setSelection(((aw) super.getAdapter()).c());
        return;
    L8:
        if (r2 != 130) goto L11;
        setSelection(((aw) super.getAdapter()).a());
        return;
    L11:
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
        if (getSelectedItemPosition() >= ((aw) super.getAdapter()).a()) goto L15;
        if (19 != r4) goto L14;
        setSelection(((aw) super.getAdapter()).a());
        return true;
    L14:
        return false;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onMeasure(int r2, int r3) {
        if (this.a == false) goto L6;
        super.onMeasure(r2, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
        ViewGroup.LayoutParams r22 = getLayoutParams();
        r22.height = getMeasuredHeight();
        return;
    L6:
        super.onMeasure(r2, r3);
    }

    @Override // android.widget.AdapterView
    public final /* bridge */ /* synthetic */ void setAdapter(Adapter r1) {
        setAdapter((ListAdapter) r1);
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final void setSelection(int r2) {
        if (r2 >= ((aw) super.getAdapter()).a()) goto L6;
        super.setSelection(((aw) super.getAdapter()).a());
        return;
    L6:
        super.setSelection(r2);
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final ListAdapter getAdapter() {
        return (aw) super.getAdapter();
    }

    @Override // android.widget.GridView, android.widget.AbsListView
    public final void setAdapter(ListAdapter r3) {
        if ((r3 instanceof aw) == false) goto L7;
        super.setAdapter(r3);
        return;
    L7:
        throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", new Object[]{MaterialCalendarGridView.class.getCanonicalName(), aw.class.getCanonicalName()}));
    }
}
