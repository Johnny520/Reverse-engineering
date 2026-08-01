package defpackage;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import android.widget.TextView;
import com.ljx.wechatmod.R;

/* JADX INFO: loaded from: classes.dex */
public class w3 extends EditText implements bx {
    public final v2 a;
    public final d5 b;
    public final d4 c;
    public final p60 d;
    public final d4 e;
    public v3 f;

    public w3(Context r5, AttributeSet r6) {
        x60.a(r5);
        super(r5, r6, R.attr.editTextStyle);
        r60.a(this, getContext());
        v2 r52 = new v2(this);
        this.a = r52;
        r52.d(r6, R.attr.editTextStyle);
        d5 r53 = new d5(this);
        this.b = r53;
        r53.f(r6, R.attr.editTextStyle);
        r53.b();
        d4 r54 = new d4(4, false);
        r54.b = this;
        this.c = r54;
        this.d = new p60();
        d4 r55 = new d4(this, 3);
        this.e = r55;
        r55.z(r6, R.attr.editTextStyle);
        KeyListener r62 = getKeyListener();
        if ((r62 instanceof NumberKeyListener) == true) goto L9;
        boolean r0 = super.isFocusable();
        boolean r1 = super.isClickable();
        boolean r2 = super.isLongClickable();
        int r3 = super.getInputType();
        KeyListener r56 = r55.u(r62);
        if (r56 == r62) goto L10;
        super.setKeyListener(r56);
        super.setRawInputType(r3);
        super.setFocusable(r0);
        super.setClickable(r1);
        super.setLongClickable(r2);
        return;
    L10:
        return;
    }

    private v3 getSuperCaller() {
        if (this.f != null) goto L6;
        this.f = new v3(this);
    L6:
        return this.f;
    }

    @Override // defpackage.bx
    public final cd a(cd r2) {
        return this.d.a(this, r2);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        v2 r0 = this.a;
        if (r0 == null) goto L5;
        r0.a();
    L5:
        d5 r02 = this.b;
        if (r02 == null) goto L9;
        r02.b();
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
        v2 r0 = this.a;
        if (r0 != null) goto L5;
        return null;
    L5:
        return r0.b();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        v2 r0 = this.a;
        if (r0 != null) goto L5;
        return null;
    L5:
        return r0.c();
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.b.e();
    }

    @Override // android.widget.EditText, android.widget.TextView
    public /* bridge */ /* synthetic */ CharSequence getText() {
        return getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        if (Build.VERSION.SDK_INT >= 28) goto L13;
        d4 r0 = this.c;
        if (r0 == null) goto L13;
        TextClassifier r1 = (TextClassifier) r0.c;
        if (r1 == null) goto L10;
        return r1;
    L10:
        return w4.a((TextView) r0.b);
    L13:
        return super.getTextClassifier();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo r4) {
        InputConnection r0 = super.onCreateInputConnection(r4);
        this.b.getClass();
        d5.h(r4, r0, this);
        a80.v(r4, r0, this);
        if (r0 == null) goto L10;
        if (Build.VERSION.SDK_INT > 30) goto L10;
        String[] r1 = ja0.f(this);
        if (r1 == null) goto L10;
        r4.contentMimeTypes = r1;
        r0 = new bp(r0, new oh(this));
    L10:
        return this.e.C(r0, r4);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onDragEvent(DragEvent r6) {
        boolean r3 = false;
        if (Build.VERSION.SDK_INT < 31) goto L5;
    L25:
        if (r3 == false) goto L28;
        return true;
    L28:
        return super.onDragEvent(r6);
    L5:
        if (r6.getLocalState() != null) goto L25;
        if (ja0.f(this) == null) goto L25;
        Context r0 = getContext();
    L11:
        if ((r0 instanceof ContextWrapper) == false) goto L16;
        if ((r0 instanceof Activity) == true) goto L14;
        r0 = ((ContextWrapper) r0).getBaseContext();
        goto L11
    L14:
        Activity r02 = (Activity) r0;
    L17:
        if (r02 != null) goto L20;
        Log.i("ReceiveContent", "Can't handle drop: no activity: view=" + this);
        goto L25
    L20:
        if (r6.getAction() == 1) goto L25;
        if (r6.getAction() != 3) goto L25;
        r3 = g4.a(r6, this, r02);
        goto L25
    L16:
        r02 = null;
        goto L17
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int r7) {
        int r0 = Build.VERSION.SDK_INT;
        if (r0 >= 31) goto L28;
        if (ja0.f(this) == null) goto L28;
        if (r7 != 16908322) goto L9;
    L11:
        ClipboardManager r3 = (ClipboardManager) getContext().getSystemService("clipboard");
        if (r3 != null) goto L14;
        ClipData r32 = null;
    L16:
        if (r32 != null) goto L18;
    L26:
        return true;
    L18:
        if (r32.getItemCount() <= 0) goto L26;
        if (r0 < 31) goto L21;
        zc r02 = new l0(r32, 1);
    L22:
        if (r7 != 16908322) goto L24;
        int r72 = 0;
    L25:
        r02.s(r72);
        ja0.h(this, r02.build());
        goto L26
    L24:
        r72 = 1;
        goto L25
    L21:
        ad r03 = new ad();
        r03.b = r32;
        r03.c = 1;
        r02 = r03;
        goto L22
    L14:
        r32 = r3.getPrimaryClip();
        goto L16
    L9:
        if (r7 == 16908337) goto L11;
    L28:
        return super.onTextContextMenuItem(r7);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable r1) {
        super.setBackgroundDrawable(r1);
        v2 r12 = this.a;
        if (r12 == null) goto L6;
        r12.e();
        return;
    }

    @Override // android.view.View
    public void setBackgroundResource(int r2) {
        super.setBackgroundResource(r2);
        v2 r0 = this.a;
        if (r0 == null) goto L6;
        r0.f(r2);
        return;
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable r1, Drawable r2, Drawable r3, Drawable r4) {
        super.setCompoundDrawables(r1, r2, r3, r4);
        d5 r12 = this.b;
        if (r12 == null) goto L6;
        r12.b();
        return;
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable r1, Drawable r2, Drawable r3, Drawable r4) {
        super.setCompoundDrawablesRelative(r1, r2, r3, r4);
        d5 r12 = this.b;
        if (r12 == null) goto L6;
        r12.b();
        return;
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback r1) {
        super.setCustomSelectionActionModeCallback(zt.S(r1, this));
    }

    public void setEmojiCompatEnabled(boolean r2) {
        this.e.K(r2);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener r2) {
        super.setKeyListener(this.e.u(r2));
    }

    public void setSupportBackgroundTintList(ColorStateList r2) {
        v2 r0 = this.a;
        if (r0 == null) goto L6;
        r0.h(r2);
        return;
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode r2) {
        v2 r0 = this.a;
        if (r0 == null) goto L6;
        r0.i(r2);
        return;
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList r2) {
        d5 r0 = this.b;
        r0.l(r2);
        r0.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode r2) {
        d5 r0 = this.b;
        r0.m(r2);
        r0.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context r2, int r3) {
        super.setTextAppearance(r2, r3);
        d5 r0 = this.b;
        if (r0 == null) goto L6;
        r0.g(r2, r3);
        return;
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier r3) {
        if (Build.VERSION.SDK_INT >= 28) goto L9;
        d4 r0 = this.c;
        if (r0 == null) goto L9;
        r0.c = r3;
        return;
    L9:
        super.setTextClassifier(r3);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        if (Build.VERSION.SDK_INT < 28) goto L7;
        return super.getText();
    L7:
        return super.getEditableText();
    }
}
