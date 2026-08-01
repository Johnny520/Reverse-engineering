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
import p000.C0200eu;
import p000.C0313hw;
import p000.C0793ut;
import p000.oa0;
import p000.z80;

/* JADX INFO: loaded from: classes.dex */
final class MaterialCalendarGridView extends GridView {

    /* JADX INFO: renamed from: a */
    public final boolean f1044a;

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        z80.m2821c(null);
        if (C0200eu.m1020G(getContext(), R.attr.windowFullscreen)) {
            setNextFocusLeftId(com.ljx.wechatmod.R.id.cancel_button);
            setNextFocusRightId(com.ljx.wechatmod.R.id.confirm_button);
        }
        this.f1044a = C0200eu.m1020G(getContext(), com.ljx.wechatmod.R.attr.nestedScrollable);
        oa0.m2012l(this, new C0793ut(2));
    }

    /* JADX INFO: renamed from: a */
    public final C0313hw m714a() {
        return (C0313hw) super.getAdapter();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final Adapter getAdapter() {
        return (C0313hw) super.getAdapter();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((C0313hw) super.getAdapter()).notifyDataSetChanged();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        C0313hw c0313hw = (C0313hw) super.getAdapter();
        c0313hw.getClass();
        int iMax = Math.max(c0313hw.m1415a(), getFirstVisiblePosition());
        int iMin = Math.min(c0313hw.m1417c(), getLastVisiblePosition());
        c0313hw.getItem(iMax);
        c0313hw.getItem(iMin);
        throw null;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        if (!z) {
            super.onFocusChanged(false, i, rect);
            return;
        }
        if (i == 33) {
            setSelection(((C0313hw) super.getAdapter()).m1417c());
        } else if (i == 130) {
            setSelection(((C0313hw) super.getAdapter()).m1415a());
        } else {
            super.onFocusChanged(true, i, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!super.onKeyDown(i, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= ((C0313hw) super.getAdapter()).m1415a()) {
            return true;
        }
        if (19 != i) {
            return false;
        }
        setSelection(((C0313hw) super.getAdapter()).m1415a());
        return true;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onMeasure(int i, int i2) {
        if (!this.f1044a) {
            super.onMeasure(i, i2);
            return;
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
        getLayoutParams().height = getMeasuredHeight();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final void setSelection(int i) {
        if (i < ((C0313hw) super.getAdapter()).m1415a()) {
            super.setSelection(((C0313hw) super.getAdapter()).m1415a());
        } else {
            super.setSelection(i);
        }
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final ListAdapter getAdapter() {
        return (C0313hw) super.getAdapter();
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (!(listAdapter instanceof C0313hw)) {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), C0313hw.class.getCanonicalName()));
        }
        super.setAdapter(listAdapter);
    }
}
