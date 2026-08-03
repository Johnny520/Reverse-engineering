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
    public static final int[] f4544g = null;

    /* JADX INFO: renamed from: d */
    public boolean f4545d;

    /* JADX INFO: renamed from: e */
    public boolean f4546e;

    /* JADX INFO: renamed from: f */
    public boolean f4547f;

    static {
        f4544g = new int[]{R.attr.state_checked};
    }

    public CheckableImageButton(Context r2, AttributeSet r3) {
        super(r2, r3, io.github.cherrywechat.R.attr.imageButtonStyle);
        this.f4546e = true;
        this.f4547f = true;
        AbstractC2185lE.m4399l(this, new C1486h8(0, this));
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f4545d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int r2) {
        if (this.f4545d == false) goto L7;
        return View.mergeDrawableStates(super.onCreateDrawableState(r2 + 1), f4544g);
    L7:
        return super.onCreateDrawableState(r2);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable r2) {
        if ((r2 instanceof C1530i8) == true) goto L6;
        super.onRestoreInstanceState(r2);
        return;
    L6:
        C1530i8 r22 = (C1530i8) r2;
        super.onRestoreInstanceState(r22.f8397a);
        setChecked(r22.f5412c);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C1530i8 r1 = new C1530i8(super.onSaveInstanceState());
        r1.f5412c = this.f4545d;
        return r1;
    }

    public void setCheckable(boolean r2) {
        if (this.f4546e == r2) goto L6;
        this.f4546e = r2;
        sendAccessibilityEvent(0);
        return;
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean r2) {
        if (this.f4546e == true) goto L5;
        return;
    L5:
        if (this.f4545d == r2) goto L9;
        this.f4545d = r2;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
        return;
    }

    public void setPressable(boolean r1) {
        this.f4547f = r1;
    }

    @Override // android.view.View
    public void setPressed(boolean r2) {
        if (this.f4547f == false) goto L6;
        super.setPressed(r2);
        return;
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f4545d);
    }
}
