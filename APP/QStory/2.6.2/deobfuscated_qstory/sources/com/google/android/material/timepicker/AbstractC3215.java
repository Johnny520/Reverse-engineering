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
import p305.C8651;
import p305.C8652;
import p314.AbstractC8669;

/* JADX INFO: renamed from: com.google.android.material.timepicker.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3215 extends ConstraintLayout {

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public final C8651 f10843;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public int f10844;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final RunnableC3211 f10845;

    /* JADX WARN: Type inference failed for: r6v2, types: [com.google.android.material.timepicker.飘花落叶言子楪苏世兰哲] */
    public AbstractC3215(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        LayoutInflater.from(context).inflate(R.layout.material_radial_view_group, this);
        C8651 c8651 = new C8651();
        this.f10843 = c8651;
        c8651.setShapeAppearanceModel(c8651.f24333.f24292.mo14272(new C8652(0.5f)));
        this.f10843.m14323(ColorStateList.valueOf(-1));
        setBackground(this.f10843);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC8669.f24422, R.attr.materialClockStyle, 0);
        this.f10844 = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f10845 = new Runnable() { // from class: com.google.android.material.timepicker.飘花落叶言子楪苏世兰哲
            @Override // java.lang.Runnable
            public final void run() {
                this.f10841.mo7294();
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
            RunnableC3211 runnableC3211 = this.f10845;
            handler.removeCallbacks(runnableC3211);
            handler.post(runnableC3211);
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        mo7294();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            RunnableC3211 runnableC3211 = this.f10845;
            handler.removeCallbacks(runnableC3211);
            handler.post(runnableC3211);
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        this.f10843.m14323(ColorStateList.valueOf(i));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public abstract void mo7294();
}
