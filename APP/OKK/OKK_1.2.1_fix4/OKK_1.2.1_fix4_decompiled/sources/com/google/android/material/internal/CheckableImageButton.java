package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import org.luckypray.dexkit.C1031R;
import p006D.AbstractC0080Q;
import p057g.C0934w;
import p070m0.C0994d;
import p081s0.C1067a;

/* JADX INFO: loaded from: classes.dex */
public class CheckableImageButton extends C0934w implements Checkable {

    /* JADX INFO: renamed from: g */
    public static final int[] f2392g = {R.attr.state_checked};

    /* JADX INFO: renamed from: d */
    public boolean f2393d;

    /* JADX INFO: renamed from: e */
    public boolean f2394e;

    /* JADX INFO: renamed from: f */
    public boolean f2395f;

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, C1031R.attr.imageButtonStyle);
        this.f2394e = true;
        this.f2395f = true;
        AbstractC0080Q.m291j(this, new C0994d(this, 1));
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f2393d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i2) {
        return this.f2393d ? View.mergeDrawableStates(super.onCreateDrawableState(i2 + 1), f2392g) : super.onCreateDrawableState(i2);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C1067a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C1067a c1067a = (C1067a) parcelable;
        super.onRestoreInstanceState(c1067a.f481a);
        setChecked(c1067a.f4093c);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C1067a c1067a = new C1067a(super.onSaveInstanceState());
        c1067a.f4093c = this.f2393d;
        return c1067a;
    }

    public void setCheckable(boolean z2) {
        if (this.f2394e != z2) {
            this.f2394e = z2;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z2) {
        if (!this.f2394e || this.f2393d == z2) {
            return;
        }
        this.f2393d = z2;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    public void setPressable(boolean z2) {
        this.f2395f = z2;
    }

    @Override // android.view.View
    public void setPressed(boolean z2) {
        if (this.f2395f) {
            super.setPressed(z2);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f2393d);
    }
}
