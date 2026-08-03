package com.google.android.material.textfield;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import io.github.cherrywechat.R;
import java.util.Locale;
import p000.AbstractC0148Dc;
import p000.AbstractC0939Vu;
import p000.AbstractC1293cr;
import p000.C0348I3;

/* JADX INFO: loaded from: classes.dex */
public class TextInputEditText extends C0348I3 {

    /* JADX INFO: renamed from: f */
    public final Rect f4588f;

    /* JADX INFO: renamed from: g */
    public boolean f4589g;

    public TextInputEditText(Context r8, AttributeSet r9) {
        super(AbstractC0148Dc.m291y(r8, r9, R.attr.editTextStyle, 0), r9);
        this.f4588f = new Rect();
        AbstractC1293cr.m2547f(r8, r9, R.attr.editTextStyle, R.style.Widget_Design_TextInputEditText);
        int[] r2 = AbstractC0939Vu.f2929C;
        AbstractC1293cr.m2549h(r8, r9, r2, R.attr.editTextStyle, R.style.Widget_Design_TextInputEditText, new int[0]);
        TypedArray r82 = r8.obtainStyledAttributes(r9, r2, R.attr.editTextStyle, R.style.Widget_Design_TextInputEditText);
        setTextInputLayoutFocusedRectEnabled(r82.getBoolean(0, false));
        r82.recycle();
    }

    private CharSequence getHintFromLayout() {
        TextInputLayout r0 = getTextInputLayout();
        if (r0 != null) goto L5;
        return null;
    L5:
        return r0.getHint();
    }

    private TextInputLayout getTextInputLayout() {
        ViewParent r0 = getParent();
    L4:
        if ((r0 instanceof View) == false) goto L10;
        if ((r0 instanceof TextInputLayout) == true) goto L8;
        r0 = r0.getParent();
        goto L4
    L8:
        return (TextInputLayout) r0;
    L10:
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect r3) {
        super.getFocusedRect(r3);
        TextInputLayout r0 = getTextInputLayout();
        if (r0 != null) goto L5;
        return;
    L5:
        if (this.f4589g == false) goto L10;
        if (r3 == null) goto L11;
        Rect r1 = this.f4588f;
        r0.getFocusedRect(r1);
        r3.bottom = r1.bottom;
        return;
    L11:
        return;
    }

    @Override // android.view.View
    public final boolean getGlobalVisibleRect(Rect r3, Point r4) {
        TextInputLayout r0 = getTextInputLayout();
        if (r0 == null) goto L12;
        if (this.f4589g == false) goto L12;
        boolean r32 = r0.getGlobalVisibleRect(r3, r4);
        if (r32 == false) goto L10;
        if (r4 == null) goto L10;
        r4.offset(-getScrollX(), -getScrollY());
    L10:
        return r32;
    L12:
        return super.getGlobalVisibleRect(r3, r4);
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout r0 = getTextInputLayout();
        if (r0 == null) goto L9;
        if (r0.f4599F == false) goto L9;
        return r0.getHint();
    L9:
        return super.getHint();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout r0 = getTextInputLayout();
        if (r0 != null) goto L5;
        return;
    L5:
        if (r0.f4599F == true) goto L7;
        return;
    L7:
        if (super.getHint() != null) goto L18;
        String r02 = Build.MANUFACTURER;
        if (r02 == null) goto L11;
        String r03 = r02.toLowerCase(Locale.ENGLISH);
    L13:
        if (r03.equals("meizu") == false) goto L19;
        setHint("");
        return;
    L19:
        return;
    L11:
        r03 = "";
        goto L13
    }

    @Override // p000.C0348I3, android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo r3) {
        InputConnection r0 = super.onCreateInputConnection(r3);
        if (r0 != null) goto L5;
    L7:
        return r0;
    L5:
        if (r3.hintText != null) goto L7;
        r3.hintText = getHintFromLayout();
        goto L7
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo r1) {
        super.onInitializeAccessibilityNodeInfo(r1);
        getTextInputLayout();
    }

    @Override // android.view.View
    public final boolean requestRectangleOnScreen(Rect r5) {
        TextInputLayout r0 = getTextInputLayout();
        if (r0 == null) goto L10;
        if (this.f4589g == false) goto L10;
        if (r5 == null) goto L10;
        int r02 = r0.getHeight() - getHeight();
        int r1 = r5.left;
        int r2 = r5.top;
        int r3 = r5.right;
        int r52 = r5.bottom + r02;
        Rect r03 = this.f4588f;
        r03.set(r1, r2, r3, r52);
        return super.requestRectangleOnScreen(r03);
    L10:
        return super.requestRectangleOnScreen(r5);
    }

    public void setTextInputLayoutFocusedRectEnabled(boolean r1) {
        this.f4589g = r1;
    }
}
