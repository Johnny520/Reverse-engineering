package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class w3 extends android.widget.EditText implements defpackage.bx {
    public final defpackage.v2 a;
    public final defpackage.d5 b;
    public final defpackage.d4 c;
    public final defpackage.p60 d;
    public final defpackage.d4 e;
    public defpackage.v3 f;

    public w3(android.content.Context r5, android.util.AttributeSet r6) {
            r4 = this;
            defpackage.x60.a(r5)
            r0 = 2130968961(0x7f040181, float:1.754659E38)
            r4.<init>(r5, r6, r0)
            android.content.Context r5 = r4.getContext()
            defpackage.r60.a(r4, r5)
            v2 r5 = new v2
            r5.<init>(r4)
            r4.a = r5
            r5.d(r6, r0)
            d5 r5 = new d5
            r5.<init>(r4)
            r4.b = r5
            r5.f(r6, r0)
            r5.b()
            d4 r5 = new d4
            r1 = 4
            r2 = 0
            r5.<init>(r1, r2)
            r5.b = r4
            r4.c = r5
            p60 r5 = new p60
            r5.<init>()
            r4.d = r5
            d4 r5 = new d4
            r1 = 3
            r5.<init>(r4, r1)
            r4.e = r5
            r5.z(r6, r0)
            android.text.method.KeyListener r6 = r4.getKeyListener()
            boolean r0 = r6 instanceof android.text.method.NumberKeyListener
            if (r0 != 0) goto L72
            boolean r0 = super.isFocusable()
            boolean r1 = super.isClickable()
            boolean r2 = super.isLongClickable()
            int r3 = super.getInputType()
            android.text.method.KeyListener r5 = r5.u(r6)
            if (r5 != r6) goto L63
            goto L72
        L63:
            super.setKeyListener(r5)
            super.setRawInputType(r3)
            super.setFocusable(r0)
            super.setClickable(r1)
            super.setLongClickable(r2)
        L72:
            return
    }

    private defpackage.v3 getSuperCaller() {
            r1 = this;
            v3 r0 = r1.f
            if (r0 != 0) goto Lb
            v3 r0 = new v3
            r0.<init>(r1)
            r1.f = r0
        Lb:
            v3 r0 = r1.f
            return r0
    }

    @Override // defpackage.bx
    public final defpackage.cd a(defpackage.cd r2) {
            r1 = this;
            p60 r0 = r1.d
            cd r2 = r0.a(r1, r2)
            return r2
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
            r1 = this;
            super.drawableStateChanged()
            v2 r0 = r1.a
            if (r0 == 0) goto La
            r0.a()
        La:
            d5 r0 = r1.b
            if (r0 == 0) goto L11
            r0.b()
        L11:
            return
    }

    @Override // android.widget.TextView
    public android.view.ActionMode.Callback getCustomSelectionActionModeCallback() {
            r2 = this;
            android.view.ActionMode$Callback r0 = super.getCustomSelectionActionModeCallback()
            boolean r1 = r0 instanceof defpackage.o60
            if (r1 == 0) goto Lc
            o60 r0 = (defpackage.o60) r0
            android.view.ActionMode$Callback r0 = r0.a
        Lc:
            return r0
    }

    public android.content.res.ColorStateList getSupportBackgroundTintList() {
            r1 = this;
            v2 r0 = r1.a
            if (r0 == 0) goto L9
            android.content.res.ColorStateList r0 = r0.b()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public android.graphics.PorterDuff.Mode getSupportBackgroundTintMode() {
            r1 = this;
            v2 r0 = r1.a
            if (r0 == 0) goto L9
            android.graphics.PorterDuff$Mode r0 = r0.c()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public android.content.res.ColorStateList getSupportCompoundDrawablesTintList() {
            r1 = this;
            d5 r0 = r1.b
            android.content.res.ColorStateList r0 = r0.d()
            return r0
    }

    public android.graphics.PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
            r1 = this;
            d5 r0 = r1.b
            android.graphics.PorterDuff$Mode r0 = r0.e()
            return r0
    }

    @Override // android.widget.EditText, android.widget.TextView
    public android.text.Editable getText() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Lb
            android.text.Editable r0 = super.getText()
            return r0
        Lb:
            android.text.Editable r0 = super.getEditableText()
            return r0
    }

    @Override // android.widget.EditText, android.widget.TextView
    public /* bridge */ /* synthetic */ java.lang.CharSequence getText() {
            r1 = this;
            android.text.Editable r0 = r1.getText()
            return r0
    }

    @Override // android.widget.TextView
    public android.view.textclassifier.TextClassifier getTextClassifier() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 >= r1) goto L1b
            d4 r0 = r2.c
            if (r0 != 0) goto Lb
            goto L1b
        Lb:
            java.lang.Object r1 = r0.c
            android.view.textclassifier.TextClassifier r1 = (android.view.textclassifier.TextClassifier) r1
            if (r1 != 0) goto L1a
            java.lang.Object r0 = r0.b
            android.widget.TextView r0 = (android.widget.TextView) r0
            android.view.textclassifier.TextClassifier r0 = defpackage.w4.a(r0)
            return r0
        L1a:
            return r1
        L1b:
            v3 r0 = r2.getSuperCaller()
            w3 r0 = r0.a
            android.view.textclassifier.TextClassifier r0 = super.getTextClassifier()
            return r0
    }

    @Override // android.widget.TextView, android.view.View
    public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo r4) {
            r3 = this;
            android.view.inputmethod.InputConnection r0 = super.onCreateInputConnection(r4)
            d5 r1 = r3.b
            r1.getClass()
            defpackage.d5.h(r4, r0, r3)
            defpackage.a80.v(r4, r0, r3)
            if (r0 == 0) goto L2a
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 30
            if (r1 > r2) goto L2a
            java.lang.String[] r1 = defpackage.ja0.f(r3)
            if (r1 == 0) goto L2a
            r4.contentMimeTypes = r1
            oh r1 = new oh
            r1.<init>(r3)
            bp r2 = new bp
            r2.<init>(r0, r1)
            r0 = r2
        L2a:
            d4 r1 = r3.e
            ji r4 = r1.C(r0, r4)
            return r4
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onDragEvent(android.view.DragEvent r6) {
            r5 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            r2 = 1
            r3 = 0
            if (r0 >= r1) goto L54
            java.lang.Object r0 = r6.getLocalState()
            if (r0 != 0) goto L54
            java.lang.String[] r0 = defpackage.ja0.f(r5)
            if (r0 != 0) goto L15
            goto L54
        L15:
            android.content.Context r0 = r5.getContext()
        L19:
            boolean r1 = r0 instanceof android.content.ContextWrapper
            if (r1 == 0) goto L2b
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L24
            android.app.Activity r0 = (android.app.Activity) r0
            goto L2c
        L24:
            android.content.ContextWrapper r0 = (android.content.ContextWrapper) r0
            android.content.Context r0 = r0.getBaseContext()
            goto L19
        L2b:
            r0 = 0
        L2c:
            if (r0 != 0) goto L42
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Can't handle drop: no activity: view="
            r0.<init>(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "ReceiveContent"
            android.util.Log.i(r1, r0)
            goto L54
        L42:
            int r1 = r6.getAction()
            if (r1 != r2) goto L49
            goto L54
        L49:
            int r1 = r6.getAction()
            r4 = 3
            if (r1 != r4) goto L54
            boolean r3 = defpackage.g4.a(r6, r5, r0)
        L54:
            if (r3 == 0) goto L57
            return r2
        L57:
            boolean r6 = super.onDragEvent(r6)
            return r6
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int r7) {
            r6 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 >= r1) goto L55
            java.lang.String[] r2 = defpackage.ja0.f(r6)
            if (r2 == 0) goto L55
            r2 = 16908322(0x1020022, float:2.3877324E-38)
            if (r7 == r2) goto L17
            r3 = 16908337(0x1020031, float:2.3877366E-38)
            if (r7 == r3) goto L17
            goto L55
        L17:
            android.content.Context r3 = r6.getContext()
            java.lang.String r4 = "clipboard"
            java.lang.Object r3 = r3.getSystemService(r4)
            android.content.ClipboardManager r3 = (android.content.ClipboardManager) r3
            if (r3 != 0) goto L27
            r3 = 0
            goto L2b
        L27:
            android.content.ClipData r3 = r3.getPrimaryClip()
        L2b:
            r4 = 1
            if (r3 == 0) goto L54
            int r5 = r3.getItemCount()
            if (r5 <= 0) goto L54
            if (r0 < r1) goto L3c
            l0 r0 = new l0
            r0.<init>(r3, r4)
            goto L45
        L3c:
            ad r0 = new ad
            r0.<init>()
            r0.b = r3
            r0.c = r4
        L45:
            if (r7 != r2) goto L49
            r7 = 0
            goto L4a
        L49:
            r7 = r4
        L4a:
            r0.s(r7)
            cd r7 = r0.build()
            defpackage.ja0.h(r6, r7)
        L54:
            return r4
        L55:
            boolean r7 = super.onTextContextMenuItem(r7)
            return r7
    }

    @Override // android.view.View
    public void setBackgroundDrawable(android.graphics.drawable.Drawable r1) {
            r0 = this;
            super.setBackgroundDrawable(r1)
            v2 r1 = r0.a
            if (r1 == 0) goto La
            r1.e()
        La:
            return
    }

    @Override // android.view.View
    public void setBackgroundResource(int r2) {
            r1 = this;
            super.setBackgroundResource(r2)
            v2 r0 = r1.a
            if (r0 == 0) goto La
            r0.f(r2)
        La:
            return
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(android.graphics.drawable.Drawable r1, android.graphics.drawable.Drawable r2, android.graphics.drawable.Drawable r3, android.graphics.drawable.Drawable r4) {
            r0 = this;
            super.setCompoundDrawables(r1, r2, r3, r4)
            d5 r1 = r0.b
            if (r1 == 0) goto La
            r1.b()
        La:
            return
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(android.graphics.drawable.Drawable r1, android.graphics.drawable.Drawable r2, android.graphics.drawable.Drawable r3, android.graphics.drawable.Drawable r4) {
            r0 = this;
            super.setCompoundDrawablesRelative(r1, r2, r3, r4)
            d5 r1 = r0.b
            if (r1 == 0) goto La
            r1.b()
        La:
            return
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(android.view.ActionMode.Callback r1) {
            r0 = this;
            android.view.ActionMode$Callback r1 = defpackage.zt.S(r1, r0)
            super.setCustomSelectionActionModeCallback(r1)
            return
    }

    public void setEmojiCompatEnabled(boolean r2) {
            r1 = this;
            d4 r0 = r1.e
            r0.K(r2)
            return
    }

    @Override // android.widget.TextView
    public void setKeyListener(android.text.method.KeyListener r2) {
            r1 = this;
            d4 r0 = r1.e
            android.text.method.KeyListener r2 = r0.u(r2)
            super.setKeyListener(r2)
            return
    }

    public void setSupportBackgroundTintList(android.content.res.ColorStateList r2) {
            r1 = this;
            v2 r0 = r1.a
            if (r0 == 0) goto L7
            r0.h(r2)
        L7:
            return
    }

    public void setSupportBackgroundTintMode(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            v2 r0 = r1.a
            if (r0 == 0) goto L7
            r0.i(r2)
        L7:
            return
    }

    public void setSupportCompoundDrawablesTintList(android.content.res.ColorStateList r2) {
            r1 = this;
            d5 r0 = r1.b
            r0.l(r2)
            r0.b()
            return
    }

    public void setSupportCompoundDrawablesTintMode(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            d5 r0 = r1.b
            r0.m(r2)
            r0.b()
            return
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(android.content.Context r2, int r3) {
            r1 = this;
            super.setTextAppearance(r2, r3)
            d5 r0 = r1.b
            if (r0 == 0) goto La
            r0.g(r2, r3)
        La:
            return
    }

    @Override // android.widget.TextView
    public void setTextClassifier(android.view.textclassifier.TextClassifier r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 >= r1) goto Le
            d4 r0 = r2.c
            if (r0 != 0) goto Lb
            goto Le
        Lb:
            r0.c = r3
            return
        Le:
            v3 r0 = r2.getSuperCaller()
            w3 r0 = r0.a
            super.setTextClassifier(r3)
            return
    }
}
