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

    public AbstractC0727e(Context r5, AttributeSet r6) {
        super(r5, r6, C1031R.attr.materialClockStyle);
        LayoutInflater.from(r5).inflate(C1031R.layout.material_radial_view_group, this);
        C1123g r1 = new C1123g();
        this.f2552r = r1;
        C1124h r2 = new C1124h(0.5f);
        C1126j r3 = r1.f4312a.f4290a.m2660d();
        r3.f4339e = r2;
        r3.f4340f = r2;
        r3.f4341g = r2;
        r3.f4342h = r2;
        r1.setShapeAppearanceModel(r3.m2656a());
        this.f2552r.m2651k(ColorStateList.valueOf(-1));
        C1123g r12 = this.f2552r;
        Field r22 = AbstractC0080Q.f219a;
        setBackground(r12);
        TypedArray r52 = r5.obtainStyledAttributes(r6, AbstractC0942a.f3342n, C1031R.attr.materialClockStyle, 0);
        this.f2551q = r52.getDimensionPixelSize(0, 0);
        this.f2550p = new RunnableC0028d(8, this);
        r52.recycle();
    }

    @Override // android.view.ViewGroup
    public final void addView(View r1, int r2, ViewGroup.LayoutParams r3) {
        super.addView(r1, r2, r3);
        if (r1.getId() != (-1)) goto L5;
        Field r22 = AbstractC0080Q.f219a;
        r1.setId(View.generateViewId());
    L5:
        Handler r12 = getHandler();
        if (r12 == null) goto L9;
        RunnableC0028d r23 = this.f2550p;
        r12.removeCallbacks(r23);
        r12.post(r23);
        return;
    }

    /* JADX INFO: renamed from: f */
    public abstract void mo1912f();

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        mo1912f();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View r2) {
        super.onViewRemoved(r2);
        Handler r22 = getHandler();
        if (r22 == null) goto L6;
        RunnableC0028d r02 = this.f2550p;
        r22.removeCallbacks(r02);
        r22.post(r02);
        return;
    }

    @Override // android.view.View
    public final void setBackgroundColor(int r2) {
        this.f2552r.m2651k(ColorStateList.valueOf(r2));
    }
}
