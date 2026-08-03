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
import com.google.android.material.C1247R;
import java.util.Calendar;
import java.util.Iterator;
import p000a.C0103Fa;
import p000a.C0467Zf;
import p000a.C0729nc;
import p000a.C0866ug;
import p000a.InterfaceC0151I4;

/* JADX INFO: loaded from: classes.dex */
final class MaterialCalendarGridView extends GridView {

    /* JADX INFO: renamed from: a */
    public final Calendar f5678a;

    /* JADX INFO: renamed from: b */
    public final boolean f5679b;

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f5678a = C0467Zf.m1139e(null);
        if (C1285d.m3218J(getContext(), R.attr.windowFullscreen)) {
            setNextFocusLeftId(C1247R.id.cancel_button);
            setNextFocusRightId(C1247R.id.confirm_button);
        }
        this.f5679b = C1285d.m3218J(getContext(), C1247R.attr.nestedScrollable);
        C0866ug.m2003j(this, new C0103Fa(1));
    }

    /* JADX INFO: renamed from: a */
    public final C1286e m3212a() {
        return (C1286e) super.getAdapter();
    }

    /* JADX INFO: renamed from: b */
    public final View m3213b(int i) {
        return getChildAt(i - getFirstVisiblePosition());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.GridView, android.widget.AdapterView
    public final Adapter getAdapter() {
        return (C1286e) super.getAdapter();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((C1286e) super.getAdapter()).notifyDataSetChanged();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        C1286e c1286e = (C1286e) super.getAdapter();
        InterfaceC0151I4<?> interfaceC0151I4 = c1286e.f5746b;
        int iMax = Math.max(c1286e.m3222b(), getFirstVisiblePosition());
        int iMin = Math.min(c1286e.m3224d(), getLastVisiblePosition());
        c1286e.getItem(iMax);
        c1286e.getItem(iMin);
        Iterator<C0729nc<Long, Long>> it = interfaceC0151I4.m427e().iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw null;
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        if (!z) {
            super.onFocusChanged(false, i, rect);
            return;
        }
        if (i == 33) {
            setSelection(((C1286e) super.getAdapter()).m3224d());
        } else if (i == 130) {
            setSelection(((C1286e) super.getAdapter()).m3222b());
        } else {
            super.onFocusChanged(true, i, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!super.onKeyDown(i, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= ((C1286e) super.getAdapter()).m3222b()) {
            return true;
        }
        if (19 != i) {
            return false;
        }
        setSelection(((C1286e) super.getAdapter()).m3222b());
        return true;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onMeasure(int i, int i2) {
        if (!this.f5679b) {
            super.onMeasure(i, i2);
            return;
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
        getLayoutParams().height = getMeasuredHeight();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final void setSelection(int i) {
        if (i < ((C1286e) super.getAdapter()).m3222b()) {
            super.setSelection(((C1286e) super.getAdapter()).m3222b());
        } else {
            super.setSelection(i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.widget.GridView, android.widget.AdapterView
    public final ListAdapter getAdapter() {
        return (C1286e) super.getAdapter();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: setAdapter(Landroid/widget/Adapter;)V */
    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (!(listAdapter instanceof C1286e)) {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), C1286e.class.getCanonicalName()));
        }
        super.setAdapter(listAdapter);
    }
}
