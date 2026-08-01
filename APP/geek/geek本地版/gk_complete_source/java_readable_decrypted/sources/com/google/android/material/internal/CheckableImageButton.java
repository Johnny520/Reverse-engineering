package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import p000.C0011aa;
import p000.C0061ba;
import p000.C0916y3;
import p000.ja0;

/* JADX INFO: loaded from: classes.dex */
public class CheckableImageButton extends C0916y3 implements Checkable {

    /* JADX INFO: renamed from: g */
    public static final int[] f1128g = {R.attr.state_checked};

    /* JADX INFO: renamed from: d */
    public boolean f1129d;

    /* JADX INFO: renamed from: e */
    public boolean f1130e;

    /* JADX INFO: renamed from: f */
    public boolean f1131f;

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.ljx.wechatmod.R.attr.imageButtonStyle);
        this.f1130e = true;
        this.f1131f = true;
        ja0.m1575l(this, new C0011aa(0, this));
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f1129d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        return this.f1129d ? View.mergeDrawableStates(super.onCreateDrawableState(i + 1), f1128g) : super.onCreateDrawableState(i);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0061ba)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0061ba c0061ba = (C0061ba) parcelable;
        super.onRestoreInstanceState(c0061ba.f1344a);
        setChecked(c0061ba.f803c);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C0061ba c0061ba = new C0061ba(super.onSaveInstanceState());
        c0061ba.f803c = this.f1129d;
        return c0061ba;
    }

    public void setCheckable(boolean z) {
        if (this.f1130e != z) {
            this.f1130e = z;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (!this.f1130e || this.f1129d == z) {
            return;
        }
        this.f1129d = z;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    public void setPressable(boolean z) {
        this.f1131f = z;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        if (this.f1131f) {
            super.setPressed(z);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f1129d);
    }
}
