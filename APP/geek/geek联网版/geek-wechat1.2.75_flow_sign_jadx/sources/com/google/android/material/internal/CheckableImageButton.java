package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import p000.C0328ia;
import p000.C0367ja;
import p000.C0916y3;
import p000.oa0;

/* JADX INFO: loaded from: classes.dex */
public class CheckableImageButton extends C0916y3 implements Checkable {

    /* JADX INFO: renamed from: g */
    public static final int[] f1053g = {R.attr.state_checked};

    /* JADX INFO: renamed from: d */
    public boolean f1054d;

    /* JADX INFO: renamed from: e */
    public boolean f1055e;

    /* JADX INFO: renamed from: f */
    public boolean f1056f;

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.ljx.wechatmod.R.attr.imageButtonStyle);
        this.f1055e = true;
        this.f1056f = true;
        oa0.m2012l(this, new C0328ia(0, this));
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f1054d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        return this.f1054d ? View.mergeDrawableStates(super.onCreateDrawableState(i + 1), f1053g) : super.onCreateDrawableState(i);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0367ja)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0367ja c0367ja = (C0367ja) parcelable;
        super.onRestoreInstanceState(c0367ja.f1274a);
        setChecked(c0367ja.f2690c);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C0367ja c0367ja = new C0367ja(super.onSaveInstanceState());
        c0367ja.f2690c = this.f1054d;
        return c0367ja;
    }

    public void setCheckable(boolean z) {
        if (this.f1055e != z) {
            this.f1055e = z;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (!this.f1055e || this.f1054d == z) {
            return;
        }
        this.f1054d = z;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    public void setPressable(boolean z) {
        this.f1056f = z;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        if (this.f1056f) {
            super.setPressed(z);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f1054d);
    }
}
