package com.google.android.material.datepicker;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Adapter;
import android.widget.GridView;
import android.widget.ListAdapter;
import p000.C0046aw;
import p000.C0081bu;
import p000.C0646qt;
import p000.ja0;
import p000.u80;

/* JADX INFO: loaded from: classes.dex */
final class MaterialCalendarGridView extends GridView {

    /* JADX INFO: renamed from: a */
    public final boolean f1119a;

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        u80.m2428c(null);
        if (C0081bu.m571G(getContext(), R.attr.windowFullscreen)) {
            setNextFocusLeftId(com.ljx.wechatmod.R.id.cancel_button);
            setNextFocusRightId(com.ljx.wechatmod.R.id.confirm_button);
        }
        this.f1119a = C0081bu.m571G(getContext(), com.ljx.wechatmod.R.attr.nestedScrollable);
        ja0.m1575l(this, new C0646qt(2));
    }

    /* JADX INFO: renamed from: a */
    public final C0046aw m756a() {
        return (C0046aw) super.getAdapter();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final Adapter getAdapter() {
        return (C0046aw) super.getAdapter();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((C0046aw) super.getAdapter()).notifyDataSetChanged();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        C0046aw c0046aw = (C0046aw) super.getAdapter();
        c0046aw.getClass();
        int iMax = Math.max(c0046aw.m475a(), getFirstVisiblePosition());
        int iMin = Math.min(c0046aw.m477c(), getLastVisiblePosition());
        c0046aw.getItem(iMax);
        c0046aw.getItem(iMin);
        throw null;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        if (!z) {
            super.onFocusChanged(false, i, rect);
            return;
        }
        if (i == 33) {
            setSelection(((C0046aw) super.getAdapter()).m477c());
        } else if (i == 130) {
            setSelection(((C0046aw) super.getAdapter()).m475a());
        } else {
            super.onFocusChanged(true, i, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!super.onKeyDown(i, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= ((C0046aw) super.getAdapter()).m475a()) {
            return true;
        }
        if (19 != i) {
            return false;
        }
        setSelection(((C0046aw) super.getAdapter()).m475a());
        return true;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onMeasure(int i, int i2) {
        if (!this.f1119a) {
            super.onMeasure(i, i2);
            return;
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
        getLayoutParams().height = getMeasuredHeight();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final void setSelection(int i) {
        if (i < ((C0046aw) super.getAdapter()).m475a()) {
            super.setSelection(((C0046aw) super.getAdapter()).m475a());
        } else {
            super.setSelection(i);
        }
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final ListAdapter getAdapter() {
        return (C0046aw) super.getAdapter();
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (!(listAdapter instanceof C0046aw)) {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), C0046aw.class.getCanonicalName()));
        }
        super.setAdapter(listAdapter);
    }
}
