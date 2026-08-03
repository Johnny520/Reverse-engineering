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
    public static final int[] f2392g = null;

    /* JADX INFO: renamed from: d */
    public boolean f2393d;

    /* JADX INFO: renamed from: e */
    public boolean f2394e;

    /* JADX INFO: renamed from: f */
    public boolean f2395f;

    static {
        f2392g = new int[]{R.attr.state_checked};
    }

    public CheckableImageButton(Context r2, AttributeSet r3) {
        super(r2, r3, C1031R.attr.imageButtonStyle);
        this.f2394e = true;
        this.f2395f = true;
        AbstractC0080Q.m291j(this, new C0994d(this, 1));
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f2393d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int r2) {
        if (this.f2393d == false) goto L7;
        return View.mergeDrawableStates(super.onCreateDrawableState(r2 + 1), f2392g);
    L7:
        return super.onCreateDrawableState(r2);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable r2) {
        if ((r2 instanceof C1067a) == true) goto L6;
        super.onRestoreInstanceState(r2);
        return;
    L6:
        C1067a r22 = (C1067a) r2;
        super.onRestoreInstanceState(r22.f481a);
        setChecked(r22.f4093c);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C1067a r1 = new C1067a(super.onSaveInstanceState());
        r1.f4093c = this.f2393d;
        return r1;
    }

    public void setCheckable(boolean r2) {
        if (this.f2394e == r2) goto L6;
        this.f2394e = r2;
        sendAccessibilityEvent(0);
        return;
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean r2) {
        if (this.f2394e == true) goto L5;
        return;
    L5:
        if (this.f2393d == r2) goto L9;
        this.f2393d = r2;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
        return;
    }

    public void setPressable(boolean r1) {
        this.f2395f = r1;
    }

    @Override // android.view.View
    public void setPressed(boolean r2) {
        if (this.f2395f == false) goto L6;
        super.setPressed(r2);
        return;
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f2393d);
    }
}
