package xhss;

/* JADX INFO: renamed from: xhss.ᛲᛸᛳᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0195 extends android.widget.AutoCompleteTextView {

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public static final int[] f754 = null;

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final xhss.C0797 f755;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final xhss.C1037 f756;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final xhss.C0524 f757;

    static {
            r0 = 16843126(0x1010176, float:2.3694606E-38)
            int[] r0 = new int[]{r0}
            xhss.AbstractC0195.f754 = r0
            return
    }

    public AbstractC0195(android.content.Context r5, android.util.AttributeSet r6) {
            r4 = this;
            java.lang.Object r0 = xhss.AbstractC0635.f2188
            android.content.res.Resources r0 = r5.getResources()
            boolean r0 = r0 instanceof xhss.AbstractC1117
            if (r0 != 0) goto Lf
            r5.getResources()
            int r0 = xhss.AbstractC1182.f3815
        Lf:
            r0 = 1677918253(0x6403002d, float:9.666145E21)
            r4.<init>(r5, r6, r0)
            android.content.Context r5 = r4.getContext()
            xhss.AbstractC0313.m652(r4, r5)
            android.content.Context r5 = r4.getContext()
            int[] r1 = xhss.AbstractC0195.f754
            r2 = 0
            android.content.res.TypedArray r1 = r5.obtainStyledAttributes(r6, r1, r0, r2)
            boolean r3 = r1.hasValue(r2)
            if (r3 == 0) goto L45
            boolean r3 = r1.hasValue(r2)
            if (r3 == 0) goto L3e
            int r3 = r1.getResourceId(r2, r2)
            if (r3 == 0) goto L3e
            android.graphics.drawable.Drawable r5 = xhss.C0915.m1498(r5, r3)
            goto L42
        L3e:
            android.graphics.drawable.Drawable r5 = r1.getDrawable(r2)
        L42:
            r4.setDropDownBackgroundDrawable(r5)
        L45:
            r1.recycle()
            xhss.ᛵᲇᲇᲇ r5 = new xhss.ᛵᲇᲇᲇ
            r5.<init>(r4)
            r4.f757 = r5
            r5.m937(r6, r0)
            xhss.ᛸᲀᛳᲁ r5 = new xhss.ᛸᲀᛳᲁ
            r5.<init>(r4)
            r4.f755 = r5
            r5.m1366(r6, r0)
            r5.m1363()
            xhss.ᲇᛵᛲᲁ r5 = new xhss.ᲇᛵᛲᲁ
            r1 = 2
            r5.<init>(r4, r1)
            r4.f756 = r5
            android.content.Context r1 = r4.getContext()
            int[] r3 = xhss.AbstractC0293.f1125
            android.content.res.TypedArray r6 = r1.obtainStyledAttributes(r6, r3, r0, r2)
            r0 = 14
            boolean r1 = r6.hasValue(r0)     // Catch: java.lang.Throwable -> L7f
            r2 = 1
            if (r1 == 0) goto L81
            boolean r2 = r6.getBoolean(r0, r2)     // Catch: java.lang.Throwable -> L7f
            goto L81
        L7f:
            r4 = move-exception
            goto Lb6
        L81:
            r6.recycle()
            r5.m1693(r2)
            android.text.method.KeyListener r6 = r4.getKeyListener()
            boolean r0 = r6 instanceof android.text.method.NumberKeyListener
            if (r0 != 0) goto Lb5
            boolean r0 = super.isFocusable()
            boolean r1 = super.isClickable()
            boolean r2 = super.isLongClickable()
            int r3 = super.getInputType()
            android.text.method.KeyListener r5 = r5.m1697(r6)
            if (r5 != r6) goto La6
            goto Lb5
        La6:
            super.setKeyListener(r5)
            super.setRawInputType(r3)
            super.setFocusable(r0)
            super.setClickable(r1)
            super.setLongClickable(r2)
        Lb5:
            return
        Lb6:
            r6.recycle()
            throw r4
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
            r1 = this;
            super.drawableStateChanged()
            xhss.ᛵᲇᲇᲇ r0 = r1.f757
            if (r0 == 0) goto La
            r0.m938()
        La:
            xhss.ᛸᲀᛳᲁ r1 = r1.f755
            if (r1 == 0) goto L11
            r1.m1363()
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
            r1 = this;
            r0 = 0
            xhss.ᛵᲇᲇᲇ r1 = r1.f757
            if (r1 == 0) goto L10
            java.lang.Object r1 = r1.f1914
            xhss.ᛵᛳᛱᲇ r1 = (xhss.C0451) r1
            if (r1 == 0) goto L10
            java.lang.Object r1 = r1.f1631
            android.content.res.ColorStateList r1 = (android.content.res.ColorStateList) r1
            return r1
        L10:
            return r0
    }

    public android.graphics.PorterDuff.Mode getSupportBackgroundTintMode() {
            r1 = this;
            r0 = 0
            xhss.ᛵᲇᲇᲇ r1 = r1.f757
            if (r1 == 0) goto L10
            java.lang.Object r1 = r1.f1914
            xhss.ᛵᛳᛱᲇ r1 = (xhss.C0451) r1
            if (r1 == 0) goto L10
            java.io.Serializable r1 = r1.f1633
            android.graphics.PorterDuff$Mode r1 = (android.graphics.PorterDuff.Mode) r1
            return r1
        L10:
            return r0
    }

    public android.content.res.ColorStateList getSupportCompoundDrawablesTintList() {
            r0 = this;
            xhss.ᛸᲀᛳᲁ r0 = r0.f755
            xhss.ᛵᛳᛱᲇ r0 = r0.f2603
            if (r0 == 0) goto Lb
            java.lang.Object r0 = r0.f1631
            android.content.res.ColorStateList r0 = (android.content.res.ColorStateList) r0
            return r0
        Lb:
            r0 = 0
            return r0
    }

    public android.graphics.PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
            r0 = this;
            xhss.ᛸᲀᛳᲁ r0 = r0.f755
            xhss.ᛵᛳᛱᲇ r0 = r0.f2603
            if (r0 == 0) goto Lb
            java.io.Serializable r0 = r0.f1633
            android.graphics.PorterDuff$Mode r0 = (android.graphics.PorterDuff.Mode) r0
            return r0
        Lb:
            r0 = 0
            return r0
    }

    @Override // android.widget.TextView, android.view.View
    public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo r4) {
            r3 = this;
            android.view.inputmethod.InputConnection r0 = super.onCreateInputConnection(r4)
            if (r0 == 0) goto L17
            java.lang.CharSequence r1 = r4.hintText
            if (r1 != 0) goto L17
            android.view.ViewParent r1 = r3.getParent()
        Le:
            boolean r2 = r1 instanceof android.view.View
            if (r2 == 0) goto L17
            android.view.ViewParent r1 = r1.getParent()
            goto Le
        L17:
            xhss.ᲇᛵᛲᲁ r3 = r3.f756
            java.lang.Object r3 = r3.f3349
            xhss.ᲇᛵᛲᲁ r3 = (xhss.C1037) r3
            if (r0 != 0) goto L21
            r3 = 0
            return r3
        L21:
            java.lang.Object r3 = r3.f3349
            xhss.ᛳᛱᛲᲀ r3 = (xhss.C0230) r3
            boolean r1 = r0 instanceof xhss.C0773
            if (r1 == 0) goto L2a
            return r0
        L2a:
            xhss.ᛸᛵᲈᲁ r1 = new xhss.ᛸᛵᲈᲁ
            java.lang.Object r3 = r3.f893
            xhss.ᛲᛸᛳᛳ r3 = (xhss.AbstractC0195) r3
            r1.<init>(r3, r0, r4)
            return r1
    }

    @Override // android.view.View
    public void setBackgroundDrawable(android.graphics.drawable.Drawable r1) {
            r0 = this;
            super.setBackgroundDrawable(r1)
            xhss.ᛵᲇᲇᲇ r0 = r0.f757
            if (r0 == 0) goto L11
            r1 = -1
            r0.f1915 = r1
            r1 = 0
            r0.m939(r1)
            r0.m938()
        L11:
            return
    }

    @Override // android.view.View
    public void setBackgroundResource(int r4) {
            r3 = this;
            super.setBackgroundResource(r4)
            xhss.ᛵᲇᲇᲇ r3 = r3.f757
            if (r3 == 0) goto L2a
            r3.f1915 = r4
            java.lang.Object r0 = r3.f1913
            xhss.ᛲᛳᲈᛲ r0 = (xhss.C0150) r0
            if (r0 == 0) goto L23
            java.lang.Object r1 = r3.f1912
            android.widget.TextView r1 = (android.widget.TextView) r1
            android.content.Context r1 = r1.getContext()
            monitor-enter(r0)
            xhss.ᛱᲈᲁᛴ r2 = r0.f631     // Catch: java.lang.Throwable -> L20
            android.content.res.ColorStateList r4 = r2.m317(r1, r4)     // Catch: java.lang.Throwable -> L20
            monitor-exit(r0)
            goto L24
        L20:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L20
            throw r3
        L23:
            r4 = 0
        L24:
            r3.m939(r4)
            r3.m938()
        L2a:
            return
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(android.graphics.drawable.Drawable r1, android.graphics.drawable.Drawable r2, android.graphics.drawable.Drawable r3, android.graphics.drawable.Drawable r4) {
            r0 = this;
            super.setCompoundDrawables(r1, r2, r3, r4)
            xhss.ᛸᲀᛳᲁ r0 = r0.f755
            if (r0 == 0) goto La
            r0.m1363()
        La:
            return
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(android.graphics.drawable.Drawable r1, android.graphics.drawable.Drawable r2, android.graphics.drawable.Drawable r3, android.graphics.drawable.Drawable r4) {
            r0 = this;
            super.setCompoundDrawablesRelative(r1, r2, r3, r4)
            xhss.ᛸᲀᛳᲁ r0 = r0.f755
            if (r0 == 0) goto La
            r0.m1363()
        La:
            return
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(android.view.ActionMode.Callback r1) {
            r0 = this;
            super.setCustomSelectionActionModeCallback(r1)
            return
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            android.graphics.drawable.Drawable r2 = xhss.C0915.m1498(r0, r2)
            r1.setDropDownBackgroundDrawable(r2)
            return
    }

    public void setEmojiCompatEnabled(boolean r1) {
            r0 = this;
            xhss.ᲇᛵᛲᲁ r0 = r0.f756
            r0.m1693(r1)
            return
    }

    @Override // android.widget.TextView
    public void setKeyListener(android.text.method.KeyListener r2) {
            r1 = this;
            xhss.ᲇᛵᛲᲁ r0 = r1.f756
            android.text.method.KeyListener r2 = r0.m1697(r2)
            super.setKeyListener(r2)
            return
    }

    public void setSupportBackgroundTintList(android.content.res.ColorStateList r2) {
            r1 = this;
            xhss.ᛵᲇᲇᲇ r1 = r1.f757
            if (r1 == 0) goto L19
            java.lang.Object r0 = r1.f1914
            xhss.ᛵᛳᛱᲇ r0 = (xhss.C0451) r0
            if (r0 != 0) goto L11
            xhss.ᛵᛳᛱᲇ r0 = new xhss.ᛵᛳᛱᲇ
            r0.<init>()
            r1.f1914 = r0
        L11:
            r0.f1631 = r2
            r2 = 1
            r0.f1630 = r2
            r1.m938()
        L19:
            return
    }

    public void setSupportBackgroundTintMode(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            xhss.ᛵᲇᲇᲇ r1 = r1.f757
            if (r1 == 0) goto L19
            java.lang.Object r0 = r1.f1914
            xhss.ᛵᛳᛱᲇ r0 = (xhss.C0451) r0
            if (r0 != 0) goto L11
            xhss.ᛵᛳᛱᲇ r0 = new xhss.ᛵᛳᛱᲇ
            r0.<init>()
            r1.f1914 = r0
        L11:
            r0.f1633 = r2
            r2 = 1
            r0.f1632 = r2
            r1.m938()
        L19:
            return
    }

    public void setSupportCompoundDrawablesTintList(android.content.res.ColorStateList r3) {
            r2 = this;
            xhss.ᛸᲀᛳᲁ r2 = r2.f755
            xhss.ᛵᛳᛱᲇ r0 = r2.f2603
            if (r0 != 0) goto Ld
            xhss.ᛵᛳᛱᲇ r0 = new xhss.ᛵᛳᛱᲇ
            r0.<init>()
            r2.f2603 = r0
        Ld:
            r1 = r0
            r0.f1631 = r3
            if (r3 == 0) goto L14
            r3 = 1
            goto L15
        L14:
            r3 = 0
        L15:
            r0.f1630 = r3
            r2.f2597 = r1
            r2.f2598 = r1
            r2.f2607 = r1
            r2.f2599 = r1
            r2.f2608 = r1
            r2.f2606 = r1
            r2.m1363()
            return
    }

    public void setSupportCompoundDrawablesTintMode(android.graphics.PorterDuff.Mode r3) {
            r2 = this;
            xhss.ᛸᲀᛳᲁ r2 = r2.f755
            xhss.ᛵᛳᛱᲇ r0 = r2.f2603
            if (r0 != 0) goto Ld
            xhss.ᛵᛳᛱᲇ r0 = new xhss.ᛵᛳᛱᲇ
            r0.<init>()
            r2.f2603 = r0
        Ld:
            r1 = r0
            r0.f1633 = r3
            if (r3 == 0) goto L14
            r3 = 1
            goto L15
        L14:
            r3 = 0
        L15:
            r0.f1632 = r3
            r2.f2597 = r1
            r2.f2598 = r1
            r2.f2607 = r1
            r2.f2599 = r1
            r2.f2608 = r1
            r2.f2606 = r1
            r2.m1363()
            return
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(android.content.Context r1, int r2) {
            r0 = this;
            super.setTextAppearance(r1, r2)
            xhss.ᛸᲀᛳᲁ r0 = r0.f755
            if (r0 == 0) goto La
            r0.m1364(r1, r2)
        La:
            return
    }
}
