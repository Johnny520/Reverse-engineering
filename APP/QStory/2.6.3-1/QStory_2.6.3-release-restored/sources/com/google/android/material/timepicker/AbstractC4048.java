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
import com.davemorrissey.labs.subscaleview.C0328R;
import p321.C9472;
import p321.C9473;
import p330.AbstractC9490;

/* JADX INFO: renamed from: com.google.android.material.timepicker.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4048 extends ConstraintLayout {

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public final C9472 f11193;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public int f11194;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final RunnableC4044 f11195;

    /* JADX WARN: Type inference failed for: r6v2, types: [com.google.android.material.timepicker.飘花落叶言子楪苏世兰哲] */
    public AbstractC4048(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, C0328R.attr.materialClockStyle);
        LayoutInflater.from(context).inflate(C0328R.layout.material_radial_view_group, this);
        C9472 c9472 = new C9472();
        this.f11193 = c9472;
        c9472.setShapeAppearanceModel(c9472.f24669.f24628.mo14850(new C9473(0.5f)));
        this.f11193.m14900(ColorStateList.valueOf(-1));
        setBackground(this.f11193);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC9490.f24758, C0328R.attr.materialClockStyle, 0);
        this.f11194 = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f11195 = new Runnable() { // from class: com.google.android.material.timepicker.飘花落叶言子楪苏世兰哲
            @Override // java.lang.Runnable
            public final void run() {
                this.f11191.mo7840();
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
            RunnableC4044 runnableC4044 = this.f11195;
            handler.removeCallbacks(runnableC4044);
            handler.post(runnableC4044);
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        mo7840();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            RunnableC4044 runnableC4044 = this.f11195;
            handler.removeCallbacks(runnableC4044);
            handler.post(runnableC4044);
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        this.f11193.m14900(ColorStateList.valueOf(i));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public abstract void mo7840();
}
