package com.google.android.material.timepicker;

import Yue.C8273;
import Yue.InterfaceC3897;
import Yue.InterfaceC4399;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.C8770;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.C1980R;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.RelativeCornerSize;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
class RadialViewGroup extends ConstraintLayout {
    static final int LEVEL_1 = 1;
    static final int LEVEL_2 = 2;
    static final float LEVEL_RADIUS_RATIO = 0.66f;
    private static final String SKIP_TAG = "skip";
    private MaterialShapeDrawable background;
    private int radius;
    private final Runnable updateLayoutParametersRunnable;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public RadialViewGroup(@InterfaceC6391 Context context) {
        this(context, null);
    }

    private void addConstraints(List<View> list, C8770 c8770, int i) {
        Iterator<View> it = list.iterator();
        float size = 0.0f;
        while (it.hasNext()) {
            c8770.m29377(it.next().getId(), C1980R.id.circle_center, i, size);
            size += 360.0f / list.size();
        }
    }

    private Drawable createBackground() {
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
        this.background = materialShapeDrawable;
        materialShapeDrawable.setCornerSize(new RelativeCornerSize(0.5f));
        this.background.setFillColor(ColorStateList.valueOf(-1));
        return this.background;
    }

    private static boolean shouldSkipView(View view) {
        return SKIP_TAG.equals(view.getTag());
    }

    private void updateLayoutParamsAsync() {
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.updateLayoutParametersRunnable);
            handler.post(this.updateLayoutParametersRunnable);
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (view.getId() == -1) {
            view.setId(C8273.m27331());
        }
        updateLayoutParamsAsync();
    }

    @InterfaceC4399
    public int getLeveledRadius(int i) {
        return i == 2 ? Math.round(this.radius * LEVEL_RADIUS_RATIO) : this.radius;
    }

    @InterfaceC4399
    public int getRadius() {
        return this.radius;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        updateLayoutParams();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        updateLayoutParamsAsync();
    }

    @Override // android.view.View
    public void setBackgroundColor(@InterfaceC3897 int i) {
        this.background.setFillColor(ColorStateList.valueOf(i));
    }

    public void setRadius(@InterfaceC4399 int i) {
        this.radius = i;
        updateLayoutParams();
    }

    public void updateLayoutParams() {
        C8770 c8770 = new C8770();
        c8770.m29372(this);
        HashMap map = new HashMap();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getId() != C1980R.id.circle_center && !shouldSkipView(childAt)) {
                int i2 = (Integer) childAt.getTag(C1980R.id.material_clock_level);
                if (i2 == null) {
                    i2 = 1;
                }
                if (!map.containsKey(i2)) {
                    map.put(i2, new ArrayList());
                }
                ((List) map.get(i2)).add(childAt);
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            addConstraints((List) entry.getValue(), c8770, getLeveledRadius(((Integer) entry.getKey()).intValue()));
        }
        c8770.m29357(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public RadialViewGroup(@InterfaceC6391 Context context, @InterfaceC6490 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RadialViewGroup(@InterfaceC6391 Context context, @InterfaceC6490 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(C1980R.layout.material_radial_view_group, this);
        C8273.m27447(this, createBackground());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1980R.styleable.RadialViewGroup, i, 0);
        this.radius = typedArrayObtainStyledAttributes.getDimensionPixelSize(C1980R.styleable.RadialViewGroup_materialCircleRadius, 0);
        this.updateLayoutParametersRunnable = new Runnable() { // from class: com.google.android.material.timepicker.ۥ۟
            @Override // java.lang.Runnable
            public final void run() {
                this.f30426.updateLayoutParams();
            }
        };
        typedArrayObtainStyledAttributes.recycle();
    }
}
