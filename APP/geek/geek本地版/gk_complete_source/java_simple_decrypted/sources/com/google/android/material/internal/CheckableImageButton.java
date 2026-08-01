package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import defpackage.aa;
import defpackage.ba;
import defpackage.ja0;
import defpackage.y3;

/* JADX INFO: loaded from: classes.dex */
public class CheckableImageButton extends y3 implements Checkable {
    public static final int[] g = null;
    public boolean d;
    public boolean e;
    public boolean f;

    static {
        g = new int[]{R.attr.state_checked};
    }

    public CheckableImageButton(Context r2, AttributeSet r3) {
        super(r2, r3, com.ljx.wechatmod.R.attr.imageButtonStyle);
        this.e = true;
        this.f = true;
        ja0.l(this, new aa(0, this));
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int r2) {
        if (this.d == false) goto L7;
        return View.mergeDrawableStates(super.onCreateDrawableState(r2 + 1), g);
    L7:
        return super.onCreateDrawableState(r2);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable r2) {
        if ((r2 instanceof ba) == true) goto L6;
        super.onRestoreInstanceState(r2);
        return;
    L6:
        ba r22 = (ba) r2;
        super.onRestoreInstanceState(r22.a);
        setChecked(r22.c);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        ba r1 = new ba(super.onSaveInstanceState());
        r1.c = this.d;
        return r1;
    }

    public void setCheckable(boolean r2) {
        if (this.e == r2) goto L6;
        this.e = r2;
        sendAccessibilityEvent(0);
        return;
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean r2) {
        if (this.e == true) goto L5;
        return;
    L5:
        if (this.d == r2) goto L9;
        this.d = r2;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
        return;
    }

    public void setPressable(boolean r1) {
        this.f = r1;
    }

    @Override // android.view.View
    public void setPressed(boolean r2) {
        if (this.f == false) goto L6;
        super.setPressed(r2);
        return;
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.d);
    }
}
