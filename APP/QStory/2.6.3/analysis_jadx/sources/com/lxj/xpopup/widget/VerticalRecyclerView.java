package com.lxj.xpopup.widget;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.davemorrissey.labs.subscaleview.R;
import com.lxj.xpopup.util.AbstractC3788;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class VerticalRecyclerView extends RecyclerView {
    public VerticalRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        getContext();
        setLayoutManager(new LinearLayoutManager(1));
    }

    public void setupDivider(Boolean bool) {
        C3792 c3792 = new C3792(getContext());
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(getResources().getColor(bool.booleanValue() ? R.color._xpopup_list_dark_divider : R.color._xpopup_list_divider));
        gradientDrawable.setSize(10, AbstractC3788.m8106(getContext(), 0.5f));
        c3792.f11952 = gradientDrawable;
        m4731(c3792);
    }
}
