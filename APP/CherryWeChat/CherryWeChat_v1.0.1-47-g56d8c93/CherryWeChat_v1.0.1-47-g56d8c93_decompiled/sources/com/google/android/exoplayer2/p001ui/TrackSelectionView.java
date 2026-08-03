package com.google.android.exoplayer2.p001ui;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
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

    public TrackSelectionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setOrientation(1);
        setSaveFromParentEnabled(false);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.selectableItemBackground});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        ViewOnClickListenerC2343p0 viewOnClickListenerC2343p0 = new ViewOnClickListenerC2343p0(5, this);
        getResources().getClass();
        this.f4362c = new ArrayList();
        this.f4363d = new HashMap();
        CheckedTextView checkedTextView = (CheckedTextView) layoutInflaterFrom.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.f4360a = checkedTextView;
        checkedTextView.setBackgroundResource(resourceId);
        checkedTextView.setText(io.github.cherrywechat.R.string.exo_track_selection_none);
        checkedTextView.setEnabled(false);
        checkedTextView.setFocusable(true);
        checkedTextView.setOnClickListener(viewOnClickListenerC2343p0);
        checkedTextView.setVisibility(8);
        addView(checkedTextView);
        addView(layoutInflaterFrom.inflate(io.github.cherrywechat.R.layout.exo_list_divider, (ViewGroup) this, false));
        CheckedTextView checkedTextView2 = (CheckedTextView) layoutInflaterFrom.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.f4361b = checkedTextView2;
        checkedTextView2.setBackgroundResource(resourceId);
        checkedTextView2.setText(io.github.cherrywechat.R.string.exo_track_selection_auto);
        checkedTextView2.setEnabled(false);
        checkedTextView2.setFocusable(true);
        checkedTextView2.setOnClickListener(viewOnClickListenerC2343p0);
        addView(checkedTextView2);
    }

    /* JADX INFO: renamed from: a */
    public final void m2418a() {
        this.f4360a.setChecked(this.f4367h);
        this.f4361b.setChecked(!this.f4367h && this.f4363d.size() == 0);
        if (this.f4366g.length <= 0) {
            return;
        }
        this.f4362c.get(0).getClass();
        throw new ClassCastException();
    }

    /* JADX INFO: renamed from: b */
    public final void m2419b() {
        for (int childCount = getChildCount() - 1; childCount >= 3; childCount--) {
            removeViewAt(childCount);
        }
        ArrayList arrayList = this.f4362c;
        boolean zIsEmpty = arrayList.isEmpty();
        CheckedTextView checkedTextView = this.f4361b;
        CheckedTextView checkedTextView2 = this.f4360a;
        if (zIsEmpty) {
            checkedTextView2.setEnabled(false);
            checkedTextView.setEnabled(false);
            return;
        }
        checkedTextView2.setEnabled(true);
        checkedTextView.setEnabled(true);
        this.f4366g = new CheckedTextView[arrayList.size()][];
        if (this.f4365f) {
            arrayList.size();
        }
        if (arrayList.size() > 0) {
            if (arrayList.get(0) != null) {
                throw new ClassCastException();
            }
            if (!this.f4364e) {
                throw null;
            }
            throw null;
        }
        m2418a();
    }

    public boolean getIsDisabled() {
        return this.f4367h;
    }

    public Map<Object, Object> getOverrides() {
        return this.f4363d;
    }

    public void setAllowAdaptiveSelections(boolean z) {
        if (this.f4364e != z) {
            this.f4364e = z;
            m2419b();
        }
    }

    public void setAllowMultipleOverrides(boolean z) {
        if (this.f4365f != z) {
            this.f4365f = z;
            if (!z) {
                HashMap map = this.f4363d;
                if (map.size() > 1) {
                    HashMap map2 = new HashMap();
                    ArrayList arrayList = this.f4362c;
                    if (arrayList.size() > 0) {
                        arrayList.get(0).getClass();
                        throw new ClassCastException();
                    }
                    map.clear();
                    map.putAll(map2);
                }
            }
            m2419b();
        }
    }

    public void setShowDisableOption(boolean z) {
        this.f4360a.setVisibility(z ? 0 : 8);
    }

    public void setTrackNameProvider(InterfaceC0012AB interfaceC0012AB) {
        interfaceC0012AB.getClass();
        m2419b();
    }
}
