package defpackage;

/* JADX INFO: renamed from: ᲇᛳᛳᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C2015 extends android.widget.EditText implements defpackage.InterfaceC0895 {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final defpackage.C0986 f8707;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final defpackage.C1181 f8708;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final defpackage.C0866 f8709;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final defpackage.C0682 f8710;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public defpackage.C0950 f8711;

    public C2015(android.content.Context r5, android.util.AttributeSet r6) {
            r4 = this;
            defpackage.AbstractC0322.m994(r5)
            r0 = 1711538459(0x6604011b, float:1.558432E23)
            r4.<init>(r5, r6, r0)
            android.content.Context r5 = r4.getContext()
            defpackage.AbstractC2218.m3609(r5, r4)
            ᛵᛴᛴᛳ r5 = new ᛵᛴᛴᛳ
            r5.<init>(r4)
            r4.f8709 = r5
            r5.m1824(r6, r0)
            ᛶᲈᛳᛵ r5 = new ᛶᲈᛳᛵ
            r5.<init>(r4)
            r4.f8708 = r5
            r5.m2310(r6, r0)
            r5.m2309()
            ᛵᲇᲁᲁ r5 = new ᛵᲇᲁᲁ
            r5.<init>()
            r4.f8707 = r5
            ᛴᛵᲇᲇ r5 = new ᛴᛵᲇᲇ
            r1 = 5
            r5.<init>(r4, r1)
            r4.f8710 = r5
            r5.mo1555(r6, r0)
            android.text.method.KeyListener r6 = r4.getKeyListener()
            boolean r0 = r6 instanceof android.text.method.NumberKeyListener
            if (r0 != 0) goto L67
            boolean r0 = r4.isFocusable()
            boolean r1 = r4.isClickable()
            boolean r2 = r4.isLongClickable()
            int r3 = r4.getInputType()
            android.text.method.KeyListener r5 = r5.m1564(r6)
            if (r5 != r6) goto L58
            goto L67
        L58:
            super.setKeyListener(r5)
            r4.setRawInputType(r3)
            r4.setFocusable(r0)
            r4.setClickable(r1)
            r4.setLongClickable(r2)
        L67:
            return
    }

    private defpackage.C0950 getSuperCaller() {
            r1 = this;
            ᛵᛸᲁᛲ r0 = r1.f8711
            if (r0 != 0) goto Lb
            ᛵᛸᲁᛲ r0 = new ᛵᛸᲁᛲ
            r0.<init>(r1)
            r1.f8711 = r0
        Lb:
            return r0
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
            r1 = this;
            super.drawableStateChanged()
            ᛵᛴᛴᛳ r0 = r1.f8709
            if (r0 == 0) goto La
            r0.m1836()
        La:
            ᛶᲈᛳᛵ r1 = r1.f8708
            if (r1 == 0) goto L11
            r1.m2309()
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
            ᛵᛴᛴᛳ r0 = r0.f8709
            if (r0 == 0) goto L9
            android.content.res.ColorStateList r0 = r0.m1823()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public android.graphics.PorterDuff.Mode getSupportBackgroundTintMode() {
            r0 = this;
            ᛵᛴᛴᛳ r0 = r0.f8709
            if (r0 == 0) goto L9
            android.graphics.PorterDuff$Mode r0 = r0.m1826()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public android.content.res.ColorStateList getSupportCompoundDrawablesTintList() {
            r0 = this;
            ᛶᲈᛳᛵ r0 = r0.f8708
            android.content.res.ColorStateList r0 = r0.m2306()
            return r0
    }

    public android.graphics.PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
            r0 = this;
            ᛶᲈᛳᛵ r0 = r0.f8708
            android.graphics.PorterDuff$Mode r0 = r0.m2305()
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
            ᛵᛸᲁᛲ r0 = r0.getSuperCaller()
            ᲇᛳᛳᲇ r0 = r0.f4254
            android.view.textclassifier.TextClassifier r0 = super.getTextClassifier()
            return r0
    }

    @Override // android.widget.TextView, android.view.View
    public final android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo r4) {
            r3 = this;
            android.view.inputmethod.InputConnection r0 = super.onCreateInputConnection(r4)
            ᛶᲈᛳᛵ r1 = r3.f8708
            r1.getClass()
            defpackage.AbstractC2193.m3590(r4, r0, r3)
            if (r0 == 0) goto L28
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 30
            if (r1 > r2) goto L28
            java.lang.String[] r1 = defpackage.AbstractC0858.m1816(r3)
            if (r1 == 0) goto L28
            r4.contentMimeTypes = r1
            ᛱᲇᛴᛲ r1 = new ᛱᲇᛴᛲ
            r2 = 5
            r1.<init>(r2, r3)
            ᲁᛳᛵᲁ r2 = new ᲁᛳᛵᲁ
            r2.<init>(r0, r1)
            r0 = r2
        L28:
            ᛴᛵᲇᲇ r3 = r3.f8710
            ᛱᲀᛱᛵ r3 = r3.m1560(r0, r4)
            return r3
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
            java.lang.String[] r0 = defpackage.AbstractC0858.m1816(r5)
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
            boolean r3 = defpackage.AbstractC1179.m2289(r6, r5, r0)
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
            java.lang.String[] r2 = defpackage.AbstractC0858.m1816(r6)
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
            ᛸᲈᛸᲈ r0 = new ᛸᲈᛸᲈ
            r0.<init>(r3, r4)
            goto L45
        L3c:
            ᛵᛶᛱᛲ r0 = new ᛵᛶᛱᛲ
            r0.<init>()
            r0.f4118 = r3
            r0.f4117 = r4
        L45:
            if (r7 != r2) goto L49
            r7 = 0
            goto L4a
        L49:
            r7 = r4
        L4a:
            r0.mo1520(r7)
            ᛳᛱᛴᛸ r7 = r0.build()
            defpackage.AbstractC0858.m1814(r6, r7)
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
            ᛵᛴᛴᛳ r0 = r0.f8709
            if (r0 == 0) goto La
            r0.m1832()
        La:
            return
    }

    @Override // android.view.View
    public void setBackgroundResource(int r1) {
            r0 = this;
            super.setBackgroundResource(r1)
            ᛵᛴᛴᛳ r0 = r0.f8709
            if (r0 == 0) goto La
            r0.m1838(r1)
        La:
            return
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(android.graphics.drawable.Drawable r1, android.graphics.drawable.Drawable r2, android.graphics.drawable.Drawable r3, android.graphics.drawable.Drawable r4) {
            r0 = this;
            super.setCompoundDrawables(r1, r2, r3, r4)
            ᛶᲈᛳᛵ r0 = r0.f8708
            if (r0 == 0) goto La
            r0.m2309()
        La:
            return
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(android.graphics.drawable.Drawable r1, android.graphics.drawable.Drawable r2, android.graphics.drawable.Drawable r3, android.graphics.drawable.Drawable r4) {
            r0 = this;
            super.setCompoundDrawablesRelative(r1, r2, r3, r4)
            ᛶᲈᛳᛵ r0 = r0.f8708
            if (r0 == 0) goto La
            r0.m2309()
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
            ᛴᛵᲇᲇ r0 = r0.f8710
            r0.m1553(r1)
            return
    }

    @Override // android.widget.TextView
    public void setKeyListener(android.text.method.KeyListener r2) {
            r1 = this;
            ᛴᛵᲇᲇ r0 = r1.f8710
            android.text.method.KeyListener r2 = r0.m1564(r2)
            super.setKeyListener(r2)
            return
    }

    public void setSupportBackgroundTintList(android.content.res.ColorStateList r1) {
            r0 = this;
            ᛵᛴᛴᛳ r0 = r0.f8709
            if (r0 == 0) goto L7
            r0.m1828(r1)
        L7:
            return
    }

    public void setSupportBackgroundTintMode(android.graphics.PorterDuff.Mode r1) {
            r0 = this;
            ᛵᛴᛴᛳ r0 = r0.f8709
            if (r0 == 0) goto L7
            r0.m1827(r1)
        L7:
            return
    }

    public void setSupportCompoundDrawablesTintList(android.content.res.ColorStateList r1) {
            r0 = this;
            ᛶᲈᛳᛵ r0 = r0.f8708
            r0.m2303(r1)
            r0.m2309()
            return
    }

    public void setSupportCompoundDrawablesTintMode(android.graphics.PorterDuff.Mode r1) {
            r0 = this;
            ᛶᲈᛳᛵ r0 = r0.f8708
            r0.m2304(r1)
            r0.m2309()
            return
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(android.content.Context r1, int r2) {
            r0 = this;
            super.setTextAppearance(r1, r2)
            ᛶᲈᛳᛵ r0 = r0.f8708
            if (r0 == 0) goto La
            r0.m2311(r1, r2)
        La:
            return
    }

    @Override // android.widget.TextView
    public void setTextClassifier(android.view.textclassifier.TextClassifier r1) {
            r0 = this;
            ᛵᛸᲁᛲ r0 = r0.getSuperCaller()
            ᲇᛳᛳᲇ r0 = r0.f4254
            super.setTextClassifier(r1)
            return
    }

    @Override // defpackage.InterfaceC0895
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ */
    public final defpackage.C0406 mo1568(defpackage.C0406 r2) {
            r1 = this;
            ᛵᲇᲁᲁ r0 = r1.f8707
            r0.getClass()
            ᛳᛱᛴᛸ r1 = defpackage.C0986.m1929(r1, r2)
            return r1
    }
}
