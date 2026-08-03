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
import p000.AbstractC2185lE;
import p000.AbstractC2407qD;
import p000.C0377Iq;
import p000.C0806Sq;
import p000.C1513hs;

/* JADX INFO: loaded from: classes.dex */
final class MaterialCalendarGridView extends GridView {

    /* JADX INFO: renamed from: a */
    public final boolean f4529a;

    public MaterialCalendarGridView(Context r2, AttributeSet r3) {
        super(r2, r3, 0);
        AbstractC2407qD.m4845c(null);
        if (C0806Sq.m1612F(getContext(), R.attr.windowFullscreen) == false) goto L5;
        setNextFocusLeftId(io.github.cherrywechat.R.id.cancel_button);
        setNextFocusRightId(io.github.cherrywechat.R.id.confirm_button);
    L5:
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
    public final void onDraw(Canvas r4) {
        super.onDraw(r4);
        C1513hs r42 = (C1513hs) super.getAdapter();
        r42.getClass();
        int r0 = Math.max(r42.m2886a(), getFirstVisiblePosition());
        int r1 = Math.min(r42.m2888c(), getLastVisiblePosition());
        r42.m2887b(r0);
        r42.m2887b(r1);
        throw null;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onFocusChanged(boolean r1, int r2, Rect r3) {
        if (r1 == true) goto L4;
        super.onFocusChanged(false, r2, r3);
        return;
    L4:
        if (r2 != 33) goto L8;
        setSelection(((C1513hs) super.getAdapter()).m2888c());
        return;
    L8:
        if (r2 != 130) goto L11;
        setSelection(((C1513hs) super.getAdapter()).m2886a());
        return;
    L11:
        super.onFocusChanged(true, r2, r3);
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int r4, KeyEvent r5) {
        if (super.onKeyDown(r4, r5) == true) goto L5;
        return false;
    L5:
        int r52 = getSelectedItemPosition();
        if (r52 != (-1)) goto L8;
    L17:
        return true;
    L8:
        if (r52 < ((C1513hs) super.getAdapter()).m2886a()) goto L13;
        if (r52 <= ((C1513hs) super.getAdapter()).m2888c()) goto L17;
    L13:
        if (19 != r4) goto L16;
        setSelection(((C1513hs) super.getAdapter()).m2886a());
        return true;
    L16:
        return false;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onMeasure(int r2, int r3) {
        if (this.f4529a == false) goto L6;
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
        if (r2 >= ((C1513hs) super.getAdapter()).m2886a()) goto L6;
        super.setSelection(((C1513hs) super.getAdapter()).m2886a());
        return;
    L6:
        super.setSelection(r2);
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final ListAdapter getAdapter() {
        return (C1513hs) super.getAdapter();
    }

    @Override // android.widget.GridView, android.widget.AbsListView
    public final void setAdapter(ListAdapter r3) {
        if ((r3 instanceof C1513hs) == false) goto L7;
        super.setAdapter(r3);
        return;
    L7:
        throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", new Object[]{MaterialCalendarGridView.class.getCanonicalName(), C1513hs.class.getCanonicalName()}));
    }
}
