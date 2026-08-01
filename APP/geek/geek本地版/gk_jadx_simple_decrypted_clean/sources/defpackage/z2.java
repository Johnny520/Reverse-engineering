package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import com.ljx.wechatmod.R;

/* JADX INFO: loaded from: classes.dex */
public final class z2 extends CheckedTextView {
    public final a3 a;
    public final v2 b;
    public final d5 c;
    public x3 d;

    public z2(Context r8, AttributeSet r9) {
        x60.a(r8);
        super(r8, r9, R.attr.checkedTextViewStyle);
        r60.a(this, getContext());
        d5 r82 = new d5(this);
        this.c = r82;
        r82.f(r9, R.attr.checkedTextViewStyle);
        r82.b();
        v2 r83 = new v2(this);
        this.b = r83;
        r83.d(r9, R.attr.checkedTextViewStyle);
        this.a = new a3(this);
        Context r84 = getContext();
        int[] r3 = xy.l;
        r5 r85 = r5.y(r84, r9, r3, R.attr.checkedTextViewStyle);
        TypedArray r0 = (TypedArray) r85.b;
        ja0.k(this, getContext(), r3, r9, (TypedArray) r85.b, R.attr.checkedTextViewStyle);
    L9:
        th = move-exception;
        r85.z();
        throw th;
    L4:
        if (r0.hasValue(1) == false) goto L12;
        int r92 = r0.getResourceId(1, 0);     // Catch: Throwable -> L9
        if (r92 == 0) goto L12;
        setCheckMarkDrawable(ff.r(getContext(), r92));     // Catch: Throwable -> L9 Resources.NotFoundException -> L26
    L17:
        if (r0.hasValue(2) == false) goto L20;
        setCheckMarkTintList(r85.l(2));     // Catch: Throwable -> L9
    L20:
        if (r0.hasValue(3) == false) goto L22;
        setCheckMarkTintMode(eh.b(r0.getInt(3, -1), null));     // Catch: Throwable -> L9
    L22:
        r85.z();
        getEmojiTextViewHelper().a(r9, R.attr.checkedTextViewStyle);
        return;
    L12:
        if (r0.hasValue(0) == false) goto L17;
        int r93 = r0.getResourceId(0, 0);     // Catch: Throwable -> L9
        if (r93 == 0) goto L17;
        setCheckMarkDrawable(ff.r(getContext(), r93));     // Catch: Throwable -> L9
        goto L17
    }

    private x3 getEmojiTextViewHelper() {
        if (this.d != null) goto L6;
        this.d = new x3(this);
    L6:
        return this.d;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        d5 r0 = this.c;
        if (r0 == null) goto L5;
        r0.b();
    L5:
        v2 r02 = this.b;
        if (r02 == null) goto L8;
        r02.a();
    L8:
        a3 r03 = this.a;
        if (r03 == null) goto L12;
        r03.b();
        return;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback r0 = super.getCustomSelectionActionModeCallback();
        if ((r0 instanceof o60) == true) goto L5;
        return r0;
    L5:
        return ((o60) r0).a;
    }

    public ColorStateList getSupportBackgroundTintList() {
        v2 r0 = this.b;
        if (r0 != null) goto L5;
        return null;
    L5:
        return r0.b();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        v2 r0 = this.b;
        if (r0 != null) goto L5;
        return null;
    L5:
        return r0.c();
    }

    public ColorStateList getSupportCheckMarkTintList() {
        a3 r0 = this.a;
        if (r0 != null) goto L5;
        return null;
    L5:
        return (ColorStateList) r0.a;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        a3 r0 = this.a;
        if (r0 != null) goto L5;
        return null;
    L5:
        return (PorterDuff.Mode) r0.b;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.c.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.c.e();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo r2) {
        InputConnection r0 = super.onCreateInputConnection(r2);
        a80.v(r2, r0, this);
        return r0;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean r2) {
        super.setAllCaps(r2);
        getEmojiTextViewHelper().b(r2);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable r1) {
        super.setBackgroundDrawable(r1);
        v2 r12 = this.b;
        if (r12 == null) goto L6;
        r12.e();
        return;
    }

    @Override // android.view.View
    public void setBackgroundResource(int r2) {
        super.setBackgroundResource(r2);
        v2 r0 = this.b;
        if (r0 == null) goto L6;
        r0.f(r2);
        return;
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable r2) {
        super.setCheckMarkDrawable(r2);
        a3 r22 = this.a;
        if (r22 != null) goto L5;
        return;
    L5:
        if (r22.e == false) goto L8;
        r22.e = false;
        return;
    L8:
        r22.e = true;
        r22.b();
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable r1, Drawable r2, Drawable r3, Drawable r4) {
        super.setCompoundDrawables(r1, r2, r3, r4);
        d5 r12 = this.c;
        if (r12 == null) goto L6;
        r12.b();
        return;
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable r1, Drawable r2, Drawable r3, Drawable r4) {
        super.setCompoundDrawablesRelative(r1, r2, r3, r4);
        d5 r12 = this.c;
        if (r12 == null) goto L6;
        r12.b();
        return;
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback r1) {
        super.setCustomSelectionActionModeCallback(zt.S(r1, this));
    }

    public void setEmojiCompatEnabled(boolean r2) {
        getEmojiTextViewHelper().c(r2);
    }

    public void setSupportBackgroundTintList(ColorStateList r2) {
        v2 r0 = this.b;
        if (r0 == null) goto L6;
        r0.h(r2);
        return;
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode r2) {
        v2 r0 = this.b;
        if (r0 == null) goto L6;
        r0.i(r2);
        return;
    }

    public void setSupportCheckMarkTintList(ColorStateList r2) {
        a3 r0 = this.a;
        if (r0 == null) goto L6;
        r0.a = r2;
        r0.c = true;
        r0.b();
        return;
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode r2) {
        a3 r0 = this.a;
        if (r0 == null) goto L6;
        r0.b = r2;
        r0.d = true;
        r0.b();
        return;
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList r2) {
        d5 r0 = this.c;
        r0.l(r2);
        r0.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode r2) {
        d5 r0 = this.c;
        r0.m(r2);
        r0.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context r2, int r3) {
        super.setTextAppearance(r2, r3);
        d5 r0 = this.c;
        if (r0 == null) goto L6;
        r0.g(r2, r3);
        return;
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int r2) {
        setCheckMarkDrawable(ff.r(getContext(), r2));
    }
}
