package com.google.android.exoplayer2.p001ui;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p000.InterfaceC0012AB;
import p000.ViewOnClickListenerC2343p0;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class TrackSelectionView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public final CheckedTextView f4360a;

    /* JADX INFO: renamed from: b */
    public final CheckedTextView f4361b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f4362c;

    /* JADX INFO: renamed from: d */
    public final HashMap f4363d;

    /* JADX INFO: renamed from: e */
    public boolean f4364e;

    /* JADX INFO: renamed from: f */
    public boolean f4365f;

    /* JADX INFO: renamed from: g */
    public CheckedTextView[][] f4366g;

    /* JADX INFO: renamed from: h */
    public boolean f4367h;

    public TrackSelectionView(Context r7, AttributeSet r8) {
        super(r7, r8, 0);
        setOrientation(1);
        setSaveFromParentEnabled(false);
        TypedArray r1 = r7.getTheme().obtainStyledAttributes(new int[]{R.attr.selectableItemBackground});
        int r2 = r1.getResourceId(0, 0);
        r1.recycle();
        LayoutInflater r72 = LayoutInflater.from(r7);
        ViewOnClickListenerC2343p0 r12 = new ViewOnClickListenerC2343p0(5, this);
        getResources().getClass();
        this.f4362c = new ArrayList();
        this.f4363d = new HashMap();
        CheckedTextView r4 = (CheckedTextView) r72.inflate(R.layout.simple_list_item_single_choice, this, false);
        this.f4360a = r4;
        r4.setBackgroundResource(r2);
        r4.setText(io.github.cherrywechat.R.string.exo_track_selection_none);
        r4.setEnabled(false);
        r4.setFocusable(true);
        r4.setOnClickListener(r12);
        r4.setVisibility(8);
        addView(r4);
        addView(r72.inflate(io.github.cherrywechat.R.layout.exo_list_divider, this, false));
        CheckedTextView r73 = (CheckedTextView) r72.inflate(R.layout.simple_list_item_single_choice, this, false);
        this.f4361b = r73;
        r73.setBackgroundResource(r2);
        r73.setText(io.github.cherrywechat.R.string.exo_track_selection_auto);
        r73.setEnabled(false);
        r73.setFocusable(true);
        r73.setOnClickListener(r12);
        addView(r73);
    }

    /* JADX INFO: renamed from: a */
    public final void m2418a() {
        this.f4360a.setChecked(this.f4367h);
        if (this.f4367h == false) goto L5;
    L7:
        boolean r0 = false;
    L8:
        this.f4361b.setChecked(r0);
        if (this.f4366g.length > 0) goto L11;
        return;
    L11:
        this.f4362c.get(0).getClass();
        throw new ClassCastException();
    L5:
        if (this.f4363d.size() != 0) goto L7;
        r0 = true;
        goto L8
    }

    /* JADX INFO: renamed from: b */
    public final void m2419b() {
        int r0 = getChildCount() - 1;
    L4:
        if (r0 < 3) goto L6;
        removeViewAt(r0);
        r0 = r0 - 1;
        goto L4
    L6:
        ArrayList r02 = this.f4362c;
        boolean r2 = r02.isEmpty();
        CheckedTextView r3 = this.f4361b;
        CheckedTextView r4 = this.f4360a;
        if (r2 == false) goto L10;
        r4.setEnabled(false);
        r3.setEnabled(false);
        return;
    L10:
        r4.setEnabled(true);
        r3.setEnabled(true);
        this.f4366g = new CheckedTextView[r02.size()][];
        if (this.f4365f == false) goto L14;
        r02.size();
    L14:
        if (r02.size() > 0) goto L18;
        m2418a();
        return;
    L18:
        if (r02.get(0) != null) goto L24;
        if (this.f4364e == true) goto L22;
        throw null;
    L22:
        throw null;
    L24:
        throw new ClassCastException();
    }

    public boolean getIsDisabled() {
        return this.f4367h;
    }

    public Map<Object, Object> getOverrides() {
        return this.f4363d;
    }

    public void setAllowAdaptiveSelections(boolean r2) {
        if (this.f4364e == r2) goto L6;
        this.f4364e = r2;
        m2419b();
        return;
    }

    public void setAllowMultipleOverrides(boolean r4) {
        if (this.f4365f == r4) goto L15;
        this.f4365f = r4;
        if (r4 == true) goto L13;
        HashMap r42 = this.f4363d;
        if (r42.size() <= 1) goto L13;
        HashMap r0 = new HashMap();
        ArrayList r1 = this.f4362c;
        if (r1.size() > 0) goto L11;
        r42.clear();
        r42.putAll(r0);
        goto L13
    L11:
        r1.get(0).getClass();
        throw new ClassCastException();
    L13:
        m2419b();
        return;
    }

    public void setShowDisableOption(boolean r2) {
        if (r2 == false) goto L4;
        int r22 = 0;
    L5:
        this.f4360a.setVisibility(r22);
        return;
    L4:
        r22 = 8;
        goto L5
    }

    public void setTrackNameProvider(InterfaceC0012AB r1) {
        r1.getClass();
        m2419b();
    }
}
