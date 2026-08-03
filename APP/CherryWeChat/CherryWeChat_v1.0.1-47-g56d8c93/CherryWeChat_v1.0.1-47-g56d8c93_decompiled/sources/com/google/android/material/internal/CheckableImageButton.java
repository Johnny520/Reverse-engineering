package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import p000.AbstractC2185lE;
import p000.C0434K3;
import p000.C1486h8;
import p000.C1530i8;

/* JADX INFO: loaded from: classes.dex */
public class CheckableImageButton extends C0434K3 implements Checkable {

    /* JADX INFO: renamed from: g */
    public static final int[] f4544g = {R.attr.state_checked};

    /* JADX INFO: renamed from: d */
    public boolean f4545d;

    /* JADX INFO: renamed from: e */
    public boolean f4546e;

    /* JADX INFO: renamed from: f */
    public boolean f4547f;

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, io.github.cherrywechat.R.attr.imageButtonStyle);
        this.f4546e = true;
        this.f4547f = true;
        AbstractC2185lE.m4399l(this, new C1486h8(0, this));
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f4545d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        return this.f4545d ? View.mergeDrawableStates(super.onCreateDrawableState(i + 1), f4544g) : super.onCreateDrawableState(i);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C1530i8)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C1530i8 c1530i8 = (C1530i8) parcelable;
        super.onRestoreInstanceState(c1530i8.f8397a);
        setChecked(c1530i8.f5412c);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C1530i8 c1530i8 = new C1530i8(super.onSaveInstanceState());
        c1530i8.f5412c = this.f4545d;
        return c1530i8;
    }

    public void setCheckable(boolean z) {
        if (this.f4546e != z) {
            this.f4546e = z;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (!this.f4546e || this.f4545d == z) {
            return;
        }
        this.f4545d = z;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    public void setPressable(boolean z) {
        this.f4547f = z;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        if (this.f4547f) {
            super.setPressed(z);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f4545d);
    }
}
