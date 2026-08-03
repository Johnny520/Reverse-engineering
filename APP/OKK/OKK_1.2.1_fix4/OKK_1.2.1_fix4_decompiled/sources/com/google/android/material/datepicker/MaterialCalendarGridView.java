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
import org.luckypray.dexkit.C1031R;
import p006D.AbstractC0080Q;
import p017J.C0219h;

/* JADX INFO: loaded from: classes.dex */
final class MaterialCalendarGridView extends GridView {

    /* JADX INFO: renamed from: a */
    public final boolean f2388a;

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        AbstractC0721f.m1880a(null);
        if (C0717b.m1876j(getContext(), R.attr.windowFullscreen)) {
            setNextFocusLeftId(C1031R.id.cancel_button);
            setNextFocusRightId(C1031R.id.confirm_button);
        }
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
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        AbstractC0719d abstractC0719d = (AbstractC0719d) super.getAdapter();
        abstractC0719d.getClass();
        int iMax = Math.max(abstractC0719d.m1877a(), getFirstVisiblePosition());
        int iMin = Math.min(abstractC0719d.m1879c(), getLastVisiblePosition());
        abstractC0719d.m1878b(iMax);
        abstractC0719d.m1878b(iMin);
        throw null;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onFocusChanged(boolean z2, int i2, Rect rect) {
        if (!z2) {
            super.onFocusChanged(false, i2, rect);
            return;
        }
        if (i2 == 33) {
            setSelection(((AbstractC0719d) super.getAdapter()).m1879c());
        } else if (i2 == 130) {
            setSelection(((AbstractC0719d) super.getAdapter()).m1877a());
        } else {
            super.onFocusChanged(true, i2, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (!super.onKeyDown(i2, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= ((AbstractC0719d) super.getAdapter()).m1877a()) {
            return true;
        }
        if (19 != i2) {
            return false;
        }
        setSelection(((AbstractC0719d) super.getAdapter()).m1877a());
        return true;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onMeasure(int i2, int i3) {
        if (!this.f2388a) {
            super.onMeasure(i2, i3);
            return;
        }
        super.onMeasure(i2, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
        getLayoutParams().height = getMeasuredHeight();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final void setSelection(int i2) {
        if (i2 < ((AbstractC0719d) super.getAdapter()).m1877a()) {
            super.setSelection(((AbstractC0719d) super.getAdapter()).m1877a());
        } else {
            super.setSelection(i2);
        }
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final ListAdapter getAdapter() {
        return (AbstractC0719d) super.getAdapter();
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (!(listAdapter instanceof AbstractC0719d)) {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), AbstractC0719d.class.getCanonicalName()));
        }
        super.setAdapter(listAdapter);
    }
}
