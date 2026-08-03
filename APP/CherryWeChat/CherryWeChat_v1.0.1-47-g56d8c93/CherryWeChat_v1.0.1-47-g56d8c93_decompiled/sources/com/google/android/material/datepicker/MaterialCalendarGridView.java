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
import p000.AbstractC2185lE;
import p000.AbstractC2407qD;
import p000.C0377Iq;
import p000.C0806Sq;
import p000.C1513hs;

/* JADX INFO: loaded from: classes.dex */
final class MaterialCalendarGridView extends GridView {

    /* JADX INFO: renamed from: a */
    public final boolean f4529a;

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        AbstractC2407qD.m4845c(null);
        if (C0806Sq.m1612F(getContext(), R.attr.windowFullscreen)) {
            setNextFocusLeftId(io.github.cherrywechat.R.id.cancel_button);
            setNextFocusRightId(io.github.cherrywechat.R.id.confirm_button);
        }
        this.f4529a = C0806Sq.m1612F(getContext(), io.github.cherrywechat.R.attr.nestedScrollable);
        AbstractC2185lE.m4399l(this, new C0377Iq(2));
    }

    /* JADX INFO: renamed from: a */
    public final C1513hs m2467a() {
        return (C1513hs) super.getAdapter();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final Adapter getAdapter() {
        return (C1513hs) super.getAdapter();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((C1513hs) super.getAdapter()).notifyDataSetChanged();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        C1513hs c1513hs = (C1513hs) super.getAdapter();
        c1513hs.getClass();
        int iMax = Math.max(c1513hs.m2886a(), getFirstVisiblePosition());
        int iMin = Math.min(c1513hs.m2888c(), getLastVisiblePosition());
        c1513hs.getItem(iMax);
        c1513hs.getItem(iMin);
        throw null;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        if (!z) {
            super.onFocusChanged(false, i, rect);
            return;
        }
        if (i == 33) {
            setSelection(((C1513hs) super.getAdapter()).m2888c());
        } else if (i == 130) {
            setSelection(((C1513hs) super.getAdapter()).m2886a());
        } else {
            super.onFocusChanged(true, i, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!super.onKeyDown(i, keyEvent)) {
            return false;
        }
        int selectedItemPosition = getSelectedItemPosition();
        if (selectedItemPosition == -1 || (selectedItemPosition >= ((C1513hs) super.getAdapter()).m2886a() && selectedItemPosition <= ((C1513hs) super.getAdapter()).m2888c())) {
            return true;
        }
        if (19 != i) {
            return false;
        }
        setSelection(((C1513hs) super.getAdapter()).m2886a());
        return true;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onMeasure(int i, int i2) {
        if (!this.f4529a) {
            super.onMeasure(i, i2);
            return;
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
        getLayoutParams().height = getMeasuredHeight();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final void setSelection(int i) {
        if (i < ((C1513hs) super.getAdapter()).m2886a()) {
            super.setSelection(((C1513hs) super.getAdapter()).m2886a());
        } else {
            super.setSelection(i);
        }
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final ListAdapter getAdapter() {
        return (C1513hs) super.getAdapter();
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (!(listAdapter instanceof C1513hs)) {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), C1513hs.class.getCanonicalName()));
        }
        super.setAdapter(listAdapter);
    }
}
