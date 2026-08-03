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
import java.util.Locale;
import org.luckypray.dexkit.C1031R;
import p003B0.AbstractC0059a;
import p057g.AbstractC0930u;
import p058g0.AbstractC0942a;
import p081s0.AbstractC1077k;

/* JADX INFO: loaded from: classes.dex */
public class TextInputEditText extends AbstractC0930u {

    /* JADX INFO: renamed from: g */
    public final Rect f2435g;

    /* JADX INFO: renamed from: h */
    public boolean f2436h;

    public TextInputEditText(Context r11, AttributeSet r12) {
        super(AbstractC0059a.m197a(r11, r12, C1031R.attr.editTextStyle, 0), r12);
        this.f2435g = new Rect();
        int[] r8 = AbstractC0942a.f3348t;
        AbstractC1077k.m2553a(r11, r12, C1031R.attr.editTextStyle, C1031R.style.Widget_Design_TextInputEditText);
        AbstractC1077k.m2554b(r11, r12, r8, C1031R.attr.editTextStyle, C1031R.style.Widget_Design_TextInputEditText, new int[0]);
        TypedArray r112 = r11.obtainStyledAttributes(r12, r8, C1031R.attr.editTextStyle, C1031R.style.Widget_Design_TextInputEditText);
        setTextInputLayoutFocusedRectEnabled(r112.getBoolean(0, false));
        r112.recycle();
    }

    private CharSequence getHintFromLayout() {
        TextInputLayout r02 = getTextInputLayout();
        if (r02 != null) goto L7;
        return null;
    L7:
        return r02.getHint();
    }

    private TextInputLayout getTextInputLayout() {
        ViewParent r02 = getParent();
    L4:
        if ((r02 instanceof View) == false) goto L10;
        if ((r02 instanceof TextInputLayout) == true) goto L8;
        r02 = r02.getParent();
        goto L4
    L8:
        return (TextInputLayout) r02;
    L10:
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect r3) {
        super.getFocusedRect(r3);
        TextInputLayout r02 = getTextInputLayout();
        if (r02 != null) goto L5;
        return;
    L5:
        if (this.f2436h == false) goto L10;
        if (r3 == null) goto L11;
        Rect r1 = this.f2435g;
        r02.getFocusedRect(r1);
        r3.bottom = r1.bottom;
        return;
    L11:
        return;
    }

    @Override // android.view.View
    public final boolean getGlobalVisibleRect(Rect r3, Point r4) {
        TextInputLayout r02 = getTextInputLayout();
        if (r02 == null) goto L12;
        if (this.f2436h == false) goto L12;
        boolean r32 = r02.getGlobalVisibleRect(r3, r4);
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
        TextInputLayout r02 = getTextInputLayout();
        if (r02 == null) goto L9;
        if (r02.f2444E == false) goto L9;
        return r02.getHint();
    L9:
        return super.getHint();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout r02 = getTextInputLayout();
        if (r02 != null) goto L5;
        return;
    L5:
        if (r02.f2444E == true) goto L7;
        return;
    L7:
        if (super.getHint() != null) goto L18;
        String r03 = Build.MANUFACTURER;
        if (r03 == null) goto L11;
        String r04 = r03.toLowerCase(Locale.ENGLISH);
    L13:
        if (r04.equals("meizu") == false) goto L19;
        setHint("");
        return;
    L19:
        return;
    L11:
        r04 = "";
        goto L13
    }

    @Override // p057g.AbstractC0930u, android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo r3) {
        InputConnection r02 = super.onCreateInputConnection(r3);
        if (r02 != null) goto L5;
    L7:
        return r02;
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
        TextInputLayout r02 = getTextInputLayout();
        if (r02 == null) goto L10;
        if (this.f2436h == false) goto L10;
        if (r5 == null) goto L10;
        int r03 = r02.getHeight() - getHeight();
        int r1 = r5.left;
        int r2 = r5.top;
        int r3 = r5.right;
        int r52 = r5.bottom + r03;
        Rect r04 = this.f2435g;
        r04.set(r1, r2, r3, r52);
        return super.requestRectangleOnScreen(r04);
    L10:
        return super.requestRectangleOnScreen(r5);
    }

    public void setTextInputLayoutFocusedRectEnabled(boolean r1) {
        this.f2436h = r1;
    }
}
