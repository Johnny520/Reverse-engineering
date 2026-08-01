package com.lxj.xpopup.widget;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.davemorrissey.labs.subscaleview.C0328R;
import com.lxj.xpopup.util.AbstractC4620;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class VerticalRecyclerView extends RecyclerView {
    public VerticalRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        getContext();
        setLayoutManager(new LinearLayoutManager(1));
    }

    public void setupDivider(Boolean bool) {
        C4624 c4624 = new C4624(getContext());
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(getResources().getColor(bool.booleanValue() ? C0328R.color._xpopup_list_dark_divider : C0328R.color._xpopup_list_divider));
        gradientDrawable.setSize(10, AbstractC4620.m8665(getContext(), 0.5f));
        c4624.f12297 = gradientDrawable;
        m5291(c4624);
    }
}
