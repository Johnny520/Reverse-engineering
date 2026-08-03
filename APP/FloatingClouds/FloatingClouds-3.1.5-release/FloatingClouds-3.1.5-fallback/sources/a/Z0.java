package a;

/* JADX INFO: loaded from: classes.dex */
public class Z0 extends android.widget.EditText implements a.InterfaceC0124ec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a.G0 f365a;
    public final a.C0310p1 b;
    public final a.C0053af c;
    public final a.C0039a1 d;
    public a.Z0.a e;

    public class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a.Z0 f366a;

        public a(a.Z0 r1) {
                r0 = this;
                r0.<init>()
                r0.f366a = r1
                return
        }
    }

    public Z0(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            int r0 = androidx.appcompat.R.attr.editTextStyle
            r1.<init>(r2, r3, r0)
            return
    }

    public Z0(android.content.Context r4, android.util.AttributeSet r5, int r6) {
            r3 = this;
            a.C0252lf.a(r4)
            r3.<init>(r4, r5, r6)
            android.content.Context r4 = r3.getContext()
            a.C0109df.a(r3, r4)
            a.G0 r4 = new a.G0
            r4.<init>(r3)
            r3.f365a = r4
            r4.d(r5, r6)
            a.p1 r4 = new a.p1
            r4.<init>(r3)
            r3.b = r4
            r4.f(r5, r6)
            r4.b()
            a.af r4 = new a.af
            r4.<init>()
            r3.c = r4
            a.a1 r4 = new a.a1
            r4.<init>(r3)
            r3.d = r4
            r4.b(r5, r6)
            android.text.method.KeyListener r5 = r3.getKeyListener()
            boolean r6 = r5 instanceof android.text.method.NumberKeyListener
            if (r6 != 0) goto L63
            boolean r6 = super.isFocusable()
            boolean r0 = super.isClickable()
            boolean r1 = super.isLongClickable()
            int r2 = super.getInputType()
            android.text.method.KeyListener r4 = r4.a(r5)
            if (r4 != r5) goto L54
            goto L63
        L54:
            super.setKeyListener(r4)
            super.setRawInputType(r2)
            super.setFocusable(r6)
            super.setClickable(r0)
            super.setLongClickable(r1)
        L63:
            return
    }

    private a.Z0.a getSuperCaller() {
            r1 = this;
            a.Z0$a r0 = r1.e
            if (r0 != 0) goto Lb
            a.Z0$a r0 = new a.Z0$a
            r0.<init>(r1)
            r1.e = r0
        Lb:
            a.Z0$a r0 = r1.e
            return r0
    }

    @Override // a.InterfaceC0124ec
    public final a.W3 a(a.W3 r2) {
            r1 = this;
            a.af r0 = r1.c
            a.W3 r2 = r0.a(r1, r2)
            return r2
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
            r1 = this;
            super.drawableStateChanged()
            a.G0 r0 = r1.f365a
            if (r0 == 0) goto La
            r0.a()
        La:
            a.p1 r0 = r1.b
            if (r0 == 0) goto L11
            r0.b()
        L11:
            return
    }

    @Override // android.widget.TextView
    public android.view.ActionMode.Callback getCustomSelectionActionModeCallback() {
            r1 = this;
            android.view.ActionMode$Callback r0 = super.getCustomSelectionActionModeCallback()
            android.view.ActionMode$Callback r0 = a.Ze.b(r0)
            return r0
    }

    public android.content.res.ColorStateList getSupportBackgroundTintList() {
            r1 = this;
            a.G0 r0 = r1.f365a
            if (r0 == 0) goto L9
            android.content.res.ColorStateList r0 = r0.b()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public android.graphics.PorterDuff.Mode getSupportBackgroundTintMode() {
            r1 = this;
            a.G0 r0 = r1.f365a
            if (r0 == 0) goto L9
            android.graphics.PorterDuff$Mode r0 = r0.c()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public android.content.res.ColorStateList getSupportCompoundDrawablesTintList() {
            r1 = this;
            a.p1 r0 = r1.b
            android.content.res.ColorStateList r0 = r0.d()
            return r0
    }

    public android.graphics.PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
            r1 = this;
            a.p1 r0 = r1.b
            android.graphics.PorterDuff$Mode r0 = r0.e()
            return r0
    }

    @Override // android.widget.EditText, android.widget.TextView
    public android.text.Editable getText() {
            r1 = this;
            android.text.Editable r0 = super.getText()
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
            r1 = this;
            a.Z0$a r0 = r1.getSuperCaller()
            a.Z0 r0 = r0.f366a
            android.view.textclassifier.TextClassifier r0 = super.getTextClassifier()
            return r0
    }

    @Override // android.widget.TextView, android.view.View
    public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo r4) {
            r3 = this;
            android.view.inputmethod.InputConnection r0 = super.onCreateInputConnection(r4)
            a.p1 r1 = r3.b
            r1.getClass()
            a.C0310p1.h(r4, r0, r3)
            a.C0435w1.L(r4, r0, r3)
            if (r0 == 0) goto L2a
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 30
            if (r1 > r2) goto L2a
            java.lang.String[] r1 = a.C0414ug.d(r3)
            if (r1 == 0) goto L2a
            r4.contentMimeTypes = r1
            a.E5 r1 = new a.E5
            r1.<init>(r3)
            a.X8 r2 = new a.X8
            r2.<init>(r0, r1)
            r0 = r2
        L2a:
            a.a1 r1 = r3.d
            a.N5 r4 = r1.c(r0, r4)
            return r4
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
            r2 = this;
            super.onDetachedFromWindow()
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L1c
            r1 = 33
            if (r0 >= r1) goto L1c
            android.content.Context r0 = r2.getContext()
            java.lang.String r1 = "input_method"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.inputmethod.InputMethodManager r0 = (android.view.inputmethod.InputMethodManager) r0
            r0.isActive(r2)
        L1c:
            return
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
            java.lang.String[] r0 = a.C0414ug.d(r5)
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
            boolean r3 = a.C0220k1.a(r6, r5, r0)
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
            java.lang.String[] r2 = a.C0414ug.d(r6)
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
            a.W3$a r0 = new a.W3$a
            r0.<init>(r3, r4)
            goto L45
        L3c:
            a.W3$c r0 = new a.W3$c
            r0.<init>()
            r0.f316a = r3
            r0.b = r4
        L45:
            if (r7 != r2) goto L49
            r7 = 0
            goto L4a
        L49:
            r7 = r4
        L4a:
            r0.c(r7)
            a.W3 r7 = r0.a()
            a.C0414ug.f(r6, r7)
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
            a.G0 r1 = r0.f365a
            if (r1 == 0) goto La
            r1.e()
        La:
            return
    }

    @Override // android.view.View
    public void setBackgroundResource(int r2) {
            r1 = this;
            super.setBackgroundResource(r2)
            a.G0 r0 = r1.f365a
            if (r0 == 0) goto La
            r0.f(r2)
        La:
            return
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(android.graphics.drawable.Drawable r1, android.graphics.drawable.Drawable r2, android.graphics.drawable.Drawable r3, android.graphics.drawable.Drawable r4) {
            r0 = this;
            super.setCompoundDrawables(r1, r2, r3, r4)
            a.p1 r1 = r0.b
            if (r1 == 0) goto La
            r1.b()
        La:
            return
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(android.graphics.drawable.Drawable r1, android.graphics.drawable.Drawable r2, android.graphics.drawable.Drawable r3, android.graphics.drawable.Drawable r4) {
            r0 = this;
            super.setCompoundDrawablesRelative(r1, r2, r3, r4)
            a.p1 r1 = r0.b
            if (r1 == 0) goto La
            r1.b()
        La:
            return
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(android.view.ActionMode.Callback r1) {
            r0 = this;
            super.setCustomSelectionActionModeCallback(r1)
            return
    }

    public void setEmojiCompatEnabled(boolean r2) {
            r1 = this;
            a.a1 r0 = r1.d
            r0.d(r2)
            return
    }

    @Override // android.widget.TextView
    public void setKeyListener(android.text.method.KeyListener r2) {
            r1 = this;
            a.a1 r0 = r1.d
            android.text.method.KeyListener r2 = r0.a(r2)
            super.setKeyListener(r2)
            return
    }

    public void setSupportBackgroundTintList(android.content.res.ColorStateList r2) {
            r1 = this;
            a.G0 r0 = r1.f365a
            if (r0 == 0) goto L7
            r0.h(r2)
        L7:
            return
    }

    public void setSupportBackgroundTintMode(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            a.G0 r0 = r1.f365a
            if (r0 == 0) goto L7
            r0.i(r2)
        L7:
            return
    }

    public void setSupportCompoundDrawablesTintList(android.content.res.ColorStateList r2) {
            r1 = this;
            a.p1 r0 = r1.b
            r0.i(r2)
            r0.b()
            return
    }

    public void setSupportCompoundDrawablesTintMode(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            a.p1 r0 = r1.b
            r0.j(r2)
            r0.b()
            return
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(android.content.Context r2, int r3) {
            r1 = this;
            super.setTextAppearance(r2, r3)
            a.p1 r0 = r1.b
            if (r0 == 0) goto La
            r0.g(r2, r3)
        La:
            return
    }

    @Override // android.widget.TextView
    public void setTextClassifier(android.view.textclassifier.TextClassifier r2) {
            r1 = this;
            a.Z0$a r0 = r1.getSuperCaller()
            a.Z0 r0 = r0.f366a
            super.setTextClassifier(r2)
            return
    }
}
