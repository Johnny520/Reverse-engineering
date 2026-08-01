package androidx.appcompat.widget;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public class AppCompatEditText extends android.widget.EditText implements p000.g51 {

    /* JADX INFO: renamed from: ε */
    public final p000.C0610o4 f556;

    /* JADX INFO: renamed from: ζ */
    public final p000.C0201d6 f557;

    /* JADX INFO: renamed from: η */
    public final p000.a42 f558;

    /* JADX INFO: renamed from: θ */
    public final p000.C0574n5 f559;

    /* JADX INFO: renamed from: ι */
    public p000.C0457k5 f560;

    public AppCompatEditText(android.content.Context r3) {
            r2 = this;
            r0 = 0
            r1 = 2130968707(0x7f040083, float:1.7546075E38)
            r2.<init>(r3, r0, r1)
            return
    }

    public AppCompatEditText(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 2130968707(0x7f040083, float:1.7546075E38)
            r1.<init>(r2, r3, r0)
            return
    }

    public AppCompatEditText(android.content.Context r4, android.util.AttributeSet r5, int r6) {
            r3 = this;
            p000.o42.m4207(r4)
            r3.<init>(r4, r5, r6)
            android.content.Context r4 = r3.getContext()
            p000.b42.m739(r3, r4)
            o4 r4 = new o4
            r4.<init>(r3)
            r3.f556 = r4
            r4.m4197(r5, r6)
            d6 r4 = new d6
            r4.<init>(r3)
            r3.f557 = r4
            r4.m1661(r5, r6)
            r4.m1658()
            a42 r4 = new a42
            r4.<init>()
            r3.f558 = r4
            n5 r4 = new n5
            r0 = 4
            r4.<init>(r3, r0)
            r3.f559 = r4
            r4.mo3966(r5, r6)
            android.text.method.KeyListener r5 = r3.getKeyListener()
            boolean r6 = r5 instanceof android.text.method.NumberKeyListener
            if (r6 != 0) goto L64
            boolean r6 = super.isFocusable()
            boolean r0 = super.isClickable()
            boolean r1 = super.isLongClickable()
            int r2 = super.getInputType()
            android.text.method.KeyListener r4 = r4.m3963(r5)
            if (r4 != r5) goto L55
            goto L64
        L55:
            super.setKeyListener(r4)
            super.setRawInputType(r2)
            super.setFocusable(r6)
            super.setClickable(r0)
            super.setLongClickable(r1)
        L64:
            return
    }

    private p000.C0457k5 getSuperCaller() {
            r1 = this;
            k5 r0 = r1.f560
            if (r0 != 0) goto Lb
            k5 r0 = new k5
            r0.<init>(r1)
            r1.f560 = r0
        Lb:
            k5 r1 = r1.f560
            return r1
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
            r1 = this;
            super.drawableStateChanged()
            o4 r0 = r1.f556
            if (r0 == 0) goto La
            r0.m4194()
        La:
            d6 r1 = r1.f557
            if (r1 == 0) goto L11
            r1.m1658()
        L11:
            return
    }

    @Override // android.widget.TextView
    public android.view.ActionMode.Callback getCustomSelectionActionModeCallback() {
            r0 = this;
            android.view.ActionMode$Callback r0 = super.getCustomSelectionActionModeCallback()
            return r0
    }

    public android.content.res.ColorStateList getSupportBackgroundTintList() {
            r0 = this;
            o4 r0 = r0.f556
            if (r0 == 0) goto L9
            android.content.res.ColorStateList r0 = r0.m4195()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public android.graphics.PorterDuff.Mode getSupportBackgroundTintMode() {
            r0 = this;
            o4 r0 = r0.f556
            if (r0 == 0) goto L9
            android.graphics.PorterDuff$Mode r0 = r0.m4196()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public android.content.res.ColorStateList getSupportCompoundDrawablesTintList() {
            r0 = this;
            d6 r0 = r0.f557
            android.content.res.ColorStateList r0 = r0.m1659()
            return r0
    }

    public android.graphics.PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
            r0 = this;
            d6 r0 = r0.f557
            android.graphics.PorterDuff$Mode r0 = r0.m1660()
            return r0
    }

    @Override // android.widget.EditText, android.widget.TextView
    public android.text.Editable getText() {
            r0 = this;
            android.text.Editable r0 = super.getText()
            return r0
    }

    @Override // android.widget.EditText, android.widget.TextView
    public /* bridge */ /* synthetic */ java.lang.CharSequence getText() {
            r0 = this;
            android.text.Editable r0 = r0.getText()
            return r0
    }

    @Override // android.widget.TextView
    public android.view.textclassifier.TextClassifier getTextClassifier() {
            r0 = this;
            k5 r0 = r0.getSuperCaller()
            androidx.appcompat.widget.AppCompatEditText r0 = r0.f5757
            android.view.textclassifier.TextClassifier r0 = super.getTextClassifier()
            return r0
    }

    @Override // android.widget.TextView, android.view.View
    public final android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo r4) {
            r3 = this;
            android.view.inputmethod.InputConnection r0 = super.onCreateInputConnection(r4)
            d6 r1 = r3.f557
            r1.getClass()
            p000.kn0.m3344(r4, r0, r3)
            if (r0 == 0) goto L27
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 30
            if (r1 > r2) goto L27
            java.lang.String[] r1 = p000.b92.m825(r3)
            if (r1 == 0) goto L27
            r4.contentMimeTypes = r1
            hi0 r1 = new hi0
            r1.<init>(r3)
            im0 r2 = new im0
            r2.<init>(r0, r1)
            r0 = r2
        L27:
            n5 r3 = r3.f559
            py r3 = r3.m3968(r0, r4)
            return r3
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
            r2 = this;
            super.onDetachedFromWindow()
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 >= r1) goto L18
            android.content.Context r0 = r2.getContext()
            java.lang.String r1 = "input_method"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.inputmethod.InputMethodManager r0 = (android.view.inputmethod.InputMethodManager) r0
            r0.isActive(r2)
        L18:
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
            java.lang.String[] r0 = p000.b92.m825(r5)
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
            boolean r3 = p000.AbstractC0611o5.m4208(r6, r5, r0)
        L54:
            if (r3 == 0) goto L57
            return r2
        L57:
            boolean r5 = super.onDragEvent(r6)
            return r5
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int r7) {
            r6 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 >= r1) goto L55
            java.lang.String[] r2 = p000.b92.m825(r6)
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
            n r0 = new n
            r0.<init>(r3, r4)
            goto L45
        L3c:
            fp r0 = new fp
            r0.<init>()
            r0.f4056 = r3
            r0.f4057 = r4
        L45:
            if (r7 != r2) goto L49
            r7 = 0
            goto L4a
        L49:
            r7 = r4
        L4a:
            r0.mo1947(r7)
            hp r7 = r0.build()
            p000.b92.m827(r6, r7)
        L54:
            return r4
        L55:
            boolean r6 = super.onTextContextMenuItem(r7)
            return r6
    }

    @Override // android.view.View
    public void setBackgroundDrawable(android.graphics.drawable.Drawable r1) {
            r0 = this;
            super.setBackgroundDrawable(r1)
            o4 r0 = r0.f556
            if (r0 == 0) goto La
            r0.m4198()
        La:
            return
    }

    @Override // android.view.View
    public void setBackgroundResource(int r1) {
            r0 = this;
            super.setBackgroundResource(r1)
            o4 r0 = r0.f556
            if (r0 == 0) goto La
            r0.m4199(r1)
        La:
            return
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(android.graphics.drawable.Drawable r1, android.graphics.drawable.Drawable r2, android.graphics.drawable.Drawable r3, android.graphics.drawable.Drawable r4) {
            r0 = this;
            super.setCompoundDrawables(r1, r2, r3, r4)
            d6 r0 = r0.f557
            if (r0 == 0) goto La
            r0.m1658()
        La:
            return
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(android.graphics.drawable.Drawable r1, android.graphics.drawable.Drawable r2, android.graphics.drawable.Drawable r3, android.graphics.drawable.Drawable r4) {
            r0 = this;
            super.setCompoundDrawablesRelative(r1, r2, r3, r4)
            d6 r0 = r0.f557
            if (r0 == 0) goto La
            r0.m1658()
        La:
            return
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(android.view.ActionMode.Callback r1) {
            r0 = this;
            super.setCustomSelectionActionModeCallback(r1)
            return
    }

    public void setEmojiCompatEnabled(boolean r1) {
            r0 = this;
            n5 r0 = r0.f559
            r0.m3977(r1)
            return
    }

    @Override // android.widget.TextView
    public void setKeyListener(android.text.method.KeyListener r2) {
            r1 = this;
            n5 r0 = r1.f559
            android.text.method.KeyListener r2 = r0.m3963(r2)
            super.setKeyListener(r2)
            return
    }

    public void setSupportBackgroundTintList(android.content.res.ColorStateList r1) {
            r0 = this;
            o4 r0 = r0.f556
            if (r0 == 0) goto L7
            r0.m4201(r1)
        L7:
            return
    }

    public void setSupportBackgroundTintMode(android.graphics.PorterDuff.Mode r1) {
            r0 = this;
            o4 r0 = r0.f556
            if (r0 == 0) goto L7
            r0.m4202(r1)
        L7:
            return
    }

    public void setSupportCompoundDrawablesTintList(android.content.res.ColorStateList r1) {
            r0 = this;
            d6 r0 = r0.f557
            r0.m1663(r1)
            r0.m1658()
            return
    }

    public void setSupportCompoundDrawablesTintMode(android.graphics.PorterDuff.Mode r1) {
            r0 = this;
            d6 r0 = r0.f557
            r0.m1664(r1)
            r0.m1658()
            return
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(android.content.Context r1, int r2) {
            r0 = this;
            super.setTextAppearance(r1, r2)
            d6 r0 = r0.f557
            if (r0 == 0) goto La
            r0.m1662(r1, r2)
        La:
            return
    }

    @Override // android.widget.TextView
    public void setTextClassifier(android.view.textclassifier.TextClassifier r1) {
            r0 = this;
            k5 r0 = r0.getSuperCaller()
            androidx.appcompat.widget.AppCompatEditText r0 = r0.f5757
            super.setTextClassifier(r1)
            return
    }

    @Override // p000.g51
    /* JADX INFO: renamed from: α */
    public final p000.C0367hp mo270(p000.C0367hp r2) {
            r1 = this;
            a42 r0 = r1.f558
            r0.getClass()
            hp r1 = p000.a42.m32(r1, r2)
            return r1
    }
}
