package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.davemorrissey.labs.subscaleview.R;
import p305.C8643;
import p305.C8644;
import p314.AbstractC8661;

/* JADX INFO: renamed from: com.google.android.material.timepicker.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3216 extends ConstraintLayout {

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public final C8643 f10848;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public int f10849;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final RunnableC3212 f10850;

    /* JADX WARN: Type inference failed for: r6v2, types: [com.google.android.material.timepicker.飘花落叶言子楪苏世兰哲] */
    public AbstractC3216(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        LayoutInflater.from(context).inflate(R.layout.material_radial_view_group, this);
        C8643 c8643 = new C8643();
        this.f10848 = c8643;
        c8643.setShapeAppearanceModel(c8643.f24324.f24283.mo14291(new C8644(0.5f)));
        this.f10848.m14341(ColorStateList.valueOf(-1));
        setBackground(this.f10848);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC8661.f24413, R.attr.materialClockStyle, 0);
        this.f10849 = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f10850 = new Runnable() { // from class: com.google.android.material.timepicker.飘花落叶言子楪苏世兰哲
            @Override // java.lang.Runnable
            public final void run() {
                this.f10846.mo7281();
            }
        };
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (view.getId() == -1) {
            view.setId(View.generateViewId());
        }
        Handler handler = getHandler();
        if (handler != null) {
            RunnableC3212 runnableC3212 = this.f10850;
            handler.removeCallbacks(runnableC3212);
            handler.post(runnableC3212);
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        mo7281();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            RunnableC3212 runnableC3212 = this.f10850;
            handler.removeCallbacks(runnableC3212);
            handler.post(runnableC3212);
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        this.f10848.m14341(ColorStateList.valueOf(i));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public abstract void mo7281();
}
