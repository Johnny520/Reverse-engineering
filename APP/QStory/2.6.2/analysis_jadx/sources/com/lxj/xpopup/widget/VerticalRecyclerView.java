package com.lxj.xpopup.widget;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.davemorrissey.labs.subscaleview.R;
import com.lxj.xpopup.util.AbstractC3787;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class VerticalRecyclerView extends RecyclerView {
    public VerticalRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        getContext();
        setLayoutManager(new LinearLayoutManager(1));
    }

    public void setupDivider(Boolean bool) {
        C3791 c3791 = new C3791(getContext());
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(getResources().getColor(bool.booleanValue() ? R.color._xpopup_list_dark_divider : R.color._xpopup_list_divider));
        gradientDrawable.setSize(10, AbstractC3787.m8119(getContext(), 0.5f));
        c3791.f11947 = gradientDrawable;
        m4721(c3791);
    }
}
