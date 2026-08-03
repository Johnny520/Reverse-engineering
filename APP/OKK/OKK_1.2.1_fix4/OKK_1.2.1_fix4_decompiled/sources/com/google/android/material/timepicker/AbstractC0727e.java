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
import java.lang.reflect.Field;
import org.luckypray.dexkit.C1031R;
import p001A0.RunnableC0028d;
import p006D.AbstractC0080Q;
import p058g0.AbstractC0942a;
import p089x0.C1123g;
import p089x0.C1124h;
import p089x0.C1126j;

/* JADX INFO: renamed from: com.google.android.material.timepicker.e */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0727e extends ConstraintLayout {

    /* JADX INFO: renamed from: p */
    public final RunnableC0028d f2550p;

    /* JADX INFO: renamed from: q */
    public int f2551q;

    /* JADX INFO: renamed from: r */
    public final C1123g f2552r;

    public AbstractC0727e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, C1031R.attr.materialClockStyle);
        LayoutInflater.from(context).inflate(C1031R.layout.material_radial_view_group, this);
        C1123g c1123g = new C1123g();
        this.f2552r = c1123g;
        C1124h c1124h = new C1124h(0.5f);
        C1126j c1126jM2660d = c1123g.f4312a.f4290a.m2660d();
        c1126jM2660d.f4339e = c1124h;
        c1126jM2660d.f4340f = c1124h;
        c1126jM2660d.f4341g = c1124h;
        c1126jM2660d.f4342h = c1124h;
        c1123g.setShapeAppearanceModel(c1126jM2660d.m2656a());
        this.f2552r.m2651k(ColorStateList.valueOf(-1));
        C1123g c1123g2 = this.f2552r;
        Field field = AbstractC0080Q.f219a;
        setBackground(c1123g2);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0942a.f3342n, C1031R.attr.materialClockStyle, 0);
        this.f2551q = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f2550p = new RunnableC0028d(8, this);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i2, layoutParams);
        if (view.getId() == -1) {
            Field field = AbstractC0080Q.f219a;
            view.setId(View.generateViewId());
        }
        Handler handler = getHandler();
        if (handler != null) {
            RunnableC0028d runnableC0028d = this.f2550p;
            handler.removeCallbacks(runnableC0028d);
            handler.post(runnableC0028d);
        }
    }

    /* JADX INFO: renamed from: f */
    public abstract void mo1912f();

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        mo1912f();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            RunnableC0028d runnableC0028d = this.f2550p;
            handler.removeCallbacks(runnableC0028d);
            handler.post(runnableC0028d);
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i2) {
        this.f2552r.m2651k(ColorStateList.valueOf(i2));
    }
}
